package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final String testFile = "testFile.txt";
    private final FileProcessor fileProcessor = new FileProcessor();

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(testFile)); // Java 8 safe
    }

    @Test
    @DisplayName("Test Write and Read File Content")
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit File Handling";

        fileProcessor.writeToFile(testFile, content);
        String readContent = fileProcessor.readFromFile(testFile);

        assertEquals(content, readContent);
    }

    @Test
    @DisplayName("Test File Exists After Writing")
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(testFile, "Test Data");

        assertTrue(Files.exists(Paths.get(testFile)));
    }

    @Test
    @DisplayName("Test Read From Non-Existing File")
    void testReadFileDoesNotExist() {
        assertThrows(IOException.class,
                () -> fileProcessor.readFromFile("noSuchFile.txt"));
    }
}

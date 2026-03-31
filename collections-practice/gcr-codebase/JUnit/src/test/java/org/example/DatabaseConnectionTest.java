package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    @DisplayName("Test Database Connection Established")
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    @DisplayName("Test Database Connection Closed")
    void testConnectionClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }
}

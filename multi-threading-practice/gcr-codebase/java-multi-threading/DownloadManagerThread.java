class FileDownloader extends Thread {
    String file;

    FileDownloader(String file) {
        this.file = file;
    }

    public void run() {
        for (int p = 0; p <= 100; p += 25) {
            System.out.println("[" + getName() + "] Downloading " + file + ": " + p + "%");
            try {
                Thread.sleep((int)(Math.random() * 500));
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class DownloadManagerThread {
    public static void main(String[] args) throws Exception {

        FileDownloader t1 = new FileDownloader("Document.pdf");
        FileDownloader t2 = new FileDownloader("Image.jpg");
        FileDownloader t3 = new FileDownloader("Video.mp4");
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("All downloads complete!");
    }
}

class FileDownloadTask implements Runnable {
    String file;

    FileDownloadTask(String file) {
        this.file = file;
    }

    public void run() {
        for (int p = 0; p <= 100; p += 25) {
            System.out.println("[" + Thread.currentThread().getName() +"] Downloading " + file + ": " + p + "%");
            try {
                Thread.sleep((int)(Math.random() * 500));
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class DownloadManagerRunnable {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new FileDownloadTask("Document.pdf"), "Thread-1");
        Thread t2 = new Thread(new FileDownloadTask("Image.jpg"), "Thread-2");
        Thread t3 = new Thread(new FileDownloadTask("Video.mp4"), "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}

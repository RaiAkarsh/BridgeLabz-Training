public class BackupSchedulerMain {
    public static void main(String[] args) {
        BackupSchedulerFunc bcf = new BackupSchedulerFunc();
        try {
            bcf.addTask(new BackupTask("E:/System", 1));
            bcf.addTask(new BackupTask("D:/games", 2));
            bcf.addTask(new BackupTask("", 3)); 
        }
        catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }
        bcf.executeBackups();
    }
}

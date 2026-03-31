import java.util.*;
class BackupTask implements Comparable<BackupTask> {
    String path;
    int priority;

    BackupTask(String path, int priority) {
        this.path = path;
        this.priority = priority;
    }
    public int compareTo(BackupTask other) {
        return Integer.compare(this.priority, other.priority);
    }
}

class InvalidBackupPathException extends Exception {
    InvalidBackupPathException(String message) {
        super(message);
    }
}

public class BackupSchedulerFunc {
    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addTask(BackupTask task) throws InvalidBackupPathException {
        if (task.path == null || task.path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }
        queue.add(task);
        System.out.println("Backup task added : " + task.path);
    }
    public void executeBackups() {
        System.out.println("Executing backup tasks : ");
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Backing up : " + task.path + " (Priority " + task.priority + ")");
        }
    }
}

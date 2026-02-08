import java.util.Date;

class TaskRunner extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            for (int i = 0; i < 1000000; i++);
        } catch (Exception e) {}
    }
}

class StateMonitor extends Thread {
    Thread[] t;

    StateMonitor(Thread[] t) {
        this.t = t;
    }

    public void run() {
        boolean run = true;
        while (run) {
            run = false;
            for (Thread x : t) {
                System.out.println("[Monitor] " + x.getName() +" is in " + x.getState() +" at " + new Date());
                if (x.getState() != Thread.State.TERMINATED)
                    run = true;
            }
            try { Thread.sleep(500); } catch (Exception e) {}
        }
        System.out.println("Summary: Monitoring completed");
    }
}

public class ThreadStateSystem {
    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner();
        TaskRunner t2 = new TaskRunner();
        t1.setName("Task-1");
        t2.setName("Task-2");
        new StateMonitor(new Thread[]{t1, t2}).start();
        t1.start();
        t2.start();
    }
}

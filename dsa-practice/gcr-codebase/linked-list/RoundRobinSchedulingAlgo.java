class Node {
    int processID;
    int burstTime;
    int priority;
    Node next;

    public Node(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
public class RoundRobinSchedulingAlgo {
    private Node head;
    public RoundRobinSchedulingAlgo() {
        this.head = null;
    }
    public void addProcess(int processID, int burstTime, int priority) {
        Node newNode = new Node(processID, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }   
    public void removeProcess(int processID) {
        if (head == null) {
            System.out.println("No processes available");
            return;
        }
        Node current = head;
        Node prev = null;
        do {
            if (current.processID == processID) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    Node tail = head;
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    head = head.next;
                    tail.next = head;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Process ID not found");
    }
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes available");
            return;
        }
        Node current = head;
        do {
            System.out.println("------------------------------");
            System.out.println("Process ID: " + current.processID + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            System.out.println("------------------------------");
            current = current.next;
        } while (current != head);
    }
    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }
        Node current = head;
        int waitingTime = 0;
        int turnAroundTime = 0;
        int processCount = 0;

        while (true) {
            boolean allDone = true;
            do {
                if (current.burstTime > 0) {
                    allDone = false;
                    if (current.burstTime > timeQuantum) {
                        waitingTime += (processCount * timeQuantum);
                        current.burstTime -= timeQuantum;
                    } else {
                        waitingTime += (processCount * current.burstTime);
                        turnAroundTime += (waitingTime + current.burstTime);
                        current.burstTime = 0;
                    }
                }
                current = current.next;
            } while (current != head);
            if (allDone) break;
            processCount++;
            displayProcesses();
        }
        double avgWaitingTime = (double) waitingTime / processCount;
        double avgTurnAroundTime = (double) turnAroundTime / processCount;
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }  
    public static void main(String[] args) {
        RoundRobinSchedulingAlgo rr = new RoundRobinSchedulingAlgo();
        rr.addProcess(1, 10, 2);
        rr.addProcess(2, 5, 1);
        rr.addProcess(3, 8, 3);

        System.out.println("Initial Process List:");
        rr.displayProcesses();

        int timeQuantum = 4;
        System.out.println("\nSimulating Round Robin Scheduling with Time Quantum = " + timeQuantum);
        rr.simulate(timeQuantum);
    }    
}

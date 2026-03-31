class Node {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Node next;

    public Node(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = this;
    }
}
public class TaskScheduler {
    private Node head;
    
    public TaskScheduler() {
        this.head = null;
    }
    public void addTaskFirst(int taskID, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskID, taskName, priority, dueDate);
        if (head == head.next) {
            head = newNode;
            newNode.next = newNode;
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }
    public void addTaskLast(int taskID, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head;
        }
    }
    public void addTaskSpecify(int taskID, String taskName, int priority, String dueDate, int position) {
        Node newNode = new Node(taskID, taskName, priority, dueDate);
        if (position == 1) {
            addTaskFirst(taskID, taskName, priority, dueDate);
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current.next == head) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void removeTaskByID(int taskID) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node prev = null;
        do {
            if (current.taskID == taskID) {
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
        System.out.println("Task ID not found");
    }
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        System.out.println("Current Task: " + head.taskName + " (ID: " + head.taskID + ", Priority: " + head.priority + ", Due Date: " + head.dueDate + ")");
        head = head.next;
    }
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        Node current = head;
        do {
            System.out.println("------------------------------");
            System.out.println("Task ID: " + current.taskID + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            System.out.println("------------------------------");
            current = current.next;
        } while (current != head);
    }
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        Node current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Task Found: " + current.taskName + " (ID: " + current.taskID + ", Due Date: " + current.dueDate + ")");
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskLast(1, "Task One", 2, "2024-07-01");
        scheduler.addTaskLast(2, "Task Two", 1, "2024-06-15");
        scheduler.addTaskFirst(3, "Task Three", 3, "2024-08-01");
        scheduler.displayAllTasks();
        scheduler.viewCurrentTask();
        scheduler.displayAllTasks();
        scheduler.searchTaskByPriority(1);
        scheduler.removeTaskByID(2);
        scheduler.displayAllTasks();
    }
}   

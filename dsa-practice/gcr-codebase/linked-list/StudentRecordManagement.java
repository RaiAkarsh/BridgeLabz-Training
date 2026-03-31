class Node{
    int rollNumber;
    String name;
    int age;
    String grade;
    Node next;
    Node(int rollNumber, String name, int age, String grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentRecordManagement{
    private Node head;

    public StudentRecordManagement(){
        this.head = null;
    }
    public void addStudentFirst(int rollNumber, String name, int age, String grade){
        Node newNode = new Node(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addStudentSpecify(int rollNumber, String name, int age, String grade, int position){
        Node newNode = new Node(rollNumber, name, age, grade);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i = 1; i < position - 1; i++){
            if(current == null){
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void addStudentLast(int rollNumber, String name, int age, String grade){
        Node newNode = new Node(rollNumber, name, age, grade);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteStudent(int rollNumber){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNumber == rollNumber){
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        while(current != null && current.rollNumber != rollNumber){
            previous = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("Student with roll number " + rollNumber + " not found");
            return;
        }
        previous.next = current.next;
    }

    public void searchStudent(int rollNumber){
        Node current = head;
        while (current != null){
            if(current.rollNumber == rollNumber){
                System.out.println("Student Found: Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found");
    }

    public void updateStudent(int rollNumber, String grade){
        Node current = head;
        while( current !=null){
            if(current.rollNumber == rollNumber){
                current.grade = grade;
                return;
            }
            current=current.next;
        }
        System.out.println("Student not found");
    }

public void displayStudents() {

    if (head == null) {
        System.out.println("No students to display.");
        return;
    }

    Node current = head;
    System.out.println("========== Student List ==========");

    while (current != null) {
        System.out.println("Roll Number : " + current.rollNumber);
        System.out.println("Name        : " + current.name);
        System.out.println("Age         : " + current.age);
        System.out.println("Grade       : " + current.grade);
        System.out.println("---------------------------------");
        current = current.next;
    }
}


    public static void main(String[] args){
        StudentRecordManagement srm = new StudentRecordManagement();
        srm.addStudentFirst(1, "Alice", 20, "A");
        srm.addStudentSpecify(2, "Bob", 21, "B",2);
        srm.addStudentLast(3, "Charlie", 22, "A");
        srm.deleteStudent(2);
        srm.searchStudent(3);
        srm.displayStudents();
        srm.updateStudent(1, "A+");
        srm.displayStudents();
    }
}
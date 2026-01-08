class Node{
    int id;
    String name;
    int quantity;
    double price;
    Node next;
    Node(int id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryManagementSystem{
    private Node head;
    public InventoryManagementSystem(){
        this.head = null;
    }

    public void addItemFirst(int id, String name, int quantity, double price){
        Node newNode = new Node(id, name, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    public void addItemSpecify(int id, String name, int quantity, double price, int position){
        Node newNode = new Node(id, name, quantity, price);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i = 1; i < position; i++){
            if(current == null){
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        if(current != null){
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void addItemLast(int id, String name, int quantity, double price){
        Node newNode = new Node(id, name, quantity, price);
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

    public void deleteItem(int id){
        if(head == null){
            System.out.println("Inventory is empty");
            return;
        }
        if(head.id == id){
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        while(current != null && current.id != id){
            previous = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("Item not found");
            return;
        }
        previous.next = current.next;
    }

    public void updateItem(int id , int quantity){
        Node current = head;
        if(current == null){
            System.out.println("Inventory is empty");
        }
        while(current != null && current.id != id){
            current = current.next;
        }
        if(current == null){
            System.out.println("id not found");
            return;
        }
        current.quantity = quantity;
    }

    public void searchItem(int id){
        Node current = head;
        if(current == null){
            System.out.println("Inventory is empty");
        }
        while(current != null && current.id != id){
            current = current.next;
        }
        if(current == null){
            System.out.println("id not found");
            return;
        }
        System.out.println("Item Found: ID: " + current.id + ", Name: " + current.name + ", Quantity: " + current.quantity + ", Price: " + current.price);
    }
public void sortItemByName() {
    if (head == null || head.next == null) {
        System.out.println("Inventory is empty or has only one item");
        return;
    }

    Node current, index;
    String tempName;
    double tempPrice;
    int tempid;
    int tempQuantity;

    for (current = head; current.next != null; current = current.next) {
        for (index = current.next; index != null; index = index.next) {
            if (current.name.compareToIgnoreCase(index.name) > 0) {
                // swap name
                tempName = current.name;
                current.name = index.name;
                index.name = tempName;
                // swap price
                tempPrice = current.price;
                current.price = index.price;
                index.price = tempPrice;

                // swap id
                tempid = current.id;
                current.id = index.id;
                index.id = tempid;

                // swap quantity
                tempQuantity = current.quantity;
                current.quantity = index.quantity;
                index.quantity = tempQuantity;
            }
        }
    }
}


    public void displayItems(){
        Node current = head;
        if(current == null){
            System.out.println("Inventory is empty");
            return;
        }
        while(current != null){
            System.out.println("-------------------------------");
            System.out.println("ID: " + current.id + ", Name: " + current.name);
            System.out.println("Sum: " + (current.price * current.quantity));
            System.out.println("-------------------------------");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addItemFirst(1, "bat", 50, 0.5);
        ims.addItemSpecify(2, "Ball", 30, 0.2,1);
        ims.addItemLast(3, "helmet", 20, 0.3);
        ims.displayItems();
        ims.searchItem(2);
        ims.updateItem(1, 60);
        ims.deleteItem(3);
        ims.displayItems();
        ims.sortItemByName();
        System.out.println("After sorting:");
        ims.displayItems();
    }

}
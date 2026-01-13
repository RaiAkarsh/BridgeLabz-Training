class Node {
    String id;
    Node next;

    Node(String id) {
        this.id = id;
    }
}

class TrafficManagerFunc {
    Node head = null;

    void add(String id) {
        Node n = new Node(id);

        if (head == null) {
            head = n;
            n.next = head;
            return;
        }

        Node t = head;
        while (t.next != head)
            t = t.next;

        t.next = n;
        n.next = head;
    }

    void remove() {
        if (head == null || head.next == head) {
            head = null;
            return;
        }

        Node t = head;
        while (t.next.next != head)
            t = t.next;

        t.next = head;
    }

    void update(String oldId, String newId) {
        if (head == null) return;

        Node t = head;
        do {
            if (t.id.equals(oldId)) {
                t.id = newId;
                return;
            }
            t = t.next;
        } while (t != head);
    }

    void print() {
        if (head == null) return;

        Node t = head;
        do {
            System.out.print(t.id + " ");
            t = t.next;
        } while (t != head);

        System.out.println();
    }
}

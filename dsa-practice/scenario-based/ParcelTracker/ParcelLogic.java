class StageNode {
    String stage;
    StageNode next;

    StageNode(String stage) {
        this.stage = stage;
    }
}

public class ParcelLogic {

    private StageNode head;

    public void addStage(String stage) {
        if (head == null) {
            head = new StageNode(stage);
            return;
        }
        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new StageNode(stage);
    }

    public void addAfter(String target, String newStage) {
        StageNode temp = head;
        while (temp != null && !temp.stage.equals(target)) {
            temp = temp.next;
        }
        if (temp != null) {
            StageNode node = new StageNode(newStage);
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deleteStage(String stage) {
        if (head == null) return;

        if (head.stage.equals(stage)) {
            head = head.next;
            return;
        }

        StageNode temp = head;
        while (temp.next != null && !temp.next.stage.equals(stage)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void markLost() {
        head = null;
    }

    public void track() {
        if (head == null) {
            System.out.println("Parcel Lost");
            return;
        }
        StageNode temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

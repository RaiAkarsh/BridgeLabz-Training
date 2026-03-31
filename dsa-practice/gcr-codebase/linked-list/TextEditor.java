class TextNode {
    String textContent;
    TextNode next;
    TextNode prev;

    public TextNode(String textContent) {
        this.textContent = textContent;
        this.next = null;
        this.prev = null;
    }
}
public class TextEditor {
    private TextNode head;
    public TextEditor(){
        this.head = null;
    }
    public void addTextState(String textContent){
        TextNode newNode = new TextNode(textContent);
        if(head != null){
            newNode.prev = head;
            head.next = newNode;
        }
        head = newNode;
    }
    public String undo(){
        if(head != null && head.prev != null){
            head = head.prev;
            return head.textContent;
        }
        return "No previous state available";
    }
    public String redo(){
        if(head != null && head.next != null){
            head = head.next;
            return head.textContent;
        }
        return "No next state available";
    }
    public String getCurrentState(){
        if(head != null){
            return head.textContent;
        }
        return "No text available";
    }
    public void limitHistory(int maxSize){
        TextNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.prev;
        }
        while(count > maxSize){
            if(head.prev != null){
                head = head.prev;
                head.next = null;
            }
            count--;
        }
    }
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addTextState("Hello");
        editor.addTextState("Hello, World");
        editor.addTextState("Hello, World!");
        System.out.println(editor.getCurrentState()); 
        System.out.println(editor.undo()); 
        System.out.println(editor.undo()); 
        System.out.println(editor.redo()); 
        editor.limitHistory(2);
        System.out.println(editor.undo()); 
    }   
}

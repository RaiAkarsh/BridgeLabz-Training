import java.util.*;
class QueueUsingStack{
    Stack<String> stack1;
    Stack<String> stack2;

    QueueUsingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    void enqueue(String value){
        stack1.add(value);
    }
    
    void dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
            System.out.println(stack2.pop());
        }
        else{
            System.out.println(stack2.pop());
        }
    }
}
class Main{
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.dequeue();
        queue.enqueue("D");
        queue.dequeue();
    }
}

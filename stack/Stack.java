package stack;

public class Stack {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public Node top;

    public void display()
    {
        if(top==null)
        {
            System.out.println("Empty");
            return;
        }
        Node current=top;
        while (current != null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(top == null)
        {
            top=newNode;
        }else {
            newNode.next=top;
            top=newNode;
        }
    }

    public Object pop(){
        if (top==null)
        {
            System.out.println("stack underflow");
            return null;
        }
        top=top.next;
        return null;
    }


    public static void main(String[] args) {
     Stack stack=new Stack();
     stack.push(12);
     stack.push(15);
     stack.pop();
     stack.display();
    }


}

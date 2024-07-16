public class LinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }

    public Node head;
    public Node tail;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head == null )
        {
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
    }

    public void display(){
        if(head==null){
            System.out.println("Empty");
            return;
        }

        Node current=head;
        while(current != null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public void displayReverse(){
        Node current=tail;
        while (current != null){
            System.out.println(current.data);
            current=current.prev;
        }
    }
    public void delete(int data){
        Node current =head,prev=null;
        if(current != null && current.data==data)
        {
            head=current.next;
            head.prev=null;
            return;
        }
        while(current != null && current.data != data){
            prev=current;
            current=current.next;
        }
        if(current == null)
        {
            return;
        }
        if(current == tail)
        {
            tail=prev;
            tail.next=null;
            return;

        }
        prev.next=current.next;
        current.next.prev=current.prev;

    }

    public void insertAfter(int nextTo,int data){
        Node newNode=new Node(data);
        Node current = head;

        while(current != null && current.data != nextTo){
            current=current.next;
        }
        if(current == null)
        {
            return;
        }
        if(current==tail)
        {
            tail.next=newNode;
            tail=newNode;
            return;
        }
        newNode.next=current.next;
        current.next.prev=newNode;
        current.next=newNode;
        newNode.prev=current;

    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.display();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.display();
        System.out.println("Reverse");
        list.displayReverse();
        list.delete(10);
//
        list.insertAfter(10,15);
        list.display();
    }
}

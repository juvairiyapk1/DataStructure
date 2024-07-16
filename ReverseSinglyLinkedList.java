public class ReverseSinglyLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;
    }

    public void display(){
        Node current=head;
        while(current != null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void displayReverse(){
        displayReverseRecursive(head);
    }
    public void displayReverseRecursive(Node current){
        if(current==null){
            return;
        }
        displayReverseRecursive(current.next);
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        ReverseSinglyLinkedList list=new ReverseSinglyLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.display();
        System.out.println("reverse");
        list.displayReverse();
    }
}

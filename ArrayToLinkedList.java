public class ArrayToLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }
    public Node head;
    public Node tail;
    public void addNode(int data){
        Node newNode  =new Node(data);
        if(head == null)
        {
            head=newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;
    }

    public void display()
    {
        Node current=head;
        while(current != null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {

        int[] arr={10,20,30,40};

        ArrayToLinkedList list=new ArrayToLinkedList();

        for(int num:arr)
        {
            list.addNode(num);
        }
        list.display();

    }
}

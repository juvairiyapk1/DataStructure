public class InserLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data)
    {
        Node newNode=new Node(data);
        if(head == null)
        {
            head=newNode;
        }else {
            tail.next=newNode;
        }
        tail=newNode;
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public void delete(int data)
    {
        Node temp=head,prev=null;
        if(temp != null && temp.data==data)
        {
            head=temp.next;
        }

        while (temp != null && temp.data != data)
        {
            prev=temp;
            temp=temp.next;
        }

        if(temp == null)
        {
            return;
        }

        if(tail==temp){
            tail=prev;
            tail.next=null;
        }
        prev.next=temp.next;
    }

    public void insertAfter(int nextTo,int data)
    {
        Node newNode=new Node(data);
        Node temp=head;

        while (temp != null && temp.data != nextTo)
        {
            temp=temp.next;
        }

        if(temp == null)
        {
            return;
        }

        if(temp == tail)
        {
            tail.next=newNode;
            tail=newNode;
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        InserLinkedList list=new InserLinkedList();
        list.addNode(12);
        list.addNode(15);
        list.addNode(17);
//        list.delete(15);
        list.insertAfter(17,18);
        list.display();

    }
}

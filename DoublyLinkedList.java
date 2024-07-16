public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
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
            head= newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
    }

    public void display()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void displayReverse()
    {
        Node temp=tail;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }

    public void delete(int data)
    {
        Node temp = head,prev=null;
        if(temp != null && temp.data == data)
        {
            head=temp.next;
            head.prev=null;
            return;
        }

        while (temp != null && temp.data != data)
        {
            prev=temp;
            temp=temp.next;

        }
        if (temp == null)
        {
            return;
        }

        if(temp == tail)
        {
            tail=prev;
            tail.next=null;
            return;

        }
        prev.next=temp.next;
        temp.next.prev=temp.prev;

    }

    public void insertAfter(int nextTo,int data)
    {
        Node newNode=new Node(data);
        Node temp=head;

        while(temp != null && temp.data != nextTo){
            temp=temp.next;
        }
        if (temp == null){
            return;
        }
        if(temp == tail)
        {
            tail.next=newNode;
            tail=newNode;
        }

        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;

    }

    public void removeDuplicates()
    {
        Node current=head;
        while(current != null)
        {
            Node next=current.next;
            while(next != null && next.data == current.data)
            {
                next=next.next;
            }
            current.next=next;

            if(next==tail && current.data == next.data)
            {
                tail=current;
            }
            current=next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(30);
        list.addNode(20);
        list.display();
        System.out.println("=====================");
        list.delete(20);
        list.insertAfter(30,15);
        list.removeDuplicates();
        list.displayReverse();
    }

}

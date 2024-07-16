public class DeleteLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public Node head=null;
    public Node tile=null;

    public void addNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else {
            tile.next=newNode;
        }
        tile=newNode;
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp != null )
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void delete(int data)
    {
        Node temp=head ,prev=null;
        if(temp !=null && temp.data == data)
        {
            head=temp.next;
            return;
        }

        while (temp != null && temp.data != data)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;

        if(temp == null)
        {
            return;
        }

        if(temp==tile){
            tile=prev;
            tile.next=null;
        }
    }

    public static void main(String[] args) {
        DeleteLinkedList list=new DeleteLinkedList();
        list.addNode(45);
        list.addNode(10);
        list.addNode(15);
        list.addNode(12);
        list.delete(15);
        list.display();
    }
}

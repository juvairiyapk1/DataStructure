public class Queue {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }

    }
    public Node front;
    public Node rear;
    public void display(){
        Node current=front;
        while (current != null){
            System.out.print(" "+current.data);
            current=current.next;
        }
    }

    public void enQueue(int data){
        Node newNode=new Node(data);

        if(rear == null)
        {
            front=rear=newNode;
            return;
        }
            rear.next=newNode;
            rear=newNode;

    }
    public void deQueue()
    {
        if(front == null)
        {
            System.out.println("Empty");
            rear=null;
        }else {
            front=front.next;
        }
//        if (front == null)
//        {
//            rear=null;
//        }
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);
        queue.deQueue();
        queue.display();
    }

}

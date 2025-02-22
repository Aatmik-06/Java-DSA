public class Node {

    public int data;
    public Node next;
    public Node prev;

    public Node (int data){
        prev=null;
        this.data=data;
        next=null;
        System.out.println("Node Created");
    }

    public void display(Node head)
    {
        Node temp = head ;
        while (temp!=null){
            System.out.print(" --> "+temp.data);
           temp= temp.next;
        }
    }



    public Node insert(Node head,int data){

        Node newNode = new Node(data);

        head.prev=newNode;
        newNode.next =head;
        head=newNode;
        head.prev=null;

        return head;
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next=n2;
        n2.prev=n1;

        n2.next=n3;
        n3.prev=n2;

        n3.next=n4;
        n4.prev=n3;

        System.out.println();
        Node head = n1;
        head.display(head);

        System.out.println();
        System.out.println();

       head = head.insert(head,5);
       head.display(head);

    }
}

public class Node {

//        A Linked List is a linear data structure where elements (called nodes) are connected .
//        In Linked List Node Contain Multiple Filed Basd on

//        types of Linked List
//        1. Singly Linked List
//        A. Data: That can contain data of the node
//        B.Next: That contain reference of the next Node

//        2. Doubly Linked List:
//        Data: That can contain data of the node
//        Next: That contain reference of the next Node
//        Prev: That contain reference of the previous Node

    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        next=null;
        System.out.println("Node Successfully Created");
    }

    public void display(Node head) {
        Node temp=head;
        while (temp!=null){
            System.out.print(" --> "+temp.data);
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        Node head = n1;

        System.out.println();
        System.out.print("Linked List : ");

        System.out.print(head.data); // 10
        System.out.print(" --> "+head.next.data); // 20
        System.out.print(" --> "+head.next.next.data); // 30
        System.out.print(" --> "+head.next.next.next.data); // 40
        System.out.println();
        System.out.println();

        System.out.println("Print Data of Singly Linked Using display Method ");
        n1.display(head);

    }
}

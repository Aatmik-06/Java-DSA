public class Node {

    public int data ;
    public Node next;

    public Node(int data){
        this.data=data;
        next=null;
        System.out.println("Node Created Successfully");
    }

    public void display(Node head) {
        Node temp = head;

        while (temp!=null){
            System.out.print(" --> "+temp.data);
            temp=temp.next;
        }
    }

    public void insertNewNodeAtEnd(Node head , int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
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

        System.out.print(" --> "+head.data);
        System.out.print(" --> "+head.next.data);
        System.out.print(" --> "+head.next.next.data);
        System.out.print(" --> "+head.next.next.next.data);

        System.out.println();
        System.out.println();
        System.out.println("Data of Singly linkedList Using Display Method : ");
        n1.display(head);

        System.out.println();
        System.out.println();

        System.out.println("Data After Adding Node At Last : ");
        head.insertNewNodeAtEnd(head,5);
        head.display(head);

    }
}

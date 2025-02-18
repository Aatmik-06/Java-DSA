public class Node {

    public int data;
    public Node prev;
    public Node next;

    public Node (int data){
        prev=null;
        this.data=data;
        next=null;
        System.out.println("Node Created");
    }

    public void displayForward(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(" --> "+temp.data);
            temp=temp.next;
        }
    }

    public void displayBackward(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(" --> "+temp.data);
            temp=temp.prev;
        }
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

        Node head=n1;
        Node tail=n4;

        System.out.println();
        System.out.println("Data Of Doubly Linked List in Forward : ");;
        head.displayForward(head);

        System.out.println();
        System.out.println();
        System.out.println("Data of Doubly Linked List in Backward : ");
        tail.displayBackward(tail);
    }

}

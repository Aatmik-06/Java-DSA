public class Node {
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
        System.out.println("Node Created");
        next=null;

    }
    public void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(" --> " + temp.data);
            temp=temp.next;
        }
    }

    public Node deletePosition(int pos ,Node head){
        Node node = head;
        for (int i = 0; i < pos; i++) {
            node=node.next;
        }
        return node;
    }
    public  int deleteAtSpecificPos(int index ,Node head){
        Node prev = deletePosition(index-1,head);
        int val = prev.next.data;
        prev.next=prev.next.next;
        return val;
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
        System.out.println("Data of Singly Linked List Using Display Method : ");
        n1.display(head);

        System.out.println();
        System.out.println();
        System.out.println("Data After Deleting Node At Specific position: ");
        head.deleteAtSpecificPos(2,head);
        n1.display(head);

    }
}

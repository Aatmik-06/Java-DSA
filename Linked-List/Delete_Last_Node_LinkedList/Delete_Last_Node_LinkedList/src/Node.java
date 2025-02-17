public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        next = null;
        System.out.println("Node Created");
    }

    public void display(Node head ){
       Node  temp= head;

       while (temp!=null){
           System.out.print(" --> "+temp.data);
           temp=temp.next;
       }
    }

    public Node deleteLastNode(Node head){
        Node temp = head;
        if (head==null){
            System.out.println("List Is Empty");
            return head;

        }else if (head.next==null){
            System.out.println("List Contains Only One Node");

            head=head.next;
            return head;
        }else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return head;
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

        System.out.println();
        Node head=n1;
        System.out.println("Data Using Display Method: ");
        head.display(head);

        System.out.println();
        System.out.println();
        head=head.deleteLastNode(head);
        System.out.println("Data After Deleting Last Node: ");
        head.display(head);
    }
}

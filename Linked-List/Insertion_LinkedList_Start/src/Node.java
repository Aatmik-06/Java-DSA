public class Node {
    public int data;
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

            temp = temp.next;

        }
    }

    public Node insertNewNodeAtStart(Node head,int data){

//        1.Create a new Node
        Node newNode = new Node(data);

//        2.Connect new Node to Head
        newNode.next =head;

//        3.Update Head by new Node
        head=newNode;

        return head;
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node head = n1;

        System.out.println();
        System.out.print("Linked List : ");

        System.out.print(head.data);
        System.out.print(" --> "+head.next.data);
        System.out.print(" --> "+head.next.next.data);
        System.out.print(" --> "+head.next.next.next.data);
        System.out.println();
        System.out.println();

        System.out.println("data of singly LinkedList using display method :");
        n1.display(head);

        System.out.println();
        System.out.println();

        head= head.insertNewNodeAtStart(head,5);
        System.out.println();
        System.out.println("data of singly Linked List after inserting new Node at start :");
        n1.display(head);

        System.out.println();
        System.out.println();

        head= head.insertNewNodeAtStart(head,6);
        System.out.println();
        System.out.println("data of singly Linked List after inserting new Node at start :");
        n1.display(head);


    }
}

public class Node {
    public int data;
    public Node next;

    public Node (int data ){
        this.data=data;
        System.out.println("Node Successfully Created");
        next=null;
    }
    public void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(" --> "+temp.data);
            temp = temp.next;
        }

    }
    public void insertAtSpecificPos(int data,int pos,Node head){
//        Create a newNode
        Node newNode = new Node(data);

        pos--;

//        traverse the list
        Node temp1=head;
        Node temp2=head.next;



        while (pos>1){
            temp1= temp1.next;
            temp2= temp2.next;
            pos--;
        }
//        Connect temp1 to newNode
        temp1.next=newNode;
//        connect newNode to temp2
        newNode.next=temp2;
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
        System.out.println("Data of Linked List after inserting data at specific position : ");
        head.insertAtSpecificPos(5,2,head);
        n1.display(head);
    }
}

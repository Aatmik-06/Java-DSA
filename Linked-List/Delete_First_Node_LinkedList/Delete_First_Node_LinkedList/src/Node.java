public class Node {

//    Algorithm to delete first Node of Singly Linked List
//    Step1: To Check List is Empty or not(if(head==null))
//    Step2: Store the head into another variable
//    Node temp=head;
//    Step3:Move head to the next node
//    head=head.next;
//    Step4: Free the memory
//            temp=null;

    public int data ;
    public Node next;

    public Node (int data ){
        this.data=data;
        next=null;
        System.out.println("Node Created");
    }

    public void display (Node head){

        Node temp = head;
        while (temp!=null){
            System.out.print(" --> "+temp.data);
            temp=temp.next;
        }
    }

    public Node deleteFirstNode(Node head){
        //step1: Check List is Empty
        if (head==null){
            System.out.println("List is Empty");
        }else {
    //step2: Store head into another variable
            Node temp =head;
    //step3: Move head to next Node
            head= head.next;
    //step4: Free the memory
            temp=null;
        }
        return head;
    }


    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node( 20);
        Node n3 =  new Node(30);
        Node n4 = new Node (40);

        n1.next=n2 ;
        n2.next=n3;
        n3.next=n4;
        Node head=n1;

        System.out.println();
        System.out.println("Data using Display Method:");
        head.display(head);

        System.out.println();
        System.out.println();
        System.out.println("Data after Deleting First Node: ");
        head=head.deleteFirstNode(head);
        head.display(head);
    }
}

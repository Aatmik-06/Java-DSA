public class Queue_Dequeue {

    static int queue[] = new int[5];
    static int front = -1;
    static int rear = -1;
    public static void enq(int data ){
//        Step1 - Check OverFlow
        if (rear == queue.length-1){
            System.out.println("OverFlow Condition");
        }else {
//        Step2 - Check Queue is empty or not
            if (front==-1 && rear ==-1){
                front++;
                rear++;
//        Step3 - Assign Data into rear of Queue
                queue[rear]=data;
                System.out.println("First element is inserted in the queue");
            }else {
//        Step4 - Queue is not empty
              rear++;
              queue[rear]=data;
              System.out.println("Inserted Data after First Element in the queue");
            }
        }
    }
    public static boolean isEmpty(){
        return front==-1 && rear==-1;
    }
    public static boolean isFull(){
        return queue.length-1==rear;
    }


//    DeQueue

//    Algorithm of dequeue Operations
//    Step1: Check Under Flow Condition
//    Step2: Retrieve the element front of the Queue
//    Step3: if front==rear (only one element present in the queue) reset
//    both front and rear to -1.
//    Step4: Otherwise increase front by 1.
//    Step5: Return the dequeued element


    public static int deq() {
//        Check UnderFlow Condition
        int r = -1;
        if (isEmpty()){
            System.out.println("UnderFlow Condition");
        }else {
            if (front==rear){
                r=queue[front];
                front=-1;
                rear=-1;
                System.out.println("Last Element of Queue Deleted");
            }else {
                r=queue[front];
                front++;
            }
        }
        return r;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            return queue[front];
        }
    }

    public static void main(String[] args) {

        enq(10);
        enq(20);
        enq(30);
        enq(40);
        enq(50);
        System.out.println();
        System.out.println("Deleted Element from the Queue "+deq());
        System.out.println("Deleted Element from the Queue "+deq());
        System.out.println("Front Element of the Queue : "+peek());
        System.out.println("Deleted Element from the Queue "+deq());
        System.out.println("Deleted Element from the Queue "+deq());
        System.out.println("Deleted Element from the Queue "+deq());

    }
}

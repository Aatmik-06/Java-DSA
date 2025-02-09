public class Queue_Enqueue {

//    A Queue is also a linear data structure that follows First In First Out Order.
//    This means that the element insert first will be deleted first


//    Operations of Queue Data Structure
// 1. Enqueue(): Adds (insert) element at the rear(end) of the queue
// 2. Dequeue(): Removes(delete) an element from the front end of the queue
// 3. Peek(): It will return front element of the queue without removal
// 4. isEmpty(): To Check queue is Empty or not
// 5. isFull(): To Check Queue is Full or not

//    Algorithm of Enqueue Operation
//    Step1 - Check Overflow
//    Step2 - if stack is Empty then increase front and rear by 1
//    Step3 - if stack is not empty then increase rear only
//    Step4 - Assign data into rear of the queue

    static int queue[] = new int[5];
    static int front = -1;
    static int rear = -1;

    public static void enq(int data){

//        Step1 - Check OverFlow
        if (rear==queue.length-1){
            System.out.println("OverFlow Condition");
        }else {

//        Step2 - Checking queue is empty or not
          if (front==-1 && rear==-1){
              front++;
              rear++;

//        Step3 - Assigning data into rear of queue
              queue[rear] = data;
              System.out.println("Inserted first element in the Queue");
          }else {

//        step4: Queue is not empty
              rear++;
              queue[rear] = data;
              System.out.println("Inserted data after first element int the Queue");
          }
        }
    }

    public static void main(String[] args) {
        enq(10);
        enq(20);
        enq(30);
        enq(40);
        enq(50);


    }
}

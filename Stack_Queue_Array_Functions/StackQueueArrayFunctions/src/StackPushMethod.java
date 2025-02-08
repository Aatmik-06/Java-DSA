public class StackPushMethod {
static int s[] =new int[5];
static int indexTop = -1;

//    A stack is a Linear data Structure that can store data in the
//    Last In First Out(LIFO). This means Last Inserted Element will be
//    deleted first.
//    All Operations perform on the stack is only one end (top)

//   Basics Operation the Stack

//1. PUSH(): Add elements into the stack
//2. POP(): remove element from the top of the stack
//3. Peek(): return top element of the stack without removal
//4. isEmpty():To check stack is Empty or not
//5. isFull(): To check Stack is Full or not


//    Algorithm for push operation
//    Step1 - Start
//    Step2 - Check OverFlow Condition
//    Step3 - Increase top value by 1 because when stack so top value is -1 and to have to increase it to 0 so increse it by 1.
//    Step4 - Store data into the top of the stack

    public static void push(int data){

        //Step 1 Check OverFLow Condition
        if(indexTop==s.length){
            System.out.println("Over Flow Condition");
        }else {

        //step2: Increase top by 1
        indexTop++;

        //step3: Assign value into top of the Stack
        s[indexTop]=data;
            System.out.println("Data Inserted Into Stack");
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
    }
}

public class StackPushPopIsEmptyIsFull {
    static int S[] = new int[5];
    static int top = -1;
    public static boolean isEmpty(){
        return top==-1;
    }
    public static boolean isFull(){
        return top==S.length-1;
    }
    public static void push(int data) {
//step1: To Check Over Flow Condition
        if (top == S.length - 1) {
            System.out.println("Over Flow Condition");
        } else {
//step3: Increase top by 1
            top++;
//step4: Assign value into top of the Stack
            S[top] = data;
            System.out.println("Data Insert into stack success");
        }
    }
    public static int pop() {
//step1: To Check Under Flow
        int result = -1;
        if (top == -1) {
            System.out.println("Under Flow Condtion");
        } else {
//step2: Assign top element of the stack into anothe
            result = S[top];
//step3: Decrease top by 1
            top--;
        }
//step4: Return the Result
        return result;
    }
    public static int peek(){
        if(top>=0){
            return S[top];
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        System.out.println("Stack is FUll : "+isFull());
        System.out.println("=========Pop()===Operation");
        System.out.println("" + pop());
        System.out.println("" + pop());
        System.out.println("Top Of Element of The Stack "+peek());
        System.out.println("" + pop());
        System.out.println("" + pop());
        System.out.println("" + pop());
        pop();
        System.out.println("Stack is Empty : "+isEmpty());
    }
}

public class StackPushMethod {
static int s[] =new int[5];
static int indexTop = -1;

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

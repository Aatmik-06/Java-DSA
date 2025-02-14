import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLinkedList_ArrayList {
    public static void main(String[] args) {

//        Time Comparison between LinkedList and ArrayList
        double startTime = System.currentTimeMillis();
        ArrayList<Integer> al= new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            al.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList = " + (endTime-startTime));

        long startTime1 = System.currentTimeMillis();
        LinkedList<Integer> ll= new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            ll.add(i);
        }
        double endTime1 = System.currentTimeMillis();
        System.out.println("Time taken by Linked List = "+(endTime1-startTime1));
//        So LinkedList is Faster as Compared to ArrayList


    }
}

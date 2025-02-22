public class BubbleSortDemo {
    //    Bubble Sort is a simple sorting
//    algorithm that repeatedly swaps adjacent
//    element if they are in the wrong order

//    Algorithm of Bubble Sort

//    Step1: Start from the first element of the
//            array
//    Step2: Compare the current element with
//    its next element

//    Step3: if current element greater than /
//    less than the next element , swap them

//    Step4: Move to the next element and
//    repeat step2 and step3

    //    Step5: Repeat the process for all elements
//    of the array until no swap are needed

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,30,20,50,40};
        System.out.println("Before Sorting");
        for (int x : arr){
            System.out.print("\t" + x);
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("After Sorting");
        for (int x : arr){
            System.out.print("\t" + x);
        }
    }
}
//Time complexity
//Best case : O(n)
//worst case :0(n^2)
//Average case ; o(n^2)


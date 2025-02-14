public class BubbleSortDemo {
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


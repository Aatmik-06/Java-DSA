public class SelectionSortDemo {
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[i]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={10,30,20,50,40};
        System.out.println("Before Sorting");
        for (int x : arr){
            System.out.print("\t" + x);
        }
        System.out.println();
        SelectionSort(arr);
        System.out.println("After Sorting");
        for (int x : arr){
            System.out.print("\t" + x);
        }
    }
}

//Swapping Performed = n-1 times

//Time complexity
//Best case : O(n)
//worst case :0(n^2)
//Average case ; o(n^2)

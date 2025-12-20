package recursion;

public class isSorted {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 6, 7 };
        if(isSorted(arr, 0)){
            System.err.println("Array is sorted");
        }else{
            System.out.println("Not sorted");
        }
    }

    public static boolean isSorted(int arr[], int i) {
        if(i==arr.length-1) return true;
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
        
    }
}

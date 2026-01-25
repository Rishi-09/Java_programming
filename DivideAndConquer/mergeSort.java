package DivideAndConquer;

public class mergeSort {

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {

        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
            ;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (int I = 0; I < temp.length; I++) {
            arr[low+I] = temp[I];
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 2, 9, 5, 4, 6, 7, 2, 8 };
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}

package DivideAndConquer;

public class quickSort {
    public static void quickSort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int pvtIdx = partition(arr, low, high);
        quickSort(arr, low, pvtIdx - 1);
        quickSort(arr, pvtIdx + 1, high);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partition(int arr[], int low, int high) {
        int pvt = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pvt) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 4, 7, 9, 2 };
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

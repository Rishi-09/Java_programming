package recursion;

public class Occurence {
    public static int firstOccurence(int arr[],int key,int idx){
        if(idx == arr.length-1) return -1;
        if(arr[idx]==key) return idx;
        return firstOccurence(arr, key, idx+1);
    }
    public static int lastOccurence(int arr[], int key,int idx){
        if (idx<0) return -1;
        if(arr[idx]==key) return idx;
        return lastOccurence(arr, key, idx-1);
    }
    public static void main(String args[]) {
        int arr[] = { 4, 2, 4, 6, 76, 3, 6, 7, 6, 1 };
        int key = 6;
        System.out.println("last Occurence :" + (lastOccurence(arr, key,arr.length-1)));
    }
}
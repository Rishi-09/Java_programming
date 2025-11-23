package Arrays;

public class searchInSortedMat {
        public static void main(String args[]){
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        if(!search(arr,14)){
            System.out.println("Not found!");
        }
    }
    public static boolean search(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col >=0){
            if(arr[row][col]==key){
                System.out.println("Found at row:"+row+" col:"+col);
                return true;
            }else if(key<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }

}

package Arrays;
public class spiralMatrix {
    public static void main(String args[]){
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiralMat(arr);
    }
    public static void printSpiralMat(int arr[][]){
        int rowStart = 0;
        int rowEnd = arr.length-1;
        int colStart=0;
        int colEnd = arr[0].length-1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int j=colStart;j<= colEnd;j++){
                System.out.print(arr[rowStart][j]+" ");
            }
            for(int j=rowStart+1;j<=rowEnd;j++){
                System.out.print(arr[j][colEnd]+" ");
            }
            for(int j=colEnd-1;j>=colStart;j--){
                System.out.print(arr[rowEnd][j]+" ");
            }
            for(int j=rowEnd-1;j>=rowStart+1;j--){
                System.out.print(arr[j][rowStart]+" ");
            }
            rowEnd--;rowStart++;colStart++;colEnd--;
        }
    }
}

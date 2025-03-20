import java.util.Scanner;

public class Java1_1ArrayAsFunction{
    
    public static int[] inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the"+size+ " elements of the array:");
        for(int i = 0 ;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void showArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String [] args){
        int []arr = inputArr();
        showArr(arr);
    }
}
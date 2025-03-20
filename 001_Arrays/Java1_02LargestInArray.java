
import java.util.Scanner;
public class Java1_02LargestInArray {
     
    public static int biggie(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
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
        System.out.println();
    }

    public static void main(String [] args){
        int []arr = inputArr();
        showArr(arr);
        int max = biggie(arr);
        System.out.print(max+" is the largest element");
    }
}

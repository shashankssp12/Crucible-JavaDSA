import java.util.Scanner;
public class array_function {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input taken");
        System.out.println("Stored at address:"+arr);
 
        for(int i=0;i<5;i++){
            System.out.print(" "+arr[i]); 
        }
        sc.close();
    }
}

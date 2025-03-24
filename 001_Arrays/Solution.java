import java.util.Scanner;
public static void main(String[] args)  {
	Scanner sr = new Scanner(System.in);
	int t = sr.nextInt();
	while(t > 0) 
	{
		int size = sr.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; ++i) 
		{
			input[i] = sr.nextInt();
		}
		System.out.println(Solution.sum(input));
		t -= 1;
	}
}
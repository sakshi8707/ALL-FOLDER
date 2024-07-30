import java.util.Scanner;

public class fibonacci_seq{
  public static void main(String[] arg)
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    
    int[] arr = new int[n];
    //taking arr input

    for(int i=0;i<n;i++)
    {
      arr[i] = scanner.nextInt();
    }
    int[] ans = new int[n];
    ans[0] = arr[0];
    //prforming fibonacci operation
    for (int i=1;i<n;i++)
    {
      ans[i] = ans[i - 1] + arr[i];
    }
    
    //now returning ans
    for(int i=0;i<n;i++)
    {
      System.out.print(ans[i] + " ");
    }
    System.out.println();
  }
}

import java.util.Scanner;

public class how_to_take_input{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    int[] arr = new int[n];

    for(int i=0;i<n;i++)
    {
      arr[i] = scanner.nextInt();
      // charArr[i] = scanner.nextLine().charAt(0)   for char
    }
    //now printing

    for(int i=0;i< arr.length ;i++)
    {
      System.err.println(arr[i]);
    }

  }
}

import java.util.Scanner;


public class arrays {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the no of cars");
    int n = scanner.nextInt();
    scanner.nextLine();
    //creating an array
    String[] arr = new String[n];

    //propmt user to enter each car name
    for(int i=0;i<n;i++)
    {
      System.out.println("enter car " + (i + 1) + ":");
      arr[i] = scanner.nextLine();
    }
    //printing the car name
    System.out.println("following car name as below -> ");
    ;
    for(int i=0;i<n;i++)
    {
      System.out.println(arr[i]);
    }


    scanner.close();

  }
}




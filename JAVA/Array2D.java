
import java.util.Scanner;

public class Array2D{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int row = scanner.nextInt();
    scanner.nextLine();
    int col = scanner.nextInt();
    scanner.nextLine();

    int[][] arr = new int[row][col];

    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j] = scanner.nextInt();
      }
      if (i < row - 1) {
        scanner.nextLine();
    }
    }
    
    System.out.println("here's the output :");
    //now printing output
    for(int i=1;i<row;i++)
    {
      for (int j = 0; j < col; j++) {
        System.out.println(arr[i][j] + " ");
      }
    }
    System.out.println();


  }
}
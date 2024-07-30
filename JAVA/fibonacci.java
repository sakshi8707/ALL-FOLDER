import java.util.Scanner;

class fibonacci {
  
  static int Fibonacci(int n)
  {
    if(n <= 1)
    {
      return n;
    }
    return Fibonacci(n-1)+Fibonacci(n-2);
     
  }


  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();

    for(int i=0;i<n;i++)
    {
      System.out.print(Fibonacci(i)+ " ");
    }

  }
}
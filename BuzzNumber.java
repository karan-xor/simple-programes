import java.util.Scanner;
class JavaExample {

  // This method returns true if num is a Buzz number
  static boolean checkBuzzNumber(int num)
  {
    // check if num ends with 7 or divisible by 7
    if(num % 10 == 7 || num % 7 == 0)
      return true;
    else
      return false;
  }
  public static void main(String args[])
  {
    int n;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = scan.nextInt();

    //if method returns true then the entered number is
    //a Buzz number else it is not a Buzz Number
    if (checkBuzzNumber(n))
      System.out.println(n+" is a Buzz number.");
    else
      System.out.println(n+" is not a Buzz number.");
  }
}

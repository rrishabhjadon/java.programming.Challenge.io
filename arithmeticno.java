import java.util.Scanner;

public class arithmeticno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter first digit number :");
    int first= sc.nextInt();
    System.out.print("Please Enter second digit number :");
    int Second = sc.nextInt();
    
    int Add= first+Second;
    int Sub= first-Second;
    int mul= first*Second;
    int Divide= first/Second;
    int module= first%Second;

    System.out.println("Add :" + Add);
    System.out.println("Sub :" + Sub);
    System.out.println("multiply :" + mul);
    System.out.println("Divide :" + Divide);
    System.out.println("module :" + module);
  }  
}

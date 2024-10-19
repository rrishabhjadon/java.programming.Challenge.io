import java.util.Scanner;

public class Compoundin {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Welcome to my compoumd intrest Calculation ");
    System.out.print("Please Enter your pricipal of intrest :");
        double P = sc.nextDouble();
        System.out.print("Now..! Enter your Time of intrest :");
        double T = sc.nextDouble();
        System.out.print("And.! Enter your Rate of intrest  :");
        double R = sc.nextDouble();

        double compound = P*Math.pow( (1+R/100),T);

        System.out.println("This is my compound intrest calcultion:" + compound);
   } 
}

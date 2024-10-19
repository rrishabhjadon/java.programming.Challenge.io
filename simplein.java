import java.util.Scanner;

public class simplein {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to my simple intrest calculation");
        System.out.print("Please Enter your pricipal :");
        double P = sc.nextDouble();
        System.out.print("Now..! Enter your Time :");
        double T = sc.nextDouble();
        System.out.print("And.! Enter your Rate :");
        double R = sc.nextDouble();

        double cal = (P*T*R)*0.01;

        System.out.println("THis is your simple intrest calculation :"+ cal);
    }
    
}

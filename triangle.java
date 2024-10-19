import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME to my Triangle area");
        System.out.print("Please Enter base of area");
        double base = sc.nextDouble();
        System.out.print("Please Enter height of area");
        double height= sc.nextDouble();
        
        double area = 0.5*base*height;
        System.out.println("This is my triangle area :" +area +"cms2");
    }
}

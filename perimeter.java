import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to my perimeter calculater");
        System.out.print("please Enter all 4 side cm");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c= sc.nextDouble();
        double d = sc.nextDouble();

        double cal = a+b+c+d;
        System.out.println("this is my perimeter rectangle :" +cal);
    }
}

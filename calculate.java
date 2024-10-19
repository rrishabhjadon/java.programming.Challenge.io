import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Hey..! we are doing add & multiply  ");
        System.out.print("Please Enter your first floating Number");
        double first = sc.nextDouble();
        System.out.println("Now..! Enter your second floating Number");
        double second= sc.nextDouble();
        double add= first+second;
        double mul= first*second;
        System.out.println("these are addition float number :" + add);
        System.out.println("these are multiply float number :" + mul);
    }
}

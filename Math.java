import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter double number");
        double num = sc.nextDouble();
        double y = java.lang.Math.ceil(num);
        double z = java.lang.Math.floor(num);
        double k = java.lang.Math.round(num);
        double l = java.lang.Math.abs(num);
        System.out.println("Ceil of x: " + y);
        System.out.println("Floor of x: " + z);
        System.out.println("Round of x: " + k);
        System.out.println("Abs of x: " + l);
    }
    
}

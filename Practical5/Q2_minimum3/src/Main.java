import java.util.Scanner;

public class Main {
    public static float minimum3( float num1, float num2, float num3){
        float minval;
        minval = Math.min(num1,num2);
        minval = Math.min(minval,num3);
        return minval;
    }
    public static void main(String[] args){
        float num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first float number :");
        num1 = sc.nextFloat();
        System.out.println("Enter second float number :");
        num2 = sc.nextFloat();
        System.out.println("Enter last float number :");
        num3 = sc.nextFloat();
        System.out.printf("%n%s%.2f%n","The minimum was ",minimum3(num1,num2,num3));
    }
}

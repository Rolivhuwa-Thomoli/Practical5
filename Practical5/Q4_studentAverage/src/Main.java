import java.util.Scanner;

public class Main {
    public static int qualityPoints(double num){
        int test = (int)num/10;
        switch (test){
            case 9 : return 4;
            case 8 : return 3;
            case 7 : return 2;
            case 6 : return 1;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double average;
    System.out.println("Enter the average mark (0 to 100): ");
        average = sc.nextDouble();
        System.out.printf("%n%s%d%n","Quality points are : ",qualityPoints(average));
    }
}
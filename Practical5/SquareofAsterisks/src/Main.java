import java.util.Scanner;

public class Main {
    public static void squareOfAsterisks(int num){
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++)
                System.out.print("*");

            System.out.println();

        }
    }
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        input = sc.nextInt();
        squareOfAsterisks(input);
    }
}
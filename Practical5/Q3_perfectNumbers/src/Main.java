public class Main {
    public static boolean isPerfect(int num){
        int sumFactors = 0;
                for(int i = 1; i<num; i++){
                    if(num%i == 0)//i.e is a factor
                        sumFactors+=i;
                }
        return (sumFactors==num);

    }
    public static void main(String[] args) {

        //System.out.printf("%B",isPerfect(33550336));
        for(int i = 1; i<=1000; i++){
            if(isPerfect(i)){
                System.out.print(i + " Factors: ");
                for(int j = 1; j<i; j++){
                    if(i%j == 0)//i.e is a factor
                        System.out.print(" "+j+" ");
                }
                System.out.println();
            }
        }
    }
}
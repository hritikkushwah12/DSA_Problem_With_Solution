import java.util.Scanner;
public class CheckForPrimeNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        boolean isBoolean=true;
//        for(int i=2;i<=n/2;i++){
//         if(n%i==0){
//             System.out.println("Not a Prime!");
//             isBoolean=false;
//             break;
//         }
//         if(isBoolean) System.out.println();
//        }
        boolean isBoolean=true;
        if(n>1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isBoolean = false;
                    break;
                }
            }
            if(isBoolean) System.out.println("Is a Prime!");
            else System.out.println("Not a Prime!");
        }
        else System.out.println("Not a valid Number NaN!");
    }
}
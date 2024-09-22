import java.util.Scanner;
public class BinaryToDecimalForPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // WE CANT APPLY LEFT SHIFT (which always multiplies by 2 after shift)
        // because int have 32 bit which will lead to incorrect ans in left shift!
        int ans=0;
        int radix=1;
        while(n>0){
            ans+=radix*(n%10);
            n/=10;
            radix*=2;
        }
        System.out.println(ans);
    }
}

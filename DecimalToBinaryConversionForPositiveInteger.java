import java.util.Scanner;
    public class DecimalToBinaryConversionForPositiveInteger{
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            // WE ARE APPLYING LEFT SHIFT FOR DIVIDING NUMBER BY 2 and bitwise and(&)
            // for checking the first bit
            int bit;
            int ans=0;
            int base=1;
            while(n>0){
                bit=(n&1);
                n=n>>1;
                ans+=(bit*base);
                base*=10;
            }
            System.out.println(ans);
            System.out.println(~5+1);

// ALTERNATIVE WAY !
//            int rem;
//            int base=1;
//            int ans=0;
//            while(n>0){
//                rem=n%2;
//                ans+=(rem*base);
//                n/=2;
//                base*=10;
//            }
//            System.out.println(ans);
        }
    }


import java.util.Scanner;
public class ReverseSignedIntegerLeet {
        public static int reverse(int x) {
//            int i=0;
//            int ans=0;
//            int rem;
//            int y=x;
//            while(x>0){
//                i++;
//                x/=10;
//
//            }
//            while(y>0){
//                rem=y%10;
//                y/=10;
//                ans+=rem*(Math.pow(10,i-1));
//                i--;
//            }
//            return ans;
//        }

            int ans,rem;
            ans=0;
            while(x>0){
                rem=x%10;
                ans=ans*10+rem;
                x/=10;
            }
            return ans;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(reverse(x));
    }
    }


import java.util.*;
public class FibonacciSeriesForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prevNumber=1;
        int lastPrevNumber=0;
        System.out.print(0+" "+1+" ");
        for(int i=1;i<=n-2;i++){
            int ans=prevNumber+lastPrevNumber;
            System.out.print(ans+" ");
            lastPrevNumber=prevNumber;
            prevNumber=ans;
        }
    }
}

package com.problem.array;
import java.util.Scanner;
public class MaxInArray{
    public static void inputArray(int []aray){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<aray.length;i++){
            aray[i]=in.nextInt();
        }
    }
    public static int maxInArray(int []aray){
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<aray.length;i++){
            maxValue=Math.max(maxValue,aray[i]);
            //if(aray[i]>maxValue)maxValue=aray[i];
        }
        return maxValue;
    }

    public static int minInArray(int []aray){
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<aray.length;i++){
            minValue=Math.min(minValue,aray[i]);
           // if(aray[i]<minValue)minValue=aray[i];
        }
        return minValue;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int []aray=new int[length];
        inputArray(aray);
        System.out.println("Max Value is:"+maxInArray(aray));
        System.out.println("Min Value is:"+minInArray(aray));

    }
}
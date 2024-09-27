package com.problem.array;
import java.util.*;
public class ReverseAlternativePairInArray{
    public static void editArray(int []aray){
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<aray.length;i++){
            aray[i]=inp.nextInt();
        }
    }
    public static void printArray(int []aray){
        for(int i=0;i<aray.length;i++){
            System.out.print(aray[i]+" ");
        }
    }
    public static int [] reverse(int []aray){
        /// ONLY FOR EVEN LENGTH ARRAY
        for(int i=0;i<aray.length;i+=2){
            int temp=aray[i];
            aray[i]=aray[i+1];
            aray[i+1]=temp;
        }
        return aray;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int []aray=new int[length];
        editArray(aray);
        reverse(aray);
        printArray(aray);
    }
}
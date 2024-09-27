package com.problem.array;
import java.util.*;

public class ReverseAnArray{
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
    private static int [] reverse(int []aray){
        int i=0;
        int j=aray.length-1;
        while(i<j){
            int temp=aray[i];
            aray[i]=aray[j];
            aray[j]=temp;
            i++;j--;
        }
        return aray;
    }
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        int length=inp.nextInt();
        int []aray=new int[length];
        editArray(aray);
        reverse(aray);
        printArray(aray);
    }
}
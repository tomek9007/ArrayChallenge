package com.tomek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] BaseArray=new int[5];

        getIntegers(BaseArray);
        printArray(BaseArray);
        sortIntegers(BaseArray);
        printArray(BaseArray);

    }

    public static int[] getIntegers(int[] array){
        System.out.println("Enter "+array.length+ " elements");
        Scanner scanner=new Scanner(System.in);

        for (int i=0; i<array.length; i++)
        {
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
     for (int i=0;i<array.length;i++)
     {
         System.out.println("Element "+i+" is "+array[i]);
     }


    }

    public static void sortIntegers(int[] array){
        int[] secondArray= array;

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if (array[i]<array[j]){
                    secondArray[i]=array[j];
                    secondArray[j]=array[i];
                    array=secondArray;
                }
            }
        }
    }
}

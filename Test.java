package com.telran.one;

import java.util.Arrays;

public class Test {


    public static void main (String[] args){
        int[] myArray=new int[] {0,0,1,1,0,1};
        System.out.println(myArray[6]);

        int[] myResult=invertArray(myArray);
        System.out.println(Arrays.toString(myResult));
    }

    public static int[] invertArray(int[] array){
        int[] result=new int[array.length];
        for (int index = 0; index<array.length; index++){
            if (array[index] == 0) {
                result[index] = 1;
            } else if (array[index] == 1) {
                result[index] = 0;
            }
        }
        return result;
    }
}

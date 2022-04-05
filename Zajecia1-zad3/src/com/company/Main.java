package com.company;


public class Main {

    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];
        for (int i = 0; i < 10; i++) {
            anArray[i] = i+1;
        }
        int index = searchIndex(anArray, 3); // we want to find index for 11
        System.out.println(index);
    }

    public static int searchIndex(int[] array,int value) {
        int index = 0;
        int limit = array.length - 1;
        while (index <= limit) {
            int point = (int)Math.ceil((index + limit) / 2);
            int entry = array[point];
            if (value > entry) {
                index = point + 1;
            }
            if (value < entry) {
                limit = point - 1;
            }
            if(value == entry)
            {
                return point;
            }
        }
        return -1;
    }
}

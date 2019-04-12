package ua.edu.chmnu.fks.oop.S.V.V;

import java.util.Arrays;

public class Lab3 {


    public static void main(String args[]) {
        int[] myIntArray = new int[] { 20, 100, 69, 4, 20, 4, 100 };
        int[] copyArray = new int[myIntArray.length];
        System.arraycopy(myIntArray, 0, copyArray, 0, myIntArray.length);
        Arrays.sort(myIntArray);
        int[] indexArray = new int[myIntArray.length];
        Arrays.fill(indexArray, -1);
        for (int i = 0; i < copyArray.length; i++) {
            int skiplength = 0;
            int index = find(copyArray, myIntArray[i], 0);
            while(find(indexArray, index, 0) != -1){
                index = find(copyArray, myIntArray[i], skiplength++);
            }
            indexArray[i] = index;

        }

        for (int i = 0; i < copyArray.length; i++) {
            System.out.println(indexArray[i]);
        }

    }

    public static int find(int[] array, int value, int skiplength) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                if(skiplength == 0)
                    return i;
                else
                    skiplength--;

        return -1;
    }
}

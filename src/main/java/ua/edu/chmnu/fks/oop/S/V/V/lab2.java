package ua.edu.chmnu.fks.oop.S.V.V;

public class lab2 {
    public static void main (String[] args) {
    int size = 5;
    int[][] matrix = new int[size][size];

    int start = 1;
    int end = size*size;

for (int r=0; r < size; ++r) {
        int col=0;
        while (col < r) {
            matrix[r][col++] = end--;
        }
        while (col < size) {
            matrix[r][col++] = start++;
        }
    }

for (int r=0; r < size; ++r) {
        for (int c=0; c < size; ++c) {
            System.out.println(matrix[c][r] + " ");
        }
        System.out.println();
    }

}
}
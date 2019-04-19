package ua.edu.chmnu.fks.oop.S.V.V;

public class Lab5 {
    public static void main(String[] args) {
        double[] a, b, c;
        a = new double[]{13, 25, 4};
        b = new double[]{43, -7, 11};
        c = new double[3];
        int i;
        double SkalProd = 0;
        System.out.print("Векторное произведение векторов:[a,b]=<");
        for (i = 0; i < 3; i++) {
            SkalProd += a[i] * b[i];
            c[i] = a[(i + 1) % 3] * b[(i + 2) % 3] - a[(i + 2) % 3] * b[(i + 1) % 3];
            System.out.print(c[i] + (i != 2 ? ";" : ">\n"));
        }
        System.out.println("Скалярное произведение векторов: " + SkalProd);
    }
}

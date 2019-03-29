package ua.edu.chmnu.fks.oop.S.V.V;

public class LabsRec {
    public static void main (String[] args) {
        int[] a = {1,4,2,2,1};
        a = sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println("" + a[i]);
        }
    }
    public static int[] sort(int[] a) {
        int temp;
        boolean sorted = true;
        int[] ret = a;
        for (int i = 0; i < a.length - 1; i++) {
            if (ret[i] > ret[i+1]) {
                temp = ret[i];
                ret[i] = ret[i+1];
                ret[i+1] = temp;
                sorted = false;
            }
        }
        if (sorted) {
            return ret;
        } else {
            return sort(ret);
        }
    }
}


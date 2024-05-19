package com.sunbeam;

public class ModeTester {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        int mode = Mode.calculateMode(array);
        System.out.println("Mode of the array is: " + mode);
    }
}

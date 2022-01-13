package hw3;

import hw2.PrimeNumber;

public class MainMatrix {
    public static void main(String[] args) {
        double[][] arr1 = {{1.1, 2.1, 3.1}, {4.1, 5.1, 6.1}};
        double[][] arr2 = {{1, 2, 3}, {4, 5, 6}};;

        Matrix matrix1 = new Matrix(arr1, 2, 2);

        matrix1.printMatrix();
        PrimeNumber.line();
        Matrix.printArr(matrix1.multiply(2));
        PrimeNumber.line();
        Matrix.printArr(Matrix.sum(arr1, arr2));
        PrimeNumber.line();
    }
}

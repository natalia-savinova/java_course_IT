package hw3;

//Создать класс "Матрица". Класс должен иметь следующие поля: 1) двумерный массив вещественных чисел;
// 2) количество строк и столбцов в матрице. Класс должен иметь следующие методы:
// 1) сложение с другой матрицей; 2) умножение на число; 3) вывод на печать; 4) умножение матриц - по желанию.

public class Matrix {

    double[][] matrix;
    int numberOfRows;
    int numberOfColumns;

    public Matrix(double[][] matrix, int numberOfRows, int numberOfColumns) {
        this.matrix = matrix;
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    public static double[][] sum(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public double[][] multiply(int x) {
        double[][] arr = getMatrix();
        double[][] arrayResult = new double[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            arrayResult[i] = new double[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                arrayResult[i][j] = arr[i][j] * x;
            }
        }
        return arrayResult;
    }

    public void printMatrix() {
        double[][] arr = getMatrix();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }

    public static void printArr(double[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }

    public double[][] getMatrix() {
        return matrix;
    }
}

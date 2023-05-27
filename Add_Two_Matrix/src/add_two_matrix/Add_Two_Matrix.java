package add_two_matrix;

import java.util.Scanner;

public class Add_Two_Matrix {

    public static int[][] addMatrix(int[][] a, int[][] b) {
        int summation_matrix[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                summation_matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return summation_matrix;
    }

    public static void print_matrix(int[][] sum) {
        System.out.println("The Summation Of Two Matrix are :");
        for (int i = 0; i < 2; i++) {//for columns
            for (int j = 0; j < 2; j++) {//for row
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");//new line after end first row
        }
    }

    public static void main(String[] args) {

        int[][] array1 = new int[2][2];
        int[][] array2 = new int[2][2];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements for Matrix");
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                System.out.print("Element Index[" + i + "]" + "[" + x + "]" + ": ");
                array1[i][x] = input.nextInt();
            }
        }
        System.out.println("***************************************************");
        System.out.println("Enter Elements for Matrix 2");
        for (int i = 0; i < 2; i++)//matrix 2
        {
            for (int x = 0; x < 2; x++) {
                System.out.print("Element Index[" + i + "]" + "[" + x + "]" + ": ");
                array2[i][x] = input.nextInt();
            }

        }
        int summation_matrix[][] = addMatrix(array1, array2);//method to sum two matrices

        print_matrix(summation_matrix);//method to print summation matrix
    }
}

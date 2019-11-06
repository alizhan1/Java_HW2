package space.harbour.java.hw2;


import java.util.Scanner;

public class Pascal {
    private static int[][] buildTriangle(int N) {
        int triangle[][] = new int[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j <= count) {
                    if (j == 0 || j == count) {
                        triangle[i][j] = 1;
                    }
                    else {
                        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                    }
                }
                else {
                    break;
                }
            }
            count++;
        }
        return triangle;
    }

    private static void buitifulPrint(int arr[][]) {
        System.out.printf("\n");
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    break;
                }
                else {
                    System.out.printf("%d ", arr[i][j]);
                }
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("N: ");
        int N = Integer.parseInt(input.nextLine());
        int a[][] = buildTriangle(N);
        buitifulPrint(a);
    }
 }

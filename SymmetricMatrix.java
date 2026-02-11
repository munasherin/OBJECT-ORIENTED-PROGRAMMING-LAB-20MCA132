package muna;

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        boolean symmetric = true;

        System.out.print("Enter order of matrix: ");
        n = sc.nextInt();

        int[][] A = new int[n][n];

       System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != A[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        
        if (symmetric) {
            System.out.println("The matrix is Symmetric.");
        } else {
            System.out.println("The matrix is NOT Symmetric.");
        }

        sc.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PenjumlahannMatrix2 {
 
    public static void main (String[]args){
        int i, j, m, n;
        int matrixs[][]= new int [10][10];
        int transpose[][] = new int [10][10];
        Scanner scan = new Scanner (System.in);
        System.out.print("masukan jumlah baris matrix B: ");
        m = scan.nextInt();
        System.out.print("masukan jumlah klom matrix B: ");
        n = scan.nextInt();
        System.out.println("masukan elemen matrix ; ");
        for (i = 0;i < m; i++){
            for (j = 0; j< n; j++){
                matrixs[i][j]=scan.nextInt();
                        
            }
        }
        for (i = 0; i < m; i++){
            for(j = 0; j< n; j++){
                transpose[j][i] = matrixs[i][j];
            }
        }
        System.out.println("hasil Transpose matrixs; ");
        for (i = 0; i < n; i++){
            for (j = 0; j <m; j++){
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println();  
        }
    }
}

    
}

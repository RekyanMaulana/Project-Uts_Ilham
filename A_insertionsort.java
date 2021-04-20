/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_4_pengurutan;

/**
 *
 * @author User
 */
public class A_insertionsort {
    
    public static void insertionShort(int [] A){
        for (int i = 1 ; i < A.length; i++){
            int key = A [i];
            int j = i - 1;
            while ((j >= 0 )&& (A [j] > key )){
                
                A [j + 1] = A [j];
                j--;
                
            }
            A[ j + 1] = key ;
        }
    }
    public static void tampil (int data[]){
        for (int i = 0 ; i <data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[]args){
        int A []= {3, 10, 4, 2, 8, 13};
        A_insertionsort.tampil(A);
        A_insertionsort.insertionShort(A);
        A_insertionsort.tampil(A);
    }
    public static void main (String[]args){
        //pendekalarian variabel
        int A[]= {2, 3, 4, 8, 10};
        int cari = 8;
        int N = 5;
        int batasbawah = N - 1;
        int batasatas = 0;
        boolean ketemu  = false;
        int tengah = 0; 
        
        //menampilkan data dalam aray 
        System.out.print("indeks pointer : ");
        
            System.out.println(A[0]+ " ");
            
        System.out.println("cari di kanan");
        System.out.print("indeks pointer : ");
            System.out.println(A[1]+ " ");
        
        while ((batasatas < batasbawah)&&(!ketemu)){ //perulangan
        tengah = (batasatas + batasbawah) / 2;
            if (A[tengah]==cari){ //kondisi nilai tengah
                ketemu = true; // kondisi ketemu adalah true
                
            }else{
                if (A[tengah] < cari ){
                    batasatas = tengah++;
                    
                }else{
                    batasatas = tengah--;
                }
            }
            if (ketemu){
                System.out.println(" data "+cari+" telah di temukan pada indeks ke "+(tengah ));
                System.out.println("kesinmpulan: data di temukan");
            }     
        }
               
    
    }
}

    


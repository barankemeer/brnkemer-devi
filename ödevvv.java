/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfdghkl;

import java.util.Scanner;

/**
 *
 * @author Baran
 */
public class Gfdghkl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String[][] basamaklarYazi = new String[6][9];
        
        basamaklarYazi[0][0] = "bir";
        basamaklarYazi[0][1] = "iki";
        basamaklarYazi[0][2] = "üç";
        basamaklarYazi[0][3] = "dört";
        basamaklarYazi[0][4] = "beş";
        basamaklarYazi[0][5] = "altı";
        basamaklarYazi[0][6] = "yedi";
        basamaklarYazi[0][7] = "sekiz";
        basamaklarYazi[0][8] = "dokuz";
        
        basamaklarYazi[1][0] = "on";
        basamaklarYazi[1][1] = "yirmi";
        basamaklarYazi[1][2] = "otuz";
        basamaklarYazi[1][3] = "kırk";
        basamaklarYazi[1][4] = "elli";
        basamaklarYazi[1][5] = "atmış";
        basamaklarYazi[1][6] = "yetmiş";
        basamaklarYazi[1][7] = "seksen";
        basamaklarYazi[1][8] = "doksan";
        
        basamaklarYazi[1][0] = "milyon";
        basamaklarYazi[2][0] = "yüz";
        basamaklarYazi[3][0] = "bin";
        basamaklarYazi[4][0] = "onbin";
        basamaklarYazi[5][0] = "yüzbin";
      
       
        for(int i = 2; i < basamaklarYazi.length; i++){
            for(int c = 1; c < basamaklarYazi[i].length; c++){
                basamaklarYazi[2][c] = basamaklarYazi[0][c] + "yüz";
                basamaklarYazi[3][c] = basamaklarYazi[0][c] + "bin";
                basamaklarYazi[4][c] = basamaklarYazi[1][c] + "bin";
                basamaklarYazi[5][c] = basamaklarYazi[2][c] + "bin";
            }            
        }
        
        Scanner s = new Scanner(System.in);
        System.out.print("sayı girin: ");
	int sayi = s.nextInt();
        int basamakSayisi = Integer.toString(sayi).length();
        int basamaklar[] = new int[basamakSayisi];
        
        for(int i = 0; i < basamakSayisi; i++){
            basamaklar[i] = sayi-(sayi / 10) * 10;
            sayi /= 10;
        }
        
        for(int i = basamakSayisi-1; i >= 0; i--){
            if(basamaklar[i]-1 >= 0)
                System.out.print(basamaklarYazi[i][basamaklar[i]-1] + " ");
        }
        
    }
    }
    


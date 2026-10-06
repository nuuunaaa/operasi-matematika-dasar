/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_java;
import java.util.Scanner;

public class Latihan_java {
  public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int a;
      System.out.print("Masukkan angka= ");
      a = input.nextInt();
      
      int pil;
      
      System.out.println("*****Menu*****");
      System.out.println("1. Sinus ");
      System.out.println("2. Kosinus ");
      System.out.println("3. Tangen ");
      System.out.println("4. Pangkat");
      System.out.println("5. Akar");
      System.out.println("");
      System.out.println("Masukkan Pilihan [1-5]: ");
      pil = input.nextInt();
      System.out.println("");
          
      switch(pil) {
          case 1 -> System.out.println("Sinus " + a + "= " + Math.sin(Math.toRadians(a)));
       
          case 2 -> System.out.println("Kosinus " + a + "= " + Math.cos(Math.toRadians(a)));
          
          case 3 -> System.out.println("Tangen " + a + "= " + Math.tan(Math.toRadians(a)));
          
          case 4 -> { 
              System.out.println("Masukkan Pangkat");
              int b = input.nextInt();
              System.out.println(a + "Pangkat" + b+ "=" +Math.pow(a, b));
          }
          case 5 -> 
              System.out.println("Akar" + a + "=" + Math.sqrt(a));
              
          default -> System.out.println("Pilihan salah");
      }
            
      
//    String nama;
//    nama = "auwalis";
//    int umur = 16;
//    float tinggi;
//    tinggi = (float) 156.7;
//    biodata (nama, umur, tinggi);
  
//operasi aritmatika  
    int hasil = penjumlahan(20,39);
    System.out.println("hasil penjumlahan= "+hasil);
    
    hasil = pengurangan(300, 15);
    System.out.println("hasil pengurangan= "+hasil);
    
    hasil = perkalian(520, 10);
    System.out.println("hasil perkalian= "+hasil);
    
    hasil = pembagian(20,2,5);
    System.out.println("hasil pembagian= "+hasil);
    
  }
  
  public static int penjumlahan(int a, int b){
  return a+b;
  }
  
  public static int pengurangan(int a, int b){
  return a-b;  
  }
  
  public static int perkalian(int a, int b){
  return a*b;
  }
  
  public static int pembagian(int a, int b, int c){
  return a/b/c;
  }
  
//  public static void biodata(String nama, int umur, float tinggi){
//  System.out.println("halo");
//  System.out.println("Nama\t: " + nama + "\nUmur\t: " + umur);
//  
//  System.out.println("TB\t: " + tinggi);
  
  /*
  Escape squence itu untuk merapikan (dia berjalan di dalam petik, jika di luar akan eror)
  1. \t -> tab 
  2. \n -> enter, membuat baris baru tanpa harus println berulang kali
  3. \b -> backspace, menghapus karakter sebelumnya
  */
  }


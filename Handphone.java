/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Win 10
 */
public interface Handphone { // kelas abstract bebas menentukan method abstract dalam interface
   String merk = "Samsung";
   String warna = "Hitam";
   abstract void printMerk();
   abstract void printWarna();

    
public static void main (String []args){ // variabel static di implementasi dalam program utama
   Interface hp = new Interface();
   hp.merk();
   hp.warna();  
}

public interface Handphone {  //interface tidak di instansiasi
    Handphone hp = new Handphone();
}

//interface dapat mengextends lebih dari satu interface
public interface Handphone extends Samsung, Asus, Iphone{ 
    
}

//interface tidak dapat mengimplmentasi interface lain
public interface Handphone implements Samsung {
}
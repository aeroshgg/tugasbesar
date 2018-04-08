/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;
import java.util.Scanner;
/**
 *
 * @author AnangNugraha
 */
public class Tugasbesar {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama=a1.nextLine();
        System.out.println("===============================================================");
        System.out.println("               KERJAKAN SOAL-SOAL DIBAWAH INI DENGAN BENAR");
        System.out.println("          Materi Pelajaran TIK | Teknologi Informasi Komunikasi");
        
        String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";
        int benar=0, salah=0;
        int totalnilai=0;
        
        String[] b = new String[6];
        
        b[0] = "Kepanjangan dari BIOS adalah. ….";
        b[1] = "Basic Input Output System ";
        b[2] = "Basic Input Output Support";
        b[3] = "Basic Input Organitation System";
        b[4] = "Basic International Organitation System";
        b[5] = "Basic International Organitation Server";
        System.out.println("1. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                benar = 1;
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "b":
                System.out.println(JwSl);
                salah = 1;
                System.out.println("kunci jawaban = a");
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "c":
                System.out.println(JwSl);
                salah = 1;
                System.out.println("kunci jawaban = a");
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "d":
                System.out.println(JwSl);
                salah = 1;
                System.out.println("kunci jawaban = a");
                System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "e":
                System.out.println(JwSl);
                salah = 1;
                System.out.println("kunci jawaban = a");
                System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah);             
                break;
            default:
                System.out.println("Inputan anda salah");
                break;
                
 

        }
        System.out.println("");
        b[0] = "Perangkat lunak yang ditujukan untuk melengkapi kinerja sistem operasi dan meningkatkan kinerja komputer adalah ….";
        b[1] = "Sistem Operasi";
        b[2] = "Video Editor";
        b[3] = "Text Editor";
        b[4] = "Program Utility";
        b[5] = "Registry";
        System.out.println("2. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                benar=benar+1;
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "a":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "c":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "b":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "e":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            default:
                System.out.println("Inputan anda salah");
                break;    
        }
        
        System.out.println("");
        b[0] = "Yang termasuk dalam program SpreadSheet adalah.... ….";
        b[1] = "Mozila Firefox";
        b[2] = "Microsoft Office Word";
        b[3] = "Photoshop";
        b[4] = "Adobe Acrobat";
        b[5] = "Microsoft Office Excel";
        System.out.println("2. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                benar=benar+1;
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "a":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "c":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "d":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                 System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            case "b":
                System.out.println(JwSl);
                salah = salah+1;
                System.out.println("kunci jawaban = b");
                System.out.println("Jawaban Benar: " + benar);
                System.out.println("Jawaban Salah: " + salah); 
                break;
            default:
                System.out.println("Inputan anda salah");
                break;    
        }
     
        System.out.println("\n");
        System.out.println("Hasil Akhir");
        System.out.println("Jawaban yang benar adalah : " + benar);
        System.out.println("Jawaban yang salah adalah : " + salah);
        totalnilai=benar*20;
        System.out.println("Total nilai adalah : " + totalnilai);
        
        String nG;
        
         if (totalnilai >= 86){
           nG = "A";
       } else if (totalnilai>= 71){
           nG = "B";
       } else if (totalnilai>= 55){
           nG = "C";
       } else if (totalnilai<= 54){
           nG = "D";
       } else {
           nG = "E";
       } 
       System.out.println("Nilai huruf :" + nG);
    
    }
    
    static void pertanyaan1 (){
        
    }

    
    
    

}
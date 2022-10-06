    import java.util.Scanner;

public class KonversiAngkaToRomawi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan Angka : ");
        angka = input.nextInt();

       System.out.print("Hasil Angka Romawi : ");
       if (angka <1 || angka>5000){
           System.out.println("error");
       }

       else {
        while (angka>=1000){
               System.out.print("M");
               angka = angka - 1000;
           }
           if(angka >=500) {
               System.out.print("CM");
               angka = angka - 900;
           }
           else {
               System.out.print("D");
               angka = angka - 500;
           }
        }
        while (angka>=100) {

            if(angka >= 400) {
            System.out.print("CD");
            angka = angka - 900;
            }
            else {
            System.out.print("C");
            angka = angka - 100;
            }
        }
        while (angka>=50) {

            if(angka >= 90) {
            System.out.print("XC");
            angka = angka - 90;
            }
            else {
            System.out.println("L");
            angka = angka - 50;
            }               
        }

        while (angka>=10) {
            if(angka >= 40) {
            System.out.println("XL");
            angka = angka - 40;
            }
            else {
            System.out.println("X");
            angka = angka - 10;
            }               
        }
        while (angka>=5) {
            if(angka >= 9) {
            System.out.print("IX");
            angka = angka - 9;
            }
            else {
            System.out.print("V");
            angka = angka - 5;
            }               
        }
        while (angka>=1) {
            if(angka >= 4) {
            System.out.print("IV");
            angka = angka - 4;
            }
            else {
            System.out.print("I");
            angka = angka - 1;
            }
        }
        System.out.println();
    }
    
}

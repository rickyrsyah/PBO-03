package project1;

import java.util.Scanner;

class Tebakan {
    int nilaiBilangan;
    
    Tebakan() {
        this.nilaiBilangan = (int) (Math.random()*100);
        System.out.println("Hai.. "
        + "nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. "
        + "Silahkan tebak ya!!!\n");
    }

    protected void mulaiTebakan() {
        System.out.print("Tebakan Anda: ");
        Scanner input = new Scanner(System.in);
        int tebakan = input.nextInt();
        
        while (cekTebakan(tebakan) == false) {
            System.out.print("Tebakan Anda: ");
            tebakan = input.nextInt();
        }
    }
    private boolean cekTebakan(int tebakan) {
        if (tebakan == this.nilaiBilangan) {
            System.out.println("Yeeee... Bilangan tebakan anda BENAR :-)");
            return true;
        } else if (tebakan > this.nilaiBilangan) {
            System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
        } else {
            System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
        }
        return false;
    }
}
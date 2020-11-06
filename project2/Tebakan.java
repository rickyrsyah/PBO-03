package project2;

import java.util.Scanner;

class Tebakan {
    int nilaiBilangan;
    int skor = 100;

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
            if (this.skor == 0) {
                System.out.println("Permainan dihentikan.");
                break;
            }
            System.out.print("Tebakan Anda: ");
            tebakan = input.nextInt();
        }
        tampilkanSkor();
    }

    private void tampilkanSkor() {
        int bonus = this.skor>=90 ? 50 : 0;
        System.out.println();
        System.out.println("Score Anda: "+this.skor);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total: "+(this.skor+bonus));

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
        this.skor -= 2;
        return false;
    }
}
import java.util.Scanner;

public class tugasmodul4 {

        static int saldo = 0;
       static Scanner scanner = new Scanner(System.in);

        static int beliminuman(int harga) {
            if (saldo >= harga) {
                saldo -= harga;
                System.out.println("Anda telah membeli minuman.");
                return saldo;
            } else {
                System.out.println("Saldo anda tidak mencukupi untuk melakukan transaksi.");
                return saldo;
            }
        }

        public static void main(String[] args) {
            System.out.println("Kelompok 32");
            System.out.println("Anggota kelompok:");
            System.out.println("1. Anisa Anastasya (21120123130080)");
            System.out.println("2. Aisyah Aulia Azzahra Putri (21120123120041)");
            System.out.println("3. Gyda Marva Adriono (21120123140043)");
            System.out.println("4. Hasnaa' Amalia Qurratu'Aini(21120123140155)");
            String stars = "*".repeat(100);
            System.out.println(stars);


            System.out.println("Selamat datang di Vending Machine. Mau minum apa?");
            System.out.print("Masukkan saldo anda: ");
            saldo = scanner.nextInt();

            int pilihan;
            do {
                open.tampilkanmenu();
                System.out.print("Masukkan pilihan anda: ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        saldo = beliminuman(3000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 2:
                        saldo = beliminuman(5000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 3:
                        saldo = beliminuman(5000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 4:
                        saldo = beliminuman(7000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 5:
                        saldo = beliminuman(8000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 6:
                        saldo = beliminuman(10000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 7:
                        saldo = beliminuman(6000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 8:
                        saldo = beliminuman(7000);
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        break;
                    case 9:
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        System.out.println("Terima kasih sudah menggunakan Vending Machine :3");
                        break;
                    default:
                        System.out.println("Pilihan yang anda masukkan tidak valid.");
                }

                if (pilihan != 9 && saldo >= 0) {
                    System.out.print("Apakah anda ingin melanjutkan pembelian? (Ya/Tidak): ");
                    String lanjut = scanner.next();
                    if (lanjut.equalsIgnoreCase("Tidak")) {
                        System.out.println("Sisa saldo anda: Rp " + saldo);
                        System.out.println("Terima kasih sudah menggunakan vending machine :3");
                        break;
                    }
                }
            }while (pilihan != 9);
            
            scanner.close();
        }
    }

package tugasPROGDAS;
import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menuNames = {"Kentang Goreng", "Nasi Goreng", "Ayam Bakar", "Teh Manis"};
        double[] menuPrices = {15000, 25000, 30000, 5000};
        ArrayList<Integer> order = new ArrayList<>();
        System.out.println("Selamat datang di Sistem Pesanan Restoran!");
        while (true) {
            System.out.println("\nDaftar Menu:");
            for (int i = 0; i < menuNames.length; i++) System.out.println((i + 1) + ". " + menuNames[i] + " - Harga: " + menuPrices[i]);
            System.out.println("\nPilih opsi:\n1. Tambah Item ke Pesanan (pilih nomor menu)\n2. Daftar Pesanan\n3. Hitung Total Bill\n4. Keluar");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Masukkan nomor menu: ");
                int menuChoice = scanner.nextInt();
                if (menuChoice >= 1 && menuChoice <= menuNames.length) {
                    order.add(menuChoice - 1);
                    System.out.println("Item '" + menuNames[menuChoice - 1] + "' ditambahkan ke pesanan.");
                } else System.out.println("Nomor menu tidak valid.");
            } else if (choice == 2) {
                if (order.isEmpty()) System.out.println("Pesanan kosong.");
                else {
                    System.out.println("Daftar Pesanan:");
                    for (int idx : order) System.out.println(menuNames[idx] + " - Harga: " + menuPrices[idx]);
                }
            } else if (choice == 3) {
                double total = 0;
                for (int idx : order) total += menuPrices[idx];
                System.out.println("Total Bill: " + total);
            } else if (choice == 4) {
                System.out.println("Terima kasih!");
                break;
            } else System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}

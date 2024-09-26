import java.util.Random;
import java.util.Scanner;

public class TicTacToeRPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] papan = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char pemainSekarang = 'X';
        boolean gameBerjalan = true;

        System.out.println("Selamat datang di Permainan Tic-Tac-Toe dan Batu-Gunting-Kertas!");

        while (gameBerjalan) {
            tampilkanPapan(papan);
            
            // Menentukan pemain yang berhak melakukan langkah pada Tic-Tac-Toe
            if (pemainSekarang == 'X') {
                lakukanTaruhan(scanner, papan, pemainSekarang);
            } else {
                System.out.println("Pemain O (komputer) melakukan langkah Batu-Gunting-Kertas...");
                pemainKomputerLakukanTaruhan(papan);
            }
            
            gameBerjalan = !cekKemenangan(papan, pemainSekarang) && !cekSeri(papan);

            pemainSekarang = (pemainSekarang == 'X') ? 'O' : 'X';
        }

        tampilkanPapan(papan);
        scanner.close();
    }

    private static void tampilkanPapan(char[][] papan) {
        System.out.println("-------------");
        for (char[] baris : papan) {
            System.out.print("| ");
            for (char cell : baris) {
                System.out.print(cell + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static void lakukanTaruhan(Scanner scanner, char[][] papan, char pemain) {
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Pemain " + pemain + ", masukkan baris (1-3) dan kolom (1-3) pemilihan Anda (contoh: 2 2): ");
            int baris = scanner.nextInt() - 1;
            int kolom = scanner.nextInt() - 1;

            if (baris >= 0 && baris < 3 && kolom >= 0 && kolom < 3 && papan[baris][kolom] == ' ') {
                papan[baris][kolom] = pemain;
                validInput = true;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }

    private static void pemainKomputerLakukanTaruhan(char[][] papan) {
        Random random = new Random();
        int baris, kolom;

        do {
            baris = random.nextInt(3);
            kolom = random.nextInt(3);
        } while (papan[baris][kolom] != ' ');

        papan[baris][kolom] = 'O';
    }

    private static boolean cekKemenangan(char[][] papan, char pemain) {
        // Cek baris dan kolom
        for (int i = 0; i < 3; i++) {
            if ((papan[i][0] == pemain && papan[i][1] == pemain && papan[i][2] == pemain) ||
                (papan[0][i] == pemain && papan[1][i] == pemain && papan[2][i] == pemain)) {
                System.out.println("Pemain " + pemain + " menang!");
                return true;
            }
        }

        // Cek diagonal
        if ((papan[0][0] == pemain && papan[1][1] == pemain && papan[2][2] == pemain) ||
            (papan[0][2] == pemain && papan[1][1] == pemain && papan[2][0] == pemain)) {
            System.out.println("Pemain " + pemain + " menang!");
            return true;
        }

        return false;
    }

    private static boolean cekSeri(char[][] papan) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (papan[i][j] == ' ') {
                    return false; // Ada setidaknya satu sel kosong, permainan belum selesai
                }
            }
        }

        System.out.println("Permainan seri!");
        return true;
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        recursiveIslem(n, n);

        scanner.close();
    }

    static void recursiveIslem(int n, int initialN) {
        System.out.print(n + " ");

        if (n <= 0) {
            // Eğer sayı negatif veya 0 ise, işlemi durdur ve tekrar 5 ekle.
            recursiveEkle(n + 5, initialN);
        } else {
            // Sayı pozitif ise, 5 çıkar ve işlemi tekrarla.
            recursiveIslem(n - 5, initialN);
        }
    }

    static void recursiveEkle(int n, int initialN) {
        System.out.print(n + " ");

        if (n == initialN) {
            // Eğer sayı başlangıçtaki değere eşitse, işlemi durdur.
            return;
        } else {
            // 5 ekle ve işlemi tekrarla.
            recursiveEkle(n + 5, initialN);
        }
    }
}
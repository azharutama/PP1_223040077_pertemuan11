
import java.io.IOException;
import java.util.Scanner;

public class postfixApp {

  // Kelas untuk menguji parsing ekspresi postfix
  public static void main(String[] args) {
    String input;
    int output;

    while (true) {
      System.out.println("Masukkan postfix: ");
      System.out.println();
      try {
        input = geString(); // Membaca ekspresi postfix dari input pengguna
      } catch (IOException e) {
        System.out.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
        break;
      }
      if (input.equals("")) // Jika input kosong, keluar dari loop
        break;

      parsePost aParser = new parsePost(input); // Membuat objek parsePost dengan ekspresi postfix yang diberikan
      output = aParser.doParse(); // Melakukan parsing dan mendapatkan hasil operasi
      System.out.println("Hasil operasi: " + output); // Menampilkan hasil operasi
    }
  }
  
  // Metode untuk membaca string dari input pengguna
  public static String geString() throws IOException {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    return s;
  }
}

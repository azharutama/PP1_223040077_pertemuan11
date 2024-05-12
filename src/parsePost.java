public class parsePost {

  // Kelas untuk mem-parsing ekspresi postfix

  private myStack stack; // Stack untuk menyimpan nilai-nilai sementara
  private String input; // Ekspresi postfix yang akan diparsing

  // Konstruktor untuk menginisialisasi objek parsePost dengan ekspresi postfix yang diberikan
  public parsePost(String input) {
    super();
    this.input = input;
  }

  // Metode untuk melakukan parsing pada ekspresi postfix dan mengembalikan hasilnya
  public int doParse() {
    stack = new myStack(20); // Membuat stack baru dengan kapasitas 20
    char ch;
    int i;
    int bil1, bil2, hasilOps;

    // Melakukan iterasi untuk setiap karakter dalam ekspresi postfix
    for (i = 0; i < input.length(); i++) {

      ch = input.charAt(i); // Mengambil karakter saat ini
      stack.displayStack("" + ch + " "); // Menampilkan isi stack sementara

      // Jika karakter adalah digit (0-9), maka push ke stack
      if (ch >= '0' && ch <= '9') {
        stack.push((int) (ch - '0'));
      } else {
        // Jika bukan digit, maka karakter adalah operator
        bil2 = stack.pop(); // Mengambil operand kedua dari stack
        bil1 = stack.pop(); // Mengambil operand pertama dari stack
        switch (ch) {
          case '+':
            hasilOps = bil1 + bil2; // Melakukan penjumlahan
            break;
          case '-':
            hasilOps = bil1 - bil2; // Melakukan pengurangan
            break;
          case '*':
            hasilOps = bil1 * bil2; // Melakukan perkalian
            break;
          case '/':
            hasilOps = bil1 / bil2; // Melakukan pembagian
            break;
          default:
            hasilOps = 0;
            break;
        }
        stack.push(hasilOps); // Menyimpan hasil operasi ke dalam stack
      }
    }
    hasilOps = stack.pop(); // Mengambil hasil akhir dari stack
    return hasilOps; // Mengembalikan hasil operasi
  }

}

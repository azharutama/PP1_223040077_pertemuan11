public class myStack extends abstractStack {

  // Konstruktor untuk menginisialisasi tumpukan dengan kapasitas tertentu.
  public myStack(int kapasitas) {
    super(kapasitas);
  }

  // Metode untuk menampilkan elemen-elemen tumpukan beserta pesan tertentu.
  public void displayStack(String pesan) {
    System.out.println("stack (bottom-->) : ");
    System.out.println(pesan);
    for (int i = 0; i < size(); i++) {
      System.out.println(peekN(i)); // Menampilkan elemen pada indeks i
      System.out.println(' '); // Menampilkan spasi setelah elemen
    }
    System.out.println(""); // Mencetak baris kosong setelah menampilkan semua elemen
  }

  // Metode untuk melihat elemen pada indeks n dalam tumpukan.
  public int peekN(int n) {
    return arr[n]; // Mengembalikan elemen pada indeks n
  }

}

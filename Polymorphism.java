public class Polymorphism{ //class yang di pakai adalah Polymorphism untuk menggabungkan file CetakDataTipe.java.
	
	public static void main(String[] args){ // untuk menjalankan program java.
		CetakDataTipe data = new CetakDataTipe(); // Class CetakDataTipe dan Objectnya.
		
		System.out.print("Cetak Data Tipe String  :"); // untuk menampilkan hasil pertanyaan tipe string.
		data.CetakData("Jawa Barat"); // untuk menghubungkan hasil pengeluaran dari file CetakDataTipe.java, System.out.println(Cetak); tipe string.
		
		System.out.print("Cetak Data Tipe Integer :"); // untuk menampilkan hasil pertanyaan tipe integer.
		data.CetakData(1998); // untuk menghubungkan hasil pengeluaran dari file CetakDataTipe.java System.out.println(Cetak); tipe integer.
		
	}
}
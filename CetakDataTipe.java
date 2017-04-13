class CetakDataTipe { //class yang di pakai adalah CetakDataTipe
	
	//membuat method dengan nama sama tapi beda tipe datanya.
	
	public void CetakData(String Cetak){ // method dengan tipe data String
		System.out.println(Cetak); // untuk menampilkan hasil dari Polymorphism data.CetakData "Jawa Barat"
	}
	
	public void CetakData(int Cetak){ // method dengan tipe data Integer
		System.out.println(Cetak); // untuk menampilkan hasil dari Polymorphism data.CetakData yang bertipe integer "1998"
	}
	
}
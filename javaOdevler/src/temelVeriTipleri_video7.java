
public class temelVeriTipleri_video7 {

	public static void main(String[] args) {
		//integer - tam sayıları tutar
		int sayi = 12;
		//tam sayı sınırının dışına çıktığımız için hata verir.
		sayi = 131111111;
		System.out.println(sayi);
		
		//ondalıklı sayılar için float ve double kullanılır
		double sayi2 = 13.8;
		System.out.println(sayi2);
		
		//tek karakter tutan (a , b, c vs) veri tipi = char ()
		char karakter = 'A';
		char karakter2 = 'B';
		System.out.println(karakter);
		
		//boolean - dopru veya yanlış sonucu veren mantıksal veri türüdür
		boolean dogruMu = true;
		 
		if(dogruMu == true)
		{
			System.out.println("Doğru");
		}
	}

}

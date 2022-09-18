public class degiskenler_video6 {
	public static void main(String[] args) {
		//reusability => tekrar tekrar kullanılabilirlik. Bir kere yaz her yerde kullan!
		//case sensitive => java büyük küçük harf duyarlıdır!
		
		//birden fazla kelimeli değişken tanımlar iken camelCase kullanılır.
		//camelCase => (ilk kelimenin ilk harfi küçük, ikinci kelimesinin ilk harfi büyük)
		
		//integer => int => tam sayı türünde
		int ogrenciSayisi = 12;
		
		///String => metinsel ifade
		String mesaj = "Öğrenci Sayısı : ";
		
		//+ parametresi ile ifadeleri birleştirdik. metinsel ifade ile değişkenin değerini yan yana ekledik.
		System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
		//+ parametresi ile ifadeleri birleştirdik. değişkenin değeri ile değişkenin değerini yan yana ekledik.
		System.out.println(mesaj + ogrenciSayisi);
		
		System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
		System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
	}

}

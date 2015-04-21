package laporan_1;
import java.util.Scanner;

public class biodata {
	
	public static void main(String[] args){
		
		hitung obj= new hitung();
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Nama : Muhammad Fadhli");
		System.out.println(" TTL  : Ujung Pandang, 28 january 1994");
		System.out.println(" Nim  : 60200112024");
		
		System.out.print("Masukkan nilai a :");
		int a= Integer.parseInt(s.nextLine());
		System.out.print("Masukkan nilai b :");
		int b= Integer.parseInt(s.nextLine());
		
		System.out.println("a + b ="+obj.tambah(a, b));
		System.out.println("a - b ="+obj.kurang(a, b));
		System.out.println("a x b ="+obj.kali(a, b));
		System.out.println("a : b ="+obj.bagi(a, b));
		
	}
	
	
	

}

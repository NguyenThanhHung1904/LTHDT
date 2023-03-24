package bai08;

import java.util.Scanner;

public class TestCD {
	
	public static CD nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin cho CD:");
		System.out.println("Ma CD:");
		int ma = sc.nextInt();
		sc.nextLine();
		System.out.println("Tua CD");
		String tua = sc.nextLine();
		System.out.println(" So bai hat:");
		int soBH = sc.nextInt();
		System.out.println("Nhap gia thanh:");
		double gt =sc.nextDouble();
		CD cdr = new CD(ma , tua, soBH, gt);
		return cdr;
	}
	public static void inTD() {
		for (int i=0; i<50; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s\n", "Ma CD", "Tua CD", "So Bai Hat", "Gia Thanh");
		for(int i=0; i< 50; i++) {
			System.out.printf("-");
		}
		System.out.println();
	
}
public static void main( String[] args) {
	int n=5;
	DanhSachCD ls = new DanhSachCD(n);
	
	CD cd1 = new CD(123, "mua xuan",15,12000);
	CD cd2 = new CD(456, "mua ha",16,14000);
	CD cd3 = new CD(789, "mua thu",20,10000);
	 ls.themCD(cd1);
	 ls.themCD(cd2);
	 ls.themCD(cd3);
	 for (int i=0; i<2;i++) {
		 ls.themCD(nhap());
	 }
	 inTD();
	 System.out.println("Ket qua:");
	 ls.inKQ();
	 System.out.println("Sap xep:");
	 ls.sapXepTenCD();
	 ls.inKQ();
	}
}
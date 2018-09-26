package com.silalahi.valentinus.doku.parkir;

public class DemoParkirAdmin {
	public static void main(String[] args) {

		Mobil bmw = new Mobil("Z4", "merahMarun", 4, "Matik", false, "---", "--", "-");
		Motor honda70an = new Motor("CB", "HitamPekat", 2, null, true, "---", "--", "-");
		Bus marsedes = new Bus("8X4-TURBO", "MerahMuda", 12, "Manual", 4, "---", "--", "-");
		Mobil hyundai = new Mobil("i30", "Putih Ambulance", 4, "Auto", true, "---", "--", "-");

		Parkiran p = new Parkiran();

		p.addKendaraan(bmw);
		p.addKendaraan(hyundai);
		p.addKendaraan(marsedes);
		p.addKendaraan(honda70an);

		p.detailKendaraanYangParkir();

		System.out.println(" Nomor Parkir kendaraan: " + p.jmlKendaraanParkir());

		System.out.println("Nomor Parkir gedung : " + p.jmlParkiranKosong());

		System.out.println("====================\n");
		System.out.println("List semua parkiran: ");
		p.detailKendaraanYangParkir();

	}
}

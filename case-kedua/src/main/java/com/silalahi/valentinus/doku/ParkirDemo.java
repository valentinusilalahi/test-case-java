package com.silalahi.valentinus.doku;

public class ParkirDemo {
	public static void main(String[] xxx) {

		LotParkir lp = new Bus();
		JenisKendaraan jk = new JenisKendaraan();
		jk.areaParkir(lp);

		LotParkir lp1 = new Mobil();
		JenisKendaraan jk1 = new JenisKendaraan();
		jk1.areaParkir(lp1);

		LotParkir lp2 = new Motor();
		JenisKendaraan jk2 = new JenisKendaraan();
		jk2.areaParkir(lp2);
	}
}

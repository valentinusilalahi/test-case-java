package com.silalahi.valentinus.doku.parkir;

import java.util.ArrayList;

public class Parkiran {
	private static final int KAPASITAS_MAX = 3;
	private ArrayList<Kendaraan> parkirMobilArray;

	public Parkiran() {
		this.parkirMobilArray = new ArrayList<Kendaraan>(KAPASITAS_MAX);
	}

	public static int getMaxCapacity() {
		return KAPASITAS_MAX;
	}

	public int jmlParkiranKosong() {
		return this.KAPASITAS_MAX - this.parkirMobilArray.size();
	}

	public int jmlKendaraanParkir() {
		return this.parkirMobilArray.size();
	}

	public void addKendaraan(Kendaraan kendaraan) {

		if (this.jmlParkiranKosong() > 0) {
			this.parkirMobilArray.add(kendaraan);
			kendaraan.detailKendaraan();
			kendaraan.parkirDiperbolehkan();
			System.out.println("++++++++++++ \n");
		} else {
			System.out.println("Parkiran full coyyy....");
		}
	}

	public void detailKendaraanYangParkir() {

		for (Kendaraan k : this.parkirMobilArray) {
			k.detailKendaraan();
			k.parkirDiperbolehkan();
			System.out.println("++++++++++++++++ \n");

		}

	}
}

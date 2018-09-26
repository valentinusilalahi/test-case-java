package com.silalahi.valentinus.doku.parkir;

public class Mobil extends Kendaraan {

	private boolean atap;

	public Mobil() {
		super();
	}

	public Mobil(String merek, String warna, int platNo, String transmisi, Boolean atap, String motor, String mobil,
			String bus) {
		super(merek, warna, platNo, transmisi, bus, mobil, motor);
		this.atap = atap;
	}

	public boolean getAtap() {
		return atap;
	}

	public void setAtap(boolean atap) {
		this.atap = atap;
	}

	public void detailMobil() {
		super.detailKendaraan();
		System.out.println(" apakah mobil pakai atap? " + this.atap);
	}

}

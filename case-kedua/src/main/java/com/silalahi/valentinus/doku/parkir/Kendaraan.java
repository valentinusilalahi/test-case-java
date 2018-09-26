package com.silalahi.valentinus.doku.parkir;

public class Kendaraan {
	private String merek;
	private String warna;
	private int platNo;
	private String transmisi;

	private String motor;
	private String mobil;
	private String bus;

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public String getBus() {
		return bus;
	}

	public void setBus(String bus) {
		this.bus = bus;
	}

	public Kendaraan(String merek, String warna, int platNo, String transmisi, String bus, String mobil, String motor) {
		super();
		this.merek = merek;
		this.warna = warna;
		this.platNo = platNo;
		this.transmisi = transmisi;

		this.bus = bus;
		this.mobil = mobil;
		this.motor = motor;
	}

	public Kendaraan() {
		// TODO Auto-generated constructor stub
	}

	public String getMerek() {
		return merek;
	}

	public void setMerek(String merek) {
		this.merek = merek;
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public int getPlatNo() {
		return platNo;
	}

	public void setPlatNo(int platNo) {
		this.platNo = platNo;
	}

	public String getTransmisi() {
		return transmisi;
	}

	public void setTransmisi(String transmisi) {
		this.transmisi = transmisi;
	}

	public void detailKendaraan() {
		System.out.println("Warna Kendaraan adalah " + this.warna);
		System.out.println("Merek Kendaraan adalah" + this.merek);
		System.out.println("transmisi kendaraan adalah " + this.transmisi);
		System.out.println("plat no kendaraan adalah" + this.platNo);
	}

	public void parkirDiperbolehkan() {
		System.out.println("area parkir " + this.mobil);
		System.out.println("area parkir" + this.motor);
		System.out.println("area parkir " + this.bus);
	}

}

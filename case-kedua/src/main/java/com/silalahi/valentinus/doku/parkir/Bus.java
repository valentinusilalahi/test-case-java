package com.silalahi.valentinus.doku.parkir;

public class Bus extends Kendaraan {

	private int jmlKontener;

	public Bus() {
		super();
	}

	public Bus(String merek, String warna, int platNo, String transmisi, int jmlKontener, String motor, String mobil,
			String bus) {
		super(merek, warna, platNo, transmisi, bus, mobil, motor);
		this.jmlKontener = jmlKontener;
	}

	public int getJmlKontener() {
		return jmlKontener;
	}

	public void setJmlKontener(int jmlKontener) {
		this.jmlKontener = jmlKontener;
	}

	public void detailBus() {
		super.detailKendaraan();
		System.out.println(" Jumlah Bus : " + this.jmlKontener);
	}
}

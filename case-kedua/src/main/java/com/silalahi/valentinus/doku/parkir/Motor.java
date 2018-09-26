package com.silalahi.valentinus.doku.parkir;

public class Motor extends Kendaraan {

	private boolean denda;

	public Motor() {
		super();
	}

	public boolean isDenda() {
		return denda;
	}

	public void setDenda(boolean denda) {
		this.denda = denda;
	}

	public Motor(String merek, String warna, int platNo, String transmisi, boolean denda, String motor, String mobil,
			String bus) {
		super(merek, warna, platNo, "na", motor, mobil, bus);
		this.denda = denda;
		// TODO Auto-generated constructor stub
	}

	public void detailMotor() {
		super.detailKendaraan();
		System.out.println("Apakah motor ini denda? " + this.denda);
	}

}

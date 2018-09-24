package com.silalahi.valentinus.doku;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Diskon implements DiskonServis {
	private float ammount;
	private String kodePromo;
	private String diskon;

	public Diskon(float ammount, String kodePromo) {
		this.ammount = ammount;
		this.kodePromo = kodePromo;

		switch (kodePromo) {
		case "New Year":
			this.diskon = "5%";
			break;

		case "Lebaran":
			this.diskon = "10%";
			break;

		case "Harbolnas":
			this.diskon = "20%";
			break;

		default:
			this.diskon = "0%";
		}
	}

	public float hitungDiskon(float ammount, String kodePromo) {
		// TODO Auto-generated method stub
		float finalAmmount = 0;
		switch (kodePromo) {
		case "New Year":
			finalAmmount = (float) (ammount * 5) / 100;
			break;

		case "Lebaran":
			finalAmmount = (float) (ammount * 10) / 100;
			break;

		case "Harbolnas":
			finalAmmount = (float) (ammount * 20) / 100;
			break;
		default:
			finalAmmount = ammount;
		}
		return finalAmmount;
	}

	public String toString() {
		float total = this.ammount - hitungDiskon(this.ammount, this.kodePromo);
		return "Discount: " + this.diskon + "\n" + "Ammount yang harus dibayar: " + total;
	}

}

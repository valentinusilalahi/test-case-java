package com.silalahi.valentinus.doku;

public class JenisKendaraan {
	public void areaParkir(LotParkir lp) {
		if (lp instanceof Bus) {
			Bus bus = (Bus) lp;
			bus.lotParkirBus();
		}

		if (lp instanceof Mobil) {
			Mobil mobil = (Mobil) lp;
			mobil.lotParkirMobil();
		}

		if (lp instanceof Motor) {
			Motor motor = (Motor) lp;
			motor.lotParkirMotor();
		}
	}
}

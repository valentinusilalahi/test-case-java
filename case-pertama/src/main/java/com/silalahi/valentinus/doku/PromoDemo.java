package com.silalahi.valentinus.doku;

import java.util.Scanner;

public class PromoDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ammount : Rp. ");
		float ammount = scan.nextFloat();
		System.out.print("Kode Promo : ");
		String kodePromo = scan.next();
		Diskon diskon = new Diskon(ammount, kodePromo);

		System.out.println(diskon.toString());

	}
}

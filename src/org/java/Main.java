package org.java;

import org.java.abs.Animale;
import org.java.inter.INuotante;
import org.java.inter.IVolante;
import org.java.obj.Aquila;
import org.java.obj.Cane;
import org.java.obj.Delfino;
import org.java.obj.Passerotto;

public class Main {

	public static void main(String[] args) {
		
		Cane c1 = new Cane();
		Passerotto p1 = new Passerotto();
		Aquila a1 = new Aquila();
		Delfino d1 = new Delfino();
		
		System.out.println("Cane:");
		c1.dormi();
		c1.verso();
		c1.mangia();
		System.out.println("------------\n");
		
		System.out.println("Passerotto:");
		p1.dormi();
		p1.verso();
		p1.mangia();
		System.out.println("------------\n");
		
		System.out.println("Aquila:");
		a1.dormi();
		a1.verso();
		a1.mangia();
		System.out.println("------------\n");
		
		System.out.println("Delfino:");
		d1.dormi();
		d1.verso();
		d1.mangia();
		System.out.println("------------\n");
		
		System.out.println("------------\n");
		System.out.println("Array:");
		Animale[] animali = { c1, p1, a1, d1 };
		for (int x=0;x<animali.length;x++) {
			
			Animale a = animali[x];
			System.out.println(a.getClass().getSimpleName() + ":");
			a.dormi();
			a.verso();
			a.mangia();
			System.out.println("------------\n");
		}
		
		System.out.println("------------\n");
		System.out.println("Array volante:");
		IVolante[] volanti = { p1, a1 };
		for (int x=0;x<volanti.length;x++) {
			
			IVolante iv = volanti[x];
			System.out.println(iv.getClass().getSimpleName() + ":");
			iv.vola();
			System.out.println("------------\n");
		}
		
		System.out.println("------------\n");
		System.out.println("Array nuotante:");
		INuotante[] nuotanti = { c1, d1 };
		for (int x=0;x<nuotanti.length;x++) {
			
			INuotante in = nuotanti[x];
			System.out.println(in.getClass().getSimpleName() + ":");
			in.nuota();
			System.out.println("------------\n");
		}
		
		AnimaleManager am = new AnimaleManager();
		am.faiNuotare(d1);
		am.faiNuotare(c1);
		
		am.faiVolare(a1);
		am.faiVolare(p1);
	}
}

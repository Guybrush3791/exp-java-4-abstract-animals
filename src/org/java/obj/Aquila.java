package org.java.obj;

import org.java.abs.Animale;
import org.java.inter.IVolante;

public class Aquila 
	extends Animale 
	implements IVolante {

	@Override
	public void verso() {
		
		System.out.println("Ciop");
	}

	@Override
	public void mangia() {

		System.out.println("Carcasse");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando forte forte!!!");
	}
}

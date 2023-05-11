package org.java.obj;

import org.java.abs.Animale;
import org.java.inter.IVolante;

public class Passerotto 
	extends Animale 
	implements IVolante {

	@Override
	public void verso() {
		
		System.out.println("Cip");
	}

	@Override
	public void mangia() {

		System.out.println("Vermi, pane, semi...");
	}

	@Override
	public void vola() {
		
		System.out.println("Sto volando piano piano!!!");
	}

	
}

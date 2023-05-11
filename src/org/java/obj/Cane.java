package org.java.obj;

import org.java.abs.Animale;
import org.java.inter.INuotante;

public class Cane 
	extends Animale
	implements INuotante {

	@Override
	public void verso() {
		
		System.out.println("Bau");
	}

	@Override
	public void mangia() {
		
		System.out.println("Everything");
	}

	@Override
	public void nuota() {
		
		System.out.println("Sto nuotando piano piano!!!");
	}
}

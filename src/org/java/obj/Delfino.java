package org.java.obj;

import org.java.abs.Animale;
import org.java.inter.INuotante;

public class Delfino 
	extends Animale
	implements INuotante {

	@Override
	public void verso() {
		
		System.out.println("Eeeeeee");
	}

	@Override
	public void mangia() {
		
		System.out.println("Pesce");
	}

	@Override
	public void nuota() {
		
		System.out.println("Sto nuotando forte forte!!!");
	}
}

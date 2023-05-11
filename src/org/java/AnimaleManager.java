package org.java;

import org.java.inter.INuotante;
import org.java.inter.IVolante;

public class AnimaleManager {

	void faiVolare(IVolante iVolante) {

		iVolante.vola();
	}
	void faiNuotare(INuotante iNuotante) {
		
		iNuotante.nuota();
	}
}

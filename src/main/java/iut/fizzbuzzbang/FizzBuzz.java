package iut.fizzbuzzbang;

import java.util.Arrays;
import java.util.List;

import iut.rules.Regle;
import iut.rules.RegleBuzz;
import iut.rules.RegleFizz;
import iut.rules.RegleFizzBuzz;


public class FizzBuzz {

	List<Regle> regles = Arrays.asList(
								new RegleFizzBuzz(),
								new RegleFizz(),
								new RegleBuzz());
	
	
	public String donnerLaReponsePour(Integer nombre) {
		
		for(Regle regle : regles) {
			if(regle.estVerifieePar(nombre)) {
				return regle.valeurAfficheeSiRegleVerifiee();
			}
		}

		return String.valueOf(nombre);
	}
} 
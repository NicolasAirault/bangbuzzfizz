package iut.fizzbuzzbang;

import java.util.List;

import iut.factory.RulesFactory;
import iut.rules.Regle;

public class FizzBuzz {

	List<Regle> regles = RulesFactory.build();



	public String donnerLaReponsePour(Integer nombre) {

		for (Regle regle : regles) {
			if (regle.estVerifieePar(nombre)) {
				return regle.valeurAfficheeSiRegleVerifiee();
			}
		}

		return String.valueOf(nombre);
	}
}
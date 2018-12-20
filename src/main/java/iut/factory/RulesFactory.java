package iut.factory;

import java.util.Arrays;
import java.util.List;

import iut.rules.Regle;
import iut.rules.RegleBuzz;
import iut.rules.RegleFizz;
import iut.rules.RegleFizzBuzz;

public class RulesFactory {

	public static List<Regle> build() {
		return Arrays.asList(new RegleFizzBuzz(), new RegleFizz(), new RegleBuzz());
	}
}

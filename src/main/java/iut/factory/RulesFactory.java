package iut.factory;

import java.util.Arrays;
import java.util.List;

import iut.rules.Regle;
import iut.rules.RegleBang;
import iut.rules.RegleBuzz;
import iut.rules.RegleBuzzBang;
import iut.rules.RegleFizz;
import iut.rules.RegleFizzBang;
import iut.rules.RegleFizzBuzz;
import iut.rules.RegleFizzBuzzBang;

public class RulesFactory {

	public static List<Regle> build() {
		return Arrays.asList(new RegleFizzBuzzBang(), new RegleFizzBuzz(),new RegleFizzBang(), new RegleBuzzBang(), new RegleFizz(), new RegleBuzz(), new RegleBang() );
	}
}

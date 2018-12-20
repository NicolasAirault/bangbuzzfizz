package iut.rules;

public class RegleFizzBang implements Regle{

	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3*7);
	}

	@Override
	public String valeurAfficheeSiRegleVerifiee() {
		return "fizzbang";
	}

}

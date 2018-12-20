package iut.rules;

public class RegleFizzBuzzBang implements Regle{

	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3*5*7);
	}

	@Override
	public String valeurAfficheeSiRegleVerifiee() {
		return "fizzbuzzbang";
	}

}

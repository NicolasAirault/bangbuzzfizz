package iut.rules;

public class RegleBuzzBang implements Regle{

	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (5*7);
	}

	@Override
	public String valeurAfficheeSiRegleVerifiee() {
		return "buzzbang";
	}

}

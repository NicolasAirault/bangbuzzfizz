package iut.rules;

public class RegleBang implements Regle{

	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 7;
	}

	@Override
	public String valeurAfficheeSiRegleVerifiee() {
		return "bang";
	}

}

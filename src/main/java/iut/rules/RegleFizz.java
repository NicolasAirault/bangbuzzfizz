package iut.rules;

public class RegleFizz implements Regle {
	

	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 3;
	}
	
	@Override
	public String valeurAfficheeSiRegleVerifiee() {
		return "fizz";
	}
}

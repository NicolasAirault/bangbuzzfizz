package iut.rules;

public class RegleBuzz implements Regle{
	
	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 5;
	}
	
	@Override
	public String valeurAfficheeSiRegleVerifiee() {
		return "buzz";
	}
}

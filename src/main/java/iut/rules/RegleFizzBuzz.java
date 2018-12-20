package iut.rules;

public class RegleFizzBuzz implements Regle {
	
	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}
	
	@Override
	public String valeurAfficheeSiRegleVerifiee() {
		return "fizzbuzz";
	}
}

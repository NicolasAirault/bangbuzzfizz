package iut.fizzbuzzbang;


public class FizzBuzz {
	
	private FizzBuzzParts fizz;
	private FizzBuzzParts buzz;
	private String res;
	
	public String donnerLaReponsePour(int nombre) {
		
		fizz = new Fizz();
		buzz = new Buzz();
		res = "";
		
		if (fizz.isWhat(nombre)) {
			res += fizz.mot();
		}
		
		if (buzz.isWhat(nombre)) {
			res += buzz.mot();
		}
		
		return res;
	}
}
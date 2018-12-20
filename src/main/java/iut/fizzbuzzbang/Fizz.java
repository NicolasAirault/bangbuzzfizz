package iut.fizzbuzzbang;

public class Fizz extends FizzBuzzParts {

	@Override
	public boolean isWhat(int nb) {
		return 0 == nb % 3;
	}

	@Override
	public String mot() {
		return "fizz";
	}
	
}

package iut.fizzbuzzbang;

public class Buzz extends FizzBuzzParts {

	@Override
	public boolean isWhat(int nb) {
		return 0 == nb % 5;
	}

	@Override
	public String mot() {
		return "buzz";
	}

}

package classcastsample;

class Car{}

class Benz extends Car{}
class McLaren extends Benz{}

public class ClassCastExcept {
	public static void main(String[] args) {
		McLaren obj=(McLaren)new Benz();
	}
}

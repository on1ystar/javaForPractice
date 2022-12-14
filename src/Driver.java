class Animal {
	public String name;

	public void showName() {
		System.out.printf("안녕 나는 %s야. 반가워\n", name);
	}
}

class Penguin extends Animal {
	public String name;
	public String habitat;
	
	public void showName() {
		System.out.printf("안녕 나는 %s 펭귄이야. 반가워\n", name);
	}
}

public class Driver {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal pingu = new Penguin();
		Penguin pororo = new Penguin();

		animal1.name = "동물1";
		pingu.name = "핑구";
		pororo.name = "뽀로로";
		
		animal1.showName();
		pingu.showName();
		pororo.showName();;
	}
}

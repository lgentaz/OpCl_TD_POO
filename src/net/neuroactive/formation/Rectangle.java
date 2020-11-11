package net.neuroactive.formation;

public class Rectangle {
	Integer L;
	Integer H;
	
	Rectangle(Integer length ,Integer height) {
		super();
		L = length;
		H = height;
	}
	
	void print() {
		for (int j = 0; j< H; j++) {
			for (int i = 0; i < L; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

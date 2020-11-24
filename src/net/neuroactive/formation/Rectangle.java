package net.neuroactive.formation;

public class Rectangle implements Comparable<Rectangle>{
	Integer L;
	Integer H;
	Integer A;
	
	Rectangle(Integer length ,Integer height) {
		super();
		L = length;
		H = height;
		A = L * H;
	}
	
	void print() {
		for (int j = 0; j< H; j++) {
			for (int i = 0; i < L; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Override
	public int compareTo(Rectangle r) {
		return this.A.compareTo(r.A);
	}
}

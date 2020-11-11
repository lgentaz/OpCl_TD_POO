package net.neuroactive.formation;

public class HollowRectangle extends Rectangle{

	public HollowRectangle(Integer length ,Integer height) {
		super(length,height);
	}

	@Override
	void print() {
		for (int j = 0; j< H; j++) {
			for (int i = 0; i < L; i++) {
				if (j==0 || j==(H-1) || i==0 || i==(L-1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
}

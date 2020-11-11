package net.neuroactive.formation;

public class Main {

	public static void main(String [] arg) {
		Rectangle[] Rect = {new Rectangle(5, 10), new Square(6), new HollowRectangle(5, 10),new HollowSquare(6)};
		
		for (Rectangle r : Rect) {
			r.print();
			System.out.println();
		}

	}	
}

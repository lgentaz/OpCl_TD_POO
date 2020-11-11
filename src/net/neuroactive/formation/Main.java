package net.neuroactive.formation;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String [] arg) {
		List<Rectangle> rect = new ArrayList<Rectangle>();
		rect.add(new Rectangle(5, 10));
		rect.add(new Square(6));
		rect.add(new HollowRectangle(5, 10));
		rect.add(new HollowSquare(6));
		
		for (Rectangle r : rect) {
			r.print();
			System.out.println();
		}

	}	
}

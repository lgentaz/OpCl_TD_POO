package net.neuroactive.formation;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String [] arg) {
		List<Rectangle> rect = new ArrayList<Rectangle>();
		rect.add(new Rectangle(5, 10));
		rect.add(new Square(7));
		rect.add(new HollowRectangle(4, 12));
		rect.add(new HollowSquare(6));
		
		for (Rectangle r : rect) {
			r.print();
			System.out.println();
		}
		
		Rectangle thirdrect = rect.get(2);
		for (Rectangle r : rect) {
			System.out.println(r.A);
			System.out.println(r.compareTo(thirdrect));
		}
	}	
}

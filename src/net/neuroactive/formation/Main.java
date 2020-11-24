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
			System.out.println("L'aire du rectangle n°" + (rect.indexOf(r) + 1) + " est " + r.A);
			System.out.println("Si on le compare au n°3 :" + r.compareTo(thirdrect));
		}
		
		System.out.println("Le plus grand rectangle est le n°" + (rect.indexOf(max(rect)) + 1));
	}	
	
	static  <R extends Comparable<Rectangle>> Rectangle max(List<Rectangle> l) {
		Rectangle f = l.get(0);
		for (Rectangle n : l) {
			if (f.A.compareTo(n.A)<0) {f=n;}
		}
		return f;
	}
}

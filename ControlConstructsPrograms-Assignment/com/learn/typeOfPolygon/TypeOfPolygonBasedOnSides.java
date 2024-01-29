package com.learn.typeOfPolygon;

public class TypeOfPolygonBasedOnSides {
	public static void typeOfPolygon(int sides)
	{
		switch(sides)
		{
		 case 3 : System.out.println("Triangle");
                  break;
         case 4 : System.out.println("Quadriletral");
                  break;
         case 5 : System.out.println("Pentagon");
                  break;
         case 6 : System.out.println("Hexagon");
                  break;
         case 7 : System.out.println("heptagon");
                  break;
         case 8 : System.out.println("Octagon");
                  break;
         case 9 : System.out.println("Nanogon");
                  break;
        case 10 : System.out.println("Decagon");
                  break;
         default : System.out.println("It is a polygon");
		}
	}

}

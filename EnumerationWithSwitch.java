package enumeration;

enum Restaurants
{
dominos, kfc, pizzahut, subway, burgerking
}

public class EnumerationWithSwitch {

	public static void main(String[] args) {
		
		Restaurants r;
		r = Restaurants.kfc;
		switch(r) { 
		case dominos:
		System.out.println("I AM " + r.dominos);
		break;
		case kfc:
		System.out.println("I AM " + r.kfc);
		break;
		case pizzahut:
		System.out.println("I AM " + r.pizzahut);
		break;
		case subway:
		System.out.println("I AM " + r.subway);
		break;
		case burgerking:
		System.out.println("I AM " + r.burgerking);
		break;

		}
	}

}

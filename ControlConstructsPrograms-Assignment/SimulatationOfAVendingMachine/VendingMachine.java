package SimulatationOfAVendingMachine;

public class VendingMachine {
	public static void productCode(String code)
	{
		switch(code)
		{
		case "p01" : System.out.println("CoCo-Cola");
		break;
		
		case "p02" : System.out.println("Pepsi");
		break;
		
		case "p03" : System.out.println("Maggie");
		break;
		
		default : System.out.println("Invalid code");
		}
	}

}

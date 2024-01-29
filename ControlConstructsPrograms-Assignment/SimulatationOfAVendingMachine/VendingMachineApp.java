package SimulatationOfAVendingMachine;

import java.util.Scanner;

public class VendingMachineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product code");
		String code=sc.next();
		
		VendingMachine vm=new VendingMachine();
		vm.productCode(code);

	}

}

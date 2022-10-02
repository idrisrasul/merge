package MilkDep;

import java.util.Scanner;

import FruitDep.FriutsItems;

public class Milkproduct{
		public int MILK() {
			Scanner sc=new Scanner(System.in);
			int milky=sc.nextInt();
			System.out.println("milk price is :"+milky);
			int milkqty=sc.nextInt();
			System.out.println("milk QTY is :"+milkqty);
			int total_price=milky*milkqty;
			System.out.println("Total milk price :"+total_price);
			System.out.println("Total milk price :"+milky);
			System.out.println("Total milk price :"+milkqty);
			return total_price;
		}
}

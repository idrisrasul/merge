package VegAndBilling ;

import java.util.Scanner;

import FruitDep.FriutsItems;
import MilkDep.Milkproduct;

public class vegtablesItems extends FriutsItems{
		public int veg() {
			Scanner sc=new Scanner(System.in);
			int onian=sc.nextInt();
			System.out.println("onian price is :"+onian);
			int onianqty=sc.nextInt();
			System.out.println("onian QTY is :"+onianqty);
			int total_price=onian*onianqty;
			System.out.println("Total rice price :"+total_price);
			return total_price;
		}
		
	public static void main(String[] args) {
		vegtablesItems bi=new vegtablesItems();
		bi.veg();
		bi.apple();
		bi.MILK();
	}		
}

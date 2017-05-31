package com.imani.dp.flyweight;

import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Soldier soldier1 = new SoldierImp("RED", 15);
		Soldier soldier2 = new SoldierImp("RED", 10);
		Soldier soldier3 = new SoldierImp("RED", 5);

		Soldier soldier4 = new SoldierImp("BLACK", 1);
		Soldier soldier5 = new SoldierImp("BLACK", 2);
		Soldier soldier6 = new SoldierImp("BLACK", 3);

		Soldier soldier7 = new SoldierImp("BLUE", 20);
		Soldier soldier8 = new SoldierImp("BLUE", 20);

		List<Soldier> soldiers = Arrays.asList(soldier1, soldier2, soldier3, soldier4, soldier5, soldier6, soldier7,
				soldier8);

		soldiers.stream().forEach(s -> s.fire());
	}
}

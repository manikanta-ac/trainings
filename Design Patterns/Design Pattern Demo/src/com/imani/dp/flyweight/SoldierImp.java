package com.imani.dp.flyweight;

public class SoldierImp implements Soldier {
	private SoldierType soldierType;
	private int energy;

	public SoldierImp(String soldierType, int energy) {
		this.soldierType = SoldierTypeFactory.getSoldierType(soldierType);
		this.energy = energy;
	}

	@Override
	public void fire() {
		System.out.println(soldierType.getType() + " soldier Fired!!!");
		energy--;
		System.out.println("Energy Remaining:" + energy);
	}

}

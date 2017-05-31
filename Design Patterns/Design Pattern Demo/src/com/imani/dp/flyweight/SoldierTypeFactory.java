package com.imani.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class SoldierTypeFactory {
	private static List<SoldierType> soldierTypePool;

	public static SoldierType getSoldierType(String type) {
		if (soldierTypePool == null || soldierTypePool.isEmpty()) {
			soldierTypePool = new ArrayList<>();
		}
		SoldierType soldierType = soldierTypePool.stream().filter(s -> s.getType().equals(type)).findFirst().orElse(null);
		if (soldierType == null) {
			soldierType = new SoldierType(type);
			soldierTypePool.add(soldierType);
		}
		return soldierType;
	}
}

package com.imani.dp.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class ABCHiringFactory extends HiringFactory {

	@Override
	public Employee employeeFactoryMethod(String empType) {
		if (empType.equalsIgnoreCase("Manager")) {
			return new Manager(true, "Mohan");
		} else if (empType.equalsIgnoreCase("Developer")) {
			List<String> programmingLangs = new ArrayList<>();
			programmingLangs.add("Java");
			return new Developer(programmingLangs, "Devendra");
		} else if (empType.equalsIgnoreCase("Tester")) {
			return new Tester("mannual", "Tarun");
		} else if (empType.equalsIgnoreCase("HR")) {
			return new HR(true, "Hari");
		} else {
			return null;
		}
	}
}

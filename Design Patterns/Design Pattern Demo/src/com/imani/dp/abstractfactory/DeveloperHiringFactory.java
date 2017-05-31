package com.imani.dp.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class DeveloperHiringFactory implements HiringFactory {

	@Override
	public Employee hireEmployee() {
		List<String> programmingLangs = new ArrayList<>();
		programmingLangs.add("Java");
		Employee employee = new Developer(programmingLangs, "Devendra");
		System.out.println("Hiring Agency: " + employee.getName()
				+ "(Developer) is being hired!!!");
		return employee;
	}

	@Override
	public Training trainEmployee() {
		Training training = new DeveloperTraining();
		training.train();
		return training;
	}

}

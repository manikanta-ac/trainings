package com.imani.dp.abstractfactory;

public class TesterHiringFactory implements HiringFactory {

	@Override
	public Employee hireEmployee() {
		Employee employee = new Tester("Automation", "Tarun");
		System.out.println("Hiring Agency: " + employee.getName()
				+ "(Tester) is being hired!!!");
		return employee;
	}

	@Override
	public Training trainEmployee() {
		Training training = new TesterTraining();
		training.train();
		return training;
	}
}

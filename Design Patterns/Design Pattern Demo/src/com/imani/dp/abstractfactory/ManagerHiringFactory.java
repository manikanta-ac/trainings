package com.imani.dp.abstractfactory;

public class ManagerHiringFactory implements HiringFactory {

	@Override
	public Employee hireEmployee() {
		Employee employee = new Manager(true, "Mohan");
		System.out.println("Hiring Agency: " + employee.getName()
				+ "(Manager) is being hired!!!");
		return employee;
	}

	@Override
	public Training trainEmployee() {
		Training training = new ManagerTraining();
		training.train();
		return training;
	}

}

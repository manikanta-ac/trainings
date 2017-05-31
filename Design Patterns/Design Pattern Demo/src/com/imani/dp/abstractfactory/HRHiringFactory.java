package com.imani.dp.abstractfactory;


public class HRHiringFactory implements HiringFactory {

	@Override
	public Employee hireEmployee() {
		Employee employee = new HR(true, "Hari");
		System.out.println("Hiring Agency: " + employee.getName()
				+ "(HR) is being hired!!!");
		return employee;
	}

	@Override
	public Training trainEmployee() {
		Training training = new HRTraining();
		training.train();
		return training;
	}

}

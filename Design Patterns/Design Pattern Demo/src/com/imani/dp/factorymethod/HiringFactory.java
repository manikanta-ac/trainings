package com.imani.dp.factorymethod;

public abstract class HiringFactory {

	public Employee hireEmployee(String empType) {
		Employee employee = employeeFactoryMethod(empType);
		System.out.println("Hiring Agency: " + employee.getName() + "(" + empType
				+ ") is being hired!!!");
		return employee;
	}

	public abstract Employee employeeFactoryMethod(String empType);
}

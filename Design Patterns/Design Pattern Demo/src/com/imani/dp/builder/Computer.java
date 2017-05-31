package com.imani.dp.builder;

public class Computer {

	// required parameters
	private String hardDsik;
	private String ram;

	// optional parameters
	private String speakers;
	private String bluetooth;

	public String getHardDsik() {
		return hardDsik;
	}

	public void setHardDsik(String hardDsik) {
		this.hardDsik = hardDsik;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	private Computer(ComputerBuilder builder) {
		this.hardDsik = builder.hardDsik;
		this.ram = builder.ram;
		this.speakers = builder.speakers;
		this.bluetooth = builder.bluetooth;
	}

	// Builder Class
	public static class ComputerBuilder {

		// required parameters
		private String hardDsik;
		private String ram;

		// optional parameters
		private String speakers;
		private String bluetooth;

		public ComputerBuilder(String hardDsik, String ram) {
			this.hardDsik = hardDsik;
			this.ram = ram;
		}

		public ComputerBuilder withSpeakers(String speakers) {
			this.speakers = speakers;
			return this;
		}

		public ComputerBuilder withBluetooth(String bluetooth) {
			this.bluetooth = bluetooth;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
}
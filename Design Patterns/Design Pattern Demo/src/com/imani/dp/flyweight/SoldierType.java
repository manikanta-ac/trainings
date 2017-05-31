package com.imani.dp.flyweight;

public class SoldierType {
	private String type;
	private String uniformColor;
	private String headSoldier;
	
	public SoldierType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUniformColor() {
		return uniformColor;
	}
	public void setUniformColor(String uniformColor) {
		this.uniformColor = uniformColor;
	}
	public String getHeadSoldier() {
		return headSoldier;
	}
	public void setHeadSoldier(String headSoldier) {
		this.headSoldier = headSoldier;
	}
}

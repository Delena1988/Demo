package com.linjian.coretechnology;

public enum Size {
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("L");
	
	private String abbrevation;
	
	private Size(String abbreviation){
		this.abbrevation = abbreviation;
	}
	public String getAbbreviation(){
		return abbrevation;
	}
	
	public static void main(String[] args) {
		Size s = Enum.valueOf(Size.class, "SMALL");
		System.out.println(s);
		
		Size[] values = Size.values();
		System.out.println(values.length);
	}
	
}

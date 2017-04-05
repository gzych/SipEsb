package com.gzych.sipesb.common.enums;

public enum TypAdresSkrytki {

	ADRESAT("ADRESAT"),
	ODBIORCA("ODBIORCA");

	private final String name;
	private TypAdresSkrytki(String name) {
		this.name = name;
	}
	public boolean equalsName(String name) {
		return (name == null) ? false : this.name.equals(name);
	}
	public String toString() {
		return this.name;
	}
}

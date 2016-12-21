/* Class536_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class536_Sub8_Sub1 extends Class536_Sub8 {
	Class273 aClass273_11628;
	String aString11629;
	String aString11630;
	int anInt11631;
	Class273 aClass273_11632;

	public abstract boolean method10640(int i);

	public String toString() {
		String string = new StringBuilder().append(aClass273_11628.toString()).append(" ").append(aString11629).toString();
		if (null != aString11630 && !"".equals(aString11630))
			string = new StringBuilder().append(string).append(" : ").append(aString11630).toString();
		return string;
	}

	String method10641(int i) {
		return aString11629;
	}

	public Class273 method10642(byte i) {
		return aClass273_11628;
	}

	public String method10643() {
		String string = new StringBuilder().append(aClass273_11628.toString()).append(" ").append(aString11629).toString();
		if (null != aString11630 && !"".equals(aString11630))
			string = new StringBuilder().append(string).append(" : ").append(aString11630).toString();
		return string;
	}

	public int method10644(int i) {
		if (aClass273_11628 != Class273.aClass273_2893)
			throw new IllegalArgumentException_Sub1(this, aClass273_11628.toString().toLowerCase());
		return -896897157 * anInt11631;
	}

	public abstract boolean method10645(int i);

	public abstract boolean method10646(int i);

	public abstract int method10647(int i);

	public abstract boolean method10648(int i);

	public Class273 method10649(int i) {
		return aClass273_11632;
	}

	public abstract boolean method10650(int i);

	Class536_Sub8_Sub1(Class265 class265) {
		aClass273_11628 = class265.aClass273_2863;
		aString11629 = class265.aString2862;
		aString11630 = class265.aString2860;
		anInt11631 = -976354079 * class265.anInt2861;
		aClass273_11632 = class265.aClass273_2864;
	}

	public String method10651() {
		String string = new StringBuilder().append(aClass273_11628.toString()).append(" ").append(aString11629).toString();
		if (null != aString11630 && !"".equals(aString11630))
			string = new StringBuilder().append(string).append(" : ").append(aString11630).toString();
		return string;
	}

	public String method10652() {
		String string = new StringBuilder().append(aClass273_11628.toString()).append(" ").append(aString11629).toString();
		if (null != aString11630 && !"".equals(aString11630))
			string = new StringBuilder().append(string).append(" : ").append(aString11630).toString();
		return string;
	}

	public abstract int method10653(int i);

	public int method10654() {
		if (aClass273_11628 != Class273.aClass273_2893)
			throw new IllegalArgumentException_Sub1(this, aClass273_11628.toString().toLowerCase());
		return -896897157 * anInt11631;
	}

	public abstract boolean method10655(int i);

	public abstract int method10656(int i);
}

/* Class527_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class527_Sub18_Sub1 extends Class527_Sub18 {
	String aString11618;
	String aString11619;
	Class266 aClass266_11620;
	int anInt11621;
	Class266 aClass266_11622;

	public abstract boolean method18143(int i);

	public abstract boolean method18144(int i);

	public String method18145() {
		String string = new StringBuilder().append(aClass266_11622.toString()).append(" ").append(aString11619).toString();
		if (aString11618 != null && !"".equals(aString11618))
			string = new StringBuilder().append(string).append(" : ").append(aString11618).toString();
		return string;
	}

	public abstract int method18146(int i);

	public Class266 method18147(int i) {
		return aClass266_11622;
	}

	public Class266 method18148() {
		return aClass266_11622;
	}

	public int method18149(int i) {
		if (aClass266_11622 != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(this, aClass266_11622.toString().toLowerCase());
		return -1344328443 * anInt11621;
	}

	public String toString() {
		String string = new StringBuilder().append(aClass266_11622.toString()).append(" ").append(aString11619).toString();
		if (aString11618 != null && !"".equals(aString11618))
			string = new StringBuilder().append(string).append(" : ").append(aString11618).toString();
		return string;
	}

	String method18150(int i) {
		return aString11619;
	}

	String method18151() {
		return aString11619;
	}

	public Class266 method18152() {
		return aClass266_11622;
	}

	public int method18153() {
		if (aClass266_11622 != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(this, aClass266_11622.toString().toLowerCase());
		return -1344328443 * anInt11621;
	}

	public Class266 method18154() {
		return aClass266_11620;
	}

	public Class266 method18155() {
		return aClass266_11620;
	}

	public Class266 method18156(int i) {
		return aClass266_11620;
	}

	public Class266 method18157() {
		return aClass266_11620;
	}

	public abstract int method18158(int i);

	public int method18159() {
		if (aClass266_11622 != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(this, aClass266_11622.toString().toLowerCase());
		return -1344328443 * anInt11621;
	}

	public int method18160() {
		if (aClass266_11622 != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(this, aClass266_11622.toString().toLowerCase());
		return -1344328443 * anInt11621;
	}

	public abstract boolean method18161(int i);

	public Class266 method18162() {
		return aClass266_11622;
	}

	public abstract int method18163(int i);

	public abstract int method18164(int i);

	Class527_Sub18_Sub1(Class275 class275) {
		aClass266_11622 = class275.aClass266_3155;
		aString11619 = class275.aString3149;
		aString11618 = class275.aString3153;
		anInt11621 = class275.anInt3150 * 1922159319;
		aClass266_11620 = class275.aClass266_3152;
	}
}

/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class257 {
	static final String aString2823 = "#";
	static int anInt2824;

	public static final boolean method4739(String string, String string_0_, String string_1_, String string_2_) {
		if (null == string || null == string_1_)
			return false;
		if (string.startsWith("#") || string_1_.startsWith("#"))
			return string.equals(string_1_);
		return string_0_.equals(string_2_);
	}

	public static final boolean method4740(String string, String string_3_, String string_4_, String string_5_) {
		if (null == string || null == string_4_)
			return false;
		if (string.startsWith("#") || string_4_.startsWith("#"))
			return string.equals(string_4_);
		return string_3_.equals(string_5_);
	}

	Class257() throws Throwable {
		throw new Error();
	}
}

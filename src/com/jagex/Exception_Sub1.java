/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub1 extends Exception {
	public int anInt11344;
	public String aString11345;

	Exception_Sub1(int i, String string, Throwable throwable) {
		super(throwable);
		aString11345 = string;
		anInt11344 = i * 1630668169;
	}

	Exception_Sub1(int i, String string) {
		this(i, string, null);
	}
}

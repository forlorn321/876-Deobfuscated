/* Exception_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub4 extends Exception {
	public int anInt11363;
	public String aString11364;

	Exception_Sub4(int i, String string, Throwable throwable) {
		super(throwable);
		aString11364 = string;
		anInt11363 = i * 1970724349;
	}

	Exception_Sub4(int i, String string) {
		this(i, string, null);
	}
}

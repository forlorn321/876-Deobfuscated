/* Exception_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub2 extends Exception {
	public int anInt11350;
	public String aString11351;

	public Exception_Sub2(int i, String string) {
		this(i, string, null);
	}

	public Exception_Sub2(int i, String string, Throwable throwable) {
		super(throwable);
		aString11351 = string;
		anInt11350 = i * -927921639;
	}
}

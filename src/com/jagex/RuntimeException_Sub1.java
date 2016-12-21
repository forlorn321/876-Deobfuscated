/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class RuntimeException_Sub1 extends RuntimeException {
	public static int anInt12035;
	public static String aString12036;
	String aString12037;
	public static int anInt12038;
	static Interface61 anInterface61_12039 = null;
	Throwable aThrowable12040;
	static long aLong12041;

	RuntimeException_Sub1(Throwable throwable, String string) {
		aString12037 = string;
		aThrowable12040 = throwable;
		initCause(throwable);
	}
}

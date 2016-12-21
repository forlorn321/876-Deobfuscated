/* Exception_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub6 extends Exception {
	public int anInt11367;
	public String aString11368;

	public Exception_Sub6(int i, String string, Throwable throwable) {
		super(throwable);
		aString11368 = string;
		anInt11367 = i * 618115167;
	}

	public Exception_Sub6(int i, String string) {
		this(i, string, null);
	}

	static final void method10535(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method10536(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (client.aClass231_11088.method3301(i_0_, (byte) 100).anInt2332 * -1409377821);
	}
}

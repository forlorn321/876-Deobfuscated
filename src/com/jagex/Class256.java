/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class256 {
	public static ClanSettings aClass350_2762;

	Class256() throws Throwable {
		throw new Error();
	}

	static final void method3540(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static void method3541(byte i) {
		int i_0_ = -1;
		if (null != Class542_Sub1.aClass536_Sub18_Sub14_7202)
			i_0_ = (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11765 * -673647059);
		Class465_Sub1.method9387(-931943004);
		for (int i_1_ = 0; i_1_ < 3; i_1_++) {
			for (int i_2_ = 0; i_2_ < 5; i_2_++) {
				Class542_Sub1.aClass184ArrayArray10712[i_1_][i_2_] = null;
				Class542_Sub1.aClass2ArrayArray10723[i_1_][i_2_] = null;
			}
		}
		Class542_Sub1.aClass536_Sub18_Sub14_7202 = null;
		if (-1 != i_0_)
			Class303.method4105(i_0_, -1, -1, false, (byte) -55);
	}
}

/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class174 {
	Class164[] aClass164Array1926;
	int anInt1927;

	public Class174(Class461 class461) {
		anInt1927 = class461.method5566(0, 646256278) * -37539617;
		aClass164Array1926 = new Class164[212634399 * anInt1927];
		for (int i = 0; i < anInt1927 * 212634399; i++) {
			RSByteBuffer class536_sub33 = new RSByteBuffer(class461.method5556(0, i, (byte) 1));
			if (null == class536_sub33.buffer)
				aClass164Array1926[i] = null;
			else {
				try {
					Class164 class164 = new Class164();
					class164.method1970(i, class536_sub33, (short) 23527);
					aClass164Array1926[i] = class164;
				} catch (Exception exception) {
					aClass164Array1926[i] = null;
				}
			}
		}
	}

	public Class164 method2446(int i, int i_0_) {
		return aClass164Array1926[i];
	}

	static final void method2447(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1318197187 * Class23.aClass5_221.anInt111;
	}

	static final void method2448(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub43_10780.method10276(1480325368);
	}

	static final void method2449(Class668 class668, int i) {
		Class184_Sub2.method8668(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)], -624432548);
	}
}

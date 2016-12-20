/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Graphics;

public abstract class Class314 {
	int anInt3505;
	Class292 this$0;
	int anInt3506;
	public static int[] anIntArray3507;

	abstract void method5659(Graphics graphics);

	abstract void method5660(Graphics graphics, int i);

	Class314(Class292 class292, int i, int i_0_) {
		this$0 = class292;
		anInt3506 = -1899653501 * i;
		anInt3505 = i_0_ * 1224645139;
	}

	abstract void method5661(Graphics graphics);

	abstract void method5662(Graphics graphics);

	abstract void method5663(Graphics graphics);

	abstract void method5664(Graphics graphics);

	abstract void method5665(Graphics graphics);

	static final void method5666(Class665 class665, byte i) {
		class665.anObjectArray8524[(class665.anIntArray8545[891367231 * class665.anInt8527])] = (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
	}

	static final void method5667(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class671.aClass97_8584.method1733(i_1_, 1450530562);
	}

	static final void method5668(Class665 class665, byte i) throws Exception_Sub6 {
		class665.anInt8526 -= 204761682;
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		Class442 class442 = Class442.method7166((float) i_2_, (float) i_2_, (float) i_2_);
		Class208_Sub10.aClass296_Sub1_9923.method5357(class442, (byte) 2);
		class442.method7141();
	}

	static final void method5669(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		if (class665.anIntArray8525[class665.anInt8526 * 1769813785] < class665.anIntArray8525[1 + 1769813785 * class665.anInt8526])
			class665.anInt8527 += (-1038991169 * class665.anIntArray8545[class665.anInt8527 * 891367231]);
	}
}

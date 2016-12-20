/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class518 {
	public static int anInt7051;

	Class518() throws Throwable {
		throw new Error();
	}

	static final void method8632(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 32398549 * class243.anInt2523;
	}

	static final void method8633(Class665 class665, short i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -2027534106);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.method17449(class243) ? 1 : 0;
	}

	static final void method8634(Class665 class665, byte i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub14_10593), i_1_, 1541216546);
		client.aClass509_11072.method8361(-428559959);
		Class631.method10465(-1505903012);
		client.aBool11020 = false;
	}

	public static final void method8635(long l) {
		if (l > 0L) {
			if (l % 10L == 0L) {
				Class318.method5687(l - 1L);
				Class318.method5687(1L);
			} else
				Class318.method5687(l);
		}
	}
}

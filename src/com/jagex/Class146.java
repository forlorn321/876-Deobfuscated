/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;

class Class146 implements Comparator {
	Class358_Sub2 this$0;

	Class146(Class358_Sub2 class358_sub2) {
		this$0 = class358_sub2;
	}

	int method2391(Class494 class494, Class494 class494_0_, int i) {
		float f = class494.method8018((byte) 21);
		float f_1_ = class494_0_.method8018((byte) 44);
		if (f_1_ > f)
			return 1;
		if (f_1_ < f)
			return -1;
		return 0;
	}

	public int compare(Object object, Object object_2_) {
		return method2391((Class494) object, (Class494) object_2_, -1269545815);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int method2392(Object object, Object object_3_) {
		return method2391((Class494) object, (Class494) object_3_, -357828068);
	}

	public boolean method2393(Object object) {
		return super.equals(object);
	}

	public int method2394(Object object, Object object_4_) {
		return method2391((Class494) object, (Class494) object_4_, 2110211478);
	}

	public boolean method2395(Object object) {
		return super.equals(object);
	}

	static final void method2396(Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_5_, -1154944509);
		Class240 class240 = Class183.aClass240Array2100[i_5_ >> 16];
		Class648.method10832(class243, class240, class665, -1497370920);
	}

	static final void method2397(Class665 class665, short i) {
		class665.anInt8526 -= 204761682;
		Class245.aClass226_2698.method4273((class665.anIntArray8525[class665.anInt8526 * 1769813785]), 255, (byte) 8);
	}

	static final void method2398(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method2399(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class498.aString5584.startsWith("win") ? 1 : 0;
	}

	static final void method2400(Class665 class665, int i) {
		class665.anInt8530 -= 65273226;
		if (class665.aLongArray8529[class665.anInt8530 * -2076258291] <= class665.aLongArray8529[1 + -2076258291 * class665.anInt8530])
			class665.anInt8527 += (-1038991169 * class665.anIntArray8545[891367231 * class665.anInt8527]);
	}

	static void method2401(byte i) {
		if (Class529_Sub1.anInt10783 * -502443805 < 0) {
			Class529_Sub1.anInt10783 = 0;
			Class529_Sub1.anInt10779 = -1449615877;
			Class529_Sub1.anInt10772 = -1784395681;
		}
		if (Class529_Sub1.anInt10783 * -502443805 > Class529_Sub1.anInt7131) {
			Class529_Sub1.anInt10783 = 2049864907 * Class529_Sub1.anInt7131;
			Class529_Sub1.anInt10779 = -1449615877;
			Class529_Sub1.anInt10772 = -1784395681;
		}
		if (Class635.anInt8302 * 1891819005 < 0) {
			Class635.anInt8302 = 0;
			Class529_Sub1.anInt10779 = -1449615877;
			Class529_Sub1.anInt10772 = -1784395681;
		}
		if (Class635.anInt8302 * 1891819005 > Class529_Sub1.anInt7167) {
			Class635.anInt8302 = Class529_Sub1.anInt7167 * -1224612011;
			Class529_Sub1.anInt10779 = -1449615877;
			Class529_Sub1.anInt10772 = -1784395681;
		}
	}

	static final void method2402(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_6_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_7_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_7_, -1538474000));
		if (class80.method1566(-111611547))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class295) Class381.aClass24_Sub9_3936.method81(i_6_, -367067387)).method5306(i_7_, class80.aString806, 988987490);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (((Class295) Class381.aClass24_Sub9_3936.method81(i_6_, 548008769)).method5331(i_7_, class80.anInt804 * 780718929, (byte) -19));
	}

	static void method2403(Class180 class180, int i, int i_8_, Class243 class243, int i_9_) {
		int i_10_ = 127;
		int i_11_ = 7;
		for (int i_12_ = 63; i_12_ >= 0; i_12_--) {
			int i_13_ = (i_12_ & 0x3f) << 10 | (i_11_ & 0x7) << 7 | i_10_ & 0x7f;
			Class25.method851(false, true, (byte) 3);
			int i_14_ = Class656.anIntArray8393[i_13_];
			Class520.method8664(false, true, -94254998);
			class180.method3348(i, (-1386504031 * class243.anInt2514 * (63 - i_12_) >> 6) + i_8_, -1054537975 * class243.anInt2511, 1 + (-1386504031 * class243.anInt2514 >> 6), ~0xffffff | i_14_, 0);
		}
	}
}

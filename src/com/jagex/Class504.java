/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class504 {
	abstract void method6057();

	abstract long method6058();

	abstract void method6059(int i);

	abstract long method6060(int i);

	abstract int method6061(long l);

	abstract long method6062(byte i);

	abstract long method6063();

	abstract void method6064();

	abstract void method6065();

	abstract void method6066();

	abstract long method6067();

	final int method6068(long l) {
		long l_0_ = method6060(-1489063167);
		if (l_0_ > 0L)
			Class212.method3067(l_0_);
		return method6061(l);
	}

	abstract long method6069();

	abstract long method6070();

	abstract int method6071(long l);

	abstract long method6072();

	abstract long method6073();

	abstract int method6074(long l);

	abstract long method6075();

	Class504() {
		/* empty */
	}

	static void method6076(int i) {
		Class34_Sub22.anIntArray10982 = Class536_Sub22_Sub8.method10695(2048, 35, 8, 8, 4, 0.4F, true, (short) -32276);
	}

	static final void method6077(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class668.method8007(class251, class234, class668, -1067339959);
	}

	static final void method6078(Class668 class668, short i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ItemDecoder) Class111.aClass34_Sub13_1391.method70(i_2_, (byte) -87)).equipSlot) * 432606769;
	}

	static void method6079(IComponentDefinitions class251, Class161 class161, int i, int i_3_, int i_4_, int i_5_, int i_6_, String string, FontRenderer class184, Class2 class2, int i_7_, int i_8_) {
		int i_9_;
		if (2 == 155362615 * Class246.anInt2474)
			i_9_ = ((int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) 3) * 2607.5945876176133) + -2011409073 * client.anInt11096) & 0x3fff;
		else if (155362615 * Class246.anInt2474 == 6)
			i_9_ = (int) client.aFloat11106 & 0x3fff;
		else
			i_9_ = ((int) client.aFloat11106 + -2011409073 * client.anInt11096 & 0x3fff);
		int i_10_ = (Math.max(class251.anInt2573 * -1606950689 / 2, class251.anInt2574 * 223822141 / 2) + 10);
		int i_11_ = i_5_ * i_5_ + i_4_ * i_4_;
		if (i_11_ <= i_10_ * i_10_) {
			int i_12_ = Class447.anIntArray4906[i_9_];
			int i_13_ = Class447.anIntArray4921[i_9_];
			if (155362615 * Class246.anInt2474 != 6) {
				i_12_ = 256 * i_12_ / (1858649483 * client.anInt11098 + 256);
				i_13_ = 256 * i_13_ / (256 + client.anInt11098 * 1858649483);
			}
			int i_14_ = i_12_ * i_5_ + i_4_ * i_13_ >> 14;
			int i_15_ = i_13_ * i_5_ - i_12_ * i_4_ >> 14;
			int i_16_ = class2.method541(string, 100, null, 601823666);
			int i_17_ = class2.method538(string, 100, 0, null, (byte) 3);
			i_14_ -= i_16_ / 2;
			if (i_14_ >= -(class251.anInt2573 * -1606950689) && i_14_ <= class251.anInt2573 * -1606950689 && i_15_ >= -(223822141 * class251.anInt2574) && i_15_ <= 223822141 * class251.anInt2574)
				class184.method2743(string, (-1606950689 * class251.anInt2573 / 2 + (i_14_ + i)), (class251.anInt2574 * 223822141 / 2 + i_3_ - i_15_ - i_6_ - i_17_), i_16_, 50, i_7_, 0, 1, 0, 0, null, null, class161, i, i_3_, 1667362692);
		}
	}
}

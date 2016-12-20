/* Class619 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class619 {
	int[] anIntArray8112;
	static Class619 aClass619_8113 = new Class619();
	public static byte aByte8114;
	static boolean aBool8115;

	int method10205(int i, int i_0_) {
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < anIntArray8112.length && i >= anIntArray8112[i_2_]; i_2_++)
			i_1_ = i_2_ + 1;
		return i_1_;
	}

	Class619(int[] is) {
		if (is == null)
			throw new NullPointerException();
		anIntArray8112 = is;
		method10206((byte) 1);
	}

	final void method10206(byte i) {
		for (int i_3_ = 1; i_3_ < anIntArray8112.length; i_3_++) {
			if (anIntArray8112[i_3_ - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i_3_ - 1).toString());
			if (anIntArray8112[i_3_] < anIntArray8112[i_3_ - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i_3_).toString());
		}
	}

	Class619() {
		anIntArray8112 = new int[120];
		int i = 0;
		for (int i_4_ = 0; i_4_ < 120; i_4_++) {
			int i_5_ = i_4_ + 1;
			int i_6_ = (int) ((double) i_5_ + 300.0 * Math.pow(2.0, (double) i_5_ / 7.0));
			i += i_6_;
			anIntArray8112[i_4_] = i / 4;
		}
		method10206((byte) 1);
	}

	int method10207(int i, byte i_7_) {
		if (i < 1)
			return 0;
		if (i > anIntArray8112.length)
			i = anIntArray8112.length;
		return anIntArray8112[i - 1];
	}

	final void method10208() {
		for (int i = 1; i < anIntArray8112.length; i++) {
			if (anIntArray8112[i - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i - 1).toString());
			if (anIntArray8112[i] < anIntArray8112[i - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i).toString());
		}
	}

	final void method10209() {
		for (int i = 1; i < anIntArray8112.length; i++) {
			if (anIntArray8112[i - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i - 1).toString());
			if (anIntArray8112[i] < anIntArray8112[i - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i).toString());
		}
	}

	int method10210(int i) {
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < anIntArray8112.length && i >= anIntArray8112[i_9_]; i_9_++)
			i_8_ = i_9_ + 1;
		return i_8_;
	}

	int method10211(int i) {
		if (i < 1)
			return 0;
		if (i > anIntArray8112.length)
			i = anIntArray8112.length;
		return anIntArray8112[i - 1];
	}

	int method10212(int i) {
		if (i < 1)
			return 0;
		if (i > anIntArray8112.length)
			i = anIntArray8112.length;
		return anIntArray8112[i - 1];
	}

	static final void method10213(int i) {
		Class666.anInt8560 -= 49764383;
	}

	static final void method10214(Class665 class665, byte i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_10_ != Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method17265((byte) -18)) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), i_10_, 1752333044);
			Class631.method10465(1612087375);
			client.aBool11020 = false;
			client.aClass509_11072.method8361(-428559959);
		}
	}

	static final void method10215(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(-923529005) == 1 ? 1 : 0;
	}

	static final void method10216(Class665 class665, byte i) {
		int i_11_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub15_10598.method14289(i_11_, -284688774);
	}

	static final void method10217(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class577.method9645(class243, class665, -1512880216);
	}

	static final void method10218(Class665 class665, int i) {
		int i_12_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub4_10600.method14289(i_12_, 628378297);
	}

	static final void method10219(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_13_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_14_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_15_ = client.aClass492ArrayArray11272[i_14_][i_13_].method7985(1769813785);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_15_ == 1 ? 1 : 0;
	}
}

/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class429 implements Interface5 {
	int anInt4827;
	Class459 aClass459_4828;

	public Class48 method47() {
		return Class48.aClass48_503;
	}

	public int method45(byte i) {
		if (aClass459_4828.method7552(anInt4827 * 1728903373, (byte) 118))
			return 100;
		return aClass459_4828.method7483(anInt4827 * 1728903373, -1065226595);
	}

	public Class48 method49(int i) {
		return Class48.aClass48_503;
	}

	Class429(Class459 class459, int i) {
		aClass459_4828 = class459;
		anInt4827 = -519326715 * i;
	}

	public int method6() {
		if (aClass459_4828.method7552(anInt4827 * 1728903373, (byte) 16))
			return 100;
		return aClass459_4828.method7483(anInt4827 * 1728903373, -171775612);
	}

	public Class48 method50() {
		return Class48.aClass48_503;
	}

	public Class48 method48() {
		return Class48.aClass48_503;
	}

	public int method7() {
		if (aClass459_4828.method7552(anInt4827 * 1728903373, (byte) 57))
			return 100;
		return aClass459_4828.method7483(anInt4827 * 1728903373, -465893855);
	}

	public int method46() {
		if (aClass459_4828.method7552(anInt4827 * 1728903373, (byte) 92))
			return 100;
		return aClass459_4828.method7483(anInt4827 * 1728903373, -1149673363);
	}

	public int method51() {
		if (aClass459_4828.method7552(anInt4827 * 1728903373, (byte) 30))
			return 100;
		return aClass459_4828.method7483(anInt4827 * 1728903373, -787036747);
	}

	public static int method6866(CharSequence charsequence, int i) {
		int i_0_ = charsequence.length();
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
			i_1_ = (i_1_ << 5) - i_1_ + charsequence.charAt(i_2_);
		return i_1_;
	}

	static final void method6867(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class101.method1787(class243, class240, class665, -394498878);
	}

	static final void method6868(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, 2124362069);
		Class240 class240 = Class183.aClass240Array2100[i_3_ >> 16];
		Class244.method4615(class243, class240, class665, 1166763401);
	}

	static final void method6869(Class665 class665, int i) {
		int i_4_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_4_ >> 14 & 0x3fff;
	}
}

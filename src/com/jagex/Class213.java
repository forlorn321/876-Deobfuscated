/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class213 implements Interface27 {
	Class215 aClass215_2259;
	Class214 this$0;
	int anInt2260;
	public static RSByteBuffer aClass527_Sub38_2261;

	public void method151(Class219 class219) {
		class219.method4005(anInt2260 * 988775125, aClass215_2259, -673010035);
	}

	public void method150(Class219 class219, int i) {
		class219.method4005(anInt2260 * 988775125, aClass215_2259, 370664986);
	}

	Class213(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2260 = class527_sub38.readUnsignedShort() * 115058301;
		aClass215_2259 = new Class215(class527_sub38, false, false, class214.anInterface28_2263);
	}

	static final void method3891(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class697.aBool8762 ? 1 : 0;
	}

	static final void method3892(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_0_, 1506140084));
		if (class80.method1566(954464785))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class243.method4526(i_0_, class80.aString806, -2069088479);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class243.method4535(i_0_, class80.anInt804 * 780718929, (byte) -7);
	}

	static final String[] method3893(String[] strings, byte i) {
		String[] strings_1_ = new String[5];
		for (int i_2_ = 0; i_2_ < 5; i_2_++) {
			strings_1_[i_2_] = new StringBuilder().append(i_2_).append(" ").toString();
			if (null != strings && strings[i_2_] != null)
				strings_1_[i_2_] = new StringBuilder().append(strings_1_[i_2_]).append(strings[i_2_]).toString();
		}
		return strings_1_;
	}

	static final void method3894(Class665 class665, byte i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, -863860197);
		Class240 class240 = Class183.aClass240Array2100[i_3_ >> 16];
		Class330.method5818(class243, class240, class665, 926405770);
	}

	static final void method3895(Class665 class665, int i) {
		if (!Class266.method5045((byte) 1))
			Class106.method1886(262144);
	}
}

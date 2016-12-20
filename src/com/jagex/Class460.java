/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class460 {
	static final int anInt5083 = 0;
	static final int anInt5084 = 1;
	static final int anInt5085 = 7;
	static final int anInt5086 = 3;
	static final int anInt5087 = 4;
	static final int anInt5088 = 6;
	static final int anInt5089 = 2;

	Class460() throws Throwable {
		throw new Error();
	}

	public static TwitchWebcamDevice method7571(int i, byte i_0_) {
		if (Class585.aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i_1_ = 0; i_1_ < Class585.aTwitchWebcamDeviceArray7709.length; i_1_++) {
			if (i == (Class585.aTwitchWebcamDeviceArray7709[i_1_].anInt1120 * 1028486927))
				return Class585.aTwitchWebcamDeviceArray7709[i_1_];
		}
		return null;
	}

	static void method7572(Class240 class240, int i, int i_2_, int i_3_, boolean bool, Class665 class665, int i_4_) {
		if (0 == i_2_)
			throw new RuntimeException();
		Class243 class243 = class240.aClass243Array2392[i];
		if (class243.aClass243Array2665 == null) {
			class243.aClass243Array2665 = new Class243[1 + i_3_];
			class243.aClass243Array2666 = class243.aClass243Array2665;
		}
		if (class243.aClass243Array2665.length <= i_3_) {
			if (class243.aClass243Array2666 == class243.aClass243Array2665) {
				Class243[] class243s = new Class243[i_3_ + 1];
				for (int i_5_ = 0; i_5_ < class243.aClass243Array2665.length; i_5_++)
					class243s[i_5_] = class243.aClass243Array2665[i_5_];
				class243.aClass243Array2665 = class243.aClass243Array2666 = class243s;
			} else {
				Class243[] class243s = new Class243[i_3_ + 1];
				Class243[] class243s_6_ = new Class243[1 + i_3_];
				for (int i_7_ = 0; i_7_ < class243.aClass243Array2665.length; i_7_++) {
					class243s[i_7_] = class243.aClass243Array2665[i_7_];
					class243s_6_[i_7_] = class243.aClass243Array2666[i_7_];
				}
				class243.aClass243Array2665 = class243s;
				class243.aClass243Array2666 = class243s_6_;
			}
		}
		if (i_3_ > 0 && class243.aClass243Array2665[i_3_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_3_ - 1).toString());
		Class243 class243_8_ = new Class243();
		class243_8_.anInt2501 = i_2_ * -570092067;
		class243_8_.anInt2536 = (class243_8_.anInt2504 = class243.anInt2504 * 1) * 1202527283;
		class243_8_.anInt2675 = i_3_ * 1313825767;
		class243.aClass243Array2665[i_3_] = class243_8_;
		if (class243.aClass243Array2666 != class243.aClass243Array2665)
			class243.aClass243Array2666[i_3_] = class243_8_;
		Class674 class674;
		if (bool)
			class674 = class665.aClass674_8534;
		else
			class674 = class665.aClass674_8533;
		class674.aClass240_8586 = class240;
		class674.aClass243_8587 = class243_8_;
		Class430.method6876(class243, (byte) 115);
	}

	static final void method7573(Class243 class243, Class240 class240, Class665 class665, byte i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_9_, -981944683));
		if (!class80.aString806.equals(string))
			class243.method4511(i_9_, string, (byte) -120);
		else
			class243.method4581(i_9_, (short) 9943);
	}

	static final void method7574(Class243 class243, int i, Class665 class665, int i_10_) {
		if (null == class243.aByteArrayArray2587)
			throw new RuntimeException();
		if (class243.anIntArray2678 == null)
			class243.anIntArray2678 = new int[class243.aByteArrayArray2587.length];
		class243.anIntArray2678[i] = 2147483647;
	}

	static final void method7575(Class665 class665, int i) {
		int i_11_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_11_, -577642046)).anInt100) * -1204628591;
	}

	static final void method7576(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_12_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		boolean bool = (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1] == 1);
		Class258.method4743(i_12_, string, bool, (byte) -1);
	}

	static void method7577(Class180 class180, int i, int i_13_, int i_14_, int i_15_, int i_16_, Class174 class174, Class22 class22, String string, byte i_17_) {
		int i_18_ = (255 - 1649857871 * Class451.anInt4938 - 23832581 * Class35.anInt367);
		if (i_18_ < 0)
			i_18_ = 0;
		if (null == Class39.aClass147_433 || null == Class35.aClass147_366) {
			if (Class338.aClass459_3656.method7480(-627367541 * Class539.anInt7233, 1711723985) && Class338.aClass459_3656.method7480((-849737473 * Class317.anInt3531), -1527204697)) {
				Class39.aClass147_433 = (class180.method3271(Class165.method2653(Class338.aClass459_3656, -627367541 * Class539.anInt7233, 0), true));
				Class185 class185 = Class165.method2653(Class338.aClass459_3656, -849737473 * Class317.anInt3531, 0);
				Class35.aClass147_366 = class180.method3271(class185, true);
				class185.method3621();
				Class640_Sub1_Sub1_Sub1.aClass147_11978 = class180.method3271(class185, true);
			} else
				class180.method3348(i, i_13_, i_14_, i_16_, i_18_ << 24 | (Class95_Sub1_Sub1.anInt11331 * -175824279), 1);
		}
		if (Class39.aClass147_433 != null && Class35.aClass147_366 != null) {
			int i_19_ = ((i_14_ - Class35.aClass147_366.method2407() * 2) / Class39.aClass147_433.method2407());
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
				Class39.aClass147_433.method2415((i + Class35.aClass147_366.method2407() + i_20_ * Class39.aClass147_433.method2407()), i_13_);
			Class35.aClass147_366.method2415(i, i_13_);
			Class640_Sub1_Sub1_Sub1.aClass147_11978.method2415((i + i_14_ - Class640_Sub1_Sub1_Sub1.aClass147_11978.method2407()), i_13_);
		}
		class174.method2770(string, i + 3, ((20 - -63286397 * class22.anInt215) / 2 + (-63286397 * class22.anInt215 + i_13_)), Class296.anInt3385 * 1009114669 | ~0xffffff, -1, 1555992208);
		class180.method3348(i, i_13_ + i_16_, i_14_, i_15_ - i_16_, (i_18_ << 24 | -175824279 * Class95_Sub1_Sub1.anInt11331), 1);
	}
}

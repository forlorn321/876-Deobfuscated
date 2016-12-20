/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class524 {
	Class311[] aClass311Array7095;
	Class311[] aClass311Array7096;
	Class519 this$0;
	Class311 aClass311_7097;
	int anInt7098;
	short[] aShortArray7099;

	int method8702(Class325 class325, int i) throws IOException {
		if (class325.method5735(aShortArray7099, 0, 814737079) == 0)
			return aClass311Array7095[i].method5639(class325, (byte) -42);
		int i_0_ = 8;
		if (class325.method5735(aShortArray7099, 1, 821994593) == 0)
			i_0_ += aClass311Array7096[i].method5639(class325, (byte) -5);
		else
			i_0_ += 8 + aClass311_7097.method5639(class325, (byte) -11);
		return i_0_;
	}

	int method8703(Class325 class325, int i, byte i_1_) throws IOException {
		if (class325.method5735(aShortArray7099, 0, 483192168) == 0)
			return aClass311Array7095[i].method5639(class325, (byte) -6);
		int i_2_ = 8;
		if (class325.method5735(aShortArray7099, 1, 1569982689) == 0)
			i_2_ += aClass311Array7096[i].method5639(class325, (byte) -64);
		else
			i_2_ += 8 + aClass311_7097.method5639(class325, (byte) 67);
		return i_2_;
	}

	void method8704(int i) {
		Class225.method4192(aShortArray7099, 1408170564);
		for (int i_3_ = 0; i_3_ < anInt7098 * 1592250331; i_3_++) {
			aClass311Array7095[i_3_].method5638((byte) 119);
			aClass311Array7096[i_3_].method5638((byte) 101);
		}
		aClass311_7097.method5638((byte) 120);
	}

	void method8705(int i) {
		for (/**/; anInt7098 * 1592250331 < i; anInt7098 += -1105750957) {
			aClass311Array7095[1592250331 * anInt7098] = new Class311(3);
			aClass311Array7096[1592250331 * anInt7098] = new Class311(3);
		}
	}

	void method8706(int i) {
		for (/**/; anInt7098 * 1592250331 < i; anInt7098 += -1105750957) {
			aClass311Array7095[1592250331 * anInt7098] = new Class311(3);
			aClass311Array7096[1592250331 * anInt7098] = new Class311(3);
		}
	}

	Class524(Class519 class519) {
		this$0 = class519;
		aShortArray7099 = new short[2];
		aClass311Array7095 = new Class311[16];
		aClass311Array7096 = new Class311[16];
		aClass311_7097 = new Class311(8);
		anInt7098 = 0;
	}

	void method8707(int i) {
		for (/**/; anInt7098 * 1592250331 < i; anInt7098 += -1105750957) {
			aClass311Array7095[1592250331 * anInt7098] = new Class311(3);
			aClass311Array7096[1592250331 * anInt7098] = new Class311(3);
		}
	}

	int method8708(Class325 class325, int i) throws IOException {
		if (class325.method5735(aShortArray7099, 0, 1972499109) == 0)
			return aClass311Array7095[i].method5639(class325, (byte) 20);
		int i_4_ = 8;
		if (class325.method5735(aShortArray7099, 1, 1581988611) == 0)
			i_4_ += aClass311Array7096[i].method5639(class325, (byte) 43);
		else
			i_4_ += 8 + aClass311_7097.method5639(class325, (byte) 4);
		return i_4_;
	}

	void method8709() {
		Class225.method4192(aShortArray7099, -983554117);
		for (int i = 0; i < anInt7098 * 1592250331; i++) {
			aClass311Array7095[i].method5638((byte) 59);
			aClass311Array7096[i].method5638((byte) 11);
		}
		aClass311_7097.method5638((byte) 48);
	}

	int method8710(Class325 class325, int i) throws IOException {
		if (class325.method5735(aShortArray7099, 0, 1262575363) == 0)
			return aClass311Array7095[i].method5639(class325, (byte) -10);
		int i_5_ = 8;
		if (class325.method5735(aShortArray7099, 1, 2146003783) == 0)
			i_5_ += aClass311Array7096[i].method5639(class325, (byte) 63);
		else
			i_5_ += 8 + aClass311_7097.method5639(class325, (byte) -17);
		return i_5_;
	}

	void method8711(int i) {
		for (/**/; anInt7098 * 1592250331 < i; anInt7098 += -1105750957) {
			aClass311Array7095[1592250331 * anInt7098] = new Class311(3);
			aClass311Array7096[1592250331 * anInt7098] = new Class311(3);
		}
	}

	void method8712(int i, byte i_6_) {
		for (/**/; anInt7098 * 1592250331 < i; anInt7098 += -1105750957) {
			aClass311Array7095[1592250331 * anInt7098] = new Class311(3);
			aClass311Array7096[1592250331 * anInt7098] = new Class311(3);
		}
	}

	static final void method8713(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class425.method6729(class243, class240, class665, 39411999);
	}

	static final void method8714(Class665 class665, byte i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (Class529_Sub1.aClass14_10788 != null) {
			Class527 class527 = Class529_Sub1.aClass14_10788.method709((long) i_7_);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = null != class527 ? 1 : 0;
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method8715(Class665 class665, int i) {
		Class411.aClass411_4359.method6580((byte) -14);
	}

	static final void method8716(Class665 class665, int i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method14289(i_8_, 568145743);
	}

	public static void method8717(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int[] is, int i, boolean bool, int i_9_) {
		if (null != class640_sub1_sub2_sub1.anIntArray11931) {
			boolean bool_10_ = true;
			for (int i_11_ = 0; i_11_ < class640_sub1_sub2_sub1.anIntArray11931.length; i_11_++) {
				if (is[i_11_] != class640_sub1_sub2_sub1.anIntArray11931[i_11_]) {
					bool_10_ = false;
					break;
				}
			}
			Class695 class695 = class640_sub1_sub2_sub1.aClass695_11914;
			if (bool_10_ && class695.method14162(-512184486)) {
				Class198 class198 = class640_sub1_sub2_sub1.aClass695_11914.method14163(175276773);
				int i_12_ = class198.anInt2186 * -667661221;
				if (i_12_ == 1)
					class695.method14233(i, (byte) 6);
				if (i_12_ == 2)
					class695.method14184((byte) 43);
			}
		}
		boolean bool_13_ = true;
		for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
			if (is[i_14_] != -1)
				bool_13_ = false;
			if (class640_sub1_sub2_sub1.anIntArray11931 == null || class640_sub1_sub2_sub1.anIntArray11931[i_14_] == -1 || ((((Class198) Class321.aClass24_Sub10_3551.method81(is[i_14_], 512609839)).anInt2191 * 40010509) >= ((Class198) (Class321.aClass24_Sub10_3551.method81(class640_sub1_sub2_sub1.anIntArray11931[i_14_], 340206783))).anInt2191 * 40010509)) {
				class640_sub1_sub2_sub1.anIntArray11931 = is;
				class640_sub1_sub2_sub1.aClass695_11914.method14160(i, (byte) -101);
				if (bool)
					class640_sub1_sub2_sub1.anInt11947 = class640_sub1_sub2_sub1.anInt11942 * -466054043;
			}
		}
		if (bool_13_) {
			class640_sub1_sub2_sub1.anIntArray11931 = is;
			class640_sub1_sub2_sub1.aClass695_11914.method14160(i, (byte) 1);
			if (bool)
				class640_sub1_sub2_sub1.anInt11947 = -466054043 * class640_sub1_sub2_sub1.anInt11942;
		}
	}

	static void method8718(byte i) {
		if (Class585.aClass147_7688 == null || (Class585.aClass147_7688.method2407() != Class585.aTwitchWebcamFrameData7705.width) || (Class585.aClass147_7688.method2424() != Class585.aTwitchWebcamFrameData7705.height))
			Class585.aClass147_7688 = (Class402.aClass180_4150.method3162(Class585.aTwitchWebcamFrameData7705.buffer, 0, Class585.aTwitchWebcamFrameData7705.width, Class585.aTwitchWebcamFrameData7705.width, Class585.aTwitchWebcamFrameData7705.height, false));
		else
			Class585.aClass147_7688.method2459(0, 0, Class585.aTwitchWebcamFrameData7705.width, Class585.aTwitchWebcamFrameData7705.height, Class585.aTwitchWebcamFrameData7705.buffer, 0, Class585.aTwitchWebcamFrameData7705.width);
	}
}

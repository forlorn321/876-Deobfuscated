/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class112 {
	public static Class95_Sub1_Sub2 aClass95_Sub1_Sub2_1406;

	public static Class180 method2014(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, int i, int i_0_) {
		return new Class180_Sub1(canvas, class181, interface24, interface48, interface46, interface49, i, i_0_);
	}

	Class112() throws Throwable {
		throw new Error();
	}

	public static Class180 method2015(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, int i, int i_1_) {
		return new Class180_Sub1(canvas, class181, interface24, interface48, interface46, interface49, i, i_1_);
	}

	public static Class180 method2016(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, int i, int i_2_) {
		return new Class180_Sub1(canvas, class181, interface24, interface48, interface46, interface49, i, i_2_);
	}

	public static void method2017(int i, int i_3_) {
		Class293.aBoolArray3265[i] = false;
		Class611.method10121(i, (byte) 75);
	}

	static final void method2018(Class243 class243, int i, byte[] is, byte[] is_4_, Class665 class665, int i_5_) {
		if (class243.aByteArrayArray2587 == null) {
			if (is != null) {
				class243.aByteArrayArray2587 = new byte[11][];
				class243.aByteArrayArray2522 = new byte[11][];
				class243.anIntArray2508 = new int[11];
				class243.anIntArray2590 = new int[11];
				class243.anIntArray2591 = new int[11];
			} else
				return;
		}
		class243.aByteArrayArray2587[i] = is;
		if (null != is)
			class243.aBool2680 = true;
		else {
			class243.aBool2680 = false;
			for (int i_6_ = 0; i_6_ < class243.aByteArrayArray2587.length; i_6_++) {
				if (null != class243.aByteArrayArray2587[i_6_] || class243.anIntArray2591[i_6_] > 0) {
					class243.aBool2680 = true;
					break;
				}
			}
		}
		class243.aByteArrayArray2522[i] = is_4_;
	}

	static final void method2019(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class32.anInt275 * 1920536919;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class32.anInt305 * -2142577407;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1089850585 * Class32.anInt314;
		Class32.anInt275 = 1500982066;
		Class32.anInt305 = -2105418497;
		Class32.anInt314 = -1703277417;
	}

	static void method2020(Class180 class180, Class694 class694, int i, int i_7_, byte i_8_) {
		Class620.aClass694_8119.method14105((byte) 40);
		if (!Class529_Sub1.aBool10770) {
			for (Class527_Sub30 class527_sub30 = (Class527_Sub30) class694.method14081((short) 14063); null != class527_sub30; class527_sub30 = (Class527_Sub30) class694.method14086(-65534)) {
				Class249 class249 = ((Class249) (Class529_Sub1.aClass24_Sub12_7164.method81(-558184067 * class527_sub30.anInt10567, 1960772762)));
				if (Class174_Sub2.method14596(class249, (byte) -20)) {
					boolean bool = Class14.method731(class180, class527_sub30, class249, i, i_7_, 787005471);
					if (bool)
						Class143.method2382(class180, class527_sub30, class249, (byte) 11);
				}
			}
		}
	}

	static final void method2021(Class665 class665, byte i) {
		Class278.method5167(1862816619);
		Class35.aBool365 = false;
	}
}

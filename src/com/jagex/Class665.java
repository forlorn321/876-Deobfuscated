/* Class665 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;
import java.util.HashMap;
import java.util.Map;

public class Class665 {
	Class659[] aClass659Array8520;
	Class501[] aClass501Array8521;
	Class640_Sub1_Sub2_Sub1 aClass640_Sub1_Sub2_Sub1_8522;
	Map aMap8523;
	Object[] anObjectArray8524;
	int[] anIntArray8525;
	int anInt8526;
	int anInt8527;
	int anInt8528;
	long[] aLongArray8529;
	int anInt8530;
	int anInt8531;
	Class346 aClass346_8532;
	Class674 aClass674_8533;
	Class674 aClass674_8534;
	Class382 aClass382_8535;
	Map aMap8536;
	Class527_Sub21 aClass527_Sub21_8537;
	int[] anIntArray8538 = new int[5];
	Interface62 anInterface62_8539;
	Class640_Sub1_Sub5_Sub1 aClass640_Sub1_Sub5_Sub1_8540;
	Object[] anObjectArray8541;
	int[][] anIntArrayArray8542 = new int[5][5000];
	int anInt8543;
	int anInt8544;
	int[] anIntArray8545;
	int[] anIntArray8546;
	long[] aLongArray8547;
	Class527_Sub8_Sub10 aClass527_Sub8_Sub10_8548;
	boolean aBool8549;
	static int anInt8550;

	Class665() {
		anIntArray8525 = new int[1000];
		anInt8526 = 0;
		anObjectArray8541 = new Object[1000];
		anInt8528 = 0;
		aLongArray8529 = new long[1000];
		anInt8530 = 0;
		anInt8531 = 0;
		aClass659Array8520 = new Class659[50];
		aClass674_8533 = new Class674();
		aClass674_8534 = new Class674();
		aMap8523 = new HashMap();
		aMap8536 = new HashMap();
		anInt8543 = 0;
		anInt8527 = 1038991169;
	}

	public static Frame method11053(Class709 class709, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (0 == i_1_) {
			Class704[] class704s = Class144.method2388(class709, (byte) 68);
			if (class704s == null)
				return null;
			boolean bool = false;
			for (int i_4_ = 0; i_4_ < class704s.length; i_4_++) {
				if (class704s[i_4_].anInt8829 * -798340951 == i && class704s[i_4_].anInt8827 * -1159802239 == i_0_ && (0 == i_2_ || i_2_ == class704s[i_4_].anInt8826 * 1045269355) && (!bool || -1133436379 * class704s[i_4_].anInt8828 > i_1_)) {
					i_1_ = class704s[i_4_].anInt8828 * -1133436379;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class709.method14383(frame, i, i_0_, i_1_, i_2_, 774692811);
		return frame;
	}

	static Class18 method11054(RSByteBuffer class527_sub38, Class95_Sub1 class95_sub1, int i) {
		Class18 class18 = new Class18(class95_sub1);
		for (;;) {
			int i_5_ = class527_sub38.readUnsignedByte();
			if (255 == i_5_)
				break;
			Class475 class475 = (Class475) Class516.method8610(com.jagex.Class475.class, i_5_, (byte) 53);
			for (;;) {
				int i_6_ = class527_sub38.readUnsignedByte();
				if (255 == i_6_)
					break;
				class527_sub38.anInt10689 -= 1474750881;
				Class425 class425 = class95_sub1.method14484(class527_sub38, class475, (byte) 2);
				if (class425 != null)
					class18.method18(494563151 * class425.anInt4803, class425.anObject4804, 121903396);
			}
		}
		return class18;
	}

	static Class527_Sub8_Sub9 method11055(byte i) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = ((Class527_Sub8_Sub9) Class527_Sub8_Sub9.aClass693_11690.method14072(-1585031319));
		if (null != class527_sub8_sub9) {
			class527_sub8_sub9.method8735(-1889161967);
			class527_sub8_sub9.method16057((byte) -110);
			return class527_sub8_sub9;
		}
		for (;;) {
			class527_sub8_sub9 = ((Class527_Sub8_Sub9) Class527_Sub8_Sub9.aClass693_11681.method14072(129677935));
			if (class527_sub8_sub9 == null)
				return null;
			if (class527_sub8_sub9.method18190(-758996345) > Class234.method4347(-1408626088))
				return null;
			class527_sub8_sub9.method8735(-1889161967);
			class527_sub8_sub9.method16057((byte) -114);
			if (0L != (-8775265850242314087L * class527_sub8_sub9.aLong10401 & ~0x7fffffffffffffffL))
				return class527_sub8_sub9;
		}
	}

	static final void method11056(Class665 class665, int i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (client.anInt11083 * -405609043 == 2 && i_7_ < -67152419 * client.anInt11261)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = client.aClass69Array11297[i_7_].aString781;
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}
}

/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class223 {
	List aList2315 = new ArrayList();
	static final int anInt2316 = 5;

	public Class221 method4154(int i, int i_0_) {
		return (Class221) aList2315.get(i);
	}

	public int method4155(int i, int i_1_) {
		for (int i_2_ = 0; i_2_ < aList2315.size(); i_2_++) {
			if (((Class221) aList2315.get(i_2_)).anInt2309 * 1039368917 == i)
				return i_2_;
		}
		return -1;
	}

	public int method4156(Class221 class221, int i) {
		if (aList2315.size() == 5)
			throw new RuntimeException("");
		if (method4155(class221.anInt2309 * 1039368917, -2026059101) != -1)
			throw new RuntimeException("");
		if (i == -1)
			i = aList2315.size();
		aList2315.add(i, class221);
		return i;
	}

	public int method4157(Class221 class221, short i) {
		return method4171(class221, -1, -1966332604);
	}

	public void method4158(int i) {
		aList2315.remove(i);
	}

	public void method4159(int i, int i_3_) {
		aList2315.remove(i);
	}

	public void method4160(byte i) {
		aList2315.clear();
	}

	public int method4161() {
		return aList2315.size();
	}

	public int method4162() {
		return aList2315.size();
	}

	public int method4163() {
		return aList2315.size();
	}

	public Class221 method4164(int i) {
		return (Class221) aList2315.get(i);
	}

	public int method4165(byte i) {
		return aList2315.size();
	}

	public int method4166(Class221 class221) {
		return method4171(class221, -1, -1537784005);
	}

	public Class221 method4167(int i) {
		return (Class221) aList2315.get(i);
	}

	public int method4168(Class221 class221) {
		return method4171(class221, -1, -1594757566);
	}

	public void method4169(int i) {
		aList2315.remove(i);
	}

	public int method4170(Class221 class221) {
		return method4171(class221, -1, -1811917948);
	}

	public int method4171(Class221 class221, int i, int i_4_) {
		if (aList2315.size() == 5)
			throw new RuntimeException("");
		if (method4155(class221.anInt2309 * 1039368917, -2026059101) != -1)
			throw new RuntimeException("");
		if (i == -1)
			i = aList2315.size();
		aList2315.add(i, class221);
		return i;
	}

	public int method4172(Class221 class221) {
		return method4171(class221, -1, -1687016321);
	}

	public void method4173() {
		aList2315.clear();
	}

	public void method4174() {
		aList2315.clear();
	}

	public void method4175() {
		aList2315.clear();
	}

	public static void method4176(Class279 class279, int i) {
		Class263.aClass279_2867 = class279;
	}

	static final void method4177(Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_5_, -1271988350);
		Class240 class240 = Class183.aClass240Array2100[i_5_ >> 16];
		Class601.method9954(class243, class240, class665, (byte) -55);
	}

	static final void method4178(Class665 class665, int i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class665.aClass346_8532.aStringArray3724[i_6_];
	}

	public static void method4179(int i, String string, int i_7_, int i_8_) {
		Class527_Sub8_Sub10 class527_sub8_sub10 = Class373.method6376(Class579.aClass579_7659, i, -1, -357767199);
		if (null != class527_sub8_sub10) {
			Class665 class665 = Class383.method6409((byte) -103);
			class665.anIntArray8546 = new int[class527_sub8_sub10.anInt11726 * -1228779449];
			class665.anObjectArray8524 = new String[class527_sub8_sub10.anInt11727 * 1563313657];
			class665.anObjectArray8524[0] = string;
			class665.anIntArray8546[0] = i_7_;
			Class208_Sub17.method15631(class527_sub8_sub10, 500000, class665, 244841042);
		}
	}

	public static int method4180(byte i) {
		return Class585.anInt7681 * -748564677;
	}
}

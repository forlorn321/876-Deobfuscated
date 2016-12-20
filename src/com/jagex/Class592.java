/* Class592 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class592 {
	public int anInt7797;
	public int anInt7798;
	public int anInt7799;

	public Class592(int i) {
		if (-1 == i)
			anInt7797 = -1359720177;
		else {
			anInt7797 = (i >> 28 & 0x3) * 1359720177;
			anInt7798 = (i >> 14 & 0x3fff) * 1949141943;
			anInt7799 = -616804327 * (i & 0x3fff);
		}
	}

	public String method9856() {
		return new StringBuilder().append(-342654447 * anInt7797).append(",").append(153371143 * anInt7798 >> 6).append(",").append(-2029646807 * anInt7799 >> 6).append(",").append(153371143 * anInt7798 & 0x3f).append(",").append(anInt7799 * -2029646807 & 0x3f).toString();
	}

	public Class592() {
		anInt7797 = -1359720177;
	}

	public void method9857(Class527_Sub36 class527_sub36, int i) {
		anInt7797 = class527_sub36.anInt10673 * 493540553;
		anInt7798 = (class527_sub36.anInt10676 * 1445023519 >> 9) * 1949141943;
		anInt7799 = -616804327 * (-424734829 * class527_sub36.anInt10675 >> 9);
	}

	public int method9858(int i) {
		return (anInt7797 * -342654447 << 28 | anInt7798 * 153371143 << 14 | -2029646807 * anInt7799);
	}

	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class592))
			return false;
		return method9859((Class592) object, 1412306647);
	}

	boolean method9859(Class592 class592_0_, int i) {
		if (anInt7797 * -342654447 != -342654447 * class592_0_.anInt7797)
			return false;
		if (153371143 * anInt7798 != 153371143 * class592_0_.anInt7798)
			return false;
		if (-2029646807 * class592_0_.anInt7799 != -2029646807 * anInt7799)
			return false;
		return true;
	}

	public int hashCode() {
		return method9858(1769813785);
	}

	public String toString() {
		return new StringBuilder().append(-342654447 * anInt7797).append(",").append(153371143 * anInt7798 >> 6).append(",").append(-2029646807 * anInt7799 >> 6).append(",").append(153371143 * anInt7798 & 0x3f).append(",").append(anInt7799 * -2029646807 & 0x3f).toString();
	}

	public boolean method9860(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class592))
			return false;
		return method9859((Class592) object, 1796740508);
	}

	public boolean method9861(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class592))
			return false;
		return method9859((Class592) object, -1962930793);
	}

	public int method9862() {
		return (anInt7797 * -342654447 << 28 | anInt7798 * 153371143 << 14 | -2029646807 * anInt7799);
	}

	public int method9863() {
		return method9858(1769813785);
	}

	public int method9864() {
		return method9858(1769813785);
	}

	public int method9865() {
		return method9858(1769813785);
	}

	public void method9866(Class527_Sub36 class527_sub36) {
		anInt7797 = class527_sub36.anInt10673 * 493540553;
		anInt7798 = (class527_sub36.anInt10676 * 1445023519 >> 9) * 1949141943;
		anInt7799 = -616804327 * (-424734829 * class527_sub36.anInt10675 >> 9);
	}

	public void method9867(Class527_Sub36 class527_sub36) {
		anInt7797 = class527_sub36.anInt10673 * 493540553;
		anInt7798 = (class527_sub36.anInt10676 * 1445023519 >> 9) * 1949141943;
		anInt7799 = -616804327 * (-424734829 * class527_sub36.anInt10675 >> 9);
	}

	public int method9868() {
		return (anInt7797 * -342654447 << 28 | anInt7798 * 153371143 << 14 | -2029646807 * anInt7799);
	}

	public Class592(int i, int i_1_, int i_2_) {
		anInt7797 = 1359720177 * i;
		anInt7798 = i_1_ * 1949141943;
		anInt7799 = i_2_ * -616804327;
	}

	boolean method9869(Class592 class592_3_) {
		if (anInt7797 * -342654447 != -342654447 * class592_3_.anInt7797)
			return false;
		if (153371143 * anInt7798 != 153371143 * class592_3_.anInt7798)
			return false;
		if (-2029646807 * class592_3_.anInt7799 != -2029646807 * anInt7799)
			return false;
		return true;
	}

	boolean method9870(Class592 class592_4_) {
		if (anInt7797 * -342654447 != -342654447 * class592_4_.anInt7797)
			return false;
		if (153371143 * anInt7798 != 153371143 * class592_4_.anInt7798)
			return false;
		if (-2029646807 * class592_4_.anInt7799 != -2029646807 * anInt7799)
			return false;
		return true;
	}

	static void method9871(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class26.method855(385876892);
	}

	static final void method9872(Class665 class665, byte i) {
		if (Class208.anIntArray2235 == null || (582841303 * Class190.anInt2129 >= Class208.anIntArray2235.length))
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = ((Class208.anIntArray2235[(Class190.anInt2129 += -1099419673) * 582841303 - 1]) & 0xffff);
	}

	static final void method9873(Class665 class665, int i) {
		Class593.method9881((byte) 103);
	}

	static final void method9874(Class665 class665, byte i) {
		Class420.aClass273_4591.method5092(-632912422);
	}

	public static String[] method9875(String string, char c, short i) {
		int i_5_ = Class615.method10187(string, c, 1195021919);
		String[] strings = new String[1 + i_5_];
		int i_6_ = 0;
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
			int i_9_;
			for (i_9_ = i_7_; string.charAt(i_9_) != c; i_9_++) {
				/* empty */
			}
			strings[i_6_++] = string.substring(i_7_, i_9_);
			i_7_ = 1 + i_9_;
		}
		strings[i_5_] = string.substring(i_7_);
		return strings;
	}

	static void method9876(byte i) {
		Class620.aClass694_8119 = null;
		Class529_Sub1.anInt10773 = 0;
		Class529_Sub1.anInt7178 = 0;
		Class527_Sub27.aClass243_10524 = null;
		Class529_Sub1.method8748();
		Class529_Sub1.aClass694_7147.method14105((byte) 106);
		Class529_Sub1.aClass532_7135 = null;
		Class529_Sub1.aClass205_7161.method3793((byte) 72);
		Class529_Sub1.aClass205_7129.method3793((byte) 10);
		Class529_Sub1.aClass147_10775 = null;
		Class529_Sub1.anInt10779 = -1449615877;
		Class529_Sub1.anInt10772 = -1784395681;
		if (Class529_Sub1.aClass24_Sub12_7164 != null) {
			Class529_Sub1.aClass24_Sub12_7164.method836(-676069174);
			Class529_Sub1.aClass24_Sub12_7164.method17394(128, 64, (byte) -79);
		}
		if (null != Class529_Sub1.aClass24_Sub8_7119)
			Class529_Sub1.aClass24_Sub8_7119.method17378(64, 64, -1752291941);
		if (null != Class529_Sub1.aClass24_Sub6_7117)
			Class529_Sub1.aClass24_Sub6_7117.method838(256, -2049620450);
		Class51.aClass24_Sub16_522.method838(64, -2145831248);
	}

	static final void method9877(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class271.method5076(class243, class240, class665, (byte) 1);
	}

	public static void method9878(int i, int i_10_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(11, (long) i);
		class527_sub8_sub9.method18186(-26349658);
	}

	static void method9879(Class180 class180, int i) {
		if (Class39.aClass694_432.method14087((byte) 11) != 0) {
			if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(121082143) == 0) {
				for (Class527_Sub6 class527_sub6 = ((Class527_Sub6) Class39.aClass694_432.method14081((short) 2443)); class527_sub6 != null; class527_sub6 = ((Class527_Sub6) Class39.aClass694_432.method14086(-65534))) {
					Class174_Sub2.aClass24_Sub17_9120.method17410(class180, class180, class527_sub6.anInt10393 * -2009576309, class527_sub6.anInt10392 * -1087505197, 1914159393 * class527_sub6.anInt10396, -864408185 * class527_sub6.anInt10394, false, false, 1936847561 * class527_sub6.anInt10395, Class24_Sub9.aClass174_10977, (class527_sub6.aBool10391 ? (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) : null), Class536.aClass615_7224, -2122724742);
					class527_sub6.method8735(-1889161967);
				}
				Class289.method5226(-1429169102);
			} else {
				if (null == Class39.aClass180_431) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					Class39.aClass180_431 = Class700_Sub34.method17259(0, canvas, Class143.aClass181_1669, (Class226.anInterface24_2350), Class219.aClass386_2303, Class659.aClass391_8496, Class643.aClass397_8346, Class478.aClass459_5395, 0, (byte) 75);
					Class488.aClass174_5472 = (Class39.aClass180_431.method3170(Class483.method7953(Class272.aClass459_3136, Class49.anInt505 * 1950472807, 0, -238449641), Class165.method2655(Class338.aClass459_3656, 1950472807 * Class49.anInt505, 0), true));
				}
				for (Class527_Sub6 class527_sub6 = ((Class527_Sub6) Class39.aClass694_432.method14081((short) 15958)); null != class527_sub6; class527_sub6 = ((Class527_Sub6) Class39.aClass694_432.method14086(-65534))) {
					Class174_Sub2.aClass24_Sub17_9120.method17410(Class39.aClass180_431, class180, -2009576309 * class527_sub6.anInt10393, -1087505197 * class527_sub6.anInt10392, class527_sub6.anInt10396 * 1914159393, class527_sub6.anInt10394 * -864408185, false, false, class527_sub6.anInt10395 * 1936847561, Class488.aClass174_5472, (class527_sub6.aBool10391 ? (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) : null), Class536.aClass615_7224, -2016493560);
					class527_sub6.method8735(-1889161967);
				}
			}
		}
	}
}

/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class332 {
	Class459 aClass459_3616;
	Class459 aClass459_3617;
	Class335 aClass335_3618;

	Class335 method5831() {
		if (aClass335_3618 == null)
			aClass335_3618 = new Class335();
		return aClass335_3618;
	}

	public Interface33 method5832(Interface47 interface47, int i) {
		if (interface47 == null)
			return null;
		Class396 class396 = interface47.method334(766292803);
		if (Class396.aClass396_4109 == class396)
			return new Class319((Class381) interface47);
		if (class396 == Class396.aClass396_4117)
			return new Class330(method5833(-1380718637), (Class385) interface47);
		if (class396 == Class396.aClass396_4112)
			return new Class329(aClass459_3616, (Class383) interface47);
		if (class396 == Class396.aClass396_4111)
			return new Class329_Sub1(aClass459_3616, (Class383_Sub1) interface47);
		if (Class396.aClass396_4108 == class396)
			return new Class331_Sub2(aClass459_3616, aClass459_3617, (Class389_Sub2) interface47);
		if (class396 == Class396.aClass396_4107)
			return new Class331_Sub3(aClass459_3616, aClass459_3617, (Class389_Sub3) interface47);
		if (class396 == Class396.aClass396_4110)
			return new Class331_Sub1(aClass459_3616, aClass459_3617, (Class389_Sub1) interface47);
		if (Class396.aClass396_4114 == class396)
			return new Class317(aClass459_3616, aClass459_3617, (Class399) interface47);
		if (class396 == Class396.aClass396_4115)
			return new Class312(aClass459_3616, (Class387) interface47);
		if (class396 == Class396.aClass396_4116)
			return new Class331_Sub1_Sub1(aClass459_3616, aClass459_3617, (Class389_Sub1_Sub1) interface47);
		if (Class396.aClass396_4113 == class396)
			return new Class321(aClass459_3616, aClass459_3617, (Class392) interface47);
		return null;
	}

	Class335 method5833(int i) {
		if (aClass335_3618 == null)
			aClass335_3618 = new Class335();
		return aClass335_3618;
	}

	Class335 method5834() {
		if (aClass335_3618 == null)
			aClass335_3618 = new Class335();
		return aClass335_3618;
	}

	public Class332(Class459 class459, Class459 class459_0_) {
		aClass459_3616 = class459;
		aClass459_3617 = class459_0_;
	}

	public Interface33 method5835(Interface47 interface47) {
		if (interface47 == null)
			return null;
		Class396 class396 = interface47.method334(766292803);
		if (Class396.aClass396_4109 == class396)
			return new Class319((Class381) interface47);
		if (class396 == Class396.aClass396_4117)
			return new Class330(method5833(-1361766243), (Class385) interface47);
		if (class396 == Class396.aClass396_4112)
			return new Class329(aClass459_3616, (Class383) interface47);
		if (class396 == Class396.aClass396_4111)
			return new Class329_Sub1(aClass459_3616, (Class383_Sub1) interface47);
		if (Class396.aClass396_4108 == class396)
			return new Class331_Sub2(aClass459_3616, aClass459_3617, (Class389_Sub2) interface47);
		if (class396 == Class396.aClass396_4107)
			return new Class331_Sub3(aClass459_3616, aClass459_3617, (Class389_Sub3) interface47);
		if (class396 == Class396.aClass396_4110)
			return new Class331_Sub1(aClass459_3616, aClass459_3617, (Class389_Sub1) interface47);
		if (Class396.aClass396_4114 == class396)
			return new Class317(aClass459_3616, aClass459_3617, (Class399) interface47);
		if (class396 == Class396.aClass396_4115)
			return new Class312(aClass459_3616, (Class387) interface47);
		if (class396 == Class396.aClass396_4116)
			return new Class331_Sub1_Sub1(aClass459_3616, aClass459_3617, (Class389_Sub1_Sub1) interface47);
		if (Class396.aClass396_4113 == class396)
			return new Class321(aClass459_3616, aClass459_3617, (Class392) interface47);
		return null;
	}

	static final void method5836(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_1_, -1918394088);
		Class240 class240 = Class183.aClass240Array2100[i_1_ >> 16];
		Class190.method3678(class243, class240, class665, 1839196865);
	}

	public static byte[] method5837(byte[] is, int i) {
		if (null == is)
			return null;
		byte[] is_2_ = new byte[is.length];
		System.arraycopy(is, 0, is_2_, 0, is.length);
		return is_2_;
	}

	static void method5838(int i, byte i_3_) {
		int i_4_;
		if (i == 0)
			i_4_ = 0;
		else if (i == 1)
			i_4_ = 1;
		else if (2 == i)
			i_4_ = 2;
		else
			return;
		int i_5_;
		if (2.0 == (double) Class529_Sub1.aFloat7134)
			i_5_ = 0;
		else if (3.0 == (double) Class529_Sub1.aFloat7134)
			i_5_ = 1;
		else if ((double) Class529_Sub1.aFloat7134 == 4.0)
			i_5_ = 2;
		else if (6.0 == (double) Class529_Sub1.aFloat7134)
			i_5_ = 3;
		else if ((double) Class529_Sub1.aFloat7134 >= 8.0)
			i_5_ = 4;
		else
			return;
		Class358_Sub2.aClass174_10289 = Class529_Sub1.aClass174ArrayArray10785[i_4_][i_5_];
		Class529_Sub1.aClass22_10781 = Class529_Sub1.aClass22ArrayArray10780[i_4_][i_5_];
	}
}

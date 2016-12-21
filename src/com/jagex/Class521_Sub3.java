/* Class521_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class521_Sub3 extends Class521 {
	public int anInt10296;
	public int anInt10297;
	public int anInt10298;
	public int anInt10299;

	void method9342(int i, int i_0_, int i_1_, int i_2_) {
		anInt10296 = i * -639682139;
		anInt10297 = 1499417805 * i_0_;
		anInt10298 = i_1_ * -356286643;
		anInt10299 = i_2_ * 2003184675;
	}

	void method9343(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
		anInt10296 = i * -639682139;
		anInt10297 = 1499417805 * i_3_;
		anInt10298 = i_4_ * -356286643;
		anInt10299 = i_5_ * 2003184675;
	}

	Class521_Sub3(int i, int i_7_, int i_8_, int i_9_) {
		anInt10296 = i * -639682139;
		anInt10297 = 1499417805 * i_7_;
		anInt10298 = i_8_ * -356286643;
		anInt10299 = 2003184675 * i_9_;
	}

	public static TwitchWebcamDevice method9344(String string, int i) {
		if (null == Class575.aTwitchWebcamDeviceArray7674)
			return null;
		for (int i_10_ = 0; i_10_ < Class575.aTwitchWebcamDeviceArray7674.length; i_10_++) {
			if (Class575.aTwitchWebcamDeviceArray7674[i_10_].aString1125.equals(string))
				return Class575.aTwitchWebcamDeviceArray7674[i_10_];
		}
		return null;
	}

	static final void method9345(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class704.method8266(class251, class234, class668, (byte) 62);
	}
}

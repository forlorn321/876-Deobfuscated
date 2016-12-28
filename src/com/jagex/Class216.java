/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class216 implements Interface42 {
	Class211 this$0;

	public float method287() {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10788.method10213(131754200) / 255.0F);
	}

	public float method285(int i) {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10788.method10213(1375913895) / 255.0F);
	}

	Class216(Class211 class211) {
		this$0 = class211;
	}

	public float method286() {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10788.method10213(1621096931) / 255.0F);
	}

	public float method288() {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10788.method10213(1157418600) / 255.0F);
	}

	static final void method3091(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.noClickThrough = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
	}

	static final void method3092(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (null == Class463.aClass234Array5227[i_0_])
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		else {
			String string = (Class463.aClass234Array5227[i_0_].aClass251Array2378[0].aString2557);
			if (null == string)
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			else
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string.substring(0, string.indexOf(':'));
		}
	}

	public static final void method3093(int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		if (i_2_ < 1)
			i_2_ = 1;
		if (i_3_ < 1)
			i_3_ = 1;
		int i_5_ = i_3_ - 334;
		if (i_5_ < 0)
			i_5_ = 0;
		else if (i_5_ > 100)
			i_5_ = 100;
		int i_6_ = (client.aShort11275 + i_5_ * (client.aShort11276 - client.aShort11275) / 100);
		int i_7_ = 512 * (i_3_ * i_6_) / (334 * i_2_);
		if (i_7_ < client.aShort11255) {
			i_7_ = client.aShort11255;
			i_6_ = 334 * (i_2_ * i_7_) / (512 * i_3_);
			if (i_6_ > client.aShort11280) {
				i_6_ = client.aShort11280;
				int i_8_ = 512 * (i_3_ * i_6_) / (334 * i_7_);
				int i_9_ = (i_2_ - i_8_) / 2;
				if (bool) {
					Class677.aClass167_8609.method2051();
					Class677.aClass167_8609.method2057(i, i_1_, i_9_, i_3_, -16777216, (short) -3680);
					Class677.aClass167_8609.method2057(i_2_ + i - i_9_, i_1_, i_9_, i_3_, -16777216, (short) -29329);
				}
				i += i_9_;
				i_2_ -= i_9_ * 2;
			}
		} else if (i_7_ > client.aShort11282) {
			i_7_ = client.aShort11282;
			i_6_ = i_2_ * i_7_ * 334 / (512 * i_3_);
			if (i_6_ < client.aShort11279) {
				i_6_ = client.aShort11279;
				int i_10_ = 334 * (i_7_ * i_2_) / (512 * i_6_);
				int i_11_ = (i_3_ - i_10_) / 2;
				if (bool) {
					Class677.aClass167_8609.method2051();
					Class677.aClass167_8609.method2057(i, i_1_, i_2_, i_11_, -16777216, (short) -4347);
					Class677.aClass167_8609.method2057(i, i_1_ + i_3_ - i_11_, i_2_, i_11_, -16777216, (short) -25124);
				}
				i_1_ += i_11_;
				i_3_ -= 2 * i_11_;
			}
		}
		client.anInt11287 = -1383029205 * (i_3_ * i_6_ / 334);
		client.anInt11283 = 1286313731 * i;
		client.anInt11284 = i_1_ * 940332969;
		client.anInt11285 = -936989921 * (short) i_2_;
		client.anInt11286 = (short) i_3_ * 79278987;
	}

	static void method3094(int i, int i_12_, int i_13_, int i_14_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(9, (long) i);
		class536_sub18_sub5.method10659(1916109465);
		class536_sub18_sub5.anInt11675 = 1577826219 * i_12_;
		class536_sub18_sub5.anInt11659 = i_13_ * 824043525;
	}
}

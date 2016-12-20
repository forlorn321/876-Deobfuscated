/* Class696_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696_Sub2 extends Class696 {
	static float aFloat10889;
	Class438 aClass438_10890;
	static int anInt10891 = 0;
	static int anInt10892 = 0;
	static int anInt10893 = 0;
	Class438 aClass438_10894 = new Class438();
	static float aFloat10895;
	static float aFloat10896;
	static int anInt10897 = 0;
	static float aFloat10898;
	static float aFloat10899;
	static float aFloat10900;

	public Class442 method14254() {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10894));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-473930139));
		return class442;
	}

	public void method17150(Class438 class438, int i) {
		aClass438_10890.aFloat4883 = class438.aFloat4883;
		aClass438_10890.aFloat4886 = class438.aFloat4886;
		aClass438_10890.aFloat4887 = class438.aFloat4887;
		aClass438_10890.aFloat4889 = class438.aFloat4889;
		aClass438_10894.method7054(aClass438_10890);
	}

	public void method17151(int i, int i_0_) {
		anInt10891 = i * -469370289;
	}

	public void method17152(int i, int i_1_) {
		anInt10892 = i * 746032171;
	}

	public void method17153(int i, int i_2_) {
		anInt10893 = 1081563315 * i;
	}

	public void method17154(int i, int i_3_) {
		anInt10897 = 236304571 * i;
	}

	public Class442 method14255() {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10894));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-1053790038));
		return class442;
	}

	public Class442 method14246(byte i) {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10890));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-793228061));
		return class442;
	}

	public void method17155(int i, int i_4_, int i_5_, byte i_6_) {
		Class432 class432 = new Class432();
		class432.method6945(0.0, 0.0, 0.0, (double) i, (double) -i_4_, (double) i_5_, 0.0F, 1.0F, 0.0F);
		Class426 class426 = new Class426();
		class432.method6904(class426.aFloatArray4806);
		Class438 class438 = class426.method6733();
		class438.method7033();
		aClass438_10894.method7054(class438);
	}

	public void method14250(float f, int i) {
		Class438 class438 = method17163(-1548379704);
		if (anInt10891 * -657269585 != 0 || 0 != -1517759869 * anInt10892) {
			Class438 class438_7_ = Class438.method7020();
			class438_7_.method7040(1.0F, 0.0F, 0.0F, ((float) (2.0 * (3.141592653589793 * (double) (-657269585 * anInt10891))) / 16384.0F));
			class438.method7019(class438_7_);
			Class442 class442 = Class442.method7166(0.0F, 1.0F, 0.0F);
			class442.method7157(class438);
			Class438 class438_8_ = Class438.method7020();
			class442.method7173();
			class438_8_.method7091(class442, (float) ((double) (anInt10892 * -1517759869) * 3.141592653589793 * 2.0) / 16384.0F);
			class438.method7019(class438_8_);
			method17150(class438, -52145984);
			anInt10891 = 0;
			anInt10892 = 0;
		}
		if (aClass296_8753.method5376((byte) -27) == Class301.aClass301_3413 && (0 != 1901270651 * anInt10893 || anInt10897 * -150221709 != 0)) {
			class438.method7033();
			Class327_Sub1 class327_sub1 = (Class327_Sub1) aClass296_8753.method5372((byte) 0);
			Class527_Sub36 class527_sub36 = class327_sub1.method5783(-556868950);
			Class442 class442 = class527_sub36.method16385(-1986083542);
			Class442 class442_9_ = Class442.method7166(0.0F, 0.0F, (float) (-150221709 * anInt10897));
			class442_9_.method7157(class438);
			class442_9_.aFloat4915 *= -1.0F;
			class442.method7219(class442_9_);
			Class442 class442_10_ = Class442.method7166((float) (1901270651 * anInt10893), 0.0F, 0.0F);
			class442_10_.method7157(class438);
			class442_10_.aFloat4915 *= -1.0F;
			class442.method7219(class442_10_);
			method17156(class442, (byte) -75);
			class327_sub1.method15702(new Class527_Sub36(class527_sub36.anInt10673 * -426691751, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919), 1331693276);
			anInt10893 = 0;
			anInt10897 = 0;
		}
	}

	void method17156(Class442 class442, byte i) {
		if (-1.0F != aFloat10895 && class442.aFloat4918 < aFloat10895)
			class442.aFloat4918 = aFloat10895;
		if (aFloat10896 != -1.0F && class442.aFloat4918 > aFloat10896)
			class442.aFloat4918 = aFloat10896;
		if (aFloat10889 != -1.0F && class442.aFloat4915 < aFloat10889)
			class442.aFloat4915 = aFloat10889;
		if (aFloat10898 != -1.0F && class442.aFloat4915 > aFloat10898)
			class442.aFloat4915 = aFloat10898;
		if (-1.0F != aFloat10899 && class442.aFloat4919 < aFloat10899)
			class442.aFloat4919 = aFloat10899;
		if (-1.0F != aFloat10900 && class442.aFloat4919 > aFloat10900)
			class442.aFloat4919 = aFloat10900;
	}

	void method17157(Class442 class442) {
		if (-1.0F != aFloat10895 && class442.aFloat4918 < aFloat10895)
			class442.aFloat4918 = aFloat10895;
		if (aFloat10896 != -1.0F && class442.aFloat4918 > aFloat10896)
			class442.aFloat4918 = aFloat10896;
		if (aFloat10889 != -1.0F && class442.aFloat4915 < aFloat10889)
			class442.aFloat4915 = aFloat10889;
		if (aFloat10898 != -1.0F && class442.aFloat4915 > aFloat10898)
			class442.aFloat4915 = aFloat10898;
		if (-1.0F != aFloat10899 && class442.aFloat4919 < aFloat10899)
			class442.aFloat4919 = aFloat10899;
		if (-1.0F != aFloat10900 && class442.aFloat4919 > aFloat10900)
			class442.aFloat4919 = aFloat10900;
	}

	public boolean method14244(int i) {
		return (!Float.isNaN(aClass438_10894.aFloat4883) && aClass296_8753.method5377(-1939578750) != null);
	}

	public void method17158(int i) {
		anInt10892 = i * 746032171;
	}

	public void method17159(Class442 class442, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		aFloat10895 = i == -1 ? -1.0F : class442.aFloat4918 - (float) (512 * i);
		aFloat10896 = (-1 == i_11_ ? -1.0F : (float) (i_11_ * 512) + class442.aFloat4918);
		aFloat10889 = -1 == i_14_ ? -1.0F : -class442.aFloat4915 - (float) (512 * i_14_);
		aFloat10898 = i_15_ == -1 ? -1.0F : -class442.aFloat4915 + (float) (512 * i_15_);
		aFloat10899 = i_12_ == -1 ? -1.0F : class442.aFloat4919 - (float) (i_12_ * 512);
		aFloat10900 = -1 == i_13_ ? -1.0F : class442.aFloat4919 + (float) (512 * i_13_);
	}

	public void method14248(RSByteBuffer class527_sub38, int i) {
		aClass438_10894.method7025(class527_sub38);
	}

	static {
		aFloat10895 = -1.0F;
		aFloat10896 = -1.0F;
		aFloat10889 = -1.0F;
		aFloat10898 = -1.0F;
		aFloat10899 = -1.0F;
		aFloat10900 = -1.0F;
	}

	public void method14249(float f) {
		Class438 class438 = method17163(-1548379704);
		if (anInt10891 * -657269585 != 0 || 0 != -1517759869 * anInt10892) {
			Class438 class438_16_ = Class438.method7020();
			class438_16_.method7040(1.0F, 0.0F, 0.0F, ((float) (2.0 * (3.141592653589793 * (double) (-657269585 * anInt10891))) / 16384.0F));
			class438.method7019(class438_16_);
			Class442 class442 = Class442.method7166(0.0F, 1.0F, 0.0F);
			class442.method7157(class438);
			Class438 class438_17_ = Class438.method7020();
			class442.method7173();
			class438_17_.method7091(class442, (float) ((double) (anInt10892 * -1517759869) * 3.141592653589793 * 2.0) / 16384.0F);
			class438.method7019(class438_17_);
			method17150(class438, -1964845438);
			anInt10891 = 0;
			anInt10892 = 0;
		}
		if (aClass296_8753.method5376((byte) -46) == Class301.aClass301_3413 && (0 != 1901270651 * anInt10893 || anInt10897 * -150221709 != 0)) {
			class438.method7033();
			Class327_Sub1 class327_sub1 = (Class327_Sub1) aClass296_8753.method5372((byte) 0);
			Class527_Sub36 class527_sub36 = class327_sub1.method5783(-1719019245);
			Class442 class442 = class527_sub36.method16385(-946665601);
			Class442 class442_18_ = Class442.method7166(0.0F, 0.0F, (float) (-150221709 * anInt10897));
			class442_18_.method7157(class438);
			class442_18_.aFloat4915 *= -1.0F;
			class442.method7219(class442_18_);
			Class442 class442_19_ = Class442.method7166((float) (1901270651 * anInt10893), 0.0F, 0.0F);
			class442_19_.method7157(class438);
			class442_19_.aFloat4915 *= -1.0F;
			class442.method7219(class442_19_);
			method17156(class442, (byte) -74);
			class327_sub1.method15702(new Class527_Sub36(class527_sub36.anInt10673 * -426691751, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919), 1734398339);
			anInt10893 = 0;
			anInt10897 = 0;
		}
	}

	public Class438 method17160() {
		return new Class438(aClass438_10894);
	}

	public boolean method14252() {
		return (!Float.isNaN(aClass438_10894.aFloat4883) && aClass296_8753.method5377(-1573687886) != null);
	}

	public void method14257(Class302 class302, Class432 class432, int i, int i_20_, float f) {
		Class442 class442 = Class442.method7139(aClass296_8753.method5377(-1502390039));
		class442.aFloat4918 -= (float) i;
		class442.aFloat4919 -= (float) i_20_;
		class442.aFloat4915 *= -1.0F;
		class432.method6907(Class438.method7034(aClass438_10894));
		class432.method6908(class442);
		class432.method6887();
		class442.method7141();
	}

	public Class442 method14253() {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10894));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-306609526));
		return class442;
	}

	public void method17161(int i, int i_21_, int i_22_) {
		Class432 class432 = new Class432();
		class432.method6945(0.0, 0.0, 0.0, (double) i, (double) -i_21_, (double) i_22_, 0.0F, 1.0F, 0.0F);
		Class426 class426 = new Class426();
		class432.method6904(class426.aFloatArray4806);
		Class438 class438 = class426.method6733();
		class438.method7033();
		aClass438_10894.method7054(class438);
	}

	public Class438 method17162() {
		return new Class438(aClass438_10894);
	}

	public Class438 method17163(int i) {
		return new Class438(aClass438_10894);
	}

	public Class442 method14251() {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10890));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-650734412));
		return class442;
	}

	public Class442 method14258() {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10890));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-1075687221));
		return class442;
	}

	public void method14259(RSByteBuffer class527_sub38) {
		aClass438_10894.method7025(class527_sub38);
	}

	public void method17164(int i) {
		anInt10892 = i * 746032171;
	}

	public void method17165(Class438 class438) {
		aClass438_10890.aFloat4883 = class438.aFloat4883;
		aClass438_10890.aFloat4886 = class438.aFloat4886;
		aClass438_10890.aFloat4887 = class438.aFloat4887;
		aClass438_10890.aFloat4889 = class438.aFloat4889;
		aClass438_10894.method7054(aClass438_10890);
	}

	public void method17166(int i) {
		anInt10892 = i * 746032171;
	}

	public void method17167(int i) {
		anInt10891 = i * -469370289;
	}

	public void method17168(int i) {
		anInt10891 = i * -469370289;
	}

	public void method17169(int i) {
		anInt10891 = i * -469370289;
	}

	public void method17170(int i) {
		anInt10892 = i * 746032171;
	}

	public void method17171(Class438 class438) {
		aClass438_10890.aFloat4883 = class438.aFloat4883;
		aClass438_10890.aFloat4886 = class438.aFloat4886;
		aClass438_10890.aFloat4887 = class438.aFloat4887;
		aClass438_10890.aFloat4889 = class438.aFloat4889;
		aClass438_10894.method7054(aClass438_10890);
	}

	public void method17172(int i) {
		anInt10892 = i * 746032171;
	}

	public Class442 method14256() {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10894));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-1039230820));
		return class442;
	}

	public void method14243(Class302 class302, Class432 class432, int i, int i_23_, float f, int i_24_) {
		Class442 class442 = Class442.method7139(aClass296_8753.method5377(-995514969));
		class442.aFloat4918 -= (float) i;
		class442.aFloat4919 -= (float) i_23_;
		class442.aFloat4915 *= -1.0F;
		class432.method6907(Class438.method7034(aClass438_10894));
		class432.method6908(class442);
		class432.method6887();
		class442.method7141();
	}

	public void method17173(int i) {
		anInt10893 = 1081563315 * i;
	}

	public void method17174(int i) {
		anInt10893 = 1081563315 * i;
	}

	public void method17175(int i) {
		anInt10897 = 236304571 * i;
	}

	public boolean method14247() {
		return (!Float.isNaN(aClass438_10894.aFloat4883) && aClass296_8753.method5377(-1782154123) != null);
	}

	public void method17176(Class442 class442, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, byte i_30_) {
		aFloat10895 = i == -1 ? -1.0F : class442.aFloat4918 - (float) (512 * i);
		aFloat10896 = (-1 == i_25_ ? -1.0F : (float) (i_25_ * 512) + class442.aFloat4918);
		aFloat10889 = -1 == i_28_ ? -1.0F : -class442.aFloat4915 - (float) (512 * i_28_);
		aFloat10898 = i_29_ == -1 ? -1.0F : -class442.aFloat4915 + (float) (512 * i_29_);
		aFloat10899 = i_26_ == -1 ? -1.0F : class442.aFloat4919 - (float) (i_26_ * 512);
		aFloat10900 = -1 == i_27_ ? -1.0F : class442.aFloat4919 + (float) (512 * i_27_);
	}

	public void method17177(int i, int i_31_, int i_32_) {
		Class432 class432 = new Class432();
		class432.method6945(0.0, 0.0, 0.0, (double) i, (double) -i_31_, (double) i_32_, 0.0F, 1.0F, 0.0F);
		Class426 class426 = new Class426();
		class432.method6904(class426.aFloatArray4806);
		Class438 class438 = class426.method6733();
		class438.method7033();
		aClass438_10894.method7054(class438);
	}

	public Class696_Sub2(Class296 class296) {
		super(class296);
		aClass438_10890 = new Class438(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
	}

	void method17178(Class442 class442) {
		if (-1.0F != aFloat10895 && class442.aFloat4918 < aFloat10895)
			class442.aFloat4918 = aFloat10895;
		if (aFloat10896 != -1.0F && class442.aFloat4918 > aFloat10896)
			class442.aFloat4918 = aFloat10896;
		if (aFloat10889 != -1.0F && class442.aFloat4915 < aFloat10889)
			class442.aFloat4915 = aFloat10889;
		if (aFloat10898 != -1.0F && class442.aFloat4915 > aFloat10898)
			class442.aFloat4915 = aFloat10898;
		if (-1.0F != aFloat10899 && class442.aFloat4919 < aFloat10899)
			class442.aFloat4919 = aFloat10899;
		if (-1.0F != aFloat10900 && class442.aFloat4919 > aFloat10900)
			class442.aFloat4919 = aFloat10900;
	}

	void method17179(Class442 class442) {
		if (-1.0F != aFloat10895 && class442.aFloat4918 < aFloat10895)
			class442.aFloat4918 = aFloat10895;
		if (aFloat10896 != -1.0F && class442.aFloat4918 > aFloat10896)
			class442.aFloat4918 = aFloat10896;
		if (aFloat10889 != -1.0F && class442.aFloat4915 < aFloat10889)
			class442.aFloat4915 = aFloat10889;
		if (aFloat10898 != -1.0F && class442.aFloat4915 > aFloat10898)
			class442.aFloat4915 = aFloat10898;
		if (-1.0F != aFloat10899 && class442.aFloat4919 < aFloat10899)
			class442.aFloat4919 = aFloat10899;
		if (-1.0F != aFloat10900 && class442.aFloat4919 > aFloat10900)
			class442.aFloat4919 = aFloat10900;
	}

	void method17180(Class442 class442) {
		if (-1.0F != aFloat10895 && class442.aFloat4918 < aFloat10895)
			class442.aFloat4918 = aFloat10895;
		if (aFloat10896 != -1.0F && class442.aFloat4918 > aFloat10896)
			class442.aFloat4918 = aFloat10896;
		if (aFloat10889 != -1.0F && class442.aFloat4915 < aFloat10889)
			class442.aFloat4915 = aFloat10889;
		if (aFloat10898 != -1.0F && class442.aFloat4915 > aFloat10898)
			class442.aFloat4915 = aFloat10898;
		if (-1.0F != aFloat10899 && class442.aFloat4919 < aFloat10899)
			class442.aFloat4919 = aFloat10899;
		if (-1.0F != aFloat10900 && class442.aFloat4919 > aFloat10900)
			class442.aFloat4919 = aFloat10900;
	}

	public Class442 method14245(byte i) {
		Class442 class442 = new Class442(0.0F, 0.0F, 1000.0F);
		class442.method7157(Class438.method7034(aClass438_10894));
		class442.aFloat4915 *= -1.0F;
		class442.method7219(aClass296_8753.method5377(-949007726));
		return class442;
	}

	public void method17181(Class442 class442, int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		aFloat10895 = i == -1 ? -1.0F : class442.aFloat4918 - (float) (512 * i);
		aFloat10896 = (-1 == i_33_ ? -1.0F : (float) (i_33_ * 512) + class442.aFloat4918);
		aFloat10889 = -1 == i_36_ ? -1.0F : -class442.aFloat4915 - (float) (512 * i_36_);
		aFloat10898 = i_37_ == -1 ? -1.0F : -class442.aFloat4915 + (float) (512 * i_37_);
		aFloat10899 = i_34_ == -1 ? -1.0F : class442.aFloat4919 - (float) (i_34_ * 512);
		aFloat10900 = -1 == i_35_ ? -1.0F : class442.aFloat4919 + (float) (512 * i_35_);
	}

	public void method17182(Class442 class442, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		aFloat10895 = i == -1 ? -1.0F : class442.aFloat4918 - (float) (512 * i);
		aFloat10896 = (-1 == i_38_ ? -1.0F : (float) (i_38_ * 512) + class442.aFloat4918);
		aFloat10889 = -1 == i_41_ ? -1.0F : -class442.aFloat4915 - (float) (512 * i_41_);
		aFloat10898 = i_42_ == -1 ? -1.0F : -class442.aFloat4915 + (float) (512 * i_42_);
		aFloat10899 = i_39_ == -1 ? -1.0F : class442.aFloat4919 - (float) (i_39_ * 512);
		aFloat10900 = -1 == i_40_ ? -1.0F : class442.aFloat4919 + (float) (512 * i_40_);
	}

	public void method14260(RSByteBuffer class527_sub38) {
		aClass438_10894.method7025(class527_sub38);
	}

	public void method17183(int i) {
		anInt10897 = 236304571 * i;
	}

	public Class438 method17184() {
		return new Class438(aClass438_10894);
	}
}

/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class195 {
	int anInt2195;
	Class700 aClass700_2196;
	int anInt2197;
	Class536_Sub18 aClass536_Sub18_2198 = new Class536_Sub18();
	Class4 aClass4_2199;
	public static Class5 aClass5_2200;
	public static NativeSprite[] aClass143Array2201;

	public Class195(int i) {
		aClass700_2196 = new Class700();
		anInt2195 = i * -876613321;
		anInt2197 = i * 1498525111;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		aClass4_2199 = new Class4(i_0_);
	}

	public void method2856(Class536_Sub18 class536_sub18, long l) {
		if (anInt2197 * 1465761799 == 0) {
			Class536_Sub18 class536_sub18_1_ = aClass700_2196.method8237(587880634);
			class536_sub18_1_.method6484();
			class536_sub18_1_.method9521(-1142611689);
			if (aClass536_Sub18_2198 == class536_sub18_1_) {
				class536_sub18_1_ = aClass700_2196.method8237(83082638);
				class536_sub18_1_.method6484();
				class536_sub18_1_.method9521(-2131714429);
			}
		} else
			anInt2197 -= 1498525111;
		aClass4_2199.method560(class536_sub18, l);
		aClass700_2196.method8239(class536_sub18, (byte) 43);
	}

	public void method2857(int i) {
		aClass700_2196.method8238(-2047283394);
		aClass4_2199.method561(-2117553523);
		aClass536_Sub18_2198 = new Class536_Sub18();
		anInt2197 = anInt2195 * -556505215;
	}

	public void method2858() {
		aClass700_2196.method8238(-2044093313);
		aClass4_2199.method561(-2117553523);
		aClass536_Sub18_2198 = new Class536_Sub18();
		anInt2197 = anInt2195 * -556505215;
	}

	public Class536_Sub18 method2859(long l) {
		Class536_Sub18 class536_sub18 = (Class536_Sub18) aClass4_2199.method556(l);
		if (class536_sub18 != null)
			aClass700_2196.method8239(class536_sub18, (byte) -22);
		return class536_sub18;
	}

	public void method2860() {
		aClass700_2196.method8238(-1938669205);
		aClass4_2199.method561(-2117553523);
		aClass536_Sub18_2198 = new Class536_Sub18();
		anInt2197 = anInt2195 * -556505215;
	}

	public void method2861() {
		aClass700_2196.method8238(-1927670168);
		aClass4_2199.method561(-2117553523);
		aClass536_Sub18_2198 = new Class536_Sub18();
		anInt2197 = anInt2195 * -556505215;
	}

	static final void method2862(Class668 class668, int i) {
		throw new RuntimeException("");
	}

	static void method2863(int i, short i_2_) {
		Class103.aClass199_1231.method2883(i, -1643516012);
	}

	public static final void method2864(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		Class438.anInt4868 = i * -1221047655;
		Class550.anInt7412 = i_3_ * -186879469;
		Class184_Sub6.anInt9934 = i_4_ * 656354401;
		Class593.anInt7811 = i_5_ * -151939085;
		Class460_Sub1.anInt10291 = 2001317011 * i_6_;
		if (2 == Class246.anInt2474 * 155362615)
			AnimationDetailSetting.method10132(1931500034);
		if (Class460_Sub1.anInt10291 * -699510373 >= 100) {
			int i_8_ = 256 + -590130688 * Class438.anInt4868;
			int i_9_ = Class550.anInt7412 * -28297728 + 256;
			int i_10_ = (Class54.method944(i_8_, i_9_, Class320.anInt3539 * -989431627, 1836643121) - Class184_Sub6.anInt9934 * -565938271);
			int i_11_ = i_8_ - Class637.anInt8301 * -1607026219;
			int i_12_ = i_10_ - Class205_Sub21.anInt9958 * -1598853731;
			int i_13_ = i_9_ - -1646092097 * Class685.anInt8665;
			int i_14_ = (int) Math.sqrt((double) (i_13_ * i_13_ + i_11_ * i_11_));
			Class141.anInt1658 = ((int) (Math.atan2((double) i_12_, (double) i_14_) * 2607.5945876176133) & 0x3fff) * 269246561;
			Class144.anInt1681 = ((int) (Math.atan2((double) i_11_, (double) i_13_) * -2607.5945876176133) & 0x3fff) * 402508199;
			NPCCustomization.anInt3440 = 0;
			if (62800801 * Class141.anInt1658 < 1024)
				Class141.anInt1658 = 830571520;
			if (Class141.anInt1658 * 62800801 > 3072)
				Class141.anInt1658 = -1803252736;
		}
		Class246.anInt2474 = -817602155;
		Class667.anInt8535 = 1594603721;
		Class658.anInt8498 = -662013517;
	}
}

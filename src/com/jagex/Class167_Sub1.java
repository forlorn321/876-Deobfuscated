/* Class167_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class167_Sub1 extends GraphicalRenderer {
	int anInt8993;
	int anInt8994;
	boolean aBool8995;
	int[] anIntArray8996;
	int anInt8997;
	int anInt8998;
	float[] aFloatArray8999;
	int anInt9000;
	int anInt9001;
	float aFloat9002;
	int anInt9003;
	int anInt9004;
	float[][] aFloatArrayArray9005;
	Class107[] aClass107Array9006;
	int anInt9007;
	int anInt9008;
	int anInt9009;
	Class433 aClass433_9010;
	float aFloat9011;
	Class443 aClass443_9012;
	Class443 aClass443_9013;
	boolean aBool9014 = false;
	int anInt9015;
	int anInt9016;
	int anInt9017;
	int anInt9018;
	float aFloat9019;
	Class443 aClass443_9020;
	int anInt9021;
	float aFloat9022;
	float aFloat9023;
	float aFloat9024;
	int anInt9025;
	int anInt9026;
	Class199 aClass199_9027;
	Class199 aClass199_9028;
	NativeSprite aClass143_9029;
	int anInt9030;
	NativeSprite aClass143_9031;
	Class183_Sub2 aClass183_Sub2_9032;

	public Class536_Sub25 method2194(int i) {
		return null;
	}

	Class167_Sub1(Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46) {
		super(class174, interface24, interface47, interface48, interface46);
		aBool8995 = false;
		anInt9000 = 0;
		anInt9001 = 0;
		anInt9021 = 0;
		anInt9003 = 0;
		anInt9007 = 720139463;
		anInt9008 = -1726289762;
		anInt9009 = 1303008810;
		aFloatArrayArray9005 = new float[6][4];
		aFloat9011 = 1.0F;
		aFloat9024 = 0.0F;
		aClass199_9028 = new Class199(16);
		anInt8994 = -333874391;
		try {
			aClass199_9027 = new Class199(10485760, 256);
			aClass433_9010 = new Class433();
			aClass443_9020 = new Class443();
			aClass443_9012 = new Class443();
			aClass443_9013 = new Class443();
			method8464(1);
			method8470(0);
			Class38.method845(true, true, 84200204);
			aBool8995 = true;
			anInt8993 = (int) Class249.method3450(1597046977) * 1474155091;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2005(778784407);
			throw new RuntimeException("");
		}
	}

	public Class145 method2001() {
		return new Class145(0, "Pure Java", 1, "CPU", 0L, false);
	}

	void method2003(int i, int i_0_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8651(i, i_0_);
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(-1915893397);
	}

	public void method2004() {
		/* empty */
	}

	void method2072() {
		if (aBool8995) {
			Class613.method7316(true, false, (short) 192);
			aBool8995 = false;
		}
		aBool9014 = true;
	}

	public void method2007(int i) {
		int i_1_ = i - anInt8993 * 1125269979;
		for (Class536_Sub21 class536_sub21 = (Class536_Sub21) aClass199_9027.method2888(-365121745); null != class536_sub21; class536_sub21 = (Class536_Sub21) aClass199_9027.method2889((byte) 13)) {
			if (class536_sub21.aBool10524) {
				class536_sub21.anInt10522 += i_1_;
				int i_2_ = class536_sub21.anInt10522 / 50;
				if (i_2_ > 0) {
					Class164 class164 = aClass174_1852.method2446(class536_sub21.anInt10521, -35576341);
					float f = (float) (-1174323635 * class164.anInt1815);
					class536_sub21.method9572((int) (f * ((float) i_1_ / 1000.0F * (float) class164.aByte1802 / 64.0F)), (int) (f * ((float) i_1_ / 1000.0F * (float) class164.aByte1803 / 64.0F)));
					class536_sub21.anInt10522 -= 50 * i_2_;
				}
				class536_sub21.aBool10524 = false;
			}
		}
		anInt8993 = 1474155091 * i;
		aClass199_9028.method2883(5, -1060419804);
		aClass199_9027.method2883(5, -1357314783);
	}

	public int method2008() {
		return 0;
	}

	boolean method8443() {
		return aBool9014;
	}

	int[] method8444(int i) {
		Class536_Sub21 class536_sub21;
		synchronized (aClass199_9027) {
			class536_sub21 = ((Class536_Sub21) aClass199_9027.method2886((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (class536_sub21 == null) {
				Class164 class164 = aClass174_1852.method2446(i, -1723236254);
				int i_3_ = class164.anInt1815 * -1174323635;
				if (!anInterface24_1851.method137(Class599.aClass599_7843, i, Class594.aClass594_7815, 0.7F, i_3_, i_3_, true, 2131676103)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class595.aClass595_7820 != class164.aClass595_1805)
					is = anInterface24_1851.method134(Class599.aClass599_7843, i, 0.7F, i_3_, i_3_, true, 233093887);
				else
					is = anInterface24_1851.method133(Class599.aClass599_7843, i, 0.7F, i_3_, i_3_, true, -2065611384);
				class536_sub21 = new Class536_Sub21(i, i_3_, is, (Class595.aClass595_7818 != class164.aClass595_1805));
				aClass199_9027.method2882(class536_sub21, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_3_ * i_3_, (byte) 63);
			}
		}
		class536_sub21.aBool10524 = true;
		return class536_sub21.method9574();
	}

	boolean method8445(int i) {
		Class164 class164 = aClass174_1852.method2446(i, -2019593212);
		return anInterface24_1851.method137(Class599.aClass599_7843, i, Class594.aClass594_7815, 0.7F, -1174323635 * class164.anInt1815, -1174323635 * class164.anInt1815, true, 2049813838);
	}

	int method8446(int i) {
		return aClass174_1852.method2446(i, -83905392).anInt1815 * -1174323635;
	}

	public void method2246(Class433 class433, Class178 class178, Class437 class437) {
		Class443 class443 = method2391();
		class443.method5359(class433);
		class443.method5390(aClass443_9013);
		class178.method2627(class437, aClass443_9012, class443, aFloat9002, aFloat9022, aFloat9019, aFloat9023);
	}

	byte method8447(int i) {
		return aClass174_1852.method2446(i, -2003373112).aByte1806;
	}

	int method8448(int i) {
		return aClass174_1852.method2446(i, -1695277316).aShort1831 & 0xffff;
	}

	boolean method8449(int i) {
		Class164 class164 = aClass174_1852.method2446(i, -1339918839);
		return class164.aByte1807 != 0 || class164.aByte1787 != 0;
	}

	void method2352(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (anIntArray8996 != null && (i_4_ >= -1593163361 * anInt9021 && i_4_ < anInt9003 * -148513205)) {
			if (i < 1352816403 * anInt9000) {
				i_5_ -= 1352816403 * anInt9000 - i;
				i = anInt9000 * 1352816403;
			}
			if (i + i_5_ > 2024498147 * anInt9001)
				i_5_ = 2024498147 * anInt9001 - i;
			int i_8_ = i + i_4_ * (-570111553 * anInt8997);
			int i_9_ = i_6_ >>> 24;
			if (0 == i_7_ || 1 == i_7_ && 255 == i_9_) {
				for (int i_10_ = 0; i_10_ < i_5_; i_10_++)
					anIntArray8996[i_10_ + i_8_] = i_6_;
			} else if (1 == i_7_) {
				i_6_ = ((i_9_ << 24) + (((i_6_ & 0xff00ff) * i_9_ >> 8 & 0xff00ff) + ((i_6_ & 0xff00) * i_9_ >> 8 & 0xff00)));
				int i_11_ = 256 - i_9_;
				for (int i_12_ = 0; i_12_ < i_5_; i_12_++) {
					int i_13_ = anIntArray8996[i_8_ + i_12_];
					i_13_ = (((i_13_ & 0xff00ff) * i_11_ >> 8 & 0xff00ff) + ((i_13_ & 0xff00) * i_11_ >> 8 & 0xff00));
					anIntArray8996[i_12_ + i_8_] = i_13_ + i_6_;
				}
			} else if (i_7_ == 2) {
				for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
					int i_15_ = anIntArray8996[i_8_ + i_14_];
					int i_16_ = i_6_ + i_15_;
					int i_17_ = (i_15_ & 0xff00ff) + (i_6_ & 0xff00ff);
					i_15_ = (i_17_ & 0x1000100) + (i_16_ - i_17_ & 0x10000);
					anIntArray8996[i_8_ + i_14_] = i_16_ - i_15_ | i_15_ - (i_15_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2211(int i, int i_18_, int i_19_, int i_20_) {
		if (i < 0)
			i = 0;
		if (i_18_ < 0)
			i_18_ = 0;
		if (i_19_ > anInt8997 * -570111553)
			i_19_ = -570111553 * anInt8997;
		if (i_20_ > -1805705211 * anInt8998)
			i_20_ = -1805705211 * anInt8998;
		anInt9000 = i * -1951331557;
		anInt9001 = i_19_ * 391182795;
		anInt9021 = i_18_ * 1128831583;
		anInt9003 = 1669823331 * i_20_;
		method8451();
	}

	public boolean method2011() {
		return true;
	}

	public boolean method2013() {
		return false;
	}

	public void method2348(int i, int i_21_, int i_22_) {
		/* empty */
	}

	public boolean method2012() {
		return false;
	}

	public void method2208(float f, float f_23_) {
		aFloat9011 = f_23_ - f;
		aFloat9024 = f + f_23_ - 1.0F;
		for (int i = 0; i < 1953374867 * anInt9025; i++) {
			Class107 class107 = aClass107Array9006[i];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1445 = aFloat9011;
			class117.aFloat1444 = aFloat9024;
		}
	}

	public void method2123() {
		/* empty */
	}

	public boolean method2407() {
		return false;
	}

	public boolean method2061() {
		return true;
	}

	public String method2018() {
		return "";
	}

	public int[] method2019() {
		return null;
	}

	public void method2134(boolean bool) {
		/* empty */
	}

	Class183_Sub1 method2131(Canvas canvas, int i, int i_24_) {
		return Class21.method710(this, canvas, i, i_24_, 1015599243);
	}

	void method8450(int i, int i_25_, int[] is, float[] fs) {
		anInt8997 = 1361061439 * i;
		anInt8998 = 235973837 * i_25_;
		anIntArray8996 = is;
		aFloatArray8999 = fs;
		for (int i_26_ = 0; i_26_ < 1953374867 * anInt9025; i_26_++)
			aClass107Array9006[i_26_].method1434(-1206243132);
		method2051();
		method2047();
	}

	public int[] getPixelArea(int i, int i_27_, int i_28_, int i_29_) {
		if (null == anIntArray8996)
			throw new IllegalStateException("");
		int[] is = new int[i_29_ * i_28_];
		int i_30_ = 0;
		for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
			int i_32_ = i + -570111553 * anInt8997 * (i_31_ + i_27_);
			for (int i_33_ = 0; i_33_ < i_28_; i_33_++)
				is[i_30_++] = anIntArray8996[i_32_ + i_33_];
		}
		return is;
	}

	public void method2034() {
		/* empty */
	}

	public boolean method2014() {
		return false;
	}

	public void method2329(int i, int i_34_, float f, int i_35_, int i_36_, float f_37_, int i_38_, int i_39_, float f_40_, int i_41_, int i_42_, int i_43_, int i_44_) {
		boolean bool = anIntArray8996 != null;
		boolean bool_45_ = null != aFloatArray8999;
		if (bool || bool_45_) {
			Class107 class107 = method8458(Thread.currentThread());
			Class117 class117 = class107.aClass117_1290;
			class117.aBool1434 = false;
			i -= 1352816403 * anInt9000;
			i_35_ -= anInt9000 * 1352816403;
			i_38_ -= 1352816403 * anInt9000;
			i_34_ -= anInt9021 * -1593163361;
			i_36_ -= -1593163361 * anInt9021;
			i_39_ -= anInt9021 * -1593163361;
			class117.aBool1449 = (i < 0 || i > class117.anInt1441 || i_35_ < 0 || i_35_ > class117.anInt1441 || i_38_ < 0 || i_38_ > class117.anInt1441);
			int i_46_ = i_41_ >>> 24;
			if (i_44_ == 0 || 1 == i_44_ && 255 == i_46_) {
				class117.anInt1436 = 0;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_45_, false, (float) i_34_, (float) i_36_, (float) i_39_, (float) i, (float) i_35_, (float) i_38_, f, f_37_, f_40_, i_41_, i_42_, i_43_);
			} else if (1 == i_44_) {
				class117.anInt1436 = 255 - i_46_;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_45_, false, (float) i_34_, (float) i_36_, (float) i_39_, (float) i, (float) i_35_, (float) i_38_, f, f_37_, f_40_, i_41_, i_42_, i_43_);
			} else if (i_44_ == 2) {
				class117.anInt1436 = 128;
				class117.aBool1435 = true;
				class117.method1504(bool, bool_45_, false, (float) i_34_, (float) i_36_, (float) i_39_, (float) i, (float) i_35_, (float) i_38_, f, f_37_, f_40_, i_41_, i_42_, i_43_);
			} else
				throw new IllegalArgumentException();
			class117.aBool1434 = true;
		}
	}

	public Class160 method2162(int i, int i_47_, int[][] is, int[][] is_48_, int i_49_, int i_50_, int i_51_) {
		return new Class160_Sub3(this, i_50_, i_51_, i, i_47_, is, is_48_, i_49_);
	}

	public boolean method2037() {
		return false;
	}

	public Class443 method2103() {
		return new Class443(aClass443_9012);
	}

	public void method2105(int i, float f, float f_52_, float f_53_, float f_54_, float f_55_) {
		anInt9007 = -1282578887 * (int) (f * 65535.0F);
		anInt9008 = -381993433 * (int) (65535.0F * f_52_);
		float f_56_ = (float) Math.sqrt((double) (f_55_ * f_55_ + (f_53_ * f_53_ + f_54_ * f_54_)));
		anInt9004 = 2048043533 * (int) (f_53_ * 65535.0F / f_56_);
		anInt9016 = -118062721 * (int) (65535.0F * f_54_ / f_56_);
		anInt9026 = -822560063 * (int) (65535.0F * f_55_ / f_56_);
	}

	public void method2041(int i, int i_57_, int i_58_) {
		/* empty */
	}

	public void method2362(int i, float f, float f_59_, float f_60_, float f_61_, float f_62_) {
		anInt9007 = -1282578887 * (int) (f * 65535.0F);
		anInt9008 = -381993433 * (int) (65535.0F * f_59_);
		float f_63_ = (float) Math.sqrt((double) (f_62_ * f_62_ + (f_60_ * f_60_ + f_61_ * f_61_)));
		anInt9004 = 2048043533 * (int) (f_60_ * 65535.0F / f_63_);
		anInt9016 = -118062721 * (int) (65535.0F * f_61_ / f_63_);
		anInt9026 = -822560063 * (int) (65535.0F * f_62_ / f_63_);
	}

	public long method2042(int i, int i_64_) {
		return 0L;
	}

	public void method2044(int i, int i_65_, int[] is, int[] is_66_) {
		method2045(i, i_65_, -2091854026);
		if (aClass143_9031 == null || aClass143_9031.method1720() != i || aClass143_9031.method1752() != i_65_) {
			aClass143_9031 = method2050(i, i_65_, true, true);
			aClass183_Sub2_9032 = null;
		}
		if (null == aClass183_Sub2_9032) {
			aClass183_Sub2_9032 = method2304();
			aClass183_Sub2_9032.method9035(0, aClass143_9031.method1782());
		}
		Class143_Sub1_Sub1 class143_sub1_sub1 = new Class143_Sub1_Sub1(this, anIntArray8996, anInt8997 * -570111553, anInt8998 * -1805705211);
		method2028(aClass183_Sub2_9032, -409819235);
		method2000(1, -16777216);
		class143_sub1_sub1.method1732(1475697639 * anInt1872, 398729877 * anInt1873, -397142117 * anInt1856, anInt1875 * -915384365, 1, 0, 0, 0);
		aClass143_9031.method1761(0, 0, i, i_65_, is, is_66_, 0, i);
		method2029(aClass183_Sub2_9032, (byte) 1);
	}

	public void method2393() {
		aClass183_Sub2_9032 = null;
		aClass143_9031 = null;
	}

	public void method2219(int i, int i_67_) {
		if (0 != (i & 0x1))
			method2063(0, 0, -570111553 * anInt8997, anInt8998 * -1805705211, i_67_, 0);
		if (0 != (i & 0x2))
			method8460();
	}

	public void method2302(boolean bool) {
		Class107 class107 = method8458(Thread.currentThread());
		class107.aBool1285 = bool;
	}

	public boolean method2055() {
		return false;
	}

	public void method2325() {
		for (int i = 0; i < aClass107Array9006.length; i++) {
			aClass107Array9006[i].anInt1282 = aClass107Array9006[i].anInt1283 * -785127203;
			aClass107Array9006[i].aBool1284 = false;
		}
	}

	public void method2049(int[] is) {
		is[0] = anInt9017 * -827223259;
		is[1] = anInt9030 * -1948273843;
		is[2] = anInt9015 * 1903828807;
		is[3] = 726486027 * anInt9018;
	}

	public void method2039(float f, float f_68_) {
		aFloat9011 = f_68_ - f;
		aFloat9024 = f + f_68_ - 1.0F;
		for (int i = 0; i < 1953374867 * anInt9025; i++) {
			Class107 class107 = aClass107Array9006[i];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1445 = aFloat9011;
			class117.aFloat1444 = aFloat9024;
		}
	}

	void method8451() {
		int i = 2024498147 * anInt9001 - 1352816403 * anInt9000;
		int i_69_ = anInt9003 * -148513205 - anInt9021 * -1593163361;
		float f = aFloat9019 = (float) (anInt9015 * 1903828807) / 2.0F;
		float f_70_ = aFloat9023 = (float) (anInt9018 * 726486027) / 2.0F;
		aFloat9002 = f + (float) (anInt9017 * -827223259);
		aFloat9022 = (float) (anInt9030 * -1948273843) + f_70_;
		for (int i_71_ = 0; i_71_ < anInt9025 * 1953374867; i_71_++) {
			Class107 class107 = aClass107Array9006[i_71_];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1459 = f;
			class117.aFloat1439 = f_70_;
			class117.aFloat1462 = aFloat9002 - (float) (anInt9000 * 1352816403);
			class117.aFloat1442 = aFloat9022 - (float) (-1593163361 * anInt9021);
			class117.anInt1441 = i;
			class117.anInt1460 = i_69_;
		}
		int i_72_ = (anInt8997 * -570111553 * (-1593163361 * anInt9021) + 1352816403 * anInt9000);
		for (int i_73_ = -1593163361 * anInt9021; i_73_ < -148513205 * anInt9003; i_73_++) {
			for (int i_74_ = 0; i_74_ < 1953374867 * anInt9025; i_74_++)
				aClass107Array9006[i_74_].aClass117_1290.anIntArray1446[i_73_ - anInt9021 * -1593163361] = i_72_;
			i_72_ += -570111553 * anInt8997;
		}
	}

	public void method2047() {
		anInt9017 = 0;
		anInt9030 = 0;
		anInt9015 = -299405879 * anInt8997;
		anInt9018 = 16432687 * anInt8998;
		method8451();
	}

	public void method2215(int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
		if (null != anIntArray8996) {
			Class107 class107 = method8458(Thread.currentThread());
			Class117 class117 = class107.aClass117_1290;
			int i_81_ = i_76_ - i;
			int i_82_ = i_77_ - i_75_;
			int i_83_ = i_81_ >= 0 ? i_81_ : -i_81_;
			int i_84_ = i_82_ >= 0 ? i_82_ : -i_82_;
			int i_85_ = i_83_;
			if (i_85_ < i_84_)
				i_85_ = i_84_;
			if (i_85_ != 0) {
				int i_86_ = (i_81_ << 16) / i_85_;
				int i_87_ = (i_82_ << 16) / i_85_;
				i_81_ += i_86_ >> 16;
				i_82_ += i_87_ >> 16;
				if (i_87_ <= i_86_)
					i_86_ = -i_86_;
				else
					i_87_ = -i_87_;
				int i_88_ = i_87_ * i_79_ >> 17;
				int i_89_ = i_87_ * i_79_ + 1 >> 17;
				int i_90_ = i_79_ * i_86_ >> 17;
				int i_91_ = 1 + i_79_ * i_86_ >> 17;
				i -= class117.method1490();
				i_75_ -= class117.method1503();
				int i_92_ = i_88_ + i;
				int i_93_ = i - i_89_;
				int i_94_ = i_81_ + i - i_89_;
				int i_95_ = i_81_ + i + i_88_;
				int i_96_ = i_90_ + i_75_;
				int i_97_ = i_75_ - i_91_;
				int i_98_ = i_75_ + i_82_ - i_91_;
				int i_99_ = i_75_ + i_82_ + i_90_;
				if (i_80_ == 0)
					class117.anInt1436 = 0;
				else if (1 == i_80_)
					class117.anInt1436 = 255 - (i_78_ >>> 24);
				else
					throw new IllegalArgumentException();
				method2302(false);
				class117.aBool1449 = (i_92_ < 0 || i_92_ > class117.anInt1441 || i_93_ < 0 || i_93_ > class117.anInt1441 || i_94_ < 0 || i_94_ > class117.anInt1441);
				class117.method1507(true, false, false, (float) i_96_, (float) i_97_, (float) i_98_, (float) i_92_, (float) i_93_, (float) i_94_, 100.0F, 100.0F, 100.0F, i_78_);
				class117.aBool1449 = (i_92_ < 0 || i_92_ > class117.anInt1441 || i_94_ < 0 || i_94_ > class117.anInt1441 || i_95_ < 0 || i_95_ > class117.anInt1441);
				class117.method1507(true, false, false, (float) i_96_, (float) i_98_, (float) i_99_, (float) i_92_, (float) i_94_, (float) i_95_, 100.0F, 100.0F, 100.0F, i_78_);
				method2302(true);
			}
		}
	}

	public void method2196(int i, int i_100_, int i_101_, int i_102_) {
		if (anInt9000 * 1352816403 < i)
			anInt9000 = -1951331557 * i;
		if (anInt9021 * -1593163361 < i_100_)
			anInt9021 = 1128831583 * i_100_;
		if (2024498147 * anInt9001 > i_101_)
			anInt9001 = 391182795 * i_101_;
		if (-148513205 * anInt9003 > i_102_)
			anInt9003 = i_102_ * 1669823331;
		method8451();
	}

	public void method2054(int[] is) {
		is[0] = anInt9000 * 1352816403;
		is[1] = anInt9021 * -1593163361;
		is[2] = 2024498147 * anInt9001;
		is[3] = -148513205 * anInt9003;
	}

	public Class176 method2111(int i) {
		return null;
	}

	public void method2062(int i, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
		method2066(i, i_103_, i_104_, i_106_, i_107_);
		method2066(i, i_105_ + i_103_ - 1, i_104_, i_106_, i_107_);
		method2067(i, i_103_ + 1, i_105_ - 2, i_106_, i_107_);
		method2067(i + i_104_ - 1, 1 + i_103_, i_105_ - 2, i_106_, i_107_);
	}

	void method2174(int i, int i_108_, int i_109_, int i_110_, int i_111_) {
		if (null != anIntArray8996) {
			if (i_109_ < 0)
				i_109_ = -i_109_;
			int i_112_ = i_108_ - i_109_;
			if (i_112_ < -1593163361 * anInt9021)
				i_112_ = anInt9021 * -1593163361;
			int i_113_ = 1 + (i_108_ + i_109_);
			if (i_113_ > -148513205 * anInt9003)
				i_113_ = anInt9003 * -148513205;
			int i_114_ = i_112_;
			int i_115_ = i_109_ * i_109_;
			int i_116_ = 0;
			int i_117_ = i_108_ - i_114_;
			int i_118_ = i_117_ * i_117_;
			int i_119_ = i_118_ - i_117_;
			if (i_108_ > i_113_)
				i_108_ = i_113_;
			int i_120_ = i_110_ >>> 24;
			if (i_111_ == 0 || i_111_ == 1 && i_120_ == 255) {
				while (i_114_ < i_108_) {
					for (/**/; i_119_ <= i_115_ || i_118_ <= i_115_; i_119_ += i_116_++ + i_116_)
						i_118_ += i_116_ + i_116_;
					int i_121_ = 1 + (i - i_116_);
					if (i_121_ < 1352816403 * anInt9000)
						i_121_ = 1352816403 * anInt9000;
					int i_122_ = i_116_ + i;
					if (i_122_ > 2024498147 * anInt9001)
						i_122_ = anInt9001 * 2024498147;
					int i_123_ = -570111553 * anInt8997 * i_114_ + i_121_;
					for (int i_124_ = i_121_; i_124_ < i_122_; i_124_++)
						anIntArray8996[i_123_++] = i_110_;
					i_114_++;
					i_118_ -= i_117_-- + i_117_;
					i_119_ -= i_117_ + i_117_;
				}
				i_116_ = i_109_;
				i_117_ = i_114_ - i_108_;
				i_119_ = i_115_ + i_117_ * i_117_;
				i_118_ = i_119_ - i_116_;
				i_119_ -= i_117_;
				while (i_114_ < i_113_) {
					for (/**/; i_119_ > i_115_ && i_118_ > i_115_; i_118_ -= i_116_ + i_116_)
						i_119_ -= i_116_-- + i_116_;
					int i_125_ = i - i_116_;
					if (i_125_ < anInt9000 * 1352816403)
						i_125_ = 1352816403 * anInt9000;
					int i_126_ = i_116_ + i;
					if (i_126_ > 2024498147 * anInt9001 - 1)
						i_126_ = 2024498147 * anInt9001 - 1;
					int i_127_ = i_114_ * (anInt8997 * -570111553) + i_125_;
					for (int i_128_ = i_125_; i_128_ <= i_126_; i_128_++)
						anIntArray8996[i_127_++] = i_110_;
					i_114_++;
					i_119_ += i_117_ + i_117_;
					i_118_ += i_117_++ + i_117_;
				}
			} else if (i_111_ == 1) {
				i_110_ = (((i_110_ & 0xff00ff) * i_120_ >> 8 & 0xff00ff) + ((i_110_ & 0xff00) * i_120_ >> 8 & 0xff00) + (i_120_ << 24));
				int i_129_ = 256 - i_120_;
				while (i_114_ < i_108_) {
					for (/**/; i_119_ <= i_115_ || i_118_ <= i_115_; i_119_ += i_116_++ + i_116_)
						i_118_ += i_116_ + i_116_;
					int i_130_ = i - i_116_ + 1;
					if (i_130_ < anInt9000 * 1352816403)
						i_130_ = anInt9000 * 1352816403;
					int i_131_ = i_116_ + i;
					if (i_131_ > 2024498147 * anInt9001)
						i_131_ = anInt9001 * 2024498147;
					int i_132_ = i_114_ * (anInt8997 * -570111553) + i_130_;
					for (int i_133_ = i_130_; i_133_ < i_131_; i_133_++) {
						int i_134_ = anIntArray8996[i_132_];
						i_134_ = (((i_134_ & 0xff00) * i_129_ >> 8 & 0xff00) + (i_129_ * (i_134_ & 0xff00ff) >> 8 & 0xff00ff));
						anIntArray8996[i_132_++] = i_110_ + i_134_;
					}
					i_114_++;
					i_118_ -= i_117_-- + i_117_;
					i_119_ -= i_117_ + i_117_;
				}
				i_116_ = i_109_;
				i_117_ = -i_117_;
				i_119_ = i_115_ + i_117_ * i_117_;
				i_118_ = i_119_ - i_116_;
				i_119_ -= i_117_;
				while (i_114_ < i_113_) {
					for (/**/; i_119_ > i_115_ && i_118_ > i_115_; i_118_ -= i_116_ + i_116_)
						i_119_ -= i_116_-- + i_116_;
					int i_135_ = i - i_116_;
					if (i_135_ < anInt9000 * 1352816403)
						i_135_ = 1352816403 * anInt9000;
					int i_136_ = i + i_116_;
					if (i_136_ > 2024498147 * anInt9001 - 1)
						i_136_ = 2024498147 * anInt9001 - 1;
					int i_137_ = anInt8997 * -570111553 * i_114_ + i_135_;
					for (int i_138_ = i_135_; i_138_ <= i_136_; i_138_++) {
						int i_139_ = anIntArray8996[i_137_];
						i_139_ = (((i_139_ & 0xff00ff) * i_129_ >> 8 & 0xff00ff) + ((i_139_ & 0xff00) * i_129_ >> 8 & 0xff00));
						anIntArray8996[i_137_++] = i_139_ + i_110_;
					}
					i_114_++;
					i_119_ += i_117_ + i_117_;
					i_118_ += i_117_++ + i_117_;
				}
			} else if (2 == i_111_) {
				while (i_114_ < i_108_) {
					for (/**/; i_119_ <= i_115_ || i_118_ <= i_115_; i_119_ += i_116_++ + i_116_)
						i_118_ += i_116_ + i_116_;
					int i_140_ = i - i_116_ + 1;
					if (i_140_ < 1352816403 * anInt9000)
						i_140_ = anInt9000 * 1352816403;
					int i_141_ = i_116_ + i;
					if (i_141_ > 2024498147 * anInt9001)
						i_141_ = anInt9001 * 2024498147;
					int i_142_ = i_140_ + anInt8997 * -570111553 * i_114_;
					for (int i_143_ = i_140_; i_143_ < i_141_; i_143_++) {
						int i_144_ = anIntArray8996[i_142_];
						int i_145_ = i_110_ + i_144_;
						int i_146_ = (i_110_ & 0xff00ff) + (i_144_ & 0xff00ff);
						i_144_ = (i_145_ - i_146_ & 0x10000) + (i_146_ & 0x1000100);
						anIntArray8996[i_142_++] = i_145_ - i_144_ | i_144_ - (i_144_ >>> 8);
					}
					i_114_++;
					i_118_ -= i_117_-- + i_117_;
					i_119_ -= i_117_ + i_117_;
				}
				i_116_ = i_109_;
				i_117_ = -i_117_;
				i_119_ = i_117_ * i_117_ + i_115_;
				i_118_ = i_119_ - i_116_;
				i_119_ -= i_117_;
				while (i_114_ < i_113_) {
					for (/**/; i_119_ > i_115_ && i_118_ > i_115_; i_118_ -= i_116_ + i_116_)
						i_119_ -= i_116_-- + i_116_;
					int i_147_ = i - i_116_;
					if (i_147_ < anInt9000 * 1352816403)
						i_147_ = anInt9000 * 1352816403;
					int i_148_ = i_116_ + i;
					if (i_148_ > 2024498147 * anInt9001 - 1)
						i_148_ = anInt9001 * 2024498147 - 1;
					int i_149_ = i_114_ * (-570111553 * anInt8997) + i_147_;
					for (int i_150_ = i_147_; i_150_ <= i_148_; i_150_++) {
						int i_151_ = anIntArray8996[i_149_];
						int i_152_ = i_110_ + i_151_;
						int i_153_ = (i_151_ & 0xff00ff) + (i_110_ & 0xff00ff);
						i_151_ = (i_153_ & 0x1000100) + (i_152_ - i_153_ & 0x10000);
						anIntArray8996[i_149_++] = i_152_ - i_151_ | i_151_ - (i_151_ >>> 8);
					}
					i_114_++;
					i_119_ += i_117_ + i_117_;
					i_118_ += i_117_++ + i_117_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method2066(int i, int i_154_, int i_155_, int i_156_, int i_157_) {
		if (anIntArray8996 != null && (i_154_ >= -1593163361 * anInt9021 && i_154_ < anInt9003 * -148513205)) {
			if (i < 1352816403 * anInt9000) {
				i_155_ -= 1352816403 * anInt9000 - i;
				i = anInt9000 * 1352816403;
			}
			if (i + i_155_ > 2024498147 * anInt9001)
				i_155_ = 2024498147 * anInt9001 - i;
			int i_158_ = i + i_154_ * (-570111553 * anInt8997);
			int i_159_ = i_156_ >>> 24;
			if (0 == i_157_ || 1 == i_157_ && 255 == i_159_) {
				for (int i_160_ = 0; i_160_ < i_155_; i_160_++)
					anIntArray8996[i_160_ + i_158_] = i_156_;
			} else if (1 == i_157_) {
				i_156_ = ((i_159_ << 24) + (((i_156_ & 0xff00ff) * i_159_ >> 8 & 0xff00ff) + ((i_156_ & 0xff00) * i_159_ >> 8 & 0xff00)));
				int i_161_ = 256 - i_159_;
				for (int i_162_ = 0; i_162_ < i_155_; i_162_++) {
					int i_163_ = anIntArray8996[i_158_ + i_162_];
					i_163_ = (((i_163_ & 0xff00ff) * i_161_ >> 8 & 0xff00ff) + ((i_163_ & 0xff00) * i_161_ >> 8 & 0xff00));
					anIntArray8996[i_162_ + i_158_] = i_163_ + i_156_;
				}
			} else if (i_157_ == 2) {
				for (int i_164_ = 0; i_164_ < i_155_; i_164_++) {
					int i_165_ = anIntArray8996[i_158_ + i_164_];
					int i_166_ = i_156_ + i_165_;
					int i_167_ = (i_165_ & 0xff00ff) + (i_156_ & 0xff00ff);
					i_165_ = (i_167_ & 0x1000100) + (i_166_ - i_167_ & 0x10000);
					anIntArray8996[i_158_ + i_164_] = i_166_ - i_165_ | i_165_ - (i_165_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method8452(int i, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_) {
		if (null != anIntArray8996 && (i_168_ >= -1593163361 * anInt9021 && i_168_ < anInt9003 * -148513205)) {
			int i_175_ = -570111553 * anInt8997 * i_168_ + i;
			int i_176_ = i_170_ >>> 24;
			int i_177_ = i_172_ + i_173_;
			int i_178_ = i_174_ % i_177_;
			if (i_171_ == 0 || 1 == i_171_ && i_176_ == 255) {
				int i_179_ = 0;
				while (i_179_ < i_169_) {
					if (i + i_179_ >= 1352816403 * anInt9000 && i + i_179_ < anInt9001 * 2024498147 && i_178_ < i_172_)
						anIntArray8996[i_179_ + i_175_] = i_170_;
					i_179_++;
					i_178_ = ++i_178_ % i_177_;
				}
			} else if (i_171_ == 1) {
				i_170_ = (((i_170_ & 0xff00) * i_176_ >> 8 & 0xff00) + (i_176_ * (i_170_ & 0xff00ff) >> 8 & 0xff00ff) + (i_176_ << 24));
				int i_180_ = 256 - i_176_;
				int i_181_ = 0;
				while (i_181_ < i_169_) {
					if (i + i_181_ >= anInt9000 * 1352816403 && i + i_181_ < 2024498147 * anInt9001 && i_178_ < i_172_) {
						int i_182_ = anIntArray8996[i_175_ + i_181_];
						i_182_ = ((i_180_ * (i_182_ & 0xff00) >> 8 & 0xff00) + ((i_182_ & 0xff00ff) * i_180_ >> 8 & 0xff00ff));
						anIntArray8996[i_181_ + i_175_] = i_170_ + i_182_;
					}
					i_181_++;
					i_178_ = ++i_178_ % i_177_;
				}
			} else if (2 == i_171_) {
				int i_183_ = 0;
				while (i_183_ < i_169_) {
					if (i + i_183_ >= 1352816403 * anInt9000 && i_183_ + i < 2024498147 * anInt9001 && i_178_ < i_172_) {
						int i_184_ = anIntArray8996[i_183_ + i_175_];
						int i_185_ = i_184_ + i_170_;
						int i_186_ = (i_184_ & 0xff00ff) + (i_170_ & 0xff00ff);
						i_184_ = (i_185_ - i_186_ & 0x10000) + (i_186_ & 0x1000100);
						anIntArray8996[i_175_ + i_183_] = i_185_ - i_184_ | i_184_ - (i_184_ >>> 8);
					}
					i_183_++;
					i_178_ = ++i_178_ % i_177_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method2067(int i, int i_187_, int i_188_, int i_189_, int i_190_) {
		if (anIntArray8996 != null && (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147)) {
			if (i_187_ < anInt9021 * -1593163361) {
				i_188_ -= -1593163361 * anInt9021 - i_187_;
				i_187_ = -1593163361 * anInt9021;
			}
			if (i_187_ + i_188_ > anInt9003 * -148513205)
				i_188_ = anInt9003 * -148513205 - i_187_;
			int i_191_ = i + -570111553 * anInt8997 * i_187_;
			int i_192_ = i_189_ >>> 24;
			if (0 == i_190_ || i_190_ == 1 && 255 == i_192_) {
				for (int i_193_ = 0; i_193_ < i_188_; i_193_++)
					anIntArray8996[-570111553 * anInt8997 * i_193_ + i_191_] = i_189_;
			} else if (1 == i_190_) {
				i_189_ = ((i_192_ * (i_189_ & 0xff00) >> 8 & 0xff00) + (i_192_ * (i_189_ & 0xff00ff) >> 8 & 0xff00ff) + (i_192_ << 24));
				int i_194_ = 256 - i_192_;
				for (int i_195_ = 0; i_195_ < i_188_; i_195_++) {
					int i_196_ = i_191_ + -570111553 * anInt8997 * i_195_;
					int i_197_ = anIntArray8996[i_196_];
					i_197_ = (((i_197_ & 0xff00) * i_194_ >> 8 & 0xff00) + ((i_197_ & 0xff00ff) * i_194_ >> 8 & 0xff00ff));
					anIntArray8996[i_196_] = i_197_ + i_189_;
				}
			} else if (2 == i_190_) {
				for (int i_198_ = 0; i_198_ < i_188_; i_198_++) {
					int i_199_ = -570111553 * anInt8997 * i_198_ + i_191_;
					int i_200_ = anIntArray8996[i_199_];
					int i_201_ = i_200_ + i_189_;
					int i_202_ = (i_200_ & 0xff00ff) + (i_189_ & 0xff00ff);
					i_200_ = (i_202_ & 0x1000100) + (i_201_ - i_202_ & 0x10000);
					anIntArray8996[i_199_] = i_201_ - i_200_ | i_200_ - (i_200_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method8453(int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_) {
		if (null != anIntArray8996 && (i >= 1352816403 * anInt9000 && i < anInt9001 * 2024498147)) {
			int i_210_ = i_203_ * (anInt8997 * -570111553) + i;
			int i_211_ = i_205_ >>> 24;
			int i_212_ = i_207_ + i_208_;
			int i_213_ = i_209_ % i_212_;
			if (0 == i_206_ || i_206_ == 1 && 255 == i_211_) {
				int i_214_ = 0;
				while (i_214_ < i_204_) {
					if (i_214_ + i_203_ >= -1593163361 * anInt9021 && i_214_ + i_203_ < -148513205 * anInt9003 && i_213_ < i_207_)
						anIntArray8996[(anInt8997 * -570111553 * i_214_ + i_210_)] = i_205_;
					i_214_++;
					i_213_ = ++i_213_ % i_212_;
				}
			} else if (i_206_ == 1) {
				i_205_ = ((i_211_ << 24) + ((i_211_ * (i_205_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_205_ & 0xff00) * i_211_ >> 8 & 0xff00)));
				int i_215_ = 256 - i_211_;
				int i_216_ = 0;
				while (i_216_ < i_204_) {
					if (i_216_ + i_203_ >= anInt9021 * -1593163361 && i_203_ + i_216_ < -148513205 * anInt9003 && i_213_ < i_207_) {
						int i_217_ = -570111553 * anInt8997 * i_216_ + i_210_;
						int i_218_ = anIntArray8996[i_217_];
						i_218_ = (((i_218_ & 0xff00) * i_215_ >> 8 & 0xff00) + (i_215_ * (i_218_ & 0xff00ff) >> 8 & 0xff00ff));
						anIntArray8996[i_217_] = i_218_ + i_205_;
					}
					i_216_++;
					i_213_ = ++i_213_ % i_212_;
				}
			} else if (i_206_ == 2) {
				int i_219_ = 0;
				while (i_219_ < i_204_) {
					if (i_219_ + i_203_ >= -1593163361 * anInt9021 && i_219_ + i_203_ < -148513205 * anInt9003 && i_213_ < i_207_) {
						int i_220_ = i_210_ + -570111553 * anInt8997 * i_219_;
						int i_221_ = anIntArray8996[i_220_];
						int i_222_ = i_205_ + i_221_;
						int i_223_ = (i_221_ & 0xff00ff) + (i_205_ & 0xff00ff);
						i_221_ = (i_222_ - i_223_ & 0x10000) + (i_223_ & 0x1000100);
						anIntArray8996[i_220_] = i_222_ - i_221_ | i_221_ - (i_221_ >>> 8);
					}
					i_219_++;
					i_213_ = ++i_213_ % i_212_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2277(int i, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_) {
		if (null != anIntArray8996) {
			i_225_ -= i;
			i_226_ -= i_224_;
			if (i_226_ == 0) {
				if (i_225_ >= 0)
					method2066(i, i_224_, 1 + i_225_, i_227_, i_228_);
				else
					method2066(i_225_ + i, i_224_, 1 + -i_225_, i_227_, i_228_);
			} else if (0 == i_225_) {
				if (i_226_ >= 0)
					method2067(i, i_224_, i_226_ + 1, i_227_, i_228_);
				else
					method2067(i, i_226_ + i_224_, -i_226_ + 1, i_227_, i_228_);
			} else {
				if (i_225_ + i_226_ < 0) {
					i += i_225_;
					i_225_ = -i_225_;
					i_224_ += i_226_;
					i_226_ = -i_226_;
				}
				if (i_225_ > i_226_) {
					i_224_ <<= 16;
					i_224_ += 32768;
					i_226_ <<= 16;
					int i_229_ = (int) Math.floor(0.5 + ((double) i_226_ / (double) i_225_));
					i_225_ += i;
					if (i < 1352816403 * anInt9000) {
						i_224_ += i_229_ * (anInt9000 * 1352816403 - i);
						i = 1352816403 * anInt9000;
					}
					if (i_225_ >= anInt9001 * 2024498147)
						i_225_ = 2024498147 * anInt9001 - 1;
					int i_230_ = i_227_ >>> 24;
					if (0 == i_228_ || i_228_ == 1 && i_230_ == 255) {
						for (/**/; i <= i_225_; i++) {
							int i_231_ = i_224_ >> 16;
							if (i_231_ >= -1593163361 * anInt9021 && i_231_ < anInt9003 * -148513205)
								anIntArray8996[i_231_ * (anInt8997 * -570111553) + i] = i_227_;
							i_224_ += i_229_;
						}
					} else if (1 == i_228_) {
						i_227_ = (((i_227_ & 0xff00) * i_230_ >> 8 & 0xff00) + (i_230_ * (i_227_ & 0xff00ff) >> 8 & 0xff00ff) + (i_230_ << 24));
						int i_232_ = 256 - i_230_;
						for (/**/; i <= i_225_; i++) {
							int i_233_ = i_224_ >> 16;
							if (i_233_ >= -1593163361 * anInt9021 && i_233_ < -148513205 * anInt9003) {
								int i_234_ = anInt8997 * -570111553 * i_233_ + i;
								int i_235_ = anIntArray8996[i_234_];
								i_235_ = ((i_232_ * (i_235_ & 0xff00ff) >> 8 & 0xff00ff) + (i_232_ * (i_235_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_234_] = i_235_ + i_227_;
							}
							i_224_ += i_229_;
						}
					} else if (2 == i_228_) {
						for (/**/; i <= i_225_; i++) {
							int i_236_ = i_224_ >> 16;
							if (i_236_ >= anInt9021 * -1593163361 && i_236_ < anInt9003 * -148513205) {
								int i_237_ = anInt8997 * -570111553 * i_236_ + i;
								int i_238_ = anIntArray8996[i_237_];
								int i_239_ = i_227_ + i_238_;
								int i_240_ = ((i_238_ & 0xff00ff) + (i_227_ & 0xff00ff));
								i_238_ = (i_240_ & 0x1000100) + (i_239_ - i_240_ & 0x10000);
								anIntArray8996[i_237_] = i_239_ - i_238_ | i_238_ - (i_238_ >>> 8);
							}
							i_224_ += i_229_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_225_ <<= 16;
					int i_241_ = (int) Math.floor(0.5 + ((double) i_225_ / (double) i_226_));
					i_226_ += i_224_;
					if (i_224_ < -1593163361 * anInt9021) {
						i += i_241_ * (-1593163361 * anInt9021 - i_224_);
						i_224_ = -1593163361 * anInt9021;
					}
					if (i_226_ >= -148513205 * anInt9003)
						i_226_ = anInt9003 * -148513205 - 1;
					int i_242_ = i_227_ >>> 24;
					if (0 == i_228_ || i_228_ == 1 && 255 == i_242_) {
						for (/**/; i_224_ <= i_226_; i_224_++) {
							int i_243_ = i >> 16;
							if (i_243_ >= anInt9000 * 1352816403 && i_243_ < anInt9001 * 2024498147)
								anIntArray8996[(-570111553 * anInt8997 * i_224_ + i_243_)] = i_227_;
							i += i_241_;
						}
					} else if (1 == i_228_) {
						i_227_ = ((i_242_ << 24) + ((i_242_ * (i_227_ & 0xff00) >> 8 & 0xff00) + (i_242_ * (i_227_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_244_ = 256 - i_242_;
						for (/**/; i_224_ <= i_226_; i_224_++) {
							int i_245_ = i >> 16;
							if (i_245_ >= 1352816403 * anInt9000 && i_245_ < 2024498147 * anInt9001) {
								int i_246_ = i_245_ + i_224_ * (-570111553 * anInt8997);
								int i_247_ = anIntArray8996[i_246_];
								i_247_ = (((i_247_ & 0xff00ff) * i_244_ >> 8 & 0xff00ff) + (i_244_ * (i_247_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_245_ + (-570111553 * anInt8997 * i_224_)] = i_247_ + i_227_;
							}
							i += i_241_;
						}
					} else if (2 == i_228_) {
						for (/**/; i_224_ <= i_226_; i_224_++) {
							int i_248_ = i >> 16;
							if (i_248_ >= 1352816403 * anInt9000 && i_248_ < 2024498147 * anInt9001) {
								int i_249_ = anInt8997 * -570111553 * i_224_ + i_248_;
								int i_250_ = anIntArray8996[i_249_];
								int i_251_ = i_250_ + i_227_;
								int i_252_ = ((i_250_ & 0xff00ff) + (i_227_ & 0xff00ff));
								i_250_ = ((i_251_ - i_252_ & 0x10000) + (i_252_ & 0x1000100));
								anIntArray8996[i_249_] = i_251_ - i_250_ | i_250_ - (i_250_ >>> 8);
							}
							i += i_241_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method2296(Class176 class176) {
		/* empty */
	}

	public void method2354(int i, int i_253_, int i_254_, int i_255_, int i_256_, int i_257_, Class161 class161, int i_258_, int i_259_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_260_ = class161_sub2.anIntArray9445;
			int i_261_ = (-1593163361 * anInt9021 > i_259_ ? -1593163361 * anInt9021 : i_259_);
			int i_262_ = (anInt9003 * -148513205 < i_259_ + is.length ? anInt9003 * -148513205 : is.length + i_259_);
			i_254_ -= i;
			i_255_ -= i_253_;
			if (i_254_ + i_255_ < 0) {
				i += i_254_;
				i_254_ = -i_254_;
				i_253_ += i_255_;
				i_255_ = -i_255_;
			}
			if (i_254_ > i_255_) {
				i_253_ <<= 16;
				i_253_ += 32768;
				i_255_ <<= 16;
				int i_263_ = (int) Math.floor((double) i_255_ / (double) i_254_ + 0.5);
				i_254_ += i;
				if (i < anInt9000 * 1352816403) {
					i_253_ += (anInt9000 * 1352816403 - i) * i_263_;
					i = anInt9000 * 1352816403;
				}
				if (i_254_ >= 2024498147 * anInt9001)
					i_254_ = 2024498147 * anInt9001 - 1;
				int i_264_ = i_256_ >>> 24;
				if (i_257_ == 0 || 1 == i_257_ && i_264_ == 255) {
					for (/**/; i <= i_254_; i++) {
						int i_265_ = i_253_ >> 16;
						int i_266_ = i_265_ - i_259_;
						if (i_265_ >= i_261_ && i_265_ < i_262_) {
							int i_267_ = is[i_266_] + i_258_;
							if (i >= i_267_ && i < i_267_ + is_260_[i_266_])
								anIntArray8996[i_265_ * (anInt8997 * -570111553) + i] = i_256_;
						}
						i_253_ += i_263_;
					}
				} else if (1 == i_257_) {
					i_256_ = ((i_264_ << 24) + ((i_264_ * (i_256_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_256_ & 0xff00) * i_264_ >> 8 & 0xff00)));
					int i_268_ = 256 - i_264_;
					for (/**/; i <= i_254_; i++) {
						int i_269_ = i_253_ >> 16;
						int i_270_ = i_269_ - i_259_;
						if (i_269_ >= i_261_ && i_269_ < i_262_) {
							int i_271_ = i_258_ + is[i_270_];
							if (i >= i_271_ && i < is_260_[i_270_] + i_271_) {
								int i_272_ = i_269_ * (-570111553 * anInt8997) + i;
								int i_273_ = anIntArray8996[i_272_];
								i_273_ = ((i_268_ * (i_273_ & 0xff00ff) >> 8 & 0xff00ff) + (i_268_ * (i_273_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_272_] = i_273_ + i_256_;
							}
						}
						i_253_ += i_263_;
					}
				} else if (2 == i_257_) {
					for (/**/; i <= i_254_; i++) {
						int i_274_ = i_253_ >> 16;
						int i_275_ = i_274_ - i_259_;
						if (i_274_ >= i_261_ && i_274_ < i_262_) {
							int i_276_ = is[i_275_] + i_258_;
							if (i >= i_276_ && i < is_260_[i_275_] + i_276_) {
								int i_277_ = i_274_ * (-570111553 * anInt8997) + i;
								int i_278_ = anIntArray8996[i_277_];
								int i_279_ = i_278_ + i_256_;
								int i_280_ = ((i_256_ & 0xff00ff) + (i_278_ & 0xff00ff));
								i_278_ = (i_280_ & 0x1000100) + (i_279_ - i_280_ & 0x10000);
								anIntArray8996[i_277_] = i_279_ - i_278_ | i_278_ - (i_278_ >>> 8);
							}
						}
						i_253_ += i_263_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_254_ <<= 16;
				int i_281_ = (int) Math.floor(0.5 + ((double) i_254_ / (double) i_255_));
				i_255_ += i_253_;
				if (i_253_ < i_261_) {
					i += i_281_ * (i_261_ - i_253_);
					i_253_ = i_261_;
				}
				if (i_255_ >= i_262_)
					i_255_ = i_262_ - 1;
				int i_282_ = i_256_ >>> 24;
				if (0 == i_257_ || 1 == i_257_ && i_282_ == 255) {
					for (/**/; i_253_ <= i_255_; i_253_++) {
						int i_283_ = i >> 16;
						int i_284_ = i_253_ - i_259_;
						int i_285_ = i_258_ + is[i_284_];
						if (i_283_ >= 1352816403 * anInt9000 && i_283_ < anInt9001 * 2024498147 && i_283_ >= i_285_ && i_283_ < i_285_ + is_260_[i_284_])
							anIntArray8996[(i_283_ + -570111553 * anInt8997 * i_253_)] = i_256_;
						i += i_281_;
					}
				} else if (i_257_ == 1) {
					i_256_ = ((i_282_ * (i_256_ & 0xff00) >> 8 & 0xff00) + ((i_256_ & 0xff00ff) * i_282_ >> 8 & 0xff00ff) + (i_282_ << 24));
					int i_286_ = 256 - i_282_;
					for (/**/; i_253_ <= i_255_; i_253_++) {
						int i_287_ = i >> 16;
						int i_288_ = i_253_ - i_259_;
						int i_289_ = i_258_ + is[i_288_];
						if (i_287_ >= 1352816403 * anInt9000 && i_287_ < anInt9001 * 2024498147 && i_287_ >= i_289_ && i_287_ < i_289_ + is_260_[i_288_]) {
							int i_290_ = i_287_ + -570111553 * anInt8997 * i_253_;
							int i_291_ = anIntArray8996[i_290_];
							i_291_ = (((i_291_ & 0xff00ff) * i_286_ >> 8 & 0xff00ff) + ((i_291_ & 0xff00) * i_286_ >> 8 & 0xff00));
							anIntArray8996[(i_253_ * (anInt8997 * -570111553) + i_287_)] = i_256_ + i_291_;
						}
						i += i_281_;
					}
				} else if (i_257_ == 2) {
					for (/**/; i_253_ <= i_255_; i_253_++) {
						int i_292_ = i >> 16;
						int i_293_ = i_253_ - i_259_;
						int i_294_ = i_258_ + is[i_293_];
						if (i_292_ >= 1352816403 * anInt9000 && i_292_ < 2024498147 * anInt9001 && i_292_ >= i_294_ && i_292_ < is_260_[i_293_] + i_294_) {
							int i_295_ = -570111553 * anInt8997 * i_253_ + i_292_;
							int i_296_ = anIntArray8996[i_295_];
							int i_297_ = i_296_ + i_256_;
							int i_298_ = (i_296_ & 0xff00ff) + (i_256_ & 0xff00ff);
							i_296_ = (i_297_ - i_298_ & 0x10000) + (i_298_ & 0x1000100);
							anIntArray8996[i_295_] = i_297_ - i_296_ | i_296_ - (i_296_ >>> 8);
						}
						i += i_281_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2070(int i, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_, Class161 class161, int i_304_, int i_305_, int i_306_, int i_307_, int i_308_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_309_ = class161_sub2.anIntArray9445;
			int i_310_ = (anInt9021 * -1593163361 > i_305_ ? anInt9021 * -1593163361 : i_305_);
			int i_311_ = (-148513205 * anInt9003 < i_305_ + is.length ? anInt9003 * -148513205 : i_305_ + is.length);
			i_308_ <<= 8;
			i_306_ <<= 8;
			i_307_ <<= 8;
			int i_312_ = i_307_ + i_306_;
			i_308_ %= i_312_;
			i_300_ -= i;
			i_301_ -= i_299_;
			if (i_300_ + i_301_ < 0) {
				int i_313_ = (int) (Math.sqrt((double) (i_300_ * i_300_ + i_301_ * i_301_)) * 256.0);
				int i_314_ = i_313_ % i_312_;
				i_308_ = i_306_ + i_312_ - i_308_ - i_314_;
				i_308_ %= i_312_;
				if (i_308_ < 0)
					i_308_ += i_312_;
				i += i_300_;
				i_300_ = -i_300_;
				i_299_ += i_301_;
				i_301_ = -i_301_;
			}
			if (i_300_ > i_301_) {
				i_299_ <<= 16;
				i_299_ += 32768;
				i_301_ <<= 16;
				int i_315_ = (int) Math.floor((double) i_301_ / (double) i_300_ + 0.5);
				i_300_ += i;
				int i_316_ = i_302_ >>> 24;
				int i_317_ = (int) Math.sqrt((double) (65536 + (i_315_ >> 8) * (i_315_ >> 8)));
				if (0 == i_303_ || i_303_ == 1 && 255 == i_316_) {
					while (i <= i_300_) {
						int i_318_ = i_299_ >> 16;
						int i_319_ = i_318_ - i_305_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_318_ >= i_310_ && i_318_ < i_311_ && i_308_ < i_306_) {
							int i_320_ = is[i_319_] + i_304_;
							if (i >= i_320_ && i < i_320_ + is_309_[i_319_])
								anIntArray8996[i + i_318_ * (-570111553 * anInt8997)] = i_302_;
						}
						i_299_ += i_315_;
						i++;
						i_308_ += i_317_;
						i_308_ %= i_312_;
					}
				} else if (i_303_ == 1) {
					i_302_ = (((i_302_ & 0xff00ff) * i_316_ >> 8 & 0xff00ff) + ((i_302_ & 0xff00) * i_316_ >> 8 & 0xff00) + (i_316_ << 24));
					int i_321_ = 256 - i_316_;
					while (i <= i_300_) {
						int i_322_ = i_299_ >> 16;
						int i_323_ = i_322_ - i_305_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_322_ >= i_310_ && i_322_ < i_311_ && i_308_ < i_306_) {
							int i_324_ = i_304_ + is[i_323_];
							if (i >= i_324_ && i < is_309_[i_323_] + i_324_) {
								int i_325_ = i + i_322_ * (-570111553 * anInt8997);
								int i_326_ = anIntArray8996[i_325_];
								i_326_ = (((i_326_ & 0xff00) * i_321_ >> 8 & 0xff00) + ((i_326_ & 0xff00ff) * i_321_ >> 8 & 0xff00ff));
								anIntArray8996[i_325_] = i_326_ + i_302_;
							}
						}
						i_299_ += i_315_;
						i++;
						i_308_ += i_317_;
						i_308_ %= i_312_;
					}
				} else if (2 == i_303_) {
					while (i <= i_300_) {
						int i_327_ = i_299_ >> 16;
						int i_328_ = i_327_ - i_305_;
						if (i >= anInt9000 * 1352816403 && i < 2024498147 * anInt9001 && i_327_ >= i_310_ && i_327_ < i_311_ && i_308_ < i_306_) {
							int i_329_ = is[i_328_] + i_304_;
							if (i >= i_329_ && i < i_329_ + is_309_[i_328_]) {
								int i_330_ = -570111553 * anInt8997 * i_327_ + i;
								int i_331_ = anIntArray8996[i_330_];
								int i_332_ = i_331_ + i_302_;
								int i_333_ = ((i_331_ & 0xff00ff) + (i_302_ & 0xff00ff));
								i_331_ = ((i_332_ - i_333_ & 0x10000) + (i_333_ & 0x1000100));
								anIntArray8996[i_330_] = i_332_ - i_331_ | i_331_ - (i_331_ >>> 8);
							}
						}
						i_299_ += i_315_;
						i++;
						i_308_ += i_317_;
						i_308_ %= i_312_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_300_ <<= 16;
				int i_334_ = (int) Math.floor((double) i_300_ / (double) i_301_ + 0.5);
				int i_335_ = (int) Math.sqrt((double) ((i_334_ >> 8) * (i_334_ >> 8) + 65536));
				i_301_ += i_299_;
				int i_336_ = i_302_ >>> 24;
				if (0 == i_303_ || 1 == i_303_ && i_336_ == 255) {
					while (i_299_ <= i_301_) {
						int i_337_ = i >> 16;
						int i_338_ = i_299_ - i_305_;
						if (i_299_ >= i_310_ && i_299_ < i_311_ && i_337_ >= 1352816403 * anInt9000 && i_337_ < anInt9001 * 2024498147 && i_308_ < i_306_ && i_337_ >= is[i_338_] + i_304_ && i_337_ < i_304_ + is[i_338_] + is_309_[i_338_])
							anIntArray8996[(-570111553 * anInt8997 * i_299_ + i_337_)] = i_302_;
						i += i_334_;
						i_299_++;
						i_308_ += i_335_;
						i_308_ %= i_312_;
					}
				} else if (1 == i_303_) {
					i_302_ = ((i_336_ * (i_302_ & 0xff00ff) >> 8 & 0xff00ff) + (i_336_ * (i_302_ & 0xff00) >> 8 & 0xff00) + (i_336_ << 24));
					int i_339_ = 256 - i_336_;
					while (i_299_ <= i_301_) {
						int i_340_ = i >> 16;
						int i_341_ = i_299_ - i_305_;
						if (i_299_ >= i_310_ && i_299_ < i_311_ && i_340_ >= anInt9000 * 1352816403 && i_340_ < anInt9001 * 2024498147 && i_308_ < i_306_ && i_340_ >= i_304_ + is[i_341_] && (i_340_ < i_304_ + is[i_341_] + is_309_[i_341_])) {
							int i_342_ = i_340_ + i_299_ * (anInt8997 * -570111553);
							int i_343_ = anIntArray8996[i_342_];
							i_343_ = ((i_339_ * (i_343_ & 0xff00ff) >> 8 & 0xff00ff) + (i_339_ * (i_343_ & 0xff00) >> 8 & 0xff00));
							anIntArray8996[i_340_ + i_299_ * (anInt8997 * -570111553)] = i_302_ + i_343_;
						}
						i += i_334_;
						i_299_++;
						i_308_ += i_335_;
						i_308_ %= i_312_;
					}
				} else if (2 == i_303_) {
					while (i_299_ <= i_301_) {
						int i_344_ = i >> 16;
						int i_345_ = i_299_ - i_305_;
						if (i_299_ >= i_310_ && i_299_ < i_311_ && i_344_ >= anInt9000 * 1352816403 && i_344_ < 2024498147 * anInt9001 && i_308_ < i_306_ && i_344_ >= is[i_345_] + i_304_ && (i_344_ < i_304_ + is[i_345_] + is_309_[i_345_])) {
							int i_346_ = i_299_ * (-570111553 * anInt8997) + i_344_;
							int i_347_ = anIntArray8996[i_346_];
							int i_348_ = i_347_ + i_302_;
							int i_349_ = (i_302_ & 0xff00ff) + (i_347_ & 0xff00ff);
							i_347_ = (i_348_ - i_349_ & 0x10000) + (i_349_ & 0x1000100);
							anIntArray8996[i_346_] = i_348_ - i_347_ | i_347_ - (i_347_ >>> 8);
						}
						i += i_334_;
						i_299_++;
						i_308_ += i_335_;
						i_308_ %= i_312_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2096(int i, int i_350_, int i_351_, int i_352_, int i_353_, int i_354_, int i_355_) {
		if (null != anIntArray8996) {
			Class107 class107 = method8458(Thread.currentThread());
			Class117 class117 = class107.aClass117_1290;
			int i_356_ = i_351_ - i;
			int i_357_ = i_352_ - i_350_;
			int i_358_ = i_356_ >= 0 ? i_356_ : -i_356_;
			int i_359_ = i_357_ >= 0 ? i_357_ : -i_357_;
			int i_360_ = i_358_;
			if (i_360_ < i_359_)
				i_360_ = i_359_;
			if (i_360_ != 0) {
				int i_361_ = (i_356_ << 16) / i_360_;
				int i_362_ = (i_357_ << 16) / i_360_;
				i_356_ += i_361_ >> 16;
				i_357_ += i_362_ >> 16;
				if (i_362_ <= i_361_)
					i_361_ = -i_361_;
				else
					i_362_ = -i_362_;
				int i_363_ = i_362_ * i_354_ >> 17;
				int i_364_ = i_362_ * i_354_ + 1 >> 17;
				int i_365_ = i_354_ * i_361_ >> 17;
				int i_366_ = 1 + i_354_ * i_361_ >> 17;
				i -= class117.method1490();
				i_350_ -= class117.method1503();
				int i_367_ = i_363_ + i;
				int i_368_ = i - i_364_;
				int i_369_ = i_356_ + i - i_364_;
				int i_370_ = i_356_ + i + i_363_;
				int i_371_ = i_365_ + i_350_;
				int i_372_ = i_350_ - i_366_;
				int i_373_ = i_350_ + i_357_ - i_366_;
				int i_374_ = i_350_ + i_357_ + i_365_;
				if (i_355_ == 0)
					class117.anInt1436 = 0;
				else if (1 == i_355_)
					class117.anInt1436 = 255 - (i_353_ >>> 24);
				else
					throw new IllegalArgumentException();
				method2302(false);
				class117.aBool1449 = (i_367_ < 0 || i_367_ > class117.anInt1441 || i_368_ < 0 || i_368_ > class117.anInt1441 || i_369_ < 0 || i_369_ > class117.anInt1441);
				class117.method1507(true, false, false, (float) i_371_, (float) i_372_, (float) i_373_, (float) i_367_, (float) i_368_, (float) i_369_, 100.0F, 100.0F, 100.0F, i_353_);
				class117.aBool1449 = (i_367_ < 0 || i_367_ > class117.anInt1441 || i_369_ < 0 || i_369_ > class117.anInt1441 || i_370_ < 0 || i_370_ > class117.anInt1441);
				class117.method1507(true, false, false, (float) i_371_, (float) i_373_, (float) i_374_, (float) i_367_, (float) i_369_, (float) i_370_, 100.0F, 100.0F, 100.0F, i_353_);
				method2302(true);
			}
		}
	}

	boolean method2053(int i, int i_375_, int i_376_, int i_377_, Class433 class433, Class437 class437) {
		Class443 class443 = method2391();
		class443.method5359(class433);
		class443.method5390(aClass443_9013);
		return class437.method5296(i, i_375_, i_376_, i_377_, class443, aFloat9002, aFloat9022, aFloat9019, aFloat9023);
	}

	public MeshRasterizer method2261(RSMesh class180, int i, int i_378_, int i_379_, int i_380_) {
		return new Class177_Sub3(this, class180, i, i_379_, i_380_, i_378_);
	}

	public void method2102(Class433 class433, Class178 class178, Class437 class437) {
		Class443 class443 = method2391();
		class443.method5359(class433);
		class443.method5390(aClass443_9013);
		class178.method2627(class437, aClass443_9012, class443, aFloat9002, aFloat9022, aFloat9019, aFloat9023);
	}

	public Class536_Sub25 method2076(int i) {
		return null;
	}

	public void method2077(Class536_Sub25 class536_sub25) {
		/* empty */
	}

	void method2320(float f, float f_381_, float f_382_, float f_383_, float f_384_, float f_385_) {
		/* empty */
	}

	public NativeSprite method2082(Class179 class179, boolean bool) {
		int i = class179.method2633();
		int i_386_ = class179.method2677();
		Class143_Sub1 class143_sub1;
		if (bool && !class179.method2641() && class179.method2631()) {
			Class179_Sub2 class179_sub2 = (Class179_Sub2) class179;
			int[] is = new int[class179_sub2.anIntArray9813.length];
			byte[] is_387_ = new byte[i * i_386_];
			for (int i_388_ = 0; i_388_ < i_386_; i_388_++) {
				int i_389_ = i * i_388_;
				for (int i_390_ = 0; i_390_ < i; i_390_++)
					is_387_[i_390_ + i_389_] = class179_sub2.aByteArray9820[i_390_ + i_389_];
			}
			for (int i_391_ = 0; i_391_ < class179_sub2.anIntArray9813.length; i_391_++)
				is[i_391_] = class179_sub2.anIntArray9813[i_391_];
			class143_sub1 = new Class143_Sub1_Sub3(this, is_387_, is, i, i_386_);
		} else {
			int[] is = class179.method2643(false);
			if (class179.method2641())
				class143_sub1 = new Class143_Sub1_Sub1(this, is, i, i_386_);
			else
				class143_sub1 = new Class143_Sub1_Sub2(this, is, i, i_386_);
		}
		class143_sub1.method1718(class179.method2635(), class179.method2637(), class179.method2636(), class179.method2638());
		return class143_sub1;
	}

	public NativeSprite method2205(int i, int i_392_, int i_393_, int i_394_, boolean bool) {
		if (anIntArray8996 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_394_ * i_393_];
		int i_395_ = i_392_ * (-570111553 * anInt8997) + i;
		int i_396_ = -570111553 * anInt8997 - i_393_;
		for (int i_397_ = 0; i_397_ < i_394_; i_397_++) {
			int i_398_ = i_393_ * i_397_;
			for (int i_399_ = 0; i_399_ < i_393_; i_399_++)
				is[i_399_ + i_398_] = anIntArray8996[i_395_++];
			i_395_ += i_396_;
		}
		if (bool)
			return new Class143_Sub1_Sub1(this, is, i_393_, i_394_);
		return new Class143_Sub1_Sub2(this, is, i_393_, i_394_);
	}

	public Class161 method2087(int i, int i_400_, int[] is, int[] is_401_) {
		return new Class161_Sub2(i, i_400_, is, is_401_);
	}

	public void method2088(int i, Class161 class161, int i_402_, int i_403_) {
		if (anIntArray8996 != null) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_404_ = class161_sub2.anIntArray9445;
			int i_405_;
			if (anInt9003 * -148513205 < is.length + i_403_)
				i_405_ = -148513205 * anInt9003 - i_403_;
			else
				i_405_ = is.length;
			int i_406_;
			if (-1593163361 * anInt9021 > i_403_) {
				i_406_ = -1593163361 * anInt9021 - i_403_;
				i_403_ = -1593163361 * anInt9021;
			} else
				i_406_ = 0;
			if (i_405_ - i_406_ > 0) {
				int i_407_ = i_403_ * (-570111553 * anInt8997);
				for (int i_408_ = i_406_; i_408_ < i_405_; i_408_++) {
					int i_409_ = is[i_408_] + i_402_;
					int i_410_ = is_404_[i_408_];
					if (anInt9000 * 1352816403 > i_409_) {
						i_410_ -= 1352816403 * anInt9000 - i_409_;
						i_409_ = 1352816403 * anInt9000;
					}
					if (2024498147 * anInt9001 < i_409_ + i_410_)
						i_410_ = anInt9001 * 2024498147 - i_409_;
					i_409_ += i_407_;
					for (int i_411_ = -i_410_; i_411_ < 0; i_411_++)
						anIntArray8996[i_409_++] = i;
					i_407_ += -570111553 * anInt8997;
				}
			}
		}
	}

	public MeshRasterizer method2330(RSMesh class180, int i, int i_412_, int i_413_, int i_414_) {
		return new Class177_Sub3(this, class180, i, i_413_, i_414_, i_412_);
	}

	public Class433 method2100() {
		return new Class433(aClass433_9010);
	}

	public boolean method2342() {
		return false;
	}

	public int method2308(int i, int i_415_) {
		i |= 0x20800;
		return i & i_415_ ^ i_415_;
	}

	public int method2068(int i, int i_416_) {
		return i | i_416_;
	}

	public void method2114(int i, int i_417_, int i_418_, int i_419_) {
		/* empty */
	}

	public Class433 method2091() {
		Class107 class107 = method8458(Thread.currentThread());
		return class107.aClass433_1289;
	}

	public Class536_Sub19 method2109(int i, int i_420_, int i_421_, int i_422_, int i_423_, float f) {
		return null;
	}

	public void method2369(int i, int i_424_, int i_425_, int i_426_) {
		if (i < 0)
			i = 0;
		if (i_424_ < 0)
			i_424_ = 0;
		if (i_425_ > anInt8997 * -570111553)
			i_425_ = -570111553 * anInt8997;
		if (i_426_ > -1805705211 * anInt8998)
			i_426_ = -1805705211 * anInt8998;
		anInt9000 = i * -1951331557;
		anInt9001 = i_425_ * 391182795;
		anInt9021 = i_424_ * 1128831583;
		anInt9003 = 1669823331 * i_426_;
		method8451();
	}

	public void method2000(int i, int i_427_) {
		if (0 != (i & 0x1))
			method2063(0, 0, -570111553 * anInt8997, anInt8998 * -1805705211, i_427_, 0);
		if (0 != (i & 0x2))
			method8460();
	}

	public void method2368(int i, int i_428_, int i_429_, int i_430_) {
		/* empty */
	}

	public void method2351(Class166 class166) {
		method8454(null != anIntArray8996, null != aFloatArray8999, false, class166);
	}

	void method8454(boolean bool, boolean bool_431_, boolean bool_432_, Class166 class166) {
		Class107 class107 = method8458(Thread.currentThread());
		for (Class521_Sub2_Sub1 class521_sub2_sub1 = ((Class521_Sub2_Sub1) class166.aClass703_1841.method8252(-1052256849)); null != class521_sub2_sub1; class521_sub2_sub1 = ((Class521_Sub2_Sub1) class166.aClass703_1841.method8253(-132516006))) {
			int i = class521_sub2_sub1.anInt11595 >> 12;
			int i_433_ = class521_sub2_sub1.anInt11592 >> 12;
			int i_434_ = class521_sub2_sub1.anInt11597 >> 12;
			float f = (aClass443_9013.aFloatArray4878[14] + (aClass443_9013.aFloatArray4878[6] * (float) i_433_ + aClass443_9013.aFloatArray4878[2] * (float) i + (float) i_434_ * aClass443_9013.aFloatArray4878[10]));
			float f_435_ = ((float) i * aClass443_9013.aFloatArray4878[3] + aClass443_9013.aFloatArray4878[7] * (float) i_433_ + aClass443_9013.aFloatArray4878[11] * (float) i_434_ + aClass443_9013.aFloatArray4878[15]);
			if (!(f < -f_435_)) {
				float f_436_ = aFloat9024 + aFloat9011 * f / f_435_;
				if (!(f > class107.aFloat1277)) {
					float f_437_ = (aClass443_9013.aFloatArray4878[12] + (((float) i_433_ * aClass443_9013.aFloatArray4878[4]) + aClass443_9013.aFloatArray4878[0] * (float) i + (aClass443_9013.aFloatArray4878[8] * (float) i_434_)));
					float f_438_ = (aClass443_9013.aFloatArray4878[9] * (float) i_434_ + (aClass443_9013.aFloatArray4878[1] * (float) i + (aClass443_9013.aFloatArray4878[5] * (float) i_433_)) + aClass443_9013.aFloatArray4878[13]);
					if (!(f_437_ < -f_435_) && !(f_437_ > f_435_) && !(f_438_ < -f_435_) && !(f_438_ > f_435_)) {
						float f_439_ = (float) class521_sub2_sub1.anInt11598 / 4096.0F;
						float f_440_ = (f_437_ + aClass443_9012.aFloatArray4878[0] * f_439_);
						float f_441_ = (f_435_ + aClass443_9012.aFloatArray4878[3] * f_439_);
						float f_442_ = f_437_ * aFloat9019 / f_435_ + aFloat9002;
						float f_443_ = aFloat9022 + aFloat9023 * f_438_ / f_435_;
						float f_444_ = aFloat9019 * f_440_ / f_441_ + aFloat9002;
						method8457(bool, bool_431_, bool_432_, class521_sub2_sub1, (int) f_442_, (int) f_443_, f_436_, (int) (f_444_ < f_442_ ? f_442_ - f_444_ : f_444_ - f_442_));
					}
				}
			}
		}
	}

	public int[] method2172(int i, int i_445_, int i_446_, int i_447_) {
		if (null == anIntArray8996)
			throw new IllegalStateException("");
		int[] is = new int[i_447_ * i_446_];
		int i_448_ = 0;
		for (int i_449_ = 0; i_449_ < i_447_; i_449_++) {
			int i_450_ = i + -570111553 * anInt8997 * (i_449_ + i_445_);
			for (int i_451_ = 0; i_451_ < i_446_; i_451_++)
				is[i_448_++] = anIntArray8996[i_450_ + i_451_];
		}
		return is;
	}

	public void method2322(int i, Class175 class175) {
		for (int i_452_ = 0; i_452_ < aClass107Array9006.length; i_452_++) {
			aClass107Array9006[i_452_].anInt1283 = aClass107Array9006[i_452_].anInt1282 * -297914507;
			aClass107Array9006[i_452_].anInt1287 = i * -1172974661;
			aClass107Array9006[i_452_].anInt1282 = 1383236455 * class175.anInt1932;
			aClass107Array9006[i_452_].anInt1317 = class175.anInt1934 * -1798113843;
			aClass107Array9006[i_452_].aBool1284 = true;
		}
	}

	void method8455(boolean bool, int i, int i_453_, float f, int i_454_, int i_455_, int i_456_) {
		if (null != anIntArray8996) {
			if (i_454_ < 0)
				i_454_ = -i_454_;
			int i_457_ = i_453_ - i_454_;
			if (i_457_ < anInt9021 * -1593163361)
				i_457_ = anInt9021 * -1593163361;
			int i_458_ = 1 + (i_454_ + i_453_);
			if (i_458_ > -148513205 * anInt9003)
				i_458_ = -148513205 * anInt9003;
			int i_459_ = i_457_;
			int i_460_ = i_454_ * i_454_;
			int i_461_ = 0;
			int i_462_ = i_453_ - i_459_;
			int i_463_ = i_462_ * i_462_;
			int i_464_ = i_463_ - i_462_;
			if (i_453_ > i_458_)
				i_453_ = i_458_;
			int i_465_ = i_455_ >>> 24;
			if (0 == i_456_ || i_456_ == 1 && i_465_ == 255) {
				while (i_459_ < i_453_) {
					for (/**/; i_464_ <= i_460_ || i_463_ <= i_460_; i_464_ += i_461_++ + i_461_)
						i_463_ += i_461_ + i_461_;
					int i_466_ = 1 + (i - i_461_);
					if (i_466_ < anInt9000 * 1352816403)
						i_466_ = anInt9000 * 1352816403;
					int i_467_ = i + i_461_;
					if (i_467_ > 2024498147 * anInt9001)
						i_467_ = 2024498147 * anInt9001;
					int i_468_ = i_466_ + anInt8997 * -570111553 * i_459_;
					for (int i_469_ = i_466_; i_469_ < i_467_; i_469_++) {
						if (!bool || f < aFloatArray8999[i_468_])
							anIntArray8996[i_468_] = i_455_;
						i_468_++;
					}
					i_459_++;
					i_463_ -= i_462_-- + i_462_;
					i_464_ -= i_462_ + i_462_;
				}
				i_461_ = i_454_;
				i_462_ = i_459_ - i_453_;
				i_464_ = i_460_ + i_462_ * i_462_;
				i_463_ = i_464_ - i_461_;
				i_464_ -= i_462_;
				while (i_459_ < i_458_) {
					for (/**/; i_464_ > i_460_ && i_463_ > i_460_; i_463_ -= i_461_ + i_461_)
						i_464_ -= i_461_-- + i_461_;
					int i_470_ = i - i_461_;
					if (i_470_ < anInt9000 * 1352816403)
						i_470_ = anInt9000 * 1352816403;
					int i_471_ = i_461_ + i;
					if (i_471_ > 2024498147 * anInt9001 - 1)
						i_471_ = 2024498147 * anInt9001 - 1;
					int i_472_ = anInt8997 * -570111553 * i_459_ + i_470_;
					for (int i_473_ = i_470_; i_473_ <= i_471_; i_473_++) {
						if (!bool || f < aFloatArray8999[i_472_])
							anIntArray8996[i_472_] = i_455_;
						i_472_++;
					}
					i_459_++;
					i_464_ += i_462_ + i_462_;
					i_463_ += i_462_++ + i_462_;
				}
			} else if (1 == i_456_) {
				i_455_ = ((i_465_ << 24) + (((i_455_ & 0xff00ff) * i_465_ >> 8 & 0xff00ff) + ((i_455_ & 0xff00) * i_465_ >> 8 & 0xff00)));
				int i_474_ = 256 - i_465_;
				while (i_459_ < i_453_) {
					for (/**/; i_464_ <= i_460_ || i_463_ <= i_460_; i_464_ += i_461_++ + i_461_)
						i_463_ += i_461_ + i_461_;
					int i_475_ = i - i_461_ + 1;
					if (i_475_ < anInt9000 * 1352816403)
						i_475_ = anInt9000 * 1352816403;
					int i_476_ = i + i_461_;
					if (i_476_ > anInt9001 * 2024498147)
						i_476_ = 2024498147 * anInt9001;
					int i_477_ = i_475_ + i_459_ * (anInt8997 * -570111553);
					for (int i_478_ = i_475_; i_478_ < i_476_; i_478_++) {
						if (!bool || f < aFloatArray8999[i_477_]) {
							int i_479_ = anIntArray8996[i_477_];
							i_479_ = (((i_479_ & 0xff00ff) * i_474_ >> 8 & 0xff00ff) + (i_474_ * (i_479_ & 0xff00) >> 8 & 0xff00));
							anIntArray8996[i_477_] = i_455_ + i_479_;
						}
						i_477_++;
					}
					i_459_++;
					i_463_ -= i_462_-- + i_462_;
					i_464_ -= i_462_ + i_462_;
				}
				i_461_ = i_454_;
				i_462_ = -i_462_;
				i_464_ = i_462_ * i_462_ + i_460_;
				i_463_ = i_464_ - i_461_;
				i_464_ -= i_462_;
				while (i_459_ < i_458_) {
					for (/**/; i_464_ > i_460_ && i_463_ > i_460_; i_463_ -= i_461_ + i_461_)
						i_464_ -= i_461_-- + i_461_;
					int i_480_ = i - i_461_;
					if (i_480_ < 1352816403 * anInt9000)
						i_480_ = 1352816403 * anInt9000;
					int i_481_ = i + i_461_;
					if (i_481_ > 2024498147 * anInt9001 - 1)
						i_481_ = anInt9001 * 2024498147 - 1;
					int i_482_ = i_480_ + -570111553 * anInt8997 * i_459_;
					for (int i_483_ = i_480_; i_483_ <= i_481_; i_483_++) {
						if (!bool || f < aFloatArray8999[i_482_]) {
							int i_484_ = anIntArray8996[i_482_];
							i_484_ = (((i_484_ & 0xff00ff) * i_474_ >> 8 & 0xff00ff) + ((i_484_ & 0xff00) * i_474_ >> 8 & 0xff00));
							anIntArray8996[i_482_] = i_455_ + i_484_;
						}
						i_482_++;
					}
					i_459_++;
					i_464_ += i_462_ + i_462_;
					i_463_ += i_462_++ + i_462_;
				}
			} else if (2 == i_456_) {
				while (i_459_ < i_453_) {
					for (/**/; i_464_ <= i_460_ || i_463_ <= i_460_; i_464_ += i_461_++ + i_461_)
						i_463_ += i_461_ + i_461_;
					int i_485_ = i - i_461_ + 1;
					if (i_485_ < 1352816403 * anInt9000)
						i_485_ = 1352816403 * anInt9000;
					int i_486_ = i + i_461_;
					if (i_486_ > 2024498147 * anInt9001)
						i_486_ = 2024498147 * anInt9001;
					int i_487_ = -570111553 * anInt8997 * i_459_ + i_485_;
					for (int i_488_ = i_485_; i_488_ < i_486_; i_488_++) {
						if (!bool || f < aFloatArray8999[i_487_]) {
							int i_489_ = anIntArray8996[i_487_];
							int i_490_ = i_489_ + i_455_;
							int i_491_ = (i_455_ & 0xff00ff) + (i_489_ & 0xff00ff);
							i_489_ = (i_490_ - i_491_ & 0x10000) + (i_491_ & 0x1000100);
							anIntArray8996[i_487_] = i_490_ - i_489_ | i_489_ - (i_489_ >>> 8);
						}
						i_487_++;
					}
					i_459_++;
					i_463_ -= i_462_-- + i_462_;
					i_464_ -= i_462_ + i_462_;
				}
				i_461_ = i_454_;
				i_462_ = -i_462_;
				i_464_ = i_460_ + i_462_ * i_462_;
				i_463_ = i_464_ - i_461_;
				i_464_ -= i_462_;
				while (i_459_ < i_458_) {
					for (/**/; i_464_ > i_460_ && i_463_ > i_460_; i_463_ -= i_461_ + i_461_)
						i_464_ -= i_461_-- + i_461_;
					int i_492_ = i - i_461_;
					if (i_492_ < anInt9000 * 1352816403)
						i_492_ = 1352816403 * anInt9000;
					int i_493_ = i_461_ + i;
					if (i_493_ > 2024498147 * anInt9001 - 1)
						i_493_ = anInt9001 * 2024498147 - 1;
					int i_494_ = anInt8997 * -570111553 * i_459_ + i_492_;
					for (int i_495_ = i_492_; i_495_ <= i_493_; i_495_++) {
						if (!bool || f < aFloatArray8999[i_494_]) {
							int i_496_ = anIntArray8996[i_494_];
							int i_497_ = i_496_ + i_455_;
							int i_498_ = (i_455_ & 0xff00ff) + (i_496_ & 0xff00ff);
							i_496_ = (i_498_ & 0x1000100) + (i_497_ - i_498_ & 0x10000);
							anIntArray8996[i_494_] = i_497_ - i_496_ | i_496_ - (i_496_ >>> 8);
						}
						i_494_++;
					}
					i_459_++;
					i_464_ += i_462_ + i_462_;
					i_463_ += i_462_++ + i_462_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2099(Class433 class433) {
		aClass433_9010 = class433;
		method8456();
	}

	public int method2183() {
		return -1;
	}

	public boolean method2116() {
		return false;
	}

	public void method2213(int i, int i_499_, int i_500_, int i_501_) {
		if (i < 0)
			i = 0;
		if (i_499_ < 0)
			i_499_ = 0;
		if (i_500_ > anInt8997 * -570111553)
			i_500_ = -570111553 * anInt8997;
		if (i_501_ > -1805705211 * anInt8998)
			i_501_ = -1805705211 * anInt8998;
		anInt9000 = i * -1951331557;
		anInt9001 = i_500_ * 391182795;
		anInt9021 = i_499_ * 1128831583;
		anInt9003 = 1669823331 * i_501_;
		method8451();
	}

	public void method2006(float f) {
		anInt9009 = 1594293099 * (int) (65535.0F * f);
	}

	void method2226(int i, int i_502_, int i_503_, int i_504_, int i_505_) {
		if (null != anIntArray8996) {
			if (i_503_ < 0)
				i_503_ = -i_503_;
			int i_506_ = i_502_ - i_503_;
			if (i_506_ < -1593163361 * anInt9021)
				i_506_ = anInt9021 * -1593163361;
			int i_507_ = 1 + (i_502_ + i_503_);
			if (i_507_ > -148513205 * anInt9003)
				i_507_ = anInt9003 * -148513205;
			int i_508_ = i_506_;
			int i_509_ = i_503_ * i_503_;
			int i_510_ = 0;
			int i_511_ = i_502_ - i_508_;
			int i_512_ = i_511_ * i_511_;
			int i_513_ = i_512_ - i_511_;
			if (i_502_ > i_507_)
				i_502_ = i_507_;
			int i_514_ = i_504_ >>> 24;
			if (i_505_ == 0 || i_505_ == 1 && i_514_ == 255) {
				while (i_508_ < i_502_) {
					for (/**/; i_513_ <= i_509_ || i_512_ <= i_509_; i_513_ += i_510_++ + i_510_)
						i_512_ += i_510_ + i_510_;
					int i_515_ = 1 + (i - i_510_);
					if (i_515_ < 1352816403 * anInt9000)
						i_515_ = 1352816403 * anInt9000;
					int i_516_ = i_510_ + i;
					if (i_516_ > 2024498147 * anInt9001)
						i_516_ = anInt9001 * 2024498147;
					int i_517_ = -570111553 * anInt8997 * i_508_ + i_515_;
					for (int i_518_ = i_515_; i_518_ < i_516_; i_518_++)
						anIntArray8996[i_517_++] = i_504_;
					i_508_++;
					i_512_ -= i_511_-- + i_511_;
					i_513_ -= i_511_ + i_511_;
				}
				i_510_ = i_503_;
				i_511_ = i_508_ - i_502_;
				i_513_ = i_509_ + i_511_ * i_511_;
				i_512_ = i_513_ - i_510_;
				i_513_ -= i_511_;
				while (i_508_ < i_507_) {
					for (/**/; i_513_ > i_509_ && i_512_ > i_509_; i_512_ -= i_510_ + i_510_)
						i_513_ -= i_510_-- + i_510_;
					int i_519_ = i - i_510_;
					if (i_519_ < anInt9000 * 1352816403)
						i_519_ = 1352816403 * anInt9000;
					int i_520_ = i_510_ + i;
					if (i_520_ > 2024498147 * anInt9001 - 1)
						i_520_ = 2024498147 * anInt9001 - 1;
					int i_521_ = i_508_ * (anInt8997 * -570111553) + i_519_;
					for (int i_522_ = i_519_; i_522_ <= i_520_; i_522_++)
						anIntArray8996[i_521_++] = i_504_;
					i_508_++;
					i_513_ += i_511_ + i_511_;
					i_512_ += i_511_++ + i_511_;
				}
			} else if (i_505_ == 1) {
				i_504_ = (((i_504_ & 0xff00ff) * i_514_ >> 8 & 0xff00ff) + ((i_504_ & 0xff00) * i_514_ >> 8 & 0xff00) + (i_514_ << 24));
				int i_523_ = 256 - i_514_;
				while (i_508_ < i_502_) {
					for (/**/; i_513_ <= i_509_ || i_512_ <= i_509_; i_513_ += i_510_++ + i_510_)
						i_512_ += i_510_ + i_510_;
					int i_524_ = i - i_510_ + 1;
					if (i_524_ < anInt9000 * 1352816403)
						i_524_ = anInt9000 * 1352816403;
					int i_525_ = i_510_ + i;
					if (i_525_ > 2024498147 * anInt9001)
						i_525_ = anInt9001 * 2024498147;
					int i_526_ = i_508_ * (anInt8997 * -570111553) + i_524_;
					for (int i_527_ = i_524_; i_527_ < i_525_; i_527_++) {
						int i_528_ = anIntArray8996[i_526_];
						i_528_ = (((i_528_ & 0xff00) * i_523_ >> 8 & 0xff00) + (i_523_ * (i_528_ & 0xff00ff) >> 8 & 0xff00ff));
						anIntArray8996[i_526_++] = i_504_ + i_528_;
					}
					i_508_++;
					i_512_ -= i_511_-- + i_511_;
					i_513_ -= i_511_ + i_511_;
				}
				i_510_ = i_503_;
				i_511_ = -i_511_;
				i_513_ = i_509_ + i_511_ * i_511_;
				i_512_ = i_513_ - i_510_;
				i_513_ -= i_511_;
				while (i_508_ < i_507_) {
					for (/**/; i_513_ > i_509_ && i_512_ > i_509_; i_512_ -= i_510_ + i_510_)
						i_513_ -= i_510_-- + i_510_;
					int i_529_ = i - i_510_;
					if (i_529_ < anInt9000 * 1352816403)
						i_529_ = 1352816403 * anInt9000;
					int i_530_ = i + i_510_;
					if (i_530_ > 2024498147 * anInt9001 - 1)
						i_530_ = 2024498147 * anInt9001 - 1;
					int i_531_ = anInt8997 * -570111553 * i_508_ + i_529_;
					for (int i_532_ = i_529_; i_532_ <= i_530_; i_532_++) {
						int i_533_ = anIntArray8996[i_531_];
						i_533_ = (((i_533_ & 0xff00ff) * i_523_ >> 8 & 0xff00ff) + ((i_533_ & 0xff00) * i_523_ >> 8 & 0xff00));
						anIntArray8996[i_531_++] = i_533_ + i_504_;
					}
					i_508_++;
					i_513_ += i_511_ + i_511_;
					i_512_ += i_511_++ + i_511_;
				}
			} else if (2 == i_505_) {
				while (i_508_ < i_502_) {
					for (/**/; i_513_ <= i_509_ || i_512_ <= i_509_; i_513_ += i_510_++ + i_510_)
						i_512_ += i_510_ + i_510_;
					int i_534_ = i - i_510_ + 1;
					if (i_534_ < 1352816403 * anInt9000)
						i_534_ = anInt9000 * 1352816403;
					int i_535_ = i_510_ + i;
					if (i_535_ > 2024498147 * anInt9001)
						i_535_ = anInt9001 * 2024498147;
					int i_536_ = i_534_ + anInt8997 * -570111553 * i_508_;
					for (int i_537_ = i_534_; i_537_ < i_535_; i_537_++) {
						int i_538_ = anIntArray8996[i_536_];
						int i_539_ = i_504_ + i_538_;
						int i_540_ = (i_504_ & 0xff00ff) + (i_538_ & 0xff00ff);
						i_538_ = (i_539_ - i_540_ & 0x10000) + (i_540_ & 0x1000100);
						anIntArray8996[i_536_++] = i_539_ - i_538_ | i_538_ - (i_538_ >>> 8);
					}
					i_508_++;
					i_512_ -= i_511_-- + i_511_;
					i_513_ -= i_511_ + i_511_;
				}
				i_510_ = i_503_;
				i_511_ = -i_511_;
				i_513_ = i_511_ * i_511_ + i_509_;
				i_512_ = i_513_ - i_510_;
				i_513_ -= i_511_;
				while (i_508_ < i_507_) {
					for (/**/; i_513_ > i_509_ && i_512_ > i_509_; i_512_ -= i_510_ + i_510_)
						i_513_ -= i_510_-- + i_510_;
					int i_541_ = i - i_510_;
					if (i_541_ < anInt9000 * 1352816403)
						i_541_ = anInt9000 * 1352816403;
					int i_542_ = i_510_ + i;
					if (i_542_ > 2024498147 * anInt9001 - 1)
						i_542_ = anInt9001 * 2024498147 - 1;
					int i_543_ = i_508_ * (-570111553 * anInt8997) + i_541_;
					for (int i_544_ = i_541_; i_544_ <= i_542_; i_544_++) {
						int i_545_ = anIntArray8996[i_543_];
						int i_546_ = i_504_ + i_545_;
						int i_547_ = (i_545_ & 0xff00ff) + (i_504_ & 0xff00ff);
						i_545_ = (i_547_ & 0x1000100) + (i_546_ - i_547_ & 0x10000);
						anIntArray8996[i_543_++] = i_546_ - i_545_ | i_545_ - (i_545_ >>> 8);
					}
					i_508_++;
					i_513_ += i_511_ + i_511_;
					i_512_ += i_511_++ + i_511_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2106(int i) {
		/* empty */
	}

	public void method2107(int i, int i_548_, int i_549_) {
		for (int i_550_ = 0; i_550_ < aClass107Array9006.length; i_550_++) {
			Class107 class107 = aClass107Array9006[i_550_];
			class107.anInt1282 = (i & 0xffffff) * 804677509;
			int i_551_ = class107.anInt1282 * 900823373 >>> 16 & 0xff;
			if (i_551_ < 2)
				i_551_ = 2;
			int i_552_ = class107.anInt1282 * 900823373 >> 8 & 0xff;
			if (i_552_ < 2)
				i_552_ = 2;
			int i_553_ = class107.anInt1282 * 900823373 & 0xff;
			if (i_553_ < 2)
				i_553_ = 2;
			class107.anInt1282 = (i_551_ << 16 | i_552_ << 8 | i_553_) * 804677509;
			if (i_548_ < 0)
				class107.aBool1279 = false;
			else
				class107.aBool1279 = true;
		}
	}

	void method8456() {
		aClass443_9020.method5359(aClass433_9010);
		aClass443_9013.method5339(aClass443_9020);
		aClass443_9013.method5390(aClass443_9012);
		aClass443_9013.method5357(aFloatArrayArray9005[0]);
		aClass443_9013.method5358(aFloatArrayArray9005[1]);
		aClass443_9013.method5353(aFloatArrayArray9005[2]);
		aClass443_9013.method5354(aFloatArrayArray9005[3]);
		aClass443_9013.method5355(aFloatArrayArray9005[4]);
		aClass443_9013.method5373(aFloatArrayArray9005[5]);
		float f = aClass443_9012.method5352();
		float f_554_ = (aClass443_9012.aFloatArray4878[14] + aClass443_9012.aFloatArray4878[10] * (f - 255.0F));
		float f_555_ = (aClass443_9012.aFloatArray4878[10] * f + aClass443_9012.aFloatArray4878[14]);
		float f_556_ = f_555_ - f_554_;
		for (int i = 0; i < anInt9025 * 1953374867; i++) {
			Class107 class107 = aClass107Array9006[i];
			class107.aFloat1277 = f_554_;
			class107.aFloat1281 = f_556_;
		}
	}

	public boolean method2036() {
		return true;
	}

	public Class176 method2112(Class176 class176, Class176 class176_557_, float f, Class176 class176_558_) {
		return null;
	}

	public void method2113(Class176 class176) {
		/* empty */
	}

	public void method2218(int[] is) {
		is[0] = anInt9000 * 1352816403;
		is[1] = anInt9021 * -1593163361;
		is[2] = 2024498147 * anInt9001;
		is[3] = -148513205 * anInt9003;
	}

	public boolean method2010() {
		return false;
	}

	public boolean method2152() {
		return false;
	}

	public boolean method2340() {
		return false;
	}

	public void method2118(float f, float f_559_, float f_560_, float f_561_, float f_562_) {
		/* empty */
	}

	public Class168 method2119(int[] is) {
		return null;
	}

	public boolean method2281() {
		return false;
	}

	public Class183_Sub2 method2332() {
		return new Class183_Sub2_Sub1(this);
	}

	void method8457(boolean bool, boolean bool_563_, boolean bool_564_, Class521_Sub2_Sub1 class521_sub2_sub1, int i, int i_565_, float f, int i_566_) {
		int i_567_ = class521_sub2_sub1.anInt11593;
		int i_568_ = i_566_;
		i_566_ <<= 1;
		if (i_567_ == -1)
			method8455(bool_563_, i, i_565_, f, i_568_, class521_sub2_sub1.anInt11594, 1);
		else {
			if (-26431769 * anInt8994 != i_567_) {
				NativeSprite class143 = (NativeSprite) aClass199_9028.method2886((long) i_567_);
				if (class143 == null) {
					Class164 class164 = aClass174_1852.method2446(i_567_, -594819784);
					int[] is = method8444(i_567_);
					if (is != null) {
						int i_569_ = class164.anInt1815 * -1174323635;
						class143 = createNativeSprite(is, 0, i_569_, i_569_, i_569_, (byte) -97);
						aClass199_9028.method2881(class143, (long) i_567_);
					} else
						return;
				}
				anInt8994 = i_567_ * 333874391;
				aClass143_9029 = class143;
			}
			i_566_++;
			((Class143_Sub1) aClass143_9029).method8430(bool, bool_563_, bool_564_, i - i_568_, i_565_ - i_568_, f, i_566_, i_566_, 0, (class521_sub2_sub1.anInt11594), 1, 1, false);
		}
	}

	public Class536_Sub19 method2270(int i, int i_570_, int i_571_, int i_572_, int i_573_, float f) {
		return null;
	}

	public boolean method2124() {
		return false;
	}

	void method2126(float f, float f_574_, float f_575_, float f_576_, float f_577_, float f_578_) {
		/* empty */
	}

	public void method2127(int i, Class175 class175) {
		for (int i_579_ = 0; i_579_ < aClass107Array9006.length; i_579_++) {
			aClass107Array9006[i_579_].anInt1283 = aClass107Array9006[i_579_].anInt1282 * -297914507;
			aClass107Array9006[i_579_].anInt1287 = i * -1172974661;
			aClass107Array9006[i_579_].anInt1282 = 1383236455 * class175.anInt1932;
			aClass107Array9006[i_579_].anInt1317 = class175.anInt1934 * -1798113843;
			aClass107Array9006[i_579_].aBool1284 = true;
		}
	}

	public void method2235(int i, int i_580_, int i_581_, int i_582_) {
		if (anInt9000 * 1352816403 < i)
			anInt9000 = -1951331557 * i;
		if (anInt9021 * -1593163361 < i_580_)
			anInt9021 = 1128831583 * i_580_;
		if (2024498147 * anInt9001 > i_581_)
			anInt9001 = 391182795 * i_581_;
		if (-148513205 * anInt9003 > i_582_)
			anInt9003 = i_582_ * 1669823331;
		method8451();
	}

	public void method2291() {
		aClass183_Sub2_9032 = null;
		aClass143_9031 = null;
	}

	public void method2030(int i, int i_583_, float f, int i_584_, int i_585_, float f_586_, int i_587_, int i_588_, float f_589_, int i_590_, int i_591_, int i_592_, int i_593_) {
		boolean bool = anIntArray8996 != null;
		boolean bool_594_ = null != aFloatArray8999;
		if (bool || bool_594_) {
			Class107 class107 = method8458(Thread.currentThread());
			Class117 class117 = class107.aClass117_1290;
			class117.aBool1434 = false;
			i -= 1352816403 * anInt9000;
			i_584_ -= anInt9000 * 1352816403;
			i_587_ -= 1352816403 * anInt9000;
			i_583_ -= anInt9021 * -1593163361;
			i_585_ -= -1593163361 * anInt9021;
			i_588_ -= anInt9021 * -1593163361;
			class117.aBool1449 = (i < 0 || i > class117.anInt1441 || i_584_ < 0 || i_584_ > class117.anInt1441 || i_587_ < 0 || i_587_ > class117.anInt1441);
			int i_595_ = i_590_ >>> 24;
			if (i_593_ == 0 || 1 == i_593_ && 255 == i_595_) {
				class117.anInt1436 = 0;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_594_, false, (float) i_583_, (float) i_585_, (float) i_588_, (float) i, (float) i_584_, (float) i_587_, f, f_586_, f_589_, i_590_, i_591_, i_592_);
			} else if (1 == i_593_) {
				class117.anInt1436 = 255 - i_595_;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_594_, false, (float) i_583_, (float) i_585_, (float) i_588_, (float) i, (float) i_584_, (float) i_587_, f, f_586_, f_589_, i_590_, i_591_, i_592_);
			} else if (i_593_ == 2) {
				class117.anInt1436 = 128;
				class117.aBool1435 = true;
				class117.method1504(bool, bool_594_, false, (float) i_583_, (float) i_585_, (float) i_588_, (float) i, (float) i_584_, (float) i_587_, f, f_586_, f_589_, i_590_, i_591_, i_592_);
			} else
				throw new IllegalArgumentException();
			class117.aBool1434 = true;
		}
	}

	Class107 method8458(Runnable runnable) {
		for (int i = 0; i < anInt9025 * 1953374867; i++) {
			if (aClass107Array9006[i].aRunnable1308 == runnable)
				return aClass107Array9006[i];
		}
		return null;
	}

	public boolean method2015() {
		return false;
	}

	public Class183_Sub2 method2304() {
		return new Class183_Sub2_Sub1(this);
	}

	Interface22 method8459(int i, int i_596_) {
		return new Class104(i, i_596_);
	}

	public Interface22 method2032(int i, int i_597_, Class155 class155, Class171 class171, int i_598_) {
		return method8459(i, i_597_);
	}

	public Class443 method2391() {
		Class107 class107 = method8458(Thread.currentThread());
		return class107.aClass443_1280;
	}

	public Interface21 method2229(int i, int i_599_, int i_600_) {
		return new Class139(i, i_599_);
	}

	void method2136(int i, int i_601_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8651(i, i_601_);
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(645305262);
	}

	public FontRenderer method2089(Class2 class2, Class179[] class179s, boolean bool) {
		int[] is = new int[class179s.length];
		int[] is_602_ = new int[class179s.length];
		boolean bool_603_ = false;
		boolean bool_604_ = false;
		for (int i = 0; i < class179s.length; i++) {
			is[i] = class179s[i].method2633();
			is_602_[i] = class179s[i].method2677();
			if (class179s[i].method2641())
				bool_603_ = true;
			if (class179s[i].method2631())
				bool_604_ = true;
		}
		if (bool) {
			if (bool_604_) {
				if (bool_603_)
					return new Class184_Sub3(this, class2, (Class179_Sub2[]) class179s, is, is_602_);
				return new Class184_Sub6(this, class2, (Class179_Sub2[]) class179s, is, is_602_);
			}
			if (bool_603_)
				return new Class184_Sub3(this, class2, (Class179_Sub1[]) class179s, is, is_602_);
			return new Class184_Sub6(this, class2, (Class179_Sub1[]) class179s, is, is_602_);
		}
		if (bool_604_) {
			if (bool_603_)
				throw new IllegalArgumentException("");
			return new Class184_Sub1(this, class2, (Class179_Sub2[]) class179s, is, is_602_);
		}
		return new Class184_Sub2(this, class2, (Class179_Sub1[]) class179s, is, is_602_);
	}

	void method2138(int i, int i_605_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8651(i, i_605_);
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(-16393289);
	}

	void method2139(int i, int i_606_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8651(i, i_606_);
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(1617809733);
	}

	public void method2140() {
		/* empty */
	}

	public void method2130(float f, float f_607_, float f_608_, float[] fs) {
		float f_609_ = (aClass443_9013.aFloatArray4878[10] * f_608_ + (aClass443_9013.aFloatArray4878[14] + aClass443_9013.aFloatArray4878[2] * f + f_607_ * aClass443_9013.aFloatArray4878[6]));
		float f_610_ = (aClass443_9013.aFloatArray4878[11] * f_608_ + (aClass443_9013.aFloatArray4878[7] * f_607_ + (f * aClass443_9013.aFloatArray4878[3] + aClass443_9013.aFloatArray4878[15])));
		if (f_609_ < -f_610_ || f_609_ > f_610_) {
			float[] fs_611_ = fs;
			float[] fs_612_ = fs;
			fs[2] = Float.NaN;
			fs_612_[1] = Float.NaN;
			fs_611_[0] = Float.NaN;
		} else {
			float f_613_ = (aClass443_9013.aFloatArray4878[4] * f_607_ + (f * aClass443_9013.aFloatArray4878[0] + aClass443_9013.aFloatArray4878[12]) + f_608_ * aClass443_9013.aFloatArray4878[8]);
			if (f_613_ < -f_610_ || f_613_ > f_610_) {
				float[] fs_614_ = fs;
				float[] fs_615_ = fs;
				fs[2] = Float.NaN;
				fs_615_[1] = Float.NaN;
				fs_614_[0] = Float.NaN;
			} else {
				float f_616_ = (f_608_ * aClass443_9013.aFloatArray4878[9] + (f_607_ * aClass443_9013.aFloatArray4878[5] + (f * aClass443_9013.aFloatArray4878[1] + aClass443_9013.aFloatArray4878[13])));
				if (f_616_ < -f_610_ || f_616_ > f_610_) {
					float[] fs_617_ = fs;
					float[] fs_618_ = fs;
					fs[2] = Float.NaN;
					fs_618_[1] = Float.NaN;
					fs_617_[0] = Float.NaN;
				} else {
					float f_619_ = (f_608_ * aClass443_9020.aFloatArray4878[10] + (aClass443_9020.aFloatArray4878[14] + aClass443_9020.aFloatArray4878[2] * f + f_607_ * aClass443_9020.aFloatArray4878[6]));
					fs[0] = aFloat9002 + f_613_ * aFloat9019 / f_610_;
					fs[1] = aFloat9023 * f_616_ / f_610_ + aFloat9022;
					fs[2] = f_619_;
				}
			}
		}
	}

	public boolean method2284() {
		return false;
	}

	public void method2266(float f, float f_620_, float f_621_, float[] fs) {
		float f_622_ = (f_620_ * aClass443_9013.aFloatArray4878[7] + (aClass443_9013.aFloatArray4878[3] * f + aClass443_9013.aFloatArray4878[15]) + f_621_ * aClass443_9013.aFloatArray4878[11]);
		float f_623_ = (f_621_ * aClass443_9013.aFloatArray4878[8] + (f_620_ * aClass443_9013.aFloatArray4878[4] + (aClass443_9013.aFloatArray4878[12] + f * aClass443_9013.aFloatArray4878[0])));
		float f_624_ = (f_621_ * aClass443_9013.aFloatArray4878[9] + (aClass443_9013.aFloatArray4878[13] + aClass443_9013.aFloatArray4878[1] * f + aClass443_9013.aFloatArray4878[5] * f_620_));
		float f_625_ = (f * aClass443_9020.aFloatArray4878[2] + aClass443_9020.aFloatArray4878[14] + aClass443_9020.aFloatArray4878[6] * f_620_ + f_621_ * aClass443_9020.aFloatArray4878[10]);
		fs[0] = aFloat9002 + f_623_ * aFloat9019 / f_622_;
		fs[1] = aFloat9022 + f_624_ * aFloat9023 / f_622_;
		fs[2] = f_625_;
	}

	public void method2071(int i, int i_626_) {
		/* empty */
	}

	public void method2244() {
		/* empty */
	}

	public void method2253(float f, float f_627_, float f_628_, float f_629_, float f_630_) {
		/* empty */
	}

	void method8460() {
		if (null != aFloatArray8999) {
			if (0 == anInt9000 * 1352816403 && -570111553 * anInt8997 == 2024498147 * anInt9001 && 0 == anInt9021 * -1593163361 && -1805705211 * anInt8998 == anInt9003 * -148513205) {
				int i = aFloatArray8999.length;
				int i_631_ = i - (i & 0x7);
				int i_632_ = 0;
				while (i_632_ < i_631_) {
					aFloatArray8999[i_632_++] = 2.14748365E9F;
					aFloatArray8999[i_632_++] = 2.14748365E9F;
					aFloatArray8999[i_632_++] = 2.14748365E9F;
					aFloatArray8999[i_632_++] = 2.14748365E9F;
					aFloatArray8999[i_632_++] = 2.14748365E9F;
					aFloatArray8999[i_632_++] = 2.14748365E9F;
					aFloatArray8999[i_632_++] = 2.14748365E9F;
					aFloatArray8999[i_632_++] = 2.14748365E9F;
				}
				while (i_632_ < i)
					aFloatArray8999[i_632_++] = 2.14748365E9F;
			} else {
				int i = 2024498147 * anInt9001 - anInt9000 * 1352816403;
				int i_633_ = anInt9003 * -148513205 - anInt9021 * -1593163361;
				int i_634_ = anInt8997 * -570111553 - i;
				int i_635_ = (anInt9021 * -1593163361 * (anInt8997 * -570111553) + 1352816403 * anInt9000);
				int i_636_ = i >> 3;
				int i_637_ = i & 0x7;
				i = i_635_ - 1;
				for (int i_638_ = -i_633_; i_638_ < 0; i_638_++) {
					if (i_636_ > 0) {
						int i_639_ = i_636_;
						do {
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
						} while (--i_639_ > 0);
					}
					if (i_637_ > 0) {
						int i_640_ = i_637_;
						do
							aFloatArray8999[++i] = 2.14748365E9F;
						while (--i_640_ > 0);
					}
					i += i_634_;
				}
			}
		}
	}

	public NativeSprite method2355(int[] is, int i, int i_641_, int i_642_, int i_643_, boolean bool) {
		boolean bool_644_ = false;
		int i_645_ = i;
		while_29_: for (int i_646_ = 0; i_646_ < i_643_; i_646_++) {
			for (int i_647_ = 0; i_647_ < i_642_; i_647_++) {
				int i_648_ = is[i_645_++] >>> 24;
				if (0 != i_648_ && 255 != i_648_) {
					bool_644_ = true;
					break while_29_;
				}
			}
		}
		if (bool_644_)
			return new Class143_Sub1_Sub1(this, is, i, i_641_, i_642_, i_643_, bool);
		return new Class143_Sub1_Sub2(this, is, i, i_641_, i_642_, i_643_, bool);
	}

	public void method2299(int i, int i_649_) {
		/* empty */
	}

	public boolean method2143() {
		return false;
	}

	public boolean method2144() {
		return false;
	}

	public boolean method2145() {
		return false;
	}

	public boolean method2016() {
		return false;
	}

	public boolean method2147() {
		return false;
	}

	public Class536_Sub19 method2272(int i, int i_650_, int i_651_, int i_652_, int i_653_, float f) {
		return null;
	}

	public boolean method2383() {
		return true;
	}

	public boolean method2151() {
		return false;
	}

	public Class443 method2267() {
		Class107 class107 = method8458(Thread.currentThread());
		return class107.aClass443_1280;
	}

	public boolean method2083() {
		return false;
	}

	public boolean method2155() {
		return false;
	}

	public boolean method2156() {
		return false;
	}

	public boolean method2157() {
		return false;
	}

	public boolean method2158() {
		return false;
	}

	public boolean method2159() {
		return false;
	}

	public boolean method2258() {
		return false;
	}

	public boolean method2161() {
		return false;
	}

	public void method2074() {
		for (int i = 0; i < aClass107Array9006.length; i++) {
			aClass107Array9006[i].anInt1282 = aClass107Array9006[i].anInt1283 * -785127203;
			aClass107Array9006[i].aBool1284 = false;
		}
	}

	public String method2240() {
		return "";
	}

	public String method2164() {
		return "";
	}

	public String method2165() {
		return "";
	}

	public int[] method2166() {
		return null;
	}

	void method2137(int i, int i_654_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8651(i, i_654_);
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(494008177);
	}

	public int method2264(int i, int i_655_) {
		return i | i_655_;
	}

	Class183_Sub1 method2169(Canvas canvas, int i, int i_656_) {
		return Class21.method710(this, canvas, i, i_656_, -60627502);
	}

	public int[] method2170(int i, int i_657_, int i_658_, int i_659_) {
		if (null == anIntArray8996)
			throw new IllegalStateException("");
		int[] is = new int[i_659_ * i_658_];
		int i_660_ = 0;
		for (int i_661_ = 0; i_661_ < i_659_; i_661_++) {
			int i_662_ = i + -570111553 * anInt8997 * (i_661_ + i_657_);
			for (int i_663_ = 0; i_663_ < i_658_; i_663_++)
				is[i_660_++] = anIntArray8996[i_662_ + i_663_];
		}
		return is;
	}

	public int[] method2171(int i, int i_664_, int i_665_, int i_666_) {
		if (null == anIntArray8996)
			throw new IllegalStateException("");
		int[] is = new int[i_666_ * i_665_];
		int i_667_ = 0;
		for (int i_668_ = 0; i_668_ < i_666_; i_668_++) {
			int i_669_ = i + -570111553 * anInt8997 * (i_668_ + i_664_);
			for (int i_670_ = 0; i_670_ < i_665_; i_670_++)
				is[i_667_++] = anIntArray8996[i_669_ + i_670_];
		}
		return is;
	}

	public int method2262(int i, int i_671_, int i_672_, int i_673_, int i_674_, int i_675_) {
		int i_676_ = 0;
		float f = (aClass443_9013.aFloatArray4878[2] * (float) i + aClass443_9013.aFloatArray4878[14] + aClass443_9013.aFloatArray4878[6] * (float) i_671_ + aClass443_9013.aFloatArray4878[10] * (float) i_672_);
		float f_677_ = (aClass443_9013.aFloatArray4878[10] * (float) i_675_ + ((float) i_673_ * aClass443_9013.aFloatArray4878[2] + aClass443_9013.aFloatArray4878[14] + (float) i_674_ * aClass443_9013.aFloatArray4878[6]));
		float f_678_ = ((float) i_672_ * aClass443_9013.aFloatArray4878[11] + ((float) i_671_ * aClass443_9013.aFloatArray4878[7] + ((float) i * aClass443_9013.aFloatArray4878[3] + aClass443_9013.aFloatArray4878[15])));
		float f_679_ = (aClass443_9013.aFloatArray4878[15] + (float) i_673_ * aClass443_9013.aFloatArray4878[3] + (float) i_674_ * aClass443_9013.aFloatArray4878[7] + aClass443_9013.aFloatArray4878[11] * (float) i_675_);
		if (f < -f_678_ && f_677_ < -f_679_)
			i_676_ |= 0x10;
		else if (f > f_678_ && f_677_ > f_679_)
			i_676_ |= 0x20;
		float f_680_ = (aClass443_9013.aFloatArray4878[12] + aClass443_9013.aFloatArray4878[0] * (float) i + (float) i_671_ * aClass443_9013.aFloatArray4878[4] + (float) i_672_ * aClass443_9013.aFloatArray4878[8]);
		float f_681_ = (aClass443_9013.aFloatArray4878[8] * (float) i_675_ + ((float) i_673_ * aClass443_9013.aFloatArray4878[0] + aClass443_9013.aFloatArray4878[12] + aClass443_9013.aFloatArray4878[4] * (float) i_674_));
		if (f_680_ < -f_678_ && f_681_ < -f_679_)
			i_676_ |= 0x1;
		if (f_680_ > f_678_ && f_681_ > f_679_)
			i_676_ |= 0x2;
		float f_682_ = ((float) i_672_ * aClass443_9013.aFloatArray4878[9] + (aClass443_9013.aFloatArray4878[13] + aClass443_9013.aFloatArray4878[1] * (float) i + (float) i_671_ * aClass443_9013.aFloatArray4878[5]));
		float f_683_ = (aClass443_9013.aFloatArray4878[5] * (float) i_674_ + (aClass443_9013.aFloatArray4878[13] + (float) i_673_ * aClass443_9013.aFloatArray4878[1]) + (float) i_675_ * aClass443_9013.aFloatArray4878[9]);
		if (f_682_ < -f_678_ && f_683_ < -f_679_)
			i_676_ |= 0x4;
		if (f_682_ > f_678_ && f_683_ > f_679_)
			i_676_ |= 0x8;
		return i_676_;
	}

	public int[] method2173(int i, int i_684_, int i_685_, int i_686_) {
		if (null == anIntArray8996)
			throw new IllegalStateException("");
		int[] is = new int[i_686_ * i_685_];
		int i_687_ = 0;
		for (int i_688_ = 0; i_688_ < i_686_; i_688_++) {
			int i_689_ = i + -570111553 * anInt8997 * (i_688_ + i_684_);
			for (int i_690_ = 0; i_690_ < i_685_; i_690_++)
				is[i_687_++] = anIntArray8996[i_689_ + i_690_];
		}
		return is;
	}

	public void method2117() {
		/* empty */
	}

	public void method2020(int[] is) {
		is[0] = -570111553 * anInt8997;
		is[1] = -1805705211 * anInt8998;
	}

	public void method2315(int[] is) {
		is[0] = -570111553 * anInt8997;
		is[1] = -1805705211 * anInt8998;
	}

	public boolean method2176() {
		return false;
	}

	public boolean method2247() {
		return true;
	}

	public boolean method2178() {
		return true;
	}

	public boolean method2064() {
		return false;
	}

	public boolean method2180() {
		return false;
	}

	public int method2392() {
		return -1;
	}

	public void method2187(Class168 class168, float f, Class168 class168_691_, float f_692_, Class168 class168_693_, float f_694_) {
		/* empty */
	}

	public int method2184() {
		return -1;
	}

	public void method2185() {
		/* empty */
	}

	public void method2186() {
		/* empty */
	}

	public void method2271() {
		/* empty */
	}

	public void method2188() {
		/* empty */
	}

	public void method2092(int i) {
		Class177_Sub3.anInt9730 = Class177_Sub3.anInt9729 = i;
		if (1953374867 * anInt9025 > 1)
			throw new IllegalStateException();
		method8464(anInt9025 * 1953374867);
		method8470(0);
	}

	public void method2190(long l) {
		/* empty */
	}

	public void method2191(long l) {
		/* empty */
	}

	public NativeSprite method2283(Class179 class179, boolean bool) {
		int i = class179.method2633();
		int i_695_ = class179.method2677();
		Class143_Sub1 class143_sub1;
		if (bool && !class179.method2641() && class179.method2631()) {
			Class179_Sub2 class179_sub2 = (Class179_Sub2) class179;
			int[] is = new int[class179_sub2.anIntArray9813.length];
			byte[] is_696_ = new byte[i * i_695_];
			for (int i_697_ = 0; i_697_ < i_695_; i_697_++) {
				int i_698_ = i * i_697_;
				for (int i_699_ = 0; i_699_ < i; i_699_++)
					is_696_[i_699_ + i_698_] = class179_sub2.aByteArray9820[i_699_ + i_698_];
			}
			for (int i_700_ = 0; i_700_ < class179_sub2.anIntArray9813.length; i_700_++)
				is[i_700_] = class179_sub2.anIntArray9813[i_700_];
			class143_sub1 = new Class143_Sub1_Sub3(this, is_696_, is, i, i_695_);
		} else {
			int[] is = class179.method2643(false);
			if (class179.method2641())
				class143_sub1 = new Class143_Sub1_Sub1(this, is, i, i_695_);
			else
				class143_sub1 = new Class143_Sub1_Sub2(this, is, i, i_695_);
		}
		class143_sub1.method1718(class179.method2635(), class179.method2637(), class179.method2636(), class179.method2638());
		return class143_sub1;
	}

	boolean method2318(int i, int i_701_, int i_702_, int i_703_, Class433 class433, Class437 class437) {
		Class443 class443 = method2391();
		class443.method5359(class433);
		class443.method5390(aClass443_9013);
		return class437.method5296(i, i_701_, i_702_, i_703_, class443, aFloat9002, aFloat9022, aFloat9019, aFloat9023);
	}

	public void method2395() {
		aClass183_Sub2_9032 = null;
		aClass143_9031 = null;
	}

	public Class433 method2268() {
		Class107 class107 = method8458(Thread.currentThread());
		return class107.aClass433_1289;
	}

	void method8461() {
		if (null != aFloatArray8999) {
			if (0 == anInt9000 * 1352816403 && -570111553 * anInt8997 == 2024498147 * anInt9001 && 0 == anInt9021 * -1593163361 && -1805705211 * anInt8998 == anInt9003 * -148513205) {
				int i = aFloatArray8999.length;
				int i_704_ = i - (i & 0x7);
				int i_705_ = 0;
				while (i_705_ < i_704_) {
					aFloatArray8999[i_705_++] = 2.14748365E9F;
					aFloatArray8999[i_705_++] = 2.14748365E9F;
					aFloatArray8999[i_705_++] = 2.14748365E9F;
					aFloatArray8999[i_705_++] = 2.14748365E9F;
					aFloatArray8999[i_705_++] = 2.14748365E9F;
					aFloatArray8999[i_705_++] = 2.14748365E9F;
					aFloatArray8999[i_705_++] = 2.14748365E9F;
					aFloatArray8999[i_705_++] = 2.14748365E9F;
				}
				while (i_705_ < i)
					aFloatArray8999[i_705_++] = 2.14748365E9F;
			} else {
				int i = 2024498147 * anInt9001 - anInt9000 * 1352816403;
				int i_706_ = anInt9003 * -148513205 - anInt9021 * -1593163361;
				int i_707_ = anInt8997 * -570111553 - i;
				int i_708_ = (anInt9021 * -1593163361 * (anInt8997 * -570111553) + 1352816403 * anInt9000);
				int i_709_ = i >> 3;
				int i_710_ = i & 0x7;
				i = i_708_ - 1;
				for (int i_711_ = -i_706_; i_711_ < 0; i_711_++) {
					if (i_709_ > 0) {
						int i_712_ = i_709_;
						do {
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
							aFloatArray8999[++i] = 2.14748365E9F;
						} while (--i_712_ > 0);
					}
					if (i_710_ > 0) {
						int i_713_ = i_710_;
						do
							aFloatArray8999[++i] = 2.14748365E9F;
						while (--i_713_ > 0);
					}
					i += i_707_;
				}
			}
		}
	}

	public boolean method2035() {
		return false;
	}

	public Class160 method2312(int i, int i_714_, int[][] is, int[][] is_715_, int i_716_, int i_717_, int i_718_) {
		return new Class160_Sub3(this, i_717_, i_718_, i, i_714_, is, is_715_, i_716_);
	}

	public int method2265(int i, int i_719_) {
		return i | i_719_;
	}

	public void method2289(int i) {
		/* empty */
	}

	public void method2200() {
		anInt9017 = 0;
		anInt9030 = 0;
		anInt9015 = -299405879 * anInt8997;
		anInt9018 = 16432687 * anInt8998;
		method8451();
	}

	public NativeSprite method2050(int i, int i_720_, boolean bool, boolean bool_721_) {
		if (bool)
			return new Class143_Sub1_Sub1(this, i, i_720_);
		return new Class143_Sub1_Sub2(this, i, i_720_);
	}

	public void method2373(int i, int i_722_, int i_723_, int i_724_) {
		anInt9017 = i * -2035003219;
		anInt9030 = i_722_ * 1594408325;
		anInt9015 = -937436553 * i_723_;
		anInt9018 = -1249779805 * i_724_;
		method8451();
	}

	public void method2203(int[] is) {
		is[0] = anInt9017 * -827223259;
		is[1] = anInt9030 * -1948273843;
		is[2] = anInt9015 * 1903828807;
		is[3] = 726486027 * anInt9018;
	}

	public void method2204(int[] is) {
		is[0] = anInt9017 * -827223259;
		is[1] = anInt9030 * -1948273843;
		is[2] = anInt9015 * 1903828807;
		is[3] = 726486027 * anInt9018;
	}

	public void method2228(int[] is) {
		is[0] = anInt9017 * -827223259;
		is[1] = anInt9030 * -1948273843;
		is[2] = anInt9015 * 1903828807;
		is[3] = 726486027 * anInt9018;
	}

	public void method2154(int[] is) {
		is[0] = anInt9017 * -827223259;
		is[1] = anInt9030 * -1948273843;
		is[2] = anInt9015 * 1903828807;
		is[3] = 726486027 * anInt9018;
	}

	public void method2206(float f, float f_725_) {
		aFloat9011 = f_725_ - f;
		aFloat9024 = f + f_725_ - 1.0F;
		for (int i = 0; i < 1953374867 * anInt9025; i++) {
			Class107 class107 = aClass107Array9006[i];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1445 = aFloat9011;
			class117.aFloat1444 = aFloat9024;
		}
	}

	public void method2217(int[] is) {
		is[0] = anInt9000 * 1352816403;
		is[1] = anInt9021 * -1593163361;
		is[2] = 2024498147 * anInt9001;
		is[3] = -148513205 * anInt9003;
	}

	public void method2234(int i, int i_726_, int i_727_, int i_728_, int i_729_, int i_730_, Class161 class161, int i_731_, int i_732_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_733_ = class161_sub2.anIntArray9445;
			int i_734_ = (-1593163361 * anInt9021 > i_732_ ? -1593163361 * anInt9021 : i_732_);
			int i_735_ = (anInt9003 * -148513205 < i_732_ + is.length ? anInt9003 * -148513205 : is.length + i_732_);
			i_727_ -= i;
			i_728_ -= i_726_;
			if (i_727_ + i_728_ < 0) {
				i += i_727_;
				i_727_ = -i_727_;
				i_726_ += i_728_;
				i_728_ = -i_728_;
			}
			if (i_727_ > i_728_) {
				i_726_ <<= 16;
				i_726_ += 32768;
				i_728_ <<= 16;
				int i_736_ = (int) Math.floor((double) i_728_ / (double) i_727_ + 0.5);
				i_727_ += i;
				if (i < anInt9000 * 1352816403) {
					i_726_ += (anInt9000 * 1352816403 - i) * i_736_;
					i = anInt9000 * 1352816403;
				}
				if (i_727_ >= 2024498147 * anInt9001)
					i_727_ = 2024498147 * anInt9001 - 1;
				int i_737_ = i_729_ >>> 24;
				if (i_730_ == 0 || 1 == i_730_ && i_737_ == 255) {
					for (/**/; i <= i_727_; i++) {
						int i_738_ = i_726_ >> 16;
						int i_739_ = i_738_ - i_732_;
						if (i_738_ >= i_734_ && i_738_ < i_735_) {
							int i_740_ = is[i_739_] + i_731_;
							if (i >= i_740_ && i < i_740_ + is_733_[i_739_])
								anIntArray8996[i_738_ * (anInt8997 * -570111553) + i] = i_729_;
						}
						i_726_ += i_736_;
					}
				} else if (1 == i_730_) {
					i_729_ = ((i_737_ << 24) + ((i_737_ * (i_729_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_729_ & 0xff00) * i_737_ >> 8 & 0xff00)));
					int i_741_ = 256 - i_737_;
					for (/**/; i <= i_727_; i++) {
						int i_742_ = i_726_ >> 16;
						int i_743_ = i_742_ - i_732_;
						if (i_742_ >= i_734_ && i_742_ < i_735_) {
							int i_744_ = i_731_ + is[i_743_];
							if (i >= i_744_ && i < is_733_[i_743_] + i_744_) {
								int i_745_ = i_742_ * (-570111553 * anInt8997) + i;
								int i_746_ = anIntArray8996[i_745_];
								i_746_ = ((i_741_ * (i_746_ & 0xff00ff) >> 8 & 0xff00ff) + (i_741_ * (i_746_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_745_] = i_746_ + i_729_;
							}
						}
						i_726_ += i_736_;
					}
				} else if (2 == i_730_) {
					for (/**/; i <= i_727_; i++) {
						int i_747_ = i_726_ >> 16;
						int i_748_ = i_747_ - i_732_;
						if (i_747_ >= i_734_ && i_747_ < i_735_) {
							int i_749_ = is[i_748_] + i_731_;
							if (i >= i_749_ && i < is_733_[i_748_] + i_749_) {
								int i_750_ = i_747_ * (-570111553 * anInt8997) + i;
								int i_751_ = anIntArray8996[i_750_];
								int i_752_ = i_751_ + i_729_;
								int i_753_ = ((i_729_ & 0xff00ff) + (i_751_ & 0xff00ff));
								i_751_ = (i_753_ & 0x1000100) + (i_752_ - i_753_ & 0x10000);
								anIntArray8996[i_750_] = i_752_ - i_751_ | i_751_ - (i_751_ >>> 8);
							}
						}
						i_726_ += i_736_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_727_ <<= 16;
				int i_754_ = (int) Math.floor(0.5 + ((double) i_727_ / (double) i_728_));
				i_728_ += i_726_;
				if (i_726_ < i_734_) {
					i += i_754_ * (i_734_ - i_726_);
					i_726_ = i_734_;
				}
				if (i_728_ >= i_735_)
					i_728_ = i_735_ - 1;
				int i_755_ = i_729_ >>> 24;
				if (0 == i_730_ || 1 == i_730_ && i_755_ == 255) {
					for (/**/; i_726_ <= i_728_; i_726_++) {
						int i_756_ = i >> 16;
						int i_757_ = i_726_ - i_732_;
						int i_758_ = i_731_ + is[i_757_];
						if (i_756_ >= 1352816403 * anInt9000 && i_756_ < anInt9001 * 2024498147 && i_756_ >= i_758_ && i_756_ < i_758_ + is_733_[i_757_])
							anIntArray8996[(i_756_ + -570111553 * anInt8997 * i_726_)] = i_729_;
						i += i_754_;
					}
				} else if (i_730_ == 1) {
					i_729_ = ((i_755_ * (i_729_ & 0xff00) >> 8 & 0xff00) + ((i_729_ & 0xff00ff) * i_755_ >> 8 & 0xff00ff) + (i_755_ << 24));
					int i_759_ = 256 - i_755_;
					for (/**/; i_726_ <= i_728_; i_726_++) {
						int i_760_ = i >> 16;
						int i_761_ = i_726_ - i_732_;
						int i_762_ = i_731_ + is[i_761_];
						if (i_760_ >= 1352816403 * anInt9000 && i_760_ < anInt9001 * 2024498147 && i_760_ >= i_762_ && i_760_ < i_762_ + is_733_[i_761_]) {
							int i_763_ = i_760_ + -570111553 * anInt8997 * i_726_;
							int i_764_ = anIntArray8996[i_763_];
							i_764_ = (((i_764_ & 0xff00ff) * i_759_ >> 8 & 0xff00ff) + ((i_764_ & 0xff00) * i_759_ >> 8 & 0xff00));
							anIntArray8996[(i_726_ * (anInt8997 * -570111553) + i_760_)] = i_729_ + i_764_;
						}
						i += i_754_;
					}
				} else if (i_730_ == 2) {
					for (/**/; i_726_ <= i_728_; i_726_++) {
						int i_765_ = i >> 16;
						int i_766_ = i_726_ - i_732_;
						int i_767_ = i_731_ + is[i_766_];
						if (i_765_ >= 1352816403 * anInt9000 && i_765_ < 2024498147 * anInt9001 && i_765_ >= i_767_ && i_765_ < is_733_[i_766_] + i_767_) {
							int i_768_ = -570111553 * anInt8997 * i_726_ + i_765_;
							int i_769_ = anIntArray8996[i_768_];
							int i_770_ = i_769_ + i_729_;
							int i_771_ = (i_769_ & 0xff00ff) + (i_729_ & 0xff00ff);
							i_769_ = (i_770_ - i_771_ & 0x10000) + (i_771_ & 0x1000100);
							anIntArray8996[i_768_] = i_770_ - i_769_ | i_769_ - (i_769_ >>> 8);
						}
						i += i_754_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean method2345() {
		return false;
	}

	void method8462() {
		int i = 2024498147 * anInt9001 - 1352816403 * anInt9000;
		int i_772_ = anInt9003 * -148513205 - anInt9021 * -1593163361;
		float f = aFloat9019 = (float) (anInt9015 * 1903828807) / 2.0F;
		float f_773_ = aFloat9023 = (float) (anInt9018 * 726486027) / 2.0F;
		aFloat9002 = f + (float) (anInt9017 * -827223259);
		aFloat9022 = (float) (anInt9030 * -1948273843) + f_773_;
		for (int i_774_ = 0; i_774_ < anInt9025 * 1953374867; i_774_++) {
			Class107 class107 = aClass107Array9006[i_774_];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1459 = f;
			class117.aFloat1439 = f_773_;
			class117.aFloat1462 = aFloat9002 - (float) (anInt9000 * 1352816403);
			class117.aFloat1442 = aFloat9022 - (float) (-1593163361 * anInt9021);
			class117.anInt1441 = i;
			class117.anInt1460 = i_772_;
		}
		int i_775_ = (anInt8997 * -570111553 * (-1593163361 * anInt9021) + 1352816403 * anInt9000);
		for (int i_776_ = -1593163361 * anInt9021; i_776_ < -148513205 * anInt9003; i_776_++) {
			for (int i_777_ = 0; i_777_ < 1953374867 * anInt9025; i_777_++)
				aClass107Array9006[i_777_].aClass117_1290.anIntArray1446[i_776_ - anInt9021 * -1593163361] = i_775_;
			i_775_ += -570111553 * anInt8997;
		}
	}

	void method8463() {
		int i = 2024498147 * anInt9001 - 1352816403 * anInt9000;
		int i_778_ = anInt9003 * -148513205 - anInt9021 * -1593163361;
		float f = aFloat9019 = (float) (anInt9015 * 1903828807) / 2.0F;
		float f_779_ = aFloat9023 = (float) (anInt9018 * 726486027) / 2.0F;
		aFloat9002 = f + (float) (anInt9017 * -827223259);
		aFloat9022 = (float) (anInt9030 * -1948273843) + f_779_;
		for (int i_780_ = 0; i_780_ < anInt9025 * 1953374867; i_780_++) {
			Class107 class107 = aClass107Array9006[i_780_];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1459 = f;
			class117.aFloat1439 = f_779_;
			class117.aFloat1462 = aFloat9002 - (float) (anInt9000 * 1352816403);
			class117.aFloat1442 = aFloat9022 - (float) (-1593163361 * anInt9021);
			class117.anInt1441 = i;
			class117.anInt1460 = i_778_;
		}
		int i_781_ = (anInt8997 * -570111553 * (-1593163361 * anInt9021) + 1352816403 * anInt9000);
		for (int i_782_ = -1593163361 * anInt9021; i_782_ < -148513205 * anInt9003; i_782_++) {
			for (int i_783_ = 0; i_783_ < 1953374867 * anInt9025; i_783_++)
				aClass107Array9006[i_783_].aClass117_1290.anIntArray1446[i_782_ - anInt9021 * -1593163361] = i_781_;
			i_781_ += -570111553 * anInt8997;
		}
	}

	public void method2364(int i, float f, float f_784_, float f_785_, float f_786_, float f_787_) {
		anInt9007 = -1282578887 * (int) (f * 65535.0F);
		anInt9008 = -381993433 * (int) (65535.0F * f_784_);
		float f_788_ = (float) Math.sqrt((double) (f_787_ * f_787_ + (f_785_ * f_785_ + f_786_ * f_786_)));
		anInt9004 = 2048043533 * (int) (f_785_ * 65535.0F / f_788_);
		anInt9016 = -118062721 * (int) (65535.0F * f_786_ / f_788_);
		anInt9026 = -822560063 * (int) (65535.0F * f_787_ / f_788_);
	}

	public void method2298(int i, int i_789_) {
		/* empty */
	}

	public void method2326() {
		for (int i = 0; i < aClass107Array9006.length; i++) {
			aClass107Array9006[i].anInt1282 = aClass107Array9006[i].anInt1283 * -785127203;
			aClass107Array9006[i].aBool1284 = false;
		}
	}

	public void method2212(int i, int i_790_, int i_791_, int i_792_) {
		if (i < 0)
			i = 0;
		if (i_790_ < 0)
			i_790_ = 0;
		if (i_791_ > anInt8997 * -570111553)
			i_791_ = -570111553 * anInt8997;
		if (i_792_ > -1805705211 * anInt8998)
			i_792_ = -1805705211 * anInt8998;
		anInt9000 = i * -1951331557;
		anInt9001 = i_791_ * 391182795;
		anInt9021 = i_790_ * 1128831583;
		anInt9003 = 1669823331 * i_792_;
		method8451();
	}

	public void method2063(int i, int i_793_, int i_794_, int i_795_, int i_796_, int i_797_) {
		if (null != anIntArray8996) {
			if (i < 1352816403 * anInt9000) {
				i_794_ -= 1352816403 * anInt9000 - i;
				i = 1352816403 * anInt9000;
			}
			if (i_793_ < -1593163361 * anInt9021) {
				i_795_ -= anInt9021 * -1593163361 - i_793_;
				i_793_ = -1593163361 * anInt9021;
			}
			if (i + i_794_ > anInt9001 * 2024498147)
				i_794_ = anInt9001 * 2024498147 - i;
			if (i_793_ + i_795_ > -148513205 * anInt9003)
				i_795_ = anInt9003 * -148513205 - i_793_;
			if (i_794_ > 0 && i_795_ > 0 && i <= 2024498147 * anInt9001 && i_793_ <= anInt9003 * -148513205) {
				int i_798_ = -570111553 * anInt8997 - i_794_;
				int i_799_ = anInt8997 * -570111553 * i_793_ + i;
				int i_800_ = i_796_ >>> 24;
				if (0 == i_797_ || i_797_ == 1 && i_800_ == 255) {
					int i_801_ = i_794_ >> 3;
					int i_802_ = i_794_ & 0x7;
					i_794_ = i_799_ - 1;
					for (int i_803_ = -i_795_; i_803_ < 0; i_803_++) {
						if (i_801_ > 0) {
							i = i_801_;
							do {
								anIntArray8996[++i_794_] = i_796_;
								anIntArray8996[++i_794_] = i_796_;
								anIntArray8996[++i_794_] = i_796_;
								anIntArray8996[++i_794_] = i_796_;
								anIntArray8996[++i_794_] = i_796_;
								anIntArray8996[++i_794_] = i_796_;
								anIntArray8996[++i_794_] = i_796_;
								anIntArray8996[++i_794_] = i_796_;
							} while (--i > 0);
						}
						if (i_802_ > 0) {
							i = i_802_;
							do
								anIntArray8996[++i_794_] = i_796_;
							while (--i > 0);
						}
						i_794_ += i_798_;
					}
				} else if (i_797_ == 1) {
					i_796_ = (((i_796_ & 0xff00ff) * i_800_ >> 8 & 0xff00ff) + (i_800_ * ((i_796_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_804_ = 256 - i_800_;
					for (int i_805_ = 0; i_805_ < i_795_; i_805_++) {
						for (int i_806_ = -i_794_; i_806_ < 0; i_806_++) {
							int i_807_ = anIntArray8996[i_799_];
							i_807_ = ((i_804_ * (i_807_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_807_ & ~0xff00ff) >>> 8) * i_804_ & ~0xff00ff));
							anIntArray8996[i_799_++] = i_796_ + i_807_;
						}
						i_799_ += i_798_;
					}
				} else if (2 == i_797_) {
					for (int i_808_ = 0; i_808_ < i_795_; i_808_++) {
						for (int i_809_ = -i_794_; i_809_ < 0; i_809_++) {
							int i_810_ = anIntArray8996[i_799_];
							int i_811_ = i_810_ + i_796_;
							int i_812_ = (i_810_ & 0xff00ff) + (i_796_ & 0xff00ff);
							i_810_ = (i_811_ - i_812_ & 0x10000) + (i_812_ & 0x1000100);
							anIntArray8996[i_799_++] = i_811_ - i_810_ | i_810_ - (i_810_ >>> 8);
						}
						i_799_ += i_798_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2381(int i, int i_813_, int i_814_, int i_815_, int i_816_) {
		if (anIntArray8996 != null && (i_813_ >= -1593163361 * anInt9021 && i_813_ < anInt9003 * -148513205)) {
			if (i < 1352816403 * anInt9000) {
				i_814_ -= 1352816403 * anInt9000 - i;
				i = anInt9000 * 1352816403;
			}
			if (i + i_814_ > 2024498147 * anInt9001)
				i_814_ = 2024498147 * anInt9001 - i;
			int i_817_ = i + i_813_ * (-570111553 * anInt8997);
			int i_818_ = i_815_ >>> 24;
			if (0 == i_816_ || 1 == i_816_ && 255 == i_818_) {
				for (int i_819_ = 0; i_819_ < i_814_; i_819_++)
					anIntArray8996[i_819_ + i_817_] = i_815_;
			} else if (1 == i_816_) {
				i_815_ = ((i_818_ << 24) + (((i_815_ & 0xff00ff) * i_818_ >> 8 & 0xff00ff) + ((i_815_ & 0xff00) * i_818_ >> 8 & 0xff00)));
				int i_820_ = 256 - i_818_;
				for (int i_821_ = 0; i_821_ < i_814_; i_821_++) {
					int i_822_ = anIntArray8996[i_817_ + i_821_];
					i_822_ = (((i_822_ & 0xff00ff) * i_820_ >> 8 & 0xff00ff) + ((i_822_ & 0xff00) * i_820_ >> 8 & 0xff00));
					anIntArray8996[i_821_ + i_817_] = i_822_ + i_815_;
				}
			} else if (i_816_ == 2) {
				for (int i_823_ = 0; i_823_ < i_814_; i_823_++) {
					int i_824_ = anIntArray8996[i_817_ + i_823_];
					int i_825_ = i_815_ + i_824_;
					int i_826_ = (i_824_ & 0xff00ff) + (i_815_ & 0xff00ff);
					i_824_ = (i_826_ & 0x1000100) + (i_825_ - i_826_ & 0x10000);
					anIntArray8996[i_817_ + i_823_] = i_825_ - i_824_ | i_824_ - (i_824_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method2148() {
		return true;
	}

	public boolean method2031() {
		return false;
	}

	public Class536_Sub19 method2192(int i, int i_827_, int i_828_, int i_829_, int i_830_, float f) {
		return null;
	}

	public void method2328(Class433 class433) {
		aClass433_9010 = class433;
		method8456();
	}

	public void method2115(int i, int i_831_, int i_832_, int i_833_) {
		if (anInt9000 * 1352816403 < i)
			anInt9000 = -1951331557 * i;
		if (anInt9021 * -1593163361 < i_831_)
			anInt9021 = 1128831583 * i_831_;
		if (2024498147 * anInt9001 > i_832_)
			anInt9001 = 391182795 * i_832_;
		if (-148513205 * anInt9003 > i_833_)
			anInt9003 = i_833_ * 1669823331;
		method8451();
	}

	public void method2404(int i, int i_834_) {
		if (0 != (i & 0x1))
			method2063(0, 0, -570111553 * anInt8997, anInt8998 * -1805705211, i_834_, 0);
		if (0 != (i & 0x2))
			method8460();
	}

	public void method2221(int i, int i_835_) {
		if (0 != (i & 0x1))
			method2063(0, 0, -570111553 * anInt8997, anInt8998 * -1805705211, i_835_, 0);
		if (0 != (i & 0x2))
			method8460();
	}

	public long method2189(int i, int i_836_) {
		return 0L;
	}

	public void method2371(int i, int i_837_, int i_838_, int i_839_, int i_840_, int i_841_) {
		method2066(i, i_837_, i_838_, i_840_, i_841_);
		method2066(i, i_839_ + i_837_ - 1, i_838_, i_840_, i_841_);
		method2067(i, i_837_ + 1, i_839_ - 2, i_840_, i_841_);
		method2067(i + i_838_ - 1, 1 + i_837_, i_839_ - 2, i_840_, i_841_);
	}

	public void method2046(int i, int i_842_, int i_843_, int i_844_, int i_845_, int i_846_) {
		if (null != anIntArray8996) {
			if (i < 1352816403 * anInt9000) {
				i_843_ -= 1352816403 * anInt9000 - i;
				i = 1352816403 * anInt9000;
			}
			if (i_842_ < -1593163361 * anInt9021) {
				i_844_ -= anInt9021 * -1593163361 - i_842_;
				i_842_ = -1593163361 * anInt9021;
			}
			if (i + i_843_ > anInt9001 * 2024498147)
				i_843_ = anInt9001 * 2024498147 - i;
			if (i_842_ + i_844_ > -148513205 * anInt9003)
				i_844_ = anInt9003 * -148513205 - i_842_;
			if (i_843_ > 0 && i_844_ > 0 && i <= 2024498147 * anInt9001 && i_842_ <= anInt9003 * -148513205) {
				int i_847_ = -570111553 * anInt8997 - i_843_;
				int i_848_ = anInt8997 * -570111553 * i_842_ + i;
				int i_849_ = i_845_ >>> 24;
				if (0 == i_846_ || i_846_ == 1 && i_849_ == 255) {
					int i_850_ = i_843_ >> 3;
					int i_851_ = i_843_ & 0x7;
					i_843_ = i_848_ - 1;
					for (int i_852_ = -i_844_; i_852_ < 0; i_852_++) {
						if (i_850_ > 0) {
							i = i_850_;
							do {
								anIntArray8996[++i_843_] = i_845_;
								anIntArray8996[++i_843_] = i_845_;
								anIntArray8996[++i_843_] = i_845_;
								anIntArray8996[++i_843_] = i_845_;
								anIntArray8996[++i_843_] = i_845_;
								anIntArray8996[++i_843_] = i_845_;
								anIntArray8996[++i_843_] = i_845_;
								anIntArray8996[++i_843_] = i_845_;
							} while (--i > 0);
						}
						if (i_851_ > 0) {
							i = i_851_;
							do
								anIntArray8996[++i_843_] = i_845_;
							while (--i > 0);
						}
						i_843_ += i_847_;
					}
				} else if (i_846_ == 1) {
					i_845_ = (((i_845_ & 0xff00ff) * i_849_ >> 8 & 0xff00ff) + (i_849_ * ((i_845_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_853_ = 256 - i_849_;
					for (int i_854_ = 0; i_854_ < i_844_; i_854_++) {
						for (int i_855_ = -i_843_; i_855_ < 0; i_855_++) {
							int i_856_ = anIntArray8996[i_848_];
							i_856_ = ((i_853_ * (i_856_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_856_ & ~0xff00ff) >>> 8) * i_853_ & ~0xff00ff));
							anIntArray8996[i_848_++] = i_845_ + i_856_;
						}
						i_848_ += i_847_;
					}
				} else if (2 == i_846_) {
					for (int i_857_ = 0; i_857_ < i_844_; i_857_++) {
						for (int i_858_ = -i_843_; i_858_ < 0; i_858_++) {
							int i_859_ = anIntArray8996[i_848_];
							int i_860_ = i_859_ + i_845_;
							int i_861_ = (i_859_ & 0xff00ff) + (i_845_ & 0xff00ff);
							i_859_ = (i_860_ - i_861_ & 0x10000) + (i_861_ & 0x1000100);
							anIntArray8996[i_848_++] = i_860_ - i_859_ | i_859_ - (i_859_ >>> 8);
						}
						i_848_ += i_847_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean method2009() {
		return false;
	}

	void method8464(int i) {
		anInt9025 = 470829979 * i;
		aClass107Array9006 = new Class107[anInt9025 * 1953374867];
		for (int i_862_ = 0; i_862_ < anInt9025 * 1953374867; i_862_++)
			aClass107Array9006[i_862_] = new Class107(this);
	}

	public void method2198() {
		anInt9017 = 0;
		anInt9030 = 0;
		anInt9015 = -299405879 * anInt8997;
		anInt9018 = 16432687 * anInt8998;
		method8451();
	}

	void method2227(int i, int i_863_, int i_864_, int i_865_, int i_866_) {
		if (anIntArray8996 != null && (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147)) {
			if (i_863_ < anInt9021 * -1593163361) {
				i_864_ -= -1593163361 * anInt9021 - i_863_;
				i_863_ = -1593163361 * anInt9021;
			}
			if (i_863_ + i_864_ > anInt9003 * -148513205)
				i_864_ = anInt9003 * -148513205 - i_863_;
			int i_867_ = i + -570111553 * anInt8997 * i_863_;
			int i_868_ = i_865_ >>> 24;
			if (0 == i_866_ || i_866_ == 1 && 255 == i_868_) {
				for (int i_869_ = 0; i_869_ < i_864_; i_869_++)
					anIntArray8996[-570111553 * anInt8997 * i_869_ + i_867_] = i_865_;
			} else if (1 == i_866_) {
				i_865_ = ((i_868_ * (i_865_ & 0xff00) >> 8 & 0xff00) + (i_868_ * (i_865_ & 0xff00ff) >> 8 & 0xff00ff) + (i_868_ << 24));
				int i_870_ = 256 - i_868_;
				for (int i_871_ = 0; i_871_ < i_864_; i_871_++) {
					int i_872_ = i_867_ + -570111553 * anInt8997 * i_871_;
					int i_873_ = anIntArray8996[i_872_];
					i_873_ = (((i_873_ & 0xff00) * i_870_ >> 8 & 0xff00) + ((i_873_ & 0xff00ff) * i_870_ >> 8 & 0xff00ff));
					anIntArray8996[i_872_] = i_873_ + i_865_;
				}
			} else if (2 == i_866_) {
				for (int i_874_ = 0; i_874_ < i_864_; i_874_++) {
					int i_875_ = -570111553 * anInt8997 * i_874_ + i_867_;
					int i_876_ = anIntArray8996[i_875_];
					int i_877_ = i_876_ + i_865_;
					int i_878_ = (i_876_ & 0xff00ff) + (i_865_ & 0xff00ff);
					i_876_ = (i_878_ & 0x1000100) + (i_877_ - i_878_ & 0x10000);
					anIntArray8996[i_875_] = i_877_ - i_876_ | i_876_ - (i_876_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method2301(int i, int i_879_, int i_880_, int i_881_, int i_882_) {
		if (anIntArray8996 != null && (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147)) {
			if (i_879_ < anInt9021 * -1593163361) {
				i_880_ -= -1593163361 * anInt9021 - i_879_;
				i_879_ = -1593163361 * anInt9021;
			}
			if (i_879_ + i_880_ > anInt9003 * -148513205)
				i_880_ = anInt9003 * -148513205 - i_879_;
			int i_883_ = i + -570111553 * anInt8997 * i_879_;
			int i_884_ = i_881_ >>> 24;
			if (0 == i_882_ || i_882_ == 1 && 255 == i_884_) {
				for (int i_885_ = 0; i_885_ < i_880_; i_885_++)
					anIntArray8996[-570111553 * anInt8997 * i_885_ + i_883_] = i_881_;
			} else if (1 == i_882_) {
				i_881_ = ((i_884_ * (i_881_ & 0xff00) >> 8 & 0xff00) + (i_884_ * (i_881_ & 0xff00ff) >> 8 & 0xff00ff) + (i_884_ << 24));
				int i_886_ = 256 - i_884_;
				for (int i_887_ = 0; i_887_ < i_880_; i_887_++) {
					int i_888_ = i_883_ + -570111553 * anInt8997 * i_887_;
					int i_889_ = anIntArray8996[i_888_];
					i_889_ = (((i_889_ & 0xff00) * i_886_ >> 8 & 0xff00) + ((i_889_ & 0xff00ff) * i_886_ >> 8 & 0xff00ff));
					anIntArray8996[i_888_] = i_889_ + i_881_;
				}
			} else if (2 == i_882_) {
				for (int i_890_ = 0; i_890_ < i_880_; i_890_++) {
					int i_891_ = -570111553 * anInt8997 * i_890_ + i_883_;
					int i_892_ = anIntArray8996[i_891_];
					int i_893_ = i_892_ + i_881_;
					int i_894_ = (i_892_ & 0xff00ff) + (i_881_ & 0xff00ff);
					i_892_ = (i_894_ & 0x1000100) + (i_893_ - i_894_ & 0x10000);
					anIntArray8996[i_891_] = i_893_ - i_892_ | i_892_ - (i_892_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method2250(int i, int i_895_, int i_896_, int i_897_, int i_898_) {
		if (anIntArray8996 != null && (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147)) {
			if (i_895_ < anInt9021 * -1593163361) {
				i_896_ -= -1593163361 * anInt9021 - i_895_;
				i_895_ = -1593163361 * anInt9021;
			}
			if (i_895_ + i_896_ > anInt9003 * -148513205)
				i_896_ = anInt9003 * -148513205 - i_895_;
			int i_899_ = i + -570111553 * anInt8997 * i_895_;
			int i_900_ = i_897_ >>> 24;
			if (0 == i_898_ || i_898_ == 1 && 255 == i_900_) {
				for (int i_901_ = 0; i_901_ < i_896_; i_901_++)
					anIntArray8996[-570111553 * anInt8997 * i_901_ + i_899_] = i_897_;
			} else if (1 == i_898_) {
				i_897_ = ((i_900_ * (i_897_ & 0xff00) >> 8 & 0xff00) + (i_900_ * (i_897_ & 0xff00ff) >> 8 & 0xff00ff) + (i_900_ << 24));
				int i_902_ = 256 - i_900_;
				for (int i_903_ = 0; i_903_ < i_896_; i_903_++) {
					int i_904_ = i_899_ + -570111553 * anInt8997 * i_903_;
					int i_905_ = anIntArray8996[i_904_];
					i_905_ = (((i_905_ & 0xff00) * i_902_ >> 8 & 0xff00) + ((i_905_ & 0xff00ff) * i_902_ >> 8 & 0xff00ff));
					anIntArray8996[i_904_] = i_905_ + i_897_;
				}
			} else if (2 == i_898_) {
				for (int i_906_ = 0; i_906_ < i_896_; i_906_++) {
					int i_907_ = -570111553 * anInt8997 * i_906_ + i_899_;
					int i_908_ = anIntArray8996[i_907_];
					int i_909_ = i_908_ + i_897_;
					int i_910_ = (i_908_ & 0xff00ff) + (i_897_ & 0xff00ff);
					i_908_ = (i_910_ & 0x1000100) + (i_909_ - i_910_ & 0x10000);
					anIntArray8996[i_907_] = i_909_ - i_908_ | i_908_ - (i_908_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method2384(int i, int i_911_, int i_912_, int i_913_, int i_914_) {
		if (anIntArray8996 != null && (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147)) {
			if (i_911_ < anInt9021 * -1593163361) {
				i_912_ -= -1593163361 * anInt9021 - i_911_;
				i_911_ = -1593163361 * anInt9021;
			}
			if (i_911_ + i_912_ > anInt9003 * -148513205)
				i_912_ = anInt9003 * -148513205 - i_911_;
			int i_915_ = i + -570111553 * anInt8997 * i_911_;
			int i_916_ = i_913_ >>> 24;
			if (0 == i_914_ || i_914_ == 1 && 255 == i_916_) {
				for (int i_917_ = 0; i_917_ < i_912_; i_917_++)
					anIntArray8996[-570111553 * anInt8997 * i_917_ + i_915_] = i_913_;
			} else if (1 == i_914_) {
				i_913_ = ((i_916_ * (i_913_ & 0xff00) >> 8 & 0xff00) + (i_916_ * (i_913_ & 0xff00ff) >> 8 & 0xff00ff) + (i_916_ << 24));
				int i_918_ = 256 - i_916_;
				for (int i_919_ = 0; i_919_ < i_912_; i_919_++) {
					int i_920_ = i_915_ + -570111553 * anInt8997 * i_919_;
					int i_921_ = anIntArray8996[i_920_];
					i_921_ = (((i_921_ & 0xff00) * i_918_ >> 8 & 0xff00) + ((i_921_ & 0xff00ff) * i_918_ >> 8 & 0xff00ff));
					anIntArray8996[i_920_] = i_921_ + i_913_;
				}
			} else if (2 == i_914_) {
				for (int i_922_ = 0; i_922_ < i_912_; i_922_++) {
					int i_923_ = -570111553 * anInt8997 * i_922_ + i_915_;
					int i_924_ = anIntArray8996[i_923_];
					int i_925_ = i_924_ + i_913_;
					int i_926_ = (i_924_ & 0xff00ff) + (i_913_ & 0xff00ff);
					i_924_ = (i_926_ & 0x1000100) + (i_925_ - i_926_ & 0x10000);
					anIntArray8996[i_923_] = i_925_ - i_924_ | i_924_ - (i_924_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2374(int i) {
		Class177_Sub3.anInt9730 = Class177_Sub3.anInt9729 = i;
		if (1953374867 * anInt9025 > 1)
			throw new IllegalStateException();
		method8464(anInt9025 * 1953374867);
		method8470(0);
	}

	public void method2397(int i, int i_927_, int i_928_, int i_929_, int i_930_, int i_931_) {
		if (null != anIntArray8996) {
			i_928_ -= i;
			i_929_ -= i_927_;
			if (i_929_ == 0) {
				if (i_928_ >= 0)
					method2066(i, i_927_, 1 + i_928_, i_930_, i_931_);
				else
					method2066(i_928_ + i, i_927_, 1 + -i_928_, i_930_, i_931_);
			} else if (0 == i_928_) {
				if (i_929_ >= 0)
					method2067(i, i_927_, i_929_ + 1, i_930_, i_931_);
				else
					method2067(i, i_929_ + i_927_, -i_929_ + 1, i_930_, i_931_);
			} else {
				if (i_928_ + i_929_ < 0) {
					i += i_928_;
					i_928_ = -i_928_;
					i_927_ += i_929_;
					i_929_ = -i_929_;
				}
				if (i_928_ > i_929_) {
					i_927_ <<= 16;
					i_927_ += 32768;
					i_929_ <<= 16;
					int i_932_ = (int) Math.floor(0.5 + ((double) i_929_ / (double) i_928_));
					i_928_ += i;
					if (i < 1352816403 * anInt9000) {
						i_927_ += i_932_ * (anInt9000 * 1352816403 - i);
						i = 1352816403 * anInt9000;
					}
					if (i_928_ >= anInt9001 * 2024498147)
						i_928_ = 2024498147 * anInt9001 - 1;
					int i_933_ = i_930_ >>> 24;
					if (0 == i_931_ || i_931_ == 1 && i_933_ == 255) {
						for (/**/; i <= i_928_; i++) {
							int i_934_ = i_927_ >> 16;
							if (i_934_ >= -1593163361 * anInt9021 && i_934_ < anInt9003 * -148513205)
								anIntArray8996[i_934_ * (anInt8997 * -570111553) + i] = i_930_;
							i_927_ += i_932_;
						}
					} else if (1 == i_931_) {
						i_930_ = (((i_930_ & 0xff00) * i_933_ >> 8 & 0xff00) + (i_933_ * (i_930_ & 0xff00ff) >> 8 & 0xff00ff) + (i_933_ << 24));
						int i_935_ = 256 - i_933_;
						for (/**/; i <= i_928_; i++) {
							int i_936_ = i_927_ >> 16;
							if (i_936_ >= -1593163361 * anInt9021 && i_936_ < -148513205 * anInt9003) {
								int i_937_ = anInt8997 * -570111553 * i_936_ + i;
								int i_938_ = anIntArray8996[i_937_];
								i_938_ = ((i_935_ * (i_938_ & 0xff00ff) >> 8 & 0xff00ff) + (i_935_ * (i_938_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_937_] = i_938_ + i_930_;
							}
							i_927_ += i_932_;
						}
					} else if (2 == i_931_) {
						for (/**/; i <= i_928_; i++) {
							int i_939_ = i_927_ >> 16;
							if (i_939_ >= anInt9021 * -1593163361 && i_939_ < anInt9003 * -148513205) {
								int i_940_ = anInt8997 * -570111553 * i_939_ + i;
								int i_941_ = anIntArray8996[i_940_];
								int i_942_ = i_930_ + i_941_;
								int i_943_ = ((i_941_ & 0xff00ff) + (i_930_ & 0xff00ff));
								i_941_ = (i_943_ & 0x1000100) + (i_942_ - i_943_ & 0x10000);
								anIntArray8996[i_940_] = i_942_ - i_941_ | i_941_ - (i_941_ >>> 8);
							}
							i_927_ += i_932_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_928_ <<= 16;
					int i_944_ = (int) Math.floor(0.5 + ((double) i_928_ / (double) i_929_));
					i_929_ += i_927_;
					if (i_927_ < -1593163361 * anInt9021) {
						i += i_944_ * (-1593163361 * anInt9021 - i_927_);
						i_927_ = -1593163361 * anInt9021;
					}
					if (i_929_ >= -148513205 * anInt9003)
						i_929_ = anInt9003 * -148513205 - 1;
					int i_945_ = i_930_ >>> 24;
					if (0 == i_931_ || i_931_ == 1 && 255 == i_945_) {
						for (/**/; i_927_ <= i_929_; i_927_++) {
							int i_946_ = i >> 16;
							if (i_946_ >= anInt9000 * 1352816403 && i_946_ < anInt9001 * 2024498147)
								anIntArray8996[(-570111553 * anInt8997 * i_927_ + i_946_)] = i_930_;
							i += i_944_;
						}
					} else if (1 == i_931_) {
						i_930_ = ((i_945_ << 24) + ((i_945_ * (i_930_ & 0xff00) >> 8 & 0xff00) + (i_945_ * (i_930_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_947_ = 256 - i_945_;
						for (/**/; i_927_ <= i_929_; i_927_++) {
							int i_948_ = i >> 16;
							if (i_948_ >= 1352816403 * anInt9000 && i_948_ < 2024498147 * anInt9001) {
								int i_949_ = i_948_ + i_927_ * (-570111553 * anInt8997);
								int i_950_ = anIntArray8996[i_949_];
								i_950_ = (((i_950_ & 0xff00ff) * i_947_ >> 8 & 0xff00ff) + (i_947_ * (i_950_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_948_ + (-570111553 * anInt8997 * i_927_)] = i_950_ + i_930_;
							}
							i += i_944_;
						}
					} else if (2 == i_931_) {
						for (/**/; i_927_ <= i_929_; i_927_++) {
							int i_951_ = i >> 16;
							if (i_951_ >= 1352816403 * anInt9000 && i_951_ < 2024498147 * anInt9001) {
								int i_952_ = anInt8997 * -570111553 * i_927_ + i_951_;
								int i_953_ = anIntArray8996[i_952_];
								int i_954_ = i_953_ + i_930_;
								int i_955_ = ((i_953_ & 0xff00ff) + (i_930_ & 0xff00ff));
								i_953_ = ((i_954_ - i_955_ & 0x10000) + (i_955_ & 0x1000100));
								anIntArray8996[i_952_] = i_954_ - i_953_ | i_953_ - (i_953_ >>> 8);
							}
							i += i_944_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method2232(int i, int i_956_, int i_957_, int i_958_, int i_959_, int i_960_) {
		if (null != anIntArray8996) {
			i_957_ -= i;
			i_958_ -= i_956_;
			if (i_958_ == 0) {
				if (i_957_ >= 0)
					method2066(i, i_956_, 1 + i_957_, i_959_, i_960_);
				else
					method2066(i_957_ + i, i_956_, 1 + -i_957_, i_959_, i_960_);
			} else if (0 == i_957_) {
				if (i_958_ >= 0)
					method2067(i, i_956_, i_958_ + 1, i_959_, i_960_);
				else
					method2067(i, i_958_ + i_956_, -i_958_ + 1, i_959_, i_960_);
			} else {
				if (i_957_ + i_958_ < 0) {
					i += i_957_;
					i_957_ = -i_957_;
					i_956_ += i_958_;
					i_958_ = -i_958_;
				}
				if (i_957_ > i_958_) {
					i_956_ <<= 16;
					i_956_ += 32768;
					i_958_ <<= 16;
					int i_961_ = (int) Math.floor(0.5 + ((double) i_958_ / (double) i_957_));
					i_957_ += i;
					if (i < 1352816403 * anInt9000) {
						i_956_ += i_961_ * (anInt9000 * 1352816403 - i);
						i = 1352816403 * anInt9000;
					}
					if (i_957_ >= anInt9001 * 2024498147)
						i_957_ = 2024498147 * anInt9001 - 1;
					int i_962_ = i_959_ >>> 24;
					if (0 == i_960_ || i_960_ == 1 && i_962_ == 255) {
						for (/**/; i <= i_957_; i++) {
							int i_963_ = i_956_ >> 16;
							if (i_963_ >= -1593163361 * anInt9021 && i_963_ < anInt9003 * -148513205)
								anIntArray8996[i_963_ * (anInt8997 * -570111553) + i] = i_959_;
							i_956_ += i_961_;
						}
					} else if (1 == i_960_) {
						i_959_ = (((i_959_ & 0xff00) * i_962_ >> 8 & 0xff00) + (i_962_ * (i_959_ & 0xff00ff) >> 8 & 0xff00ff) + (i_962_ << 24));
						int i_964_ = 256 - i_962_;
						for (/**/; i <= i_957_; i++) {
							int i_965_ = i_956_ >> 16;
							if (i_965_ >= -1593163361 * anInt9021 && i_965_ < -148513205 * anInt9003) {
								int i_966_ = anInt8997 * -570111553 * i_965_ + i;
								int i_967_ = anIntArray8996[i_966_];
								i_967_ = ((i_964_ * (i_967_ & 0xff00ff) >> 8 & 0xff00ff) + (i_964_ * (i_967_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_966_] = i_967_ + i_959_;
							}
							i_956_ += i_961_;
						}
					} else if (2 == i_960_) {
						for (/**/; i <= i_957_; i++) {
							int i_968_ = i_956_ >> 16;
							if (i_968_ >= anInt9021 * -1593163361 && i_968_ < anInt9003 * -148513205) {
								int i_969_ = anInt8997 * -570111553 * i_968_ + i;
								int i_970_ = anIntArray8996[i_969_];
								int i_971_ = i_959_ + i_970_;
								int i_972_ = ((i_970_ & 0xff00ff) + (i_959_ & 0xff00ff));
								i_970_ = (i_972_ & 0x1000100) + (i_971_ - i_972_ & 0x10000);
								anIntArray8996[i_969_] = i_971_ - i_970_ | i_970_ - (i_970_ >>> 8);
							}
							i_956_ += i_961_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_957_ <<= 16;
					int i_973_ = (int) Math.floor(0.5 + ((double) i_957_ / (double) i_958_));
					i_958_ += i_956_;
					if (i_956_ < -1593163361 * anInt9021) {
						i += i_973_ * (-1593163361 * anInt9021 - i_956_);
						i_956_ = -1593163361 * anInt9021;
					}
					if (i_958_ >= -148513205 * anInt9003)
						i_958_ = anInt9003 * -148513205 - 1;
					int i_974_ = i_959_ >>> 24;
					if (0 == i_960_ || i_960_ == 1 && 255 == i_974_) {
						for (/**/; i_956_ <= i_958_; i_956_++) {
							int i_975_ = i >> 16;
							if (i_975_ >= anInt9000 * 1352816403 && i_975_ < anInt9001 * 2024498147)
								anIntArray8996[(-570111553 * anInt8997 * i_956_ + i_975_)] = i_959_;
							i += i_973_;
						}
					} else if (1 == i_960_) {
						i_959_ = ((i_974_ << 24) + ((i_974_ * (i_959_ & 0xff00) >> 8 & 0xff00) + (i_974_ * (i_959_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_976_ = 256 - i_974_;
						for (/**/; i_956_ <= i_958_; i_956_++) {
							int i_977_ = i >> 16;
							if (i_977_ >= 1352816403 * anInt9000 && i_977_ < 2024498147 * anInt9001) {
								int i_978_ = i_977_ + i_956_ * (-570111553 * anInt8997);
								int i_979_ = anIntArray8996[i_978_];
								i_979_ = (((i_979_ & 0xff00ff) * i_976_ >> 8 & 0xff00ff) + (i_976_ * (i_979_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_977_ + (-570111553 * anInt8997 * i_956_)] = i_979_ + i_959_;
							}
							i += i_973_;
						}
					} else if (2 == i_960_) {
						for (/**/; i_956_ <= i_958_; i_956_++) {
							int i_980_ = i >> 16;
							if (i_980_ >= 1352816403 * anInt9000 && i_980_ < 2024498147 * anInt9001) {
								int i_981_ = anInt8997 * -570111553 * i_956_ + i_980_;
								int i_982_ = anIntArray8996[i_981_];
								int i_983_ = i_982_ + i_959_;
								int i_984_ = ((i_982_ & 0xff00ff) + (i_959_ & 0xff00ff));
								i_982_ = ((i_983_ - i_984_ & 0x10000) + (i_984_ & 0x1000100));
								anIntArray8996[i_981_] = i_983_ - i_982_ | i_982_ - (i_982_ >>> 8);
							}
							i += i_973_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method2233(int i, int i_985_, int i_986_, int i_987_, int i_988_, int i_989_, int i_990_, int i_991_, int i_992_) {
		if (null != anIntArray8996) {
			i_986_ -= i;
			i_987_ -= i_985_;
			if (0 == i_987_) {
				if (i_986_ >= 0)
					method8452(i, i_985_, 1 + i_986_, i_988_, i_989_, i_990_, i_991_, i_992_);
				else {
					int i_993_ = i_991_ + i_990_;
					i_992_ %= i_993_;
					i_992_ = i_990_ + i_993_ - i_992_ - (1 + -i_986_) % i_993_;
					i_992_ %= i_993_;
					if (i_992_ < 0)
						i_992_ += i_993_;
					method8452(i + i_986_, i_985_, 1 + -i_986_, i_988_, i_989_, i_990_, i_991_, i_992_);
				}
			} else if (i_986_ == 0) {
				if (i_987_ >= 0)
					method8453(i, i_985_, i_987_ + 1, i_988_, i_989_, i_990_, i_991_, i_992_);
				else {
					int i_994_ = i_990_ + i_991_;
					i_992_ %= i_994_;
					i_992_ = i_990_ + i_994_ - i_992_ - (-i_987_ + 1) % i_994_;
					i_992_ %= i_994_;
					if (i_992_ < 0)
						i_992_ += i_994_;
					method8453(i, i_985_ + i_987_, 1 + -i_987_, i_988_, i_989_, i_990_, i_991_, i_992_);
				}
			} else {
				i_992_ <<= 8;
				i_990_ <<= 8;
				i_991_ <<= 8;
				int i_995_ = i_990_ + i_991_;
				i_992_ %= i_995_;
				if (i_986_ + i_987_ < 0) {
					int i_996_ = (int) (Math.sqrt((double) (i_987_ * i_987_ + i_986_ * i_986_)) * 256.0);
					int i_997_ = i_996_ % i_995_;
					i_992_ = i_995_ + i_990_ - i_992_ - i_997_;
					i_992_ %= i_995_;
					if (i_992_ < 0)
						i_992_ += i_995_;
					i += i_986_;
					i_986_ = -i_986_;
					i_985_ += i_987_;
					i_987_ = -i_987_;
				}
				if (i_986_ > i_987_) {
					i_985_ <<= 16;
					i_985_ += 32768;
					i_987_ <<= 16;
					int i_998_ = (int) Math.floor((double) i_987_ / (double) i_986_ + 0.5);
					i_986_ += i;
					int i_999_ = i_988_ >>> 24;
					int i_1000_ = (int) Math.sqrt((double) ((i_998_ >> 8) * (i_998_ >> 8) + 65536));
					if (0 == i_989_ || i_989_ == 1 && 255 == i_999_) {
						while (i <= i_986_) {
							int i_1001_ = i_985_ >> 16;
							if (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147 && i_1001_ >= -1593163361 * anInt9021 && i_1001_ < anInt9003 * -148513205 && i_992_ < i_990_)
								anIntArray8996[i + (anInt8997 * -570111553 * i_1001_)] = i_988_;
							i_985_ += i_998_;
							i++;
							i_992_ += i_1000_;
							i_992_ %= i_995_;
						}
					} else if (i_989_ == 1) {
						i_988_ = ((i_999_ * (i_988_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_988_ & 0xff00) * i_999_ >> 8 & 0xff00) + (i_999_ << 24));
						int i_1002_ = 256 - i_999_;
						while (i <= i_986_) {
							int i_1003_ = i_985_ >> 16;
							if (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147 && i_1003_ >= -1593163361 * anInt9021 && i_1003_ < -148513205 * anInt9003 && i_992_ < i_990_) {
								int i_1004_ = -570111553 * anInt8997 * i_1003_ + i;
								int i_1005_ = anIntArray8996[i_1004_];
								i_1005_ = (((i_1005_ & 0xff00) * i_1002_ >> 8 & 0xff00) + ((i_1005_ & 0xff00ff) * i_1002_ >> 8 & 0xff00ff));
								anIntArray8996[i_1004_] = i_988_ + i_1005_;
							}
							i_985_ += i_998_;
							i++;
							i_992_ += i_1000_;
							i_992_ %= i_995_;
						}
					} else if (i_989_ == 2) {
						while (i <= i_986_) {
							int i_1006_ = i_985_ >> 16;
							if (i >= anInt9000 * 1352816403 && i < 2024498147 * anInt9001 && i_1006_ >= anInt9021 * -1593163361 && i_1006_ < -148513205 * anInt9003 && i_992_ < i_990_) {
								int i_1007_ = i + i_1006_ * (-570111553 * anInt8997);
								int i_1008_ = anIntArray8996[i_1007_];
								int i_1009_ = i_988_ + i_1008_;
								int i_1010_ = ((i_1008_ & 0xff00ff) + (i_988_ & 0xff00ff));
								i_1008_ = ((i_1009_ - i_1010_ & 0x10000) + (i_1010_ & 0x1000100));
								anIntArray8996[i_1007_] = i_1009_ - i_1008_ | i_1008_ - (i_1008_ >>> 8);
							}
							i_985_ += i_998_;
							i++;
							i_992_ += i_1000_;
							i_992_ %= i_995_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_986_ <<= 16;
					int i_1011_ = (int) Math.floor(0.5 + ((double) i_986_ / (double) i_987_));
					i_987_ += i_985_;
					int i_1012_ = i_988_ >>> 24;
					int i_1013_ = (int) Math.sqrt((double) (65536 + ((i_1011_ >> 8) * (i_1011_ >> 8))));
					if (0 == i_989_ || i_989_ == 1 && i_1012_ == 255) {
						while (i_985_ <= i_987_) {
							int i_1014_ = i >> 16;
							if (i_985_ >= anInt9021 * -1593163361 && i_985_ < -148513205 * anInt9003 && i_1014_ >= 1352816403 * anInt9000 && i_1014_ < 2024498147 * anInt9001 && i_992_ < i_990_)
								anIntArray8996[(i_1014_ + i_985_ * (anInt8997 * -570111553))] = i_988_;
							i += i_1011_;
							i_985_++;
							i_992_ += i_1013_;
							i_992_ %= i_995_;
						}
					} else if (i_989_ == 1) {
						i_988_ = (((i_988_ & 0xff00) * i_1012_ >> 8 & 0xff00) + (i_1012_ * (i_988_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1012_ << 24));
						int i_1015_ = 256 - i_1012_;
						while (i_985_ <= i_987_) {
							int i_1016_ = i >> 16;
							if (i_985_ >= anInt9021 * -1593163361 && i_985_ < -148513205 * anInt9003 && i_1016_ >= 1352816403 * anInt9000 && i_1016_ < anInt9001 * 2024498147 && i_992_ < i_990_) {
								int i_1017_ = (i_1016_ + -570111553 * anInt8997 * i_985_);
								int i_1018_ = anIntArray8996[i_1017_];
								i_1018_ = (((i_1018_ & 0xff00) * i_1015_ >> 8 & 0xff00) + (i_1015_ * (i_1018_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray8996[i_1016_ + -570111553 * anInt8997 * i_985_] = i_988_ + i_1018_;
							}
							i += i_1011_;
							i_985_++;
							i_992_ += i_1013_;
							i_992_ %= i_995_;
						}
					} else if (i_989_ == 2) {
						while (i_985_ <= i_987_) {
							int i_1019_ = i >> 16;
							if (i_985_ >= anInt9021 * -1593163361 && i_985_ < anInt9003 * -148513205 && i_1019_ >= anInt9000 * 1352816403 && i_1019_ < 2024498147 * anInt9001 && i_992_ < i_990_) {
								int i_1020_ = (anInt8997 * -570111553 * i_985_ + i_1019_);
								int i_1021_ = anIntArray8996[i_1020_];
								int i_1022_ = i_988_ + i_1021_;
								int i_1023_ = ((i_988_ & 0xff00ff) + (i_1021_ & 0xff00ff));
								i_1021_ = ((i_1022_ - i_1023_ & 0x10000) + (i_1023_ & 0x1000100));
								anIntArray8996[i_1020_] = i_1022_ - i_1021_ | i_1021_ - (i_1021_ >>> 8);
							}
							i += i_1011_;
							i_985_++;
							i_992_ += i_1013_;
							i_992_ %= i_995_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method2224(int i, int i_1024_, int i_1025_, int i_1026_, int i_1027_, int i_1028_, Class161 class161, int i_1029_, int i_1030_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_1031_ = class161_sub2.anIntArray9445;
			int i_1032_ = (-1593163361 * anInt9021 > i_1030_ ? -1593163361 * anInt9021 : i_1030_);
			int i_1033_ = (anInt9003 * -148513205 < i_1030_ + is.length ? anInt9003 * -148513205 : is.length + i_1030_);
			i_1025_ -= i;
			i_1026_ -= i_1024_;
			if (i_1025_ + i_1026_ < 0) {
				i += i_1025_;
				i_1025_ = -i_1025_;
				i_1024_ += i_1026_;
				i_1026_ = -i_1026_;
			}
			if (i_1025_ > i_1026_) {
				i_1024_ <<= 16;
				i_1024_ += 32768;
				i_1026_ <<= 16;
				int i_1034_ = (int) Math.floor((double) i_1026_ / (double) i_1025_ + 0.5);
				i_1025_ += i;
				if (i < anInt9000 * 1352816403) {
					i_1024_ += (anInt9000 * 1352816403 - i) * i_1034_;
					i = anInt9000 * 1352816403;
				}
				if (i_1025_ >= 2024498147 * anInt9001)
					i_1025_ = 2024498147 * anInt9001 - 1;
				int i_1035_ = i_1027_ >>> 24;
				if (i_1028_ == 0 || 1 == i_1028_ && i_1035_ == 255) {
					for (/**/; i <= i_1025_; i++) {
						int i_1036_ = i_1024_ >> 16;
						int i_1037_ = i_1036_ - i_1030_;
						if (i_1036_ >= i_1032_ && i_1036_ < i_1033_) {
							int i_1038_ = is[i_1037_] + i_1029_;
							if (i >= i_1038_ && i < i_1038_ + is_1031_[i_1037_])
								anIntArray8996[i_1036_ * (anInt8997 * -570111553) + i] = i_1027_;
						}
						i_1024_ += i_1034_;
					}
				} else if (1 == i_1028_) {
					i_1027_ = ((i_1035_ << 24) + ((i_1035_ * (i_1027_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1027_ & 0xff00) * i_1035_ >> 8 & 0xff00)));
					int i_1039_ = 256 - i_1035_;
					for (/**/; i <= i_1025_; i++) {
						int i_1040_ = i_1024_ >> 16;
						int i_1041_ = i_1040_ - i_1030_;
						if (i_1040_ >= i_1032_ && i_1040_ < i_1033_) {
							int i_1042_ = i_1029_ + is[i_1041_];
							if (i >= i_1042_ && i < is_1031_[i_1041_] + i_1042_) {
								int i_1043_ = i_1040_ * (-570111553 * anInt8997) + i;
								int i_1044_ = anIntArray8996[i_1043_];
								i_1044_ = ((i_1039_ * (i_1044_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1039_ * (i_1044_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_1043_] = i_1044_ + i_1027_;
							}
						}
						i_1024_ += i_1034_;
					}
				} else if (2 == i_1028_) {
					for (/**/; i <= i_1025_; i++) {
						int i_1045_ = i_1024_ >> 16;
						int i_1046_ = i_1045_ - i_1030_;
						if (i_1045_ >= i_1032_ && i_1045_ < i_1033_) {
							int i_1047_ = is[i_1046_] + i_1029_;
							if (i >= i_1047_ && i < is_1031_[i_1046_] + i_1047_) {
								int i_1048_ = i_1045_ * (-570111553 * anInt8997) + i;
								int i_1049_ = anIntArray8996[i_1048_];
								int i_1050_ = i_1049_ + i_1027_;
								int i_1051_ = ((i_1027_ & 0xff00ff) + (i_1049_ & 0xff00ff));
								i_1049_ = ((i_1051_ & 0x1000100) + (i_1050_ - i_1051_ & 0x10000));
								anIntArray8996[i_1048_] = i_1050_ - i_1049_ | i_1049_ - (i_1049_ >>> 8);
							}
						}
						i_1024_ += i_1034_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1025_ <<= 16;
				int i_1052_ = (int) Math.floor(0.5 + ((double) i_1025_ / (double) i_1026_));
				i_1026_ += i_1024_;
				if (i_1024_ < i_1032_) {
					i += i_1052_ * (i_1032_ - i_1024_);
					i_1024_ = i_1032_;
				}
				if (i_1026_ >= i_1033_)
					i_1026_ = i_1033_ - 1;
				int i_1053_ = i_1027_ >>> 24;
				if (0 == i_1028_ || 1 == i_1028_ && i_1053_ == 255) {
					for (/**/; i_1024_ <= i_1026_; i_1024_++) {
						int i_1054_ = i >> 16;
						int i_1055_ = i_1024_ - i_1030_;
						int i_1056_ = i_1029_ + is[i_1055_];
						if (i_1054_ >= 1352816403 * anInt9000 && i_1054_ < anInt9001 * 2024498147 && i_1054_ >= i_1056_ && i_1054_ < i_1056_ + is_1031_[i_1055_])
							anIntArray8996[i_1054_ + (-570111553 * anInt8997 * i_1024_)] = i_1027_;
						i += i_1052_;
					}
				} else if (i_1028_ == 1) {
					i_1027_ = ((i_1053_ * (i_1027_ & 0xff00) >> 8 & 0xff00) + ((i_1027_ & 0xff00ff) * i_1053_ >> 8 & 0xff00ff) + (i_1053_ << 24));
					int i_1057_ = 256 - i_1053_;
					for (/**/; i_1024_ <= i_1026_; i_1024_++) {
						int i_1058_ = i >> 16;
						int i_1059_ = i_1024_ - i_1030_;
						int i_1060_ = i_1029_ + is[i_1059_];
						if (i_1058_ >= 1352816403 * anInt9000 && i_1058_ < anInt9001 * 2024498147 && i_1058_ >= i_1060_ && i_1058_ < i_1060_ + is_1031_[i_1059_]) {
							int i_1061_ = i_1058_ + -570111553 * anInt8997 * i_1024_;
							int i_1062_ = anIntArray8996[i_1061_];
							i_1062_ = (((i_1062_ & 0xff00ff) * i_1057_ >> 8 & 0xff00ff) + ((i_1062_ & 0xff00) * i_1057_ >> 8 & 0xff00));
							anIntArray8996[(i_1024_ * (anInt8997 * -570111553) + i_1058_)] = i_1027_ + i_1062_;
						}
						i += i_1052_;
					}
				} else if (i_1028_ == 2) {
					for (/**/; i_1024_ <= i_1026_; i_1024_++) {
						int i_1063_ = i >> 16;
						int i_1064_ = i_1024_ - i_1030_;
						int i_1065_ = i_1029_ + is[i_1064_];
						if (i_1063_ >= 1352816403 * anInt9000 && i_1063_ < 2024498147 * anInt9001 && i_1063_ >= i_1065_ && i_1063_ < is_1031_[i_1064_] + i_1065_) {
							int i_1066_ = -570111553 * anInt8997 * i_1024_ + i_1063_;
							int i_1067_ = anIntArray8996[i_1066_];
							int i_1068_ = i_1067_ + i_1027_;
							int i_1069_ = (i_1067_ & 0xff00ff) + (i_1027_ & 0xff00ff);
							i_1067_ = ((i_1068_ - i_1069_ & 0x10000) + (i_1069_ & 0x1000100));
							anIntArray8996[i_1066_] = i_1068_ - i_1067_ | i_1067_ - (i_1067_ >>> 8);
						}
						i += i_1052_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2236(int i, int i_1070_, int i_1071_, int i_1072_, int i_1073_, int i_1074_, Class161 class161, int i_1075_, int i_1076_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_1077_ = class161_sub2.anIntArray9445;
			int i_1078_ = (-1593163361 * anInt9021 > i_1076_ ? -1593163361 * anInt9021 : i_1076_);
			int i_1079_ = (anInt9003 * -148513205 < i_1076_ + is.length ? anInt9003 * -148513205 : is.length + i_1076_);
			i_1071_ -= i;
			i_1072_ -= i_1070_;
			if (i_1071_ + i_1072_ < 0) {
				i += i_1071_;
				i_1071_ = -i_1071_;
				i_1070_ += i_1072_;
				i_1072_ = -i_1072_;
			}
			if (i_1071_ > i_1072_) {
				i_1070_ <<= 16;
				i_1070_ += 32768;
				i_1072_ <<= 16;
				int i_1080_ = (int) Math.floor((double) i_1072_ / (double) i_1071_ + 0.5);
				i_1071_ += i;
				if (i < anInt9000 * 1352816403) {
					i_1070_ += (anInt9000 * 1352816403 - i) * i_1080_;
					i = anInt9000 * 1352816403;
				}
				if (i_1071_ >= 2024498147 * anInt9001)
					i_1071_ = 2024498147 * anInt9001 - 1;
				int i_1081_ = i_1073_ >>> 24;
				if (i_1074_ == 0 || 1 == i_1074_ && i_1081_ == 255) {
					for (/**/; i <= i_1071_; i++) {
						int i_1082_ = i_1070_ >> 16;
						int i_1083_ = i_1082_ - i_1076_;
						if (i_1082_ >= i_1078_ && i_1082_ < i_1079_) {
							int i_1084_ = is[i_1083_] + i_1075_;
							if (i >= i_1084_ && i < i_1084_ + is_1077_[i_1083_])
								anIntArray8996[i_1082_ * (anInt8997 * -570111553) + i] = i_1073_;
						}
						i_1070_ += i_1080_;
					}
				} else if (1 == i_1074_) {
					i_1073_ = ((i_1081_ << 24) + ((i_1081_ * (i_1073_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1073_ & 0xff00) * i_1081_ >> 8 & 0xff00)));
					int i_1085_ = 256 - i_1081_;
					for (/**/; i <= i_1071_; i++) {
						int i_1086_ = i_1070_ >> 16;
						int i_1087_ = i_1086_ - i_1076_;
						if (i_1086_ >= i_1078_ && i_1086_ < i_1079_) {
							int i_1088_ = i_1075_ + is[i_1087_];
							if (i >= i_1088_ && i < is_1077_[i_1087_] + i_1088_) {
								int i_1089_ = i_1086_ * (-570111553 * anInt8997) + i;
								int i_1090_ = anIntArray8996[i_1089_];
								i_1090_ = ((i_1085_ * (i_1090_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1085_ * (i_1090_ & 0xff00) >> 8 & 0xff00));
								anIntArray8996[i_1089_] = i_1090_ + i_1073_;
							}
						}
						i_1070_ += i_1080_;
					}
				} else if (2 == i_1074_) {
					for (/**/; i <= i_1071_; i++) {
						int i_1091_ = i_1070_ >> 16;
						int i_1092_ = i_1091_ - i_1076_;
						if (i_1091_ >= i_1078_ && i_1091_ < i_1079_) {
							int i_1093_ = is[i_1092_] + i_1075_;
							if (i >= i_1093_ && i < is_1077_[i_1092_] + i_1093_) {
								int i_1094_ = i_1091_ * (-570111553 * anInt8997) + i;
								int i_1095_ = anIntArray8996[i_1094_];
								int i_1096_ = i_1095_ + i_1073_;
								int i_1097_ = ((i_1073_ & 0xff00ff) + (i_1095_ & 0xff00ff));
								i_1095_ = ((i_1097_ & 0x1000100) + (i_1096_ - i_1097_ & 0x10000));
								anIntArray8996[i_1094_] = i_1096_ - i_1095_ | i_1095_ - (i_1095_ >>> 8);
							}
						}
						i_1070_ += i_1080_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1071_ <<= 16;
				int i_1098_ = (int) Math.floor(0.5 + ((double) i_1071_ / (double) i_1072_));
				i_1072_ += i_1070_;
				if (i_1070_ < i_1078_) {
					i += i_1098_ * (i_1078_ - i_1070_);
					i_1070_ = i_1078_;
				}
				if (i_1072_ >= i_1079_)
					i_1072_ = i_1079_ - 1;
				int i_1099_ = i_1073_ >>> 24;
				if (0 == i_1074_ || 1 == i_1074_ && i_1099_ == 255) {
					for (/**/; i_1070_ <= i_1072_; i_1070_++) {
						int i_1100_ = i >> 16;
						int i_1101_ = i_1070_ - i_1076_;
						int i_1102_ = i_1075_ + is[i_1101_];
						if (i_1100_ >= 1352816403 * anInt9000 && i_1100_ < anInt9001 * 2024498147 && i_1100_ >= i_1102_ && i_1100_ < i_1102_ + is_1077_[i_1101_])
							anIntArray8996[i_1100_ + (-570111553 * anInt8997 * i_1070_)] = i_1073_;
						i += i_1098_;
					}
				} else if (i_1074_ == 1) {
					i_1073_ = ((i_1099_ * (i_1073_ & 0xff00) >> 8 & 0xff00) + ((i_1073_ & 0xff00ff) * i_1099_ >> 8 & 0xff00ff) + (i_1099_ << 24));
					int i_1103_ = 256 - i_1099_;
					for (/**/; i_1070_ <= i_1072_; i_1070_++) {
						int i_1104_ = i >> 16;
						int i_1105_ = i_1070_ - i_1076_;
						int i_1106_ = i_1075_ + is[i_1105_];
						if (i_1104_ >= 1352816403 * anInt9000 && i_1104_ < anInt9001 * 2024498147 && i_1104_ >= i_1106_ && i_1104_ < i_1106_ + is_1077_[i_1105_]) {
							int i_1107_ = i_1104_ + -570111553 * anInt8997 * i_1070_;
							int i_1108_ = anIntArray8996[i_1107_];
							i_1108_ = (((i_1108_ & 0xff00ff) * i_1103_ >> 8 & 0xff00ff) + ((i_1108_ & 0xff00) * i_1103_ >> 8 & 0xff00));
							anIntArray8996[(i_1070_ * (anInt8997 * -570111553) + i_1104_)] = i_1073_ + i_1108_;
						}
						i += i_1098_;
					}
				} else if (i_1074_ == 2) {
					for (/**/; i_1070_ <= i_1072_; i_1070_++) {
						int i_1109_ = i >> 16;
						int i_1110_ = i_1070_ - i_1076_;
						int i_1111_ = i_1075_ + is[i_1110_];
						if (i_1109_ >= 1352816403 * anInt9000 && i_1109_ < 2024498147 * anInt9001 && i_1109_ >= i_1111_ && i_1109_ < is_1077_[i_1110_] + i_1111_) {
							int i_1112_ = -570111553 * anInt8997 * i_1070_ + i_1109_;
							int i_1113_ = anIntArray8996[i_1112_];
							int i_1114_ = i_1113_ + i_1073_;
							int i_1115_ = (i_1113_ & 0xff00ff) + (i_1073_ & 0xff00ff);
							i_1113_ = ((i_1114_ - i_1115_ & 0x10000) + (i_1115_ & 0x1000100));
							anIntArray8996[i_1112_] = i_1114_ - i_1113_ | i_1113_ - (i_1113_ >>> 8);
						}
						i += i_1098_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2146(int i, int i_1116_, int i_1117_, int i_1118_, int i_1119_, int i_1120_, Class161 class161, int i_1121_, int i_1122_, int i_1123_, int i_1124_, int i_1125_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_1126_ = class161_sub2.anIntArray9445;
			int i_1127_ = (anInt9021 * -1593163361 > i_1122_ ? anInt9021 * -1593163361 : i_1122_);
			int i_1128_ = (-148513205 * anInt9003 < i_1122_ + is.length ? anInt9003 * -148513205 : i_1122_ + is.length);
			i_1125_ <<= 8;
			i_1123_ <<= 8;
			i_1124_ <<= 8;
			int i_1129_ = i_1124_ + i_1123_;
			i_1125_ %= i_1129_;
			i_1117_ -= i;
			i_1118_ -= i_1116_;
			if (i_1117_ + i_1118_ < 0) {
				int i_1130_ = (int) (Math.sqrt((double) (i_1117_ * i_1117_ + i_1118_ * i_1118_)) * 256.0);
				int i_1131_ = i_1130_ % i_1129_;
				i_1125_ = i_1123_ + i_1129_ - i_1125_ - i_1131_;
				i_1125_ %= i_1129_;
				if (i_1125_ < 0)
					i_1125_ += i_1129_;
				i += i_1117_;
				i_1117_ = -i_1117_;
				i_1116_ += i_1118_;
				i_1118_ = -i_1118_;
			}
			if (i_1117_ > i_1118_) {
				i_1116_ <<= 16;
				i_1116_ += 32768;
				i_1118_ <<= 16;
				int i_1132_ = (int) Math.floor((double) i_1118_ / (double) i_1117_ + 0.5);
				i_1117_ += i;
				int i_1133_ = i_1119_ >>> 24;
				int i_1134_ = (int) Math.sqrt((double) (65536 + (i_1132_ >> 8) * (i_1132_ >> 8)));
				if (0 == i_1120_ || i_1120_ == 1 && 255 == i_1133_) {
					while (i <= i_1117_) {
						int i_1135_ = i_1116_ >> 16;
						int i_1136_ = i_1135_ - i_1122_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_1135_ >= i_1127_ && i_1135_ < i_1128_ && i_1125_ < i_1123_) {
							int i_1137_ = is[i_1136_] + i_1121_;
							if (i >= i_1137_ && i < i_1137_ + is_1126_[i_1136_])
								anIntArray8996[i + i_1135_ * (-570111553 * anInt8997)] = i_1119_;
						}
						i_1116_ += i_1132_;
						i++;
						i_1125_ += i_1134_;
						i_1125_ %= i_1129_;
					}
				} else if (i_1120_ == 1) {
					i_1119_ = (((i_1119_ & 0xff00ff) * i_1133_ >> 8 & 0xff00ff) + ((i_1119_ & 0xff00) * i_1133_ >> 8 & 0xff00) + (i_1133_ << 24));
					int i_1138_ = 256 - i_1133_;
					while (i <= i_1117_) {
						int i_1139_ = i_1116_ >> 16;
						int i_1140_ = i_1139_ - i_1122_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_1139_ >= i_1127_ && i_1139_ < i_1128_ && i_1125_ < i_1123_) {
							int i_1141_ = i_1121_ + is[i_1140_];
							if (i >= i_1141_ && i < is_1126_[i_1140_] + i_1141_) {
								int i_1142_ = i + i_1139_ * (-570111553 * anInt8997);
								int i_1143_ = anIntArray8996[i_1142_];
								i_1143_ = (((i_1143_ & 0xff00) * i_1138_ >> 8 & 0xff00) + ((i_1143_ & 0xff00ff) * i_1138_ >> 8 & 0xff00ff));
								anIntArray8996[i_1142_] = i_1143_ + i_1119_;
							}
						}
						i_1116_ += i_1132_;
						i++;
						i_1125_ += i_1134_;
						i_1125_ %= i_1129_;
					}
				} else if (2 == i_1120_) {
					while (i <= i_1117_) {
						int i_1144_ = i_1116_ >> 16;
						int i_1145_ = i_1144_ - i_1122_;
						if (i >= anInt9000 * 1352816403 && i < 2024498147 * anInt9001 && i_1144_ >= i_1127_ && i_1144_ < i_1128_ && i_1125_ < i_1123_) {
							int i_1146_ = is[i_1145_] + i_1121_;
							if (i >= i_1146_ && i < i_1146_ + is_1126_[i_1145_]) {
								int i_1147_ = -570111553 * anInt8997 * i_1144_ + i;
								int i_1148_ = anIntArray8996[i_1147_];
								int i_1149_ = i_1148_ + i_1119_;
								int i_1150_ = ((i_1148_ & 0xff00ff) + (i_1119_ & 0xff00ff));
								i_1148_ = ((i_1149_ - i_1150_ & 0x10000) + (i_1150_ & 0x1000100));
								anIntArray8996[i_1147_] = i_1149_ - i_1148_ | i_1148_ - (i_1148_ >>> 8);
							}
						}
						i_1116_ += i_1132_;
						i++;
						i_1125_ += i_1134_;
						i_1125_ %= i_1129_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1117_ <<= 16;
				int i_1151_ = (int) Math.floor((double) i_1117_ / (double) i_1118_ + 0.5);
				int i_1152_ = (int) Math.sqrt((double) ((i_1151_ >> 8) * (i_1151_ >> 8) + 65536));
				i_1118_ += i_1116_;
				int i_1153_ = i_1119_ >>> 24;
				if (0 == i_1120_ || 1 == i_1120_ && i_1153_ == 255) {
					while (i_1116_ <= i_1118_) {
						int i_1154_ = i >> 16;
						int i_1155_ = i_1116_ - i_1122_;
						if (i_1116_ >= i_1127_ && i_1116_ < i_1128_ && i_1154_ >= 1352816403 * anInt9000 && i_1154_ < anInt9001 * 2024498147 && i_1125_ < i_1123_ && i_1154_ >= is[i_1155_] + i_1121_ && (i_1154_ < i_1121_ + is[i_1155_] + is_1126_[i_1155_]))
							anIntArray8996[(-570111553 * anInt8997 * i_1116_ + i_1154_)] = i_1119_;
						i += i_1151_;
						i_1116_++;
						i_1125_ += i_1152_;
						i_1125_ %= i_1129_;
					}
				} else if (1 == i_1120_) {
					i_1119_ = ((i_1153_ * (i_1119_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1153_ * (i_1119_ & 0xff00) >> 8 & 0xff00) + (i_1153_ << 24));
					int i_1156_ = 256 - i_1153_;
					while (i_1116_ <= i_1118_) {
						int i_1157_ = i >> 16;
						int i_1158_ = i_1116_ - i_1122_;
						if (i_1116_ >= i_1127_ && i_1116_ < i_1128_ && i_1157_ >= anInt9000 * 1352816403 && i_1157_ < anInt9001 * 2024498147 && i_1125_ < i_1123_ && i_1157_ >= i_1121_ + is[i_1158_] && (i_1157_ < i_1121_ + is[i_1158_] + is_1126_[i_1158_])) {
							int i_1159_ = i_1157_ + i_1116_ * (anInt8997 * -570111553);
							int i_1160_ = anIntArray8996[i_1159_];
							i_1160_ = ((i_1156_ * (i_1160_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1156_ * (i_1160_ & 0xff00) >> 8 & 0xff00));
							anIntArray8996[i_1157_ + i_1116_ * (anInt8997 * -570111553)] = i_1119_ + i_1160_;
						}
						i += i_1151_;
						i_1116_++;
						i_1125_ += i_1152_;
						i_1125_ %= i_1129_;
					}
				} else if (2 == i_1120_) {
					while (i_1116_ <= i_1118_) {
						int i_1161_ = i >> 16;
						int i_1162_ = i_1116_ - i_1122_;
						if (i_1116_ >= i_1127_ && i_1116_ < i_1128_ && i_1161_ >= anInt9000 * 1352816403 && i_1161_ < 2024498147 * anInt9001 && i_1125_ < i_1123_ && i_1161_ >= is[i_1162_] + i_1121_ && (i_1161_ < i_1121_ + is[i_1162_] + is_1126_[i_1162_])) {
							int i_1163_ = i_1116_ * (-570111553 * anInt8997) + i_1161_;
							int i_1164_ = anIntArray8996[i_1163_];
							int i_1165_ = i_1164_ + i_1119_;
							int i_1166_ = (i_1119_ & 0xff00ff) + (i_1164_ & 0xff00ff);
							i_1164_ = ((i_1165_ - i_1166_ & 0x10000) + (i_1166_ & 0x1000100));
							anIntArray8996[i_1163_] = i_1165_ - i_1164_ | i_1164_ - (i_1164_ >>> 8);
						}
						i += i_1151_;
						i_1116_++;
						i_1125_ += i_1152_;
						i_1125_ %= i_1129_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2207(float f, float f_1167_) {
		aFloat9011 = f_1167_ - f;
		aFloat9024 = f + f_1167_ - 1.0F;
		for (int i = 0; i < 1953374867 * anInt9025; i++) {
			Class107 class107 = aClass107Array9006[i];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1445 = aFloat9011;
			class117.aFloat1444 = aFloat9024;
		}
	}

	public void method2239(int i, int i_1168_, int i_1169_, int i_1170_, int i_1171_, int i_1172_, Class161 class161, int i_1173_, int i_1174_, int i_1175_, int i_1176_, int i_1177_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_1178_ = class161_sub2.anIntArray9445;
			int i_1179_ = (anInt9021 * -1593163361 > i_1174_ ? anInt9021 * -1593163361 : i_1174_);
			int i_1180_ = (-148513205 * anInt9003 < i_1174_ + is.length ? anInt9003 * -148513205 : i_1174_ + is.length);
			i_1177_ <<= 8;
			i_1175_ <<= 8;
			i_1176_ <<= 8;
			int i_1181_ = i_1176_ + i_1175_;
			i_1177_ %= i_1181_;
			i_1169_ -= i;
			i_1170_ -= i_1168_;
			if (i_1169_ + i_1170_ < 0) {
				int i_1182_ = (int) (Math.sqrt((double) (i_1169_ * i_1169_ + i_1170_ * i_1170_)) * 256.0);
				int i_1183_ = i_1182_ % i_1181_;
				i_1177_ = i_1175_ + i_1181_ - i_1177_ - i_1183_;
				i_1177_ %= i_1181_;
				if (i_1177_ < 0)
					i_1177_ += i_1181_;
				i += i_1169_;
				i_1169_ = -i_1169_;
				i_1168_ += i_1170_;
				i_1170_ = -i_1170_;
			}
			if (i_1169_ > i_1170_) {
				i_1168_ <<= 16;
				i_1168_ += 32768;
				i_1170_ <<= 16;
				int i_1184_ = (int) Math.floor((double) i_1170_ / (double) i_1169_ + 0.5);
				i_1169_ += i;
				int i_1185_ = i_1171_ >>> 24;
				int i_1186_ = (int) Math.sqrt((double) (65536 + (i_1184_ >> 8) * (i_1184_ >> 8)));
				if (0 == i_1172_ || i_1172_ == 1 && 255 == i_1185_) {
					while (i <= i_1169_) {
						int i_1187_ = i_1168_ >> 16;
						int i_1188_ = i_1187_ - i_1174_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_1187_ >= i_1179_ && i_1187_ < i_1180_ && i_1177_ < i_1175_) {
							int i_1189_ = is[i_1188_] + i_1173_;
							if (i >= i_1189_ && i < i_1189_ + is_1178_[i_1188_])
								anIntArray8996[i + i_1187_ * (-570111553 * anInt8997)] = i_1171_;
						}
						i_1168_ += i_1184_;
						i++;
						i_1177_ += i_1186_;
						i_1177_ %= i_1181_;
					}
				} else if (i_1172_ == 1) {
					i_1171_ = (((i_1171_ & 0xff00ff) * i_1185_ >> 8 & 0xff00ff) + ((i_1171_ & 0xff00) * i_1185_ >> 8 & 0xff00) + (i_1185_ << 24));
					int i_1190_ = 256 - i_1185_;
					while (i <= i_1169_) {
						int i_1191_ = i_1168_ >> 16;
						int i_1192_ = i_1191_ - i_1174_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_1191_ >= i_1179_ && i_1191_ < i_1180_ && i_1177_ < i_1175_) {
							int i_1193_ = i_1173_ + is[i_1192_];
							if (i >= i_1193_ && i < is_1178_[i_1192_] + i_1193_) {
								int i_1194_ = i + i_1191_ * (-570111553 * anInt8997);
								int i_1195_ = anIntArray8996[i_1194_];
								i_1195_ = (((i_1195_ & 0xff00) * i_1190_ >> 8 & 0xff00) + ((i_1195_ & 0xff00ff) * i_1190_ >> 8 & 0xff00ff));
								anIntArray8996[i_1194_] = i_1195_ + i_1171_;
							}
						}
						i_1168_ += i_1184_;
						i++;
						i_1177_ += i_1186_;
						i_1177_ %= i_1181_;
					}
				} else if (2 == i_1172_) {
					while (i <= i_1169_) {
						int i_1196_ = i_1168_ >> 16;
						int i_1197_ = i_1196_ - i_1174_;
						if (i >= anInt9000 * 1352816403 && i < 2024498147 * anInt9001 && i_1196_ >= i_1179_ && i_1196_ < i_1180_ && i_1177_ < i_1175_) {
							int i_1198_ = is[i_1197_] + i_1173_;
							if (i >= i_1198_ && i < i_1198_ + is_1178_[i_1197_]) {
								int i_1199_ = -570111553 * anInt8997 * i_1196_ + i;
								int i_1200_ = anIntArray8996[i_1199_];
								int i_1201_ = i_1200_ + i_1171_;
								int i_1202_ = ((i_1200_ & 0xff00ff) + (i_1171_ & 0xff00ff));
								i_1200_ = ((i_1201_ - i_1202_ & 0x10000) + (i_1202_ & 0x1000100));
								anIntArray8996[i_1199_] = i_1201_ - i_1200_ | i_1200_ - (i_1200_ >>> 8);
							}
						}
						i_1168_ += i_1184_;
						i++;
						i_1177_ += i_1186_;
						i_1177_ %= i_1181_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1169_ <<= 16;
				int i_1203_ = (int) Math.floor((double) i_1169_ / (double) i_1170_ + 0.5);
				int i_1204_ = (int) Math.sqrt((double) ((i_1203_ >> 8) * (i_1203_ >> 8) + 65536));
				i_1170_ += i_1168_;
				int i_1205_ = i_1171_ >>> 24;
				if (0 == i_1172_ || 1 == i_1172_ && i_1205_ == 255) {
					while (i_1168_ <= i_1170_) {
						int i_1206_ = i >> 16;
						int i_1207_ = i_1168_ - i_1174_;
						if (i_1168_ >= i_1179_ && i_1168_ < i_1180_ && i_1206_ >= 1352816403 * anInt9000 && i_1206_ < anInt9001 * 2024498147 && i_1177_ < i_1175_ && i_1206_ >= is[i_1207_] + i_1173_ && (i_1206_ < i_1173_ + is[i_1207_] + is_1178_[i_1207_]))
							anIntArray8996[(-570111553 * anInt8997 * i_1168_ + i_1206_)] = i_1171_;
						i += i_1203_;
						i_1168_++;
						i_1177_ += i_1204_;
						i_1177_ %= i_1181_;
					}
				} else if (1 == i_1172_) {
					i_1171_ = ((i_1205_ * (i_1171_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1205_ * (i_1171_ & 0xff00) >> 8 & 0xff00) + (i_1205_ << 24));
					int i_1208_ = 256 - i_1205_;
					while (i_1168_ <= i_1170_) {
						int i_1209_ = i >> 16;
						int i_1210_ = i_1168_ - i_1174_;
						if (i_1168_ >= i_1179_ && i_1168_ < i_1180_ && i_1209_ >= anInt9000 * 1352816403 && i_1209_ < anInt9001 * 2024498147 && i_1177_ < i_1175_ && i_1209_ >= i_1173_ + is[i_1210_] && (i_1209_ < i_1173_ + is[i_1210_] + is_1178_[i_1210_])) {
							int i_1211_ = i_1209_ + i_1168_ * (anInt8997 * -570111553);
							int i_1212_ = anIntArray8996[i_1211_];
							i_1212_ = ((i_1208_ * (i_1212_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1208_ * (i_1212_ & 0xff00) >> 8 & 0xff00));
							anIntArray8996[i_1209_ + i_1168_ * (anInt8997 * -570111553)] = i_1171_ + i_1212_;
						}
						i += i_1203_;
						i_1168_++;
						i_1177_ += i_1204_;
						i_1177_ %= i_1181_;
					}
				} else if (2 == i_1172_) {
					while (i_1168_ <= i_1170_) {
						int i_1213_ = i >> 16;
						int i_1214_ = i_1168_ - i_1174_;
						if (i_1168_ >= i_1179_ && i_1168_ < i_1180_ && i_1213_ >= anInt9000 * 1352816403 && i_1213_ < 2024498147 * anInt9001 && i_1177_ < i_1175_ && i_1213_ >= is[i_1214_] + i_1173_ && (i_1213_ < i_1173_ + is[i_1214_] + is_1178_[i_1214_])) {
							int i_1215_ = i_1168_ * (-570111553 * anInt8997) + i_1213_;
							int i_1216_ = anIntArray8996[i_1215_];
							int i_1217_ = i_1216_ + i_1171_;
							int i_1218_ = (i_1171_ & 0xff00ff) + (i_1216_ & 0xff00ff);
							i_1216_ = ((i_1217_ - i_1218_ & 0x10000) + (i_1218_ & 0x1000100));
							anIntArray8996[i_1215_] = i_1217_ - i_1216_ | i_1216_ - (i_1216_ >>> 8);
						}
						i += i_1203_;
						i_1168_++;
						i_1177_ += i_1204_;
						i_1177_ %= i_1181_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2052(int i, int i_1219_, int i_1220_, int i_1221_, int i_1222_, int i_1223_, int i_1224_) {
		if (null != anIntArray8996) {
			Class107 class107 = method8458(Thread.currentThread());
			Class117 class117 = class107.aClass117_1290;
			int i_1225_ = i_1220_ - i;
			int i_1226_ = i_1221_ - i_1219_;
			int i_1227_ = i_1225_ >= 0 ? i_1225_ : -i_1225_;
			int i_1228_ = i_1226_ >= 0 ? i_1226_ : -i_1226_;
			int i_1229_ = i_1227_;
			if (i_1229_ < i_1228_)
				i_1229_ = i_1228_;
			if (i_1229_ != 0) {
				int i_1230_ = (i_1225_ << 16) / i_1229_;
				int i_1231_ = (i_1226_ << 16) / i_1229_;
				i_1225_ += i_1230_ >> 16;
				i_1226_ += i_1231_ >> 16;
				if (i_1231_ <= i_1230_)
					i_1230_ = -i_1230_;
				else
					i_1231_ = -i_1231_;
				int i_1232_ = i_1231_ * i_1223_ >> 17;
				int i_1233_ = i_1231_ * i_1223_ + 1 >> 17;
				int i_1234_ = i_1223_ * i_1230_ >> 17;
				int i_1235_ = 1 + i_1223_ * i_1230_ >> 17;
				i -= class117.method1490();
				i_1219_ -= class117.method1503();
				int i_1236_ = i_1232_ + i;
				int i_1237_ = i - i_1233_;
				int i_1238_ = i_1225_ + i - i_1233_;
				int i_1239_ = i_1225_ + i + i_1232_;
				int i_1240_ = i_1234_ + i_1219_;
				int i_1241_ = i_1219_ - i_1235_;
				int i_1242_ = i_1219_ + i_1226_ - i_1235_;
				int i_1243_ = i_1219_ + i_1226_ + i_1234_;
				if (i_1224_ == 0)
					class117.anInt1436 = 0;
				else if (1 == i_1224_)
					class117.anInt1436 = 255 - (i_1222_ >>> 24);
				else
					throw new IllegalArgumentException();
				method2302(false);
				class117.aBool1449 = (i_1236_ < 0 || i_1236_ > class117.anInt1441 || i_1237_ < 0 || i_1237_ > class117.anInt1441 || i_1238_ < 0 || i_1238_ > class117.anInt1441);
				class117.method1507(true, false, false, (float) i_1240_, (float) i_1241_, (float) i_1242_, (float) i_1236_, (float) i_1237_, (float) i_1238_, 100.0F, 100.0F, 100.0F, i_1222_);
				class117.aBool1449 = (i_1236_ < 0 || i_1236_ > class117.anInt1441 || i_1238_ < 0 || i_1238_ > class117.anInt1441 || i_1239_ < 0 || i_1239_ > class117.anInt1441);
				class117.method1507(true, false, false, (float) i_1240_, (float) i_1242_, (float) i_1243_, (float) i_1236_, (float) i_1238_, (float) i_1239_, 100.0F, 100.0F, 100.0F, i_1222_);
				method2302(true);
			}
		}
	}

	public void method2133(int i, int i_1244_, int i_1245_, int i_1246_) {
		anInt9017 = i * -2035003219;
		anInt9030 = i_1244_ * 1594408325;
		anInt9015 = -937436553 * i_1245_;
		anInt9018 = -1249779805 * i_1246_;
		method8451();
	}

	public int method2242(int i, int i_1247_, int i_1248_, int i_1249_, int i_1250_, int i_1251_) {
		int i_1252_ = 0;
		float f = (aClass443_9013.aFloatArray4878[2] * (float) i + aClass443_9013.aFloatArray4878[14] + aClass443_9013.aFloatArray4878[6] * (float) i_1247_ + aClass443_9013.aFloatArray4878[10] * (float) i_1248_);
		float f_1253_ = (aClass443_9013.aFloatArray4878[10] * (float) i_1251_ + ((float) i_1249_ * aClass443_9013.aFloatArray4878[2] + aClass443_9013.aFloatArray4878[14] + (float) i_1250_ * aClass443_9013.aFloatArray4878[6]));
		float f_1254_ = ((float) i_1248_ * aClass443_9013.aFloatArray4878[11] + ((float) i_1247_ * aClass443_9013.aFloatArray4878[7] + ((float) i * aClass443_9013.aFloatArray4878[3] + aClass443_9013.aFloatArray4878[15])));
		float f_1255_ = (aClass443_9013.aFloatArray4878[15] + (float) i_1249_ * aClass443_9013.aFloatArray4878[3] + (float) i_1250_ * aClass443_9013.aFloatArray4878[7] + aClass443_9013.aFloatArray4878[11] * (float) i_1251_);
		if (f < -f_1254_ && f_1253_ < -f_1255_)
			i_1252_ |= 0x10;
		else if (f > f_1254_ && f_1253_ > f_1255_)
			i_1252_ |= 0x20;
		float f_1256_ = (aClass443_9013.aFloatArray4878[12] + aClass443_9013.aFloatArray4878[0] * (float) i + (float) i_1247_ * aClass443_9013.aFloatArray4878[4] + (float) i_1248_ * aClass443_9013.aFloatArray4878[8]);
		float f_1257_ = (aClass443_9013.aFloatArray4878[8] * (float) i_1251_ + ((float) i_1249_ * aClass443_9013.aFloatArray4878[0] + aClass443_9013.aFloatArray4878[12] + aClass443_9013.aFloatArray4878[4] * (float) i_1250_));
		if (f_1256_ < -f_1254_ && f_1257_ < -f_1255_)
			i_1252_ |= 0x1;
		if (f_1256_ > f_1254_ && f_1257_ > f_1255_)
			i_1252_ |= 0x2;
		float f_1258_ = ((float) i_1248_ * aClass443_9013.aFloatArray4878[9] + (aClass443_9013.aFloatArray4878[13] + aClass443_9013.aFloatArray4878[1] * (float) i + (float) i_1247_ * aClass443_9013.aFloatArray4878[5]));
		float f_1259_ = (aClass443_9013.aFloatArray4878[5] * (float) i_1250_ + (aClass443_9013.aFloatArray4878[13] + (float) i_1249_ * aClass443_9013.aFloatArray4878[1]) + (float) i_1251_ * aClass443_9013.aFloatArray4878[9]);
		if (f_1258_ < -f_1254_ && f_1259_ < -f_1255_)
			i_1252_ |= 0x4;
		if (f_1258_ > f_1254_ && f_1259_ > f_1255_)
			i_1252_ |= 0x8;
		return i_1252_;
	}

	public int method2243(int i, int i_1260_, int i_1261_, int i_1262_, int i_1263_, int i_1264_) {
		int i_1265_ = 0;
		float f = (aClass443_9013.aFloatArray4878[2] * (float) i + aClass443_9013.aFloatArray4878[14] + aClass443_9013.aFloatArray4878[6] * (float) i_1260_ + aClass443_9013.aFloatArray4878[10] * (float) i_1261_);
		float f_1266_ = (aClass443_9013.aFloatArray4878[10] * (float) i_1264_ + ((float) i_1262_ * aClass443_9013.aFloatArray4878[2] + aClass443_9013.aFloatArray4878[14] + (float) i_1263_ * aClass443_9013.aFloatArray4878[6]));
		float f_1267_ = ((float) i_1261_ * aClass443_9013.aFloatArray4878[11] + ((float) i_1260_ * aClass443_9013.aFloatArray4878[7] + ((float) i * aClass443_9013.aFloatArray4878[3] + aClass443_9013.aFloatArray4878[15])));
		float f_1268_ = (aClass443_9013.aFloatArray4878[15] + (float) i_1262_ * aClass443_9013.aFloatArray4878[3] + (float) i_1263_ * aClass443_9013.aFloatArray4878[7] + aClass443_9013.aFloatArray4878[11] * (float) i_1264_);
		if (f < -f_1267_ && f_1266_ < -f_1268_)
			i_1265_ |= 0x10;
		else if (f > f_1267_ && f_1266_ > f_1268_)
			i_1265_ |= 0x20;
		float f_1269_ = (aClass443_9013.aFloatArray4878[12] + aClass443_9013.aFloatArray4878[0] * (float) i + (float) i_1260_ * aClass443_9013.aFloatArray4878[4] + (float) i_1261_ * aClass443_9013.aFloatArray4878[8]);
		float f_1270_ = (aClass443_9013.aFloatArray4878[8] * (float) i_1264_ + ((float) i_1262_ * aClass443_9013.aFloatArray4878[0] + aClass443_9013.aFloatArray4878[12] + aClass443_9013.aFloatArray4878[4] * (float) i_1263_));
		if (f_1269_ < -f_1267_ && f_1270_ < -f_1268_)
			i_1265_ |= 0x1;
		if (f_1269_ > f_1267_ && f_1270_ > f_1268_)
			i_1265_ |= 0x2;
		float f_1271_ = ((float) i_1261_ * aClass443_9013.aFloatArray4878[9] + (aClass443_9013.aFloatArray4878[13] + aClass443_9013.aFloatArray4878[1] * (float) i + (float) i_1260_ * aClass443_9013.aFloatArray4878[5]));
		float f_1272_ = (aClass443_9013.aFloatArray4878[5] * (float) i_1263_ + (aClass443_9013.aFloatArray4878[13] + (float) i_1262_ * aClass443_9013.aFloatArray4878[1]) + (float) i_1264_ * aClass443_9013.aFloatArray4878[9]);
		if (f_1271_ < -f_1267_ && f_1272_ < -f_1268_)
			i_1265_ |= 0x4;
		if (f_1271_ > f_1267_ && f_1272_ > f_1268_)
			i_1265_ |= 0x8;
		return i_1265_;
	}

	Class167_Sub1(Canvas canvas, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, int i, int i_1273_) {
		this(class174, interface24, interface47, interface48, interface46);
		try {
			method2023(canvas, i, i_1273_, (byte) 1);
			method2026(canvas, 643540190);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2005(778784407);
			throw new RuntimeException("");
		}
	}

	public void method2359(Class433 class433, Class178 class178, Class437 class437) {
		Class443 class443 = method2391();
		class443.method5359(class433);
		class443.method5390(aClass443_9013);
		class178.method2627(class437, aClass443_9012, class443, aFloat9002, aFloat9022, aFloat9019, aFloat9023);
	}

	public int[] method2167() {
		return null;
	}

	public void method2279(Class433 class433) {
		aClass433_9010 = class433;
		method8456();
	}

	public void method2248(Class536_Sub25 class536_sub25) {
		/* empty */
	}

	public NativeSprite method2379(int i, int i_1274_, boolean bool, boolean bool_1275_) {
		if (bool)
			return new Class143_Sub1_Sub1(this, i, i_1274_);
		return new Class143_Sub1_Sub2(this, i, i_1274_);
	}

	public void method2403() {
		aClass183_Sub2_9032 = null;
		aClass143_9031 = null;
	}

	public NativeSprite method2251(Class179 class179, boolean bool) {
		int i = class179.method2633();
		int i_1276_ = class179.method2677();
		Class143_Sub1 class143_sub1;
		if (bool && !class179.method2641() && class179.method2631()) {
			Class179_Sub2 class179_sub2 = (Class179_Sub2) class179;
			int[] is = new int[class179_sub2.anIntArray9813.length];
			byte[] is_1277_ = new byte[i * i_1276_];
			for (int i_1278_ = 0; i_1278_ < i_1276_; i_1278_++) {
				int i_1279_ = i * i_1278_;
				for (int i_1280_ = 0; i_1280_ < i; i_1280_++)
					is_1277_[i_1280_ + i_1279_] = class179_sub2.aByteArray9820[i_1280_ + i_1279_];
			}
			for (int i_1281_ = 0; i_1281_ < class179_sub2.anIntArray9813.length; i_1281_++)
				is[i_1281_] = class179_sub2.anIntArray9813[i_1281_];
			class143_sub1 = new Class143_Sub1_Sub3(this, is_1277_, is, i, i_1276_);
		} else {
			int[] is = class179.method2643(false);
			if (class179.method2641())
				class143_sub1 = new Class143_Sub1_Sub1(this, is, i, i_1276_);
			else
				class143_sub1 = new Class143_Sub1_Sub2(this, is, i, i_1276_);
		}
		class143_sub1.method1718(class179.method2635(), class179.method2637(), class179.method2636(), class179.method2638());
		return class143_sub1;
	}

	Class595 method8465(int i) {
		return aClass174_1852.method2446(i, -1941366962).aClass595_1805;
	}

	public Interface21 method2193(int i, int i_1282_) {
		return new Class139(i, i_1282_);
	}

	public void method2254(int i, Class161 class161, int i_1283_, int i_1284_) {
		if (anIntArray8996 != null) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_1285_ = class161_sub2.anIntArray9445;
			int i_1286_;
			if (anInt9003 * -148513205 < is.length + i_1284_)
				i_1286_ = -148513205 * anInt9003 - i_1284_;
			else
				i_1286_ = is.length;
			int i_1287_;
			if (-1593163361 * anInt9021 > i_1284_) {
				i_1287_ = -1593163361 * anInt9021 - i_1284_;
				i_1284_ = -1593163361 * anInt9021;
			} else
				i_1287_ = 0;
			if (i_1286_ - i_1287_ > 0) {
				int i_1288_ = i_1284_ * (-570111553 * anInt8997);
				for (int i_1289_ = i_1287_; i_1289_ < i_1286_; i_1289_++) {
					int i_1290_ = is[i_1289_] + i_1283_;
					int i_1291_ = is_1285_[i_1289_];
					if (anInt9000 * 1352816403 > i_1290_) {
						i_1291_ -= 1352816403 * anInt9000 - i_1290_;
						i_1290_ = 1352816403 * anInt9000;
					}
					if (2024498147 * anInt9001 < i_1290_ + i_1291_)
						i_1291_ = anInt9001 * 2024498147 - i_1290_;
					i_1290_ += i_1288_;
					for (int i_1292_ = -i_1291_; i_1292_ < 0; i_1292_++)
						anIntArray8996[i_1290_++] = i;
					i_1288_ += -570111553 * anInt8997;
				}
			}
		}
	}

	public void method2347(boolean bool) {
		Class107 class107 = method8458(Thread.currentThread());
		class107.aBool1285 = bool;
	}

	public void method2256(int i) {
		Class177_Sub3.anInt9730 = Class177_Sub3.anInt9729 = i;
		if (1953374867 * anInt9025 > 1)
			throw new IllegalStateException();
		method8464(anInt9025 * 1953374867);
		method8470(0);
	}

	public boolean method2346() {
		return false;
	}

	public void method2101(int i) {
		Class177_Sub3.anInt9730 = Class177_Sub3.anInt9729 = i;
		if (1953374867 * anInt9025 > 1)
			throw new IllegalStateException();
		method8464(anInt9025 * 1953374867);
		method8470(0);
	}

	public MeshRasterizer method2259(RSMesh class180, int i, int i_1293_, int i_1294_, int i_1295_) {
		return new Class177_Sub3(this, class180, i, i_1294_, i_1295_, i_1293_);
	}

	public Class433 method2128() {
		return new Class433(aClass433_9010);
	}

	public void method2209() {
		anInt9000 = 0;
		anInt9021 = 0;
		anInt9001 = -357121675 * anInt8997;
		anInt9003 = anInt8998 * -422655761;
		method8451();
	}

	public void method2323(int i, Class175 class175) {
		Class107 class107 = method8458(Thread.currentThread());
		class107.anInt1287 = i * -1172974661;
		class107.anInt1282 = class175.anInt1932 * 1383236455;
		class107.anInt1317 = class175.anInt1934 * -1798113843;
	}

	public int method2263(int i, int i_1296_) {
		i |= 0x20800;
		return i & i_1296_ ^ i_1296_;
	}

	void method8466() {
		int i = 2024498147 * anInt9001 - 1352816403 * anInt9000;
		int i_1297_ = anInt9003 * -148513205 - anInt9021 * -1593163361;
		float f = aFloat9019 = (float) (anInt9015 * 1903828807) / 2.0F;
		float f_1298_ = aFloat9023 = (float) (anInt9018 * 726486027) / 2.0F;
		aFloat9002 = f + (float) (anInt9017 * -827223259);
		aFloat9022 = (float) (anInt9030 * -1948273843) + f_1298_;
		for (int i_1299_ = 0; i_1299_ < anInt9025 * 1953374867; i_1299_++) {
			Class107 class107 = aClass107Array9006[i_1299_];
			Class117 class117 = class107.aClass117_1290;
			class117.aFloat1459 = f;
			class117.aFloat1439 = f_1298_;
			class117.aFloat1462 = aFloat9002 - (float) (anInt9000 * 1352816403);
			class117.aFloat1442 = aFloat9022 - (float) (-1593163361 * anInt9021);
			class117.anInt1441 = i;
			class117.anInt1460 = i_1297_;
		}
		int i_1300_ = (anInt8997 * -570111553 * (-1593163361 * anInt9021) + 1352816403 * anInt9000);
		for (int i_1301_ = -1593163361 * anInt9021; i_1301_ < -148513205 * anInt9003; i_1301_++) {
			for (int i_1302_ = 0; i_1302_ < 1953374867 * anInt9025; i_1302_++)
				aClass107Array9006[i_1302_].aClass117_1290.anIntArray1446[i_1301_ - anInt9021 * -1593163361] = i_1300_;
			i_1300_ += -570111553 * anInt8997;
		}
	}

	public void method2390(Class443 class443) {
		aClass443_9012.method5339(class443);
		method8456();
	}

	public void method2210(int i, int i_1303_, int i_1304_, int i_1305_) {
		if (i < 0)
			i = 0;
		if (i_1303_ < 0)
			i_1303_ = 0;
		if (i_1304_ > anInt8997 * -570111553)
			i_1304_ = -570111553 * anInt8997;
		if (i_1305_ > -1805705211 * anInt8998)
			i_1305_ = -1805705211 * anInt8998;
		anInt9000 = i * -1951331557;
		anInt9001 = i_1304_ * 391182795;
		anInt9021 = i_1303_ * 1128831583;
		anInt9003 = 1669823331 * i_1305_;
		method8451();
	}

	public void method2168(boolean bool) {
		/* empty */
	}

	public void method2356() {
		aClass183_Sub2_9032 = null;
		aClass143_9031 = null;
	}

	public Class433 method2336() {
		Class107 class107 = method8458(Thread.currentThread());
		return class107.aClass433_1289;
	}

	public NativeSprite method2080(int[] is, int i, int i_1306_, int i_1307_, int i_1308_, boolean bool) {
		boolean bool_1309_ = false;
		int i_1310_ = i;
		while_30_: for (int i_1311_ = 0; i_1311_ < i_1308_; i_1311_++) {
			for (int i_1312_ = 0; i_1312_ < i_1307_; i_1312_++) {
				int i_1313_ = is[i_1310_++] >>> 24;
				if (0 != i_1313_ && 255 != i_1313_) {
					bool_1309_ = true;
					break while_30_;
				}
			}
		}
		if (bool_1309_)
			return new Class143_Sub1_Sub1(this, is, i, i_1306_, i_1307_, i_1308_, bool);
		return new Class143_Sub1_Sub2(this, is, i, i_1306_, i_1307_, i_1308_, bool);
	}

	public int method2149() {
		return -1;
	}

	public Class536_Sub19 method2273(int i, int i_1314_, int i_1315_, int i_1316_, int i_1317_, float f) {
		return null;
	}

	public void method2405(Class166 class166) {
		method8454(null != anIntArray8996, null != aFloatArray8999, false, class166);
	}

	public void method2275(int i, Class536_Sub19[] class536_sub19s) {
		/* empty */
	}

	void method8467(int i) {
		anInt9025 = 470829979 * i;
		aClass107Array9006 = new Class107[anInt9025 * 1953374867];
		for (int i_1318_ = 0; i_1318_ < anInt9025 * 1953374867; i_1318_++)
			aClass107Array9006[i_1318_] = new Class107(this);
	}

	void method8468(int i) {
		anInt9025 = 470829979 * i;
		aClass107Array9006 = new Class107[anInt9025 * 1953374867];
		for (int i_1319_ = 0; i_1319_ < anInt9025 * 1953374867; i_1319_++)
			aClass107Array9006[i_1319_] = new Class107(this);
	}

	public Interface21 method2386(int i, int i_1320_) {
		return new Class139(i, i_1320_);
	}

	public void method2141() {
		/* empty */
	}

	public void method2051() {
		anInt9000 = 0;
		anInt9021 = 0;
		anInt9001 = -357121675 * anInt8997;
		anInt9003 = anInt8998 * -422655761;
		method8451();
	}

	public void method2314(Class168 class168, float f, Class168 class168_1321_, float f_1322_, Class168 class168_1323_, float f_1324_) {
		/* empty */
	}

	void method2132() {
		if (aBool8995) {
			Class613.method7316(true, false, (short) 192);
			aBool8995 = false;
		}
		aBool9014 = true;
	}

	public FontRenderer method2255(Class2 class2, Class179[] class179s, boolean bool) {
		int[] is = new int[class179s.length];
		int[] is_1325_ = new int[class179s.length];
		boolean bool_1326_ = false;
		boolean bool_1327_ = false;
		for (int i = 0; i < class179s.length; i++) {
			is[i] = class179s[i].method2633();
			is_1325_[i] = class179s[i].method2677();
			if (class179s[i].method2641())
				bool_1326_ = true;
			if (class179s[i].method2631())
				bool_1327_ = true;
		}
		if (bool) {
			if (bool_1327_) {
				if (bool_1326_)
					return new Class184_Sub3(this, class2, (Class179_Sub2[]) class179s, is, is_1325_);
				return new Class184_Sub6(this, class2, (Class179_Sub2[]) class179s, is, is_1325_);
			}
			if (bool_1326_)
				return new Class184_Sub3(this, class2, (Class179_Sub1[]) class179s, is, is_1325_);
			return new Class184_Sub6(this, class2, (Class179_Sub1[]) class179s, is, is_1325_);
		}
		if (bool_1327_) {
			if (bool_1326_)
				throw new IllegalArgumentException("");
			return new Class184_Sub1(this, class2, (Class179_Sub2[]) class179s, is, is_1325_);
		}
		return new Class184_Sub2(this, class2, (Class179_Sub1[]) class179s, is, is_1325_);
	}

	public boolean method2120() {
		return true;
	}

	public void method2300(int i, int i_1328_) {
		/* empty */
	}

	public MeshRasterizer createMeshRasterizer(RSMesh class180, int i, int i_1329_, int i_1330_, int i_1331_) {
		return new Class177_Sub3(this, class180, i, i_1330_, i_1331_, i_1329_);
	}

	public void method2241(Class433 class433) {
		aClass433_9010 = class433;
		method8456();
	}

	public Class183_Sub2 method2058() {
		return new Class183_Sub2_Sub1(this);
	}

	public void method2367(Class433 class433) {
		aClass433_9010 = class433;
		method8456();
	}

	public void method2110(int i, Class536_Sub19[] class536_sub19s) {
		/* empty */
	}

	public Class433 method2382() {
		return new Class433(aClass433_9010);
	}

	public Class433 method2237() {
		return new Class433(aClass433_9010);
	}

	public Class161 method2252(int i, int i_1332_, int[] is, int[] is_1333_) {
		return new Class161_Sub2(i, i_1332_, is, is_1333_);
	}

	public Class433 method2388() {
		return new Class433(aClass433_9010);
	}

	public void method2195(Class443 class443) {
		aClass443_9012.method5339(class443);
		method8456();
	}

	public void method2285(Class443 class443) {
		aClass443_9012.method5339(class443);
		method8456();
	}

	public void method2286(Class443 class443) {
		aClass443_9012.method5339(class443);
		method8456();
	}

	public void method2287(float f) {
		anInt9009 = 1594293099 * (int) (65535.0F * f);
	}

	public void method2288(int i) {
		/* empty */
	}

	public void method2065(boolean bool) {
		Class107 class107 = method8458(Thread.currentThread());
		class107.aBool1285 = bool;
	}

	public void method2290(int i) {
		/* empty */
	}

	void method8469() {
		aClass443_9020.method5359(aClass433_9010);
		aClass443_9013.method5339(aClass443_9020);
		aClass443_9013.method5390(aClass443_9012);
		aClass443_9013.method5357(aFloatArrayArray9005[0]);
		aClass443_9013.method5358(aFloatArrayArray9005[1]);
		aClass443_9013.method5353(aFloatArrayArray9005[2]);
		aClass443_9013.method5354(aFloatArrayArray9005[3]);
		aClass443_9013.method5355(aFloatArrayArray9005[4]);
		aClass443_9013.method5373(aFloatArrayArray9005[5]);
		float f = aClass443_9012.method5352();
		float f_1334_ = (aClass443_9012.aFloatArray4878[14] + aClass443_9012.aFloatArray4878[10] * (f - 255.0F));
		float f_1335_ = (aClass443_9012.aFloatArray4878[10] * f + aClass443_9012.aFloatArray4878[14]);
		float f_1336_ = f_1335_ - f_1334_;
		for (int i = 0; i < anInt9025 * 1953374867; i++) {
			Class107 class107 = aClass107Array9006[i];
			class107.aFloat1277 = f_1334_;
			class107.aFloat1281 = f_1336_;
		}
	}

	public Class176 method2129(int i) {
		return null;
	}

	public Class176 method2292(int i) {
		return null;
	}

	public Class176 method2293(Class176 class176, Class176 class176_1337_, float f, Class176 class176_1338_) {
		return null;
	}

	public Class176 method2294(Class176 class176, Class176 class176_1339_, float f, Class176 class176_1340_) {
		return null;
	}

	public void method2295(Class176 class176) {
		/* empty */
	}

	public void method2214(int i, int i_1341_, int i_1342_, int i_1343_) {
		if (i < 0)
			i = 0;
		if (i_1341_ < 0)
			i_1341_ = 0;
		if (i_1342_ > anInt8997 * -570111553)
			i_1342_ = -570111553 * anInt8997;
		if (i_1343_ > -1805705211 * anInt8998)
			i_1343_ = -1805705211 * anInt8998;
		anInt9000 = i * -1951331557;
		anInt9001 = i_1342_ * 391182795;
		anInt9021 = i_1341_ * 1128831583;
		anInt9003 = 1669823331 * i_1343_;
		method8451();
	}

	public void method2260(Class176 class176) {
		/* empty */
	}

	public int method2269() {
		return 0;
	}

	public void method2017(float f, float f_1344_, float f_1345_, float[] fs) {
		float f_1346_ = (f_1344_ * aClass443_9013.aFloatArray4878[7] + (aClass443_9013.aFloatArray4878[3] * f + aClass443_9013.aFloatArray4878[15]) + f_1345_ * aClass443_9013.aFloatArray4878[11]);
		float f_1347_ = (f_1345_ * aClass443_9013.aFloatArray4878[8] + (f_1344_ * aClass443_9013.aFloatArray4878[4] + (aClass443_9013.aFloatArray4878[12] + f * aClass443_9013.aFloatArray4878[0])));
		float f_1348_ = (f_1345_ * aClass443_9013.aFloatArray4878[9] + (aClass443_9013.aFloatArray4878[13] + aClass443_9013.aFloatArray4878[1] * f + aClass443_9013.aFloatArray4878[5] * f_1344_));
		float f_1349_ = (f * aClass443_9020.aFloatArray4878[2] + aClass443_9020.aFloatArray4878[14] + aClass443_9020.aFloatArray4878[6] * f_1344_ + f_1345_ * aClass443_9020.aFloatArray4878[10]);
		fs[0] = aFloat9002 + f_1347_ * aFloat9019 / f_1346_;
		fs[1] = aFloat9022 + f_1348_ * aFloat9023 / f_1346_;
		fs[2] = f_1349_;
	}

	void method8470(int i) {
		aClass107Array9006[i].method1432(Thread.currentThread(), (byte) 59);
	}

	public boolean method2305() {
		return false;
	}

	public boolean method2090() {
		return false;
	}

	public boolean method2230() {
		return false;
	}

	public boolean method2225() {
		return false;
	}

	public void method2199() {
		anInt9017 = 0;
		anInt9030 = 0;
		anInt9015 = -299405879 * anInt8997;
		anInt9018 = 16432687 * anInt8998;
		method8451();
	}

	public boolean method2307() {
		return false;
	}

	void method8471(boolean bool, boolean bool_1350_, boolean bool_1351_, int i, int i_1352_, float f, int i_1353_, int i_1354_, short i_1355_, int i_1356_, int i_1357_, int i_1358_) {
		if (0 != i_1353_ && i_1354_ != 0) {
			if (i_1355_ != -1) {
				Class164 class164 = aClass174_1852.method2446(i_1355_, -1970058577);
				if (!class164.aBool1820) {
					if (-26431769 * anInt8994 != i_1355_) {
						NativeSprite class143 = ((NativeSprite) aClass199_9028.method2886((long) i_1355_));
						if (class143 == null) {
							int[] is = method8444(i_1355_);
							if (is == null)
								return;
							int i_1359_ = class164.anInt1815 * -1174323635;
							class143 = createNativeSprite(is, 0, i_1359_, i_1359_, i_1359_, (byte) -27);
							aClass199_9028.method2881(class143, (long) i_1355_);
						}
						anInt8994 = 333874391 * i_1355_;
						aClass143_9029 = class143;
					}
					((Class143_Sub1) aClass143_9029).method8430(bool, bool_1350_, bool_1351_, i - i_1353_, i_1352_ - i_1354_, f, i_1353_ << 1, i_1354_ << 1, i_1357_, i_1356_, i_1358_, 1, class164.aClass595_1805 != Class595.aClass595_7819);
					return;
				}
			}
			method8455(bool_1350_, i, i_1352_, f, i_1353_, i_1356_, i_1358_);
		}
	}

	public void method2309(float f, float f_1360_, float f_1361_, float f_1362_, float f_1363_) {
		/* empty */
	}

	public void method2310(float f, float f_1364_, float f_1365_, float f_1366_, float f_1367_) {
		/* empty */
	}

	public void method2311(float f, float f_1368_, float f_1369_, float f_1370_, float f_1371_) {
		/* empty */
	}

	public Class168 method2153(int[] is) {
		return null;
	}

	public boolean method2313() {
		return false;
	}

	public void method2282(int i, Class175 class175) {
		Class107 class107 = method8458(Thread.currentThread());
		class107.anInt1287 = i * -1172974661;
		class107.anInt1282 = class175.anInt1932 * 1383236455;
		class107.anInt1317 = class175.anInt1934 * -1798113843;
	}

	public void method2160(Class168 class168, float f, Class168 class168_1372_, float f_1373_, Class168 class168_1374_, float f_1375_) {
		/* empty */
	}

	public boolean method2316() {
		return false;
	}

	public boolean method2317() {
		return false;
	}

	public void method2175() {
		/* empty */
	}

	public void method2396(Class433 class433) {
		aClass433_9010 = class433;
		method8456();
	}

	public Interface21 method2338(int i, int i_1376_, int i_1377_) {
		return new Class139(i, i_1376_);
	}

	public void method2321(int i, Class175 class175) {
		for (int i_1378_ = 0; i_1378_ < aClass107Array9006.length; i_1378_++) {
			aClass107Array9006[i_1378_].anInt1283 = aClass107Array9006[i_1378_].anInt1282 * -297914507;
			aClass107Array9006[i_1378_].anInt1287 = i * -1172974661;
			aClass107Array9006[i_1378_].anInt1282 = 1383236455 * class175.anInt1932;
			aClass107Array9006[i_1378_].anInt1317 = class175.anInt1934 * -1798113843;
			aClass107Array9006[i_1378_].aBool1284 = true;
		}
	}

	public boolean method2306() {
		return false;
	}

	public Class536_Sub19 method2274(int i, int i_1379_, int i_1380_, int i_1381_, int i_1382_, float f) {
		return null;
	}

	public void method2021(int i, Class175 class175) {
		Class107 class107 = method8458(Thread.currentThread());
		class107.anInt1287 = i * -1172974661;
		class107.anInt1282 = class175.anInt1932 * 1383236455;
		class107.anInt1317 = class175.anInt1934 * -1798113843;
	}

	public void method2150(Class166 class166) {
		method8454(null != anIntArray8996, null != aFloatArray8999, false, class166);
	}

	public void method2043(long l) {
		/* empty */
	}

	public void method2327(int i, int i_1383_, float f, int i_1384_, int i_1385_, float f_1386_, int i_1387_, int i_1388_, float f_1389_, int i_1390_, int i_1391_, int i_1392_, int i_1393_) {
		boolean bool = anIntArray8996 != null;
		boolean bool_1394_ = null != aFloatArray8999;
		if (bool || bool_1394_) {
			Class107 class107 = method8458(Thread.currentThread());
			Class117 class117 = class107.aClass117_1290;
			class117.aBool1434 = false;
			i -= 1352816403 * anInt9000;
			i_1384_ -= anInt9000 * 1352816403;
			i_1387_ -= 1352816403 * anInt9000;
			i_1383_ -= anInt9021 * -1593163361;
			i_1385_ -= -1593163361 * anInt9021;
			i_1388_ -= anInt9021 * -1593163361;
			class117.aBool1449 = (i < 0 || i > class117.anInt1441 || i_1384_ < 0 || i_1384_ > class117.anInt1441 || i_1387_ < 0 || i_1387_ > class117.anInt1441);
			int i_1395_ = i_1390_ >>> 24;
			if (i_1393_ == 0 || 1 == i_1393_ && 255 == i_1395_) {
				class117.anInt1436 = 0;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_1394_, false, (float) i_1383_, (float) i_1385_, (float) i_1388_, (float) i, (float) i_1384_, (float) i_1387_, f, f_1386_, f_1389_, i_1390_, i_1391_, i_1392_);
			} else if (1 == i_1393_) {
				class117.anInt1436 = 255 - i_1395_;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_1394_, false, (float) i_1383_, (float) i_1385_, (float) i_1388_, (float) i, (float) i_1384_, (float) i_1387_, f, f_1386_, f_1389_, i_1390_, i_1391_, i_1392_);
			} else if (i_1393_ == 2) {
				class117.anInt1436 = 128;
				class117.aBool1435 = true;
				class117.method1504(bool, bool_1394_, false, (float) i_1383_, (float) i_1385_, (float) i_1388_, (float) i, (float) i_1384_, (float) i_1387_, f, f_1386_, f_1389_, i_1390_, i_1391_, i_1392_);
			} else
				throw new IllegalArgumentException();
			class117.aBool1434 = true;
		}
	}

	public void method2181(int i, int i_1396_, float f, int i_1397_, int i_1398_, float f_1399_, int i_1400_, int i_1401_, float f_1402_, int i_1403_, int i_1404_, int i_1405_, int i_1406_) {
		boolean bool = anIntArray8996 != null;
		boolean bool_1407_ = null != aFloatArray8999;
		if (bool || bool_1407_) {
			Class107 class107 = method8458(Thread.currentThread());
			Class117 class117 = class107.aClass117_1290;
			class117.aBool1434 = false;
			i -= 1352816403 * anInt9000;
			i_1397_ -= anInt9000 * 1352816403;
			i_1400_ -= 1352816403 * anInt9000;
			i_1396_ -= anInt9021 * -1593163361;
			i_1398_ -= -1593163361 * anInt9021;
			i_1401_ -= anInt9021 * -1593163361;
			class117.aBool1449 = (i < 0 || i > class117.anInt1441 || i_1397_ < 0 || i_1397_ > class117.anInt1441 || i_1400_ < 0 || i_1400_ > class117.anInt1441);
			int i_1408_ = i_1403_ >>> 24;
			if (i_1406_ == 0 || 1 == i_1406_ && 255 == i_1408_) {
				class117.anInt1436 = 0;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_1407_, false, (float) i_1396_, (float) i_1398_, (float) i_1401_, (float) i, (float) i_1397_, (float) i_1400_, f, f_1399_, f_1402_, i_1403_, i_1404_, i_1405_);
			} else if (1 == i_1406_) {
				class117.anInt1436 = 255 - i_1408_;
				class117.aBool1435 = false;
				class117.method1504(bool, bool_1407_, false, (float) i_1396_, (float) i_1398_, (float) i_1401_, (float) i, (float) i_1397_, (float) i_1400_, f, f_1399_, f_1402_, i_1403_, i_1404_, i_1405_);
			} else if (i_1406_ == 2) {
				class117.anInt1436 = 128;
				class117.aBool1435 = true;
				class117.method1504(bool, bool_1407_, false, (float) i_1396_, (float) i_1398_, (float) i_1401_, (float) i, (float) i_1397_, (float) i_1400_, f, f_1399_, f_1402_, i_1403_, i_1404_, i_1405_);
			} else
				throw new IllegalArgumentException();
			class117.aBool1434 = true;
		}
	}

	public void method2334(float f, float f_1409_, float f_1410_, float[] fs) {
		float f_1411_ = (aClass443_9013.aFloatArray4878[10] * f_1410_ + (aClass443_9013.aFloatArray4878[14] + aClass443_9013.aFloatArray4878[2] * f + f_1409_ * aClass443_9013.aFloatArray4878[6]));
		float f_1412_ = (aClass443_9013.aFloatArray4878[11] * f_1410_ + (aClass443_9013.aFloatArray4878[7] * f_1409_ + (f * aClass443_9013.aFloatArray4878[3] + aClass443_9013.aFloatArray4878[15])));
		if (f_1411_ < -f_1412_ || f_1411_ > f_1412_) {
			float[] fs_1413_ = fs;
			float[] fs_1414_ = fs;
			fs[2] = Float.NaN;
			fs_1414_[1] = Float.NaN;
			fs_1413_[0] = Float.NaN;
		} else {
			float f_1415_ = (aClass443_9013.aFloatArray4878[4] * f_1409_ + (f * aClass443_9013.aFloatArray4878[0] + aClass443_9013.aFloatArray4878[12]) + f_1410_ * aClass443_9013.aFloatArray4878[8]);
			if (f_1415_ < -f_1412_ || f_1415_ > f_1412_) {
				float[] fs_1416_ = fs;
				float[] fs_1417_ = fs;
				fs[2] = Float.NaN;
				fs_1417_[1] = Float.NaN;
				fs_1416_[0] = Float.NaN;
			} else {
				float f_1418_ = (f_1410_ * aClass443_9013.aFloatArray4878[9] + (f_1409_ * aClass443_9013.aFloatArray4878[5] + (f * aClass443_9013.aFloatArray4878[1] + aClass443_9013.aFloatArray4878[13])));
				if (f_1418_ < -f_1412_ || f_1418_ > f_1412_) {
					float[] fs_1419_ = fs;
					float[] fs_1420_ = fs;
					fs[2] = Float.NaN;
					fs_1420_[1] = Float.NaN;
					fs_1419_[0] = Float.NaN;
				} else {
					float f_1421_ = (f_1410_ * aClass443_9020.aFloatArray4878[10] + (aClass443_9020.aFloatArray4878[14] + aClass443_9020.aFloatArray4878[2] * f + f_1409_ * aClass443_9020.aFloatArray4878[6]));
					fs[0] = aFloat9002 + f_1415_ * aFloat9019 / f_1412_;
					fs[1] = aFloat9023 * f_1418_ / f_1412_ + aFloat9022;
					fs[2] = f_1421_;
				}
			}
		}
	}

	public int method2108() {
		return 0;
	}

	public Class183_Sub2 method2094() {
		return new Class183_Sub2_Sub1(this);
	}

	public Class145 method2135() {
		return new Class145(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public Interface22 method2121(int i, int i_1422_, Class155 class155, Class171 class171, int i_1423_) {
		return method8459(i, i_1422_);
	}

	public Interface22 method2335(int i, int i_1424_, Class155 class155, Class171 class171, int i_1425_) {
		return method8459(i, i_1424_);
	}

	public void method2048(int i, int i_1426_, int i_1427_, int i_1428_) {
		anInt9017 = i * -2035003219;
		anInt9030 = i_1426_ * 1594408325;
		anInt9015 = -937436553 * i_1427_;
		anInt9018 = -1249779805 * i_1428_;
		method8451();
	}

	public Interface21 method2079(int i, int i_1429_, int i_1430_) {
		return new Class139(i, i_1429_);
	}

	public boolean method2179() {
		return false;
	}

	public void method2222(int i, int i_1431_) {
		if (0 != (i & 0x1))
			method2063(0, 0, -570111553 * anInt8997, anInt8998 * -1805705211, i_1431_, 0);
		if (0 != (i & 0x2))
			method8460();
	}

	public Interface21 method2097(int i, int i_1432_, int i_1433_) {
		return new Class139(i, i_1432_);
	}

	public Interface21 method2319(int i, int i_1434_, int i_1435_) {
		return new Class139(i, i_1434_);
	}

	public void method2104(int i, int i_1436_, int i_1437_, int i_1438_) {
		/* empty */
	}

	public boolean method2343() {
		return false;
	}

	public boolean method2344() {
		return false;
	}

	public boolean method2122() {
		return false;
	}

	public void method2040() {
		/* empty */
	}

	public void method2339(int i, int i_1439_, int i_1440_) {
		/* empty */
	}

	public NativeSprite method2280(Class179 class179, boolean bool) {
		int i = class179.method2633();
		int i_1441_ = class179.method2677();
		Class143_Sub1 class143_sub1;
		if (bool && !class179.method2641() && class179.method2631()) {
			Class179_Sub2 class179_sub2 = (Class179_Sub2) class179;
			int[] is = new int[class179_sub2.anIntArray9813.length];
			byte[] is_1442_ = new byte[i * i_1441_];
			for (int i_1443_ = 0; i_1443_ < i_1441_; i_1443_++) {
				int i_1444_ = i * i_1443_;
				for (int i_1445_ = 0; i_1445_ < i; i_1445_++)
					is_1442_[i_1445_ + i_1444_] = class179_sub2.aByteArray9820[i_1445_ + i_1444_];
			}
			for (int i_1446_ = 0; i_1446_ < class179_sub2.anIntArray9813.length; i_1446_++)
				is[i_1446_] = class179_sub2.anIntArray9813[i_1446_];
			class143_sub1 = new Class143_Sub1_Sub3(this, is_1442_, is, i, i_1441_);
		} else {
			int[] is = class179.method2643(false);
			if (class179.method2641())
				class143_sub1 = new Class143_Sub1_Sub1(this, is, i, i_1441_);
			else
				class143_sub1 = new Class143_Sub1_Sub2(this, is, i, i_1441_);
		}
		class143_sub1.method1718(class179.method2635(), class179.method2637(), class179.method2636(), class179.method2638());
		return class143_sub1;
	}

	public void method2350(int i, int i_1447_, int[] is, int[] is_1448_) {
		method2045(i, i_1447_, -2081846360);
		if (aClass143_9031 == null || aClass143_9031.method1720() != i || aClass143_9031.method1752() != i_1447_) {
			aClass143_9031 = method2050(i, i_1447_, true, true);
			aClass183_Sub2_9032 = null;
		}
		if (null == aClass183_Sub2_9032) {
			aClass183_Sub2_9032 = method2304();
			aClass183_Sub2_9032.method9035(0, aClass143_9031.method1782());
		}
		Class143_Sub1_Sub1 class143_sub1_sub1 = new Class143_Sub1_Sub1(this, anIntArray8996, anInt8997 * -570111553, anInt8998 * -1805705211);
		method2028(aClass183_Sub2_9032, -409819235);
		method2000(1, -16777216);
		class143_sub1_sub1.method1732(1475697639 * anInt1872, 398729877 * anInt1873, -397142117 * anInt1856, anInt1875 * -915384365, 1, 0, 0, 0);
		aClass143_9031.method1761(0, 0, i, i_1447_, is, is_1448_, 0, i);
		method2029(aClass183_Sub2_9032, (byte) 1);
	}

	public int method2098(int i, int i_1449_) {
		i |= 0x20800;
		return i & i_1449_ ^ i_1449_;
	}

	public void method2349(int i, int i_1450_, int[] is, int[] is_1451_) {
		method2045(i, i_1450_, -2140098525);
		if (aClass143_9031 == null || aClass143_9031.method1720() != i || aClass143_9031.method1752() != i_1450_) {
			aClass143_9031 = method2050(i, i_1450_, true, true);
			aClass183_Sub2_9032 = null;
		}
		if (null == aClass183_Sub2_9032) {
			aClass183_Sub2_9032 = method2304();
			aClass183_Sub2_9032.method9035(0, aClass143_9031.method1782());
		}
		Class143_Sub1_Sub1 class143_sub1_sub1 = new Class143_Sub1_Sub1(this, anIntArray8996, anInt8997 * -570111553, anInt8998 * -1805705211);
		method2028(aClass183_Sub2_9032, -409819235);
		method2000(1, -16777216);
		class143_sub1_sub1.method1732(1475697639 * anInt1872, 398729877 * anInt1873, -397142117 * anInt1856, anInt1875 * -915384365, 1, 0, 0, 0);
		aClass143_9031.method1761(0, 0, i, i_1450_, is, is_1451_, 0, i);
		method2029(aClass183_Sub2_9032, (byte) 1);
	}

	void method2197(int i, int i_1452_, int i_1453_, int i_1454_, int i_1455_) {
		if (anIntArray8996 != null && (i_1452_ >= -1593163361 * anInt9021 && i_1452_ < anInt9003 * -148513205)) {
			if (i < 1352816403 * anInt9000) {
				i_1453_ -= 1352816403 * anInt9000 - i;
				i = anInt9000 * 1352816403;
			}
			if (i + i_1453_ > 2024498147 * anInt9001)
				i_1453_ = 2024498147 * anInt9001 - i;
			int i_1456_ = i + i_1452_ * (-570111553 * anInt8997);
			int i_1457_ = i_1454_ >>> 24;
			if (0 == i_1455_ || 1 == i_1455_ && 255 == i_1457_) {
				for (int i_1458_ = 0; i_1458_ < i_1453_; i_1458_++)
					anIntArray8996[i_1458_ + i_1456_] = i_1454_;
			} else if (1 == i_1455_) {
				i_1454_ = ((i_1457_ << 24) + (((i_1454_ & 0xff00ff) * i_1457_ >> 8 & 0xff00ff) + ((i_1454_ & 0xff00) * i_1457_ >> 8 & 0xff00)));
				int i_1459_ = 256 - i_1457_;
				for (int i_1460_ = 0; i_1460_ < i_1453_; i_1460_++) {
					int i_1461_ = anIntArray8996[i_1456_ + i_1460_];
					i_1461_ = (((i_1461_ & 0xff00ff) * i_1459_ >> 8 & 0xff00ff) + ((i_1461_ & 0xff00) * i_1459_ >> 8 & 0xff00));
					anIntArray8996[i_1460_ + i_1456_] = i_1461_ + i_1454_;
				}
			} else if (i_1455_ == 2) {
				for (int i_1462_ = 0; i_1462_ < i_1453_; i_1462_++) {
					int i_1463_ = anIntArray8996[i_1456_ + i_1462_];
					int i_1464_ = i_1454_ + i_1463_;
					int i_1465_ = (i_1463_ & 0xff00ff) + (i_1454_ & 0xff00ff);
					i_1463_ = (i_1465_ & 0x1000100) + (i_1464_ - i_1465_ & 0x10000);
					anIntArray8996[i_1456_ + i_1462_] = i_1464_ - i_1463_ | i_1463_ - (i_1463_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2402(int i, int i_1466_) {
		/* empty */
	}

	public NativeSprite method2353(int[] is, int i, int i_1467_, int i_1468_, int i_1469_, boolean bool) {
		boolean bool_1470_ = false;
		int i_1471_ = i;
		while_31_: for (int i_1472_ = 0; i_1472_ < i_1469_; i_1472_++) {
			for (int i_1473_ = 0; i_1473_ < i_1468_; i_1473_++) {
				int i_1474_ = is[i_1471_++] >>> 24;
				if (0 != i_1474_ && 255 != i_1474_) {
					bool_1470_ = true;
					break while_31_;
				}
			}
		}
		if (bool_1470_)
			return new Class143_Sub1_Sub1(this, is, i, i_1467_, i_1468_, i_1469_, bool);
		return new Class143_Sub1_Sub2(this, is, i, i_1467_, i_1468_, i_1469_, bool);
	}

	public NativeSprite method2333(int[] is, int i, int i_1475_, int i_1476_, int i_1477_, boolean bool) {
		boolean bool_1478_ = false;
		int i_1479_ = i;
		while_32_: for (int i_1480_ = 0; i_1480_ < i_1477_; i_1480_++) {
			for (int i_1481_ = 0; i_1481_ < i_1476_; i_1481_++) {
				int i_1482_ = is[i_1479_++] >>> 24;
				if (0 != i_1482_ && 255 != i_1482_) {
					bool_1478_ = true;
					break while_32_;
				}
			}
		}
		if (bool_1478_)
			return new Class143_Sub1_Sub1(this, is, i, i_1475_, i_1476_, i_1477_, bool);
		return new Class143_Sub1_Sub2(this, is, i, i_1475_, i_1476_, i_1477_, bool);
	}

	public void method2297(int[] is) {
		is[0] = -570111553 * anInt8997;
		is[1] = -1805705211 * anInt8998;
	}

	public NativeSprite method2303(int i, int i_1483_, int i_1484_, int i_1485_, boolean bool) {
		if (anIntArray8996 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_1485_ * i_1484_];
		int i_1486_ = i_1483_ * (-570111553 * anInt8997) + i;
		int i_1487_ = -570111553 * anInt8997 - i_1484_;
		for (int i_1488_ = 0; i_1488_ < i_1485_; i_1488_++) {
			int i_1489_ = i_1484_ * i_1488_;
			for (int i_1490_ = 0; i_1490_ < i_1484_; i_1490_++)
				is[i_1490_ + i_1489_] = anIntArray8996[i_1486_++];
			i_1486_ += i_1487_;
		}
		if (bool)
			return new Class143_Sub1_Sub1(this, is, i_1484_, i_1485_);
		return new Class143_Sub1_Sub2(this, is, i_1484_, i_1485_);
	}

	public NativeSprite method2357(int i, int i_1491_, int i_1492_, int i_1493_, boolean bool) {
		if (anIntArray8996 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_1493_ * i_1492_];
		int i_1494_ = i_1491_ * (-570111553 * anInt8997) + i;
		int i_1495_ = -570111553 * anInt8997 - i_1492_;
		for (int i_1496_ = 0; i_1496_ < i_1493_; i_1496_++) {
			int i_1497_ = i_1492_ * i_1496_;
			for (int i_1498_ = 0; i_1498_ < i_1492_; i_1498_++)
				is[i_1498_ + i_1497_] = anIntArray8996[i_1494_++];
			i_1494_ += i_1495_;
		}
		if (bool)
			return new Class143_Sub1_Sub1(this, is, i_1492_, i_1493_);
		return new Class143_Sub1_Sub2(this, is, i_1492_, i_1493_);
	}

	public Class443 method2358() {
		return new Class443(aClass443_9012);
	}

	public boolean method2038() {
		return false;
	}

	public int method2360() {
		return 0;
	}

	public void method2361(int i, float f, float f_1499_, float f_1500_, float f_1501_, float f_1502_) {
		anInt9007 = -1282578887 * (int) (f * 65535.0F);
		anInt9008 = -381993433 * (int) (65535.0F * f_1499_);
		float f_1503_ = (float) Math.sqrt((double) (f_1502_ * f_1502_ + (f_1500_ * f_1500_ + f_1501_ * f_1501_)));
		anInt9004 = 2048043533 * (int) (f_1500_ * 65535.0F / f_1503_);
		anInt9016 = -118062721 * (int) (65535.0F * f_1501_ / f_1503_);
		anInt9026 = -822560063 * (int) (65535.0F * f_1502_ / f_1503_);
	}

	public void method2033(int i, int i_1504_, int i_1505_, int i_1506_, int i_1507_, int i_1508_) {
		if (null != anIntArray8996) {
			if (i < 1352816403 * anInt9000) {
				i_1505_ -= 1352816403 * anInt9000 - i;
				i = 1352816403 * anInt9000;
			}
			if (i_1504_ < -1593163361 * anInt9021) {
				i_1506_ -= anInt9021 * -1593163361 - i_1504_;
				i_1504_ = -1593163361 * anInt9021;
			}
			if (i + i_1505_ > anInt9001 * 2024498147)
				i_1505_ = anInt9001 * 2024498147 - i;
			if (i_1504_ + i_1506_ > -148513205 * anInt9003)
				i_1506_ = anInt9003 * -148513205 - i_1504_;
			if (i_1505_ > 0 && i_1506_ > 0 && i <= 2024498147 * anInt9001 && i_1504_ <= anInt9003 * -148513205) {
				int i_1509_ = -570111553 * anInt8997 - i_1505_;
				int i_1510_ = anInt8997 * -570111553 * i_1504_ + i;
				int i_1511_ = i_1507_ >>> 24;
				if (0 == i_1508_ || i_1508_ == 1 && i_1511_ == 255) {
					int i_1512_ = i_1505_ >> 3;
					int i_1513_ = i_1505_ & 0x7;
					i_1505_ = i_1510_ - 1;
					for (int i_1514_ = -i_1506_; i_1514_ < 0; i_1514_++) {
						if (i_1512_ > 0) {
							i = i_1512_;
							do {
								anIntArray8996[++i_1505_] = i_1507_;
								anIntArray8996[++i_1505_] = i_1507_;
								anIntArray8996[++i_1505_] = i_1507_;
								anIntArray8996[++i_1505_] = i_1507_;
								anIntArray8996[++i_1505_] = i_1507_;
								anIntArray8996[++i_1505_] = i_1507_;
								anIntArray8996[++i_1505_] = i_1507_;
								anIntArray8996[++i_1505_] = i_1507_;
							} while (--i > 0);
						}
						if (i_1513_ > 0) {
							i = i_1513_;
							do
								anIntArray8996[++i_1505_] = i_1507_;
							while (--i > 0);
						}
						i_1505_ += i_1509_;
					}
				} else if (i_1508_ == 1) {
					i_1507_ = (((i_1507_ & 0xff00ff) * i_1511_ >> 8 & 0xff00ff) + (i_1511_ * ((i_1507_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_1515_ = 256 - i_1511_;
					for (int i_1516_ = 0; i_1516_ < i_1506_; i_1516_++) {
						for (int i_1517_ = -i_1505_; i_1517_ < 0; i_1517_++) {
							int i_1518_ = anIntArray8996[i_1510_];
							i_1518_ = ((i_1515_ * (i_1518_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_1518_ & ~0xff00ff) >>> 8) * i_1515_ & ~0xff00ff));
							anIntArray8996[i_1510_++] = i_1507_ + i_1518_;
						}
						i_1510_ += i_1509_;
					}
				} else if (2 == i_1508_) {
					for (int i_1519_ = 0; i_1519_ < i_1506_; i_1519_++) {
						for (int i_1520_ = -i_1505_; i_1520_ < 0; i_1520_++) {
							int i_1521_ = anIntArray8996[i_1510_];
							int i_1522_ = i_1521_ + i_1507_;
							int i_1523_ = (i_1521_ & 0xff00ff) + (i_1507_ & 0xff00ff);
							i_1521_ = ((i_1522_ - i_1523_ & 0x10000) + (i_1523_ & 0x1000100));
							anIntArray8996[i_1510_++] = i_1522_ - i_1521_ | i_1521_ - (i_1521_ >>> 8);
						}
						i_1510_ += i_1509_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2363(int i, float f, float f_1524_, float f_1525_, float f_1526_, float f_1527_) {
		anInt9007 = -1282578887 * (int) (f * 65535.0F);
		anInt9008 = -381993433 * (int) (65535.0F * f_1524_);
		float f_1528_ = (float) Math.sqrt((double) (f_1527_ * f_1527_ + (f_1525_ * f_1525_ + f_1526_ * f_1526_)));
		anInt9004 = 2048043533 * (int) (f_1525_ * 65535.0F / f_1528_);
		anInt9016 = -118062721 * (int) (65535.0F * f_1526_ / f_1528_);
		anInt9026 = -822560063 * (int) (65535.0F * f_1527_ / f_1528_);
	}

	public void method2024(int i, int i_1529_, int[] is, int[] is_1530_) {
		method2045(i, i_1529_, -2053827969);
		if (aClass143_9031 == null || aClass143_9031.method1720() != i || aClass143_9031.method1752() != i_1529_) {
			aClass143_9031 = method2050(i, i_1529_, true, true);
			aClass183_Sub2_9032 = null;
		}
		if (null == aClass183_Sub2_9032) {
			aClass183_Sub2_9032 = method2304();
			aClass183_Sub2_9032.method9035(0, aClass143_9031.method1782());
		}
		Class143_Sub1_Sub1 class143_sub1_sub1 = new Class143_Sub1_Sub1(this, anIntArray8996, anInt8997 * -570111553, anInt8998 * -1805705211);
		method2028(aClass183_Sub2_9032, -409819235);
		method2000(1, -16777216);
		class143_sub1_sub1.method1732(1475697639 * anInt1872, 398729877 * anInt1873, -397142117 * anInt1856, anInt1875 * -915384365, 1, 0, 0, 0);
		aClass143_9031.method1761(0, 0, i, i_1529_, is, is_1530_, 0, i);
		method2029(aClass183_Sub2_9032, (byte) 1);
	}

	public void method2365(int i, int i_1531_, int i_1532_) {
		for (int i_1533_ = 0; i_1533_ < aClass107Array9006.length; i_1533_++) {
			Class107 class107 = aClass107Array9006[i_1533_];
			class107.anInt1282 = (i & 0xffffff) * 804677509;
			int i_1534_ = class107.anInt1282 * 900823373 >>> 16 & 0xff;
			if (i_1534_ < 2)
				i_1534_ = 2;
			int i_1535_ = class107.anInt1282 * 900823373 >> 8 & 0xff;
			if (i_1535_ < 2)
				i_1535_ = 2;
			int i_1536_ = class107.anInt1282 * 900823373 & 0xff;
			if (i_1536_ < 2)
				i_1536_ = 2;
			class107.anInt1282 = (i_1534_ << 16 | i_1535_ << 8 | i_1536_) * 804677509;
			if (i_1531_ < 0)
				class107.aBool1279 = false;
			else
				class107.aBool1279 = true;
		}
	}

	public void method2366(int i, int i_1537_, int i_1538_) {
		for (int i_1539_ = 0; i_1539_ < aClass107Array9006.length; i_1539_++) {
			Class107 class107 = aClass107Array9006[i_1539_];
			class107.anInt1282 = (i & 0xffffff) * 804677509;
			int i_1540_ = class107.anInt1282 * 900823373 >>> 16 & 0xff;
			if (i_1540_ < 2)
				i_1540_ = 2;
			int i_1541_ = class107.anInt1282 * 900823373 >> 8 & 0xff;
			if (i_1541_ < 2)
				i_1541_ = 2;
			int i_1542_ = class107.anInt1282 * 900823373 & 0xff;
			if (i_1542_ < 2)
				i_1542_ = 2;
			class107.anInt1282 = (i_1540_ << 16 | i_1541_ << 8 | i_1542_) * 804677509;
			if (i_1537_ < 0)
				class107.aBool1279 = false;
			else
				class107.aBool1279 = true;
		}
	}

	public void method2238(int i, int i_1543_, int i_1544_, int i_1545_, int i_1546_, int i_1547_, Class161 class161, int i_1548_, int i_1549_, int i_1550_, int i_1551_, int i_1552_) {
		if (null != anIntArray8996) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			int[] is = class161_sub2.anIntArray9444;
			int[] is_1553_ = class161_sub2.anIntArray9445;
			int i_1554_ = (anInt9021 * -1593163361 > i_1549_ ? anInt9021 * -1593163361 : i_1549_);
			int i_1555_ = (-148513205 * anInt9003 < i_1549_ + is.length ? anInt9003 * -148513205 : i_1549_ + is.length);
			i_1552_ <<= 8;
			i_1550_ <<= 8;
			i_1551_ <<= 8;
			int i_1556_ = i_1551_ + i_1550_;
			i_1552_ %= i_1556_;
			i_1544_ -= i;
			i_1545_ -= i_1543_;
			if (i_1544_ + i_1545_ < 0) {
				int i_1557_ = (int) (Math.sqrt((double) (i_1544_ * i_1544_ + i_1545_ * i_1545_)) * 256.0);
				int i_1558_ = i_1557_ % i_1556_;
				i_1552_ = i_1550_ + i_1556_ - i_1552_ - i_1558_;
				i_1552_ %= i_1556_;
				if (i_1552_ < 0)
					i_1552_ += i_1556_;
				i += i_1544_;
				i_1544_ = -i_1544_;
				i_1543_ += i_1545_;
				i_1545_ = -i_1545_;
			}
			if (i_1544_ > i_1545_) {
				i_1543_ <<= 16;
				i_1543_ += 32768;
				i_1545_ <<= 16;
				int i_1559_ = (int) Math.floor((double) i_1545_ / (double) i_1544_ + 0.5);
				i_1544_ += i;
				int i_1560_ = i_1546_ >>> 24;
				int i_1561_ = (int) Math.sqrt((double) (65536 + (i_1559_ >> 8) * (i_1559_ >> 8)));
				if (0 == i_1547_ || i_1547_ == 1 && 255 == i_1560_) {
					while (i <= i_1544_) {
						int i_1562_ = i_1543_ >> 16;
						int i_1563_ = i_1562_ - i_1549_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_1562_ >= i_1554_ && i_1562_ < i_1555_ && i_1552_ < i_1550_) {
							int i_1564_ = is[i_1563_] + i_1548_;
							if (i >= i_1564_ && i < i_1564_ + is_1553_[i_1563_])
								anIntArray8996[i + i_1562_ * (-570111553 * anInt8997)] = i_1546_;
						}
						i_1543_ += i_1559_;
						i++;
						i_1552_ += i_1561_;
						i_1552_ %= i_1556_;
					}
				} else if (i_1547_ == 1) {
					i_1546_ = (((i_1546_ & 0xff00ff) * i_1560_ >> 8 & 0xff00ff) + ((i_1546_ & 0xff00) * i_1560_ >> 8 & 0xff00) + (i_1560_ << 24));
					int i_1565_ = 256 - i_1560_;
					while (i <= i_1544_) {
						int i_1566_ = i_1543_ >> 16;
						int i_1567_ = i_1566_ - i_1549_;
						if (i >= 1352816403 * anInt9000 && i < 2024498147 * anInt9001 && i_1566_ >= i_1554_ && i_1566_ < i_1555_ && i_1552_ < i_1550_) {
							int i_1568_ = i_1548_ + is[i_1567_];
							if (i >= i_1568_ && i < is_1553_[i_1567_] + i_1568_) {
								int i_1569_ = i + i_1566_ * (-570111553 * anInt8997);
								int i_1570_ = anIntArray8996[i_1569_];
								i_1570_ = (((i_1570_ & 0xff00) * i_1565_ >> 8 & 0xff00) + ((i_1570_ & 0xff00ff) * i_1565_ >> 8 & 0xff00ff));
								anIntArray8996[i_1569_] = i_1570_ + i_1546_;
							}
						}
						i_1543_ += i_1559_;
						i++;
						i_1552_ += i_1561_;
						i_1552_ %= i_1556_;
					}
				} else if (2 == i_1547_) {
					while (i <= i_1544_) {
						int i_1571_ = i_1543_ >> 16;
						int i_1572_ = i_1571_ - i_1549_;
						if (i >= anInt9000 * 1352816403 && i < 2024498147 * anInt9001 && i_1571_ >= i_1554_ && i_1571_ < i_1555_ && i_1552_ < i_1550_) {
							int i_1573_ = is[i_1572_] + i_1548_;
							if (i >= i_1573_ && i < i_1573_ + is_1553_[i_1572_]) {
								int i_1574_ = -570111553 * anInt8997 * i_1571_ + i;
								int i_1575_ = anIntArray8996[i_1574_];
								int i_1576_ = i_1575_ + i_1546_;
								int i_1577_ = ((i_1575_ & 0xff00ff) + (i_1546_ & 0xff00ff));
								i_1575_ = ((i_1576_ - i_1577_ & 0x10000) + (i_1577_ & 0x1000100));
								anIntArray8996[i_1574_] = i_1576_ - i_1575_ | i_1575_ - (i_1575_ >>> 8);
							}
						}
						i_1543_ += i_1559_;
						i++;
						i_1552_ += i_1561_;
						i_1552_ %= i_1556_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1544_ <<= 16;
				int i_1578_ = (int) Math.floor((double) i_1544_ / (double) i_1545_ + 0.5);
				int i_1579_ = (int) Math.sqrt((double) ((i_1578_ >> 8) * (i_1578_ >> 8) + 65536));
				i_1545_ += i_1543_;
				int i_1580_ = i_1546_ >>> 24;
				if (0 == i_1547_ || 1 == i_1547_ && i_1580_ == 255) {
					while (i_1543_ <= i_1545_) {
						int i_1581_ = i >> 16;
						int i_1582_ = i_1543_ - i_1549_;
						if (i_1543_ >= i_1554_ && i_1543_ < i_1555_ && i_1581_ >= 1352816403 * anInt9000 && i_1581_ < anInt9001 * 2024498147 && i_1552_ < i_1550_ && i_1581_ >= is[i_1582_] + i_1548_ && (i_1581_ < i_1548_ + is[i_1582_] + is_1553_[i_1582_]))
							anIntArray8996[(-570111553 * anInt8997 * i_1543_ + i_1581_)] = i_1546_;
						i += i_1578_;
						i_1543_++;
						i_1552_ += i_1579_;
						i_1552_ %= i_1556_;
					}
				} else if (1 == i_1547_) {
					i_1546_ = ((i_1580_ * (i_1546_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1580_ * (i_1546_ & 0xff00) >> 8 & 0xff00) + (i_1580_ << 24));
					int i_1583_ = 256 - i_1580_;
					while (i_1543_ <= i_1545_) {
						int i_1584_ = i >> 16;
						int i_1585_ = i_1543_ - i_1549_;
						if (i_1543_ >= i_1554_ && i_1543_ < i_1555_ && i_1584_ >= anInt9000 * 1352816403 && i_1584_ < anInt9001 * 2024498147 && i_1552_ < i_1550_ && i_1584_ >= i_1548_ + is[i_1585_] && (i_1584_ < i_1548_ + is[i_1585_] + is_1553_[i_1585_])) {
							int i_1586_ = i_1584_ + i_1543_ * (anInt8997 * -570111553);
							int i_1587_ = anIntArray8996[i_1586_];
							i_1587_ = ((i_1583_ * (i_1587_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1583_ * (i_1587_ & 0xff00) >> 8 & 0xff00));
							anIntArray8996[i_1584_ + i_1543_ * (anInt8997 * -570111553)] = i_1546_ + i_1587_;
						}
						i += i_1578_;
						i_1543_++;
						i_1552_ += i_1579_;
						i_1552_ %= i_1556_;
					}
				} else if (2 == i_1547_) {
					while (i_1543_ <= i_1545_) {
						int i_1588_ = i >> 16;
						int i_1589_ = i_1543_ - i_1549_;
						if (i_1543_ >= i_1554_ && i_1543_ < i_1555_ && i_1588_ >= anInt9000 * 1352816403 && i_1588_ < 2024498147 * anInt9001 && i_1552_ < i_1550_ && i_1588_ >= is[i_1589_] + i_1548_ && (i_1588_ < i_1548_ + is[i_1589_] + is_1553_[i_1589_])) {
							int i_1590_ = i_1543_ * (-570111553 * anInt8997) + i_1588_;
							int i_1591_ = anIntArray8996[i_1590_];
							int i_1592_ = i_1591_ + i_1546_;
							int i_1593_ = (i_1546_ & 0xff00ff) + (i_1591_ & 0xff00ff);
							i_1591_ = ((i_1592_ - i_1593_ & 0x10000) + (i_1593_ & 0x1000100));
							anIntArray8996[i_1590_] = i_1592_ - i_1591_ | i_1591_ - (i_1591_ >>> 8);
						}
						i += i_1578_;
						i_1543_++;
						i_1552_ += i_1579_;
						i_1552_ %= i_1556_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2069(int i, int i_1594_, int i_1595_, int i_1596_, int i_1597_, int i_1598_, int i_1599_, int i_1600_, int i_1601_) {
		if (null != anIntArray8996) {
			i_1595_ -= i;
			i_1596_ -= i_1594_;
			if (0 == i_1596_) {
				if (i_1595_ >= 0)
					method8452(i, i_1594_, 1 + i_1595_, i_1597_, i_1598_, i_1599_, i_1600_, i_1601_);
				else {
					int i_1602_ = i_1600_ + i_1599_;
					i_1601_ %= i_1602_;
					i_1601_ = (i_1599_ + i_1602_ - i_1601_ - (1 + -i_1595_) % i_1602_);
					i_1601_ %= i_1602_;
					if (i_1601_ < 0)
						i_1601_ += i_1602_;
					method8452(i + i_1595_, i_1594_, 1 + -i_1595_, i_1597_, i_1598_, i_1599_, i_1600_, i_1601_);
				}
			} else if (i_1595_ == 0) {
				if (i_1596_ >= 0)
					method8453(i, i_1594_, i_1596_ + 1, i_1597_, i_1598_, i_1599_, i_1600_, i_1601_);
				else {
					int i_1603_ = i_1599_ + i_1600_;
					i_1601_ %= i_1603_;
					i_1601_ = (i_1599_ + i_1603_ - i_1601_ - (-i_1596_ + 1) % i_1603_);
					i_1601_ %= i_1603_;
					if (i_1601_ < 0)
						i_1601_ += i_1603_;
					method8453(i, i_1594_ + i_1596_, 1 + -i_1596_, i_1597_, i_1598_, i_1599_, i_1600_, i_1601_);
				}
			} else {
				i_1601_ <<= 8;
				i_1599_ <<= 8;
				i_1600_ <<= 8;
				int i_1604_ = i_1599_ + i_1600_;
				i_1601_ %= i_1604_;
				if (i_1595_ + i_1596_ < 0) {
					int i_1605_ = (int) (Math.sqrt((double) (i_1596_ * i_1596_ + i_1595_ * i_1595_)) * 256.0);
					int i_1606_ = i_1605_ % i_1604_;
					i_1601_ = i_1604_ + i_1599_ - i_1601_ - i_1606_;
					i_1601_ %= i_1604_;
					if (i_1601_ < 0)
						i_1601_ += i_1604_;
					i += i_1595_;
					i_1595_ = -i_1595_;
					i_1594_ += i_1596_;
					i_1596_ = -i_1596_;
				}
				if (i_1595_ > i_1596_) {
					i_1594_ <<= 16;
					i_1594_ += 32768;
					i_1596_ <<= 16;
					int i_1607_ = (int) Math.floor((double) i_1596_ / (double) i_1595_ + 0.5);
					i_1595_ += i;
					int i_1608_ = i_1597_ >>> 24;
					int i_1609_ = (int) Math.sqrt((double) ((i_1607_ >> 8) * (i_1607_ >> 8) + 65536));
					if (0 == i_1598_ || i_1598_ == 1 && 255 == i_1608_) {
						while (i <= i_1595_) {
							int i_1610_ = i_1594_ >> 16;
							if (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147 && i_1610_ >= -1593163361 * anInt9021 && i_1610_ < anInt9003 * -148513205 && i_1601_ < i_1599_)
								anIntArray8996[i + (anInt8997 * -570111553 * i_1610_)] = i_1597_;
							i_1594_ += i_1607_;
							i++;
							i_1601_ += i_1609_;
							i_1601_ %= i_1604_;
						}
					} else if (i_1598_ == 1) {
						i_1597_ = ((i_1608_ * (i_1597_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1597_ & 0xff00) * i_1608_ >> 8 & 0xff00) + (i_1608_ << 24));
						int i_1611_ = 256 - i_1608_;
						while (i <= i_1595_) {
							int i_1612_ = i_1594_ >> 16;
							if (i >= anInt9000 * 1352816403 && i < anInt9001 * 2024498147 && i_1612_ >= -1593163361 * anInt9021 && i_1612_ < -148513205 * anInt9003 && i_1601_ < i_1599_) {
								int i_1613_ = -570111553 * anInt8997 * i_1612_ + i;
								int i_1614_ = anIntArray8996[i_1613_];
								i_1614_ = (((i_1614_ & 0xff00) * i_1611_ >> 8 & 0xff00) + ((i_1614_ & 0xff00ff) * i_1611_ >> 8 & 0xff00ff));
								anIntArray8996[i_1613_] = i_1597_ + i_1614_;
							}
							i_1594_ += i_1607_;
							i++;
							i_1601_ += i_1609_;
							i_1601_ %= i_1604_;
						}
					} else if (i_1598_ == 2) {
						while (i <= i_1595_) {
							int i_1615_ = i_1594_ >> 16;
							if (i >= anInt9000 * 1352816403 && i < 2024498147 * anInt9001 && i_1615_ >= anInt9021 * -1593163361 && i_1615_ < -148513205 * anInt9003 && i_1601_ < i_1599_) {
								int i_1616_ = i + i_1615_ * (-570111553 * anInt8997);
								int i_1617_ = anIntArray8996[i_1616_];
								int i_1618_ = i_1597_ + i_1617_;
								int i_1619_ = ((i_1617_ & 0xff00ff) + (i_1597_ & 0xff00ff));
								i_1617_ = ((i_1618_ - i_1619_ & 0x10000) + (i_1619_ & 0x1000100));
								anIntArray8996[i_1616_] = i_1618_ - i_1617_ | i_1617_ - (i_1617_ >>> 8);
							}
							i_1594_ += i_1607_;
							i++;
							i_1601_ += i_1609_;
							i_1601_ %= i_1604_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1595_ <<= 16;
					int i_1620_ = (int) Math.floor(0.5 + ((double) i_1595_ / (double) i_1596_));
					i_1596_ += i_1594_;
					int i_1621_ = i_1597_ >>> 24;
					int i_1622_ = (int) Math.sqrt((double) (65536 + ((i_1620_ >> 8) * (i_1620_ >> 8))));
					if (0 == i_1598_ || i_1598_ == 1 && i_1621_ == 255) {
						while (i_1594_ <= i_1596_) {
							int i_1623_ = i >> 16;
							if (i_1594_ >= anInt9021 * -1593163361 && i_1594_ < -148513205 * anInt9003 && i_1623_ >= 1352816403 * anInt9000 && i_1623_ < 2024498147 * anInt9001 && i_1601_ < i_1599_)
								anIntArray8996[(i_1623_ + i_1594_ * (anInt8997 * -570111553))] = i_1597_;
							i += i_1620_;
							i_1594_++;
							i_1601_ += i_1622_;
							i_1601_ %= i_1604_;
						}
					} else if (i_1598_ == 1) {
						i_1597_ = (((i_1597_ & 0xff00) * i_1621_ >> 8 & 0xff00) + (i_1621_ * (i_1597_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1621_ << 24));
						int i_1624_ = 256 - i_1621_;
						while (i_1594_ <= i_1596_) {
							int i_1625_ = i >> 16;
							if (i_1594_ >= anInt9021 * -1593163361 && i_1594_ < -148513205 * anInt9003 && i_1625_ >= 1352816403 * anInt9000 && i_1625_ < anInt9001 * 2024498147 && i_1601_ < i_1599_) {
								int i_1626_ = (i_1625_ + -570111553 * anInt8997 * i_1594_);
								int i_1627_ = anIntArray8996[i_1626_];
								i_1627_ = (((i_1627_ & 0xff00) * i_1624_ >> 8 & 0xff00) + (i_1624_ * (i_1627_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray8996[i_1625_ + (-570111553 * anInt8997 * i_1594_)] = i_1597_ + i_1627_;
							}
							i += i_1620_;
							i_1594_++;
							i_1601_ += i_1622_;
							i_1601_ %= i_1604_;
						}
					} else if (i_1598_ == 2) {
						while (i_1594_ <= i_1596_) {
							int i_1628_ = i >> 16;
							if (i_1594_ >= anInt9021 * -1593163361 && i_1594_ < anInt9003 * -148513205 && i_1628_ >= anInt9000 * 1352816403 && i_1628_ < 2024498147 * anInt9001 && i_1601_ < i_1599_) {
								int i_1629_ = (anInt8997 * -570111553 * i_1594_ + i_1628_);
								int i_1630_ = anIntArray8996[i_1629_];
								int i_1631_ = i_1597_ + i_1630_;
								int i_1632_ = ((i_1597_ & 0xff00ff) + (i_1630_ & 0xff00ff));
								i_1630_ = ((i_1631_ - i_1632_ & 0x10000) + (i_1632_ & 0x1000100));
								anIntArray8996[i_1629_] = i_1631_ - i_1630_ | i_1630_ - (i_1630_ >>> 8);
							}
							i += i_1620_;
							i_1594_++;
							i_1601_ += i_1622_;
							i_1601_ %= i_1604_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public boolean method2220() {
		return false;
	}

	public boolean method2389() {
		return false;
	}

	public boolean method2201() {
		return false;
	}

	public boolean method2372() {
		return false;
	}

	public void method2377(int i) {
		int i_1633_ = i - anInt8993 * 1125269979;
		for (Class536_Sub21 class536_sub21 = (Class536_Sub21) aClass199_9027.method2888(-365121745); null != class536_sub21; class536_sub21 = (Class536_Sub21) aClass199_9027.method2889((byte) 13)) {
			if (class536_sub21.aBool10524) {
				class536_sub21.anInt10522 += i_1633_;
				int i_1634_ = class536_sub21.anInt10522 / 50;
				if (i_1634_ > 0) {
					Class164 class164 = aClass174_1852.method2446(class536_sub21.anInt10521, -1836939560);
					float f = (float) (-1174323635 * class164.anInt1815);
					class536_sub21.method9572((int) (f * ((float) i_1633_ / 1000.0F * (float) class164.aByte1802 / 64.0F)), (int) (f * ((float) i_1633_ / 1000.0F * (float) class164.aByte1803 / 64.0F)));
					class536_sub21.anInt10522 -= 50 * i_1634_;
				}
				class536_sub21.aBool10524 = false;
			}
		}
		anInt8993 = 1474155091 * i;
		aClass199_9028.method2883(5, -1381134708);
		aClass199_9027.method2883(5, -1905088195);
	}

	public void method2378(int i) {
		int i_1635_ = i - anInt8993 * 1125269979;
		for (Class536_Sub21 class536_sub21 = (Class536_Sub21) aClass199_9027.method2888(-365121745); null != class536_sub21; class536_sub21 = (Class536_Sub21) aClass199_9027.method2889((byte) 13)) {
			if (class536_sub21.aBool10524) {
				class536_sub21.anInt10522 += i_1635_;
				int i_1636_ = class536_sub21.anInt10522 / 50;
				if (i_1636_ > 0) {
					Class164 class164 = aClass174_1852.method2446(class536_sub21.anInt10521, -104393895);
					float f = (float) (-1174323635 * class164.anInt1815);
					class536_sub21.method9572((int) (f * ((float) i_1635_ / 1000.0F * (float) class164.aByte1802 / 64.0F)), (int) (f * ((float) i_1635_ / 1000.0F * (float) class164.aByte1803 / 64.0F)));
					class536_sub21.anInt10522 -= 50 * i_1636_;
				}
				class536_sub21.aBool10524 = false;
			}
		}
		anInt8993 = 1474155091 * i;
		aClass199_9028.method2883(5, -1935623664);
		aClass199_9027.method2883(5, -1207700418);
	}

	public void method2324(int i) {
		int i_1637_ = i - anInt8993 * 1125269979;
		for (Class536_Sub21 class536_sub21 = (Class536_Sub21) aClass199_9027.method2888(-365121745); null != class536_sub21; class536_sub21 = (Class536_Sub21) aClass199_9027.method2889((byte) 13)) {
			if (class536_sub21.aBool10524) {
				class536_sub21.anInt10522 += i_1637_;
				int i_1638_ = class536_sub21.anInt10522 / 50;
				if (i_1638_ > 0) {
					Class164 class164 = aClass174_1852.method2446(class536_sub21.anInt10521, -1818862365);
					float f = (float) (-1174323635 * class164.anInt1815);
					class536_sub21.method9572((int) (f * ((float) i_1637_ / 1000.0F * (float) class164.aByte1802 / 64.0F)), (int) (f * ((float) i_1637_ / 1000.0F * (float) class164.aByte1803 / 64.0F)));
					class536_sub21.anInt10522 -= 50 * i_1638_;
				}
				class536_sub21.aBool10524 = false;
			}
		}
		anInt8993 = 1474155091 * i;
		aClass199_9028.method2883(5, -2138571140);
		aClass199_9027.method2883(5, -1874901989);
	}

	public int method2380() {
		return 0;
	}

	public void method2257(int i, int i_1639_) {
		/* empty */
	}

	public void method2406(Class166 class166) {
		method8454(null != anIntArray8996, null != aFloatArray8999, false, class166);
	}

	public Interface21 method2337(int i, int i_1640_, int i_1641_) {
		return new Class139(i, i_1640_);
	}

	static void method8472(String[] strings, int i) {
		if (strings.length > 1) {
			for (int i_1642_ = 0; i_1642_ < strings.length; i_1642_++) {
				if (strings[i_1642_].startsWith("pause")) {
					int i_1643_ = 5;
					try {
						i_1643_ = Integer.parseInt(strings[i_1642_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class214.sendPanelBoxMessage(new StringBuilder().append("Pausing for ").append(i_1643_).append(" seconds...").toString());
					Class550_Sub1.aStringArray10618 = strings;
					Class105.anInt1249 = -1325171319 * (1 + i_1642_);
					Class332.aLong3619 = (Class249.method3450(2127184646) + (long) (1000 * i_1643_)) * -5369841114397763395L;
					break;
				}
				Class105.aString1243 = strings[i_1642_];
				Class325.method4278(false, 434242750);
			}
		} else {
			Class105.aString1243 = new StringBuilder().append(Class105.aString1243).append(strings[0]).toString();
			Class105.anInt1246 += strings[0].length() * -1505065287;
		}
	}
}

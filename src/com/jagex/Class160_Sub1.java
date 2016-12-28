/* Class160_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class160_Sub1 extends Class160 {
	Interface15 anInterface15_9348;
	float[][] aFloatArrayArray9349;
	Class167_Sub2 aClass167_Sub2_9350;
	int anInt9351;
	static float[] aFloatArray9352 = new float[16];
	int anInt9353;
	int anInt9354;
	int anInt9355;
	int anInt9356;
	int anInt9357;
	static final int anInt9358 = 1;
	int[][][] anIntArrayArrayArray9359;
	int[][][] anIntArrayArrayArray9360;
	int[][][] anIntArrayArrayArray9361;
	int[][][] anIntArrayArrayArray9362;
	int[][][] anIntArrayArrayArray9363;
	int[][][] anIntArrayArrayArray9364;
	byte[][] aByteArrayArray9365;
	Class150 aClass150_9366;
	Class708 aClass708_9367 = new Class708();
	Class536[] aClass536Array9368;
	Class536_Sub28[][][] aClass536_Sub28ArrayArrayArray9369;
	Class4 aClass4_9370;
	Class130 aClass130_9371;
	Class130 aClass130_9372;
	Class130 aClass130_9373;
	int anInt9374;
	int anInt9375;
	byte[][] aByteArrayArray9376;
	static final int anInt9377 = 74;
	float[][] aFloatArrayArray9378;
	float[][] aFloatArrayArray9379;
	short[][] aShortArrayArray9380;
	Class130 aClass130_9381;

	public void method1950(Class536_Sub19 class536_sub19, int[] is) {
		aClass708_9367.method8335(new Class536_Sub11(aClass167_Sub2_9350, this, class536_sub19, is), -1889727265);
	}

	public void method1956(int i, int i_0_, int i_1_) {
		i = Math.min(aByteArrayArray9376.length - 1, Math.max(0, i));
		i_0_ = Math.min(aByteArrayArray9376[i].length - 1, Math.max(0, i_0_));
		if ((aByteArrayArray9376[i][i_0_] & 0xff) < i_1_)
			aByteArrayArray9376[i][i_0_] = (byte) i_1_;
	}

	public void method1920(int i, int i_2_, int[] is, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, Class175 class175, boolean bool) {
		Class174 class174 = aClass167_Sub2_9350.aClass174_1852;
		if (is_5_ != null && anIntArrayArrayArray9364 == null)
			anIntArrayArrayArray9364 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		if (is_3_ != null && anIntArrayArrayArray9363 == null)
			anIntArrayArrayArray9363 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		anIntArrayArrayArray9361[i][i_2_] = is;
		anIntArrayArrayArray9362[i][i_2_] = is_4_;
		anIntArrayArrayArray9359[i][i_2_] = is_6_;
		anIntArrayArrayArray9360[i][i_2_] = is_7_;
		if (anIntArrayArrayArray9364 != null)
			anIntArrayArrayArray9364[i][i_2_] = is_5_;
		if (anIntArrayArrayArray9363 != null)
			anIntArrayArrayArray9363[i][i_2_] = is_3_;
		Class536_Sub28[] class536_sub28s = (aClass536_Sub28ArrayArrayArray9369[i][i_2_] = new Class536_Sub28[is_6_.length]);
		for (int i_10_ = 0; i_10_ < is_6_.length; i_10_++) {
			int i_11_ = is_8_[i_10_];
			int i_12_ = is_9_[i_10_];
			if ((anInt9375 & 0x20) != 0 && i_11_ != -1 && class174.method2446(i_11_, -29594611).aBool1820) {
				i_12_ = 128;
				i_11_ = -1;
			}
			long l = ((long) (class175.anInt1930 * 1487365757) << 48 | (long) (class175.anInt1934 * 71478565) << 42 | (long) (class175.anInt1932 * 432289019) << 28 | (long) (i_12_ << 14) | (long) i_11_);
			Class536 class536;
			for (class536 = aClass4_9370.method556(l); class536 != null; class536 = aClass4_9370.method557(-1034809591)) {
				Class536_Sub28 class536_sub28 = (Class536_Sub28) class536;
				if (class536_sub28.anInt10545 == i_11_ && class536_sub28.aFloat10543 == (float) i_12_ && class536_sub28.aClass175_10547.method2450(class175, (byte) 39))
					break;
			}
			if (class536 == null) {
				class536_sub28s[i_10_] = new Class536_Sub28(this, i_11_, i_12_, class175);
				aClass4_9370.method560(class536_sub28s[i_10_], l);
			} else
				class536_sub28s[i_10_] = (Class536_Sub28) class536;
		}
		if (bool)
			aByteArrayArray9365[i][i_2_] |= 0x1;
		if (is_6_.length > anInt9354)
			anInt9354 = is_6_.length;
		anInt9374 += is_6_.length;
	}

	public void method1933(Class536_Sub19 class536_sub19, int[] is) {
		aClass708_9367.method8335(new Class536_Sub11(aClass167_Sub2_9350, this, class536_sub19, is), -2052406171);
	}

	public void method1921(int i, int i_13_, int[] is, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, Class175 class175, boolean bool) {
		int i_24_ = is_20_.length;
		int[] is_25_ = new int[i_24_ * 3];
		int[] is_26_ = new int[i_24_ * 3];
		int[] is_27_ = new int[i_24_ * 3];
		int[] is_28_ = is_21_ != null ? new int[i_24_ * 3] : null;
		int[] is_29_ = new int[i_24_ * 3];
		int[] is_30_ = new int[i_24_ * 3];
		int[] is_31_ = is_14_ != null ? new int[i_24_ * 3] : null;
		int[] is_32_ = is_16_ != null ? new int[i_24_ * 3] : null;
		int i_33_ = 0;
		for (int i_34_ = 0; i_34_ < i_24_; i_34_++) {
			int i_35_ = is_17_[i_34_];
			int i_36_ = is_18_[i_34_];
			int i_37_ = is_19_[i_34_];
			is_25_[i_33_] = is[i_35_];
			is_26_[i_33_] = is_15_[i_35_];
			is_27_[i_33_] = is_20_[i_34_];
			is_29_[i_33_] = is_22_[i_34_];
			is_30_[i_33_] = is_23_[i_34_];
			if (is_21_ != null)
				is_28_[i_33_] = is_21_[i_34_];
			if (is_14_ != null)
				is_31_[i_33_] = is_14_[i_35_];
			if (is_16_ != null)
				is_32_[i_33_] = is_16_[i_35_];
			i_33_++;
			is_25_[i_33_] = is[i_36_];
			is_26_[i_33_] = is_15_[i_36_];
			is_27_[i_33_] = is_20_[i_34_];
			is_29_[i_33_] = is_22_[i_34_];
			is_30_[i_33_] = is_23_[i_34_];
			if (is_21_ != null)
				is_28_[i_33_] = is_21_[i_34_];
			if (is_14_ != null)
				is_31_[i_33_] = is_14_[i_36_];
			if (is_16_ != null)
				is_32_[i_33_] = is_16_[i_36_];
			i_33_++;
			is_25_[i_33_] = is[i_37_];
			is_26_[i_33_] = is_15_[i_37_];
			is_27_[i_33_] = is_20_[i_34_];
			is_29_[i_33_] = is_22_[i_34_];
			is_30_[i_33_] = is_23_[i_34_];
			if (is_21_ != null)
				is_28_[i_33_] = is_21_[i_34_];
			if (is_14_ != null)
				is_31_[i_33_] = is_14_[i_37_];
			if (is_16_ != null)
				is_32_[i_33_] = is_16_[i_37_];
			i_33_++;
		}
		method1920(i, i_13_, is_25_, is_31_, is_26_, is_32_, is_27_, is_28_, is_29_, is_30_, class175, bool);
	}

	public boolean method1944(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_38_, int i_39_, int i_40_, boolean bool) {
		if (aClass150_9366 == null || class536_sub18_sub7 == null)
			return false;
		int i_41_ = (i - (i_38_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
		int i_42_ = (i_39_ - (i_38_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
		return aClass150_9366.method1831(class536_sub18_sub7, i_41_, i_42_);
	}

	public void method1923(int i, int i_43_, int i_44_, boolean[][] bools, boolean bool, int i_45_) {
		method8632(i, i_43_, i_44_, bools, bool, i_45_);
	}

	public Class536_Sub18_Sub7 method1928(int i, int i_46_, Class536_Sub18_Sub7 class536_sub18_sub7) {
		if ((aByteArrayArray9365[i][i_46_] & 0x1) == 0)
			return null;
		int i_47_ = anInt1767 * -1504778739 >> aClass167_Sub2_9350.anInt9178;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2_48_;
		if (class536_sub18_sub7_sub2 != null && class536_sub18_sub7_sub2.method11001(i_47_, i_47_)) {
			class536_sub18_sub7_sub2_48_ = class536_sub18_sub7_sub2;
			class536_sub18_sub7_sub2_48_.method11009();
		} else
			class536_sub18_sub7_sub2_48_ = new Class536_Sub18_Sub7_Sub2(aClass167_Sub2_9350, i_47_, i_47_);
		class536_sub18_sub7_sub2_48_.method11000(0, 0, i_47_, i_47_);
		method8631(class536_sub18_sub7_sub2_48_, i, i_46_);
		return class536_sub18_sub7_sub2_48_;
	}

	public void method1939(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, boolean[][] bools) {
		Class183 class183 = aClass167_Sub2_9350.method2278((byte) -62);
		if (anInt9374 > 0 && class183 != null) {
			aClass167_Sub2_9350.method8532();
			aClass167_Sub2_9350.method8563(false);
			aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8566(false);
			aClass167_Sub2_9350.method8599(false);
			aClass167_Sub2_9350.method8567(0);
			aClass167_Sub2_9350.method8553(-2);
			aClass167_Sub2_9350.method8617(null);
			aFloatArray9352[0] = (float) i_50_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2725());
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = (float) i_50_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2726());
			aFloatArray9352[6] = 0.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 0.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = -1.0F - (((float) (i_51_ * i_50_) / 128.0F - (float) (i * 2)) / (float) class183.method2725());
			aFloatArray9352[13] = 1.0F - (((float) (2 * i_49_) + (float) (i_54_ * i_50_) / 128.0F) / (float) class183.method2726());
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			aFloatArray9352[0] = 1.0F;
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = 0.0F;
			aFloatArray9352[6] = 1.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 1.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = 0.0F;
			aFloatArray9352[13] = 0.0F;
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			if ((anInt9375 & 0x7) != 0) {
				aClass167_Sub2_9350.method8611(true);
				aClass167_Sub2_9350.method8539();
			} else
				aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8547(aClass130_9381, aClass130_9372, aClass130_9371, aClass130_9373);
			if ((aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.buffer).length < anInt9356 * 2)
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136 = new Class536_Sub33_Sub1(anInt9356 * 2);
			else
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.off = 0;
			int i_55_ = 0;
			Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136;
			if (aClass167_Sub2_9350.aBool9284) {
				for (int i_56_ = i_52_; i_56_ < i_54_; i_56_++) {
					int i_57_ = i_56_ * (anInt1766 * 1718142487) + i_51_;
					for (int i_58_ = i_51_; i_58_ < i_53_; i_58_++) {
						if (bools[i_58_ - i_51_][i_56_ - i_52_]) {
							short[] is = aShortArrayArray9380[i_57_];
							if (is != null) {
								for (int i_59_ = 0; i_59_ < is.length; i_59_++) {
									class536_sub33_sub1.writeShort(is[i_59_] & 0xffff, -1778059594);
									i_55_++;
								}
							}
						}
						i_57_++;
					}
				}
			} else {
				for (int i_60_ = i_52_; i_60_ < i_54_; i_60_++) {
					int i_61_ = i_60_ * (anInt1766 * 1718142487) + i_51_;
					for (int i_62_ = i_51_; i_62_ < i_53_; i_62_++) {
						if (bools[i_62_ - i_51_][i_60_ - i_52_]) {
							short[] is = aShortArrayArray9380[i_61_];
							if (is != null) {
								for (int i_63_ = 0; i_63_ < is.length; i_63_++) {
									class536_sub33_sub1.writeShortLE((is[i_63_] & 0xffff), 717264918);
									i_55_++;
								}
							}
						}
						i_61_++;
					}
				}
			}
			if (i_55_ > 0) {
				Class122_Sub1 class122_sub1 = new Class122_Sub1(aClass167_Sub2_9350, 5123, class536_sub33_sub1.buffer, (class536_sub33_sub1.off * -810172525));
				aClass167_Sub2_9350.method8511(class122_sub1, 4, 0, i_55_);
			}
		}
	}

	void method8631(Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2, int i, int i_64_) {
		int[] is = anIntArrayArrayArray9361[i][i_64_];
		int[] is_65_ = anIntArrayArrayArray9362[i][i_64_];
		int i_66_ = is.length;
		if (aClass167_Sub2_9350.anIntArray9321.length < i_66_) {
			aClass167_Sub2_9350.anIntArray9321 = new int[i_66_];
			aClass167_Sub2_9350.anIntArray9320 = new int[i_66_];
		}
		int[] is_67_ = aClass167_Sub2_9350.anIntArray9321;
		int[] is_68_ = aClass167_Sub2_9350.anIntArray9320;
		for (int i_69_ = 0; i_69_ < i_66_; i_69_++) {
			is_67_[i_69_] = is[i_69_] >> aClass167_Sub2_9350.anInt9178;
			is_68_[i_69_] = is_65_[i_69_] >> aClass167_Sub2_9350.anInt9178;
		}
		int i_70_ = 0;
		while (i_70_ < i_66_) {
			int i_71_ = is_67_[i_70_];
			int i_72_ = is_68_[i_70_++];
			int i_73_ = is_67_[i_70_];
			int i_74_ = is_68_[i_70_++];
			int i_75_ = is_67_[i_70_];
			int i_76_ = is_68_[i_70_++];
			if ((i_71_ - i_73_) * (i_74_ - i_76_) - (i_74_ - i_72_) * (i_75_ - i_73_) > 0)
				class536_sub18_sub7_sub2.method11002(i_72_, i_74_, i_76_, i_71_, i_73_, i_75_);
		}
	}

	void method8632(int i, int i_77_, int i_78_, boolean[][] bools, boolean bool, int i_79_) {
		if (aClass536Array9368 != null) {
			int i_80_ = i_78_ + i_78_ + 1;
			i_80_ *= i_80_;
			if (aClass167_Sub2_9350.anIntArray9323.length < i_80_)
				aClass167_Sub2_9350.anIntArray9323 = new int[i_80_];
			if ((aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.buffer).length < anInt9356 * 2)
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136 = new Class536_Sub33_Sub1(anInt9356 * 2);
			int i_81_ = i - i_78_;
			int i_82_ = i_81_;
			if (i_81_ < 0)
				i_81_ = 0;
			int i_83_ = i_77_ - i_78_;
			int i_84_ = i_83_;
			if (i_83_ < 0)
				i_83_ = 0;
			int i_85_ = i + i_78_;
			if (i_85_ > anInt1766 * 1718142487 - 1)
				i_85_ = anInt1766 * 1718142487 - 1;
			int i_86_ = i_77_ + i_78_;
			if (i_86_ > anInt1769 * -889224915 - 1)
				i_86_ = anInt1769 * -889224915 - 1;
			int i_87_ = 0;
			int[] is = aClass167_Sub2_9350.anIntArray9323;
			for (int i_88_ = i_81_; i_88_ <= i_85_; i_88_++) {
				boolean[] bools_89_ = bools[i_88_ - i_82_];
				for (int i_90_ = i_83_; i_90_ <= i_86_; i_90_++) {
					if (bools_89_[i_90_ - i_84_])
						is[i_87_++] = i_90_ * (anInt1766 * 1718142487) + i_88_;
				}
			}
			aClass167_Sub2_9350.method8552();
			aClass167_Sub2_9350.method8611((anInt9375 & 0x7) != 0);
			for (int i_91_ = 0; i_91_ < aClass536Array9368.length - 0; i_91_++)
				((Class536_Sub28) aClass536Array9368[i_91_]).method9600(is, i_87_);
			if (!aClass708_9367.method8313(-647226153)) {
				int i_92_ = aClass167_Sub2_9350.anInt9172;
				int i_93_ = aClass167_Sub2_9350.anInt9260;
				aClass167_Sub2_9350.method2107(0, i_93_, aClass167_Sub2_9350.anInt9262);
				aClass167_Sub2_9350.method8611(false);
				aClass167_Sub2_9350.method8599(false);
				aClass167_Sub2_9350.method8567(128);
				aClass167_Sub2_9350.method8553(-2);
				aClass167_Sub2_9350.method8617(aClass167_Sub2_9350.aClass124_Sub1_9142);
				aClass167_Sub2_9350.method8558(8448, 7681);
				aClass167_Sub2_9350.method8520(0, 34166, 770);
				aClass167_Sub2_9350.method8560(0, 34167, 770);
				for (Class536 class536 = aClass708_9367.method8308(1867269829); class536 != null; class536 = aClass708_9367.method8311(1695534607)) {
					Class536_Sub11 class536_sub11 = (Class536_Sub11) class536;
					class536_sub11.method9426(i, i_77_, i_78_, bools);
				}
				aClass167_Sub2_9350.method8520(0, 5890, 768);
				aClass167_Sub2_9350.method8560(0, 5890, 770);
				aClass167_Sub2_9350.method8617(null);
				aClass167_Sub2_9350.method2107(i_92_, i_93_, aClass167_Sub2_9350.anInt9262);
			}
			if (aClass150_9366 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass167_Sub2_9350.method8547(aClass130_9381, null, null, aClass130_9373);
				aClass150_9366.method1834(i, i_77_, i_78_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method1945(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_94_, int i_95_, int i_96_, boolean bool) {
		if (aClass150_9366 != null && class536_sub18_sub7 != null) {
			int i_97_ = (i - (i_94_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
			int i_98_ = (i_95_ - (i_94_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
			aClass150_9366.method1829(class536_sub18_sub7, i_97_, i_98_);
		}
	}

	public void method1932(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_99_, int i_100_, int i_101_, boolean bool) {
		if (aClass150_9366 != null && class536_sub18_sub7 != null) {
			int i_102_ = (i - (i_99_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
			int i_103_ = (i_100_ - (i_99_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
			aClass150_9366.method1827(class536_sub18_sub7, i_102_, i_103_);
		}
	}

	public void method1952(Class536_Sub19 class536_sub19, int[] is) {
		aClass708_9367.method8335(new Class536_Sub11(aClass167_Sub2_9350, this, class536_sub19, is), 511559445);
	}

	public void method1936(int i, int i_104_, int[] is, int[] is_105_, int[] is_106_, int[] is_107_, int[] is_108_, int[] is_109_, int[] is_110_, int[] is_111_, Class175 class175, boolean bool) {
		Class174 class174 = aClass167_Sub2_9350.aClass174_1852;
		if (is_107_ != null && anIntArrayArrayArray9364 == null)
			anIntArrayArrayArray9364 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		if (is_105_ != null && anIntArrayArrayArray9363 == null)
			anIntArrayArrayArray9363 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		anIntArrayArrayArray9361[i][i_104_] = is;
		anIntArrayArrayArray9362[i][i_104_] = is_106_;
		anIntArrayArrayArray9359[i][i_104_] = is_108_;
		anIntArrayArrayArray9360[i][i_104_] = is_109_;
		if (anIntArrayArrayArray9364 != null)
			anIntArrayArrayArray9364[i][i_104_] = is_107_;
		if (anIntArrayArrayArray9363 != null)
			anIntArrayArrayArray9363[i][i_104_] = is_105_;
		Class536_Sub28[] class536_sub28s = (aClass536_Sub28ArrayArrayArray9369[i][i_104_] = new Class536_Sub28[is_108_.length]);
		for (int i_112_ = 0; i_112_ < is_108_.length; i_112_++) {
			int i_113_ = is_110_[i_112_];
			int i_114_ = is_111_[i_112_];
			if ((anInt9375 & 0x20) != 0 && i_113_ != -1 && class174.method2446(i_113_, -41423762).aBool1820) {
				i_114_ = 128;
				i_113_ = -1;
			}
			long l = ((long) (class175.anInt1930 * 1487365757) << 48 | (long) (class175.anInt1934 * 71478565) << 42 | (long) (class175.anInt1932 * 432289019) << 28 | (long) (i_114_ << 14) | (long) i_113_);
			Class536 class536;
			for (class536 = aClass4_9370.method556(l); class536 != null; class536 = aClass4_9370.method557(-1789111970)) {
				Class536_Sub28 class536_sub28 = (Class536_Sub28) class536;
				if (class536_sub28.anInt10545 == i_113_ && class536_sub28.aFloat10543 == (float) i_114_ && class536_sub28.aClass175_10547.method2450(class175, (byte) 127))
					break;
			}
			if (class536 == null) {
				class536_sub28s[i_112_] = new Class536_Sub28(this, i_113_, i_114_, class175);
				aClass4_9370.method560(class536_sub28s[i_112_], l);
			} else
				class536_sub28s[i_112_] = (Class536_Sub28) class536;
		}
		if (bool)
			aByteArrayArray9365[i][i_104_] |= 0x1;
		if (is_108_.length > anInt9354)
			anInt9354 = is_108_.length;
		anInt9374 += is_108_.length;
	}

	public void method1955(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_115_, int i_116_, int i_117_, boolean bool) {
		if (aClass150_9366 != null && class536_sub18_sub7 != null) {
			int i_118_ = (i - (i_115_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
			int i_119_ = (i_116_ - (i_115_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
			aClass150_9366.method1829(class536_sub18_sub7, i_118_, i_119_);
		}
	}

	public void method1919(int i, int i_120_, int[] is, int[] is_121_, int[] is_122_, int[] is_123_, int[] is_124_, int[] is_125_, int[] is_126_, int[] is_127_, int[] is_128_, int[] is_129_, int[] is_130_, Class175 class175, boolean bool) {
		int i_131_ = is_127_.length;
		int[] is_132_ = new int[i_131_ * 3];
		int[] is_133_ = new int[i_131_ * 3];
		int[] is_134_ = new int[i_131_ * 3];
		int[] is_135_ = is_128_ != null ? new int[i_131_ * 3] : null;
		int[] is_136_ = new int[i_131_ * 3];
		int[] is_137_ = new int[i_131_ * 3];
		int[] is_138_ = is_121_ != null ? new int[i_131_ * 3] : null;
		int[] is_139_ = is_123_ != null ? new int[i_131_ * 3] : null;
		int i_140_ = 0;
		for (int i_141_ = 0; i_141_ < i_131_; i_141_++) {
			int i_142_ = is_124_[i_141_];
			int i_143_ = is_125_[i_141_];
			int i_144_ = is_126_[i_141_];
			is_132_[i_140_] = is[i_142_];
			is_133_[i_140_] = is_122_[i_142_];
			is_134_[i_140_] = is_127_[i_141_];
			is_136_[i_140_] = is_129_[i_141_];
			is_137_[i_140_] = is_130_[i_141_];
			if (is_128_ != null)
				is_135_[i_140_] = is_128_[i_141_];
			if (is_121_ != null)
				is_138_[i_140_] = is_121_[i_142_];
			if (is_123_ != null)
				is_139_[i_140_] = is_123_[i_142_];
			i_140_++;
			is_132_[i_140_] = is[i_143_];
			is_133_[i_140_] = is_122_[i_143_];
			is_134_[i_140_] = is_127_[i_141_];
			is_136_[i_140_] = is_129_[i_141_];
			is_137_[i_140_] = is_130_[i_141_];
			if (is_128_ != null)
				is_135_[i_140_] = is_128_[i_141_];
			if (is_121_ != null)
				is_138_[i_140_] = is_121_[i_143_];
			if (is_123_ != null)
				is_139_[i_140_] = is_123_[i_143_];
			i_140_++;
			is_132_[i_140_] = is[i_144_];
			is_133_[i_140_] = is_122_[i_144_];
			is_134_[i_140_] = is_127_[i_141_];
			is_136_[i_140_] = is_129_[i_141_];
			is_137_[i_140_] = is_130_[i_141_];
			if (is_128_ != null)
				is_135_[i_140_] = is_128_[i_141_];
			if (is_121_ != null)
				is_138_[i_140_] = is_121_[i_144_];
			if (is_123_ != null)
				is_139_[i_140_] = is_123_[i_144_];
			i_140_++;
		}
		method1920(i, i_120_, is_132_, is_138_, is_133_, is_139_, is_134_, is_135_, is_136_, is_137_, class175, bool);
	}

	Class160_Sub1(Class167_Sub2 class167_sub2, int i, int i_145_, int i_146_, int i_147_, int[][] is, int[][] is_148_, int i_149_) {
		super(i_146_, i_147_, i_149_, is);
		aClass167_Sub2_9350 = class167_sub2;
		anInt9351 = anInt1768 * 2064238369 - 2;
		anInt9357 = 1 << anInt9351;
		anInt9353 = i;
		anInt9375 = i_145_;
		anIntArrayArrayArray9363 = new int[i_146_][i_147_][];
		aClass536_Sub28ArrayArrayArray9369 = new Class536_Sub28[i_146_][i_147_][];
		anIntArrayArrayArray9361 = new int[i_146_][i_147_][];
		anIntArrayArrayArray9362 = new int[i_146_][i_147_][];
		anIntArrayArrayArray9359 = new int[i_146_][i_147_][];
		anIntArrayArrayArray9360 = new int[i_146_][i_147_][];
		aShortArrayArray9380 = new short[i_146_ * i_147_][];
		aByteArrayArray9365 = new byte[i_146_][i_147_];
		aByteArrayArray9376 = new byte[i_146_ + 1][i_147_ + 1];
		aFloatArrayArray9349 = (new float[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
		aFloatArrayArray9378 = (new float[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
		aFloatArrayArray9379 = (new float[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
		for (int i_150_ = 1; i_150_ < anInt1769 * -889224915; i_150_++) {
			for (int i_151_ = 1; i_151_ < anInt1766 * 1718142487; i_151_++) {
				int i_152_ = (is_148_[i_151_ + 1][i_150_] - is_148_[i_151_ - 1][i_150_]);
				int i_153_ = (is_148_[i_151_][i_150_ + 1] - is_148_[i_151_][i_150_ - 1]);
				float f = (float) (1.0 / Math.sqrt((double) (i_152_ * i_152_ + 4 * i_149_ * i_149_ + i_153_ * i_153_)));
				aFloatArrayArray9349[i_151_][i_150_] = (float) i_152_ * f;
				aFloatArrayArray9378[i_151_][i_150_] = (float) (-i_149_ * 2) * f;
				aFloatArrayArray9379[i_151_][i_150_] = (float) i_153_ * f;
			}
		}
		aClass4_9370 = new Class4(128);
		if ((anInt9375 & 0x10) != 0)
			aClass150_9366 = new Class150(aClass167_Sub2_9350, this);
	}

	public void method1935(int i, int i_154_, int[] is, int[] is_155_, int[] is_156_, int[] is_157_, int[] is_158_, int[] is_159_, int[] is_160_, int[] is_161_, Class175 class175, boolean bool) {
		Class174 class174 = aClass167_Sub2_9350.aClass174_1852;
		if (is_157_ != null && anIntArrayArrayArray9364 == null)
			anIntArrayArrayArray9364 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		if (is_155_ != null && anIntArrayArrayArray9363 == null)
			anIntArrayArrayArray9363 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		anIntArrayArrayArray9361[i][i_154_] = is;
		anIntArrayArrayArray9362[i][i_154_] = is_156_;
		anIntArrayArrayArray9359[i][i_154_] = is_158_;
		anIntArrayArrayArray9360[i][i_154_] = is_159_;
		if (anIntArrayArrayArray9364 != null)
			anIntArrayArrayArray9364[i][i_154_] = is_157_;
		if (anIntArrayArrayArray9363 != null)
			anIntArrayArrayArray9363[i][i_154_] = is_155_;
		Class536_Sub28[] class536_sub28s = (aClass536_Sub28ArrayArrayArray9369[i][i_154_] = new Class536_Sub28[is_158_.length]);
		for (int i_162_ = 0; i_162_ < is_158_.length; i_162_++) {
			int i_163_ = is_160_[i_162_];
			int i_164_ = is_161_[i_162_];
			if ((anInt9375 & 0x20) != 0 && i_163_ != -1 && class174.method2446(i_163_, -1413004370).aBool1820) {
				i_164_ = 128;
				i_163_ = -1;
			}
			long l = ((long) (class175.anInt1930 * 1487365757) << 48 | (long) (class175.anInt1934 * 71478565) << 42 | (long) (class175.anInt1932 * 432289019) << 28 | (long) (i_164_ << 14) | (long) i_163_);
			Class536 class536;
			for (class536 = aClass4_9370.method556(l); class536 != null; class536 = aClass4_9370.method557(-1644915207)) {
				Class536_Sub28 class536_sub28 = (Class536_Sub28) class536;
				if (class536_sub28.anInt10545 == i_163_ && class536_sub28.aFloat10543 == (float) i_164_ && class536_sub28.aClass175_10547.method2450(class175, (byte) 79))
					break;
			}
			if (class536 == null) {
				class536_sub28s[i_162_] = new Class536_Sub28(this, i_163_, i_164_, class175);
				aClass4_9370.method560(class536_sub28s[i_162_], l);
			} else
				class536_sub28s[i_162_] = (Class536_Sub28) class536;
		}
		if (bool)
			aByteArrayArray9365[i][i_154_] |= 0x1;
		if (is_158_.length > anInt9354)
			anInt9354 = is_158_.length;
		anInt9374 += is_158_.length;
	}

	public void method1951(int i, int i_165_, int i_166_, boolean[][] bools, boolean bool, int i_167_) {
		method8632(i, i_165_, i_166_, bools, bool, i_167_);
	}

	public void method1953(int i, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, boolean[][] bools) {
		Class183 class183 = aClass167_Sub2_9350.method2278((byte) -2);
		if (anInt9374 > 0 && class183 != null) {
			aClass167_Sub2_9350.method8532();
			aClass167_Sub2_9350.method8563(false);
			aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8566(false);
			aClass167_Sub2_9350.method8599(false);
			aClass167_Sub2_9350.method8567(0);
			aClass167_Sub2_9350.method8553(-2);
			aClass167_Sub2_9350.method8617(null);
			aFloatArray9352[0] = (float) i_169_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2725());
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = (float) i_169_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2726());
			aFloatArray9352[6] = 0.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 0.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = -1.0F - ((float) (i_170_ * i_169_) / 128.0F - (float) (i * 2)) / (float) class183.method2725();
			aFloatArray9352[13] = 1.0F - (((float) (2 * i_168_) + (float) (i_173_ * i_169_) / 128.0F) / (float) class183.method2726());
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			aFloatArray9352[0] = 1.0F;
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = 0.0F;
			aFloatArray9352[6] = 1.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 1.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = 0.0F;
			aFloatArray9352[13] = 0.0F;
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			if ((anInt9375 & 0x7) != 0) {
				aClass167_Sub2_9350.method8611(true);
				aClass167_Sub2_9350.method8539();
			} else
				aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8547(aClass130_9381, aClass130_9372, aClass130_9371, aClass130_9373);
			if ((aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.buffer).length < anInt9356 * 2)
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136 = new Class536_Sub33_Sub1(anInt9356 * 2);
			else
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.off = 0;
			int i_174_ = 0;
			Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136;
			if (aClass167_Sub2_9350.aBool9284) {
				for (int i_175_ = i_171_; i_175_ < i_173_; i_175_++) {
					int i_176_ = i_175_ * (anInt1766 * 1718142487) + i_170_;
					for (int i_177_ = i_170_; i_177_ < i_172_; i_177_++) {
						if (bools[i_177_ - i_170_][i_175_ - i_171_]) {
							short[] is = aShortArrayArray9380[i_176_];
							if (is != null) {
								for (int i_178_ = 0; i_178_ < is.length; i_178_++) {
									class536_sub33_sub1.writeShort(is[i_178_] & 0xffff, -1778059594);
									i_174_++;
								}
							}
						}
						i_176_++;
					}
				}
			} else {
				for (int i_179_ = i_171_; i_179_ < i_173_; i_179_++) {
					int i_180_ = i_179_ * (anInt1766 * 1718142487) + i_170_;
					for (int i_181_ = i_170_; i_181_ < i_172_; i_181_++) {
						if (bools[i_181_ - i_170_][i_179_ - i_171_]) {
							short[] is = aShortArrayArray9380[i_180_];
							if (is != null) {
								for (int i_182_ = 0; i_182_ < is.length; i_182_++) {
									class536_sub33_sub1.writeShortLE(is[i_182_] & 0xffff, -1465811295);
									i_174_++;
								}
							}
						}
						i_180_++;
					}
				}
			}
			if (i_174_ > 0) {
				Class122_Sub1 class122_sub1 = new Class122_Sub1(aClass167_Sub2_9350, 5123, class536_sub33_sub1.buffer, (class536_sub33_sub1.off * -810172525));
				aClass167_Sub2_9350.method8511(class122_sub1, 4, 0, i_174_);
			}
		}
	}

	public void method1922() {
		if (anInt9374 > 0) {
			byte[][] is = (new byte[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
			for (int i = 1; i < anInt1766 * 1718142487; i++) {
				for (int i_183_ = 1; i_183_ < anInt1769 * -889224915; i_183_++)
					is[i][i_183_] = (byte) ((aByteArrayArray9376[i - 1][i_183_] >> 2) + (aByteArrayArray9376[i + 1][i_183_] >> 3) + (aByteArrayArray9376[i][i_183_ - 1] >> 2) + (aByteArrayArray9376[i][i_183_ + 1] >> 3) + (aByteArrayArray9376[i][i_183_] >> 1));
			}
			aClass536Array9368 = new Class536[aClass4_9370.method569(2043701674)];
			aClass4_9370.method558(aClass536Array9368, 91064407);
			for (int i = 0; i < aClass536Array9368.length; i++)
				((Class536_Sub28) aClass536Array9368[i]).method9596(anInt9374);
			int i = 24;
			if (anIntArrayArrayArray9364 != null)
				i += 4;
			if ((anInt9375 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = aClass167_Sub2_9350.aNativeHeap9180.method1440(anInt9374 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class536_Sub28[] class536_sub28s = new Class536_Sub28[anInt9374];
			int i_184_ = Class72.method1124(anInt9374 / 4, 37144147);
			if (i_184_ < 1)
				i_184_ = 1;
			Class4 class4 = new Class4(i_184_);
			Class536_Sub28[] class536_sub28s_185_ = new Class536_Sub28[anInt9354];
			for (int i_186_ = 0; i_186_ < anInt1766 * 1718142487; i_186_++) {
				for (int i_187_ = 0; i_187_ < anInt1769 * -889224915; i_187_++) {
					if (anIntArrayArrayArray9359[i_186_][i_187_] != null) {
						Class536_Sub28[] class536_sub28s_188_ = (aClass536_Sub28ArrayArrayArray9369[i_186_][i_187_]);
						int[] is_189_ = anIntArrayArrayArray9361[i_186_][i_187_];
						int[] is_190_ = anIntArrayArrayArray9362[i_186_][i_187_];
						int[] is_191_ = anIntArrayArrayArray9360[i_186_][i_187_];
						int[] is_192_ = anIntArrayArrayArray9359[i_186_][i_187_];
						int[] is_193_ = (anIntArrayArrayArray9363 != null ? anIntArrayArrayArray9363[i_186_][i_187_] : null);
						int[] is_194_ = (anIntArrayArrayArray9364 != null ? anIntArrayArrayArray9364[i_186_][i_187_] : null);
						if (is_191_ == null)
							is_191_ = is_192_;
						float f = aFloatArrayArray9349[i_186_][i_187_];
						float f_195_ = aFloatArrayArray9378[i_186_][i_187_];
						float f_196_ = aFloatArrayArray9379[i_186_][i_187_];
						float f_197_ = aFloatArrayArray9349[i_186_][i_187_ + 1];
						float f_198_ = aFloatArrayArray9378[i_186_][i_187_ + 1];
						float f_199_ = aFloatArrayArray9379[i_186_][i_187_ + 1];
						float f_200_ = aFloatArrayArray9349[i_186_ + 1][i_187_ + 1];
						float f_201_ = aFloatArrayArray9378[i_186_ + 1][i_187_ + 1];
						float f_202_ = aFloatArrayArray9379[i_186_ + 1][i_187_ + 1];
						float f_203_ = aFloatArrayArray9349[i_186_ + 1][i_187_];
						float f_204_ = aFloatArrayArray9378[i_186_ + 1][i_187_];
						float f_205_ = aFloatArrayArray9379[i_186_ + 1][i_187_];
						int i_206_ = is[i_186_][i_187_] & 0xff;
						int i_207_ = is[i_186_][i_187_ + 1] & 0xff;
						int i_208_ = is[i_186_ + 1][i_187_ + 1] & 0xff;
						int i_209_ = is[i_186_ + 1][i_187_] & 0xff;
						int i_210_ = 0;
						while_38_: for (int i_211_ = 0; i_211_ < is_192_.length; i_211_++) {
							Class536_Sub28 class536_sub28 = class536_sub28s_188_[i_211_];
							for (int i_212_ = 0; i_212_ < i_210_; i_212_++) {
								if (class536_sub28s_185_[i_212_] == class536_sub28)
									continue while_38_;
							}
							class536_sub28s_185_[i_210_++] = class536_sub28;
						}
						short[] is_213_ = (aShortArrayArray9380[i_187_ * (anInt1766 * 1718142487) + i_186_] = new short[is_192_.length]);
						for (int i_214_ = 0; i_214_ < is_192_.length; i_214_++) {
							int i_215_ = ((i_186_ << anInt1768 * 2064238369) + is_189_[i_214_]);
							int i_216_ = ((i_187_ << anInt1768 * 2064238369) + is_190_[i_214_]);
							int i_217_ = i_215_ >> anInt9351;
							int i_218_ = i_216_ >> anInt9351;
							int i_219_ = is_192_[i_214_];
							int i_220_ = is_191_[i_214_];
							int i_221_ = is_193_ != null ? is_193_[i_214_] : 0;
							long l = ((long) i_220_ << 48 | (long) i_219_ << 32 | (long) (i_217_ << 16) | (long) i_218_);
							int i_222_ = is_189_[i_214_];
							int i_223_ = is_190_[i_214_];
							int i_224_ = 74;
							int i_225_ = 0;
							float f_226_ = 1.0F;
							float f_227_;
							float f_228_;
							float f_229_;
							if (i_222_ == 0 && i_223_ == 0) {
								f_227_ = f;
								f_228_ = f_195_;
								f_229_ = f_196_;
								i_224_ -= i_206_;
							} else if (i_222_ == 0 && i_223_ == anInt1767 * -1504778739) {
								f_227_ = f_197_;
								f_228_ = f_198_;
								f_229_ = f_199_;
								i_224_ -= i_207_;
							} else if (i_222_ == anInt1767 * -1504778739 && i_223_ == anInt1767 * -1504778739) {
								f_227_ = f_200_;
								f_228_ = f_201_;
								f_229_ = f_202_;
								i_224_ -= i_208_;
							} else if (i_222_ == anInt1767 * -1504778739 && i_223_ == 0) {
								f_227_ = f_203_;
								f_228_ = f_204_;
								f_229_ = f_205_;
								i_224_ -= i_209_;
							} else {
								float f_230_ = ((float) i_222_ / (float) (anInt1767 * -1504778739));
								float f_231_ = ((float) i_223_ / (float) (anInt1767 * -1504778739));
								float f_232_ = f + (f_203_ - f) * f_230_;
								float f_233_ = f_195_ + (f_204_ - f_195_) * f_230_;
								float f_234_ = f_196_ + (f_205_ - f_196_) * f_230_;
								float f_235_ = f_197_ + (f_200_ - f_197_) * f_230_;
								float f_236_ = f_198_ + (f_201_ - f_198_) * f_230_;
								float f_237_ = f_199_ + (f_202_ - f_199_) * f_230_;
								f_227_ = f_232_ + (f_235_ - f_232_) * f_231_;
								f_228_ = f_233_ + (f_236_ - f_233_) * f_231_;
								f_229_ = f_234_ + (f_237_ - f_234_) * f_231_;
								int i_238_ = i_206_ + ((i_209_ - i_206_) * i_222_ >> anInt1768 * 2064238369);
								int i_239_ = i_207_ + ((i_208_ - i_207_) * i_222_ >> anInt1768 * 2064238369);
								i_224_ -= i_238_ + ((i_239_ - i_238_) * i_223_ >> anInt1768 * 2064238369);
							}
							if (i_219_ != -1) {
								int i_240_ = (i_219_ & 0x7f) * i_224_ >> 7;
								if (i_240_ < 2)
									i_240_ = 2;
								else if (i_240_ > 126)
									i_240_ = 126;
								i_225_ = (ColourUtils.anIntArray8309[i_219_ & 0xff80 | i_240_]);
								if ((anInt9375 & 0x7) == 0) {
									f_226_ = ((aClass167_Sub2_9350.aFloatArray9181[0]) * f_227_ + (aClass167_Sub2_9350.aFloatArray9181[1]) * f_228_ + (aClass167_Sub2_9350.aFloatArray9181[2]) * f_229_);
									f_226_ = (aClass167_Sub2_9350.aFloat9250 + f_226_ * (f_226_ > 0.0F ? (aClass167_Sub2_9350.aFloat9251) : (aClass167_Sub2_9350.aFloat9252)));
								}
							}
							Class536 class536 = null;
							if ((i_215_ & anInt9357 - 1) == 0 && (i_216_ & anInt9357 - 1) == 0)
								class536 = class4.method556(l);
							int i_241_;
							if (class536 == null) {
								int i_242_;
								if (i_220_ != i_219_) {
									int i_243_ = (i_220_ & 0x7f) * i_224_ >> 7;
									if (i_243_ < 2)
										i_243_ = 2;
									else if (i_243_ > 126)
										i_243_ = 126;
									i_242_ = (ColourUtils.anIntArray8309[i_220_ & 0xff80 | i_243_]);
									if ((anInt9375 & 0x7) == 0) {
										float f_244_ = ((aClass167_Sub2_9350.aFloatArray9181[0]) * f_227_ + (aClass167_Sub2_9350.aFloatArray9181[1]) * f_228_ + ((aClass167_Sub2_9350.aFloatArray9181[2]) * f_229_));
										f_244_ = (aClass167_Sub2_9350.aFloat9250 + (f_226_ * (f_226_ > 0.0F ? (aClass167_Sub2_9350.aFloat9251) : (aClass167_Sub2_9350.aFloat9252))));
										int i_245_ = i_242_ >> 16 & 0xff;
										int i_246_ = i_242_ >> 8 & 0xff;
										int i_247_ = i_242_ & 0xff;
										i_245_ *= f_244_;
										if (i_245_ < 0)
											i_245_ = 0;
										else if (i_245_ > 255)
											i_245_ = 255;
										i_246_ *= f_244_;
										if (i_246_ < 0)
											i_246_ = 0;
										else if (i_246_ > 255)
											i_246_ = 255;
										i_247_ *= f_244_;
										if (i_247_ < 0)
											i_247_ = 0;
										else if (i_247_ > 255)
											i_247_ = 255;
										i_242_ = (i_245_ << 16 | i_246_ << 8 | i_247_);
									}
								} else
									i_242_ = i_225_;
								if (aClass167_Sub2_9350.aBool9284) {
									stream.method1273((float) i_215_);
									stream.method1273((float) (method1925(i_215_, i_216_, (byte) 43) + i_221_));
									stream.method1273((float) i_216_);
									stream.method1272((byte) (i_242_ >> 16));
									stream.method1272((byte) (i_242_ >> 8));
									stream.method1272((byte) i_242_);
									stream.method1272(-1);
									stream.method1273((float) i_215_);
									stream.method1273((float) i_216_);
									if (anIntArrayArrayArray9364 != null)
										stream.method1273(is_194_ != null ? (float) ((is_194_[i_214_]) - 1) : 0.0F);
									if ((anInt9375 & 0x7) != 0) {
										stream.method1273(f_227_);
										stream.method1273(f_228_);
										stream.method1273(f_229_);
									}
								} else {
									stream.method1274((float) i_215_);
									stream.method1274((float) (method1925(i_215_, i_216_, (byte) 10) + i_221_));
									stream.method1274((float) i_216_);
									stream.method1272((byte) (i_242_ >> 16));
									stream.method1272((byte) (i_242_ >> 8));
									stream.method1272((byte) i_242_);
									stream.method1272(-1);
									stream.method1274((float) i_215_);
									stream.method1274((float) i_216_);
									if (anIntArrayArrayArray9364 != null)
										stream.method1274(is_194_ != null ? (float) ((is_194_[i_214_]) - 1) : 0.0F);
									if ((anInt9375 & 0x7) != 0) {
										stream.method1274(f_227_);
										stream.method1274(f_228_);
										stream.method1274(f_229_);
									}
								}
								i_241_ = anInt9355++;
								is_213_[i_214_] = (short) i_241_;
								if (i_219_ != -1)
									class536_sub28s[i_241_] = class536_sub28s_188_[i_214_];
								class4.method560(new Class536_Sub20(is_213_[i_214_]), l);
							} else {
								is_213_[i_214_] = ((Class536_Sub20) class536).aShort10520;
								i_241_ = is_213_[i_214_] & 0xffff;
								if (i_219_ != -1 && ((class536_sub28s_188_[i_214_].aLong7133 * -6909195213925454795L) < (class536_sub28s[i_241_].aLong7133 * -6909195213925454795L)))
									class536_sub28s[i_241_] = class536_sub28s_188_[i_214_];
							}
							for (int i_248_ = 0; i_248_ < i_210_; i_248_++)
								class536_sub28s_185_[i_248_].method9607(i_241_, i_225_, i_224_, f_226_);
							anInt9356++;
						}
					}
				}
			}
			for (int i_249_ = 0; i_249_ < anInt9355; i_249_++) {
				Class536_Sub28 class536_sub28 = class536_sub28s[i_249_];
				if (class536_sub28 != null)
					class536_sub28.method9597(i_249_);
			}
			for (int i_250_ = 0; i_250_ < anInt1766 * 1718142487; i_250_++) {
				for (int i_251_ = 0; i_251_ < anInt1769 * -889224915; i_251_++) {
					short[] is_252_ = (aShortArrayArray9380[i_251_ * (anInt1766 * 1718142487) + i_250_]);
					if (is_252_ != null) {
						int i_253_ = 0;
						int i_254_ = 0;
						while (i_254_ < is_252_.length) {
							int i_255_ = is_252_[i_254_++] & 0xffff;
							int i_256_ = is_252_[i_254_++] & 0xffff;
							int i_257_ = is_252_[i_254_++] & 0xffff;
							Class536_Sub28 class536_sub28 = class536_sub28s[i_255_];
							Class536_Sub28 class536_sub28_258_ = class536_sub28s[i_256_];
							Class536_Sub28 class536_sub28_259_ = class536_sub28s[i_257_];
							Class536_Sub28 class536_sub28_260_ = null;
							if (class536_sub28 != null) {
								class536_sub28.method9598(i_250_, i_251_, i_253_);
								class536_sub28_260_ = class536_sub28;
							}
							if (class536_sub28_258_ != null) {
								class536_sub28_258_.method9598(i_250_, i_251_, i_253_);
								if (class536_sub28_260_ == null || ((class536_sub28_258_.aLong7133 * -6909195213925454795L) < (class536_sub28_260_.aLong7133 * -6909195213925454795L)))
									class536_sub28_260_ = class536_sub28_258_;
							}
							if (class536_sub28_259_ != null) {
								class536_sub28_259_.method9598(i_250_, i_251_, i_253_);
								if (class536_sub28_260_ == null || ((class536_sub28_259_.aLong7133 * -6909195213925454795L) < (class536_sub28_260_.aLong7133 * -6909195213925454795L)))
									class536_sub28_260_ = class536_sub28_259_;
							}
							if (class536_sub28_260_ != null) {
								if (class536_sub28 != null)
									class536_sub28_260_.method9597(i_255_);
								if (class536_sub28_258_ != null)
									class536_sub28_260_.method9597(i_256_);
								if (class536_sub28_259_ != null)
									class536_sub28_260_.method9597(i_257_);
								class536_sub28_260_.method9598(i_250_, i_251_, i_253_);
							}
							i_253_++;
						}
					}
				}
			}
			stream.method1275();
			anInterface15_9348 = aClass167_Sub2_9350.method8545(i, nativeheapbuffer, stream.method1270(), false);
			if (anInterface15_9348 instanceof Class127_Sub1)
				nativeheapbuffer.method1248();
			aClass130_9381 = new Class130(anInterface15_9348, 5126, 3, 0);
			aClass130_9371 = new Class130(anInterface15_9348, 5121, 4, 12);
			int i_261_;
			if (anIntArrayArrayArray9364 != null) {
				aClass130_9373 = new Class130(anInterface15_9348, 5126, 3, 16);
				i_261_ = 28;
			} else {
				aClass130_9373 = new Class130(anInterface15_9348, 5126, 2, 16);
				i_261_ = 24;
			}
			if ((anInt9375 & 0x7) != 0)
				aClass130_9372 = new Class130(anInterface15_9348, 5126, 3, i_261_);
			long[] ls = new long[aClass536Array9368.length];
			for (int i_262_ = 0; i_262_ < aClass536Array9368.length; i_262_++) {
				Class536_Sub28 class536_sub28 = (Class536_Sub28) aClass536Array9368[i_262_];
				ls[i_262_] = class536_sub28.aLong7133 * -6909195213925454795L;
				class536_sub28.method9599(anInt9355);
			}
			Class507.method6172(ls, aClass536Array9368, 357809437);
			if (aClass150_9366 != null)
				aClass150_9366.method1826();
		} else
			aClass150_9366 = null;
		if ((anInt9353 & 0x2) == 0) {
			anIntArrayArrayArray9362 = null;
			anIntArrayArrayArray9361 = null;
			anIntArrayArrayArray9359 = null;
		}
		anIntArrayArrayArray9364 = null;
		anIntArrayArrayArray9360 = null;
		anIntArrayArrayArray9363 = null;
		aClass536_Sub28ArrayArrayArray9369 = null;
		aByteArrayArray9376 = null;
		aClass4_9370 = null;
		aFloatArrayArray9379 = null;
		aFloatArrayArray9378 = null;
		aFloatArrayArray9349 = null;
	}

	public void method1940(int i, int i_263_, int i_264_, int i_265_, int i_266_, int i_267_, int i_268_, boolean[][] bools) {
		Class183 class183 = aClass167_Sub2_9350.method2278((byte) 103);
		if (anInt9374 > 0 && class183 != null) {
			aClass167_Sub2_9350.method8532();
			aClass167_Sub2_9350.method8563(false);
			aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8566(false);
			aClass167_Sub2_9350.method8599(false);
			aClass167_Sub2_9350.method8567(0);
			aClass167_Sub2_9350.method8553(-2);
			aClass167_Sub2_9350.method8617(null);
			aFloatArray9352[0] = (float) i_264_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2725());
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = (float) i_264_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2726());
			aFloatArray9352[6] = 0.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 0.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = -1.0F - ((float) (i_265_ * i_264_) / 128.0F - (float) (i * 2)) / (float) class183.method2725();
			aFloatArray9352[13] = 1.0F - (((float) (2 * i_263_) + (float) (i_268_ * i_264_) / 128.0F) / (float) class183.method2726());
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			aFloatArray9352[0] = 1.0F;
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = 0.0F;
			aFloatArray9352[6] = 1.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 1.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = 0.0F;
			aFloatArray9352[13] = 0.0F;
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			if ((anInt9375 & 0x7) != 0) {
				aClass167_Sub2_9350.method8611(true);
				aClass167_Sub2_9350.method8539();
			} else
				aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8547(aClass130_9381, aClass130_9372, aClass130_9371, aClass130_9373);
			if ((aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.buffer).length < anInt9356 * 2)
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136 = new Class536_Sub33_Sub1(anInt9356 * 2);
			else
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.off = 0;
			int i_269_ = 0;
			Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136;
			if (aClass167_Sub2_9350.aBool9284) {
				for (int i_270_ = i_266_; i_270_ < i_268_; i_270_++) {
					int i_271_ = i_270_ * (anInt1766 * 1718142487) + i_265_;
					for (int i_272_ = i_265_; i_272_ < i_267_; i_272_++) {
						if (bools[i_272_ - i_265_][i_270_ - i_266_]) {
							short[] is = aShortArrayArray9380[i_271_];
							if (is != null) {
								for (int i_273_ = 0; i_273_ < is.length; i_273_++) {
									class536_sub33_sub1.writeShort(is[i_273_] & 0xffff, -1778059594);
									i_269_++;
								}
							}
						}
						i_271_++;
					}
				}
			} else {
				for (int i_274_ = i_266_; i_274_ < i_268_; i_274_++) {
					int i_275_ = i_274_ * (anInt1766 * 1718142487) + i_265_;
					for (int i_276_ = i_265_; i_276_ < i_267_; i_276_++) {
						if (bools[i_276_ - i_265_][i_274_ - i_266_]) {
							short[] is = aShortArrayArray9380[i_275_];
							if (is != null) {
								for (int i_277_ = 0; i_277_ < is.length; i_277_++) {
									class536_sub33_sub1.writeShortLE((is[i_277_] & 0xffff), 1422671174);
									i_269_++;
								}
							}
						}
						i_275_++;
					}
				}
			}
			if (i_269_ > 0) {
				Class122_Sub1 class122_sub1 = new Class122_Sub1(aClass167_Sub2_9350, 5123, class536_sub33_sub1.buffer, (class536_sub33_sub1.off * -810172525));
				aClass167_Sub2_9350.method8511(class122_sub1, 4, 0, i_269_);
			}
		}
	}

	public Class536_Sub18_Sub7 method1941(int i, int i_278_, Class536_Sub18_Sub7 class536_sub18_sub7) {
		if ((aByteArrayArray9365[i][i_278_] & 0x1) == 0)
			return null;
		int i_279_ = anInt1767 * -1504778739 >> aClass167_Sub2_9350.anInt9178;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2_280_;
		if (class536_sub18_sub7_sub2 != null && class536_sub18_sub7_sub2.method11001(i_279_, i_279_)) {
			class536_sub18_sub7_sub2_280_ = class536_sub18_sub7_sub2;
			class536_sub18_sub7_sub2_280_.method11009();
		} else
			class536_sub18_sub7_sub2_280_ = new Class536_Sub18_Sub7_Sub2(aClass167_Sub2_9350, i_279_, i_279_);
		class536_sub18_sub7_sub2_280_.method11000(0, 0, i_279_, i_279_);
		method8631(class536_sub18_sub7_sub2_280_, i, i_278_);
		return class536_sub18_sub7_sub2_280_;
	}

	public void method1937() {
		if (anInt9374 > 0) {
			byte[][] is = (new byte[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
			for (int i = 1; i < anInt1766 * 1718142487; i++) {
				for (int i_281_ = 1; i_281_ < anInt1769 * -889224915; i_281_++)
					is[i][i_281_] = (byte) ((aByteArrayArray9376[i - 1][i_281_] >> 2) + (aByteArrayArray9376[i + 1][i_281_] >> 3) + (aByteArrayArray9376[i][i_281_ - 1] >> 2) + (aByteArrayArray9376[i][i_281_ + 1] >> 3) + (aByteArrayArray9376[i][i_281_] >> 1));
			}
			aClass536Array9368 = new Class536[aClass4_9370.method569(1549426459)];
			aClass4_9370.method558(aClass536Array9368, 1160053867);
			for (int i = 0; i < aClass536Array9368.length; i++)
				((Class536_Sub28) aClass536Array9368[i]).method9596(anInt9374);
			int i = 24;
			if (anIntArrayArrayArray9364 != null)
				i += 4;
			if ((anInt9375 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = aClass167_Sub2_9350.aNativeHeap9180.method1440(anInt9374 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class536_Sub28[] class536_sub28s = new Class536_Sub28[anInt9374];
			int i_282_ = Class72.method1124(anInt9374 / 4, 1949528908);
			if (i_282_ < 1)
				i_282_ = 1;
			Class4 class4 = new Class4(i_282_);
			Class536_Sub28[] class536_sub28s_283_ = new Class536_Sub28[anInt9354];
			for (int i_284_ = 0; i_284_ < anInt1766 * 1718142487; i_284_++) {
				for (int i_285_ = 0; i_285_ < anInt1769 * -889224915; i_285_++) {
					if (anIntArrayArrayArray9359[i_284_][i_285_] != null) {
						Class536_Sub28[] class536_sub28s_286_ = (aClass536_Sub28ArrayArrayArray9369[i_284_][i_285_]);
						int[] is_287_ = anIntArrayArrayArray9361[i_284_][i_285_];
						int[] is_288_ = anIntArrayArrayArray9362[i_284_][i_285_];
						int[] is_289_ = anIntArrayArrayArray9360[i_284_][i_285_];
						int[] is_290_ = anIntArrayArrayArray9359[i_284_][i_285_];
						int[] is_291_ = (anIntArrayArrayArray9363 != null ? anIntArrayArrayArray9363[i_284_][i_285_] : null);
						int[] is_292_ = (anIntArrayArrayArray9364 != null ? anIntArrayArrayArray9364[i_284_][i_285_] : null);
						if (is_289_ == null)
							is_289_ = is_290_;
						float f = aFloatArrayArray9349[i_284_][i_285_];
						float f_293_ = aFloatArrayArray9378[i_284_][i_285_];
						float f_294_ = aFloatArrayArray9379[i_284_][i_285_];
						float f_295_ = aFloatArrayArray9349[i_284_][i_285_ + 1];
						float f_296_ = aFloatArrayArray9378[i_284_][i_285_ + 1];
						float f_297_ = aFloatArrayArray9379[i_284_][i_285_ + 1];
						float f_298_ = aFloatArrayArray9349[i_284_ + 1][i_285_ + 1];
						float f_299_ = aFloatArrayArray9378[i_284_ + 1][i_285_ + 1];
						float f_300_ = aFloatArrayArray9379[i_284_ + 1][i_285_ + 1];
						float f_301_ = aFloatArrayArray9349[i_284_ + 1][i_285_];
						float f_302_ = aFloatArrayArray9378[i_284_ + 1][i_285_];
						float f_303_ = aFloatArrayArray9379[i_284_ + 1][i_285_];
						int i_304_ = is[i_284_][i_285_] & 0xff;
						int i_305_ = is[i_284_][i_285_ + 1] & 0xff;
						int i_306_ = is[i_284_ + 1][i_285_ + 1] & 0xff;
						int i_307_ = is[i_284_ + 1][i_285_] & 0xff;
						int i_308_ = 0;
						while_40_: for (int i_309_ = 0; i_309_ < is_290_.length; i_309_++) {
							Class536_Sub28 class536_sub28 = class536_sub28s_286_[i_309_];
							for (int i_310_ = 0; i_310_ < i_308_; i_310_++) {
								if (class536_sub28s_283_[i_310_] == class536_sub28)
									continue while_40_;
							}
							class536_sub28s_283_[i_308_++] = class536_sub28;
						}
						short[] is_311_ = (aShortArrayArray9380[i_285_ * (anInt1766 * 1718142487) + i_284_] = new short[is_290_.length]);
						for (int i_312_ = 0; i_312_ < is_290_.length; i_312_++) {
							int i_313_ = ((i_284_ << anInt1768 * 2064238369) + is_287_[i_312_]);
							int i_314_ = ((i_285_ << anInt1768 * 2064238369) + is_288_[i_312_]);
							int i_315_ = i_313_ >> anInt9351;
							int i_316_ = i_314_ >> anInt9351;
							int i_317_ = is_290_[i_312_];
							int i_318_ = is_289_[i_312_];
							int i_319_ = is_291_ != null ? is_291_[i_312_] : 0;
							long l = ((long) i_318_ << 48 | (long) i_317_ << 32 | (long) (i_315_ << 16) | (long) i_316_);
							int i_320_ = is_287_[i_312_];
							int i_321_ = is_288_[i_312_];
							int i_322_ = 74;
							int i_323_ = 0;
							float f_324_ = 1.0F;
							float f_325_;
							float f_326_;
							float f_327_;
							if (i_320_ == 0 && i_321_ == 0) {
								f_325_ = f;
								f_326_ = f_293_;
								f_327_ = f_294_;
								i_322_ -= i_304_;
							} else if (i_320_ == 0 && i_321_ == anInt1767 * -1504778739) {
								f_325_ = f_295_;
								f_326_ = f_296_;
								f_327_ = f_297_;
								i_322_ -= i_305_;
							} else if (i_320_ == anInt1767 * -1504778739 && i_321_ == anInt1767 * -1504778739) {
								f_325_ = f_298_;
								f_326_ = f_299_;
								f_327_ = f_300_;
								i_322_ -= i_306_;
							} else if (i_320_ == anInt1767 * -1504778739 && i_321_ == 0) {
								f_325_ = f_301_;
								f_326_ = f_302_;
								f_327_ = f_303_;
								i_322_ -= i_307_;
							} else {
								float f_328_ = ((float) i_320_ / (float) (anInt1767 * -1504778739));
								float f_329_ = ((float) i_321_ / (float) (anInt1767 * -1504778739));
								float f_330_ = f + (f_301_ - f) * f_328_;
								float f_331_ = f_293_ + (f_302_ - f_293_) * f_328_;
								float f_332_ = f_294_ + (f_303_ - f_294_) * f_328_;
								float f_333_ = f_295_ + (f_298_ - f_295_) * f_328_;
								float f_334_ = f_296_ + (f_299_ - f_296_) * f_328_;
								float f_335_ = f_297_ + (f_300_ - f_297_) * f_328_;
								f_325_ = f_330_ + (f_333_ - f_330_) * f_329_;
								f_326_ = f_331_ + (f_334_ - f_331_) * f_329_;
								f_327_ = f_332_ + (f_335_ - f_332_) * f_329_;
								int i_336_ = i_304_ + ((i_307_ - i_304_) * i_320_ >> anInt1768 * 2064238369);
								int i_337_ = i_305_ + ((i_306_ - i_305_) * i_320_ >> anInt1768 * 2064238369);
								i_322_ -= i_336_ + ((i_337_ - i_336_) * i_321_ >> anInt1768 * 2064238369);
							}
							if (i_317_ != -1) {
								int i_338_ = (i_317_ & 0x7f) * i_322_ >> 7;
								if (i_338_ < 2)
									i_338_ = 2;
								else if (i_338_ > 126)
									i_338_ = 126;
								i_323_ = (ColourUtils.anIntArray8309[i_317_ & 0xff80 | i_338_]);
								if ((anInt9375 & 0x7) == 0) {
									f_324_ = ((aClass167_Sub2_9350.aFloatArray9181[0]) * f_325_ + (aClass167_Sub2_9350.aFloatArray9181[1]) * f_326_ + (aClass167_Sub2_9350.aFloatArray9181[2]) * f_327_);
									f_324_ = (aClass167_Sub2_9350.aFloat9250 + f_324_ * (f_324_ > 0.0F ? (aClass167_Sub2_9350.aFloat9251) : (aClass167_Sub2_9350.aFloat9252)));
								}
							}
							Class536 class536 = null;
							if ((i_313_ & anInt9357 - 1) == 0 && (i_314_ & anInt9357 - 1) == 0)
								class536 = class4.method556(l);
							int i_339_;
							if (class536 == null) {
								int i_340_;
								if (i_318_ != i_317_) {
									int i_341_ = (i_318_ & 0x7f) * i_322_ >> 7;
									if (i_341_ < 2)
										i_341_ = 2;
									else if (i_341_ > 126)
										i_341_ = 126;
									i_340_ = (ColourUtils.anIntArray8309[i_318_ & 0xff80 | i_341_]);
									if ((anInt9375 & 0x7) == 0) {
										float f_342_ = ((aClass167_Sub2_9350.aFloatArray9181[0]) * f_325_ + (aClass167_Sub2_9350.aFloatArray9181[1]) * f_326_ + ((aClass167_Sub2_9350.aFloatArray9181[2]) * f_327_));
										f_342_ = (aClass167_Sub2_9350.aFloat9250 + (f_324_ * (f_324_ > 0.0F ? (aClass167_Sub2_9350.aFloat9251) : (aClass167_Sub2_9350.aFloat9252))));
										int i_343_ = i_340_ >> 16 & 0xff;
										int i_344_ = i_340_ >> 8 & 0xff;
										int i_345_ = i_340_ & 0xff;
										i_343_ *= f_342_;
										if (i_343_ < 0)
											i_343_ = 0;
										else if (i_343_ > 255)
											i_343_ = 255;
										i_344_ *= f_342_;
										if (i_344_ < 0)
											i_344_ = 0;
										else if (i_344_ > 255)
											i_344_ = 255;
										i_345_ *= f_342_;
										if (i_345_ < 0)
											i_345_ = 0;
										else if (i_345_ > 255)
											i_345_ = 255;
										i_340_ = (i_343_ << 16 | i_344_ << 8 | i_345_);
									}
								} else
									i_340_ = i_323_;
								if (aClass167_Sub2_9350.aBool9284) {
									stream.method1273((float) i_313_);
									stream.method1273((float) (method1925(i_313_, i_314_, (byte) -28) + i_319_));
									stream.method1273((float) i_314_);
									stream.method1272((byte) (i_340_ >> 16));
									stream.method1272((byte) (i_340_ >> 8));
									stream.method1272((byte) i_340_);
									stream.method1272(-1);
									stream.method1273((float) i_313_);
									stream.method1273((float) i_314_);
									if (anIntArrayArrayArray9364 != null)
										stream.method1273(is_292_ != null ? (float) ((is_292_[i_312_]) - 1) : 0.0F);
									if ((anInt9375 & 0x7) != 0) {
										stream.method1273(f_325_);
										stream.method1273(f_326_);
										stream.method1273(f_327_);
									}
								} else {
									stream.method1274((float) i_313_);
									stream.method1274((float) (method1925(i_313_, i_314_, (byte) 22) + i_319_));
									stream.method1274((float) i_314_);
									stream.method1272((byte) (i_340_ >> 16));
									stream.method1272((byte) (i_340_ >> 8));
									stream.method1272((byte) i_340_);
									stream.method1272(-1);
									stream.method1274((float) i_313_);
									stream.method1274((float) i_314_);
									if (anIntArrayArrayArray9364 != null)
										stream.method1274(is_292_ != null ? (float) ((is_292_[i_312_]) - 1) : 0.0F);
									if ((anInt9375 & 0x7) != 0) {
										stream.method1274(f_325_);
										stream.method1274(f_326_);
										stream.method1274(f_327_);
									}
								}
								i_339_ = anInt9355++;
								is_311_[i_312_] = (short) i_339_;
								if (i_317_ != -1)
									class536_sub28s[i_339_] = class536_sub28s_286_[i_312_];
								class4.method560(new Class536_Sub20(is_311_[i_312_]), l);
							} else {
								is_311_[i_312_] = ((Class536_Sub20) class536).aShort10520;
								i_339_ = is_311_[i_312_] & 0xffff;
								if (i_317_ != -1 && ((class536_sub28s_286_[i_312_].aLong7133 * -6909195213925454795L) < (class536_sub28s[i_339_].aLong7133 * -6909195213925454795L)))
									class536_sub28s[i_339_] = class536_sub28s_286_[i_312_];
							}
							for (int i_346_ = 0; i_346_ < i_308_; i_346_++)
								class536_sub28s_283_[i_346_].method9607(i_339_, i_323_, i_322_, f_324_);
							anInt9356++;
						}
					}
				}
			}
			for (int i_347_ = 0; i_347_ < anInt9355; i_347_++) {
				Class536_Sub28 class536_sub28 = class536_sub28s[i_347_];
				if (class536_sub28 != null)
					class536_sub28.method9597(i_347_);
			}
			for (int i_348_ = 0; i_348_ < anInt1766 * 1718142487; i_348_++) {
				for (int i_349_ = 0; i_349_ < anInt1769 * -889224915; i_349_++) {
					short[] is_350_ = (aShortArrayArray9380[i_349_ * (anInt1766 * 1718142487) + i_348_]);
					if (is_350_ != null) {
						int i_351_ = 0;
						int i_352_ = 0;
						while (i_352_ < is_350_.length) {
							int i_353_ = is_350_[i_352_++] & 0xffff;
							int i_354_ = is_350_[i_352_++] & 0xffff;
							int i_355_ = is_350_[i_352_++] & 0xffff;
							Class536_Sub28 class536_sub28 = class536_sub28s[i_353_];
							Class536_Sub28 class536_sub28_356_ = class536_sub28s[i_354_];
							Class536_Sub28 class536_sub28_357_ = class536_sub28s[i_355_];
							Class536_Sub28 class536_sub28_358_ = null;
							if (class536_sub28 != null) {
								class536_sub28.method9598(i_348_, i_349_, i_351_);
								class536_sub28_358_ = class536_sub28;
							}
							if (class536_sub28_356_ != null) {
								class536_sub28_356_.method9598(i_348_, i_349_, i_351_);
								if (class536_sub28_358_ == null || ((class536_sub28_356_.aLong7133 * -6909195213925454795L) < (class536_sub28_358_.aLong7133 * -6909195213925454795L)))
									class536_sub28_358_ = class536_sub28_356_;
							}
							if (class536_sub28_357_ != null) {
								class536_sub28_357_.method9598(i_348_, i_349_, i_351_);
								if (class536_sub28_358_ == null || ((class536_sub28_357_.aLong7133 * -6909195213925454795L) < (class536_sub28_358_.aLong7133 * -6909195213925454795L)))
									class536_sub28_358_ = class536_sub28_357_;
							}
							if (class536_sub28_358_ != null) {
								if (class536_sub28 != null)
									class536_sub28_358_.method9597(i_353_);
								if (class536_sub28_356_ != null)
									class536_sub28_358_.method9597(i_354_);
								if (class536_sub28_357_ != null)
									class536_sub28_358_.method9597(i_355_);
								class536_sub28_358_.method9598(i_348_, i_349_, i_351_);
							}
							i_351_++;
						}
					}
				}
			}
			stream.method1275();
			anInterface15_9348 = aClass167_Sub2_9350.method8545(i, nativeheapbuffer, stream.method1270(), false);
			if (anInterface15_9348 instanceof Class127_Sub1)
				nativeheapbuffer.method1248();
			aClass130_9381 = new Class130(anInterface15_9348, 5126, 3, 0);
			aClass130_9371 = new Class130(anInterface15_9348, 5121, 4, 12);
			int i_359_;
			if (anIntArrayArrayArray9364 != null) {
				aClass130_9373 = new Class130(anInterface15_9348, 5126, 3, 16);
				i_359_ = 28;
			} else {
				aClass130_9373 = new Class130(anInterface15_9348, 5126, 2, 16);
				i_359_ = 24;
			}
			if ((anInt9375 & 0x7) != 0)
				aClass130_9372 = new Class130(anInterface15_9348, 5126, 3, i_359_);
			long[] ls = new long[aClass536Array9368.length];
			for (int i_360_ = 0; i_360_ < aClass536Array9368.length; i_360_++) {
				Class536_Sub28 class536_sub28 = (Class536_Sub28) aClass536Array9368[i_360_];
				ls[i_360_] = class536_sub28.aLong7133 * -6909195213925454795L;
				class536_sub28.method9599(anInt9355);
			}
			Class507.method6172(ls, aClass536Array9368, -1969282644);
			if (aClass150_9366 != null)
				aClass150_9366.method1826();
		} else
			aClass150_9366 = null;
		if ((anInt9353 & 0x2) == 0) {
			anIntArrayArrayArray9362 = null;
			anIntArrayArrayArray9361 = null;
			anIntArrayArrayArray9359 = null;
		}
		anIntArrayArrayArray9364 = null;
		anIntArrayArrayArray9360 = null;
		anIntArrayArrayArray9363 = null;
		aClass536_Sub28ArrayArrayArray9369 = null;
		aByteArrayArray9376 = null;
		aClass4_9370 = null;
		aFloatArrayArray9379 = null;
		aFloatArrayArray9378 = null;
		aFloatArrayArray9349 = null;
	}

	public void method1942(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_361_, int i_362_, int i_363_, boolean bool) {
		if (aClass150_9366 != null && class536_sub18_sub7 != null) {
			int i_364_ = (i - (i_361_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
			int i_365_ = (i_362_ - (i_361_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
			aClass150_9366.method1829(class536_sub18_sub7, i_364_, i_365_);
		}
	}

	public void method1929(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_366_, int i_367_, int i_368_, boolean bool) {
		if (aClass150_9366 != null && class536_sub18_sub7 != null) {
			int i_369_ = (i - (i_366_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
			int i_370_ = (i_367_ - (i_366_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
			aClass150_9366.method1829(class536_sub18_sub7, i_369_, i_370_);
		}
	}

	public void method1943(int i, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, int i_376_, boolean[][] bools) {
		Class183 class183 = aClass167_Sub2_9350.method2278((byte) 11);
		if (anInt9374 > 0 && class183 != null) {
			aClass167_Sub2_9350.method8532();
			aClass167_Sub2_9350.method8563(false);
			aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8566(false);
			aClass167_Sub2_9350.method8599(false);
			aClass167_Sub2_9350.method8567(0);
			aClass167_Sub2_9350.method8553(-2);
			aClass167_Sub2_9350.method8617(null);
			aFloatArray9352[0] = (float) i_372_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2725());
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = (float) i_372_ / (128.0F * (float) (anInt1767 * -1504778739) * (float) class183.method2726());
			aFloatArray9352[6] = 0.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 0.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = -1.0F - ((float) (i_373_ * i_372_) / 128.0F - (float) (i * 2)) / (float) class183.method2725();
			aFloatArray9352[13] = 1.0F - (((float) (2 * i_371_) + (float) (i_376_ * i_372_) / 128.0F) / (float) class183.method2726());
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			aFloatArray9352[0] = 1.0F;
			aFloatArray9352[1] = 0.0F;
			aFloatArray9352[2] = 0.0F;
			aFloatArray9352[3] = 0.0F;
			aFloatArray9352[4] = 0.0F;
			aFloatArray9352[5] = 0.0F;
			aFloatArray9352[6] = 1.0F;
			aFloatArray9352[7] = 0.0F;
			aFloatArray9352[8] = 0.0F;
			aFloatArray9352[9] = 1.0F;
			aFloatArray9352[10] = 0.0F;
			aFloatArray9352[11] = 0.0F;
			aFloatArray9352[12] = 0.0F;
			aFloatArray9352[13] = 0.0F;
			aFloatArray9352[14] = 0.0F;
			aFloatArray9352[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9352, 0);
			if ((anInt9375 & 0x7) != 0) {
				aClass167_Sub2_9350.method8611(true);
				aClass167_Sub2_9350.method8539();
			} else
				aClass167_Sub2_9350.method8611(false);
			aClass167_Sub2_9350.method8547(aClass130_9381, aClass130_9372, aClass130_9371, aClass130_9373);
			if ((aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.buffer).length < anInt9356 * 2)
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136 = new Class536_Sub33_Sub1(anInt9356 * 2);
			else
				aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136.off = 0;
			int i_377_ = 0;
			Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_9350.aClass536_Sub33_Sub1_9136;
			if (aClass167_Sub2_9350.aBool9284) {
				for (int i_378_ = i_374_; i_378_ < i_376_; i_378_++) {
					int i_379_ = i_378_ * (anInt1766 * 1718142487) + i_373_;
					for (int i_380_ = i_373_; i_380_ < i_375_; i_380_++) {
						if (bools[i_380_ - i_373_][i_378_ - i_374_]) {
							short[] is = aShortArrayArray9380[i_379_];
							if (is != null) {
								for (int i_381_ = 0; i_381_ < is.length; i_381_++) {
									class536_sub33_sub1.writeShort(is[i_381_] & 0xffff, -1778059594);
									i_377_++;
								}
							}
						}
						i_379_++;
					}
				}
			} else {
				for (int i_382_ = i_374_; i_382_ < i_376_; i_382_++) {
					int i_383_ = i_382_ * (anInt1766 * 1718142487) + i_373_;
					for (int i_384_ = i_373_; i_384_ < i_375_; i_384_++) {
						if (bools[i_384_ - i_373_][i_382_ - i_374_]) {
							short[] is = aShortArrayArray9380[i_383_];
							if (is != null) {
								for (int i_385_ = 0; i_385_ < is.length; i_385_++) {
									class536_sub33_sub1.writeShortLE((is[i_385_] & 0xffff), -632238877);
									i_377_++;
								}
							}
						}
						i_383_++;
					}
				}
			}
			if (i_377_ > 0) {
				Class122_Sub1 class122_sub1 = new Class122_Sub1(aClass167_Sub2_9350, 5123, class536_sub33_sub1.buffer, (class536_sub33_sub1.off * -810172525));
				aClass167_Sub2_9350.method8511(class122_sub1, 4, 0, i_377_);
			}
		}
	}

	public boolean method1924(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_386_, int i_387_, int i_388_, boolean bool) {
		if (aClass150_9366 == null || class536_sub18_sub7 == null)
			return false;
		int i_389_ = (i - (i_386_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
		int i_390_ = (i_387_ - (i_386_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
		return aClass150_9366.method1831(class536_sub18_sub7, i_389_, i_390_);
	}

	public boolean method1946(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_391_, int i_392_, int i_393_, boolean bool) {
		if (aClass150_9366 == null || class536_sub18_sub7 == null)
			return false;
		int i_394_ = (i - (i_391_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
		int i_395_ = (i_392_ - (i_391_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
		return aClass150_9366.method1831(class536_sub18_sub7, i_394_, i_395_);
	}

	public boolean method1947(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_396_, int i_397_, int i_398_, boolean bool) {
		if (aClass150_9366 == null || class536_sub18_sub7 == null)
			return false;
		int i_399_ = (i - (i_396_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
		int i_400_ = (i_397_ - (i_396_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
		return aClass150_9366.method1831(class536_sub18_sub7, i_399_, i_400_);
	}

	public boolean method1948(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_401_, int i_402_, int i_403_, boolean bool) {
		if (aClass150_9366 == null || class536_sub18_sub7 == null)
			return false;
		int i_404_ = (i - (i_401_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
		int i_405_ = (i_402_ - (i_401_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
		return aClass150_9366.method1831(class536_sub18_sub7, i_404_, i_405_);
	}

	public void method1931(int i, int i_406_, int[] is, int[] is_407_, int[] is_408_, int[] is_409_, int[] is_410_, int[] is_411_, int[] is_412_, int[] is_413_, int[] is_414_, int[] is_415_, int[] is_416_, Class175 class175, boolean bool) {
		int i_417_ = is_413_.length;
		int[] is_418_ = new int[i_417_ * 3];
		int[] is_419_ = new int[i_417_ * 3];
		int[] is_420_ = new int[i_417_ * 3];
		int[] is_421_ = is_414_ != null ? new int[i_417_ * 3] : null;
		int[] is_422_ = new int[i_417_ * 3];
		int[] is_423_ = new int[i_417_ * 3];
		int[] is_424_ = is_407_ != null ? new int[i_417_ * 3] : null;
		int[] is_425_ = is_409_ != null ? new int[i_417_ * 3] : null;
		int i_426_ = 0;
		for (int i_427_ = 0; i_427_ < i_417_; i_427_++) {
			int i_428_ = is_410_[i_427_];
			int i_429_ = is_411_[i_427_];
			int i_430_ = is_412_[i_427_];
			is_418_[i_426_] = is[i_428_];
			is_419_[i_426_] = is_408_[i_428_];
			is_420_[i_426_] = is_413_[i_427_];
			is_422_[i_426_] = is_415_[i_427_];
			is_423_[i_426_] = is_416_[i_427_];
			if (is_414_ != null)
				is_421_[i_426_] = is_414_[i_427_];
			if (is_407_ != null)
				is_424_[i_426_] = is_407_[i_428_];
			if (is_409_ != null)
				is_425_[i_426_] = is_409_[i_428_];
			i_426_++;
			is_418_[i_426_] = is[i_429_];
			is_419_[i_426_] = is_408_[i_429_];
			is_420_[i_426_] = is_413_[i_427_];
			is_422_[i_426_] = is_415_[i_427_];
			is_423_[i_426_] = is_416_[i_427_];
			if (is_414_ != null)
				is_421_[i_426_] = is_414_[i_427_];
			if (is_407_ != null)
				is_424_[i_426_] = is_407_[i_429_];
			if (is_409_ != null)
				is_425_[i_426_] = is_409_[i_429_];
			i_426_++;
			is_418_[i_426_] = is[i_430_];
			is_419_[i_426_] = is_408_[i_430_];
			is_420_[i_426_] = is_413_[i_427_];
			is_422_[i_426_] = is_415_[i_427_];
			is_423_[i_426_] = is_416_[i_427_];
			if (is_414_ != null)
				is_421_[i_426_] = is_414_[i_427_];
			if (is_407_ != null)
				is_424_[i_426_] = is_407_[i_430_];
			if (is_409_ != null)
				is_425_[i_426_] = is_409_[i_430_];
			i_426_++;
		}
		method1920(i, i_406_, is_418_, is_424_, is_419_, is_425_, is_420_, is_421_, is_422_, is_423_, class175, bool);
	}

	public void method1938(int i, int i_431_, int i_432_) {
		i = Math.min(aByteArrayArray9376.length - 1, Math.max(0, i));
		i_431_ = Math.min(aByteArrayArray9376[i].length - 1, Math.max(0, i_431_));
		if ((aByteArrayArray9376[i][i_431_] & 0xff) < i_432_)
			aByteArrayArray9376[i][i_431_] = (byte) i_432_;
	}

	public boolean method1930(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_433_, int i_434_, int i_435_, boolean bool) {
		if (aClass150_9366 == null || class536_sub18_sub7 == null)
			return false;
		int i_436_ = (i - (i_433_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
		int i_437_ = (i_434_ - (i_433_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
		return aClass150_9366.method1831(class536_sub18_sub7, i_436_, i_437_);
	}

	public void method1949(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_438_, int i_439_, int i_440_, boolean bool) {
		if (aClass150_9366 != null && class536_sub18_sub7 != null) {
			int i_441_ = (i - (i_438_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
			int i_442_ = (i_439_ - (i_438_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
			aClass150_9366.method1827(class536_sub18_sub7, i_441_, i_442_);
		}
	}

	public void method1934(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_443_, int i_444_, int i_445_, boolean bool) {
		if (aClass150_9366 != null && class536_sub18_sub7 != null) {
			int i_446_ = (i - (i_443_ * aClass167_Sub2_9350.anInt9332 >> 8) >> aClass167_Sub2_9350.anInt9178);
			int i_447_ = (i_444_ - (i_443_ * aClass167_Sub2_9350.anInt9257 >> 8) >> aClass167_Sub2_9350.anInt9178);
			aClass150_9366.method1827(class536_sub18_sub7, i_446_, i_447_);
		}
	}
}

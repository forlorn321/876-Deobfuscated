/* Class161_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class161_Sub2 extends Class161 {
	int anInt9260;
	short[][] aShortArrayArray9261;
	Class180_Sub3 aClass180_Sub3_9262;
	int anInt9263;
	float[][] aFloatArrayArray9264;
	int[][][] anIntArrayArrayArray9265;
	static float[] aFloatArray9266 = new float[16];
	int anInt9267;
	int anInt9268;
	Class527_Sub14[][][] aClass527_Sub14ArrayArrayArray9269;
	int anInt9270;
	int[][][] anIntArrayArrayArray9271;
	int[][][] anIntArrayArrayArray9272;
	byte[][] aByteArrayArray9273;
	static final int anInt9274 = 1;
	int[][][] anIntArrayArrayArray9275;
	int[][][] anIntArrayArrayArray9276;
	Interface15 anInterface15_9277;
	Class141 aClass141_9278;
	static final int anInt9279 = 74;
	Class527[] aClass527Array9280;
	Class129 aClass129_9281;
	Class129 aClass129_9282;
	Class129 aClass129_9283;
	Class129 aClass129_9284;
	Class694 aClass694_9285 = new Class694();
	int anInt9286;
	int anInt9287;
	byte[][] aByteArrayArray9288;
	int anInt9289;
	float[][] aFloatArrayArray9290;
	float[][] aFloatArrayArray9291;
	Class14 aClass14_9292;
	int[][][] anIntArrayArrayArray9293;

	public void method2622(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool, int i_2_) {
		method14740(i, i_0_, i_1_, bools, bool, i_2_);
	}

	public void method2587(int i, int i_3_, int i_4_) {
		i = Math.min(aByteArrayArray9288.length - 1, Math.max(0, i));
		i_3_ = Math.min(aByteArrayArray9288[i].length - 1, Math.max(0, i_3_));
		if ((aByteArrayArray9288[i][i_3_] & 0xff) < i_4_)
			aByteArrayArray9288[i][i_3_] = (byte) i_4_;
	}

	public void method2601(Class527_Sub16 class527_sub16, int[] is) {
		aClass694_9285.method14147(new Class527_Sub9(aClass180_Sub3_9262, this, class527_sub16, is), -1045609933);
	}

	public void method2589(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, Class178 class178, boolean bool) {
		int i_16_ = is_12_.length;
		int[] is_17_ = new int[i_16_ * 3];
		int[] is_18_ = new int[i_16_ * 3];
		int[] is_19_ = new int[i_16_ * 3];
		int[] is_20_ = is_13_ != null ? new int[i_16_ * 3] : null;
		int[] is_21_ = new int[i_16_ * 3];
		int[] is_22_ = new int[i_16_ * 3];
		int[] is_23_ = is_6_ != null ? new int[i_16_ * 3] : null;
		int[] is_24_ = is_8_ != null ? new int[i_16_ * 3] : null;
		int i_25_ = 0;
		for (int i_26_ = 0; i_26_ < i_16_; i_26_++) {
			int i_27_ = is_9_[i_26_];
			int i_28_ = is_10_[i_26_];
			int i_29_ = is_11_[i_26_];
			is_17_[i_25_] = is[i_27_];
			is_18_[i_25_] = is_7_[i_27_];
			is_19_[i_25_] = is_12_[i_26_];
			is_21_[i_25_] = is_14_[i_26_];
			is_22_[i_25_] = is_15_[i_26_];
			if (is_13_ != null)
				is_20_[i_25_] = is_13_[i_26_];
			if (is_6_ != null)
				is_23_[i_25_] = is_6_[i_27_];
			if (is_8_ != null)
				is_24_[i_25_] = is_8_[i_27_];
			i_25_++;
			is_17_[i_25_] = is[i_28_];
			is_18_[i_25_] = is_7_[i_28_];
			is_19_[i_25_] = is_12_[i_26_];
			is_21_[i_25_] = is_14_[i_26_];
			is_22_[i_25_] = is_15_[i_26_];
			if (is_13_ != null)
				is_20_[i_25_] = is_13_[i_26_];
			if (is_6_ != null)
				is_23_[i_25_] = is_6_[i_28_];
			if (is_8_ != null)
				is_24_[i_25_] = is_8_[i_28_];
			i_25_++;
			is_17_[i_25_] = is[i_29_];
			is_18_[i_25_] = is_7_[i_29_];
			is_19_[i_25_] = is_12_[i_26_];
			is_21_[i_25_] = is_14_[i_26_];
			is_22_[i_25_] = is_15_[i_26_];
			if (is_13_ != null)
				is_20_[i_25_] = is_13_[i_26_];
			if (is_6_ != null)
				is_23_[i_25_] = is_6_[i_29_];
			if (is_8_ != null)
				is_24_[i_25_] = is_8_[i_29_];
			i_25_++;
		}
		method2604(i, i_5_, is_17_, is_23_, is_18_, is_24_, is_19_, is_20_, is_21_, is_22_, class178, bool);
	}

	public void method2608(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, boolean[][] bools) {
		Class171 class171 = aClass180_Sub3_9262.method3285(1312622284);
		if (anInt9286 > 0 && class171 != null) {
			aClass180_Sub3_9262.method15371();
			aClass180_Sub3_9262.method15408(false);
			aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15411(false);
			aClass180_Sub3_9262.method15412(false);
			aClass180_Sub3_9262.method15525(0);
			aClass180_Sub3_9262.method15397(-2);
			aClass180_Sub3_9262.method15401(null);
			aFloatArray9266[0] = (float) i_31_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2728());
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = (float) i_31_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2729());
			aFloatArray9266[6] = 0.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 0.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = -1.0F - (((float) (i_32_ * i_31_) / 128.0F - (float) (i * 2)) / (float) class171.method2728());
			aFloatArray9266[13] = 1.0F - (((float) (2 * i_30_) + (float) (i_35_ * i_31_) / 128.0F) / (float) class171.method2729());
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			aFloatArray9266[0] = 1.0F;
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = 0.0F;
			aFloatArray9266[6] = 1.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 1.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = 0.0F;
			aFloatArray9266[13] = 0.0F;
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			if ((anInt9270 & 0x7) != 0) {
				aClass180_Sub3_9262.method15409(true);
				aClass180_Sub3_9262.method15381();
			} else
				aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15385(aClass129_9282, aClass129_9284, aClass129_9283, aClass129_9281);
			if ((aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.buffer).length < anInt9268 * 2)
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1(anInt9268 * 2);
			else
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
			int i_36_ = 0;
			Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819;
			if (aClass180_Sub3_9262.aBool9788) {
				for (int i_37_ = i_33_; i_37_ < i_35_; i_37_++) {
					int i_38_ = i_37_ * (anInt1750 * 1210322533) + i_32_;
					for (int i_39_ = i_32_; i_39_ < i_34_; i_39_++) {
						if (bools[i_39_ - i_32_][i_37_ - i_33_]) {
							short[] is = aShortArrayArray9261[i_38_];
							if (is != null) {
								for (int i_40_ = 0; i_40_ < is.length; i_40_++) {
									class527_sub38_sub1.writeShort(is[i_40_] & 0xffff, 1404835786);
									i_36_++;
								}
							}
						}
						i_38_++;
					}
				}
			} else {
				for (int i_41_ = i_33_; i_41_ < i_35_; i_41_++) {
					int i_42_ = i_41_ * (anInt1750 * 1210322533) + i_32_;
					for (int i_43_ = i_32_; i_43_ < i_34_; i_43_++) {
						if (bools[i_43_ - i_32_][i_41_ - i_33_]) {
							short[] is = aShortArrayArray9261[i_42_];
							if (is != null) {
								for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
									class527_sub38_sub1.writeShortLE(is[i_44_] & 0xffff, -1407846203);
									i_36_++;
								}
							}
						}
						i_42_++;
					}
				}
			}
			if (i_36_ > 0) {
				Class131_Sub1 class131_sub1 = new Class131_Sub1(aClass180_Sub3_9262, 5123, class527_sub38_sub1.buffer, (class527_sub38_sub1.anInt10689 * -441238943));
				aClass180_Sub3_9262.method15433(class131_sub1, 4, 0, i_36_);
			}
		}
	}

	public void method2591(int i, int i_45_, int i_46_, boolean[][] bools, boolean bool, int i_47_) {
		method14740(i, i_45_, i_46_, bools, bool, i_47_);
	}

	void method14740(int i, int i_48_, int i_49_, boolean[][] bools, boolean bool, int i_50_) {
		if (aClass527Array9280 != null) {
			int i_51_ = i_49_ + i_49_ + 1;
			i_51_ *= i_51_;
			if (aClass180_Sub3_9262.anIntArray9816.length < i_51_)
				aClass180_Sub3_9262.anIntArray9816 = new int[i_51_];
			if ((aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.buffer).length < anInt9268 * 2)
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1(anInt9268 * 2);
			int i_52_ = i - i_49_;
			int i_53_ = i_52_;
			if (i_52_ < 0)
				i_52_ = 0;
			int i_54_ = i_48_ - i_49_;
			int i_55_ = i_54_;
			if (i_54_ < 0)
				i_54_ = 0;
			int i_56_ = i + i_49_;
			if (i_56_ > anInt1750 * 1210322533 - 1)
				i_56_ = anInt1750 * 1210322533 - 1;
			int i_57_ = i_48_ + i_49_;
			if (i_57_ > anInt1751 * -533476177 - 1)
				i_57_ = anInt1751 * -533476177 - 1;
			int i_58_ = 0;
			int[] is = aClass180_Sub3_9262.anIntArray9816;
			for (int i_59_ = i_52_; i_59_ <= i_56_; i_59_++) {
				boolean[] bools_60_ = bools[i_59_ - i_53_];
				for (int i_61_ = i_54_; i_61_ <= i_57_; i_61_++) {
					if (bools_60_[i_61_ - i_55_])
						is[i_58_++] = i_61_ * (anInt1750 * 1210322533) + i_59_;
				}
			}
			aClass180_Sub3_9262.method15396();
			aClass180_Sub3_9262.method15409((anInt9270 & 0x7) != 0);
			for (int i_62_ = 0; i_62_ < aClass527Array9280.length - 0; i_62_++)
				((Class527_Sub14) aClass527Array9280[i_62_]).method16107(is, i_58_);
			if (!aClass694_9285.method14088(230783078)) {
				int i_63_ = aClass180_Sub3_9262.anInt9809;
				int i_64_ = aClass180_Sub3_9262.anInt9789;
				aClass180_Sub3_9262.method3187(0, i_64_, aClass180_Sub3_9262.anInt9790);
				aClass180_Sub3_9262.method15409(false);
				aClass180_Sub3_9262.method15412(false);
				aClass180_Sub3_9262.method15525(128);
				aClass180_Sub3_9262.method15397(-2);
				aClass180_Sub3_9262.method15401(aClass180_Sub3_9262.aClass118_Sub3_9807);
				aClass180_Sub3_9262.method15403(8448, 7681);
				aClass180_Sub3_9262.method15404(0, 34166, 770);
				aClass180_Sub3_9262.method15405(0, 34167, 770);
				for (Class527 class527 = aClass694_9285.method14081((short) 14142); class527 != null; class527 = aClass694_9285.method14086(-65534)) {
					Class527_Sub9 class527_sub9 = (Class527_Sub9) class527;
					class527_sub9.method16067(i, i_48_, i_49_, bools);
				}
				aClass180_Sub3_9262.method15404(0, 5890, 768);
				aClass180_Sub3_9262.method15405(0, 5890, 770);
				aClass180_Sub3_9262.method15401(null);
				aClass180_Sub3_9262.method3187(i_63_, i_64_, aClass180_Sub3_9262.anInt9790);
			}
			if (aClass141_9278 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass180_Sub3_9262.method15385(aClass129_9282, null, null, aClass129_9281);
				aClass141_9278.method2347(i, i_48_, i_49_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method2594(int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, boolean[][] bools) {
		Class171 class171 = aClass180_Sub3_9262.method3285(621275533);
		if (anInt9286 > 0 && class171 != null) {
			aClass180_Sub3_9262.method15371();
			aClass180_Sub3_9262.method15408(false);
			aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15411(false);
			aClass180_Sub3_9262.method15412(false);
			aClass180_Sub3_9262.method15525(0);
			aClass180_Sub3_9262.method15397(-2);
			aClass180_Sub3_9262.method15401(null);
			aFloatArray9266[0] = (float) i_66_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2728());
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = (float) i_66_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2729());
			aFloatArray9266[6] = 0.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 0.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = -1.0F - (((float) (i_67_ * i_66_) / 128.0F - (float) (i * 2)) / (float) class171.method2728());
			aFloatArray9266[13] = 1.0F - (((float) (2 * i_65_) + (float) (i_70_ * i_66_) / 128.0F) / (float) class171.method2729());
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			aFloatArray9266[0] = 1.0F;
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = 0.0F;
			aFloatArray9266[6] = 1.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 1.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = 0.0F;
			aFloatArray9266[13] = 0.0F;
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			if ((anInt9270 & 0x7) != 0) {
				aClass180_Sub3_9262.method15409(true);
				aClass180_Sub3_9262.method15381();
			} else
				aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15385(aClass129_9282, aClass129_9284, aClass129_9283, aClass129_9281);
			if ((aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.buffer).length < anInt9268 * 2)
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1(anInt9268 * 2);
			else
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
			int i_71_ = 0;
			Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819;
			if (aClass180_Sub3_9262.aBool9788) {
				for (int i_72_ = i_68_; i_72_ < i_70_; i_72_++) {
					int i_73_ = i_72_ * (anInt1750 * 1210322533) + i_67_;
					for (int i_74_ = i_67_; i_74_ < i_69_; i_74_++) {
						if (bools[i_74_ - i_67_][i_72_ - i_68_]) {
							short[] is = aShortArrayArray9261[i_73_];
							if (is != null) {
								for (int i_75_ = 0; i_75_ < is.length; i_75_++) {
									class527_sub38_sub1.writeShort(is[i_75_] & 0xffff, 1404835786);
									i_71_++;
								}
							}
						}
						i_73_++;
					}
				}
			} else {
				for (int i_76_ = i_68_; i_76_ < i_70_; i_76_++) {
					int i_77_ = i_76_ * (anInt1750 * 1210322533) + i_67_;
					for (int i_78_ = i_67_; i_78_ < i_69_; i_78_++) {
						if (bools[i_78_ - i_67_][i_76_ - i_68_]) {
							short[] is = aShortArrayArray9261[i_77_];
							if (is != null) {
								for (int i_79_ = 0; i_79_ < is.length; i_79_++) {
									class527_sub38_sub1.writeShortLE(is[i_79_] & 0xffff, -1612421744);
									i_71_++;
								}
							}
						}
						i_77_++;
					}
				}
			}
			if (i_71_ > 0) {
				Class131_Sub1 class131_sub1 = new Class131_Sub1(aClass180_Sub3_9262, 5123, class527_sub38_sub1.buffer, (class527_sub38_sub1.anInt10689 * -441238943));
				aClass180_Sub3_9262.method15433(class131_sub1, 4, 0, i_71_);
			}
		}
	}

	public void method2606(int i, int i_80_, int[] is, int[] is_81_, int[] is_82_, int[] is_83_, int[] is_84_, int[] is_85_, int[] is_86_, int[] is_87_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub3_9262.aClass181_2059;
		if (is_83_ != null && anIntArrayArrayArray9276 == null)
			anIntArrayArrayArray9276 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_81_ != null && anIntArrayArrayArray9275 == null)
			anIntArrayArrayArray9275 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9293[i][i_80_] = is;
		anIntArrayArrayArray9265[i][i_80_] = is_82_;
		anIntArrayArrayArray9271[i][i_80_] = is_84_;
		anIntArrayArrayArray9272[i][i_80_] = is_85_;
		if (anIntArrayArrayArray9276 != null)
			anIntArrayArrayArray9276[i][i_80_] = is_83_;
		if (anIntArrayArrayArray9275 != null)
			anIntArrayArrayArray9275[i][i_80_] = is_81_;
		Class527_Sub14[] class527_sub14s = (aClass527_Sub14ArrayArrayArray9269[i][i_80_] = new Class527_Sub14[is_84_.length]);
		for (int i_88_ = 0; i_88_ < is_84_.length; i_88_++) {
			int i_89_ = is_86_[i_88_];
			int i_90_ = is_87_[i_88_];
			if ((anInt9270 & 0x20) != 0 && i_89_ != -1 && class181.method3544(i_89_, (byte) -90).aBool1806) {
				i_90_ = 128;
				i_89_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_90_ << 14) | (long) i_89_);
			Class527 class527;
			for (class527 = aClass14_9292.method709(l); class527 != null; class527 = aClass14_9292.method715(411100443)) {
				Class527_Sub14 class527_sub14 = (Class527_Sub14) class527;
				if (class527_sub14.anInt10449 == i_89_ && class527_sub14.aFloat10454 == (float) i_90_ && class527_sub14.aClass178_10450.method3059(class178, (byte) 39))
					break;
			}
			if (class527 == null) {
				class527_sub14s[i_88_] = new Class527_Sub14(this, i_89_, i_90_, class178);
				aClass14_9292.method714(class527_sub14s[i_88_], l);
			} else
				class527_sub14s[i_88_] = (Class527_Sub14) class527;
		}
		if (bool)
			aByteArrayArray9273[i][i_80_] |= 0x1;
		if (is_84_.length > anInt9287)
			anInt9287 = is_84_.length;
		anInt9286 += is_84_.length;
	}

	void method14741(Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1, int i, int i_91_) {
		int[] is = anIntArrayArrayArray9293[i][i_91_];
		int[] is_92_ = anIntArrayArrayArray9265[i][i_91_];
		int i_93_ = is.length;
		if (aClass180_Sub3_9262.anIntArray9838.length < i_93_) {
			aClass180_Sub3_9262.anIntArray9838 = new int[i_93_];
			aClass180_Sub3_9262.anIntArray9851 = new int[i_93_];
		}
		int[] is_94_ = aClass180_Sub3_9262.anIntArray9838;
		int[] is_95_ = aClass180_Sub3_9262.anIntArray9851;
		for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
			is_94_[i_96_] = is[i_96_] >> aClass180_Sub3_9262.anInt9850;
			is_95_[i_96_] = is_92_[i_96_] >> aClass180_Sub3_9262.anInt9850;
		}
		int i_97_ = 0;
		while (i_97_ < i_93_) {
			int i_98_ = is_94_[i_97_];
			int i_99_ = is_95_[i_97_++];
			int i_100_ = is_94_[i_97_];
			int i_101_ = is_95_[i_97_++];
			int i_102_ = is_94_[i_97_];
			int i_103_ = is_95_[i_97_++];
			if (((i_98_ - i_100_) * (i_101_ - i_103_) - (i_101_ - i_99_) * (i_102_ - i_100_)) > 0)
				class527_sub8_sub8_sub1.method18707(i_99_, i_101_, i_103_, i_98_, i_100_, i_102_);
		}
	}

	public boolean method2598(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_104_, int i_105_, int i_106_, boolean bool) {
		if (aClass141_9278 == null || class527_sub8_sub8 == null)
			return false;
		int i_107_ = (i - (i_104_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
		int i_108_ = (i_105_ - (i_104_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
		return aClass141_9278.method2348(class527_sub8_sub8, i_107_, i_108_);
	}

	public void method2633(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_109_, int i_110_, int i_111_, boolean bool) {
		if (aClass141_9278 != null && class527_sub8_sub8 != null) {
			int i_112_ = (i - (i_109_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
			int i_113_ = (i_110_ - (i_109_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
			aClass141_9278.method2362(class527_sub8_sub8, i_112_, i_113_);
		}
	}

	public void method2631(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_114_, int i_115_, int i_116_, boolean bool) {
		if (aClass141_9278 != null && class527_sub8_sub8 != null) {
			int i_117_ = (i - (i_114_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
			int i_118_ = (i_115_ - (i_114_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
			aClass141_9278.method2346(class527_sub8_sub8, i_117_, i_118_);
		}
	}

	public void method2615(Class527_Sub16 class527_sub16, int[] is) {
		aClass694_9285.method14147(new Class527_Sub9(aClass180_Sub3_9262, this, class527_sub16, is), -655328002);
	}

	public void method2588() {
		if (anInt9286 > 0) {
			byte[][] is = (new byte[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
			for (int i = 1; i < anInt1750 * 1210322533; i++) {
				for (int i_119_ = 1; i_119_ < anInt1751 * -533476177; i_119_++)
					is[i][i_119_] = (byte) ((aByteArrayArray9288[i - 1][i_119_] >> 2) + (aByteArrayArray9288[i + 1][i_119_] >> 3) + (aByteArrayArray9288[i][i_119_ - 1] >> 2) + (aByteArrayArray9288[i][i_119_ + 1] >> 3) + (aByteArrayArray9288[i][i_119_] >> 1));
			}
			aClass527Array9280 = new Class527[aClass14_9292.method711(94278967)];
			aClass14_9292.method708(aClass527Array9280, 1918528271);
			for (int i = 0; i < aClass527Array9280.length; i++)
				((Class527_Sub14) aClass527Array9280[i]).method16102(anInt9286);
			int i = 24;
			if (anIntArrayArrayArray9276 != null)
				i += 4;
			if ((anInt9270 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = aClass180_Sub3_9262.aNativeHeap9667.method1940(anInt9286 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class527_Sub14[] class527_sub14s = new Class527_Sub14[anInt9286];
			int i_120_ = Class203.method3783(anInt9286 / 4, 1063010826);
			if (i_120_ < 1)
				i_120_ = 1;
			Class14 class14 = new Class14(i_120_);
			Class527_Sub14[] class527_sub14s_121_ = new Class527_Sub14[anInt9287];
			for (int i_122_ = 0; i_122_ < anInt1750 * 1210322533; i_122_++) {
				for (int i_123_ = 0; i_123_ < anInt1751 * -533476177; i_123_++) {
					if (anIntArrayArrayArray9271[i_122_][i_123_] != null) {
						Class527_Sub14[] class527_sub14s_124_ = (aClass527_Sub14ArrayArrayArray9269[i_122_][i_123_]);
						int[] is_125_ = anIntArrayArrayArray9293[i_122_][i_123_];
						int[] is_126_ = anIntArrayArrayArray9265[i_122_][i_123_];
						int[] is_127_ = anIntArrayArrayArray9272[i_122_][i_123_];
						int[] is_128_ = anIntArrayArrayArray9271[i_122_][i_123_];
						int[] is_129_ = (anIntArrayArrayArray9275 != null ? anIntArrayArrayArray9275[i_122_][i_123_] : null);
						int[] is_130_ = (anIntArrayArrayArray9276 != null ? anIntArrayArrayArray9276[i_122_][i_123_] : null);
						if (is_127_ == null)
							is_127_ = is_128_;
						float f = aFloatArrayArray9264[i_122_][i_123_];
						float f_131_ = aFloatArrayArray9290[i_122_][i_123_];
						float f_132_ = aFloatArrayArray9291[i_122_][i_123_];
						float f_133_ = aFloatArrayArray9264[i_122_][i_123_ + 1];
						float f_134_ = aFloatArrayArray9290[i_122_][i_123_ + 1];
						float f_135_ = aFloatArrayArray9291[i_122_][i_123_ + 1];
						float f_136_ = aFloatArrayArray9264[i_122_ + 1][i_123_ + 1];
						float f_137_ = aFloatArrayArray9290[i_122_ + 1][i_123_ + 1];
						float f_138_ = aFloatArrayArray9291[i_122_ + 1][i_123_ + 1];
						float f_139_ = aFloatArrayArray9264[i_122_ + 1][i_123_];
						float f_140_ = aFloatArrayArray9290[i_122_ + 1][i_123_];
						float f_141_ = aFloatArrayArray9291[i_122_ + 1][i_123_];
						int i_142_ = is[i_122_][i_123_] & 0xff;
						int i_143_ = is[i_122_][i_123_ + 1] & 0xff;
						int i_144_ = is[i_122_ + 1][i_123_ + 1] & 0xff;
						int i_145_ = is[i_122_ + 1][i_123_] & 0xff;
						int i_146_ = 0;
						while_98_: for (int i_147_ = 0; i_147_ < is_128_.length; i_147_++) {
							Class527_Sub14 class527_sub14 = class527_sub14s_124_[i_147_];
							for (int i_148_ = 0; i_148_ < i_146_; i_148_++) {
								if (class527_sub14s_121_[i_148_] == class527_sub14)
									continue while_98_;
							}
							class527_sub14s_121_[i_146_++] = class527_sub14;
						}
						short[] is_149_ = (aShortArrayArray9261[i_123_ * (anInt1750 * 1210322533) + i_122_] = new short[is_128_.length]);
						for (int i_150_ = 0; i_150_ < is_128_.length; i_150_++) {
							int i_151_ = ((i_122_ << anInt1753 * 1252000143) + is_125_[i_150_]);
							int i_152_ = ((i_123_ << anInt1753 * 1252000143) + is_126_[i_150_]);
							int i_153_ = i_151_ >> anInt9263;
							int i_154_ = i_152_ >> anInt9263;
							int i_155_ = is_128_[i_150_];
							int i_156_ = is_127_[i_150_];
							int i_157_ = is_129_ != null ? is_129_[i_150_] : 0;
							long l = ((long) i_156_ << 48 | (long) i_155_ << 32 | (long) (i_153_ << 16) | (long) i_154_);
							int i_158_ = is_125_[i_150_];
							int i_159_ = is_126_[i_150_];
							int i_160_ = 74;
							int i_161_ = 0;
							float f_162_ = 1.0F;
							float f_163_;
							float f_164_;
							float f_165_;
							if (i_158_ == 0 && i_159_ == 0) {
								f_163_ = f;
								f_164_ = f_131_;
								f_165_ = f_132_;
								i_160_ -= i_142_;
							} else if (i_158_ == 0 && i_159_ == anInt1752 * 1048375491) {
								f_163_ = f_133_;
								f_164_ = f_134_;
								f_165_ = f_135_;
								i_160_ -= i_143_;
							} else if (i_158_ == anInt1752 * 1048375491 && i_159_ == anInt1752 * 1048375491) {
								f_163_ = f_136_;
								f_164_ = f_137_;
								f_165_ = f_138_;
								i_160_ -= i_144_;
							} else if (i_158_ == anInt1752 * 1048375491 && i_159_ == 0) {
								f_163_ = f_139_;
								f_164_ = f_140_;
								f_165_ = f_141_;
								i_160_ -= i_145_;
							} else {
								float f_166_ = ((float) i_158_ / (float) (anInt1752 * 1048375491));
								float f_167_ = ((float) i_159_ / (float) (anInt1752 * 1048375491));
								float f_168_ = f + (f_139_ - f) * f_166_;
								float f_169_ = f_131_ + (f_140_ - f_131_) * f_166_;
								float f_170_ = f_132_ + (f_141_ - f_132_) * f_166_;
								float f_171_ = f_133_ + (f_136_ - f_133_) * f_166_;
								float f_172_ = f_134_ + (f_137_ - f_134_) * f_166_;
								float f_173_ = f_135_ + (f_138_ - f_135_) * f_166_;
								f_163_ = f_168_ + (f_171_ - f_168_) * f_167_;
								f_164_ = f_169_ + (f_172_ - f_169_) * f_167_;
								f_165_ = f_170_ + (f_173_ - f_170_) * f_167_;
								int i_174_ = i_142_ + ((i_145_ - i_142_) * i_158_ >> anInt1753 * 1252000143);
								int i_175_ = i_143_ + ((i_144_ - i_143_) * i_158_ >> anInt1753 * 1252000143);
								i_160_ -= i_174_ + ((i_175_ - i_174_) * i_159_ >> anInt1753 * 1252000143);
							}
							if (i_155_ != -1) {
								int i_176_ = (i_155_ & 0x7f) * i_160_ >> 7;
								if (i_176_ < 2)
									i_176_ = 2;
								else if (i_176_ > 126)
									i_176_ = 126;
								i_161_ = (Class656.anIntArray8390[i_155_ & 0xff80 | i_176_]);
								if ((anInt9270 & 0x7) == 0) {
									f_162_ = ((aClass180_Sub3_9262.aFloatArray9773[0]) * f_163_ + (aClass180_Sub3_9262.aFloatArray9773[1]) * f_164_ + (aClass180_Sub3_9262.aFloatArray9773[2]) * f_165_);
									f_162_ = (aClass180_Sub3_9262.aFloat9779 + f_162_ * (f_162_ > 0.0F ? (aClass180_Sub3_9262.aFloat9780) : (aClass180_Sub3_9262.aFloat9781)));
								}
							}
							Class527 class527 = null;
							if ((i_151_ & anInt9289 - 1) == 0 && (i_152_ & anInt9289 - 1) == 0)
								class527 = class14.method709(l);
							int i_177_;
							if (class527 == null) {
								int i_178_;
								if (i_156_ != i_155_) {
									int i_179_ = (i_156_ & 0x7f) * i_160_ >> 7;
									if (i_179_ < 2)
										i_179_ = 2;
									else if (i_179_ > 126)
										i_179_ = 126;
									i_178_ = (Class656.anIntArray8390[i_156_ & 0xff80 | i_179_]);
									if ((anInt9270 & 0x7) == 0) {
										float f_180_ = ((aClass180_Sub3_9262.aFloatArray9773[0]) * f_163_ + (aClass180_Sub3_9262.aFloatArray9773[1]) * f_164_ + ((aClass180_Sub3_9262.aFloatArray9773[2]) * f_165_));
										f_180_ = (aClass180_Sub3_9262.aFloat9779 + (f_162_ * (f_162_ > 0.0F ? (aClass180_Sub3_9262.aFloat9780) : (aClass180_Sub3_9262.aFloat9781))));
										int i_181_ = i_178_ >> 16 & 0xff;
										int i_182_ = i_178_ >> 8 & 0xff;
										int i_183_ = i_178_ & 0xff;
										i_181_ *= f_180_;
										if (i_181_ < 0)
											i_181_ = 0;
										else if (i_181_ > 255)
											i_181_ = 255;
										i_182_ *= f_180_;
										if (i_182_ < 0)
											i_182_ = 0;
										else if (i_182_ > 255)
											i_182_ = 255;
										i_183_ *= f_180_;
										if (i_183_ < 0)
											i_183_ = 0;
										else if (i_183_ > 255)
											i_183_ = 255;
										i_178_ = (i_181_ << 16 | i_182_ << 8 | i_183_);
									}
								} else
									i_178_ = i_161_;
								if (aClass180_Sub3_9262.aBool9788) {
									stream.method1707((float) i_151_);
									stream.method1707((float) (method2593(i_151_, i_152_, -1151432033) + i_157_));
									stream.method1707((float) i_152_);
									stream.method1706((byte) (i_178_ >> 16));
									stream.method1706((byte) (i_178_ >> 8));
									stream.method1706((byte) i_178_);
									stream.method1706(-1);
									stream.method1707((float) i_151_);
									stream.method1707((float) i_152_);
									if (anIntArrayArrayArray9276 != null)
										stream.method1707(is_130_ != null ? (float) ((is_130_[i_150_]) - 1) : 0.0F);
									if ((anInt9270 & 0x7) != 0) {
										stream.method1707(f_163_);
										stream.method1707(f_164_);
										stream.method1707(f_165_);
									}
								} else {
									stream.method1708((float) i_151_);
									stream.method1708((float) (method2593(i_151_, i_152_, -1151432033) + i_157_));
									stream.method1708((float) i_152_);
									stream.method1706((byte) (i_178_ >> 16));
									stream.method1706((byte) (i_178_ >> 8));
									stream.method1706((byte) i_178_);
									stream.method1706(-1);
									stream.method1708((float) i_151_);
									stream.method1708((float) i_152_);
									if (anIntArrayArrayArray9276 != null)
										stream.method1708(is_130_ != null ? (float) ((is_130_[i_150_]) - 1) : 0.0F);
									if ((anInt9270 & 0x7) != 0) {
										stream.method1708(f_163_);
										stream.method1708(f_164_);
										stream.method1708(f_165_);
									}
								}
								i_177_ = anInt9267++;
								is_149_[i_150_] = (short) i_177_;
								if (i_155_ != -1)
									class527_sub14s[i_177_] = class527_sub14s_124_[i_150_];
								class14.method714(new Class527_Sub13(is_149_[i_150_]), l);
							} else {
								is_149_[i_150_] = ((Class527_Sub13) class527).aShort10445;
								i_177_ = is_149_[i_150_] & 0xffff;
								if (i_155_ != -1 && ((class527_sub14s_124_[i_150_].aLong7106 * -8168620736534281759L) < (class527_sub14s[i_177_].aLong7106 * -8168620736534281759L)))
									class527_sub14s[i_177_] = class527_sub14s_124_[i_150_];
							}
							for (int i_184_ = 0; i_184_ < i_146_; i_184_++)
								class527_sub14s_121_[i_184_].method16105(i_177_, i_161_, i_160_, f_162_);
							anInt9268++;
						}
					}
				}
			}
			for (int i_185_ = 0; i_185_ < anInt9267; i_185_++) {
				Class527_Sub14 class527_sub14 = class527_sub14s[i_185_];
				if (class527_sub14 != null)
					class527_sub14.method16115(i_185_);
			}
			for (int i_186_ = 0; i_186_ < anInt1750 * 1210322533; i_186_++) {
				for (int i_187_ = 0; i_187_ < anInt1751 * -533476177; i_187_++) {
					short[] is_188_ = (aShortArrayArray9261[i_187_ * (anInt1750 * 1210322533) + i_186_]);
					if (is_188_ != null) {
						int i_189_ = 0;
						int i_190_ = 0;
						while (i_190_ < is_188_.length) {
							int i_191_ = is_188_[i_190_++] & 0xffff;
							int i_192_ = is_188_[i_190_++] & 0xffff;
							int i_193_ = is_188_[i_190_++] & 0xffff;
							Class527_Sub14 class527_sub14 = class527_sub14s[i_191_];
							Class527_Sub14 class527_sub14_194_ = class527_sub14s[i_192_];
							Class527_Sub14 class527_sub14_195_ = class527_sub14s[i_193_];
							Class527_Sub14 class527_sub14_196_ = null;
							if (class527_sub14 != null) {
								class527_sub14.method16104(i_186_, i_187_, i_189_);
								class527_sub14_196_ = class527_sub14;
							}
							if (class527_sub14_194_ != null) {
								class527_sub14_194_.method16104(i_186_, i_187_, i_189_);
								if (class527_sub14_196_ == null || ((class527_sub14_194_.aLong7106 * -8168620736534281759L) < (class527_sub14_196_.aLong7106 * -8168620736534281759L)))
									class527_sub14_196_ = class527_sub14_194_;
							}
							if (class527_sub14_195_ != null) {
								class527_sub14_195_.method16104(i_186_, i_187_, i_189_);
								if (class527_sub14_196_ == null || ((class527_sub14_195_.aLong7106 * -8168620736534281759L) < (class527_sub14_196_.aLong7106 * -8168620736534281759L)))
									class527_sub14_196_ = class527_sub14_195_;
							}
							if (class527_sub14_196_ != null) {
								if (class527_sub14 != null)
									class527_sub14_196_.method16115(i_191_);
								if (class527_sub14_194_ != null)
									class527_sub14_196_.method16115(i_192_);
								if (class527_sub14_195_ != null)
									class527_sub14_196_.method16115(i_193_);
								class527_sub14_196_.method16104(i_186_, i_187_, i_189_);
							}
							i_189_++;
						}
					}
				}
			}
			stream.method1709();
			anInterface15_9277 = aClass180_Sub3_9262.method15435(i, nativeheapbuffer, stream.method1704(), false);
			if (anInterface15_9277 instanceof Class120_Sub1)
				nativeheapbuffer.method1679();
			aClass129_9282 = new Class129(anInterface15_9277, 5126, 3, 0);
			aClass129_9283 = new Class129(anInterface15_9277, 5121, 4, 12);
			int i_197_;
			if (anIntArrayArrayArray9276 != null) {
				aClass129_9281 = new Class129(anInterface15_9277, 5126, 3, 16);
				i_197_ = 28;
			} else {
				aClass129_9281 = new Class129(anInterface15_9277, 5126, 2, 16);
				i_197_ = 24;
			}
			if ((anInt9270 & 0x7) != 0)
				aClass129_9284 = new Class129(anInterface15_9277, 5126, 3, i_197_);
			long[] ls = new long[aClass527Array9280.length];
			for (int i_198_ = 0; i_198_ < aClass527Array9280.length; i_198_++) {
				Class527_Sub14 class527_sub14 = (Class527_Sub14) aClass527Array9280[i_198_];
				ls[i_198_] = class527_sub14.aLong7106 * -8168620736534281759L;
				class527_sub14.method16116(anInt9267);
			}
			Class509.method8418(ls, aClass527Array9280, (byte) 51);
			if (aClass141_9278 != null)
				aClass141_9278.method2343();
		} else
			aClass141_9278 = null;
		if ((anInt9260 & 0x2) == 0) {
			anIntArrayArrayArray9265 = null;
			anIntArrayArrayArray9293 = null;
			anIntArrayArrayArray9271 = null;
		}
		anIntArrayArrayArray9276 = null;
		anIntArrayArrayArray9272 = null;
		anIntArrayArrayArray9275 = null;
		aClass527_Sub14ArrayArrayArray9269 = null;
		aByteArrayArray9288 = null;
		aClass14_9292 = null;
		aFloatArrayArray9291 = null;
		aFloatArrayArray9290 = null;
		aFloatArrayArray9264 = null;
	}

	void method14742(int i, int i_199_, int i_200_, boolean[][] bools, boolean bool, int i_201_) {
		if (aClass527Array9280 != null) {
			int i_202_ = i_200_ + i_200_ + 1;
			i_202_ *= i_202_;
			if (aClass180_Sub3_9262.anIntArray9816.length < i_202_)
				aClass180_Sub3_9262.anIntArray9816 = new int[i_202_];
			if ((aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.buffer).length < anInt9268 * 2)
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1(anInt9268 * 2);
			int i_203_ = i - i_200_;
			int i_204_ = i_203_;
			if (i_203_ < 0)
				i_203_ = 0;
			int i_205_ = i_199_ - i_200_;
			int i_206_ = i_205_;
			if (i_205_ < 0)
				i_205_ = 0;
			int i_207_ = i + i_200_;
			if (i_207_ > anInt1750 * 1210322533 - 1)
				i_207_ = anInt1750 * 1210322533 - 1;
			int i_208_ = i_199_ + i_200_;
			if (i_208_ > anInt1751 * -533476177 - 1)
				i_208_ = anInt1751 * -533476177 - 1;
			int i_209_ = 0;
			int[] is = aClass180_Sub3_9262.anIntArray9816;
			for (int i_210_ = i_203_; i_210_ <= i_207_; i_210_++) {
				boolean[] bools_211_ = bools[i_210_ - i_204_];
				for (int i_212_ = i_205_; i_212_ <= i_208_; i_212_++) {
					if (bools_211_[i_212_ - i_206_])
						is[i_209_++] = i_212_ * (anInt1750 * 1210322533) + i_210_;
				}
			}
			aClass180_Sub3_9262.method15396();
			aClass180_Sub3_9262.method15409((anInt9270 & 0x7) != 0);
			for (int i_213_ = 0; i_213_ < aClass527Array9280.length - 0; i_213_++)
				((Class527_Sub14) aClass527Array9280[i_213_]).method16107(is, i_209_);
			if (!aClass694_9285.method14088(-1123110389)) {
				int i_214_ = aClass180_Sub3_9262.anInt9809;
				int i_215_ = aClass180_Sub3_9262.anInt9789;
				aClass180_Sub3_9262.method3187(0, i_215_, aClass180_Sub3_9262.anInt9790);
				aClass180_Sub3_9262.method15409(false);
				aClass180_Sub3_9262.method15412(false);
				aClass180_Sub3_9262.method15525(128);
				aClass180_Sub3_9262.method15397(-2);
				aClass180_Sub3_9262.method15401(aClass180_Sub3_9262.aClass118_Sub3_9807);
				aClass180_Sub3_9262.method15403(8448, 7681);
				aClass180_Sub3_9262.method15404(0, 34166, 770);
				aClass180_Sub3_9262.method15405(0, 34167, 770);
				for (Class527 class527 = aClass694_9285.method14081((short) 6092); class527 != null; class527 = aClass694_9285.method14086(-65534)) {
					Class527_Sub9 class527_sub9 = (Class527_Sub9) class527;
					class527_sub9.method16067(i, i_199_, i_200_, bools);
				}
				aClass180_Sub3_9262.method15404(0, 5890, 768);
				aClass180_Sub3_9262.method15405(0, 5890, 770);
				aClass180_Sub3_9262.method15401(null);
				aClass180_Sub3_9262.method3187(i_214_, i_215_, aClass180_Sub3_9262.anInt9790);
			}
			if (aClass141_9278 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass180_Sub3_9262.method15385(aClass129_9282, null, null, aClass129_9281);
				aClass141_9278.method2347(i, i_199_, i_200_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method2603(int i, int i_216_, int i_217_) {
		i = Math.min(aByteArrayArray9288.length - 1, Math.max(0, i));
		i_216_ = Math.min(aByteArrayArray9288[i].length - 1, Math.max(0, i_216_));
		if ((aByteArrayArray9288[i][i_216_] & 0xff) < i_217_)
			aByteArrayArray9288[i][i_216_] = (byte) i_217_;
	}

	public void method2616(Class527_Sub16 class527_sub16, int[] is) {
		aClass694_9285.method14147(new Class527_Sub9(aClass180_Sub3_9262, this, class527_sub16, is), -351875083);
	}

	public void method2611(int i, int i_218_, int[] is, int[] is_219_, int[] is_220_, int[] is_221_, int[] is_222_, int[] is_223_, int[] is_224_, int[] is_225_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub3_9262.aClass181_2059;
		if (is_221_ != null && anIntArrayArrayArray9276 == null)
			anIntArrayArrayArray9276 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_219_ != null && anIntArrayArrayArray9275 == null)
			anIntArrayArrayArray9275 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9293[i][i_218_] = is;
		anIntArrayArrayArray9265[i][i_218_] = is_220_;
		anIntArrayArrayArray9271[i][i_218_] = is_222_;
		anIntArrayArrayArray9272[i][i_218_] = is_223_;
		if (anIntArrayArrayArray9276 != null)
			anIntArrayArrayArray9276[i][i_218_] = is_221_;
		if (anIntArrayArrayArray9275 != null)
			anIntArrayArrayArray9275[i][i_218_] = is_219_;
		Class527_Sub14[] class527_sub14s = (aClass527_Sub14ArrayArrayArray9269[i][i_218_] = new Class527_Sub14[is_222_.length]);
		for (int i_226_ = 0; i_226_ < is_222_.length; i_226_++) {
			int i_227_ = is_224_[i_226_];
			int i_228_ = is_225_[i_226_];
			if ((anInt9270 & 0x20) != 0 && i_227_ != -1 && class181.method3544(i_227_, (byte) -17).aBool1806) {
				i_228_ = 128;
				i_227_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_228_ << 14) | (long) i_227_);
			Class527 class527;
			for (class527 = aClass14_9292.method709(l); class527 != null; class527 = aClass14_9292.method715(-736237285)) {
				Class527_Sub14 class527_sub14 = (Class527_Sub14) class527;
				if (class527_sub14.anInt10449 == i_227_ && class527_sub14.aFloat10454 == (float) i_228_ && class527_sub14.aClass178_10450.method3059(class178, (byte) 63))
					break;
			}
			if (class527 == null) {
				class527_sub14s[i_226_] = new Class527_Sub14(this, i_227_, i_228_, class178);
				aClass14_9292.method714(class527_sub14s[i_226_], l);
			} else
				class527_sub14s[i_226_] = (Class527_Sub14) class527;
		}
		if (bool)
			aByteArrayArray9273[i][i_218_] |= 0x1;
		if (is_222_.length > anInt9287)
			anInt9287 = is_222_.length;
		anInt9286 += is_222_.length;
	}

	public void method2629(int i, int i_229_, int i_230_, boolean[][] bools, boolean bool, int i_231_) {
		method14740(i, i_229_, i_230_, bools, bool, i_231_);
	}

	void method14743(Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1, int i, int i_232_) {
		int[] is = anIntArrayArrayArray9293[i][i_232_];
		int[] is_233_ = anIntArrayArrayArray9265[i][i_232_];
		int i_234_ = is.length;
		if (aClass180_Sub3_9262.anIntArray9838.length < i_234_) {
			aClass180_Sub3_9262.anIntArray9838 = new int[i_234_];
			aClass180_Sub3_9262.anIntArray9851 = new int[i_234_];
		}
		int[] is_235_ = aClass180_Sub3_9262.anIntArray9838;
		int[] is_236_ = aClass180_Sub3_9262.anIntArray9851;
		for (int i_237_ = 0; i_237_ < i_234_; i_237_++) {
			is_235_[i_237_] = is[i_237_] >> aClass180_Sub3_9262.anInt9850;
			is_236_[i_237_] = is_233_[i_237_] >> aClass180_Sub3_9262.anInt9850;
		}
		int i_238_ = 0;
		while (i_238_ < i_234_) {
			int i_239_ = is_235_[i_238_];
			int i_240_ = is_236_[i_238_++];
			int i_241_ = is_235_[i_238_];
			int i_242_ = is_236_[i_238_++];
			int i_243_ = is_235_[i_238_];
			int i_244_ = is_236_[i_238_++];
			if (((i_239_ - i_241_) * (i_242_ - i_244_) - (i_242_ - i_240_) * (i_243_ - i_241_)) > 0)
				class527_sub8_sub8_sub1.method18707(i_240_, i_242_, i_244_, i_239_, i_241_, i_243_);
		}
	}

	public Class527_Sub8_Sub8 method2597(int i, int i_245_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9273[i][i_245_] & 0x1) == 0)
			return null;
		int i_246_ = anInt1752 * 1048375491 >> aClass180_Sub3_9262.anInt9850;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_247_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_246_, i_246_)) {
			class527_sub8_sub8_sub1_247_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_247_.method18709();
		} else
			class527_sub8_sub8_sub1_247_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9262, i_246_, i_246_);
		class527_sub8_sub8_sub1_247_.method18711(0, 0, i_246_, i_246_);
		method14741(class527_sub8_sub8_sub1_247_, i, i_245_);
		return class527_sub8_sub8_sub1_247_;
	}

	public Class527_Sub8_Sub8 method2610(int i, int i_248_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9273[i][i_248_] & 0x1) == 0)
			return null;
		int i_249_ = anInt1752 * 1048375491 >> aClass180_Sub3_9262.anInt9850;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_250_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_249_, i_249_)) {
			class527_sub8_sub8_sub1_250_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_250_.method18709();
		} else
			class527_sub8_sub8_sub1_250_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9262, i_249_, i_249_);
		class527_sub8_sub8_sub1_250_.method18711(0, 0, i_249_, i_249_);
		method14741(class527_sub8_sub8_sub1_250_, i, i_248_);
		return class527_sub8_sub8_sub1_250_;
	}

	public Class527_Sub8_Sub8 method2625(int i, int i_251_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9273[i][i_251_] & 0x1) == 0)
			return null;
		int i_252_ = anInt1752 * 1048375491 >> aClass180_Sub3_9262.anInt9850;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_253_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_252_, i_252_)) {
			class527_sub8_sub8_sub1_253_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_253_.method18709();
		} else
			class527_sub8_sub8_sub1_253_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9262, i_252_, i_252_);
		class527_sub8_sub8_sub1_253_.method18711(0, 0, i_252_, i_252_);
		method14741(class527_sub8_sub8_sub1_253_, i, i_251_);
		return class527_sub8_sub8_sub1_253_;
	}

	public Class527_Sub8_Sub8 method2586(int i, int i_254_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9273[i][i_254_] & 0x1) == 0)
			return null;
		int i_255_ = anInt1752 * 1048375491 >> aClass180_Sub3_9262.anInt9850;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_256_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_255_, i_255_)) {
			class527_sub8_sub8_sub1_256_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_256_.method18709();
		} else
			class527_sub8_sub8_sub1_256_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9262, i_255_, i_255_);
		class527_sub8_sub8_sub1_256_.method18711(0, 0, i_255_, i_255_);
		method14741(class527_sub8_sub8_sub1_256_, i, i_254_);
		return class527_sub8_sub8_sub1_256_;
	}

	public void method2621(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_257_, int i_258_, int i_259_, boolean bool) {
		if (aClass141_9278 != null && class527_sub8_sub8 != null) {
			int i_260_ = (i - (i_257_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
			int i_261_ = (i_258_ - (i_257_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
			aClass141_9278.method2362(class527_sub8_sub8, i_260_, i_261_);
		}
	}

	public void method2613(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_262_, int i_263_, int i_264_, boolean bool) {
		if (aClass141_9278 != null && class527_sub8_sub8 != null) {
			int i_265_ = (i - (i_262_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
			int i_266_ = (i_263_ - (i_262_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
			aClass141_9278.method2362(class527_sub8_sub8, i_265_, i_266_);
		}
	}

	public boolean method2614(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_267_, int i_268_, int i_269_, boolean bool) {
		if (aClass141_9278 == null || class527_sub8_sub8 == null)
			return false;
		int i_270_ = (i - (i_267_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
		int i_271_ = (i_268_ - (i_267_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
		return aClass141_9278.method2348(class527_sub8_sub8, i_270_, i_271_);
	}

	void method14744(int i, int i_272_, int i_273_, boolean[][] bools, boolean bool, int i_274_) {
		if (aClass527Array9280 != null) {
			int i_275_ = i_273_ + i_273_ + 1;
			i_275_ *= i_275_;
			if (aClass180_Sub3_9262.anIntArray9816.length < i_275_)
				aClass180_Sub3_9262.anIntArray9816 = new int[i_275_];
			if ((aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.buffer).length < anInt9268 * 2)
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1(anInt9268 * 2);
			int i_276_ = i - i_273_;
			int i_277_ = i_276_;
			if (i_276_ < 0)
				i_276_ = 0;
			int i_278_ = i_272_ - i_273_;
			int i_279_ = i_278_;
			if (i_278_ < 0)
				i_278_ = 0;
			int i_280_ = i + i_273_;
			if (i_280_ > anInt1750 * 1210322533 - 1)
				i_280_ = anInt1750 * 1210322533 - 1;
			int i_281_ = i_272_ + i_273_;
			if (i_281_ > anInt1751 * -533476177 - 1)
				i_281_ = anInt1751 * -533476177 - 1;
			int i_282_ = 0;
			int[] is = aClass180_Sub3_9262.anIntArray9816;
			for (int i_283_ = i_276_; i_283_ <= i_280_; i_283_++) {
				boolean[] bools_284_ = bools[i_283_ - i_277_];
				for (int i_285_ = i_278_; i_285_ <= i_281_; i_285_++) {
					if (bools_284_[i_285_ - i_279_])
						is[i_282_++] = i_285_ * (anInt1750 * 1210322533) + i_283_;
				}
			}
			aClass180_Sub3_9262.method15396();
			aClass180_Sub3_9262.method15409((anInt9270 & 0x7) != 0);
			for (int i_286_ = 0; i_286_ < aClass527Array9280.length - 0; i_286_++)
				((Class527_Sub14) aClass527Array9280[i_286_]).method16107(is, i_282_);
			if (!aClass694_9285.method14088(253479298)) {
				int i_287_ = aClass180_Sub3_9262.anInt9809;
				int i_288_ = aClass180_Sub3_9262.anInt9789;
				aClass180_Sub3_9262.method3187(0, i_288_, aClass180_Sub3_9262.anInt9790);
				aClass180_Sub3_9262.method15409(false);
				aClass180_Sub3_9262.method15412(false);
				aClass180_Sub3_9262.method15525(128);
				aClass180_Sub3_9262.method15397(-2);
				aClass180_Sub3_9262.method15401(aClass180_Sub3_9262.aClass118_Sub3_9807);
				aClass180_Sub3_9262.method15403(8448, 7681);
				aClass180_Sub3_9262.method15404(0, 34166, 770);
				aClass180_Sub3_9262.method15405(0, 34167, 770);
				for (Class527 class527 = aClass694_9285.method14081((short) 10627); class527 != null; class527 = aClass694_9285.method14086(-65534)) {
					Class527_Sub9 class527_sub9 = (Class527_Sub9) class527;
					class527_sub9.method16067(i, i_272_, i_273_, bools);
				}
				aClass180_Sub3_9262.method15404(0, 5890, 768);
				aClass180_Sub3_9262.method15405(0, 5890, 770);
				aClass180_Sub3_9262.method15401(null);
				aClass180_Sub3_9262.method3187(i_287_, i_288_, aClass180_Sub3_9262.anInt9790);
			}
			if (aClass141_9278 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass180_Sub3_9262.method15385(aClass129_9282, null, null, aClass129_9281);
				aClass141_9278.method2347(i, i_272_, i_273_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method2602(int i, int i_289_, int i_290_) {
		i = Math.min(aByteArrayArray9288.length - 1, Math.max(0, i));
		i_289_ = Math.min(aByteArrayArray9288[i].length - 1, Math.max(0, i_289_));
		if ((aByteArrayArray9288[i][i_289_] & 0xff) < i_290_)
			aByteArrayArray9288[i][i_289_] = (byte) i_290_;
	}

	public void method2590(int i, int i_291_, int[] is, int[] is_292_, int[] is_293_, int[] is_294_, int[] is_295_, int[] is_296_, int[] is_297_, int[] is_298_, int[] is_299_, int[] is_300_, int[] is_301_, Class178 class178, boolean bool) {
		int i_302_ = is_298_.length;
		int[] is_303_ = new int[i_302_ * 3];
		int[] is_304_ = new int[i_302_ * 3];
		int[] is_305_ = new int[i_302_ * 3];
		int[] is_306_ = is_299_ != null ? new int[i_302_ * 3] : null;
		int[] is_307_ = new int[i_302_ * 3];
		int[] is_308_ = new int[i_302_ * 3];
		int[] is_309_ = is_292_ != null ? new int[i_302_ * 3] : null;
		int[] is_310_ = is_294_ != null ? new int[i_302_ * 3] : null;
		int i_311_ = 0;
		for (int i_312_ = 0; i_312_ < i_302_; i_312_++) {
			int i_313_ = is_295_[i_312_];
			int i_314_ = is_296_[i_312_];
			int i_315_ = is_297_[i_312_];
			is_303_[i_311_] = is[i_313_];
			is_304_[i_311_] = is_293_[i_313_];
			is_305_[i_311_] = is_298_[i_312_];
			is_307_[i_311_] = is_300_[i_312_];
			is_308_[i_311_] = is_301_[i_312_];
			if (is_299_ != null)
				is_306_[i_311_] = is_299_[i_312_];
			if (is_292_ != null)
				is_309_[i_311_] = is_292_[i_313_];
			if (is_294_ != null)
				is_310_[i_311_] = is_294_[i_313_];
			i_311_++;
			is_303_[i_311_] = is[i_314_];
			is_304_[i_311_] = is_293_[i_314_];
			is_305_[i_311_] = is_298_[i_312_];
			is_307_[i_311_] = is_300_[i_312_];
			is_308_[i_311_] = is_301_[i_312_];
			if (is_299_ != null)
				is_306_[i_311_] = is_299_[i_312_];
			if (is_292_ != null)
				is_309_[i_311_] = is_292_[i_314_];
			if (is_294_ != null)
				is_310_[i_311_] = is_294_[i_314_];
			i_311_++;
			is_303_[i_311_] = is[i_315_];
			is_304_[i_311_] = is_293_[i_315_];
			is_305_[i_311_] = is_298_[i_312_];
			is_307_[i_311_] = is_300_[i_312_];
			is_308_[i_311_] = is_301_[i_312_];
			if (is_299_ != null)
				is_306_[i_311_] = is_299_[i_312_];
			if (is_292_ != null)
				is_309_[i_311_] = is_292_[i_315_];
			if (is_294_ != null)
				is_310_[i_311_] = is_294_[i_315_];
			i_311_++;
		}
		method2604(i, i_291_, is_303_, is_309_, is_304_, is_310_, is_305_, is_306_, is_307_, is_308_, class178, bool);
	}

	public void method2618(int i, int i_316_, int[] is, int[] is_317_, int[] is_318_, int[] is_319_, int[] is_320_, int[] is_321_, int[] is_322_, int[] is_323_, int[] is_324_, int[] is_325_, int[] is_326_, Class178 class178, boolean bool) {
		int i_327_ = is_323_.length;
		int[] is_328_ = new int[i_327_ * 3];
		int[] is_329_ = new int[i_327_ * 3];
		int[] is_330_ = new int[i_327_ * 3];
		int[] is_331_ = is_324_ != null ? new int[i_327_ * 3] : null;
		int[] is_332_ = new int[i_327_ * 3];
		int[] is_333_ = new int[i_327_ * 3];
		int[] is_334_ = is_317_ != null ? new int[i_327_ * 3] : null;
		int[] is_335_ = is_319_ != null ? new int[i_327_ * 3] : null;
		int i_336_ = 0;
		for (int i_337_ = 0; i_337_ < i_327_; i_337_++) {
			int i_338_ = is_320_[i_337_];
			int i_339_ = is_321_[i_337_];
			int i_340_ = is_322_[i_337_];
			is_328_[i_336_] = is[i_338_];
			is_329_[i_336_] = is_318_[i_338_];
			is_330_[i_336_] = is_323_[i_337_];
			is_332_[i_336_] = is_325_[i_337_];
			is_333_[i_336_] = is_326_[i_337_];
			if (is_324_ != null)
				is_331_[i_336_] = is_324_[i_337_];
			if (is_317_ != null)
				is_334_[i_336_] = is_317_[i_338_];
			if (is_319_ != null)
				is_335_[i_336_] = is_319_[i_338_];
			i_336_++;
			is_328_[i_336_] = is[i_339_];
			is_329_[i_336_] = is_318_[i_339_];
			is_330_[i_336_] = is_323_[i_337_];
			is_332_[i_336_] = is_325_[i_337_];
			is_333_[i_336_] = is_326_[i_337_];
			if (is_324_ != null)
				is_331_[i_336_] = is_324_[i_337_];
			if (is_317_ != null)
				is_334_[i_336_] = is_317_[i_339_];
			if (is_319_ != null)
				is_335_[i_336_] = is_319_[i_339_];
			i_336_++;
			is_328_[i_336_] = is[i_340_];
			is_329_[i_336_] = is_318_[i_340_];
			is_330_[i_336_] = is_323_[i_337_];
			is_332_[i_336_] = is_325_[i_337_];
			is_333_[i_336_] = is_326_[i_337_];
			if (is_324_ != null)
				is_331_[i_336_] = is_324_[i_337_];
			if (is_317_ != null)
				is_334_[i_336_] = is_317_[i_340_];
			if (is_319_ != null)
				is_335_[i_336_] = is_319_[i_340_];
			i_336_++;
		}
		method2604(i, i_316_, is_328_, is_334_, is_329_, is_335_, is_330_, is_331_, is_332_, is_333_, class178, bool);
	}

	Class161_Sub2(Class180_Sub3 class180_sub3, int i, int i_341_, int i_342_, int i_343_, int[][] is, int[][] is_344_, int i_345_) {
		super(i_342_, i_343_, i_345_, is);
		aClass180_Sub3_9262 = class180_sub3;
		anInt9263 = anInt1753 * 1252000143 - 2;
		anInt9289 = 1 << anInt9263;
		anInt9260 = i;
		anInt9270 = i_341_;
		anIntArrayArrayArray9275 = new int[i_342_][i_343_][];
		aClass527_Sub14ArrayArrayArray9269 = new Class527_Sub14[i_342_][i_343_][];
		anIntArrayArrayArray9293 = new int[i_342_][i_343_][];
		anIntArrayArrayArray9265 = new int[i_342_][i_343_][];
		anIntArrayArrayArray9271 = new int[i_342_][i_343_][];
		anIntArrayArrayArray9272 = new int[i_342_][i_343_][];
		aShortArrayArray9261 = new short[i_342_ * i_343_][];
		aByteArrayArray9273 = new byte[i_342_][i_343_];
		aByteArrayArray9288 = new byte[i_342_ + 1][i_343_ + 1];
		aFloatArrayArray9264 = (new float[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
		aFloatArrayArray9290 = (new float[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
		aFloatArrayArray9291 = (new float[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
		for (int i_346_ = 1; i_346_ < anInt1751 * -533476177; i_346_++) {
			for (int i_347_ = 1; i_347_ < anInt1750 * 1210322533; i_347_++) {
				int i_348_ = (is_344_[i_347_ + 1][i_346_] - is_344_[i_347_ - 1][i_346_]);
				int i_349_ = (is_344_[i_347_][i_346_ + 1] - is_344_[i_347_][i_346_ - 1]);
				float f = (float) (1.0 / Math.sqrt((double) (i_348_ * i_348_ + 4 * i_345_ * i_345_ + i_349_ * i_349_)));
				aFloatArrayArray9264[i_347_][i_346_] = (float) i_348_ * f;
				aFloatArrayArray9290[i_347_][i_346_] = (float) (-i_345_ * 2) * f;
				aFloatArrayArray9291[i_347_][i_346_] = (float) i_349_ * f;
			}
		}
		aClass14_9292 = new Class14(128);
		if ((anInt9270 & 0x10) != 0)
			aClass141_9278 = new Class141(aClass180_Sub3_9262, this);
	}

	public void method2620(int i, int i_350_, int i_351_, boolean[][] bools, boolean bool, int i_352_) {
		method14740(i, i_350_, i_351_, bools, bool, i_352_);
	}

	public void method2604(int i, int i_353_, int[] is, int[] is_354_, int[] is_355_, int[] is_356_, int[] is_357_, int[] is_358_, int[] is_359_, int[] is_360_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub3_9262.aClass181_2059;
		if (is_356_ != null && anIntArrayArrayArray9276 == null)
			anIntArrayArrayArray9276 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_354_ != null && anIntArrayArrayArray9275 == null)
			anIntArrayArrayArray9275 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9293[i][i_353_] = is;
		anIntArrayArrayArray9265[i][i_353_] = is_355_;
		anIntArrayArrayArray9271[i][i_353_] = is_357_;
		anIntArrayArrayArray9272[i][i_353_] = is_358_;
		if (anIntArrayArrayArray9276 != null)
			anIntArrayArrayArray9276[i][i_353_] = is_356_;
		if (anIntArrayArrayArray9275 != null)
			anIntArrayArrayArray9275[i][i_353_] = is_354_;
		Class527_Sub14[] class527_sub14s = (aClass527_Sub14ArrayArrayArray9269[i][i_353_] = new Class527_Sub14[is_357_.length]);
		for (int i_361_ = 0; i_361_ < is_357_.length; i_361_++) {
			int i_362_ = is_359_[i_361_];
			int i_363_ = is_360_[i_361_];
			if ((anInt9270 & 0x20) != 0 && i_362_ != -1 && class181.method3544(i_362_, (byte) -123).aBool1806) {
				i_363_ = 128;
				i_362_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_363_ << 14) | (long) i_362_);
			Class527 class527;
			for (class527 = aClass14_9292.method709(l); class527 != null; class527 = aClass14_9292.method715(-1804438938)) {
				Class527_Sub14 class527_sub14 = (Class527_Sub14) class527;
				if (class527_sub14.anInt10449 == i_362_ && class527_sub14.aFloat10454 == (float) i_363_ && class527_sub14.aClass178_10450.method3059(class178, (byte) -2))
					break;
			}
			if (class527 == null) {
				class527_sub14s[i_361_] = new Class527_Sub14(this, i_362_, i_363_, class178);
				aClass14_9292.method714(class527_sub14s[i_361_], l);
			} else
				class527_sub14s[i_361_] = (Class527_Sub14) class527;
		}
		if (bool)
			aByteArrayArray9273[i][i_353_] |= 0x1;
		if (is_357_.length > anInt9287)
			anInt9287 = is_357_.length;
		anInt9286 += is_357_.length;
	}

	public void method2600(int i, int i_364_, int i_365_, boolean[][] bools, boolean bool, int i_366_) {
		method14740(i, i_364_, i_365_, bools, bool, i_366_);
	}

	public void method2592(int i, int i_367_, int[] is, int[] is_368_, int[] is_369_, int[] is_370_, int[] is_371_, int[] is_372_, int[] is_373_, int[] is_374_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub3_9262.aClass181_2059;
		if (is_370_ != null && anIntArrayArrayArray9276 == null)
			anIntArrayArrayArray9276 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_368_ != null && anIntArrayArrayArray9275 == null)
			anIntArrayArrayArray9275 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9293[i][i_367_] = is;
		anIntArrayArrayArray9265[i][i_367_] = is_369_;
		anIntArrayArrayArray9271[i][i_367_] = is_371_;
		anIntArrayArrayArray9272[i][i_367_] = is_372_;
		if (anIntArrayArrayArray9276 != null)
			anIntArrayArrayArray9276[i][i_367_] = is_370_;
		if (anIntArrayArrayArray9275 != null)
			anIntArrayArrayArray9275[i][i_367_] = is_368_;
		Class527_Sub14[] class527_sub14s = (aClass527_Sub14ArrayArrayArray9269[i][i_367_] = new Class527_Sub14[is_371_.length]);
		for (int i_375_ = 0; i_375_ < is_371_.length; i_375_++) {
			int i_376_ = is_373_[i_375_];
			int i_377_ = is_374_[i_375_];
			if ((anInt9270 & 0x20) != 0 && i_376_ != -1 && class181.method3544(i_376_, (byte) -63).aBool1806) {
				i_377_ = 128;
				i_376_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_377_ << 14) | (long) i_376_);
			Class527 class527;
			for (class527 = aClass14_9292.method709(l); class527 != null; class527 = aClass14_9292.method715(1565058132)) {
				Class527_Sub14 class527_sub14 = (Class527_Sub14) class527;
				if (class527_sub14.anInt10449 == i_376_ && class527_sub14.aFloat10454 == (float) i_377_ && class527_sub14.aClass178_10450.method3059(class178, (byte) -4))
					break;
			}
			if (class527 == null) {
				class527_sub14s[i_375_] = new Class527_Sub14(this, i_376_, i_377_, class178);
				aClass14_9292.method714(class527_sub14s[i_375_], l);
			} else
				class527_sub14s[i_375_] = (Class527_Sub14) class527;
		}
		if (bool)
			aByteArrayArray9273[i][i_367_] |= 0x1;
		if (is_371_.length > anInt9287)
			anInt9287 = is_371_.length;
		anInt9286 += is_371_.length;
	}

	public void method2607(int i, int i_378_, int i_379_, int i_380_, int i_381_, int i_382_, int i_383_, boolean[][] bools) {
		Class171 class171 = aClass180_Sub3_9262.method3285(1701005405);
		if (anInt9286 > 0 && class171 != null) {
			aClass180_Sub3_9262.method15371();
			aClass180_Sub3_9262.method15408(false);
			aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15411(false);
			aClass180_Sub3_9262.method15412(false);
			aClass180_Sub3_9262.method15525(0);
			aClass180_Sub3_9262.method15397(-2);
			aClass180_Sub3_9262.method15401(null);
			aFloatArray9266[0] = (float) i_379_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2728());
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = (float) i_379_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2729());
			aFloatArray9266[6] = 0.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 0.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = -1.0F - ((float) (i_380_ * i_379_) / 128.0F - (float) (i * 2)) / (float) class171.method2728();
			aFloatArray9266[13] = 1.0F - (((float) (2 * i_378_) + (float) (i_383_ * i_379_) / 128.0F) / (float) class171.method2729());
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			aFloatArray9266[0] = 1.0F;
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = 0.0F;
			aFloatArray9266[6] = 1.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 1.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = 0.0F;
			aFloatArray9266[13] = 0.0F;
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			if ((anInt9270 & 0x7) != 0) {
				aClass180_Sub3_9262.method15409(true);
				aClass180_Sub3_9262.method15381();
			} else
				aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15385(aClass129_9282, aClass129_9284, aClass129_9283, aClass129_9281);
			if ((aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.buffer).length < anInt9268 * 2)
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1(anInt9268 * 2);
			else
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
			int i_384_ = 0;
			Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819;
			if (aClass180_Sub3_9262.aBool9788) {
				for (int i_385_ = i_381_; i_385_ < i_383_; i_385_++) {
					int i_386_ = i_385_ * (anInt1750 * 1210322533) + i_380_;
					for (int i_387_ = i_380_; i_387_ < i_382_; i_387_++) {
						if (bools[i_387_ - i_380_][i_385_ - i_381_]) {
							short[] is = aShortArrayArray9261[i_386_];
							if (is != null) {
								for (int i_388_ = 0; i_388_ < is.length; i_388_++) {
									class527_sub38_sub1.writeShort(is[i_388_] & 0xffff, 1404835786);
									i_384_++;
								}
							}
						}
						i_386_++;
					}
				}
			} else {
				for (int i_389_ = i_381_; i_389_ < i_383_; i_389_++) {
					int i_390_ = i_389_ * (anInt1750 * 1210322533) + i_380_;
					for (int i_391_ = i_380_; i_391_ < i_382_; i_391_++) {
						if (bools[i_391_ - i_380_][i_389_ - i_381_]) {
							short[] is = aShortArrayArray9261[i_390_];
							if (is != null) {
								for (int i_392_ = 0; i_392_ < is.length; i_392_++) {
									class527_sub38_sub1.writeShortLE((is[i_392_] & 0xffff), 167662281);
									i_384_++;
								}
							}
						}
						i_390_++;
					}
				}
			}
			if (i_384_ > 0) {
				Class131_Sub1 class131_sub1 = new Class131_Sub1(aClass180_Sub3_9262, 5123, class527_sub38_sub1.buffer, (class527_sub38_sub1.anInt10689 * -441238943));
				aClass180_Sub3_9262.method15433(class131_sub1, 4, 0, i_384_);
			}
		}
	}

	public void method2609(int i, int i_393_, int i_394_, int i_395_, int i_396_, int i_397_, int i_398_, boolean[][] bools) {
		Class171 class171 = aClass180_Sub3_9262.method3285(462354366);
		if (anInt9286 > 0 && class171 != null) {
			aClass180_Sub3_9262.method15371();
			aClass180_Sub3_9262.method15408(false);
			aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15411(false);
			aClass180_Sub3_9262.method15412(false);
			aClass180_Sub3_9262.method15525(0);
			aClass180_Sub3_9262.method15397(-2);
			aClass180_Sub3_9262.method15401(null);
			aFloatArray9266[0] = (float) i_394_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2728());
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = (float) i_394_ / (128.0F * (float) (anInt1752 * 1048375491) * (float) class171.method2729());
			aFloatArray9266[6] = 0.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 0.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = -1.0F - ((float) (i_395_ * i_394_) / 128.0F - (float) (i * 2)) / (float) class171.method2728();
			aFloatArray9266[13] = 1.0F - (((float) (2 * i_393_) + (float) (i_398_ * i_394_) / 128.0F) / (float) class171.method2729());
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			aFloatArray9266[0] = 1.0F;
			aFloatArray9266[1] = 0.0F;
			aFloatArray9266[2] = 0.0F;
			aFloatArray9266[3] = 0.0F;
			aFloatArray9266[4] = 0.0F;
			aFloatArray9266[5] = 0.0F;
			aFloatArray9266[6] = 1.0F;
			aFloatArray9266[7] = 0.0F;
			aFloatArray9266[8] = 0.0F;
			aFloatArray9266[9] = 1.0F;
			aFloatArray9266[10] = 0.0F;
			aFloatArray9266[11] = 0.0F;
			aFloatArray9266[12] = 0.0F;
			aFloatArray9266[13] = 0.0F;
			aFloatArray9266[14] = 0.0F;
			aFloatArray9266[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9266, 0);
			if ((anInt9270 & 0x7) != 0) {
				aClass180_Sub3_9262.method15409(true);
				aClass180_Sub3_9262.method15381();
			} else
				aClass180_Sub3_9262.method15409(false);
			aClass180_Sub3_9262.method15385(aClass129_9282, aClass129_9284, aClass129_9283, aClass129_9281);
			if ((aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.buffer).length < anInt9268 * 2)
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1(anInt9268 * 2);
			else
				aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
			int i_399_ = 0;
			Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9262.aClass527_Sub38_Sub1_9819;
			if (aClass180_Sub3_9262.aBool9788) {
				for (int i_400_ = i_396_; i_400_ < i_398_; i_400_++) {
					int i_401_ = i_400_ * (anInt1750 * 1210322533) + i_395_;
					for (int i_402_ = i_395_; i_402_ < i_397_; i_402_++) {
						if (bools[i_402_ - i_395_][i_400_ - i_396_]) {
							short[] is = aShortArrayArray9261[i_401_];
							if (is != null) {
								for (int i_403_ = 0; i_403_ < is.length; i_403_++) {
									class527_sub38_sub1.writeShort(is[i_403_] & 0xffff, 1404835786);
									i_399_++;
								}
							}
						}
						i_401_++;
					}
				}
			} else {
				for (int i_404_ = i_396_; i_404_ < i_398_; i_404_++) {
					int i_405_ = i_404_ * (anInt1750 * 1210322533) + i_395_;
					for (int i_406_ = i_395_; i_406_ < i_397_; i_406_++) {
						if (bools[i_406_ - i_395_][i_404_ - i_396_]) {
							short[] is = aShortArrayArray9261[i_405_];
							if (is != null) {
								for (int i_407_ = 0; i_407_ < is.length; i_407_++) {
									class527_sub38_sub1.writeShortLE(is[i_407_] & 0xffff, -579405056);
									i_399_++;
								}
							}
						}
						i_405_++;
					}
				}
			}
			if (i_399_ > 0) {
				Class131_Sub1 class131_sub1 = new Class131_Sub1(aClass180_Sub3_9262, 5123, class527_sub38_sub1.buffer, (class527_sub38_sub1.anInt10689 * -441238943));
				aClass180_Sub3_9262.method15433(class131_sub1, 4, 0, i_399_);
			}
		}
	}

	void method14745(Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1, int i, int i_408_) {
		int[] is = anIntArrayArrayArray9293[i][i_408_];
		int[] is_409_ = anIntArrayArrayArray9265[i][i_408_];
		int i_410_ = is.length;
		if (aClass180_Sub3_9262.anIntArray9838.length < i_410_) {
			aClass180_Sub3_9262.anIntArray9838 = new int[i_410_];
			aClass180_Sub3_9262.anIntArray9851 = new int[i_410_];
		}
		int[] is_411_ = aClass180_Sub3_9262.anIntArray9838;
		int[] is_412_ = aClass180_Sub3_9262.anIntArray9851;
		for (int i_413_ = 0; i_413_ < i_410_; i_413_++) {
			is_411_[i_413_] = is[i_413_] >> aClass180_Sub3_9262.anInt9850;
			is_412_[i_413_] = is_409_[i_413_] >> aClass180_Sub3_9262.anInt9850;
		}
		int i_414_ = 0;
		while (i_414_ < i_410_) {
			int i_415_ = is_411_[i_414_];
			int i_416_ = is_412_[i_414_++];
			int i_417_ = is_411_[i_414_];
			int i_418_ = is_412_[i_414_++];
			int i_419_ = is_411_[i_414_];
			int i_420_ = is_412_[i_414_++];
			if (((i_415_ - i_417_) * (i_418_ - i_420_) - (i_418_ - i_416_) * (i_419_ - i_417_)) > 0)
				class527_sub8_sub8_sub1.method18707(i_416_, i_418_, i_420_, i_415_, i_417_, i_419_);
		}
	}

	public void method2623(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_421_, int i_422_, int i_423_, boolean bool) {
		if (aClass141_9278 != null && class527_sub8_sub8 != null) {
			int i_424_ = (i - (i_421_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
			int i_425_ = (i_422_ - (i_421_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
			aClass141_9278.method2346(class527_sub8_sub8, i_424_, i_425_);
		}
	}

	public void method2624(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_426_, int i_427_, int i_428_, boolean bool) {
		if (aClass141_9278 != null && class527_sub8_sub8 != null) {
			int i_429_ = (i - (i_426_ * aClass180_Sub3_9262.anInt9785 >> 8) >> aClass180_Sub3_9262.anInt9850);
			int i_430_ = (i_427_ - (i_426_ * aClass180_Sub3_9262.anInt9786 >> 8) >> aClass180_Sub3_9262.anInt9850);
			aClass141_9278.method2346(class527_sub8_sub8, i_429_, i_430_);
		}
	}

	public void method2612() {
		if (anInt9286 > 0) {
			byte[][] is = (new byte[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
			for (int i = 1; i < anInt1750 * 1210322533; i++) {
				for (int i_431_ = 1; i_431_ < anInt1751 * -533476177; i_431_++)
					is[i][i_431_] = (byte) ((aByteArrayArray9288[i - 1][i_431_] >> 2) + (aByteArrayArray9288[i + 1][i_431_] >> 3) + (aByteArrayArray9288[i][i_431_ - 1] >> 2) + (aByteArrayArray9288[i][i_431_ + 1] >> 3) + (aByteArrayArray9288[i][i_431_] >> 1));
			}
			aClass527Array9280 = new Class527[aClass14_9292.method711(-655238926)];
			aClass14_9292.method708(aClass527Array9280, 1906833289);
			for (int i = 0; i < aClass527Array9280.length; i++)
				((Class527_Sub14) aClass527Array9280[i]).method16102(anInt9286);
			int i = 24;
			if (anIntArrayArrayArray9276 != null)
				i += 4;
			if ((anInt9270 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = aClass180_Sub3_9262.aNativeHeap9667.method1940(anInt9286 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class527_Sub14[] class527_sub14s = new Class527_Sub14[anInt9286];
			int i_432_ = Class203.method3783(anInt9286 / 4, 1996533534);
			if (i_432_ < 1)
				i_432_ = 1;
			Class14 class14 = new Class14(i_432_);
			Class527_Sub14[] class527_sub14s_433_ = new Class527_Sub14[anInt9287];
			for (int i_434_ = 0; i_434_ < anInt1750 * 1210322533; i_434_++) {
				for (int i_435_ = 0; i_435_ < anInt1751 * -533476177; i_435_++) {
					if (anIntArrayArrayArray9271[i_434_][i_435_] != null) {
						Class527_Sub14[] class527_sub14s_436_ = (aClass527_Sub14ArrayArrayArray9269[i_434_][i_435_]);
						int[] is_437_ = anIntArrayArrayArray9293[i_434_][i_435_];
						int[] is_438_ = anIntArrayArrayArray9265[i_434_][i_435_];
						int[] is_439_ = anIntArrayArrayArray9272[i_434_][i_435_];
						int[] is_440_ = anIntArrayArrayArray9271[i_434_][i_435_];
						int[] is_441_ = (anIntArrayArrayArray9275 != null ? anIntArrayArrayArray9275[i_434_][i_435_] : null);
						int[] is_442_ = (anIntArrayArrayArray9276 != null ? anIntArrayArrayArray9276[i_434_][i_435_] : null);
						if (is_439_ == null)
							is_439_ = is_440_;
						float f = aFloatArrayArray9264[i_434_][i_435_];
						float f_443_ = aFloatArrayArray9290[i_434_][i_435_];
						float f_444_ = aFloatArrayArray9291[i_434_][i_435_];
						float f_445_ = aFloatArrayArray9264[i_434_][i_435_ + 1];
						float f_446_ = aFloatArrayArray9290[i_434_][i_435_ + 1];
						float f_447_ = aFloatArrayArray9291[i_434_][i_435_ + 1];
						float f_448_ = aFloatArrayArray9264[i_434_ + 1][i_435_ + 1];
						float f_449_ = aFloatArrayArray9290[i_434_ + 1][i_435_ + 1];
						float f_450_ = aFloatArrayArray9291[i_434_ + 1][i_435_ + 1];
						float f_451_ = aFloatArrayArray9264[i_434_ + 1][i_435_];
						float f_452_ = aFloatArrayArray9290[i_434_ + 1][i_435_];
						float f_453_ = aFloatArrayArray9291[i_434_ + 1][i_435_];
						int i_454_ = is[i_434_][i_435_] & 0xff;
						int i_455_ = is[i_434_][i_435_ + 1] & 0xff;
						int i_456_ = is[i_434_ + 1][i_435_ + 1] & 0xff;
						int i_457_ = is[i_434_ + 1][i_435_] & 0xff;
						int i_458_ = 0;
						while_100_: for (int i_459_ = 0; i_459_ < is_440_.length; i_459_++) {
							Class527_Sub14 class527_sub14 = class527_sub14s_436_[i_459_];
							for (int i_460_ = 0; i_460_ < i_458_; i_460_++) {
								if (class527_sub14s_433_[i_460_] == class527_sub14)
									continue while_100_;
							}
							class527_sub14s_433_[i_458_++] = class527_sub14;
						}
						short[] is_461_ = (aShortArrayArray9261[i_435_ * (anInt1750 * 1210322533) + i_434_] = new short[is_440_.length]);
						for (int i_462_ = 0; i_462_ < is_440_.length; i_462_++) {
							int i_463_ = ((i_434_ << anInt1753 * 1252000143) + is_437_[i_462_]);
							int i_464_ = ((i_435_ << anInt1753 * 1252000143) + is_438_[i_462_]);
							int i_465_ = i_463_ >> anInt9263;
							int i_466_ = i_464_ >> anInt9263;
							int i_467_ = is_440_[i_462_];
							int i_468_ = is_439_[i_462_];
							int i_469_ = is_441_ != null ? is_441_[i_462_] : 0;
							long l = ((long) i_468_ << 48 | (long) i_467_ << 32 | (long) (i_465_ << 16) | (long) i_466_);
							int i_470_ = is_437_[i_462_];
							int i_471_ = is_438_[i_462_];
							int i_472_ = 74;
							int i_473_ = 0;
							float f_474_ = 1.0F;
							float f_475_;
							float f_476_;
							float f_477_;
							if (i_470_ == 0 && i_471_ == 0) {
								f_475_ = f;
								f_476_ = f_443_;
								f_477_ = f_444_;
								i_472_ -= i_454_;
							} else if (i_470_ == 0 && i_471_ == anInt1752 * 1048375491) {
								f_475_ = f_445_;
								f_476_ = f_446_;
								f_477_ = f_447_;
								i_472_ -= i_455_;
							} else if (i_470_ == anInt1752 * 1048375491 && i_471_ == anInt1752 * 1048375491) {
								f_475_ = f_448_;
								f_476_ = f_449_;
								f_477_ = f_450_;
								i_472_ -= i_456_;
							} else if (i_470_ == anInt1752 * 1048375491 && i_471_ == 0) {
								f_475_ = f_451_;
								f_476_ = f_452_;
								f_477_ = f_453_;
								i_472_ -= i_457_;
							} else {
								float f_478_ = ((float) i_470_ / (float) (anInt1752 * 1048375491));
								float f_479_ = ((float) i_471_ / (float) (anInt1752 * 1048375491));
								float f_480_ = f + (f_451_ - f) * f_478_;
								float f_481_ = f_443_ + (f_452_ - f_443_) * f_478_;
								float f_482_ = f_444_ + (f_453_ - f_444_) * f_478_;
								float f_483_ = f_445_ + (f_448_ - f_445_) * f_478_;
								float f_484_ = f_446_ + (f_449_ - f_446_) * f_478_;
								float f_485_ = f_447_ + (f_450_ - f_447_) * f_478_;
								f_475_ = f_480_ + (f_483_ - f_480_) * f_479_;
								f_476_ = f_481_ + (f_484_ - f_481_) * f_479_;
								f_477_ = f_482_ + (f_485_ - f_482_) * f_479_;
								int i_486_ = i_454_ + ((i_457_ - i_454_) * i_470_ >> anInt1753 * 1252000143);
								int i_487_ = i_455_ + ((i_456_ - i_455_) * i_470_ >> anInt1753 * 1252000143);
								i_472_ -= i_486_ + ((i_487_ - i_486_) * i_471_ >> anInt1753 * 1252000143);
							}
							if (i_467_ != -1) {
								int i_488_ = (i_467_ & 0x7f) * i_472_ >> 7;
								if (i_488_ < 2)
									i_488_ = 2;
								else if (i_488_ > 126)
									i_488_ = 126;
								i_473_ = (Class656.anIntArray8390[i_467_ & 0xff80 | i_488_]);
								if ((anInt9270 & 0x7) == 0) {
									f_474_ = ((aClass180_Sub3_9262.aFloatArray9773[0]) * f_475_ + (aClass180_Sub3_9262.aFloatArray9773[1]) * f_476_ + (aClass180_Sub3_9262.aFloatArray9773[2]) * f_477_);
									f_474_ = (aClass180_Sub3_9262.aFloat9779 + f_474_ * (f_474_ > 0.0F ? (aClass180_Sub3_9262.aFloat9780) : (aClass180_Sub3_9262.aFloat9781)));
								}
							}
							Class527 class527 = null;
							if ((i_463_ & anInt9289 - 1) == 0 && (i_464_ & anInt9289 - 1) == 0)
								class527 = class14.method709(l);
							int i_489_;
							if (class527 == null) {
								int i_490_;
								if (i_468_ != i_467_) {
									int i_491_ = (i_468_ & 0x7f) * i_472_ >> 7;
									if (i_491_ < 2)
										i_491_ = 2;
									else if (i_491_ > 126)
										i_491_ = 126;
									i_490_ = (Class656.anIntArray8390[i_468_ & 0xff80 | i_491_]);
									if ((anInt9270 & 0x7) == 0) {
										float f_492_ = ((aClass180_Sub3_9262.aFloatArray9773[0]) * f_475_ + (aClass180_Sub3_9262.aFloatArray9773[1]) * f_476_ + ((aClass180_Sub3_9262.aFloatArray9773[2]) * f_477_));
										f_492_ = (aClass180_Sub3_9262.aFloat9779 + (f_474_ * (f_474_ > 0.0F ? (aClass180_Sub3_9262.aFloat9780) : (aClass180_Sub3_9262.aFloat9781))));
										int i_493_ = i_490_ >> 16 & 0xff;
										int i_494_ = i_490_ >> 8 & 0xff;
										int i_495_ = i_490_ & 0xff;
										i_493_ *= f_492_;
										if (i_493_ < 0)
											i_493_ = 0;
										else if (i_493_ > 255)
											i_493_ = 255;
										i_494_ *= f_492_;
										if (i_494_ < 0)
											i_494_ = 0;
										else if (i_494_ > 255)
											i_494_ = 255;
										i_495_ *= f_492_;
										if (i_495_ < 0)
											i_495_ = 0;
										else if (i_495_ > 255)
											i_495_ = 255;
										i_490_ = (i_493_ << 16 | i_494_ << 8 | i_495_);
									}
								} else
									i_490_ = i_473_;
								if (aClass180_Sub3_9262.aBool9788) {
									stream.method1707((float) i_463_);
									stream.method1707((float) (method2593(i_463_, i_464_, -1151432033) + i_469_));
									stream.method1707((float) i_464_);
									stream.method1706((byte) (i_490_ >> 16));
									stream.method1706((byte) (i_490_ >> 8));
									stream.method1706((byte) i_490_);
									stream.method1706(-1);
									stream.method1707((float) i_463_);
									stream.method1707((float) i_464_);
									if (anIntArrayArrayArray9276 != null)
										stream.method1707(is_442_ != null ? (float) ((is_442_[i_462_]) - 1) : 0.0F);
									if ((anInt9270 & 0x7) != 0) {
										stream.method1707(f_475_);
										stream.method1707(f_476_);
										stream.method1707(f_477_);
									}
								} else {
									stream.method1708((float) i_463_);
									stream.method1708((float) (method2593(i_463_, i_464_, -1151432033) + i_469_));
									stream.method1708((float) i_464_);
									stream.method1706((byte) (i_490_ >> 16));
									stream.method1706((byte) (i_490_ >> 8));
									stream.method1706((byte) i_490_);
									stream.method1706(-1);
									stream.method1708((float) i_463_);
									stream.method1708((float) i_464_);
									if (anIntArrayArrayArray9276 != null)
										stream.method1708(is_442_ != null ? (float) ((is_442_[i_462_]) - 1) : 0.0F);
									if ((anInt9270 & 0x7) != 0) {
										stream.method1708(f_475_);
										stream.method1708(f_476_);
										stream.method1708(f_477_);
									}
								}
								i_489_ = anInt9267++;
								is_461_[i_462_] = (short) i_489_;
								if (i_467_ != -1)
									class527_sub14s[i_489_] = class527_sub14s_436_[i_462_];
								class14.method714(new Class527_Sub13(is_461_[i_462_]), l);
							} else {
								is_461_[i_462_] = ((Class527_Sub13) class527).aShort10445;
								i_489_ = is_461_[i_462_] & 0xffff;
								if (i_467_ != -1 && ((class527_sub14s_436_[i_462_].aLong7106 * -8168620736534281759L) < (class527_sub14s[i_489_].aLong7106 * -8168620736534281759L)))
									class527_sub14s[i_489_] = class527_sub14s_436_[i_462_];
							}
							for (int i_496_ = 0; i_496_ < i_458_; i_496_++)
								class527_sub14s_433_[i_496_].method16105(i_489_, i_473_, i_472_, f_474_);
							anInt9268++;
						}
					}
				}
			}
			for (int i_497_ = 0; i_497_ < anInt9267; i_497_++) {
				Class527_Sub14 class527_sub14 = class527_sub14s[i_497_];
				if (class527_sub14 != null)
					class527_sub14.method16115(i_497_);
			}
			for (int i_498_ = 0; i_498_ < anInt1750 * 1210322533; i_498_++) {
				for (int i_499_ = 0; i_499_ < anInt1751 * -533476177; i_499_++) {
					short[] is_500_ = (aShortArrayArray9261[i_499_ * (anInt1750 * 1210322533) + i_498_]);
					if (is_500_ != null) {
						int i_501_ = 0;
						int i_502_ = 0;
						while (i_502_ < is_500_.length) {
							int i_503_ = is_500_[i_502_++] & 0xffff;
							int i_504_ = is_500_[i_502_++] & 0xffff;
							int i_505_ = is_500_[i_502_++] & 0xffff;
							Class527_Sub14 class527_sub14 = class527_sub14s[i_503_];
							Class527_Sub14 class527_sub14_506_ = class527_sub14s[i_504_];
							Class527_Sub14 class527_sub14_507_ = class527_sub14s[i_505_];
							Class527_Sub14 class527_sub14_508_ = null;
							if (class527_sub14 != null) {
								class527_sub14.method16104(i_498_, i_499_, i_501_);
								class527_sub14_508_ = class527_sub14;
							}
							if (class527_sub14_506_ != null) {
								class527_sub14_506_.method16104(i_498_, i_499_, i_501_);
								if (class527_sub14_508_ == null || ((class527_sub14_506_.aLong7106 * -8168620736534281759L) < (class527_sub14_508_.aLong7106 * -8168620736534281759L)))
									class527_sub14_508_ = class527_sub14_506_;
							}
							if (class527_sub14_507_ != null) {
								class527_sub14_507_.method16104(i_498_, i_499_, i_501_);
								if (class527_sub14_508_ == null || ((class527_sub14_507_.aLong7106 * -8168620736534281759L) < (class527_sub14_508_.aLong7106 * -8168620736534281759L)))
									class527_sub14_508_ = class527_sub14_507_;
							}
							if (class527_sub14_508_ != null) {
								if (class527_sub14 != null)
									class527_sub14_508_.method16115(i_503_);
								if (class527_sub14_506_ != null)
									class527_sub14_508_.method16115(i_504_);
								if (class527_sub14_507_ != null)
									class527_sub14_508_.method16115(i_505_);
								class527_sub14_508_.method16104(i_498_, i_499_, i_501_);
							}
							i_501_++;
						}
					}
				}
			}
			stream.method1709();
			anInterface15_9277 = aClass180_Sub3_9262.method15435(i, nativeheapbuffer, stream.method1704(), false);
			if (anInterface15_9277 instanceof Class120_Sub1)
				nativeheapbuffer.method1679();
			aClass129_9282 = new Class129(anInterface15_9277, 5126, 3, 0);
			aClass129_9283 = new Class129(anInterface15_9277, 5121, 4, 12);
			int i_509_;
			if (anIntArrayArrayArray9276 != null) {
				aClass129_9281 = new Class129(anInterface15_9277, 5126, 3, 16);
				i_509_ = 28;
			} else {
				aClass129_9281 = new Class129(anInterface15_9277, 5126, 2, 16);
				i_509_ = 24;
			}
			if ((anInt9270 & 0x7) != 0)
				aClass129_9284 = new Class129(anInterface15_9277, 5126, 3, i_509_);
			long[] ls = new long[aClass527Array9280.length];
			for (int i_510_ = 0; i_510_ < aClass527Array9280.length; i_510_++) {
				Class527_Sub14 class527_sub14 = (Class527_Sub14) aClass527Array9280[i_510_];
				ls[i_510_] = class527_sub14.aLong7106 * -8168620736534281759L;
				class527_sub14.method16116(anInt9267);
			}
			Class509.method8418(ls, aClass527Array9280, (byte) -89);
			if (aClass141_9278 != null)
				aClass141_9278.method2343();
		} else
			aClass141_9278 = null;
		if ((anInt9260 & 0x2) == 0) {
			anIntArrayArrayArray9265 = null;
			anIntArrayArrayArray9293 = null;
			anIntArrayArrayArray9271 = null;
		}
		anIntArrayArrayArray9276 = null;
		anIntArrayArrayArray9272 = null;
		anIntArrayArrayArray9275 = null;
		aClass527_Sub14ArrayArrayArray9269 = null;
		aByteArrayArray9288 = null;
		aClass14_9292 = null;
		aFloatArrayArray9291 = null;
		aFloatArrayArray9290 = null;
		aFloatArrayArray9264 = null;
	}
}

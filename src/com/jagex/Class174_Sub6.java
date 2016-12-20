/* Class174_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class174_Sub6 extends Class174 {
	byte[] aByteArray9909 = new byte[512];
	int anInt9910;
	Interface37 anInterface37_9911;
	Interface38 anInterface38_9912;
	Class180_Sub2 aClass180_Sub2_9913;
	int anInt9914;

	void method2762(char c, int i, int i_0_, int i_1_, boolean bool, Class142 class142, int i_2_, int i_3_) {
		/* empty */
	}

	void method2758(char c, int i, int i_4_, int i_5_, boolean bool) {
		if (aClass180_Sub2_9913.method14912() != Class342.aClass342_3690) {
			i += aByteArray9909[c * '\002'];
			i_4_ += aByteArray9909[c * '\002' + '\001'];
			aClass180_Sub2_9913.aClass365_9538.method6336((float) i, (float) i_4_, (float) (i + anInt9910), (float) (i_4_ + anInt9910), (float) (c % '\020') / 16.0F * anInterface38_9912.method233(), (float) (c / '\020') / 16.0F * anInterface38_9912.method222(), ((float) (c % '\020' + '\001') / 16.0F * anInterface38_9912.method233()), ((float) (c / '\020' + '\001') / 16.0F * anInterface38_9912.method222()), anInterface38_9912, i_5_);
		} else {
			aClass180_Sub2_9913.method14942();
			aClass180_Sub2_9913.method15238(1);
			Class334 class334 = aClass180_Sub2_9913.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9912;
			class334.method5851(0, i_5_);
			float f = (float) aClass180_Sub2_9913.method3285(1666110832).method2728();
			float f_6_ = (float) aClass180_Sub2_9913.method3285(1573251707).method2729();
			class334.aClass427_3633.method6815(2.0F / f, 2.0F / f_6_, 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9913.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_4_ + aClass180_Sub2_9913.method14911()) * 2.0F / f_6_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6742();
			class334.anInterface37_3636 = anInterface37_9911;
			class334.anInt3637 = c * '\004';
			class334.aClass355_3634 = aClass180_Sub2_9913.aClass355_9596;
			class334.method5856();
		}
	}

	Class174_Sub6(Class180_Sub2 class180_sub2, Class22 class22, Class185[] class185s, boolean bool) {
		super(class180_sub2, class22);
		aClass180_Sub2_9913 = class180_sub2;
		anInt9910 = 0;
		for (int i = 0; i < 256; i++) {
			Class185 class185 = class185s[i];
			if (class185.method3570() > anInt9910)
				anInt9910 = class185.method3570();
			if (class185.method3636() > anInt9910)
				anInt9910 = class185.method3636();
		}
		anInt9914 = anInt9910 * 16;
		if (bool) {
			byte[] is = new byte[anInt9914 * anInt9914];
			for (int i = 0; i < 256; i++) {
				Class185 class185 = class185s[i];
				int i_7_ = class185.method3570();
				int i_8_ = class185.method3636();
				int i_9_ = i % 16 * anInt9910;
				int i_10_ = i / 16 * anInt9910;
				int i_11_ = i_10_ * anInt9914 + i_9_;
				int i_12_ = 0;
				if (class185.method3567()) {
					Class185_Sub2 class185_sub2 = (Class185_Sub2) class185s[i];
					if (!class185_sub2.method3568()) {
						byte[] is_13_ = class185_sub2.aByteArray9371;
						for (int i_14_ = 0; i_14_ < i_7_; i_14_++) {
							for (int i_15_ = 0; i_15_ < i_8_; i_15_++)
								is[i_11_++] = (byte) (is_13_[i_12_++] == 0 ? 0 : -1);
							i_11_ += anInt9914 - i_8_;
						}
					} else {
						byte[] is_16_ = class185_sub2.aByteArray9379;
						for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
							for (int i_18_ = 0; i_18_ < i_8_; i_18_++)
								is[i_11_++] = is_16_[i_12_++];
							i_11_ += anInt9914 - i_8_;
						}
					}
				} else {
					Class185_Sub1 class185_sub1 = (Class185_Sub1) class185s[i];
					int[] is_19_ = class185_sub1.method3584(false);
					if (!class185_sub1.method3568()) {
						for (int i_20_ = 0; i_20_ < i_7_; i_20_++) {
							for (int i_21_ = 0; i_21_ < i_8_; i_21_++) {
								int i_22_ = is_19_[i_12_++];
								byte i_23_ = (byte) (((i_22_ >> 16 & 0xff) * 3 + (i_22_ >> 8 & 0xff) * 4 + (i_22_ & 0xff)) >> 3);
								is[i_11_++] = i_23_;
							}
							i_11_ += anInt9914 - i_8_;
						}
					} else {
						for (int i_24_ = 0; i_24_ < i_7_; i_24_++) {
							for (int i_25_ = 0; i_25_ < i_8_; i_25_++)
								is[i_11_++] = (byte) (is_19_[i_12_++] >> 24 & 0xff);
							i_11_ += anInt9914 - i_8_;
						}
					}
				}
			}
			int[] is_26_ = new int[is.length];
			for (int i = 0; i < is.length; i++)
				is_26_[i] = is[i] << 24 | 0xffffff;
			anInterface38_9912 = class180_sub2.method14962(anInt9914, anInt9914, false, is_26_);
		} else {
			int[] is = new int[anInt9914 * anInt9914];
			for (int i = 0; i < 256; i++) {
				Class185 class185 = class185s[i];
				int i_27_ = class185.method3570();
				int i_28_ = class185.method3636();
				int i_29_ = i % 16 * anInt9910;
				int i_30_ = i / 16 * anInt9910;
				int i_31_ = i_30_ * anInt9914 + i_29_;
				int i_32_ = 0;
				if (class185.method3567()) {
					Class185_Sub2 class185_sub2 = (Class185_Sub2) class185s[i];
					int[] is_33_ = class185_sub2.anIntArray9377;
					byte[] is_34_ = class185_sub2.aByteArray9379;
					byte[] is_35_ = class185_sub2.aByteArray9371;
					if (is_34_ != null) {
						for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
							for (int i_37_ = 0; i_37_ < i_28_; i_37_++) {
								is[i_31_++] = (is_34_[i_32_] << 24 | is_33_[is_35_[i_32_] & 0xff]);
								i_32_++;
							}
							i_31_ += anInt9914 - i_28_;
						}
					} else {
						for (int i_38_ = 0; i_38_ < i_27_; i_38_++) {
							for (int i_39_ = 0; i_39_ < i_28_; i_39_++) {
								int i_40_;
								if ((i_40_ = is_35_[i_32_++]) != 0)
									is[i_31_++] = ~0xffffff | is_33_[i_40_ & 0xff];
								else
									i_31_++;
							}
							i_31_ += anInt9914 - i_28_;
						}
					}
				} else {
					Class185_Sub1 class185_sub1 = (Class185_Sub1) class185s[i];
					int[] is_41_ = class185_sub1.method3584(false);
					if (!class185_sub1.method3568()) {
						for (int i_42_ = 0; i_42_ < i_27_; i_42_++) {
							for (int i_43_ = 0; i_43_ < i_28_; i_43_++) {
								int i_44_ = is_41_[i_32_] & 0xffffff;
								is[i_31_++] = (i_44_ == 0 ? 0 : 255) << 24 | i_44_;
								i_32_++;
							}
							i_31_ += anInt9914 - i_28_;
						}
					} else {
						for (int i_45_ = 0; i_45_ < i_27_; i_45_++) {
							for (int i_46_ = 0; i_46_ < i_28_; i_46_++)
								is[i_31_++] = is_41_[i_32_++];
							i_31_ += anInt9914 - i_28_;
						}
					}
				}
			}
			anInterface38_9912 = class180_sub2.method14962(anInt9914, anInt9914, false, is);
		}
		anInterface38_9912.method273(Class343.aClass343_3691);
		anInterface37_9911 = class180_sub2.method15035(false);
		anInterface37_9911.method219(20480, 20);
		ByteBuffer bytebuffer = aClass180_Sub2_9913.aByteBuffer9438;
		bytebuffer.clear();
		float f = (anInterface38_9912.method224((float) anInt9914) / (float) anInt9914);
		float f_47_ = (anInterface38_9912.method264((float) anInt9914) / (float) anInt9914);
		for (int i = 0; i < 256; i++) {
			Class185 class185 = class185s[i];
			int i_48_ = class185.method3570();
			int i_49_ = class185.method3636();
			int i_50_ = class185.method3611();
			int i_51_ = class185.method3634();
			float f_52_ = (float) (i % 16 * anInt9910);
			float f_53_ = (float) (i / 16 * anInt9910);
			float f_54_ = f_52_ * f;
			float f_55_ = f_53_ * f_47_;
			float f_56_ = (f_52_ + (float) i_49_) * f;
			float f_57_ = (f_53_ + (float) i_48_) * f_47_;
			bytebuffer.putFloat((float) i_51_);
			bytebuffer.putFloat((float) i_50_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_54_);
			bytebuffer.putFloat(f_55_);
			bytebuffer.putFloat((float) i_51_);
			bytebuffer.putFloat((float) (i_50_ + i_48_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_54_);
			bytebuffer.putFloat(f_57_);
			bytebuffer.putFloat((float) (i_51_ + i_49_));
			bytebuffer.putFloat((float) (i_50_ + i_48_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_56_);
			bytebuffer.putFloat(f_57_);
			bytebuffer.putFloat((float) (i_51_ + i_49_));
			bytebuffer.putFloat((float) i_50_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_56_);
			bytebuffer.putFloat(f_55_);
		}
		anInterface37_9911.method213(0, bytebuffer.position(), aClass180_Sub2_9913.aLong9439);
		for (int i = 0; i < 256; i++) {
			Class185 class185 = class185s[i];
			aByteArray9909[i * 2] = (byte) class185.method3634();
			aByteArray9909[i * 2 + 1] = (byte) class185.method3611();
		}
	}

	void method2760(char c, int i, int i_58_, int i_59_, boolean bool) {
		if (aClass180_Sub2_9913.method14912() != Class342.aClass342_3690) {
			i += aByteArray9909[c * '\002'];
			i_58_ += aByteArray9909[c * '\002' + '\001'];
			aClass180_Sub2_9913.aClass365_9538.method6336((float) i, (float) i_58_, (float) (i + anInt9910), (float) (i_58_ + anInt9910), (float) (c % '\020') / 16.0F * anInterface38_9912.method233(), (float) (c / '\020') / 16.0F * anInterface38_9912.method222(), ((float) (c % '\020' + '\001') / 16.0F * anInterface38_9912.method233()), ((float) (c / '\020' + '\001') / 16.0F * anInterface38_9912.method222()), anInterface38_9912, i_59_);
		} else {
			aClass180_Sub2_9913.method14942();
			aClass180_Sub2_9913.method15238(1);
			Class334 class334 = aClass180_Sub2_9913.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9912;
			class334.method5851(0, i_59_);
			float f = (float) aClass180_Sub2_9913.method3285(1513928686).method2728();
			float f_60_ = (float) aClass180_Sub2_9913.method3285(450158422).method2729();
			class334.aClass427_3633.method6815(2.0F / f, 2.0F / f_60_, 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9913.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_58_ + aClass180_Sub2_9913.method14911()) * 2.0F / f_60_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6742();
			class334.anInterface37_3636 = anInterface37_9911;
			class334.anInt3637 = c * '\004';
			class334.aClass355_3634 = aClass180_Sub2_9913.aClass355_9596;
			class334.method5856();
		}
	}

	void method2761(char c, int i, int i_61_, int i_62_, boolean bool) {
		if (aClass180_Sub2_9913.method14912() != Class342.aClass342_3690) {
			i += aByteArray9909[c * '\002'];
			i_61_ += aByteArray9909[c * '\002' + '\001'];
			aClass180_Sub2_9913.aClass365_9538.method6336((float) i, (float) i_61_, (float) (i + anInt9910), (float) (i_61_ + anInt9910), (float) (c % '\020') / 16.0F * anInterface38_9912.method233(), (float) (c / '\020') / 16.0F * anInterface38_9912.method222(), ((float) (c % '\020' + '\001') / 16.0F * anInterface38_9912.method233()), ((float) (c / '\020' + '\001') / 16.0F * anInterface38_9912.method222()), anInterface38_9912, i_62_);
		} else {
			aClass180_Sub2_9913.method14942();
			aClass180_Sub2_9913.method15238(1);
			Class334 class334 = aClass180_Sub2_9913.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9912;
			class334.method5851(0, i_62_);
			float f = (float) aClass180_Sub2_9913.method3285(473273548).method2728();
			float f_63_ = (float) aClass180_Sub2_9913.method3285(2044210549).method2729();
			class334.aClass427_3633.method6815(2.0F / f, 2.0F / f_63_, 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9913.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_61_ + aClass180_Sub2_9913.method14911()) * 2.0F / f_63_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6742();
			class334.anInterface37_3636 = anInterface37_9911;
			class334.anInt3637 = c * '\004';
			class334.aClass355_3634 = aClass180_Sub2_9913.aClass355_9596;
			class334.method5856();
		}
	}

	void method2759(char c, int i, int i_64_, int i_65_, boolean bool, Class142 class142, int i_66_, int i_67_) {
		/* empty */
	}

	void method2763(char c, int i, int i_68_, int i_69_, boolean bool, Class142 class142, int i_70_, int i_71_) {
		/* empty */
	}
}

/* Class184_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class184_Sub5 extends Class184 {
	Class167_Sub3 aClass167_Sub3_9921;
	int anInt9922;
	Interface38 anInterface38_9923;
	byte[] aByteArray9924 = new byte[512];
	int anInt9925;
	Interface36 anInterface36_9926;

	void method2752(char c, int i, int i_0_, int i_1_, boolean bool, Class161 class161, int i_2_, int i_3_) {
		/* empty */
	}

	void method2755(char c, int i, int i_4_, int i_5_, boolean bool) {
		if (aClass167_Sub3_9921.method8726() != Class347.aClass347_3689) {
			i += aByteArray9924[c * '\002'];
			i_4_ += aByteArray9924[c * '\002' + '\001'];
			aClass167_Sub3_9921.aClass358_9563.method4695((float) i, (float) i_4_, (float) (i + anInt9925), (float) (i_4_ + anInt9925), (float) (c % '\020') / 16.0F * anInterface36_9926.method261(), (float) (c / '\020') / 16.0F * anInterface36_9926.method244(), ((float) (c % '\020' + '\001') / 16.0F * anInterface36_9926.method261()), ((float) (c / '\020' + '\001') / 16.0F * anInterface36_9926.method244()), anInterface36_9926, i_5_);
		} else {
			aClass167_Sub3_9921.method8943();
			aClass167_Sub3_9921.method8763(1);
			Class328 class328 = aClass167_Sub3_9921.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9926;
			class328.method4304(0, i_5_);
			float f = (float) aClass167_Sub3_9921.method2278((byte) 21).method2725();
			float f_6_ = (float) aClass167_Sub3_9921.method2278((byte) 61).method2726();
			class328.aClass443_3591.method5344(2.0F / f, 2.0F / f_6_, 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9921.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_4_ + aClass167_Sub3_9921.method8725()) * 2.0F / f_6_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5338();
			class328.anInterface38_3594 = anInterface38_9923;
			class328.anInt3588 = c * '\004';
			class328.aClass343_3596 = aClass167_Sub3_9921.aClass343_9707;
			class328.method4306();
		}
	}

	void method2751(char c, int i, int i_7_, int i_8_, boolean bool, Class161 class161, int i_9_, int i_10_) {
		/* empty */
	}

	void method2753(char c, int i, int i_11_, int i_12_, boolean bool) {
		if (aClass167_Sub3_9921.method8726() != Class347.aClass347_3689) {
			i += aByteArray9924[c * '\002'];
			i_11_ += aByteArray9924[c * '\002' + '\001'];
			aClass167_Sub3_9921.aClass358_9563.method4695((float) i, (float) i_11_, (float) (i + anInt9925), (float) (i_11_ + anInt9925), (float) (c % '\020') / 16.0F * anInterface36_9926.method261(), (float) (c / '\020') / 16.0F * anInterface36_9926.method244(), ((float) (c % '\020' + '\001') / 16.0F * anInterface36_9926.method261()), ((float) (c / '\020' + '\001') / 16.0F * anInterface36_9926.method244()), anInterface36_9926, i_12_);
		} else {
			aClass167_Sub3_9921.method8943();
			aClass167_Sub3_9921.method8763(1);
			Class328 class328 = aClass167_Sub3_9921.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9926;
			class328.method4304(0, i_12_);
			float f = (float) aClass167_Sub3_9921.method2278((byte) 18).method2725();
			float f_13_ = (float) aClass167_Sub3_9921.method2278((byte) 19).method2726();
			class328.aClass443_3591.method5344(2.0F / f, 2.0F / f_13_, 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9921.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_11_ + aClass167_Sub3_9921.method8725()) * 2.0F / f_13_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5338();
			class328.anInterface38_3594 = anInterface38_9923;
			class328.anInt3588 = c * '\004';
			class328.aClass343_3596 = aClass167_Sub3_9921.aClass343_9707;
			class328.method4306();
		}
	}

	Class184_Sub5(Class167_Sub3 class167_sub3, Class2 class2, Class179[] class179s, boolean bool) {
		super(class167_sub3, class2);
		aClass167_Sub3_9921 = class167_sub3;
		anInt9925 = 0;
		for (int i = 0; i < 256; i++) {
			Class179 class179 = class179s[i];
			if (class179.method2677() > anInt9925)
				anInt9925 = class179.method2677();
			if (class179.method2633() > anInt9925)
				anInt9925 = class179.method2633();
		}
		anInt9922 = anInt9925 * 16;
		if (bool) {
			byte[] is = new byte[anInt9922 * anInt9922];
			for (int i = 0; i < 256; i++) {
				Class179 class179 = class179s[i];
				int i_14_ = class179.method2677();
				int i_15_ = class179.method2633();
				int i_16_ = i % 16 * anInt9925;
				int i_17_ = i / 16 * anInt9925;
				int i_18_ = i_17_ * anInt9922 + i_16_;
				int i_19_ = 0;
				if (class179.method2631()) {
					Class179_Sub2 class179_sub2 = (Class179_Sub2) class179s[i];
					if (!class179_sub2.method2641()) {
						byte[] is_20_ = class179_sub2.aByteArray9820;
						for (int i_21_ = 0; i_21_ < i_14_; i_21_++) {
							for (int i_22_ = 0; i_22_ < i_15_; i_22_++)
								is[i_18_++] = (byte) (is_20_[i_19_++] == 0 ? 0 : -1);
							i_18_ += anInt9922 - i_15_;
						}
					} else {
						byte[] is_23_ = class179_sub2.aByteArray9821;
						for (int i_24_ = 0; i_24_ < i_14_; i_24_++) {
							for (int i_25_ = 0; i_25_ < i_15_; i_25_++)
								is[i_18_++] = is_23_[i_19_++];
							i_18_ += anInt9922 - i_15_;
						}
					}
				} else {
					Class179_Sub1 class179_sub1 = (Class179_Sub1) class179s[i];
					int[] is_26_ = class179_sub1.method2643(false);
					if (!class179_sub1.method2641()) {
						for (int i_27_ = 0; i_27_ < i_14_; i_27_++) {
							for (int i_28_ = 0; i_28_ < i_15_; i_28_++) {
								int i_29_ = is_26_[i_19_++];
								byte i_30_ = (byte) (((i_29_ >> 16 & 0xff) * 3 + (i_29_ >> 8 & 0xff) * 4 + (i_29_ & 0xff)) >> 3);
								is[i_18_++] = i_30_;
							}
							i_18_ += anInt9922 - i_15_;
						}
					} else {
						for (int i_31_ = 0; i_31_ < i_14_; i_31_++) {
							for (int i_32_ = 0; i_32_ < i_15_; i_32_++)
								is[i_18_++] = (byte) (is_26_[i_19_++] >> 24 & 0xff);
							i_18_ += anInt9922 - i_15_;
						}
					}
				}
			}
			int[] is_33_ = new int[is.length];
			for (int i = 0; i < is.length; i++)
				is_33_[i] = is[i] << 24 | 0xffffff;
			anInterface36_9926 = class167_sub3.method8771(anInt9922, anInt9922, false, is_33_);
		} else {
			int[] is = new int[anInt9922 * anInt9922];
			for (int i = 0; i < 256; i++) {
				Class179 class179 = class179s[i];
				int i_34_ = class179.method2677();
				int i_35_ = class179.method2633();
				int i_36_ = i % 16 * anInt9925;
				int i_37_ = i / 16 * anInt9925;
				int i_38_ = i_37_ * anInt9922 + i_36_;
				int i_39_ = 0;
				if (class179.method2631()) {
					Class179_Sub2 class179_sub2 = (Class179_Sub2) class179s[i];
					int[] is_40_ = class179_sub2.anIntArray9813;
					byte[] is_41_ = class179_sub2.aByteArray9821;
					byte[] is_42_ = class179_sub2.aByteArray9820;
					if (is_41_ != null) {
						for (int i_43_ = 0; i_43_ < i_34_; i_43_++) {
							for (int i_44_ = 0; i_44_ < i_35_; i_44_++) {
								is[i_38_++] = (is_41_[i_39_] << 24 | is_40_[is_42_[i_39_] & 0xff]);
								i_39_++;
							}
							i_38_ += anInt9922 - i_35_;
						}
					} else {
						for (int i_45_ = 0; i_45_ < i_34_; i_45_++) {
							for (int i_46_ = 0; i_46_ < i_35_; i_46_++) {
								int i_47_;
								if ((i_47_ = is_42_[i_39_++]) != 0)
									is[i_38_++] = ~0xffffff | is_40_[i_47_ & 0xff];
								else
									i_38_++;
							}
							i_38_ += anInt9922 - i_35_;
						}
					}
				} else {
					Class179_Sub1 class179_sub1 = (Class179_Sub1) class179s[i];
					int[] is_48_ = class179_sub1.method2643(false);
					if (!class179_sub1.method2641()) {
						for (int i_49_ = 0; i_49_ < i_34_; i_49_++) {
							for (int i_50_ = 0; i_50_ < i_35_; i_50_++) {
								int i_51_ = is_48_[i_39_] & 0xffffff;
								is[i_38_++] = (i_51_ == 0 ? 0 : 255) << 24 | i_51_;
								i_39_++;
							}
							i_38_ += anInt9922 - i_35_;
						}
					} else {
						for (int i_52_ = 0; i_52_ < i_34_; i_52_++) {
							for (int i_53_ = 0; i_53_ < i_35_; i_53_++)
								is[i_38_++] = is_48_[i_39_++];
							i_38_ += anInt9922 - i_35_;
						}
					}
				}
			}
			anInterface36_9926 = class167_sub3.method8771(anInt9922, anInt9922, false, is);
		}
		anInterface36_9926.method274(Class342.aClass342_3662);
		anInterface38_9923 = class167_sub3.method8805(false);
		anInterface38_9923.method271(20480, 20);
		ByteBuffer bytebuffer = aClass167_Sub3_9921.aByteBuffer9549;
		bytebuffer.clear();
		float f = (anInterface36_9926.method219((float) anInt9922) / (float) anInt9922);
		float f_54_ = (anInterface36_9926.method220((float) anInt9922) / (float) anInt9922);
		for (int i = 0; i < 256; i++) {
			Class179 class179 = class179s[i];
			int i_55_ = class179.method2677();
			int i_56_ = class179.method2633();
			int i_57_ = class179.method2637();
			int i_58_ = class179.method2635();
			float f_59_ = (float) (i % 16 * anInt9925);
			float f_60_ = (float) (i / 16 * anInt9925);
			float f_61_ = f_59_ * f;
			float f_62_ = f_60_ * f_54_;
			float f_63_ = (f_59_ + (float) i_56_) * f;
			float f_64_ = (f_60_ + (float) i_55_) * f_54_;
			bytebuffer.putFloat((float) i_58_);
			bytebuffer.putFloat((float) i_57_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_61_);
			bytebuffer.putFloat(f_62_);
			bytebuffer.putFloat((float) i_58_);
			bytebuffer.putFloat((float) (i_57_ + i_55_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_61_);
			bytebuffer.putFloat(f_64_);
			bytebuffer.putFloat((float) (i_58_ + i_56_));
			bytebuffer.putFloat((float) (i_57_ + i_55_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_63_);
			bytebuffer.putFloat(f_64_);
			bytebuffer.putFloat((float) (i_58_ + i_56_));
			bytebuffer.putFloat((float) i_57_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_63_);
			bytebuffer.putFloat(f_62_);
		}
		anInterface38_9923.method264(0, bytebuffer.position(), aClass167_Sub3_9921.aLong9586);
		for (int i = 0; i < 256; i++) {
			Class179 class179 = class179s[i];
			aByteArray9924[i * 2] = (byte) class179.method2635();
			aByteArray9924[i * 2 + 1] = (byte) class179.method2637();
		}
	}

	void method2749(char c, int i, int i_65_, int i_66_, boolean bool, Class161 class161, int i_67_, int i_68_) {
		/* empty */
	}

	void method2762(char c, int i, int i_69_, int i_70_, boolean bool) {
		if (aClass167_Sub3_9921.method8726() != Class347.aClass347_3689) {
			i += aByteArray9924[c * '\002'];
			i_69_ += aByteArray9924[c * '\002' + '\001'];
			aClass167_Sub3_9921.aClass358_9563.method4695((float) i, (float) i_69_, (float) (i + anInt9925), (float) (i_69_ + anInt9925), (float) (c % '\020') / 16.0F * anInterface36_9926.method261(), (float) (c / '\020') / 16.0F * anInterface36_9926.method244(), ((float) (c % '\020' + '\001') / 16.0F * anInterface36_9926.method261()), ((float) (c / '\020' + '\001') / 16.0F * anInterface36_9926.method244()), anInterface36_9926, i_70_);
		} else {
			aClass167_Sub3_9921.method8943();
			aClass167_Sub3_9921.method8763(1);
			Class328 class328 = aClass167_Sub3_9921.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9926;
			class328.method4304(0, i_70_);
			float f = (float) aClass167_Sub3_9921.method2278((byte) -34).method2725();
			float f_71_ = (float) aClass167_Sub3_9921.method2278((byte) -77).method2726();
			class328.aClass443_3591.method5344(2.0F / f, 2.0F / f_71_, 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9921.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_69_ + aClass167_Sub3_9921.method8725()) * 2.0F / f_71_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5338();
			class328.anInterface38_3594 = anInterface38_9923;
			class328.anInt3588 = c * '\004';
			class328.aClass343_3596 = aClass167_Sub3_9921.aClass343_9707;
			class328.method4306();
		}
	}

	void method2756(char c, int i, int i_72_, int i_73_, boolean bool, Class161 class161, int i_74_, int i_75_) {
		/* empty */
	}

	void method2757(char c, int i, int i_76_, int i_77_, boolean bool, Class161 class161, int i_78_, int i_79_) {
		/* empty */
	}
}

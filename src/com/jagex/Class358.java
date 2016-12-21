/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class358 {
	Interface36[] anInterface36Array3812;
	Class347 aClass347_3813 = Class347.aClass347_3688;
	Class343 aClass343_3814;
	int anInt3815 = 128;
	int anInt3816 = 0;
	float[] aFloatArray3817 = new float[anInt3815 * 16];
	Class347 aClass347_3818;
	int[] anIntArray3819;
	Interface41 anInterface41_3820;
	Interface38 anInterface38_3821;
	int anInt3822;
	Class167_Sub3 aClass167_Sub3_3823;
	int[] anIntArray3824;

	void method4694() {
		if (anInt3816 != 0) {
			aClass167_Sub3_3823.method8929();
			aClass167_Sub3_3823.method8763(1);
			aClass167_Sub3_3823.method8809(anInterface41_3820);
			aClass167_Sub3_3823.method8808(0, anInterface38_3821);
			aClass167_Sub3_3823.method8807(aClass343_3814);
			Class336 class336 = aClass167_Sub3_3823.aClass336_9574;
			Unsafe unsafe = aClass167_Sub3_3823.anUnsafe9548;
			ByteBuffer bytebuffer = aClass167_Sub3_3823.aByteBuffer9549;
			bytebuffer.clear();
			aClass167_Sub3_3823.method8788().method5339(Class443.aClass443_4879);
			aClass167_Sub3_3823.method8826(Class367.aClass367_3861);
			int i = (anInt3816 + anInt3822 - 1) / anInt3822;
			int i_0_ = 0;
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				int i_3_ = Math.min(anInt3822, anInt3816 - i_0_);
				long l = anInterface38_3821.method263(0, i_3_ * 96);
				int i_4_ = i_2_ * anInt3822 + i_3_;
				for (int i_5_ = i_0_; i_5_ < i_4_; i_5_++) {
					for (int i_6_ = 0; i_6_ < 4; i_6_++) {
						unsafe.putFloat(l, aFloatArray3817[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3817[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3817[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3817[i_1_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3819[i_5_]);
						l += 4L;
					}
				}
				anInterface38_3821.method265();
				Interface36 interface36 = anInterface36Array3812[i_0_];
				int i_7_ = 1;
				int i_8_ = 0;
				for (int i_9_ = i_0_ + 1; i_9_ < i_4_; i_9_++) {
					if (interface36 == anInterface36Array3812[i_9_])
						i_7_++;
					else {
						class336.anInterface36_3630 = interface36;
						class336.method4379();
						aClass167_Sub3_3823.method8816(anInterface41_3820, Class377.aClass377_3917, i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
						interface36 = anInterface36Array3812[i_9_];
						i_7_ = 1;
						i_8_ = i_9_ - i_0_;
					}
				}
				class336.anInterface36_3630 = interface36;
				class336.method4379();
				aClass167_Sub3_3823.method8816(anInterface41_3820, Class377.aClass377_3917, i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
				i_0_ += anInt3822;
			}
			anInt3816 = 0;
		}
	}

	void method4695(float f, float f_10_, float f_11_, float f_12_, float f_13_, float f_14_, float f_15_, float f_16_, Interface36 interface36, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass167_Sub3_3823.method2054(anIntArray3824);
			int i_17_ = anIntArray3824[0];
			int i_18_ = anIntArray3824[1];
			int i_19_ = anIntArray3824[2];
			int i_20_ = anIntArray3824[3];
			if (!(f > (float) i_19_) && !(f_10_ > (float) i_20_) && !(f_11_ < (float) i_17_) && !(f_12_ < (float) i_18_)) {
				float f_21_ = f_11_ - f;
				float f_22_ = f_12_ - f_10_;
				float f_23_ = f_15_ - f_13_;
				float f_24_ = f_16_ - f_14_;
				if (f < (float) i_17_) {
					f_13_ += ((float) i_17_ - f) / f_21_ * f_23_;
					f = (float) i_17_;
				}
				if (f_10_ < (float) i_18_) {
					f_14_ += ((float) i_18_ - f_10_) / f_22_ * f_24_;
					f_10_ = (float) i_18_;
				}
				if (f_11_ > (float) i_19_) {
					f_15_ -= (f_11_ - (float) i_19_) / f_21_ * f_23_;
					f_11_ = (float) i_19_;
				}
				if (f_12_ > (float) i_20_) {
					f_16_ -= (f_12_ - (float) i_20_) / f_22_ * f_24_;
					f_12_ = (float) i_20_;
				}
				method4698();
				f = method4696(f);
				f_10_ = method4700(f_10_);
				f_11_ = method4696(f_11_);
				f_12_ = method4700(f_12_);
				aFloatArray3817[anInt3816 * 16 + 0] = f;
				aFloatArray3817[anInt3816 * 16 + 1] = f_10_;
				aFloatArray3817[anInt3816 * 16 + 2] = f_13_;
				aFloatArray3817[anInt3816 * 16 + 3] = f_14_;
				aFloatArray3817[anInt3816 * 16 + 4] = f_11_;
				aFloatArray3817[anInt3816 * 16 + 5] = f_10_;
				aFloatArray3817[anInt3816 * 16 + 6] = f_15_;
				aFloatArray3817[anInt3816 * 16 + 7] = f_14_;
				aFloatArray3817[anInt3816 * 16 + 8] = f;
				aFloatArray3817[anInt3816 * 16 + 9] = f_12_;
				aFloatArray3817[anInt3816 * 16 + 10] = f_13_;
				aFloatArray3817[anInt3816 * 16 + 11] = f_16_;
				aFloatArray3817[anInt3816 * 16 + 12] = f_11_;
				aFloatArray3817[anInt3816 * 16 + 13] = f_12_;
				aFloatArray3817[anInt3816 * 16 + 14] = f_15_;
				aFloatArray3817[anInt3816 * 16 + 15] = f_16_;
				anInterface36Array3812[anInt3816] = interface36;
				if (aClass167_Sub3_3823.anInt9689 == 1)
					anIntArray3819[anInt3816] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
				else
					anIntArray3819[anInt3816] = i;
				anInt3816++;
				if (aClass347_3813 == Class347.aClass347_3690)
					method4694();
			}
		}
	}

	Class358(Class167_Sub3 class167_sub3, int i) {
		anInterface36Array3812 = new Interface36[anInt3815];
		anIntArray3819 = new int[anInt3815];
		anIntArray3824 = new int[4];
		aClass167_Sub3_3823 = class167_sub3;
		anInterface38_3821 = aClass167_Sub3_3823.method8805(true);
		anInterface38_3821.method271(i * 96, 24);
		aClass343_3814 = (aClass167_Sub3_3823.method8806(new Class362[] { new Class362(new Class355[] { Class355.aClass355_3763, Class355.aClass355_3761, Class355.aClass355_3759 }) }));
		anInterface41_3820 = aClass167_Sub3_3823.method8804(false);
		int i_25_ = i * 6;
		anInterface41_3820.method283(i_25_);
		int i_26_ = i_25_ * (anInterface41_3820.method281().anInt1898 * -147747987);
		ByteBuffer bytebuffer = aClass167_Sub3_3823.aByteBuffer9549;
		aClass167_Sub3_3823.method8713(i_26_);
		bytebuffer.clear();
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			bytebuffer.putShort((short) (i_27_ * 4));
			bytebuffer.putShort((short) (i_27_ * 4 + 2));
			bytebuffer.putShort((short) (i_27_ * 4 + 1));
			bytebuffer.putShort((short) (i_27_ * 4 + 2));
			bytebuffer.putShort((short) (i_27_ * 4 + 3));
			bytebuffer.putShort((short) (i_27_ * 4 + 1));
		}
		anInterface41_3820.method264(0, i_25_ * ((anInterface41_3820.method281().anInt1898) * -147747987), aClass167_Sub3_3823.aLong9586);
		anInt3822 = i;
		anInt3816 = 0;
	}

	float method4696(float f) {
		int i = aClass167_Sub3_3823.method2278((byte) -23).method2725();
		float f_28_ = (f + aClass167_Sub3_3823.method8725()) / (float) i * 2.0F - 1.0F;
		return f_28_;
	}

	void method4697(float f, float f_29_, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_, float f_38_, float f_39_, float f_40_, float f_41_, float f_42_, float f_43_, Interface36 interface36, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass167_Sub3_3823.method2054(anIntArray3824);
			int i_44_ = anIntArray3824[0];
			int i_45_ = anIntArray3824[1];
			int i_46_ = anIntArray3824[2];
			int i_47_ = anIntArray3824[3];
			int i_48_ = 0;
			int i_49_ = ((f < (float) i_44_ ? 1 : 0) + (f_30_ < (float) i_44_ ? 1 : 0) + (f_32_ < (float) i_44_ ? 1 : 0) + (f_34_ < (float) i_44_ ? 1 : 0));
			if (i_49_ != 4) {
				i_48_ |= i_49_;
				i_49_ = ((f > (float) i_46_ ? 1 : 0) + (f_30_ > (float) i_46_ ? 1 : 0) + (f_32_ > (float) i_46_ ? 1 : 0) + (f_34_ > (float) i_46_ ? 1 : 0));
				if (i_49_ != 4) {
					i_48_ |= i_49_;
					i_49_ = ((f_29_ < (float) i_45_ ? 1 : 0) + (f_31_ < (float) i_45_ ? 1 : 0) + (f_33_ < (float) i_45_ ? 1 : 0) + (f_35_ < (float) i_45_ ? 1 : 0));
					if (i_49_ != 4) {
						i_48_ |= i_49_;
						i_49_ = ((f_29_ > (float) i_47_ ? 1 : 0) + (f_31_ > (float) i_47_ ? 1 : 0) + (f_33_ > (float) i_47_ ? 1 : 0) + (f_35_ > (float) i_47_ ? 1 : 0));
						if (i_49_ != 4) {
							i_48_ |= i_49_;
							if (i_48_ != 0) {
								method4694();
								aClass167_Sub3_3823.method2245(true);
								aClass167_Sub3_3823.method2369(i_44_, i_45_, i_46_, i_47_);
							}
							method4698();
							f = method4696(f);
							f_29_ = method4700(f_29_);
							f_30_ = method4696(f_30_);
							f_31_ = method4700(f_31_);
							f_32_ = method4696(f_32_);
							f_33_ = method4700(f_33_);
							f_34_ = method4696(f_34_);
							f_35_ = method4700(f_35_);
							aFloatArray3817[anInt3816 * 16 + 0] = f;
							aFloatArray3817[anInt3816 * 16 + 1] = f_29_;
							aFloatArray3817[anInt3816 * 16 + 2] = f_36_;
							aFloatArray3817[anInt3816 * 16 + 3] = f_37_;
							aFloatArray3817[anInt3816 * 16 + 4] = f_30_;
							aFloatArray3817[anInt3816 * 16 + 5] = f_31_;
							aFloatArray3817[anInt3816 * 16 + 6] = f_38_;
							aFloatArray3817[anInt3816 * 16 + 7] = f_39_;
							aFloatArray3817[anInt3816 * 16 + 8] = f_32_;
							aFloatArray3817[anInt3816 * 16 + 9] = f_33_;
							aFloatArray3817[anInt3816 * 16 + 10] = f_40_;
							aFloatArray3817[anInt3816 * 16 + 11] = f_41_;
							aFloatArray3817[anInt3816 * 16 + 12] = f_34_;
							aFloatArray3817[anInt3816 * 16 + 13] = f_35_;
							aFloatArray3817[anInt3816 * 16 + 14] = f_42_;
							aFloatArray3817[anInt3816 * 16 + 15] = f_43_;
							anInterface36Array3812[anInt3816] = interface36;
							if (aClass167_Sub3_3823.anInt9689 == 1)
								anIntArray3819[anInt3816] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3819[anInt3816] = i;
							anInt3816++;
							if (aClass347_3813 == Class347.aClass347_3690 || i_48_ > 0)
								method4694();
							if (i_48_ != 0) {
								aClass167_Sub3_3823.method2245(false);
								aClass167_Sub3_3823.method2051();
								aClass167_Sub3_3823.method2369(i_44_, i_45_, i_46_, i_47_);
							}
						}
					}
				}
			}
		}
	}

	void method4698() {
		if (anInt3816 == anInt3815) {
			anInt3815 *= 2;
			float[] fs = new float[anInt3815 * 16];
			for (int i = 0; i < anInt3816 * 16; i++)
				fs[i] = aFloatArray3817[i];
			aFloatArray3817 = fs;
			Interface36[] interface36s = new Interface36[anInt3815];
			int[] is = new int[anInt3815];
			for (int i = 0; i < anInt3816; i++) {
				interface36s[i] = anInterface36Array3812[i];
				is[i] = anIntArray3819[i];
			}
			anInterface36Array3812 = interface36s;
			anIntArray3819 = is;
		}
	}

	void method4699() {
		aClass347_3818 = aClass347_3813;
		aClass347_3813 = Class347.aClass347_3689;
	}

	float method4700(float f) {
		int i = aClass167_Sub3_3823.method2278((byte) 94).method2726();
		float f_50_ = (((1.0F - (f + aClass167_Sub3_3823.method8725()) / (float) i) * 2.0F) - 1.0F);
		return f_50_;
	}

	void method4701() {
		aClass347_3818 = aClass347_3813;
		aClass347_3813 = Class347.aClass347_3689;
	}

	void method4702() {
		if (aClass347_3818 != null) {
			aClass347_3813 = aClass347_3818;
			aClass347_3818 = null;
		}
	}

	Class347 method4703() {
		return aClass347_3813;
	}

	void method4704() {
		anInterface38_3821.method131();
		anInterface41_3820.method131();
		anInterface38_3821 = null;
		anInterface41_3820 = null;
		aClass343_3814 = null;
		anInt3816 = 0;
	}

	void method4705() {
		aClass347_3818 = aClass347_3813;
		aClass347_3813 = Class347.aClass347_3689;
	}

	void method4706() {
		anInterface38_3821.method131();
		anInterface41_3820.method131();
		anInterface38_3821 = null;
		anInterface41_3820 = null;
		aClass343_3814 = null;
		anInt3816 = 0;
	}

	void method4707() {
		if (anInt3816 != 0) {
			aClass167_Sub3_3823.method8929();
			aClass167_Sub3_3823.method8763(1);
			aClass167_Sub3_3823.method8809(anInterface41_3820);
			aClass167_Sub3_3823.method8808(0, anInterface38_3821);
			aClass167_Sub3_3823.method8807(aClass343_3814);
			Class336 class336 = aClass167_Sub3_3823.aClass336_9574;
			Unsafe unsafe = aClass167_Sub3_3823.anUnsafe9548;
			ByteBuffer bytebuffer = aClass167_Sub3_3823.aByteBuffer9549;
			bytebuffer.clear();
			aClass167_Sub3_3823.method8788().method5339(Class443.aClass443_4879);
			aClass167_Sub3_3823.method8826(Class367.aClass367_3861);
			int i = (anInt3816 + anInt3822 - 1) / anInt3822;
			int i_51_ = 0;
			int i_52_ = 0;
			for (int i_53_ = 0; i_53_ < i; i_53_++) {
				int i_54_ = Math.min(anInt3822, anInt3816 - i_51_);
				long l = anInterface38_3821.method263(0, i_54_ * 96);
				int i_55_ = i_53_ * anInt3822 + i_54_;
				for (int i_56_ = i_51_; i_56_ < i_55_; i_56_++) {
					for (int i_57_ = 0; i_57_ < 4; i_57_++) {
						unsafe.putFloat(l, aFloatArray3817[i_52_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3817[i_52_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3817[i_52_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3817[i_52_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3819[i_56_]);
						l += 4L;
					}
				}
				anInterface38_3821.method265();
				Interface36 interface36 = anInterface36Array3812[i_51_];
				int i_58_ = 1;
				int i_59_ = 0;
				for (int i_60_ = i_51_ + 1; i_60_ < i_55_; i_60_++) {
					if (interface36 == anInterface36Array3812[i_60_])
						i_58_++;
					else {
						class336.anInterface36_3630 = interface36;
						class336.method4379();
						aClass167_Sub3_3823.method8816(anInterface41_3820, Class377.aClass377_3917, i_59_ * 4, i_58_ * 4, i_59_ * 6, i_58_ * 2);
						interface36 = anInterface36Array3812[i_60_];
						i_58_ = 1;
						i_59_ = i_60_ - i_51_;
					}
				}
				class336.anInterface36_3630 = interface36;
				class336.method4379();
				aClass167_Sub3_3823.method8816(anInterface41_3820, Class377.aClass377_3917, i_59_ * 4, i_58_ * 4, i_59_ * 6, i_58_ * 2);
				i_51_ += anInt3822;
			}
			anInt3816 = 0;
		}
	}

	void method4708() {
		if (anInt3816 == anInt3815) {
			anInt3815 *= 2;
			float[] fs = new float[anInt3815 * 16];
			for (int i = 0; i < anInt3816 * 16; i++)
				fs[i] = aFloatArray3817[i];
			aFloatArray3817 = fs;
			Interface36[] interface36s = new Interface36[anInt3815];
			int[] is = new int[anInt3815];
			for (int i = 0; i < anInt3816; i++) {
				interface36s[i] = anInterface36Array3812[i];
				is[i] = anIntArray3819[i];
			}
			anInterface36Array3812 = interface36s;
			anIntArray3819 = is;
		}
	}

	void method4709() {
		if (anInt3816 == anInt3815) {
			anInt3815 *= 2;
			float[] fs = new float[anInt3815 * 16];
			for (int i = 0; i < anInt3816 * 16; i++)
				fs[i] = aFloatArray3817[i];
			aFloatArray3817 = fs;
			Interface36[] interface36s = new Interface36[anInt3815];
			int[] is = new int[anInt3815];
			for (int i = 0; i < anInt3816; i++) {
				interface36s[i] = anInterface36Array3812[i];
				is[i] = anIntArray3819[i];
			}
			anInterface36Array3812 = interface36s;
			anIntArray3819 = is;
		}
	}

	void method4710() {
		anInterface38_3821.method131();
		anInterface41_3820.method131();
		anInterface38_3821 = null;
		anInterface41_3820 = null;
		aClass343_3814 = null;
		anInt3816 = 0;
	}

	float method4711(float f) {
		int i = aClass167_Sub3_3823.method2278((byte) -27).method2726();
		float f_61_ = (((1.0F - (f + aClass167_Sub3_3823.method8725()) / (float) i) * 2.0F) - 1.0F);
		return f_61_;
	}

	void method4712() {
		anInterface38_3821.method131();
		anInterface41_3820.method131();
		anInterface38_3821 = null;
		anInterface41_3820 = null;
		aClass343_3814 = null;
		anInt3816 = 0;
	}

	void method4713() {
		if (aClass347_3818 != null) {
			aClass347_3813 = aClass347_3818;
			aClass347_3818 = null;
		}
	}

	void method4714() {
		if (aClass347_3818 != null) {
			aClass347_3813 = aClass347_3818;
			aClass347_3818 = null;
		}
	}
}

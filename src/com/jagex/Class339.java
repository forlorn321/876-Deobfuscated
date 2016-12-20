/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class339 {
	Interface37 anInterface37_3657;
	int anInt3658 = 768;
	int[] anIntArray3659;
	Interface44 anInterface44_3660;
	Class355 aClass355_3661;
	Class522_Sub6_Sub1[][] aClass522_Sub6_Sub1ArrayArray3662;
	int anInt3663 = 1600;
	int anInt3664;
	int anInt3665 = 64;
	int[] anIntArray3666;
	Interface37 anInterface37_3667;
	int anInt3668 = 64;
	Class522_Sub6_Sub1[][] aClass522_Sub6_Sub1ArrayArray3669;
	int[] anIntArray3670;
	int anInt3671;
	static float aFloat3672;

	void method6017(int i, Class522_Sub6_Sub1 class522_sub6_sub1) {
		if (i < 1600) {
			if (anIntArray3659[i] < 64)
				aClass522_Sub6_Sub1ArrayArray3669[i][anIntArray3659[i]++] = class522_sub6_sub1;
			else {
				if (anIntArray3659[i] == 64) {
					if (anInt3671 == 64)
						return;
					anIntArray3659[i] += 1 + anInt3671++;
				}
				aClass522_Sub6_Sub1ArrayArray3662[anIntArray3659[i] - 64 - 1][anIntArray3670[anIntArray3659[i] - 64 - 1]++] = class522_sub6_sub1;
			}
		}
	}

	void method6018(Class180_Sub2 class180_sub2) {
		anInterface37_3667.method219(786336, 24);
	}

	void method6019() {
		anInterface37_3667.method129();
	}

	void method6020(Class180_Sub2 class180_sub2, Class182 class182) {
		class180_sub2.method3182(false);
		aFloat3672 = class180_sub2.aFloat9551;
		float f = class180_sub2.aClass427_9459.aFloatArray4807[2];
		float f_0_ = class180_sub2.aClass427_9459.aFloatArray4807[6];
		float f_1_ = class180_sub2.aClass427_9459.aFloatArray4807[10];
		float f_2_ = class180_sub2.aClass427_9459.aFloatArray4807[14];
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class522_Sub6 class522_sub6 = class182.aClass710_2094.aClass522_Sub6_8851;
		for (Class522_Sub6 class522_sub6_5_ = class522_sub6.aClass522_Sub6_10329; class522_sub6_5_ != class522_sub6; class522_sub6_5_ = class522_sub6_5_.aClass522_Sub6_10329) {
			Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_5_;
			int i_6_ = (int) (f * (float) (class522_sub6_sub1.anInt11411 >> 12) + f_0_ * (float) (class522_sub6_sub1.anInt11407 >> 12) + f_1_ * (float) (class522_sub6_sub1.anInt11403 >> 12) + f_2_);
			if (i_6_ > i_4_)
				i_4_ = i_6_;
			if (i_6_ < i_3_)
				i_3_ = i_6_;
			anIntArray3666[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
			i_8_ = 1 + Class15.method735(i_7_, (byte) -50) - anInt3664;
			i_7_ = (i_7_ >> i_8_) + 2;
		} else {
			i_8_ = 0;
			i_7_ += 2;
		}
		class180_sub2.method15001(anInterface44_3660);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5654(Class427.aClass427_4808);
		class313.aClass427_3501.method6742();
		class313.anInt3499 = -1;
		boolean bool = class180_sub2.anInt9562 > 0;
		if (bool) {
			class313.aClass441_3502.method7118(0.0F, 0.0F, 1.0F, -class180_sub2.aFloat9517);
			class313.aClass442_3503.method7138((float) (class180_sub2.anInt9561 >> 16 & 0xff) / 255.0F, (float) (class180_sub2.anInt9561 >> 8 & 0xff) / 255.0F, (float) (class180_sub2.anInt9561 >> 0 & 0xff) / 255.0F);
			class313.aClass441_3502.method7123(class180_sub2.aClass427_9454);
			class313.aClass441_3502.method7128(1.0F / (class180_sub2.aFloat9565 - class180_sub2.aFloat9517));
		} else {
			class313.aClass441_3502.method7118(0.0F, 0.0F, 0.0F, 0.0F);
			class313.aClass442_3503.method7138(0.0F, 0.0F, 0.0F);
		}
		method6031(class180_sub2, class522_sub6, i_7_, i_3_, i_8_, class313, bool);
		if (class180_sub2.aFloat9551 != aFloat3672)
			class180_sub2.method3478(aFloat3672);
		class180_sub2.method3182(true);
	}

	void method6021(Class180_Sub2 class180_sub2, int i, boolean bool) {
		int i_9_ = 0;
		Class427 class427 = class180_sub2.aClass427_9459;
		float f = class427.aFloatArray4807[0];
		float f_10_ = class427.aFloatArray4807[4];
		float f_11_ = class427.aFloatArray4807[8];
		float f_12_ = class427.aFloatArray4807[1];
		float f_13_ = class427.aFloatArray4807[5];
		float f_14_ = class427.aFloatArray4807[9];
		float f_15_ = f + f_12_;
		float f_16_ = f_10_ + f_13_;
		float f_17_ = f_11_ + f_14_;
		float f_18_ = f - f_12_;
		float f_19_ = f_10_ - f_13_;
		float f_20_ = f_11_ - f_14_;
		float f_21_ = f_12_ - f;
		float f_22_ = f_13_ - f_10_;
		float f_23_ = f_14_ - f_11_;
		float[] fs = new float[3];
		float[] fs_24_ = new float[3];
		class180_sub2.aClass427_9435.method6823(class180_sub2.aClass427_9453);
		ByteBuffer bytebuffer = class180_sub2.aByteBuffer9438;
		bytebuffer.clear();
		for (int i_25_ = i - 1; i_25_ >= 0; i_25_--) {
			int i_26_ = anIntArray3659[i_25_] > 64 ? 64 : anIntArray3659[i_25_];
			if (i_26_ > 0) {
				for (int i_27_ = i_26_ - 1; i_27_ >= 0; i_27_--) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray3669[i_25_][i_27_];
					int i_28_ = class522_sub6_sub1.anInt11409;
					byte i_29_ = (byte) (i_28_ >> 16);
					byte i_30_ = (byte) (i_28_ >> 8);
					byte i_31_ = (byte) i_28_;
					byte i_32_ = (byte) (i_28_ >>> 24);
					if (class180_sub2.anInt9578 == 0) {
						byte i_33_ = i_29_;
						i_29_ = i_31_;
						i_31_ = i_33_;
					}
					float f_34_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
					float f_35_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
					float f_36_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
					int i_37_ = class522_sub6_sub1.anInt11408 >> 12;
					if (class522_sub6_sub1.aShort11406 != 0) {
						class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_37_, i_37_, 0.0F, 0.0F, 0.0F);
						class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
						class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
						class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_24_);
						bytebuffer.putFloat(f_34_ - fs[0] - fs_24_[0]);
						bytebuffer.putFloat(f_35_ - fs[1] - fs_24_[1]);
						bytebuffer.putFloat(f_36_ - fs[2] - fs_24_[2]);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_34_ - fs[0] + fs_24_[0]);
						bytebuffer.putFloat(f_35_ - fs[1] + fs_24_[1]);
						bytebuffer.putFloat(f_36_ - fs[2] + fs_24_[2]);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_34_ + fs[0] + fs_24_[0]);
						bytebuffer.putFloat(f_35_ + fs[1] + fs_24_[1]);
						bytebuffer.putFloat(f_36_ + fs[2] + fs_24_[2]);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_34_ + fs[0] - fs_24_[0]);
						bytebuffer.putFloat(f_35_ + fs[1] - fs_24_[1]);
						bytebuffer.putFloat(f_36_ + fs[2] - fs_24_[2]);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_34_ + f_15_ * (float) -i_37_);
						bytebuffer.putFloat(f_35_ + f_16_ * (float) -i_37_);
						bytebuffer.putFloat(f_36_ + f_17_ * (float) -i_37_);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_34_ + f_21_ * (float) i_37_);
						bytebuffer.putFloat(f_35_ + f_22_ * (float) i_37_);
						bytebuffer.putFloat(f_36_ + f_23_ * (float) i_37_);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_34_ + f_15_ * (float) i_37_);
						bytebuffer.putFloat(f_35_ + f_16_ * (float) i_37_);
						bytebuffer.putFloat(f_36_ + f_17_ * (float) i_37_);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_34_ + f_18_ * (float) i_37_);
						bytebuffer.putFloat(f_35_ + f_19_ * (float) i_37_);
						bytebuffer.putFloat(f_36_ + f_20_ * (float) i_37_);
						bytebuffer.put(i_29_);
						bytebuffer.put(i_30_);
						bytebuffer.put(i_31_);
						bytebuffer.put(i_32_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_9_++;
				}
				if (anIntArray3659[i_25_] > 64) {
					int i_38_ = anIntArray3659[i_25_] - 64 - 1;
					for (int i_39_ = anIntArray3670[i_38_] - 1; i_39_ >= 0; i_39_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray3662[i_38_][i_39_];
						int i_40_ = class522_sub6_sub1.anInt11409;
						byte i_41_ = (byte) (i_40_ >> 16);
						byte i_42_ = (byte) (i_40_ >> 8);
						byte i_43_ = (byte) i_40_;
						byte i_44_ = (byte) (i_40_ >>> 24);
						float f_45_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_46_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_47_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_48_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class180_sub2.anInt9578 == 0) {
							byte i_49_ = i_41_;
							i_41_ = i_43_;
							i_43_ = i_49_;
						}
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_48_, i_48_, 0.0F, 0.0F, 0.0F);
							class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
							class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_24_);
							bytebuffer.putFloat(f_45_ - fs[0] - fs_24_[0]);
							bytebuffer.putFloat(f_46_ - fs[1] - fs_24_[1]);
							bytebuffer.putFloat(f_47_ - fs[2] - fs_24_[2]);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_45_ - fs[0] + fs_24_[0]);
							bytebuffer.putFloat(f_46_ - fs[1] + fs_24_[1]);
							bytebuffer.putFloat(f_47_ - fs[2] + fs_24_[2]);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_45_ + fs[0] + fs_24_[0]);
							bytebuffer.putFloat(f_46_ + fs[1] + fs_24_[1]);
							bytebuffer.putFloat(f_47_ + fs[2] + fs_24_[2]);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_45_ + fs[0] - fs_24_[0]);
							bytebuffer.putFloat(f_46_ + fs[1] - fs_24_[1]);
							bytebuffer.putFloat(f_47_ + fs[2] - fs_24_[2]);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_45_ + f_15_ * (float) -i_48_);
							bytebuffer.putFloat(f_46_ + f_16_ * (float) -i_48_);
							bytebuffer.putFloat(f_47_ + f_17_ * (float) -i_48_);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_45_ + f_21_ * (float) i_48_);
							bytebuffer.putFloat(f_46_ + f_22_ * (float) i_48_);
							bytebuffer.putFloat(f_47_ + f_23_ * (float) i_48_);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_45_ + f_15_ * (float) i_48_);
							bytebuffer.putFloat(f_46_ + f_16_ * (float) i_48_);
							bytebuffer.putFloat(f_47_ + f_17_ * (float) i_48_);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_45_ + f_18_ * (float) i_48_);
							bytebuffer.putFloat(f_46_ + f_19_ * (float) i_48_);
							bytebuffer.putFloat(f_47_ + f_20_ * (float) i_48_);
							bytebuffer.put(i_41_);
							bytebuffer.put(i_42_);
							bytebuffer.put(i_43_);
							bytebuffer.put(i_44_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_9_++;
					}
				}
			}
		}
		anInterface37_3667.method213(0, bytebuffer.position(), class180_sub2.aLong9439);
		class180_sub2.method14988(0, anInterface37_3667);
		class180_sub2.method14988(1, anInterface37_3657);
		class180_sub2.method15149(aClass355_3661);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5655(i_9_, bool);
	}

	void method6022(int i, Class522_Sub6_Sub1 class522_sub6_sub1) {
		if (i < 1600) {
			if (anIntArray3659[i] < 64)
				aClass522_Sub6_Sub1ArrayArray3669[i][anIntArray3659[i]++] = class522_sub6_sub1;
			else {
				if (anIntArray3659[i] == 64) {
					if (anInt3671 == 64)
						return;
					anIntArray3659[i] += 1 + anInt3671++;
				}
				aClass522_Sub6_Sub1ArrayArray3662[anIntArray3659[i] - 64 - 1][anIntArray3670[anIntArray3659[i] - 64 - 1]++] = class522_sub6_sub1;
			}
		}
	}

	void method6023(Class180_Sub2 class180_sub2, int i, boolean bool) {
		int i_50_ = 0;
		Class427 class427 = class180_sub2.aClass427_9459;
		float f = class427.aFloatArray4807[0];
		float f_51_ = class427.aFloatArray4807[4];
		float f_52_ = class427.aFloatArray4807[8];
		float f_53_ = class427.aFloatArray4807[1];
		float f_54_ = class427.aFloatArray4807[5];
		float f_55_ = class427.aFloatArray4807[9];
		float f_56_ = f + f_53_;
		float f_57_ = f_51_ + f_54_;
		float f_58_ = f_52_ + f_55_;
		float f_59_ = f - f_53_;
		float f_60_ = f_51_ - f_54_;
		float f_61_ = f_52_ - f_55_;
		float f_62_ = f_53_ - f;
		float f_63_ = f_54_ - f_51_;
		float f_64_ = f_55_ - f_52_;
		float[] fs = new float[3];
		float[] fs_65_ = new float[3];
		class180_sub2.aClass427_9435.method6823(class180_sub2.aClass427_9453);
		ByteBuffer bytebuffer = class180_sub2.aByteBuffer9438;
		bytebuffer.clear();
		for (int i_66_ = i - 1; i_66_ >= 0; i_66_--) {
			int i_67_ = anIntArray3659[i_66_] > 64 ? 64 : anIntArray3659[i_66_];
			if (i_67_ > 0) {
				for (int i_68_ = i_67_ - 1; i_68_ >= 0; i_68_--) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray3669[i_66_][i_68_];
					int i_69_ = class522_sub6_sub1.anInt11409;
					byte i_70_ = (byte) (i_69_ >> 16);
					byte i_71_ = (byte) (i_69_ >> 8);
					byte i_72_ = (byte) i_69_;
					byte i_73_ = (byte) (i_69_ >>> 24);
					if (class180_sub2.anInt9578 == 0) {
						byte i_74_ = i_70_;
						i_70_ = i_72_;
						i_72_ = i_74_;
					}
					float f_75_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
					float f_76_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
					float f_77_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
					int i_78_ = class522_sub6_sub1.anInt11408 >> 12;
					if (class522_sub6_sub1.aShort11406 != 0) {
						class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_78_, i_78_, 0.0F, 0.0F, 0.0F);
						class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
						class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
						class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_65_);
						bytebuffer.putFloat(f_75_ - fs[0] - fs_65_[0]);
						bytebuffer.putFloat(f_76_ - fs[1] - fs_65_[1]);
						bytebuffer.putFloat(f_77_ - fs[2] - fs_65_[2]);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_75_ - fs[0] + fs_65_[0]);
						bytebuffer.putFloat(f_76_ - fs[1] + fs_65_[1]);
						bytebuffer.putFloat(f_77_ - fs[2] + fs_65_[2]);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_75_ + fs[0] + fs_65_[0]);
						bytebuffer.putFloat(f_76_ + fs[1] + fs_65_[1]);
						bytebuffer.putFloat(f_77_ + fs[2] + fs_65_[2]);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_75_ + fs[0] - fs_65_[0]);
						bytebuffer.putFloat(f_76_ + fs[1] - fs_65_[1]);
						bytebuffer.putFloat(f_77_ + fs[2] - fs_65_[2]);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_75_ + f_56_ * (float) -i_78_);
						bytebuffer.putFloat(f_76_ + f_57_ * (float) -i_78_);
						bytebuffer.putFloat(f_77_ + f_58_ * (float) -i_78_);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_75_ + f_62_ * (float) i_78_);
						bytebuffer.putFloat(f_76_ + f_63_ * (float) i_78_);
						bytebuffer.putFloat(f_77_ + f_64_ * (float) i_78_);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_75_ + f_56_ * (float) i_78_);
						bytebuffer.putFloat(f_76_ + f_57_ * (float) i_78_);
						bytebuffer.putFloat(f_77_ + f_58_ * (float) i_78_);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_75_ + f_59_ * (float) i_78_);
						bytebuffer.putFloat(f_76_ + f_60_ * (float) i_78_);
						bytebuffer.putFloat(f_77_ + f_61_ * (float) i_78_);
						bytebuffer.put(i_70_);
						bytebuffer.put(i_71_);
						bytebuffer.put(i_72_);
						bytebuffer.put(i_73_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_50_++;
				}
				if (anIntArray3659[i_66_] > 64) {
					int i_79_ = anIntArray3659[i_66_] - 64 - 1;
					for (int i_80_ = anIntArray3670[i_79_] - 1; i_80_ >= 0; i_80_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray3662[i_79_][i_80_];
						int i_81_ = class522_sub6_sub1.anInt11409;
						byte i_82_ = (byte) (i_81_ >> 16);
						byte i_83_ = (byte) (i_81_ >> 8);
						byte i_84_ = (byte) i_81_;
						byte i_85_ = (byte) (i_81_ >>> 24);
						float f_86_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_87_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_88_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_89_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class180_sub2.anInt9578 == 0) {
							byte i_90_ = i_82_;
							i_82_ = i_84_;
							i_84_ = i_90_;
						}
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_89_, i_89_, 0.0F, 0.0F, 0.0F);
							class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
							class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_65_);
							bytebuffer.putFloat(f_86_ - fs[0] - fs_65_[0]);
							bytebuffer.putFloat(f_87_ - fs[1] - fs_65_[1]);
							bytebuffer.putFloat(f_88_ - fs[2] - fs_65_[2]);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_86_ - fs[0] + fs_65_[0]);
							bytebuffer.putFloat(f_87_ - fs[1] + fs_65_[1]);
							bytebuffer.putFloat(f_88_ - fs[2] + fs_65_[2]);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_86_ + fs[0] + fs_65_[0]);
							bytebuffer.putFloat(f_87_ + fs[1] + fs_65_[1]);
							bytebuffer.putFloat(f_88_ + fs[2] + fs_65_[2]);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_86_ + fs[0] - fs_65_[0]);
							bytebuffer.putFloat(f_87_ + fs[1] - fs_65_[1]);
							bytebuffer.putFloat(f_88_ + fs[2] - fs_65_[2]);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_86_ + f_56_ * (float) -i_89_);
							bytebuffer.putFloat(f_87_ + f_57_ * (float) -i_89_);
							bytebuffer.putFloat(f_88_ + f_58_ * (float) -i_89_);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_86_ + f_62_ * (float) i_89_);
							bytebuffer.putFloat(f_87_ + f_63_ * (float) i_89_);
							bytebuffer.putFloat(f_88_ + f_64_ * (float) i_89_);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_86_ + f_56_ * (float) i_89_);
							bytebuffer.putFloat(f_87_ + f_57_ * (float) i_89_);
							bytebuffer.putFloat(f_88_ + f_58_ * (float) i_89_);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_86_ + f_59_ * (float) i_89_);
							bytebuffer.putFloat(f_87_ + f_60_ * (float) i_89_);
							bytebuffer.putFloat(f_88_ + f_61_ * (float) i_89_);
							bytebuffer.put(i_82_);
							bytebuffer.put(i_83_);
							bytebuffer.put(i_84_);
							bytebuffer.put(i_85_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_50_++;
					}
				}
			}
		}
		anInterface37_3667.method213(0, bytebuffer.position(), class180_sub2.aLong9439);
		class180_sub2.method14988(0, anInterface37_3667);
		class180_sub2.method14988(1, anInterface37_3657);
		class180_sub2.method15149(aClass355_3661);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5655(i_50_, bool);
	}

	void method6024(Class180_Sub2 class180_sub2) {
		anInterface37_3667.method219(786336, 24);
	}

	void method6025() {
		anInterface37_3667.method129();
	}

	void method6026(Class180_Sub2 class180_sub2, Class182 class182) {
		class180_sub2.method3182(false);
		aFloat3672 = class180_sub2.aFloat9551;
		float f = class180_sub2.aClass427_9459.aFloatArray4807[2];
		float f_91_ = class180_sub2.aClass427_9459.aFloatArray4807[6];
		float f_92_ = class180_sub2.aClass427_9459.aFloatArray4807[10];
		float f_93_ = class180_sub2.aClass427_9459.aFloatArray4807[14];
		int i = 0;
		int i_94_ = 2147483647;
		int i_95_ = 0;
		Class522_Sub6 class522_sub6 = class182.aClass710_2094.aClass522_Sub6_8851;
		for (Class522_Sub6 class522_sub6_96_ = class522_sub6.aClass522_Sub6_10329; class522_sub6_96_ != class522_sub6; class522_sub6_96_ = class522_sub6_96_.aClass522_Sub6_10329) {
			Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_96_;
			int i_97_ = (int) (f * (float) (class522_sub6_sub1.anInt11411 >> 12) + f_91_ * (float) (class522_sub6_sub1.anInt11407 >> 12) + f_92_ * (float) (class522_sub6_sub1.anInt11403 >> 12) + f_93_);
			if (i_97_ > i_95_)
				i_95_ = i_97_;
			if (i_97_ < i_94_)
				i_94_ = i_97_;
			anIntArray3666[i++] = i_97_;
		}
		int i_98_ = i_95_ - i_94_;
		int i_99_;
		if (i_98_ + 2 > 1600) {
			i_99_ = 1 + Class15.method735(i_98_, (byte) -121) - anInt3664;
			i_98_ = (i_98_ >> i_99_) + 2;
		} else {
			i_99_ = 0;
			i_98_ += 2;
		}
		class180_sub2.method15001(anInterface44_3660);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5654(Class427.aClass427_4808);
		class313.aClass427_3501.method6742();
		class313.anInt3499 = -1;
		boolean bool = class180_sub2.anInt9562 > 0;
		if (bool) {
			class313.aClass441_3502.method7118(0.0F, 0.0F, 1.0F, -class180_sub2.aFloat9517);
			class313.aClass442_3503.method7138((float) (class180_sub2.anInt9561 >> 16 & 0xff) / 255.0F, (float) (class180_sub2.anInt9561 >> 8 & 0xff) / 255.0F, (float) (class180_sub2.anInt9561 >> 0 & 0xff) / 255.0F);
			class313.aClass441_3502.method7123(class180_sub2.aClass427_9454);
			class313.aClass441_3502.method7128(1.0F / (class180_sub2.aFloat9565 - class180_sub2.aFloat9517));
		} else {
			class313.aClass441_3502.method7118(0.0F, 0.0F, 0.0F, 0.0F);
			class313.aClass442_3503.method7138(0.0F, 0.0F, 0.0F);
		}
		method6031(class180_sub2, class522_sub6, i_98_, i_94_, i_99_, class313, bool);
		if (class180_sub2.aFloat9551 != aFloat3672)
			class180_sub2.method3478(aFloat3672);
		class180_sub2.method3182(true);
	}

	void method6027(Class180_Sub2 class180_sub2, Class522_Sub6 class522_sub6, int i, int i_100_, int i_101_, Class313 class313, boolean bool) {
		Class522_Sub6 class522_sub6_102_ = class522_sub6.aClass522_Sub6_10329;
		int i_103_ = 0;
		int i_104_ = -2;
		boolean bool_105_ = true;
		boolean bool_106_ = true;
		while (class522_sub6_102_ != class522_sub6) {
			anInt3671 = 0;
			for (int i_107_ = 0; i_107_ < i; i_107_++)
				anIntArray3659[i_107_] = 0;
			for (int i_108_ = 0; i_108_ < 64; i_108_++)
				anIntArray3670[i_108_] = 0;
			for (/**/; class522_sub6_102_ != class522_sub6; class522_sub6_102_ = class522_sub6_102_.aClass522_Sub6_10329) {
				Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_102_;
				if (bool_106_) {
					i_104_ = class522_sub6_sub1.anInt11410;
					bool_105_ = class522_sub6_sub1.aBool11412;
					bool_106_ = false;
				}
				if (i_103_ > 0 && (i_104_ != class522_sub6_sub1.anInt11410 || bool_105_ != class522_sub6_sub1.aBool11412)) {
					bool_106_ = true;
					break;
				}
				method6022(anIntArray3666[i_103_++] - i_100_ >> i_101_, class522_sub6_sub1);
			}
			class313.anInterface38_3498 = null;
			if (i_104_ >= 0) {
				Class163 class163 = class180_sub2.aClass181_2059.method3544(i_104_, (byte) -35);
				if (class163.aBool1761)
					class313.anInterface38_3498 = class180_sub2.aClass336_9532.method5895(class163);
				byte i_109_ = 0;
				if (class163.aClass595_1784 == Class595.aClass595_7815)
					i_109_ = class163.aByte1764;
				class180_sub2.method14990(i_109_);
			}
			if (bool_105_ && class180_sub2.aFloat9551 != aFloat3672)
				class180_sub2.method3478(aFloat3672);
			else if (class180_sub2.aFloat9551 != 1.0F)
				class180_sub2.method3478(1.0F);
			method6023(class180_sub2, i, bool);
		}
	}

	Class339(Class180_Sub2 class180_sub2) {
		anInt3658 = 768;
		anInt3663 = 1600;
		anInt3664 = Class15.method735(1600, (byte) -121);
		anInt3665 = 64;
		anIntArray3666 = new int[8191];
		anIntArray3659 = new int[1600];
		anIntArray3670 = new int[64];
		aClass522_Sub6_Sub1ArrayArray3669 = new Class522_Sub6_Sub1[1600][64];
		aClass522_Sub6_Sub1ArrayArray3662 = new Class522_Sub6_Sub1[64][768];
		anInt3671 = 0;
		aClass355_3661 = (class180_sub2.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3734, Class347.aClass347_3738 }), new Class372(Class347.aClass347_3732) }));
		anInterface37_3667 = class180_sub2.method15035(true);
		anInterface37_3657 = class180_sub2.method15035(false);
		anInterface37_3657.method219(393168, 12);
		anInterface44_3660 = class180_sub2.method15025(false);
		anInterface44_3660.method323(49146);
		ByteBuffer bytebuffer = class180_sub2.aByteBuffer9438;
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			int i_110_ = i * 4;
			bytebuffer.putShort((short) i_110_);
			bytebuffer.putShort((short) (i_110_ + 1));
			bytebuffer.putShort((short) (i_110_ + 2));
			bytebuffer.putShort((short) (i_110_ + 2));
			bytebuffer.putShort((short) (i_110_ + 3));
			bytebuffer.putShort((short) i_110_);
		}
		anInterface44_3660.method213(0, bytebuffer.position(), class180_sub2.aLong9439);
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
		}
		anInterface37_3657.method213(0, bytebuffer.position(), class180_sub2.aLong9439);
	}

	void method6028(int i, Class522_Sub6_Sub1 class522_sub6_sub1) {
		if (i < 1600) {
			if (anIntArray3659[i] < 64)
				aClass522_Sub6_Sub1ArrayArray3669[i][anIntArray3659[i]++] = class522_sub6_sub1;
			else {
				if (anIntArray3659[i] == 64) {
					if (anInt3671 == 64)
						return;
					anIntArray3659[i] += 1 + anInt3671++;
				}
				aClass522_Sub6_Sub1ArrayArray3662[anIntArray3659[i] - 64 - 1][anIntArray3670[anIntArray3659[i] - 64 - 1]++] = class522_sub6_sub1;
			}
		}
	}

	void method6029(Class180_Sub2 class180_sub2, int i, boolean bool) {
		int i_111_ = 0;
		Class427 class427 = class180_sub2.aClass427_9459;
		float f = class427.aFloatArray4807[0];
		float f_112_ = class427.aFloatArray4807[4];
		float f_113_ = class427.aFloatArray4807[8];
		float f_114_ = class427.aFloatArray4807[1];
		float f_115_ = class427.aFloatArray4807[5];
		float f_116_ = class427.aFloatArray4807[9];
		float f_117_ = f + f_114_;
		float f_118_ = f_112_ + f_115_;
		float f_119_ = f_113_ + f_116_;
		float f_120_ = f - f_114_;
		float f_121_ = f_112_ - f_115_;
		float f_122_ = f_113_ - f_116_;
		float f_123_ = f_114_ - f;
		float f_124_ = f_115_ - f_112_;
		float f_125_ = f_116_ - f_113_;
		float[] fs = new float[3];
		float[] fs_126_ = new float[3];
		class180_sub2.aClass427_9435.method6823(class180_sub2.aClass427_9453);
		ByteBuffer bytebuffer = class180_sub2.aByteBuffer9438;
		bytebuffer.clear();
		for (int i_127_ = i - 1; i_127_ >= 0; i_127_--) {
			int i_128_ = anIntArray3659[i_127_] > 64 ? 64 : anIntArray3659[i_127_];
			if (i_128_ > 0) {
				for (int i_129_ = i_128_ - 1; i_129_ >= 0; i_129_--) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray3669[i_127_][i_129_];
					int i_130_ = class522_sub6_sub1.anInt11409;
					byte i_131_ = (byte) (i_130_ >> 16);
					byte i_132_ = (byte) (i_130_ >> 8);
					byte i_133_ = (byte) i_130_;
					byte i_134_ = (byte) (i_130_ >>> 24);
					if (class180_sub2.anInt9578 == 0) {
						byte i_135_ = i_131_;
						i_131_ = i_133_;
						i_133_ = i_135_;
					}
					float f_136_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
					float f_137_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
					float f_138_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
					int i_139_ = class522_sub6_sub1.anInt11408 >> 12;
					if (class522_sub6_sub1.aShort11406 != 0) {
						class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_139_, i_139_, 0.0F, 0.0F, 0.0F);
						class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
						class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
						class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_126_);
						bytebuffer.putFloat(f_136_ - fs[0] - fs_126_[0]);
						bytebuffer.putFloat(f_137_ - fs[1] - fs_126_[1]);
						bytebuffer.putFloat(f_138_ - fs[2] - fs_126_[2]);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_136_ - fs[0] + fs_126_[0]);
						bytebuffer.putFloat(f_137_ - fs[1] + fs_126_[1]);
						bytebuffer.putFloat(f_138_ - fs[2] + fs_126_[2]);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_136_ + fs[0] + fs_126_[0]);
						bytebuffer.putFloat(f_137_ + fs[1] + fs_126_[1]);
						bytebuffer.putFloat(f_138_ + fs[2] + fs_126_[2]);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_136_ + fs[0] - fs_126_[0]);
						bytebuffer.putFloat(f_137_ + fs[1] - fs_126_[1]);
						bytebuffer.putFloat(f_138_ + fs[2] - fs_126_[2]);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_136_ + f_117_ * (float) -i_139_);
						bytebuffer.putFloat(f_137_ + f_118_ * (float) -i_139_);
						bytebuffer.putFloat(f_138_ + f_119_ * (float) -i_139_);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_136_ + f_123_ * (float) i_139_);
						bytebuffer.putFloat(f_137_ + f_124_ * (float) i_139_);
						bytebuffer.putFloat(f_138_ + f_125_ * (float) i_139_);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_136_ + f_117_ * (float) i_139_);
						bytebuffer.putFloat(f_137_ + f_118_ * (float) i_139_);
						bytebuffer.putFloat(f_138_ + f_119_ * (float) i_139_);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_136_ + f_120_ * (float) i_139_);
						bytebuffer.putFloat(f_137_ + f_121_ * (float) i_139_);
						bytebuffer.putFloat(f_138_ + f_122_ * (float) i_139_);
						bytebuffer.put(i_131_);
						bytebuffer.put(i_132_);
						bytebuffer.put(i_133_);
						bytebuffer.put(i_134_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_111_++;
				}
				if (anIntArray3659[i_127_] > 64) {
					int i_140_ = anIntArray3659[i_127_] - 64 - 1;
					for (int i_141_ = anIntArray3670[i_140_] - 1; i_141_ >= 0; i_141_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray3662[i_140_][i_141_]);
						int i_142_ = class522_sub6_sub1.anInt11409;
						byte i_143_ = (byte) (i_142_ >> 16);
						byte i_144_ = (byte) (i_142_ >> 8);
						byte i_145_ = (byte) i_142_;
						byte i_146_ = (byte) (i_142_ >>> 24);
						float f_147_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_148_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_149_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_150_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class180_sub2.anInt9578 == 0) {
							byte i_151_ = i_143_;
							i_143_ = i_145_;
							i_145_ = i_151_;
						}
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_150_, i_150_, 0.0F, 0.0F, 0.0F);
							class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
							class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_126_);
							bytebuffer.putFloat(f_147_ - fs[0] - fs_126_[0]);
							bytebuffer.putFloat(f_148_ - fs[1] - fs_126_[1]);
							bytebuffer.putFloat(f_149_ - fs[2] - fs_126_[2]);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_147_ - fs[0] + fs_126_[0]);
							bytebuffer.putFloat(f_148_ - fs[1] + fs_126_[1]);
							bytebuffer.putFloat(f_149_ - fs[2] + fs_126_[2]);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_147_ + fs[0] + fs_126_[0]);
							bytebuffer.putFloat(f_148_ + fs[1] + fs_126_[1]);
							bytebuffer.putFloat(f_149_ + fs[2] + fs_126_[2]);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_147_ + fs[0] - fs_126_[0]);
							bytebuffer.putFloat(f_148_ + fs[1] - fs_126_[1]);
							bytebuffer.putFloat(f_149_ + fs[2] - fs_126_[2]);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_147_ + f_117_ * (float) -i_150_);
							bytebuffer.putFloat(f_148_ + f_118_ * (float) -i_150_);
							bytebuffer.putFloat(f_149_ + f_119_ * (float) -i_150_);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_147_ + f_123_ * (float) i_150_);
							bytebuffer.putFloat(f_148_ + f_124_ * (float) i_150_);
							bytebuffer.putFloat(f_149_ + f_125_ * (float) i_150_);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_147_ + f_117_ * (float) i_150_);
							bytebuffer.putFloat(f_148_ + f_118_ * (float) i_150_);
							bytebuffer.putFloat(f_149_ + f_119_ * (float) i_150_);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_147_ + f_120_ * (float) i_150_);
							bytebuffer.putFloat(f_148_ + f_121_ * (float) i_150_);
							bytebuffer.putFloat(f_149_ + f_122_ * (float) i_150_);
							bytebuffer.put(i_143_);
							bytebuffer.put(i_144_);
							bytebuffer.put(i_145_);
							bytebuffer.put(i_146_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_111_++;
					}
				}
			}
		}
		anInterface37_3667.method213(0, bytebuffer.position(), class180_sub2.aLong9439);
		class180_sub2.method14988(0, anInterface37_3667);
		class180_sub2.method14988(1, anInterface37_3657);
		class180_sub2.method15149(aClass355_3661);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5655(i_111_, bool);
	}

	void method6030(Class180_Sub2 class180_sub2, Class182 class182) {
		class180_sub2.method3182(false);
		aFloat3672 = class180_sub2.aFloat9551;
		float f = class180_sub2.aClass427_9459.aFloatArray4807[2];
		float f_152_ = class180_sub2.aClass427_9459.aFloatArray4807[6];
		float f_153_ = class180_sub2.aClass427_9459.aFloatArray4807[10];
		float f_154_ = class180_sub2.aClass427_9459.aFloatArray4807[14];
		int i = 0;
		int i_155_ = 2147483647;
		int i_156_ = 0;
		Class522_Sub6 class522_sub6 = class182.aClass710_2094.aClass522_Sub6_8851;
		for (Class522_Sub6 class522_sub6_157_ = class522_sub6.aClass522_Sub6_10329; class522_sub6_157_ != class522_sub6; class522_sub6_157_ = class522_sub6_157_.aClass522_Sub6_10329) {
			Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_157_;
			int i_158_ = (int) (f * (float) (class522_sub6_sub1.anInt11411 >> 12) + f_152_ * (float) (class522_sub6_sub1.anInt11407 >> 12) + f_153_ * (float) (class522_sub6_sub1.anInt11403 >> 12) + f_154_);
			if (i_158_ > i_156_)
				i_156_ = i_158_;
			if (i_158_ < i_155_)
				i_155_ = i_158_;
			anIntArray3666[i++] = i_158_;
		}
		int i_159_ = i_156_ - i_155_;
		int i_160_;
		if (i_159_ + 2 > 1600) {
			i_160_ = 1 + Class15.method735(i_159_, (byte) -118) - anInt3664;
			i_159_ = (i_159_ >> i_160_) + 2;
		} else {
			i_160_ = 0;
			i_159_ += 2;
		}
		class180_sub2.method15001(anInterface44_3660);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5654(Class427.aClass427_4808);
		class313.aClass427_3501.method6742();
		class313.anInt3499 = -1;
		boolean bool = class180_sub2.anInt9562 > 0;
		if (bool) {
			class313.aClass441_3502.method7118(0.0F, 0.0F, 1.0F, -class180_sub2.aFloat9517);
			class313.aClass442_3503.method7138((float) (class180_sub2.anInt9561 >> 16 & 0xff) / 255.0F, (float) (class180_sub2.anInt9561 >> 8 & 0xff) / 255.0F, (float) (class180_sub2.anInt9561 >> 0 & 0xff) / 255.0F);
			class313.aClass441_3502.method7123(class180_sub2.aClass427_9454);
			class313.aClass441_3502.method7128(1.0F / (class180_sub2.aFloat9565 - class180_sub2.aFloat9517));
		} else {
			class313.aClass441_3502.method7118(0.0F, 0.0F, 0.0F, 0.0F);
			class313.aClass442_3503.method7138(0.0F, 0.0F, 0.0F);
		}
		method6031(class180_sub2, class522_sub6, i_159_, i_155_, i_160_, class313, bool);
		if (class180_sub2.aFloat9551 != aFloat3672)
			class180_sub2.method3478(aFloat3672);
		class180_sub2.method3182(true);
	}

	void method6031(Class180_Sub2 class180_sub2, Class522_Sub6 class522_sub6, int i, int i_161_, int i_162_, Class313 class313, boolean bool) {
		Class522_Sub6 class522_sub6_163_ = class522_sub6.aClass522_Sub6_10329;
		int i_164_ = 0;
		int i_165_ = -2;
		boolean bool_166_ = true;
		boolean bool_167_ = true;
		while (class522_sub6_163_ != class522_sub6) {
			anInt3671 = 0;
			for (int i_168_ = 0; i_168_ < i; i_168_++)
				anIntArray3659[i_168_] = 0;
			for (int i_169_ = 0; i_169_ < 64; i_169_++)
				anIntArray3670[i_169_] = 0;
			for (/**/; class522_sub6_163_ != class522_sub6; class522_sub6_163_ = class522_sub6_163_.aClass522_Sub6_10329) {
				Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_163_;
				if (bool_167_) {
					i_165_ = class522_sub6_sub1.anInt11410;
					bool_166_ = class522_sub6_sub1.aBool11412;
					bool_167_ = false;
				}
				if (i_164_ > 0 && (i_165_ != class522_sub6_sub1.anInt11410 || bool_166_ != class522_sub6_sub1.aBool11412)) {
					bool_167_ = true;
					break;
				}
				method6022(anIntArray3666[i_164_++] - i_161_ >> i_162_, class522_sub6_sub1);
			}
			class313.anInterface38_3498 = null;
			if (i_165_ >= 0) {
				Class163 class163 = class180_sub2.aClass181_2059.method3544(i_165_, (byte) -59);
				if (class163.aBool1761)
					class313.anInterface38_3498 = class180_sub2.aClass336_9532.method5895(class163);
				byte i_170_ = 0;
				if (class163.aClass595_1784 == Class595.aClass595_7815)
					i_170_ = class163.aByte1764;
				class180_sub2.method14990(i_170_);
			}
			if (bool_166_ && class180_sub2.aFloat9551 != aFloat3672)
				class180_sub2.method3478(aFloat3672);
			else if (class180_sub2.aFloat9551 != 1.0F)
				class180_sub2.method3478(1.0F);
			method6023(class180_sub2, i, bool);
		}
	}

	void method6032(Class180_Sub2 class180_sub2, int i, boolean bool) {
		int i_171_ = 0;
		Class427 class427 = class180_sub2.aClass427_9459;
		float f = class427.aFloatArray4807[0];
		float f_172_ = class427.aFloatArray4807[4];
		float f_173_ = class427.aFloatArray4807[8];
		float f_174_ = class427.aFloatArray4807[1];
		float f_175_ = class427.aFloatArray4807[5];
		float f_176_ = class427.aFloatArray4807[9];
		float f_177_ = f + f_174_;
		float f_178_ = f_172_ + f_175_;
		float f_179_ = f_173_ + f_176_;
		float f_180_ = f - f_174_;
		float f_181_ = f_172_ - f_175_;
		float f_182_ = f_173_ - f_176_;
		float f_183_ = f_174_ - f;
		float f_184_ = f_175_ - f_172_;
		float f_185_ = f_176_ - f_173_;
		float[] fs = new float[3];
		float[] fs_186_ = new float[3];
		class180_sub2.aClass427_9435.method6823(class180_sub2.aClass427_9453);
		ByteBuffer bytebuffer = class180_sub2.aByteBuffer9438;
		bytebuffer.clear();
		for (int i_187_ = i - 1; i_187_ >= 0; i_187_--) {
			int i_188_ = anIntArray3659[i_187_] > 64 ? 64 : anIntArray3659[i_187_];
			if (i_188_ > 0) {
				for (int i_189_ = i_188_ - 1; i_189_ >= 0; i_189_--) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray3669[i_187_][i_189_];
					int i_190_ = class522_sub6_sub1.anInt11409;
					byte i_191_ = (byte) (i_190_ >> 16);
					byte i_192_ = (byte) (i_190_ >> 8);
					byte i_193_ = (byte) i_190_;
					byte i_194_ = (byte) (i_190_ >>> 24);
					if (class180_sub2.anInt9578 == 0) {
						byte i_195_ = i_191_;
						i_191_ = i_193_;
						i_193_ = i_195_;
					}
					float f_196_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
					float f_197_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
					float f_198_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
					int i_199_ = class522_sub6_sub1.anInt11408 >> 12;
					if (class522_sub6_sub1.aShort11406 != 0) {
						class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_199_, i_199_, 0.0F, 0.0F, 0.0F);
						class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
						class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
						class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_186_);
						bytebuffer.putFloat(f_196_ - fs[0] - fs_186_[0]);
						bytebuffer.putFloat(f_197_ - fs[1] - fs_186_[1]);
						bytebuffer.putFloat(f_198_ - fs[2] - fs_186_[2]);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_196_ - fs[0] + fs_186_[0]);
						bytebuffer.putFloat(f_197_ - fs[1] + fs_186_[1]);
						bytebuffer.putFloat(f_198_ - fs[2] + fs_186_[2]);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_196_ + fs[0] + fs_186_[0]);
						bytebuffer.putFloat(f_197_ + fs[1] + fs_186_[1]);
						bytebuffer.putFloat(f_198_ + fs[2] + fs_186_[2]);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_196_ + fs[0] - fs_186_[0]);
						bytebuffer.putFloat(f_197_ + fs[1] - fs_186_[1]);
						bytebuffer.putFloat(f_198_ + fs[2] - fs_186_[2]);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_196_ + f_177_ * (float) -i_199_);
						bytebuffer.putFloat(f_197_ + f_178_ * (float) -i_199_);
						bytebuffer.putFloat(f_198_ + f_179_ * (float) -i_199_);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_196_ + f_183_ * (float) i_199_);
						bytebuffer.putFloat(f_197_ + f_184_ * (float) i_199_);
						bytebuffer.putFloat(f_198_ + f_185_ * (float) i_199_);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_196_ + f_177_ * (float) i_199_);
						bytebuffer.putFloat(f_197_ + f_178_ * (float) i_199_);
						bytebuffer.putFloat(f_198_ + f_179_ * (float) i_199_);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_196_ + f_180_ * (float) i_199_);
						bytebuffer.putFloat(f_197_ + f_181_ * (float) i_199_);
						bytebuffer.putFloat(f_198_ + f_182_ * (float) i_199_);
						bytebuffer.put(i_191_);
						bytebuffer.put(i_192_);
						bytebuffer.put(i_193_);
						bytebuffer.put(i_194_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_171_++;
				}
				if (anIntArray3659[i_187_] > 64) {
					int i_200_ = anIntArray3659[i_187_] - 64 - 1;
					for (int i_201_ = anIntArray3670[i_200_] - 1; i_201_ >= 0; i_201_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray3662[i_200_][i_201_]);
						int i_202_ = class522_sub6_sub1.anInt11409;
						byte i_203_ = (byte) (i_202_ >> 16);
						byte i_204_ = (byte) (i_202_ >> 8);
						byte i_205_ = (byte) i_202_;
						byte i_206_ = (byte) (i_202_ >>> 24);
						float f_207_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_208_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_209_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_210_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class180_sub2.anInt9578 == 0) {
							byte i_211_ = i_203_;
							i_203_ = i_205_;
							i_205_ = i_211_;
						}
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_210_, i_210_, 0.0F, 0.0F, 0.0F);
							class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
							class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_186_);
							bytebuffer.putFloat(f_207_ - fs[0] - fs_186_[0]);
							bytebuffer.putFloat(f_208_ - fs[1] - fs_186_[1]);
							bytebuffer.putFloat(f_209_ - fs[2] - fs_186_[2]);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_207_ - fs[0] + fs_186_[0]);
							bytebuffer.putFloat(f_208_ - fs[1] + fs_186_[1]);
							bytebuffer.putFloat(f_209_ - fs[2] + fs_186_[2]);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_207_ + fs[0] + fs_186_[0]);
							bytebuffer.putFloat(f_208_ + fs[1] + fs_186_[1]);
							bytebuffer.putFloat(f_209_ + fs[2] + fs_186_[2]);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_207_ + fs[0] - fs_186_[0]);
							bytebuffer.putFloat(f_208_ + fs[1] - fs_186_[1]);
							bytebuffer.putFloat(f_209_ + fs[2] - fs_186_[2]);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_207_ + f_177_ * (float) -i_210_);
							bytebuffer.putFloat(f_208_ + f_178_ * (float) -i_210_);
							bytebuffer.putFloat(f_209_ + f_179_ * (float) -i_210_);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_207_ + f_183_ * (float) i_210_);
							bytebuffer.putFloat(f_208_ + f_184_ * (float) i_210_);
							bytebuffer.putFloat(f_209_ + f_185_ * (float) i_210_);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_207_ + f_177_ * (float) i_210_);
							bytebuffer.putFloat(f_208_ + f_178_ * (float) i_210_);
							bytebuffer.putFloat(f_209_ + f_179_ * (float) i_210_);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_207_ + f_180_ * (float) i_210_);
							bytebuffer.putFloat(f_208_ + f_181_ * (float) i_210_);
							bytebuffer.putFloat(f_209_ + f_182_ * (float) i_210_);
							bytebuffer.put(i_203_);
							bytebuffer.put(i_204_);
							bytebuffer.put(i_205_);
							bytebuffer.put(i_206_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_171_++;
					}
				}
			}
		}
		anInterface37_3667.method213(0, bytebuffer.position(), class180_sub2.aLong9439);
		class180_sub2.method14988(0, anInterface37_3667);
		class180_sub2.method14988(1, anInterface37_3657);
		class180_sub2.method15149(aClass355_3661);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5655(i_171_, bool);
	}

	void method6033(Class180_Sub2 class180_sub2, int i, boolean bool) {
		int i_212_ = 0;
		Class427 class427 = class180_sub2.aClass427_9459;
		float f = class427.aFloatArray4807[0];
		float f_213_ = class427.aFloatArray4807[4];
		float f_214_ = class427.aFloatArray4807[8];
		float f_215_ = class427.aFloatArray4807[1];
		float f_216_ = class427.aFloatArray4807[5];
		float f_217_ = class427.aFloatArray4807[9];
		float f_218_ = f + f_215_;
		float f_219_ = f_213_ + f_216_;
		float f_220_ = f_214_ + f_217_;
		float f_221_ = f - f_215_;
		float f_222_ = f_213_ - f_216_;
		float f_223_ = f_214_ - f_217_;
		float f_224_ = f_215_ - f;
		float f_225_ = f_216_ - f_213_;
		float f_226_ = f_217_ - f_214_;
		float[] fs = new float[3];
		float[] fs_227_ = new float[3];
		class180_sub2.aClass427_9435.method6823(class180_sub2.aClass427_9453);
		ByteBuffer bytebuffer = class180_sub2.aByteBuffer9438;
		bytebuffer.clear();
		for (int i_228_ = i - 1; i_228_ >= 0; i_228_--) {
			int i_229_ = anIntArray3659[i_228_] > 64 ? 64 : anIntArray3659[i_228_];
			if (i_229_ > 0) {
				for (int i_230_ = i_229_ - 1; i_230_ >= 0; i_230_--) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray3669[i_228_][i_230_];
					int i_231_ = class522_sub6_sub1.anInt11409;
					byte i_232_ = (byte) (i_231_ >> 16);
					byte i_233_ = (byte) (i_231_ >> 8);
					byte i_234_ = (byte) i_231_;
					byte i_235_ = (byte) (i_231_ >>> 24);
					if (class180_sub2.anInt9578 == 0) {
						byte i_236_ = i_232_;
						i_232_ = i_234_;
						i_234_ = i_236_;
					}
					float f_237_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
					float f_238_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
					float f_239_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
					int i_240_ = class522_sub6_sub1.anInt11408 >> 12;
					if (class522_sub6_sub1.aShort11406 != 0) {
						class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_240_, i_240_, 0.0F, 0.0F, 0.0F);
						class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
						class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
						class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_227_);
						bytebuffer.putFloat(f_237_ - fs[0] - fs_227_[0]);
						bytebuffer.putFloat(f_238_ - fs[1] - fs_227_[1]);
						bytebuffer.putFloat(f_239_ - fs[2] - fs_227_[2]);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_237_ - fs[0] + fs_227_[0]);
						bytebuffer.putFloat(f_238_ - fs[1] + fs_227_[1]);
						bytebuffer.putFloat(f_239_ - fs[2] + fs_227_[2]);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_237_ + fs[0] + fs_227_[0]);
						bytebuffer.putFloat(f_238_ + fs[1] + fs_227_[1]);
						bytebuffer.putFloat(f_239_ + fs[2] + fs_227_[2]);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_237_ + fs[0] - fs_227_[0]);
						bytebuffer.putFloat(f_238_ + fs[1] - fs_227_[1]);
						bytebuffer.putFloat(f_239_ + fs[2] - fs_227_[2]);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_237_ + f_218_ * (float) -i_240_);
						bytebuffer.putFloat(f_238_ + f_219_ * (float) -i_240_);
						bytebuffer.putFloat(f_239_ + f_220_ * (float) -i_240_);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_237_ + f_224_ * (float) i_240_);
						bytebuffer.putFloat(f_238_ + f_225_ * (float) i_240_);
						bytebuffer.putFloat(f_239_ + f_226_ * (float) i_240_);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_237_ + f_218_ * (float) i_240_);
						bytebuffer.putFloat(f_238_ + f_219_ * (float) i_240_);
						bytebuffer.putFloat(f_239_ + f_220_ * (float) i_240_);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_237_ + f_221_ * (float) i_240_);
						bytebuffer.putFloat(f_238_ + f_222_ * (float) i_240_);
						bytebuffer.putFloat(f_239_ + f_223_ * (float) i_240_);
						bytebuffer.put(i_232_);
						bytebuffer.put(i_233_);
						bytebuffer.put(i_234_);
						bytebuffer.put(i_235_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_212_++;
				}
				if (anIntArray3659[i_228_] > 64) {
					int i_241_ = anIntArray3659[i_228_] - 64 - 1;
					for (int i_242_ = anIntArray3670[i_241_] - 1; i_242_ >= 0; i_242_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray3662[i_241_][i_242_]);
						int i_243_ = class522_sub6_sub1.anInt11409;
						byte i_244_ = (byte) (i_243_ >> 16);
						byte i_245_ = (byte) (i_243_ >> 8);
						byte i_246_ = (byte) i_243_;
						byte i_247_ = (byte) (i_243_ >>> 24);
						float f_248_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_249_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_250_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_251_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class180_sub2.anInt9578 == 0) {
							byte i_252_ = i_244_;
							i_244_ = i_246_;
							i_246_ = i_252_;
						}
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub2.aClass427_9491.method6804(class522_sub6_sub1.aShort11406, i_251_, i_251_, 0.0F, 0.0F, 0.0F);
							class180_sub2.aClass427_9491.method6751(class180_sub2.aClass427_9435);
							class180_sub2.aClass427_9491.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub2.aClass427_9491.method6773(0.0F, 1.0F, 0.0F, fs_227_);
							bytebuffer.putFloat(f_248_ - fs[0] - fs_227_[0]);
							bytebuffer.putFloat(f_249_ - fs[1] - fs_227_[1]);
							bytebuffer.putFloat(f_250_ - fs[2] - fs_227_[2]);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_248_ - fs[0] + fs_227_[0]);
							bytebuffer.putFloat(f_249_ - fs[1] + fs_227_[1]);
							bytebuffer.putFloat(f_250_ - fs[2] + fs_227_[2]);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_248_ + fs[0] + fs_227_[0]);
							bytebuffer.putFloat(f_249_ + fs[1] + fs_227_[1]);
							bytebuffer.putFloat(f_250_ + fs[2] + fs_227_[2]);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_248_ + fs[0] - fs_227_[0]);
							bytebuffer.putFloat(f_249_ + fs[1] - fs_227_[1]);
							bytebuffer.putFloat(f_250_ + fs[2] - fs_227_[2]);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_248_ + f_218_ * (float) -i_251_);
							bytebuffer.putFloat(f_249_ + f_219_ * (float) -i_251_);
							bytebuffer.putFloat(f_250_ + f_220_ * (float) -i_251_);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_248_ + f_224_ * (float) i_251_);
							bytebuffer.putFloat(f_249_ + f_225_ * (float) i_251_);
							bytebuffer.putFloat(f_250_ + f_226_ * (float) i_251_);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_248_ + f_218_ * (float) i_251_);
							bytebuffer.putFloat(f_249_ + f_219_ * (float) i_251_);
							bytebuffer.putFloat(f_250_ + f_220_ * (float) i_251_);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_248_ + f_221_ * (float) i_251_);
							bytebuffer.putFloat(f_249_ + f_222_ * (float) i_251_);
							bytebuffer.putFloat(f_250_ + f_223_ * (float) i_251_);
							bytebuffer.put(i_244_);
							bytebuffer.put(i_245_);
							bytebuffer.put(i_246_);
							bytebuffer.put(i_247_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_212_++;
					}
				}
			}
		}
		anInterface37_3667.method213(0, bytebuffer.position(), class180_sub2.aLong9439);
		class180_sub2.method14988(0, anInterface37_3667);
		class180_sub2.method14988(1, anInterface37_3657);
		class180_sub2.method15149(aClass355_3661);
		Class313 class313 = class180_sub2.aClass313_9544;
		class313.method5655(i_212_, bool);
	}
}

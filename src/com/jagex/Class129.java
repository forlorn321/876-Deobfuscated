/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class129 {
	int anInt1568 = 768;
	Class536_Sub33_Sub1 aClass536_Sub33_Sub1_1569;
	Interface15 anInterface15_1570;
	Class130 aClass130_1571;
	int anInt1572 = 64;
	Class130 aClass130_1573;
	int anInt1574 = 1600;
	Class521_Sub2_Sub1[][] aClass521_Sub2_Sub1ArrayArray1575;
	float[] aFloatArray1576 = new float[16];
	int anInt1577;
	int anInt1578 = 64;
	int[] anIntArray1579;
	int[] anIntArray1580;
	int[] anIntArray1581;
	Class521_Sub2_Sub1[][] aClass521_Sub2_Sub1ArrayArray1582;
	Class130 aClass130_1583;
	int anInt1584;
	static float aFloat1585;

	void method1675(Class167_Sub2 class167_sub2) {
		anInterface15_1570 = class167_sub2.method8522(24, null, 196584, true);
		aClass130_1573 = new Class130(anInterface15_1570, 5126, 2, 0);
		aClass130_1571 = new Class130(anInterface15_1570, 5126, 3, 8);
		aClass130_1583 = new Class130(anInterface15_1570, 5121, 4, 20);
	}

	void method1676(Class167_Sub2 class167_sub2, int i) {
		OpenGL.glGetFloatv(2982, aFloatArray1576, 0);
		float f = aFloatArray1576[0];
		float f_0_ = aFloatArray1576[4];
		float f_1_ = aFloatArray1576[8];
		float f_2_ = aFloatArray1576[1];
		float f_3_ = aFloatArray1576[5];
		float f_4_ = aFloatArray1576[9];
		float f_5_ = f + f_2_;
		float f_6_ = f_0_ + f_3_;
		float f_7_ = f_1_ + f_4_;
		float f_8_ = f - f_2_;
		float f_9_ = f_0_ - f_3_;
		float f_10_ = f_1_ - f_4_;
		float f_11_ = f_2_ - f;
		float f_12_ = f_3_ - f_0_;
		float f_13_ = f_4_ - f_1_;
		float[] fs = new float[3];
		float[] fs_14_ = new float[3];
		class167_sub2.aClass443_9223.method5340(class167_sub2.aClass443_9208);
		aClass536_Sub33_Sub1_1569.off = 0;
		if (class167_sub2.aBool9284) {
			for (int i_15_ = i - 1; i_15_ >= 0; i_15_--) {
				int i_16_ = anIntArray1580[i_15_] > 64 ? 64 : anIntArray1580[i_15_];
				if (i_16_ > 0) {
					for (int i_17_ = i_16_ - 1; i_17_ >= 0; i_17_--) {
						Class521_Sub2_Sub1 class521_sub2_sub1 = aClass521_Sub2_Sub1ArrayArray1582[i_15_][i_17_];
						int i_18_ = class521_sub2_sub1.anInt11594;
						byte i_19_ = (byte) (i_18_ >> 16);
						byte i_20_ = (byte) (i_18_ >> 8);
						byte i_21_ = (byte) i_18_;
						byte i_22_ = (byte) (i_18_ >>> 24);
						float f_23_ = (float) (class521_sub2_sub1.anInt11595 >> 12);
						float f_24_ = (float) (class521_sub2_sub1.anInt11592 >> 12);
						float f_25_ = (float) (class521_sub2_sub1.anInt11597 >> 12);
						int i_26_ = class521_sub2_sub1.anInt11598 >> 12;
						if (class521_sub2_sub1.aShort11600 != 0) {
							class167_sub2.aClass443_9224.method5365(class521_sub2_sub1.aShort11600, i_26_, i_26_, 0.0F, 0.0F, 0.0F);
							class167_sub2.aClass443_9224.method5390(class167_sub2.aClass443_9223);
							class167_sub2.aClass443_9224.method5346(1.0F, 0.0F, 0.0F, fs);
							class167_sub2.aClass443_9224.method5346(0.0F, 1.0F, 0.0F, fs_14_);
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ - fs[0] - fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ - fs[1] - fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ - fs[2] - fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ - fs[0] + fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ - fs[1] + fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ - fs[2] + fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ + fs[0] + fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ + fs[1] + fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ + fs[2] + fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ + fs[0] - fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ + fs[1] - fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ + fs[2] - fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
						} else {
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ + f_5_ * (float) -i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ + f_6_ * (float) -i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ + f_7_ * (float) -i_26_);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ + f_11_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ + f_12_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ + f_13_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ + f_5_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ + f_6_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ + f_7_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
							aClass536_Sub33_Sub1_1569.method10740(1.0F);
							aClass536_Sub33_Sub1_1569.method10740(0.0F);
							aClass536_Sub33_Sub1_1569.method10740(f_23_ + f_8_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_24_ + f_9_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.method10740(f_25_ + f_10_ * (float) i_26_);
							aClass536_Sub33_Sub1_1569.writeByte(i_19_);
							aClass536_Sub33_Sub1_1569.writeByte(i_20_);
							aClass536_Sub33_Sub1_1569.writeByte(i_21_);
							aClass536_Sub33_Sub1_1569.writeByte(i_22_);
						}
					}
					if (anIntArray1580[i_15_] > 64) {
						int i_27_ = anIntArray1580[i_15_] - 64 - 1;
						for (int i_28_ = anIntArray1581[i_27_] - 1; i_28_ >= 0; i_28_--) {
							Class521_Sub2_Sub1 class521_sub2_sub1 = (aClass521_Sub2_Sub1ArrayArray1575[i_27_][i_28_]);
							int i_29_ = class521_sub2_sub1.anInt11594;
							byte i_30_ = (byte) (i_29_ >> 16);
							byte i_31_ = (byte) (i_29_ >> 8);
							byte i_32_ = (byte) i_29_;
							byte i_33_ = (byte) (i_29_ >>> 24);
							float f_34_ = (float) (class521_sub2_sub1.anInt11595 >> 12);
							float f_35_ = (float) (class521_sub2_sub1.anInt11592 >> 12);
							float f_36_ = (float) (class521_sub2_sub1.anInt11597 >> 12);
							int i_37_ = class521_sub2_sub1.anInt11598 >> 12;
							if (class521_sub2_sub1.aShort11600 != 0) {
								class167_sub2.aClass443_9224.method5365(class521_sub2_sub1.aShort11600, i_37_, i_37_, 0.0F, 0.0F, 0.0F);
								class167_sub2.aClass443_9224.method5390(class167_sub2.aClass443_9223);
								class167_sub2.aClass443_9224.method5346(1.0F, 0.0F, 0.0F, fs);
								class167_sub2.aClass443_9224.method5346(0.0F, 1.0F, 0.0F, fs_14_);
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ - fs[0] - fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ - fs[1] - fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ - fs[2] - fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ - fs[0] + fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ - fs[1] + fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ - fs[2] + fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ + fs[0] + fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ + fs[1] + fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ + fs[2] + fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ + fs[0] - fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ + fs[1] - fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ + fs[2] - fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
							} else {
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ + f_5_ * (float) -i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ + f_6_ * (float) -i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ + f_7_ * (float) -i_37_);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ + f_11_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ + f_12_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ + f_13_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ + f_5_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ + f_6_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ + f_7_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
								aClass536_Sub33_Sub1_1569.method10740(1.0F);
								aClass536_Sub33_Sub1_1569.method10740(0.0F);
								aClass536_Sub33_Sub1_1569.method10740(f_34_ + f_8_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_35_ + f_9_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.method10740(f_36_ + f_10_ * (float) i_37_);
								aClass536_Sub33_Sub1_1569.writeByte(i_30_);
								aClass536_Sub33_Sub1_1569.writeByte(i_31_);
								aClass536_Sub33_Sub1_1569.writeByte(i_32_);
								aClass536_Sub33_Sub1_1569.writeByte(i_33_);
							}
						}
					}
				}
			}
		} else {
			for (int i_38_ = i - 1; i_38_ >= 0; i_38_--) {
				int i_39_ = anIntArray1580[i_38_] > 64 ? 64 : anIntArray1580[i_38_];
				if (i_39_ > 0) {
					for (int i_40_ = i_39_ - 1; i_40_ >= 0; i_40_--) {
						Class521_Sub2_Sub1 class521_sub2_sub1 = aClass521_Sub2_Sub1ArrayArray1582[i_38_][i_40_];
						int i_41_ = class521_sub2_sub1.anInt11594;
						byte i_42_ = (byte) (i_41_ >> 16);
						byte i_43_ = (byte) (i_41_ >> 8);
						byte i_44_ = (byte) i_41_;
						byte i_45_ = (byte) (i_41_ >>> 24);
						float f_46_ = (float) (class521_sub2_sub1.anInt11595 >> 12);
						float f_47_ = (float) (class521_sub2_sub1.anInt11592 >> 12);
						float f_48_ = (float) (class521_sub2_sub1.anInt11597 >> 12);
						int i_49_ = class521_sub2_sub1.anInt11598 >> 12;
						if (class521_sub2_sub1.aShort11600 != 0) {
							class167_sub2.aClass443_9224.method5365(class521_sub2_sub1.aShort11600, i_49_, i_49_, 0.0F, 0.0F, 0.0F);
							class167_sub2.aClass443_9224.method5390(class167_sub2.aClass443_9223);
							class167_sub2.aClass443_9224.method5346(1.0F, 0.0F, 0.0F, fs);
							class167_sub2.aClass443_9224.method5346(0.0F, 1.0F, 0.0F, fs_14_);
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ - fs[0] - fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ - fs[1] - fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ - fs[2] - fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ - fs[0] + fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ - fs[1] + fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ - fs[2] + fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ + fs[0] + fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ + fs[1] + fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ + fs[2] + fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ + fs[0] - fs_14_[0]);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ + fs[1] - fs_14_[1]);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ + fs[2] - fs_14_[2]);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
						} else {
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ + f_5_ * (float) -i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ + f_6_ * (float) -i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ + f_7_ * (float) -i_49_);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ + f_11_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ + f_12_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ + f_13_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ + f_5_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ + f_6_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ + f_7_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
							aClass536_Sub33_Sub1_1569.method10741(1.0F);
							aClass536_Sub33_Sub1_1569.method10741(0.0F);
							aClass536_Sub33_Sub1_1569.method10741(f_46_ + f_8_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_47_ + f_9_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.method10741(f_48_ + f_10_ * (float) i_49_);
							aClass536_Sub33_Sub1_1569.writeByte(i_42_);
							aClass536_Sub33_Sub1_1569.writeByte(i_43_);
							aClass536_Sub33_Sub1_1569.writeByte(i_44_);
							aClass536_Sub33_Sub1_1569.writeByte(i_45_);
						}
					}
					if (anIntArray1580[i_38_] > 64) {
						int i_50_ = anIntArray1580[i_38_] - 64 - 1;
						for (int i_51_ = anIntArray1581[i_50_] - 1; i_51_ >= 0; i_51_--) {
							Class521_Sub2_Sub1 class521_sub2_sub1 = (aClass521_Sub2_Sub1ArrayArray1575[i_50_][i_51_]);
							int i_52_ = class521_sub2_sub1.anInt11594;
							byte i_53_ = (byte) (i_52_ >> 16);
							byte i_54_ = (byte) (i_52_ >> 8);
							byte i_55_ = (byte) i_52_;
							byte i_56_ = (byte) (i_52_ >>> 24);
							float f_57_ = (float) (class521_sub2_sub1.anInt11595 >> 12);
							float f_58_ = (float) (class521_sub2_sub1.anInt11592 >> 12);
							float f_59_ = (float) (class521_sub2_sub1.anInt11597 >> 12);
							int i_60_ = class521_sub2_sub1.anInt11598 >> 12;
							if (class521_sub2_sub1.aShort11600 != 0) {
								class167_sub2.aClass443_9224.method5365(class521_sub2_sub1.aShort11600, i_60_, i_60_, 0.0F, 0.0F, 0.0F);
								class167_sub2.aClass443_9224.method5390(class167_sub2.aClass443_9223);
								class167_sub2.aClass443_9224.method5346(1.0F, 0.0F, 0.0F, fs);
								class167_sub2.aClass443_9224.method5346(0.0F, 1.0F, 0.0F, fs_14_);
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ - fs[0] - fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ - fs[1] - fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ - fs[2] - fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ - fs[0] + fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ - fs[1] + fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ - fs[2] + fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ + fs[0] + fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ + fs[1] + fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ + fs[2] + fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ + fs[0] - fs_14_[0]);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ + fs[1] - fs_14_[1]);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ + fs[2] - fs_14_[2]);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
							} else {
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ + f_5_ * (float) -i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ + f_6_ * (float) -i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ + f_7_ * (float) -i_60_);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ + f_11_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ + f_12_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ + f_13_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ + f_5_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ + f_6_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ + f_7_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
								aClass536_Sub33_Sub1_1569.method10741(1.0F);
								aClass536_Sub33_Sub1_1569.method10741(0.0F);
								aClass536_Sub33_Sub1_1569.method10741(f_57_ + f_8_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_58_ + f_9_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.method10741(f_59_ + f_10_ * (float) i_60_);
								aClass536_Sub33_Sub1_1569.writeByte(i_53_);
								aClass536_Sub33_Sub1_1569.writeByte(i_54_);
								aClass536_Sub33_Sub1_1569.writeByte(i_55_);
								aClass536_Sub33_Sub1_1569.writeByte(i_56_);
							}
						}
					}
				}
			}
		}
		if (aClass536_Sub33_Sub1_1569.off * -810172525 != 0) {
			anInterface15_1570.method80(24, (aClass536_Sub33_Sub1_1569.buffer), (aClass536_Sub33_Sub1_1569.off * -810172525));
			class167_sub2.method8547(aClass130_1571, null, aClass130_1583, aClass130_1573);
			class167_sub2.method8548(7, 0, (aClass536_Sub33_Sub1_1569.off * -810172525 / 24));
		}
	}

	void method1677(Class167_Sub2 class167_sub2) {
		aFloat1585 = class167_sub2.aFloat9250;
		class167_sub2.method8552();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class167_sub2.method8599(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method1678(Class167_Sub2 class167_sub2) {
		class167_sub2.method8599(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class167_sub2.aFloat9250 != aFloat1585)
			class167_sub2.method2006(aFloat1585);
	}

	void method1679(Class167_Sub2 class167_sub2, Class166 class166) {
		if (class167_sub2.aClass443_9280 != null) {
			method1677(class167_sub2);
			float f = class167_sub2.aClass443_9280.aFloatArray4878[2];
			float f_61_ = class167_sub2.aClass443_9280.aFloatArray4878[6];
			float f_62_ = class167_sub2.aClass443_9280.aFloatArray4878[10];
			float f_63_ = class167_sub2.aClass443_9280.aFloatArray4878[14];
			try {
				int i = 0;
				int i_64_ = 2147483647;
				int i_65_ = 0;
				Class521_Sub2 class521_sub2 = class166.aClass703_1841.aClass521_Sub2_8803;
				for (Class521_Sub2 class521_sub2_66_ = class521_sub2.aClass521_Sub2_10295; class521_sub2_66_ != class521_sub2; class521_sub2_66_ = class521_sub2_66_.aClass521_Sub2_10295) {
					Class521_Sub2_Sub1 class521_sub2_sub1 = (Class521_Sub2_Sub1) class521_sub2_66_;
					int i_67_ = (int) (f * (float) (class521_sub2_sub1.anInt11595 >> 12) + (f_61_ * (float) (class521_sub2_sub1.anInt11592 >> 12)) + (f_62_ * (float) (class521_sub2_sub1.anInt11597 >> 12)) + f_63_);
					if (i_67_ > i_65_)
						i_65_ = i_67_;
					if (i_67_ < i_64_)
						i_64_ = i_67_;
					anIntArray1579[i++] = i_67_;
				}
				int i_68_ = i_65_ - i_64_;
				int i_69_;
				if (i_68_ + 2 > 1600) {
					i_69_ = (1 + Class98_Sub1.method8392(i_68_, (byte) -74) - anInt1577);
					i_68_ = (i_68_ >> i_69_) + 2;
				} else {
					i_69_ = 0;
					i_68_ += 2;
				}
				Class521_Sub2 class521_sub2_70_ = class521_sub2.aClass521_Sub2_10295;
				i = 0;
				int i_71_ = -2;
				boolean bool = true;
				boolean bool_72_ = true;
				while (class521_sub2_70_ != class521_sub2) {
					anInt1584 = 0;
					for (int i_73_ = 0; i_73_ < i_68_; i_73_++)
						anIntArray1580[i_73_] = 0;
					for (int i_74_ = 0; i_74_ < 64; i_74_++)
						anIntArray1581[i_74_] = 0;
					for (/**/; class521_sub2_70_ != class521_sub2; class521_sub2_70_ = class521_sub2_70_.aClass521_Sub2_10295) {
						Class521_Sub2_Sub1 class521_sub2_sub1 = (Class521_Sub2_Sub1) class521_sub2_70_;
						if (bool_72_) {
							i_71_ = class521_sub2_sub1.anInt11593;
							bool = class521_sub2_sub1.aBool11601;
							bool_72_ = false;
						}
						if (i > 0 && (i_71_ != class521_sub2_sub1.anInt11593 || bool != class521_sub2_sub1.aBool11601)) {
							bool_72_ = true;
							break;
						}
						int i_75_ = anIntArray1579[i++] - i_64_ >> i_69_;
						if (i_75_ < 1600) {
							if (anIntArray1580[i_75_] < 64)
								aClass521_Sub2_Sub1ArrayArray1582[i_75_][anIntArray1580[i_75_]++] = class521_sub2_sub1;
							else {
								if (anIntArray1580[i_75_] == 64) {
									if (anInt1584 == 64)
										continue;
									anIntArray1580[i_75_] += 1 + anInt1584++;
								}
								aClass521_Sub2_Sub1ArrayArray1575[anIntArray1580[i_75_] - 64 - 1][anIntArray1581[(anIntArray1580[i_75_] - 64 - 1)]++] = class521_sub2_sub1;
							}
						}
					}
					if (i_71_ >= 0)
						class167_sub2.method8553(i_71_);
					else
						class167_sub2.method8553(-1);
					if (bool && class167_sub2.aFloat9250 != aFloat1585)
						class167_sub2.method2006(aFloat1585);
					else if (class167_sub2.aFloat9250 != 1.0F)
						class167_sub2.method2006(1.0F);
					method1676(class167_sub2, i_68_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method1678(class167_sub2);
		}
	}

	Class129() {
		aClass536_Sub33_Sub1_1569 = new Class536_Sub33_Sub1(786336);
		anInt1572 = 64;
		anInt1568 = 768;
		anInt1574 = 1600;
		anInt1577 = Class98_Sub1.method8392(1600, (byte) -3);
		anInt1578 = 64;
		anIntArray1579 = new int[8191];
		anIntArray1580 = new int[1600];
		anIntArray1581 = new int[64];
		aClass521_Sub2_Sub1ArrayArray1582 = new Class521_Sub2_Sub1[1600][64];
		aClass521_Sub2_Sub1ArrayArray1575 = new Class521_Sub2_Sub1[64][768];
		anInt1584 = 0;
	}
}

/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class124 {
	Interface15 anInterface15_1497;
	Class527_Sub38_Sub1 aClass527_Sub38_Sub1_1498;
	int[] anIntArray1499;
	Class129 aClass129_1500;
	Class129 aClass129_1501;
	Class129 aClass129_1502;
	int anInt1503 = 64;
	int anInt1504;
	int anInt1505 = 1600;
	int anInt1506 = 64;
	Class522_Sub6_Sub1[][] aClass522_Sub6_Sub1ArrayArray1507;
	int[] anIntArray1508;
	int anInt1509 = 768;
	float[] aFloatArray1510 = new float[16];
	int[] anIntArray1511;
	Class522_Sub6_Sub1[][] aClass522_Sub6_Sub1ArrayArray1512;
	int anInt1513;
	static float aFloat1514;

	void method2144(Class180_Sub3 class180_sub3, int i) {
		OpenGL.glGetFloatv(2982, aFloatArray1510, 0);
		float f = aFloatArray1510[0];
		float f_0_ = aFloatArray1510[4];
		float f_1_ = aFloatArray1510[8];
		float f_2_ = aFloatArray1510[1];
		float f_3_ = aFloatArray1510[5];
		float f_4_ = aFloatArray1510[9];
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
		class180_sub3.aClass427_9700.method6823(class180_sub3.aClass427_9729);
		aClass527_Sub38_Sub1_1498.anInt10689 = 0;
		if (class180_sub3.aBool9788) {
			for (int i_15_ = i - 1; i_15_ >= 0; i_15_--) {
				int i_16_ = anIntArray1511[i_15_] > 64 ? 64 : anIntArray1511[i_15_];
				if (i_16_ > 0) {
					for (int i_17_ = i_16_ - 1; i_17_ >= 0; i_17_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray1507[i_15_][i_17_];
						int i_18_ = class522_sub6_sub1.anInt11409;
						byte i_19_ = (byte) (i_18_ >> 16);
						byte i_20_ = (byte) (i_18_ >> 8);
						byte i_21_ = (byte) i_18_;
						byte i_22_ = (byte) (i_18_ >>> 24);
						float f_23_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_24_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_25_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_26_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_26_, i_26_, 0.0F, 0.0F, 0.0F);
							class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
							class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_14_);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ - fs[0] - fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ - fs[1] - fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ - fs[2] - fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, -862806252);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, -1178008610);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, -1285317563);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, 857326416);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ - fs[0] + fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ - fs[1] + fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ - fs[2] + fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, 337952299);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, 518683158);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, -1365211711);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, -1953368777);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ + fs[0] + fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ + fs[1] + fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ + fs[2] + fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, -1058978677);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, -2087142841);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, 1131118560);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, -2020809932);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ + fs[0] - fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ + fs[1] - fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ + fs[2] - fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, -709281475);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, -1150949604);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, -805344366);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, 627712023);
						} else {
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ + f_5_ * (float) -i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ + f_6_ * (float) -i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ + f_7_ * (float) -i_26_);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, 1955335574);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, -1210786290);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, -1348474603);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, -2120690045);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ + f_11_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ + f_12_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ + f_13_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, -577988801);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, -91766423);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, -1592528392);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, 1759834860);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ + f_5_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ + f_6_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ + f_7_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, 881543723);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, 653640263);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, 1679405849);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, 863997329);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_23_ + f_8_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_24_ + f_9_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.method18329(f_25_ + f_10_ * (float) i_26_);
							aClass527_Sub38_Sub1_1498.writeByte(i_19_, 1804448420);
							aClass527_Sub38_Sub1_1498.writeByte(i_20_, -447731054);
							aClass527_Sub38_Sub1_1498.writeByte(i_21_, 2075895462);
							aClass527_Sub38_Sub1_1498.writeByte(i_22_, -1930783607);
						}
					}
					if (anIntArray1511[i_15_] > 64) {
						int i_27_ = anIntArray1511[i_15_] - 64 - 1;
						for (int i_28_ = anIntArray1499[i_27_] - 1; i_28_ >= 0; i_28_--) {
							Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1512[i_27_][i_28_]);
							int i_29_ = class522_sub6_sub1.anInt11409;
							byte i_30_ = (byte) (i_29_ >> 16);
							byte i_31_ = (byte) (i_29_ >> 8);
							byte i_32_ = (byte) i_29_;
							byte i_33_ = (byte) (i_29_ >>> 24);
							float f_34_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
							float f_35_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
							float f_36_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
							int i_37_ = class522_sub6_sub1.anInt11408 >> 12;
							if (class522_sub6_sub1.aShort11406 != 0) {
								class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_37_, i_37_, 0.0F, 0.0F, 0.0F);
								class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
								class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
								class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_14_);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ - fs[0] - fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ - fs[1] - fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ - fs[2] - fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, 924528446);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, -717314299);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, -663818721);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, 703575475);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ - fs[0] + fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ - fs[1] + fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ - fs[2] + fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, 363260641);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, 2082132267);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, -1578963887);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, 1791658178);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ + fs[0] + fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ + fs[1] + fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ + fs[2] + fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, 947852994);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, -413992610);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, 1835671387);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, -2068973253);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ + fs[0] - fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ + fs[1] - fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ + fs[2] - fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, -2119605144);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, 681324743);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, -488359252);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, 181203053);
							} else {
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ + f_5_ * (float) -i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ + f_6_ * (float) -i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ + f_7_ * (float) -i_37_);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, -820723797);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, -560229532);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, 655458562);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, -1945223298);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ + f_11_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ + f_12_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ + f_13_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, 1887979696);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, -1448160772);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, 1463246443);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, 2006174045);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ + f_5_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ + f_6_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ + f_7_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, -357069331);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, -1183056853);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, -151109050);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, -1757614897);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_34_ + f_8_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_35_ + f_9_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.method18329(f_36_ + f_10_ * (float) i_37_);
								aClass527_Sub38_Sub1_1498.writeByte(i_30_, 249824810);
								aClass527_Sub38_Sub1_1498.writeByte(i_31_, -1930392995);
								aClass527_Sub38_Sub1_1498.writeByte(i_32_, 1718663490);
								aClass527_Sub38_Sub1_1498.writeByte(i_33_, 743190118);
							}
						}
					}
				}
			}
		} else {
			for (int i_38_ = i - 1; i_38_ >= 0; i_38_--) {
				int i_39_ = anIntArray1511[i_38_] > 64 ? 64 : anIntArray1511[i_38_];
				if (i_39_ > 0) {
					for (int i_40_ = i_39_ - 1; i_40_ >= 0; i_40_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray1507[i_38_][i_40_];
						int i_41_ = class522_sub6_sub1.anInt11409;
						byte i_42_ = (byte) (i_41_ >> 16);
						byte i_43_ = (byte) (i_41_ >> 8);
						byte i_44_ = (byte) i_41_;
						byte i_45_ = (byte) (i_41_ >>> 24);
						float f_46_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_47_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_48_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_49_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_49_, i_49_, 0.0F, 0.0F, 0.0F);
							class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
							class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_14_);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ - fs[0] - fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ - fs[1] - fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ - fs[2] - fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, -210515331);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, -1957189687);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, 1258538846);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, 391651971);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ - fs[0] + fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ - fs[1] + fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ - fs[2] + fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, 2128973900);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, 1244642428);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, 1267761638);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, 1907332954);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ + fs[0] + fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ + fs[1] + fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ + fs[2] + fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, -74849458);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, 543635281);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, -1809389189);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, -1688666386);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ + fs[0] - fs_14_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ + fs[1] - fs_14_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ + fs[2] - fs_14_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, -1888903286);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, 346593264);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, 1268909066);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, -36366064);
						} else {
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ + f_5_ * (float) -i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ + f_6_ * (float) -i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ + f_7_ * (float) -i_49_);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, 2025958228);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, 1096661206);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, 2045064915);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, -1597186716);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ + f_11_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ + f_12_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ + f_13_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, -1803816618);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, 1980913996);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, -760553373);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, 718447963);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ + f_5_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ + f_6_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ + f_7_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, -116548988);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, 719185773);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, 1842098841);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, 90084921);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_46_ + f_8_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_47_ + f_9_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.method18331(f_48_ + f_10_ * (float) i_49_);
							aClass527_Sub38_Sub1_1498.writeByte(i_42_, 1428326437);
							aClass527_Sub38_Sub1_1498.writeByte(i_43_, -948139484);
							aClass527_Sub38_Sub1_1498.writeByte(i_44_, -1427485533);
							aClass527_Sub38_Sub1_1498.writeByte(i_45_, 405687056);
						}
					}
					if (anIntArray1511[i_38_] > 64) {
						int i_50_ = anIntArray1511[i_38_] - 64 - 1;
						for (int i_51_ = anIntArray1499[i_50_] - 1; i_51_ >= 0; i_51_--) {
							Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1512[i_50_][i_51_]);
							int i_52_ = class522_sub6_sub1.anInt11409;
							byte i_53_ = (byte) (i_52_ >> 16);
							byte i_54_ = (byte) (i_52_ >> 8);
							byte i_55_ = (byte) i_52_;
							byte i_56_ = (byte) (i_52_ >>> 24);
							float f_57_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
							float f_58_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
							float f_59_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
							int i_60_ = class522_sub6_sub1.anInt11408 >> 12;
							if (class522_sub6_sub1.aShort11406 != 0) {
								class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_60_, i_60_, 0.0F, 0.0F, 0.0F);
								class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
								class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
								class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_14_);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ - fs[0] - fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ - fs[1] - fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ - fs[2] - fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, 1182666193);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, -859870422);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, 1398838529);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, -315638080);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ - fs[0] + fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ - fs[1] + fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ - fs[2] + fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, 41479021);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, -1677967092);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, -2107092096);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, 186611200);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ + fs[0] + fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ + fs[1] + fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ + fs[2] + fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, 1854179119);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, 1696864545);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, -262829248);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, -234755761);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ + fs[0] - fs_14_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ + fs[1] - fs_14_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ + fs[2] - fs_14_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, 739993503);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, 824795542);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, -220916562);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, 1637887744);
							} else {
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ + f_5_ * (float) -i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ + f_6_ * (float) -i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ + f_7_ * (float) -i_60_);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, 545713555);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, 190657381);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, -653002872);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, 1865409848);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ + f_11_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ + f_12_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ + f_13_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, -1511895504);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, -110371751);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, 1069024480);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, 1817074663);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ + f_5_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ + f_6_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ + f_7_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, -675099409);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, -1096767220);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, -1919831792);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, -1099497776);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_57_ + f_8_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_58_ + f_9_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.method18331(f_59_ + f_10_ * (float) i_60_);
								aClass527_Sub38_Sub1_1498.writeByte(i_53_, 1391277462);
								aClass527_Sub38_Sub1_1498.writeByte(i_54_, 1410920168);
								aClass527_Sub38_Sub1_1498.writeByte(i_55_, -17879607);
								aClass527_Sub38_Sub1_1498.writeByte(i_56_, -2095251578);
							}
						}
					}
				}
			}
		}
		if (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943 != 0) {
			anInterface15_1497.method90(24, (aClass527_Sub38_Sub1_1498.buffer), (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943));
			class180_sub3.method15385(aClass129_1500, null, aClass129_1501, aClass129_1502);
			class180_sub3.method15393(7, 0, (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943 / 24));
		}
	}

	void method2145(Class180_Sub3 class180_sub3) {
		anInterface15_1497 = class180_sub3.method15389(24, null, 196584, true);
		aClass129_1502 = new Class129(anInterface15_1497, 5126, 2, 0);
		aClass129_1500 = new Class129(anInterface15_1497, 5126, 3, 8);
		aClass129_1501 = new Class129(anInterface15_1497, 5121, 4, 20);
	}

	void method2146(Class180_Sub3 class180_sub3) {
		aFloat1514 = class180_sub3.aFloat9779;
		class180_sub3.method15396();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class180_sub3.method15412(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2147(Class180_Sub3 class180_sub3, Class182 class182) {
		if (class180_sub3.aClass427_9736 != null) {
			method2148(class180_sub3);
			float f = class180_sub3.aClass427_9736.aFloatArray4807[2];
			float f_61_ = class180_sub3.aClass427_9736.aFloatArray4807[6];
			float f_62_ = class180_sub3.aClass427_9736.aFloatArray4807[10];
			float f_63_ = class180_sub3.aClass427_9736.aFloatArray4807[14];
			try {
				int i = 0;
				int i_64_ = 2147483647;
				int i_65_ = 0;
				Class522_Sub6 class522_sub6 = class182.aClass710_2094.aClass522_Sub6_8851;
				for (Class522_Sub6 class522_sub6_66_ = class522_sub6.aClass522_Sub6_10329; class522_sub6_66_ != class522_sub6; class522_sub6_66_ = class522_sub6_66_.aClass522_Sub6_10329) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_66_;
					int i_67_ = (int) (f * (float) (class522_sub6_sub1.anInt11411 >> 12) + (f_61_ * (float) (class522_sub6_sub1.anInt11407 >> 12)) + (f_62_ * (float) (class522_sub6_sub1.anInt11403 >> 12)) + f_63_);
					if (i_67_ > i_65_)
						i_65_ = i_67_;
					if (i_67_ < i_64_)
						i_64_ = i_67_;
					anIntArray1508[i++] = i_67_;
				}
				int i_68_ = i_65_ - i_64_;
				int i_69_;
				if (i_68_ + 2 > 1600) {
					i_69_ = (1 + Class15.method735(i_68_, (byte) -117) - anInt1504);
					i_68_ = (i_68_ >> i_69_) + 2;
				} else {
					i_69_ = 0;
					i_68_ += 2;
				}
				Class522_Sub6 class522_sub6_70_ = class522_sub6.aClass522_Sub6_10329;
				i = 0;
				int i_71_ = -2;
				boolean bool = true;
				boolean bool_72_ = true;
				while (class522_sub6_70_ != class522_sub6) {
					anInt1513 = 0;
					for (int i_73_ = 0; i_73_ < i_68_; i_73_++)
						anIntArray1511[i_73_] = 0;
					for (int i_74_ = 0; i_74_ < 64; i_74_++)
						anIntArray1499[i_74_] = 0;
					for (/**/; class522_sub6_70_ != class522_sub6; class522_sub6_70_ = class522_sub6_70_.aClass522_Sub6_10329) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_70_;
						if (bool_72_) {
							i_71_ = class522_sub6_sub1.anInt11410;
							bool = class522_sub6_sub1.aBool11412;
							bool_72_ = false;
						}
						if (i > 0 && (i_71_ != class522_sub6_sub1.anInt11410 || bool != class522_sub6_sub1.aBool11412)) {
							bool_72_ = true;
							break;
						}
						int i_75_ = anIntArray1508[i++] - i_64_ >> i_69_;
						if (i_75_ < 1600) {
							if (anIntArray1511[i_75_] < 64)
								aClass522_Sub6_Sub1ArrayArray1507[i_75_][anIntArray1511[i_75_]++] = class522_sub6_sub1;
							else {
								if (anIntArray1511[i_75_] == 64) {
									if (anInt1513 == 64)
										continue;
									anIntArray1511[i_75_] += 1 + anInt1513++;
								}
								aClass522_Sub6_Sub1ArrayArray1512[anIntArray1511[i_75_] - 64 - 1][anIntArray1499[(anIntArray1511[i_75_] - 64 - 1)]++] = class522_sub6_sub1;
							}
						}
					}
					if (i_71_ >= 0)
						class180_sub3.method15397(i_71_);
					else
						class180_sub3.method15397(-1);
					if (bool && class180_sub3.aFloat9779 != aFloat1514)
						class180_sub3.method3478(aFloat1514);
					else if (class180_sub3.aFloat9779 != 1.0F)
						class180_sub3.method3478(1.0F);
					method2144(class180_sub3, i_68_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2149(class180_sub3);
		}
	}

	void method2148(Class180_Sub3 class180_sub3) {
		aFloat1514 = class180_sub3.aFloat9779;
		class180_sub3.method15396();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class180_sub3.method15412(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2149(Class180_Sub3 class180_sub3) {
		class180_sub3.method15412(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class180_sub3.aFloat9779 != aFloat1514)
			class180_sub3.method3478(aFloat1514);
	}

	void method2150(Class180_Sub3 class180_sub3, int i) {
		OpenGL.glGetFloatv(2982, aFloatArray1510, 0);
		float f = aFloatArray1510[0];
		float f_76_ = aFloatArray1510[4];
		float f_77_ = aFloatArray1510[8];
		float f_78_ = aFloatArray1510[1];
		float f_79_ = aFloatArray1510[5];
		float f_80_ = aFloatArray1510[9];
		float f_81_ = f + f_78_;
		float f_82_ = f_76_ + f_79_;
		float f_83_ = f_77_ + f_80_;
		float f_84_ = f - f_78_;
		float f_85_ = f_76_ - f_79_;
		float f_86_ = f_77_ - f_80_;
		float f_87_ = f_78_ - f;
		float f_88_ = f_79_ - f_76_;
		float f_89_ = f_80_ - f_77_;
		float[] fs = new float[3];
		float[] fs_90_ = new float[3];
		class180_sub3.aClass427_9700.method6823(class180_sub3.aClass427_9729);
		aClass527_Sub38_Sub1_1498.anInt10689 = 0;
		if (class180_sub3.aBool9788) {
			for (int i_91_ = i - 1; i_91_ >= 0; i_91_--) {
				int i_92_ = anIntArray1511[i_91_] > 64 ? 64 : anIntArray1511[i_91_];
				if (i_92_ > 0) {
					for (int i_93_ = i_92_ - 1; i_93_ >= 0; i_93_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = aClass522_Sub6_Sub1ArrayArray1507[i_91_][i_93_];
						int i_94_ = class522_sub6_sub1.anInt11409;
						byte i_95_ = (byte) (i_94_ >> 16);
						byte i_96_ = (byte) (i_94_ >> 8);
						byte i_97_ = (byte) i_94_;
						byte i_98_ = (byte) (i_94_ >>> 24);
						float f_99_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_100_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_101_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_102_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_102_, i_102_, 0.0F, 0.0F, 0.0F);
							class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
							class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_90_);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ - fs[0] - fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ - fs[1] - fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ - fs[2] - fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -1299140945);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, 1721791043);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, 770626078);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, -1698409897);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ - fs[0] + fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ - fs[1] + fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ - fs[2] + fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -310464598);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, -316374680);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, -1317685553);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, 893689595);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ + fs[0] + fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ + fs[1] + fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ + fs[2] + fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -344354929);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, 700754726);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, 75038147);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, -46701995);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ + fs[0] - fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ + fs[1] - fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ + fs[2] - fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -1104303770);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, -869235160);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, 1943018474);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, 1828512566);
						} else {
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ + f_81_ * (float) -i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ + f_82_ * (float) -i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ + f_83_ * (float) -i_102_);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -355712379);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, 885187559);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, -1059469949);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, 283607102);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ + f_87_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ + f_88_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ + f_89_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -171932526);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, -1820304722);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, -1991866342);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, -1017587228);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ + f_81_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ + f_82_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ + f_83_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -297158780);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, -258142311);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, -1076058992);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, -1684390809);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_99_ + f_84_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_100_ + f_85_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.method18329(f_101_ + f_86_ * (float) i_102_);
							aClass527_Sub38_Sub1_1498.writeByte(i_95_, -1721582687);
							aClass527_Sub38_Sub1_1498.writeByte(i_96_, -1875787630);
							aClass527_Sub38_Sub1_1498.writeByte(i_97_, 1679632658);
							aClass527_Sub38_Sub1_1498.writeByte(i_98_, 1939360219);
						}
					}
					if (anIntArray1511[i_91_] > 64) {
						int i_103_ = anIntArray1511[i_91_] - 64 - 1;
						for (int i_104_ = anIntArray1499[i_103_] - 1; i_104_ >= 0; i_104_--) {
							Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1512[i_103_][i_104_]);
							int i_105_ = class522_sub6_sub1.anInt11409;
							byte i_106_ = (byte) (i_105_ >> 16);
							byte i_107_ = (byte) (i_105_ >> 8);
							byte i_108_ = (byte) i_105_;
							byte i_109_ = (byte) (i_105_ >>> 24);
							float f_110_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
							float f_111_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
							float f_112_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
							int i_113_ = class522_sub6_sub1.anInt11408 >> 12;
							if (class522_sub6_sub1.aShort11406 != 0) {
								class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_113_, i_113_, 0.0F, 0.0F, 0.0F);
								class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
								class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
								class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_90_);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ - fs[0] - fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ - fs[1] - fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ - fs[2] - fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, 1616823169);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, -1345843630);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, 2075282208);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, 1168761890);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ - fs[0] + fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ - fs[1] + fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ - fs[2] + fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, 1285770760);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, -916060572);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, -980483705);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, -1601546514);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ + fs[0] + fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ + fs[1] + fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ + fs[2] + fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, 518479982);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, 1421929764);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, -1280844186);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, 212779459);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ + fs[0] - fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ + fs[1] - fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ + fs[2] - fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, -178257862);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, 1816086459);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, -315807444);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, 2065613299);
							} else {
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ + f_81_ * (float) -i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ + f_82_ * (float) -i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ + f_83_ * (float) -i_113_);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, -113119934);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, -932043228);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, -265406313);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, -1292346207);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ + f_87_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ + f_88_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ + f_89_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, 822123435);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, 833465641);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, 1586367669);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, 801581245);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ + f_81_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ + f_82_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ + f_83_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, -642617874);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, -731324314);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, 389097701);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, -2705140);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_110_ + f_84_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_111_ + f_85_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.method18329(f_112_ + f_86_ * (float) i_113_);
								aClass527_Sub38_Sub1_1498.writeByte(i_106_, -1895682353);
								aClass527_Sub38_Sub1_1498.writeByte(i_107_, -770921404);
								aClass527_Sub38_Sub1_1498.writeByte(i_108_, 1900850646);
								aClass527_Sub38_Sub1_1498.writeByte(i_109_, -290961889);
							}
						}
					}
				}
			}
		} else {
			for (int i_114_ = i - 1; i_114_ >= 0; i_114_--) {
				int i_115_ = (anIntArray1511[i_114_] > 64 ? 64 : anIntArray1511[i_114_]);
				if (i_115_ > 0) {
					for (int i_116_ = i_115_ - 1; i_116_ >= 0; i_116_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1507[i_114_][i_116_]);
						int i_117_ = class522_sub6_sub1.anInt11409;
						byte i_118_ = (byte) (i_117_ >> 16);
						byte i_119_ = (byte) (i_117_ >> 8);
						byte i_120_ = (byte) i_117_;
						byte i_121_ = (byte) (i_117_ >>> 24);
						float f_122_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_123_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_124_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_125_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_125_, i_125_, 0.0F, 0.0F, 0.0F);
							class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
							class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_90_);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ - fs[0] - fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ - fs[1] - fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ - fs[2] - fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, 236309352);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, -187027458);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, -994135161);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, -1531733926);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ - fs[0] + fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ - fs[1] + fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ - fs[2] + fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, -2066592485);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, -1701820514);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, -547888316);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, 1654338031);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ + fs[0] + fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ + fs[1] + fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ + fs[2] + fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, 602215330);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, -1233627649);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, 469651886);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, -1694779168);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ + fs[0] - fs_90_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ + fs[1] - fs_90_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ + fs[2] - fs_90_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, 251285251);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, 948063948);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, -2054055758);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, -352411393);
						} else {
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ + f_81_ * (float) -i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ + f_82_ * (float) -i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ + f_83_ * (float) -i_125_);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, -880232045);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, 873988223);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, -998755952);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, -824699409);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ + f_87_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ + f_88_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ + f_89_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, -207973895);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, -833642910);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, -1967255851);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, -329767644);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ + f_81_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ + f_82_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ + f_83_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, 922473773);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, 1210419856);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, -944998817);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, -357095458);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_122_ + f_84_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_123_ + f_85_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.method18331(f_124_ + f_86_ * (float) i_125_);
							aClass527_Sub38_Sub1_1498.writeByte(i_118_, -1707755405);
							aClass527_Sub38_Sub1_1498.writeByte(i_119_, 1717919731);
							aClass527_Sub38_Sub1_1498.writeByte(i_120_, 549657440);
							aClass527_Sub38_Sub1_1498.writeByte(i_121_, -1949995727);
						}
					}
					if (anIntArray1511[i_114_] > 64) {
						int i_126_ = anIntArray1511[i_114_] - 64 - 1;
						for (int i_127_ = anIntArray1499[i_126_] - 1; i_127_ >= 0; i_127_--) {
							Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1512[i_126_][i_127_]);
							int i_128_ = class522_sub6_sub1.anInt11409;
							byte i_129_ = (byte) (i_128_ >> 16);
							byte i_130_ = (byte) (i_128_ >> 8);
							byte i_131_ = (byte) i_128_;
							byte i_132_ = (byte) (i_128_ >>> 24);
							float f_133_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
							float f_134_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
							float f_135_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
							int i_136_ = class522_sub6_sub1.anInt11408 >> 12;
							if (class522_sub6_sub1.aShort11406 != 0) {
								class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_136_, i_136_, 0.0F, 0.0F, 0.0F);
								class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
								class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
								class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_90_);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ - fs[0] - fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ - fs[1] - fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ - fs[2] - fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, 1740596067);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, 99236935);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, 49969234);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, 396764160);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ - fs[0] + fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ - fs[1] + fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ - fs[2] + fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, 1825303012);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, -673297899);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, 339175686);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, 691897596);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ + fs[0] + fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ + fs[1] + fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ + fs[2] + fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, -534936021);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, 245467831);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, -505936742);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, -2038809432);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ + fs[0] - fs_90_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ + fs[1] - fs_90_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ + fs[2] - fs_90_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, -1236921664);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, 822075482);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, 1581365118);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, -324922025);
							} else {
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ + f_81_ * (float) -i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ + f_82_ * (float) -i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ + f_83_ * (float) -i_136_);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, 733791353);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, 1449023478);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, 341351790);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, -1781931733);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ + f_87_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ + f_88_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ + f_89_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, -231660420);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, -1148734633);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, -322430086);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, -1180654569);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ + f_81_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ + f_82_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ + f_83_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, -1283241408);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, -322948329);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, -167462401);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, 1756757469);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_133_ + f_84_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_134_ + f_85_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.method18331(f_135_ + f_86_ * (float) i_136_);
								aClass527_Sub38_Sub1_1498.writeByte(i_129_, -2117511797);
								aClass527_Sub38_Sub1_1498.writeByte(i_130_, -1362583393);
								aClass527_Sub38_Sub1_1498.writeByte(i_131_, -722518354);
								aClass527_Sub38_Sub1_1498.writeByte(i_132_, -563882992);
							}
						}
					}
				}
			}
		}
		if (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943 != 0) {
			anInterface15_1497.method90(24, (aClass527_Sub38_Sub1_1498.buffer), (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943));
			class180_sub3.method15385(aClass129_1500, null, aClass129_1501, aClass129_1502);
			class180_sub3.method15393(7, 0, (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943 / 24));
		}
	}

	void method2151(Class180_Sub3 class180_sub3) {
		anInterface15_1497 = class180_sub3.method15389(24, null, 196584, true);
		aClass129_1502 = new Class129(anInterface15_1497, 5126, 2, 0);
		aClass129_1500 = new Class129(anInterface15_1497, 5126, 3, 8);
		aClass129_1501 = new Class129(anInterface15_1497, 5121, 4, 20);
	}

	void method2152(Class180_Sub3 class180_sub3) {
		anInterface15_1497 = class180_sub3.method15389(24, null, 196584, true);
		aClass129_1502 = new Class129(anInterface15_1497, 5126, 2, 0);
		aClass129_1500 = new Class129(anInterface15_1497, 5126, 3, 8);
		aClass129_1501 = new Class129(anInterface15_1497, 5121, 4, 20);
	}

	void method2153(Class180_Sub3 class180_sub3, Class182 class182) {
		if (class180_sub3.aClass427_9736 != null) {
			method2148(class180_sub3);
			float f = class180_sub3.aClass427_9736.aFloatArray4807[2];
			float f_137_ = class180_sub3.aClass427_9736.aFloatArray4807[6];
			float f_138_ = class180_sub3.aClass427_9736.aFloatArray4807[10];
			float f_139_ = class180_sub3.aClass427_9736.aFloatArray4807[14];
			try {
				int i = 0;
				int i_140_ = 2147483647;
				int i_141_ = 0;
				Class522_Sub6 class522_sub6 = class182.aClass710_2094.aClass522_Sub6_8851;
				for (Class522_Sub6 class522_sub6_142_ = class522_sub6.aClass522_Sub6_10329; class522_sub6_142_ != class522_sub6; class522_sub6_142_ = class522_sub6_142_.aClass522_Sub6_10329) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_142_;
					int i_143_ = (int) (f * (float) (class522_sub6_sub1.anInt11411 >> 12) + (f_137_ * (float) (class522_sub6_sub1.anInt11407 >> 12)) + (f_138_ * (float) (class522_sub6_sub1.anInt11403 >> 12)) + f_139_);
					if (i_143_ > i_141_)
						i_141_ = i_143_;
					if (i_143_ < i_140_)
						i_140_ = i_143_;
					anIntArray1508[i++] = i_143_;
				}
				int i_144_ = i_141_ - i_140_;
				int i_145_;
				if (i_144_ + 2 > 1600) {
					i_145_ = (1 + Class15.method735(i_144_, (byte) -58) - anInt1504);
					i_144_ = (i_144_ >> i_145_) + 2;
				} else {
					i_145_ = 0;
					i_144_ += 2;
				}
				Class522_Sub6 class522_sub6_146_ = class522_sub6.aClass522_Sub6_10329;
				i = 0;
				int i_147_ = -2;
				boolean bool = true;
				boolean bool_148_ = true;
				while (class522_sub6_146_ != class522_sub6) {
					anInt1513 = 0;
					for (int i_149_ = 0; i_149_ < i_144_; i_149_++)
						anIntArray1511[i_149_] = 0;
					for (int i_150_ = 0; i_150_ < 64; i_150_++)
						anIntArray1499[i_150_] = 0;
					for (/**/; class522_sub6_146_ != class522_sub6; class522_sub6_146_ = class522_sub6_146_.aClass522_Sub6_10329) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_146_;
						if (bool_148_) {
							i_147_ = class522_sub6_sub1.anInt11410;
							bool = class522_sub6_sub1.aBool11412;
							bool_148_ = false;
						}
						if (i > 0 && (i_147_ != class522_sub6_sub1.anInt11410 || bool != class522_sub6_sub1.aBool11412)) {
							bool_148_ = true;
							break;
						}
						int i_151_ = anIntArray1508[i++] - i_140_ >> i_145_;
						if (i_151_ < 1600) {
							if (anIntArray1511[i_151_] < 64)
								aClass522_Sub6_Sub1ArrayArray1507[i_151_][anIntArray1511[i_151_]++] = class522_sub6_sub1;
							else {
								if (anIntArray1511[i_151_] == 64) {
									if (anInt1513 == 64)
										continue;
									anIntArray1511[i_151_] += 1 + anInt1513++;
								}
								aClass522_Sub6_Sub1ArrayArray1512[anIntArray1511[i_151_] - 64 - 1][anIntArray1499[(anIntArray1511[i_151_] - 64 - 1)]++] = class522_sub6_sub1;
							}
						}
					}
					if (i_147_ >= 0)
						class180_sub3.method15397(i_147_);
					else
						class180_sub3.method15397(-1);
					if (bool && class180_sub3.aFloat9779 != aFloat1514)
						class180_sub3.method3478(aFloat1514);
					else if (class180_sub3.aFloat9779 != 1.0F)
						class180_sub3.method3478(1.0F);
					method2144(class180_sub3, i_144_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2149(class180_sub3);
		}
	}

	void method2154(Class180_Sub3 class180_sub3, Class182 class182) {
		if (class180_sub3.aClass427_9736 != null) {
			method2148(class180_sub3);
			float f = class180_sub3.aClass427_9736.aFloatArray4807[2];
			float f_152_ = class180_sub3.aClass427_9736.aFloatArray4807[6];
			float f_153_ = class180_sub3.aClass427_9736.aFloatArray4807[10];
			float f_154_ = class180_sub3.aClass427_9736.aFloatArray4807[14];
			try {
				int i = 0;
				int i_155_ = 2147483647;
				int i_156_ = 0;
				Class522_Sub6 class522_sub6 = class182.aClass710_2094.aClass522_Sub6_8851;
				for (Class522_Sub6 class522_sub6_157_ = class522_sub6.aClass522_Sub6_10329; class522_sub6_157_ != class522_sub6; class522_sub6_157_ = class522_sub6_157_.aClass522_Sub6_10329) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_157_;
					int i_158_ = (int) (f * (float) (class522_sub6_sub1.anInt11411 >> 12) + (f_152_ * (float) (class522_sub6_sub1.anInt11407 >> 12)) + (f_153_ * (float) (class522_sub6_sub1.anInt11403 >> 12)) + f_154_);
					if (i_158_ > i_156_)
						i_156_ = i_158_;
					if (i_158_ < i_155_)
						i_155_ = i_158_;
					anIntArray1508[i++] = i_158_;
				}
				int i_159_ = i_156_ - i_155_;
				int i_160_;
				if (i_159_ + 2 > 1600) {
					i_160_ = (1 + Class15.method735(i_159_, (byte) -121) - anInt1504);
					i_159_ = (i_159_ >> i_160_) + 2;
				} else {
					i_160_ = 0;
					i_159_ += 2;
				}
				Class522_Sub6 class522_sub6_161_ = class522_sub6.aClass522_Sub6_10329;
				i = 0;
				int i_162_ = -2;
				boolean bool = true;
				boolean bool_163_ = true;
				while (class522_sub6_161_ != class522_sub6) {
					anInt1513 = 0;
					for (int i_164_ = 0; i_164_ < i_159_; i_164_++)
						anIntArray1511[i_164_] = 0;
					for (int i_165_ = 0; i_165_ < 64; i_165_++)
						anIntArray1499[i_165_] = 0;
					for (/**/; class522_sub6_161_ != class522_sub6; class522_sub6_161_ = class522_sub6_161_.aClass522_Sub6_10329) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_161_;
						if (bool_163_) {
							i_162_ = class522_sub6_sub1.anInt11410;
							bool = class522_sub6_sub1.aBool11412;
							bool_163_ = false;
						}
						if (i > 0 && (i_162_ != class522_sub6_sub1.anInt11410 || bool != class522_sub6_sub1.aBool11412)) {
							bool_163_ = true;
							break;
						}
						int i_166_ = anIntArray1508[i++] - i_155_ >> i_160_;
						if (i_166_ < 1600) {
							if (anIntArray1511[i_166_] < 64)
								aClass522_Sub6_Sub1ArrayArray1507[i_166_][anIntArray1511[i_166_]++] = class522_sub6_sub1;
							else {
								if (anIntArray1511[i_166_] == 64) {
									if (anInt1513 == 64)
										continue;
									anIntArray1511[i_166_] += 1 + anInt1513++;
								}
								aClass522_Sub6_Sub1ArrayArray1512[anIntArray1511[i_166_] - 64 - 1][anIntArray1499[(anIntArray1511[i_166_] - 64 - 1)]++] = class522_sub6_sub1;
							}
						}
					}
					if (i_162_ >= 0)
						class180_sub3.method15397(i_162_);
					else
						class180_sub3.method15397(-1);
					if (bool && class180_sub3.aFloat9779 != aFloat1514)
						class180_sub3.method3478(aFloat1514);
					else if (class180_sub3.aFloat9779 != 1.0F)
						class180_sub3.method3478(1.0F);
					method2144(class180_sub3, i_159_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2149(class180_sub3);
		}
	}

	void method2155(Class180_Sub3 class180_sub3, int i) {
		OpenGL.glGetFloatv(2982, aFloatArray1510, 0);
		float f = aFloatArray1510[0];
		float f_167_ = aFloatArray1510[4];
		float f_168_ = aFloatArray1510[8];
		float f_169_ = aFloatArray1510[1];
		float f_170_ = aFloatArray1510[5];
		float f_171_ = aFloatArray1510[9];
		float f_172_ = f + f_169_;
		float f_173_ = f_167_ + f_170_;
		float f_174_ = f_168_ + f_171_;
		float f_175_ = f - f_169_;
		float f_176_ = f_167_ - f_170_;
		float f_177_ = f_168_ - f_171_;
		float f_178_ = f_169_ - f;
		float f_179_ = f_170_ - f_167_;
		float f_180_ = f_171_ - f_168_;
		float[] fs = new float[3];
		float[] fs_181_ = new float[3];
		class180_sub3.aClass427_9700.method6823(class180_sub3.aClass427_9729);
		aClass527_Sub38_Sub1_1498.anInt10689 = 0;
		if (class180_sub3.aBool9788) {
			for (int i_182_ = i - 1; i_182_ >= 0; i_182_--) {
				int i_183_ = (anIntArray1511[i_182_] > 64 ? 64 : anIntArray1511[i_182_]);
				if (i_183_ > 0) {
					for (int i_184_ = i_183_ - 1; i_184_ >= 0; i_184_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1507[i_182_][i_184_]);
						int i_185_ = class522_sub6_sub1.anInt11409;
						byte i_186_ = (byte) (i_185_ >> 16);
						byte i_187_ = (byte) (i_185_ >> 8);
						byte i_188_ = (byte) i_185_;
						byte i_189_ = (byte) (i_185_ >>> 24);
						float f_190_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_191_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_192_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_193_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_193_, i_193_, 0.0F, 0.0F, 0.0F);
							class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
							class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_181_);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ - fs[0] - fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ - fs[1] - fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ - fs[2] - fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, 1149277753);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, -1936828887);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, 2054734858);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, 965754731);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ - fs[0] + fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ - fs[1] + fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ - fs[2] + fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, -906086078);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, -2023726122);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, -545362400);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, -1462404686);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ + fs[0] + fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ + fs[1] + fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ + fs[2] + fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, 1754718053);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, 1669678030);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, -1835093590);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, -728126115);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ + fs[0] - fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ + fs[1] - fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ + fs[2] - fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, -953861718);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, 269079226);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, -1028736617);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, 292079422);
						} else {
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ + f_172_ * (float) -i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ + f_173_ * (float) -i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ + f_174_ * (float) -i_193_);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, -616717466);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, 617146386);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, 885764132);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, 625970169);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ + f_178_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ + f_179_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ + f_180_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, 1589320769);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, 1526849571);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, 1534941409);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, -552549888);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ + f_172_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ + f_173_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ + f_174_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, -1473150416);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, -1971952120);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, 298969772);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, -1424647275);
							aClass527_Sub38_Sub1_1498.method18329(1.0F);
							aClass527_Sub38_Sub1_1498.method18329(0.0F);
							aClass527_Sub38_Sub1_1498.method18329(f_190_ + f_175_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_191_ + f_176_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.method18329(f_192_ + f_177_ * (float) i_193_);
							aClass527_Sub38_Sub1_1498.writeByte(i_186_, -441644165);
							aClass527_Sub38_Sub1_1498.writeByte(i_187_, -55083607);
							aClass527_Sub38_Sub1_1498.writeByte(i_188_, -2007291468);
							aClass527_Sub38_Sub1_1498.writeByte(i_189_, 1782669513);
						}
					}
					if (anIntArray1511[i_182_] > 64) {
						int i_194_ = anIntArray1511[i_182_] - 64 - 1;
						for (int i_195_ = anIntArray1499[i_194_] - 1; i_195_ >= 0; i_195_--) {
							Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1512[i_194_][i_195_]);
							int i_196_ = class522_sub6_sub1.anInt11409;
							byte i_197_ = (byte) (i_196_ >> 16);
							byte i_198_ = (byte) (i_196_ >> 8);
							byte i_199_ = (byte) i_196_;
							byte i_200_ = (byte) (i_196_ >>> 24);
							float f_201_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
							float f_202_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
							float f_203_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
							int i_204_ = class522_sub6_sub1.anInt11408 >> 12;
							if (class522_sub6_sub1.aShort11406 != 0) {
								class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_204_, i_204_, 0.0F, 0.0F, 0.0F);
								class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
								class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
								class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_181_);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ - fs[0] - fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ - fs[1] - fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ - fs[2] - fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, 1042743479);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, 1967771075);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, -957038217);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, 735074690);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ - fs[0] + fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ - fs[1] + fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ - fs[2] + fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, -2095597876);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, 2051615199);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, -1690575164);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, 1751775089);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ + fs[0] + fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ + fs[1] + fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ + fs[2] + fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, -527578896);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, 909335640);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, -526382663);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, -108117993);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ + fs[0] - fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ + fs[1] - fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ + fs[2] - fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, 1597149866);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, -1199427495);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, -1007337532);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, 1166440136);
							} else {
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ + f_172_ * (float) -i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ + f_173_ * (float) -i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ + f_174_ * (float) -i_204_);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, 279177679);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, 1740422108);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, -110146140);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, -184482137);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ + f_178_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ + f_179_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ + f_180_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, 1670060165);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, 614984107);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, -789681816);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, 75541669);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ + f_172_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ + f_173_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ + f_174_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, 1641617222);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, -348241056);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, -1450898322);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, 549904773);
								aClass527_Sub38_Sub1_1498.method18329(1.0F);
								aClass527_Sub38_Sub1_1498.method18329(0.0F);
								aClass527_Sub38_Sub1_1498.method18329(f_201_ + f_175_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_202_ + f_176_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.method18329(f_203_ + f_177_ * (float) i_204_);
								aClass527_Sub38_Sub1_1498.writeByte(i_197_, -2138044715);
								aClass527_Sub38_Sub1_1498.writeByte(i_198_, -1424557208);
								aClass527_Sub38_Sub1_1498.writeByte(i_199_, 2048855397);
								aClass527_Sub38_Sub1_1498.writeByte(i_200_, -94272550);
							}
						}
					}
				}
			}
		} else {
			for (int i_205_ = i - 1; i_205_ >= 0; i_205_--) {
				int i_206_ = (anIntArray1511[i_205_] > 64 ? 64 : anIntArray1511[i_205_]);
				if (i_206_ > 0) {
					for (int i_207_ = i_206_ - 1; i_207_ >= 0; i_207_--) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1507[i_205_][i_207_]);
						int i_208_ = class522_sub6_sub1.anInt11409;
						byte i_209_ = (byte) (i_208_ >> 16);
						byte i_210_ = (byte) (i_208_ >> 8);
						byte i_211_ = (byte) i_208_;
						byte i_212_ = (byte) (i_208_ >>> 24);
						float f_213_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
						float f_214_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
						float f_215_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
						int i_216_ = class522_sub6_sub1.anInt11408 >> 12;
						if (class522_sub6_sub1.aShort11406 != 0) {
							class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_216_, i_216_, 0.0F, 0.0F, 0.0F);
							class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
							class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
							class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_181_);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ - fs[0] - fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ - fs[1] - fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ - fs[2] - fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, 763488842);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, -1645988101);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, -97387958);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, -1719418361);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ - fs[0] + fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ - fs[1] + fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ - fs[2] + fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, 1819058444);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, -1884252122);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, 1784590957);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, -1202568131);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ + fs[0] + fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ + fs[1] + fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ + fs[2] + fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, -1713692464);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, 1501824960);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, 300695661);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, -959801729);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ + fs[0] - fs_181_[0]);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ + fs[1] - fs_181_[1]);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ + fs[2] - fs_181_[2]);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, -818679906);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, 1008189302);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, 990114870);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, 2020463264);
						} else {
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ + f_172_ * (float) -i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ + f_173_ * (float) -i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ + f_174_ * (float) -i_216_);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, 1750916556);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, -717122621);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, -862536439);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, -1730770367);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ + f_178_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ + f_179_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ + f_180_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, -799277057);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, 398360047);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, -1781283980);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, 1633808600);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ + f_172_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ + f_173_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ + f_174_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, -10622672);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, -100375017);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, -199736492);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, -1491843676);
							aClass527_Sub38_Sub1_1498.method18331(1.0F);
							aClass527_Sub38_Sub1_1498.method18331(0.0F);
							aClass527_Sub38_Sub1_1498.method18331(f_213_ + f_175_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_214_ + f_176_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.method18331(f_215_ + f_177_ * (float) i_216_);
							aClass527_Sub38_Sub1_1498.writeByte(i_209_, -108452700);
							aClass527_Sub38_Sub1_1498.writeByte(i_210_, 2109943076);
							aClass527_Sub38_Sub1_1498.writeByte(i_211_, -1321163303);
							aClass527_Sub38_Sub1_1498.writeByte(i_212_, -186614344);
						}
					}
					if (anIntArray1511[i_205_] > 64) {
						int i_217_ = anIntArray1511[i_205_] - 64 - 1;
						for (int i_218_ = anIntArray1499[i_217_] - 1; i_218_ >= 0; i_218_--) {
							Class522_Sub6_Sub1 class522_sub6_sub1 = (aClass522_Sub6_Sub1ArrayArray1512[i_217_][i_218_]);
							int i_219_ = class522_sub6_sub1.anInt11409;
							byte i_220_ = (byte) (i_219_ >> 16);
							byte i_221_ = (byte) (i_219_ >> 8);
							byte i_222_ = (byte) i_219_;
							byte i_223_ = (byte) (i_219_ >>> 24);
							float f_224_ = (float) (class522_sub6_sub1.anInt11411 >> 12);
							float f_225_ = (float) (class522_sub6_sub1.anInt11407 >> 12);
							float f_226_ = (float) (class522_sub6_sub1.anInt11403 >> 12);
							int i_227_ = class522_sub6_sub1.anInt11408 >> 12;
							if (class522_sub6_sub1.aShort11406 != 0) {
								class180_sub3.aClass427_9841.method6804(class522_sub6_sub1.aShort11406, i_227_, i_227_, 0.0F, 0.0F, 0.0F);
								class180_sub3.aClass427_9841.method6751(class180_sub3.aClass427_9700);
								class180_sub3.aClass427_9841.method6773(1.0F, 0.0F, 0.0F, fs);
								class180_sub3.aClass427_9841.method6773(0.0F, 1.0F, 0.0F, fs_181_);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ - fs[0] - fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ - fs[1] - fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ - fs[2] - fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, 587657202);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, 1052571345);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, -851256447);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, 58404345);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ - fs[0] + fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ - fs[1] + fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ - fs[2] + fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, 1655256320);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, -459426904);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, 1526330908);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, -52382442);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ + fs[0] + fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ + fs[1] + fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ + fs[2] + fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, -778714107);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, -1602622715);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, -1391787323);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, -1766414957);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ + fs[0] - fs_181_[0]);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ + fs[1] - fs_181_[1]);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ + fs[2] - fs_181_[2]);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, 459197831);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, 1268565264);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, -993319955);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, 1269854148);
							} else {
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ + f_172_ * (float) -i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ + f_173_ * (float) -i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ + f_174_ * (float) -i_227_);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, -1225745314);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, -900901690);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, 1242491731);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, -652260407);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ + f_178_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ + f_179_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ + f_180_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, -977498193);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, 36905456);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, 1204483077);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, -1563073641);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ + f_172_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ + f_173_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ + f_174_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, -1417063184);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, 16905001);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, 2121120864);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, -1132184337);
								aClass527_Sub38_Sub1_1498.method18331(1.0F);
								aClass527_Sub38_Sub1_1498.method18331(0.0F);
								aClass527_Sub38_Sub1_1498.method18331(f_224_ + f_175_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_225_ + f_176_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.method18331(f_226_ + f_177_ * (float) i_227_);
								aClass527_Sub38_Sub1_1498.writeByte(i_220_, 1448108520);
								aClass527_Sub38_Sub1_1498.writeByte(i_221_, -585836580);
								aClass527_Sub38_Sub1_1498.writeByte(i_222_, 1373290515);
								aClass527_Sub38_Sub1_1498.writeByte(i_223_, 348021603);
							}
						}
					}
				}
			}
		}
		if (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943 != 0) {
			anInterface15_1497.method90(24, (aClass527_Sub38_Sub1_1498.buffer), (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943));
			class180_sub3.method15385(aClass129_1500, null, aClass129_1501, aClass129_1502);
			class180_sub3.method15393(7, 0, (aClass527_Sub38_Sub1_1498.anInt10689 * -441238943 / 24));
		}
	}

	Class124() {
		aClass527_Sub38_Sub1_1498 = new Class527_Sub38_Sub1(786336);
		anInt1503 = 64;
		anInt1509 = 768;
		anInt1505 = 1600;
		anInt1504 = Class15.method735(1600, (byte) -64);
		anInt1506 = 64;
		anIntArray1508 = new int[8191];
		anIntArray1511 = new int[1600];
		anIntArray1499 = new int[64];
		aClass522_Sub6_Sub1ArrayArray1507 = new Class522_Sub6_Sub1[1600][64];
		aClass522_Sub6_Sub1ArrayArray1512 = new Class522_Sub6_Sub1[64][768];
		anInt1513 = 0;
	}

	void method2156(Class180_Sub3 class180_sub3, Class182 class182) {
		if (class180_sub3.aClass427_9736 != null) {
			method2148(class180_sub3);
			float f = class180_sub3.aClass427_9736.aFloatArray4807[2];
			float f_228_ = class180_sub3.aClass427_9736.aFloatArray4807[6];
			float f_229_ = class180_sub3.aClass427_9736.aFloatArray4807[10];
			float f_230_ = class180_sub3.aClass427_9736.aFloatArray4807[14];
			try {
				int i = 0;
				int i_231_ = 2147483647;
				int i_232_ = 0;
				Class522_Sub6 class522_sub6 = class182.aClass710_2094.aClass522_Sub6_8851;
				for (Class522_Sub6 class522_sub6_233_ = class522_sub6.aClass522_Sub6_10329; class522_sub6_233_ != class522_sub6; class522_sub6_233_ = class522_sub6_233_.aClass522_Sub6_10329) {
					Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_233_;
					int i_234_ = (int) (f * (float) (class522_sub6_sub1.anInt11411 >> 12) + (f_228_ * (float) (class522_sub6_sub1.anInt11407 >> 12)) + (f_229_ * (float) (class522_sub6_sub1.anInt11403 >> 12)) + f_230_);
					if (i_234_ > i_232_)
						i_232_ = i_234_;
					if (i_234_ < i_231_)
						i_231_ = i_234_;
					anIntArray1508[i++] = i_234_;
				}
				int i_235_ = i_232_ - i_231_;
				int i_236_;
				if (i_235_ + 2 > 1600) {
					i_236_ = (1 + Class15.method735(i_235_, (byte) -100) - anInt1504);
					i_235_ = (i_235_ >> i_236_) + 2;
				} else {
					i_236_ = 0;
					i_235_ += 2;
				}
				Class522_Sub6 class522_sub6_237_ = class522_sub6.aClass522_Sub6_10329;
				i = 0;
				int i_238_ = -2;
				boolean bool = true;
				boolean bool_239_ = true;
				while (class522_sub6_237_ != class522_sub6) {
					anInt1513 = 0;
					for (int i_240_ = 0; i_240_ < i_235_; i_240_++)
						anIntArray1511[i_240_] = 0;
					for (int i_241_ = 0; i_241_ < 64; i_241_++)
						anIntArray1499[i_241_] = 0;
					for (/**/; class522_sub6_237_ != class522_sub6; class522_sub6_237_ = class522_sub6_237_.aClass522_Sub6_10329) {
						Class522_Sub6_Sub1 class522_sub6_sub1 = (Class522_Sub6_Sub1) class522_sub6_237_;
						if (bool_239_) {
							i_238_ = class522_sub6_sub1.anInt11410;
							bool = class522_sub6_sub1.aBool11412;
							bool_239_ = false;
						}
						if (i > 0 && (i_238_ != class522_sub6_sub1.anInt11410 || bool != class522_sub6_sub1.aBool11412)) {
							bool_239_ = true;
							break;
						}
						int i_242_ = anIntArray1508[i++] - i_231_ >> i_236_;
						if (i_242_ < 1600) {
							if (anIntArray1511[i_242_] < 64)
								aClass522_Sub6_Sub1ArrayArray1507[i_242_][anIntArray1511[i_242_]++] = class522_sub6_sub1;
							else {
								if (anIntArray1511[i_242_] == 64) {
									if (anInt1513 == 64)
										continue;
									anIntArray1511[i_242_] += 1 + anInt1513++;
								}
								aClass522_Sub6_Sub1ArrayArray1512[anIntArray1511[i_242_] - 64 - 1][anIntArray1499[(anIntArray1511[i_242_] - 64 - 1)]++] = class522_sub6_sub1;
							}
						}
					}
					if (i_238_ >= 0)
						class180_sub3.method15397(i_238_);
					else
						class180_sub3.method15397(-1);
					if (bool && class180_sub3.aFloat9779 != aFloat1514)
						class180_sub3.method3478(aFloat1514);
					else if (class180_sub3.aFloat9779 != 1.0F)
						class180_sub3.method3478(1.0F);
					method2144(class180_sub3, i_235_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2149(class180_sub3);
		}
	}

	void method2157(Class180_Sub3 class180_sub3) {
		class180_sub3.method15412(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class180_sub3.aFloat9779 != aFloat1514)
			class180_sub3.method3478(aFloat1514);
	}
}

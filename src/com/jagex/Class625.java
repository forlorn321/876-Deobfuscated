/* Class625 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class625 {
	float aFloat8134;
	float aFloat8135;
	float aFloat8136;
	float aFloat8137;
	Class436 aClass436_8138;
	Class176 aClass176_8139;
	int anInt8140;
	float aFloat8141;
	float aFloat8142;
	int anInt8143;
	float aFloat8144;
	Class507 aClass507_8145;
	float aFloat8146 = 1.0F;
	float aFloat8147 = 0.0F;
	float aFloat8148 = 1.0F;
	float aFloat8149;
	int anInt8150;
	int[] anIntArray8151;
	float[] aFloatArray8152;

	public void method7430(RSByteBuffer class536_sub33, Class636 class636, byte i) {
		int i_0_ = class536_sub33.readUnsignedByte(70927858);
		if (Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0) == 1 && Class677.aClass167_8609.method2108() > 0) {
			if (0 != (i_0_ & Class643.aClass643_8346.anInt8345 * -742426051))
				anInt8150 = class536_sub33.readInt() * -570918605;
			else
				anInt8150 = 1426556621;
			if ((i_0_ & -742426051 * Class643.aClass643_8335.anInt8345) != 0)
				aFloat8135 = (float) class536_sub33.readUnsignedShort() / 256.0F;
			else
				aFloat8135 = 1.1523438F;
			if (0 != (i_0_ & -742426051 * Class643.aClass643_8337.anInt8345))
				aFloat8141 = (float) class536_sub33.readUnsignedShort() / 256.0F;
			else
				aFloat8141 = 0.69921875F;
			if ((i_0_ & -742426051 * Class643.aClass643_8338.anInt8345) != 0)
				aFloat8137 = ((float) class536_sub33.readUnsignedShort() / 256.0F);
			else
				aFloat8137 = 1.2F;
		} else {
			if ((i_0_ & Class643.aClass643_8346.anInt8345 * -742426051) != 0)
				class536_sub33.readInt();
			if ((i_0_ & -742426051 * Class643.aClass643_8335.anInt8345) != 0)
				class536_sub33.readUnsignedShort();
			if (0 != (i_0_ & -742426051 * Class643.aClass643_8337.anInt8345))
				class536_sub33.readUnsignedShort();
			if ((i_0_ & -742426051 * Class643.aClass643_8338.anInt8345) != 0)
				class536_sub33.readUnsignedShort();
			anInt8150 = 1426556621;
			aFloat8137 = 1.2F;
			aFloat8141 = 0.69921875F;
			aFloat8135 = 1.1523438F;
		}
		if ((i_0_ & Class643.aClass643_8339.anInt8345 * -742426051) != 0)
			aClass436_8138 = Class436.method5257((float) class536_sub33.readShort((byte) -47), (float) class536_sub33.readShort((byte) -27), (float) class536_sub33.readShort((byte) -48));
		else
			aClass436_8138 = Class436.method5257(-50.0F, -60.0F, -50.0F);
		if (0 != (i_0_ & -742426051 * Class643.aClass643_8336.anInt8345))
			anInt8140 = class536_sub33.readInt() * 2042993843;
		else
			anInt8140 = -1962076808;
		if ((i_0_ & -742426051 * Class643.aClass643_8341.anInt8345) != 0)
			anInt8143 = class536_sub33.readUnsignedShort() * -246653865;
		else
			anInt8143 = 0;
		if ((i_0_ & Class643.aClass643_8350.anInt8345 * -742426051) != 0) {
			int i_1_ = class536_sub33.readUnsignedShort();
			aClass176_8139 = class636.method7573(i_1_, 241337155);
		} else
			aClass176_8139 = RuntimeException_Sub4.aClass176_12094;
	}

	void method7431(byte i) {
		anInt8150 = 1426556621;
		aClass436_8138 = Class436.method5257(-50.0F, -60.0F, -50.0F);
		aFloat8135 = 1.1523438F;
		aFloat8141 = 0.69921875F;
		aFloat8137 = 1.2F;
		anInt8140 = -1962076808;
		anInt8143 = 0;
		aClass176_8139 = RuntimeException_Sub4.aClass176_12094;
		aFloat8142 = 1.0F;
		aFloat8144 = 0.25F;
		aFloat8149 = 1.0F;
		aClass507_8145 = Class110.aClass507_1377;
		aFloat8146 = 1.0F;
		aFloat8147 = 0.0F;
		aFloat8148 = 1.0F;
		aFloat8134 = 0.0F;
		aFloat8136 = 1.0F;
		int[] is = anIntArray8151;
		int[] is_2_ = anIntArray8151;
		anIntArray8151[2] = -1;
		is_2_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8152;
		float[] fs_3_ = aFloatArray8152;
		aFloatArray8152[2] = 0.0F;
		fs_3_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	void method7432(Class636 class636, Class642 class642, int i) {
		if (Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0) == 1 && Class677.aClass167_8609.method2108() > 0) {
			if (class642.method7688(1845527246) != -1)
				anInt8150 = class642.method7688(-1069767885) * -570918605;
			if (class642.method7689((byte) 0) != -1.0F)
				aFloat8135 = class642.method7689((byte) 0);
			if (class642.method7690(414097532) != -1.0F)
				aFloat8141 = class642.method7690(748525189);
			if (class642.method7691((byte) 15) != -1.0F)
				aFloat8137 = class642.method7691((byte) 37);
		}
		if (class642.method7687(255294042) != null)
			aClass436_8138.method5272(class642.method7687(-1283523785));
		if (class642.method7713((byte) 1) != -1)
			anInt8140 = class642.method7713((byte) 1) * 2042993843;
		if (class642.method7728((short) 11811) != -1)
			anInt8143 = class642.method7728((short) 19778) * -246653865;
		if (class642.method7730(-409491641) != -1.0F)
			aFloat8144 = class642.method7730(172753197);
		if (class642.method7696(-265863553) != -1.0F)
			aFloat8149 = class642.method7696(-265863553);
		if (class642.method7697(104782110) != -1.0F)
			aFloat8142 = class642.method7697(560811157);
		if (class642.method7692(-712698209) != -1)
			aClass176_8139 = class636.method7573(class642.method7692(-712698209), -1697782389);
		if (class642.method7698(1779415562) != -1) {
			int i_4_ = class642.method7698(1779415562);
			int i_5_ = class642.method7695(1853674345);
			int i_6_ = class642.method7700(-590260309);
			int i_7_ = class642.method7701(2023645196);
			int i_8_ = class642.method7707((byte) 2);
			Class206_Sub1.anInt10025 = 76870447 * i_8_;
			aClass507_8145 = class636.method7612(i_4_, i_5_, i_6_, i_7_, (short) 16383);
		}
		if (class642.method7702(0, (byte) 67) != -1) {
			anIntArray8151[0] = class642.method7702(0, (byte) 123);
			aFloatArray8152[0] = class642.method7703(0, (byte) 0);
		}
		if (class642.method7702(1, (byte) 41) != -1) {
			anIntArray8151[1] = class642.method7702(1, (byte) 63);
			aFloatArray8152[1] = class642.method7703(1, (byte) 0);
		}
		if (class642.method7702(2, (byte) 70) != -1) {
			anIntArray8151[2] = class642.method7702(2, (byte) 15);
			aFloatArray8152[2] = class642.method7703(2, (byte) 0);
		}
	}

	void method7433(Class167 class167, Class625 class625_9_, Class625 class625_10_, float f, int i) {
		anInt8150 = Class302.method4097(class625_9_.anInt8150 * -702010885, -702010885 * class625_10_.anInt8150, 255.0F * f, -1246900406) * -570918605;
		aFloat8141 = ((class625_10_.aFloat8141 - class625_9_.aFloat8141) * f + class625_9_.aFloat8141);
		aFloat8137 = (f * (class625_10_.aFloat8137 - class625_9_.aFloat8137) + class625_9_.aFloat8137);
		aFloat8135 = (f * (class625_10_.aFloat8135 - class625_9_.aFloat8135) + class625_9_.aFloat8135);
		aFloat8149 = ((class625_10_.aFloat8149 - class625_9_.aFloat8149) * f + class625_9_.aFloat8149);
		aFloat8142 = class625_9_.aFloat8142 + f * (class625_10_.aFloat8142 - class625_9_.aFloat8142);
		aFloat8144 = (f * (class625_10_.aFloat8144 - class625_9_.aFloat8144) + class625_9_.aFloat8144);
		anInt8140 = Class302.method4097(class625_9_.anInt8140 * -677219717, -677219717 * class625_10_.anInt8140, 255.0F * f, -2112751065) * 2042993843;
		anInt8143 = (int) ((float) (class625_9_.anInt8143 * -679981209) + ((float) (class625_10_.anInt8143 * -679981209 - class625_9_.anInt8143 * -679981209) * f)) * -246653865;
		if (class625_9_.aClass176_8139 != class625_10_.aClass176_8139)
			aClass176_8139 = class167.method2112(class625_9_.aClass176_8139, class625_10_.aClass176_8139, f, aClass176_8139);
		if (class625_9_.aClass507_8145 != class625_10_.aClass507_8145) {
			if (null == class625_9_.aClass507_8145) {
				aClass507_8145 = class625_10_.aClass507_8145;
				if (null != aClass507_8145)
					aClass507_8145.method6147((int) (255.0F * f), 0, 1750238810);
			} else {
				aClass507_8145 = class625_9_.aClass507_8145;
				if (null != aClass507_8145)
					aClass507_8145.method6147((int) (255.0F * f), 255, -868797297);
			}
		}
		aFloat8146 = class625_9_.aFloat8146 + (class625_10_.aFloat8146 - class625_9_.aFloat8146) * f;
		aFloat8147 = class625_9_.aFloat8147 + (class625_10_.aFloat8147 - class625_9_.aFloat8147) * f;
		aFloat8148 = (f * (class625_10_.aFloat8148 - class625_9_.aFloat8148) + class625_9_.aFloat8148);
		aFloat8134 = class625_9_.aFloat8134 + f * (class625_10_.aFloat8134 - class625_9_.aFloat8134);
		aFloat8136 = class625_9_.aFloat8136 + f * (class625_10_.aFloat8136 - class625_9_.aFloat8136);
		float f_11_ = (class625_9_.aFloatArray8152[0] + class625_9_.aFloatArray8152[1] + class625_9_.aFloatArray8152[2]);
		float f_12_ = (class625_10_.aFloatArray8152[1] + class625_10_.aFloatArray8152[0] + class625_10_.aFloatArray8152[2]);
		float f_13_ = f * (f_12_ - f_11_) + f_11_;
		if (0.0F == f_13_) {
			int[] is = anIntArray8151;
			int[] is_14_ = anIntArray8151;
			anIntArray8151[2] = -1;
			is_14_[1] = -1;
			is[0] = -1;
			float[] fs = aFloatArray8152;
			float[] fs_15_ = aFloatArray8152;
			aFloatArray8152[2] = 0.0F;
			fs_15_[1] = 0.0F;
			fs[0] = 0.0F;
		} else if (class625_9_.anIntArray8151[0] == -1 && -1 == class625_9_.anIntArray8151[1] && -1 == class625_9_.anIntArray8151[2]) {
			for (int i_16_ = 0; i_16_ < 3; i_16_++) {
				anIntArray8151[i_16_] = class625_10_.anIntArray8151[i_16_];
				if (anIntArray8151[i_16_] == -1)
					aFloatArray8152[i_16_] = 0.0F;
				else
					aFloatArray8152[i_16_] = f * class625_10_.aFloatArray8152[i_16_];
			}
		} else if (-1 == class625_10_.anIntArray8151[0] && -1 == class625_10_.anIntArray8151[1] && -1 == class625_10_.anIntArray8151[2]) {
			for (int i_17_ = 0; i_17_ < 3; i_17_++) {
				anIntArray8151[i_17_] = class625_9_.anIntArray8151[i_17_];
				if (anIntArray8151[i_17_] == -1)
					aFloatArray8152[i_17_] = 0.0F;
				else
					aFloatArray8152[i_17_] = (1.0F - f) * class625_9_.aFloatArray8152[i_17_];
			}
		} else {
			float f_18_ = 1.0F - f;
			int i_19_ = 0;
			int[] is = { -1, -1, -1, -1, -1, -1 };
			float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int i_20_ = 0; i_20_ < 3; i_20_++) {
				if (class625_9_.anIntArray8151[i_20_] > -1) {
					is[i_19_] = class625_9_.anIntArray8151[i_20_];
					fs[i_19_++] = f_18_ * class625_9_.aFloatArray8152[i_20_];
				}
			}
			int i_21_ = i_19_;
			for (int i_22_ = 0; i_22_ < 3; i_22_++) {
				if (class625_10_.anIntArray8151[i_22_] > -1) {
					float f_23_ = f * class625_10_.aFloatArray8152[i_22_];
					for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
						if (is[i_24_] == class625_10_.anIntArray8151[i_22_]) {
							fs[i_24_] += f_23_;
							break;
						}
						if (i_21_ - 1 == i_24_) {
							is[i_19_] = class625_10_.anIntArray8151[i_22_];
							fs[i_19_++] = f_23_;
						}
					}
				}
			}
			if (i_19_ > 3) {
				float f_25_ = 0.0F;
				float f_26_ = 0.0F;
				for (int i_27_ = 0; i_27_ < i_19_; i_27_++)
					f_25_ += fs[i_27_];
				Class187.method2782(fs, is, 0, i_19_ - 1, (short) 512);
				for (int i_28_ = 0; i_28_ < 3; i_28_++)
					f_26_ += fs[i_28_];
				float f_29_ = f_25_ / f_26_;
				for (int i_30_ = 0; i_30_ < 3; i_30_++)
					fs[i_30_] *= f_29_;
			}
			for (int i_31_ = 0; i_31_ < 3; i_31_++) {
				anIntArray8151[i_31_] = is[i_31_];
				aFloatArray8152[i_31_] = fs[i_31_];
			}
		}
	}

	public void method7434(RSByteBuffer class536_sub33, byte i) {
		aFloat8142 = class536_sub33.method9712(-1805070622);
		aFloat8144 = class536_sub33.method9712(1868618760);
		aFloat8149 = class536_sub33.method9712(-1695508716);
	}

	public void method7435(RSByteBuffer class536_sub33, int i) {
		method7438(class536_sub33, 0, (byte) 98);
	}

	void method7436() {
		anInt8150 = 1426556621;
		aClass436_8138 = Class436.method5257(-50.0F, -60.0F, -50.0F);
		aFloat8135 = 1.1523438F;
		aFloat8141 = 0.69921875F;
		aFloat8137 = 1.2F;
		anInt8140 = -1962076808;
		anInt8143 = 0;
		aClass176_8139 = RuntimeException_Sub4.aClass176_12094;
		aFloat8142 = 1.0F;
		aFloat8144 = 0.25F;
		aFloat8149 = 1.0F;
		aClass507_8145 = Class110.aClass507_1377;
		aFloat8146 = 1.0F;
		aFloat8147 = 0.0F;
		aFloat8148 = 1.0F;
		aFloat8134 = 0.0F;
		aFloat8136 = 1.0F;
		int[] is = anIntArray8151;
		int[] is_32_ = anIntArray8151;
		anIntArray8151[2] = -1;
		is_32_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8152;
		float[] fs_33_ = aFloatArray8152;
		aFloatArray8152[2] = 0.0F;
		fs_33_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	boolean method7437(Class625 class625_34_, int i) {
		return (-702010885 * class625_34_.anInt8150 == -702010885 * anInt8150 && aFloat8135 == class625_34_.aFloat8135 && aFloat8141 == class625_34_.aFloat8141 && aFloat8137 == class625_34_.aFloat8137 && aFloat8144 == class625_34_.aFloat8144 && class625_34_.aFloat8142 == aFloat8142 && aFloat8149 == class625_34_.aFloat8149 && (-677219717 * anInt8140 == class625_34_.anInt8140 * -677219717) && (anInt8143 * -679981209 == -679981209 * class625_34_.anInt8143)
				&& class625_34_.aClass176_8139 == aClass176_8139 && aClass507_8145 == class625_34_.aClass507_8145 && class625_34_.aFloat8146 == aFloat8146 && aFloat8147 == class625_34_.aFloat8147 && aFloat8148 == class625_34_.aFloat8148 && class625_34_.aFloat8134 == aFloat8134 && class625_34_.aFloat8136 == aFloat8136 && anIntArray8151[0] == class625_34_.anIntArray8151[0] && anIntArray8151[1] == class625_34_.anIntArray8151[1] && class625_34_.anIntArray8151[2] == anIntArray8151[2]
				&& aFloatArray8152[0] == class625_34_.aFloatArray8152[0] && class625_34_.aFloatArray8152[1] == aFloatArray8152[1] && class625_34_.aFloatArray8152[2] == aFloatArray8152[2]);
	}

	public Class625(RSByteBuffer class536_sub33, Class636 class636) {
		aFloat8134 = 0.0F;
		aFloat8136 = 1.0F;
		anIntArray8151 = new int[] { -1, -1, -1 };
		aFloatArray8152 = new float[] { 0.0F, 0.0F, 0.0F };
		method7430(class536_sub33, class636, (byte) -98);
	}

	public Class625() {
		aFloat8134 = 0.0F;
		aFloat8136 = 1.0F;
		anIntArray8151 = new int[] { -1, -1, -1 };
		aFloatArray8152 = new float[] { 0.0F, 0.0F, 0.0F };
		method7431((byte) -77);
	}

	void method7438(RSByteBuffer class536_sub33, int i, byte i_35_) {
		anIntArray8151[i] = class536_sub33.readUnsignedShort();
		aFloatArray8152[i] = class536_sub33.method9712(-1905531903);
	}

	void method7439() {
		anInt8150 = 1426556621;
		aClass436_8138 = Class436.method5257(-50.0F, -60.0F, -50.0F);
		aFloat8135 = 1.1523438F;
		aFloat8141 = 0.69921875F;
		aFloat8137 = 1.2F;
		anInt8140 = -1962076808;
		anInt8143 = 0;
		aClass176_8139 = RuntimeException_Sub4.aClass176_12094;
		aFloat8142 = 1.0F;
		aFloat8144 = 0.25F;
		aFloat8149 = 1.0F;
		aClass507_8145 = Class110.aClass507_1377;
		aFloat8146 = 1.0F;
		aFloat8147 = 0.0F;
		aFloat8148 = 1.0F;
		aFloat8134 = 0.0F;
		aFloat8136 = 1.0F;
		int[] is = anIntArray8151;
		int[] is_36_ = anIntArray8151;
		anIntArray8151[2] = -1;
		is_36_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8152;
		float[] fs_37_ = aFloatArray8152;
		aFloatArray8152[2] = 0.0F;
		fs_37_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public int method7440(int i) {
		return anInt8140 * -677219717;
	}

	public int method7441() {
		return anInt8140 * -677219717;
	}

	public Class507 method7442(int i) {
		return aClass507_8145;
	}

	public void method7443(RSByteBuffer class536_sub33, Class636 class636, int i) {
		int i_38_ = class536_sub33.readUnsignedShort();
		int i_39_ = class536_sub33.readShort((byte) -118);
		int i_40_ = class536_sub33.readShort((byte) -17);
		int i_41_ = class536_sub33.readShort((byte) -78);
		int i_42_ = class536_sub33.readUnsignedShort();
		Class206_Sub1.anInt10025 = i_42_ * 76870447;
		aClass507_8145 = class636.method7612(i_38_, i_39_, i_40_, i_41_, (short) 16383);
	}

	public void method7444(RSByteBuffer class536_sub33) {
		method7438(class536_sub33, 0, (byte) 17);
	}

	void method7445() {
		anInt8150 = 1426556621;
		aClass436_8138 = Class436.method5257(-50.0F, -60.0F, -50.0F);
		aFloat8135 = 1.1523438F;
		aFloat8141 = 0.69921875F;
		aFloat8137 = 1.2F;
		anInt8140 = -1962076808;
		anInt8143 = 0;
		aClass176_8139 = RuntimeException_Sub4.aClass176_12094;
		aFloat8142 = 1.0F;
		aFloat8144 = 0.25F;
		aFloat8149 = 1.0F;
		aClass507_8145 = Class110.aClass507_1377;
		aFloat8146 = 1.0F;
		aFloat8147 = 0.0F;
		aFloat8148 = 1.0F;
		aFloat8134 = 0.0F;
		aFloat8136 = 1.0F;
		int[] is = anIntArray8151;
		int[] is_43_ = anIntArray8151;
		anIntArray8151[2] = -1;
		is_43_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8152;
		float[] fs_44_ = aFloatArray8152;
		aFloatArray8152[2] = 0.0F;
		fs_44_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public void method7446(RSByteBuffer class536_sub33) {
		method7438(class536_sub33, 0, (byte) 55);
	}

	void method7447(Class625 class625_45_, byte i) {
		anInt8150 = class625_45_.anInt8150 * 1;
		aFloat8135 = class625_45_.aFloat8135;
		aFloat8141 = class625_45_.aFloat8141;
		aFloat8137 = class625_45_.aFloat8137;
		aClass436_8138.method5272(class625_45_.aClass436_8138);
		anInt8140 = class625_45_.anInt8140 * 1;
		anInt8143 = class625_45_.anInt8143 * 1;
		aClass176_8139 = class625_45_.aClass176_8139;
		aFloat8142 = class625_45_.aFloat8142;
		aFloat8144 = class625_45_.aFloat8144;
		aFloat8149 = class625_45_.aFloat8149;
		aClass507_8145 = class625_45_.aClass507_8145;
		aFloat8146 = class625_45_.aFloat8146;
		aFloat8147 = class625_45_.aFloat8147;
		aFloat8148 = class625_45_.aFloat8148;
		aFloat8134 = class625_45_.aFloat8134;
		aFloat8136 = class625_45_.aFloat8136;
		anIntArray8151[0] = class625_45_.anIntArray8151[0];
		anIntArray8151[1] = class625_45_.anIntArray8151[1];
		anIntArray8151[2] = class625_45_.anIntArray8151[2];
		aFloatArray8152[0] = class625_45_.aFloatArray8152[0];
		aFloatArray8152[1] = class625_45_.aFloatArray8152[1];
		aFloatArray8152[2] = class625_45_.aFloatArray8152[2];
	}

	public int method7448() {
		return anInt8140 * -677219717;
	}

	public static void method7449(short i) {
		if (Class74.method1136(-1617235478) != Class512.aClass512_6934) {
			try {
				String string = Class622.anApplet8126.getParameter(Class401.aClass401_4163.aString4190);
				int i_46_ = ((int) (Class249.method3450(2097515059) / 86400000L) - 11745);
				String string_47_ = new StringBuilder().append("usrdob=").append(i_46_).append("; version=1; path=/; domain=").append(string).toString();
				Class25.method728(Class622.anApplet8126, new StringBuilder().append("document.cookie=\"").append(string_47_).append("\"").toString(), (byte) 34);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method7450(Class668 class668, int i) {
		if (!Class344.method4487(-440129613))
			Class116.method1485(1998207852);
	}
}

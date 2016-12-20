/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class631 {
	Class442 aClass442_8238;
	Class179 aClass179_8239;
	float aFloat8240;
	float aFloat8241;
	float aFloat8242;
	int anInt8243;
	int anInt8244;
	float aFloat8245;
	float aFloat8246;
	float aFloat8247 = 1.0F;
	float aFloat8248;
	Class511 aClass511_8249;
	int anInt8250;
	float aFloat8251;
	float aFloat8252 = 0.0F;
	float aFloat8253;
	float aFloat8254;
	int[] anIntArray8255;
	float[] aFloatArray8256;
	static Class147[] aClass147Array8257;

	public void method10432(RSByteBuffer class527_sub38, Class623 class623, int i) {
		int i_0_ = class527_sub38.readUnsignedShort();
		int i_1_ = class527_sub38.readShort();
		int i_2_ = class527_sub38.readShort();
		int i_3_ = class527_sub38.readShort();
		int i_4_ = class527_sub38.readUnsignedShort();
		Class320.anInt3544 = -892829967 * i_4_;
		aClass511_8249 = class623.method10244(i_0_, i_1_, i_2_, i_3_, 1420560042);
	}

	public Class631(RSByteBuffer class527_sub38, Class623 class623) {
		aFloat8245 = 1.0F;
		aFloat8253 = 0.0F;
		aFloat8251 = 1.0F;
		anIntArray8255 = new int[] { -1, -1, -1 };
		aFloatArray8256 = new float[] { 0.0F, 0.0F, 0.0F };
		method10452(class527_sub38, class623, 555585811);
	}

	void method10433(int i) {
		anInt8250 = 539613041;
		aClass442_8238 = Class442.method7166(-50.0F, -60.0F, -50.0F);
		aFloat8241 = 1.1523438F;
		aFloat8240 = 0.69921875F;
		aFloat8254 = 1.2F;
		anInt8243 = -1691416296;
		anInt8244 = 0;
		aClass179_8239 = Class623.aClass179_8121;
		aFloat8246 = 1.0F;
		aFloat8242 = 0.25F;
		aFloat8248 = 1.0F;
		aClass511_8249 = Class623.aClass511_8122;
		aFloat8247 = 1.0F;
		aFloat8252 = 0.0F;
		aFloat8245 = 1.0F;
		aFloat8253 = 0.0F;
		aFloat8251 = 1.0F;
		int[] is = anIntArray8255;
		int[] is_5_ = anIntArray8255;
		anIntArray8255[2] = -1;
		is_5_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8256;
		float[] fs_6_ = aFloatArray8256;
		aFloatArray8256[2] = 0.0F;
		fs_6_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public Class631() {
		aFloat8245 = 1.0F;
		aFloat8253 = 0.0F;
		aFloat8251 = 1.0F;
		anIntArray8255 = new int[] { -1, -1, -1 };
		aFloatArray8256 = new float[] { 0.0F, 0.0F, 0.0F };
		method10433(1875813447);
	}

	void method10434(Class180 class180, Class631 class631_7_, Class631 class631_8_, float f, int i) {
		anInt8250 = Class388.method6456(-559548817 * class631_7_.anInt8250, class631_8_.anInt8250 * -559548817, f * 255.0F, (byte) -28) * 1859528847;
		aFloat8240 = ((class631_8_.aFloat8240 - class631_7_.aFloat8240) * f + class631_7_.aFloat8240);
		aFloat8254 = class631_7_.aFloat8254 + f * (class631_8_.aFloat8254 - class631_7_.aFloat8254);
		aFloat8241 = ((class631_8_.aFloat8241 - class631_7_.aFloat8241) * f + class631_7_.aFloat8241);
		aFloat8248 = class631_7_.aFloat8248 + f * (class631_8_.aFloat8248 - class631_7_.aFloat8248);
		aFloat8246 = ((class631_8_.aFloat8246 - class631_7_.aFloat8246) * f + class631_7_.aFloat8246);
		aFloat8242 = (f * (class631_8_.aFloat8242 - class631_7_.aFloat8242) + class631_7_.aFloat8242);
		anInt8243 = Class388.method6456(-1074650777 * class631_7_.anInt8243, class631_8_.anInt8243 * -1074650777, f * 255.0F, (byte) 45) * 248408663;
		anInt8244 = ((int) ((float) (-598890845 * class631_8_.anInt8244 - class631_7_.anInt8244 * -598890845) * f + (float) (class631_7_.anInt8244 * -598890845)) * -1199096565);
		if (class631_7_.aClass179_8239 != class631_8_.aClass179_8239)
			aClass179_8239 = class180.method3409(class631_7_.aClass179_8239, class631_8_.aClass179_8239, f, aClass179_8239);
		if (class631_8_.aClass511_8249 != class631_7_.aClass511_8249) {
			if (null == class631_7_.aClass511_8249) {
				aClass511_8249 = class631_8_.aClass511_8249;
				if (null != aClass511_8249)
					aClass511_8249.method8447((int) (f * 255.0F), 0, (short) 7419);
			} else {
				aClass511_8249 = class631_7_.aClass511_8249;
				if (aClass511_8249 != null)
					aClass511_8249.method8447((int) (f * 255.0F), 255, (short) -11705);
			}
		}
		aFloat8247 = (f * (class631_8_.aFloat8247 - class631_7_.aFloat8247) + class631_7_.aFloat8247);
		aFloat8252 = (class631_7_.aFloat8252 + (class631_8_.aFloat8252 - class631_7_.aFloat8252) * f);
		aFloat8245 = (class631_7_.aFloat8245 + (class631_8_.aFloat8245 - class631_7_.aFloat8245) * f);
		aFloat8253 = (class631_7_.aFloat8253 + (class631_8_.aFloat8253 - class631_7_.aFloat8253) * f);
		aFloat8251 = ((class631_8_.aFloat8251 - class631_7_.aFloat8251) * f + class631_7_.aFloat8251);
		float f_9_ = (class631_7_.aFloatArray8256[0] + class631_7_.aFloatArray8256[1] + class631_7_.aFloatArray8256[2]);
		float f_10_ = (class631_8_.aFloatArray8256[1] + class631_8_.aFloatArray8256[0] + class631_8_.aFloatArray8256[2]);
		float f_11_ = f_9_ + f * (f_10_ - f_9_);
		if (f_11_ == 0.0F) {
			int[] is = anIntArray8255;
			int[] is_12_ = anIntArray8255;
			anIntArray8255[2] = -1;
			is_12_[1] = -1;
			is[0] = -1;
			float[] fs = aFloatArray8256;
			float[] fs_13_ = aFloatArray8256;
			aFloatArray8256[2] = 0.0F;
			fs_13_[1] = 0.0F;
			fs[0] = 0.0F;
		} else if (class631_7_.anIntArray8255[0] == -1 && class631_7_.anIntArray8255[1] == -1 && -1 == class631_7_.anIntArray8255[2]) {
			for (int i_14_ = 0; i_14_ < 3; i_14_++) {
				anIntArray8255[i_14_] = class631_8_.anIntArray8255[i_14_];
				if (anIntArray8255[i_14_] == -1)
					aFloatArray8256[i_14_] = 0.0F;
				else
					aFloatArray8256[i_14_] = class631_8_.aFloatArray8256[i_14_] * f;
			}
		} else if (class631_8_.anIntArray8255[0] == -1 && -1 == class631_8_.anIntArray8255[1] && -1 == class631_8_.anIntArray8255[2]) {
			for (int i_15_ = 0; i_15_ < 3; i_15_++) {
				anIntArray8255[i_15_] = class631_7_.anIntArray8255[i_15_];
				if (-1 == anIntArray8255[i_15_])
					aFloatArray8256[i_15_] = 0.0F;
				else
					aFloatArray8256[i_15_] = (1.0F - f) * class631_7_.aFloatArray8256[i_15_];
			}
		} else {
			float f_16_ = 1.0F - f;
			int i_17_ = 0;
			int[] is = { -1, -1, -1, -1, -1, -1 };
			float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int i_18_ = 0; i_18_ < 3; i_18_++) {
				if (class631_7_.anIntArray8255[i_18_] > -1) {
					is[i_17_] = class631_7_.anIntArray8255[i_18_];
					fs[i_17_++] = class631_7_.aFloatArray8256[i_18_] * f_16_;
				}
			}
			int i_19_ = i_17_;
			for (int i_20_ = 0; i_20_ < 3; i_20_++) {
				if (class631_8_.anIntArray8255[i_20_] > -1) {
					float f_21_ = f * class631_8_.aFloatArray8256[i_20_];
					for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
						if (class631_8_.anIntArray8255[i_20_] == is[i_22_]) {
							fs[i_22_] += f_21_;
							break;
						}
						if (i_22_ == i_19_ - 1) {
							is[i_17_] = class631_8_.anIntArray8255[i_20_];
							fs[i_17_++] = f_21_;
						}
					}
				}
			}
			if (i_17_ > 3) {
				float f_23_ = 0.0F;
				float f_24_ = 0.0F;
				for (int i_25_ = 0; i_25_ < i_17_; i_25_++)
					f_23_ += fs[i_25_];
				Class102.method1799(fs, is, 0, i_17_ - 1, (byte) 72);
				for (int i_26_ = 0; i_26_ < 3; i_26_++)
					f_24_ += fs[i_26_];
				float f_27_ = f_23_ / f_24_;
				for (int i_28_ = 0; i_28_ < 3; i_28_++)
					fs[i_28_] *= f_27_;
			}
			for (int i_29_ = 0; i_29_ < 3; i_29_++) {
				anIntArray8255[i_29_] = is[i_29_];
				aFloatArray8256[i_29_] = fs[i_29_];
			}
		}
	}

	public Class511 method10435() {
		return aClass511_8249;
	}

	public void method10436(RSByteBuffer class527_sub38, int i) {
		aFloat8246 = class527_sub38.readFloat(-1366516359);
		aFloat8242 = class527_sub38.readFloat(-1127614836);
		aFloat8248 = class527_sub38.readFloat(-1294569607);
	}

	void method10437(RSByteBuffer class527_sub38, int i) {
		anIntArray8255[i] = class527_sub38.readUnsignedShort();
		aFloatArray8256[i] = class527_sub38.readFloat(-222238836);
	}

	public void method10438(RSByteBuffer class527_sub38, int i) {
		method10440(class527_sub38, 0, -2007259604);
	}

	void method10439(Class631 class631_30_, int i) {
		anInt8250 = 1 * class631_30_.anInt8250;
		aFloat8241 = class631_30_.aFloat8241;
		aFloat8240 = class631_30_.aFloat8240;
		aFloat8254 = class631_30_.aFloat8254;
		aClass442_8238.method7146(class631_30_.aClass442_8238);
		anInt8243 = 1 * class631_30_.anInt8243;
		anInt8244 = 1 * class631_30_.anInt8244;
		aClass179_8239 = class631_30_.aClass179_8239;
		aFloat8246 = class631_30_.aFloat8246;
		aFloat8242 = class631_30_.aFloat8242;
		aFloat8248 = class631_30_.aFloat8248;
		aClass511_8249 = class631_30_.aClass511_8249;
		aFloat8247 = class631_30_.aFloat8247;
		aFloat8252 = class631_30_.aFloat8252;
		aFloat8245 = class631_30_.aFloat8245;
		aFloat8253 = class631_30_.aFloat8253;
		aFloat8251 = class631_30_.aFloat8251;
		anIntArray8255[0] = class631_30_.anIntArray8255[0];
		anIntArray8255[1] = class631_30_.anIntArray8255[1];
		anIntArray8255[2] = class631_30_.anIntArray8255[2];
		aFloatArray8256[0] = class631_30_.aFloatArray8256[0];
		aFloatArray8256[1] = class631_30_.aFloatArray8256[1];
		aFloatArray8256[2] = class631_30_.aFloatArray8256[2];
	}

	void method10440(RSByteBuffer class527_sub38, int i, int i_31_) {
		anIntArray8255[i] = class527_sub38.readUnsignedShort();
		aFloatArray8256[i] = class527_sub38.readFloat(-1533618900);
	}

	void method10441(Class623 class623, Class647 class647, int i) {
		if (Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1194229913) == 1 && Class402.aClass180_4150.method3188() > 0) {
			if (class647.method10760((byte) -21) != -1)
				anInt8250 = class647.method10760((byte) -3) * 1859528847;
			if (class647.method10761((byte) 0) != -1.0F)
				aFloat8241 = class647.method10761((byte) 0);
			if (class647.method10762(786978543) != -1.0F)
				aFloat8240 = class647.method10762(1058617280);
			if (class647.method10763((byte) 64) != -1.0F)
				aFloat8254 = class647.method10763((byte) -50);
		}
		if (class647.method10764(-1060798301) != null)
			aClass442_8238.method7146(class647.method10764(-1060798301));
		if (class647.method10785((byte) 62) != -1)
			anInt8243 = class647.method10785((byte) 63) * 248408663;
		if (class647.method10803(-1955741631) != -1)
			anInt8244 = class647.method10803(-1587206991) * -1199096565;
		if (class647.method10812(-1527971603) != -1.0F)
			aFloat8242 = class647.method10812(-1852108914);
		if (class647.method10768(-1132721421) != -1.0F)
			aFloat8248 = class647.method10768(-280743968);
		if (class647.method10769(1175686610) != -1.0F)
			aFloat8246 = class647.method10769(1175686610);
		if (class647.method10765((byte) -116) != -1)
			aClass179_8239 = class623.method10261(class647.method10765((byte) 28), -1274713395);
		if (class647.method10770(-1317113822) != -1) {
			int i_32_ = class647.method10770(-1538881974);
			int i_33_ = class647.method10771((short) 15407);
			int i_34_ = class647.method10772(862788253);
			int i_35_ = class647.method10791(-103755048);
			int i_36_ = class647.method10774(-2009057981);
			Class320.anInt3544 = -892829967 * i_36_;
			aClass511_8249 = class623.method10244(i_32_, i_33_, i_34_, i_35_, 379121430);
		}
		if (class647.method10775(0, -1791158374) != -1) {
			anIntArray8255[0] = class647.method10775(0, -55909543);
			aFloatArray8256[0] = class647.method10776(0, -489238347);
		}
		if (class647.method10775(1, -1912938291) != -1) {
			anIntArray8255[1] = class647.method10775(1, -1446582685);
			aFloatArray8256[1] = class647.method10776(1, 1318486632);
		}
		if (class647.method10775(2, -604149366) != -1) {
			anIntArray8255[2] = class647.method10775(2, -550630721);
			aFloatArray8256[2] = class647.method10776(2, 2131860222);
		}
	}

	public int method10442(int i) {
		return anInt8243 * -1074650777;
	}

	public Class511 method10443(byte i) {
		return aClass511_8249;
	}

	void method10444() {
		anInt8250 = 539613041;
		aClass442_8238 = Class442.method7166(-50.0F, -60.0F, -50.0F);
		aFloat8241 = 1.1523438F;
		aFloat8240 = 0.69921875F;
		aFloat8254 = 1.2F;
		anInt8243 = -1691416296;
		anInt8244 = 0;
		aClass179_8239 = Class623.aClass179_8121;
		aFloat8246 = 1.0F;
		aFloat8242 = 0.25F;
		aFloat8248 = 1.0F;
		aClass511_8249 = Class623.aClass511_8122;
		aFloat8247 = 1.0F;
		aFloat8252 = 0.0F;
		aFloat8245 = 1.0F;
		aFloat8253 = 0.0F;
		aFloat8251 = 1.0F;
		int[] is = anIntArray8255;
		int[] is_37_ = anIntArray8255;
		anIntArray8255[2] = -1;
		is_37_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8256;
		float[] fs_38_ = aFloatArray8256;
		aFloatArray8256[2] = 0.0F;
		fs_38_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	boolean method10445(Class631 class631_39_, int i) {
		return (-559548817 * class631_39_.anInt8250 == -559548817 * anInt8250 && aFloat8241 == class631_39_.aFloat8241 && class631_39_.aFloat8240 == aFloat8240 && class631_39_.aFloat8254 == aFloat8254 && class631_39_.aFloat8242 == aFloat8242 && aFloat8246 == class631_39_.aFloat8246 && aFloat8248 == class631_39_.aFloat8248 && (-1074650777 * anInt8243 == -1074650777 * class631_39_.anInt8243) && (-598890845 * class631_39_.anInt8244 == anInt8244 * -598890845)
				&& class631_39_.aClass179_8239 == aClass179_8239 && class631_39_.aClass511_8249 == aClass511_8249 && aFloat8247 == class631_39_.aFloat8247 && aFloat8252 == class631_39_.aFloat8252 && class631_39_.aFloat8245 == aFloat8245 && aFloat8253 == class631_39_.aFloat8253 && class631_39_.aFloat8251 == aFloat8251 && class631_39_.anIntArray8255[0] == anIntArray8255[0] && anIntArray8255[1] == class631_39_.anIntArray8255[1] && anIntArray8255[2] == class631_39_.anIntArray8255[2]
				&& aFloatArray8256[0] == class631_39_.aFloatArray8256[0] && class631_39_.aFloatArray8256[1] == aFloatArray8256[1] && class631_39_.aFloatArray8256[2] == aFloatArray8256[2]);
	}

	void method10446(Class631 class631_40_) {
		anInt8250 = 1 * class631_40_.anInt8250;
		aFloat8241 = class631_40_.aFloat8241;
		aFloat8240 = class631_40_.aFloat8240;
		aFloat8254 = class631_40_.aFloat8254;
		aClass442_8238.method7146(class631_40_.aClass442_8238);
		anInt8243 = 1 * class631_40_.anInt8243;
		anInt8244 = 1 * class631_40_.anInt8244;
		aClass179_8239 = class631_40_.aClass179_8239;
		aFloat8246 = class631_40_.aFloat8246;
		aFloat8242 = class631_40_.aFloat8242;
		aFloat8248 = class631_40_.aFloat8248;
		aClass511_8249 = class631_40_.aClass511_8249;
		aFloat8247 = class631_40_.aFloat8247;
		aFloat8252 = class631_40_.aFloat8252;
		aFloat8245 = class631_40_.aFloat8245;
		aFloat8253 = class631_40_.aFloat8253;
		aFloat8251 = class631_40_.aFloat8251;
		anIntArray8255[0] = class631_40_.anIntArray8255[0];
		anIntArray8255[1] = class631_40_.anIntArray8255[1];
		anIntArray8255[2] = class631_40_.anIntArray8255[2];
		aFloatArray8256[0] = class631_40_.aFloatArray8256[0];
		aFloatArray8256[1] = class631_40_.aFloatArray8256[1];
		aFloatArray8256[2] = class631_40_.aFloatArray8256[2];
	}

	void method10447(Class180 class180, Class631 class631_41_, Class631 class631_42_, float f) {
		anInt8250 = Class388.method6456(-559548817 * class631_41_.anInt8250, class631_42_.anInt8250 * -559548817, f * 255.0F, (byte) 11) * 1859528847;
		aFloat8240 = ((class631_42_.aFloat8240 - class631_41_.aFloat8240) * f + class631_41_.aFloat8240);
		aFloat8254 = class631_41_.aFloat8254 + f * (class631_42_.aFloat8254 - class631_41_.aFloat8254);
		aFloat8241 = ((class631_42_.aFloat8241 - class631_41_.aFloat8241) * f + class631_41_.aFloat8241);
		aFloat8248 = class631_41_.aFloat8248 + f * (class631_42_.aFloat8248 - class631_41_.aFloat8248);
		aFloat8246 = ((class631_42_.aFloat8246 - class631_41_.aFloat8246) * f + class631_41_.aFloat8246);
		aFloat8242 = (f * (class631_42_.aFloat8242 - class631_41_.aFloat8242) + class631_41_.aFloat8242);
		anInt8243 = Class388.method6456(-1074650777 * class631_41_.anInt8243, class631_42_.anInt8243 * -1074650777, f * 255.0F, (byte) 27) * 248408663;
		anInt8244 = ((int) ((float) (-598890845 * class631_42_.anInt8244 - class631_41_.anInt8244 * -598890845) * f + (float) (class631_41_.anInt8244 * -598890845)) * -1199096565);
		if (class631_41_.aClass179_8239 != class631_42_.aClass179_8239)
			aClass179_8239 = class180.method3409(class631_41_.aClass179_8239, class631_42_.aClass179_8239, f, aClass179_8239);
		if (class631_42_.aClass511_8249 != class631_41_.aClass511_8249) {
			if (null == class631_41_.aClass511_8249) {
				aClass511_8249 = class631_42_.aClass511_8249;
				if (null != aClass511_8249)
					aClass511_8249.method8447((int) (f * 255.0F), 0, (short) 5696);
			} else {
				aClass511_8249 = class631_41_.aClass511_8249;
				if (aClass511_8249 != null)
					aClass511_8249.method8447((int) (f * 255.0F), 255, (short) 19286);
			}
		}
		aFloat8247 = (f * (class631_42_.aFloat8247 - class631_41_.aFloat8247) + class631_41_.aFloat8247);
		aFloat8252 = class631_41_.aFloat8252 + (class631_42_.aFloat8252 - class631_41_.aFloat8252) * f;
		aFloat8245 = class631_41_.aFloat8245 + (class631_42_.aFloat8245 - class631_41_.aFloat8245) * f;
		aFloat8253 = class631_41_.aFloat8253 + (class631_42_.aFloat8253 - class631_41_.aFloat8253) * f;
		aFloat8251 = ((class631_42_.aFloat8251 - class631_41_.aFloat8251) * f + class631_41_.aFloat8251);
		float f_43_ = (class631_41_.aFloatArray8256[0] + class631_41_.aFloatArray8256[1] + class631_41_.aFloatArray8256[2]);
		float f_44_ = (class631_42_.aFloatArray8256[1] + class631_42_.aFloatArray8256[0] + class631_42_.aFloatArray8256[2]);
		float f_45_ = f_43_ + f * (f_44_ - f_43_);
		if (f_45_ == 0.0F) {
			int[] is = anIntArray8255;
			int[] is_46_ = anIntArray8255;
			anIntArray8255[2] = -1;
			is_46_[1] = -1;
			is[0] = -1;
			float[] fs = aFloatArray8256;
			float[] fs_47_ = aFloatArray8256;
			aFloatArray8256[2] = 0.0F;
			fs_47_[1] = 0.0F;
			fs[0] = 0.0F;
		} else if (class631_41_.anIntArray8255[0] == -1 && class631_41_.anIntArray8255[1] == -1 && -1 == class631_41_.anIntArray8255[2]) {
			for (int i = 0; i < 3; i++) {
				anIntArray8255[i] = class631_42_.anIntArray8255[i];
				if (anIntArray8255[i] == -1)
					aFloatArray8256[i] = 0.0F;
				else
					aFloatArray8256[i] = class631_42_.aFloatArray8256[i] * f;
			}
		} else if (class631_42_.anIntArray8255[0] == -1 && -1 == class631_42_.anIntArray8255[1] && -1 == class631_42_.anIntArray8255[2]) {
			for (int i = 0; i < 3; i++) {
				anIntArray8255[i] = class631_41_.anIntArray8255[i];
				if (-1 == anIntArray8255[i])
					aFloatArray8256[i] = 0.0F;
				else
					aFloatArray8256[i] = (1.0F - f) * class631_41_.aFloatArray8256[i];
			}
		} else {
			float f_48_ = 1.0F - f;
			int i = 0;
			int[] is = { -1, -1, -1, -1, -1, -1 };
			float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int i_49_ = 0; i_49_ < 3; i_49_++) {
				if (class631_41_.anIntArray8255[i_49_] > -1) {
					is[i] = class631_41_.anIntArray8255[i_49_];
					fs[i++] = class631_41_.aFloatArray8256[i_49_] * f_48_;
				}
			}
			int i_50_ = i;
			for (int i_51_ = 0; i_51_ < 3; i_51_++) {
				if (class631_42_.anIntArray8255[i_51_] > -1) {
					float f_52_ = f * class631_42_.aFloatArray8256[i_51_];
					for (int i_53_ = 0; i_53_ < i_50_; i_53_++) {
						if (class631_42_.anIntArray8255[i_51_] == is[i_53_]) {
							fs[i_53_] += f_52_;
							break;
						}
						if (i_53_ == i_50_ - 1) {
							is[i] = class631_42_.anIntArray8255[i_51_];
							fs[i++] = f_52_;
						}
					}
				}
			}
			if (i > 3) {
				float f_54_ = 0.0F;
				float f_55_ = 0.0F;
				for (int i_56_ = 0; i_56_ < i; i_56_++)
					f_54_ += fs[i_56_];
				Class102.method1799(fs, is, 0, i - 1, (byte) 91);
				for (int i_57_ = 0; i_57_ < 3; i_57_++)
					f_55_ += fs[i_57_];
				float f_58_ = f_54_ / f_55_;
				for (int i_59_ = 0; i_59_ < 3; i_59_++)
					fs[i_59_] *= f_58_;
			}
			for (int i_60_ = 0; i_60_ < 3; i_60_++) {
				anIntArray8255[i_60_] = is[i_60_];
				aFloatArray8256[i_60_] = fs[i_60_];
			}
		}
	}

	void method10448(Class631 class631_61_) {
		anInt8250 = 1 * class631_61_.anInt8250;
		aFloat8241 = class631_61_.aFloat8241;
		aFloat8240 = class631_61_.aFloat8240;
		aFloat8254 = class631_61_.aFloat8254;
		aClass442_8238.method7146(class631_61_.aClass442_8238);
		anInt8243 = 1 * class631_61_.anInt8243;
		anInt8244 = 1 * class631_61_.anInt8244;
		aClass179_8239 = class631_61_.aClass179_8239;
		aFloat8246 = class631_61_.aFloat8246;
		aFloat8242 = class631_61_.aFloat8242;
		aFloat8248 = class631_61_.aFloat8248;
		aClass511_8249 = class631_61_.aClass511_8249;
		aFloat8247 = class631_61_.aFloat8247;
		aFloat8252 = class631_61_.aFloat8252;
		aFloat8245 = class631_61_.aFloat8245;
		aFloat8253 = class631_61_.aFloat8253;
		aFloat8251 = class631_61_.aFloat8251;
		anIntArray8255[0] = class631_61_.anIntArray8255[0];
		anIntArray8255[1] = class631_61_.anIntArray8255[1];
		anIntArray8255[2] = class631_61_.anIntArray8255[2];
		aFloatArray8256[0] = class631_61_.aFloatArray8256[0];
		aFloatArray8256[1] = class631_61_.aFloatArray8256[1];
		aFloatArray8256[2] = class631_61_.aFloatArray8256[2];
	}

	public void method10449(RSByteBuffer class527_sub38, Class623 class623) {
		int i = class527_sub38.readUnsignedByte();
		if (Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-597206689) == 1 && Class402.aClass180_4150.method3188() > 0) {
			if ((i & -1193884611 * Class658.aClass658_8487.anInt8474) != 0)
				anInt8250 = class527_sub38.readInt() * 1859528847;
			else
				anInt8250 = 539613041;
			if (0 != (i & Class658.aClass658_8475.anInt8474 * -1193884611))
				aFloat8241 = (float) class527_sub38.readUnsignedShort() / 256.0F;
			else
				aFloat8241 = 1.1523438F;
			if (0 != (i & Class658.aClass658_8476.anInt8474 * -1193884611))
				aFloat8240 = (float) class527_sub38.readUnsignedShort() / 256.0F;
			else
				aFloat8240 = 0.69921875F;
			if (0 != (i & -1193884611 * Class658.aClass658_8477.anInt8474))
				aFloat8254 = (float) class527_sub38.readUnsignedShort() / 256.0F;
			else
				aFloat8254 = 1.2F;
		} else {
			if (0 != (i & Class658.aClass658_8487.anInt8474 * -1193884611))
				class527_sub38.readInt();
			if ((i & Class658.aClass658_8475.anInt8474 * -1193884611) != 0)
				class527_sub38.readUnsignedShort();
			if (0 != (i & -1193884611 * Class658.aClass658_8476.anInt8474))
				class527_sub38.readUnsignedShort();
			if ((i & Class658.aClass658_8477.anInt8474 * -1193884611) != 0)
				class527_sub38.readUnsignedShort();
			anInt8250 = 539613041;
			aFloat8254 = 1.2F;
			aFloat8240 = 0.69921875F;
			aFloat8241 = 1.1523438F;
		}
		if ((i & Class658.aClass658_8478.anInt8474 * -1193884611) != 0)
			aClass442_8238 = Class442.method7166((float) class527_sub38.readShort(), (float) class527_sub38.readShort(), (float) class527_sub38.readShort());
		else
			aClass442_8238 = Class442.method7166(-50.0F, -60.0F, -50.0F);
		if (0 != (i & Class658.aClass658_8479.anInt8474 * -1193884611))
			anInt8243 = class527_sub38.readInt() * 248408663;
		else
			anInt8243 = -1691416296;
		if ((i & -1193884611 * Class658.aClass658_8480.anInt8474) != 0)
			anInt8244 = class527_sub38.readUnsignedShort() * -1199096565;
		else
			anInt8244 = 0;
		if (0 != (i & -1193884611 * Class658.aClass658_8485.anInt8474)) {
			int i_62_ = class527_sub38.readUnsignedShort();
			aClass179_8239 = class623.method10261(i_62_, -1294325282);
		} else
			aClass179_8239 = Class623.aClass179_8121;
	}

	public void method10450(RSByteBuffer class527_sub38) {
		method10440(class527_sub38, 0, -1888008081);
	}

	boolean method10451(Class631 class631_63_) {
		return (-559548817 * class631_63_.anInt8250 == -559548817 * anInt8250 && aFloat8241 == class631_63_.aFloat8241 && class631_63_.aFloat8240 == aFloat8240 && class631_63_.aFloat8254 == aFloat8254 && class631_63_.aFloat8242 == aFloat8242 && aFloat8246 == class631_63_.aFloat8246 && aFloat8248 == class631_63_.aFloat8248 && (-1074650777 * anInt8243 == -1074650777 * class631_63_.anInt8243) && (-598890845 * class631_63_.anInt8244 == anInt8244 * -598890845)
				&& class631_63_.aClass179_8239 == aClass179_8239 && class631_63_.aClass511_8249 == aClass511_8249 && aFloat8247 == class631_63_.aFloat8247 && aFloat8252 == class631_63_.aFloat8252 && class631_63_.aFloat8245 == aFloat8245 && aFloat8253 == class631_63_.aFloat8253 && class631_63_.aFloat8251 == aFloat8251 && class631_63_.anIntArray8255[0] == anIntArray8255[0] && anIntArray8255[1] == class631_63_.anIntArray8255[1] && anIntArray8255[2] == class631_63_.anIntArray8255[2]
				&& aFloatArray8256[0] == class631_63_.aFloatArray8256[0] && class631_63_.aFloatArray8256[1] == aFloatArray8256[1] && class631_63_.aFloatArray8256[2] == aFloatArray8256[2]);
	}

	public void method10452(RSByteBuffer class527_sub38, Class623 class623, int i) {
		int i_64_ = class527_sub38.readUnsignedByte();
		if (Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-893808512) == 1 && Class402.aClass180_4150.method3188() > 0) {
			if ((i_64_ & -1193884611 * Class658.aClass658_8487.anInt8474) != 0)
				anInt8250 = class527_sub38.readInt() * 1859528847;
			else
				anInt8250 = 539613041;
			if (0 != (i_64_ & Class658.aClass658_8475.anInt8474 * -1193884611))
				aFloat8241 = (float) class527_sub38.readUnsignedShort() / 256.0F;
			else
				aFloat8241 = 1.1523438F;
			if (0 != (i_64_ & Class658.aClass658_8476.anInt8474 * -1193884611))
				aFloat8240 = (float) class527_sub38.readUnsignedShort() / 256.0F;
			else
				aFloat8240 = 0.69921875F;
			if (0 != (i_64_ & -1193884611 * Class658.aClass658_8477.anInt8474))
				aFloat8254 = (float) class527_sub38.readUnsignedShort() / 256.0F;
			else
				aFloat8254 = 1.2F;
		} else {
			if (0 != (i_64_ & Class658.aClass658_8487.anInt8474 * -1193884611))
				class527_sub38.readInt();
			if ((i_64_ & Class658.aClass658_8475.anInt8474 * -1193884611) != 0)
				class527_sub38.readUnsignedShort();
			if (0 != (i_64_ & -1193884611 * Class658.aClass658_8476.anInt8474))
				class527_sub38.readUnsignedShort();
			if ((i_64_ & Class658.aClass658_8477.anInt8474 * -1193884611) != 0)
				class527_sub38.readUnsignedShort();
			anInt8250 = 539613041;
			aFloat8254 = 1.2F;
			aFloat8240 = 0.69921875F;
			aFloat8241 = 1.1523438F;
		}
		if ((i_64_ & Class658.aClass658_8478.anInt8474 * -1193884611) != 0)
			aClass442_8238 = Class442.method7166((float) class527_sub38.readShort(), (float) class527_sub38.readShort(), (float) class527_sub38.readShort());
		else
			aClass442_8238 = Class442.method7166(-50.0F, -60.0F, -50.0F);
		if (0 != (i_64_ & Class658.aClass658_8479.anInt8474 * -1193884611))
			anInt8243 = class527_sub38.readInt() * 248408663;
		else
			anInt8243 = -1691416296;
		if ((i_64_ & -1193884611 * Class658.aClass658_8480.anInt8474) != 0)
			anInt8244 = class527_sub38.readUnsignedShort() * -1199096565;
		else
			anInt8244 = 0;
		if (0 != (i_64_ & -1193884611 * Class658.aClass658_8485.anInt8474)) {
			int i_65_ = class527_sub38.readUnsignedShort();
			aClass179_8239 = class623.method10261(i_65_, -425697986);
		} else
			aClass179_8239 = Class623.aClass179_8121;
	}

	void method10453(RSByteBuffer class527_sub38, int i) {
		anIntArray8255[i] = class527_sub38.readUnsignedShort();
		aFloatArray8256[i] = class527_sub38.readFloat(-87041259);
	}

	void method10454(RSByteBuffer class527_sub38, int i) {
		anIntArray8255[i] = class527_sub38.readUnsignedShort();
		aFloatArray8256[i] = class527_sub38.readFloat(-631651786);
	}

	public void method10455(RSByteBuffer class527_sub38, Class623 class623) {
		int i = class527_sub38.readUnsignedShort();
		int i_66_ = class527_sub38.readShort();
		int i_67_ = class527_sub38.readShort();
		int i_68_ = class527_sub38.readShort();
		int i_69_ = class527_sub38.readUnsignedShort();
		Class320.anInt3544 = -892829967 * i_69_;
		aClass511_8249 = class623.method10244(i, i_66_, i_67_, i_68_, 2050797695);
	}

	public void method10456(RSByteBuffer class527_sub38, Class623 class623) {
		int i = class527_sub38.readUnsignedShort();
		int i_70_ = class527_sub38.readShort();
		int i_71_ = class527_sub38.readShort();
		int i_72_ = class527_sub38.readShort();
		int i_73_ = class527_sub38.readUnsignedShort();
		Class320.anInt3544 = -892829967 * i_73_;
		aClass511_8249 = class623.method10244(i, i_70_, i_71_, i_72_, 632217455);
	}

	public void method10457(RSByteBuffer class527_sub38) {
		method10440(class527_sub38, 0, -2038634759);
	}

	boolean method10458(Class631 class631_74_) {
		return (-559548817 * class631_74_.anInt8250 == -559548817 * anInt8250 && aFloat8241 == class631_74_.aFloat8241 && class631_74_.aFloat8240 == aFloat8240 && class631_74_.aFloat8254 == aFloat8254 && class631_74_.aFloat8242 == aFloat8242 && aFloat8246 == class631_74_.aFloat8246 && aFloat8248 == class631_74_.aFloat8248 && (-1074650777 * anInt8243 == -1074650777 * class631_74_.anInt8243) && (-598890845 * class631_74_.anInt8244 == anInt8244 * -598890845)
				&& class631_74_.aClass179_8239 == aClass179_8239 && class631_74_.aClass511_8249 == aClass511_8249 && aFloat8247 == class631_74_.aFloat8247 && aFloat8252 == class631_74_.aFloat8252 && class631_74_.aFloat8245 == aFloat8245 && aFloat8253 == class631_74_.aFloat8253 && class631_74_.aFloat8251 == aFloat8251 && class631_74_.anIntArray8255[0] == anIntArray8255[0] && anIntArray8255[1] == class631_74_.anIntArray8255[1] && anIntArray8255[2] == class631_74_.anIntArray8255[2]
				&& aFloatArray8256[0] == class631_74_.aFloatArray8256[0] && class631_74_.aFloatArray8256[1] == aFloatArray8256[1] && class631_74_.aFloatArray8256[2] == aFloatArray8256[2]);
	}

	void method10459(Class180 class180, Class631 class631_75_, Class631 class631_76_, float f) {
		anInt8250 = Class388.method6456(-559548817 * class631_75_.anInt8250, class631_76_.anInt8250 * -559548817, f * 255.0F, (byte) 20) * 1859528847;
		aFloat8240 = ((class631_76_.aFloat8240 - class631_75_.aFloat8240) * f + class631_75_.aFloat8240);
		aFloat8254 = class631_75_.aFloat8254 + f * (class631_76_.aFloat8254 - class631_75_.aFloat8254);
		aFloat8241 = ((class631_76_.aFloat8241 - class631_75_.aFloat8241) * f + class631_75_.aFloat8241);
		aFloat8248 = class631_75_.aFloat8248 + f * (class631_76_.aFloat8248 - class631_75_.aFloat8248);
		aFloat8246 = ((class631_76_.aFloat8246 - class631_75_.aFloat8246) * f + class631_75_.aFloat8246);
		aFloat8242 = (f * (class631_76_.aFloat8242 - class631_75_.aFloat8242) + class631_75_.aFloat8242);
		anInt8243 = Class388.method6456(-1074650777 * class631_75_.anInt8243, class631_76_.anInt8243 * -1074650777, f * 255.0F, (byte) -79) * 248408663;
		anInt8244 = ((int) ((float) (-598890845 * class631_76_.anInt8244 - class631_75_.anInt8244 * -598890845) * f + (float) (class631_75_.anInt8244 * -598890845)) * -1199096565);
		if (class631_75_.aClass179_8239 != class631_76_.aClass179_8239)
			aClass179_8239 = class180.method3409(class631_75_.aClass179_8239, class631_76_.aClass179_8239, f, aClass179_8239);
		if (class631_76_.aClass511_8249 != class631_75_.aClass511_8249) {
			if (null == class631_75_.aClass511_8249) {
				aClass511_8249 = class631_76_.aClass511_8249;
				if (null != aClass511_8249)
					aClass511_8249.method8447((int) (f * 255.0F), 0, (short) 7623);
			} else {
				aClass511_8249 = class631_75_.aClass511_8249;
				if (aClass511_8249 != null)
					aClass511_8249.method8447((int) (f * 255.0F), 255, (short) 13475);
			}
		}
		aFloat8247 = (f * (class631_76_.aFloat8247 - class631_75_.aFloat8247) + class631_75_.aFloat8247);
		aFloat8252 = class631_75_.aFloat8252 + (class631_76_.aFloat8252 - class631_75_.aFloat8252) * f;
		aFloat8245 = class631_75_.aFloat8245 + (class631_76_.aFloat8245 - class631_75_.aFloat8245) * f;
		aFloat8253 = class631_75_.aFloat8253 + (class631_76_.aFloat8253 - class631_75_.aFloat8253) * f;
		aFloat8251 = ((class631_76_.aFloat8251 - class631_75_.aFloat8251) * f + class631_75_.aFloat8251);
		float f_77_ = (class631_75_.aFloatArray8256[0] + class631_75_.aFloatArray8256[1] + class631_75_.aFloatArray8256[2]);
		float f_78_ = (class631_76_.aFloatArray8256[1] + class631_76_.aFloatArray8256[0] + class631_76_.aFloatArray8256[2]);
		float f_79_ = f_77_ + f * (f_78_ - f_77_);
		if (f_79_ == 0.0F) {
			int[] is = anIntArray8255;
			int[] is_80_ = anIntArray8255;
			anIntArray8255[2] = -1;
			is_80_[1] = -1;
			is[0] = -1;
			float[] fs = aFloatArray8256;
			float[] fs_81_ = aFloatArray8256;
			aFloatArray8256[2] = 0.0F;
			fs_81_[1] = 0.0F;
			fs[0] = 0.0F;
		} else if (class631_75_.anIntArray8255[0] == -1 && class631_75_.anIntArray8255[1] == -1 && -1 == class631_75_.anIntArray8255[2]) {
			for (int i = 0; i < 3; i++) {
				anIntArray8255[i] = class631_76_.anIntArray8255[i];
				if (anIntArray8255[i] == -1)
					aFloatArray8256[i] = 0.0F;
				else
					aFloatArray8256[i] = class631_76_.aFloatArray8256[i] * f;
			}
		} else if (class631_76_.anIntArray8255[0] == -1 && -1 == class631_76_.anIntArray8255[1] && -1 == class631_76_.anIntArray8255[2]) {
			for (int i = 0; i < 3; i++) {
				anIntArray8255[i] = class631_75_.anIntArray8255[i];
				if (-1 == anIntArray8255[i])
					aFloatArray8256[i] = 0.0F;
				else
					aFloatArray8256[i] = (1.0F - f) * class631_75_.aFloatArray8256[i];
			}
		} else {
			float f_82_ = 1.0F - f;
			int i = 0;
			int[] is = { -1, -1, -1, -1, -1, -1 };
			float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int i_83_ = 0; i_83_ < 3; i_83_++) {
				if (class631_75_.anIntArray8255[i_83_] > -1) {
					is[i] = class631_75_.anIntArray8255[i_83_];
					fs[i++] = class631_75_.aFloatArray8256[i_83_] * f_82_;
				}
			}
			int i_84_ = i;
			for (int i_85_ = 0; i_85_ < 3; i_85_++) {
				if (class631_76_.anIntArray8255[i_85_] > -1) {
					float f_86_ = f * class631_76_.aFloatArray8256[i_85_];
					for (int i_87_ = 0; i_87_ < i_84_; i_87_++) {
						if (class631_76_.anIntArray8255[i_85_] == is[i_87_]) {
							fs[i_87_] += f_86_;
							break;
						}
						if (i_87_ == i_84_ - 1) {
							is[i] = class631_76_.anIntArray8255[i_85_];
							fs[i++] = f_86_;
						}
					}
				}
			}
			if (i > 3) {
				float f_88_ = 0.0F;
				float f_89_ = 0.0F;
				for (int i_90_ = 0; i_90_ < i; i_90_++)
					f_88_ += fs[i_90_];
				Class102.method1799(fs, is, 0, i - 1, (byte) 22);
				for (int i_91_ = 0; i_91_ < 3; i_91_++)
					f_89_ += fs[i_91_];
				float f_92_ = f_88_ / f_89_;
				for (int i_93_ = 0; i_93_ < 3; i_93_++)
					fs[i_93_] *= f_92_;
			}
			for (int i_94_ = 0; i_94_ < 3; i_94_++) {
				anIntArray8255[i_94_] = is[i_94_];
				aFloatArray8256[i_94_] = fs[i_94_];
			}
		}
	}

	public int method10460() {
		return anInt8243 * -1074650777;
	}

	public int method10461() {
		return anInt8243 * -1074650777;
	}

	void method10462(Class623 class623, Class647 class647) {
		if (Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-2132130582) == 1 && Class402.aClass180_4150.method3188() > 0) {
			if (class647.method10760((byte) -81) != -1)
				anInt8250 = class647.method10760((byte) 31) * 1859528847;
			if (class647.method10761((byte) 0) != -1.0F)
				aFloat8241 = class647.method10761((byte) 0);
			if (class647.method10762(2079387896) != -1.0F)
				aFloat8240 = class647.method10762(-792719241);
			if (class647.method10763((byte) 34) != -1.0F)
				aFloat8254 = class647.method10763((byte) -42);
		}
		if (class647.method10764(-1060798301) != null)
			aClass442_8238.method7146(class647.method10764(-1060798301));
		if (class647.method10785((byte) 14) != -1)
			anInt8243 = class647.method10785((byte) 33) * 248408663;
		if (class647.method10803(-1222995566) != -1)
			anInt8244 = class647.method10803(-1546565317) * -1199096565;
		if (class647.method10812(-2107357096) != -1.0F)
			aFloat8242 = class647.method10812(-1295849479);
		if (class647.method10768(-553512303) != -1.0F)
			aFloat8248 = class647.method10768(-1876342948);
		if (class647.method10769(1175686610) != -1.0F)
			aFloat8246 = class647.method10769(1175686610);
		if (class647.method10765((byte) -92) != -1)
			aClass179_8239 = class623.method10261(class647.method10765((byte) -28), 544500540);
		if (class647.method10770(-2067123914) != -1) {
			int i = class647.method10770(-510976737);
			int i_95_ = class647.method10771((short) 5949);
			int i_96_ = class647.method10772(862788253);
			int i_97_ = class647.method10791(-692774519);
			int i_98_ = class647.method10774(-2059571695);
			Class320.anInt3544 = -892829967 * i_98_;
			aClass511_8249 = class623.method10244(i, i_95_, i_96_, i_97_, 1031876651);
		}
		if (class647.method10775(0, -1458770890) != -1) {
			anIntArray8255[0] = class647.method10775(0, -1452503646);
			aFloatArray8256[0] = class647.method10776(0, 1418974329);
		}
		if (class647.method10775(1, -1378764113) != -1) {
			anIntArray8255[1] = class647.method10775(1, -1994552052);
			aFloatArray8256[1] = class647.method10776(1, 1658789944);
		}
		if (class647.method10775(2, -1155146689) != -1) {
			anIntArray8255[2] = class647.method10775(2, -733833657);
			aFloatArray8256[2] = class647.method10776(2, 836453065);
		}
	}

	public Class511 method10463() {
		return aClass511_8249;
	}

	static final void method10464(Class665 class665, int i) {
		int i_99_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method14289(i_99_, 1892262199);
	}

	public static void method10465(int i) {
		Class19 class19 = null;
		try {
			class19 = Class32.method944("", client.aClass678_11259.aString8616, true, (byte) 97);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 50);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class19 != null)
				class19.method751((byte) -22);
		} catch (Exception exception) {
			/* empty */
		}
	}

	static final void method10466(int i) {
		int[] is = Class105.anIntArray1301;
		for (int i_100_ = 0; i_100_ < 351100807 * Class105.anInt1300; i_100_++) {
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_100_]];
			if (class640_sub1_sub2_sub1_sub2 != null)
				class640_sub1_sub2_sub1_sub2.method18602(1148866185);
		}
		for (int i_101_ = 0; i_101_ < -1599561389 * client.anInt11059; i_101_++) {
			long l = (long) client.anIntArray11021[i_101_];
			Class527_Sub26 class527_sub26 = (Class527_Sub26) client.aClass14_10989.method709(l);
			if (class527_sub26 != null)
				((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522).method18602(1148866185);
		}
		if (client.anInt11080 * -1481292237 == 4) {
			for (int i_102_ = 0; i_102_ < Class466.aClass196Array5314.length; i_102_++) {
				Class196 class196 = Class466.aClass196Array5314[i_102_];
				if (class196.aBool2165)
					class196.method3717(-2038556836).method18602(1148866185);
			}
		}
	}

	static final void method10467(Class665 class665, int i) {
		int i_103_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_103_, 749590113);
		Class240 class240 = Class183.aClass240Array2100[i_103_ >> 16];
		Class609.method10090(class243, class240, class665, -441238943);
	}

	static void method10468(byte i) {
		Class32.aClass109_270.method1960((byte) -52);
		Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
		Class32.aClass109_270.incomingPacket = null;
		Class32.aClass109_270.aClass422_1361 = null;
		Class32.aClass109_270.aClass422_1376 = null;
		Class32.aClass109_270.aClass422_1377 = null;
		Class32.aClass109_270.anInt1359 = 0;
		Class32.aClass109_270.anInt1369 = 0;
		client.anInt11024 = 0;
		Class107.method1928((byte) 0);
		Class331_Sub2.method15714(1633509984);
		for (int i_104_ = 0; i_104_ < 2048; i_104_++)
			client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_104_] = null;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = null;
		for (int i_105_ = 0; i_105_ < 152738023 * client.anInt11030; i_105_++) {
			Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) client.aClass527_Sub26Array11313[i_105_].anObject10522);
			if (null != class640_sub1_sub2_sub1)
				class640_sub1_sub2_sub1.anInt11910 = 1271780505;
		}
		Class318.method5685(-1511501578);
		Class393.method6490(Class527_Sub29.method16288(107049664), -585025501);
		Class78.method1560(9, (byte) 0);
		for (int i_106_ = 0; i_106_ < 102; i_106_++)
			client.aBoolArray11310[i_106_] = true;
		Class195.method3711(Class32.aClass109_270, 2061832685);
		Class59.aClass638_724 = null;
		Class395.aLong4106 = 0L;
		Class296_Sub1.method15694(-648997372);
		Class598.aClass144_Sub1_7852.method14503(-1214149211);
	}

	public static void method10469(String string, int i) {
		if (-1927019389 * client.anInt11048 == 11) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4503, client.aClass109_11066.aClass2_1367, (byte) 92);
			class527_sub15.buffer.writeShort(0, 1404835786);
			int i_107_ = (-441238943 * class527_sub15.buffer.anInt10689);
			class527_sub15.buffer.writeString(string, 1626750636);
			class527_sub15.buffer.anInt10689 += 1733321575;
			class527_sub15.buffer.method16471(Class77.anIntArray797, i_107_, (-441238943 * class527_sub15.buffer.anInt10689), (byte) 15);
			class527_sub15.buffer.method16437((class527_sub15.buffer.anInt10689 * -441238943) - i_107_, -18705907);
			client.aClass109_11066.method1969(class527_sub15, (byte) 1);
			Class63.aClass698_738 = Class698.aClass698_8764;
		}
	}
}

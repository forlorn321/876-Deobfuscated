/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class296 implements Interface13 {
	public boolean aBool3265;
	public static final int anInt3266 = 8;
	public static short[] aShortArray3267 = new short[256];
	Class309 aClass309_3268;
	Interface12 anInterface12_3269;
	public int anInt3270;
	public String aString3271 = "null";
	public int anInt3272 = -381277341;
	int anInt3273;
	public int[] anIntArray3274;
	int anInt3275;
	public int anInt3276;
	public byte aByte3277;
	public short[] aShortArray3278;
	byte[] aByteArray3279;
	public short aShort3280;
	public short[] aShortArray3281;
	public static final int anInt3282 = 1;
	public byte[] aByteArray3283;
	public boolean aBool3284;
	byte aByte3285;
	byte aByte3286;
	public boolean aBool3287;
	public String[] aStringArray3288;
	int[] anIntArray3289;
	public boolean aBool3290;
	public Class437 aClass437_3291;
	public int anInt3292;
	int anInt3293;
	int anInt3294;
	public int anInt3295;
	public boolean aBool3296;
	public int[] anIntArray3297;
	int anInt3298;
	static final int anInt3299 = 6;
	public int[] anIntArray3300;
	public short[] aShortArray3301;
	public int anInt3302;
	public boolean aBool3303;
	public int[] anIntArray3304;
	public int anInt3305 = 476520401;
	short[] aShortArray3306;
	public byte[] aByteArray3307;
	public boolean aBool3308;
	Class4 aClass4_3309;
	public int anInt3310;
	public short aShort3311;
	int anInt3312;
	public byte aByte3313;
	public short aShort3314;
	public byte aByte3315;
	public byte aByte3316;
	public int[] anIntArray3317;
	public int anInt3318;
	public int anInt3319;
	public int anInt3320;
	public int anInt3321;
	public int anInt3322;
	byte aByte3323;
	public int anInt3324;
	int[][] anIntArrayArray3325;
	public int anInt3326;
	public int anInt3327;
	public Class679 aClass679_3328;
	public int anInt3329;
	short[] aShortArray3330;
	public byte aByte3331;
	public int anInt3332;
	byte aByte3333 = 0;
	public boolean aBool3334;
	public int anInt3335;
	public int anInt3336;
	public static final int anInt3337 = 2;
	public int anInt3338;
	public boolean aBool3339;

	void method3979(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			int i_0_ = class536_sub33.readUnsignedByte();
			anIntArray3317 = new int[i_0_];
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				anIntArray3317[i_1_] = class536_sub33.method9720((byte) 1);
		} else if (i == 2)
			aString3271 = class536_sub33.readString();
		else if (12 == i)
			anInt3272 = class536_sub33.readUnsignedByte() * -381277341;
		else if (i >= 30 && i < 35)
			aStringArray3288[i - 30] = class536_sub33.readString();
		else if (i == 40) {
			int i_2_ = class536_sub33.readUnsignedByte();
			aShortArray3330 = new short[i_2_];
			aShortArray3278 = new short[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				aShortArray3330[i_3_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3278[i_3_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_4_ = class536_sub33.readUnsignedByte();
			aShortArray3306 = new short[i_4_];
			aShortArray3281 = new short[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				aShortArray3306[i_5_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3281[i_5_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_6_ = class536_sub33.readUnsignedByte();
			aByteArray3279 = new byte[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				aByteArray3279[i_7_] = class536_sub33.readByte();
		} else if (i == 44) {
			int i_8_ = class536_sub33.readUnsignedShort();
			int i_9_ = 0;
			for (int i_10_ = i_8_; i_10_ > 0; i_10_ >>= 1)
				i_9_++;
			aByteArray3307 = new byte[i_9_];
			byte i_11_ = 0;
			for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
				if ((i_8_ & 1 << i_12_) > 0) {
					aByteArray3307[i_12_] = i_11_;
					i_11_++;
				} else
					aByteArray3307[i_12_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_13_ = class536_sub33.readUnsignedShort();
			int i_14_ = 0;
			for (int i_15_ = i_13_; i_15_ > 0; i_15_ >>= 1)
				i_14_++;
			aByteArray3283 = new byte[i_14_];
			byte i_16_ = 0;
			for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
				if ((i_13_ & 1 << i_17_) > 0) {
					aByteArray3283[i_17_] = i_16_;
					i_16_++;
				} else
					aByteArray3283[i_17_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_18_ = class536_sub33.readUnsignedByte();
			anIntArray3274 = new int[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
				anIntArray3274[i_19_] = class536_sub33.method9720((byte) 1);
		} else if (i == 93)
			aBool3284 = false;
		else if (95 == i)
			anInt3292 = class536_sub33.readUnsignedShort() * 1950361179;
		else if (i == 97)
			anInt3293 = class536_sub33.readUnsignedShort() * 2134541305;
		else if (98 == i)
			anInt3294 = class536_sub33.readUnsignedShort() * -1408414955;
		else if (99 == i)
			aBool3303 = true;
		else if (100 == i)
			anInt3298 = class536_sub33.readByte() * -1899334295;
		else if (101 == i)
			anInt3275 = class536_sub33.readByte() * -629717521;
		else if (i == 102) {
			int i_20_ = class536_sub33.readUnsignedByte();
			int i_21_ = 0;
			for (int i_22_ = i_20_; i_22_ != 0; i_22_ >>= 1)
				i_21_++;
			anIntArray3300 = new int[i_21_];
			aShortArray3301 = new short[i_21_];
			for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
				if (0 == (i_20_ & 1 << i_23_)) {
					anIntArray3300[i_23_] = -1;
					aShortArray3301[i_23_] = (short) -1;
				} else {
					anIntArray3300[i_23_] = class536_sub33.method9720((byte) 1);
					aShortArray3301[i_23_] = (short) class536_sub33.method9718(478457909);
				}
			}
		} else if (i == 103)
			anInt3318 = class536_sub33.readUnsignedShort() * 323632795;
		else if (i == 106 || i == 118) {
			anInt3273 = class536_sub33.readUnsignedShort() * -145271203;
			if (-2140393995 * anInt3273 == 65535)
				anInt3273 = 145271203;
			anInt3312 = class536_sub33.readUnsignedShort() * 1516588973;
			if (65535 == -829887451 * anInt3312)
				anInt3312 = -1516588973;
			int i_24_ = -1;
			if (i == 118) {
				i_24_ = class536_sub33.readUnsignedShort();
				if (i_24_ == 65535)
					i_24_ = -1;
			}
			int i_25_ = class536_sub33.readUnsignedByte();
			anIntArray3304 = new int[2 + i_25_];
			for (int i_26_ = 0; i_26_ <= i_25_; i_26_++) {
				anIntArray3304[i_26_] = class536_sub33.readUnsignedShort();
				if (anIntArray3304[i_26_] == 65535)
					anIntArray3304[i_26_] = -1;
			}
			anIntArray3304[i_25_ + 1] = i_24_;
		} else if (i == 107)
			aBool3287 = false;
		else if (i == 109)
			aBool3334 = false;
		else if (i == 111)
			aBool3265 = false;
		else if (113 == i) {
			aShort3280 = (short) class536_sub33.readUnsignedShort();
			aShort3311 = (short) class536_sub33.readUnsignedShort();
		} else if (i == 114) {
			aByte3277 = class536_sub33.readByte();
			aByte3313 = class536_sub33.readByte();
		} else if (119 == i)
			aByte3316 = class536_sub33.readByte();
		else if (121 == i) {
			anIntArrayArray3325 = new int[anIntArray3317.length][];
			int i_27_ = class536_sub33.readUnsignedByte();
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				int i_29_ = class536_sub33.readUnsignedByte();
				int[] is = anIntArrayArray3325[i_29_] = new int[3];
				is[0] = class536_sub33.readByte();
				is[1] = class536_sub33.readByte();
				is[2] = class536_sub33.readByte();
			}
		} else if (i == 123)
			anInt3327 = class536_sub33.readUnsignedShort() * -923020521;
		else if (i == 125)
			aClass679_3328 = ((Class679) Class682.method8091(Class392.method4866((byte) -13), class536_sub33.readByte(), 1858049507));
		else if (127 == i)
			anInt3305 = class536_sub33.readUnsignedShort() * -476520401;
		else if (128 == i)
			Class682.method8091(Class680.method8069(-1924450468), class536_sub33.readUnsignedByte(), 1858049507);
		else if (134 == i) {
			anInt3319 = class536_sub33.readUnsignedShort() * -191883881;
			if (anInt3319 * -1037321689 == 65535)
				anInt3319 = 191883881;
			anInt3320 = class536_sub33.readUnsignedShort() * 1515801529;
			if (-1335145847 * anInt3320 == 65535)
				anInt3320 = -1515801529;
			anInt3321 = class536_sub33.readUnsignedShort() * -1091535921;
			if (anInt3321 * -369448145 == 65535)
				anInt3321 = 1091535921;
			anInt3326 = class536_sub33.readUnsignedShort() * -698286361;
			if (anInt3326 * -3853097 == 65535)
				anInt3326 = 698286361;
			anInt3276 = class536_sub33.readUnsignedByte() * 288311611;
		} else if (135 == i || 136 == i) {
			class536_sub33.readUnsignedByte();
			class536_sub33.readUnsignedShort();
		} else if (137 == i)
			anInt3310 = class536_sub33.readUnsignedShort() * 1746390003;
		else if (i == 138)
			anInt3302 = class536_sub33.method9720((byte) 1) * 397155479;
		else if (140 == i)
			anInt3295 = class536_sub33.readUnsignedByte() * -985081875;
		else if (141 == i)
			aBool3290 = true;
		else if (i == 142)
			anInt3329 = class536_sub33.readUnsignedShort() * -1184885179;
		else if (i == 143)
			aBool3296 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3288[i - 150] = class536_sub33.readString();
			if (!aClass309_3268.aBool3463)
				aStringArray3288[i - 150] = null;
		} else if (155 == i) {
			aByte3323 = class536_sub33.readByte();
			aByte3285 = class536_sub33.readByte();
			aByte3286 = class536_sub33.readByte();
			aByte3333 = class536_sub33.readByte();
		} else if (i == 158)
			aByte3331 = (byte) 1;
		else if (i == 159)
			aByte3331 = (byte) 0;
		else if (i == 160) {
			int i_30_ = class536_sub33.readUnsignedByte();
			anIntArray3297 = new int[i_30_];
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
				anIntArray3297[i_31_] = class536_sub33.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3332 = class536_sub33.readUnsignedByte() * -1456011659;
			else if (164 == i) {
				anInt3322 = class536_sub33.readUnsignedShort() * 2005939363;
				anInt3335 = class536_sub33.readUnsignedShort() * -1213293037;
			} else if (165 == i)
				anInt3336 = class536_sub33.readUnsignedByte() * -1321272733;
			else if (i == 168)
				anInt3324 = class536_sub33.readUnsignedByte() * 1449054329;
			else if (169 == i)
				aBool3308 = false;
			else if (i >= 170 && i < 176) {
				if (anIntArray3289 == null) {
					anIntArray3289 = new int[6];
					Arrays.fill(anIntArray3289, -1);
				}
				int i_32_ = class536_sub33.readUnsignedShort();
				if (65535 == i_32_)
					i_32_ = -1;
				anIntArray3289[i - 170] = i_32_;
			} else if (i != 178) {
				if (i == 179) {
					aClass437_3291 = new Class437();
					aClass437_3291.aFloat4859 = (float) class536_sub33.method9717(-875507904);
					aClass437_3291.aFloat4855 = (float) class536_sub33.method9717(1956470091);
					aClass437_3291.aFloat4856 = (float) class536_sub33.method9717(-1288695425);
					aClass437_3291.aFloat4858 = (float) class536_sub33.method9717(-1834663698);
					aClass437_3291.aFloat4857 = (float) class536_sub33.method9717(-1983040235);
					aClass437_3291.aFloat4854 = (float) class536_sub33.method9717(835834430);
				} else if (i == 180)
					anInt3338 = ((class536_sub33.readUnsignedByte() & 0xff) * 842424673);
				else if (i == 181) {
					aShort3314 = (short) class536_sub33.readUnsignedShort();
					aByte3315 = (byte) class536_sub33.readUnsignedByte();
				} else if (182 == i)
					aBool3339 = true;
				else if (249 == i) {
					int i_33_ = class536_sub33.readUnsignedByte();
					if (aClass4_3309 == null) {
						int i_34_ = Class528.method6434(i_33_, -900219145);
						aClass4_3309 = new Class4(i_34_);
					}
					for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
						boolean bool = class536_sub33.readUnsignedByte() == 1;
						int i_36_ = class536_sub33.read24BitUnsignedInteger(814509791);
						Class536 class536;
						if (bool)
							class536 = (new Class536_Sub13(class536_sub33.readString()));
						else
							class536 = (new Class536_Sub26(class536_sub33.readInt()));
						aClass4_3309.method560(class536, (long) i_36_);
					}
				}
			}
		}
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_37_ = class536_sub33.readUnsignedByte();
			if (i_37_ == 0)
				break;
			method3980(class536_sub33, i_37_, 38009999);
		}
	}

	void method3980(RSByteBuffer class536_sub33, int i, int i_38_) {
		if (1 == i) {
			int i_39_ = class536_sub33.readUnsignedByte();
			anIntArray3317 = new int[i_39_];
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++)
				anIntArray3317[i_40_] = class536_sub33.method9720((byte) 1);
		} else if (i == 2)
			aString3271 = class536_sub33.readString();
		else if (12 == i)
			anInt3272 = class536_sub33.readUnsignedByte() * -381277341;
		else if (i >= 30 && i < 35)
			aStringArray3288[i - 30] = class536_sub33.readString();
		else if (i == 40) {
			int i_41_ = class536_sub33.readUnsignedByte();
			aShortArray3330 = new short[i_41_];
			aShortArray3278 = new short[i_41_];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
				aShortArray3330[i_42_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3278[i_42_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_43_ = class536_sub33.readUnsignedByte();
			aShortArray3306 = new short[i_43_];
			aShortArray3281 = new short[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				aShortArray3306[i_44_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3281[i_44_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_45_ = class536_sub33.readUnsignedByte();
			aByteArray3279 = new byte[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
				aByteArray3279[i_46_] = class536_sub33.readByte();
		} else if (i == 44) {
			int i_47_ = class536_sub33.readUnsignedShort();
			int i_48_ = 0;
			for (int i_49_ = i_47_; i_49_ > 0; i_49_ >>= 1)
				i_48_++;
			aByteArray3307 = new byte[i_48_];
			byte i_50_ = 0;
			for (int i_51_ = 0; i_51_ < i_48_; i_51_++) {
				if ((i_47_ & 1 << i_51_) > 0) {
					aByteArray3307[i_51_] = i_50_;
					i_50_++;
				} else
					aByteArray3307[i_51_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_52_ = class536_sub33.readUnsignedShort();
			int i_53_ = 0;
			for (int i_54_ = i_52_; i_54_ > 0; i_54_ >>= 1)
				i_53_++;
			aByteArray3283 = new byte[i_53_];
			byte i_55_ = 0;
			for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
				if ((i_52_ & 1 << i_56_) > 0) {
					aByteArray3283[i_56_] = i_55_;
					i_55_++;
				} else
					aByteArray3283[i_56_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_57_ = class536_sub33.readUnsignedByte();
			anIntArray3274 = new int[i_57_];
			for (int i_58_ = 0; i_58_ < i_57_; i_58_++)
				anIntArray3274[i_58_] = class536_sub33.method9720((byte) 1);
		} else if (i == 93)
			aBool3284 = false;
		else if (95 == i)
			anInt3292 = class536_sub33.readUnsignedShort() * 1950361179;
		else if (i == 97)
			anInt3293 = class536_sub33.readUnsignedShort() * 2134541305;
		else if (98 == i)
			anInt3294 = class536_sub33.readUnsignedShort() * -1408414955;
		else if (99 == i)
			aBool3303 = true;
		else if (100 == i)
			anInt3298 = class536_sub33.readByte() * -1899334295;
		else if (101 == i)
			anInt3275 = class536_sub33.readByte() * -629717521;
		else if (i == 102) {
			int i_59_ = class536_sub33.readUnsignedByte();
			int i_60_ = 0;
			for (int i_61_ = i_59_; i_61_ != 0; i_61_ >>= 1)
				i_60_++;
			anIntArray3300 = new int[i_60_];
			aShortArray3301 = new short[i_60_];
			for (int i_62_ = 0; i_62_ < i_60_; i_62_++) {
				if (0 == (i_59_ & 1 << i_62_)) {
					anIntArray3300[i_62_] = -1;
					aShortArray3301[i_62_] = (short) -1;
				} else {
					anIntArray3300[i_62_] = class536_sub33.method9720((byte) 1);
					aShortArray3301[i_62_] = (short) class536_sub33.method9718(-359733817);
				}
			}
		} else if (i == 103)
			anInt3318 = class536_sub33.readUnsignedShort() * 323632795;
		else if (i == 106 || i == 118) {
			anInt3273 = class536_sub33.readUnsignedShort() * -145271203;
			if (-2140393995 * anInt3273 == 65535)
				anInt3273 = 145271203;
			anInt3312 = class536_sub33.readUnsignedShort() * 1516588973;
			if (65535 == -829887451 * anInt3312)
				anInt3312 = -1516588973;
			int i_63_ = -1;
			if (i == 118) {
				i_63_ = class536_sub33.readUnsignedShort();
				if (i_63_ == 65535)
					i_63_ = -1;
			}
			int i_64_ = class536_sub33.readUnsignedByte();
			anIntArray3304 = new int[2 + i_64_];
			for (int i_65_ = 0; i_65_ <= i_64_; i_65_++) {
				anIntArray3304[i_65_] = class536_sub33.readUnsignedShort();
				if (anIntArray3304[i_65_] == 65535)
					anIntArray3304[i_65_] = -1;
			}
			anIntArray3304[i_64_ + 1] = i_63_;
		} else if (i == 107)
			aBool3287 = false;
		else if (i == 109)
			aBool3334 = false;
		else if (i == 111)
			aBool3265 = false;
		else if (113 == i) {
			aShort3280 = (short) class536_sub33.readUnsignedShort();
			aShort3311 = (short) class536_sub33.readUnsignedShort();
		} else if (i == 114) {
			aByte3277 = class536_sub33.readByte();
			aByte3313 = class536_sub33.readByte();
		} else if (119 == i)
			aByte3316 = class536_sub33.readByte();
		else if (121 == i) {
			anIntArrayArray3325 = new int[anIntArray3317.length][];
			int i_66_ = class536_sub33.readUnsignedByte();
			for (int i_67_ = 0; i_67_ < i_66_; i_67_++) {
				int i_68_ = class536_sub33.readUnsignedByte();
				int[] is = anIntArrayArray3325[i_68_] = new int[3];
				is[0] = class536_sub33.readByte();
				is[1] = class536_sub33.readByte();
				is[2] = class536_sub33.readByte();
			}
		} else if (i == 123)
			anInt3327 = class536_sub33.readUnsignedShort() * -923020521;
		else if (i == 125)
			aClass679_3328 = ((Class679) Class682.method8091(Class392.method4866((byte) -60), class536_sub33.readByte(), 1858049507));
		else if (127 == i)
			anInt3305 = class536_sub33.readUnsignedShort() * -476520401;
		else if (128 == i)
			Class682.method8091(Class680.method8069(-2088179030), class536_sub33.readUnsignedByte(), 1858049507);
		else if (134 == i) {
			anInt3319 = class536_sub33.readUnsignedShort() * -191883881;
			if (anInt3319 * -1037321689 == 65535)
				anInt3319 = 191883881;
			anInt3320 = class536_sub33.readUnsignedShort() * 1515801529;
			if (-1335145847 * anInt3320 == 65535)
				anInt3320 = -1515801529;
			anInt3321 = class536_sub33.readUnsignedShort() * -1091535921;
			if (anInt3321 * -369448145 == 65535)
				anInt3321 = 1091535921;
			anInt3326 = class536_sub33.readUnsignedShort() * -698286361;
			if (anInt3326 * -3853097 == 65535)
				anInt3326 = 698286361;
			anInt3276 = class536_sub33.readUnsignedByte() * 288311611;
		} else if (135 == i || 136 == i) {
			class536_sub33.readUnsignedByte();
			class536_sub33.readUnsignedShort();
		} else if (137 == i)
			anInt3310 = class536_sub33.readUnsignedShort() * 1746390003;
		else if (i == 138)
			anInt3302 = class536_sub33.method9720((byte) 1) * 397155479;
		else if (140 == i)
			anInt3295 = class536_sub33.readUnsignedByte() * -985081875;
		else if (141 == i)
			aBool3290 = true;
		else if (i == 142)
			anInt3329 = class536_sub33.readUnsignedShort() * -1184885179;
		else if (i == 143)
			aBool3296 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3288[i - 150] = class536_sub33.readString();
			if (!aClass309_3268.aBool3463)
				aStringArray3288[i - 150] = null;
		} else if (155 == i) {
			aByte3323 = class536_sub33.readByte();
			aByte3285 = class536_sub33.readByte();
			aByte3286 = class536_sub33.readByte();
			aByte3333 = class536_sub33.readByte();
		} else if (i == 158)
			aByte3331 = (byte) 1;
		else if (i == 159)
			aByte3331 = (byte) 0;
		else if (i == 160) {
			int i_69_ = class536_sub33.readUnsignedByte();
			anIntArray3297 = new int[i_69_];
			for (int i_70_ = 0; i_70_ < i_69_; i_70_++)
				anIntArray3297[i_70_] = class536_sub33.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3332 = class536_sub33.readUnsignedByte() * -1456011659;
			else if (164 == i) {
				anInt3322 = class536_sub33.readUnsignedShort() * 2005939363;
				anInt3335 = class536_sub33.readUnsignedShort() * -1213293037;
			} else if (165 == i)
				anInt3336 = class536_sub33.readUnsignedByte() * -1321272733;
			else if (i == 168)
				anInt3324 = class536_sub33.readUnsignedByte() * 1449054329;
			else if (169 == i)
				aBool3308 = false;
			else if (i >= 170 && i < 176) {
				if (anIntArray3289 == null) {
					anIntArray3289 = new int[6];
					Arrays.fill(anIntArray3289, -1);
				}
				int i_71_ = class536_sub33.readUnsignedShort();
				if (65535 == i_71_)
					i_71_ = -1;
				anIntArray3289[i - 170] = i_71_;
			} else if (i != 178) {
				if (i == 179) {
					aClass437_3291 = new Class437();
					aClass437_3291.aFloat4859 = (float) class536_sub33.method9717(743820535);
					aClass437_3291.aFloat4855 = (float) class536_sub33.method9717(-574754942);
					aClass437_3291.aFloat4856 = (float) class536_sub33.method9717(-1359393633);
					aClass437_3291.aFloat4858 = (float) class536_sub33.method9717(361141315);
					aClass437_3291.aFloat4857 = (float) class536_sub33.method9717(713709947);
					aClass437_3291.aFloat4854 = (float) class536_sub33.method9717(1552946012);
				} else if (i == 180)
					anInt3338 = ((class536_sub33.readUnsignedByte() & 0xff) * 842424673);
				else if (i == 181) {
					aShort3314 = (short) class536_sub33.readUnsignedShort();
					aByte3315 = (byte) class536_sub33.readUnsignedByte();
				} else if (182 == i)
					aBool3339 = true;
				else if (249 == i) {
					int i_72_ = class536_sub33.readUnsignedByte();
					if (aClass4_3309 == null) {
						int i_73_ = Class528.method6434(i_72_, -830876330);
						aClass4_3309 = new Class4(i_73_);
					}
					for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
						boolean bool = class536_sub33.readUnsignedByte() == 1;
						int i_75_ = class536_sub33.read24BitUnsignedInteger(1800314387);
						Class536 class536;
						if (bool)
							class536 = (new Class536_Sub13(class536_sub33.readString()));
						else
							class536 = (new Class536_Sub26(class536_sub33.readInt()));
						aClass4_3309.method560(class536, (long) i_75_);
					}
				}
			}
		}
	}

	public void method75(byte i) {
		if (null == anIntArray3317)
			anIntArray3317 = new int[0];
		if (-1 == aByte3331) {
			if (null == aClass309_3268 || aClass309_3268.aClass670_3459 == Class670.aClass670_8568)
				aByte3331 = (byte) 1;
			else
				aByte3331 = (byte) 0;
		}
	}

	Class296(int i, Class309 class309, Interface12 interface12) {
		anInt3310 = -1746390003;
		aBool3284 = true;
		anInt3292 = -1950361179;
		anInt3293 = -1656619904;
		anInt3294 = 111512192;
		aBool3303 = false;
		aBool3296 = false;
		aBool3290 = false;
		anInt3298 = 0;
		anInt3275 = 0;
		anIntArray3300 = null;
		aShortArray3301 = null;
		anInt3302 = -397155479;
		anInt3318 = 1766314848;
		anInt3273 = 145271203;
		anInt3312 = -1516588973;
		aBool3287 = true;
		aBool3334 = true;
		aBool3265 = true;
		aShort3280 = (short) 0;
		aShort3311 = (short) 0;
		aByte3277 = (byte) -96;
		aByte3313 = (byte) -16;
		aShort3314 = (short) -1;
		aByte3315 = (byte) 0;
		aByte3316 = (byte) 0;
		anInt3319 = 191883881;
		anInt3320 = -1515801529;
		anInt3321 = 1091535921;
		anInt3326 = 698286361;
		anInt3276 = 0;
		anInt3324 = 0;
		anInt3295 = -2087774957;
		anInt3327 = 923020521;
		aClass679_3328 = Class679.aClass679_8630;
		anInt3329 = 1184885179;
		aByte3331 = (byte) -1;
		anInt3332 = 1456011659;
		anInt3322 = -1875598592;
		anInt3335 = -1365372160;
		anInt3336 = 0;
		aBool3308 = true;
		anInt3338 = 0;
		aBool3339 = false;
		anInt3270 = i * 1478296249;
		aClass309_3268 = class309;
		anInterface12_3269 = interface12;
		aStringArray3288 = (String[]) aClass309_3268.aStringArray3464.clone();
	}

	public final Class177 method3981(Class167 class167, int i, Interface20 interface20, Interface18 interface18, Class688 class688, Class304 class304, short i_76_) {
		if (anIntArray3304 != null) {
			Class296 class296_77_ = method3984(interface20, interface18, (byte) -27);
			if (class296_77_ == null)
				return null;
			return class296_77_.method3981(class167, i, interface20, interface18, class688, class304, (short) -16410);
		}
		if (anIntArray3274 == null && (class304 == null || null == class304.anIntArray3433))
			return null;
		int i_78_ = i;
		if (null != class688)
			i_78_ |= class688.method8162((byte) 56);
		long l = (long) (anInt3270 * -1647549559 | 1526643673 * class167.anInt1850 << 16);
		if (class304 != null)
			l |= -2746811695092079303L * class304.aLong3434 << 24;
		Class177 class177;
		synchronized (aClass309_3268.aClass199_3462) {
			class177 = (Class177) aClass309_3268.aClass199_3462.method2886(l);
		}
		if (null == class177 || (class177.method2466() & i_78_) != i_78_) {
			if (null != class177)
				i_78_ |= class177.method2466();
			int i_79_ = i_78_;
			if (null != aShortArray3330)
				i_79_ |= 0x4000;
			if (null != aShortArray3306)
				i_79_ |= 0x8000;
			if (0 != aByte3333)
				i_79_ |= 0x80000;
			int[] is = (null != class304 && class304.anIntArray3433 != null ? class304.anIntArray3433 : anIntArray3274);
			boolean bool = false;
			synchronized (aClass309_3268.aClass461_3460) {
				for (int i_80_ = 0; i_80_ < is.length; i_80_++) {
					if (!aClass309_3268.aClass461_3460.method5558(is[i_80_], 0, -1625849716))
						bool = true;
				}
			}
			if (bool)
				return null;
			Class180[] class180s = new Class180[is.length];
			synchronized (aClass309_3268.aClass461_3460) {
				for (int i_81_ = 0; i_81_ < is.length; i_81_++)
					class180s[i_81_] = Class180.method2708(aClass309_3268.aClass461_3460, is[i_81_], 0);
			}
			for (int i_82_ = 0; i_82_ < is.length; i_82_++) {
				if (null != class180s[i_82_] && class180s[i_82_].anInt1949 < 13)
					class180s[i_82_].method2707(2);
			}
			Class180 class180;
			if (1 == class180s.length)
				class180 = class180s[0];
			else
				class180 = new Class180(class180s, class180s.length);
			class177 = class167.method2093(class180, i_79_, aClass309_3268.anInt3458 * 740522041, 64, 768);
			if (aShortArray3330 != null) {
				short[] is_83_;
				if (null != class304 && null != class304.aShortArray3438)
					is_83_ = class304.aShortArray3438;
				else
					is_83_ = aShortArray3278;
				for (int i_84_ = 0; i_84_ < aShortArray3330.length; i_84_++) {
					if (null != aByteArray3279 && i_84_ < aByteArray3279.length)
						class177.method2507(aShortArray3330[i_84_], (aShortArray3267[aByteArray3279[i_84_] & 0xff]));
					else
						class177.method2507(aShortArray3330[i_84_], is_83_[i_84_]);
				}
			}
			if (null != aShortArray3306) {
				short[] is_85_;
				if (null != class304 && class304.aShortArray3439 != null)
					is_85_ = class304.aShortArray3439;
				else
					is_85_ = aShortArray3281;
				for (int i_86_ = 0; i_86_ < aShortArray3306.length; i_86_++)
					class177.method2509(aShortArray3306[i_86_], is_85_[i_86_]);
			}
			if (0 != aByte3333)
				class177.method2510(aByte3323, aByte3285, aByte3286, aByte3333 & 0xff);
			class177.method2465(i_78_);
			synchronized (aClass309_3268.aClass199_3462) {
				aClass309_3268.aClass199_3462.method2881(class177, l);
			}
		}
		if (class688 != null) {
			class177 = class177.method2623((byte) 1, i_78_, true);
			class688.method8132(class177, 0, -1946775892);
		}
		class177.method2465(i);
		return class177;
	}

	public final boolean method3982(int i) {
		if (null == anIntArray3317)
			return true;
		boolean bool = true;
		int[] is = anIntArray3317;
		for (int i_87_ = 0; i_87_ < is.length; i_87_++) {
			int i_88_ = is[i_87_];
			if (!aClass309_3268.aClass461_3460.method5558(i_88_, 0, 658208010))
				bool = false;
		}
		return bool;
	}

	public String method3983(int i, String string, int i_89_) {
		if (null == aClass4_3309)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_3309.method556((long) i);
		if (class536_sub13 == null)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	public final Class296 method3984(Interface20 interface20, Interface18 interface18, byte i) {
		int i_90_ = -1;
		if (-1 != -2140393995 * anInt3273) {
			Class324 class324 = interface20.method123(anInt3273 * -2140393995, -1018286558);
			if (null != class324)
				i_90_ = interface18.method96(class324, 782258390);
		} else if (-1 != anInt3312 * -829887451) {
			Class153 class153 = interface20.method124(Class458.aClass458_5176, -829887451 * anInt3312, 323730415);
			if (null != class153)
				i_90_ = interface18.method99(class153, 1645298890);
		}
		if (i_90_ < 0 || i_90_ >= anIntArray3304.length - 1) {
			int i_91_ = anIntArray3304[anIntArray3304.length - 1];
			if (i_91_ != -1)
				return ((Class296) anInterface12_3269.method70(i_91_, (byte) -34));
			return null;
		}
		if (anIntArray3304[i_90_] == -1)
			return null;
		return ((Class296) anInterface12_3269.method70(anIntArray3304[i_90_], (byte) 2));
	}

	public boolean method3985(Interface20 interface20, Interface18 interface18, int i) {
		if (null == anIntArray3304)
			return true;
		int i_92_ = -1;
		if (-2140393995 * anInt3273 != -1) {
			Class324 class324 = interface20.method123(anInt3273 * -2140393995, -1018286558);
			if (class324 != null)
				i_92_ = interface18.method96(class324, 1163486222);
		} else if (-1 != anInt3312 * -829887451) {
			Class153 class153 = interface20.method124(Class458.aClass458_5176, anInt3312 * -829887451, 323730415);
			if (null != class153)
				i_92_ = interface18.method99(class153, 1694281941);
		}
		if (i_92_ < 0 || i_92_ >= anIntArray3304.length - 1) {
			int i_93_ = anIntArray3304[anIntArray3304.length - 1];
			if (i_93_ != -1)
				return true;
			return false;
		}
		if (-1 == anIntArray3304[i_92_])
			return false;
		return true;
	}

	public boolean method3986(int i) {
		if (null == anIntArray3304)
			return (-1 != -1037321689 * anInt3319 || -1 != anInt3321 * -369448145 || anInt3326 * -3853097 != -1);
		for (int i_94_ = 0; i_94_ < anIntArray3304.length; i_94_++) {
			if (-1 != anIntArray3304[i_94_]) {
				Class296 class296_95_ = ((Class296) anInterface12_3269.method70(anIntArray3304[i_94_], (byte) 33));
				if (-1037321689 * class296_95_.anInt3319 != -1 || -369448145 * class296_95_.anInt3321 != -1 || -1 != -3853097 * class296_95_.anInt3326)
					return true;
			}
		}
		return false;
	}

	void method3987(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			int i_96_ = class536_sub33.readUnsignedByte();
			anIntArray3317 = new int[i_96_];
			for (int i_97_ = 0; i_97_ < i_96_; i_97_++)
				anIntArray3317[i_97_] = class536_sub33.method9720((byte) 1);
		} else if (i == 2)
			aString3271 = class536_sub33.readString();
		else if (12 == i)
			anInt3272 = class536_sub33.readUnsignedByte() * -381277341;
		else if (i >= 30 && i < 35)
			aStringArray3288[i - 30] = class536_sub33.readString();
		else if (i == 40) {
			int i_98_ = class536_sub33.readUnsignedByte();
			aShortArray3330 = new short[i_98_];
			aShortArray3278 = new short[i_98_];
			for (int i_99_ = 0; i_99_ < i_98_; i_99_++) {
				aShortArray3330[i_99_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3278[i_99_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_100_ = class536_sub33.readUnsignedByte();
			aShortArray3306 = new short[i_100_];
			aShortArray3281 = new short[i_100_];
			for (int i_101_ = 0; i_101_ < i_100_; i_101_++) {
				aShortArray3306[i_101_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3281[i_101_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_102_ = class536_sub33.readUnsignedByte();
			aByteArray3279 = new byte[i_102_];
			for (int i_103_ = 0; i_103_ < i_102_; i_103_++)
				aByteArray3279[i_103_] = class536_sub33.readByte();
		} else if (i == 44) {
			int i_104_ = class536_sub33.readUnsignedShort();
			int i_105_ = 0;
			for (int i_106_ = i_104_; i_106_ > 0; i_106_ >>= 1)
				i_105_++;
			aByteArray3307 = new byte[i_105_];
			byte i_107_ = 0;
			for (int i_108_ = 0; i_108_ < i_105_; i_108_++) {
				if ((i_104_ & 1 << i_108_) > 0) {
					aByteArray3307[i_108_] = i_107_;
					i_107_++;
				} else
					aByteArray3307[i_108_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_109_ = class536_sub33.readUnsignedShort();
			int i_110_ = 0;
			for (int i_111_ = i_109_; i_111_ > 0; i_111_ >>= 1)
				i_110_++;
			aByteArray3283 = new byte[i_110_];
			byte i_112_ = 0;
			for (int i_113_ = 0; i_113_ < i_110_; i_113_++) {
				if ((i_109_ & 1 << i_113_) > 0) {
					aByteArray3283[i_113_] = i_112_;
					i_112_++;
				} else
					aByteArray3283[i_113_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_114_ = class536_sub33.readUnsignedByte();
			anIntArray3274 = new int[i_114_];
			for (int i_115_ = 0; i_115_ < i_114_; i_115_++)
				anIntArray3274[i_115_] = class536_sub33.method9720((byte) 1);
		} else if (i == 93)
			aBool3284 = false;
		else if (95 == i)
			anInt3292 = class536_sub33.readUnsignedShort() * 1950361179;
		else if (i == 97)
			anInt3293 = class536_sub33.readUnsignedShort() * 2134541305;
		else if (98 == i)
			anInt3294 = class536_sub33.readUnsignedShort() * -1408414955;
		else if (99 == i)
			aBool3303 = true;
		else if (100 == i)
			anInt3298 = class536_sub33.readByte() * -1899334295;
		else if (101 == i)
			anInt3275 = class536_sub33.readByte() * -629717521;
		else if (i == 102) {
			int i_116_ = class536_sub33.readUnsignedByte();
			int i_117_ = 0;
			for (int i_118_ = i_116_; i_118_ != 0; i_118_ >>= 1)
				i_117_++;
			anIntArray3300 = new int[i_117_];
			aShortArray3301 = new short[i_117_];
			for (int i_119_ = 0; i_119_ < i_117_; i_119_++) {
				if (0 == (i_116_ & 1 << i_119_)) {
					anIntArray3300[i_119_] = -1;
					aShortArray3301[i_119_] = (short) -1;
				} else {
					anIntArray3300[i_119_] = class536_sub33.method9720((byte) 1);
					aShortArray3301[i_119_] = (short) class536_sub33.method9718(597527978);
				}
			}
		} else if (i == 103)
			anInt3318 = class536_sub33.readUnsignedShort() * 323632795;
		else if (i == 106 || i == 118) {
			anInt3273 = class536_sub33.readUnsignedShort() * -145271203;
			if (-2140393995 * anInt3273 == 65535)
				anInt3273 = 145271203;
			anInt3312 = class536_sub33.readUnsignedShort() * 1516588973;
			if (65535 == -829887451 * anInt3312)
				anInt3312 = -1516588973;
			int i_120_ = -1;
			if (i == 118) {
				i_120_ = class536_sub33.readUnsignedShort();
				if (i_120_ == 65535)
					i_120_ = -1;
			}
			int i_121_ = class536_sub33.readUnsignedByte();
			anIntArray3304 = new int[2 + i_121_];
			for (int i_122_ = 0; i_122_ <= i_121_; i_122_++) {
				anIntArray3304[i_122_] = class536_sub33.readUnsignedShort();
				if (anIntArray3304[i_122_] == 65535)
					anIntArray3304[i_122_] = -1;
			}
			anIntArray3304[i_121_ + 1] = i_120_;
		} else if (i == 107)
			aBool3287 = false;
		else if (i == 109)
			aBool3334 = false;
		else if (i == 111)
			aBool3265 = false;
		else if (113 == i) {
			aShort3280 = (short) class536_sub33.readUnsignedShort();
			aShort3311 = (short) class536_sub33.readUnsignedShort();
		} else if (i == 114) {
			aByte3277 = class536_sub33.readByte();
			aByte3313 = class536_sub33.readByte();
		} else if (119 == i)
			aByte3316 = class536_sub33.readByte();
		else if (121 == i) {
			anIntArrayArray3325 = new int[anIntArray3317.length][];
			int i_123_ = class536_sub33.readUnsignedByte();
			for (int i_124_ = 0; i_124_ < i_123_; i_124_++) {
				int i_125_ = class536_sub33.readUnsignedByte();
				int[] is = anIntArrayArray3325[i_125_] = new int[3];
				is[0] = class536_sub33.readByte();
				is[1] = class536_sub33.readByte();
				is[2] = class536_sub33.readByte();
			}
		} else if (i == 123)
			anInt3327 = class536_sub33.readUnsignedShort() * -923020521;
		else if (i == 125)
			aClass679_3328 = ((Class679) Class682.method8091(Class392.method4866((byte) -72), class536_sub33.readByte(), 1858049507));
		else if (127 == i)
			anInt3305 = class536_sub33.readUnsignedShort() * -476520401;
		else if (128 == i)
			Class682.method8091(Class680.method8069(1739906276), class536_sub33.readUnsignedByte(), 1858049507);
		else if (134 == i) {
			anInt3319 = class536_sub33.readUnsignedShort() * -191883881;
			if (anInt3319 * -1037321689 == 65535)
				anInt3319 = 191883881;
			anInt3320 = class536_sub33.readUnsignedShort() * 1515801529;
			if (-1335145847 * anInt3320 == 65535)
				anInt3320 = -1515801529;
			anInt3321 = class536_sub33.readUnsignedShort() * -1091535921;
			if (anInt3321 * -369448145 == 65535)
				anInt3321 = 1091535921;
			anInt3326 = class536_sub33.readUnsignedShort() * -698286361;
			if (anInt3326 * -3853097 == 65535)
				anInt3326 = 698286361;
			anInt3276 = class536_sub33.readUnsignedByte() * 288311611;
		} else if (135 == i || 136 == i) {
			class536_sub33.readUnsignedByte();
			class536_sub33.readUnsignedShort();
		} else if (137 == i)
			anInt3310 = class536_sub33.readUnsignedShort() * 1746390003;
		else if (i == 138)
			anInt3302 = class536_sub33.method9720((byte) 1) * 397155479;
		else if (140 == i)
			anInt3295 = class536_sub33.readUnsignedByte() * -985081875;
		else if (141 == i)
			aBool3290 = true;
		else if (i == 142)
			anInt3329 = class536_sub33.readUnsignedShort() * -1184885179;
		else if (i == 143)
			aBool3296 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3288[i - 150] = class536_sub33.readString();
			if (!aClass309_3268.aBool3463)
				aStringArray3288[i - 150] = null;
		} else if (155 == i) {
			aByte3323 = class536_sub33.readByte();
			aByte3285 = class536_sub33.readByte();
			aByte3286 = class536_sub33.readByte();
			aByte3333 = class536_sub33.readByte();
		} else if (i == 158)
			aByte3331 = (byte) 1;
		else if (i == 159)
			aByte3331 = (byte) 0;
		else if (i == 160) {
			int i_126_ = class536_sub33.readUnsignedByte();
			anIntArray3297 = new int[i_126_];
			for (int i_127_ = 0; i_127_ < i_126_; i_127_++)
				anIntArray3297[i_127_] = class536_sub33.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3332 = class536_sub33.readUnsignedByte() * -1456011659;
			else if (164 == i) {
				anInt3322 = class536_sub33.readUnsignedShort() * 2005939363;
				anInt3335 = class536_sub33.readUnsignedShort() * -1213293037;
			} else if (165 == i)
				anInt3336 = class536_sub33.readUnsignedByte() * -1321272733;
			else if (i == 168)
				anInt3324 = class536_sub33.readUnsignedByte() * 1449054329;
			else if (169 == i)
				aBool3308 = false;
			else if (i >= 170 && i < 176) {
				if (anIntArray3289 == null) {
					anIntArray3289 = new int[6];
					Arrays.fill(anIntArray3289, -1);
				}
				int i_128_ = class536_sub33.readUnsignedShort();
				if (65535 == i_128_)
					i_128_ = -1;
				anIntArray3289[i - 170] = i_128_;
			} else if (i != 178) {
				if (i == 179) {
					aClass437_3291 = new Class437();
					aClass437_3291.aFloat4859 = (float) class536_sub33.method9717(297197763);
					aClass437_3291.aFloat4855 = (float) class536_sub33.method9717(696463096);
					aClass437_3291.aFloat4856 = (float) class536_sub33.method9717(-468203183);
					aClass437_3291.aFloat4858 = (float) class536_sub33.method9717(1242150884);
					aClass437_3291.aFloat4857 = (float) class536_sub33.method9717(1252324393);
					aClass437_3291.aFloat4854 = (float) class536_sub33.method9717(-670418120);
				} else if (i == 180)
					anInt3338 = ((class536_sub33.readUnsignedByte() & 0xff) * 842424673);
				else if (i == 181) {
					aShort3314 = (short) class536_sub33.readUnsignedShort();
					aByte3315 = (byte) class536_sub33.readUnsignedByte();
				} else if (182 == i)
					aBool3339 = true;
				else if (249 == i) {
					int i_129_ = class536_sub33.readUnsignedByte();
					if (aClass4_3309 == null) {
						int i_130_ = Class528.method6434(i_129_, -1802926673);
						aClass4_3309 = new Class4(i_130_);
					}
					for (int i_131_ = 0; i_131_ < i_129_; i_131_++) {
						boolean bool = class536_sub33.readUnsignedByte() == 1;
						int i_132_ = class536_sub33.read24BitUnsignedInteger(862057578);
						Class536 class536;
						if (bool)
							class536 = (new Class536_Sub13(class536_sub33.readString()));
						else
							class536 = (new Class536_Sub26(class536_sub33.readInt()));
						aClass4_3309.method560(class536, (long) i_132_);
					}
				}
			}
		}
	}

	public void method77() {
		if (null == anIntArray3317)
			anIntArray3317 = new int[0];
		if (-1 == aByte3331) {
			if (null == aClass309_3268 || aClass309_3268.aClass670_3459 == Class670.aClass670_8568)
				aByte3331 = (byte) 1;
			else
				aByte3331 = (byte) 0;
		}
	}

	void method3988(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			int i_133_ = class536_sub33.readUnsignedByte();
			anIntArray3317 = new int[i_133_];
			for (int i_134_ = 0; i_134_ < i_133_; i_134_++)
				anIntArray3317[i_134_] = class536_sub33.method9720((byte) 1);
		} else if (i == 2)
			aString3271 = class536_sub33.readString();
		else if (12 == i)
			anInt3272 = class536_sub33.readUnsignedByte() * -381277341;
		else if (i >= 30 && i < 35)
			aStringArray3288[i - 30] = class536_sub33.readString();
		else if (i == 40) {
			int i_135_ = class536_sub33.readUnsignedByte();
			aShortArray3330 = new short[i_135_];
			aShortArray3278 = new short[i_135_];
			for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
				aShortArray3330[i_136_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3278[i_136_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_137_ = class536_sub33.readUnsignedByte();
			aShortArray3306 = new short[i_137_];
			aShortArray3281 = new short[i_137_];
			for (int i_138_ = 0; i_138_ < i_137_; i_138_++) {
				aShortArray3306[i_138_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3281[i_138_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_139_ = class536_sub33.readUnsignedByte();
			aByteArray3279 = new byte[i_139_];
			for (int i_140_ = 0; i_140_ < i_139_; i_140_++)
				aByteArray3279[i_140_] = class536_sub33.readByte();
		} else if (i == 44) {
			int i_141_ = class536_sub33.readUnsignedShort();
			int i_142_ = 0;
			for (int i_143_ = i_141_; i_143_ > 0; i_143_ >>= 1)
				i_142_++;
			aByteArray3307 = new byte[i_142_];
			byte i_144_ = 0;
			for (int i_145_ = 0; i_145_ < i_142_; i_145_++) {
				if ((i_141_ & 1 << i_145_) > 0) {
					aByteArray3307[i_145_] = i_144_;
					i_144_++;
				} else
					aByteArray3307[i_145_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_146_ = class536_sub33.readUnsignedShort();
			int i_147_ = 0;
			for (int i_148_ = i_146_; i_148_ > 0; i_148_ >>= 1)
				i_147_++;
			aByteArray3283 = new byte[i_147_];
			byte i_149_ = 0;
			for (int i_150_ = 0; i_150_ < i_147_; i_150_++) {
				if ((i_146_ & 1 << i_150_) > 0) {
					aByteArray3283[i_150_] = i_149_;
					i_149_++;
				} else
					aByteArray3283[i_150_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_151_ = class536_sub33.readUnsignedByte();
			anIntArray3274 = new int[i_151_];
			for (int i_152_ = 0; i_152_ < i_151_; i_152_++)
				anIntArray3274[i_152_] = class536_sub33.method9720((byte) 1);
		} else if (i == 93)
			aBool3284 = false;
		else if (95 == i)
			anInt3292 = class536_sub33.readUnsignedShort() * 1950361179;
		else if (i == 97)
			anInt3293 = class536_sub33.readUnsignedShort() * 2134541305;
		else if (98 == i)
			anInt3294 = class536_sub33.readUnsignedShort() * -1408414955;
		else if (99 == i)
			aBool3303 = true;
		else if (100 == i)
			anInt3298 = class536_sub33.readByte() * -1899334295;
		else if (101 == i)
			anInt3275 = class536_sub33.readByte() * -629717521;
		else if (i == 102) {
			int i_153_ = class536_sub33.readUnsignedByte();
			int i_154_ = 0;
			for (int i_155_ = i_153_; i_155_ != 0; i_155_ >>= 1)
				i_154_++;
			anIntArray3300 = new int[i_154_];
			aShortArray3301 = new short[i_154_];
			for (int i_156_ = 0; i_156_ < i_154_; i_156_++) {
				if (0 == (i_153_ & 1 << i_156_)) {
					anIntArray3300[i_156_] = -1;
					aShortArray3301[i_156_] = (short) -1;
				} else {
					anIntArray3300[i_156_] = class536_sub33.method9720((byte) 1);
					aShortArray3301[i_156_] = (short) class536_sub33.method9718(-1187544475);
				}
			}
		} else if (i == 103)
			anInt3318 = class536_sub33.readUnsignedShort() * 323632795;
		else if (i == 106 || i == 118) {
			anInt3273 = class536_sub33.readUnsignedShort() * -145271203;
			if (-2140393995 * anInt3273 == 65535)
				anInt3273 = 145271203;
			anInt3312 = class536_sub33.readUnsignedShort() * 1516588973;
			if (65535 == -829887451 * anInt3312)
				anInt3312 = -1516588973;
			int i_157_ = -1;
			if (i == 118) {
				i_157_ = class536_sub33.readUnsignedShort();
				if (i_157_ == 65535)
					i_157_ = -1;
			}
			int i_158_ = class536_sub33.readUnsignedByte();
			anIntArray3304 = new int[2 + i_158_];
			for (int i_159_ = 0; i_159_ <= i_158_; i_159_++) {
				anIntArray3304[i_159_] = class536_sub33.readUnsignedShort();
				if (anIntArray3304[i_159_] == 65535)
					anIntArray3304[i_159_] = -1;
			}
			anIntArray3304[i_158_ + 1] = i_157_;
		} else if (i == 107)
			aBool3287 = false;
		else if (i == 109)
			aBool3334 = false;
		else if (i == 111)
			aBool3265 = false;
		else if (113 == i) {
			aShort3280 = (short) class536_sub33.readUnsignedShort();
			aShort3311 = (short) class536_sub33.readUnsignedShort();
		} else if (i == 114) {
			aByte3277 = class536_sub33.readByte();
			aByte3313 = class536_sub33.readByte();
		} else if (119 == i)
			aByte3316 = class536_sub33.readByte();
		else if (121 == i) {
			anIntArrayArray3325 = new int[anIntArray3317.length][];
			int i_160_ = class536_sub33.readUnsignedByte();
			for (int i_161_ = 0; i_161_ < i_160_; i_161_++) {
				int i_162_ = class536_sub33.readUnsignedByte();
				int[] is = anIntArrayArray3325[i_162_] = new int[3];
				is[0] = class536_sub33.readByte();
				is[1] = class536_sub33.readByte();
				is[2] = class536_sub33.readByte();
			}
		} else if (i == 123)
			anInt3327 = class536_sub33.readUnsignedShort() * -923020521;
		else if (i == 125)
			aClass679_3328 = ((Class679) Class682.method8091(Class392.method4866((byte) 26), class536_sub33.readByte(), 1858049507));
		else if (127 == i)
			anInt3305 = class536_sub33.readUnsignedShort() * -476520401;
		else if (128 == i)
			Class682.method8091(Class680.method8069(-2107639278), class536_sub33.readUnsignedByte(), 1858049507);
		else if (134 == i) {
			anInt3319 = class536_sub33.readUnsignedShort() * -191883881;
			if (anInt3319 * -1037321689 == 65535)
				anInt3319 = 191883881;
			anInt3320 = class536_sub33.readUnsignedShort() * 1515801529;
			if (-1335145847 * anInt3320 == 65535)
				anInt3320 = -1515801529;
			anInt3321 = class536_sub33.readUnsignedShort() * -1091535921;
			if (anInt3321 * -369448145 == 65535)
				anInt3321 = 1091535921;
			anInt3326 = class536_sub33.readUnsignedShort() * -698286361;
			if (anInt3326 * -3853097 == 65535)
				anInt3326 = 698286361;
			anInt3276 = class536_sub33.readUnsignedByte() * 288311611;
		} else if (135 == i || 136 == i) {
			class536_sub33.readUnsignedByte();
			class536_sub33.readUnsignedShort();
		} else if (137 == i)
			anInt3310 = class536_sub33.readUnsignedShort() * 1746390003;
		else if (i == 138)
			anInt3302 = class536_sub33.method9720((byte) 1) * 397155479;
		else if (140 == i)
			anInt3295 = class536_sub33.readUnsignedByte() * -985081875;
		else if (141 == i)
			aBool3290 = true;
		else if (i == 142)
			anInt3329 = class536_sub33.readUnsignedShort() * -1184885179;
		else if (i == 143)
			aBool3296 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3288[i - 150] = class536_sub33.readString();
			if (!aClass309_3268.aBool3463)
				aStringArray3288[i - 150] = null;
		} else if (155 == i) {
			aByte3323 = class536_sub33.readByte();
			aByte3285 = class536_sub33.readByte();
			aByte3286 = class536_sub33.readByte();
			aByte3333 = class536_sub33.readByte();
		} else if (i == 158)
			aByte3331 = (byte) 1;
		else if (i == 159)
			aByte3331 = (byte) 0;
		else if (i == 160) {
			int i_163_ = class536_sub33.readUnsignedByte();
			anIntArray3297 = new int[i_163_];
			for (int i_164_ = 0; i_164_ < i_163_; i_164_++)
				anIntArray3297[i_164_] = class536_sub33.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3332 = class536_sub33.readUnsignedByte() * -1456011659;
			else if (164 == i) {
				anInt3322 = class536_sub33.readUnsignedShort() * 2005939363;
				anInt3335 = class536_sub33.readUnsignedShort() * -1213293037;
			} else if (165 == i)
				anInt3336 = class536_sub33.readUnsignedByte() * -1321272733;
			else if (i == 168)
				anInt3324 = class536_sub33.readUnsignedByte() * 1449054329;
			else if (169 == i)
				aBool3308 = false;
			else if (i >= 170 && i < 176) {
				if (anIntArray3289 == null) {
					anIntArray3289 = new int[6];
					Arrays.fill(anIntArray3289, -1);
				}
				int i_165_ = class536_sub33.readUnsignedShort();
				if (65535 == i_165_)
					i_165_ = -1;
				anIntArray3289[i - 170] = i_165_;
			} else if (i != 178) {
				if (i == 179) {
					aClass437_3291 = new Class437();
					aClass437_3291.aFloat4859 = (float) class536_sub33.method9717(-118671373);
					aClass437_3291.aFloat4855 = (float) class536_sub33.method9717(-953908150);
					aClass437_3291.aFloat4856 = (float) class536_sub33.method9717(-6387308);
					aClass437_3291.aFloat4858 = (float) class536_sub33.method9717(-1869634372);
					aClass437_3291.aFloat4857 = (float) class536_sub33.method9717(690346591);
					aClass437_3291.aFloat4854 = (float) class536_sub33.method9717(-1566577061);
				} else if (i == 180)
					anInt3338 = (class536_sub33.readUnsignedByte() & 0xff) * 842424673;
				else if (i == 181) {
					aShort3314 = (short) class536_sub33.readUnsignedShort();
					aByte3315 = (byte) class536_sub33.readUnsignedByte();
				} else if (182 == i)
					aBool3339 = true;
				else if (249 == i) {
					int i_166_ = class536_sub33.readUnsignedByte();
					if (aClass4_3309 == null) {
						int i_167_ = Class528.method6434(i_166_, -499667307);
						aClass4_3309 = new Class4(i_167_);
					}
					for (int i_168_ = 0; i_168_ < i_166_; i_168_++) {
						boolean bool = class536_sub33.readUnsignedByte() == 1;
						int i_169_ = class536_sub33.read24BitUnsignedInteger(753467725);
						Class536 class536;
						if (bool)
							class536 = (new Class536_Sub13(class536_sub33.readString()));
						else
							class536 = (new Class536_Sub26(class536_sub33.readInt()));
						aClass4_3309.method560(class536, (long) i_169_);
					}
				}
			}
		}
	}

	void method3989(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			int i_170_ = class536_sub33.readUnsignedByte();
			anIntArray3317 = new int[i_170_];
			for (int i_171_ = 0; i_171_ < i_170_; i_171_++)
				anIntArray3317[i_171_] = class536_sub33.method9720((byte) 1);
		} else if (i == 2)
			aString3271 = class536_sub33.readString();
		else if (12 == i)
			anInt3272 = class536_sub33.readUnsignedByte() * -381277341;
		else if (i >= 30 && i < 35)
			aStringArray3288[i - 30] = class536_sub33.readString();
		else if (i == 40) {
			int i_172_ = class536_sub33.readUnsignedByte();
			aShortArray3330 = new short[i_172_];
			aShortArray3278 = new short[i_172_];
			for (int i_173_ = 0; i_173_ < i_172_; i_173_++) {
				aShortArray3330[i_173_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3278[i_173_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_174_ = class536_sub33.readUnsignedByte();
			aShortArray3306 = new short[i_174_];
			aShortArray3281 = new short[i_174_];
			for (int i_175_ = 0; i_175_ < i_174_; i_175_++) {
				aShortArray3306[i_175_] = (short) class536_sub33.readUnsignedShort();
				aShortArray3281[i_175_] = (short) class536_sub33.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_176_ = class536_sub33.readUnsignedByte();
			aByteArray3279 = new byte[i_176_];
			for (int i_177_ = 0; i_177_ < i_176_; i_177_++)
				aByteArray3279[i_177_] = class536_sub33.readByte();
		} else if (i == 44) {
			int i_178_ = class536_sub33.readUnsignedShort();
			int i_179_ = 0;
			for (int i_180_ = i_178_; i_180_ > 0; i_180_ >>= 1)
				i_179_++;
			aByteArray3307 = new byte[i_179_];
			byte i_181_ = 0;
			for (int i_182_ = 0; i_182_ < i_179_; i_182_++) {
				if ((i_178_ & 1 << i_182_) > 0) {
					aByteArray3307[i_182_] = i_181_;
					i_181_++;
				} else
					aByteArray3307[i_182_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_183_ = class536_sub33.readUnsignedShort();
			int i_184_ = 0;
			for (int i_185_ = i_183_; i_185_ > 0; i_185_ >>= 1)
				i_184_++;
			aByteArray3283 = new byte[i_184_];
			byte i_186_ = 0;
			for (int i_187_ = 0; i_187_ < i_184_; i_187_++) {
				if ((i_183_ & 1 << i_187_) > 0) {
					aByteArray3283[i_187_] = i_186_;
					i_186_++;
				} else
					aByteArray3283[i_187_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_188_ = class536_sub33.readUnsignedByte();
			anIntArray3274 = new int[i_188_];
			for (int i_189_ = 0; i_189_ < i_188_; i_189_++)
				anIntArray3274[i_189_] = class536_sub33.method9720((byte) 1);
		} else if (i == 93)
			aBool3284 = false;
		else if (95 == i)
			anInt3292 = class536_sub33.readUnsignedShort() * 1950361179;
		else if (i == 97)
			anInt3293 = class536_sub33.readUnsignedShort() * 2134541305;
		else if (98 == i)
			anInt3294 = class536_sub33.readUnsignedShort() * -1408414955;
		else if (99 == i)
			aBool3303 = true;
		else if (100 == i)
			anInt3298 = class536_sub33.readByte() * -1899334295;
		else if (101 == i)
			anInt3275 = class536_sub33.readByte() * -629717521;
		else if (i == 102) {
			int i_190_ = class536_sub33.readUnsignedByte();
			int i_191_ = 0;
			for (int i_192_ = i_190_; i_192_ != 0; i_192_ >>= 1)
				i_191_++;
			anIntArray3300 = new int[i_191_];
			aShortArray3301 = new short[i_191_];
			for (int i_193_ = 0; i_193_ < i_191_; i_193_++) {
				if (0 == (i_190_ & 1 << i_193_)) {
					anIntArray3300[i_193_] = -1;
					aShortArray3301[i_193_] = (short) -1;
				} else {
					anIntArray3300[i_193_] = class536_sub33.method9720((byte) 1);
					aShortArray3301[i_193_] = (short) class536_sub33.method9718(-1098795453);
				}
			}
		} else if (i == 103)
			anInt3318 = class536_sub33.readUnsignedShort() * 323632795;
		else if (i == 106 || i == 118) {
			anInt3273 = class536_sub33.readUnsignedShort() * -145271203;
			if (-2140393995 * anInt3273 == 65535)
				anInt3273 = 145271203;
			anInt3312 = class536_sub33.readUnsignedShort() * 1516588973;
			if (65535 == -829887451 * anInt3312)
				anInt3312 = -1516588973;
			int i_194_ = -1;
			if (i == 118) {
				i_194_ = class536_sub33.readUnsignedShort();
				if (i_194_ == 65535)
					i_194_ = -1;
			}
			int i_195_ = class536_sub33.readUnsignedByte();
			anIntArray3304 = new int[2 + i_195_];
			for (int i_196_ = 0; i_196_ <= i_195_; i_196_++) {
				anIntArray3304[i_196_] = class536_sub33.readUnsignedShort();
				if (anIntArray3304[i_196_] == 65535)
					anIntArray3304[i_196_] = -1;
			}
			anIntArray3304[i_195_ + 1] = i_194_;
		} else if (i == 107)
			aBool3287 = false;
		else if (i == 109)
			aBool3334 = false;
		else if (i == 111)
			aBool3265 = false;
		else if (113 == i) {
			aShort3280 = (short) class536_sub33.readUnsignedShort();
			aShort3311 = (short) class536_sub33.readUnsignedShort();
		} else if (i == 114) {
			aByte3277 = class536_sub33.readByte();
			aByte3313 = class536_sub33.readByte();
		} else if (119 == i)
			aByte3316 = class536_sub33.readByte();
		else if (121 == i) {
			anIntArrayArray3325 = new int[anIntArray3317.length][];
			int i_197_ = class536_sub33.readUnsignedByte();
			for (int i_198_ = 0; i_198_ < i_197_; i_198_++) {
				int i_199_ = class536_sub33.readUnsignedByte();
				int[] is = anIntArrayArray3325[i_199_] = new int[3];
				is[0] = class536_sub33.readByte();
				is[1] = class536_sub33.readByte();
				is[2] = class536_sub33.readByte();
			}
		} else if (i == 123)
			anInt3327 = class536_sub33.readUnsignedShort() * -923020521;
		else if (i == 125)
			aClass679_3328 = ((Class679) Class682.method8091(Class392.method4866((byte) 22), class536_sub33.readByte(), 1858049507));
		else if (127 == i)
			anInt3305 = class536_sub33.readUnsignedShort() * -476520401;
		else if (128 == i)
			Class682.method8091(Class680.method8069(-1427258736), class536_sub33.readUnsignedByte(), 1858049507);
		else if (134 == i) {
			anInt3319 = class536_sub33.readUnsignedShort() * -191883881;
			if (anInt3319 * -1037321689 == 65535)
				anInt3319 = 191883881;
			anInt3320 = class536_sub33.readUnsignedShort() * 1515801529;
			if (-1335145847 * anInt3320 == 65535)
				anInt3320 = -1515801529;
			anInt3321 = class536_sub33.readUnsignedShort() * -1091535921;
			if (anInt3321 * -369448145 == 65535)
				anInt3321 = 1091535921;
			anInt3326 = class536_sub33.readUnsignedShort() * -698286361;
			if (anInt3326 * -3853097 == 65535)
				anInt3326 = 698286361;
			anInt3276 = class536_sub33.readUnsignedByte() * 288311611;
		} else if (135 == i || 136 == i) {
			class536_sub33.readUnsignedByte();
			class536_sub33.readUnsignedShort();
		} else if (137 == i)
			anInt3310 = class536_sub33.readUnsignedShort() * 1746390003;
		else if (i == 138)
			anInt3302 = class536_sub33.method9720((byte) 1) * 397155479;
		else if (140 == i)
			anInt3295 = class536_sub33.readUnsignedByte() * -985081875;
		else if (141 == i)
			aBool3290 = true;
		else if (i == 142)
			anInt3329 = class536_sub33.readUnsignedShort() * -1184885179;
		else if (i == 143)
			aBool3296 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3288[i - 150] = class536_sub33.readString();
			if (!aClass309_3268.aBool3463)
				aStringArray3288[i - 150] = null;
		} else if (155 == i) {
			aByte3323 = class536_sub33.readByte();
			aByte3285 = class536_sub33.readByte();
			aByte3286 = class536_sub33.readByte();
			aByte3333 = class536_sub33.readByte();
		} else if (i == 158)
			aByte3331 = (byte) 1;
		else if (i == 159)
			aByte3331 = (byte) 0;
		else if (i == 160) {
			int i_200_ = class536_sub33.readUnsignedByte();
			anIntArray3297 = new int[i_200_];
			for (int i_201_ = 0; i_201_ < i_200_; i_201_++)
				anIntArray3297[i_201_] = class536_sub33.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3332 = class536_sub33.readUnsignedByte() * -1456011659;
			else if (164 == i) {
				anInt3322 = class536_sub33.readUnsignedShort() * 2005939363;
				anInt3335 = class536_sub33.readUnsignedShort() * -1213293037;
			} else if (165 == i)
				anInt3336 = class536_sub33.readUnsignedByte() * -1321272733;
			else if (i == 168)
				anInt3324 = class536_sub33.readUnsignedByte() * 1449054329;
			else if (169 == i)
				aBool3308 = false;
			else if (i >= 170 && i < 176) {
				if (anIntArray3289 == null) {
					anIntArray3289 = new int[6];
					Arrays.fill(anIntArray3289, -1);
				}
				int i_202_ = class536_sub33.readUnsignedShort();
				if (65535 == i_202_)
					i_202_ = -1;
				anIntArray3289[i - 170] = i_202_;
			} else if (i != 178) {
				if (i == 179) {
					aClass437_3291 = new Class437();
					aClass437_3291.aFloat4859 = (float) class536_sub33.method9717(1910616857);
					aClass437_3291.aFloat4855 = (float) class536_sub33.method9717(-334415458);
					aClass437_3291.aFloat4856 = (float) class536_sub33.method9717(-769621857);
					aClass437_3291.aFloat4858 = (float) class536_sub33.method9717(1540144538);
					aClass437_3291.aFloat4857 = (float) class536_sub33.method9717(-111239119);
					aClass437_3291.aFloat4854 = (float) class536_sub33.method9717(-136889138);
				} else if (i == 180)
					anInt3338 = (class536_sub33.readUnsignedByte() & 0xff) * 842424673;
				else if (i == 181) {
					aShort3314 = (short) class536_sub33.readUnsignedShort();
					aByte3315 = (byte) class536_sub33.readUnsignedByte();
				} else if (182 == i)
					aBool3339 = true;
				else if (249 == i) {
					int i_203_ = class536_sub33.readUnsignedByte();
					if (aClass4_3309 == null) {
						int i_204_ = Class528.method6434(i_203_, -1163920836);
						aClass4_3309 = new Class4(i_204_);
					}
					for (int i_205_ = 0; i_205_ < i_203_; i_205_++) {
						boolean bool = class536_sub33.readUnsignedByte() == 1;
						int i_206_ = class536_sub33.read24BitUnsignedInteger(1385182686);
						Class536 class536;
						if (bool)
							class536 = (new Class536_Sub13(class536_sub33.readString()));
						else
							class536 = (new Class536_Sub26(class536_sub33.readInt()));
						aClass4_3309.method560(class536, (long) i_206_);
					}
				}
			}
		}
	}

	public int method3990(int i) {
		if (null == anIntArray3289)
			return -1;
		return anIntArray3289[i];
	}

	public final boolean method3991() {
		if (null == anIntArray3317)
			return true;
		boolean bool = true;
		int[] is = anIntArray3317;
		for (int i = 0; i < is.length; i++) {
			int i_207_ = is[i];
			if (!aClass309_3268.aClass461_3460.method5558(i_207_, 0, -1561640209))
				bool = false;
		}
		return bool;
	}

	public final boolean method3992() {
		if (null == anIntArray3317)
			return true;
		boolean bool = true;
		int[] is = anIntArray3317;
		for (int i = 0; i < is.length; i++) {
			int i_208_ = is[i];
			if (!aClass309_3268.aClass461_3460.method5558(i_208_, 0, -946419593))
				bool = false;
		}
		return bool;
	}

	public int method3993(int i, int i_209_, int i_210_) {
		if (null == aClass4_3309)
			return i_209_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_3309.method556((long) i);
		if (class536_sub26 == null)
			return i_209_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public final boolean method3994() {
		if (null == anIntArray3317)
			return true;
		boolean bool = true;
		int[] is = anIntArray3317;
		for (int i = 0; i < is.length; i++) {
			int i_211_ = is[i];
			if (!aClass309_3268.aClass461_3460.method5558(i_211_, 0, 807905326))
				bool = false;
		}
		return bool;
	}

	public final Class177 method3995(Class167 class167, int i, Class34_Sub16 class34_sub16, Interface20 interface20, Interface18 interface18, Class688 class688, Class688 class688_212_, Class688[] class688s, int[] is, int i_213_, Class304 class304, int i_214_) {
		return method3997(class167, i, class34_sub16, interface20, interface18, class688, class688_212_, class688s, is, i_213_, class304, -1091541297 * anInt3305, true, 362571452);
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method3980(class536_sub33, i, 1460275862);
		}
	}

	public String method3996(int i, String string) {
		if (null == aClass4_3309)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_3309.method556((long) i);
		if (class536_sub13 == null)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	public final Class177 method3997(Class167 class167, int i, Class34_Sub16 class34_sub16, Interface20 interface20, Interface18 interface18, Class688 class688, Class688 class688_215_, Class688[] class688s, int[] is, int i_216_, Class304 class304, int i_217_, boolean bool, int i_218_) {
		if (anIntArray3304 != null) {
			Class296 class296_219_ = method3984(interface20, interface18, (byte) -96);
			if (null == class296_219_)
				return null;
			return class296_219_.method3997(class167, i, class34_sub16, interface20, interface18, class688, class688_215_, class688s, is, i_216_, class304, i_217_, bool, 1032202426);
		}
		int i_220_ = i;
		if (-443044803 * anInt3294 != 128)
			i_220_ |= 0x2;
		if (128 != anInt3293 * 1586417225)
			i_220_ |= 0x5;
		boolean bool_221_ = false;
		int i_222_ = null != class688s ? class688s.length : 0;
		for (int i_223_ = 0; i_223_ < i_222_; i_223_++) {
			if (null != class688s[i_223_]) {
				i_220_ |= class688s[i_223_].method8162((byte) 77);
				bool_221_ = true;
			}
		}
		if (null != class688) {
			i_220_ |= class688.method8162((byte) 79);
			bool_221_ = true;
		}
		if (class688_215_ != null) {
			i_220_ |= class688_215_.method8162((byte) 118);
			bool_221_ = true;
		}
		long l = (long) (anInt3270 * -1647549559 | 1526643673 * class167.anInt1850 << 16);
		if (class304 != null)
			l |= class304.aLong3434 * -2746811695092079303L << 24;
		Class177 class177;
		synchronized (aClass309_3268.aClass199_3461) {
			class177 = (Class177) aClass309_3268.aClass199_3461.method2886(l);
		}
		Class589 class589 = null;
		if (!bool && -1 != i_217_)
			class589 = (Class589) class34_sub16.method70(i_217_, (byte) -40);
		else if (-1091541297 * anInt3305 != -1)
			class589 = (Class589) class34_sub16.method70(anInt3305 * -1091541297, (byte) -11);
		if (class177 == null || (class177.method2466() & i_220_) != i_220_) {
			if (class177 != null)
				i_220_ |= class177.method2466();
			int i_224_ = i_220_;
			if (aShortArray3330 != null)
				i_224_ |= 0x4000;
			if (null != aShortArray3306)
				i_224_ |= 0x8000;
			if (aByte3333 != 0)
				i_224_ |= 0x80000;
			int[] is_225_ = (null != class304 && null != class304.anIntArray3433 ? class304.anIntArray3433 : anIntArray3317);
			boolean bool_226_ = false;
			synchronized (aClass309_3268.aClass461_3460) {
				for (int i_227_ = 0; i_227_ < is_225_.length; i_227_++) {
					if (is_225_[i_227_] != -1 && !aClass309_3268.aClass461_3460.method5558(is_225_[i_227_], 0, -1791069101))
						bool_226_ = true;
				}
			}
			if (bool_226_)
				return null;
			Class180[] class180s = new Class180[is_225_.length];
			for (int i_228_ = 0; i_228_ < is_225_.length; i_228_++) {
				if (is_225_[i_228_] != -1) {
					synchronized (aClass309_3268.aClass461_3460) {
						class180s[i_228_] = Class180.method2708((aClass309_3268.aClass461_3460), is_225_[i_228_], 0);
					}
					if (class180s[i_228_] != null) {
						if (class180s[i_228_].anInt1949 < 13)
							class180s[i_228_].method2707(2);
						if (anIntArrayArray3325 != null && anIntArrayArray3325[i_228_] != null)
							class180s[i_228_].method2705(anIntArrayArray3325[i_228_][0], anIntArrayArray3325[i_228_][1], anIntArrayArray3325[i_228_][2]);
					}
				}
			}
			if (class304 != null) {
				for (int i_229_ = 0; i_229_ < class180s.length; i_229_++) {
					if (class180s[i_229_] != null) {
						if (null != class304.aFloatArray3435 && class304.aFloatArray3435[i_229_] != 0.0F)
							class180s[i_229_].method2698(class304.aFloatArray3435[i_229_]);
						if (null != class304.anIntArrayArray3436)
							class180s[i_229_].method2711(class304.anIntArrayArray3436[i_229_][0], class304.anIntArrayArray3436[i_229_][1], class304.anIntArrayArray3436[i_229_][2]);
						if (null != class304.anIntArrayArray3437)
							class180s[i_229_].method2705(class304.anIntArrayArray3437[i_229_][0], class304.anIntArrayArray3437[i_229_][1], class304.anIntArrayArray3437[i_229_][2]);
					}
				}
			}
			if (null != class589 && class589.anIntArrayArray7749 != null) {
				for (int i_230_ = 0; i_230_ < class589.anIntArrayArray7749.length; i_230_++) {
					if (i_230_ < class180s.length && class180s[i_230_] != null) {
						int i_231_ = 0;
						int i_232_ = 0;
						int i_233_ = 0;
						int i_234_ = 0;
						int i_235_ = 0;
						int i_236_ = 0;
						if (null != class589.anIntArrayArray7749[i_230_]) {
							i_231_ = class589.anIntArrayArray7749[i_230_][0];
							i_232_ = class589.anIntArrayArray7749[i_230_][1];
							i_233_ = class589.anIntArrayArray7749[i_230_][2];
							i_234_ = class589.anIntArrayArray7749[i_230_][3] << 3;
							i_235_ = class589.anIntArrayArray7749[i_230_][4] << 3;
							i_236_ = class589.anIntArrayArray7749[i_230_][5] << 3;
						}
						if (0 != i_234_ || i_235_ != 0 || i_236_ != 0)
							class180s[i_230_].method2711(i_234_, i_235_, i_236_);
						if (i_231_ != 0 || 0 != i_232_ || i_233_ != 0)
							class180s[i_230_].method2705(i_231_, i_232_, i_233_);
					}
				}
			}
			Class180 class180;
			if (class180s.length == 1)
				class180 = class180s[0];
			else
				class180 = new Class180(class180s, class180s.length);
			class177 = class167.method2093(class180, i_224_, 740522041 * aClass309_3268.anInt3458, 64 + 838691545 * anInt3298, anInt3275 * 334802251 + 850);
			if (aShortArray3330 != null) {
				short[] is_237_;
				if (null != class304 && class304.aShortArray3438 != null)
					is_237_ = class304.aShortArray3438;
				else
					is_237_ = aShortArray3278;
				for (int i_238_ = 0; i_238_ < aShortArray3330.length; i_238_++) {
					if (null != aByteArray3279 && i_238_ < aByteArray3279.length)
						class177.method2507(aShortArray3330[i_238_], (aShortArray3267[aByteArray3279[i_238_] & 0xff]));
					else
						class177.method2507(aShortArray3330[i_238_], is_237_[i_238_]);
				}
			}
			if (aShortArray3306 != null) {
				short[] is_239_;
				if (null != class304 && null != class304.aShortArray3439)
					is_239_ = class304.aShortArray3439;
				else
					is_239_ = aShortArray3281;
				for (int i_240_ = 0; i_240_ < aShortArray3306.length; i_240_++)
					class177.method2509(aShortArray3306[i_240_], is_239_[i_240_]);
			}
			if (0 != aByte3333)
				class177.method2510(aByte3323, aByte3285, aByte3286, aByte3333 & 0xff);
			class177.method2501();
			class177.method2465(i_220_);
			synchronized (aClass309_3268.aClass199_3461) {
				aClass309_3268.aClass199_3461.method2881(class177, l);
			}
		}
		Class177 class177_241_ = class177.method2623((byte) 4, i_220_, true);
		boolean bool_242_ = false;
		if (null != is) {
			for (int i_243_ = 0; i_243_ < 12; i_243_++) {
				if (is[i_243_] != -1)
					bool_242_ = true;
			}
		}
		if (!bool_221_ && !bool_242_)
			return class177_241_;
		Class433[] class433s = null;
		if (class589 != null)
			class433s = class589.method7091(941480841);
		if (bool_242_ && null != class433s) {
			for (int i_244_ = 0; i_244_ < 12; i_244_++) {
				if (null != class433s[i_244_])
					class177_241_.method2489(class433s[i_244_], 1 << i_244_, true);
			}
		}
		int i_245_ = 0;
		int i_246_ = 1;
		while (i_245_ < i_222_) {
			if (class688s[i_245_] != null)
				class688s[i_245_].method8133(class177_241_, 0, i_246_, 1049444347);
			i_245_++;
			i_246_ <<= 1;
		}
		if (bool_242_) {
			for (i_245_ = 0; i_245_ < 12; i_245_++) {
				if (-1 != is[i_245_]) {
					i_246_ = is[i_245_] - i_216_;
					i_246_ &= 0x3fff;
					Class433 class433 = new Class433();
					class433.method5206(0.0F, 1.0F, 0.0F, Class447.method5400(i_246_));
					class177_241_.method2489(class433, 1 << i_245_, false);
				}
			}
		}
		if (bool_242_ && null != class433s) {
			for (i_245_ = 0; i_245_ < 12; i_245_++) {
				if (class433s[i_245_] != null)
					class177_241_.method2489(class433s[i_245_], 1 << i_245_, false);
			}
		}
		if (class688 != null && null != class688_215_)
			Class389.method4852(class177_241_, class688, class688_215_, -1954657321);
		else if (null != class688)
			class688.method8132(class177_241_, 0, -445346962);
		else if (null != class688_215_)
			class688_215_.method8132(class177_241_, 0, -820899898);
		if (128 != anInt3293 * 1586417225 || 128 != -443044803 * anInt3294)
			class177_241_.method2474(anInt3293 * 1586417225, anInt3294 * -443044803, anInt3293 * 1586417225);
		class177_241_.method2465(i);
		return class177_241_;
	}

	public boolean method3998() {
		if (null == anIntArray3304)
			return (-1 != -1037321689 * anInt3319 || -1 != anInt3321 * -369448145 || anInt3326 * -3853097 != -1);
		for (int i = 0; i < anIntArray3304.length; i++) {
			if (-1 != anIntArray3304[i]) {
				Class296 class296_247_ = (Class296) anInterface12_3269.method70(anIntArray3304[i], (byte) 62);
				if (-1037321689 * class296_247_.anInt3319 != -1 || -369448145 * class296_247_.anInt3321 != -1 || -1 != -3853097 * class296_247_.anInt3326)
					return true;
			}
		}
		return false;
	}

	public int method3999(int i) {
		if (null == anIntArray3289)
			return -1;
		return anIntArray3289[i];
	}

	public int method4000(int i, int i_248_) {
		if (null == anIntArray3289)
			return -1;
		return anIntArray3289[i];
	}

	static final void method4001(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= -1349181388;
		int i_249_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_250_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		int i_251_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		int i_252_ = class668.anIntArray8541[3 + 1867269829 * class668.anInt8542];
		Class436 class436 = Class436.method5257((float) i_249_, (float) i_250_, (float) i_251_);
		if (-1.0F == class436.aFloat4850)
			class436.aFloat4850 = Float.POSITIVE_INFINITY;
		if (-1.0F == class436.aFloat4852)
			class436.aFloat4852 = Float.POSITIVE_INFINITY;
		if (-1.0F == class436.aFloat4853)
			class436.aFloat4853 = Float.POSITIVE_INFINITY;
		Class683.aClass301_Sub1_8651.method4037(class436, -1000152202);
		Class683.aClass301_Sub1_8651.method4034((float) i_252_ / 1000.0F, 1962735596);
		class436.method5239();
	}

	static final void method4002(Class668 class668, int i) {
		int i_253_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if ((Class683.aClass301_Sub1_8651.method4054(-289794496) != Class290.aClass290_3220) || (Class683.aClass301_Sub1_8651.method4062(512441886) != Class300.aClass300_3360))
			throw new RuntimeException();
		Class333_Sub2 class333_sub2 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221));
		Class706_Sub2 class706_sub2 = ((Class706_Sub2) Class683.aClass301_Sub1_8651.method4052(-810172525));
		Class436 class436 = class333_sub2.method9177((byte) 8);
		Class436 class436_254_ = Class436.method5240(class436);
		class436_254_.aFloat4852 += (float) i_253_;
		Class436 class436_255_ = Class436.method5252(class706_sub2.method8279(459796660), class436_254_);
		class436_255_.method5247();
		float f = class333_sub2.method9174(-882164927).method5291();
		Class445.method5397(class706_sub2.method8279(459796660), class436_255_, class436, f, Class685.aClass436Array8659);
		Object object = null;
		if (Class685.aClass436Array8659[0] == null)
			throw new RuntimeException("");
		Class436 class436_256_;
		if (null == Class685.aClass436Array8659[1])
			class436_256_ = Class685.aClass436Array8659[0];
		else if (Class436.method5252(class706_sub2.method8279(459796660), Class685.aClass436Array8659[0]).method5291() < Class436.method5252(class706_sub2.method8279(459796660), Class685.aClass436Array8659[1]).method5291())
			class436_256_ = Class685.aClass436Array8659[1];
		else
			class436_256_ = Class685.aClass436Array8659[0];
		float f_257_ = Class205_Sub10.method9066((class436.aFloat4850 - class436_256_.aFloat4850), (class436.aFloat4853 - class436_256_.aFloat4853), 791532731);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (2607.5945876176133 * (double) f_257_) & 0x3fff;
	}

	static final void method4003(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub10_10781.method10015((byte) 71) ? 1 : 0;
	}
}

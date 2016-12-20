/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class295 implements Interface14 {
	public int anInt3273;
	public boolean aBool3274;
	public static short[] aShortArray3275 = new short[256];
	Class293 aClass293_3276;
	public Class681 aClass681_3277;
	public boolean aBool3278;
	public String aString3279 = "null";
	public byte[] aByteArray3280;
	public int[] anIntArray3281;
	public int[] anIntArray3282;
	int[][] anIntArrayArray3283;
	public int anInt3284;
	public int anInt3285;
	public short[] aShortArray3286;
	public int anInt3287;
	public byte aByte3288;
	public short[] aShortArray3289;
	static final int anInt3290 = 6;
	int anInt3291;
	byte aByte3292;
	byte aByte3293;
	public byte aByte3294;
	byte aByte3295;
	Interface13 anInterface13_3296;
	int[] anIntArray3297;
	public int anInt3298;
	public boolean aBool3299;
	public byte[] aByteArray3300;
	int anInt3301;
	int anInt3302;
	byte[] aByteArray3303;
	short[] aShortArray3304;
	public boolean aBool3305;
	int anInt3306;
	int anInt3307;
	public String[] aStringArray3308;
	public short[] aShortArray3309;
	public int anInt3310;
	public int anInt3311;
	public int[] anIntArray3312;
	public boolean aBool3313;
	short[] aShortArray3314;
	public boolean aBool3315;
	public boolean aBool3316;
	byte aByte3317;
	public short aShort3318;
	public short aShort3319;
	public byte aByte3320;
	public boolean aBool3321;
	public short aShort3322;
	public byte aByte3323;
	public int[] anIntArray3324;
	public static final int anInt3325 = 1;
	public static final int anInt3326 = 2;
	public int anInt3327;
	int anInt3328;
	public int anInt3329;
	public int anInt3330;
	public int anInt3331;
	public int anInt3332;
	public int anInt3333;
	Class14 aClass14_3334;
	public int anInt3335;
	public static final int anInt3336 = 8;
	public int anInt3337;
	public int[] anIntArray3338;
	public byte aByte3339;
	public int anInt3340;
	public Class439 aClass439_3341;
	public int anInt3342 = -241082749;
	public int anInt3343;
	public int anInt3344;
	public int anInt3345;
	public int anInt3346;
	public boolean aBool3347;

	public boolean method5300(Interface20 interface20, Interface18 interface18) {
		if (anIntArray3312 == null)
			return true;
		int i = -1;
		if (anInt3328 * -2136287195 != -1) {
			Class333 class333 = interface20.method123(anInt3328 * -2136287195, 1638991330);
			if (null != class333)
				i = interface18.method100(class333, (short) -573);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -400780156);
			if (null != class160)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray3312.length - 1) {
			int i_0_ = anIntArray3312[anIntArray3312.length - 1];
			if (i_0_ != -1)
				return true;
			return false;
		}
		if (anIntArray3312[i] == -1)
			return false;
		return true;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_1_ = class527_sub38.readUnsignedByte();
			if (0 == i_1_)
				break;
			method5318(class527_sub38, i_1_, -1486073508);
		}
	}

	public final Class176 method5301(Class180 class180, int i, Interface20 interface20, Interface18 interface18, Class695 class695, Class308 class308, int i_2_) {
		if (anIntArray3312 != null) {
			Class295 class295_3_ = method5314(interface20, interface18, 883642432);
			if (null == class295_3_)
				return null;
			return class295_3_.method5301(class180, i, interface20, interface18, class695, class308, -571302542);
		}
		if (anIntArray3282 == null && (class308 == null || null == class308.anIntArray3449))
			return null;
		int i_4_ = i;
		if (null != class695)
			i_4_ |= class695.method14174(-822649352);
		long l = (long) (anInt3345 * -596975525 | class180.anInt2064 * -397006101 << 16);
		if (null != class308)
			l |= -6646494755336293335L * class308.aLong3450 << 24;
		Class176 class176;
		synchronized (aClass293_3276.aClass205_3262) {
			class176 = (Class176) aClass293_3276.aClass205_3262.method3787(l);
		}
		if (class176 == null || (class176.method2874() & i_4_) != i_4_) {
			if (class176 != null)
				i_4_ |= class176.method2874();
			int i_5_ = i_4_;
			if (aShortArray3304 != null)
				i_5_ |= 0x4000;
			if (null != aShortArray3314)
				i_5_ |= 0x8000;
			if (aByte3295 != 0)
				i_5_ |= 0x80000;
			int[] is = (null != class308 && null != class308.anIntArray3449 ? class308.anIntArray3449 : anIntArray3282);
			boolean bool = false;
			synchronized (aClass293_3276.aClass459_3258) {
				for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
					if (!aClass293_3276.aClass459_3258.method7479(is[i_6_], 0, 102380841))
						bool = true;
				}
			}
			if (bool)
				return null;
			Class175[] class175s = new Class175[is.length];
			synchronized (aClass293_3276.aClass459_3258) {
				for (int i_7_ = 0; i_7_ < is.length; i_7_++)
					class175s[i_7_] = Class175.method2814(aClass293_3276.aClass459_3258, is[i_7_], 0);
			}
			for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
				if (null != class175s[i_8_] && class175s[i_8_].anInt1905 < 13)
					class175s[i_8_].method2829(2);
			}
			Class175 class175;
			if (class175s.length == 1)
				class175 = class175s[0];
			else
				class175 = new Class175(class175s, class175s.length);
			class176 = class180.method3376(class175, i_5_, aClass293_3276.anInt3263 * -1926949905, 64, 768);
			if (aShortArray3304 != null) {
				short[] is_9_;
				if (null != class308 && null != class308.aShortArray3454)
					is_9_ = class308.aShortArray3454;
				else
					is_9_ = aShortArray3286;
				for (int i_10_ = 0; i_10_ < aShortArray3304.length; i_10_++) {
					if (null != aByteArray3303 && i_10_ < aByteArray3303.length)
						class176.method2907(aShortArray3304[i_10_], (aShortArray3275[aByteArray3303[i_10_] & 0xff]));
					else
						class176.method2907(aShortArray3304[i_10_], is_9_[i_10_]);
				}
			}
			if (aShortArray3314 != null) {
				short[] is_11_;
				if (class308 != null && class308.aShortArray3453 != null)
					is_11_ = class308.aShortArray3453;
				else
					is_11_ = aShortArray3289;
				for (int i_12_ = 0; i_12_ < aShortArray3314.length; i_12_++)
					class176.method2909(aShortArray3314[i_12_], is_11_[i_12_]);
			}
			if (aByte3295 != 0)
				class176.method2986(aByte3317, aByte3293, aByte3292, aByte3295 & 0xff);
			class176.method2941(i_4_);
			synchronized (aClass293_3276.aClass205_3262) {
				aClass293_3276.aClass205_3262.method3790(class176, l);
			}
		}
		if (null != class695) {
			class176 = class176.method2862((byte) 1, i_4_, true);
			class695.method14175(class176, 0, (byte) 0);
		}
		class176.method2941(i);
		return class176;
	}

	public void method86(int i) {
		if (null == anIntArray3281)
			anIntArray3281 = new int[0];
		if (aByte3339 == -1) {
			if (aClass293_3276 == null || aClass293_3276.aClass678_3261 == Class678.aClass678_8613)
				aByte3339 = (byte) 1;
			else
				aByte3339 = (byte) 0;
		}
	}

	public final Class176 method5302(Class180 class180, int i, Class24_Sub2 class24_sub2, Interface20 interface20, Interface18 interface18, Class695 class695, Class695 class695_13_, Class695[] class695s, int[] is, int i_14_, Class308 class308, int i_15_) {
		return method5303(class180, i, class24_sub2, interface20, interface18, class695, class695_13_, class695s, is, i_14_, class308, anInt3284 * -767096327, true, -1566390234);
	}

	public final Class176 method5303(Class180 class180, int i, Class24_Sub2 class24_sub2, Interface20 interface20, Interface18 interface18, Class695 class695, Class695 class695_16_, Class695[] class695s, int[] is, int i_17_, Class308 class308, int i_18_, boolean bool, int i_19_) {
		if (null != anIntArray3312) {
			Class295 class295_20_ = method5314(interface20, interface18, 364346168);
			if (null == class295_20_)
				return null;
			return class295_20_.method5303(class180, i, class24_sub2, interface20, interface18, class695, class695_16_, class695s, is, i_17_, class308, i_18_, bool, -1815916414);
		}
		int i_21_ = i;
		if (128 != -766143797 * anInt3302)
			i_21_ |= 0x2;
		if (128 != 2105941715 * anInt3301)
			i_21_ |= 0x5;
		boolean bool_22_ = false;
		int i_23_ = class695s != null ? class695s.length : 0;
		for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
			if (null != class695s[i_24_]) {
				i_21_ |= class695s[i_24_].method14174(-822649352);
				bool_22_ = true;
			}
		}
		if (null != class695) {
			i_21_ |= class695.method14174(-822649352);
			bool_22_ = true;
		}
		if (null != class695_16_) {
			i_21_ |= class695_16_.method14174(-822649352);
			bool_22_ = true;
		}
		long l = (long) (-596975525 * anInt3345 | -397006101 * class180.anInt2064 << 16);
		if (null != class308)
			l |= -6646494755336293335L * class308.aLong3450 << 24;
		Class176 class176;
		synchronized (aClass293_3276.aClass205_3259) {
			class176 = (Class176) aClass293_3276.aClass205_3259.method3787(l);
		}
		Class587 class587 = null;
		if (!bool && -1 != i_18_)
			class587 = (Class587) class24_sub2.method81(i_18_, 1190520317);
		else if (-767096327 * anInt3284 != -1)
			class587 = (Class587) class24_sub2.method81(-767096327 * anInt3284, -145640955);
		if (null == class176 || (class176.method2874() & i_21_) != i_21_) {
			if (null != class176)
				i_21_ |= class176.method2874();
			int i_25_ = i_21_;
			if (aShortArray3304 != null)
				i_25_ |= 0x4000;
			if (null != aShortArray3314)
				i_25_ |= 0x8000;
			if (0 != aByte3295)
				i_25_ |= 0x80000;
			int[] is_26_ = (class308 != null && null != class308.anIntArray3449 ? class308.anIntArray3449 : anIntArray3281);
			boolean bool_27_ = false;
			synchronized (aClass293_3276.aClass459_3258) {
				for (int i_28_ = 0; i_28_ < is_26_.length; i_28_++) {
					if (-1 != is_26_[i_28_] && !aClass293_3276.aClass459_3258.method7479(is_26_[i_28_], 0, 102380841))
						bool_27_ = true;
				}
			}
			if (bool_27_)
				return null;
			Class175[] class175s = new Class175[is_26_.length];
			for (int i_29_ = 0; i_29_ < is_26_.length; i_29_++) {
				if (-1 != is_26_[i_29_]) {
					synchronized (aClass293_3276.aClass459_3258) {
						class175s[i_29_] = Class175.method2814((aClass293_3276.aClass459_3258), is_26_[i_29_], 0);
					}
					if (class175s[i_29_] != null) {
						if (class175s[i_29_].anInt1905 < 13)
							class175s[i_29_].method2829(2);
						if (null != anIntArrayArray3283 && anIntArrayArray3283[i_29_] != null)
							class175s[i_29_].method2812(anIntArrayArray3283[i_29_][0], anIntArrayArray3283[i_29_][1], anIntArrayArray3283[i_29_][2]);
					}
				}
			}
			if (null != class308) {
				for (int i_30_ = 0; i_30_ < class175s.length; i_30_++) {
					if (null != class175s[i_30_]) {
						if (class308.aFloatArray3448 != null && class308.aFloatArray3448[i_30_] != 0.0F)
							class175s[i_30_].method2813(class308.aFloatArray3448[i_30_]);
						if (class308.anIntArrayArray3451 != null)
							class175s[i_30_].method2840(class308.anIntArrayArray3451[i_30_][0], class308.anIntArrayArray3451[i_30_][1], class308.anIntArrayArray3451[i_30_][2]);
						if (null != class308.anIntArrayArray3452)
							class175s[i_30_].method2812(class308.anIntArrayArray3452[i_30_][0], class308.anIntArrayArray3452[i_30_][1], class308.anIntArrayArray3452[i_30_][2]);
					}
				}
			}
			if (null != class587 && class587.anIntArrayArray7744 != null) {
				for (int i_31_ = 0; i_31_ < class587.anIntArrayArray7744.length; i_31_++) {
					if (i_31_ < class175s.length && class175s[i_31_] != null) {
						int i_32_ = 0;
						int i_33_ = 0;
						int i_34_ = 0;
						int i_35_ = 0;
						int i_36_ = 0;
						int i_37_ = 0;
						if (class587.anIntArrayArray7744[i_31_] != null) {
							i_32_ = class587.anIntArrayArray7744[i_31_][0];
							i_33_ = class587.anIntArrayArray7744[i_31_][1];
							i_34_ = class587.anIntArrayArray7744[i_31_][2];
							i_35_ = class587.anIntArrayArray7744[i_31_][3] << 3;
							i_36_ = class587.anIntArrayArray7744[i_31_][4] << 3;
							i_37_ = class587.anIntArrayArray7744[i_31_][5] << 3;
						}
						if (i_35_ != 0 || i_36_ != 0 || i_37_ != 0)
							class175s[i_31_].method2840(i_35_, i_36_, i_37_);
						if (i_32_ != 0 || i_33_ != 0 || i_34_ != 0)
							class175s[i_31_].method2812(i_32_, i_33_, i_34_);
					}
				}
			}
			Class175 class175;
			if (class175s.length == 1)
				class175 = class175s[0];
			else
				class175 = new Class175(class175s, class175s.length);
			class176 = class180.method3376(class175, i_25_, -1926949905 * aClass293_3276.anInt3263, 64 + 1768892857 * anInt3306, 850 + 700105415 * anInt3307);
			if (aShortArray3304 != null) {
				short[] is_38_;
				if (class308 != null && class308.aShortArray3454 != null)
					is_38_ = class308.aShortArray3454;
				else
					is_38_ = aShortArray3286;
				for (int i_39_ = 0; i_39_ < aShortArray3304.length; i_39_++) {
					if (null != aByteArray3303 && i_39_ < aByteArray3303.length)
						class176.method2907(aShortArray3304[i_39_], (aShortArray3275[aByteArray3303[i_39_] & 0xff]));
					else
						class176.method2907(aShortArray3304[i_39_], is_38_[i_39_]);
				}
			}
			if (null != aShortArray3314) {
				short[] is_40_;
				if (class308 != null && class308.aShortArray3453 != null)
					is_40_ = class308.aShortArray3453;
				else
					is_40_ = aShortArray3289;
				for (int i_41_ = 0; i_41_ < aShortArray3314.length; i_41_++)
					class176.method2909(aShortArray3314[i_41_], is_40_[i_41_]);
			}
			if (aByte3295 != 0)
				class176.method2986(aByte3317, aByte3293, aByte3292, aByte3295 & 0xff);
			class176.method2901();
			class176.method2941(i_21_);
			synchronized (aClass293_3276.aClass205_3259) {
				aClass293_3276.aClass205_3259.method3790(class176, l);
			}
		}
		Class176 class176_42_ = class176.method2862((byte) 4, i_21_, true);
		boolean bool_43_ = false;
		if (is != null) {
			for (int i_44_ = 0; i_44_ < 12; i_44_++) {
				if (is[i_44_] != -1)
					bool_43_ = true;
			}
		}
		if (!bool_22_ && !bool_43_)
			return class176_42_;
		Class432[] class432s = null;
		if (class587 != null)
			class432s = class587.method9788((byte) -56);
		if (bool_43_ && null != class432s) {
			for (int i_45_ = 0; i_45_ < 12; i_45_++) {
				if (class432s[i_45_] != null)
					class176_42_.method2888(class432s[i_45_], 1 << i_45_, true);
			}
		}
		int i_46_ = 0;
		int i_47_ = 1;
		while (i_46_ < i_23_) {
			if (class695s[i_46_] != null)
				class695s[i_46_].method14176(class176_42_, 0, i_47_, -1161167348);
			i_46_++;
			i_47_ <<= 1;
		}
		if (bool_43_) {
			for (i_46_ = 0; i_46_ < 12; i_46_++) {
				if (-1 != is[i_46_]) {
					i_47_ = is[i_46_] - i_17_;
					i_47_ &= 0x3fff;
					Class432 class432 = new Class432();
					class432.method6890(0.0F, 1.0F, 0.0F, Class428.method6863(i_47_));
					class176_42_.method2888(class432, 1 << i_46_, false);
				}
			}
		}
		if (bool_43_ && class432s != null) {
			for (i_46_ = 0; i_46_ < 12; i_46_++) {
				if (class432s[i_46_] != null)
					class176_42_.method2888(class432s[i_46_], 1 << i_46_, false);
			}
		}
		if (class695 != null && null != class695_16_)
			Class476.method7773(class176_42_, class695, class695_16_, -1237622773);
		else if (null != class695)
			class695.method14175(class176_42_, 0, (byte) 0);
		else if (null != class695_16_)
			class695_16_.method14175(class176_42_, 0, (byte) 0);
		if (anInt3301 * 2105941715 != 128 || anInt3302 * -766143797 != 128)
			class176_42_.method2872(anInt3301 * 2105941715, anInt3302 * -766143797, anInt3301 * 2105941715);
		class176_42_.method2941(i);
		return class176_42_;
	}

	public final boolean method5304() {
		if (null == anIntArray3281)
			return true;
		boolean bool = true;
		int[] is = anIntArray3281;
		for (int i = 0; i < is.length; i++) {
			int i_48_ = is[i];
			if (!aClass293_3276.aClass459_3258.method7479(i_48_, 0, 102380841))
				bool = false;
		}
		return bool;
	}

	public boolean method5305(Interface20 interface20, Interface18 interface18) {
		if (anIntArray3312 == null)
			return true;
		int i = -1;
		if (anInt3328 * -2136287195 != -1) {
			Class333 class333 = interface20.method123(anInt3328 * -2136287195, 1199592023);
			if (null != class333)
				i = interface18.method100(class333, (short) -25178);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -835177915);
			if (null != class160)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray3312.length - 1) {
			int i_49_ = anIntArray3312[anIntArray3312.length - 1];
			if (i_49_ != -1)
				return true;
			return false;
		}
		if (anIntArray3312[i] == -1)
			return false;
		return true;
	}

	Class295(int i, Class293 class293, Interface13 interface13) {
		anInt3284 = 277256119;
		aByte3295 = (byte) 0;
		anInt3298 = -222427953;
		aBool3313 = true;
		anInt3285 = -679159989;
		anInt3301 = 1140108672;
		anInt3302 = -1042189952;
		aBool3278 = false;
		aBool3321 = false;
		aBool3305 = false;
		anInt3306 = 0;
		anInt3307 = 0;
		anIntArray3324 = null;
		aShortArray3309 = null;
		anInt3310 = 2011178551;
		anInt3311 = -1583359264;
		anInt3328 = -1759347629;
		anInt3291 = -1435284425;
		aBool3299 = true;
		aBool3316 = true;
		aBool3274 = true;
		aShort3318 = (short) 0;
		aShort3319 = (short) 0;
		aByte3320 = (byte) -96;
		aByte3288 = (byte) -16;
		aShort3322 = (short) -1;
		aByte3323 = (byte) 0;
		aByte3294 = (byte) 0;
		anInt3327 = -812147355;
		anInt3331 = 2081879461;
		anInt3329 = -707206463;
		anInt3330 = -2065748099;
		anInt3273 = 0;
		anInt3332 = 0;
		anInt3333 = 1385302043;
		anInt3335 = -229484319;
		aClass681_3277 = Class681.aClass681_8641;
		anInt3337 = -1357035261;
		aByte3339 = (byte) -1;
		anInt3340 = 638971559;
		anInt3287 = -1167473408;
		anInt3343 = 1147321088;
		anInt3344 = 0;
		aBool3315 = true;
		anInt3346 = 0;
		aBool3347 = false;
		anInt3345 = i * 2039959507;
		aClass293_3276 = class293;
		anInterface13_3296 = interface13;
		aStringArray3308 = (String[]) aClass293_3276.aStringArray3264.clone();
	}

	public String method5306(int i, String string, int i_50_) {
		if (null == aClass14_3334)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_3334.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public final Class176 method5307(Class180 class180, int i, Class24_Sub2 class24_sub2, Interface20 interface20, Interface18 interface18, Class695 class695, Class695 class695_51_, Class695[] class695s, int[] is, int i_52_, Class308 class308) {
		return method5303(class180, i, class24_sub2, interface20, interface18, class695, class695_51_, class695s, is, i_52_, class308, anInt3284 * -767096327, true, -1486508362);
	}

	public boolean method5308(Interface20 interface20, Interface18 interface18, int i) {
		if (anIntArray3312 == null)
			return true;
		int i_53_ = -1;
		if (anInt3328 * -2136287195 != -1) {
			Class333 class333 = interface20.method123(anInt3328 * -2136287195, 515025307);
			if (null != class333)
				i_53_ = interface18.method100(class333, (short) -17942);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -2105933117);
			if (null != class160)
				i_53_ = interface18.method101(class160, 1096407173);
		}
		if (i_53_ < 0 || i_53_ >= anIntArray3312.length - 1) {
			int i_54_ = anIntArray3312[anIntArray3312.length - 1];
			if (i_54_ != -1)
				return true;
			return false;
		}
		if (anIntArray3312[i_53_] == -1)
			return false;
		return true;
	}

	public boolean method5309(int i) {
		if (null == anIntArray3312)
			return (anInt3327 * -324553837 != -1 || anInt3329 * -422751553 != -1 || anInt3330 * 2047475243 != -1);
		for (int i_55_ = 0; i_55_ < anIntArray3312.length; i_55_++) {
			if (anIntArray3312[i_55_] != -1) {
				Class295 class295_56_ = ((Class295) anInterface13_3296.method81(anIntArray3312[i_55_], -1950911929));
				if (-1 != -324553837 * class295_56_.anInt3327 || class295_56_.anInt3329 * -422751553 != -1 || class295_56_.anInt3330 * 2047475243 != -1)
					return true;
			}
		}
		return false;
	}

	public String method5310(int i, String string) {
		if (null == aClass14_3334)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_3334.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public int method5311(int i, int i_57_) {
		if (aClass14_3334 == null)
			return i_57_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_3334.method709((long) i);
		if (class527_sub7 == null)
			return i_57_;
		return class527_sub7.anInt10398 * -78845949;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method5318(class527_sub38, i, -1939791343);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method5318(class527_sub38, i, -1699815273);
		}
	}

	public void method85() {
		if (null == anIntArray3281)
			anIntArray3281 = new int[0];
		if (aByte3339 == -1) {
			if (aClass293_3276 == null || aClass293_3276.aClass678_3261 == Class678.aClass678_8613)
				aByte3339 = (byte) 1;
			else
				aByte3339 = (byte) 0;
		}
	}

	public void method84() {
		if (null == anIntArray3281)
			anIntArray3281 = new int[0];
		if (aByte3339 == -1) {
			if (aClass293_3276 == null || aClass293_3276.aClass678_3261 == Class678.aClass678_8613)
				aByte3339 = (byte) 1;
			else
				aByte3339 = (byte) 0;
		}
	}

	public final boolean method5312(byte i) {
		if (null == anIntArray3281)
			return true;
		boolean bool = true;
		int[] is = anIntArray3281;
		for (int i_58_ = 0; i_58_ < is.length; i_58_++) {
			int i_59_ = is[i_58_];
			if (!aClass293_3276.aClass459_3258.method7479(i_59_, 0, 102380841))
				bool = false;
		}
		return bool;
	}

	void method5313(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			int i_60_ = class527_sub38.readUnsignedByte();
			anIntArray3281 = new int[i_60_];
			for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
				anIntArray3281[i_61_] = class527_sub38.method16466(-1642382710);
		} else if (i == 2)
			aString3279 = class527_sub38.readString(816327979);
		else if (12 == i)
			anInt3342 = class527_sub38.readUnsignedByte() * -241082749;
		else if (i >= 30 && i < 35)
			aStringArray3308[i - 30] = class527_sub38.readString(2103186430);
		else if (i == 40) {
			int i_62_ = class527_sub38.readUnsignedByte();
			aShortArray3304 = new short[i_62_];
			aShortArray3286 = new short[i_62_];
			for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
				aShortArray3304[i_63_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3286[i_63_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 41) {
			int i_64_ = class527_sub38.readUnsignedByte();
			aShortArray3314 = new short[i_64_];
			aShortArray3289 = new short[i_64_];
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
				aShortArray3314[i_65_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3289[i_65_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_66_ = class527_sub38.readUnsignedByte();
			aByteArray3303 = new byte[i_66_];
			for (int i_67_ = 0; i_67_ < i_66_; i_67_++)
				aByteArray3303[i_67_] = class527_sub38.readByte();
		} else if (i == 44) {
			int i_68_ = class527_sub38.readUnsignedShort();
			int i_69_ = 0;
			for (int i_70_ = i_68_; i_70_ > 0; i_70_ >>= 1)
				i_69_++;
			aByteArray3300 = new byte[i_69_];
			byte i_71_ = 0;
			for (int i_72_ = 0; i_72_ < i_69_; i_72_++) {
				if ((i_68_ & 1 << i_72_) > 0) {
					aByteArray3300[i_72_] = i_71_;
					i_71_++;
				} else
					aByteArray3300[i_72_] = (byte) -1;
			}
		} else if (45 == i) {
			int i_73_ = class527_sub38.readUnsignedShort();
			int i_74_ = 0;
			for (int i_75_ = i_73_; i_75_ > 0; i_75_ >>= 1)
				i_74_++;
			aByteArray3280 = new byte[i_74_];
			byte i_76_ = 0;
			for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
				if ((i_73_ & 1 << i_77_) > 0) {
					aByteArray3280[i_77_] = i_76_;
					i_76_++;
				} else
					aByteArray3280[i_77_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_78_ = class527_sub38.readUnsignedByte();
			anIntArray3282 = new int[i_78_];
			for (int i_79_ = 0; i_79_ < i_78_; i_79_++)
				anIntArray3282[i_79_] = class527_sub38.method16466(-1746262463);
		} else if (i == 93)
			aBool3313 = false;
		else if (i == 95)
			anInt3285 = class527_sub38.readUnsignedShort() * 679159989;
		else if (97 == i)
			anInt3301 = class527_sub38.readUnsignedShort() * -91756197;
		else if (i == 98)
			anInt3302 = class527_sub38.readUnsignedShort() * -1249656093;
		else if (i == 99)
			aBool3278 = true;
		else if (i == 100)
			anInt3306 = class527_sub38.readByte() * -1191310199;
		else if (i == 101)
			anInt3307 = class527_sub38.readByte() * 825023187;
		else if (102 == i) {
			int i_80_ = class527_sub38.readUnsignedByte();
			int i_81_ = 0;
			for (int i_82_ = i_80_; i_82_ != 0; i_82_ >>= 1)
				i_81_++;
			anIntArray3324 = new int[i_81_];
			aShortArray3309 = new short[i_81_];
			for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
				if ((i_80_ & 1 << i_83_) == 0) {
					anIntArray3324[i_83_] = -1;
					aShortArray3309[i_83_] = (short) -1;
				} else {
					anIntArray3324[i_83_] = class527_sub38.method16466(-2139254725);
					aShortArray3309[i_83_] = (short) class527_sub38.method16606(99823770);
				}
			}
		} else if (i == 103)
			anInt3311 = class527_sub38.readUnsignedShort() * 755826391;
		else if (106 == i || i == 118) {
			anInt3328 = class527_sub38.readUnsignedShort() * 1759347629;
			if (65535 == -2136287195 * anInt3328)
				anInt3328 = -1759347629;
			anInt3291 = class527_sub38.readUnsignedShort() * 1435284425;
			if (65535 == -921840007 * anInt3291)
				anInt3291 = -1435284425;
			int i_84_ = -1;
			if (i == 118) {
				i_84_ = class527_sub38.readUnsignedShort();
				if (65535 == i_84_)
					i_84_ = -1;
			}
			int i_85_ = class527_sub38.readUnsignedByte();
			anIntArray3312 = new int[2 + i_85_];
			for (int i_86_ = 0; i_86_ <= i_85_; i_86_++) {
				anIntArray3312[i_86_] = class527_sub38.readUnsignedShort();
				if (anIntArray3312[i_86_] == 65535)
					anIntArray3312[i_86_] = -1;
			}
			anIntArray3312[1 + i_85_] = i_84_;
		} else if (107 == i)
			aBool3299 = false;
		else if (i == 109)
			aBool3316 = false;
		else if (i == 111)
			aBool3274 = false;
		else if (113 == i) {
			aShort3318 = (short) class527_sub38.readUnsignedShort();
			aShort3319 = (short) class527_sub38.readUnsignedShort();
		} else if (i == 114) {
			aByte3320 = class527_sub38.readByte();
			aByte3288 = class527_sub38.readByte();
		} else if (i == 119)
			aByte3294 = class527_sub38.readByte();
		else if (121 == i) {
			anIntArrayArray3283 = new int[anIntArray3281.length][];
			int i_87_ = class527_sub38.readUnsignedByte();
			for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
				int i_89_ = class527_sub38.readUnsignedByte();
				int[] is = anIntArrayArray3283[i_89_] = new int[3];
				is[0] = class527_sub38.readByte();
				is[1] = class527_sub38.readByte();
				is[2] = class527_sub38.readByte();
			}
		} else if (i == 123)
			anInt3335 = class527_sub38.readUnsignedShort() * 229484319;
		else if (i == 125)
			aClass681_3277 = ((Class681) Class26.method858(Class255.method4707(-1971181473), class527_sub38.readByte(), -923871816));
		else if (i == 127)
			anInt3284 = class527_sub38.readUnsignedShort() * -277256119;
		else if (128 == i)
			Class26.method858(Class679.method13904(673878859), class527_sub38.readUnsignedByte(), 1694798240);
		else if (134 == i) {
			anInt3327 = class527_sub38.readUnsignedShort() * 812147355;
			if (-324553837 * anInt3327 == 65535)
				anInt3327 = -812147355;
			anInt3331 = class527_sub38.readUnsignedShort() * -2081879461;
			if (65535 == anInt3331 * 1772688851)
				anInt3331 = 2081879461;
			anInt3329 = class527_sub38.readUnsignedShort() * 707206463;
			if (-422751553 * anInt3329 == 65535)
				anInt3329 = -707206463;
			anInt3330 = class527_sub38.readUnsignedShort() * 2065748099;
			if (65535 == anInt3330 * 2047475243)
				anInt3330 = -2065748099;
			anInt3273 = class527_sub38.readUnsignedByte() * -962243229;
		} else if (i == 135 || i == 136) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (i == 137)
			anInt3298 = class527_sub38.readUnsignedShort() * 222427953;
		else if (i == 138)
			anInt3310 = class527_sub38.method16466(-2126784709) * -2011178551;
		else if (i == 140)
			anInt3333 = class527_sub38.readUnsignedByte() * -129311515;
		else if (i == 141)
			aBool3305 = true;
		else if (i == 142)
			anInt3337 = class527_sub38.readUnsignedShort() * 1357035261;
		else if (143 == i)
			aBool3321 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3308[i - 150] = class527_sub38.readString(1674471514);
			if (!aClass293_3276.aBool3260)
				aStringArray3308[i - 150] = null;
		} else if (i == 155) {
			aByte3317 = class527_sub38.readByte();
			aByte3293 = class527_sub38.readByte();
			aByte3292 = class527_sub38.readByte();
			aByte3295 = class527_sub38.readByte();
		} else if (i == 158)
			aByte3339 = (byte) 1;
		else if (i == 159)
			aByte3339 = (byte) 0;
		else if (i == 160) {
			int i_90_ = class527_sub38.readUnsignedByte();
			anIntArray3338 = new int[i_90_];
			for (int i_91_ = 0; i_91_ < i_90_; i_91_++)
				anIntArray3338[i_91_] = class527_sub38.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3340 = class527_sub38.readUnsignedByte() * -638971559;
			else if (i == 164) {
				anInt3287 = class527_sub38.readUnsignedShort() * -457545275;
				anInt3343 = class527_sub38.readUnsignedShort() * 1061446331;
			} else if (165 == i)
				anInt3344 = class527_sub38.readUnsignedByte() * 1571185663;
			else if (168 == i)
				anInt3332 = class527_sub38.readUnsignedByte() * 281319945;
			else if (169 == i)
				aBool3315 = false;
			else if (i >= 170 && i < 176) {
				if (null == anIntArray3297) {
					anIntArray3297 = new int[6];
					Arrays.fill(anIntArray3297, -1);
				}
				int i_92_ = class527_sub38.readUnsignedShort();
				if (i_92_ == 65535)
					i_92_ = -1;
				anIntArray3297[i - 170] = i_92_;
			} else if (i != 178) {
				if (179 == i) {
					aClass439_3341 = new Class439();
					aClass439_3341.aFloat4894 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4891 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4892 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4893 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4890 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4895 = (float) class527_sub38.readSmartVariant(983912765);
				} else if (i == 180)
					anInt3346 = (class527_sub38.readUnsignedByte() & 0xff) * 1535834927;
				else if (i == 181) {
					aShort3322 = (short) class527_sub38.readUnsignedShort();
					aByte3323 = (byte) class527_sub38.readUnsignedByte();
				} else if (i == 182)
					aBool3347 = true;
				else if (249 == i) {
					int i_93_ = class527_sub38.readUnsignedByte();
					if (null == aClass14_3334) {
						int i_94_ = Class186.method3652(i_93_, 269190653);
						aClass14_3334 = new Class14(i_94_);
					}
					for (int i_95_ = 0; i_95_ < i_93_; i_95_++) {
						boolean bool = class527_sub38.readUnsignedByte() == 1;
						int i_96_ = class527_sub38.read24BitUnsignedInteger(321374987);
						Class527 class527;
						if (bool)
							class527 = (new Class527_Sub26(class527_sub38.readString(1456702580)));
						else
							class527 = (new Node_Sub6(class527_sub38.readInt()));
						aClass14_3334.method714(class527, (long) i_96_);
					}
				}
			}
		}
	}

	public final Class295 method5314(Interface20 interface20, Interface18 interface18, int i) {
		int i_97_ = -1;
		if (-2136287195 * anInt3328 != -1) {
			Class333 class333 = interface20.method123(-2136287195 * anInt3328, 1667702296);
			if (class333 != null)
				i_97_ = interface18.method100(class333, (short) -11921);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -678674126);
			if (class160 != null)
				i_97_ = interface18.method101(class160, 1096407173);
		}
		if (i_97_ < 0 || i_97_ >= anIntArray3312.length - 1) {
			int i_98_ = anIntArray3312[anIntArray3312.length - 1];
			if (-1 != i_98_)
				return ((Class295) anInterface13_3296.method81(i_98_, -533596724));
			return null;
		}
		if (-1 == anIntArray3312[i_97_])
			return null;
		return ((Class295) anInterface13_3296.method81(anIntArray3312[i_97_], 340600648));
	}

	public boolean method5315() {
		if (null == anIntArray3312)
			return (anInt3327 * -324553837 != -1 || anInt3329 * -422751553 != -1 || anInt3330 * 2047475243 != -1);
		for (int i = 0; i < anIntArray3312.length; i++) {
			if (anIntArray3312[i] != -1) {
				Class295 class295_99_ = (Class295) anInterface13_3296.method81(anIntArray3312[i], -142293197);
				if (-1 != -324553837 * class295_99_.anInt3327 || class295_99_.anInt3329 * -422751553 != -1 || class295_99_.anInt3330 * 2047475243 != -1)
					return true;
			}
		}
		return false;
	}

	public final Class176 method5316(Class180 class180, int i, Class24_Sub2 class24_sub2, Interface20 interface20, Interface18 interface18, Class695 class695, Class695 class695_100_, Class695[] class695s, int[] is, int i_101_, Class308 class308, int i_102_, boolean bool) {
		if (null != anIntArray3312) {
			Class295 class295_103_ = method5314(interface20, interface18, 1195459708);
			if (null == class295_103_)
				return null;
			return class295_103_.method5303(class180, i, class24_sub2, interface20, interface18, class695, class695_100_, class695s, is, i_101_, class308, i_102_, bool, -1421173314);
		}
		int i_104_ = i;
		if (128 != -766143797 * anInt3302)
			i_104_ |= 0x2;
		if (128 != 2105941715 * anInt3301)
			i_104_ |= 0x5;
		boolean bool_105_ = false;
		int i_106_ = class695s != null ? class695s.length : 0;
		for (int i_107_ = 0; i_107_ < i_106_; i_107_++) {
			if (null != class695s[i_107_]) {
				i_104_ |= class695s[i_107_].method14174(-822649352);
				bool_105_ = true;
			}
		}
		if (null != class695) {
			i_104_ |= class695.method14174(-822649352);
			bool_105_ = true;
		}
		if (null != class695_100_) {
			i_104_ |= class695_100_.method14174(-822649352);
			bool_105_ = true;
		}
		long l = (long) (-596975525 * anInt3345 | -397006101 * class180.anInt2064 << 16);
		if (null != class308)
			l |= -6646494755336293335L * class308.aLong3450 << 24;
		Class176 class176;
		synchronized (aClass293_3276.aClass205_3259) {
			class176 = (Class176) aClass293_3276.aClass205_3259.method3787(l);
		}
		Class587 class587 = null;
		if (!bool && -1 != i_102_)
			class587 = (Class587) class24_sub2.method81(i_102_, -1869895682);
		else if (-767096327 * anInt3284 != -1)
			class587 = (Class587) class24_sub2.method81(-767096327 * anInt3284, 817049807);
		if (null == class176 || (class176.method2874() & i_104_) != i_104_) {
			if (null != class176)
				i_104_ |= class176.method2874();
			int i_108_ = i_104_;
			if (aShortArray3304 != null)
				i_108_ |= 0x4000;
			if (null != aShortArray3314)
				i_108_ |= 0x8000;
			if (0 != aByte3295)
				i_108_ |= 0x80000;
			int[] is_109_ = (class308 != null && null != class308.anIntArray3449 ? class308.anIntArray3449 : anIntArray3281);
			boolean bool_110_ = false;
			synchronized (aClass293_3276.aClass459_3258) {
				for (int i_111_ = 0; i_111_ < is_109_.length; i_111_++) {
					if (-1 != is_109_[i_111_] && !aClass293_3276.aClass459_3258.method7479(is_109_[i_111_], 0, 102380841))
						bool_110_ = true;
				}
			}
			if (bool_110_)
				return null;
			Class175[] class175s = new Class175[is_109_.length];
			for (int i_112_ = 0; i_112_ < is_109_.length; i_112_++) {
				if (-1 != is_109_[i_112_]) {
					synchronized (aClass293_3276.aClass459_3258) {
						class175s[i_112_] = Class175.method2814((aClass293_3276.aClass459_3258), is_109_[i_112_], 0);
					}
					if (class175s[i_112_] != null) {
						if (class175s[i_112_].anInt1905 < 13)
							class175s[i_112_].method2829(2);
						if (null != anIntArrayArray3283 && anIntArrayArray3283[i_112_] != null)
							class175s[i_112_].method2812(anIntArrayArray3283[i_112_][0], anIntArrayArray3283[i_112_][1], anIntArrayArray3283[i_112_][2]);
					}
				}
			}
			if (null != class308) {
				for (int i_113_ = 0; i_113_ < class175s.length; i_113_++) {
					if (null != class175s[i_113_]) {
						if (class308.aFloatArray3448 != null && class308.aFloatArray3448[i_113_] != 0.0F)
							class175s[i_113_].method2813(class308.aFloatArray3448[i_113_]);
						if (class308.anIntArrayArray3451 != null)
							class175s[i_113_].method2840(class308.anIntArrayArray3451[i_113_][0], class308.anIntArrayArray3451[i_113_][1], class308.anIntArrayArray3451[i_113_][2]);
						if (null != class308.anIntArrayArray3452)
							class175s[i_113_].method2812(class308.anIntArrayArray3452[i_113_][0], class308.anIntArrayArray3452[i_113_][1], class308.anIntArrayArray3452[i_113_][2]);
					}
				}
			}
			if (null != class587 && class587.anIntArrayArray7744 != null) {
				for (int i_114_ = 0; i_114_ < class587.anIntArrayArray7744.length; i_114_++) {
					if (i_114_ < class175s.length && class175s[i_114_] != null) {
						int i_115_ = 0;
						int i_116_ = 0;
						int i_117_ = 0;
						int i_118_ = 0;
						int i_119_ = 0;
						int i_120_ = 0;
						if (class587.anIntArrayArray7744[i_114_] != null) {
							i_115_ = class587.anIntArrayArray7744[i_114_][0];
							i_116_ = class587.anIntArrayArray7744[i_114_][1];
							i_117_ = class587.anIntArrayArray7744[i_114_][2];
							i_118_ = class587.anIntArrayArray7744[i_114_][3] << 3;
							i_119_ = class587.anIntArrayArray7744[i_114_][4] << 3;
							i_120_ = class587.anIntArrayArray7744[i_114_][5] << 3;
						}
						if (i_118_ != 0 || i_119_ != 0 || i_120_ != 0)
							class175s[i_114_].method2840(i_118_, i_119_, i_120_);
						if (i_115_ != 0 || i_116_ != 0 || i_117_ != 0)
							class175s[i_114_].method2812(i_115_, i_116_, i_117_);
					}
				}
			}
			Class175 class175;
			if (class175s.length == 1)
				class175 = class175s[0];
			else
				class175 = new Class175(class175s, class175s.length);
			class176 = class180.method3376(class175, i_108_, -1926949905 * aClass293_3276.anInt3263, 64 + 1768892857 * anInt3306, 850 + 700105415 * anInt3307);
			if (aShortArray3304 != null) {
				short[] is_121_;
				if (class308 != null && class308.aShortArray3454 != null)
					is_121_ = class308.aShortArray3454;
				else
					is_121_ = aShortArray3286;
				for (int i_122_ = 0; i_122_ < aShortArray3304.length; i_122_++) {
					if (null != aByteArray3303 && i_122_ < aByteArray3303.length)
						class176.method2907(aShortArray3304[i_122_], (aShortArray3275[aByteArray3303[i_122_] & 0xff]));
					else
						class176.method2907(aShortArray3304[i_122_], is_121_[i_122_]);
				}
			}
			if (null != aShortArray3314) {
				short[] is_123_;
				if (class308 != null && class308.aShortArray3453 != null)
					is_123_ = class308.aShortArray3453;
				else
					is_123_ = aShortArray3289;
				for (int i_124_ = 0; i_124_ < aShortArray3314.length; i_124_++)
					class176.method2909(aShortArray3314[i_124_], is_123_[i_124_]);
			}
			if (aByte3295 != 0)
				class176.method2986(aByte3317, aByte3293, aByte3292, aByte3295 & 0xff);
			class176.method2901();
			class176.method2941(i_104_);
			synchronized (aClass293_3276.aClass205_3259) {
				aClass293_3276.aClass205_3259.method3790(class176, l);
			}
		}
		Class176 class176_125_ = class176.method2862((byte) 4, i_104_, true);
		boolean bool_126_ = false;
		if (is != null) {
			for (int i_127_ = 0; i_127_ < 12; i_127_++) {
				if (is[i_127_] != -1)
					bool_126_ = true;
			}
		}
		if (!bool_105_ && !bool_126_)
			return class176_125_;
		Class432[] class432s = null;
		if (class587 != null)
			class432s = class587.method9788((byte) -4);
		if (bool_126_ && null != class432s) {
			for (int i_128_ = 0; i_128_ < 12; i_128_++) {
				if (class432s[i_128_] != null)
					class176_125_.method2888(class432s[i_128_], 1 << i_128_, true);
			}
		}
		int i_129_ = 0;
		int i_130_ = 1;
		while (i_129_ < i_106_) {
			if (class695s[i_129_] != null)
				class695s[i_129_].method14176(class176_125_, 0, i_130_, 1685772454);
			i_129_++;
			i_130_ <<= 1;
		}
		if (bool_126_) {
			for (i_129_ = 0; i_129_ < 12; i_129_++) {
				if (-1 != is[i_129_]) {
					i_130_ = is[i_129_] - i_101_;
					i_130_ &= 0x3fff;
					Class432 class432 = new Class432();
					class432.method6890(0.0F, 1.0F, 0.0F, Class428.method6863(i_130_));
					class176_125_.method2888(class432, 1 << i_129_, false);
				}
			}
		}
		if (bool_126_ && class432s != null) {
			for (i_129_ = 0; i_129_ < 12; i_129_++) {
				if (class432s[i_129_] != null)
					class176_125_.method2888(class432s[i_129_], 1 << i_129_, false);
			}
		}
		if (class695 != null && null != class695_100_)
			Class476.method7773(class176_125_, class695, class695_100_, -1237622773);
		else if (null != class695)
			class695.method14175(class176_125_, 0, (byte) 0);
		else if (null != class695_100_)
			class695_100_.method14175(class176_125_, 0, (byte) 0);
		if (anInt3301 * 2105941715 != 128 || anInt3302 * -766143797 != 128)
			class176_125_.method2872(anInt3301 * 2105941715, anInt3302 * -766143797, anInt3301 * 2105941715);
		class176_125_.method2941(i);
		return class176_125_;
	}

	public final Class176 method5317(Class180 class180, int i, Interface20 interface20, Interface18 interface18, Class695 class695, Class308 class308) {
		if (anIntArray3312 != null) {
			Class295 class295_131_ = method5314(interface20, interface18, 322155661);
			if (null == class295_131_)
				return null;
			return class295_131_.method5301(class180, i, interface20, interface18, class695, class308, -523667755);
		}
		if (anIntArray3282 == null && (class308 == null || null == class308.anIntArray3449))
			return null;
		int i_132_ = i;
		if (null != class695)
			i_132_ |= class695.method14174(-822649352);
		long l = (long) (anInt3345 * -596975525 | class180.anInt2064 * -397006101 << 16);
		if (null != class308)
			l |= -6646494755336293335L * class308.aLong3450 << 24;
		Class176 class176;
		synchronized (aClass293_3276.aClass205_3262) {
			class176 = (Class176) aClass293_3276.aClass205_3262.method3787(l);
		}
		if (class176 == null || (class176.method2874() & i_132_) != i_132_) {
			if (class176 != null)
				i_132_ |= class176.method2874();
			int i_133_ = i_132_;
			if (aShortArray3304 != null)
				i_133_ |= 0x4000;
			if (null != aShortArray3314)
				i_133_ |= 0x8000;
			if (aByte3295 != 0)
				i_133_ |= 0x80000;
			int[] is = (null != class308 && null != class308.anIntArray3449 ? class308.anIntArray3449 : anIntArray3282);
			boolean bool = false;
			synchronized (aClass293_3276.aClass459_3258) {
				for (int i_134_ = 0; i_134_ < is.length; i_134_++) {
					if (!aClass293_3276.aClass459_3258.method7479(is[i_134_], 0, 102380841))
						bool = true;
				}
			}
			if (bool)
				return null;
			Class175[] class175s = new Class175[is.length];
			synchronized (aClass293_3276.aClass459_3258) {
				for (int i_135_ = 0; i_135_ < is.length; i_135_++)
					class175s[i_135_] = Class175.method2814(aClass293_3276.aClass459_3258, is[i_135_], 0);
			}
			for (int i_136_ = 0; i_136_ < is.length; i_136_++) {
				if (null != class175s[i_136_] && class175s[i_136_].anInt1905 < 13)
					class175s[i_136_].method2829(2);
			}
			Class175 class175;
			if (class175s.length == 1)
				class175 = class175s[0];
			else
				class175 = new Class175(class175s, class175s.length);
			class176 = class180.method3376(class175, i_133_, aClass293_3276.anInt3263 * -1926949905, 64, 768);
			if (aShortArray3304 != null) {
				short[] is_137_;
				if (null != class308 && null != class308.aShortArray3454)
					is_137_ = class308.aShortArray3454;
				else
					is_137_ = aShortArray3286;
				for (int i_138_ = 0; i_138_ < aShortArray3304.length; i_138_++) {
					if (null != aByteArray3303 && i_138_ < aByteArray3303.length)
						class176.method2907(aShortArray3304[i_138_], (aShortArray3275[aByteArray3303[i_138_] & 0xff]));
					else
						class176.method2907(aShortArray3304[i_138_], is_137_[i_138_]);
				}
			}
			if (aShortArray3314 != null) {
				short[] is_139_;
				if (class308 != null && class308.aShortArray3453 != null)
					is_139_ = class308.aShortArray3453;
				else
					is_139_ = aShortArray3289;
				for (int i_140_ = 0; i_140_ < aShortArray3314.length; i_140_++)
					class176.method2909(aShortArray3314[i_140_], is_139_[i_140_]);
			}
			if (aByte3295 != 0)
				class176.method2986(aByte3317, aByte3293, aByte3292, aByte3295 & 0xff);
			class176.method2941(i_132_);
			synchronized (aClass293_3276.aClass205_3262) {
				aClass293_3276.aClass205_3262.method3790(class176, l);
			}
		}
		if (null != class695) {
			class176 = class176.method2862((byte) 1, i_132_, true);
			class695.method14175(class176, 0, (byte) 0);
		}
		class176.method2941(i);
		return class176;
	}

	void method5318(RSByteBuffer class527_sub38, int i, int i_141_) {
		if (i == 1) {
			int i_142_ = class527_sub38.readUnsignedByte();
			anIntArray3281 = new int[i_142_];
			for (int i_143_ = 0; i_143_ < i_142_; i_143_++)
				anIntArray3281[i_143_] = class527_sub38.method16466(-2069992558);
		} else if (i == 2)
			aString3279 = class527_sub38.readString(2041778749);
		else if (12 == i)
			anInt3342 = class527_sub38.readUnsignedByte() * -241082749;
		else if (i >= 30 && i < 35)
			aStringArray3308[i - 30] = class527_sub38.readString(871756365);
		else if (i == 40) {
			int i_144_ = class527_sub38.readUnsignedByte();
			aShortArray3304 = new short[i_144_];
			aShortArray3286 = new short[i_144_];
			for (int i_145_ = 0; i_145_ < i_144_; i_145_++) {
				aShortArray3304[i_145_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3286[i_145_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 41) {
			int i_146_ = class527_sub38.readUnsignedByte();
			aShortArray3314 = new short[i_146_];
			aShortArray3289 = new short[i_146_];
			for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
				aShortArray3314[i_147_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3289[i_147_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_148_ = class527_sub38.readUnsignedByte();
			aByteArray3303 = new byte[i_148_];
			for (int i_149_ = 0; i_149_ < i_148_; i_149_++)
				aByteArray3303[i_149_] = class527_sub38.readByte();
		} else if (i == 44) {
			int i_150_ = class527_sub38.readUnsignedShort();
			int i_151_ = 0;
			for (int i_152_ = i_150_; i_152_ > 0; i_152_ >>= 1)
				i_151_++;
			aByteArray3300 = new byte[i_151_];
			byte i_153_ = 0;
			for (int i_154_ = 0; i_154_ < i_151_; i_154_++) {
				if ((i_150_ & 1 << i_154_) > 0) {
					aByteArray3300[i_154_] = i_153_;
					i_153_++;
				} else
					aByteArray3300[i_154_] = (byte) -1;
			}
		} else if (45 == i) {
			int i_155_ = class527_sub38.readUnsignedShort();
			int i_156_ = 0;
			for (int i_157_ = i_155_; i_157_ > 0; i_157_ >>= 1)
				i_156_++;
			aByteArray3280 = new byte[i_156_];
			byte i_158_ = 0;
			for (int i_159_ = 0; i_159_ < i_156_; i_159_++) {
				if ((i_155_ & 1 << i_159_) > 0) {
					aByteArray3280[i_159_] = i_158_;
					i_158_++;
				} else
					aByteArray3280[i_159_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_160_ = class527_sub38.readUnsignedByte();
			anIntArray3282 = new int[i_160_];
			for (int i_161_ = 0; i_161_ < i_160_; i_161_++)
				anIntArray3282[i_161_] = class527_sub38.method16466(-1810674988);
		} else if (i == 93)
			aBool3313 = false;
		else if (i == 95)
			anInt3285 = class527_sub38.readUnsignedShort() * 679159989;
		else if (97 == i)
			anInt3301 = class527_sub38.readUnsignedShort() * -91756197;
		else if (i == 98)
			anInt3302 = class527_sub38.readUnsignedShort() * -1249656093;
		else if (i == 99)
			aBool3278 = true;
		else if (i == 100)
			anInt3306 = class527_sub38.readByte() * -1191310199;
		else if (i == 101)
			anInt3307 = class527_sub38.readByte() * 825023187;
		else if (102 == i) {
			int i_162_ = class527_sub38.readUnsignedByte();
			int i_163_ = 0;
			for (int i_164_ = i_162_; i_164_ != 0; i_164_ >>= 1)
				i_163_++;
			anIntArray3324 = new int[i_163_];
			aShortArray3309 = new short[i_163_];
			for (int i_165_ = 0; i_165_ < i_163_; i_165_++) {
				if ((i_162_ & 1 << i_165_) == 0) {
					anIntArray3324[i_165_] = -1;
					aShortArray3309[i_165_] = (short) -1;
				} else {
					anIntArray3324[i_165_] = class527_sub38.method16466(-1645905696);
					aShortArray3309[i_165_] = (short) class527_sub38.method16606(-76220453);
				}
			}
		} else if (i == 103)
			anInt3311 = class527_sub38.readUnsignedShort() * 755826391;
		else if (106 == i || i == 118) {
			anInt3328 = class527_sub38.readUnsignedShort() * 1759347629;
			if (65535 == -2136287195 * anInt3328)
				anInt3328 = -1759347629;
			anInt3291 = class527_sub38.readUnsignedShort() * 1435284425;
			if (65535 == -921840007 * anInt3291)
				anInt3291 = -1435284425;
			int i_166_ = -1;
			if (i == 118) {
				i_166_ = class527_sub38.readUnsignedShort();
				if (65535 == i_166_)
					i_166_ = -1;
			}
			int i_167_ = class527_sub38.readUnsignedByte();
			anIntArray3312 = new int[2 + i_167_];
			for (int i_168_ = 0; i_168_ <= i_167_; i_168_++) {
				anIntArray3312[i_168_] = class527_sub38.readUnsignedShort();
				if (anIntArray3312[i_168_] == 65535)
					anIntArray3312[i_168_] = -1;
			}
			anIntArray3312[1 + i_167_] = i_166_;
		} else if (107 == i)
			aBool3299 = false;
		else if (i == 109)
			aBool3316 = false;
		else if (i == 111)
			aBool3274 = false;
		else if (113 == i) {
			aShort3318 = (short) class527_sub38.readUnsignedShort();
			aShort3319 = (short) class527_sub38.readUnsignedShort();
		} else if (i == 114) {
			aByte3320 = class527_sub38.readByte();
			aByte3288 = class527_sub38.readByte();
		} else if (i == 119)
			aByte3294 = class527_sub38.readByte();
		else if (121 == i) {
			anIntArrayArray3283 = new int[anIntArray3281.length][];
			int i_169_ = class527_sub38.readUnsignedByte();
			for (int i_170_ = 0; i_170_ < i_169_; i_170_++) {
				int i_171_ = class527_sub38.readUnsignedByte();
				int[] is = anIntArrayArray3283[i_171_] = new int[3];
				is[0] = class527_sub38.readByte();
				is[1] = class527_sub38.readByte();
				is[2] = class527_sub38.readByte();
			}
		} else if (i == 123)
			anInt3335 = class527_sub38.readUnsignedShort() * 229484319;
		else if (i == 125)
			aClass681_3277 = ((Class681) Class26.method858(Class255.method4707(1205687288), class527_sub38.readByte(), -1387223736));
		else if (i == 127)
			anInt3284 = class527_sub38.readUnsignedShort() * -277256119;
		else if (128 == i)
			Class26.method858(Class679.method13904(673878859), class527_sub38.readUnsignedByte(), -1795556602);
		else if (134 == i) {
			anInt3327 = class527_sub38.readUnsignedShort() * 812147355;
			if (-324553837 * anInt3327 == 65535)
				anInt3327 = -812147355;
			anInt3331 = class527_sub38.readUnsignedShort() * -2081879461;
			if (65535 == anInt3331 * 1772688851)
				anInt3331 = 2081879461;
			anInt3329 = class527_sub38.readUnsignedShort() * 707206463;
			if (-422751553 * anInt3329 == 65535)
				anInt3329 = -707206463;
			anInt3330 = class527_sub38.readUnsignedShort() * 2065748099;
			if (65535 == anInt3330 * 2047475243)
				anInt3330 = -2065748099;
			anInt3273 = class527_sub38.readUnsignedByte() * -962243229;
		} else if (i == 135 || i == 136) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (i == 137)
			anInt3298 = class527_sub38.readUnsignedShort() * 222427953;
		else if (i == 138)
			anInt3310 = class527_sub38.method16466(-2058148920) * -2011178551;
		else if (i == 140)
			anInt3333 = class527_sub38.readUnsignedByte() * -129311515;
		else if (i == 141)
			aBool3305 = true;
		else if (i == 142)
			anInt3337 = class527_sub38.readUnsignedShort() * 1357035261;
		else if (143 == i)
			aBool3321 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3308[i - 150] = class527_sub38.readString(1854943964);
			if (!aClass293_3276.aBool3260)
				aStringArray3308[i - 150] = null;
		} else if (i == 155) {
			aByte3317 = class527_sub38.readByte();
			aByte3293 = class527_sub38.readByte();
			aByte3292 = class527_sub38.readByte();
			aByte3295 = class527_sub38.readByte();
		} else if (i == 158)
			aByte3339 = (byte) 1;
		else if (i == 159)
			aByte3339 = (byte) 0;
		else if (i == 160) {
			int i_172_ = class527_sub38.readUnsignedByte();
			anIntArray3338 = new int[i_172_];
			for (int i_173_ = 0; i_173_ < i_172_; i_173_++)
				anIntArray3338[i_173_] = class527_sub38.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3340 = class527_sub38.readUnsignedByte() * -638971559;
			else if (i == 164) {
				anInt3287 = class527_sub38.readUnsignedShort() * -457545275;
				anInt3343 = class527_sub38.readUnsignedShort() * 1061446331;
			} else if (165 == i)
				anInt3344 = class527_sub38.readUnsignedByte() * 1571185663;
			else if (168 == i)
				anInt3332 = class527_sub38.readUnsignedByte() * 281319945;
			else if (169 == i)
				aBool3315 = false;
			else if (i >= 170 && i < 176) {
				if (null == anIntArray3297) {
					anIntArray3297 = new int[6];
					Arrays.fill(anIntArray3297, -1);
				}
				int i_174_ = class527_sub38.readUnsignedShort();
				if (i_174_ == 65535)
					i_174_ = -1;
				anIntArray3297[i - 170] = i_174_;
			} else if (i != 178) {
				if (179 == i) {
					aClass439_3341 = new Class439();
					aClass439_3341.aFloat4894 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4891 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4892 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4893 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4890 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4895 = (float) class527_sub38.readSmartVariant(983912765);
				} else if (i == 180)
					anInt3346 = (class527_sub38.readUnsignedByte() & 0xff) * 1535834927;
				else if (i == 181) {
					aShort3322 = (short) class527_sub38.readUnsignedShort();
					aByte3323 = (byte) class527_sub38.readUnsignedByte();
				} else if (i == 182)
					aBool3347 = true;
				else if (249 == i) {
					int i_175_ = class527_sub38.readUnsignedByte();
					if (null == aClass14_3334) {
						int i_176_ = Class186.method3652(i_175_, 1347961617);
						aClass14_3334 = new Class14(i_176_);
					}
					for (int i_177_ = 0; i_177_ < i_175_; i_177_++) {
						boolean bool = class527_sub38.readUnsignedByte() == 1;
						int i_178_ = class527_sub38.read24BitUnsignedInteger(2067167714);
						Class527 class527;
						if (bool)
							class527 = (new Class527_Sub26(class527_sub38.readString(1145921153)));
						else
							class527 = (new Node_Sub6(class527_sub38.readInt()));
						aClass14_3334.method714(class527, (long) i_178_);
					}
				}
			}
		}
	}

	void method5319(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			int i_179_ = class527_sub38.readUnsignedByte();
			anIntArray3281 = new int[i_179_];
			for (int i_180_ = 0; i_180_ < i_179_; i_180_++)
				anIntArray3281[i_180_] = class527_sub38.method16466(-1833004063);
		} else if (i == 2)
			aString3279 = class527_sub38.readString(1918999158);
		else if (12 == i)
			anInt3342 = class527_sub38.readUnsignedByte() * -241082749;
		else if (i >= 30 && i < 35)
			aStringArray3308[i - 30] = class527_sub38.readString(1729072601);
		else if (i == 40) {
			int i_181_ = class527_sub38.readUnsignedByte();
			aShortArray3304 = new short[i_181_];
			aShortArray3286 = new short[i_181_];
			for (int i_182_ = 0; i_182_ < i_181_; i_182_++) {
				aShortArray3304[i_182_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3286[i_182_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 41) {
			int i_183_ = class527_sub38.readUnsignedByte();
			aShortArray3314 = new short[i_183_];
			aShortArray3289 = new short[i_183_];
			for (int i_184_ = 0; i_184_ < i_183_; i_184_++) {
				aShortArray3314[i_184_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3289[i_184_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_185_ = class527_sub38.readUnsignedByte();
			aByteArray3303 = new byte[i_185_];
			for (int i_186_ = 0; i_186_ < i_185_; i_186_++)
				aByteArray3303[i_186_] = class527_sub38.readByte();
		} else if (i == 44) {
			int i_187_ = class527_sub38.readUnsignedShort();
			int i_188_ = 0;
			for (int i_189_ = i_187_; i_189_ > 0; i_189_ >>= 1)
				i_188_++;
			aByteArray3300 = new byte[i_188_];
			byte i_190_ = 0;
			for (int i_191_ = 0; i_191_ < i_188_; i_191_++) {
				if ((i_187_ & 1 << i_191_) > 0) {
					aByteArray3300[i_191_] = i_190_;
					i_190_++;
				} else
					aByteArray3300[i_191_] = (byte) -1;
			}
		} else if (45 == i) {
			int i_192_ = class527_sub38.readUnsignedShort();
			int i_193_ = 0;
			for (int i_194_ = i_192_; i_194_ > 0; i_194_ >>= 1)
				i_193_++;
			aByteArray3280 = new byte[i_193_];
			byte i_195_ = 0;
			for (int i_196_ = 0; i_196_ < i_193_; i_196_++) {
				if ((i_192_ & 1 << i_196_) > 0) {
					aByteArray3280[i_196_] = i_195_;
					i_195_++;
				} else
					aByteArray3280[i_196_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_197_ = class527_sub38.readUnsignedByte();
			anIntArray3282 = new int[i_197_];
			for (int i_198_ = 0; i_198_ < i_197_; i_198_++)
				anIntArray3282[i_198_] = class527_sub38.method16466(-1591254160);
		} else if (i == 93)
			aBool3313 = false;
		else if (i == 95)
			anInt3285 = class527_sub38.readUnsignedShort() * 679159989;
		else if (97 == i)
			anInt3301 = class527_sub38.readUnsignedShort() * -91756197;
		else if (i == 98)
			anInt3302 = class527_sub38.readUnsignedShort() * -1249656093;
		else if (i == 99)
			aBool3278 = true;
		else if (i == 100)
			anInt3306 = class527_sub38.readByte() * -1191310199;
		else if (i == 101)
			anInt3307 = class527_sub38.readByte() * 825023187;
		else if (102 == i) {
			int i_199_ = class527_sub38.readUnsignedByte();
			int i_200_ = 0;
			for (int i_201_ = i_199_; i_201_ != 0; i_201_ >>= 1)
				i_200_++;
			anIntArray3324 = new int[i_200_];
			aShortArray3309 = new short[i_200_];
			for (int i_202_ = 0; i_202_ < i_200_; i_202_++) {
				if ((i_199_ & 1 << i_202_) == 0) {
					anIntArray3324[i_202_] = -1;
					aShortArray3309[i_202_] = (short) -1;
				} else {
					anIntArray3324[i_202_] = class527_sub38.method16466(-2140394464);
					aShortArray3309[i_202_] = (short) class527_sub38.method16606(1761862991);
				}
			}
		} else if (i == 103)
			anInt3311 = class527_sub38.readUnsignedShort() * 755826391;
		else if (106 == i || i == 118) {
			anInt3328 = class527_sub38.readUnsignedShort() * 1759347629;
			if (65535 == -2136287195 * anInt3328)
				anInt3328 = -1759347629;
			anInt3291 = class527_sub38.readUnsignedShort() * 1435284425;
			if (65535 == -921840007 * anInt3291)
				anInt3291 = -1435284425;
			int i_203_ = -1;
			if (i == 118) {
				i_203_ = class527_sub38.readUnsignedShort();
				if (65535 == i_203_)
					i_203_ = -1;
			}
			int i_204_ = class527_sub38.readUnsignedByte();
			anIntArray3312 = new int[2 + i_204_];
			for (int i_205_ = 0; i_205_ <= i_204_; i_205_++) {
				anIntArray3312[i_205_] = class527_sub38.readUnsignedShort();
				if (anIntArray3312[i_205_] == 65535)
					anIntArray3312[i_205_] = -1;
			}
			anIntArray3312[1 + i_204_] = i_203_;
		} else if (107 == i)
			aBool3299 = false;
		else if (i == 109)
			aBool3316 = false;
		else if (i == 111)
			aBool3274 = false;
		else if (113 == i) {
			aShort3318 = (short) class527_sub38.readUnsignedShort();
			aShort3319 = (short) class527_sub38.readUnsignedShort();
		} else if (i == 114) {
			aByte3320 = class527_sub38.readByte();
			aByte3288 = class527_sub38.readByte();
		} else if (i == 119)
			aByte3294 = class527_sub38.readByte();
		else if (121 == i) {
			anIntArrayArray3283 = new int[anIntArray3281.length][];
			int i_206_ = class527_sub38.readUnsignedByte();
			for (int i_207_ = 0; i_207_ < i_206_; i_207_++) {
				int i_208_ = class527_sub38.readUnsignedByte();
				int[] is = anIntArrayArray3283[i_208_] = new int[3];
				is[0] = class527_sub38.readByte();
				is[1] = class527_sub38.readByte();
				is[2] = class527_sub38.readByte();
			}
		} else if (i == 123)
			anInt3335 = class527_sub38.readUnsignedShort() * 229484319;
		else if (i == 125)
			aClass681_3277 = ((Class681) Class26.method858(Class255.method4707(-1064942575), class527_sub38.readByte(), 1736020814));
		else if (i == 127)
			anInt3284 = class527_sub38.readUnsignedShort() * -277256119;
		else if (128 == i)
			Class26.method858(Class679.method13904(673878859), class527_sub38.readUnsignedByte(), 984953272);
		else if (134 == i) {
			anInt3327 = class527_sub38.readUnsignedShort() * 812147355;
			if (-324553837 * anInt3327 == 65535)
				anInt3327 = -812147355;
			anInt3331 = class527_sub38.readUnsignedShort() * -2081879461;
			if (65535 == anInt3331 * 1772688851)
				anInt3331 = 2081879461;
			anInt3329 = class527_sub38.readUnsignedShort() * 707206463;
			if (-422751553 * anInt3329 == 65535)
				anInt3329 = -707206463;
			anInt3330 = class527_sub38.readUnsignedShort() * 2065748099;
			if (65535 == anInt3330 * 2047475243)
				anInt3330 = -2065748099;
			anInt3273 = class527_sub38.readUnsignedByte() * -962243229;
		} else if (i == 135 || i == 136) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (i == 137)
			anInt3298 = class527_sub38.readUnsignedShort() * 222427953;
		else if (i == 138)
			anInt3310 = class527_sub38.method16466(-1874016428) * -2011178551;
		else if (i == 140)
			anInt3333 = class527_sub38.readUnsignedByte() * -129311515;
		else if (i == 141)
			aBool3305 = true;
		else if (i == 142)
			anInt3337 = class527_sub38.readUnsignedShort() * 1357035261;
		else if (143 == i)
			aBool3321 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3308[i - 150] = class527_sub38.readString(869236556);
			if (!aClass293_3276.aBool3260)
				aStringArray3308[i - 150] = null;
		} else if (i == 155) {
			aByte3317 = class527_sub38.readByte();
			aByte3293 = class527_sub38.readByte();
			aByte3292 = class527_sub38.readByte();
			aByte3295 = class527_sub38.readByte();
		} else if (i == 158)
			aByte3339 = (byte) 1;
		else if (i == 159)
			aByte3339 = (byte) 0;
		else if (i == 160) {
			int i_209_ = class527_sub38.readUnsignedByte();
			anIntArray3338 = new int[i_209_];
			for (int i_210_ = 0; i_210_ < i_209_; i_210_++)
				anIntArray3338[i_210_] = class527_sub38.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3340 = class527_sub38.readUnsignedByte() * -638971559;
			else if (i == 164) {
				anInt3287 = class527_sub38.readUnsignedShort() * -457545275;
				anInt3343 = class527_sub38.readUnsignedShort() * 1061446331;
			} else if (165 == i)
				anInt3344 = class527_sub38.readUnsignedByte() * 1571185663;
			else if (168 == i)
				anInt3332 = class527_sub38.readUnsignedByte() * 281319945;
			else if (169 == i)
				aBool3315 = false;
			else if (i >= 170 && i < 176) {
				if (null == anIntArray3297) {
					anIntArray3297 = new int[6];
					Arrays.fill(anIntArray3297, -1);
				}
				int i_211_ = class527_sub38.readUnsignedShort();
				if (i_211_ == 65535)
					i_211_ = -1;
				anIntArray3297[i - 170] = i_211_;
			} else if (i != 178) {
				if (179 == i) {
					aClass439_3341 = new Class439();
					aClass439_3341.aFloat4894 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4891 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4892 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4893 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4890 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4895 = (float) class527_sub38.readSmartVariant(983912765);
				} else if (i == 180)
					anInt3346 = (class527_sub38.readUnsignedByte() & 0xff) * 1535834927;
				else if (i == 181) {
					aShort3322 = (short) class527_sub38.readUnsignedShort();
					aByte3323 = (byte) class527_sub38.readUnsignedByte();
				} else if (i == 182)
					aBool3347 = true;
				else if (249 == i) {
					int i_212_ = class527_sub38.readUnsignedByte();
					if (null == aClass14_3334) {
						int i_213_ = Class186.method3652(i_212_, -560646629);
						aClass14_3334 = new Class14(i_213_);
					}
					for (int i_214_ = 0; i_214_ < i_212_; i_214_++) {
						boolean bool = class527_sub38.readUnsignedByte() == 1;
						int i_215_ = class527_sub38.read24BitUnsignedInteger(1811435504);
						Class527 class527;
						if (bool)
							class527 = (new Class527_Sub26(class527_sub38.readString(2089075698)));
						else
							class527 = (new Node_Sub6(class527_sub38.readInt()));
						aClass14_3334.method714(class527, (long) i_215_);
					}
				}
			}
		}
	}

	public final boolean method5320() {
		if (null == anIntArray3281)
			return true;
		boolean bool = true;
		int[] is = anIntArray3281;
		for (int i = 0; i < is.length; i++) {
			int i_216_ = is[i];
			if (!aClass293_3276.aClass459_3258.method7479(i_216_, 0, 102380841))
				bool = false;
		}
		return bool;
	}

	public int method5321(int i, int i_217_) {
		if (aClass14_3334 == null)
			return i_217_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_3334.method709((long) i);
		if (class527_sub7 == null)
			return i_217_;
		return class527_sub7.anInt10398 * -78845949;
	}

	public final boolean method5322() {
		if (null == anIntArray3281)
			return true;
		boolean bool = true;
		int[] is = anIntArray3281;
		for (int i = 0; i < is.length; i++) {
			int i_218_ = is[i];
			if (!aClass293_3276.aClass459_3258.method7479(i_218_, 0, 102380841))
				bool = false;
		}
		return bool;
	}

	void method5323(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			int i_219_ = class527_sub38.readUnsignedByte();
			anIntArray3281 = new int[i_219_];
			for (int i_220_ = 0; i_220_ < i_219_; i_220_++)
				anIntArray3281[i_220_] = class527_sub38.method16466(-2093945487);
		} else if (i == 2)
			aString3279 = class527_sub38.readString(2023921620);
		else if (12 == i)
			anInt3342 = class527_sub38.readUnsignedByte() * -241082749;
		else if (i >= 30 && i < 35)
			aStringArray3308[i - 30] = class527_sub38.readString(1050457046);
		else if (i == 40) {
			int i_221_ = class527_sub38.readUnsignedByte();
			aShortArray3304 = new short[i_221_];
			aShortArray3286 = new short[i_221_];
			for (int i_222_ = 0; i_222_ < i_221_; i_222_++) {
				aShortArray3304[i_222_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3286[i_222_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 41) {
			int i_223_ = class527_sub38.readUnsignedByte();
			aShortArray3314 = new short[i_223_];
			aShortArray3289 = new short[i_223_];
			for (int i_224_ = 0; i_224_ < i_223_; i_224_++) {
				aShortArray3314[i_224_] = (short) class527_sub38.readUnsignedShort();
				aShortArray3289[i_224_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_225_ = class527_sub38.readUnsignedByte();
			aByteArray3303 = new byte[i_225_];
			for (int i_226_ = 0; i_226_ < i_225_; i_226_++)
				aByteArray3303[i_226_] = class527_sub38.readByte();
		} else if (i == 44) {
			int i_227_ = class527_sub38.readUnsignedShort();
			int i_228_ = 0;
			for (int i_229_ = i_227_; i_229_ > 0; i_229_ >>= 1)
				i_228_++;
			aByteArray3300 = new byte[i_228_];
			byte i_230_ = 0;
			for (int i_231_ = 0; i_231_ < i_228_; i_231_++) {
				if ((i_227_ & 1 << i_231_) > 0) {
					aByteArray3300[i_231_] = i_230_;
					i_230_++;
				} else
					aByteArray3300[i_231_] = (byte) -1;
			}
		} else if (45 == i) {
			int i_232_ = class527_sub38.readUnsignedShort();
			int i_233_ = 0;
			for (int i_234_ = i_232_; i_234_ > 0; i_234_ >>= 1)
				i_233_++;
			aByteArray3280 = new byte[i_233_];
			byte i_235_ = 0;
			for (int i_236_ = 0; i_236_ < i_233_; i_236_++) {
				if ((i_232_ & 1 << i_236_) > 0) {
					aByteArray3280[i_236_] = i_235_;
					i_235_++;
				} else
					aByteArray3280[i_236_] = (byte) -1;
			}
		} else if (i == 60) {
			int i_237_ = class527_sub38.readUnsignedByte();
			anIntArray3282 = new int[i_237_];
			for (int i_238_ = 0; i_238_ < i_237_; i_238_++)
				anIntArray3282[i_238_] = class527_sub38.method16466(-1846550543);
		} else if (i == 93)
			aBool3313 = false;
		else if (i == 95)
			anInt3285 = class527_sub38.readUnsignedShort() * 679159989;
		else if (97 == i)
			anInt3301 = class527_sub38.readUnsignedShort() * -91756197;
		else if (i == 98)
			anInt3302 = class527_sub38.readUnsignedShort() * -1249656093;
		else if (i == 99)
			aBool3278 = true;
		else if (i == 100)
			anInt3306 = class527_sub38.readByte() * -1191310199;
		else if (i == 101)
			anInt3307 = class527_sub38.readByte() * 825023187;
		else if (102 == i) {
			int i_239_ = class527_sub38.readUnsignedByte();
			int i_240_ = 0;
			for (int i_241_ = i_239_; i_241_ != 0; i_241_ >>= 1)
				i_240_++;
			anIntArray3324 = new int[i_240_];
			aShortArray3309 = new short[i_240_];
			for (int i_242_ = 0; i_242_ < i_240_; i_242_++) {
				if ((i_239_ & 1 << i_242_) == 0) {
					anIntArray3324[i_242_] = -1;
					aShortArray3309[i_242_] = (short) -1;
				} else {
					anIntArray3324[i_242_] = class527_sub38.method16466(-1859465743);
					aShortArray3309[i_242_] = (short) class527_sub38.method16606(1485840323);
				}
			}
		} else if (i == 103)
			anInt3311 = class527_sub38.readUnsignedShort() * 755826391;
		else if (106 == i || i == 118) {
			anInt3328 = class527_sub38.readUnsignedShort() * 1759347629;
			if (65535 == -2136287195 * anInt3328)
				anInt3328 = -1759347629;
			anInt3291 = class527_sub38.readUnsignedShort() * 1435284425;
			if (65535 == -921840007 * anInt3291)
				anInt3291 = -1435284425;
			int i_243_ = -1;
			if (i == 118) {
				i_243_ = class527_sub38.readUnsignedShort();
				if (65535 == i_243_)
					i_243_ = -1;
			}
			int i_244_ = class527_sub38.readUnsignedByte();
			anIntArray3312 = new int[2 + i_244_];
			for (int i_245_ = 0; i_245_ <= i_244_; i_245_++) {
				anIntArray3312[i_245_] = class527_sub38.readUnsignedShort();
				if (anIntArray3312[i_245_] == 65535)
					anIntArray3312[i_245_] = -1;
			}
			anIntArray3312[1 + i_244_] = i_243_;
		} else if (107 == i)
			aBool3299 = false;
		else if (i == 109)
			aBool3316 = false;
		else if (i == 111)
			aBool3274 = false;
		else if (113 == i) {
			aShort3318 = (short) class527_sub38.readUnsignedShort();
			aShort3319 = (short) class527_sub38.readUnsignedShort();
		} else if (i == 114) {
			aByte3320 = class527_sub38.readByte();
			aByte3288 = class527_sub38.readByte();
		} else if (i == 119)
			aByte3294 = class527_sub38.readByte();
		else if (121 == i) {
			anIntArrayArray3283 = new int[anIntArray3281.length][];
			int i_246_ = class527_sub38.readUnsignedByte();
			for (int i_247_ = 0; i_247_ < i_246_; i_247_++) {
				int i_248_ = class527_sub38.readUnsignedByte();
				int[] is = anIntArrayArray3283[i_248_] = new int[3];
				is[0] = class527_sub38.readByte();
				is[1] = class527_sub38.readByte();
				is[2] = class527_sub38.readByte();
			}
		} else if (i == 123)
			anInt3335 = class527_sub38.readUnsignedShort() * 229484319;
		else if (i == 125)
			aClass681_3277 = ((Class681) Class26.method858(Class255.method4707(171641216), class527_sub38.readByte(), -2087204491));
		else if (i == 127)
			anInt3284 = class527_sub38.readUnsignedShort() * -277256119;
		else if (128 == i)
			Class26.method858(Class679.method13904(673878859), class527_sub38.readUnsignedByte(), 103671885);
		else if (134 == i) {
			anInt3327 = class527_sub38.readUnsignedShort() * 812147355;
			if (-324553837 * anInt3327 == 65535)
				anInt3327 = -812147355;
			anInt3331 = class527_sub38.readUnsignedShort() * -2081879461;
			if (65535 == anInt3331 * 1772688851)
				anInt3331 = 2081879461;
			anInt3329 = class527_sub38.readUnsignedShort() * 707206463;
			if (-422751553 * anInt3329 == 65535)
				anInt3329 = -707206463;
			anInt3330 = class527_sub38.readUnsignedShort() * 2065748099;
			if (65535 == anInt3330 * 2047475243)
				anInt3330 = -2065748099;
			anInt3273 = class527_sub38.readUnsignedByte() * -962243229;
		} else if (i == 135 || i == 136) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (i == 137)
			anInt3298 = class527_sub38.readUnsignedShort() * 222427953;
		else if (i == 138)
			anInt3310 = class527_sub38.method16466(-1931110114) * -2011178551;
		else if (i == 140)
			anInt3333 = class527_sub38.readUnsignedByte() * -129311515;
		else if (i == 141)
			aBool3305 = true;
		else if (i == 142)
			anInt3337 = class527_sub38.readUnsignedShort() * 1357035261;
		else if (143 == i)
			aBool3321 = true;
		else if (i >= 150 && i < 155) {
			aStringArray3308[i - 150] = class527_sub38.readString(1278499314);
			if (!aClass293_3276.aBool3260)
				aStringArray3308[i - 150] = null;
		} else if (i == 155) {
			aByte3317 = class527_sub38.readByte();
			aByte3293 = class527_sub38.readByte();
			aByte3292 = class527_sub38.readByte();
			aByte3295 = class527_sub38.readByte();
		} else if (i == 158)
			aByte3339 = (byte) 1;
		else if (i == 159)
			aByte3339 = (byte) 0;
		else if (i == 160) {
			int i_249_ = class527_sub38.readUnsignedByte();
			anIntArray3338 = new int[i_249_];
			for (int i_250_ = 0; i_250_ < i_249_; i_250_++)
				anIntArray3338[i_250_] = class527_sub38.readUnsignedShort();
		} else if (i != 162) {
			if (i == 163)
				anInt3340 = class527_sub38.readUnsignedByte() * -638971559;
			else if (i == 164) {
				anInt3287 = class527_sub38.readUnsignedShort() * -457545275;
				anInt3343 = class527_sub38.readUnsignedShort() * 1061446331;
			} else if (165 == i)
				anInt3344 = class527_sub38.readUnsignedByte() * 1571185663;
			else if (168 == i)
				anInt3332 = class527_sub38.readUnsignedByte() * 281319945;
			else if (169 == i)
				aBool3315 = false;
			else if (i >= 170 && i < 176) {
				if (null == anIntArray3297) {
					anIntArray3297 = new int[6];
					Arrays.fill(anIntArray3297, -1);
				}
				int i_251_ = class527_sub38.readUnsignedShort();
				if (i_251_ == 65535)
					i_251_ = -1;
				anIntArray3297[i - 170] = i_251_;
			} else if (i != 178) {
				if (179 == i) {
					aClass439_3341 = new Class439();
					aClass439_3341.aFloat4894 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4891 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4892 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4893 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4890 = (float) class527_sub38.readSmartVariant(983912765);
					aClass439_3341.aFloat4895 = (float) class527_sub38.readSmartVariant(983912765);
				} else if (i == 180)
					anInt3346 = (class527_sub38.readUnsignedByte() & 0xff) * 1535834927;
				else if (i == 181) {
					aShort3322 = (short) class527_sub38.readUnsignedShort();
					aByte3323 = (byte) class527_sub38.readUnsignedByte();
				} else if (i == 182)
					aBool3347 = true;
				else if (249 == i) {
					int i_252_ = class527_sub38.readUnsignedByte();
					if (null == aClass14_3334) {
						int i_253_ = Class186.method3652(i_252_, 1763873848);
						aClass14_3334 = new Class14(i_253_);
					}
					for (int i_254_ = 0; i_254_ < i_252_; i_254_++) {
						boolean bool = class527_sub38.readUnsignedByte() == 1;
						int i_255_ = class527_sub38.read24BitUnsignedInteger(2103192675);
						Class527 class527;
						if (bool)
							class527 = (new Class527_Sub26(class527_sub38.readString(1295017967)));
						else
							class527 = (new Node_Sub6(class527_sub38.readInt()));
						aClass14_3334.method714(class527, (long) i_255_);
					}
				}
			}
		}
	}

	public String method5324(int i, String string) {
		if (null == aClass14_3334)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_3334.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public final Class295 method5325(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (-2136287195 * anInt3328 != -1) {
			Class333 class333 = interface20.method123(-2136287195 * anInt3328, -351300292);
			if (class333 != null)
				i = interface18.method100(class333, (short) -28762);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -1904392880);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray3312.length - 1) {
			int i_256_ = anIntArray3312[anIntArray3312.length - 1];
			if (-1 != i_256_)
				return ((Class295) anInterface13_3296.method81(i_256_, -1384270313));
			return null;
		}
		if (-1 == anIntArray3312[i])
			return null;
		return ((Class295) anInterface13_3296.method81(anIntArray3312[i], -1143548135));
	}

	public final Class295 method5326(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (-2136287195 * anInt3328 != -1) {
			Class333 class333 = interface20.method123(-2136287195 * anInt3328, -981016912);
			if (class333 != null)
				i = interface18.method100(class333, (short) -14055);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -2015338433);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray3312.length - 1) {
			int i_257_ = anIntArray3312[anIntArray3312.length - 1];
			if (-1 != i_257_)
				return ((Class295) anInterface13_3296.method81(i_257_, 1631664099));
			return null;
		}
		if (-1 == anIntArray3312[i])
			return null;
		return ((Class295) anInterface13_3296.method81(anIntArray3312[i], -569997040));
	}

	public final Class295 method5327(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (-2136287195 * anInt3328 != -1) {
			Class333 class333 = interface20.method123(-2136287195 * anInt3328, -1449293986);
			if (class333 != null)
				i = interface18.method100(class333, (short) -7783);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -787361918);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray3312.length - 1) {
			int i_258_ = anIntArray3312[anIntArray3312.length - 1];
			if (-1 != i_258_)
				return ((Class295) anInterface13_3296.method81(i_258_, 1256105959));
			return null;
		}
		if (-1 == anIntArray3312[i])
			return null;
		return ((Class295) anInterface13_3296.method81(anIntArray3312[i], -1584802292));
	}

	public boolean method5328(Interface20 interface20, Interface18 interface18) {
		if (anIntArray3312 == null)
			return true;
		int i = -1;
		if (anInt3328 * -2136287195 != -1) {
			Class333 class333 = interface20.method123(anInt3328 * -2136287195, 1524742764);
			if (null != class333)
				i = interface18.method100(class333, (short) -806);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -490129608);
			if (null != class160)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray3312.length - 1) {
			int i_259_ = anIntArray3312[anIntArray3312.length - 1];
			if (i_259_ != -1)
				return true;
			return false;
		}
		if (anIntArray3312[i] == -1)
			return false;
		return true;
	}

	public boolean method5329(Interface20 interface20, Interface18 interface18) {
		if (anIntArray3312 == null)
			return true;
		int i = -1;
		if (anInt3328 * -2136287195 != -1) {
			Class333 class333 = interface20.method123(anInt3328 * -2136287195, -1556690686);
			if (null != class333)
				i = interface18.method100(class333, (short) -17030);
		} else if (-1 != -921840007 * anInt3291) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt3291 * -921840007, -1647092890);
			if (null != class160)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray3312.length - 1) {
			int i_260_ = anIntArray3312[anIntArray3312.length - 1];
			if (i_260_ != -1)
				return true;
			return false;
		}
		if (anIntArray3312[i] == -1)
			return false;
		return true;
	}

	public int method5330(int i, byte i_261_) {
		if (anIntArray3297 == null)
			return -1;
		return anIntArray3297[i];
	}

	public int method5331(int i, int i_262_, byte i_263_) {
		if (aClass14_3334 == null)
			return i_262_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_3334.method709((long) i);
		if (class527_sub7 == null)
			return i_262_;
		return class527_sub7.anInt10398 * -78845949;
	}

	public boolean method5332() {
		if (null == anIntArray3312)
			return (anInt3327 * -324553837 != -1 || anInt3329 * -422751553 != -1 || anInt3330 * 2047475243 != -1);
		for (int i = 0; i < anIntArray3312.length; i++) {
			if (anIntArray3312[i] != -1) {
				Class295 class295_264_ = (Class295) anInterface13_3296.method81(anIntArray3312[i], -827738672);
				if (-1 != -324553837 * class295_264_.anInt3327 || class295_264_.anInt3329 * -422751553 != -1 || class295_264_.anInt3330 * 2047475243 != -1)
					return true;
			}
		}
		return false;
	}

	public int method5333(int i) {
		if (anIntArray3297 == null)
			return -1;
		return anIntArray3297[i];
	}

	public static int method5334(int i) {
		Class597.aTwitchEventLiveStreams7849 = null;
		int i_265_ = Class585.aTwitchTV7698.RequestLiveStreams(client.aClass678_11259.aString8618);
		return i_265_;
	}

	static void method5335(int i) {
		int i_266_ = 0;
		if (Class204.aClass527_Sub31_2213 != null)
			i_266_ = Class204.aClass527_Sub31_2213.aClass700_Sub32_10620.method17239(-1753569295);
		if (i_266_ == 2) {
			int i_267_ = (-21941151 * Class358.anInt3831 > 800 ? 800 : Class358.anInt3831 * -21941151);
			int i_268_ = (Class76.anInt796 * -239790197 > 600 ? 600 : -239790197 * Class76.anInt796);
			Class289.anInt3223 = i_267_ * 2082158183;
			client.anInt7019 = -63687167 * ((Class358.anInt3831 * -21941151 - i_267_) / 2);
			Class611.anInt8009 = 959450025 * i_268_;
			client.anInt7020 = 0;
		} else if (1 == i_266_) {
			int i_269_ = (-21941151 * Class358.anInt3831 > 1024 ? 1024 : -21941151 * Class358.anInt3831);
			int i_270_ = (-239790197 * Class76.anInt796 > 768 ? 768 : -239790197 * Class76.anInt796);
			Class289.anInt3223 = 2082158183 * i_269_;
			client.anInt7019 = -63687167 * ((-21941151 * Class358.anInt3831 - i_269_) / 2);
			Class611.anInt8009 = 959450025 * i_270_;
			client.anInt7020 = 0;
		} else {
			Class289.anInt3223 = Class358.anInt3831 * 1553172743;
			client.anInt7019 = 0;
			Class611.anInt8009 = Class76.anInt796 * -1247837245;
			client.anInt7020 = 0;
		}
	}

	static Class527_Sub15 method5336(byte i) {
		if (Class527_Sub15.anInt10456 * -1883573975 == 0)
			return new Class527_Sub15();
		return (Class527_Sub15.aClass527_Sub15Array10461[(Class527_Sub15.anInt10456 -= -1424344295) * -1883573975]);
	}

	static final void method5337(Class665 class665, int i) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[318492261 * class665.anInt8528]);
		String string_271_ = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261 + 1]);
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183 != null && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183.aBool8278))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string_271_;
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
	}

	static final void method5338(Class665 class665, int i) {
		int i_272_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (null != client.aString11270 && i_272_ < -2075991457 * Class695_Sub3.anInt10976)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class679.aClass104Array8629[i_272_].aString1286;
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}

	public static void method5339(short i) {
		Class444.anInt4924 = 0;
		Class444.anInt4925 = 0;
	}

	static final void method5340(Class665 class665, int i) {
		int i_273_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_273_, 86513045);
		Class240 class240 = Class183.aClass240Array2100[i_273_ >> 16];
		Class271.method5075(class243, class240, class665, (short) 293);
	}
}

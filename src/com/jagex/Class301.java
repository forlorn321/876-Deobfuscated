/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class301 {
	boolean aBool3363;
	float aFloat3364 = 10.0F;
	Class302 aClass302_3365;
	Class300 aClass300_3366;
	Class333 aClass333_3367;
	float aFloat3368;
	Class289 aClass289_3369;
	Interface32 anInterface32_3370;
	Class290 aClass290_3371;
	Class293 aClass293_3372;
	float aFloat3373;
	Class436 aClass436_3374 = new Class436();
	Class436 aClass436_3375 = new Class436();
	int anInt3376;
	Class436 aClass436_3377 = new Class436();
	Class436 aClass436_3378 = new Class436();
	Class298 aClass298_3379;
	float aFloat3380;
	float aFloat3381 = 1.0F;
	float aFloat3382 = 5120.0F;
	float aFloat3383;
	float aFloat3384;
	Class436 aClass436_3385;
	Class436 aClass436_3386;
	public static final float aFloat3387 = Float.POSITIVE_INFINITY;
	float aFloat3388;
	float aFloat3389;
	float aFloat3390;
	static final int anInt3391 = 50;
	static final int anInt3392 = 10000;
	float aFloat3393;
	int anInt3394;
	boolean aBool3395;
	float aFloat3396;
	Class706 aClass706_3397;
	float aFloat3398;
	Class4 aClass4_3399;
	public static int anInt3400;

	public void method4028(boolean bool, byte i) {
		aClass302_3365 = Class302.aClass302_3402;
		aClass300_3366 = null;
		aClass706_3397 = null;
		aClass290_3371 = null;
		aClass333_3367 = null;
		if (aClass289_3369 == Class289.aClass289_3214 || !bool)
			aClass293_3372 = Class293.aClass293_3247;
		else
			aClass293_3372 = Class293.aClass293_3246;
		aClass298_3379 = Class298.aClass298_3345;
		aClass436_3374.method5243(100.0F, 100.0F, 100.0F);
		aClass436_3375.method5243(100.0F, 100.0F, 100.0F);
		aFloat3373 = 0.05F;
		aClass436_3377.method5243(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass436_3378.method5243(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass436_3385.method5243(1.0F, 1.0F, 1.0F);
		aClass436_3386.method5243(1.0F, 1.0F, 1.0F);
		aFloat3380 = 1.1F;
		aFloat3388 = 1.1F;
		aFloat3389 = 50.0F;
		aFloat3368 = 10000.0F;
		aFloat3398 = 1.5707964F;
		aFloat3393 = 1.5707964F;
		anInt3376 = -432849215;
		aBool3395 = true;
		aBool3363 = true;
		anInt3394 = 0;
		aFloat3390 = 1.0F;
		aClass4_3399.method561(-2117553523);
	}

	public Class436 method4029(byte i) {
		return aClass436_3375;
	}

	public void method4030(boolean bool, boolean bool_0_, byte i) throws Exception_Sub3 {
		if (!method4087((byte) 52))
			throw new Exception_Sub3();
		aBool3395 = bool;
		aBool3363 = bool_0_;
	}

	public Class333 method4031(Class290 class290, boolean bool, int i) throws Exception_Sub3 {
		if (aClass293_3372 == Class293.aClass293_3247 && !bool)
			throw new Exception_Sub3();
		aClass290_3371 = class290;
		if (class290 == Class290.aClass290_3220)
			aClass333_3367 = new Class333_Sub2(this);
		else if (Class290.aClass290_3222 == class290)
			aClass333_3367 = new Class333_Sub1(this);
		else if (Class290.aClass290_3218 == class290)
			aClass333_3367 = new Class333_Sub3_Sub1(this);
		else if (class290 == Class290.aClass290_3219)
			aClass333_3367 = new Class333_Sub3_Sub2(this);
		else if (Class290.aClass290_3216 == class290)
			aClass333_3367 = new Class333_Sub3_Sub3(this);
		return aClass333_3367;
	}

	public Class436 method4032(byte i) {
		return aClass436_3378;
	}

	public void method4033(Class293 class293, int i) {
		aClass293_3372 = class293;
	}

	public void method4034(float f, int i) throws Exception_Sub3 {
		if (!method4087((byte) 38))
			throw new Exception_Sub3();
		aFloat3373 = f;
	}

	public void method4035(Class298 class298, int i) throws Exception_Sub3 {
		if (!method4087((byte) 23))
			throw new Exception_Sub3();
		aClass298_3379 = class298;
	}

	public void method4036(Class436 class436, int i) throws Exception_Sub3 {
		if (!method4087((byte) 44) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3377.method5272(class436);
	}

	public void method4037(Class436 class436, int i) throws Exception_Sub3 {
		if (!method4087((byte) 77) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3378.method5272(class436);
	}

	public void method4038(float f, float f_1_, float f_2_, byte i) throws Exception_Sub3 {
		if (!method4087((byte) 92))
			throw new Exception_Sub3();
		aFloat3396 = f;
		aFloat3383 = f_1_;
		aFloat3384 = f_2_;
	}

	public void method4039(Class436 class436, int i) throws Exception_Sub3 {
		if (!method4087((byte) 62) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3375.method5272(class436);
	}

	public void method4040(Class436 class436, byte i) throws Exception_Sub3 {
		if (!method4087((byte) 51) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3374.method5272(class436);
	}

	public void method4041(Class436 class436) throws Exception_Sub3 {
		if (!method4087((byte) 103) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3378.method5272(class436);
	}

	public void method4042(Class436 class436, float f, byte i) throws Exception_Sub3 {
		if (!method4087((byte) 109) || aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3386.method5272(class436);
		aFloat3388 = f;
	}

	public void method4043(float f, float f_3_, int i) throws Exception_Sub3 {
		if (!method4087((byte) 80))
			throw new Exception_Sub3();
		if (f < 1.0F)
			f = 50.0F;
		if (f_3_ < 1.0F)
			f_3_ = 10000.0F;
		if (f >= f_3_)
			throw new Exception_Sub3();
		aFloat3389 = f;
		aFloat3368 = f_3_;
	}

	Class301(Class289 class289, Interface32 interface32) {
		aFloat3364 = 10.0F;
		aFloat3381 = 1.0F;
		aFloat3396 = 5120.0F;
		aFloat3383 = 10.0F;
		aFloat3384 = 1.0F;
		aClass436_3385 = new Class436();
		aClass436_3386 = new Class436();
		anInt3394 = 0;
		aFloat3390 = 1.0F;
		aClass4_3399 = new Class4(8);
		aClass289_3369 = class289;
		anInterface32_3370 = interface32;
		method4028(true, (byte) 39);
	}

	public void method4044(int i, float f, int i_4_) throws Exception_Sub3 {
		if (!method4087((byte) 53) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		anInt3394 = 734446143 * i;
		aFloat3390 = f;
	}

	public void method4045(float f, float f_5_, int i) throws Exception_Sub3 {
		if (!method4087((byte) 78))
			throw new Exception_Sub3();
		aFloat3393 = f;
		aFloat3398 = f_5_;
	}

	public Class536_Sub18_Sub18 method4046(int i, int i_6_) {
		return (Class536_Sub18_Sub18) aClass4_3399.method556((long) i);
	}

	public void method4047(byte i) {
		aClass4_3399.method561(-2117553523);
	}

	public void method4048(Class436 class436, float f, int i) throws Exception_Sub3 {
		if (!method4087((byte) 116) || aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3385.method5272(class436);
		aClass436_3386.method5272(class436);
		aFloat3380 = f;
		aFloat3388 = f;
	}

	public void method4049(Class305 class305, Class433 class433, Class443 class443, int i, int i_7_, int i_8_) {
		if (method4091((byte) 8)) {
			aClass706_3397.method8278(class305, class433, i, i_7_, aClass333_3367.method4346(2097091261), -1163485255);
			aClass333_3367.method4340(class305, i, i_7_, 359786978);
			if (aClass302_3365 == Class302.aClass302_3402)
				class443.method5349(aFloat3389, aFloat3368, aFloat3393, aFloat3398);
			else
				class443.method5369(aFloat3389, aFloat3368, (float) (anInt3376 * 590059077));
			Iterator iterator = aClass4_3399.iterator();
			while (iterator.hasNext()) {
				Class536_Sub18_Sub18 class536_sub18_sub18 = (Class536_Sub18_Sub18) iterator.next();
				class536_sub18_sub18.method10803(class305, class433, class443, (short) 31904);
			}
		}
	}

	public Class293 method4050(int i) {
		return aClass293_3372;
	}

	public Class333 method4051(int i) {
		return aClass333_3367;
	}

	public Class706 method4052(int i) {
		return aClass706_3397;
	}

	public void method4053(boolean bool, float f, Class436 class436, Class425 class425, Class436 class436_9_, Class436 class436_10_, int i) {
		if (aClass298_3379 == Class298.aClass298_3346)
			Class393.method4876(f, class436, class436_9_, class436_10_, bool ? aClass436_3378 : aClass436_3377, bool ? aClass436_3375 : aClass436_3374, (float) (-714068545 * anInt3394), aFloat3390, aFloat3396, aFloat3383, 1359271176);
		else if (aClass298_3379 == Class298.aClass298_3345)
			Class281.method3761(f, class436, class425, class436_9_, class436_10_, bool ? aClass436_3378 : aClass436_3377, bool ? aClass436_3375 : aClass436_3374, (float) (anInt3394 * -714068545), aFloat3390, aFloat3396, aFloat3383, -1411515212);
		else if (aClass298_3379 == Class298.aClass298_3344)
			Class470.method5706(f, class436, class425, class436_9_, class436_10_, bool ? aClass436_3386 : aClass436_3385, bool ? aFloat3388 : aFloat3380, aFloat3396, aFloat3384, 2061623357);
	}

	public Class290 method4054(int i) {
		return aClass290_3371;
	}

	public Class436 method4055(byte i) {
		if (aClass333_3367 == null || !aClass333_3367.method4342(-1538232466))
			return null;
		return aClass333_3367.method4343((byte) -12);
	}

	public void method4056(float f, int i) throws Exception_Sub3 {
		if (!method4087((byte) 77))
			throw new Exception_Sub3();
	}

	public Class536_Sub30 method4057(int i) {
		if (null == aClass333_3367 || !aClass333_3367.method4342(-1999946388))
			return null;
		return aClass333_3367.method4353(-1593626464);
	}

	public float method4058(byte i) {
		Class436 class436 = method4055((byte) 5);
		Class436 class436_11_ = method4086(-1650053008);
		float f = 0.0F;
		if (class436 != null && class436_11_ != null) {
			Class436 class436_12_ = Class436.method5252(class436_11_, class436);
			float f_13_ = (float) Math.sqrt((double) ((class436_12_.aFloat4850 * class436_12_.aFloat4850) + (class436_12_.aFloat4853 * class436_12_.aFloat4853)));
			f = (float) Math.atan2((double) -class436_12_.aFloat4852, (double) f_13_);
			class436.method5239();
			class436_11_.method5239();
		}
		return f;
	}

	public void method4059(int i) {
		Class536_Sub18_Sub18 class536_sub18_sub18 = (Class536_Sub18_Sub18) aClass4_3399.method556((long) i);
		if (null != class536_sub18_sub18)
			class536_sub18_sub18.method6484();
	}

	float method4060(byte i) {
		return 0.0F;
	}

	public Class425 method4061(int i) {
		Class425 class425 = Class425.method5081();
		class425.method5088(method4092((byte) 20), method4058((byte) -114), method4060((byte) 58));
		return class425;
	}

	public Class300 method4062(int i) {
		return aClass300_3366;
	}

	public void method4063(Class536_Sub18_Sub18 class536_sub18_sub18, int i) {
		aClass4_3399.method560(class536_sub18_sub18, (long) (class536_sub18_sub18.anInt11824 * 1164011507));
	}

	public void method4064(int i) throws Exception_Sub3 {
		if (!method4087((byte) 96))
			throw new Exception_Sub3();
		aFloat3396 = 5120.0F;
		aFloat3383 = 10.0F;
		aFloat3384 = 1.0F;
	}

	public Class436 method4065(int i) {
		return aClass436_3374;
	}

	public float method4066(int i) {
		return aFloat3368;
	}

	public boolean method4067(int i) {
		return aBool3363;
	}

	public void method4068(boolean bool) {
		aClass302_3365 = Class302.aClass302_3402;
		aClass300_3366 = null;
		aClass706_3397 = null;
		aClass290_3371 = null;
		aClass333_3367 = null;
		if (aClass289_3369 == Class289.aClass289_3214 || !bool)
			aClass293_3372 = Class293.aClass293_3247;
		else
			aClass293_3372 = Class293.aClass293_3246;
		aClass298_3379 = Class298.aClass298_3345;
		aClass436_3374.method5243(100.0F, 100.0F, 100.0F);
		aClass436_3375.method5243(100.0F, 100.0F, 100.0F);
		aFloat3373 = 0.05F;
		aClass436_3377.method5243(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass436_3378.method5243(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass436_3385.method5243(1.0F, 1.0F, 1.0F);
		aClass436_3386.method5243(1.0F, 1.0F, 1.0F);
		aFloat3380 = 1.1F;
		aFloat3388 = 1.1F;
		aFloat3389 = 50.0F;
		aFloat3368 = 10000.0F;
		aFloat3398 = 1.5707964F;
		aFloat3393 = 1.5707964F;
		anInt3376 = -432849215;
		aBool3395 = true;
		aBool3363 = true;
		anInt3394 = 0;
		aFloat3390 = 1.0F;
		aClass4_3399.method561(-2117553523);
	}

	public float method4069(int i) {
		return aFloat3389;
	}

	public void method4070(float f, int[][][] is, Class455 class455, int i, int i_14_, int i_15_) {
		if (aClass706_3397 != null)
			aClass706_3397.method8286(f, -805398525);
		if (null != aClass333_3367)
			aClass333_3367.method4345(f, is, class455, i, i_14_, 65535);
		Iterator iterator = aClass4_3399.iterator();
		while (iterator.hasNext()) {
			Class536_Sub18_Sub18 class536_sub18_sub18 = (Class536_Sub18_Sub18) iterator.next();
			class536_sub18_sub18.method10804(f, 65536);
		}
	}

	public float method4071(int i) {
		return aFloat3393;
	}

	boolean method4072() {
		if (Class289.aClass289_3214 == aClass289_3369 && Class293.aClass293_3247 == aClass293_3372)
			return true;
		if (aClass289_3369 == Class289.aClass289_3213 && aClass293_3372 == Class293.aClass293_3246)
			return true;
		return false;
	}

	boolean method4073() {
		if (Class289.aClass289_3214 == aClass289_3369 && Class293.aClass293_3247 == aClass293_3372)
			return true;
		if (aClass289_3369 == Class289.aClass289_3213 && aClass293_3372 == Class293.aClass293_3246)
			return true;
		return false;
	}

	public void method4074(float f) throws Exception_Sub3 {
		if (!method4087((byte) 101))
			throw new Exception_Sub3();
	}

	public void method4075(int i) {
		Class536_Sub18_Sub18 class536_sub18_sub18 = (Class536_Sub18_Sub18) aClass4_3399.method556((long) i);
		if (null != class536_sub18_sub18)
			class536_sub18_sub18.method6484();
	}

	public void method4076(Class436 class436) throws Exception_Sub3 {
		if (!method4087((byte) 48) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3378.method5272(class436);
	}

	public void method4077(Class436 class436) throws Exception_Sub3 {
		if (!method4087((byte) 90) || !aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3378.method5272(class436);
	}

	public void method4078() throws Exception_Sub3 {
		if (!method4087((byte) 101))
			throw new Exception_Sub3();
		aFloat3396 = 5120.0F;
		aFloat3383 = 10.0F;
		aFloat3384 = 1.0F;
	}

	public void method4079(int i) {
		Class536_Sub18_Sub18 class536_sub18_sub18 = (Class536_Sub18_Sub18) aClass4_3399.method556((long) i);
		if (null != class536_sub18_sub18)
			class536_sub18_sub18.method6484();
	}

	public Interface32 method4080(int i) {
		return anInterface32_3370;
	}

	public float method4081(byte i) {
		return aFloat3373;
	}

	public Class706 method4082(Class300 class300, boolean bool, byte i) throws Exception_Sub3 {
		if (aClass293_3372 == Class293.aClass293_3247 && !bool)
			throw new Exception_Sub3();
		aClass300_3366 = class300;
		if (class300 == Class300.aClass300_3360)
			aClass706_3397 = new Class706_Sub2(this);
		else if (class300 == Class300.aClass300_3357)
			aClass706_3397 = new Class706_Sub3(this);
		else if (class300 == Class300.aClass300_3355)
			aClass706_3397 = new Class706_Sub1(this);
		else if (class300 == Class300.aClass300_3356)
			aClass706_3397 = new Class706_Sub4_Sub1(this);
		else if (class300 == Class300.aClass300_3358)
			aClass706_3397 = new Class706_Sub4_Sub3(this);
		else if (Class300.aClass300_3359 == class300)
			aClass706_3397 = new Class706_Sub5(this);
		else if (Class300.aClass300_3361 == class300)
			aClass706_3397 = new Class706_Sub4_Sub2(this);
		return aClass706_3397;
	}

	public Class436 method4083(int i) {
		return aClass436_3377;
	}

	public void method4084(Class436 class436, float f, short i) throws Exception_Sub3 {
		if (!method4087((byte) 30) || aClass298_3379.aBool3348)
			throw new Exception_Sub3();
		aClass436_3385.method5272(class436);
		aFloat3380 = f;
	}

	public double[] method4085(int i) {
		if (null == aClass333_3367 || !aClass333_3367.method4342(-2110019635))
			return null;
		return aClass333_3367.method4344(-853598305);
	}

	public Class436 method4086(int i) {
		if (aClass706_3397 == null || !aClass706_3397.method8295((byte) 74))
			return null;
		return aClass706_3397.method8279(459796660);
	}

	boolean method4087(byte i) {
		if (Class289.aClass289_3214 == aClass289_3369 && Class293.aClass293_3247 == aClass293_3372)
			return true;
		if (aClass289_3369 == Class289.aClass289_3213 && aClass293_3372 == Class293.aClass293_3246)
			return true;
		return false;
	}

	public void method4088(boolean bool) {
		aClass302_3365 = Class302.aClass302_3402;
		aClass300_3366 = null;
		aClass706_3397 = null;
		aClass290_3371 = null;
		aClass333_3367 = null;
		if (aClass289_3369 == Class289.aClass289_3214 || !bool)
			aClass293_3372 = Class293.aClass293_3247;
		else
			aClass293_3372 = Class293.aClass293_3246;
		aClass298_3379 = Class298.aClass298_3345;
		aClass436_3374.method5243(100.0F, 100.0F, 100.0F);
		aClass436_3375.method5243(100.0F, 100.0F, 100.0F);
		aFloat3373 = 0.05F;
		aClass436_3377.method5243(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass436_3378.method5243(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass436_3385.method5243(1.0F, 1.0F, 1.0F);
		aClass436_3386.method5243(1.0F, 1.0F, 1.0F);
		aFloat3380 = 1.1F;
		aFloat3388 = 1.1F;
		aFloat3389 = 50.0F;
		aFloat3368 = 10000.0F;
		aFloat3398 = 1.5707964F;
		aFloat3393 = 1.5707964F;
		anInt3376 = -432849215;
		aBool3395 = true;
		aBool3363 = true;
		anInt3394 = 0;
		aFloat3390 = 1.0F;
		aClass4_3399.method561(-2117553523);
	}

	public void method4089(int i, byte i_16_) {
		Class536_Sub18_Sub18 class536_sub18_sub18 = (Class536_Sub18_Sub18) aClass4_3399.method556((long) i);
		if (null != class536_sub18_sub18)
			class536_sub18_sub18.method6484();
	}

	public boolean method4090(int i) {
		return aBool3395;
	}

	public boolean method4091(byte i) {
		if (null == aClass706_3397 || aClass333_3367 == null)
			return false;
		if (!aClass706_3397.method8295((byte) 45))
			return false;
		if (!aClass333_3367.method4342(-1518527100))
			return false;
		return true;
	}

	public float method4092(byte i) {
		Class436 class436 = method4055((byte) 5);
		Class436 class436_17_ = method4086(-1843714509);
		float f = 0.0F;
		if (null != class436 && null != class436_17_) {
			Class436 class436_18_ = Class436.method5252(class436, class436_17_);
			class436_18_.aFloat4852 = 0.0F;
			f = (float) Math.atan2((double) class436_18_.aFloat4850, (double) class436_18_.aFloat4853);
			class436.method5239();
			class436_17_.method5239();
		}
		return (float) (3.141592653589793 - (double) f);
	}

	public static String method4093(Class536_Sub18_Sub9 class536_sub18_sub9, byte i) {
		if (Class70.aBool752 || null == class536_sub18_sub9)
			return "";
		if ((null == class536_sub18_sub9.aString11712 || class536_sub18_sub9.aString11712.length() == 0) && null != class536_sub18_sub9.aString11707 && class536_sub18_sub9.aString11707.length() > 0)
			return class536_sub18_sub9.aString11707;
		return class536_sub18_sub9.aString11712;
	}

	static final void method4094(Class668 class668, int i) {
		if (client.aString11137 != null)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class639.method7664(client.aString11137, (byte) -63);
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}

	static void method4095(IComponentDefinitions class251, int i, int i_19_, int i_20_) {
		Class244 class244 = class251.method3478(Class677.aClass167_8609, 664090227);
		if (class244 != null) {
			Class677.aClass167_8609.method2369(i, i_19_, i + (class251.anInt2573 * -1606950689), (class251.anInt2574 * 223822141 + i_19_));
			if (2131718319 * Class101.anInt1200 < 3) {
				int i_21_;
				if (155362615 * Class246.anInt2474 == 2)
					i_21_ = (int) -((double) Class683.aClass301_Sub1_8651.method4092((byte) -12) * 2607.5945876176133);
				else
					i_21_ = (int) -client.aFloat11106;
				i_21_ = 272149150 * client.anInt11096 + i_21_ & 0x3fff;
				i_21_ <<= 2;
				Class618.aClass143_8090.method1738(((float) (class251.anInt2573 * -1606950689) / 2.0F + (float) i), ((float) (223822141 * class251.anInt2574) / 2.0F + (float) i_19_), 4185, i_21_, class244.aClass161_2463, i, i_19_);
			} else
				Class677.aClass167_8609.method2088(-16777216, class244.aClass161_2463, i, i_19_);
		}
	}

	static final void method4096(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		long l = Class604.method7204(-137273292);
		if (0L == l)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 5;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class638.method7651(l, string, (byte) 23);
	}
}

/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class296 {
	int anInt3348;
	Class306 aClass306_3349;
	Class307 aClass307_3350;
	public static final float aFloat3351 = Float.POSITIVE_INFINITY;
	static final int anInt3352 = 50;
	Class301 aClass301_3353;
	Class327 aClass327_3354;
	Interface30 anInterface30_3355;
	Class303 aClass303_3356;
	int anInt3357;
	Class442 aClass442_3358 = new Class442();
	boolean aBool3359;
	Class14 aClass14_3360;
	Class288 aClass288_3361;
	Class442 aClass442_3362;
	Class442 aClass442_3363;
	float aFloat3364 = 5120.0F;
	float aFloat3365 = 10.0F;
	Class442 aClass442_3366 = new Class442();
	float aFloat3367;
	float aFloat3368;
	float aFloat3369;
	Class442 aClass442_3370;
	Class442 aClass442_3371;
	float aFloat3372;
	float aFloat3373;
	float aFloat3374;
	float aFloat3375;
	Class309 aClass309_3376;
	static final int anInt3377 = 10000;
	float aFloat3378;
	Class696 aClass696_3379;
	boolean aBool3380;
	float aFloat3381;
	float aFloat3382;
	float aFloat3383;
	float aFloat3384 = 1.0F;
	public static int anInt3385;

	public double[] method5341(int i) {
		if (aClass327_3354 == null || !aClass327_3354.method5780((short) 9340))
			return null;
		return aClass327_3354.method5782(-1092746250);
	}

	public Class438 method5342() {
		Class438 class438 = Class438.method7020();
		class438.method7030(method5382(-2000325719), method5381(82769080), method5383(1755905710));
		return class438;
	}

	public void method5343(float f, int[][][] is, Class470 class470, int i, int i_0_, byte i_1_) {
		if (null != aClass696_3379)
			aClass696_3379.method14250(f, 2048606439);
		if (null != aClass327_3354)
			aClass327_3354.method5798(f, is, class470, i, i_0_, -2118182098);
		Iterator iterator = aClass14_3360.iterator();
		while (iterator.hasNext()) {
			Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
			class527_sub8_sub15.method18353(f, 3568762);
		}
	}

	public void method5344(boolean bool, float f, Class442 class442, Class438 class438, Class442 class442_2_, Class442 class442_3_, int i) {
		if (Class303.aClass303_3426 == aClass303_3356)
			Class494.method8123(f, class442, class442_2_, class442_3_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (anInt3348 * 495500587), aFloat3383, aFloat3367, aFloat3368, 305624395);
		else if (aClass303_3356 == Class303.aClass303_3423)
			Class245.method4626(f, class442, class438, class442_2_, class442_3_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (495500587 * anInt3348), aFloat3383, aFloat3367, aFloat3368, -2080392837);
		else if (aClass303_3356 == Class303.aClass303_3424)
			Class191.method3684(f, class442, class438, class442_2_, class442_3_, bool ? aClass442_3371 : aClass442_3370, bool ? aFloat3373 : aFloat3381, aFloat3367, aFloat3369, -838803134);
	}

	public void method5345(Class306 class306, int i) {
		aClass306_3349 = class306;
	}

	public Class696 method5346(Class309 class309, boolean bool, int i) throws Exception_Sub6 {
		if (Class306.aClass306_3440 == aClass306_3349 && !bool)
			throw new Exception_Sub6();
		aClass309_3376 = class309;
		if (class309 == Class309.aClass309_3455)
			aClass696_3379 = new Class696_Sub3(this);
		else if (Class309.aClass309_3459 == class309)
			aClass696_3379 = new Class696_Sub2(this);
		else if (class309 == Class309.aClass309_3456)
			aClass696_3379 = new Class696_Sub1(this);
		else if (class309 == Class309.aClass309_3457)
			aClass696_3379 = new Class696_Sub4_Sub2(this);
		else if (Class309.aClass309_3463 == class309)
			aClass696_3379 = new Class696_Sub4_Sub3(this);
		else if (Class309.aClass309_3460 == class309)
			aClass696_3379 = new Class696_Sub5(this);
		else if (Class309.aClass309_3461 == class309)
			aClass696_3379 = new Class696_Sub4_Sub1(this);
		return aClass696_3379;
	}

	public Class327 method5347(Class301 class301, boolean bool, int i) throws Exception_Sub6 {
		if (aClass306_3349 == Class306.aClass306_3440 && !bool)
			throw new Exception_Sub6();
		aClass301_3353 = class301;
		if (class301 == Class301.aClass301_3418)
			aClass327_3354 = new Class327_Sub2(this);
		else if (Class301.aClass301_3413 == class301)
			aClass327_3354 = new Class327_Sub1(this);
		else if (Class301.aClass301_3414 == class301)
			aClass327_3354 = new Class327_Sub3_Sub1(this);
		else if (Class301.aClass301_3415 == class301)
			aClass327_3354 = new Class327_Sub3_Sub3(this);
		else if (class301 == Class301.aClass301_3416)
			aClass327_3354 = new Class327_Sub3_Sub2(this);
		return aClass327_3354;
	}

	boolean method5348(int i) {
		if (Class288.aClass288_3218 == aClass288_3361 && aClass306_3349 == Class306.aClass306_3440)
			return true;
		if (Class288.aClass288_3219 == aClass288_3361 && aClass306_3349 == Class306.aClass306_3441)
			return true;
		return false;
	}

	public void method5349(float f, byte i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
	}

	public void method5350(float f, int i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3372 = f;
	}

	public void method5351(boolean bool, float f, Class442 class442, Class438 class438, Class442 class442_4_, Class442 class442_5_) {
		if (Class303.aClass303_3426 == aClass303_3356)
			Class494.method8123(f, class442, class442_4_, class442_5_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (anInt3348 * 495500587), aFloat3383, aFloat3367, aFloat3368, 305624395);
		else if (aClass303_3356 == Class303.aClass303_3423)
			Class245.method4626(f, class442, class438, class442_4_, class442_5_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (495500587 * anInt3348), aFloat3383, aFloat3367, aFloat3368, -2080392837);
		else if (aClass303_3356 == Class303.aClass303_3424)
			Class191.method3684(f, class442, class438, class442_4_, class442_5_, bool ? aClass442_3371 : aClass442_3370, bool ? aFloat3373 : aFloat3381, aFloat3367, aFloat3369, 1493761680);
	}

	public void method5352(Class442 class442, int i) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3362.method7146(class442);
	}

	public void method5353(Class442 class442, byte i) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3363.method7146(class442);
	}

	public float method5354(int i) {
		return aFloat3372;
	}

	public Class309 method5355() {
		return aClass309_3376;
	}

	public void method5356(Class442 class442, int i) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3358.method7146(class442);
	}

	public void method5357(Class442 class442, byte i) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3366.method7146(class442);
	}

	public Class696 method5358() {
		return aClass696_3379;
	}

	public Class306 method5359(byte i) {
		return aClass306_3349;
	}

	public void method5360(boolean bool) {
		aClass307_3350 = Class307.aClass307_3444;
		aClass309_3376 = null;
		aClass696_3379 = null;
		aClass301_3353 = null;
		aClass327_3354 = null;
		if (aClass288_3361 == Class288.aClass288_3218 || !bool)
			aClass306_3349 = Class306.aClass306_3440;
		else
			aClass306_3349 = Class306.aClass306_3441;
		aClass303_3356 = Class303.aClass303_3423;
		aClass442_3358.method7138(100.0F, 100.0F, 100.0F);
		aClass442_3366.method7138(100.0F, 100.0F, 100.0F);
		aFloat3372 = 0.05F;
		aClass442_3362.method7138(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass442_3363.method7138(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass442_3370.method7138(1.0F, 1.0F, 1.0F);
		aClass442_3371.method7138(1.0F, 1.0F, 1.0F);
		aFloat3381 = 1.1F;
		aFloat3373 = 1.1F;
		aFloat3374 = 50.0F;
		aFloat3375 = 10000.0F;
		aFloat3382 = 1.5707964F;
		aFloat3378 = 1.5707964F;
		anInt3357 = -1018844845;
		aBool3380 = true;
		aBool3359 = true;
		anInt3348 = 0;
		aFloat3383 = 1.0F;
		aClass14_3360.method721(-1089877340);
	}

	public Class696 method5361(Class309 class309, boolean bool) throws Exception_Sub6 {
		if (Class306.aClass306_3440 == aClass306_3349 && !bool)
			throw new Exception_Sub6();
		aClass309_3376 = class309;
		if (class309 == Class309.aClass309_3455)
			aClass696_3379 = new Class696_Sub3(this);
		else if (Class309.aClass309_3459 == class309)
			aClass696_3379 = new Class696_Sub2(this);
		else if (class309 == Class309.aClass309_3456)
			aClass696_3379 = new Class696_Sub1(this);
		else if (class309 == Class309.aClass309_3457)
			aClass696_3379 = new Class696_Sub4_Sub2(this);
		else if (Class309.aClass309_3463 == class309)
			aClass696_3379 = new Class696_Sub4_Sub3(this);
		else if (Class309.aClass309_3460 == class309)
			aClass696_3379 = new Class696_Sub5(this);
		else if (Class309.aClass309_3461 == class309)
			aClass696_3379 = new Class696_Sub4_Sub1(this);
		return aClass696_3379;
	}

	public Interface30 method5362() {
		return anInterface30_3355;
	}

	public void method5363(boolean bool, boolean bool_6_, int i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aBool3380 = bool;
		aBool3359 = bool_6_;
	}

	public float method5364() {
		return aFloat3375;
	}

	public void method5365(Class306 class306) {
		aClass306_3349 = class306;
	}

	public void method5366(int i, int i_7_) {
		Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) aClass14_3360.method709((long) i);
		if (class527_sub8_sub15 != null)
			class527_sub8_sub15.method8735(-1889161967);
	}

	public void method5367(Class303 class303, byte i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aClass303_3356 = class303;
	}

	public void method5368(int i) {
		aClass14_3360.method721(-1678138493);
	}

	public boolean method5369(byte i) {
		if (aClass696_3379 == null || aClass327_3354 == null)
			return false;
		if (!aClass696_3379.method14244(-345211308))
			return false;
		if (!aClass327_3354.method5780((short) 23869))
			return false;
		return true;
	}

	public void method5370(Class302 class302, Class432 class432, Class427 class427, int i, int i_8_, int i_9_) {
		if (method5369((byte) -1)) {
			aClass696_3379.method14243(class302, class432, i, i_8_, aClass327_3354.method5797((byte) 0), 231411393);
			aClass327_3354.method5785(class302, i, i_8_, (byte) 22);
			if (aClass307_3350 == Class307.aClass307_3444)
				class427.method6738(aFloat3374, aFloat3375, aFloat3378, aFloat3382);
			else
				class427.method6759(aFloat3374, aFloat3375, (float) (-889811385 * anInt3357));
			Iterator iterator = aClass14_3360.iterator();
			while (iterator.hasNext()) {
				Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
				class527_sub8_sub15.method18354(class302, class432, class427, 1922570848);
			}
		}
	}

	public boolean method5371(int i) {
		return aBool3380;
	}

	public Class327 method5372(byte i) {
		return aClass327_3354;
	}

	public void method5373() throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3367 = 5120.0F;
		aFloat3368 = 10.0F;
		aFloat3369 = 1.0F;
	}

	public Interface30 method5374(int i) {
		return anInterface30_3355;
	}

	public boolean method5375() {
		if (aClass696_3379 == null || aClass327_3354 == null)
			return false;
		if (!aClass696_3379.method14244(-229483336))
			return false;
		if (!aClass327_3354.method5780((short) 20207))
			return false;
		return true;
	}

	public Class301 method5376(byte i) {
		return aClass301_3353;
	}

	public Class442 method5377(int i) {
		if (null == aClass327_3354 || !aClass327_3354.method5780((short) 23565))
			return null;
		return aClass327_3354.method5781(223829532);
	}

	public Class309 method5378(byte i) {
		return aClass309_3376;
	}

	public Class442 method5379(int i) {
		if (aClass696_3379 == null || !aClass696_3379.method14244(1332209465))
			return null;
		return aClass696_3379.method14245((byte) 27);
	}

	public Class527_Sub36 method5380(byte i) {
		if (aClass327_3354 == null || !aClass327_3354.method5780((short) 28782))
			return null;
		return aClass327_3354.method5783(-1607218425);
	}

	public float method5381(int i) {
		Class442 class442 = method5377(-1513734468);
		Class442 class442_10_ = method5379(1802010543);
		float f = 0.0F;
		if (null != class442 && class442_10_ != null) {
			Class442 class442_11_ = Class442.method7155(class442_10_, class442);
			float f_12_ = (float) Math.sqrt((double) ((class442_11_.aFloat4918 * class442_11_.aFloat4918) + (class442_11_.aFloat4919 * class442_11_.aFloat4919)));
			f = (float) Math.atan2((double) -class442_11_.aFloat4915, (double) f_12_);
			class442.method7141();
			class442_10_.method7141();
		}
		return f;
	}

	public float method5382(int i) {
		Class442 class442 = method5377(-1687120637);
		Class442 class442_13_ = method5379(1846360762);
		float f = 0.0F;
		if (null != class442 && null != class442_13_) {
			Class442 class442_14_ = Class442.method7155(class442, class442_13_);
			class442_14_.aFloat4915 = 0.0F;
			f = (float) Math.atan2((double) class442_14_.aFloat4918, (double) class442_14_.aFloat4919);
			class442.method7141();
			class442_13_.method7141();
		}
		return (float) (3.141592653589793 - (double) f);
	}

	float method5383(int i) {
		return 0.0F;
	}

	public Class438 method5384(int i) {
		Class438 class438 = Class438.method7020();
		class438.method7030(method5382(-1292369079), method5381(-1052137395), method5383(2130303013));
		return class438;
	}

	public void method5385(Class303 class303) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aClass303_3356 = class303;
	}

	public void method5386(Class303 class303) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aClass303_3356 = class303;
	}

	public void method5387(boolean bool, int i) {
		aClass307_3350 = Class307.aClass307_3444;
		aClass309_3376 = null;
		aClass696_3379 = null;
		aClass301_3353 = null;
		aClass327_3354 = null;
		if (aClass288_3361 == Class288.aClass288_3218 || !bool)
			aClass306_3349 = Class306.aClass306_3440;
		else
			aClass306_3349 = Class306.aClass306_3441;
		aClass303_3356 = Class303.aClass303_3423;
		aClass442_3358.method7138(100.0F, 100.0F, 100.0F);
		aClass442_3366.method7138(100.0F, 100.0F, 100.0F);
		aFloat3372 = 0.05F;
		aClass442_3362.method7138(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass442_3363.method7138(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass442_3370.method7138(1.0F, 1.0F, 1.0F);
		aClass442_3371.method7138(1.0F, 1.0F, 1.0F);
		aFloat3381 = 1.1F;
		aFloat3373 = 1.1F;
		aFloat3374 = 50.0F;
		aFloat3375 = 10000.0F;
		aFloat3382 = 1.5707964F;
		aFloat3378 = 1.5707964F;
		anInt3357 = -1018844845;
		aBool3380 = true;
		aBool3359 = true;
		anInt3348 = 0;
		aFloat3383 = 1.0F;
		aClass14_3360.method721(-2008269133);
	}

	public Class442 method5388(byte i) {
		return aClass442_3358;
	}

	public Class442 method5389(int i) {
		return aClass442_3366;
	}

	public float method5390(int i) {
		return aFloat3374;
	}

	public float method5391(byte i) {
		return aFloat3375;
	}

	public float method5392(int i) {
		return aFloat3378;
	}

	public void method5393(Class527_Sub8_Sub15 class527_sub8_sub15) {
		aClass14_3360.method714(class527_sub8_sub15, (long) (class527_sub8_sub15.anInt11779 * 575434551));
	}

	public boolean method5394() {
		if (aClass696_3379 == null || aClass327_3354 == null)
			return false;
		if (!aClass696_3379.method14244(-747462282))
			return false;
		if (!aClass327_3354.method5780((short) 32464))
			return false;
		return true;
	}

	public void method5395(boolean bool) {
		aClass307_3350 = Class307.aClass307_3444;
		aClass309_3376 = null;
		aClass696_3379 = null;
		aClass301_3353 = null;
		aClass327_3354 = null;
		if (aClass288_3361 == Class288.aClass288_3218 || !bool)
			aClass306_3349 = Class306.aClass306_3440;
		else
			aClass306_3349 = Class306.aClass306_3441;
		aClass303_3356 = Class303.aClass303_3423;
		aClass442_3358.method7138(100.0F, 100.0F, 100.0F);
		aClass442_3366.method7138(100.0F, 100.0F, 100.0F);
		aFloat3372 = 0.05F;
		aClass442_3362.method7138(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass442_3363.method7138(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass442_3370.method7138(1.0F, 1.0F, 1.0F);
		aClass442_3371.method7138(1.0F, 1.0F, 1.0F);
		aFloat3381 = 1.1F;
		aFloat3373 = 1.1F;
		aFloat3374 = 50.0F;
		aFloat3375 = 10000.0F;
		aFloat3382 = 1.5707964F;
		aFloat3378 = 1.5707964F;
		anInt3357 = -1018844845;
		aBool3380 = true;
		aBool3359 = true;
		anInt3348 = 0;
		aFloat3383 = 1.0F;
		aClass14_3360.method721(-2112388230);
	}

	public void method5396(Class302 class302, Class432 class432, Class427 class427, int i, int i_15_) {
		if (method5369((byte) -1)) {
			aClass696_3379.method14243(class302, class432, i, i_15_, aClass327_3354.method5797((byte) 0), 598202590);
			aClass327_3354.method5785(class302, i, i_15_, (byte) 50);
			if (aClass307_3350 == Class307.aClass307_3444)
				class427.method6738(aFloat3374, aFloat3375, aFloat3378, aFloat3382);
			else
				class427.method6759(aFloat3374, aFloat3375, (float) (-889811385 * anInt3357));
			Iterator iterator = aClass14_3360.iterator();
			while (iterator.hasNext()) {
				Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
				class527_sub8_sub15.method18354(class302, class432, class427, -1302699619);
			}
		}
	}

	public void method5397(boolean bool, float f, Class442 class442, Class438 class438, Class442 class442_16_, Class442 class442_17_) {
		if (Class303.aClass303_3426 == aClass303_3356)
			Class494.method8123(f, class442, class442_16_, class442_17_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (anInt3348 * 495500587), aFloat3383, aFloat3367, aFloat3368, 305624395);
		else if (aClass303_3356 == Class303.aClass303_3423)
			Class245.method4626(f, class442, class438, class442_16_, class442_17_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (495500587 * anInt3348), aFloat3383, aFloat3367, aFloat3368, -2080392837);
		else if (aClass303_3356 == Class303.aClass303_3424)
			Class191.method3684(f, class442, class438, class442_16_, class442_17_, bool ? aClass442_3371 : aClass442_3370, bool ? aFloat3373 : aFloat3381, aFloat3367, aFloat3369, 232703029);
	}

	public float method5398() {
		return aFloat3372;
	}

	public void method5399(Class442 class442, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3370.method7146(class442);
		aFloat3381 = f;
	}

	public void method5400(boolean bool, float f, Class442 class442, Class438 class438, Class442 class442_18_, Class442 class442_19_) {
		if (Class303.aClass303_3426 == aClass303_3356)
			Class494.method8123(f, class442, class442_18_, class442_19_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (anInt3348 * 495500587), aFloat3383, aFloat3367, aFloat3368, 305624395);
		else if (aClass303_3356 == Class303.aClass303_3423)
			Class245.method4626(f, class442, class438, class442_18_, class442_19_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (495500587 * anInt3348), aFloat3383, aFloat3367, aFloat3368, -2080392837);
		else if (aClass303_3356 == Class303.aClass303_3424)
			Class191.method3684(f, class442, class438, class442_18_, class442_19_, bool ? aClass442_3371 : aClass442_3370, bool ? aFloat3373 : aFloat3381, aFloat3367, aFloat3369, 340847313);
	}

	public void method5401(Class306 class306) {
		aClass306_3349 = class306;
	}

	public Class527_Sub36 method5402() {
		if (aClass327_3354 == null || !aClass327_3354.method5780((short) 12713))
			return null;
		return aClass327_3354.method5783(-664050249);
	}

	public Class696 method5403(Class309 class309, boolean bool) throws Exception_Sub6 {
		if (Class306.aClass306_3440 == aClass306_3349 && !bool)
			throw new Exception_Sub6();
		aClass309_3376 = class309;
		if (class309 == Class309.aClass309_3455)
			aClass696_3379 = new Class696_Sub3(this);
		else if (Class309.aClass309_3459 == class309)
			aClass696_3379 = new Class696_Sub2(this);
		else if (class309 == Class309.aClass309_3456)
			aClass696_3379 = new Class696_Sub1(this);
		else if (class309 == Class309.aClass309_3457)
			aClass696_3379 = new Class696_Sub4_Sub2(this);
		else if (Class309.aClass309_3463 == class309)
			aClass696_3379 = new Class696_Sub4_Sub3(this);
		else if (Class309.aClass309_3460 == class309)
			aClass696_3379 = new Class696_Sub5(this);
		else if (Class309.aClass309_3461 == class309)
			aClass696_3379 = new Class696_Sub4_Sub1(this);
		return aClass696_3379;
	}

	public Class696 method5404(Class309 class309, boolean bool) throws Exception_Sub6 {
		if (Class306.aClass306_3440 == aClass306_3349 && !bool)
			throw new Exception_Sub6();
		aClass309_3376 = class309;
		if (class309 == Class309.aClass309_3455)
			aClass696_3379 = new Class696_Sub3(this);
		else if (Class309.aClass309_3459 == class309)
			aClass696_3379 = new Class696_Sub2(this);
		else if (class309 == Class309.aClass309_3456)
			aClass696_3379 = new Class696_Sub1(this);
		else if (class309 == Class309.aClass309_3457)
			aClass696_3379 = new Class696_Sub4_Sub2(this);
		else if (Class309.aClass309_3463 == class309)
			aClass696_3379 = new Class696_Sub4_Sub3(this);
		else if (Class309.aClass309_3460 == class309)
			aClass696_3379 = new Class696_Sub5(this);
		else if (Class309.aClass309_3461 == class309)
			aClass696_3379 = new Class696_Sub4_Sub1(this);
		return aClass696_3379;
	}

	public Class696 method5405(Class309 class309, boolean bool) throws Exception_Sub6 {
		if (Class306.aClass306_3440 == aClass306_3349 && !bool)
			throw new Exception_Sub6();
		aClass309_3376 = class309;
		if (class309 == Class309.aClass309_3455)
			aClass696_3379 = new Class696_Sub3(this);
		else if (Class309.aClass309_3459 == class309)
			aClass696_3379 = new Class696_Sub2(this);
		else if (class309 == Class309.aClass309_3456)
			aClass696_3379 = new Class696_Sub1(this);
		else if (class309 == Class309.aClass309_3457)
			aClass696_3379 = new Class696_Sub4_Sub2(this);
		else if (Class309.aClass309_3463 == class309)
			aClass696_3379 = new Class696_Sub4_Sub3(this);
		else if (Class309.aClass309_3460 == class309)
			aClass696_3379 = new Class696_Sub5(this);
		else if (Class309.aClass309_3461 == class309)
			aClass696_3379 = new Class696_Sub4_Sub1(this);
		return aClass696_3379;
	}

	public Interface30 method5406() {
		return anInterface30_3355;
	}

	boolean method5407() {
		if (Class288.aClass288_3218 == aClass288_3361 && aClass306_3349 == Class306.aClass306_3440)
			return true;
		if (Class288.aClass288_3219 == aClass288_3361 && aClass306_3349 == Class306.aClass306_3441)
			return true;
		return false;
	}

	public Class442 method5408() {
		return aClass442_3358;
	}

	public void method5409(float f) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
	}

	public void method5410(float f) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3372 = f;
	}

	public float method5411() {
		return aFloat3378;
	}

	public void method5412(Class442 class442, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3371.method7146(class442);
		aFloat3373 = f;
	}

	public void method5413(Class442 class442) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3366.method7146(class442);
	}

	public void method5414(Class303 class303) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aClass303_3356 = class303;
	}

	public Class442 method5415(int i) {
		return aClass442_3362;
	}

	public void method5416(Class442 class442) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3363.method7146(class442);
	}

	public void method5417(float f, float f_20_, float f_21_) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3367 = f;
		aFloat3368 = f_20_;
		aFloat3369 = f_21_;
	}

	public void method5418(float f, float f_22_, float f_23_) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3367 = f;
		aFloat3368 = f_22_;
		aFloat3369 = f_23_;
	}

	public void method5419() throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3367 = 5120.0F;
		aFloat3368 = 10.0F;
		aFloat3369 = 1.0F;
	}

	public Interface30 method5420() {
		return anInterface30_3355;
	}

	public Class442 method5421() {
		if (null == aClass327_3354 || !aClass327_3354.method5780((short) 16921))
			return null;
		return aClass327_3354.method5781(-433441522);
	}

	public void method5422(Class442 class442) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3358.method7146(class442);
	}

	public void method5423(Class442 class442) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3366.method7146(class442);
	}

	public void method5424(Class442 class442) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3366.method7146(class442);
	}

	Class296(Class288 class288, Interface30 interface30) {
		aClass442_3362 = new Class442();
		aClass442_3363 = new Class442();
		aFloat3364 = 5120.0F;
		aFloat3365 = 10.0F;
		aFloat3384 = 1.0F;
		aFloat3367 = 5120.0F;
		aFloat3368 = 10.0F;
		aFloat3369 = 1.0F;
		aClass442_3370 = new Class442();
		aClass442_3371 = new Class442();
		anInt3348 = 0;
		aFloat3383 = 1.0F;
		aClass14_3360 = new Class14(8);
		aClass288_3361 = class288;
		anInterface30_3355 = interface30;
		method5387(true, 1769813785);
	}

	public void method5425(Class442 class442, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3370.method7146(class442);
		aClass442_3371.method7146(class442);
		aFloat3381 = f;
		aFloat3373 = f;
	}

	public void method5426(Class442 class442, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3370.method7146(class442);
		aClass442_3371.method7146(class442);
		aFloat3381 = f;
		aFloat3373 = f;
	}

	public void method5427(Class442 class442, float f, int i) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3370.method7146(class442);
		aClass442_3371.method7146(class442);
		aFloat3381 = f;
		aFloat3373 = f;
	}

	public void method5428(Class442 class442, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3371.method7146(class442);
		aFloat3373 = f;
	}

	public void method5429(Class442 class442, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3371.method7146(class442);
		aFloat3373 = f;
	}

	public void method5430(Class442 class442, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3371.method7146(class442);
		aFloat3373 = f;
	}

	public void method5431(float f, float f_24_, int i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3378 = f;
		aFloat3382 = f_24_;
	}

	public void method5432(float f, float f_25_) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3378 = f;
		aFloat3382 = f_25_;
	}

	public void method5433(boolean bool, boolean bool_26_) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aBool3380 = bool;
		aBool3359 = bool_26_;
	}

	public void method5434(int i, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		anInt3348 = i * -1096148605;
		aFloat3383 = f;
	}

	public void method5435(int i, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		anInt3348 = i * -1096148605;
		aFloat3383 = f;
	}

	public void method5436(int i, float f) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		anInt3348 = i * -1096148605;
		aFloat3383 = f;
	}

	public void method5437(int i, float f, int i_27_) throws Exception_Sub6 {
		if (!method5348(728055770) || !aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		anInt3348 = i * -1096148605;
		aFloat3383 = f;
	}

	public void method5438(Class527_Sub8_Sub15 class527_sub8_sub15) {
		aClass14_3360.method714(class527_sub8_sub15, (long) (class527_sub8_sub15.anInt11779 * 575434551));
	}

	public void method5439(int i) {
		Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) aClass14_3360.method709((long) i);
		if (class527_sub8_sub15 != null)
			class527_sub8_sub15.method8735(-1889161967);
	}

	public Class527_Sub8_Sub15 method5440(int i) {
		return (Class527_Sub8_Sub15) aClass14_3360.method709((long) i);
	}

	public float method5441() {
		Class442 class442 = method5377(-1059031472);
		Class442 class442_28_ = method5379(1891674459);
		float f = 0.0F;
		if (null != class442 && class442_28_ != null) {
			Class442 class442_29_ = Class442.method7155(class442_28_, class442);
			float f_30_ = (float) Math.sqrt((double) ((class442_29_.aFloat4918 * class442_29_.aFloat4918) + (class442_29_.aFloat4919 * class442_29_.aFloat4919)));
			f = (float) Math.atan2((double) -class442_29_.aFloat4915, (double) f_30_);
			class442.method7141();
			class442_28_.method7141();
		}
		return f;
	}

	public void method5442() {
		aClass14_3360.method721(770765645);
	}

	public void method5443(Class442 class442, float f, int i) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3371.method7146(class442);
		aFloat3373 = f;
	}

	public Class442 method5444(int i) {
		return aClass442_3363;
	}

	public void method5445(Class527_Sub8_Sub15 class527_sub8_sub15, int i) {
		aClass14_3360.method714(class527_sub8_sub15, (long) (class527_sub8_sub15.anInt11779 * 575434551));
	}

	public void method5446(boolean bool, float f, Class442 class442, Class438 class438, Class442 class442_31_, Class442 class442_32_) {
		if (Class303.aClass303_3426 == aClass303_3356)
			Class494.method8123(f, class442, class442_31_, class442_32_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (anInt3348 * 495500587), aFloat3383, aFloat3367, aFloat3368, 305624395);
		else if (aClass303_3356 == Class303.aClass303_3423)
			Class245.method4626(f, class442, class438, class442_31_, class442_32_, bool ? aClass442_3363 : aClass442_3362, bool ? aClass442_3366 : aClass442_3358, (float) (495500587 * anInt3348), aFloat3383, aFloat3367, aFloat3368, -2080392837);
		else if (aClass303_3356 == Class303.aClass303_3424)
			Class191.method3684(f, class442, class438, class442_31_, class442_32_, bool ? aClass442_3371 : aClass442_3370, bool ? aFloat3373 : aFloat3381, aFloat3367, aFloat3369, 1106837891);
	}

	public void method5447(Class302 class302, Class432 class432, Class427 class427, int i, int i_33_) {
		if (method5369((byte) -1)) {
			aClass696_3379.method14243(class302, class432, i, i_33_, aClass327_3354.method5797((byte) 0), 839737782);
			aClass327_3354.method5785(class302, i, i_33_, (byte) 5);
			if (aClass307_3350 == Class307.aClass307_3444)
				class427.method6738(aFloat3374, aFloat3375, aFloat3378, aFloat3382);
			else
				class427.method6759(aFloat3374, aFloat3375, (float) (-889811385 * anInt3357));
			Iterator iterator = aClass14_3360.iterator();
			while (iterator.hasNext()) {
				Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
				class527_sub8_sub15.method18354(class302, class432, class427, 1124042983);
			}
		}
	}

	public Class327 method5448() {
		return aClass327_3354;
	}

	public Class327 method5449() {
		return aClass327_3354;
	}

	public void method5450(Class303 class303) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aClass303_3356 = class303;
	}

	public Interface30 method5451() {
		return anInterface30_3355;
	}

	public double[] method5452() {
		if (aClass327_3354 == null || !aClass327_3354.method5780((short) 27213))
			return null;
		return aClass327_3354.method5782(-2000159524);
	}

	public boolean method5453() {
		if (aClass696_3379 == null || aClass327_3354 == null)
			return false;
		if (!aClass696_3379.method14244(1452852330))
			return false;
		if (!aClass327_3354.method5780((short) 2990))
			return false;
		return true;
	}

	public void method5454() throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3367 = 5120.0F;
		aFloat3368 = 10.0F;
		aFloat3369 = 1.0F;
	}

	public boolean method5455(int i) {
		return aBool3359;
	}

	public Class309 method5456() {
		return aClass309_3376;
	}

	public Class301 method5457() {
		return aClass301_3353;
	}

	public Class301 method5458() {
		return aClass301_3353;
	}

	public Class301 method5459() {
		return aClass301_3353;
	}

	public Class442 method5460() {
		return aClass442_3358;
	}

	public Class527_Sub8_Sub15 method5461(int i) {
		return (Class527_Sub8_Sub15) aClass14_3360.method709((long) i);
	}

	public Class442 method5462() {
		if (aClass696_3379 == null || !aClass696_3379.method14244(-235183629))
			return null;
		return aClass696_3379.method14245((byte) 75);
	}

	public boolean method5463() {
		return aBool3380;
	}

	public Class527_Sub36 method5464() {
		if (aClass327_3354 == null || !aClass327_3354.method5780((short) 22110))
			return null;
		return aClass327_3354.method5783(-1192830203);
	}

	public void method5465(Class442 class442, float f, int i) throws Exception_Sub6 {
		if (!method5348(728055770) || aClass303_3356.aBool3422)
			throw new Exception_Sub6();
		aClass442_3370.method7146(class442);
		aFloat3381 = f;
	}

	public float method5466() {
		Class442 class442 = method5377(-1517253425);
		Class442 class442_34_ = method5379(2100940187);
		float f = 0.0F;
		if (null != class442 && null != class442_34_) {
			Class442 class442_35_ = Class442.method7155(class442, class442_34_);
			class442_35_.aFloat4915 = 0.0F;
			f = (float) Math.atan2((double) class442_35_.aFloat4918, (double) class442_35_.aFloat4919);
			class442.method7141();
			class442_34_.method7141();
		}
		return (float) (3.141592653589793 - (double) f);
	}

	public Class527_Sub36 method5467() {
		if (aClass327_3354 == null || !aClass327_3354.method5780((short) 28999))
			return null;
		return aClass327_3354.method5783(-289947284);
	}

	public float method5468() {
		Class442 class442 = method5377(-966845014);
		Class442 class442_36_ = method5379(2071662986);
		float f = 0.0F;
		if (null != class442 && class442_36_ != null) {
			Class442 class442_37_ = Class442.method7155(class442_36_, class442);
			float f_38_ = (float) Math.sqrt((double) ((class442_37_.aFloat4918 * class442_37_.aFloat4918) + (class442_37_.aFloat4919 * class442_37_.aFloat4919)));
			f = (float) Math.atan2((double) -class442_37_.aFloat4915, (double) f_38_);
			class442.method7141();
			class442_36_.method7141();
		}
		return f;
	}

	public float method5469() {
		Class442 class442 = method5377(-1868915306);
		Class442 class442_39_ = method5379(1698403997);
		float f = 0.0F;
		if (null != class442 && class442_39_ != null) {
			Class442 class442_40_ = Class442.method7155(class442_39_, class442);
			float f_41_ = (float) Math.sqrt((double) ((class442_40_.aFloat4918 * class442_40_.aFloat4918) + (class442_40_.aFloat4919 * class442_40_.aFloat4919)));
			f = (float) Math.atan2((double) -class442_40_.aFloat4915, (double) f_41_);
			class442.method7141();
			class442_39_.method7141();
		}
		return f;
	}

	public float method5470() {
		Class442 class442 = method5377(-1556549409);
		Class442 class442_42_ = method5379(1902810913);
		float f = 0.0F;
		if (null != class442 && class442_42_ != null) {
			Class442 class442_43_ = Class442.method7155(class442_42_, class442);
			float f_44_ = (float) Math.sqrt((double) ((class442_43_.aFloat4918 * class442_43_.aFloat4918) + (class442_43_.aFloat4919 * class442_43_.aFloat4919)));
			f = (float) Math.atan2((double) -class442_43_.aFloat4915, (double) f_44_);
			class442.method7141();
			class442_42_.method7141();
		}
		return f;
	}

	public float method5471() {
		Class442 class442 = method5377(-1862255446);
		Class442 class442_45_ = method5379(1948467118);
		float f = 0.0F;
		if (null != class442 && class442_45_ != null) {
			Class442 class442_46_ = Class442.method7155(class442_45_, class442);
			float f_47_ = (float) Math.sqrt((double) ((class442_46_.aFloat4918 * class442_46_.aFloat4918) + (class442_46_.aFloat4919 * class442_46_.aFloat4919)));
			f = (float) Math.atan2((double) -class442_46_.aFloat4915, (double) f_47_);
			class442.method7141();
			class442_45_.method7141();
		}
		return f;
	}

	public Class696 method5472(int i) {
		return aClass696_3379;
	}

	float method5473() {
		return 0.0F;
	}

	float method5474() {
		return 0.0F;
	}

	float method5475() {
		return 0.0F;
	}

	public Class527_Sub8_Sub15 method5476(int i, byte i_48_) {
		return (Class527_Sub8_Sub15) aClass14_3360.method709((long) i);
	}

	public boolean method5477() {
		return aBool3359;
	}

	public Class442 method5478() {
		return aClass442_3362;
	}

	public float method5479() {
		return aFloat3372;
	}

	public Class442 method5480() {
		if (aClass696_3379 == null || !aClass696_3379.method14244(1739470661))
			return null;
		return aClass696_3379.method14245((byte) 37);
	}

	public float method5481() {
		return aFloat3372;
	}

	public float method5482() {
		return aFloat3372;
	}

	public Class438 method5483() {
		Class438 class438 = Class438.method7020();
		class438.method7030(method5382(-1100674138), method5381(758055858), method5383(853556589));
		return class438;
	}

	public Class442 method5484() {
		return aClass442_3358;
	}

	public void method5485(short i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3367 = 5120.0F;
		aFloat3368 = 10.0F;
		aFloat3369 = 1.0F;
	}

	public Class442 method5486() {
		return aClass442_3366;
	}

	public Class442 method5487() {
		return aClass442_3366;
	}

	public void method5488(Class303 class303) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aClass303_3356 = class303;
	}

	public float method5489() {
		return aFloat3374;
	}

	public float method5490() {
		return aFloat3374;
	}

	public float method5491() {
		return aFloat3375;
	}

	public float method5492() {
		return aFloat3375;
	}

	public void method5493(float f, float f_49_, byte i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		if (f < 1.0F)
			f = 50.0F;
		if (f_49_ < 1.0F)
			f_49_ = 10000.0F;
		if (f >= f_49_)
			throw new Exception_Sub6();
		aFloat3374 = f;
		aFloat3375 = f_49_;
	}

	public float method5494() {
		return aFloat3378;
	}

	boolean method5495() {
		if (Class288.aClass288_3218 == aClass288_3361 && aClass306_3349 == Class306.aClass306_3440)
			return true;
		if (Class288.aClass288_3219 == aClass288_3361 && aClass306_3349 == Class306.aClass306_3441)
			return true;
		return false;
	}

	public float method5496() {
		return aFloat3378;
	}

	public boolean method5497() {
		return aBool3380;
	}

	public void method5498(float f, float f_50_, float f_51_, int i) throws Exception_Sub6 {
		if (!method5348(728055770))
			throw new Exception_Sub6();
		aFloat3367 = f;
		aFloat3368 = f_50_;
		aFloat3369 = f_51_;
	}

	public boolean method5499() {
		return aBool3359;
	}

	public boolean method5500() {
		return aBool3359;
	}

	public float method5501() {
		return aFloat3374;
	}

	public boolean method5502() {
		return aBool3359;
	}

	static final void method5503(Class243 class243, Class240 class240, Class665 class665, Class237 class237, byte i) {
		int i_52_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		switch (class237.anInt2380 * 333957335) {
		case 2:
			if (2 == -405609043 * client.anInt11083 && i_52_ < -67152419 * client.anInt11261)
				class243.aString2552 = client.aClass69Array11297[i_52_].aString776;
			else
				return;
			break;
		case 3:
		case 5:
			class243.aString2552 = (class665.aClass527_Sub21_8537.aClass345Array10485[i_52_].aString3697);
			break;
		case 1:
			class243.aString2552 = ((Class228) Class703.aClass219_8825.method4059((byte) 86).get(i_52_)).method4310(2115323534);
			break;
		case 4:
			class243.aString2552 = Class703.aClass219_8825.method3992(i_52_, -1442417598).method3915((byte) 8);
			break;
		case 0:
			if (null != Class679.aClass104Array8629 && i_52_ < Class679.aClass104Array8629.length)
				class243.aString2552 = Class679.aClass104Array8629[i_52_].aString1286;
			break;
		default:
			throw new IllegalStateException();
		}
		class243.aClass237_2654 = class237;
	}

	static final void method5504(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class534.aClass553_7213.method9158(-1412060454);
	}

	public static final void method5505(int i) {
		if (!client.aBool11115) {
			client.aFloat11114 += (-12.0F - client.aFloat11114) / 2.0F;
			client.aBool11119 = true;
			client.aBool11115 = true;
		}
	}

	public static int method5506(int i, int i_53_, int i_54_, int i_55_) {
		i_54_ &= 0x3;
		if (0 == i_54_)
			return i;
		if (1 == i_54_)
			return i_53_;
		if (2 == i_54_)
			return 4095 - i;
		return 4095 - i_53_;
	}
}

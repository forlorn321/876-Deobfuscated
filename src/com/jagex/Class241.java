/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class241 implements Interface43 {
	Class250[] aClass250Array2395;
	int anInt2396;
	boolean aBool2397;
	int anInt2398;
	List aList2399;
	Interface45 anInterface45_2400;
	List aList2401 = new ArrayList();
	Class370 aClass370_2402 = Class370.aClass370_3901;
	int anInt2403;
	Class256[] aClass256Array2404;
	static List aList2405 = new ArrayList();
	int anInt2406;
	int anInt2407;
	float aFloat2408;
	int anInt2409;
	int anInt2410;
	Class250[] aClass250Array2411;
	int anInt2412;
	Class251[] aClass251Array2413;
	Class390 aClass390_2414;
	boolean[] aBoolArray2415;
	int[] anIntArray2416;
	byte[] aByteArray2417;
	int anInt2418;
	static Class205 aClass205_2419 = new Class205(524288, 1024);
	boolean[] aBoolArray2420;
	Class250 aClass250_2421;
	Class250 aClass250_2422;
	Class250 aClass250_2423;
	Class252[] aClass252Array2424;
	Class250 aClass250_2425;
	Class250 aClass250_2426;
	Class250 aClass250_2427;
	int[] anIntArray2428;
	int[] anIntArray2429;
	int anInt2430;
	boolean aBool2431;
	int anInt2432;
	int anInt2433;
	int anInt2434;
	List aList2435;
	boolean aBool2436;
	boolean aBool2437;
	boolean[] aBoolArray2438;
	int anInt2439;
	int anInt2440;
	int anInt2441;
	int anInt2442;
	boolean aBool2443;
	Class233[] aClass233Array2444;
	int anInt2445;
	int anInt2446;
	int anInt2447;
	int anInt2448;
	boolean[] aBoolArray2449;
	List aList2450;
	AtomicReference anAtomicReference2451;
	int anInt2452;
	Class250[] aClass250Array2453;
	List aList2454 = new ArrayList();
	boolean aBool2455;
	int anInt2456;
	boolean[] aBoolArray2457;
	int anInt2458;
	int anInt2459;
	int anInt2460;
	int anInt2461;
	int anInt2462;
	RSByteBuffer aClass527_Sub38_2463 = null;
	Class373 aClass373_2464;

	synchronized void method4395(boolean bool) {
		aBool2455 = bool;
	}

	void method4396(Class250[] class250s) {
		if (class250s != null) {
			for (int i = 0; i < class250s.length; i++)
				method4406(class250s[i]);
		}
	}

	void method4397(byte[] is, int i) {
		aByteArray2417 = is;
		anInt2460 = i;
		anInt2461 = 0;
	}

	public Class370 method281() {
		return aClass370_2402;
	}

	Class250 method4398(int i) {
		synchronized (aClass205_2419) {
			Object object = null;
			Class250 class250 = (Class250) aClass205_2419.method3797(-1004411142);
			Class250 class250_0_ = null;
			int i_1_ = i;
			for (/**/; class250 != null; class250 = (Class250) aClass205_2419.method3798((byte) -69)) {
				if (class250.aFloatArray2781.length > i && !class250.aBool2782 && (class250_0_ == null || class250.aFloatArray2781.length < i_1_)) {
					class250_0_ = class250;
					i_1_ = class250_0_.aFloatArray2781.length;
				}
				if (class250.aFloatArray2781.length == i && !class250.aBool2782)
					break;
			}
			if (class250 == null)
				class250 = class250_0_;
			if (class250 == null) {
				class250 = new Class250(this);
				int i_2_ = 0;
				boolean bool = false;
				while (!bool && i_2_ < 1000) {
					if (aClass205_2419.method3787((long) i_2_) != null)
						i_2_++;
					else
						bool = true;
				}
				class250.anInt2783 = i_2_;
				float[] fs = new float[i];
				class250.aFloatArray2781 = fs;
				class250.aBool2782 = true;
				class250.anInt2780 = i;
				if (aClass205_2419.method3789(1212206507) >= i * 4) {
					/* empty */
				}
				aClass205_2419.method3813(class250, (long) class250.anInt2783, fs.length * 4, 2121484551);
			} else {
				for (int i_3_ = 0; i_3_ < class250.aFloatArray2781.length; i_3_++)
					class250.aFloatArray2781[i_3_] = 0.0F;
				class250.anInt2780 = i;
			}
			class250.aBool2782 = true;
			Class250 class250_4_ = class250;
			return class250_4_;
		}
	}

	public void method295(Interface45 interface45) {
		anInterface45_2400 = interface45;
	}

	void method4399(byte[] is, int i) {
		anInt2452 = 0;
		if (!method316()) {
			if (is == null)
				throw new RuntimeException("");
			int i_5_ = 0;
			if (method4412(is, i, 1))
				i_5_ = 1;
			else if (method4412(is, i, 3))
				i_5_ = 3;
			else if (method4412(is, i, 5))
				i_5_ = 5;
			else
				throw new RuntimeException(new StringBuilder().append("").append(i_5_).toString());
			if (i_5_ == 1) {
				method4425(is, i + 7);
				int i_6_ = method4413(32);
				anInt2412 = method4413(8);
				anInt2430 = method4413(32);
				anInt2432 = method4413(32);
				anInt2398 = method4413(32);
				anInt2396 = method4413(32);
				anInt2409 = 1 << method4413(4);
				anInt2410 = 1 << method4413(4);
				int i_7_ = 1 << method4413(1);
				if (i_6_ != 0 || i_7_ == 0)
					throw new RuntimeException("");
				aBool2437 = true;
				anInt2442++;
			} else if (i_5_ != 3 && i_5_ == 5) {
				if (!method4412(is, i, 5))
					throw new RuntimeException("");
				method4425(is, i + 7);
				if (aClass250Array2395 != null) {
					method4407(aClass250Array2395);
					aClass250Array2395 = null;
				}
				aClass250Array2395 = method4404(anInt2412, anInt2410);
				for (int i_8_ = 0; i_8_ < 2; i_8_++) {
					int i_9_ = i_8_ != 0 ? anInt2410 : anInt2409;
					int i_10_ = i_9_ >> 1;
					int i_11_ = i_9_ >> 2;
					int i_12_ = i_9_ >> 3;
					Class250 class250 = method4405(i_10_);
					for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
						class250.aFloatArray2781[2 * i_13_] = (float) Math.cos((double) (4 * i_13_) * 3.141592653589793 / (double) i_9_);
						class250.aFloatArray2781[2 * i_13_ + 1] = -(float) Math.sin((double) (4 * i_13_) * 3.141592653589793 / (double) i_9_);
					}
					Class250 class250_14_ = method4405(i_10_);
					for (int i_15_ = 0; i_15_ < i_11_; i_15_++) {
						class250_14_.aFloatArray2781[2 * i_15_] = (float) Math.cos((double) (2 * i_15_ + 1) * 3.141592653589793 / (double) (2 * i_9_));
						class250_14_.aFloatArray2781[2 * i_15_ + 1] = (float) Math.sin((double) (2 * i_15_ + 1) * 3.141592653589793 / (double) (2 * i_9_));
					}
					Class250 class250_16_ = method4405(i_11_);
					for (int i_17_ = 0; i_17_ < i_12_; i_17_++) {
						class250_16_.aFloatArray2781[2 * i_17_] = (float) Math.cos((double) (4 * i_17_ + 2) * 3.141592653589793 / (double) i_9_);
						class250_16_.aFloatArray2781[2 * i_17_ + 1] = -(float) Math.sin((double) (4 * i_17_ + 2) * 3.141592653589793 / (double) i_9_);
					}
					int[] is_18_ = new int[i_12_];
					int i_19_ = Class15.method735(i_12_ - 1, (byte) -104);
					for (int i_20_ = 0; i_20_ < i_12_; i_20_++)
						is_18_[i_20_] = Class514.method8494(i_20_, i_19_, (byte) 69);
					if (i_8_ != 0) {
						aClass250_2425 = class250;
						aClass250_2426 = class250_14_;
						aClass250_2427 = class250_16_;
						anIntArray2429 = is_18_;
					} else {
						aClass250_2422 = class250;
						aClass250_2423 = class250_14_;
						aClass250_2421 = class250_16_;
						anIntArray2428 = is_18_;
					}
				}
				method4414();
				int i_21_ = method4413(6) + 1;
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					method4413(16);
				i_21_ = method4413(6) + 1;
				if (aClass256Array2404 == null || aClass256Array2404.length != i_21_)
					aClass256Array2404 = new Class256[i_21_];
				for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
					if (aClass256Array2404[i_23_] == null)
						aClass256Array2404[i_23_] = new Class256();
					aClass256Array2404[i_23_].method4710(this, anInt2412);
				}
				int i_24_ = method4413(6) + 1;
				if (aClass251Array2413 == null || aClass251Array2413.length != i_24_)
					aClass251Array2413 = new Class251[i_24_];
				for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
					if (aClass251Array2413[i_25_] == null)
						aClass251Array2413[i_25_] = new Class251();
					aClass251Array2413[i_25_].method4668(this);
				}
				int i_26_ = method4413(6) + 1;
				if (aClass252Array2424 == null || aClass252Array2424.length != i_26_)
					aClass252Array2424 = new Class252[i_26_];
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
					if (aClass252Array2424[i_27_] == null)
						aClass252Array2424[i_27_] = new Class252();
					aClass252Array2424[i_27_].method4679(this);
				}
				int i_28_ = method4413(6) + 1;
				aBoolArray2415 = new boolean[i_28_];
				anIntArray2416 = new int[i_28_];
				for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
					aBoolArray2415[i_29_] = method4416() != 0;
					method4413(16);
					method4413(16);
					anIntArray2416[i_29_] = method4413(8);
				}
				method4403(true);
			}
		}
	}

	public void method130() {
		if (method281() == Class370.aClass370_3902 || method281() == Class370.aClass370_3901 || method281() == Class370.aClass370_3897) {
			method4419(Class370.aClass370_3898);
			method4409();
		}
	}

	public RSByteBuffer method286(int i) {
		RSByteBuffer class527_sub38 = method4429(i);
		return class527_sub38;
	}

	public int method51() {
		return method4431();
	}

	public int method179(int i) {
		return i / (method307().anInt4005 * 370905523 / 8);
	}

	public int method319(int i) {
		return i * (method307().anInt4005 * 370905523 / 8);
	}

	void method4400(Class250[] class250s) {
		if (class250s != null) {
			for (int i = 0; i < class250s.length; i++)
				method4406(class250s[i]);
		}
	}

	public Class390 method307() {
		return aClass390_2414;
	}

	public Class373 method302() {
		return aClass373_2464;
	}

	public void method314(int i, Class390 class390, Class373 class373, int i_30_) {
		anInt2418 = i_30_;
		if (method4401(i, class390, class373)) {
			aClass390_2414 = class390;
			aClass373_2464 = class373;
		} else
			throw new RuntimeException("");
	}

	boolean method4401(int i, Class390 class390, Class373 class373) {
		if (class390 == Class390.aClass390_4003)
			return true;
		if (class390 == Class390.aClass390_4002)
			return true;
		if (class390 == Class390.aClass390_4004)
			return true;
		if (class390 == Class390.aClass390_4001)
			return true;
		return false;
	}

	int method4402() {
		if (aBool2437)
			return anInt2412;
		throw new RuntimeException("");
	}

	public int method72() {
		if (aBool2437)
			return method4402() < anInt2418 ? anInt2418 : method4402();
		throw new RuntimeException("");
	}

	public synchronized boolean method316() {
		return aBool2455;
	}

	synchronized void method4403(boolean bool) {
		aBool2455 = bool;
	}

	Class250[] method4404(int i, int i_31_) {
		Class250[] class250s = new Class250[i];
		for (int i_32_ = 0; i_32_ < class250s.length; i_32_++)
			class250s[i_32_] = method4405(i_31_);
		return class250s;
	}

	Class250 method4405(int i) {
		synchronized (aClass205_2419) {
			Object object = null;
			Class250 class250 = (Class250) aClass205_2419.method3797(-490021830);
			Class250 class250_33_ = null;
			int i_34_ = i;
			for (/**/; class250 != null; class250 = (Class250) aClass205_2419.method3798((byte) -58)) {
				if (class250.aFloatArray2781.length > i && !class250.aBool2782 && (class250_33_ == null || class250.aFloatArray2781.length < i_34_)) {
					class250_33_ = class250;
					i_34_ = class250_33_.aFloatArray2781.length;
				}
				if (class250.aFloatArray2781.length == i && !class250.aBool2782)
					break;
			}
			if (class250 == null)
				class250 = class250_33_;
			if (class250 == null) {
				class250 = new Class250(this);
				int i_35_ = 0;
				boolean bool = false;
				while (!bool && i_35_ < 1000) {
					if (aClass205_2419.method3787((long) i_35_) != null)
						i_35_++;
					else
						bool = true;
				}
				class250.anInt2783 = i_35_;
				float[] fs = new float[i];
				class250.aFloatArray2781 = fs;
				class250.aBool2782 = true;
				class250.anInt2780 = i;
				if (aClass205_2419.method3789(815699658) >= i * 4) {
					/* empty */
				}
				aClass205_2419.method3813(class250, (long) class250.anInt2783, fs.length * 4, 1973365625);
			} else {
				for (int i_36_ = 0; i_36_ < class250.aFloatArray2781.length; i_36_++)
					class250.aFloatArray2781[i_36_] = 0.0F;
				class250.anInt2780 = i;
			}
			class250.aBool2782 = true;
			Class250 class250_37_ = class250;
			return class250_37_;
		}
	}

	void method4406(Class250 class250) {
		if (class250 != null) {
			synchronized (aClass205_2419) {
				class250.aBool2782 = false;
			}
		}
	}

	void method4407(Class250[] class250s) {
		if (class250s != null) {
			for (int i = 0; i < class250s.length; i++)
				method4406(class250s[i]);
		}
	}

	int method4408(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	void method4409() {
		if (method281() != Class370.aClass370_3900) {
			method4461();
			if (method281() == Class370.aClass370_3898)
				method4419(Class370.aClass370_3897);
		}
	}

	public void method298(RSByteBuffer class527_sub38) {
		if (method281() == Class370.aClass370_3900 || method281() == Class370.aClass370_3896) {
			if (class527_sub38 != null)
				class527_sub38.method16599((byte) 110);
		} else if (class527_sub38 == null) {
			boolean bool = aBool2397 && (anInt2447 > 0 && anInt2448 < anInt2447 || anInt2447 < 0);
			if (aList2435.isEmpty()) {
				if (!bool) {
					method4418();
					method4419(Class370.aClass370_3896);
				}
			} else if (!bool) {
				method4418();
				method4419(Class370.aClass370_3900);
			}
			if (bool)
				method4495(true);
		} else
			method4489(class527_sub38);
	}

	boolean method4410() {
		return aBool2431;
	}

	boolean method4411(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 79 || class527_sub38.readUnsignedByte() != 103 || class527_sub38.readUnsignedByte() != 103 || class527_sub38.readUnsignedByte() != 83)
			return false;
		return true;
	}

	boolean method4412(byte[] is, int i, int i_38_) {
		if (is[i] != i_38_)
			return false;
		if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114 || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
			return false;
		return true;
	}

	int method4413(int i) {
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_;
		for (/**/; i >= 8 - anInt2461; i -= i_41_) {
			i_41_ = 8 - anInt2461;
			int i_42_ = (1 << i_41_) - 1;
			i_39_ += (aByteArray2417[anInt2460] >> anInt2461 & i_42_) << i_40_;
			anInt2461 = 0;
			anInt2460++;
			i_40_ += i_41_;
		}
		if (i > 0) {
			i_41_ = (1 << i) - 1;
			i_39_ += (aByteArray2417[anInt2460] >> anInt2461 & i_41_) << i_40_;
			anInt2461 += i;
		}
		return i_39_;
	}

	void method4414() {
		int i = method4413(8) + 1;
		Iterator iterator = aList2405.iterator();
		while (iterator.hasNext()) {
			Class247 class247 = (Class247) iterator.next();
			if (class247.anInt2721 == 0 && class247.anInt2722 == 0) {
				if (class247.aClass233Array2719.length == i && class247.anInt2723 == anInt2412 && class247.anInt2724 == anInt2430 && class247.anInt2720 == anInt2398) {
					aClass233Array2444 = class247.aClass233Array2719;
					for (int i_43_ = 0; i_43_ < aClass233Array2444.length; i_43_++)
						aClass233Array2444[i_43_].method4334(this);
					return;
				}
			}
		}
		aClass233Array2444 = new Class233[i];
		for (int i_44_ = 0; i_44_ < i; i_44_++) {
			if (aClass233Array2444[i_44_] == null)
				aClass233Array2444[i_44_] = new Class233();
			aClass233Array2444[i_44_].method4344(this);
		}
		Class247 class247 = new Class247(anInt2412, anInt2430, anInt2432, anInt2396, anInt2398, aClass233Array2444);
		aList2405.add(class247);
	}

	int method4415() {
		return anInt2461;
	}

	public void method312() {
		if (method281() != Class370.aClass370_3898) {
			method4495(false);
			method4419(Class370.aClass370_3901);
		} else {
			method4495(false);
			method4419(Class370.aClass370_3902);
		}
	}

	int method4416() {
		int i = aByteArray2417[anInt2460] >> anInt2461 & 0x1;
		anInt2461++;
		anInt2460 += anInt2461 >> 3;
		anInt2461 &= 0x7;
		return i;
	}

	void method4417(Class370 class370) {
		aClass370_2402 = class370;
	}

	void method4418() {
		aByteArray2417 = null;
	}

	void method4419(Class370 class370) {
		aClass370_2402 = class370;
	}

	void method4420(byte[] is, int i) {
		anInt2452 = 0;
		if (!method316()) {
			if (is == null)
				throw new RuntimeException("");
			int i_45_ = 0;
			if (method4412(is, i, 1))
				i_45_ = 1;
			else if (method4412(is, i, 3))
				i_45_ = 3;
			else if (method4412(is, i, 5))
				i_45_ = 5;
			else
				throw new RuntimeException(new StringBuilder().append("").append(i_45_).toString());
			if (i_45_ == 1) {
				method4425(is, i + 7);
				int i_46_ = method4413(32);
				anInt2412 = method4413(8);
				anInt2430 = method4413(32);
				anInt2432 = method4413(32);
				anInt2398 = method4413(32);
				anInt2396 = method4413(32);
				anInt2409 = 1 << method4413(4);
				anInt2410 = 1 << method4413(4);
				int i_47_ = 1 << method4413(1);
				if (i_46_ != 0 || i_47_ == 0)
					throw new RuntimeException("");
				aBool2437 = true;
				anInt2442++;
			} else if (i_45_ != 3 && i_45_ == 5) {
				if (!method4412(is, i, 5))
					throw new RuntimeException("");
				method4425(is, i + 7);
				if (aClass250Array2395 != null) {
					method4407(aClass250Array2395);
					aClass250Array2395 = null;
				}
				aClass250Array2395 = method4404(anInt2412, anInt2410);
				for (int i_48_ = 0; i_48_ < 2; i_48_++) {
					int i_49_ = i_48_ != 0 ? anInt2410 : anInt2409;
					int i_50_ = i_49_ >> 1;
					int i_51_ = i_49_ >> 2;
					int i_52_ = i_49_ >> 3;
					Class250 class250 = method4405(i_50_);
					for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
						class250.aFloatArray2781[2 * i_53_] = (float) Math.cos((double) (4 * i_53_) * 3.141592653589793 / (double) i_49_);
						class250.aFloatArray2781[2 * i_53_ + 1] = -(float) Math.sin((double) (4 * i_53_) * 3.141592653589793 / (double) i_49_);
					}
					Class250 class250_54_ = method4405(i_50_);
					for (int i_55_ = 0; i_55_ < i_51_; i_55_++) {
						class250_54_.aFloatArray2781[2 * i_55_] = (float) Math.cos((double) (2 * i_55_ + 1) * 3.141592653589793 / (double) (2 * i_49_));
						class250_54_.aFloatArray2781[2 * i_55_ + 1] = (float) Math.sin((double) (2 * i_55_ + 1) * 3.141592653589793 / (double) (2 * i_49_));
					}
					Class250 class250_56_ = method4405(i_51_);
					for (int i_57_ = 0; i_57_ < i_52_; i_57_++) {
						class250_56_.aFloatArray2781[2 * i_57_] = (float) Math.cos((double) (4 * i_57_ + 2) * 3.141592653589793 / (double) i_49_);
						class250_56_.aFloatArray2781[2 * i_57_ + 1] = -(float) Math.sin((double) (4 * i_57_ + 2) * 3.141592653589793 / (double) i_49_);
					}
					int[] is_58_ = new int[i_52_];
					int i_59_ = Class15.method735(i_52_ - 1, (byte) -31);
					for (int i_60_ = 0; i_60_ < i_52_; i_60_++)
						is_58_[i_60_] = Class514.method8494(i_60_, i_59_, (byte) 74);
					if (i_48_ != 0) {
						aClass250_2425 = class250;
						aClass250_2426 = class250_54_;
						aClass250_2427 = class250_56_;
						anIntArray2429 = is_58_;
					} else {
						aClass250_2422 = class250;
						aClass250_2423 = class250_54_;
						aClass250_2421 = class250_56_;
						anIntArray2428 = is_58_;
					}
				}
				method4414();
				int i_61_ = method4413(6) + 1;
				for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
					method4413(16);
				i_61_ = method4413(6) + 1;
				if (aClass256Array2404 == null || aClass256Array2404.length != i_61_)
					aClass256Array2404 = new Class256[i_61_];
				for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
					if (aClass256Array2404[i_63_] == null)
						aClass256Array2404[i_63_] = new Class256();
					aClass256Array2404[i_63_].method4710(this, anInt2412);
				}
				int i_64_ = method4413(6) + 1;
				if (aClass251Array2413 == null || aClass251Array2413.length != i_64_)
					aClass251Array2413 = new Class251[i_64_];
				for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
					if (aClass251Array2413[i_65_] == null)
						aClass251Array2413[i_65_] = new Class251();
					aClass251Array2413[i_65_].method4668(this);
				}
				int i_66_ = method4413(6) + 1;
				if (aClass252Array2424 == null || aClass252Array2424.length != i_66_)
					aClass252Array2424 = new Class252[i_66_];
				for (int i_67_ = 0; i_67_ < i_66_; i_67_++) {
					if (aClass252Array2424[i_67_] == null)
						aClass252Array2424[i_67_] = new Class252();
					aClass252Array2424[i_67_].method4679(this);
				}
				int i_68_ = method4413(6) + 1;
				aBoolArray2415 = new boolean[i_68_];
				anIntArray2416 = new int[i_68_];
				for (int i_69_ = 0; i_69_ < i_68_; i_69_++) {
					aBoolArray2415[i_69_] = method4416() != 0;
					method4413(16);
					method4413(16);
					anIntArray2416[i_69_] = method4413(8);
				}
				method4403(true);
			}
		}
	}

	int method4421(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	boolean method4422(byte[] is, int i, int i_70_, AtomicReference atomicreference) {
		if (is == null)
			throw new RuntimeException("");
		if (i + i_70_ > is.length)
			return false;
		method4425(is, i);
		int i_71_ = method4416();
		if (i_71_ != 0) {
			method4420(is, i);
			return false;
		}
		if (!method316())
			throw new RuntimeException();
		int i_72_ = method4413(method4497(anIntArray2416.length - 1));
		boolean bool = aBoolArray2415[i_72_];
		int i_73_ = bool ? anInt2410 : anInt2409;
		boolean bool_74_ = false;
		boolean bool_75_ = false;
		if (bool) {
			bool_74_ = method4416() != 0;
			bool_75_ = method4416() != 0;
		}
		int i_76_ = i_73_ >> 1;
		int i_77_;
		int i_78_;
		int i_79_;
		if (bool && !bool_74_) {
			i_77_ = (i_73_ >> 2) - (anInt2409 >> 2);
			i_78_ = (i_73_ >> 2) + (anInt2409 >> 2);
			i_79_ = anInt2409 >> 1;
		} else {
			i_77_ = 0;
			i_78_ = i_76_;
			i_79_ = i_73_ >> 1;
		}
		int i_80_;
		int i_81_;
		int i_82_;
		if (bool && !bool_75_) {
			i_80_ = i_73_ - (i_73_ >> 2) - (anInt2409 >> 2);
			i_81_ = i_73_ - (i_73_ >> 2) + (anInt2409 >> 2);
			i_82_ = anInt2409 >> 1;
		} else {
			i_80_ = i_76_;
			i_81_ = i_73_;
			i_82_ = i_73_ >> 1;
		}
		Class252 class252 = aClass252Array2424[anIntArray2416[i_72_]];
		if (aBoolArray2449 == null || aBoolArray2449.length != anInt2412) {
			aBoolArray2449 = new boolean[anInt2412];
			aBoolArray2438 = new boolean[anInt2412];
		}
		for (int i_83_ = 0; i_83_ < anInt2412; i_83_++) {
			int i_84_ = (class252.anIntArray2796 != null ? class252.anIntArray2796[i_83_] : 0);
			int i_85_ = i_84_;
			int i_86_ = class252.anIntArray2797[i_85_];
			aBoolArray2449[i_83_] = !aClass256Array2404[i_86_].method4716(i_83_);
			aBoolArray2438[i_83_] = aBoolArray2449[i_83_];
		}
		for (int i_87_ = 0; i_87_ < class252.anInt2800; i_87_++) {
			if (!aBoolArray2449[class252.anIntArray2794[i_87_]] || !aBoolArray2449[class252.anIntArray2795[i_87_]]) {
				aBoolArray2449[class252.anIntArray2794[i_87_]] = false;
				aBoolArray2449[class252.anIntArray2795[i_87_]] = false;
			}
		}
		if (aBoolArray2457 == null || aBoolArray2457.length != anInt2412)
			aBoolArray2457 = new boolean[anInt2412];
		for (int i_88_ = 0; i_88_ < class252.anInt2801; i_88_++) {
			int i_89_ = 0;
			for (int i_90_ = 0; i_90_ < anInt2412; i_90_++) {
				int i_91_ = (class252.anIntArray2796 != null ? class252.anIntArray2796[i_90_] : i_88_);
				if (i_91_ == i_88_)
					aBoolArray2457[i_89_++] = aBoolArray2449[i_90_];
			}
			Class251 class251 = aClass251Array2413[class252.anIntArray2798[i_88_]];
			Object object = null;
			Class250[] class250s;
			if (class251.anInt2785 == 2) {
				Class250[] class250s_92_ = method4404(1, anInt2412 * i_73_);
				for (int i_93_ = 0; i_93_ < i_73_; i_93_++) {
					for (int i_94_ = 0; i_94_ < anInt2412; i_94_++) {
						try {
							class250s_92_[0].aFloatArray2781[(i_93_ * anInt2412 + i_94_)] = (aClass250Array2395[i_94_].aFloatArray2781[i_93_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				class250s_92_ = class251.method4666(class250s_92_, i_73_ >> 1, aBoolArray2457);
				class250s = aClass250Array2395;
				for (int i_95_ = 0; i_95_ < i_73_; i_95_++) {
					for (int i_96_ = 0; i_96_ < anInt2412; i_96_++) {
						try {
							class250s[i_96_].aFloatArray2781[i_95_] = (class250s_92_[0].aFloatArray2781[anInt2412 * i_95_ + i_96_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				method4407(class250s_92_);
				Object object_97_ = null;
			} else
				class250s = class251.method4666(aClass250Array2395, i_73_ >> 1, aBoolArray2457);
			if (class252.anIntArray2796 != null) {
				i_89_ = 0;
				for (int i_98_ = 0; i_98_ < anInt2412; i_98_++) {
					int i_99_ = class252.anIntArray2796[i_98_];
					if (i_99_ == i_88_)
						aClass250Array2395[i_98_] = class250s[i_89_++];
				}
			} else {
				if (aClass250Array2395 != class250s)
					method4407(aClass250Array2395);
				aClass250Array2395 = class250s;
			}
		}
		for (int i_100_ = class252.anInt2800 - 1; i_100_ >= 0; i_100_--) {
			Class250 class250 = aClass250Array2395[class252.anIntArray2794[i_100_]];
			Class250 class250_101_ = aClass250Array2395[class252.anIntArray2795[i_100_]];
			for (int i_102_ = 0; i_102_ < class250.anInt2780; i_102_++) {
				float f = class250.aFloatArray2781[i_102_];
				float f_103_ = class250_101_.aFloatArray2781[i_102_];
				float f_104_ = f;
				float f_105_ = f_103_;
				if (f > 0.0F) {
					if (f_103_ > 0.0F) {
						f_104_ = f;
						f_105_ = f - f_103_;
					} else {
						f_105_ = f;
						f_104_ = f + f_103_;
					}
				} else if (f_103_ > 0.0F) {
					f_104_ = f;
					f_105_ = f + f_103_;
				} else {
					f_105_ = f;
					f_104_ = f - f_103_;
				}
				class250.aFloatArray2781[i_102_] = f_104_;
				class250_101_.aFloatArray2781[i_102_] = f_105_;
			}
		}
		for (int i_106_ = 0; i_106_ < aBoolArray2449.length; i_106_++)
			aBoolArray2449[i_106_] = aBoolArray2438[i_106_];
		for (int i_107_ = 0; i_107_ < anInt2412; i_107_++) {
			if (!aBoolArray2449[i_107_]) {
				int i_108_ = (class252.anIntArray2796 != null ? class252.anIntArray2796[i_107_] : 0);
				int i_109_ = i_108_;
				int i_110_ = class252.anIntArray2797[i_109_];
				aClass256Array2404[i_110_].method4717(i_107_);
				aClass256Array2404[i_110_].method4718((aClass250Array2395[i_107_]), i_73_ >> 1, i_107_);
			}
		}
		for (int i_111_ = 0; i_111_ < anInt2412; i_111_++) {
			if (aBoolArray2449[i_111_]) {
				for (int i_112_ = i_73_ >> 1; i_112_ < i_73_; i_112_++)
					aClass250Array2395[i_111_].aFloatArray2781[i_112_] = 0.0F;
			} else {
				int i_113_ = i_73_ >> 1;
				int i_114_ = i_73_ >> 2;
				int i_115_ = i_73_ >> 3;
				Class250 class250 = aClass250Array2395[i_111_];
				for (int i_116_ = 0; i_116_ < i_113_; i_116_++)
					class250.aFloatArray2781[i_116_] *= 0.5F;
				for (int i_117_ = i_113_; i_117_ < i_73_; i_117_++)
					class250.aFloatArray2781[i_117_] = -class250.aFloatArray2781[i_73_ - i_117_ - 1];
				Class250 class250_118_ = bool ? aClass250_2425 : aClass250_2422;
				Class250 class250_119_ = bool ? aClass250_2426 : aClass250_2423;
				Class250 class250_120_ = bool ? aClass250_2427 : aClass250_2421;
				int[] is_121_ = bool ? anIntArray2429 : anIntArray2428;
				for (int i_122_ = 0; i_122_ < i_114_; i_122_++) {
					float f = (class250.aFloatArray2781[4 * i_122_] - class250.aFloatArray2781[i_73_ - 4 * i_122_ - 1]);
					float f_123_ = (class250.aFloatArray2781[4 * i_122_ + 2] - class250.aFloatArray2781[i_73_ - 4 * i_122_ - 3]);
					float f_124_ = class250_118_.aFloatArray2781[2 * i_122_];
					float f_125_ = class250_118_.aFloatArray2781[2 * i_122_ + 1];
					class250.aFloatArray2781[i_73_ - 4 * i_122_ - 1] = f * f_124_ - f_123_ * f_125_;
					class250.aFloatArray2781[i_73_ - 4 * i_122_ - 3] = f * f_125_ + f_123_ * f_124_;
				}
				for (int i_126_ = 0; i_126_ < i_115_; i_126_++) {
					float f = class250.aFloatArray2781[i_113_ + 3 + 4 * i_126_];
					float f_127_ = class250.aFloatArray2781[i_113_ + 1 + 4 * i_126_];
					float f_128_ = class250.aFloatArray2781[4 * i_126_ + 3];
					float f_129_ = class250.aFloatArray2781[4 * i_126_ + 1];
					class250.aFloatArray2781[i_113_ + 3 + 4 * i_126_] = f + f_128_;
					class250.aFloatArray2781[i_113_ + 1 + 4 * i_126_] = f_127_ + f_129_;
					float f_130_ = (class250_118_.aFloatArray2781[i_113_ - 4 - 4 * i_126_]);
					float f_131_ = (class250_118_.aFloatArray2781[i_113_ - 3 - 4 * i_126_]);
					class250.aFloatArray2781[4 * i_126_ + 3] = (f - f_128_) * f_130_ - (f_127_ - f_129_) * f_131_;
					class250.aFloatArray2781[4 * i_126_ + 1] = (f_127_ - f_129_) * f_130_ + (f - f_128_) * f_131_;
				}
				int i_132_ = Class15.method735(i_73_ - 1, (byte) -29);
				for (int i_133_ = 0; i_133_ < i_132_ - 3; i_133_++) {
					int i_134_ = i_73_ >> i_133_ + 2;
					int i_135_ = 8 << i_133_;
					for (int i_136_ = 0; i_136_ < 2 << i_133_; i_136_++) {
						int i_137_ = i_73_ - i_134_ * 2 * i_136_;
						int i_138_ = i_73_ - i_134_ * (2 * i_136_ + 1);
						for (int i_139_ = 0; i_139_ < i_73_ >> i_133_ + 4; i_139_++) {
							int i_140_ = 4 * i_139_;
							float f = (class250.aFloatArray2781[i_137_ - 1 - i_140_]);
							float f_141_ = (class250.aFloatArray2781[i_137_ - 3 - i_140_]);
							float f_142_ = (class250.aFloatArray2781[i_138_ - 1 - i_140_]);
							float f_143_ = (class250.aFloatArray2781[i_138_ - 3 - i_140_]);
							class250.aFloatArray2781[i_137_ - 1 - i_140_] = f + f_142_;
							class250.aFloatArray2781[i_137_ - 3 - i_140_] = f_141_ + f_143_;
							float f_144_ = (class250_118_.aFloatArray2781[i_139_ * i_135_]);
							float f_145_ = (class250_118_.aFloatArray2781[i_139_ * i_135_ + 1]);
							class250.aFloatArray2781[i_138_ - 1 - i_140_] = ((f - f_142_) * f_144_ - (f_141_ - f_143_) * f_145_);
							class250.aFloatArray2781[i_138_ - 3 - i_140_] = ((f_141_ - f_143_) * f_144_ + (f - f_142_) * f_145_);
						}
					}
				}
				for (int i_146_ = 1; i_146_ < i_115_ - 1; i_146_++) {
					int i_147_ = is_121_[i_146_];
					if (i_146_ < i_147_) {
						int i_148_ = 8 * i_146_;
						int i_149_ = 8 * i_147_;
						float f = class250.aFloatArray2781[i_148_ + 1];
						class250.aFloatArray2781[i_148_ + 1] = class250.aFloatArray2781[i_149_ + 1];
						class250.aFloatArray2781[i_149_ + 1] = f;
						f = class250.aFloatArray2781[i_148_ + 3];
						class250.aFloatArray2781[i_148_ + 3] = class250.aFloatArray2781[i_149_ + 3];
						class250.aFloatArray2781[i_149_ + 3] = f;
						f = class250.aFloatArray2781[i_148_ + 5];
						class250.aFloatArray2781[i_148_ + 5] = class250.aFloatArray2781[i_149_ + 5];
						class250.aFloatArray2781[i_149_ + 5] = f;
						f = class250.aFloatArray2781[i_148_ + 7];
						class250.aFloatArray2781[i_148_ + 7] = class250.aFloatArray2781[i_149_ + 7];
						class250.aFloatArray2781[i_149_ + 7] = f;
					}
				}
				for (int i_150_ = 0; i_150_ < i_113_; i_150_++)
					class250.aFloatArray2781[i_150_] = class250.aFloatArray2781[2 * i_150_ + 1];
				for (int i_151_ = 0; i_151_ < i_115_; i_151_++) {
					class250.aFloatArray2781[i_73_ - 1 - 2 * i_151_] = class250.aFloatArray2781[4 * i_151_];
					class250.aFloatArray2781[i_73_ - 2 - 2 * i_151_] = class250.aFloatArray2781[4 * i_151_ + 1];
					class250.aFloatArray2781[i_73_ - i_114_ - 1 - 2 * i_151_] = class250.aFloatArray2781[4 * i_151_ + 2];
					class250.aFloatArray2781[i_73_ - i_114_ - 2 - 2 * i_151_] = class250.aFloatArray2781[4 * i_151_ + 3];
				}
				for (int i_152_ = 0; i_152_ < i_115_; i_152_++) {
					float f = class250_120_.aFloatArray2781[2 * i_152_];
					float f_153_ = class250_120_.aFloatArray2781[2 * i_152_ + 1];
					float f_154_ = class250.aFloatArray2781[i_113_ + 2 * i_152_];
					float f_155_ = class250.aFloatArray2781[i_113_ + 2 * i_152_ + 1];
					float f_156_ = class250.aFloatArray2781[i_73_ - 2 - 2 * i_152_];
					float f_157_ = class250.aFloatArray2781[i_73_ - 1 - 2 * i_152_];
					float f_158_ = f_153_ * (f_154_ - f_156_) + f * (f_155_ + f_157_);
					class250.aFloatArray2781[i_113_ + 2 * i_152_] = (f_154_ + f_156_ + f_158_) * 0.5F;
					class250.aFloatArray2781[i_73_ - 2 - 2 * i_152_] = (f_154_ + f_156_ - f_158_) * 0.5F;
					f_158_ = f_153_ * (f_155_ + f_157_) - f * (f_154_ - f_156_);
					class250.aFloatArray2781[i_113_ + 2 * i_152_ + 1] = (f_155_ - f_157_ + f_158_) * 0.5F;
					class250.aFloatArray2781[i_73_ - 1 - 2 * i_152_] = (-f_155_ + f_157_ + f_158_) * 0.5F;
				}
				for (int i_159_ = 0; i_159_ < i_114_; i_159_++) {
					class250.aFloatArray2781[i_159_] = ((class250.aFloatArray2781[2 * i_159_ + i_113_] * class250_119_.aFloatArray2781[2 * i_159_]) + (class250.aFloatArray2781[2 * i_159_ + 1 + i_113_] * (class250_119_.aFloatArray2781[2 * i_159_ + 1])));
					class250.aFloatArray2781[i_113_ - 1 - i_159_] = ((class250.aFloatArray2781[2 * i_159_ + i_113_] * class250_119_.aFloatArray2781[2 * i_159_ + 1]) - (class250.aFloatArray2781[2 * i_159_ + 1 + i_113_] * class250_119_.aFloatArray2781[2 * i_159_]));
				}
				for (int i_160_ = 0; i_160_ < i_114_; i_160_++)
					class250.aFloatArray2781[i_73_ - i_114_ + i_160_] = -class250.aFloatArray2781[i_160_];
				for (int i_161_ = 0; i_161_ < i_114_; i_161_++)
					class250.aFloatArray2781[i_161_] = class250.aFloatArray2781[i_114_ + i_161_];
				for (int i_162_ = 0; i_162_ < i_114_; i_162_++)
					class250.aFloatArray2781[i_114_ + i_162_] = -class250.aFloatArray2781[i_114_ - i_162_ - 1];
				for (int i_163_ = 0; i_163_ < i_114_; i_163_++)
					class250.aFloatArray2781[i_113_ + i_163_] = class250.aFloatArray2781[i_73_ - i_163_ - 1];
				for (int i_164_ = i_77_; i_164_ < i_78_; i_164_++) {
					float f = (float) Math.sin(((double) (i_164_ - i_77_) + 0.5) / (double) i_79_ * 0.5 * 3.141592653589793);
					aClass250Array2395[i_111_].aFloatArray2781[i_164_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
				for (int i_165_ = i_80_; i_165_ < i_81_; i_165_++) {
					float f = (float) Math.sin((((double) (i_165_ - i_80_) + 0.5) / (double) i_82_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
					aClass250Array2395[i_111_].aFloatArray2781[i_165_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
			}
		}
		Class250[] class250s = null;
		if (anInt2459 > 0) {
			int i_166_ = anInt2459 + i_73_ >> 2;
			class250s = method4404(anInt2412, i_166_);
			for (int i_167_ = 0; i_167_ < anInt2412; i_167_++) {
				if (!aBoolArray2420[i_167_]) {
					for (int i_168_ = 0; i_168_ < anInt2458; i_168_++) {
						int i_169_ = (anInt2459 >> 1) + i_168_;
						class250s[i_167_].aFloatArray2781[i_168_] += (aClass250Array2453[i_167_].aFloatArray2781[i_169_]);
					}
				}
				if (!aBoolArray2449[i_167_]) {
					for (int i_170_ = i_77_; i_170_ < i_73_ >> 1; i_170_++) {
						int i_171_ = (class250s[i_167_].anInt2780 - (i_73_ >> 1) + i_170_);
						class250s[i_167_].aFloatArray2781[i_171_] += (aClass250Array2395[i_167_].aFloatArray2781[i_170_]);
					}
				}
			}
		}
		Class250[] class250s_172_ = aClass250Array2453;
		aClass250Array2453 = aClass250Array2395;
		aClass250Array2395 = class250s_172_;
		anInt2459 = i_73_;
		anInt2458 = i_81_ - (i_73_ >> 1);
		aBoolArray2420 = aBoolArray2449;
		atomicreference.set(class250s);
		return true;
	}

	int method4423() {
		return anInt2460;
	}

	void method4424() {
		aByteArray2417 = null;
	}

	void method4425(byte[] is, int i) {
		aByteArray2417 = is;
		anInt2460 = i;
		anInt2461 = 0;
	}

	public void method282(boolean bool, int i, int i_173_, int i_174_) {
		aBool2397 = bool;
		anInt2447 = i;
		anInt2406 = i_173_;
		anInt2407 = i_174_;
	}

	int method4426(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	int method4427(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	int method4428(float f) {
		int i = (int) (f * 127.0F + 128.0F);
		if (i > 255)
			return 255;
		if (i < 0)
			return 0;
		return i;
	}

	RSByteBuffer method4429(int i) {
		RSByteBuffer class527_sub38 = method4468(method319(i));
		int i_175_ = i;
		synchronized (aList2435) {
			while (!aList2435.isEmpty()) {
				RSByteBuffer class527_sub38_176_ = (RSByteBuffer) aList2435.remove(0);
				anInt2456 -= (method179(class527_sub38_176_.anInt10689 * -441238943) / method72());
				int i_177_ = method319(i_175_);
				int i_178_ = (class527_sub38_176_.anInt10689 * -441238943 < i_177_ ? class527_sub38_176_.anInt10689 * -441238943 : i_177_);
				class527_sub38.writeBytes(class527_sub38_176_.buffer, 0, i_178_, (byte) 64);
				i_175_ -= method179(i_178_);
				int i_179_ = class527_sub38_176_.anInt10689 * -441238943 - i_178_;
				if (i_179_ != 0) {
					System.arraycopy(class527_sub38_176_.buffer, i_178_, class527_sub38_176_.buffer, 0, i_179_);
					class527_sub38_176_.anInt10689 = i_179_ * 1474750881;
					anInt2456 += method179(i_179_) / method72();
					aList2435.add(0, class527_sub38_176_);
				} else
					class527_sub38_176_.method16599((byte) 112);
				if (i_175_ <= 0)
					break;
			}
			if (aList2435.isEmpty() && method281() == Class370.aClass370_3900)
				method4419(Class370.aClass370_3896);
		}
		return class527_sub38;
	}

	void method4430(Class370 class370) {
		aClass370_2402 = class370;
	}

	int method4431() {
		return anInt2456;
	}

	public void method290(boolean bool, int i, int i_180_, int i_181_) {
		aBool2397 = bool;
		anInt2447 = i;
		anInt2406 = i_180_;
		anInt2407 = i_181_;
	}

	public void method66(RSByteBuffer class527_sub38) {
		if (method281() == Class370.aClass370_3900 || method281() == Class370.aClass370_3896) {
			if (class527_sub38 != null)
				class527_sub38.method16599((byte) 127);
		} else if (class527_sub38 == null) {
			boolean bool = aBool2397 && (anInt2447 > 0 && anInt2448 < anInt2447 || anInt2447 < 0);
			if (aList2435.isEmpty()) {
				if (!bool) {
					method4418();
					method4419(Class370.aClass370_3896);
				}
			} else if (!bool) {
				method4418();
				method4419(Class370.aClass370_3900);
			}
			if (bool)
				method4495(true);
		} else
			method4489(class527_sub38);
	}

	synchronized void method4432(RSByteBuffer class527_sub38) {
		aList2401.add(class527_sub38);
		method4419(Class370.aClass370_3897);
	}

	public void method297(int i, Class390 class390, Class373 class373, int i_182_) {
		anInt2418 = i_182_;
		if (method4401(i, class390, class373)) {
			aClass390_2414 = class390;
			aClass373_2464 = class373;
		} else
			throw new RuntimeException("");
	}

	public Class370 method294() {
		return aClass370_2402;
	}

	public Class370 method288() {
		return aClass370_2402;
	}

	synchronized void method4433() {
		int i = (aClass527_Sub38_2463 != null ? aClass527_Sub38_2463.anInt10689 * -441238943 : 0);
		int i_183_ = 0;
		Iterator iterator = aList2454.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class527_sub38 = (RSByteBuffer) iterator.next();
			i_183_ += class527_sub38.anInt10689 * -441238943;
		}
		if (aClass527_Sub38_2463 != null) {
			if ((aClass527_Sub38_2463.buffer.length - aClass527_Sub38_2463.anInt10689 * -441238943) < i_183_) {
				RSByteBuffer class527_sub38 = method4468(i_183_ + anInt2433);
				class527_sub38.writeBytes((aClass527_Sub38_2463.buffer), (aClass527_Sub38_2463.anInt10689 * -441238943) - anInt2434, anInt2433, (byte) 118);
				aClass527_Sub38_2463.method16599((byte) 113);
				aClass527_Sub38_2463 = class527_sub38;
				i = anInt2434;
			}
		} else {
			aClass527_Sub38_2463 = method4468(i_183_);
			anInt2433 = 0;
			i = 0;
		}
		iterator = aList2454.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class527_sub38 = (RSByteBuffer) iterator.next();
			aClass527_Sub38_2463.writeBytes(class527_sub38.buffer, 0, (class527_sub38.anInt10689 * -441238943), (byte) 113);
			anInt2433 += class527_sub38.anInt10689 * -441238943;
			class527_sub38.method16599((byte) 115);
		}
		aClass527_Sub38_2463.anInt10689 = (i - anInt2434) * 1474750881;
		anInt2434 = 0;
		aList2454.clear();
		while (aBool2431) {
			if (aClass527_Sub38_2463.anInt10689 * -441238943 >= aClass527_Sub38_2463.buffer.length) {
				aBool2431 = false;
				break;
			}
			if (aBool2455 && (float) (anInt2456 / method4437()) > aFloat2408)
				break;
			if (aClass527_Sub38_2463 == null || anInt2433 < 27) {
				if (aClass527_Sub38_2463 != null) {
					anInt2434 = anInt2433;
					aClass527_Sub38_2463.anInt10689 += anInt2433 * 1474750881;
				}
				aBool2431 = false;
				break;
			}
			int i_184_ = aClass527_Sub38_2463.anInt10689 * -441238943;
			int i_185_ = 0;
			int i_186_ = 0;
			if (!method4411(aClass527_Sub38_2463))
				break;
			anInt2446++;
			if (anInt2445 < 0)
				anInt2403++;
			aList2399.clear();
			aList2450.clear();
			aClass527_Sub38_2463.readUnsignedByte();
			int i_187_ = aClass527_Sub38_2463.readUnsignedByte();
			int i_188_ = (aClass527_Sub38_2463.readUnsignedByte() & 0xff | (aClass527_Sub38_2463.readUnsignedByte() & 0xff) << 8 | ((aClass527_Sub38_2463.readUnsignedByte() & 0xff) << 16) | aClass527_Sub38_2463.readUnsignedByte() << 24);
			i_185_ = i_188_ - i_185_;
			aClass527_Sub38_2463.anInt10689 += 2121177616;
			int i_189_ = aClass527_Sub38_2463.readUnsignedByte();
			int i_190_ = aClass527_Sub38_2463.anInt10689 * -441238943;
			int i_191_ = i_190_ + i_189_;
			if (i_191_ > i_184_ + anInt2433) {
				aClass527_Sub38_2463.anInt10689 = (i_184_ + anInt2433) * 1474750881;
				anInt2434 = aClass527_Sub38_2463.anInt10689 * -441238943 - i_184_;
				aBool2431 = false;
			}
			int i_192_ = i_191_;
			int i_193_ = 0;
			if (aBool2431) {
				for (int i_194_ = 0; i_194_ < i_189_; i_194_++) {
					int i_195_ = (aClass527_Sub38_2463.buffer[i_190_++] & 0xff);
					i_191_ += i_195_;
					i_193_ += i_195_;
					if (i_191_ > i_184_ + anInt2433) {
						aClass527_Sub38_2463.anInt10689 = (i_184_ + anInt2433) * 1474750881;
						anInt2434 = (aClass527_Sub38_2463.anInt10689 * -441238943 - i_184_);
						aBool2431 = false;
						break;
					}
					if (i_195_ < 255) {
						aList2399.add(Integer.valueOf(i_192_));
						aList2450.add(Integer.valueOf(i_193_));
						i_192_ = i_191_;
						i_193_ = 0;
					}
				}
			}
			if (aBool2431) {
				int i_196_ = i_191_;
				int i_197_ = -1;
				Iterator iterator_198_ = aList2399.iterator();
				Iterator iterator_199_ = aList2450.iterator();
				boolean bool = false;
				anInt2462 = 0;
				while (iterator_198_.hasNext()) {
					Integer integer = (Integer) iterator_198_.next();
					Integer integer_200_ = (Integer) iterator_199_.next();
					i_197_++;
					if (method316() && aBool2443 == true && anInt2446 < anInt2403 && i_197_ < anInt2445) {
						Class241 class241_201_ = this;
						class241_201_.anInt2439 = class241_201_.anInt2439 + (bool ? 0 : i_185_);
						bool = true;
					} else {
						anAtomicReference2451.set(null);
						boolean bool_202_ = method4422(aClass527_Sub38_2463.buffer, integer.intValue(), integer_200_.intValue(), anAtomicReference2451);
						Class250[] class250s = (Class250[]) anAtomicReference2451.get();
						if (bool_202_ && (aBool2443 != true || anInt2446 >= anInt2403 || i_197_ >= anInt2445)) {
							if (class250s != null) {
								int i_203_ = class250s[0].anInt2780;
								anInt2452 += i_203_;
								if (anInt2452 > i_188_ && i_187_ == 4) {
									anInt2462 = anInt2452 - i_188_ - anInt2462;
									i_203_ -= anInt2462;
									if (anInt2462 > class250s[0].anInt2780)
										anInt2462 = class250s[0].anInt2780;
									if (i_203_ < 0)
										i_203_ = 0;
								}
								int i_204_ = 0;
								int i_205_ = method319(i_203_) * class250s.length;
								if (aBool2443 == true && anInt2439 < anInt2406) {
									int i_206_ = i_205_;
									i_205_ -= method319(anInt2406 - anInt2439);
									if (i_205_ <= 0) {
										anInt2439 += method179(i_206_);
										method4407(class250s);
										Object object = null;
										continue;
									}
									i_204_ += anInt2406 - anInt2439;
								}
								if (anInt2439 + i_203_ > anInt2407 && (anInt2448 < anInt2447 || anInt2447 < 0) && aBool2397) {
									i_205_ -= method319(anInt2439 + i_203_ - anInt2407 - 1);
									if (i_205_ <= 0) {
										method4407(class250s);
										Object object = null;
										continue;
									}
								}
								int i_207_ = method72();
								if (method4402() < method72()) {
									int i_208_ = method72() - method4402();
									i_205_ += i_205_ / method4402() * i_208_;
								}
								RSByteBuffer class527_sub38 = method4468(i_205_);
								for (int i_209_ = i_204_; i_209_ < i_203_; i_209_++) {
									boolean bool_210_ = aBool2443;
									if (anInt2447 != 0) {
										if (anInt2439 == anInt2406) {
											if (anInt2440 < 0) {
												anInt2440 = anInt2442;
												anInt2445 = i_197_;
											}
											aBool2443 = false;
										}
										if (anInt2439 == anInt2407 && anInt2441 < 0)
											anInt2441 = anInt2442;
										if (anInt2439 > anInt2407 && (anInt2448 < anInt2447 || anInt2447 < 0) && aBool2397)
											bool_210_ = true;
									}
									if (bool_210_ && (anInt2439 < anInt2406 || anInt2439 > anInt2407)) {
										anInt2439++;
										if (++i_186_ > i_185_)
											throw new RuntimeException();
									} else {
										for (int i_211_ = 0; i_211_ < i_207_; i_211_++) {
											float f;
											if (i_211_ < class250s.length)
												f = (class250s[i_211_].aFloatArray2781[i_209_]);
											else
												f = (class250s[i_211_ % method4402()].aFloatArray2781[i_209_]);
											if (aClass390_2414 == Class390.aClass390_4003) {
												int i_212_ = method4436(f);
												if (aClass373_2464 == Class373.aClass373_3907)
													class527_sub38.writeShortLE(i_212_, -1663591869);
												else
													class527_sub38.writeShort(i_212_, 1404835786);
											} else if (aClass390_2414 == (Class390.aClass390_4004)) {
												int i_213_ = method4426(f);
												if (aClass373_2464 == Class373.aClass373_3907)
													class527_sub38.writeShortLE(i_213_, 847132098);
												else
													class527_sub38.writeShort(i_213_, 1404835786);
											} else if (aClass390_2414 == (Class390.aClass390_4002)) {
												int i_214_ = method4427(f);
												class527_sub38.writeByte(i_214_, -1031586798);
											} else if (aClass390_2414 == (Class390.aClass390_4001)) {
												int i_215_ = method4428(f);
												class527_sub38.writeByte(i_215_, -1168809631);
											}
										}
										anInt2439++;
										i_186_++;
									}
								}
								synchronized (aList2435) {
									anInt2456 += (method179(class527_sub38.anInt10689 * -441238943) / method72());
									aList2435.add(class527_sub38);
								}
							}
						} else if (method316()) {
							anInt2459 = 0;
							if (aClass250Array2453 == null || (aClass250Array2453 != null && (aClass250Array2453.length != anInt2412 || (aClass250Array2453[0].anInt2780 != anInt2410)))) {
								if (aClass250Array2453 != null)
									method4407(aClass250Array2453);
								aClass250Array2453 = method4404(anInt2412, anInt2410);
							}
						}
						method4407(class250s);
						Object object = null;
					}
				}
				aClass527_Sub38_2463.anInt10689 = i_196_ * 1474750881;
				anInt2433 -= i_196_ - i_184_;
			}
		}
	}

	public void method318(Interface45 interface45) {
		anInterface45_2400 = interface45;
	}

	public int method313() {
		if (aBool2437)
			return method4402() < anInt2418 ? anInt2418 : method4402();
		throw new RuntimeException("");
	}

	void method4434(Class370 class370) {
		aClass370_2402 = class370;
	}

	synchronized void method4435() {
		int i = (aClass527_Sub38_2463 != null ? aClass527_Sub38_2463.anInt10689 * -441238943 : 0);
		int i_216_ = 0;
		Iterator iterator = aList2454.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class527_sub38 = (RSByteBuffer) iterator.next();
			i_216_ += class527_sub38.anInt10689 * -441238943;
		}
		if (aClass527_Sub38_2463 != null) {
			if ((aClass527_Sub38_2463.buffer.length - aClass527_Sub38_2463.anInt10689 * -441238943) < i_216_) {
				RSByteBuffer class527_sub38 = method4468(i_216_ + anInt2433);
				class527_sub38.writeBytes((aClass527_Sub38_2463.buffer), (aClass527_Sub38_2463.anInt10689 * -441238943) - anInt2434, anInt2433, (byte) 20);
				aClass527_Sub38_2463.method16599((byte) 117);
				aClass527_Sub38_2463 = class527_sub38;
				i = anInt2434;
			}
		} else {
			aClass527_Sub38_2463 = method4468(i_216_);
			anInt2433 = 0;
			i = 0;
		}
		iterator = aList2454.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class527_sub38 = (RSByteBuffer) iterator.next();
			aClass527_Sub38_2463.writeBytes(class527_sub38.buffer, 0, (class527_sub38.anInt10689 * -441238943), (byte) 68);
			anInt2433 += class527_sub38.anInt10689 * -441238943;
			class527_sub38.method16599((byte) 115);
		}
		aClass527_Sub38_2463.anInt10689 = (i - anInt2434) * 1474750881;
		anInt2434 = 0;
		aList2454.clear();
		while (aBool2431) {
			if (aClass527_Sub38_2463.anInt10689 * -441238943 >= aClass527_Sub38_2463.buffer.length) {
				aBool2431 = false;
				break;
			}
			if (aBool2455 && (float) (anInt2456 / method4437()) > aFloat2408)
				break;
			if (aClass527_Sub38_2463 == null || anInt2433 < 27) {
				if (aClass527_Sub38_2463 != null) {
					anInt2434 = anInt2433;
					aClass527_Sub38_2463.anInt10689 += anInt2433 * 1474750881;
				}
				aBool2431 = false;
				break;
			}
			int i_217_ = aClass527_Sub38_2463.anInt10689 * -441238943;
			int i_218_ = 0;
			int i_219_ = 0;
			if (!method4411(aClass527_Sub38_2463))
				break;
			anInt2446++;
			if (anInt2445 < 0)
				anInt2403++;
			aList2399.clear();
			aList2450.clear();
			aClass527_Sub38_2463.readUnsignedByte();
			int i_220_ = aClass527_Sub38_2463.readUnsignedByte();
			int i_221_ = (aClass527_Sub38_2463.readUnsignedByte() & 0xff | (aClass527_Sub38_2463.readUnsignedByte() & 0xff) << 8 | ((aClass527_Sub38_2463.readUnsignedByte() & 0xff) << 16) | aClass527_Sub38_2463.readUnsignedByte() << 24);
			i_218_ = i_221_ - i_218_;
			aClass527_Sub38_2463.anInt10689 += 2121177616;
			int i_222_ = aClass527_Sub38_2463.readUnsignedByte();
			int i_223_ = aClass527_Sub38_2463.anInt10689 * -441238943;
			int i_224_ = i_223_ + i_222_;
			if (i_224_ > i_217_ + anInt2433) {
				aClass527_Sub38_2463.anInt10689 = (i_217_ + anInt2433) * 1474750881;
				anInt2434 = aClass527_Sub38_2463.anInt10689 * -441238943 - i_217_;
				aBool2431 = false;
			}
			int i_225_ = i_224_;
			int i_226_ = 0;
			if (aBool2431) {
				for (int i_227_ = 0; i_227_ < i_222_; i_227_++) {
					int i_228_ = (aClass527_Sub38_2463.buffer[i_223_++] & 0xff);
					i_224_ += i_228_;
					i_226_ += i_228_;
					if (i_224_ > i_217_ + anInt2433) {
						aClass527_Sub38_2463.anInt10689 = (i_217_ + anInt2433) * 1474750881;
						anInt2434 = (aClass527_Sub38_2463.anInt10689 * -441238943 - i_217_);
						aBool2431 = false;
						break;
					}
					if (i_228_ < 255) {
						aList2399.add(Integer.valueOf(i_225_));
						aList2450.add(Integer.valueOf(i_226_));
						i_225_ = i_224_;
						i_226_ = 0;
					}
				}
			}
			if (aBool2431) {
				int i_229_ = i_224_;
				int i_230_ = -1;
				Iterator iterator_231_ = aList2399.iterator();
				Iterator iterator_232_ = aList2450.iterator();
				boolean bool = false;
				anInt2462 = 0;
				while (iterator_231_.hasNext()) {
					Integer integer = (Integer) iterator_231_.next();
					Integer integer_233_ = (Integer) iterator_232_.next();
					i_230_++;
					if (method316() && aBool2443 == true && anInt2446 < anInt2403 && i_230_ < anInt2445) {
						Class241 class241_234_ = this;
						class241_234_.anInt2439 = class241_234_.anInt2439 + (bool ? 0 : i_218_);
						bool = true;
					} else {
						anAtomicReference2451.set(null);
						boolean bool_235_ = method4422(aClass527_Sub38_2463.buffer, integer.intValue(), integer_233_.intValue(), anAtomicReference2451);
						Class250[] class250s = (Class250[]) anAtomicReference2451.get();
						if (bool_235_ && (aBool2443 != true || anInt2446 >= anInt2403 || i_230_ >= anInt2445)) {
							if (class250s != null) {
								int i_236_ = class250s[0].anInt2780;
								anInt2452 += i_236_;
								if (anInt2452 > i_221_ && i_220_ == 4) {
									anInt2462 = anInt2452 - i_221_ - anInt2462;
									i_236_ -= anInt2462;
									if (anInt2462 > class250s[0].anInt2780)
										anInt2462 = class250s[0].anInt2780;
									if (i_236_ < 0)
										i_236_ = 0;
								}
								int i_237_ = 0;
								int i_238_ = method319(i_236_) * class250s.length;
								if (aBool2443 == true && anInt2439 < anInt2406) {
									int i_239_ = i_238_;
									i_238_ -= method319(anInt2406 - anInt2439);
									if (i_238_ <= 0) {
										anInt2439 += method179(i_239_);
										method4407(class250s);
										Object object = null;
										continue;
									}
									i_237_ += anInt2406 - anInt2439;
								}
								if (anInt2439 + i_236_ > anInt2407 && (anInt2448 < anInt2447 || anInt2447 < 0) && aBool2397) {
									i_238_ -= method319(anInt2439 + i_236_ - anInt2407 - 1);
									if (i_238_ <= 0) {
										method4407(class250s);
										Object object = null;
										continue;
									}
								}
								int i_240_ = method72();
								if (method4402() < method72()) {
									int i_241_ = method72() - method4402();
									i_238_ += i_238_ / method4402() * i_241_;
								}
								RSByteBuffer class527_sub38 = method4468(i_238_);
								for (int i_242_ = i_237_; i_242_ < i_236_; i_242_++) {
									boolean bool_243_ = aBool2443;
									if (anInt2447 != 0) {
										if (anInt2439 == anInt2406) {
											if (anInt2440 < 0) {
												anInt2440 = anInt2442;
												anInt2445 = i_230_;
											}
											aBool2443 = false;
										}
										if (anInt2439 == anInt2407 && anInt2441 < 0)
											anInt2441 = anInt2442;
										if (anInt2439 > anInt2407 && (anInt2448 < anInt2447 || anInt2447 < 0) && aBool2397)
											bool_243_ = true;
									}
									if (bool_243_ && (anInt2439 < anInt2406 || anInt2439 > anInt2407)) {
										anInt2439++;
										if (++i_219_ > i_218_)
											throw new RuntimeException();
									} else {
										for (int i_244_ = 0; i_244_ < i_240_; i_244_++) {
											float f;
											if (i_244_ < class250s.length)
												f = (class250s[i_244_].aFloatArray2781[i_242_]);
											else
												f = (class250s[i_244_ % method4402()].aFloatArray2781[i_242_]);
											if (aClass390_2414 == Class390.aClass390_4003) {
												int i_245_ = method4436(f);
												if (aClass373_2464 == Class373.aClass373_3907)
													class527_sub38.writeShortLE(i_245_, 442215068);
												else
													class527_sub38.writeShort(i_245_, 1404835786);
											} else if (aClass390_2414 == (Class390.aClass390_4004)) {
												int i_246_ = method4426(f);
												if (aClass373_2464 == Class373.aClass373_3907)
													class527_sub38.writeShortLE(i_246_, 1575994831);
												else
													class527_sub38.writeShort(i_246_, 1404835786);
											} else if (aClass390_2414 == (Class390.aClass390_4002)) {
												int i_247_ = method4427(f);
												class527_sub38.writeByte(i_247_, -1550314808);
											} else if (aClass390_2414 == (Class390.aClass390_4001)) {
												int i_248_ = method4428(f);
												class527_sub38.writeByte(i_248_, 602513358);
											}
										}
										anInt2439++;
										i_219_++;
									}
								}
								synchronized (aList2435) {
									anInt2456 += (method179(class527_sub38.anInt10689 * -441238943) / method72());
									aList2435.add(class527_sub38);
								}
							}
						} else if (method316()) {
							anInt2459 = 0;
							if (aClass250Array2453 == null || (aClass250Array2453 != null && (aClass250Array2453.length != anInt2412 || (aClass250Array2453[0].anInt2780 != anInt2410)))) {
								if (aClass250Array2453 != null)
									method4407(aClass250Array2453);
								aClass250Array2453 = method4404(anInt2412, anInt2410);
							}
						}
						method4407(class250s);
						Object object = null;
					}
				}
				aClass527_Sub38_2463.anInt10689 = i_229_ * 1474750881;
				anInt2433 -= i_229_ - i_217_;
			}
		}
	}

	public void method283(Interface45 interface45) {
		anInterface45_2400 = interface45;
	}

	int method4436(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	public void method284(RSByteBuffer class527_sub38) {
		if (method281() == Class370.aClass370_3900 || method281() == Class370.aClass370_3896) {
			if (class527_sub38 != null)
				class527_sub38.method16599((byte) 114);
		} else if (class527_sub38 == null) {
			boolean bool = aBool2397 && (anInt2447 > 0 && anInt2448 < anInt2447 || anInt2447 < 0);
			if (aList2435.isEmpty()) {
				if (!bool) {
					method4418();
					method4419(Class370.aClass370_3896);
				}
			} else if (!bool) {
				method4418();
				method4419(Class370.aClass370_3900);
			}
			if (bool)
				method4495(true);
		} else
			method4489(class527_sub38);
	}

	public void method280(RSByteBuffer class527_sub38) {
		if (method281() == Class370.aClass370_3900 || method281() == Class370.aClass370_3896) {
			if (class527_sub38 != null)
				class527_sub38.method16599((byte) 107);
		} else if (class527_sub38 == null) {
			boolean bool = aBool2397 && (anInt2447 > 0 && anInt2448 < anInt2447 || anInt2447 < 0);
			if (aList2435.isEmpty()) {
				if (!bool) {
					method4418();
					method4419(Class370.aClass370_3896);
				}
			} else if (!bool) {
				method4418();
				method4419(Class370.aClass370_3900);
			}
			if (bool)
				method4495(true);
		} else
			method4489(class527_sub38);
	}

	public void method301() {
		if (method281() == Class370.aClass370_3902 || method281() == Class370.aClass370_3901 || method281() == Class370.aClass370_3897) {
			method4419(Class370.aClass370_3898);
			method4409();
		}
	}

	public RSByteBuffer method299(int i) {
		RSByteBuffer class527_sub38 = method4429(i);
		return class527_sub38;
	}

	int method4437() {
		if (method316())
			return anInt2430;
		throw new RuntimeException("");
	}

	RSByteBuffer method4438(int i) {
		return new RSByteBuffer(i, true);
	}

	synchronized void method4439(boolean bool) {
		aBool2455 = bool;
	}

	public Class390 method306() {
		return aClass390_2414;
	}

	public int method304(int i) {
		return i / (method307().anInt4005 * 370905523 / 8);
	}

	public Class373 method287() {
		return aClass373_2464;
	}

	public Class373 method309() {
		return aClass373_2464;
	}

	public Class373 method310() {
		return aClass373_2464;
	}

	synchronized void method4440(boolean bool) {
		aBool2455 = bool;
	}

	int method4441(int i) {
		int i_249_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_249_++;
		return i_249_;
	}

	void method4442(byte[] is, int i) {
		aByteArray2417 = is;
		anInt2460 = i;
		anInt2461 = 0;
	}

	boolean method4443(int i, Class390 class390, Class373 class373) {
		if (class390 == Class390.aClass390_4003)
			return true;
		if (class390 == Class390.aClass390_4002)
			return true;
		if (class390 == Class390.aClass390_4004)
			return true;
		if (class390 == Class390.aClass390_4001)
			return true;
		return false;
	}

	int method4444() {
		if (aBool2437)
			return anInt2412;
		throw new RuntimeException("");
	}

	int method4445() {
		return anInt2456;
	}

	int method4446() {
		if (aBool2437)
			return anInt2412;
		throw new RuntimeException("");
	}

	int method4447(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	public int method308() {
		if (aBool2437)
			return method4402() < anInt2418 ? anInt2418 : method4402();
		throw new RuntimeException("");
	}

	public int method315() {
		if (aBool2437)
			return method4402() < anInt2418 ? anInt2418 : method4402();
		throw new RuntimeException("");
	}

	public int method300() {
		if (aBool2437)
			return method4402() < anInt2418 ? anInt2418 : method4402();
		throw new RuntimeException("");
	}

	int method4448() {
		if (aBool2437)
			return anInt2412;
		throw new RuntimeException("");
	}

	public int method296(int i) {
		return i * (method307().anInt4005 * 370905523 / 8);
	}

	public int method305(int i) {
		return i / (method307().anInt4005 * 370905523 / 8);
	}

	Class250[] method4449(int i, int i_250_) {
		Class250[] class250s = new Class250[i];
		for (int i_251_ = 0; i_251_ < class250s.length; i_251_++)
			class250s[i_251_] = method4405(i_250_);
		return class250s;
	}

	Class250[] method4450(int i, int i_252_) {
		Class250[] class250s = new Class250[i];
		for (int i_253_ = 0; i_253_ < class250s.length; i_253_++)
			class250s[i_253_] = method4405(i_252_);
		return class250s;
	}

	Class250 method4451(int i) {
		synchronized (aClass205_2419) {
			Object object = null;
			Class250 class250 = (Class250) aClass205_2419.method3797(-1810236839);
			Class250 class250_254_ = null;
			int i_255_ = i;
			for (/**/; class250 != null; class250 = (Class250) aClass205_2419.method3798((byte) -16)) {
				if (class250.aFloatArray2781.length > i && !class250.aBool2782 && (class250_254_ == null || class250.aFloatArray2781.length < i_255_)) {
					class250_254_ = class250;
					i_255_ = class250_254_.aFloatArray2781.length;
				}
				if (class250.aFloatArray2781.length == i && !class250.aBool2782)
					break;
			}
			if (class250 == null)
				class250 = class250_254_;
			if (class250 == null) {
				class250 = new Class250(this);
				int i_256_ = 0;
				boolean bool = false;
				while (!bool && i_256_ < 1000) {
					if (aClass205_2419.method3787((long) i_256_) != null)
						i_256_++;
					else
						bool = true;
				}
				class250.anInt2783 = i_256_;
				float[] fs = new float[i];
				class250.aFloatArray2781 = fs;
				class250.aBool2782 = true;
				class250.anInt2780 = i;
				if (aClass205_2419.method3789(1548510519) >= i * 4) {
					/* empty */
				}
				aClass205_2419.method3813(class250, (long) class250.anInt2783, fs.length * 4, 2046459177);
			} else {
				for (int i_257_ = 0; i_257_ < class250.aFloatArray2781.length; i_257_++)
					class250.aFloatArray2781[i_257_] = 0.0F;
				class250.anInt2780 = i;
			}
			class250.aBool2782 = true;
			Class250 class250_258_ = class250;
			return class250_258_;
		}
	}

	public void method292() {
		if (method281() != Class370.aClass370_3898) {
			method4495(false);
			method4419(Class370.aClass370_3901);
		} else {
			method4495(false);
			method4419(Class370.aClass370_3902);
		}
	}

	void method4452(Class250 class250) {
		if (class250 != null) {
			synchronized (aClass205_2419) {
				class250.aBool2782 = false;
			}
		}
	}

	int method4453() {
		return anInt2456;
	}

	public int method303() {
		return method4431();
	}

	float method4454(int i) {
		int i_259_ = i & 0x1fffff;
		int i_260_ = i & ~0x7fffffff;
		int i_261_ = (i & 0x7fe00000) >> 21;
		if (i_260_ != 0)
			i_259_ = -i_259_;
		return (float) ((double) i_259_ * Math.pow(2.0, (double) (i_261_ - 788)));
	}

	synchronized void method4455(boolean bool) {
		if (!bool) {
			anInt2409 = 0;
			anInt2410 = 0;
			aBoolArray2415 = null;
			anIntArray2416 = null;
			method4407(aClass250Array2411);
			aClass250Array2411 = null;
			method4407(aClass250Array2453);
			aClass250Array2453 = null;
			anInt2459 = 0;
			anInt2458 = 0;
			aBoolArray2420 = null;
			method4407(aClass250Array2395);
			aClass250Array2395 = null;
			method4406(aClass250_2422);
			method4406(aClass250_2423);
			method4406(aClass250_2421);
			method4406(aClass250_2425);
			method4406(aClass250_2426);
			method4406(aClass250_2427);
			aClass250_2422 = null;
			aClass250_2423 = null;
			aClass250_2421 = null;
			aClass250_2425 = null;
			aClass250_2426 = null;
			aClass250_2427 = null;
			anIntArray2428 = null;
			anIntArray2429 = null;
		}
		anInt2452 = 0;
		Iterator iterator = aList2454.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class527_sub38 = (RSByteBuffer) iterator.next();
			class527_sub38.method16599((byte) 122);
		}
		aList2454.clear();
		aBool2431 = false;
		if (aClass527_Sub38_2463 != null) {
			synchronized (aClass527_Sub38_2463) {
				aClass527_Sub38_2463.method16599((byte) 116);
				aClass527_Sub38_2463 = null;
			}
		}
		anInt2433 = 0;
		anInt2434 = 0;
		if (!bool) {
			synchronized (aList2435) {
				Iterator iterator_262_ = aList2435.iterator();
				while (iterator_262_.hasNext()) {
					RSByteBuffer class527_sub38 = (RSByteBuffer) iterator_262_.next();
					class527_sub38.method16599((byte) 107);
				}
				aList2435.clear();
			}
			anInt2456 = 0;
		}
		synchronized (aList2401) {
			Iterator iterator_263_ = aList2401.iterator();
			while (iterator_263_.hasNext()) {
				RSByteBuffer class527_sub38 = (RSByteBuffer) iterator_263_.next();
				class527_sub38.method16599((byte) 121);
			}
			aList2401.clear();
		}
		aBool2436 = false;
		anInt2439 = 0;
		anInt2442 = -1;
		anInt2446 = -1;
		if (!bool) {
			method4403(false);
			aBool2437 = false;
			anInt2406 = -1;
			anInt2407 = -1;
			anInt2447 = 0;
			anInt2448 = 0;
			anInt2440 = -1;
			anInt2441 = -1;
			anInt2403 = -1;
			anInt2445 = -1;
			aBool2443 = false;
			aBool2397 = false;
		} else {
			anInt2448++;
			aBool2443 = true;
		}
	}

	void method4456() {
		if (method281() != Class370.aClass370_3900) {
			method4461();
			if (method281() == Class370.aClass370_3898)
				method4419(Class370.aClass370_3897);
		}
	}

	void method4457() {
		if (method281() != Class370.aClass370_3900) {
			method4461();
			if (method281() == Class370.aClass370_3898)
				method4419(Class370.aClass370_3897);
		}
	}

	void method4458() {
		if (method281() != Class370.aClass370_3900) {
			method4461();
			if (method281() == Class370.aClass370_3898)
				method4419(Class370.aClass370_3897);
		}
	}

	void method4459(RSByteBuffer class527_sub38) {
		aList2454.add(class527_sub38);
	}

	boolean method4460(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 79 || class527_sub38.readUnsignedByte() != 103 || class527_sub38.readUnsignedByte() != 103 || class527_sub38.readUnsignedByte() != 83)
			return false;
		return true;
	}

	void method4461() {
		if (method281() != Class370.aClass370_3902 && method281() != Class370.aClass370_3899 && (!aBool2455 || !((float) (anInt2456 / method4437()) > aFloat2408))) {
			if (!method4410()) {
				RSByteBuffer class527_sub38 = ((RSByteBuffer) (aList2401 != null && !aList2401.isEmpty() ? aList2401.get(0) : null));
				if (class527_sub38 == null) {
					if (!aBool2436) {
						method4419(Class370.aClass370_3899);
						anInterface45_2400.method205((byte) -14);
						aBool2436 = true;
					}
					return;
				}
				aBool2436 = false;
				aBool2431 = true;
				aList2401.remove(0);
				method4503(class527_sub38);
			}
			method4433();
		}
	}

	boolean method4462(byte[] is, int i, int i_264_) {
		if (is[i] != i_264_)
			return false;
		if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114 || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
			return false;
		return true;
	}

	float method4463(int i) {
		int i_265_ = i & 0x1fffff;
		int i_266_ = i & ~0x7fffffff;
		int i_267_ = (i & 0x7fe00000) >> 21;
		if (i_266_ != 0)
			i_265_ = -i_265_;
		return (float) ((double) i_265_ * Math.pow(2.0, (double) (i_267_ - 788)));
	}

	float method4464(int i) {
		int i_268_ = i & 0x1fffff;
		int i_269_ = i & ~0x7fffffff;
		int i_270_ = (i & 0x7fe00000) >> 21;
		if (i_269_ != 0)
			i_268_ = -i_268_;
		return (float) ((double) i_268_ * Math.pow(2.0, (double) (i_270_ - 788)));
	}

	public Class390 method289() {
		return aClass390_2414;
	}

	int method4465() {
		return anInt2460;
	}

	float method4466(int i) {
		int i_271_ = i & 0x1fffff;
		int i_272_ = i & ~0x7fffffff;
		int i_273_ = (i & 0x7fe00000) >> 21;
		if (i_272_ != 0)
			i_271_ = -i_271_;
		return (float) ((double) i_271_ * Math.pow(2.0, (double) (i_273_ - 788)));
	}

	int method4467() {
		return anInt2461;
	}

	RSByteBuffer method4468(int i) {
		return new RSByteBuffer(i, true);
	}

	public Class241(float f) {
		anInt2433 = 0;
		anInt2434 = 0;
		aList2435 = new ArrayList();
		aList2399 = new ArrayList();
		aList2450 = new ArrayList();
		anAtomicReference2451 = new AtomicReference(null);
		anInt2462 = 0;
		aBool2397 = false;
		anInt2456 = 0;
		aBoolArray2449 = null;
		aBoolArray2438 = null;
		aBoolArray2457 = null;
		aFloat2408 = f;
		aClass390_2414 = Class390.aClass390_4003;
		aClass373_2464 = Class373.aClass373_3907;
		method4495(false);
	}

	void method4469(byte[] is, int i) {
		aByteArray2417 = is;
		anInt2460 = i;
		anInt2461 = 0;
	}

	void method4470(byte[] is, int i) {
		aByteArray2417 = is;
		anInt2460 = i;
		anInt2461 = 0;
	}

	public void method291(boolean bool) {
		if (!bool)
			method285();
		else if (method281() == Class370.aClass370_3896) {
			method4495(true);
			method4419(Class370.aClass370_3897);
		}
	}

	int method4471() {
		int i = aByteArray2417[anInt2460] >> anInt2461 & 0x1;
		anInt2461++;
		anInt2460 += anInt2461 >> 3;
		anInt2461 &= 0x7;
		return i;
	}

	int method4472() {
		int i = aByteArray2417[anInt2460] >> anInt2461 & 0x1;
		anInt2461++;
		anInt2460 += anInt2461 >> 3;
		anInt2461 &= 0x7;
		return i;
	}

	int method4473() {
		int i = aByteArray2417[anInt2460] >> anInt2461 & 0x1;
		anInt2461++;
		anInt2460 += anInt2461 >> 3;
		anInt2461 &= 0x7;
		return i;
	}

	int method4474() {
		int i = aByteArray2417[anInt2460] >> anInt2461 & 0x1;
		anInt2461++;
		anInt2460 += anInt2461 >> 3;
		anInt2461 &= 0x7;
		return i;
	}

	int method4475(int i) {
		int i_274_ = 0;
		int i_275_ = 0;
		int i_276_;
		for (/**/; i >= 8 - anInt2461; i -= i_276_) {
			i_276_ = 8 - anInt2461;
			int i_277_ = (1 << i_276_) - 1;
			i_274_ += (aByteArray2417[anInt2460] >> anInt2461 & i_277_) << i_275_;
			anInt2461 = 0;
			anInt2460++;
			i_275_ += i_276_;
		}
		if (i > 0) {
			i_276_ = (1 << i) - 1;
			i_274_ += (aByteArray2417[anInt2460] >> anInt2461 & i_276_) << i_275_;
			anInt2461 += i;
		}
		return i_274_;
	}

	int method4476(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	void method4477() {
		aByteArray2417 = null;
	}

	void method4478() {
		aByteArray2417 = null;
	}

	void method4479() {
		int i = method4413(8) + 1;
		Iterator iterator = aList2405.iterator();
		while (iterator.hasNext()) {
			Class247 class247 = (Class247) iterator.next();
			if (class247.anInt2721 == 0 && class247.anInt2722 == 0) {
				if (class247.aClass233Array2719.length == i && class247.anInt2723 == anInt2412 && class247.anInt2724 == anInt2430 && class247.anInt2720 == anInt2398) {
					aClass233Array2444 = class247.aClass233Array2719;
					for (int i_278_ = 0; i_278_ < aClass233Array2444.length; i_278_++)
						aClass233Array2444[i_278_].method4334(this);
					return;
				}
			}
		}
		aClass233Array2444 = new Class233[i];
		for (int i_279_ = 0; i_279_ < i; i_279_++) {
			if (aClass233Array2444[i_279_] == null)
				aClass233Array2444[i_279_] = new Class233();
			aClass233Array2444[i_279_].method4344(this);
		}
		Class247 class247 = new Class247(anInt2412, anInt2430, anInt2432, anInt2396, anInt2398, aClass233Array2444);
		aList2405.add(class247);
	}

	public void method317(boolean bool, int i, int i_280_, int i_281_) {
		aBool2397 = bool;
		anInt2447 = i;
		anInt2406 = i_280_;
		anInt2407 = i_281_;
	}

	void method4480(Class370 class370) {
		aClass370_2402 = class370;
	}

	boolean method4481(byte[] is, int i, int i_282_, AtomicReference atomicreference) {
		if (is == null)
			throw new RuntimeException("");
		if (i + i_282_ > is.length)
			return false;
		method4425(is, i);
		int i_283_ = method4416();
		if (i_283_ != 0) {
			method4420(is, i);
			return false;
		}
		if (!method316())
			throw new RuntimeException();
		int i_284_ = method4413(method4497(anIntArray2416.length - 1));
		boolean bool = aBoolArray2415[i_284_];
		int i_285_ = bool ? anInt2410 : anInt2409;
		boolean bool_286_ = false;
		boolean bool_287_ = false;
		if (bool) {
			bool_286_ = method4416() != 0;
			bool_287_ = method4416() != 0;
		}
		int i_288_ = i_285_ >> 1;
		int i_289_;
		int i_290_;
		int i_291_;
		if (bool && !bool_286_) {
			i_289_ = (i_285_ >> 2) - (anInt2409 >> 2);
			i_290_ = (i_285_ >> 2) + (anInt2409 >> 2);
			i_291_ = anInt2409 >> 1;
		} else {
			i_289_ = 0;
			i_290_ = i_288_;
			i_291_ = i_285_ >> 1;
		}
		int i_292_;
		int i_293_;
		int i_294_;
		if (bool && !bool_287_) {
			i_292_ = i_285_ - (i_285_ >> 2) - (anInt2409 >> 2);
			i_293_ = i_285_ - (i_285_ >> 2) + (anInt2409 >> 2);
			i_294_ = anInt2409 >> 1;
		} else {
			i_292_ = i_288_;
			i_293_ = i_285_;
			i_294_ = i_285_ >> 1;
		}
		Class252 class252 = aClass252Array2424[anIntArray2416[i_284_]];
		if (aBoolArray2449 == null || aBoolArray2449.length != anInt2412) {
			aBoolArray2449 = new boolean[anInt2412];
			aBoolArray2438 = new boolean[anInt2412];
		}
		for (int i_295_ = 0; i_295_ < anInt2412; i_295_++) {
			int i_296_ = (class252.anIntArray2796 != null ? class252.anIntArray2796[i_295_] : 0);
			int i_297_ = i_296_;
			int i_298_ = class252.anIntArray2797[i_297_];
			aBoolArray2449[i_295_] = !aClass256Array2404[i_298_].method4716(i_295_);
			aBoolArray2438[i_295_] = aBoolArray2449[i_295_];
		}
		for (int i_299_ = 0; i_299_ < class252.anInt2800; i_299_++) {
			if (!aBoolArray2449[class252.anIntArray2794[i_299_]] || !aBoolArray2449[class252.anIntArray2795[i_299_]]) {
				aBoolArray2449[class252.anIntArray2794[i_299_]] = false;
				aBoolArray2449[class252.anIntArray2795[i_299_]] = false;
			}
		}
		if (aBoolArray2457 == null || aBoolArray2457.length != anInt2412)
			aBoolArray2457 = new boolean[anInt2412];
		for (int i_300_ = 0; i_300_ < class252.anInt2801; i_300_++) {
			int i_301_ = 0;
			for (int i_302_ = 0; i_302_ < anInt2412; i_302_++) {
				int i_303_ = (class252.anIntArray2796 != null ? class252.anIntArray2796[i_302_] : i_300_);
				if (i_303_ == i_300_)
					aBoolArray2457[i_301_++] = aBoolArray2449[i_302_];
			}
			Class251 class251 = aClass251Array2413[class252.anIntArray2798[i_300_]];
			Object object = null;
			Class250[] class250s;
			if (class251.anInt2785 == 2) {
				Class250[] class250s_304_ = method4404(1, anInt2412 * i_285_);
				for (int i_305_ = 0; i_305_ < i_285_; i_305_++) {
					for (int i_306_ = 0; i_306_ < anInt2412; i_306_++) {
						try {
							class250s_304_[0].aFloatArray2781[i_305_ * anInt2412 + i_306_] = (aClass250Array2395[i_306_].aFloatArray2781[i_305_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				class250s_304_ = class251.method4666(class250s_304_, i_285_ >> 1, aBoolArray2457);
				class250s = aClass250Array2395;
				for (int i_307_ = 0; i_307_ < i_285_; i_307_++) {
					for (int i_308_ = 0; i_308_ < anInt2412; i_308_++) {
						try {
							class250s[i_308_].aFloatArray2781[i_307_] = (class250s_304_[0].aFloatArray2781[anInt2412 * i_307_ + i_308_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				method4407(class250s_304_);
				Object object_309_ = null;
			} else
				class250s = class251.method4666(aClass250Array2395, i_285_ >> 1, aBoolArray2457);
			if (class252.anIntArray2796 != null) {
				i_301_ = 0;
				for (int i_310_ = 0; i_310_ < anInt2412; i_310_++) {
					int i_311_ = class252.anIntArray2796[i_310_];
					if (i_311_ == i_300_)
						aClass250Array2395[i_310_] = class250s[i_301_++];
				}
			} else {
				if (aClass250Array2395 != class250s)
					method4407(aClass250Array2395);
				aClass250Array2395 = class250s;
			}
		}
		for (int i_312_ = class252.anInt2800 - 1; i_312_ >= 0; i_312_--) {
			Class250 class250 = aClass250Array2395[class252.anIntArray2794[i_312_]];
			Class250 class250_313_ = aClass250Array2395[class252.anIntArray2795[i_312_]];
			for (int i_314_ = 0; i_314_ < class250.anInt2780; i_314_++) {
				float f = class250.aFloatArray2781[i_314_];
				float f_315_ = class250_313_.aFloatArray2781[i_314_];
				float f_316_ = f;
				float f_317_ = f_315_;
				if (f > 0.0F) {
					if (f_315_ > 0.0F) {
						f_316_ = f;
						f_317_ = f - f_315_;
					} else {
						f_317_ = f;
						f_316_ = f + f_315_;
					}
				} else if (f_315_ > 0.0F) {
					f_316_ = f;
					f_317_ = f + f_315_;
				} else {
					f_317_ = f;
					f_316_ = f - f_315_;
				}
				class250.aFloatArray2781[i_314_] = f_316_;
				class250_313_.aFloatArray2781[i_314_] = f_317_;
			}
		}
		for (int i_318_ = 0; i_318_ < aBoolArray2449.length; i_318_++)
			aBoolArray2449[i_318_] = aBoolArray2438[i_318_];
		for (int i_319_ = 0; i_319_ < anInt2412; i_319_++) {
			if (!aBoolArray2449[i_319_]) {
				int i_320_ = (class252.anIntArray2796 != null ? class252.anIntArray2796[i_319_] : 0);
				int i_321_ = i_320_;
				int i_322_ = class252.anIntArray2797[i_321_];
				aClass256Array2404[i_322_].method4717(i_319_);
				aClass256Array2404[i_322_].method4718((aClass250Array2395[i_319_]), i_285_ >> 1, i_319_);
			}
		}
		for (int i_323_ = 0; i_323_ < anInt2412; i_323_++) {
			if (aBoolArray2449[i_323_]) {
				for (int i_324_ = i_285_ >> 1; i_324_ < i_285_; i_324_++)
					aClass250Array2395[i_323_].aFloatArray2781[i_324_] = 0.0F;
			} else {
				int i_325_ = i_285_ >> 1;
				int i_326_ = i_285_ >> 2;
				int i_327_ = i_285_ >> 3;
				Class250 class250 = aClass250Array2395[i_323_];
				for (int i_328_ = 0; i_328_ < i_325_; i_328_++)
					class250.aFloatArray2781[i_328_] *= 0.5F;
				for (int i_329_ = i_325_; i_329_ < i_285_; i_329_++)
					class250.aFloatArray2781[i_329_] = -class250.aFloatArray2781[i_285_ - i_329_ - 1];
				Class250 class250_330_ = bool ? aClass250_2425 : aClass250_2422;
				Class250 class250_331_ = bool ? aClass250_2426 : aClass250_2423;
				Class250 class250_332_ = bool ? aClass250_2427 : aClass250_2421;
				int[] is_333_ = bool ? anIntArray2429 : anIntArray2428;
				for (int i_334_ = 0; i_334_ < i_326_; i_334_++) {
					float f = (class250.aFloatArray2781[4 * i_334_] - (class250.aFloatArray2781[i_285_ - 4 * i_334_ - 1]));
					float f_335_ = (class250.aFloatArray2781[4 * i_334_ + 2] - (class250.aFloatArray2781[i_285_ - 4 * i_334_ - 3]));
					float f_336_ = class250_330_.aFloatArray2781[2 * i_334_];
					float f_337_ = class250_330_.aFloatArray2781[2 * i_334_ + 1];
					class250.aFloatArray2781[i_285_ - 4 * i_334_ - 1] = f * f_336_ - f_335_ * f_337_;
					class250.aFloatArray2781[i_285_ - 4 * i_334_ - 3] = f * f_337_ + f_335_ * f_336_;
				}
				for (int i_338_ = 0; i_338_ < i_327_; i_338_++) {
					float f = class250.aFloatArray2781[i_325_ + 3 + 4 * i_338_];
					float f_339_ = class250.aFloatArray2781[i_325_ + 1 + 4 * i_338_];
					float f_340_ = class250.aFloatArray2781[4 * i_338_ + 3];
					float f_341_ = class250.aFloatArray2781[4 * i_338_ + 1];
					class250.aFloatArray2781[i_325_ + 3 + 4 * i_338_] = f + f_340_;
					class250.aFloatArray2781[i_325_ + 1 + 4 * i_338_] = f_339_ + f_341_;
					float f_342_ = (class250_330_.aFloatArray2781[i_325_ - 4 - 4 * i_338_]);
					float f_343_ = (class250_330_.aFloatArray2781[i_325_ - 3 - 4 * i_338_]);
					class250.aFloatArray2781[4 * i_338_ + 3] = (f - f_340_) * f_342_ - (f_339_ - f_341_) * f_343_;
					class250.aFloatArray2781[4 * i_338_ + 1] = (f_339_ - f_341_) * f_342_ + (f - f_340_) * f_343_;
				}
				int i_344_ = Class15.method735(i_285_ - 1, (byte) -60);
				for (int i_345_ = 0; i_345_ < i_344_ - 3; i_345_++) {
					int i_346_ = i_285_ >> i_345_ + 2;
					int i_347_ = 8 << i_345_;
					for (int i_348_ = 0; i_348_ < 2 << i_345_; i_348_++) {
						int i_349_ = i_285_ - i_346_ * 2 * i_348_;
						int i_350_ = i_285_ - i_346_ * (2 * i_348_ + 1);
						for (int i_351_ = 0; i_351_ < i_285_ >> i_345_ + 4; i_351_++) {
							int i_352_ = 4 * i_351_;
							float f = (class250.aFloatArray2781[i_349_ - 1 - i_352_]);
							float f_353_ = (class250.aFloatArray2781[i_349_ - 3 - i_352_]);
							float f_354_ = (class250.aFloatArray2781[i_350_ - 1 - i_352_]);
							float f_355_ = (class250.aFloatArray2781[i_350_ - 3 - i_352_]);
							class250.aFloatArray2781[i_349_ - 1 - i_352_] = f + f_354_;
							class250.aFloatArray2781[i_349_ - 3 - i_352_] = f_353_ + f_355_;
							float f_356_ = (class250_330_.aFloatArray2781[i_351_ * i_347_]);
							float f_357_ = (class250_330_.aFloatArray2781[i_351_ * i_347_ + 1]);
							class250.aFloatArray2781[i_350_ - 1 - i_352_] = ((f - f_354_) * f_356_ - (f_353_ - f_355_) * f_357_);
							class250.aFloatArray2781[i_350_ - 3 - i_352_] = ((f_353_ - f_355_) * f_356_ + (f - f_354_) * f_357_);
						}
					}
				}
				for (int i_358_ = 1; i_358_ < i_327_ - 1; i_358_++) {
					int i_359_ = is_333_[i_358_];
					if (i_358_ < i_359_) {
						int i_360_ = 8 * i_358_;
						int i_361_ = 8 * i_359_;
						float f = class250.aFloatArray2781[i_360_ + 1];
						class250.aFloatArray2781[i_360_ + 1] = class250.aFloatArray2781[i_361_ + 1];
						class250.aFloatArray2781[i_361_ + 1] = f;
						f = class250.aFloatArray2781[i_360_ + 3];
						class250.aFloatArray2781[i_360_ + 3] = class250.aFloatArray2781[i_361_ + 3];
						class250.aFloatArray2781[i_361_ + 3] = f;
						f = class250.aFloatArray2781[i_360_ + 5];
						class250.aFloatArray2781[i_360_ + 5] = class250.aFloatArray2781[i_361_ + 5];
						class250.aFloatArray2781[i_361_ + 5] = f;
						f = class250.aFloatArray2781[i_360_ + 7];
						class250.aFloatArray2781[i_360_ + 7] = class250.aFloatArray2781[i_361_ + 7];
						class250.aFloatArray2781[i_361_ + 7] = f;
					}
				}
				for (int i_362_ = 0; i_362_ < i_325_; i_362_++)
					class250.aFloatArray2781[i_362_] = class250.aFloatArray2781[2 * i_362_ + 1];
				for (int i_363_ = 0; i_363_ < i_327_; i_363_++) {
					class250.aFloatArray2781[i_285_ - 1 - 2 * i_363_] = class250.aFloatArray2781[4 * i_363_];
					class250.aFloatArray2781[i_285_ - 2 - 2 * i_363_] = class250.aFloatArray2781[4 * i_363_ + 1];
					class250.aFloatArray2781[i_285_ - i_326_ - 1 - 2 * i_363_] = class250.aFloatArray2781[4 * i_363_ + 2];
					class250.aFloatArray2781[i_285_ - i_326_ - 2 - 2 * i_363_] = class250.aFloatArray2781[4 * i_363_ + 3];
				}
				for (int i_364_ = 0; i_364_ < i_327_; i_364_++) {
					float f = class250_332_.aFloatArray2781[2 * i_364_];
					float f_365_ = class250_332_.aFloatArray2781[2 * i_364_ + 1];
					float f_366_ = class250.aFloatArray2781[i_325_ + 2 * i_364_];
					float f_367_ = class250.aFloatArray2781[i_325_ + 2 * i_364_ + 1];
					float f_368_ = class250.aFloatArray2781[i_285_ - 2 - 2 * i_364_];
					float f_369_ = class250.aFloatArray2781[i_285_ - 1 - 2 * i_364_];
					float f_370_ = f_365_ * (f_366_ - f_368_) + f * (f_367_ + f_369_);
					class250.aFloatArray2781[i_325_ + 2 * i_364_] = (f_366_ + f_368_ + f_370_) * 0.5F;
					class250.aFloatArray2781[i_285_ - 2 - 2 * i_364_] = (f_366_ + f_368_ - f_370_) * 0.5F;
					f_370_ = f_365_ * (f_367_ + f_369_) - f * (f_366_ - f_368_);
					class250.aFloatArray2781[i_325_ + 2 * i_364_ + 1] = (f_367_ - f_369_ + f_370_) * 0.5F;
					class250.aFloatArray2781[i_285_ - 1 - 2 * i_364_] = (-f_367_ + f_369_ + f_370_) * 0.5F;
				}
				for (int i_371_ = 0; i_371_ < i_326_; i_371_++) {
					class250.aFloatArray2781[i_371_] = ((class250.aFloatArray2781[2 * i_371_ + i_325_] * class250_331_.aFloatArray2781[2 * i_371_]) + (class250.aFloatArray2781[2 * i_371_ + 1 + i_325_] * (class250_331_.aFloatArray2781[2 * i_371_ + 1])));
					class250.aFloatArray2781[i_325_ - 1 - i_371_] = ((class250.aFloatArray2781[2 * i_371_ + i_325_] * class250_331_.aFloatArray2781[2 * i_371_ + 1]) - (class250.aFloatArray2781[2 * i_371_ + 1 + i_325_] * class250_331_.aFloatArray2781[2 * i_371_]));
				}
				for (int i_372_ = 0; i_372_ < i_326_; i_372_++)
					class250.aFloatArray2781[i_285_ - i_326_ + i_372_] = -class250.aFloatArray2781[i_372_];
				for (int i_373_ = 0; i_373_ < i_326_; i_373_++)
					class250.aFloatArray2781[i_373_] = class250.aFloatArray2781[i_326_ + i_373_];
				for (int i_374_ = 0; i_374_ < i_326_; i_374_++)
					class250.aFloatArray2781[i_326_ + i_374_] = -class250.aFloatArray2781[i_326_ - i_374_ - 1];
				for (int i_375_ = 0; i_375_ < i_326_; i_375_++)
					class250.aFloatArray2781[i_325_ + i_375_] = class250.aFloatArray2781[i_285_ - i_375_ - 1];
				for (int i_376_ = i_289_; i_376_ < i_290_; i_376_++) {
					float f = (float) Math.sin(((double) (i_376_ - i_289_) + 0.5) / (double) i_291_ * 0.5 * 3.141592653589793);
					aClass250Array2395[i_323_].aFloatArray2781[i_376_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
				for (int i_377_ = i_292_; i_377_ < i_293_; i_377_++) {
					float f = (float) Math.sin((((double) (i_377_ - i_292_) + 0.5) / (double) i_294_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
					aClass250Array2395[i_323_].aFloatArray2781[i_377_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
			}
		}
		Class250[] class250s = null;
		if (anInt2459 > 0) {
			int i_378_ = anInt2459 + i_285_ >> 2;
			class250s = method4404(anInt2412, i_378_);
			for (int i_379_ = 0; i_379_ < anInt2412; i_379_++) {
				if (!aBoolArray2420[i_379_]) {
					for (int i_380_ = 0; i_380_ < anInt2458; i_380_++) {
						int i_381_ = (anInt2459 >> 1) + i_380_;
						class250s[i_379_].aFloatArray2781[i_380_] += (aClass250Array2453[i_379_].aFloatArray2781[i_381_]);
					}
				}
				if (!aBoolArray2449[i_379_]) {
					for (int i_382_ = i_289_; i_382_ < i_285_ >> 1; i_382_++) {
						int i_383_ = (class250s[i_379_].anInt2780 - (i_285_ >> 1) + i_382_);
						class250s[i_379_].aFloatArray2781[i_383_] += (aClass250Array2395[i_379_].aFloatArray2781[i_382_]);
					}
				}
			}
		}
		Class250[] class250s_384_ = aClass250Array2453;
		aClass250Array2453 = aClass250Array2395;
		aClass250Array2395 = class250s_384_;
		anInt2459 = i_285_;
		anInt2458 = i_293_ - (i_285_ >> 1);
		aBoolArray2420 = aBoolArray2449;
		atomicreference.set(class250s);
		return true;
	}

	public void method285() {
		if (method281() != Class370.aClass370_3898) {
			method4495(false);
			method4419(Class370.aClass370_3901);
		} else {
			method4495(false);
			method4419(Class370.aClass370_3902);
		}
	}

	synchronized void method4482(RSByteBuffer class527_sub38) {
		aList2401.add(class527_sub38);
		method4419(Class370.aClass370_3897);
	}

	synchronized void method4483(RSByteBuffer class527_sub38) {
		aList2401.add(class527_sub38);
		method4419(Class370.aClass370_3897);
	}

	synchronized void method4484(boolean bool) {
		if (!bool) {
			anInt2409 = 0;
			anInt2410 = 0;
			aBoolArray2415 = null;
			anIntArray2416 = null;
			method4407(aClass250Array2411);
			aClass250Array2411 = null;
			method4407(aClass250Array2453);
			aClass250Array2453 = null;
			anInt2459 = 0;
			anInt2458 = 0;
			aBoolArray2420 = null;
			method4407(aClass250Array2395);
			aClass250Array2395 = null;
			method4406(aClass250_2422);
			method4406(aClass250_2423);
			method4406(aClass250_2421);
			method4406(aClass250_2425);
			method4406(aClass250_2426);
			method4406(aClass250_2427);
			aClass250_2422 = null;
			aClass250_2423 = null;
			aClass250_2421 = null;
			aClass250_2425 = null;
			aClass250_2426 = null;
			aClass250_2427 = null;
			anIntArray2428 = null;
			anIntArray2429 = null;
		}
		anInt2452 = 0;
		Iterator iterator = aList2454.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class527_sub38 = (RSByteBuffer) iterator.next();
			class527_sub38.method16599((byte) 120);
		}
		aList2454.clear();
		aBool2431 = false;
		if (aClass527_Sub38_2463 != null) {
			synchronized (aClass527_Sub38_2463) {
				aClass527_Sub38_2463.method16599((byte) 123);
				aClass527_Sub38_2463 = null;
			}
		}
		anInt2433 = 0;
		anInt2434 = 0;
		if (!bool) {
			synchronized (aList2435) {
				Iterator iterator_385_ = aList2435.iterator();
				while (iterator_385_.hasNext()) {
					RSByteBuffer class527_sub38 = (RSByteBuffer) iterator_385_.next();
					class527_sub38.method16599((byte) 119);
				}
				aList2435.clear();
			}
			anInt2456 = 0;
		}
		synchronized (aList2401) {
			Iterator iterator_386_ = aList2401.iterator();
			while (iterator_386_.hasNext()) {
				RSByteBuffer class527_sub38 = (RSByteBuffer) iterator_386_.next();
				class527_sub38.method16599((byte) 117);
			}
			aList2401.clear();
		}
		aBool2436 = false;
		anInt2439 = 0;
		anInt2442 = -1;
		anInt2446 = -1;
		if (!bool) {
			method4403(false);
			aBool2437 = false;
			anInt2406 = -1;
			anInt2407 = -1;
			anInt2447 = 0;
			anInt2448 = 0;
			anInt2440 = -1;
			anInt2441 = -1;
			anInt2403 = -1;
			anInt2445 = -1;
			aBool2443 = false;
			aBool2397 = false;
		} else {
			anInt2448++;
			aBool2443 = true;
		}
	}

	int method4485(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	boolean method4486(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 79 || class527_sub38.readUnsignedByte() != 103 || class527_sub38.readUnsignedByte() != 103 || class527_sub38.readUnsignedByte() != 83)
			return false;
		return true;
	}

	public Class373 method311() {
		return aClass373_2464;
	}

	int method4487(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	int method4488(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	synchronized void method4489(RSByteBuffer class527_sub38) {
		aList2401.add(class527_sub38);
		method4419(Class370.aClass370_3897);
	}

	int method4490(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	int method4491(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	public Class370 method293() {
		return aClass370_2402;
	}

	int method4492(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	int method4493(float f) {
		int i = (int) (f * 127.0F + 128.0F);
		if (i > 255)
			return 255;
		if (i < 0)
			return 0;
		return i;
	}

	RSByteBuffer method4494(int i) {
		return new RSByteBuffer(i, true);
	}

	synchronized void method4495(boolean bool) {
		if (!bool) {
			anInt2409 = 0;
			anInt2410 = 0;
			aBoolArray2415 = null;
			anIntArray2416 = null;
			method4407(aClass250Array2411);
			aClass250Array2411 = null;
			method4407(aClass250Array2453);
			aClass250Array2453 = null;
			anInt2459 = 0;
			anInt2458 = 0;
			aBoolArray2420 = null;
			method4407(aClass250Array2395);
			aClass250Array2395 = null;
			method4406(aClass250_2422);
			method4406(aClass250_2423);
			method4406(aClass250_2421);
			method4406(aClass250_2425);
			method4406(aClass250_2426);
			method4406(aClass250_2427);
			aClass250_2422 = null;
			aClass250_2423 = null;
			aClass250_2421 = null;
			aClass250_2425 = null;
			aClass250_2426 = null;
			aClass250_2427 = null;
			anIntArray2428 = null;
			anIntArray2429 = null;
		}
		anInt2452 = 0;
		Iterator iterator = aList2454.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class527_sub38 = (RSByteBuffer) iterator.next();
			class527_sub38.method16599((byte) 108);
		}
		aList2454.clear();
		aBool2431 = false;
		if (aClass527_Sub38_2463 != null) {
			synchronized (aClass527_Sub38_2463) {
				aClass527_Sub38_2463.method16599((byte) 111);
				aClass527_Sub38_2463 = null;
			}
		}
		anInt2433 = 0;
		anInt2434 = 0;
		if (!bool) {
			synchronized (aList2435) {
				Iterator iterator_387_ = aList2435.iterator();
				while (iterator_387_.hasNext()) {
					RSByteBuffer class527_sub38 = (RSByteBuffer) iterator_387_.next();
					class527_sub38.method16599((byte) 118);
				}
				aList2435.clear();
			}
			anInt2456 = 0;
		}
		synchronized (aList2401) {
			Iterator iterator_388_ = aList2401.iterator();
			while (iterator_388_.hasNext()) {
				RSByteBuffer class527_sub38 = (RSByteBuffer) iterator_388_.next();
				class527_sub38.method16599((byte) 122);
			}
			aList2401.clear();
		}
		aBool2436 = false;
		anInt2439 = 0;
		anInt2442 = -1;
		anInt2446 = -1;
		if (!bool) {
			method4403(false);
			aBool2437 = false;
			anInt2406 = -1;
			anInt2407 = -1;
			anInt2447 = 0;
			anInt2448 = 0;
			anInt2440 = -1;
			anInt2441 = -1;
			anInt2403 = -1;
			anInt2445 = -1;
			aBool2443 = false;
			aBool2397 = false;
		} else {
			anInt2448++;
			aBool2443 = true;
		}
	}

	RSByteBuffer method4496(int i) {
		return new RSByteBuffer(i, true);
	}

	int method4497(int i) {
		int i_389_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_389_++;
		return i_389_;
	}

	RSByteBuffer method4498(int i) {
		return new RSByteBuffer(i, true);
	}

	RSByteBuffer method4499(int i) {
		return new RSByteBuffer(i, true);
	}

	int method4500(float f) {
		int i = (int) (f * 127.0F + 128.0F);
		if (i > 255)
			return 255;
		if (i < 0)
			return 0;
		return i;
	}

	boolean method4501(int i, Class390 class390, Class373 class373) {
		if (class390 == Class390.aClass390_4003)
			return true;
		if (class390 == Class390.aClass390_4002)
			return true;
		if (class390 == Class390.aClass390_4004)
			return true;
		if (class390 == Class390.aClass390_4001)
			return true;
		return false;
	}

	int method4502() {
		return anInt2461;
	}

	void method4503(RSByteBuffer class527_sub38) {
		aList2454.add(class527_sub38);
	}

	void method4504(byte[] is, int i) {
		aByteArray2417 = is;
		anInt2460 = i;
		anInt2461 = 0;
	}

	public synchronized boolean method320() {
		return aBool2455;
	}

	public void method321(boolean bool) {
		if (!bool)
			method285();
		else if (method281() == Class370.aClass370_3896) {
			method4495(true);
			method4419(Class370.aClass370_3897);
		}
	}
}

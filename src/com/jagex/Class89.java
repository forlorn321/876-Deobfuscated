/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class89 {
	ReferenceQueue aReferenceQueue879 = new ReferenceQueue();
	int anInt880;
	WeakReference_Sub1[] aWeakReference_Sub1Array881 = new WeakReference_Sub1[16];

	void method1214() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue879.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (-1850188447 * weakreference_sub1.anInt11881 & aWeakReference_Sub1Array881.length - 1);
			WeakReference_Sub1 weakreference_sub1_0_ = aWeakReference_Sub1Array881[i];
			if (weakreference_sub1 == weakreference_sub1_0_) {
				aWeakReference_Sub1Array881[i] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt880 -= -1346219793;
			} else {
				for (/**/; (null != weakreference_sub1_0_ && (weakreference_sub1 != weakreference_sub1_0_.aWeakReference_Sub1_11880)); weakreference_sub1_0_ = weakreference_sub1_0_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_0_) {
					weakreference_sub1_0_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt880 -= -1346219793;
				}
			}
		}
	}

	public void method1215(Object object, Object object_1_, byte i) {
		if (null == object)
			throw new NullPointerException();
		method1219(-992678499);
		int i_2_ = System.identityHashCode(object);
		int i_3_ = i_2_ & aWeakReference_Sub1Array881.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array881[i_3_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array881[i_3_] = new WeakReference_Sub1(object, aReferenceQueue879, i_2_, object_1_);
			anInt880 += -1346219793;
			if (1232264719 * anInt880 >= aWeakReference_Sub1Array881.length)
				method1218(-1374199526);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				if (weakreference_sub1.aWeakReference_Sub1_11880 == null) {
					weakreference_sub1.aWeakReference_Sub1_11880 = new WeakReference_Sub1(object, aReferenceQueue879, i_2_, object_1_);
					anInt880 += -1346219793;
					if (anInt880 * 1232264719 >= aWeakReference_Sub1Array881.length)
						method1218(-1374199526);
					break;
				}
			}
		}
	}

	public void method1216(Object object, int i) {
		if (null == object)
			throw new NullPointerException();
		method1219(-992678499);
		int i_4_ = System.identityHashCode(object);
		int i_5_ = i_4_ & aWeakReference_Sub1Array881.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array881[i_5_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array881[i_5_] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt880 -= -1346219793;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_6_ = weakreference_sub1.aWeakReference_Sub1_11880;
					if (weakreference_sub1_6_ == null)
						break;
					if (weakreference_sub1_6_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11880 = weakreference_sub1_6_.aWeakReference_Sub1_11880;
						anInt880 -= -1346219793;
						break;
					}
					weakreference_sub1 = weakreference_sub1_6_;
				}
			}
		}
	}

	public void method1217(Object object) {
		if (null == object)
			throw new NullPointerException();
		method1219(-992678499);
		int i = System.identityHashCode(object);
		int i_7_ = i & aWeakReference_Sub1Array881.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array881[i_7_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array881[i_7_] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt880 -= -1346219793;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_8_ = weakreference_sub1.aWeakReference_Sub1_11880;
					if (weakreference_sub1_8_ == null)
						break;
					if (weakreference_sub1_8_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11880 = weakreference_sub1_8_.aWeakReference_Sub1_11880;
						anInt880 -= -1346219793;
						break;
					}
					weakreference_sub1 = weakreference_sub1_8_;
				}
			}
		}
	}

	void method1218(int i) {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array881;
		aWeakReference_Sub1Array881 = new WeakReference_Sub1[weakreference_sub1s.length * 2];
		WeakReference_Sub1[] weakreference_sub1s_9_ = weakreference_sub1s;
		for (int i_10_ = 0; i_10_ < weakreference_sub1s_9_.length; i_10_++) {
			WeakReference_Sub1 weakreference_sub1_11_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_9_[i_10_]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_11_) {
				weakreference_sub1_11_ = weakreference_sub1.aWeakReference_Sub1_11880;
				int i_12_ = (weakreference_sub1.anInt11881 * -1850188447 & aWeakReference_Sub1Array881.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11880 = aWeakReference_Sub1Array881[i_12_];
				aWeakReference_Sub1Array881[i_12_] = weakreference_sub1;
			}
		}
	}

	void method1219(int i) {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue879.poll();
			if (weakreference_sub1 == null)
				break;
			int i_13_ = (-1850188447 * weakreference_sub1.anInt11881 & aWeakReference_Sub1Array881.length - 1);
			WeakReference_Sub1 weakreference_sub1_14_ = aWeakReference_Sub1Array881[i_13_];
			if (weakreference_sub1 == weakreference_sub1_14_) {
				aWeakReference_Sub1Array881[i_13_] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt880 -= -1346219793;
			} else {
				for (/**/; (null != weakreference_sub1_14_ && weakreference_sub1 != (weakreference_sub1_14_.aWeakReference_Sub1_11880)); weakreference_sub1_14_ = weakreference_sub1_14_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_14_) {
					weakreference_sub1_14_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt880 -= -1346219793;
				}
			}
		}
	}

	public void method1220(Object object) {
		if (null == object)
			throw new NullPointerException();
		method1219(-992678499);
		int i = System.identityHashCode(object);
		int i_15_ = i & aWeakReference_Sub1Array881.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array881[i_15_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array881[i_15_] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt880 -= -1346219793;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_16_ = weakreference_sub1.aWeakReference_Sub1_11880;
					if (weakreference_sub1_16_ == null)
						break;
					if (weakreference_sub1_16_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11880 = weakreference_sub1_16_.aWeakReference_Sub1_11880;
						anInt880 -= -1346219793;
						break;
					}
					weakreference_sub1 = weakreference_sub1_16_;
				}
			}
		}
	}

	void method1221() {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array881;
		aWeakReference_Sub1Array881 = new WeakReference_Sub1[weakreference_sub1s.length * 2];
		WeakReference_Sub1[] weakreference_sub1s_17_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_17_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_18_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_17_[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_18_) {
				weakreference_sub1_18_ = weakreference_sub1.aWeakReference_Sub1_11880;
				int i_19_ = (weakreference_sub1.anInt11881 * -1850188447 & aWeakReference_Sub1Array881.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11880 = aWeakReference_Sub1Array881[i_19_];
				aWeakReference_Sub1Array881[i_19_] = weakreference_sub1;
			}
		}
	}

	public ArrayList method1222(byte i) {
		method1219(-992678499);
		ArrayList arraylist = new ArrayList(1232264719 * anInt880);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array881;
		for (int i_20_ = 0; i_20_ < weakreference_sub1s.length; i_20_++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_20_]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	void method1223() {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array881;
		aWeakReference_Sub1Array881 = new WeakReference_Sub1[weakreference_sub1s.length * 2];
		WeakReference_Sub1[] weakreference_sub1s_21_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_21_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_22_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_21_[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_22_) {
				weakreference_sub1_22_ = weakreference_sub1.aWeakReference_Sub1_11880;
				int i_23_ = (weakreference_sub1.anInt11881 * -1850188447 & aWeakReference_Sub1Array881.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11880 = aWeakReference_Sub1Array881[i_23_];
				aWeakReference_Sub1Array881[i_23_] = weakreference_sub1;
			}
		}
	}

	void method1224() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue879.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (-1850188447 * weakreference_sub1.anInt11881 & aWeakReference_Sub1Array881.length - 1);
			WeakReference_Sub1 weakreference_sub1_24_ = aWeakReference_Sub1Array881[i];
			if (weakreference_sub1 == weakreference_sub1_24_) {
				aWeakReference_Sub1Array881[i] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt880 -= -1346219793;
			} else {
				for (/**/; (null != weakreference_sub1_24_ && weakreference_sub1 != (weakreference_sub1_24_.aWeakReference_Sub1_11880)); weakreference_sub1_24_ = weakreference_sub1_24_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_24_) {
					weakreference_sub1_24_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt880 -= -1346219793;
				}
			}
		}
	}

	void method1225() {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array881;
		aWeakReference_Sub1Array881 = new WeakReference_Sub1[weakreference_sub1s.length * 2];
		WeakReference_Sub1[] weakreference_sub1s_25_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_25_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_26_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_25_[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_26_) {
				weakreference_sub1_26_ = weakreference_sub1.aWeakReference_Sub1_11880;
				int i_27_ = (weakreference_sub1.anInt11881 * -1850188447 & aWeakReference_Sub1Array881.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11880 = aWeakReference_Sub1Array881[i_27_];
				aWeakReference_Sub1Array881[i_27_] = weakreference_sub1;
			}
		}
	}

	public static int method1226(int i, int i_28_, int i_29_, int i_30_) {
		i_29_ &= 0x3;
		if (i_29_ == 0)
			return i;
		if (1 == i_29_)
			return i_28_;
		if (2 == i_29_)
			return 7 - i;
		return 7 - i_28_;
	}

	static final void method1227(Class668 class668, byte i) {
		Class506.method6144(1366481361);
	}

	static void method1228(int i, int i_31_, int i_32_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(7, (long) i);
		class536_sub18_sub5.method10659(2077836974);
		class536_sub18_sub5.anInt11675 = 1577826219 * i_31_;
	}
}

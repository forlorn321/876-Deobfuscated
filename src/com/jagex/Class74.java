/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class74 {
	WeakReference_Sub1[] aWeakReference_Sub1Array791;
	int anInt792;
	ReferenceQueue aReferenceQueue793 = new ReferenceQueue();

	public void method1512(Object object, Object object_0_) {
		if (object == null)
			throw new NullPointerException();
		method1517(-1899664123);
		int i = System.identityHashCode(object);
		int i_1_ = i & aWeakReference_Sub1Array791.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array791[i_1_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array791[i_1_] = new WeakReference_Sub1(object, aReferenceQueue793, i, object_0_);
			anInt792 += -7606881;
			if (anInt792 * -1724387745 >= aWeakReference_Sub1Array791.length)
				method1516(-2135564);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				if (null == weakreference_sub1.aWeakReference_Sub1_11880) {
					weakreference_sub1.aWeakReference_Sub1_11880 = new WeakReference_Sub1(object, aReferenceQueue793, i, object_0_);
					anInt792 += -7606881;
					if (-1724387745 * anInt792 >= aWeakReference_Sub1Array791.length)
						method1516(-2135564);
					break;
				}
			}
		}
	}

	public void method1513(Object object, Object object_2_, int i) {
		if (object == null)
			throw new NullPointerException();
		method1517(57175561);
		int i_3_ = System.identityHashCode(object);
		int i_4_ = i_3_ & aWeakReference_Sub1Array791.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array791[i_4_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array791[i_4_] = new WeakReference_Sub1(object, aReferenceQueue793, i_3_, object_2_);
			anInt792 += -7606881;
			if (anInt792 * -1724387745 >= aWeakReference_Sub1Array791.length)
				method1516(-2135564);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				if (null == weakreference_sub1.aWeakReference_Sub1_11880) {
					weakreference_sub1.aWeakReference_Sub1_11880 = new WeakReference_Sub1(object, aReferenceQueue793, i_3_, object_2_);
					anInt792 += -7606881;
					if (-1724387745 * anInt792 >= aWeakReference_Sub1Array791.length)
						method1516(-2135564);
					break;
				}
			}
		}
	}

	public void method1514(Object object, int i) {
		if (null == object)
			throw new NullPointerException();
		method1517(-1807300778);
		int i_5_ = System.identityHashCode(object);
		int i_6_ = i_5_ & aWeakReference_Sub1Array791.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array791[i_6_];
		if (weakreference_sub1 != null) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array791[i_6_] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_7_ = weakreference_sub1.aWeakReference_Sub1_11880;
					if (weakreference_sub1_7_ == null)
						break;
					if (weakreference_sub1_7_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11880 = weakreference_sub1_7_.aWeakReference_Sub1_11880;
						anInt792 -= -7606881;
						break;
					}
					weakreference_sub1 = weakreference_sub1_7_;
				}
			}
		}
	}

	public ArrayList method1515(byte i) {
		method1517(318983040);
		ArrayList arraylist = new ArrayList(anInt792 * -1724387745);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array791;
		for (int i_8_ = 0; i_8_ < weakreference_sub1s.length; i_8_++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_8_]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	void method1516(int i) {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array791;
		aWeakReference_Sub1Array791 = new WeakReference_Sub1[weakreference_sub1s.length * 2];
		WeakReference_Sub1[] weakreference_sub1s_9_ = weakreference_sub1s;
		for (int i_10_ = 0; i_10_ < weakreference_sub1s_9_.length; i_10_++) {
			WeakReference_Sub1 weakreference_sub1_11_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_9_[i_10_]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_11_) {
				weakreference_sub1_11_ = weakreference_sub1.aWeakReference_Sub1_11880;
				int i_12_ = (weakreference_sub1.anInt11879 * 624802183 & aWeakReference_Sub1Array791.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11880 = aWeakReference_Sub1Array791[i_12_];
				aWeakReference_Sub1Array791[i_12_] = weakreference_sub1;
			}
		}
	}

	void method1517(int i) {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue793.poll();
			if (weakreference_sub1 == null)
				break;
			int i_13_ = (624802183 * weakreference_sub1.anInt11879 & aWeakReference_Sub1Array791.length - 1);
			WeakReference_Sub1 weakreference_sub1_14_ = aWeakReference_Sub1Array791[i_13_];
			if (weakreference_sub1 == weakreference_sub1_14_) {
				aWeakReference_Sub1Array791[i_13_] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (/**/; (null != weakreference_sub1_14_ && (weakreference_sub1_14_.aWeakReference_Sub1_11880 != weakreference_sub1)); weakreference_sub1_14_ = weakreference_sub1_14_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_14_) {
					weakreference_sub1_14_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt792 -= -7606881;
				}
			}
		}
	}

	public void method1518(Object object, Object object_15_) {
		if (object == null)
			throw new NullPointerException();
		method1517(1174452702);
		int i = System.identityHashCode(object);
		int i_16_ = i & aWeakReference_Sub1Array791.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array791[i_16_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array791[i_16_] = new WeakReference_Sub1(object, aReferenceQueue793, i, object_15_);
			anInt792 += -7606881;
			if (anInt792 * -1724387745 >= aWeakReference_Sub1Array791.length)
				method1516(-2135564);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				if (null == weakreference_sub1.aWeakReference_Sub1_11880) {
					weakreference_sub1.aWeakReference_Sub1_11880 = new WeakReference_Sub1(object, aReferenceQueue793, i, object_15_);
					anInt792 += -7606881;
					if (-1724387745 * anInt792 >= aWeakReference_Sub1Array791.length)
						method1516(-2135564);
					break;
				}
			}
		}
	}

	public Class74() {
		aWeakReference_Sub1Array791 = new WeakReference_Sub1[16];
	}

	public void method1519(Object object) {
		if (null == object)
			throw new NullPointerException();
		method1517(245006298);
		int i = System.identityHashCode(object);
		int i_17_ = i & aWeakReference_Sub1Array791.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array791[i_17_];
		if (weakreference_sub1 != null) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array791[i_17_] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_18_ = weakreference_sub1.aWeakReference_Sub1_11880;
					if (weakreference_sub1_18_ == null)
						break;
					if (weakreference_sub1_18_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11880 = weakreference_sub1_18_.aWeakReference_Sub1_11880;
						anInt792 -= -7606881;
						break;
					}
					weakreference_sub1 = weakreference_sub1_18_;
				}
			}
		}
	}

	public void method1520(Object object, Object object_19_) {
		if (object == null)
			throw new NullPointerException();
		method1517(-1475508473);
		int i = System.identityHashCode(object);
		int i_20_ = i & aWeakReference_Sub1Array791.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array791[i_20_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array791[i_20_] = new WeakReference_Sub1(object, aReferenceQueue793, i, object_19_);
			anInt792 += -7606881;
			if (anInt792 * -1724387745 >= aWeakReference_Sub1Array791.length)
				method1516(-2135564);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				if (null == weakreference_sub1.aWeakReference_Sub1_11880) {
					weakreference_sub1.aWeakReference_Sub1_11880 = new WeakReference_Sub1(object, aReferenceQueue793, i, object_19_);
					anInt792 += -7606881;
					if (-1724387745 * anInt792 >= aWeakReference_Sub1Array791.length)
						method1516(-2135564);
					break;
				}
			}
		}
	}

	public void method1521(Object object, Object object_21_) {
		if (object == null)
			throw new NullPointerException();
		method1517(-1008349879);
		int i = System.identityHashCode(object);
		int i_22_ = i & aWeakReference_Sub1Array791.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array791[i_22_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array791[i_22_] = new WeakReference_Sub1(object, aReferenceQueue793, i, object_21_);
			anInt792 += -7606881;
			if (anInt792 * -1724387745 >= aWeakReference_Sub1Array791.length)
				method1516(-2135564);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				if (null == weakreference_sub1.aWeakReference_Sub1_11880) {
					weakreference_sub1.aWeakReference_Sub1_11880 = new WeakReference_Sub1(object, aReferenceQueue793, i, object_21_);
					anInt792 += -7606881;
					if (-1724387745 * anInt792 >= aWeakReference_Sub1Array791.length)
						method1516(-2135564);
					break;
				}
			}
		}
	}

	public ArrayList method1522() {
		method1517(-1166506443);
		ArrayList arraylist = new ArrayList(anInt792 * -1724387745);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array791;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	public ArrayList method1523() {
		method1517(-1843454970);
		ArrayList arraylist = new ArrayList(anInt792 * -1724387745);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array791;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11880) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	void method1524() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue793.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (624802183 * weakreference_sub1.anInt11879 & aWeakReference_Sub1Array791.length - 1);
			WeakReference_Sub1 weakreference_sub1_23_ = aWeakReference_Sub1Array791[i];
			if (weakreference_sub1 == weakreference_sub1_23_) {
				aWeakReference_Sub1Array791[i] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (/**/; (null != weakreference_sub1_23_ && (weakreference_sub1_23_.aWeakReference_Sub1_11880 != weakreference_sub1)); weakreference_sub1_23_ = weakreference_sub1_23_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_23_) {
					weakreference_sub1_23_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt792 -= -7606881;
				}
			}
		}
	}

	void method1525() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue793.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (624802183 * weakreference_sub1.anInt11879 & aWeakReference_Sub1Array791.length - 1);
			WeakReference_Sub1 weakreference_sub1_24_ = aWeakReference_Sub1Array791[i];
			if (weakreference_sub1 == weakreference_sub1_24_) {
				aWeakReference_Sub1Array791[i] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (/**/; (null != weakreference_sub1_24_ && (weakreference_sub1_24_.aWeakReference_Sub1_11880 != weakreference_sub1)); weakreference_sub1_24_ = weakreference_sub1_24_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_24_) {
					weakreference_sub1_24_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt792 -= -7606881;
				}
			}
		}
	}

	void method1526() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue793.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (624802183 * weakreference_sub1.anInt11879 & aWeakReference_Sub1Array791.length - 1);
			WeakReference_Sub1 weakreference_sub1_25_ = aWeakReference_Sub1Array791[i];
			if (weakreference_sub1 == weakreference_sub1_25_) {
				aWeakReference_Sub1Array791[i] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (/**/; (null != weakreference_sub1_25_ && (weakreference_sub1_25_.aWeakReference_Sub1_11880 != weakreference_sub1)); weakreference_sub1_25_ = weakreference_sub1_25_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_25_) {
					weakreference_sub1_25_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt792 -= -7606881;
				}
			}
		}
	}

	void method1527() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue793.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (624802183 * weakreference_sub1.anInt11879 & aWeakReference_Sub1Array791.length - 1);
			WeakReference_Sub1 weakreference_sub1_26_ = aWeakReference_Sub1Array791[i];
			if (weakreference_sub1 == weakreference_sub1_26_) {
				aWeakReference_Sub1Array791[i] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (/**/; (null != weakreference_sub1_26_ && (weakreference_sub1_26_.aWeakReference_Sub1_11880 != weakreference_sub1)); weakreference_sub1_26_ = weakreference_sub1_26_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_26_) {
					weakreference_sub1_26_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt792 -= -7606881;
				}
			}
		}
	}

	void method1528() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue793.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (624802183 * weakreference_sub1.anInt11879 & aWeakReference_Sub1Array791.length - 1);
			WeakReference_Sub1 weakreference_sub1_27_ = aWeakReference_Sub1Array791[i];
			if (weakreference_sub1 == weakreference_sub1_27_) {
				aWeakReference_Sub1Array791[i] = weakreference_sub1.aWeakReference_Sub1_11880;
				anInt792 -= -7606881;
			} else {
				for (/**/; (null != weakreference_sub1_27_ && (weakreference_sub1_27_.aWeakReference_Sub1_11880 != weakreference_sub1)); weakreference_sub1_27_ = weakreference_sub1_27_.aWeakReference_Sub1_11880) {
					/* empty */
				}
				if (null != weakreference_sub1_27_) {
					weakreference_sub1_27_.aWeakReference_Sub1_11880 = weakreference_sub1.aWeakReference_Sub1_11880;
					anInt792 -= -7606881;
				}
			}
		}
	}
}

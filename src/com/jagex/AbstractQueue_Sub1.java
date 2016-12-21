/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {
	Class391[] aClass391Array11882;
	Comparator aComparator11883;
	int anInt11884;
	Map aMap11885;
	int anInt11886 = 0;

	public Iterator iterator() {
		return new Class383(this);
	}

	public AbstractQueue_Sub1(int i, Comparator comparator) {
		aClass391Array11882 = new Class391[i];
		aMap11885 = new HashMap();
		aComparator11883 = comparator;
	}

	void method10843(int i) {
		int i_0_ = 1 + (aClass391Array11882.length << 1);
		aClass391Array11882 = (Class391[]) Arrays.copyOf(aClass391Array11882, i_0_);
	}

	public boolean method10844(Object object) {
		return aMap11885.containsKey(object);
	}

	public Object peek() {
		if (0 == anInt11884 * -125561283)
			return null;
		return aClass391Array11882[0].anObject4062;
	}

	public boolean offer(Object object) {
		if (aMap11885.containsKey(object))
			throw new IllegalArgumentException("");
		anInt11886 += -496286609;
		int i = anInt11884 * -125561283;
		if (i >= aClass391Array11882.length)
			method10843(2145111050);
		anInt11884 += -1215123179;
		if (i == 0) {
			aClass391Array11882[0] = new Class391(object, 0);
			aMap11885.put(object, aClass391Array11882[0]);
		} else {
			aClass391Array11882[i] = new Class391(object, i);
			aMap11885.put(object, aClass391Array11882[i]);
			method10845(i, (byte) -68);
		}
		return true;
	}

	public AbstractQueue_Sub1(int i) {
		this(i, null);
	}

	void method10845(int i, byte i_1_) {
		Class391 class391 = aClass391Array11882[i];
		int i_2_;
		for (/**/; i > 0; i = i_2_) {
			i_2_ = i - 1 >>> 1;
			Class391 class391_3_ = aClass391Array11882[i_2_];
			if (aComparator11883 != null) {
				if (aComparator11883.compare(class391.anObject4062, class391_3_.anObject4062) >= 0)
					break;
			} else if (((Comparable) class391.anObject4062).compareTo(class391_3_.anObject4062) >= 0)
				break;
			aClass391Array11882[i] = class391_3_;
			aClass391Array11882[i].anInt4061 = 679474381 * i;
		}
		aClass391Array11882[i] = class391;
		aClass391Array11882[i].anInt4061 = i * 679474381;
	}

	public int method10846() {
		return -125561283 * anInt11884;
	}

	public boolean contains(Object object) {
		return aMap11885.containsKey(object);
	}

	public Object[] method10847() {
		Object[] objects = super.toArray();
		if (aComparator11883 != null)
			Arrays.sort(objects, aComparator11883);
		else
			Arrays.sort(objects);
		return objects;
	}

	public boolean remove(Object object) {
		Class391 class391 = (Class391) aMap11885.remove(object);
		if (class391 == null)
			return false;
		anInt11886 += -496286609;
		anInt11884 -= -1215123179;
		if (1220614149 * class391.anInt4061 == -125561283 * anInt11884) {
			aClass391Array11882[anInt11884 * -125561283] = null;
			return true;
		}
		Class391 class391_4_ = aClass391Array11882[anInt11884 * -125561283];
		aClass391Array11882[anInt11884 * -125561283] = null;
		aClass391Array11882[class391.anInt4061 * 1220614149] = class391_4_;
		aClass391Array11882[1220614149 * class391.anInt4061].anInt4061 = class391.anInt4061 * 1;
		method10853(1220614149 * class391.anInt4061, (short) 128);
		if (aClass391Array11882[1220614149 * class391.anInt4061] == class391_4_)
			method10845(class391.anInt4061 * 1220614149, (byte) -93);
		return true;
	}

	public int method10848() {
		return -125561283 * anInt11884;
	}

	public Iterator method10849() {
		return new Class383(this);
	}

	public Object method10850() {
		if (0 == anInt11884 * -125561283)
			return null;
		return aClass391Array11882[0].anObject4062;
	}

	public Object method10851() {
		if (0 == anInt11884 * -125561283)
			return null;
		return aClass391Array11882[0].anObject4062;
	}

	public Object method10852() {
		if (0 == anInt11884 * -125561283)
			return null;
		return aClass391Array11882[0].anObject4062;
	}

	void method10853(int i, short i_5_) {
		Class391 class391 = aClass391Array11882[i];
		int i_6_;
		for (int i_7_ = -125561283 * anInt11884 >>> 1; i < i_7_; i = i_6_) {
			int i_8_ = 1 + (i << 1);
			Class391 class391_9_ = aClass391Array11882[i_8_];
			int i_10_ = (i << 1) + 2;
			Class391 class391_11_ = aClass391Array11882[i_10_];
			if (aComparator11883 != null) {
				if (i_10_ < anInt11884 * -125561283 && aComparator11883.compare(class391_9_.anObject4062, class391_11_.anObject4062) > 0)
					i_6_ = i_10_;
				else
					i_6_ = i_8_;
			} else if (i_10_ < anInt11884 * -125561283 && ((Comparable) class391_9_.anObject4062).compareTo(class391_11_.anObject4062) > 0)
				i_6_ = i_10_;
			else
				i_6_ = i_8_;
			if (null != aComparator11883) {
				if (aComparator11883.compare(class391.anObject4062, (aClass391Array11882[i_6_].anObject4062)) <= 0)
					break;
			} else if (((Comparable) class391.anObject4062).compareTo(aClass391Array11882[i_6_].anObject4062) <= 0)
				break;
			aClass391Array11882[i] = aClass391Array11882[i_6_];
			aClass391Array11882[i].anInt4061 = i * 679474381;
		}
		aClass391Array11882[i] = class391;
		aClass391Array11882[i].anInt4061 = 679474381 * i;
	}

	void method10854(int i) {
		Class391 class391 = aClass391Array11882[i];
		int i_12_;
		for (/**/; i > 0; i = i_12_) {
			i_12_ = i - 1 >>> 1;
			Class391 class391_13_ = aClass391Array11882[i_12_];
			if (aComparator11883 != null) {
				if (aComparator11883.compare(class391.anObject4062, class391_13_.anObject4062) >= 0)
					break;
			} else if (((Comparable) class391.anObject4062).compareTo(class391_13_.anObject4062) >= 0)
				break;
			aClass391Array11882[i] = class391_13_;
			aClass391Array11882[i].anInt4061 = 679474381 * i;
		}
		aClass391Array11882[i] = class391;
		aClass391Array11882[i].anInt4061 = i * 679474381;
	}

	public boolean method10855(Object object) {
		Class391 class391 = (Class391) aMap11885.remove(object);
		if (class391 == null)
			return false;
		anInt11886 += -496286609;
		anInt11884 -= -1215123179;
		if (1220614149 * class391.anInt4061 == -125561283 * anInt11884) {
			aClass391Array11882[anInt11884 * -125561283] = null;
			return true;
		}
		Class391 class391_14_ = aClass391Array11882[anInt11884 * -125561283];
		aClass391Array11882[anInt11884 * -125561283] = null;
		aClass391Array11882[class391.anInt4061 * 1220614149] = class391_14_;
		aClass391Array11882[1220614149 * class391.anInt4061].anInt4061 = class391.anInt4061 * 1;
		method10853(1220614149 * class391.anInt4061, (short) 128);
		if (aClass391Array11882[1220614149 * class391.anInt4061] == class391_14_)
			method10845(class391.anInt4061 * 1220614149, (byte) -12);
		return true;
	}

	public boolean method10856(Object object) {
		Class391 class391 = (Class391) aMap11885.remove(object);
		if (class391 == null)
			return false;
		anInt11886 += -496286609;
		anInt11884 -= -1215123179;
		if (1220614149 * class391.anInt4061 == -125561283 * anInt11884) {
			aClass391Array11882[anInt11884 * -125561283] = null;
			return true;
		}
		Class391 class391_15_ = aClass391Array11882[anInt11884 * -125561283];
		aClass391Array11882[anInt11884 * -125561283] = null;
		aClass391Array11882[class391.anInt4061 * 1220614149] = class391_15_;
		aClass391Array11882[1220614149 * class391.anInt4061].anInt4061 = class391.anInt4061 * 1;
		method10853(1220614149 * class391.anInt4061, (short) 128);
		if (aClass391Array11882[1220614149 * class391.anInt4061] == class391_15_)
			method10845(class391.anInt4061 * 1220614149, (byte) -54);
		return true;
	}

	public Object poll() {
		if (anInt11884 * -125561283 == 0)
			return null;
		anInt11886 += -496286609;
		Object object = aClass391Array11882[0].anObject4062;
		aMap11885.remove(object);
		anInt11884 -= -1215123179;
		if (anInt11884 * -125561283 == 0)
			aClass391Array11882[anInt11884 * -125561283] = null;
		else {
			aClass391Array11882[0] = aClass391Array11882[-125561283 * anInt11884];
			aClass391Array11882[0].anInt4061 = 0;
			aClass391Array11882[-125561283 * anInt11884] = null;
			method10853(0, (short) 128);
		}
		return object;
	}

	void method10857(int i) {
		Class391 class391 = aClass391Array11882[i];
		int i_16_;
		for (int i_17_ = -125561283 * anInt11884 >>> 1; i < i_17_; i = i_16_) {
			int i_18_ = 1 + (i << 1);
			Class391 class391_19_ = aClass391Array11882[i_18_];
			int i_20_ = (i << 1) + 2;
			Class391 class391_21_ = aClass391Array11882[i_20_];
			if (aComparator11883 != null) {
				if (i_20_ < anInt11884 * -125561283 && aComparator11883.compare(class391_19_.anObject4062, class391_21_.anObject4062) > 0)
					i_16_ = i_20_;
				else
					i_16_ = i_18_;
			} else if (i_20_ < anInt11884 * -125561283 && ((Comparable) class391_19_.anObject4062).compareTo(class391_21_.anObject4062) > 0)
				i_16_ = i_20_;
			else
				i_16_ = i_18_;
			if (null != aComparator11883) {
				if (aComparator11883.compare(class391.anObject4062, (aClass391Array11882[i_16_].anObject4062)) <= 0)
					break;
			} else if (((Comparable) class391.anObject4062).compareTo(aClass391Array11882[i_16_].anObject4062) <= 0)
				break;
			aClass391Array11882[i] = aClass391Array11882[i_16_];
			aClass391Array11882[i].anInt4061 = i * 679474381;
		}
		aClass391Array11882[i] = class391;
		aClass391Array11882[i].anInt4061 = 679474381 * i;
	}

	void method10858(int i) {
		Class391 class391 = aClass391Array11882[i];
		int i_22_;
		for (int i_23_ = -125561283 * anInt11884 >>> 1; i < i_23_; i = i_22_) {
			int i_24_ = 1 + (i << 1);
			Class391 class391_25_ = aClass391Array11882[i_24_];
			int i_26_ = (i << 1) + 2;
			Class391 class391_27_ = aClass391Array11882[i_26_];
			if (aComparator11883 != null) {
				if (i_26_ < anInt11884 * -125561283 && aComparator11883.compare(class391_25_.anObject4062, class391_27_.anObject4062) > 0)
					i_22_ = i_26_;
				else
					i_22_ = i_24_;
			} else if (i_26_ < anInt11884 * -125561283 && ((Comparable) class391_25_.anObject4062).compareTo(class391_27_.anObject4062) > 0)
				i_22_ = i_26_;
			else
				i_22_ = i_24_;
			if (null != aComparator11883) {
				if (aComparator11883.compare(class391.anObject4062, (aClass391Array11882[i_22_].anObject4062)) <= 0)
					break;
			} else if (((Comparable) class391.anObject4062).compareTo(aClass391Array11882[i_22_].anObject4062) <= 0)
				break;
			aClass391Array11882[i] = aClass391Array11882[i_22_];
			aClass391Array11882[i].anInt4061 = i * 679474381;
		}
		aClass391Array11882[i] = class391;
		aClass391Array11882[i].anInt4061 = 679474381 * i;
	}

	public boolean method10859(Object object) {
		return aMap11885.containsKey(object);
	}

	public Object[] method10860() {
		Object[] objects = super.toArray();
		if (aComparator11883 != null)
			Arrays.sort(objects, aComparator11883);
		else
			Arrays.sort(objects);
		return objects;
	}

	public int size() {
		return -125561283 * anInt11884;
	}

	public Object[] method10861() {
		Object[] objects = super.toArray();
		if (aComparator11883 != null)
			Arrays.sort(objects, aComparator11883);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Iterator method10862() {
		return new Class383(this);
	}

	public Iterator method10863() {
		return new Class383(this);
	}

	public Object[] toArray() {
		Object[] objects = super.toArray();
		if (aComparator11883 != null)
			Arrays.sort(objects, aComparator11883);
		else
			Arrays.sort(objects);
		return objects;
	}
}

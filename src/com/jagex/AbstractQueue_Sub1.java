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
	Comparator aComparator11874;
	int anInt11875;
	Class395[] aClass395Array11876;
	Map aMap11877;
	int anInt11878 = 0;

	public boolean remove(Object object) {
		Class395 class395 = (Class395) aMap11877.remove(object);
		if (class395 == null)
			return false;
		anInt11878 += -2106653339;
		anInt11875 -= -439513669;
		if (class395.anInt4105 * 2129028423 == anInt11875 * -1968427149) {
			aClass395Array11876[-1968427149 * anInt11875] = null;
			return true;
		}
		Class395 class395_0_ = aClass395Array11876[-1968427149 * anInt11875];
		aClass395Array11876[-1968427149 * anInt11875] = null;
		aClass395Array11876[class395.anInt4105 * 2129028423] = class395_0_;
		aClass395Array11876[class395.anInt4105 * 2129028423].anInt4105 = class395.anInt4105 * 1;
		method18504(class395.anInt4105 * 2129028423, 25527675);
		if (class395_0_ == aClass395Array11876[class395.anInt4105 * 2129028423])
			method18503(2129028423 * class395.anInt4105, (byte) -114);
		return true;
	}

	public AbstractQueue_Sub1(int i, Comparator comparator) {
		aClass395Array11876 = new Class395[i];
		aMap11877 = new HashMap();
		aComparator11874 = comparator;
	}

	void method18500(int i) {
		int i_1_ = 1 + (aClass395Array11876.length << 1);
		aClass395Array11876 = (Class395[]) Arrays.copyOf(aClass395Array11876, i_1_);
	}

	void method18501(int i) {
		Class395 class395 = aClass395Array11876[i];
		int i_2_;
		for (/**/; i > 0; i = i_2_) {
			i_2_ = i - 1 >>> 1;
			Class395 class395_3_ = aClass395Array11876[i_2_];
			if (null != aComparator11874) {
				if (aComparator11874.compare(class395.anObject4104, class395_3_.anObject4104) >= 0)
					break;
			} else if (((Comparable) class395.anObject4104).compareTo(class395_3_.anObject4104) >= 0)
				break;
			aClass395Array11876[i] = class395_3_;
			aClass395Array11876[i].anInt4105 = 726119543 * i;
		}
		aClass395Array11876[i] = class395;
		aClass395Array11876[i].anInt4105 = i * 726119543;
	}

	public boolean offer(Object object) {
		if (aMap11877.containsKey(object))
			throw new IllegalArgumentException("");
		anInt11878 += -2106653339;
		int i = anInt11875 * -1968427149;
		if (i >= aClass395Array11876.length)
			method18500(-443019945);
		anInt11875 += -439513669;
		if (0 == i) {
			aClass395Array11876[0] = new Class395(object, 0);
			aMap11877.put(object, aClass395Array11876[0]);
		} else {
			aClass395Array11876[i] = new Class395(object, i);
			aMap11877.put(object, aClass395Array11876[i]);
			method18503(i, (byte) -105);
		}
		return true;
	}

	public Object peek() {
		if (0 == anInt11875 * -1968427149)
			return null;
		return aClass395Array11876[0].anObject4104;
	}

	public boolean method18502(Object object) {
		Class395 class395 = (Class395) aMap11877.remove(object);
		if (class395 == null)
			return false;
		anInt11878 += -2106653339;
		anInt11875 -= -439513669;
		if (class395.anInt4105 * 2129028423 == anInt11875 * -1968427149) {
			aClass395Array11876[-1968427149 * anInt11875] = null;
			return true;
		}
		Class395 class395_4_ = aClass395Array11876[-1968427149 * anInt11875];
		aClass395Array11876[-1968427149 * anInt11875] = null;
		aClass395Array11876[class395.anInt4105 * 2129028423] = class395_4_;
		aClass395Array11876[class395.anInt4105 * 2129028423].anInt4105 = class395.anInt4105 * 1;
		method18504(class395.anInt4105 * 2129028423, 28660651);
		if (class395_4_ == aClass395Array11876[class395.anInt4105 * 2129028423])
			method18503(2129028423 * class395.anInt4105, (byte) -8);
		return true;
	}

	public int size() {
		return -1968427149 * anInt11875;
	}

	void method18503(int i, byte i_5_) {
		Class395 class395 = aClass395Array11876[i];
		int i_6_;
		for (/**/; i > 0; i = i_6_) {
			i_6_ = i - 1 >>> 1;
			Class395 class395_7_ = aClass395Array11876[i_6_];
			if (null != aComparator11874) {
				if (aComparator11874.compare(class395.anObject4104, class395_7_.anObject4104) >= 0)
					break;
			} else if (((Comparable) class395.anObject4104).compareTo(class395_7_.anObject4104) >= 0)
				break;
			aClass395Array11876[i] = class395_7_;
			aClass395Array11876[i].anInt4105 = 726119543 * i;
		}
		aClass395Array11876[i] = class395;
		aClass395Array11876[i].anInt4105 = i * 726119543;
	}

	void method18504(int i, int i_8_) {
		Class395 class395 = aClass395Array11876[i];
		int i_9_;
		for (int i_10_ = -1968427149 * anInt11875 >>> 1; i < i_10_; i = i_9_) {
			int i_11_ = (i << 1) + 1;
			Class395 class395_12_ = aClass395Array11876[i_11_];
			int i_13_ = 2 + (i << 1);
			Class395 class395_14_ = aClass395Array11876[i_13_];
			if (aComparator11874 != null) {
				if (i_13_ < anInt11875 * -1968427149 && aComparator11874.compare(class395_12_.anObject4104, class395_14_.anObject4104) > 0)
					i_9_ = i_13_;
				else
					i_9_ = i_11_;
			} else if (i_13_ < -1968427149 * anInt11875 && ((Comparable) class395_12_.anObject4104).compareTo(class395_14_.anObject4104) > 0)
				i_9_ = i_13_;
			else
				i_9_ = i_11_;
			if (null != aComparator11874) {
				if (aComparator11874.compare(class395.anObject4104, (aClass395Array11876[i_9_].anObject4104)) <= 0)
					break;
			} else if (((Comparable) class395.anObject4104).compareTo(aClass395Array11876[i_9_].anObject4104) <= 0)
				break;
			aClass395Array11876[i] = aClass395Array11876[i_9_];
			aClass395Array11876[i].anInt4105 = i * 726119543;
		}
		aClass395Array11876[i] = class395;
		aClass395Array11876[i].anInt4105 = 726119543 * i;
	}

	public boolean contains(Object object) {
		return aMap11877.containsKey(object);
	}

	public int method18505() {
		return -1968427149 * anInt11875;
	}

	public Object poll() {
		if (anInt11875 * -1968427149 == 0)
			return null;
		anInt11878 += -2106653339;
		Object object = aClass395Array11876[0].anObject4104;
		aMap11877.remove(object);
		anInt11875 -= -439513669;
		if (0 == anInt11875 * -1968427149)
			aClass395Array11876[-1968427149 * anInt11875] = null;
		else {
			aClass395Array11876[0] = aClass395Array11876[anInt11875 * -1968427149];
			aClass395Array11876[0].anInt4105 = 0;
			aClass395Array11876[anInt11875 * -1968427149] = null;
			method18504(0, 1917909855);
		}
		return object;
	}

	public Iterator method18506() {
		return new Class380(this);
	}

	public Object method18507() {
		if (0 == anInt11875 * -1968427149)
			return null;
		return aClass395Array11876[0].anObject4104;
	}

	void method18508() {
		int i = 1 + (aClass395Array11876.length << 1);
		aClass395Array11876 = (Class395[]) Arrays.copyOf(aClass395Array11876, i);
	}

	public Object[] toArray() {
		Object[] objects = super.toArray();
		if (aComparator11874 != null)
			Arrays.sort(objects, aComparator11874);
		else
			Arrays.sort(objects);
		return objects;
	}

	public int method18509() {
		return -1968427149 * anInt11875;
	}

	void method18510() {
		int i = 1 + (aClass395Array11876.length << 1);
		aClass395Array11876 = (Class395[]) Arrays.copyOf(aClass395Array11876, i);
	}

	void method18511() {
		int i = 1 + (aClass395Array11876.length << 1);
		aClass395Array11876 = (Class395[]) Arrays.copyOf(aClass395Array11876, i);
	}

	public boolean method18512(Object object) {
		if (aMap11877.containsKey(object))
			throw new IllegalArgumentException("");
		anInt11878 += -2106653339;
		int i = anInt11875 * -1968427149;
		if (i >= aClass395Array11876.length)
			method18500(-357531017);
		anInt11875 += -439513669;
		if (0 == i) {
			aClass395Array11876[0] = new Class395(object, 0);
			aMap11877.put(object, aClass395Array11876[0]);
		} else {
			aClass395Array11876[i] = new Class395(object, i);
			aMap11877.put(object, aClass395Array11876[i]);
			method18503(i, (byte) -2);
		}
		return true;
	}

	public AbstractQueue_Sub1(int i) {
		this(i, null);
	}

	public Object method18513() {
		if (0 == anInt11875 * -1968427149)
			return null;
		return aClass395Array11876[0].anObject4104;
	}

	public Object method18514() {
		if (anInt11875 * -1968427149 == 0)
			return null;
		anInt11878 += -2106653339;
		Object object = aClass395Array11876[0].anObject4104;
		aMap11877.remove(object);
		anInt11875 -= -439513669;
		if (0 == anInt11875 * -1968427149)
			aClass395Array11876[-1968427149 * anInt11875] = null;
		else {
			aClass395Array11876[0] = aClass395Array11876[anInt11875 * -1968427149];
			aClass395Array11876[0].anInt4105 = 0;
			aClass395Array11876[anInt11875 * -1968427149] = null;
			method18504(0, 980321397);
		}
		return object;
	}

	public Object method18515() {
		if (anInt11875 * -1968427149 == 0)
			return null;
		anInt11878 += -2106653339;
		Object object = aClass395Array11876[0].anObject4104;
		aMap11877.remove(object);
		anInt11875 -= -439513669;
		if (0 == anInt11875 * -1968427149)
			aClass395Array11876[-1968427149 * anInt11875] = null;
		else {
			aClass395Array11876[0] = aClass395Array11876[anInt11875 * -1968427149];
			aClass395Array11876[0].anInt4105 = 0;
			aClass395Array11876[anInt11875 * -1968427149] = null;
			method18504(0, 733233602);
		}
		return object;
	}

	public Object method18516() {
		if (anInt11875 * -1968427149 == 0)
			return null;
		anInt11878 += -2106653339;
		Object object = aClass395Array11876[0].anObject4104;
		aMap11877.remove(object);
		anInt11875 -= -439513669;
		if (0 == anInt11875 * -1968427149)
			aClass395Array11876[-1968427149 * anInt11875] = null;
		else {
			aClass395Array11876[0] = aClass395Array11876[anInt11875 * -1968427149];
			aClass395Array11876[0].anInt4105 = 0;
			aClass395Array11876[anInt11875 * -1968427149] = null;
			method18504(0, 62952742);
		}
		return object;
	}

	void method18517(int i) {
		Class395 class395 = aClass395Array11876[i];
		int i_15_;
		for (/**/; i > 0; i = i_15_) {
			i_15_ = i - 1 >>> 1;
			Class395 class395_16_ = aClass395Array11876[i_15_];
			if (null != aComparator11874) {
				if (aComparator11874.compare(class395.anObject4104, class395_16_.anObject4104) >= 0)
					break;
			} else if (((Comparable) class395.anObject4104).compareTo(class395_16_.anObject4104) >= 0)
				break;
			aClass395Array11876[i] = class395_16_;
			aClass395Array11876[i].anInt4105 = 726119543 * i;
		}
		aClass395Array11876[i] = class395;
		aClass395Array11876[i].anInt4105 = i * 726119543;
	}

	public boolean method18518(Object object) {
		Class395 class395 = (Class395) aMap11877.remove(object);
		if (class395 == null)
			return false;
		anInt11878 += -2106653339;
		anInt11875 -= -439513669;
		if (class395.anInt4105 * 2129028423 == anInt11875 * -1968427149) {
			aClass395Array11876[-1968427149 * anInt11875] = null;
			return true;
		}
		Class395 class395_17_ = aClass395Array11876[-1968427149 * anInt11875];
		aClass395Array11876[-1968427149 * anInt11875] = null;
		aClass395Array11876[class395.anInt4105 * 2129028423] = class395_17_;
		aClass395Array11876[class395.anInt4105 * 2129028423].anInt4105 = class395.anInt4105 * 1;
		method18504(class395.anInt4105 * 2129028423, 1651996018);
		if (class395_17_ == aClass395Array11876[class395.anInt4105 * 2129028423])
			method18503(2129028423 * class395.anInt4105, (byte) -63);
		return true;
	}

	public Iterator iterator() {
		return new Class380(this);
	}

	public boolean method18519(Object object) {
		if (aMap11877.containsKey(object))
			throw new IllegalArgumentException("");
		anInt11878 += -2106653339;
		int i = anInt11875 * -1968427149;
		if (i >= aClass395Array11876.length)
			method18500(-419261587);
		anInt11875 += -439513669;
		if (0 == i) {
			aClass395Array11876[0] = new Class395(object, 0);
			aMap11877.put(object, aClass395Array11876[0]);
		} else {
			aClass395Array11876[i] = new Class395(object, i);
			aMap11877.put(object, aClass395Array11876[i]);
			method18503(i, (byte) -66);
		}
		return true;
	}

	void method18520(int i) {
		Class395 class395 = aClass395Array11876[i];
		int i_18_;
		for (/**/; i > 0; i = i_18_) {
			i_18_ = i - 1 >>> 1;
			Class395 class395_19_ = aClass395Array11876[i_18_];
			if (null != aComparator11874) {
				if (aComparator11874.compare(class395.anObject4104, class395_19_.anObject4104) >= 0)
					break;
			} else if (((Comparable) class395.anObject4104).compareTo(class395_19_.anObject4104) >= 0)
				break;
			aClass395Array11876[i] = class395_19_;
			aClass395Array11876[i].anInt4105 = 726119543 * i;
		}
		aClass395Array11876[i] = class395;
		aClass395Array11876[i].anInt4105 = i * 726119543;
	}

	void method18521(int i) {
		Class395 class395 = aClass395Array11876[i];
		int i_20_;
		for (int i_21_ = -1968427149 * anInt11875 >>> 1; i < i_21_; i = i_20_) {
			int i_22_ = (i << 1) + 1;
			Class395 class395_23_ = aClass395Array11876[i_22_];
			int i_24_ = 2 + (i << 1);
			Class395 class395_25_ = aClass395Array11876[i_24_];
			if (aComparator11874 != null) {
				if (i_24_ < anInt11875 * -1968427149 && aComparator11874.compare(class395_23_.anObject4104, class395_25_.anObject4104) > 0)
					i_20_ = i_24_;
				else
					i_20_ = i_22_;
			} else if (i_24_ < -1968427149 * anInt11875 && ((Comparable) class395_23_.anObject4104).compareTo(class395_25_.anObject4104) > 0)
				i_20_ = i_24_;
			else
				i_20_ = i_22_;
			if (null != aComparator11874) {
				if (aComparator11874.compare(class395.anObject4104, (aClass395Array11876[i_20_].anObject4104)) <= 0)
					break;
			} else if (((Comparable) class395.anObject4104).compareTo(aClass395Array11876[i_20_].anObject4104) <= 0)
				break;
			aClass395Array11876[i] = aClass395Array11876[i_20_];
			aClass395Array11876[i].anInt4105 = i * 726119543;
		}
		aClass395Array11876[i] = class395;
		aClass395Array11876[i].anInt4105 = 726119543 * i;
	}

	public boolean method18522(Object object) {
		return aMap11877.containsKey(object);
	}

	public Object[] method18523() {
		Object[] objects = super.toArray();
		if (aComparator11874 != null)
			Arrays.sort(objects, aComparator11874);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Object[] method18524() {
		Object[] objects = super.toArray();
		if (aComparator11874 != null)
			Arrays.sort(objects, aComparator11874);
		else
			Arrays.sort(objects);
		return objects;
	}
}

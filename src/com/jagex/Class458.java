/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class458 {
	Class454 aClass454_5064;
	Map aMap5065;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_5066;
	long aLong5067;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_5068;
	Comparator aComparator5069 = new Class466(this);
	int anInt5070;

	public Object method7448(Object object) {
		synchronized (this) {
			if (aLong5067 * 2559609941237478805L != -1L)
				method7453(-345014753);
			Class473 class473 = (Class473) aMap5065.get(object);
			if (class473 == null) {
				Object object_0_ = null;
				return object_0_;
			}
			method7452(class473, false, -1260993646);
			Object object_1_ = class473.anObject5372;
			return object_1_;
		}
	}

	Class458(long l, int i, Class454 class454) {
		aLong5067 = l * -458032853511311939L;
		anInt5070 = -2015618423 * i;
		aClass454_5064 = class454;
		if (-1 == anInt5070 * -144081991) {
			aMap5065 = new HashMap(64);
			anAbstractQueue_Sub1_5066 = new AbstractQueue_Sub1(64, aComparator5069);
			anAbstractQueue_Sub1_5068 = null;
		} else {
			if (null == aClass454_5064)
				throw new IllegalArgumentException("");
			aMap5065 = new HashMap(-144081991 * anInt5070);
			anAbstractQueue_Sub1_5066 = new AbstractQueue_Sub1(-144081991 * anInt5070, aComparator5069);
			anAbstractQueue_Sub1_5068 = new AbstractQueue_Sub1(-144081991 * anInt5070);
		}
	}

	public Object method7449(Object object) {
		synchronized (this) {
			if (aLong5067 * 2559609941237478805L != -1L)
				method7453(-1091299577);
			Class473 class473 = (Class473) aMap5065.get(object);
			if (class473 == null) {
				Object object_2_ = null;
				return object_2_;
			}
			method7452(class473, false, -1294747101);
			Object object_3_ = class473.anObject5372;
			return object_3_;
		}
	}

	public Object method7450(Object object, byte i) {
		synchronized (this) {
			if (aLong5067 * 2559609941237478805L != -1L)
				method7453(-212854764);
			Class473 class473 = (Class473) aMap5065.get(object);
			if (class473 == null) {
				Object object_4_ = null;
				return object_4_;
			}
			method7452(class473, false, 914198092);
			Object object_5_ = class473.anObject5372;
			return object_5_;
		}
	}

	boolean method7451() {
		return -1 != -144081991 * anInt5070;
	}

	void method7452(Class473 class473, boolean bool, int i) {
		if (!bool) {
			anAbstractQueue_Sub1_5066.remove(class473);
			if (method7457((short) 14460) && !anAbstractQueue_Sub1_5068.remove(class473))
				throw new IllegalStateException("");
		}
		class473.aLong5371 = System.currentTimeMillis() * 6749332766424291209L;
		if (method7457((short) -18988)) {
			switch (aClass454_5064.anInt4969 * -951590873) {
			case 0:
				class473.aLong5369 = class473.aLong5371 * 3167028721439851997L;
				break;
			case 1:
				class473.aLong5369 += -2920275396634968507L;
				break;
			}
			anAbstractQueue_Sub1_5068.add(class473);
		}
		anAbstractQueue_Sub1_5066.add(class473);
	}

	void method7453(int i) {
		if (-1L == 2559609941237478805L * aLong5067)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - aLong5067 * 2559609941237478805L;
		while (!anAbstractQueue_Sub1_5066.isEmpty()) {
			Class473 class473 = (Class473) anAbstractQueue_Sub1_5066.peek();
			if (7787969294484491961L * class473.aLong5371 < l) {
				aMap5065.remove(class473.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473);
				if (method7457((short) 1077))
					anAbstractQueue_Sub1_5068.remove(class473);
			} else
				break;
		}
	}

	boolean method7454() {
		return -1 != -144081991 * anInt5070;
	}

	public Class458(int i, Class454 class454) {
		this(-1L, i, class454);
	}

	boolean method7455() {
		return -1 != -144081991 * anInt5070;
	}

	public Object method7456(Object object, Object object_6_) {
		synchronized (this) {
			if (2559609941237478805L * aLong5067 != -1L)
				method7453(-1649878041);
			Class473 class473 = (Class473) aMap5065.get(object);
			if (class473 != null) {
				Object object_7_ = class473.anObject5372;
				class473.anObject5372 = object_6_;
				method7452(class473, false, 167592436);
				Object object_8_ = object_7_;
				return object_8_;
			}
			if (method7457((short) -22410) && aMap5065.size() == anInt5070 * -144081991) {
				Class473 class473_9_ = (Class473) anAbstractQueue_Sub1_5068.remove();
				aMap5065.remove(class473_9_.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473_9_);
			}
			Class473 class473_10_ = new Class473(object_6_, object);
			aMap5065.put(object, class473_10_);
			method7452(class473_10_, true, 996103324);
			Object object_11_ = null;
			return object_11_;
		}
	}

	boolean method7457(short i) {
		return -1 != -144081991 * anInt5070;
	}

	boolean method7458() {
		return -1 != -144081991 * anInt5070;
	}

	public Object method7459(Object object, Object object_12_) {
		synchronized (this) {
			if (2559609941237478805L * aLong5067 != -1L)
				method7453(-1985491718);
			Class473 class473 = (Class473) aMap5065.get(object);
			if (class473 != null) {
				Object object_13_ = class473.anObject5372;
				class473.anObject5372 = object_12_;
				method7452(class473, false, 1766144835);
				Object object_14_ = object_13_;
				return object_14_;
			}
			if (method7457((short) -5966) && aMap5065.size() == anInt5070 * -144081991) {
				Class473 class473_15_ = (Class473) anAbstractQueue_Sub1_5068.remove();
				aMap5065.remove(class473_15_.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473_15_);
			}
			Class473 class473_16_ = new Class473(object_12_, object);
			aMap5065.put(object, class473_16_);
			method7452(class473_16_, true, -837974662);
			Object object_17_ = null;
			return object_17_;
		}
	}

	public Object method7460(Object object, Object object_18_, byte i) {
		synchronized (this) {
			if (2559609941237478805L * aLong5067 != -1L)
				method7453(-1905848049);
			Class473 class473 = (Class473) aMap5065.get(object);
			if (class473 != null) {
				Object object_19_ = class473.anObject5372;
				class473.anObject5372 = object_18_;
				method7452(class473, false, -1566405704);
				Object object_20_ = object_19_;
				return object_20_;
			}
			if (method7457((short) -2498) && aMap5065.size() == anInt5070 * -144081991) {
				Class473 class473_21_ = (Class473) anAbstractQueue_Sub1_5068.remove();
				aMap5065.remove(class473_21_.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473_21_);
			}
			Class473 class473_22_ = new Class473(object_18_, object);
			aMap5065.put(object, class473_22_);
			method7452(class473_22_, true, 1638719517);
			Object object_23_ = null;
			return object_23_;
		}
	}

	public Object method7461(Object object, Object object_24_) {
		synchronized (this) {
			if (2559609941237478805L * aLong5067 != -1L)
				method7453(-600541948);
			Class473 class473 = (Class473) aMap5065.get(object);
			if (class473 != null) {
				Object object_25_ = class473.anObject5372;
				class473.anObject5372 = object_24_;
				method7452(class473, false, -1847454129);
				Object object_26_ = object_25_;
				return object_26_;
			}
			if (method7457((short) 11150) && aMap5065.size() == anInt5070 * -144081991) {
				Class473 class473_27_ = (Class473) anAbstractQueue_Sub1_5068.remove();
				aMap5065.remove(class473_27_.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473_27_);
			}
			Class473 class473_28_ = new Class473(object_24_, object);
			aMap5065.put(object, class473_28_);
			method7452(class473_28_, true, -713654297);
			Object object_29_ = null;
			return object_29_;
		}
	}

	void method7462(Class473 class473, boolean bool) {
		if (!bool) {
			anAbstractQueue_Sub1_5066.remove(class473);
			if (method7457((short) 22250) && !anAbstractQueue_Sub1_5068.remove(class473))
				throw new IllegalStateException("");
		}
		class473.aLong5371 = System.currentTimeMillis() * 6749332766424291209L;
		if (method7457((short) 8094)) {
			switch (aClass454_5064.anInt4969 * -951590873) {
			case 0:
				class473.aLong5369 = class473.aLong5371 * 3167028721439851997L;
				break;
			case 1:
				class473.aLong5369 += -2920275396634968507L;
				break;
			}
			anAbstractQueue_Sub1_5068.add(class473);
		}
		anAbstractQueue_Sub1_5066.add(class473);
	}

	void method7463(Class473 class473, boolean bool) {
		if (!bool) {
			anAbstractQueue_Sub1_5066.remove(class473);
			if (method7457((short) -7812) && !anAbstractQueue_Sub1_5068.remove(class473))
				throw new IllegalStateException("");
		}
		class473.aLong5371 = System.currentTimeMillis() * 6749332766424291209L;
		if (method7457((short) 687)) {
			switch (aClass454_5064.anInt4969 * -951590873) {
			case 0:
				class473.aLong5369 = class473.aLong5371 * 3167028721439851997L;
				break;
			case 1:
				class473.aLong5369 += -2920275396634968507L;
				break;
			}
			anAbstractQueue_Sub1_5068.add(class473);
		}
		anAbstractQueue_Sub1_5066.add(class473);
	}

	void method7464(Class473 class473, boolean bool) {
		if (!bool) {
			anAbstractQueue_Sub1_5066.remove(class473);
			if (method7457((short) 8532) && !anAbstractQueue_Sub1_5068.remove(class473))
				throw new IllegalStateException("");
		}
		class473.aLong5371 = System.currentTimeMillis() * 6749332766424291209L;
		if (method7457((short) 17890)) {
			switch (aClass454_5064.anInt4969 * -951590873) {
			case 0:
				class473.aLong5369 = class473.aLong5371 * 3167028721439851997L;
				break;
			case 1:
				class473.aLong5369 += -2920275396634968507L;
				break;
			}
			anAbstractQueue_Sub1_5068.add(class473);
		}
		anAbstractQueue_Sub1_5066.add(class473);
	}

	void method7465() {
		if (-1L == 2559609941237478805L * aLong5067)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - aLong5067 * 2559609941237478805L;
		while (!anAbstractQueue_Sub1_5066.isEmpty()) {
			Class473 class473 = (Class473) anAbstractQueue_Sub1_5066.peek();
			if (7787969294484491961L * class473.aLong5371 < l) {
				aMap5065.remove(class473.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473);
				if (method7457((short) -12494))
					anAbstractQueue_Sub1_5068.remove(class473);
			} else
				break;
		}
	}

	void method7466() {
		if (-1L == 2559609941237478805L * aLong5067)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - aLong5067 * 2559609941237478805L;
		while (!anAbstractQueue_Sub1_5066.isEmpty()) {
			Class473 class473 = (Class473) anAbstractQueue_Sub1_5066.peek();
			if (7787969294484491961L * class473.aLong5371 < l) {
				aMap5065.remove(class473.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473);
				if (method7457((short) -3265))
					anAbstractQueue_Sub1_5068.remove(class473);
			} else
				break;
		}
	}

	void method7467() {
		if (-1L == 2559609941237478805L * aLong5067)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - aLong5067 * 2559609941237478805L;
		while (!anAbstractQueue_Sub1_5066.isEmpty()) {
			Class473 class473 = (Class473) anAbstractQueue_Sub1_5066.peek();
			if (7787969294484491961L * class473.aLong5371 < l) {
				aMap5065.remove(class473.anObject5370);
				anAbstractQueue_Sub1_5066.remove(class473);
				if (method7457((short) 8782))
					anAbstractQueue_Sub1_5068.remove(class473);
			} else
				break;
		}
	}

	void method7468(Class473 class473, boolean bool) {
		if (!bool) {
			anAbstractQueue_Sub1_5066.remove(class473);
			if (method7457((short) 1185) && !anAbstractQueue_Sub1_5068.remove(class473))
				throw new IllegalStateException("");
		}
		class473.aLong5371 = System.currentTimeMillis() * 6749332766424291209L;
		if (method7457((short) -1075)) {
			switch (aClass454_5064.anInt4969 * -951590873) {
			case 0:
				class473.aLong5369 = class473.aLong5371 * 3167028721439851997L;
				break;
			case 1:
				class473.aLong5369 += -2920275396634968507L;
				break;
			}
			anAbstractQueue_Sub1_5068.add(class473);
		}
		anAbstractQueue_Sub1_5066.add(class473);
	}

	public static Class360 method7469(int i, byte i_30_) {
		if (null != Class649.aClass358_8371)
			return Class649.aClass358_8371.method6287(-729087984).method6379(i, 109839657);
		return null;
	}
}

/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class383 implements Iterator {
	AbstractQueue_Sub1 anAbstractQueue_Sub1_4015;
	int anInt4016 = 0;
	int anInt4017 = anAbstractQueue_Sub1_4015.anInt11886 * -2076046115;

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return (-1722535319 * anInt4016 < anAbstractQueue_Sub1_4015.anInt11884 * -125561283);
	}

	public Object next() {
		if (683055759 * anAbstractQueue_Sub1_4015.anInt11886 != anInt4017 * -1312315301)
			throw new ConcurrentModificationException();
		if (-1722535319 * anInt4016 < -125561283 * anAbstractQueue_Sub1_4015.anInt11884) {
			Object object = (anAbstractQueue_Sub1_4015.aClass391Array11882[anInt4016 * -1722535319].anObject4062);
			anInt4016 += 711228889;
			return object;
		}
		throw new NoSuchElementException();
	}

	Class383(AbstractQueue_Sub1 abstractqueue_sub1) {
		anAbstractQueue_Sub1_4015 = abstractqueue_sub1;
	}

	public boolean method4824() {
		return (-1722535319 * anInt4016 < anAbstractQueue_Sub1_4015.anInt11884 * -125561283);
	}

	public boolean method4825() {
		return (-1722535319 * anInt4016 < anAbstractQueue_Sub1_4015.anInt11884 * -125561283);
	}

	public Object method4826() {
		if (683055759 * anAbstractQueue_Sub1_4015.anInt11886 != anInt4017 * -1312315301)
			throw new ConcurrentModificationException();
		if (-1722535319 * anInt4016 < -125561283 * anAbstractQueue_Sub1_4015.anInt11884) {
			Object object = (anAbstractQueue_Sub1_4015.aClass391Array11882[anInt4016 * -1722535319].anObject4062);
			anInt4016 += 711228889;
			return object;
		}
		throw new NoSuchElementException();
	}

	public Object method4827() {
		if (683055759 * anAbstractQueue_Sub1_4015.anInt11886 != anInt4017 * -1312315301)
			throw new ConcurrentModificationException();
		if (-1722535319 * anInt4016 < -125561283 * anAbstractQueue_Sub1_4015.anInt11884) {
			Object object = (anAbstractQueue_Sub1_4015.aClass391Array11882[anInt4016 * -1722535319].anObject4062);
			anInt4016 += 711228889;
			return object;
		}
		throw new NoSuchElementException();
	}

	public void method4828() {
		throw new UnsupportedOperationException();
	}

	static void method4829(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class325.method4277(3649116);
	}

	static final void method4830(Class668 class668, short i) {
		class668.anInt8546 -= -709931686;
		if (class668.aLongArray8565[class668.anInt8546 * 1346022693] > class668.aLongArray8565[1 + class668.anInt8546 * 1346022693])
			class668.anInt8564 += (class668.anIntArray8537[class668.anInt8564 * -1640738851] * -1531084683);
	}

	static final void method4831(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		Class153.method1867(class251, class668, (byte) -68);
	}
}

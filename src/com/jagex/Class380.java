/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class380 implements Iterator {
	int anInt3932 = 0;
	int anInt3933;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_3934;

	Class380(AbstractQueue_Sub1 abstractqueue_sub1) {
		anInt3933 = 787498027 * anAbstractQueue_Sub1_3934.anInt11878;
		anAbstractQueue_Sub1_3934 = abstractqueue_sub1;
	}

	public boolean hasNext() {
		return (anInt3932 * 1435532057 < -1968427149 * anAbstractQueue_Sub1_3934.anInt11875);
	}

	public Object next() {
		if (61240775 * anInt3933 != 13542509 * anAbstractQueue_Sub1_3934.anInt11878)
			throw new ConcurrentModificationException();
		if (1435532057 * anInt3932 < anAbstractQueue_Sub1_3934.anInt11875 * -1968427149) {
			Object object = (anAbstractQueue_Sub1_3934.aClass395Array11876[1435532057 * anInt3932].anObject4104);
			anInt3932 += 885043497;
			return object;
		}
		throw new NoSuchElementException();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method6392() {
		return (anInt3932 * 1435532057 < -1968427149 * anAbstractQueue_Sub1_3934.anInt11875);
	}

	public Object method6393() {
		if (61240775 * anInt3933 != 13542509 * anAbstractQueue_Sub1_3934.anInt11878)
			throw new ConcurrentModificationException();
		if (1435532057 * anInt3932 < anAbstractQueue_Sub1_3934.anInt11875 * -1968427149) {
			Object object = (anAbstractQueue_Sub1_3934.aClass395Array11876[1435532057 * anInt3932].anObject4104);
			anInt3932 += 885043497;
			return object;
		}
		throw new NoSuchElementException();
	}

	public Object method6394() {
		if (61240775 * anInt3933 != 13542509 * anAbstractQueue_Sub1_3934.anInt11878)
			throw new ConcurrentModificationException();
		if (1435532057 * anInt3932 < anAbstractQueue_Sub1_3934.anInt11875 * -1968427149) {
			Object object = (anAbstractQueue_Sub1_3934.aClass395Array11876[1435532057 * anInt3932].anObject4104);
			anInt3932 += 885043497;
			return object;
		}
		throw new NoSuchElementException();
	}

	public void method6395() {
		throw new UnsupportedOperationException();
	}

	static final void method6396(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -1667969177);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class186.method3651(class243, class240, class665, 1859543809);
	}

	static final void method6397(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 114452147 * class243.anInt2524;
	}
}

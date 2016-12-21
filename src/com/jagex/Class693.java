/* Class693 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class693 implements Iterator {
	static int anInt8723;
	Class536 aClass536_8724;
	Class536 aClass536_8725 = null;
	Class708 aClass708_8726;

	public void method8196(Class708 class708, int i) {
		aClass708_8726 = class708;
		aClass536_8724 = aClass708_8726.aClass536_8826.aClass536_7132;
		aClass536_8725 = null;
	}

	void method8197(int i) {
		aClass536_8724 = aClass708_8726.aClass536_8826.aClass536_7132;
		aClass536_8725 = null;
	}

	public Class536 method8198(int i) {
		method8197(-1810778541);
		return (Class536) next();
	}

	public Object next() {
		Class536 class536 = aClass536_8724;
		if (class536 == aClass708_8726.aClass536_8826) {
			class536 = null;
			aClass536_8724 = null;
		} else
			aClass536_8724 = class536.aClass536_7132;
		aClass536_8725 = class536;
		return class536;
	}

	public boolean hasNext() {
		return aClass708_8726.aClass536_8826 != aClass536_8724;
	}

	void method8199() {
		aClass536_8724 = aClass708_8726.aClass536_8826.aClass536_7132;
		aClass536_8725 = null;
	}

	public boolean method8200() {
		return aClass708_8726.aClass536_8826 != aClass536_8724;
	}

	public boolean method8201() {
		return aClass708_8726.aClass536_8826 != aClass536_8724;
	}

	public Object method8202() {
		Class536 class536 = aClass536_8724;
		if (class536 == aClass708_8726.aClass536_8826) {
			class536 = null;
			aClass536_8724 = null;
		} else
			aClass536_8724 = class536.aClass536_7132;
		aClass536_8725 = class536;
		return class536;
	}

	public void method8203() {
		if (aClass536_8725 == null)
			throw new IllegalStateException();
		aClass536_8725.method6484(112803026);
		aClass536_8725 = null;
	}

	public Class693(Class708 class708) {
		aClass708_8726 = class708;
		aClass536_8724 = aClass708_8726.aClass536_8826.aClass536_7132;
		aClass536_8725 = null;
	}

	public Object method8204() {
		Class536 class536 = aClass536_8724;
		if (class536 == aClass708_8726.aClass536_8826) {
			class536 = null;
			aClass536_8724 = null;
		} else
			aClass536_8724 = class536.aClass536_7132;
		aClass536_8725 = class536;
		return class536;
	}

	void method8205() {
		aClass536_8724 = aClass708_8726.aClass536_8826.aClass536_7132;
		aClass536_8725 = null;
	}

	public Class536 method8206() {
		method8197(-932613446);
		return (Class536) next();
	}

	public void remove() {
		if (aClass536_8725 == null)
			throw new IllegalStateException();
		aClass536_8725.method6484(-1064424588);
		aClass536_8725 = null;
	}

	static final void method8207(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class184_Sub2.aClass211_9442.method3025(i_0_, i_1_, -588428692);
	}
}

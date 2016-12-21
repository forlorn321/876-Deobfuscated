/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class36 implements Iterator {
	Class34 this$0;
	int anInt300;

	public Object method824() {
		int i = (anInt300 += 40493621) * -433594339 - 1;
		synchronized (this$0.aClass199_287) {
			Interface13 interface13 = (Interface13) this$0.aClass199_287.method2886((long) i);
			if (interface13 != null) {
				Interface13 interface13_0_ = interface13;
				return interface13_0_;
			}
		}
		return this$0.method801(i, (byte) 64);
	}

	public boolean hasNext() {
		return -433594339 * anInt300 < 2103424577 * this$0.anInt290;
	}

	public Object next() {
		int i = (anInt300 += 40493621) * -433594339 - 1;
		synchronized (this$0.aClass199_287) {
			Interface13 interface13 = (Interface13) this$0.aClass199_287.method2886((long) i);
			if (interface13 != null) {
				Interface13 interface13_1_ = interface13;
				return interface13_1_;
			}
		}
		return this$0.method801(i, (byte) 64);
	}

	public boolean method825() {
		return -433594339 * anInt300 < 2103424577 * this$0.anInt290;
	}

	public boolean method826() {
		return -433594339 * anInt300 < 2103424577 * this$0.anInt290;
	}

	Class36(Class34 class34) {
		this$0 = class34;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object method827() {
		int i = (anInt300 += 40493621) * -433594339 - 1;
		synchronized (this$0.aClass199_287) {
			Interface13 interface13 = (Interface13) this$0.aClass199_287.method2886((long) i);
			if (interface13 != null) {
				Interface13 interface13_2_ = interface13;
				return interface13_2_;
			}
		}
		return this$0.method801(i, (byte) 64);
	}

	public void method828() {
		throw new UnsupportedOperationException();
	}

	public static int method829(int i) {
		synchronized (Class617.aClass199_8081) {
			int i_3_ = Class617.aClass199_8081.method2887(1766307058);
			return i_3_;
		}
	}
}

/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class201 implements Interface25 {
	Class211 this$0;

	public void method151(Object object, int i) {
		method2917((Interface71) object, -1445847732);
	}

	void method2917(Interface71 interface71, int i) {
		Iterator iterator = this$0.method2988((byte) -12).iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			if (class479.method5768(-1348887859) == interface71) {
				class479.method5766((byte) 42);
				iterator.remove();
			}
		}
	}

	public void method150(Object object) {
		method2917((Interface71) object, -123255022);
	}

	public void method152(Object object) {
		method2917((Interface71) object, -1857091870);
	}

	public void method149(Object object) {
		method2917((Interface71) object, 1416219867);
	}

	void method2918(Interface71 interface71) {
		Iterator iterator = this$0.method2988((byte) 78).iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			if (class479.method5768(-1924257418) == interface71) {
				class479.method5766((byte) 80);
				iterator.remove();
			}
		}
	}

	Class201(Class211 class211) {
		this$0 = class211;
	}

	static final void method2919(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.cycles;
	}

	static final void method2920(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string.substring(i_0_, i_1_);
	}
}

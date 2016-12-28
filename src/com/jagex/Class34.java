/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class34 implements Interface12 {
	Class199 aClass199_287;
	Class648 aClass648_288;
	protected Interface6 anInterface6_289;
	public int anInt290;
	Class461 aClass461_291;

	public void method800() {
		synchronized (aClass199_287) {
			aClass199_287.method2892(1800372566);
		}
	}

	DefinitionI method801(int i, byte i_0_) {
		byte[] is;
		synchronized (aClass461_291) {
			is = Class634.method7549(aClass461_291, aClass648_288, i, (byte) 0);
		}
		DefinitionI interface13 = anInterface6_289.method55(i, this, 574343589);
		if (null != is)
			interface13.method74(new RSByteBuffer(is), -920321484);
		interface13.method75((byte) -94);
		return interface13;
	}

	public Iterator method802() {
		return new Class36(this);
	}

	public int method71(int i) {
		return 2103424577 * anInt290;
	}

	public void method803() {
		synchronized (aClass199_287) {
			aClass199_287.method2884((byte) -24);
		}
	}

	public void method804(int i, byte i_1_) {
		synchronized (aClass199_287) {
			aClass199_287.method2883(i, -1395459905);
		}
	}

	public DefinitionI method70(int i, byte i_2_) {
		DefinitionI interface13;
		synchronized (aClass199_287) {
			interface13 = (DefinitionI) aClass199_287.method2886((long) i);
		}
		if (interface13 != null)
			return interface13;
		interface13 = method801(i, (byte) 64);
		synchronized (aClass199_287) {
			aClass199_287.method2881(interface13, (long) i);
		}
		return interface13;
	}

	public void method805(int i, int i_3_) {
		synchronized (aClass199_287) {
			aClass199_287.method2884((byte) -56);
			aClass199_287 = new Class199(i);
		}
	}

	public Iterator iterator() {
		return new Class36(this);
	}

	public DefinitionI method72(int i) {
		DefinitionI interface13;
		synchronized (aClass199_287) {
			interface13 = (DefinitionI) aClass199_287.method2886((long) i);
		}
		if (interface13 != null)
			return interface13;
		interface13 = method801(i, (byte) 64);
		synchronized (aClass199_287) {
			aClass199_287.method2881(interface13, (long) i);
		}
		return interface13;
	}

	public int method12() {
		return 2103424577 * anInt290;
	}

	public int method73() {
		return 2103424577 * anInt290;
	}

	public Class34(Class670 class670, Class664 class664, Class461 class461, Class648 class648, int i, Interface6 interface6) {
		aClass461_291 = class461;
		aClass648_288 = class648;
		anInterface6_289 = interface6;
		anInt290 = (Class191.method2840(aClass461_291, aClass648_288, 38959971) * 1404787137);
		aClass199_287 = new Class199(i);
	}

	public void method806() {
		synchronized (aClass199_287) {
			aClass199_287.method2884((byte) -112);
		}
	}

	public void method807(int i) {
		synchronized (aClass199_287) {
			aClass199_287.method2883(i, -998517503);
		}
	}

	public void method808(int i) {
		synchronized (aClass199_287) {
			aClass199_287.method2883(i, -1877120647);
		}
	}

	public void method809(byte i) {
		synchronized (aClass199_287) {
			aClass199_287.method2884((byte) -27);
		}
	}

	public void method810(int i) {
		synchronized (aClass199_287) {
			aClass199_287.method2892(34653631);
		}
	}

	public Iterator method811() {
		return new Class36(this);
	}

	public Iterator method812() {
		return new Class36(this);
	}

	public void method813(int i) {
		synchronized (aClass199_287) {
			aClass199_287.method2884((byte) -125);
			aClass199_287 = new Class199(i);
		}
	}

	public void method814(int i) {
		synchronized (aClass199_287) {
			aClass199_287.method2884((byte) -53);
			aClass199_287 = new Class199(i);
		}
	}

	static void method815(int i, int i_4_, int i_5_) {
		Class70.anInt791 = i * 1646449879;
		Class70.anInt774 = i_4_ * -56807743;
	}

	static final void method816(Class668 class668, short i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class668.aClass536_Sub15_8553.aString10485;
	}

	public static final void method817(int i) {
		Class655.anImage8495 = null;
		Class41_Sub1.aFont10561 = null;
	}
}

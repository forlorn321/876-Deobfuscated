/* Class95_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class95_Sub1_Sub1 extends Class95_Sub1 implements Interface13 {
	Class459 aClass459_11329;
	Class205 aClass205_11330 = new Class205(64);
	public static int anInt11331;

	Class160_Sub1 method17856(int i) {
		byte[] is = aClass459_11329.method7470((aClass465_8985.method7633(1048375491).anInt8404) * -1573209759, i, (byte) -2);
		Class160_Sub1 class160_sub1 = new Class160_Sub1(aClass465_8985, i);
		if (is != null)
			class160_sub1.method82(new RSByteBuffer(is), 1838727729);
		return class160_sub1;
	}

	public Interface14 method81(int i, int i_0_) {
		Class160_Sub1 class160_sub1;
		synchronized (aClass205_11330) {
			class160_sub1 = (Class160_Sub1) aClass205_11330.method3787((long) i);
			if (null == class160_sub1) {
				class160_sub1 = method17859(i, (byte) 44);
				aClass205_11330.method3790(class160_sub1, (long) i);
			}
		}
		return class160_sub1;
	}

	public Class95_Sub1_Sub1(Class678 class678, Class465 class465, Class671 class671, Class459 class459) {
		super(class678, class465, class671, (class459 != null ? class459.method7504((class465.method7633(1048375491).anInt8404 * -1573209759), -1870684190) : 0));
		aClass459_11329 = class459;
	}

	public void method17857(int i) {
		synchronized (aClass205_11330) {
			aClass205_11330.method3793((byte) 112);
		}
	}

	public void method17858(int i) {
		synchronized (aClass205_11330) {
			aClass205_11330.method3792(i, (byte) 2);
		}
	}

	public Iterator iterator() {
		return new Class245(this);
	}

	Class160_Sub1 method17859(int i, byte i_1_) {
		byte[] is = aClass459_11329.method7470((aClass465_8985.method7633(1048375491).anInt8404) * -1573209759, i, (byte) -77);
		Class160_Sub1 class160_sub1 = new Class160_Sub1(aClass465_8985, i);
		if (is != null)
			class160_sub1.method82(new RSByteBuffer(is), 1601445499);
		return class160_sub1;
	}

	public int method77(int i) {
		return super.method77(-915001411);
	}

	public Interface14 method80(int i) {
		Class160_Sub1 class160_sub1;
		synchronized (aClass205_11330) {
			class160_sub1 = (Class160_Sub1) aClass205_11330.method3787((long) i);
			if (null == class160_sub1) {
				class160_sub1 = method17859(i, (byte) 68);
				aClass205_11330.method3790(class160_sub1, (long) i);
			}
		}
		return class160_sub1;
	}

	public void method17860(int i) {
		synchronized (aClass205_11330) {
			aClass205_11330.method3792(i, (byte) 4);
		}
	}

	public Interface14 method79(int i) {
		Class160_Sub1 class160_sub1;
		synchronized (aClass205_11330) {
			class160_sub1 = (Class160_Sub1) aClass205_11330.method3787((long) i);
			if (null == class160_sub1) {
				class160_sub1 = method17859(i, (byte) 30);
				aClass205_11330.method3790(class160_sub1, (long) i);
			}
		}
		return class160_sub1;
	}

	public Interface14 method78(int i) {
		Class160_Sub1 class160_sub1;
		synchronized (aClass205_11330) {
			class160_sub1 = (Class160_Sub1) aClass205_11330.method3787((long) i);
			if (null == class160_sub1) {
				class160_sub1 = method17859(i, (byte) 123);
				aClass205_11330.method3790(class160_sub1, (long) i);
			}
		}
		return class160_sub1;
	}

	public Interface14 method76(int i) {
		Class160_Sub1 class160_sub1;
		synchronized (aClass205_11330) {
			class160_sub1 = (Class160_Sub1) aClass205_11330.method3787((long) i);
			if (null == class160_sub1) {
				class160_sub1 = method17859(i, (byte) 124);
				aClass205_11330.method3790(class160_sub1, (long) i);
			}
		}
		return class160_sub1;
	}

	public int method46() {
		return super.method77(79550024);
	}

	public void method17861() {
		synchronized (aClass205_11330) {
			aClass205_11330.method3820(-1418259662);
		}
	}

	Class160_Sub1 method17862(int i) {
		byte[] is = aClass459_11329.method7470((aClass465_8985.method7633(1048375491).anInt8404) * -1573209759, i, (byte) -122);
		Class160_Sub1 class160_sub1 = new Class160_Sub1(aClass465_8985, i);
		if (is != null)
			class160_sub1.method82(new RSByteBuffer(is), 1009950141);
		return class160_sub1;
	}

	public void method17863() {
		synchronized (aClass205_11330) {
			aClass205_11330.method3793((byte) 54);
		}
	}

	public void method17864(int i) {
		synchronized (aClass205_11330) {
			aClass205_11330.method3792(i, (byte) 19);
		}
	}

	public void method17865(int i) {
		synchronized (aClass205_11330) {
			aClass205_11330.method3820(212714293);
		}
	}

	public int method7() {
		return super.method77(-2019456550);
	}

	public void method17866(int i, int i_2_) {
		synchronized (aClass205_11330) {
			aClass205_11330.method3792(i, (byte) 14);
		}
	}

	public Iterator method17867() {
		return new Class245(this);
	}
}

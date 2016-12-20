/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class24 implements Interface13 {
	Class459 aClass459_229;
	public int anInt230;
	Class657 aClass657_231;
	Class205 aClass205_232;
	protected Interface6 anInterface6_233;
	public static Class459 aClass459_234;

	public void method830(int i) {
		synchronized (aClass205_232) {
			aClass205_232.method3792(i, (byte) 5);
		}
	}

	public Interface14 method81(int i, int i_0_) {
		Interface14 interface14;
		synchronized (aClass205_232) {
			interface14 = (Interface14) aClass205_232.method3787((long) i);
		}
		if (interface14 != null)
			return interface14;
		interface14 = method831(i, -1371732148);
		synchronized (aClass205_232) {
			aClass205_232.method3790(interface14, (long) i);
		}
		return interface14;
	}

	Interface14 method831(int i, int i_1_) {
		byte[] is;
		synchronized (aClass459_229) {
			is = Class554.method9213(aClass459_229, aClass657_231, i, 314554192);
		}
		Interface14 interface14 = anInterface6_233.method58(i, this, 82623705);
		if (null != is)
			interface14.method82(new RSByteBuffer(is), 1086096144);
		interface14.method86(-1928239010);
		return interface14;
	}

	public Class24(Class678 class678, Class671 class671, Class459 class459, Class657 class657, int i, Interface6 interface6) {
		aClass459_229 = class459;
		aClass657_231 = class657;
		anInterface6_233 = interface6;
		anInt230 = Class623.method10322(aClass459_229, aClass657_231, 2014358275) * 1171015111;
		aClass205_232 = new Class205(i);
	}

	public Interface14 method79(int i) {
		Interface14 interface14;
		synchronized (aClass205_232) {
			interface14 = (Interface14) aClass205_232.method3787((long) i);
		}
		if (interface14 != null)
			return interface14;
		interface14 = method831(i, -1512120129);
		synchronized (aClass205_232) {
			aClass205_232.method3790(interface14, (long) i);
		}
		return interface14;
	}

	public Interface14 method80(int i) {
		Interface14 interface14;
		synchronized (aClass205_232) {
			interface14 = (Interface14) aClass205_232.method3787((long) i);
		}
		if (interface14 != null)
			return interface14;
		interface14 = method831(i, -1199354564);
		synchronized (aClass205_232) {
			aClass205_232.method3790(interface14, (long) i);
		}
		return interface14;
	}

	public void method832(int i, byte i_2_) {
		synchronized (aClass205_232) {
			aClass205_232.method3792(i, (byte) 13);
		}
	}

	public Iterator iterator() {
		return new Class59(this);
	}

	public void method833(int i) {
		synchronized (aClass205_232) {
			aClass205_232.method3793((byte) 54);
			aClass205_232 = new Class205(i);
		}
	}

	public void method834() {
		synchronized (aClass205_232) {
			aClass205_232.method3820(198754419);
		}
	}

	public Interface14 method76(int i) {
		Interface14 interface14;
		synchronized (aClass205_232) {
			interface14 = (Interface14) aClass205_232.method3787((long) i);
		}
		if (interface14 != null)
			return interface14;
		interface14 = method831(i, -121897738);
		synchronized (aClass205_232) {
			aClass205_232.method3790(interface14, (long) i);
		}
		return interface14;
	}

	public void method835() {
		synchronized (aClass205_232) {
			aClass205_232.method3793((byte) 116);
		}
	}

	public Interface14 method78(int i) {
		Interface14 interface14;
		synchronized (aClass205_232) {
			interface14 = (Interface14) aClass205_232.method3787((long) i);
		}
		if (interface14 != null)
			return interface14;
		interface14 = method831(i, 465245438);
		synchronized (aClass205_232) {
			aClass205_232.method3790(interface14, (long) i);
		}
		return interface14;
	}

	public int method7() {
		return -1588728841 * anInt230;
	}

	public int method46() {
		return -1588728841 * anInt230;
	}

	public int method77(int i) {
		return -1588728841 * anInt230;
	}

	public void method836(int i) {
		synchronized (aClass205_232) {
			aClass205_232.method3793((byte) 121);
		}
	}

	public void method837() {
		synchronized (aClass205_232) {
			aClass205_232.method3793((byte) 97);
		}
	}

	public void method838(int i, int i_3_) {
		synchronized (aClass205_232) {
			aClass205_232.method3793((byte) 4);
			aClass205_232 = new Class205(i);
		}
	}

	Interface14 method839(int i) {
		byte[] is;
		synchronized (aClass459_229) {
			is = Class554.method9213(aClass459_229, aClass657_231, i, 314554192);
		}
		Interface14 interface14 = anInterface6_233.method58(i, this, 82623705);
		if (null != is)
			interface14.method82(new RSByteBuffer(is), 1929771550);
		interface14.method86(-1928239010);
		return interface14;
	}

	public void method840() {
		synchronized (aClass205_232) {
			aClass205_232.method3820(162864408);
		}
	}

	public Iterator method841() {
		return new Class59(this);
	}

	Interface14 method842(int i) {
		byte[] is;
		synchronized (aClass459_229) {
			is = Class554.method9213(aClass459_229, aClass657_231, i, 314554192);
		}
		Interface14 interface14 = anInterface6_233.method58(i, this, 82623705);
		if (null != is)
			interface14.method82(new RSByteBuffer(is), 2127113083);
		interface14.method86(-1928239010);
		return interface14;
	}

	Interface14 method843(int i) {
		byte[] is;
		synchronized (aClass459_229) {
			is = Class554.method9213(aClass459_229, aClass657_231, i, 314554192);
		}
		Interface14 interface14 = anInterface6_233.method58(i, this, 82623705);
		if (null != is)
			interface14.method82(new RSByteBuffer(is), 1666587394);
		interface14.method86(-1928239010);
		return interface14;
	}

	Interface14 method844(int i) {
		byte[] is;
		synchronized (aClass459_229) {
			is = Class554.method9213(aClass459_229, aClass657_231, i, 314554192);
		}
		Interface14 interface14 = anInterface6_233.method58(i, this, 82623705);
		if (null != is)
			interface14.method82(new RSByteBuffer(is), 942506629);
		interface14.method86(-1928239010);
		return interface14;
	}

	public void method845(int i) {
		synchronized (aClass205_232) {
			aClass205_232.method3820(1418299793);
		}
	}

	public void method846() {
		synchronized (aClass205_232) {
			aClass205_232.method3793((byte) 10);
		}
	}

	public void method847(int i) {
		synchronized (aClass205_232) {
			aClass205_232.method3793((byte) 107);
			aClass205_232 = new Class205(i);
		}
	}

	static int method848(int i, int i_4_, int i_5_) {
		int i_6_ = i >> 31 & i_4_ - 1;
		return i_6_ + ((i >>> 31) + i) % i_4_;
	}
}

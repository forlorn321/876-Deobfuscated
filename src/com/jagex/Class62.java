/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Class62 implements Interface13 {
	Interface6 anInterface6_727;
	Class657 aClass657_728;
	protected int anInt729;
	Class459 aClass459_730;
	Interface14 anInterface14_731;
	Interface14[] anInterface14Array732;

	void method1396(int i) {
		if (anInterface14Array732[i] == null) {
			try {
				anInterface14Array732[i] = anInterface6_727.method58(i, this, 82623705);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class554.method9213(aClass459_730, aClass657_728, i, 314554192);
			if (null != is)
				anInterface14Array732[i].method82(new RSByteBuffer(is), 1599385082);
			anInterface14Array732[i].method86(-1928239010);
		}
	}

	public Interface14 method81(int i, int i_0_) {
		if (i < 0) {
			if (anInterface14_731 == null)
				anInterface14_731 = anInterface6_727.method58(-1, this, 82623705);
			return anInterface14_731;
		}
		if (anInterface14Array732[i] == null)
			method1397(i, (byte) 52);
		return anInterface14Array732[i];
	}

	void method1397(int i, byte i_1_) {
		if (anInterface14Array732[i] == null) {
			try {
				anInterface14Array732[i] = anInterface6_727.method58(i, this, 82623705);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class554.method9213(aClass459_730, aClass657_728, i, 314554192);
			if (null != is)
				anInterface14Array732[i].method82(new RSByteBuffer(is), 2005821005);
			anInterface14Array732[i].method86(-1928239010);
		}
	}

	public Interface14 method76(int i) {
		if (i < 0) {
			if (anInterface14_731 == null)
				anInterface14_731 = anInterface6_727.method58(-1, this, 82623705);
			return anInterface14_731;
		}
		if (anInterface14Array732[i] == null)
			method1397(i, (byte) 79);
		return anInterface14Array732[i];
	}

	public Iterator iterator() {
		return new Class27(this);
	}

	public Interface14 method80(int i) {
		if (i < 0) {
			if (anInterface14_731 == null)
				anInterface14_731 = anInterface6_727.method58(-1, this, 82623705);
			return anInterface14_731;
		}
		if (anInterface14Array732[i] == null)
			method1397(i, (byte) 34);
		return anInterface14Array732[i];
	}

	public int method7() {
		return anInterface14Array732.length;
	}

	public Interface14 method79(int i) {
		if (i < 0) {
			if (anInterface14_731 == null)
				anInterface14_731 = anInterface6_727.method58(-1, this, 82623705);
			return anInterface14_731;
		}
		if (anInterface14Array732[i] == null)
			method1397(i, (byte) 68);
		return anInterface14Array732[i];
	}

	public Interface14 method78(int i) {
		if (i < 0) {
			if (anInterface14_731 == null)
				anInterface14_731 = anInterface6_727.method58(-1, this, 82623705);
			return anInterface14_731;
		}
		if (anInterface14Array732[i] == null)
			method1397(i, (byte) 17);
		return anInterface14Array732[i];
	}

	public int method77(int i) {
		return anInterface14Array732.length;
	}

	Class62(Class678 class678, Class671 class671, Class657 class657, Class459 class459, Interface6 interface6, boolean bool) {
		anInterface6_727 = interface6;
		aClass657_728 = class657;
		aClass459_730 = class459;
		anInt729 = Class623.method10322(aClass459_730, aClass657_728, 2014358275) * 2092428159;
		anInterface14Array732 = ((Interface14[]) Array.newInstance(anInterface6_727.method53((byte) 63), anInt729 * -1866214273));
		if (bool) {
			for (int i = 0; i < -1866214273 * anInt729; i++)
				method1397(i, (byte) 22);
		}
	}

	public Iterator method1398() {
		return new Class27(this);
	}

	void method1399(int i) {
		if (anInterface14Array732[i] == null) {
			try {
				anInterface14Array732[i] = anInterface6_727.method58(i, this, 82623705);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class554.method9213(aClass459_730, aClass657_728, i, 314554192);
			if (null != is)
				anInterface14Array732[i].method82(new RSByteBuffer(is), 1838810657);
			anInterface14Array732[i].method86(-1928239010);
		}
	}

	public int method46() {
		return anInterface14Array732.length;
	}

	void method1400(int i) {
		if (anInterface14Array732[i] == null) {
			try {
				anInterface14Array732[i] = anInterface6_727.method58(i, this, 82623705);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class554.method9213(aClass459_730, aClass657_728, i, 314554192);
			if (null != is)
				anInterface14Array732[i].method82(new RSByteBuffer(is), 1533482955);
			anInterface14Array732[i].method86(-1928239010);
		}
	}

	static final void method1401(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int i) {
		Class695 class695 = class640_sub1_sub2_sub1.aClass695_11914;
		if (client.anInt11019 == class640_sub1_sub2_sub1.anInt11930 * 488451139 || !class695.method14162(-568762252) || class695.method14182(1, 1745182837)) {
			int i_2_ = (class640_sub1_sub2_sub1.anInt11930 * 488451139 - -1359861193 * class640_sub1_sub2_sub1.anInt11923);
			int i_3_ = (client.anInt11019 - -1359861193 * class640_sub1_sub2_sub1.anInt11923);
			int i_4_ = (class640_sub1_sub2_sub1.anInt11916 * -1597707776 + class640_sub1_sub2_sub1.method18564(-1721171369) * 256);
			int i_5_ = (523276800 * class640_sub1_sub2_sub1.anInt11886 + class640_sub1_sub2_sub1.method18564(-1570757865) * 256);
			int i_6_ = (class640_sub1_sub2_sub1.anInt11895 * 318958080 + class640_sub1_sub2_sub1.method18564(-1246797483) * 256);
			int i_7_ = (184800768 * class640_sub1_sub2_sub1.anInt11909 + class640_sub1_sub2_sub1.method18564(-1707779632) * 256);
			int i_8_ = ((i_2_ - i_3_) * i_4_ + i_3_ * i_6_) / i_2_;
			int i_9_ = (i_5_ * (i_2_ - i_3_) + i_3_ * i_7_) / i_2_;
			int i_10_ = Class590.method9853(i_8_, i_9_, (-1862679399 * class640_sub1_sub2_sub1.anInt11920), (byte) 5);
			int i_11_ = Class590.method9853(i_6_, i_7_, (class640_sub1_sub2_sub1.anInt11900 * 1478453329), (byte) 5);
			int i_12_ = (i_11_ * i_3_ + (i_2_ - i_3_) * i_10_) / i_2_;
			class640_sub1_sub2_sub1.method10619((float) i_8_, (float) i_12_, (float) i_9_);
		}
		class640_sub1_sub2_sub1.anInt11946 = 0;
		class640_sub1_sub2_sub1.method18528((class640_sub1_sub2_sub1.anInt11924 * 1306109367), false, -1829138449);
	}
}

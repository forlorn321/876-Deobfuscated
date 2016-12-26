/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class21 implements Interface3 {
	Interface54 anInterface54_216;
	Map aMap217;

	public Object method26(int i) {
		if (aMap217 != null) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return class430.anObject4819;
		}
		return anInterface54_216.method357(i, -1272565784);
	}

	public int method32(int i, int i_0_) {
		if (aMap217 != null) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return ((Integer) class430.anObject4819).intValue();
		}
		return ((Integer) anInterface54_216.method357(i, -1272565784)).intValue();
	}

	public void method30(int i, long l) {
		if (aMap217 == null) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
			else
				class430.anObject4819 = Long.valueOf(l);
		}
	}

	public long method23(int i, byte i_1_) {
		if (null != aMap217) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return ((Long) class430.anObject4819).longValue();
		}
		return ((Long) anInterface54_216.method357(i, -1272565784)).longValue();
	}

	public void method16(int i, long l) {
		if (aMap217 == null) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
			else
				class430.anObject4819 = Long.valueOf(l);
		}
	}

	public Object method17(int i, int i_2_) {
		if (aMap217 != null) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return class430.anObject4819;
		}
		return anInterface54_216.method357(i, -1272565784);
	}

	public void method31(int i, long l) {
		if (aMap217 == null) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
			else
				class430.anObject4819 = Long.valueOf(l);
		}
	}

	public void method14(int i, int i_3_, int i_4_) {
		if (null == aMap217) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_3_)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_3_)));
			else
				class430.anObject4819 = Integer.valueOf(i_3_);
		}
	}

	public void method20(int i, byte i_5_) {
		if (aMap217 != null)
			aMap217.remove(Integer.valueOf(i));
	}

	public Iterator iterator() {
		if (null == aMap217)
			return Collections.emptyList().iterator();
		return aMap217.values().iterator();
	}

	public Iterator method704() {
		if (null == aMap217)
			return Collections.emptyList().iterator();
		return aMap217.values().iterator();
	}

	public void method29(int i) {
		if (aMap217 != null)
			aMap217.clear();
	}

	public Iterator method705() {
		if (null == aMap217)
			return Collections.emptyList().iterator();
		return aMap217.values().iterator();
	}

	public int method37(int i) {
		if (aMap217 != null) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return ((Integer) class430.anObject4819).intValue();
		}
		return ((Integer) anInterface54_216.method357(i, -1272565784)).intValue();
	}

	public int method22(int i) {
		if (aMap217 != null) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return ((Integer) class430.anObject4819).intValue();
		}
		return ((Integer) anInterface54_216.method357(i, -1272565784)).intValue();
	}

	public void method36(int i, int i_6_) {
		if (null == aMap217) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_6_)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_6_)));
			else
				class430.anObject4819 = Integer.valueOf(i_6_);
		}
	}

	public void method24(int i, int i_7_) {
		if (null == aMap217) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_7_)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_7_)));
			else
				class430.anObject4819 = Integer.valueOf(i_7_);
		}
	}

	public void method25(int i, int i_8_) {
		if (null == aMap217) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_8_)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Integer.valueOf(i_8_)));
			else
				class430.anObject4819 = Integer.valueOf(i_8_);
		}
	}

	public Iterator method706() {
		if (null == aMap217)
			return Collections.emptyList().iterator();
		return aMap217.values().iterator();
	}

	public long method27(int i) {
		if (null != aMap217) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return ((Long) class430.anObject4819).longValue();
		}
		return ((Long) anInterface54_216.method357(i, -1272565784)).longValue();
	}

	public void method34(int i, Object object) {
		if (null == aMap217) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, object));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, object));
			else
				class430.anObject4819 = object;
		}
	}

	public void method13() {
		if (aMap217 != null)
			aMap217.clear();
	}

	public long method28(int i) {
		if (null != aMap217) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return ((Long) class430.anObject4819).longValue();
		}
		return ((Long) anInterface54_216.method357(i, -1272565784)).longValue();
	}

	public void method19(int i) {
		if (aMap217 != null)
			aMap217.remove(Integer.valueOf(i));
	}

	public void method35(int i, long l) {
		if (aMap217 == null) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, Long.valueOf(l)));
			else
				class430.anObject4819 = Long.valueOf(l);
		}
	}

	public Object method33(int i) {
		if (aMap217 != null) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return class430.anObject4819;
		}
		return anInterface54_216.method357(i, -1272565784);
	}

	public void method18(int i, Object object, byte i_9_) {
		if (null == aMap217) {
			aMap217 = new HashMap();
			aMap217.put(Integer.valueOf(i), new Class430(i, object));
		} else {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (null == class430)
				aMap217.put(Integer.valueOf(i), new Class430(i, object));
			else
				class430.anObject4819 = object;
		}
	}

	public void method21() {
		if (aMap217 != null)
			aMap217.clear();
	}

	public Class21(Interface54 interface54) {
		anInterface54_216 = interface54;
	}

	public long method15(int i) {
		if (null != aMap217) {
			Class430 class430 = (Class430) aMap217.get(Integer.valueOf(i));
			if (class430 != null)
				return ((Long) class430.anObject4819).longValue();
		}
		return ((Long) anInterface54_216.method357(i, -1272565784)).longValue();
	}

	public static void method707(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, String string, int i_15_) {
		Class521_Sub4 class521_sub4 = new Class521_Sub4();
		class521_sub4.anInt10329 = 1895573857 * i;
		class521_sub4.anInt10324 = -257581599 * i_10_;
		class521_sub4.anInt10325 = 1881085819 * i_11_;
		class521_sub4.anInt10326 = 1525221925 * (client.cycles + i_13_);
		class521_sub4.anInt10328 = 1153762965 * i_12_;
		class521_sub4.aString10327 = string;
		class521_sub4.anInt10323 = -1952557535 * i_14_;
		client.aClass695_11176.method8217(class521_sub4, 1269816026);
	}

	public static void method708(byte i) {
		for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass708_10363.method8308(1867269829)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass708_10363.method8311(1952088580)) {
			if (class536_sub3.aBool10385)
				class536_sub3.method9392(-1138527358);
		}
		for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass708_10386.method8308(1867269829)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass708_10386.method8311(1847812978)) {
			if (class536_sub3.aBool10385)
				class536_sub3.method9392(-1425794871);
		}
	}

	static final void method709(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class254.method3538(class251, class668, -42084589);
	}

	static Class183_Sub1_Sub2 method710(Class167_Sub1 class167_sub1, Canvas canvas, int i, int i_16_, int i_17_) {
		Class183_Sub1_Sub2_Sub1 class183_sub1_sub2_sub1 = new Class183_Sub1_Sub2_Sub1(class167_sub1, canvas, i, i_16_);
		return class183_sub1_sub2_sub1;
	}

	public static void method711(int i) {
		Class575.aClass143_7676 = null;
	}

	static final void method712(InterfaceDefinitions class251, Class234 class234, Class668 class668, byte i) {
		class251.aBool2642 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		Class668.method8011(class251, 263642117);
	}
}

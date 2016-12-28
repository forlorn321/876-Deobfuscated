/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class223 {
	List aList2327;
	static final int anInt2328 = 8;
	static Integer anInteger2329 = Integer.valueOf(-1);
	List aList2330;
	static final int anInt2331 = 40;
	public int anInt2332;
	List aList2333;
	List aList2334;
	static int anInt2335;
	public static Frame aFrame2336;
	public static int anInt2337;
	public static Class2 aClass2_2338;

	public int method3153(byte i) {
		return aList2333.size();
	}

	public int method3154(byte i) {
		return aList2330.size();
	}

	public int method3155(int i, int i_0_, int i_1_) {
		if (aList2330.size() == 40)
			throw new RuntimeException("");
		if (method3188(i, 1876472842) != -1)
			throw new RuntimeException("");
		if (i_0_ == -1)
			i_0_ = aList2330.size();
		method3168(i, i_0_, -1572511688);
		for (int i_2_ = 1 + i_0_; i_2_ < aList2330.size(); i_2_++) {
			Integer integer = (Integer) aList2327.get(i_2_);
			if (!integer.equals(anInteger2329) && integer.intValue() < i_2_)
				method3166(i_2_, i_2_ - 1, (byte) -48);
		}
		return method3188(i, 369799734);
	}

	public int method3156(int i, short i_3_) {
		return aList2333.indexOf(Integer.valueOf(i));
	}

	public int method3157(int i, byte i_4_) {
		return ((Integer) aList2333.get(i)).intValue();
	}

	public int method3158(int i, int i_5_) {
		return method3162(i, -1, -1951475212);
	}

	public void method3159(int i, boolean bool, int i_6_) {
		aList2327.set(i, bool ? Integer.valueOf(i) : anInteger2329);
	}

	void method3160(int i) {
		aList2330.remove(i);
		aList2327.remove(i);
		aList2334.remove(i);
	}

	public boolean method3161(int i, int i_7_) {
		return !((Integer) aList2327.get(i)).equals(anInteger2329);
	}

	public int method3162(int i, int i_8_, int i_9_) {
		if (aList2333.size() == 8)
			throw new RuntimeException("");
		if (method3156(i, (short) -109) != -1)
			throw new RuntimeException("");
		if (i_8_ == -1)
			i_8_ = aList2333.size();
		aList2333.add(i_8_, Integer.valueOf(i));
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_8_, null);
		}
		return i_8_;
	}

	public void method3163(int i, int i_10_) {
		aList2333.remove(i);
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public int method3164(int i) {
		return ((Integer) aList2330.get(i)).intValue();
	}

	public void method3165(int i, int i_11_, byte i_12_) {
		method3166(i, i_11_, (byte) -9);
		for (int i_13_ = 0; i_13_ < aList2327.size(); i_13_++) {
			Integer integer = (Integer) aList2327.get(i_13_);
			if (!integer.equals(anInteger2329)) {
				Integer integer_14_ = Integer.valueOf(i_13_);
				if (!integer.equals(integer_14_))
					aList2327.set(i_13_, integer_14_);
			}
		}
	}

	void method3166(int i, int i_15_, byte i_16_) {
		aList2330.add(i_15_, aList2330.remove(i));
		aList2327.add(i_15_, aList2327.remove(i));
		aList2334.add(i_15_, aList2334.remove(i));
	}

	public void method3167(int i, int i_17_) {
		aList2327.set(i, Integer.valueOf(i_17_));
	}

	void method3168(int i, int i_18_, int i_19_) {
		aList2330.add(i_18_, Integer.valueOf(i));
		aList2327.add(i_18_, anInteger2329);
		ArrayList arraylist = new ArrayList();
		for (int i_20_ = 0; i_20_ < aList2333.size(); i_20_++)
			arraylist.add(null);
		aList2334.add(i_18_, arraylist);
	}

	void method3169(int i, byte i_21_) {
		aList2330.remove(i);
		aList2327.remove(i);
		aList2334.remove(i);
	}

	public void method3170(int i, int i_22_) {
		aList2327.set(i, Integer.valueOf(i_22_));
	}

	public void method3171(int i, int i_23_, int i_24_) {
		aList2333.add(i_23_, aList2333.remove(i));
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_23_, list.remove(i));
		}
	}

	public Object method3172(int i, int i_25_, int i_26_) {
		return ((List) aList2334.get(i)).get(i_25_);
	}

	public void method3173(int i, int i_27_, Object object, int i_28_) {
		((List) aList2334.get(i)).set(i_27_, object);
	}

	public int method3174(int i) {
		return aList2333.indexOf(Integer.valueOf(i));
	}

	public int method3175() {
		return aList2333.size();
	}

	public int method3176() {
		return aList2330.size();
	}

	public int method3177() {
		return aList2330.size();
	}

	public void method3178(int i) {
		aList2333.remove(i);
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public int method3179(int i) {
		return aList2330.indexOf(Integer.valueOf(i));
	}

	public int method3180(int i) {
		return ((Integer) aList2330.get(i)).intValue();
	}

	public int method3181(int i, byte i_29_) {
		return ((Integer) aList2330.get(i)).intValue();
	}

	public void method3182(int i) {
		method3169(i, (byte) 104);
		int i_30_ = i;
		for (int i_31_ = i; i_31_ < aList2330.size(); i_31_++) {
			if (!method3161(i_31_, -1383821522)) {
				if (i_30_ != i_31_)
					method3166(i_31_, i_30_, (byte) -103);
				i_30_ = i_31_ + 1;
			}
		}
	}

	public int method3183(int i) {
		return aList2333.indexOf(Integer.valueOf(i));
	}

	public int method3184(int i) {
		return ((Integer) aList2333.get(i)).intValue();
	}

	public int method3185(int i) {
		return ((Integer) aList2333.get(i)).intValue();
	}

	public void method3186(int i) {
		aList2333.remove(i);
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public int method3187(int i) {
		return method3162(i, -1, -1260350677);
	}

	public int method3188(int i, int i_32_) {
		return aList2330.indexOf(Integer.valueOf(i));
	}

	void method3189(int i, int i_33_) {
		aList2330.add(i_33_, Integer.valueOf(i));
		aList2327.add(i_33_, anInteger2329);
		ArrayList arraylist = new ArrayList();
		for (int i_34_ = 0; i_34_ < aList2333.size(); i_34_++)
			arraylist.add(null);
		aList2334.add(i_33_, arraylist);
	}

	public int method3190(int i) {
		return aList2330.indexOf(Integer.valueOf(i));
	}

	public void method3191(int i, int i_35_, byte i_36_) {
		aList2327.set(i, Integer.valueOf(i_35_));
	}

	public int method3192(int i) {
		return aList2333.indexOf(Integer.valueOf(i));
	}

	public void method3193(int i, int i_37_) {
		aList2327.set(i, Integer.valueOf(i_37_));
	}

	public int method3194(int i) {
		return method3155(i, -1, 1543591398);
	}

	public int method3195(int i, byte i_38_) {
		return method3155(i, -1, 1565700396);
	}

	public void method3196(int i, int i_39_) {
		method3169(i, (byte) 105);
		int i_40_ = i;
		for (int i_41_ = i; i_41_ < aList2330.size(); i_41_++) {
			if (!method3161(i_41_, -986984629)) {
				if (i_40_ != i_41_)
					method3166(i_41_, i_40_, (byte) -15);
				i_40_ = i_41_ + 1;
			}
		}
	}

	void method3197(int i, int i_42_) {
		aList2330.add(i_42_, Integer.valueOf(i));
		aList2327.add(i_42_, anInteger2329);
		ArrayList arraylist = new ArrayList();
		for (int i_43_ = 0; i_43_ < aList2333.size(); i_43_++)
			arraylist.add(null);
		aList2334.add(i_42_, arraylist);
	}

	public Class223(int i) {
		anInt2332 = i * -418810933;
		aList2333 = new ArrayList();
		aList2330 = new ArrayList();
		aList2327 = new ArrayList();
		aList2334 = new ArrayList();
	}

	void method3198(int i) {
		aList2330.remove(i);
		aList2327.remove(i);
		aList2334.remove(i);
	}

	public int method3199(int i) {
		return ((Integer) aList2333.get(i)).intValue();
	}

	void method3200(int i, int i_44_) {
		aList2330.add(i_44_, Integer.valueOf(i));
		aList2327.add(i_44_, anInteger2329);
		ArrayList arraylist = new ArrayList();
		for (int i_45_ = 0; i_45_ < aList2333.size(); i_45_++)
			arraylist.add(null);
		aList2334.add(i_44_, arraylist);
	}

	static final void method3201(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_46_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_47_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass231_11088.method3301(i_46_, (byte) 21).method3156(i_47_, (short) 3231);
	}

	public static void method3202(Class234 class234, IComponentDefinitions class251, int i) {
		IComponentDefinitions class251_48_ = Class648.method7834(class234, class251, -16777216);
		int i_49_;
		int i_50_;
		if (null == class251_48_) {
			i_49_ = -1804846931 * Class144.anInt1679;
			i_50_ = 589116499 * Class34_Sub6.anInt10965;
		} else {
			i_49_ = class251_48_.anInt2573 * -1606950689;
			i_50_ = 223822141 * class251_48_.anInt2574;
		}
		Class26.method743(class251, i_49_, i_50_, false, 904154438);
		Class173_Sub1.method8636(class251, i_49_, i_50_, (short) 255);
	}

	static final void method3203(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		int i_51_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class161.method1968(i_51_, class251, class668, -1817163795);
	}
}

/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class222 {
	long aLong2313;
	static final int anInt2314 = 2;
	Class21 aClass21_2315;
	Class618[] aClass618Array2316;
	int anInt2317;
	boolean aBool2318;
	String aString2319;
	static final int anInt2320 = 1;
	Class21 aClass21_2321;
	boolean aBool2322;
	Class246 aClass246_2323;
	int anInt2324;
	int anInt2325;
	public static int anInt2326;

	public String method3113(byte i) {
		return aString2319;
	}

	public int method3114(int i) {
		return anInt2325 * 1683624263;
	}

	public int method3115(int i) {
		return -1314502923 * anInt2317;
	}

	void method3116(int i, byte i_0_) {
		anInt2317 = i * -963005091;
	}

	public int method3117() {
		return -1314502923 * anInt2317;
	}

	void method3118(boolean bool, short i) {
		aBool2322 = bool;
	}

	public boolean method3119() {
		return aBool2322;
	}

	public int method3120(int i) {
		return -5927069 * anInt2324;
	}

	void method3121(int i, int i_1_) {
		anInt2325 = i * 596265079;
	}

	void method3122(int i, int i_2_) {
		anInt2324 = i * -1738511797;
	}

	long method3123(int i) {
		return aLong2313 * -145220690410044227L;
	}

	public boolean method3124(int i) {
		return aBool2318;
	}

	public Class618 method3125(int i, int i_3_) {
		return aClass618Array2316[i];
	}

	void method3126(Class222 class222_4_, int i) {
		for (int i_5_ = 0; i_5_ < aClass618Array2316.length; i_5_++) {
			aClass618Array2316[i_5_].method7380(class222_4_.aClass618Array2316[i_5_].method7371(-521908001), (byte) 32);
			aClass618Array2316[i_5_].method7376(aClass618Array2316[i_5_].method7374((byte) -93), -1939418593);
		}
		aClass21_2321.method29(-1429777179);
		Iterator iterator = class222_4_.aClass21_2321.iterator();
		while (iterator.hasNext()) {
			Class430 class430 = (Class430) iterator.next();
			aClass21_2321.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) -89);
		}
		aBool2318 = class222_4_.aBool2318;
	}

	void method3127(int i) {
		anInt2324 = i * -1738511797;
	}

	public Class21 method3128(int i) {
		return aClass21_2315;
	}

	void method3129(boolean bool) {
		aBool2322 = bool;
	}

	public int method3130() {
		return -1314502923 * anInt2317;
	}

	void method3131(int i) {
		anInt2325 = i * 596265079;
	}

	void method3132(int i) {
		anInt2325 = i * 596265079;
	}

	void method3133(int i) {
		anInt2325 = i * 596265079;
	}

	void method3134(int i) {
		anInt2325 = i * 596265079;
	}

	public int method3135() {
		return -1314502923 * anInt2317;
	}

	public int method3136() {
		return anInt2325 * 1683624263;
	}

	public boolean method3137(byte i) {
		return aBool2322;
	}

	void method3138(int i) {
		anInt2317 = i * -963005091;
	}

	public boolean method3139() {
		return aBool2322;
	}

	Class222(RSByteBuffer class536_sub33, boolean bool, boolean bool_6_, Interface28 interface28) {
		if (bool)
			aLong2313 = class536_sub33.readLong(702869087) * 589872936712312469L;
		else
			aLong2313 = -589872936712312469L;
		if (bool_6_)
			aString2319 = class536_sub33.method9713(16509697);
		int i = class536_sub33.readUnsignedByte();
		aBool2318 = (i & 0x1) != 0;
		aBool2322 = 0 != (i & 0x2);
		aClass618Array2316 = new Class618[interface28.method159(1739425037).method7173(-1912091677)];
		int i_7_ = class536_sub33.readUnsignedByte();
		if (i_7_ > aClass618Array2316.length)
			throw new IllegalStateException("");
		for (int i_8_ = 0; i_8_ < aClass618Array2316.length; i_8_++) {
			Class618 class618 = (aClass618Array2316[i_8_] = new Class618(interface28.method159(1445042368).method7174(i_8_, (byte) -40), true));
			if (i_8_ < i_7_)
				class618.method7380(class536_sub33.readInt(), (byte) 58);
			else
				class618.method7380(0, (byte) 64);
			class618.method7376(class618.method7374((byte) -18), 155186799);
		}
		int i_9_ = class536_sub33.readUnsignedShort();
		aClass21_2321 = new Class21(interface28.method162(-1062537651));
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			Class430 class430 = interface28.method162(-1062537651).method8388(class536_sub33, 1503111938);
			aClass21_2321.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) 34);
		}
		anInt2317 = class536_sub33.readUnsignedShort() * -963005091;
		if (65535 == -1314502923 * anInt2317)
			anInt2317 = 963005091;
		anInt2325 = class536_sub33.readUnsignedByte() * 596265079;
		aClass246_2323 = ((Class246) Class682.method8091(Class246.method3415(-2121886593), class536_sub33.readUnsignedByte(), 1858049507));
		anInt2324 = class536_sub33.readUnsignedByte() * -1738511797;
	}

	void method3140(int i) {
		anInt2324 = i * -1738511797;
	}

	public boolean method3141() {
		return aBool2322;
	}

	void method3142(Class246 class246, int i) {
		aClass246_2323 = class246;
	}

	public void method3143(Interface28 interface28, int i) {
		if (null == aClass21_2315)
			aClass21_2315 = new Class21(interface28.method162(-1062537651));
		else
			aClass21_2315.method29(-237084576);
	}

	public int method3144() {
		return -5927069 * anInt2324;
	}

	public int method3145() {
		return -5927069 * anInt2324;
	}

	public int method3146() {
		return -5927069 * anInt2324;
	}

	public Class246 method3147(byte i) {
		return aClass246_2323;
	}

	void method3148(int i) {
		anInt2324 = i * -1738511797;
	}

	public boolean method3149() {
		return aBool2322;
	}

	public boolean method3150() {
		return aBool2318;
	}

	public boolean method3151() {
		return aBool2318;
	}

	public boolean method3152() {
		return aBool2318;
	}
}

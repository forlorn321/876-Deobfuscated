/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class226 {
	boolean aBool2341;
	int anInt2342 = 533758861;
	static final int anInt2343 = 2;
	static final int anInt2344 = 4;
	static final int anInt2345 = 1;
	long aLong2346;
	static final int anInt2347 = 1;
	boolean aBool2348;
	long aLong2349;
	Class21 aClass21_2350;
	ArrayList anArrayList2351;
	ArrayList anArrayList2352;
	boolean aBool2353;
	int anInt2354;
	String aString2355;
	int anInt2356;
	static Iterator anIterator2357;

	public int method3219() {
		return 1849788603 * anInt2342;
	}

	public List method3220(byte i) {
		return Collections.unmodifiableList(anArrayList2352);
	}

	void method3221(int i) {
		anInt2356 += -1006532289;
	}

	public boolean method3222(int i) {
		return aBool2348;
	}

	public int method3223(int i) {
		return 864838875 * anInt2354;
	}

	public long method3224(byte i) {
		return aLong2346 * 2970015013002653439L;
	}

	void method3225(short i) {
		int i_0_ = -1;
		int i_1_ = -1;
		for (int i_2_ = 0; i_2_ < anArrayList2351.size(); i_2_++) {
			Class222 class222 = (Class222) anArrayList2351.get(i_2_);
			int i_3_ = class222.method3114(1804398018);
			if (i_3_ > i_0_) {
				i_0_ = i_3_;
				i_1_ = i_2_;
			}
		}
		anInt2342 = -533758861 * i_1_;
	}

	void method3226(int i) {
		anArrayList2352.remove(i);
	}

	public Class222 method3227(int i, int i_4_) {
		if (i == -1)
			return null;
		return (Class222) anArrayList2351.get(i);
	}

	public Interface19 method3228(int i) {
		return new Class147(Class458.aClass458_5174, aClass21_2350);
	}

	void method3229(Class222 class222, byte i) {
		anArrayList2351.add(class222);
		method3225((short) 8566);
	}

	public long method3230() {
		return aLong2346 * 2970015013002653439L;
	}

	void method3231(Class224 class224, byte i) {
		anArrayList2352.add(class224);
	}

	void method3232(int i, int i_5_) {
		anArrayList2352.remove(i);
	}

	void method3233(int i, int i_6_, int i_7_) {
		((Class222) anArrayList2351.get(i)).method3121(i_6_, 587263224);
		method3225((short) 25167);
	}

	void method3234(int i, int i_8_, byte i_9_) {
		Class222 class222 = (Class222) anArrayList2351.get(i);
		class222.method3116(i_8_, (byte) 51);
		class222.method3118(true, (short) -6966);
	}

	void method3235(int i, int i_10_) {
		Class222 class222 = (Class222) anArrayList2351.get(i);
		class222.method3118(false, (short) 5063);
	}

	void method3236(int i, boolean bool, int i_11_) {
		Class222 class222 = (Class222) anArrayList2351.get(i);
		class222.method3142((bool ? Class246.aClass246_2467 : Class246.aClass246_2470), -2112207683);
	}

	public int method3237() {
		return (int) (7724426318237330575L * aLong2349);
	}

	void method3238(int i) {
		Iterator iterator = anArrayList2351.iterator();
		while (iterator.hasNext()) {
			Class222 class222 = (Class222) iterator.next();
			class222.method3142(Class246.aClass246_2468, -2130022509);
		}
	}

	void method3239(int i) {
		Iterator iterator = anArrayList2351.iterator();
		while (iterator.hasNext()) {
			Class222 class222 = (Class222) iterator.next();
			class222.method3142(Class246.aClass246_2469, -2135841703);
		}
	}

	void method3240(int i, Class222 class222, int i_12_) {
		Class222 class222_13_ = (Class222) anArrayList2351.get(i);
		class222_13_.method3126(class222, -1233614344);
	}

	public int method3241(int i) {
		return 1849788603 * anInt2342;
	}

	int method3242() {
		return anInt2356 * -1888164161;
	}

	int method3243() {
		return anInt2356 * -1888164161;
	}

	void method3244() {
		anInt2356 += -1006532289;
	}

	public Class246 method3245(int i) {
		if (anArrayList2351.isEmpty())
			return Class246.aClass246_2470;
		Class246 class246 = ((Class222) anArrayList2351.get(0)).method3147((byte) 2);
		switch (1114448291 * class246.anInt2472) {
		case 2:
		case 3:
			return class246;
		default: {
			Iterator iterator = anArrayList2351.iterator();
			while (iterator.hasNext()) {
				Class222 class222 = (Class222) iterator.next();
				if (class222.method3147((byte) 2) == Class246.aClass246_2470)
					return Class246.aClass246_2470;
			}
			return Class246.aClass246_2467;
		}
		}
	}

	void method3246() {
		anInt2356 += -1006532289;
	}

	public int method3247() {
		return (int) (7724426318237330575L * aLong2349);
	}

	void method3248() {
		anInt2356 += -1006532289;
	}

	public int method3249() {
		return 864838875 * anInt2354;
	}

	void method3250() {
		anInt2356 += -1006532289;
	}

	public Class226(long l, RSByteBuffer class536_sub33, boolean bool, Interface28 interface28) {
		aLong2349 = -4896674547777097105L * l;
		int i = class536_sub33.readUnsignedByte();
		if (i == 1) {
			int i_14_ = class536_sub33.readUnsignedByte();
			aBool2348 = (i_14_ & 0x1) != 0;
			aBool2353 = 0 != (i_14_ & 0x2);
			aBool2341 = 0 != (i_14_ & 0x4);
			anInt2356 = class536_sub33.readInt() * -1006532289;
			aLong2346 = class536_sub33.method9711(702869087) * 5009906337283657983L;
			aString2355 = class536_sub33.readString();
			anInt2354 = class536_sub33.readShort((byte) -125) * 1044707155;
			class536_sub33.readInt();
			class536_sub33.method9711(702869087);
			int i_15_ = class536_sub33.readUnsignedShort();
			anArrayList2351 = new ArrayList(i_15_);
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				anArrayList2351.add(new Class222(class536_sub33, aBool2353, aBool2341, interface28));
			int i_17_ = class536_sub33.readUnsignedShort();
			anArrayList2352 = new ArrayList(i_17_);
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
				anArrayList2352.add(new Class224(class536_sub33, aBool2353, aBool2341));
			aClass21_2350 = new Class21(interface28.method165((byte) 71));
			int i_19_ = class536_sub33.readUnsignedShort();
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
				Class430 class430 = interface28.method165((byte) -46).method8388(class536_sub33, 1451305599);
				aClass21_2350.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) 72);
			}
			if (!bool) {
				class536_sub33.readUnsignedShort();
				class536_sub33.readUnsignedShort();
				class536_sub33.readUnsignedShort();
				class536_sub33.readUnsignedShort();
				class536_sub33.readUnsignedShort();
			}
			method3225((short) 24672);
		}
	}

	void method3251() {
		int i = -1;
		int i_21_ = -1;
		for (int i_22_ = 0; i_22_ < anArrayList2351.size(); i_22_++) {
			Class222 class222 = (Class222) anArrayList2351.get(i_22_);
			int i_23_ = class222.method3114(-1240877681);
			if (i_23_ > i) {
				i = i_23_;
				i_21_ = i_22_;
			}
		}
		anInt2342 = -533758861 * i_21_;
	}

	public int method3252() {
		return 1849788603 * anInt2342;
	}

	public boolean method3253() {
		return aBool2348;
	}

	public int method3254() {
		return 1849788603 * anInt2342;
	}

	public String method3255(int i) {
		return aString2355;
	}

	void method3256() {
		Iterator iterator = anArrayList2351.iterator();
		while (iterator.hasNext()) {
			Class222 class222 = (Class222) iterator.next();
			class222.method3142(Class246.aClass246_2469, -2101865704);
		}
	}

	int method3257(byte i) {
		return anInt2356 * -1888164161;
	}

	public String method3258() {
		return aString2355;
	}

	public int method3259() {
		return 1849788603 * anInt2342;
	}

	public List method3260(int i) {
		return Collections.unmodifiableList(anArrayList2351);
	}

	void method3261(int i) {
		anArrayList2351.remove(i);
		method3225((short) 28668);
	}

	void method3262(int i) {
		anArrayList2351.remove(i);
		method3225((short) 25887);
	}

	void method3263() {
		Iterator iterator = anArrayList2351.iterator();
		while (iterator.hasNext()) {
			Class222 class222 = (Class222) iterator.next();
			class222.method3142(Class246.aClass246_2468, -2138711742);
		}
	}

	void method3264(int i) {
		anArrayList2351.remove(i);
		method3225((short) 14212);
	}

	public int method3265() {
		return 1849788603 * anInt2342;
	}

	public int method3266() {
		return 864838875 * anInt2354;
	}

	void method3267(int i) {
		anArrayList2352.remove(i);
	}

	void method3268(int i, int i_24_) {
		((Class222) anArrayList2351.get(i)).method3121(i_24_, 467136223);
		method3225((short) 11794);
	}

	void method3269(int i, int i_25_) {
		Class222 class222 = (Class222) anArrayList2351.get(i);
		class222.method3116(i_25_, (byte) 99);
		class222.method3118(true, (short) 6173);
	}

	void method3270(int i, int i_26_, int i_27_) {
		((Class222) anArrayList2351.get(i)).method3122(i_26_, 1284457025);
	}

	void method3271(int i, int i_28_) {
		((Class222) anArrayList2351.get(i)).method3122(i_28_, -590423101);
	}

	void method3272() {
		Iterator iterator = anArrayList2351.iterator();
		while (iterator.hasNext()) {
			Class222 class222 = (Class222) iterator.next();
			class222.method3142(Class246.aClass246_2469, -2107244471);
		}
	}

	void method3273(int i, int i_29_) {
		anArrayList2351.remove(i);
		method3225((short) 12964);
	}

	public int hashCode() {
		return (int) (7724426318237330575L * aLong2349);
	}

	void method3274(int i, int i_30_) {
		((Class222) anArrayList2351.get(i)).method3122(i_30_, 1862497946);
	}

	void method3275(int i) {
		anArrayList2351.remove(i);
		method3225((short) 24410);
	}

	public static int method3276(String string, byte i) {
		return Class536_Sub42.aTwitchTV10811.SetStreamTitle(string, client.aClass670_11043.aString8574);
	}

	static final void method3277(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}

	static final void method3278(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2592 * -1307221069;
	}

	static final void method3279(Class668 class668, byte i) {
		Class613.aClass263_8014.method3659(-38402630);
	}

	static char method3280(char c, int i) {
		if (c == '\u00c6')
			return 'E';
		if (c == '\u00e6')
			return 'e';
		if ('\u00df' == c)
			return 's';
		if ('\u0152' == c)
			return 'E';
		if (c == '\u0153')
			return 'e';
		return '\0';
	}

	static final void method3281(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_31_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_32_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (client.aClass485ArrayArray11266[i_32_][i_31_].anInt5437 * 1503281369);
	}

	static final void method3282(Class668 class668, int i) {
		Class184_Sub1.method8644(class668.aClass649_Sub1_Sub1_Sub1_8556, class668, 2147483647);
	}

	public static void method3283(int i, int i_33_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(9, (long) i);
		class536_sub18_sub5.method10669(-1117980731);
	}
}

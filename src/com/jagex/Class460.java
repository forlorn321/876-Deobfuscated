/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class460 {
	Class700 aClass700_5181;
	byte aByte5182;
	public volatile int anInt5183;
	Class700 aClass700_5185 = new Class700();
	static final int anInt5186 = 500;
	Class700 aClass700_5187;
	static final int anInt5188 = 500;
	static final int anInt5189 = 5;
	Class700 aClass700_5190;
	int anInt5191;
	long aLong5192;
	RSByteBuffer aClass536_Sub33_5193;
	static final int anInt5194 = 5;
	public volatile int anInt5195;
	public volatile int anInt5196;
	public volatile int anInt5197;
	static final int anInt5198 = 4;
	RSByteBuffer aClass536_Sub33_5199;
	RSByteBuffer buffer;
	int anInt5201;
	Class536_Sub18_Sub15_Sub2 aClass536_Sub18_Sub15_Sub2_5202;
	public static JS5ResourceProvider aClass461_5203;

	public int method5521() {
		return (aClass700_5185.method8246((byte) 50) + aClass700_5181.method8246((byte) 71));
	}

	Class536_Sub18_Sub15_Sub2 method5522(int i, int i_0_, byte i_1_, boolean bool, int i_2_) {
		long l = ((long) i << 32) + (long) i_0_;
		Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = new Class536_Sub18_Sub15_Sub2();
		class536_sub18_sub15_sub2.aLong10507 = 2122374251850846107L * l;
		class536_sub18_sub15_sub2.aByte12115 = i_1_;
		class536_sub18_sub15_sub2.aBool11778 = bool;
		if (bool) {
			if (method5526(963482457) >= 500)
				throw new RuntimeException();
			aClass700_5185.method8239(class536_sub18_sub15_sub2, (byte) 41);
		} else {
			if (method5525(1111941988) >= 500)
				throw new RuntimeException();
			aClass700_5187.method8239(class536_sub18_sub15_sub2, (byte) -58);
		}
		return class536_sub18_sub15_sub2;
	}

	public boolean method5523(int i) {
		return method5525(333811439) >= 500;
	}

	public abstract boolean method5524();

	int method5525(int i) {
		return (aClass700_5187.method8246((byte) 71) + aClass700_5190.method8246((byte) 95));
	}

	public int method5526(int i) {
		return (aClass700_5185.method8246((byte) 46) + aClass700_5181.method8246((byte) 114));
	}

	abstract void method5527(int i, int i_3_, int i_4_);

	public boolean method5528(byte i) {
		return method5526(963482457) >= 500;
	}

	public abstract void method5529(Object object, boolean bool, byte i);

	public abstract void method5530(boolean bool, byte i);

	public abstract void method5531(int i);

	public abstract void method5532(int i);

	public abstract void method5533(byte i);

	public abstract void method5534();

	int method5535() {
		return (aClass700_5187.method8246((byte) 68) + aClass700_5190.method8246((byte) 56));
	}

	public boolean method5536() {
		return method5526(963482457) >= 500;
	}

	public abstract boolean method5537(byte i);

	public abstract void method5538();

	public int method5539() {
		return (aClass700_5185.method8246((byte) 85) + aClass700_5181.method8246((byte) 92));
	}

	public abstract boolean method5540();

	public abstract void method5541(Object object, boolean bool);

	public abstract void method5542(boolean bool);

	public abstract void method5543();

	public abstract void method5544();

	public abstract void method5545();

	public abstract void method5546();

	public abstract void method5547();

	abstract void method5548(int i, int i_5_);

	Class460() {
		aClass700_5181 = new Class700();
		aClass700_5187 = new Class700();
		aClass700_5190 = new Class700();
		aClass536_Sub33_5193 = new RSByteBuffer(6);
		aByte5182 = (byte) 0;
		anInt5195 = 0;
		anInt5196 = 0;
		anInt5197 = -1688272219;
		anInt5183 = -1278660259;
		aClass536_Sub33_5199 = new RSByteBuffer(5);
		buffer = new RSByteBuffer(5);
		anInt5201 = 0;
		aClass536_Sub18_Sub15_Sub2_5202 = null;
	}

	static final void method5549(Class668 class668, short i) {
		throw new RuntimeException("");
	}

	static final void method5550(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		Class536_Sub18_Sub12 class536_sub18_sub12 = Class649_Sub1_Sub4_Sub2.method10955(i_6_, (short) -6486);
		if (class536_sub18_sub12 != null) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub18_sub12.anInt11729 * -966390473;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class615.method7333((-8065906675708934543L * class536_sub18_sub12.aLong11731), (-1919173613 * Class459.CLIENT_PARAMS.languageId), 1009886607);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1331173969 * class536_sub18_sub12.anInt11733;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (class536_sub18_sub12.aString11727 != null ? class536_sub18_sub12.aString11727 : "");
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (class536_sub18_sub12.aString11732 != null ? class536_sub18_sub12.aString11732 : "");
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (null != class536_sub18_sub12.aString11736 ? class536_sub18_sub12.aString11736 : "");
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (null != class536_sub18_sub12.aString11734 ? class536_sub18_sub12.aString11734 : "");
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub18_sub12.anInt11735 * -1293336373;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (class536_sub18_sub12.aString11730 != null ? class536_sub18_sub12.aString11730 : "");
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (class536_sub18_sub12.aClass402_11737 != null ? class536_sub18_sub12.aClass402_11737.method78() : -1);
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		}
	}
}

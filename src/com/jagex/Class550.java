/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class550 {
	public static int anInt7412;

	public abstract void method6651(int i);

	public abstract boolean method6652(int i);

	public abstract boolean method6653(byte i);

	public abstract void method6654(byte i);

	public boolean method6655(short i) {
		return (method6652(1295479454) || method6653((byte) 0) || method6664((byte) 10));
	}

	public abstract int method6656(int i);

	public abstract int method6657(int i);

	public boolean method6658() {
		return (method6652(-100358687) || method6653((byte) 0) || method6664((byte) -20));
	}

	public abstract Class536_Sub31 method6659(byte i);

	public static void method6660(int i) {
		Class65.method1063(i, (byte) -47);
	}

	public static void method6661(int i) {
		Class65.method1063(i, (byte) -25);
	}

	public static void method6662(int i) {
		Class65.method1063(i, (byte) -95);
	}

	Class550() {
		/* empty */
	}

	public abstract void method6663();

	public abstract boolean method6664(byte i);

	public abstract boolean method6665();

	public abstract boolean method6666();

	public abstract void method6667();

	public abstract boolean method6668();

	public abstract boolean method6669();

	public abstract int method6670();

	public boolean method6671() {
		return (method6652(795395297) || method6653((byte) 0) || method6664((byte) -67));
	}

	public abstract boolean method6672();

	public abstract boolean method6673();

	public abstract int method6674();

	public boolean method6675() {
		return (method6652(1382914077) || method6653((byte) 0) || method6664((byte) 49));
	}

	public boolean method6676() {
		return (method6652(679083700) || method6653((byte) 0) || method6664((byte) 4));
	}

	public abstract Class536_Sub31 method6677();

	public abstract int method6678();

	public abstract int method6679();

	public abstract int method6680();

	static final void method6681(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		if (i_0_ == 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else if (i_1_ == 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2147483647;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) Math.pow((double) i_0_, 1.0 / (double) i_1_);
	}

	static final void method6682(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub13_10739), i_2_, (byte) 1);
		client.aClass515_11066.method6319(-1884574223);
		Class27.method763(1946671431);
		client.aBool11015 = false;
	}

	static final void method6683(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class190.method2824(-1913890239);
	}

	static final void method6684(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class141.method1715(class251, class234, class668, 602314662);
	}
}

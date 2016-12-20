/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class475 implements Interface76 {
	public static Class475 aClass475_5374 = new Class475(3, 0, java.lang.Integer.class, new Class474());
	public static Class475 aClass475_5375 = new Class475(1, 1, java.lang.Long.class, new Class481());
	public static Class475 aClass475_5376 = new Class475(2, 2, java.lang.String.class, new Class495());
	public int anInt5377;
	static Class475 aClass475_5378;
	static Class475 aClass475_5379 = new Class475(4, 3, com.jagex.Class527_Sub36.class, new Class487());
	int anInt5380;
	public Class aClass5381;
	Interface11 anInterface11_5382;
	static int anInt5383;

	public int method91() {
		return anInt5380 * -1823376441;
	}

	Class475(int i, int i_0_, Class var_class, Interface11 interface11) {
		anInt5377 = 692807343 * i;
		anInt5380 = -629942793 * i_0_;
		aClass5381 = var_class;
		anInterface11_5382 = interface11;
	}

	static Class475 method7757(Class var_class, int i) {
		Class475[] class475s = method7767((byte) -18);
		for (int i_1_ = 0; i_1_ < class475s.length; i_1_++) {
			Class475 class475 = class475s[i_1_];
			if (var_class == class475.aClass5381)
				return class475;
		}
		return null;
	}

	public static Interface11 method7758(Class var_class, int i) {
		Class475 class475 = method7757(var_class, 1793658459);
		if (class475 == null)
			throw new IllegalArgumentException();
		return class475.anInterface11_5382;
	}

	public int method87() {
		return anInt5380 * -1823376441;
	}

	public Object method7759(RSByteBuffer class527_sub38, int i) {
		return anInterface11_5382.method75(class527_sub38, (byte) -25);
	}

	public static Class475[] method7760() {
		return new Class475[] { aClass475_5376, aClass475_5375, aClass475_5374, aClass475_5379, aClass475_5378 };
	}

	public int method42() {
		return anInt5380 * -1823376441;
	}

	static Class475 method7761(Class var_class) {
		Class475[] class475s = method7767((byte) -91);
		for (int i = 0; i < class475s.length; i++) {
			Class475 class475 = class475s[i];
			if (var_class == class475.aClass5381)
				return class475;
		}
		return null;
	}

	public static Class475[] method7762() {
		return new Class475[] { aClass475_5376, aClass475_5375, aClass475_5374, aClass475_5379, aClass475_5378 };
	}

	public static Interface11 method7763(Class var_class) {
		Class475 class475 = method7757(var_class, 872545591);
		if (class475 == null)
			throw new IllegalArgumentException();
		return class475.anInterface11_5382;
	}

	public Object method7764(RSByteBuffer class527_sub38) {
		return anInterface11_5382.method75(class527_sub38, (byte) 19);
	}

	static {
		aClass475_5378 = new Class475(0, 4, com.jagex.Class255.class, new Class476());
	}

	public static Interface11 method7765(Class var_class) {
		Class475 class475 = method7757(var_class, -1331610382);
		if (class475 == null)
			throw new IllegalArgumentException();
		return class475.anInterface11_5382;
	}

	public static Interface11 method7766(Class var_class) {
		Class475 class475 = method7757(var_class, -1675792142);
		if (class475 == null)
			throw new IllegalArgumentException();
		return class475.anInterface11_5382;
	}

	public static Class475[] method7767(byte i) {
		return new Class475[] { aClass475_5376, aClass475_5375, aClass475_5374, aClass475_5379, aClass475_5378 };
	}

	public Object method7768(RSByteBuffer class527_sub38) {
		return anInterface11_5382.method75(class527_sub38, (byte) 6);
	}

	public Object method7769(RSByteBuffer class527_sub38) {
		return anInterface11_5382.method75(class527_sub38, (byte) -10);
	}

	static boolean method7770(int i) {
		return Class510.method8443(Class271.aClass624_3128.aClass586_8159, -826393053);
	}
}

/* Class676 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class676 implements Interface6 {
	Class205 aClass205_8592 = new Class205(60);
	int anInt8593;
	Class459 aClass459_8594;

	void method13861(int i) {
		anInt8593 = i * -1717355913;
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 106);
		}
	}

	void method13862(int i, int i_0_) {
		anInt8593 = i * -1717355913;
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 45);
		}
	}

	void method13863(byte i) {
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 5);
		}
	}

	Class676(Class459 class459) {
		aClass459_8594 = class459;
	}

	void method13864() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 27);
		}
	}

	void method13865() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 46);
		}
	}

	void method13866(int i) {
		anInt8593 = i * -1717355913;
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 115);
		}
	}

	void method13867(int i, byte i_1_) {
		synchronized (aClass205_8592) {
			aClass205_8592.method3792(i, (byte) 13);
		}
	}

	void method13868(int i) {
		synchronized (aClass205_8592) {
			aClass205_8592.method3820(364996401);
		}
	}

	void method13869() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 49);
		}
	}

	void method13870() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 20);
		}
	}

	void method13871() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3793((byte) 85);
		}
	}

	void method13872(int i) {
		synchronized (aClass205_8592) {
			aClass205_8592.method3792(i, (byte) 30);
		}
	}

	void method13873() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3820(582775920);
		}
	}

	void method13874() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3820(-881569132);
		}
	}

	void method13875() {
		synchronized (aClass205_8592) {
			aClass205_8592.method3820(311087526);
		}
	}

	public static byte method13876(char c, int i) {
		byte i_2_;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i_2_ = (byte) c;
		else if ('\u20ac' == c)
			i_2_ = (byte) -128;
		else if ('\u201a' == c)
			i_2_ = (byte) -126;
		else if ('\u0192' == c)
			i_2_ = (byte) -125;
		else if (c == '\u201e')
			i_2_ = (byte) -124;
		else if ('\u2026' == c)
			i_2_ = (byte) -123;
		else if ('\u2020' == c)
			i_2_ = (byte) -122;
		else if ('\u2021' == c)
			i_2_ = (byte) -121;
		else if (c == '\u02c6')
			i_2_ = (byte) -120;
		else if ('\u2030' == c)
			i_2_ = (byte) -119;
		else if (c == '\u0160')
			i_2_ = (byte) -118;
		else if ('\u2039' == c)
			i_2_ = (byte) -117;
		else if (c == '\u0152')
			i_2_ = (byte) -116;
		else if (c == '\u017d')
			i_2_ = (byte) -114;
		else if (c == '\u2018')
			i_2_ = (byte) -111;
		else if (c == '\u2019')
			i_2_ = (byte) -110;
		else if (c == '\u201c')
			i_2_ = (byte) -109;
		else if (c == '\u201d')
			i_2_ = (byte) -108;
		else if (c == '\u2022')
			i_2_ = (byte) -107;
		else if (c == '\u2013')
			i_2_ = (byte) -106;
		else if ('\u2014' == c)
			i_2_ = (byte) -105;
		else if ('\u02dc' == c)
			i_2_ = (byte) -104;
		else if ('\u2122' == c)
			i_2_ = (byte) -103;
		else if ('\u0161' == c)
			i_2_ = (byte) -102;
		else if (c == '\u203a')
			i_2_ = (byte) -101;
		else if (c == '\u0153')
			i_2_ = (byte) -100;
		else if ('\u017e' == c)
			i_2_ = (byte) -98;
		else if (c == '\u0178')
			i_2_ = (byte) -97;
		else
			i_2_ = (byte) 63;
		return i_2_;
	}

	static final void method13877(Class665 class665, int i) {
		Class393.method6490(Class527_Sub29.method16288(1191603662), -1730735518);
	}

	static final void method13878(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		float f = Class428.method6863(class665.anIntArray8525[1769813785 * class665.anInt8526 + 1]);
		Class527_Sub8_Sub15 class527_sub8_sub15 = Class208_Sub10.aClass296_Sub1_9923.method5476(i_3_, (byte) -109);
		if (null == class527_sub8_sub15)
			throw new RuntimeException("");
		if (!(class527_sub8_sub15 instanceof Class527_Sub8_Sub15_Sub2))
			throw new RuntimeException("");
		((Class527_Sub8_Sub15_Sub2) class527_sub8_sub15).method18719(f, 1864628101);
	}
}

/* Class608 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class608 {
	Class7 aClass7_7903;
	Class199 aClass199_7904 = new Class199(500);
	int anInt7905;
	Class199 aClass199_7906;
	Class199 aClass199_7907 = new Class199(30);
	String[] aStringArray7908;
	Class180[] aClass180Array7909;
	boolean aBool7910;

	void method7234() {
		synchronized (aClass199_7904) {
			aClass199_7904.method2892(-1562406165);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2892(312058796);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2892(1390633708);
		}
	}

	void method7235(boolean bool, byte i) {
		if (bool != aBool7910) {
			aBool7910 = bool;
			method7248((byte) 10);
		}
	}

	void method7236(int i, short i_0_) {
		anInt7905 = -1500779357 * i;
		synchronized (aClass199_7904) {
			aClass199_7904.method2884((byte) -106);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2884((byte) -52);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2884((byte) -60);
		}
	}

	void method7237() {
		synchronized (aClass199_7904) {
			aClass199_7904.method2892(1770498633);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2892(-1612801708);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2892(-1956930669);
		}
	}

	void method7238(int i, int i_1_) {
		synchronized (aClass199_7904) {
			aClass199_7904.method2883(i, -1680630950);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2883(i, -2053566346);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2883(i, -1994318614);
		}
	}

	void method7239(int i) {
		synchronized (aClass199_7904) {
			aClass199_7904.method2892(1258738667);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2892(-209877659);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2892(335285115);
		}
	}

	abstract boolean method7240(int i);

	abstract boolean method7241(int i, byte i_2_);

	abstract byte[] method7242(int i);

	abstract boolean method7243(int i);

	void method7244(int i) {
		anInt7905 = -1500779357 * i;
		synchronized (aClass199_7904) {
			aClass199_7904.method2884((byte) -14);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2884((byte) -25);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2884((byte) -62);
		}
	}

	abstract boolean method7245(int i);

	abstract boolean method7246(int i);

	void method7247(boolean bool) {
		if (bool != aBool7910) {
			aBool7910 = bool;
			method7248((byte) 85);
		}
	}

	void method7248(byte i) {
		synchronized (aClass199_7904) {
			aClass199_7904.method2884((byte) -95);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2884((byte) -97);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2884((byte) -43);
		}
		aClass180Array7909 = new Class180[4];
		aClass7_7903 = new Class7(null, null);
	}

	void method7249(int i) {
		anInt7905 = -1500779357 * i;
		synchronized (aClass199_7904) {
			aClass199_7904.method2884((byte) -5);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2884((byte) -20);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2884((byte) -76);
		}
	}

	void method7250(int i) {
		anInt7905 = -1500779357 * i;
		synchronized (aClass199_7904) {
			aClass199_7904.method2884((byte) -76);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2884((byte) -56);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2884((byte) -44);
		}
	}

	void method7251(boolean bool) {
		if (bool != aBool7910) {
			aBool7910 = bool;
			method7248((byte) 112);
		}
	}

	void method7252() {
		synchronized (aClass199_7904) {
			aClass199_7904.method2884((byte) -16);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2884((byte) -128);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2884((byte) -93);
		}
		aClass180Array7909 = new Class180[4];
		aClass7_7903 = new Class7(null, null);
	}

	void method7253() {
		synchronized (aClass199_7904) {
			aClass199_7904.method2884((byte) -104);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2884((byte) -60);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2884((byte) -100);
		}
		aClass180Array7909 = new Class180[4];
		aClass7_7903 = new Class7(null, null);
	}

	void method7254(int i) {
		synchronized (aClass199_7904) {
			aClass199_7904.method2883(i, -1056543666);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2883(i, -1315108607);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2883(i, -2017902948);
		}
	}

	abstract byte[] method7255(int i, int i_3_);

	Class608(boolean bool, Language class664, GameMode class670) {
		aClass199_7906 = new Class199(50);
		aClass180Array7909 = new Class180[4];
		aClass7_7903 = new Class7(null, null);
		aBool7910 = bool;
		if (GameMode.aClass670_8568 == class670)
			aStringArray7908 = new String[] { null, null, null, null, null, Class38.aClass38_459.method840(class664, 1799123243) };
		else
			aStringArray7908 = new String[] { null, null, null, null, null, null };
	}

	void method7256() {
		synchronized (aClass199_7904) {
			aClass199_7904.method2892(-457590259);
		}
		synchronized (aClass199_7907) {
			aClass199_7907.method2892(-1266109294);
		}
		synchronized (aClass199_7906) {
			aClass199_7906.method2892(-1078391857);
		}
	}

	static final void method7257(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		if (class668.anIntArray8541[class668.anInt8542 * 1867269829] < class668.anIntArray8541[1 + class668.anInt8542 * 1867269829])
			class668.anInt8564 += (class668.anIntArray8537[-1640738851 * class668.anInt8564] * -1531084683);
	}

	static final void method7258(Class668 class668, byte i) {
		class668.anInt8546 -= -709931686;
		if (class668.aLongArray8565[1 + 1346022693 * class668.anInt8546] != class668.aLongArray8565[class668.anInt8546 * 1346022693])
			class668.anInt8564 += -1531084683 * (class668.anIntArray8537[-1640738851 * class668.anInt8564]);
	}

	static final void method7259(Class668 class668, byte i) {
		class668.anInt8542 -= 61855783;
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_5_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_6_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (i_5_ == -1)
			throw new RuntimeException();
		Class39 class39 = (Class39) Class676.aClass34_Sub6_8589.method70(i_5_, (byte) 42);
		if (class39.aClass453_482.method78() != i_4_)
			throw new RuntimeException();
		if (class39.aClass453_483.method78() != Class453.aClass453_5084.method78())
			throw new RuntimeException();
		int[] is = class39.method854(string, -838885146);
		if (i_6_ < 0 || null == is || is.length <= i_6_)
			throw new RuntimeException();
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = is[i_6_];
	}

	public static boolean method7260(char c, int i) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}

	public static void method7261(byte i) {
		synchronized (Class49.aClass199_580) {
			Class49.aClass199_580.method2884((byte) -104);
		}
	}
}

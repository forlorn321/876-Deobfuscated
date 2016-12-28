/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class259 {
	Class4 aClass4_2836;
	Class536_Sub8[] aClass536_Sub8Array2837;
	Interface29 anInterface29_2838;

	public Class536_Sub8 method3597(int i, int i_0_) {
		if (i >= aClass536_Sub8Array2837.length)
			return null;
		return aClass536_Sub8Array2837[i];
	}

	void method3598(int i) {
		Class536_Sub8 class536_sub8 = method3597(i, -1684549445);
		if (null != class536_sub8) {
			class536_sub8.method6484();
			aClass536_Sub8Array2837[class536_sub8.anInt10430 * 913244505] = null;
		}
	}

	void method3599(int i, byte i_1_) {
		Class536_Sub8 class536_sub8 = method3597(i, -1572204280);
		if (null != class536_sub8) {
			class536_sub8.method6484();
			aClass536_Sub8Array2837[class536_sub8.anInt10430 * 913244505] = null;
		}
	}

	public void method3600(int i, String string, Class536_Sub8 class536_sub8, int i_2_) {
		Class536_Sub8 class536_sub8_3_ = method3601(string, (byte) 80);
		if (class536_sub8_3_ != null && i != 913244505 * class536_sub8_3_.anInt10430)
			throw new IllegalArgumentException(string);
		method3599(i, (byte) 4);
		if (i >= aClass536_Sub8Array2837.length) {
			int i_4_;
			for (i_4_ = aClass536_Sub8Array2837.length; i >= i_4_; i_4_ += i_4_) {
				/* empty */
			}
			aClass4_2836 = new Class4(i_4_);
			for (int i_5_ = 0; i_5_ < aClass536_Sub8Array2837.length; i_5_++) {
				Class536_Sub8 class536_sub8_6_ = aClass536_Sub8Array2837[i_5_];
				if (class536_sub8_6_ != null)
					aClass4_2836.method560(class536_sub8_6_, (-6909195213925454795L * class536_sub8_6_.aLong7133));
			}
			Class536_Sub8[] class536_sub8s = new Class536_Sub8[i_4_];
			for (int i_7_ = 0; i_7_ < aClass536_Sub8Array2837.length; i_7_++)
				class536_sub8s[i_7_] = aClass536_Sub8Array2837[i_7_];
			aClass536_Sub8Array2837 = class536_sub8s;
		}
		class536_sub8.anInt10430 = -1555613975 * i;
		class536_sub8.aString10431 = string;
		aClass4_2836.method560(class536_sub8, anInterface29_2838.method168(string, 1663655882));
		aClass536_Sub8Array2837[i] = class536_sub8;
	}

	public Class536_Sub8 method3601(String string, byte i) {
		long l = anInterface29_2838.method168(string, -1676727534);
		for (Class536_Sub8 class536_sub8 = (Class536_Sub8) aClass4_2836.method556(l); null != class536_sub8; class536_sub8 = (Class536_Sub8) aClass4_2836.method557(-1329268610)) {
			if (class536_sub8.aString10431.equals(string))
				return class536_sub8;
		}
		return null;
	}

	void method3602(int i) {
		Class536_Sub8 class536_sub8 = method3597(i, -303292947);
		if (null != class536_sub8) {
			class536_sub8.method6484();
			aClass536_Sub8Array2837[class536_sub8.anInt10430 * 913244505] = null;
		}
	}

	public Class259(int i, Interface29 interface29) {
		int i_8_;
		for (i_8_ = 1; i_8_ < i; i_8_ += i_8_) {
			/* empty */
		}
		aClass4_2836 = new Class4(i_8_);
		aClass536_Sub8Array2837 = new Class536_Sub8[i_8_];
		anInterface29_2838 = interface29;
	}

	void method3603(int i) {
		Class536_Sub8 class536_sub8 = method3597(i, -1676833455);
		if (null != class536_sub8) {
			class536_sub8.method6484();
			aClass536_Sub8Array2837[class536_sub8.anInt10430 * 913244505] = null;
		}
	}

	void method3604(int i) {
		Class536_Sub8 class536_sub8 = method3597(i, -951332834);
		if (null != class536_sub8) {
			class536_sub8.method6484();
			aClass536_Sub8Array2837[class536_sub8.anInt10430 * 913244505] = null;
		}
	}

	void method3605(int i) {
		Class536_Sub8 class536_sub8 = method3597(i, -1207001437);
		if (null != class536_sub8) {
			class536_sub8.method6484();
			aClass536_Sub8Array2837[class536_sub8.anInt10430 * 913244505] = null;
		}
	}

	static final void method3606(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4444, client.aClass106_11322.aClass15_1258, 1924475776);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(string.length() + 1);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		client.aClass106_11322.method1409(class536_sub23, 1947612535);
	}

	static final void method3607(Class668 class668, int i) {
		Class536_Sub30 class536_sub30 = ((Class536_Sub30) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub30.anInt10564 * 737759727;
	}

	public static Class2 method3608(Class461 class461, int i, int i_9_, byte i_10_) {
		return Class651.method7862(class461, i, i_9_, null, 858069722);
	}

	static final void method3609(Class668 class668, int i) {
		if (Class331_Sub2.aClass549_10049.method6638(82, (byte) 0))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}

/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public final class Class4 implements Iterable {
	int anInt101;
	static Class690 aClass690_102;
	long aLong103;
	Class536 aClass536_104;
	Class536[] aClass536Array105;
	int anInt106 = 0;
	Class536 aClass536_107;

	public int method555() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < -1392230473 * anInt101; i_0_++) {
			Class536 class536 = aClass536Array105[i_0_];
			for (Class536 class536_1_ = class536.aClass536_7132; class536 != class536_1_; class536_1_ = class536_1_.aClass536_7132)
				i++;
		}
		return i;
	}

	public Class536 method556(long l) {
		aLong103 = l * 9086502454015332227L;
		Class536 class536 = (aClass536Array105[(int) (l & (long) (-1392230473 * anInt101 - 1))]);
		for (aClass536_104 = class536.aClass536_7132; class536 != aClass536_104; aClass536_104 = aClass536_104.aClass536_7132) {
			if (l == aClass536_104.aLong7133 * -6909195213925454795L) {
				Class536 class536_2_ = aClass536_104;
				aClass536_104 = aClass536_104.aClass536_7132;
				return class536_2_;
			}
		}
		aClass536_104 = null;
		return null;
	}

	public Class536 method557(int i) {
		if (null == aClass536_104)
			return null;
		for (Class536 class536 = aClass536Array105[(int) (aLong103 * 7710096169019012907L & (long) (-1392230473 * anInt101 - 1))]; class536 != aClass536_104; aClass536_104 = aClass536_104.aClass536_7132) {
			if (aLong103 * 7710096169019012907L == -6909195213925454795L * aClass536_104.aLong7133) {
				Class536 class536_3_ = aClass536_104;
				aClass536_104 = aClass536_104.aClass536_7132;
				return class536_3_;
			}
		}
		aClass536_104 = null;
		return null;
	}

	public int method558(Class536[] class536s, int i) {
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < -1392230473 * anInt101; i_5_++) {
			Class536 class536 = aClass536Array105[i_5_];
			for (Class536 class536_6_ = class536.aClass536_7132; class536_6_ != class536; class536_6_ = class536_6_.aClass536_7132)
				class536s[i_4_++] = class536_6_;
		}
		return i_4_;
	}

	public Class536 method559() {
		if (null == aClass536_104)
			return null;
		for (Class536 class536 = aClass536Array105[(int) (aLong103 * 7710096169019012907L & (long) (-1392230473 * anInt101 - 1))]; class536 != aClass536_104; aClass536_104 = aClass536_104.aClass536_7132) {
			if (aLong103 * 7710096169019012907L == -6909195213925454795L * aClass536_104.aLong7133) {
				Class536 class536_7_ = aClass536_104;
				aClass536_104 = aClass536_104.aClass536_7132;
				return class536_7_;
			}
		}
		aClass536_104 = null;
		return null;
	}

	public void method560(Class536 class536, long l) {
		if (null != class536.aClass536_7134)
			class536.method6484();
		Class536 class536_8_ = (aClass536Array105[(int) (l & (long) (anInt101 * -1392230473 - 1))]);
		class536.aClass536_7134 = class536_8_.aClass536_7134;
		class536.aClass536_7132 = class536_8_;
		class536.aClass536_7134.aClass536_7132 = class536;
		class536.aClass536_7132.aClass536_7134 = class536;
		class536.aLong7133 = l * -6756113042487376355L;
	}

	public void method561(int i) {
		for (int i_9_ = 0; i_9_ < anInt101 * -1392230473; i_9_++) {
			Class536 class536 = aClass536Array105[i_9_];
			for (;;) {
				Class536 class536_10_ = class536.aClass536_7132;
				if (class536_10_ == class536)
					break;
				class536_10_.method6484();
			}
		}
		aClass536_104 = null;
		aClass536_107 = null;
	}

	public Class536 method562(int i) {
		anInt106 = 0;
		return method567(1073129183);
	}

	public Iterator method563() {
		return new Class3(this);
	}

	public Iterator iterator() {
		return new Class3(this);
	}

	public Iterator method564() {
		return new Class3(this);
	}

	public Iterator method565() {
		return new Class3(this);
	}

	public int method566() {
		int i = 0;
		for (int i_11_ = 0; i_11_ < -1392230473 * anInt101; i_11_++) {
			Class536 class536 = aClass536Array105[i_11_];
			for (Class536 class536_12_ = class536.aClass536_7132; class536 != class536_12_; class536_12_ = class536_12_.aClass536_7132)
				i++;
		}
		return i;
	}

	public Class536 method567(int i) {
		if (anInt106 * -437903737 > 0 && aClass536_107 != aClass536Array105[-437903737 * anInt106 - 1]) {
			Class536 class536 = aClass536_107;
			aClass536_107 = class536.aClass536_7132;
			return class536;
		}
		while (-437903737 * anInt106 < -1392230473 * anInt101) {
			Class536 class536 = (aClass536Array105[(anInt106 += -601340105) * -437903737 - 1].aClass536_7132);
			if (aClass536Array105[anInt106 * -437903737 - 1] != class536) {
				aClass536_107 = class536.aClass536_7132;
				return class536;
			}
		}
		return null;
	}

	public Class4(int i) {
		anInt101 = i * 1229704711;
		aClass536Array105 = new Class536[i];
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			Class536 class536 = aClass536Array105[i_13_] = new Class536();
			class536.aClass536_7132 = class536;
			class536.aClass536_7134 = class536;
		}
	}

	public int method568() {
		int i = 0;
		for (int i_14_ = 0; i_14_ < -1392230473 * anInt101; i_14_++) {
			Class536 class536 = aClass536Array105[i_14_];
			for (Class536 class536_15_ = class536.aClass536_7132; class536 != class536_15_; class536_15_ = class536_15_.aClass536_7132)
				i++;
		}
		return i;
	}

	public int method569(int i) {
		int i_16_ = 0;
		for (int i_17_ = 0; i_17_ < -1392230473 * anInt101; i_17_++) {
			Class536 class536 = aClass536Array105[i_17_];
			for (Class536 class536_18_ = class536.aClass536_7132; class536 != class536_18_; class536_18_ = class536_18_.aClass536_7132)
				i_16_++;
		}
		return i_16_;
	}

	public void method570() {
		for (int i = 0; i < anInt101 * -1392230473; i++) {
			Class536 class536 = aClass536Array105[i];
			for (;;) {
				Class536 class536_19_ = class536.aClass536_7132;
				if (class536_19_ == class536)
					break;
				class536_19_.method6484();
			}
		}
		aClass536_104 = null;
		aClass536_107 = null;
	}

	static final void method571(Class668 class668, int i) {
		client.aClass251_10992 = null;
		client.aClass251_11199 = null;
	}

	static final void method572(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.modelType = -1782707337;
		class251.modelId = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * 1639447419;
		Class668.method8011(class251, 263642117);
		if (-1 == -809980533 * class251.anInt2546 && !class234.aBool2379)
			Class34_Sub7.method10328(-1591767037 * class251.anInt2559, (short) -268);
	}

	static final void method573(Class668 class668, int i) {
		int i_20_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class198.method2875(i_20_, (byte) -7);
	}
}

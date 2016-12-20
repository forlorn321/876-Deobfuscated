/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class2 {
	static final int anInt22 = 8;
	static final int anInt23 = 256;
	static final int anInt24 = 1020;
	int anInt25;
	int[] anIntArray26;
	int[] anIntArray27 = new int[256];
	int anInt28;
	int anInt29;
	int anInt30;

	final void method516(int i) {
		int i_0_ = -1640531527;
		int i_1_ = -1640531527;
		int i_2_ = -1640531527;
		int i_3_ = -1640531527;
		int i_4_ = -1640531527;
		int i_5_ = -1640531527;
		int i_6_ = -1640531527;
		int i_7_ = -1640531527;
		for (int i_8_ = 0; i_8_ < 4; i_8_++) {
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
		}
		for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
			i_7_ += anIntArray26[i_9_];
			i_6_ += anIntArray26[i_9_ + 1];
			i_5_ += anIntArray26[i_9_ + 2];
			i_4_ += anIntArray26[3 + i_9_];
			i_3_ += anIntArray26[i_9_ + 4];
			i_2_ += anIntArray26[i_9_ + 5];
			i_1_ += anIntArray26[6 + i_9_];
			i_0_ += anIntArray26[i_9_ + 7];
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
			anIntArray27[i_9_] = i_7_;
			anIntArray27[1 + i_9_] = i_6_;
			anIntArray27[2 + i_9_] = i_5_;
			anIntArray27[3 + i_9_] = i_4_;
			anIntArray27[i_9_ + 4] = i_3_;
			anIntArray27[5 + i_9_] = i_2_;
			anIntArray27[i_9_ + 6] = i_1_;
			anIntArray27[i_9_ + 7] = i_0_;
		}
		for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
			i_7_ += anIntArray27[i_10_];
			i_6_ += anIntArray27[i_10_ + 1];
			i_5_ += anIntArray27[i_10_ + 2];
			i_4_ += anIntArray27[i_10_ + 3];
			i_3_ += anIntArray27[4 + i_10_];
			i_2_ += anIntArray27[5 + i_10_];
			i_1_ += anIntArray27[i_10_ + 6];
			i_0_ += anIntArray27[i_10_ + 7];
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
			anIntArray27[i_10_] = i_7_;
			anIntArray27[1 + i_10_] = i_6_;
			anIntArray27[2 + i_10_] = i_5_;
			anIntArray27[3 + i_10_] = i_4_;
			anIntArray27[i_10_ + 4] = i_3_;
			anIntArray27[i_10_ + 5] = i_2_;
			anIntArray27[i_10_ + 6] = i_1_;
			anIntArray27[7 + i_10_] = i_0_;
		}
		method518(-1033050019);
		anInt29 = -1828096;
	}

	public Class2(int[] is) {
		anIntArray26 = new int[256];
		for (int i = 0; i < is.length; i++)
			anIntArray26[i] = is[i];
		method516(292222170);
	}

	public final int method517(short i) {
		if (0 == 1915966995 * anInt29) {
			method518(833172980);
			anInt29 = -1828096;
		}
		return anIntArray26[(anInt29 -= 1711268891) * 1915966995];
	}

	final void method518(int i) {
		anInt28 += (anInt30 += -98238811) * 123127461;
		for (int i_11_ = 0; i_11_ < 256; i_11_++) {
			int i_12_ = anIntArray27[i_11_];
			if ((i_11_ & 0x2) == 0) {
				if (0 == (i_11_ & 0x1))
					anInt25 = (anInt25 * 1838583209 ^ 1838583209 * anInt25 << 13) * 880043673;
				else
					anInt25 = 880043673 * (1838583209 * anInt25 ^ anInt25 * 1838583209 >>> 6);
			} else if (0 == (i_11_ & 0x1))
				anInt25 = ((anInt25 * 1838583209 ^ anInt25 * 1838583209 << 2) * 880043673);
			else
				anInt25 = 880043673 * (1838583209 * anInt25 ^ anInt25 * 1838583209 >>> 16);
			anInt25 += 880043673 * anIntArray27[i_11_ + 128 & 0xff];
			int i_13_;
			anIntArray27[i_11_] = i_13_ = (anIntArray27[(i_12_ & 0x3fc) >> 2] + anInt25 * 1838583209 + anInt28 * -1091458583);
			anIntArray26[i_11_] = ((anInt28 = -449200551 * (i_12_ + anIntArray27[(i_13_ >> 8 & 0x3fc) >> 2])) * -1091458583);
		}
	}

	public final int method519() {
		if (0 == 1915966995 * anInt29) {
			method518(1547116096);
			anInt29 = -1828096;
		}
		return anIntArray26[(anInt29 -= 1711268891) * 1915966995];
	}

	public final int method520() {
		if (0 == 1915966995 * anInt29) {
			method518(1027388653);
			anInt29 = -1828096;
		}
		return anIntArray26[(anInt29 -= 1711268891) * 1915966995];
	}

	public final int method521() {
		if (0 == 1915966995 * anInt29) {
			method518(-1836251341);
			anInt29 = -1828096;
		}
		return anIntArray26[(anInt29 -= 1711268891) * 1915966995];
	}

	public final int method522() {
		if (0 == 1915966995 * anInt29) {
			method518(1673073930);
			anInt29 = -1828096;
		}
		return anIntArray26[(anInt29 -= 1711268891) * 1915966995];
	}

	public final int method523() {
		if (0 == 1915966995 * anInt29) {
			method518(1847257745);
			anInt29 = -1828096;
		}
		return anIntArray26[anInt29 * 1915966995 - 1];
	}

	public final int method524() {
		if (0 == 1915966995 * anInt29) {
			method518(420888947);
			anInt29 = -1828096;
		}
		return anIntArray26[anInt29 * 1915966995 - 1];
	}

	public final int method525(int i) {
		if (0 == 1915966995 * anInt29) {
			method518(-1983975828);
			anInt29 = -1828096;
		}
		return anIntArray26[anInt29 * 1915966995 - 1];
	}

	final void method526() {
		anInt28 += (anInt30 += -98238811) * 123127461;
		for (int i = 0; i < 256; i++) {
			int i_14_ = anIntArray27[i];
			if ((i & 0x2) == 0) {
				if (0 == (i & 0x1))
					anInt25 = (anInt25 * 1838583209 ^ 1838583209 * anInt25 << 13) * 880043673;
				else
					anInt25 = 880043673 * (1838583209 * anInt25 ^ anInt25 * 1838583209 >>> 6);
			} else if (0 == (i & 0x1))
				anInt25 = ((anInt25 * 1838583209 ^ anInt25 * 1838583209 << 2) * 880043673);
			else
				anInt25 = 880043673 * (1838583209 * anInt25 ^ anInt25 * 1838583209 >>> 16);
			anInt25 += 880043673 * anIntArray27[i + 128 & 0xff];
			int i_15_;
			anIntArray27[i] = i_15_ = (anIntArray27[(i_14_ & 0x3fc) >> 2] + anInt25 * 1838583209 + anInt28 * -1091458583);
			anIntArray26[i] = ((anInt28 = -449200551 * (i_14_ + anIntArray27[(i_15_ >> 8 & 0x3fc) >> 2])) * -1091458583);
		}
	}

	final void method527() {
		anInt28 += (anInt30 += -98238811) * 123127461;
		for (int i = 0; i < 256; i++) {
			int i_16_ = anIntArray27[i];
			if ((i & 0x2) == 0) {
				if (0 == (i & 0x1))
					anInt25 = (anInt25 * 1838583209 ^ 1838583209 * anInt25 << 13) * 880043673;
				else
					anInt25 = 880043673 * (1838583209 * anInt25 ^ anInt25 * 1838583209 >>> 6);
			} else if (0 == (i & 0x1))
				anInt25 = ((anInt25 * 1838583209 ^ anInt25 * 1838583209 << 2) * 880043673);
			else
				anInt25 = 880043673 * (1838583209 * anInt25 ^ anInt25 * 1838583209 >>> 16);
			anInt25 += 880043673 * anIntArray27[i + 128 & 0xff];
			int i_17_;
			anIntArray27[i] = i_17_ = (anIntArray27[(i_16_ & 0x3fc) >> 2] + anInt25 * 1838583209 + anInt28 * -1091458583);
			anIntArray26[i] = ((anInt28 = -449200551 * (i_16_ + anIntArray27[(i_17_ >> 8 & 0x3fc) >> 2])) * -1091458583);
		}
	}

	final void method528() {
		int i = -1640531527;
		int i_18_ = -1640531527;
		int i_19_ = -1640531527;
		int i_20_ = -1640531527;
		int i_21_ = -1640531527;
		int i_22_ = -1640531527;
		int i_23_ = -1640531527;
		int i_24_ = -1640531527;
		for (int i_25_ = 0; i_25_ < 4; i_25_++) {
			i_24_ ^= i_23_ << 11;
			i_21_ += i_24_;
			i_23_ += i_22_;
			i_23_ ^= i_22_ >>> 2;
			i_20_ += i_23_;
			i_22_ += i_21_;
			i_22_ ^= i_21_ << 8;
			i_19_ += i_22_;
			i_21_ += i_20_;
			i_21_ ^= i_20_ >>> 16;
			i_18_ += i_21_;
			i_20_ += i_19_;
			i_20_ ^= i_19_ << 10;
			i += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 4;
			i_24_ += i_19_;
			i_18_ += i;
			i_18_ ^= i << 8;
			i_23_ += i_18_;
			i += i_24_;
			i ^= i_24_ >>> 9;
			i_22_ += i;
			i_24_ += i_23_;
		}
		for (int i_26_ = 0; i_26_ < 256; i_26_ += 8) {
			i_24_ += anIntArray26[i_26_];
			i_23_ += anIntArray26[i_26_ + 1];
			i_22_ += anIntArray26[i_26_ + 2];
			i_21_ += anIntArray26[3 + i_26_];
			i_20_ += anIntArray26[i_26_ + 4];
			i_19_ += anIntArray26[i_26_ + 5];
			i_18_ += anIntArray26[6 + i_26_];
			i += anIntArray26[i_26_ + 7];
			i_24_ ^= i_23_ << 11;
			i_21_ += i_24_;
			i_23_ += i_22_;
			i_23_ ^= i_22_ >>> 2;
			i_20_ += i_23_;
			i_22_ += i_21_;
			i_22_ ^= i_21_ << 8;
			i_19_ += i_22_;
			i_21_ += i_20_;
			i_21_ ^= i_20_ >>> 16;
			i_18_ += i_21_;
			i_20_ += i_19_;
			i_20_ ^= i_19_ << 10;
			i += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 4;
			i_24_ += i_19_;
			i_18_ += i;
			i_18_ ^= i << 8;
			i_23_ += i_18_;
			i += i_24_;
			i ^= i_24_ >>> 9;
			i_22_ += i;
			i_24_ += i_23_;
			anIntArray27[i_26_] = i_24_;
			anIntArray27[1 + i_26_] = i_23_;
			anIntArray27[2 + i_26_] = i_22_;
			anIntArray27[3 + i_26_] = i_21_;
			anIntArray27[i_26_ + 4] = i_20_;
			anIntArray27[5 + i_26_] = i_19_;
			anIntArray27[i_26_ + 6] = i_18_;
			anIntArray27[i_26_ + 7] = i;
		}
		for (int i_27_ = 0; i_27_ < 256; i_27_ += 8) {
			i_24_ += anIntArray27[i_27_];
			i_23_ += anIntArray27[i_27_ + 1];
			i_22_ += anIntArray27[i_27_ + 2];
			i_21_ += anIntArray27[i_27_ + 3];
			i_20_ += anIntArray27[4 + i_27_];
			i_19_ += anIntArray27[5 + i_27_];
			i_18_ += anIntArray27[i_27_ + 6];
			i += anIntArray27[i_27_ + 7];
			i_24_ ^= i_23_ << 11;
			i_21_ += i_24_;
			i_23_ += i_22_;
			i_23_ ^= i_22_ >>> 2;
			i_20_ += i_23_;
			i_22_ += i_21_;
			i_22_ ^= i_21_ << 8;
			i_19_ += i_22_;
			i_21_ += i_20_;
			i_21_ ^= i_20_ >>> 16;
			i_18_ += i_21_;
			i_20_ += i_19_;
			i_20_ ^= i_19_ << 10;
			i += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 4;
			i_24_ += i_19_;
			i_18_ += i;
			i_18_ ^= i << 8;
			i_23_ += i_18_;
			i += i_24_;
			i ^= i_24_ >>> 9;
			i_22_ += i;
			i_24_ += i_23_;
			anIntArray27[i_27_] = i_24_;
			anIntArray27[1 + i_27_] = i_23_;
			anIntArray27[2 + i_27_] = i_22_;
			anIntArray27[3 + i_27_] = i_21_;
			anIntArray27[i_27_ + 4] = i_20_;
			anIntArray27[i_27_ + 5] = i_19_;
			anIntArray27[i_27_ + 6] = i_18_;
			anIntArray27[7 + i_27_] = i;
		}
		method518(1986614315);
		anInt29 = -1828096;
	}

	final void method529() {
		int i = -1640531527;
		int i_28_ = -1640531527;
		int i_29_ = -1640531527;
		int i_30_ = -1640531527;
		int i_31_ = -1640531527;
		int i_32_ = -1640531527;
		int i_33_ = -1640531527;
		int i_34_ = -1640531527;
		for (int i_35_ = 0; i_35_ < 4; i_35_++) {
			i_34_ ^= i_33_ << 11;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 2;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 8;
			i_29_ += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 16;
			i_28_ += i_31_;
			i_30_ += i_29_;
			i_30_ ^= i_29_ << 10;
			i += i_30_;
			i_29_ += i_28_;
			i_29_ ^= i_28_ >>> 4;
			i_34_ += i_29_;
			i_28_ += i;
			i_28_ ^= i << 8;
			i_33_ += i_28_;
			i += i_34_;
			i ^= i_34_ >>> 9;
			i_32_ += i;
			i_34_ += i_33_;
		}
		for (int i_36_ = 0; i_36_ < 256; i_36_ += 8) {
			i_34_ += anIntArray26[i_36_];
			i_33_ += anIntArray26[i_36_ + 1];
			i_32_ += anIntArray26[i_36_ + 2];
			i_31_ += anIntArray26[3 + i_36_];
			i_30_ += anIntArray26[i_36_ + 4];
			i_29_ += anIntArray26[i_36_ + 5];
			i_28_ += anIntArray26[6 + i_36_];
			i += anIntArray26[i_36_ + 7];
			i_34_ ^= i_33_ << 11;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 2;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 8;
			i_29_ += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 16;
			i_28_ += i_31_;
			i_30_ += i_29_;
			i_30_ ^= i_29_ << 10;
			i += i_30_;
			i_29_ += i_28_;
			i_29_ ^= i_28_ >>> 4;
			i_34_ += i_29_;
			i_28_ += i;
			i_28_ ^= i << 8;
			i_33_ += i_28_;
			i += i_34_;
			i ^= i_34_ >>> 9;
			i_32_ += i;
			i_34_ += i_33_;
			anIntArray27[i_36_] = i_34_;
			anIntArray27[1 + i_36_] = i_33_;
			anIntArray27[2 + i_36_] = i_32_;
			anIntArray27[3 + i_36_] = i_31_;
			anIntArray27[i_36_ + 4] = i_30_;
			anIntArray27[5 + i_36_] = i_29_;
			anIntArray27[i_36_ + 6] = i_28_;
			anIntArray27[i_36_ + 7] = i;
		}
		for (int i_37_ = 0; i_37_ < 256; i_37_ += 8) {
			i_34_ += anIntArray27[i_37_];
			i_33_ += anIntArray27[i_37_ + 1];
			i_32_ += anIntArray27[i_37_ + 2];
			i_31_ += anIntArray27[i_37_ + 3];
			i_30_ += anIntArray27[4 + i_37_];
			i_29_ += anIntArray27[5 + i_37_];
			i_28_ += anIntArray27[i_37_ + 6];
			i += anIntArray27[i_37_ + 7];
			i_34_ ^= i_33_ << 11;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 2;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 8;
			i_29_ += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 16;
			i_28_ += i_31_;
			i_30_ += i_29_;
			i_30_ ^= i_29_ << 10;
			i += i_30_;
			i_29_ += i_28_;
			i_29_ ^= i_28_ >>> 4;
			i_34_ += i_29_;
			i_28_ += i;
			i_28_ ^= i << 8;
			i_33_ += i_28_;
			i += i_34_;
			i ^= i_34_ >>> 9;
			i_32_ += i;
			i_34_ += i_33_;
			anIntArray27[i_37_] = i_34_;
			anIntArray27[1 + i_37_] = i_33_;
			anIntArray27[2 + i_37_] = i_32_;
			anIntArray27[3 + i_37_] = i_31_;
			anIntArray27[i_37_ + 4] = i_30_;
			anIntArray27[i_37_ + 5] = i_29_;
			anIntArray27[i_37_ + 6] = i_28_;
			anIntArray27[7 + i_37_] = i;
		}
		method518(-827192887);
		anInt29 = -1828096;
	}
}

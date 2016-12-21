/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class15 {
	static final int anInt165 = 1020;
	int[] anIntArray166 = new int[256];
	static final int anInt167 = 256;
	int anInt168;
	int[] anIntArray169 = new int[256];
	int anInt170;
	int anInt171;
	static final int anInt172 = 8;
	int anInt173;

	public final int method627() {
		if (-1704234903 * anInt170 == 0) {
			method629((byte) 36);
			anInt170 = -1457530624;
		}
		return anIntArray169[(anInt170 -= 1806245849) * -1704234903];
	}

	public final int method628(int i) {
		if (-1704234903 * anInt170 == 0) {
			method629((byte) 119);
			anInt170 = -1457530624;
		}
		return anIntArray169[(anInt170 -= 1806245849) * -1704234903];
	}

	public Class15(int[] is) {
		for (int i = 0; i < is.length; i++)
			anIntArray169[i] = is[i];
		method632((byte) 0);
	}

	final void method629(byte i) {
		anInt168 += (anInt173 += -605803513) * 869043071;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			int i_1_ = anIntArray166[i_0_];
			if (0 == (i_0_ & 0x2)) {
				if (0 == (i_0_ & 0x1))
					anInt171 = (anInt171 * -539601045 ^ -539601045 * anInt171 << 13) * 687873347;
				else
					anInt171 = (-539601045 * anInt171 ^ -539601045 * anInt171 >>> 6) * 687873347;
			} else if (0 == (i_0_ & 0x1))
				anInt171 = 687873347 * (-539601045 * anInt171 ^ anInt171 * -539601045 << 2);
			else
				anInt171 = 687873347 * (anInt171 * -539601045 ^ anInt171 * -539601045 >>> 16);
			anInt171 += 687873347 * anIntArray166[128 + i_0_ & 0xff];
			int i_2_;
			anIntArray166[i_0_] = i_2_ = (anIntArray166[(i_1_ & 0x3fc) >> 2] + -539601045 * anInt171 + 321881545 * anInt168);
			anIntArray169[i_0_] = (anInt168 = ((anIntArray166[(i_2_ >> 8 & 0x3fc) >> 2] + i_1_) * 1957536889)) * 321881545;
		}
	}

	final void method630() {
		int i = -1640531527;
		int i_3_ = -1640531527;
		int i_4_ = -1640531527;
		int i_5_ = -1640531527;
		int i_6_ = -1640531527;
		int i_7_ = -1640531527;
		int i_8_ = -1640531527;
		int i_9_ = -1640531527;
		for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			i_9_ ^= i_8_ << 11;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ >>> 2;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ << 8;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 16;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 10;
			i += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 4;
			i_9_ += i_4_;
			i_3_ += i;
			i_3_ ^= i << 8;
			i_8_ += i_3_;
			i += i_9_;
			i ^= i_9_ >>> 9;
			i_7_ += i;
			i_9_ += i_8_;
		}
		for (int i_11_ = 0; i_11_ < 256; i_11_ += 8) {
			i_9_ += anIntArray169[i_11_];
			i_8_ += anIntArray169[i_11_ + 1];
			i_7_ += anIntArray169[2 + i_11_];
			i_6_ += anIntArray169[3 + i_11_];
			i_5_ += anIntArray169[i_11_ + 4];
			i_4_ += anIntArray169[i_11_ + 5];
			i_3_ += anIntArray169[6 + i_11_];
			i += anIntArray169[7 + i_11_];
			i_9_ ^= i_8_ << 11;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ >>> 2;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ << 8;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 16;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 10;
			i += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 4;
			i_9_ += i_4_;
			i_3_ += i;
			i_3_ ^= i << 8;
			i_8_ += i_3_;
			i += i_9_;
			i ^= i_9_ >>> 9;
			i_7_ += i;
			i_9_ += i_8_;
			anIntArray166[i_11_] = i_9_;
			anIntArray166[1 + i_11_] = i_8_;
			anIntArray166[i_11_ + 2] = i_7_;
			anIntArray166[3 + i_11_] = i_6_;
			anIntArray166[4 + i_11_] = i_5_;
			anIntArray166[5 + i_11_] = i_4_;
			anIntArray166[i_11_ + 6] = i_3_;
			anIntArray166[i_11_ + 7] = i;
		}
		for (int i_12_ = 0; i_12_ < 256; i_12_ += 8) {
			i_9_ += anIntArray166[i_12_];
			i_8_ += anIntArray166[1 + i_12_];
			i_7_ += anIntArray166[2 + i_12_];
			i_6_ += anIntArray166[i_12_ + 3];
			i_5_ += anIntArray166[4 + i_12_];
			i_4_ += anIntArray166[i_12_ + 5];
			i_3_ += anIntArray166[i_12_ + 6];
			i += anIntArray166[7 + i_12_];
			i_9_ ^= i_8_ << 11;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ >>> 2;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ << 8;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 16;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 10;
			i += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 4;
			i_9_ += i_4_;
			i_3_ += i;
			i_3_ ^= i << 8;
			i_8_ += i_3_;
			i += i_9_;
			i ^= i_9_ >>> 9;
			i_7_ += i;
			i_9_ += i_8_;
			anIntArray166[i_12_] = i_9_;
			anIntArray166[1 + i_12_] = i_8_;
			anIntArray166[2 + i_12_] = i_7_;
			anIntArray166[i_12_ + 3] = i_6_;
			anIntArray166[4 + i_12_] = i_5_;
			anIntArray166[5 + i_12_] = i_4_;
			anIntArray166[6 + i_12_] = i_3_;
			anIntArray166[i_12_ + 7] = i;
		}
		method629((byte) 53);
		anInt170 = -1457530624;
	}

	public final int method631() {
		if (-1704234903 * anInt170 == 0) {
			method629((byte) 66);
			anInt170 = -1457530624;
		}
		return anIntArray169[(anInt170 -= 1806245849) * -1704234903];
	}

	final void method632(byte i) {
		int i_13_ = -1640531527;
		int i_14_ = -1640531527;
		int i_15_ = -1640531527;
		int i_16_ = -1640531527;
		int i_17_ = -1640531527;
		int i_18_ = -1640531527;
		int i_19_ = -1640531527;
		int i_20_ = -1640531527;
		for (int i_21_ = 0; i_21_ < 4; i_21_++) {
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i_13_ += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i_13_;
			i_14_ ^= i_13_ << 8;
			i_19_ += i_14_;
			i_13_ += i_20_;
			i_13_ ^= i_20_ >>> 9;
			i_18_ += i_13_;
			i_20_ += i_19_;
		}
		for (int i_22_ = 0; i_22_ < 256; i_22_ += 8) {
			i_20_ += anIntArray169[i_22_];
			i_19_ += anIntArray169[i_22_ + 1];
			i_18_ += anIntArray169[2 + i_22_];
			i_17_ += anIntArray169[3 + i_22_];
			i_16_ += anIntArray169[i_22_ + 4];
			i_15_ += anIntArray169[i_22_ + 5];
			i_14_ += anIntArray169[6 + i_22_];
			i_13_ += anIntArray169[7 + i_22_];
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i_13_ += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i_13_;
			i_14_ ^= i_13_ << 8;
			i_19_ += i_14_;
			i_13_ += i_20_;
			i_13_ ^= i_20_ >>> 9;
			i_18_ += i_13_;
			i_20_ += i_19_;
			anIntArray166[i_22_] = i_20_;
			anIntArray166[1 + i_22_] = i_19_;
			anIntArray166[i_22_ + 2] = i_18_;
			anIntArray166[3 + i_22_] = i_17_;
			anIntArray166[4 + i_22_] = i_16_;
			anIntArray166[5 + i_22_] = i_15_;
			anIntArray166[i_22_ + 6] = i_14_;
			anIntArray166[i_22_ + 7] = i_13_;
		}
		for (int i_23_ = 0; i_23_ < 256; i_23_ += 8) {
			i_20_ += anIntArray166[i_23_];
			i_19_ += anIntArray166[1 + i_23_];
			i_18_ += anIntArray166[2 + i_23_];
			i_17_ += anIntArray166[i_23_ + 3];
			i_16_ += anIntArray166[4 + i_23_];
			i_15_ += anIntArray166[i_23_ + 5];
			i_14_ += anIntArray166[i_23_ + 6];
			i_13_ += anIntArray166[7 + i_23_];
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i_13_ += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i_13_;
			i_14_ ^= i_13_ << 8;
			i_19_ += i_14_;
			i_13_ += i_20_;
			i_13_ ^= i_20_ >>> 9;
			i_18_ += i_13_;
			i_20_ += i_19_;
			anIntArray166[i_23_] = i_20_;
			anIntArray166[1 + i_23_] = i_19_;
			anIntArray166[2 + i_23_] = i_18_;
			anIntArray166[i_23_ + 3] = i_17_;
			anIntArray166[4 + i_23_] = i_16_;
			anIntArray166[5 + i_23_] = i_15_;
			anIntArray166[6 + i_23_] = i_14_;
			anIntArray166[i_23_ + 7] = i_13_;
		}
		method629((byte) 45);
		anInt170 = -1457530624;
	}

	final void method633() {
		anInt168 += (anInt173 += -605803513) * 869043071;
		for (int i = 0; i < 256; i++) {
			int i_24_ = anIntArray166[i];
			if (0 == (i & 0x2)) {
				if (0 == (i & 0x1))
					anInt171 = (anInt171 * -539601045 ^ -539601045 * anInt171 << 13) * 687873347;
				else
					anInt171 = (-539601045 * anInt171 ^ -539601045 * anInt171 >>> 6) * 687873347;
			} else if (0 == (i & 0x1))
				anInt171 = 687873347 * (-539601045 * anInt171 ^ anInt171 * -539601045 << 2);
			else
				anInt171 = 687873347 * (anInt171 * -539601045 ^ anInt171 * -539601045 >>> 16);
			anInt171 += 687873347 * anIntArray166[128 + i & 0xff];
			int i_25_;
			anIntArray166[i] = i_25_ = (anIntArray166[(i_24_ & 0x3fc) >> 2] + -539601045 * anInt171 + 321881545 * anInt168);
			anIntArray169[i] = (anInt168 = (anIntArray166[(i_25_ >> 8 & 0x3fc) >> 2] + i_24_) * 1957536889) * 321881545;
		}
	}

	final void method634() {
		anInt168 += (anInt173 += -605803513) * 869043071;
		for (int i = 0; i < 256; i++) {
			int i_26_ = anIntArray166[i];
			if (0 == (i & 0x2)) {
				if (0 == (i & 0x1))
					anInt171 = (anInt171 * -539601045 ^ -539601045 * anInt171 << 13) * 687873347;
				else
					anInt171 = (-539601045 * anInt171 ^ -539601045 * anInt171 >>> 6) * 687873347;
			} else if (0 == (i & 0x1))
				anInt171 = 687873347 * (-539601045 * anInt171 ^ anInt171 * -539601045 << 2);
			else
				anInt171 = 687873347 * (anInt171 * -539601045 ^ anInt171 * -539601045 >>> 16);
			anInt171 += 687873347 * anIntArray166[128 + i & 0xff];
			int i_27_;
			anIntArray166[i] = i_27_ = (anIntArray166[(i_26_ & 0x3fc) >> 2] + -539601045 * anInt171 + 321881545 * anInt168);
			anIntArray169[i] = (anInt168 = (anIntArray166[(i_27_ >> 8 & 0x3fc) >> 2] + i_26_) * 1957536889) * 321881545;
		}
	}

	final void method635() {
		anInt168 += (anInt173 += -605803513) * 869043071;
		for (int i = 0; i < 256; i++) {
			int i_28_ = anIntArray166[i];
			if (0 == (i & 0x2)) {
				if (0 == (i & 0x1))
					anInt171 = (anInt171 * -539601045 ^ -539601045 * anInt171 << 13) * 687873347;
				else
					anInt171 = (-539601045 * anInt171 ^ -539601045 * anInt171 >>> 6) * 687873347;
			} else if (0 == (i & 0x1))
				anInt171 = 687873347 * (-539601045 * anInt171 ^ anInt171 * -539601045 << 2);
			else
				anInt171 = 687873347 * (anInt171 * -539601045 ^ anInt171 * -539601045 >>> 16);
			anInt171 += 687873347 * anIntArray166[128 + i & 0xff];
			int i_29_;
			anIntArray166[i] = i_29_ = (anIntArray166[(i_28_ & 0x3fc) >> 2] + -539601045 * anInt171 + 321881545 * anInt168);
			anIntArray169[i] = (anInt168 = (anIntArray166[(i_29_ >> 8 & 0x3fc) >> 2] + i_28_) * 1957536889) * 321881545;
		}
	}

	final void method636() {
		int i = -1640531527;
		int i_30_ = -1640531527;
		int i_31_ = -1640531527;
		int i_32_ = -1640531527;
		int i_33_ = -1640531527;
		int i_34_ = -1640531527;
		int i_35_ = -1640531527;
		int i_36_ = -1640531527;
		for (int i_37_ = 0; i_37_ < 4; i_37_++) {
			i_36_ ^= i_35_ << 11;
			i_33_ += i_36_;
			i_35_ += i_34_;
			i_35_ ^= i_34_ >>> 2;
			i_32_ += i_35_;
			i_34_ += i_33_;
			i_34_ ^= i_33_ << 8;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 16;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 10;
			i += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 4;
			i_36_ += i_31_;
			i_30_ += i;
			i_30_ ^= i << 8;
			i_35_ += i_30_;
			i += i_36_;
			i ^= i_36_ >>> 9;
			i_34_ += i;
			i_36_ += i_35_;
		}
		for (int i_38_ = 0; i_38_ < 256; i_38_ += 8) {
			i_36_ += anIntArray169[i_38_];
			i_35_ += anIntArray169[i_38_ + 1];
			i_34_ += anIntArray169[2 + i_38_];
			i_33_ += anIntArray169[3 + i_38_];
			i_32_ += anIntArray169[i_38_ + 4];
			i_31_ += anIntArray169[i_38_ + 5];
			i_30_ += anIntArray169[6 + i_38_];
			i += anIntArray169[7 + i_38_];
			i_36_ ^= i_35_ << 11;
			i_33_ += i_36_;
			i_35_ += i_34_;
			i_35_ ^= i_34_ >>> 2;
			i_32_ += i_35_;
			i_34_ += i_33_;
			i_34_ ^= i_33_ << 8;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 16;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 10;
			i += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 4;
			i_36_ += i_31_;
			i_30_ += i;
			i_30_ ^= i << 8;
			i_35_ += i_30_;
			i += i_36_;
			i ^= i_36_ >>> 9;
			i_34_ += i;
			i_36_ += i_35_;
			anIntArray166[i_38_] = i_36_;
			anIntArray166[1 + i_38_] = i_35_;
			anIntArray166[i_38_ + 2] = i_34_;
			anIntArray166[3 + i_38_] = i_33_;
			anIntArray166[4 + i_38_] = i_32_;
			anIntArray166[5 + i_38_] = i_31_;
			anIntArray166[i_38_ + 6] = i_30_;
			anIntArray166[i_38_ + 7] = i;
		}
		for (int i_39_ = 0; i_39_ < 256; i_39_ += 8) {
			i_36_ += anIntArray166[i_39_];
			i_35_ += anIntArray166[1 + i_39_];
			i_34_ += anIntArray166[2 + i_39_];
			i_33_ += anIntArray166[i_39_ + 3];
			i_32_ += anIntArray166[4 + i_39_];
			i_31_ += anIntArray166[i_39_ + 5];
			i_30_ += anIntArray166[i_39_ + 6];
			i += anIntArray166[7 + i_39_];
			i_36_ ^= i_35_ << 11;
			i_33_ += i_36_;
			i_35_ += i_34_;
			i_35_ ^= i_34_ >>> 2;
			i_32_ += i_35_;
			i_34_ += i_33_;
			i_34_ ^= i_33_ << 8;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 16;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 10;
			i += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 4;
			i_36_ += i_31_;
			i_30_ += i;
			i_30_ ^= i << 8;
			i_35_ += i_30_;
			i += i_36_;
			i ^= i_36_ >>> 9;
			i_34_ += i;
			i_36_ += i_35_;
			anIntArray166[i_39_] = i_36_;
			anIntArray166[1 + i_39_] = i_35_;
			anIntArray166[2 + i_39_] = i_34_;
			anIntArray166[i_39_ + 3] = i_33_;
			anIntArray166[4 + i_39_] = i_32_;
			anIntArray166[5 + i_39_] = i_31_;
			anIntArray166[6 + i_39_] = i_30_;
			anIntArray166[i_39_ + 7] = i;
		}
		method629((byte) 80);
		anInt170 = -1457530624;
	}

	final void method637() {
		int i = -1640531527;
		int i_40_ = -1640531527;
		int i_41_ = -1640531527;
		int i_42_ = -1640531527;
		int i_43_ = -1640531527;
		int i_44_ = -1640531527;
		int i_45_ = -1640531527;
		int i_46_ = -1640531527;
		for (int i_47_ = 0; i_47_ < 4; i_47_++) {
			i_46_ ^= i_45_ << 11;
			i_43_ += i_46_;
			i_45_ += i_44_;
			i_45_ ^= i_44_ >>> 2;
			i_42_ += i_45_;
			i_44_ += i_43_;
			i_44_ ^= i_43_ << 8;
			i_41_ += i_44_;
			i_43_ += i_42_;
			i_43_ ^= i_42_ >>> 16;
			i_40_ += i_43_;
			i_42_ += i_41_;
			i_42_ ^= i_41_ << 10;
			i += i_42_;
			i_41_ += i_40_;
			i_41_ ^= i_40_ >>> 4;
			i_46_ += i_41_;
			i_40_ += i;
			i_40_ ^= i << 8;
			i_45_ += i_40_;
			i += i_46_;
			i ^= i_46_ >>> 9;
			i_44_ += i;
			i_46_ += i_45_;
		}
		for (int i_48_ = 0; i_48_ < 256; i_48_ += 8) {
			i_46_ += anIntArray169[i_48_];
			i_45_ += anIntArray169[i_48_ + 1];
			i_44_ += anIntArray169[2 + i_48_];
			i_43_ += anIntArray169[3 + i_48_];
			i_42_ += anIntArray169[i_48_ + 4];
			i_41_ += anIntArray169[i_48_ + 5];
			i_40_ += anIntArray169[6 + i_48_];
			i += anIntArray169[7 + i_48_];
			i_46_ ^= i_45_ << 11;
			i_43_ += i_46_;
			i_45_ += i_44_;
			i_45_ ^= i_44_ >>> 2;
			i_42_ += i_45_;
			i_44_ += i_43_;
			i_44_ ^= i_43_ << 8;
			i_41_ += i_44_;
			i_43_ += i_42_;
			i_43_ ^= i_42_ >>> 16;
			i_40_ += i_43_;
			i_42_ += i_41_;
			i_42_ ^= i_41_ << 10;
			i += i_42_;
			i_41_ += i_40_;
			i_41_ ^= i_40_ >>> 4;
			i_46_ += i_41_;
			i_40_ += i;
			i_40_ ^= i << 8;
			i_45_ += i_40_;
			i += i_46_;
			i ^= i_46_ >>> 9;
			i_44_ += i;
			i_46_ += i_45_;
			anIntArray166[i_48_] = i_46_;
			anIntArray166[1 + i_48_] = i_45_;
			anIntArray166[i_48_ + 2] = i_44_;
			anIntArray166[3 + i_48_] = i_43_;
			anIntArray166[4 + i_48_] = i_42_;
			anIntArray166[5 + i_48_] = i_41_;
			anIntArray166[i_48_ + 6] = i_40_;
			anIntArray166[i_48_ + 7] = i;
		}
		for (int i_49_ = 0; i_49_ < 256; i_49_ += 8) {
			i_46_ += anIntArray166[i_49_];
			i_45_ += anIntArray166[1 + i_49_];
			i_44_ += anIntArray166[2 + i_49_];
			i_43_ += anIntArray166[i_49_ + 3];
			i_42_ += anIntArray166[4 + i_49_];
			i_41_ += anIntArray166[i_49_ + 5];
			i_40_ += anIntArray166[i_49_ + 6];
			i += anIntArray166[7 + i_49_];
			i_46_ ^= i_45_ << 11;
			i_43_ += i_46_;
			i_45_ += i_44_;
			i_45_ ^= i_44_ >>> 2;
			i_42_ += i_45_;
			i_44_ += i_43_;
			i_44_ ^= i_43_ << 8;
			i_41_ += i_44_;
			i_43_ += i_42_;
			i_43_ ^= i_42_ >>> 16;
			i_40_ += i_43_;
			i_42_ += i_41_;
			i_42_ ^= i_41_ << 10;
			i += i_42_;
			i_41_ += i_40_;
			i_41_ ^= i_40_ >>> 4;
			i_46_ += i_41_;
			i_40_ += i;
			i_40_ ^= i << 8;
			i_45_ += i_40_;
			i += i_46_;
			i ^= i_46_ >>> 9;
			i_44_ += i;
			i_46_ += i_45_;
			anIntArray166[i_49_] = i_46_;
			anIntArray166[1 + i_49_] = i_45_;
			anIntArray166[2 + i_49_] = i_44_;
			anIntArray166[i_49_ + 3] = i_43_;
			anIntArray166[4 + i_49_] = i_42_;
			anIntArray166[5 + i_49_] = i_41_;
			anIntArray166[6 + i_49_] = i_40_;
			anIntArray166[i_49_ + 7] = i;
		}
		method629((byte) 19);
		anInt170 = -1457530624;
	}

	public final int method638(short i) {
		if (-1704234903 * anInt170 == 0) {
			method629((byte) 22);
			anInt170 = -1457530624;
		}
		return anIntArray169[-1704234903 * anInt170 - 1];
	}

	static final void method639(Class668 class668, int i) {
		Class536_Sub41 class536_sub41 = Class26.method741(366709801);
		if (null == class536_sub41) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2000440429 * class536_sub41.anInt10793;
			int i_50_ = (-46161555 * class536_sub41.anInt10795 << 28 | (Class542.anInt7185 + class536_sub41.anInt10794 * 753546687) << 14 | (Class542.anInt7186 + class536_sub41.anInt10796 * 1902597877));
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_50_;
		}
	}

	public static void method640(int i, int i_51_, int i_52_, boolean bool, int i_53_) {
		client.aLong11148 = 0L;
		int i_54_ = Class315.method4212((byte) 11);
		if (3 == i || 3 == i_54_)
			bool = true;
		if (!Class677.aClass167_8609.method2011())
			bool = true;
		Class506.method6142(i_54_, i, i_51_, i_52_, bool, (byte) -20);
	}

	public static String method641(int i) {
		return Class45.aString528;
	}

	static final void method642(Class251 class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1457100677) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2672 = Class33.method796(string, class668, (short) 21429);
		class251.aBool2666 = true;
	}

	public static int method643(int i, int i_55_) {
		Class536_Sub18_Sub12 class536_sub18_sub12 = (Class536_Sub18_Sub12) Class262.aClass4_2847.method556((long) i);
		if (class536_sub18_sub12 == null)
			return -1;
		if (class536_sub18_sub12.aClass536_Sub18_10506 == Class262.aClass700_2846.aClass536_Sub18_8794)
			return -1;
		return (698041493 * ((Class536_Sub18_Sub12) class536_sub18_sub12.aClass536_Sub18_10506).anInt11728);
	}
}

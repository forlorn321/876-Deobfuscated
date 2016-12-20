/* Class708 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class708 {
	boolean aBool8842;
	int anInt8843;
	boolean aBool8844;
	int anInt8845;
	boolean aBool8846;
	public static Class463 aClass463_8847;

	public boolean method14366(int i) {
		return aBool8842;
	}

	Class708(int i, int i_0_, boolean bool, boolean bool_1_, boolean bool_2_) {
		anInt8845 = -1181966595 * i;
		anInt8843 = 494115785 * i_0_;
		aBool8844 = bool;
		aBool8846 = bool_1_;
		aBool8842 = bool_2_;
	}

	public int method14367(int i) {
		return anInt8843 * -611094919;
	}

	public boolean method14368() {
		return aBool8842;
	}

	public boolean method14369(byte i) {
		return aBool8846;
	}

	public boolean method14370(byte i) {
		return aBool8844;
	}

	public int method14371() {
		return anInt8845 * -226431403;
	}

	public boolean method14372() {
		return aBool8844;
	}

	public boolean method14373() {
		return aBool8844;
	}

	public boolean method14374() {
		return aBool8846;
	}

	public int method14375(int i) {
		return anInt8845 * -226431403;
	}

	static RSByteBuffer method14376(int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(518);
		Class32.anIntArray272 = new int[4];
		Class32.anIntArray272[0] = (int) (Math.random() * 9.9999999E7);
		Class32.anIntArray272[1] = (int) (Math.random() * 9.9999999E7);
		Class32.anIntArray272[2] = (int) (Math.random() * 9.9999999E7);
		Class32.anIntArray272[3] = (int) (Math.random() * 9.9999999E7);
		class527_sub38.writeByte(10, -1790771613);
		class527_sub38.writeInt(Class32.anIntArray272[0], 1221058921);
		class527_sub38.writeInt(Class32.anIntArray272[1], -1531631817);
		class527_sub38.writeInt(Class32.anIntArray272[2], 1290640855);
		class527_sub38.writeInt(Class32.anIntArray272[3], -1176756261);
		return class527_sub38;
	}

	static final void method14377(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		if (class665.anIntArray8525[class665.anInt8526 * 1769813785] != class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1])
			class665.anInt8527 += (-1038991169 * class665.anIntArray8545[class665.anInt8527 * 891367231]);
	}

	static final void method14378(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class32.anInt311 * -1928963105;
	}

	static final void method14379(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = i_8_ - 334;
		if (i_10_ < 0)
			i_10_ = 0;
		else if (i_10_ > 100)
			i_10_ = 100;
		int i_11_ = (client.aShort11283 + i_10_ * (client.aShort11284 - client.aShort11283) / 100);
		i_7_ = i_7_ * i_11_ >> 8;
		int i_12_ = 16384 - i_5_ & 0x3fff;
		int i_13_ = 16384 - i_6_ & 0x3fff;
		int i_14_ = 0;
		int i_15_ = 0;
		int i_16_ = i_7_;
		if (i_12_ != 0) {
			i_15_ = Class428.anIntArray4825[i_12_] * -i_16_ >> 14;
			i_16_ = Class428.anIntArray4819[i_12_] * i_16_ >> 14;
		}
		if (i_13_ != 0) {
			i_14_ = Class428.anIntArray4825[i_13_] * i_16_ >> 14;
			i_16_ = Class428.anIntArray4819[i_13_] * i_16_ >> 14;
		}
		Class320.anInt3543 = 1149154509 * (i - i_14_);
		Class142.anInt1657 = (i_3_ - i_15_) * -1960018167;
		Class201.anInt2211 = (i_4_ - i_16_) * 421295465;
		Class700_Sub34.anInt10928 = -290107601 * i_5_;
		Class12.anInt176 = i_6_ * 355973435;
		Class689.anInt8692 = 0;
	}

	static void method14380(int i, boolean bool, short i_17_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(23, (long) i);
		class527_sub8_sub9.method18187(-2130091046);
		class527_sub8_sub9.anInt11676 = (bool ? 1 : 0) * -281159195;
	}
}

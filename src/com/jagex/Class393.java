/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class393 {
	public boolean aBool4018;
	static final int anInt4019 = 0;
	public int anInt4020;
	public int anInt4021 = -1037935563;
	public int anInt4022;
	public int anInt4023;
	public boolean aBool4024;
	public int anInt4025;

	Class393() {
		anInt4020 = -1964083136;
		anInt4025 = 2117301824;
		anInt4022 = -93568298;
		anInt4023 = 274285931;
		aBool4024 = false;
		aBool4018 = false;
	}

	void method6485(RSByteBuffer class527_sub38, int i, byte i_0_) {
		for (;;) {
			int i_1_ = class527_sub38.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method6486(class527_sub38, i_1_, i, (byte) -14);
		}
	}

	void method6486(RSByteBuffer class527_sub38, int i, int i_2_, byte i_3_) {
		if (1 == i) {
			anInt4021 = class527_sub38.readUnsignedShort() * 1037935563;
			if (65535 == 1521281507 * anInt4021)
				anInt4021 = -1037935563;
		} else if (i == 2) {
			anInt4020 = (class527_sub38.readUnsignedShort() + 1) * 371964385;
			anInt4025 = (class527_sub38.readUnsignedShort() + 1) * 435736025;
		} else if (3 == i)
			class527_sub38.readByte();
		else if (i == 4)
			anInt4022 = class527_sub38.readUnsignedByte() * -46784149;
		else if (5 == i)
			anInt4023 = class527_sub38.readUnsignedByte() * 274285931;
		else if (i == 6)
			aBool4024 = true;
		else if (7 == i)
			aBool4018 = true;
	}

	void method6487(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_4_ = class527_sub38.readUnsignedByte();
			if (i_4_ == 0)
				break;
			method6486(class527_sub38, i_4_, i, (byte) -97);
		}
	}

	static final void method6488(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_6_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_5_ < i_6_ ? i_5_ : i_6_;
	}

	static final void method6489(Class665 class665, int i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub26_10602, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 1012154538);
		Class631.method10465(-1409667199);
	}

	public static final void method6490(int i, int i_7_) {
		for (int i_8_ = 0; i_8_ < 5; i_8_++)
			client.aBoolArray11060[i_8_] = false;
		client.anInt11124 = -709159557;
		client.anInt11125 = 1118587303;
		Class209.anInt2246 = 0;
		Class78.anInt801 = 0;
		Class452.anInt4964 = 1432081761;
		Class400.anInt4141 = -228665961;
		Class30.anInt265 = 1363889517 * i;
		if (2 != -349191067 * Class30.anInt265)
			Class260.aLong2853 = 0L;
	}
}

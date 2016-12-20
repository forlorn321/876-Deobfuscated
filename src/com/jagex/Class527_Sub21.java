/* Class527_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.BitSet;

public class Class527_Sub21 extends Class527 {
	public String aString10483;
	boolean aBool10484;
	public Class345[] aClass345Array10485;
	public int anInt10486;
	boolean aBool10487 = true;
	long aLong10488;
	public byte aByte10489;
	int[] anIntArray10490;
	public byte aByte10491;

	void method16207(Class345 class345, int i) {
		if (null == aClass345Array10485 || anInt10486 * -1988380647 >= aClass345Array10485.length)
			method16209(-1988380647 * anInt10486 + 5, -1745415871);
		aClass345Array10485[(anInt10486 += -1725160407) * -1988380647 - 1] = class345;
		anIntArray10490 = null;
	}

	public Class527_Sub21(RSByteBuffer class527_sub38) {
		anInt10486 = 0;
		aString10483 = null;
		method16212(class527_sub38, 108296112);
	}

	public int[] method16208(int i) {
		if (null == anIntArray10490) {
			String[] strings = new String[anInt10486 * -1988380647];
			anIntArray10490 = new int[-1988380647 * anInt10486];
			for (int i_0_ = 0; i_0_ < anInt10486 * -1988380647; i_0_++) {
				strings[i_0_] = aClass345Array10485[i_0_].aString3697;
				anIntArray10490[i_0_] = i_0_;
			}
			Class325.method5752(strings, anIntArray10490, -709566596);
		}
		return anIntArray10490;
	}

	void method16209(int i, int i_1_) {
		if (null != aClass345Array10485)
			System.arraycopy(aClass345Array10485, 0, aClass345Array10485 = new Class345[i], 0, anInt10486 * -1988380647);
		else
			aClass345Array10485 = new Class345[i];
	}

	void method16210(int i, int i_2_) {
		anInt10486 -= -1725160407;
		if (-1988380647 * anInt10486 == 0)
			aClass345Array10485 = null;
		else
			System.arraycopy(aClass345Array10485, 1 + i, aClass345Array10485, i, -1988380647 * anInt10486 - i);
		anIntArray10490 = null;
	}

	public int method16211(String string, int i) {
		for (int i_3_ = 0; i_3_ < -1988380647 * anInt10486; i_3_++) {
			if (aClass345Array10485[i_3_].aString3697.equalsIgnoreCase(string))
				return i_3_;
		}
		return -1;
	}

	void method16212(RSByteBuffer class527_sub38, int i) {
		int i_4_ = class527_sub38.readUnsignedByte();
		if (0 != (i_4_ & 0x1))
			aBool10484 = true;
		if ((i_4_ & 0x2) != 0)
			aBool10487 = true;
		int i_5_ = 2;
		if ((i_4_ & 0x4) != 0)
			i_5_ = class527_sub38.readUnsignedByte();
		aLong7106 = class527_sub38.method16612((byte) 1) * -42244196890836447L;
		aLong10488 = class527_sub38.method16612((byte) 1) * -8734652902227993471L;
		aString10483 = class527_sub38.readString(979769178);
		class527_sub38.readUnsignedByte();
		aByte10491 = class527_sub38.readByte();
		aByte10489 = class527_sub38.readByte();
		anInt10486 = class527_sub38.readUnsignedShort() * -1725160407;
		if (-1988380647 * anInt10486 > 0) {
			aClass345Array10485 = new Class345[-1988380647 * anInt10486];
			for (int i_6_ = 0; i_6_ < -1988380647 * anInt10486; i_6_++) {
				Class345 class345 = new Class345();
				if (aBool10484)
					class527_sub38.method16612((byte) 1);
				if (aBool10487)
					class345.aString3697 = class527_sub38.readString(1807418267);
				class345.aByte3699 = class527_sub38.readByte();
				class345.anInt3698 = class527_sub38.readUnsignedShort() * -39914191;
				if (i_5_ >= 3)
					class527_sub38.readUnsignedByte();
				aClass345Array10485[i_6_] = class345;
			}
		}
	}

	static {
		new BitSet(65536);
	}

	void method16213(Class345 class345) {
		if (null == aClass345Array10485 || anInt10486 * -1988380647 >= aClass345Array10485.length)
			method16209(-1988380647 * anInt10486 + 5, -1639225102);
		aClass345Array10485[(anInt10486 += -1725160407) * -1988380647 - 1] = class345;
		anIntArray10490 = null;
	}

	void method16214(int i) {
		if (null != aClass345Array10485)
			System.arraycopy(aClass345Array10485, 0, aClass345Array10485 = new Class345[i], 0, anInt10486 * -1988380647);
		else
			aClass345Array10485 = new Class345[i];
	}

	void method16215(int i) {
		if (null != aClass345Array10485)
			System.arraycopy(aClass345Array10485, 0, aClass345Array10485 = new Class345[i], 0, anInt10486 * -1988380647);
		else
			aClass345Array10485 = new Class345[i];
	}

	void method16216(int i) {
		if (null != aClass345Array10485)
			System.arraycopy(aClass345Array10485, 0, aClass345Array10485 = new Class345[i], 0, anInt10486 * -1988380647);
		else
			aClass345Array10485 = new Class345[i];
	}

	void method16217(int i) {
		if (null != aClass345Array10485)
			System.arraycopy(aClass345Array10485, 0, aClass345Array10485 = new Class345[i], 0, anInt10486 * -1988380647);
		else
			aClass345Array10485 = new Class345[i];
	}

	public int[] method16218() {
		if (null == anIntArray10490) {
			String[] strings = new String[anInt10486 * -1988380647];
			anIntArray10490 = new int[-1988380647 * anInt10486];
			for (int i = 0; i < anInt10486 * -1988380647; i++) {
				strings[i] = aClass345Array10485[i].aString3697;
				anIntArray10490[i] = i;
			}
			Class325.method5752(strings, anIntArray10490, -709566596);
		}
		return anIntArray10490;
	}

	void method16219(Class345 class345) {
		if (null == aClass345Array10485 || anInt10486 * -1988380647 >= aClass345Array10485.length)
			method16209(-1988380647 * anInt10486 + 5, -1758093809);
		aClass345Array10485[(anInt10486 += -1725160407) * -1988380647 - 1] = class345;
		anIntArray10490 = null;
	}

	void method16220(Class345 class345) {
		if (null == aClass345Array10485 || anInt10486 * -1988380647 >= aClass345Array10485.length)
			method16209(-1988380647 * anInt10486 + 5, -2023866041);
		aClass345Array10485[(anInt10486 += -1725160407) * -1988380647 - 1] = class345;
		anIntArray10490 = null;
	}

	void method16221(int i) {
		anInt10486 -= -1725160407;
		if (-1988380647 * anInt10486 == 0)
			aClass345Array10485 = null;
		else
			System.arraycopy(aClass345Array10485, 1 + i, aClass345Array10485, i, -1988380647 * anInt10486 - i);
		anIntArray10490 = null;
	}

	void method16222(int i) {
		anInt10486 -= -1725160407;
		if (-1988380647 * anInt10486 == 0)
			aClass345Array10485 = null;
		else
			System.arraycopy(aClass345Array10485, 1 + i, aClass345Array10485, i, -1988380647 * anInt10486 - i);
		anIntArray10490 = null;
	}

	public int method16223(String string) {
		for (int i = 0; i < -1988380647 * anInt10486; i++) {
			if (aClass345Array10485[i].aString3697.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	public int method16224(String string) {
		for (int i = 0; i < -1988380647 * anInt10486; i++) {
			if (aClass345Array10485[i].aString3697.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	void method16225(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		if (0 != (i & 0x1))
			aBool10484 = true;
		if ((i & 0x2) != 0)
			aBool10487 = true;
		int i_7_ = 2;
		if ((i & 0x4) != 0)
			i_7_ = class527_sub38.readUnsignedByte();
		aLong7106 = class527_sub38.method16612((byte) 1) * -42244196890836447L;
		aLong10488 = class527_sub38.method16612((byte) 1) * -8734652902227993471L;
		aString10483 = class527_sub38.readString(774791193);
		class527_sub38.readUnsignedByte();
		aByte10491 = class527_sub38.readByte();
		aByte10489 = class527_sub38.readByte();
		anInt10486 = class527_sub38.readUnsignedShort() * -1725160407;
		if (-1988380647 * anInt10486 > 0) {
			aClass345Array10485 = new Class345[-1988380647 * anInt10486];
			for (int i_8_ = 0; i_8_ < -1988380647 * anInt10486; i_8_++) {
				Class345 class345 = new Class345();
				if (aBool10484)
					class527_sub38.method16612((byte) 1);
				if (aBool10487)
					class345.aString3697 = class527_sub38.readString(1228515689);
				class345.aByte3699 = class527_sub38.readByte();
				class345.anInt3698 = class527_sub38.readUnsignedShort() * -39914191;
				if (i_7_ >= 3)
					class527_sub38.readUnsignedByte();
				aClass345Array10485[i_8_] = class345;
			}
		}
	}
}

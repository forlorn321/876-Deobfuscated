/* Class527_Sub8_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub18 extends Class527_Sub8 {
	public int[] anIntArray11863;
	public int[] anIntArray11864;
	public char[] aCharArray11865;
	public String aString11866;
	public char[] aCharArray11867;

	public int method18478(char c, int i) {
		if (anIntArray11863 == null)
			return -1;
		for (int i_0_ = 0; i_0_ < anIntArray11863.length; i_0_++) {
			if (c == aCharArray11865[i_0_])
				return anIntArray11863[i_0_];
		}
		return -1;
	}

	void method18479(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_1_ = class527_sub38.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method18480(class527_sub38, i_1_, (byte) -4);
		}
	}

	void method18480(RSByteBuffer class527_sub38, int i, byte i_2_) {
		do {
			if (1 == i)
				aString11866 = class527_sub38.readString(715433266);
			else if (2 == i) {
				int i_3_ = class527_sub38.readUnsignedByte();
				anIntArray11863 = new int[i_3_];
				aCharArray11865 = new char[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					anIntArray11863[i_4_] = class527_sub38.readUnsignedShort();
					byte i_5_ = class527_sub38.readByte();
					aCharArray11865[i_4_] = 0 == i_5_ ? '\0' : Class260.method4796(i_5_, (byte) 7);
				}
			} else if (i == 3) {
				int i_6_ = class527_sub38.readUnsignedByte();
				anIntArray11864 = new int[i_6_];
				aCharArray11867 = new char[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					anIntArray11864[i_7_] = class527_sub38.readUnsignedShort();
					byte i_8_ = class527_sub38.readByte();
					aCharArray11867[i_7_] = i_8_ == 0 ? '\0' : Class260.method4796(i_8_, (byte) -62);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	void method18481(RSByteBuffer class527_sub38, int i) {
		do {
			if (1 == i)
				aString11866 = class527_sub38.readString(2016583995);
			else if (2 == i) {
				int i_9_ = class527_sub38.readUnsignedByte();
				anIntArray11863 = new int[i_9_];
				aCharArray11865 = new char[i_9_];
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
					anIntArray11863[i_10_] = class527_sub38.readUnsignedShort();
					byte i_11_ = class527_sub38.readByte();
					aCharArray11865[i_10_] = 0 == i_11_ ? '\0' : Class260.method4796(i_11_, (byte) -28);
				}
			} else if (i == 3) {
				int i_12_ = class527_sub38.readUnsignedByte();
				anIntArray11864 = new int[i_12_];
				aCharArray11867 = new char[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					anIntArray11864[i_13_] = class527_sub38.readUnsignedShort();
					byte i_14_ = class527_sub38.readByte();
					aCharArray11867[i_13_] = i_14_ == 0 ? '\0' : Class260.method4796(i_14_, (byte) -44);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	public int method18482(char c, int i) {
		if (anIntArray11864 == null)
			return -1;
		for (int i_15_ = 0; i_15_ < anIntArray11864.length; i_15_++) {
			if (c == aCharArray11867[i_15_])
				return anIntArray11864[i_15_];
		}
		return -1;
	}

	Class527_Sub8_Sub18() {
		/* empty */
	}

	void method18483(RSByteBuffer class527_sub38, int i) {
		do {
			if (1 == i)
				aString11866 = class527_sub38.readString(1121330853);
			else if (2 == i) {
				int i_16_ = class527_sub38.readUnsignedByte();
				anIntArray11863 = new int[i_16_];
				aCharArray11865 = new char[i_16_];
				for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
					anIntArray11863[i_17_] = class527_sub38.readUnsignedShort();
					byte i_18_ = class527_sub38.readByte();
					aCharArray11865[i_17_] = 0 == i_18_ ? '\0' : Class260.method4796(i_18_, (byte) 0);
				}
			} else if (i == 3) {
				int i_19_ = class527_sub38.readUnsignedByte();
				anIntArray11864 = new int[i_19_];
				aCharArray11867 = new char[i_19_];
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
					anIntArray11864[i_20_] = class527_sub38.readUnsignedShort();
					byte i_21_ = class527_sub38.readByte();
					aCharArray11867[i_20_] = i_21_ == 0 ? '\0' : Class260.method4796(i_21_, (byte) 9);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	void method18484(int i) {
		if (anIntArray11864 != null) {
			for (int i_22_ = 0; i_22_ < anIntArray11864.length; i_22_++)
				anIntArray11864[i_22_] |= 0x8000;
		}
		if (anIntArray11863 != null) {
			for (int i_23_ = 0; i_23_ < anIntArray11863.length; i_23_++)
				anIntArray11863[i_23_] |= 0x8000;
		}
	}

	void method18485(RSByteBuffer class527_sub38, int i) {
		do {
			if (1 == i)
				aString11866 = class527_sub38.readString(1703263409);
			else if (2 == i) {
				int i_24_ = class527_sub38.readUnsignedByte();
				anIntArray11863 = new int[i_24_];
				aCharArray11865 = new char[i_24_];
				for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
					anIntArray11863[i_25_] = class527_sub38.readUnsignedShort();
					byte i_26_ = class527_sub38.readByte();
					aCharArray11865[i_25_] = 0 == i_26_ ? '\0' : Class260.method4796(i_26_, (byte) 90);
				}
			} else if (i == 3) {
				int i_27_ = class527_sub38.readUnsignedByte();
				anIntArray11864 = new int[i_27_];
				aCharArray11867 = new char[i_27_];
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
					anIntArray11864[i_28_] = class527_sub38.readUnsignedShort();
					byte i_29_ = class527_sub38.readByte();
					aCharArray11867[i_28_] = i_29_ == 0 ? '\0' : Class260.method4796(i_29_, (byte) -32);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	public int method18486(char c) {
		if (anIntArray11864 == null)
			return -1;
		for (int i = 0; i < anIntArray11864.length; i++) {
			if (c == aCharArray11867[i])
				return anIntArray11864[i];
		}
		return -1;
	}

	public int method18487(char c) {
		if (anIntArray11864 == null)
			return -1;
		for (int i = 0; i < anIntArray11864.length; i++) {
			if (c == aCharArray11867[i])
				return anIntArray11864[i];
		}
		return -1;
	}

	public int method18488(char c) {
		if (anIntArray11864 == null)
			return -1;
		for (int i = 0; i < anIntArray11864.length; i++) {
			if (c == aCharArray11867[i])
				return anIntArray11864[i];
		}
		return -1;
	}

	void method18489() {
		if (anIntArray11864 != null) {
			for (int i = 0; i < anIntArray11864.length; i++)
				anIntArray11864[i] |= 0x8000;
		}
		if (anIntArray11863 != null) {
			for (int i = 0; i < anIntArray11863.length; i++)
				anIntArray11863[i] |= 0x8000;
		}
	}

	void method18490() {
		if (anIntArray11864 != null) {
			for (int i = 0; i < anIntArray11864.length; i++)
				anIntArray11864[i] |= 0x8000;
		}
		if (anIntArray11863 != null) {
			for (int i = 0; i < anIntArray11863.length; i++)
				anIntArray11863[i] |= 0x8000;
		}
	}
}

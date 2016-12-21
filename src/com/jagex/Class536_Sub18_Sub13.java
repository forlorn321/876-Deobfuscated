/* Class536_Sub18_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub13 extends Class536_Sub18 {
	public String aString11757;
	public int[] anIntArray11758;
	public char[] aCharArray11759;
	public int[] anIntArray11760;
	public char[] aCharArray11761;

	public int method10753(char c, int i) {
		if (null == anIntArray11758)
			return -1;
		for (int i_0_ = 0; i_0_ < anIntArray11758.length; i_0_++) {
			if (aCharArray11759[i_0_] == c)
				return anIntArray11758[i_0_];
		}
		return -1;
	}

	void method10754(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_1_ = class536_sub33.readUnsignedByte();
			if (0 == i_1_)
				break;
			method10756(class536_sub33, i_1_, (byte) -70);
		}
	}

	void method10755() {
		if (null != anIntArray11760) {
			for (int i = 0; i < anIntArray11760.length; i++)
				anIntArray11760[i] |= 0x8000;
		}
		if (anIntArray11758 != null) {
			for (int i = 0; i < anIntArray11758.length; i++)
				anIntArray11758[i] |= 0x8000;
		}
	}

	void method10756(RSByteBuffer class536_sub33, int i, byte i_2_) {
		do {
			if (i == 1)
				aString11757 = class536_sub33.readString();
			else if (i == 2) {
				int i_3_ = class536_sub33.readUnsignedByte();
				anIntArray11758 = new int[i_3_];
				aCharArray11759 = new char[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					anIntArray11758[i_4_] = class536_sub33.readUnsignedShort();
					byte i_5_ = class536_sub33.readByte();
					aCharArray11759[i_4_] = i_5_ == 0 ? '\0' : Class281.method3764(i_5_, 543110159);
				}
			} else if (i == 3) {
				int i_6_ = class536_sub33.readUnsignedByte();
				anIntArray11760 = new int[i_6_];
				aCharArray11761 = new char[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					anIntArray11760[i_7_] = class536_sub33.readUnsignedShort();
					byte i_8_ = class536_sub33.readByte();
					aCharArray11761[i_7_] = 0 == i_8_ ? '\0' : Class281.method3764(i_8_, 518368900);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	public int method10757(char c, int i) {
		if (null == anIntArray11760)
			return -1;
		for (int i_9_ = 0; i_9_ < anIntArray11760.length; i_9_++) {
			if (aCharArray11761[i_9_] == c)
				return anIntArray11760[i_9_];
		}
		return -1;
	}

	void method10758(int i) {
		if (null != anIntArray11760) {
			for (int i_10_ = 0; i_10_ < anIntArray11760.length; i_10_++)
				anIntArray11760[i_10_] |= 0x8000;
		}
		if (anIntArray11758 != null) {
			for (int i_11_ = 0; i_11_ < anIntArray11758.length; i_11_++)
				anIntArray11758[i_11_] |= 0x8000;
		}
	}

	void method10759(RSByteBuffer class536_sub33, int i) {
		do {
			if (i == 1)
				aString11757 = class536_sub33.readString();
			else if (i == 2) {
				int i_12_ = class536_sub33.readUnsignedByte();
				anIntArray11758 = new int[i_12_];
				aCharArray11759 = new char[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					anIntArray11758[i_13_] = class536_sub33.readUnsignedShort();
					byte i_14_ = class536_sub33.readByte();
					aCharArray11759[i_13_] = i_14_ == 0 ? '\0' : Class281.method3764(i_14_, 1072883707);
				}
			} else if (i == 3) {
				int i_15_ = class536_sub33.readUnsignedByte();
				anIntArray11760 = new int[i_15_];
				aCharArray11761 = new char[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					anIntArray11760[i_16_] = class536_sub33.readUnsignedShort();
					byte i_17_ = class536_sub33.readByte();
					aCharArray11761[i_16_] = 0 == i_17_ ? '\0' : Class281.method3764(i_17_, 1171994556);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	Class536_Sub18_Sub13() {
		/* empty */
	}

	void method10760(RSByteBuffer class536_sub33, int i) {
		do {
			if (i == 1)
				aString11757 = class536_sub33.readString();
			else if (i == 2) {
				int i_18_ = class536_sub33.readUnsignedByte();
				anIntArray11758 = new int[i_18_];
				aCharArray11759 = new char[i_18_];
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					anIntArray11758[i_19_] = class536_sub33.readUnsignedShort();
					byte i_20_ = class536_sub33.readByte();
					aCharArray11759[i_19_] = i_20_ == 0 ? '\0' : Class281.method3764(i_20_, -1394556597);
				}
			} else if (i == 3) {
				int i_21_ = class536_sub33.readUnsignedByte();
				anIntArray11760 = new int[i_21_];
				aCharArray11761 = new char[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					anIntArray11760[i_22_] = class536_sub33.readUnsignedShort();
					byte i_23_ = class536_sub33.readByte();
					aCharArray11761[i_22_] = 0 == i_23_ ? '\0' : Class281.method3764(i_23_, -1820489302);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	void method10761() {
		if (null != anIntArray11760) {
			for (int i = 0; i < anIntArray11760.length; i++)
				anIntArray11760[i] |= 0x8000;
		}
		if (anIntArray11758 != null) {
			for (int i = 0; i < anIntArray11758.length; i++)
				anIntArray11758[i] |= 0x8000;
		}
	}

	void method10762() {
		if (null != anIntArray11760) {
			for (int i = 0; i < anIntArray11760.length; i++)
				anIntArray11760[i] |= 0x8000;
		}
		if (anIntArray11758 != null) {
			for (int i = 0; i < anIntArray11758.length; i++)
				anIntArray11758[i] |= 0x8000;
		}
	}

	void method10763() {
		if (null != anIntArray11760) {
			for (int i = 0; i < anIntArray11760.length; i++)
				anIntArray11760[i] |= 0x8000;
		}
		if (anIntArray11758 != null) {
			for (int i = 0; i < anIntArray11758.length; i++)
				anIntArray11758[i] |= 0x8000;
		}
	}
}

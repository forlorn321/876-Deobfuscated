/* Class703 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class703 {
	public int anInt8818;
	public static Class703 aClass703_8819 = new Class703("LIVE", 0);
	public static Class703 aClass703_8820;
	public static Class703 aClass703_8821;
	static Class703 aClass703_8822;
	public String aString8823;
	public static Class703 aClass703_8824 = new Class703("BUILDLIVE", 3);
	public static Class219 aClass219_8825;

	Class703(String string, int i) {
		aString8823 = string;
		anInt8818 = i * 1803475863;
	}

	public static Class703 method14303(int i) {
		Class703[] class703s = Class658.method11011(1708621135);
		for (int i_0_ = 0; i_0_ < class703s.length; i_0_++) {
			Class703 class703 = class703s[i_0_];
			if (490296359 * class703.anInt8818 == i)
				return class703;
		}
		return null;
	}

	static {
		aClass703_8820 = new Class703("RC", 1);
		aClass703_8821 = new Class703("WIP", 2);
		aClass703_8822 = new Class703("INTBETA", 4);
	}

	static Class703[] method14304() {
		return new Class703[] { aClass703_8824, aClass703_8820, aClass703_8821, aClass703_8819, aClass703_8822 };
	}

	public static Class703 method14305(int i) {
		Class703[] class703s = Class658.method11011(1777840520);
		for (int i_1_ = 0; i_1_ < class703s.length; i_1_++) {
			Class703 class703 = class703s[i_1_];
			if (490296359 * class703.anInt8818 == i)
				return class703;
		}
		return null;
	}

	static Class703[] method14306() {
		return new Class703[] { aClass703_8824, aClass703_8820, aClass703_8821, aClass703_8819, aClass703_8822 };
	}

	public static Class703 method14307(int i) {
		Class703[] class703s = Class658.method11011(1415650071);
		for (int i_2_ = 0; i_2_ < class703s.length; i_2_++) {
			Class703 class703 = class703s[i_2_];
			if (490296359 * class703.anInt8818 == i)
				return class703;
		}
		return null;
	}

	static Class23 method14308(Class9 class9, RSByteBuffer class527_sub38, int i, byte i_3_) {
		Class23 class23 = new Class23(class9);
		int i_4_ = class527_sub38.readUnsignedByte();
		boolean bool = 0 != (i_4_ & 0x1);
		boolean bool_5_ = 0 != (i_4_ & 0x2);
		boolean bool_6_ = (i_4_ & 0x4) != 0;
		boolean bool_7_ = (i_4_ & 0x8) != 0;
		if (bool) {
			if (i <= 1) {
				class23.anIntArray222[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray217[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray222[0] = class527_sub38.method16466(-1681156173);
				class23.anIntArray217[0] = class527_sub38.method16466(-1648201810);
			}
			if (-1 != class9.anInt116 * -1198555409 || class9.anInt99 * -291191067 != -1) {
				if (i <= 1) {
					class23.anIntArray222[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[1] = class527_sub38.method16466(-2057074124);
					class23.anIntArray217[1] = class527_sub38.method16466(-1650336024);
				}
			}
			if (-1591690929 * class9.anInt121 != -1 || -1 != class9.anInt110 * 816794519) {
				if (i <= 1) {
					class23.anIntArray222[2] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[2] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[2] = class527_sub38.method16466(-2133038946);
					class23.anIntArray217[2] = class527_sub38.method16466(-1930504278);
				}
			}
		}
		if (bool_5_) {
			if (i <= 1) {
				class23.anIntArray224[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray226[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray224[0] = class527_sub38.method16466(-2144193197);
				class23.anIntArray226[0] = class527_sub38.method16466(-1717799748);
			}
			if (-1 != 1741113833 * class9.anInt112 || -2107841861 * class9.anInt105 != -1) {
				if (i <= 1) {
					class23.anIntArray224[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray226[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray224[1] = class527_sub38.method16466(-1707112982);
					class23.anIntArray226[1] = class527_sub38.method16466(-1951590440);
				}
			}
		}
		if (bool_6_) {
			int i_8_ = class527_sub38.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_8_ & 0xf;
			is[1] = i_8_ >> 4 & 0xf;
			is[2] = i_8_ >> 8 & 0xf;
			is[3] = i_8_ >> 12 & 0xf;
			for (int i_9_ = 0; i_9_ < 4; i_9_++) {
				if (is[i_9_] != 15)
					class23.aShortArray218[is[i_9_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		if (bool_7_) {
			int i_10_ = class527_sub38.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_10_ & 0xf;
			is[1] = i_10_ >> 4 & 0xf;
			for (int i_11_ = 0; i_11_ < 2; i_11_++) {
				if (is[i_11_] != 15)
					class23.aShortArray227[is[i_11_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		return class23;
	}

	static void method14309(Class665 class665, byte i) {
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) != 0);
		Class79.method1564(bool, -1484375748);
	}

	static final void method14310(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class576.method9633(class243, class665, (byte) 20);
	}
}

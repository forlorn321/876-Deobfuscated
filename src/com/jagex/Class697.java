/* Class697 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.List;

public class Class697 {
	boolean aBool8754 = false;
	int anInt8755;
	Class527_Sub8_Sub16 aClass527_Sub8_Sub16_8756;
	int anInt8757;
	Class527_Sub8_Sub16 aClass527_Sub8_Sub16_8758;
	int anInt8759;
	static int[] anIntArray8760;
	public static List aList8761;
	public static boolean aBool8762;

	final void method14261() {
		aBool8754 = false;
		anInt8757 = 0;
		aClass527_Sub8_Sub16_8758 = null;
		aClass527_Sub8_Sub16_8756 = null;
	}

	final boolean method14262(Class24_Sub10 class24_sub10, Class198 class198, int i, int i_0_, int[] is, int i_1_) {
		if (!aBool8754) {
			if (i >= is.length)
				return false;
			anInt8759 = -1607937709 * is[i];
			aClass527_Sub8_Sub16_8756 = class24_sub10.method17388(anInt8759 * -1038902565 >> 16, -1854806910);
			anInt8759 = (-1038902565 * anInt8759 & 0xffff) * -1607937709;
			if (aClass527_Sub8_Sub16_8756 != null) {
				if (class198.aBool2188 && -1 != i_0_ && i_0_ < is.length) {
					anInt8755 = 1396020215 * is[i_0_];
					aClass527_Sub8_Sub16_8758 = class24_sub10.method17388((anInt8755 * -1990124089 >> 16), -1949590362);
					anInt8755 = 1396020215 * (-1990124089 * anInt8755 & 0xffff);
				}
				if (class198.aBool2187)
					anInt8757 = (1721159167 * anInt8757 | 0x200) * -744148481;
				if (aClass527_Sub8_Sub16_8756.method18385(anInt8759 * -1038902565, (byte) 61))
					anInt8757 = -744148481 * (1721159167 * anInt8757 | 0x80);
				if (aClass527_Sub8_Sub16_8756.method18393(anInt8759 * -1038902565, (byte) 0))
					anInt8757 = -744148481 * (1721159167 * anInt8757 | 0x100);
				if (aClass527_Sub8_Sub16_8756.method18386(-1038902565 * anInt8759, -799884710))
					anInt8757 = (anInt8757 * 1721159167 | 0x400) * -744148481;
				if (null != aClass527_Sub8_Sub16_8758) {
					if (aClass527_Sub8_Sub16_8758.method18385(anInt8755 * -1990124089, (byte) 18))
						anInt8757 = -744148481 * (anInt8757 * 1721159167 | 0x80);
					if (aClass527_Sub8_Sub16_8758.method18393(-1990124089 * anInt8755, (byte) 0))
						anInt8757 = -744148481 * (anInt8757 * 1721159167 | 0x100);
					if (aClass527_Sub8_Sub16_8758.method18386(-1990124089 * anInt8755, 1632531575))
						anInt8757 = (1721159167 * anInt8757 | 0x400) * -744148481;
				}
				anInt8757 = -744148481 * (anInt8757 * 1721159167 | 0x20);
				aBool8754 = true;
				return true;
			}
			return false;
		}
		return true;
	}

	final void method14263(int i) {
		aBool8754 = false;
		anInt8757 = 0;
		aClass527_Sub8_Sub16_8758 = null;
		aClass527_Sub8_Sub16_8756 = null;
	}

	final void method14264() {
		aBool8754 = false;
		anInt8757 = 0;
		aClass527_Sub8_Sub16_8758 = null;
		aClass527_Sub8_Sub16_8756 = null;
	}

	Class697() {
		/* empty */
	}

	static final void method14265(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method14266(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -648250681 * Class32.anInt302;
	}

	public static void method14267(int i, int i_2_) {
		Class475.anInt5383 = i * 1722642979;
		synchronized (Class633.aClass205_8289) {
			Class633.aClass205_8289.method3793((byte) 110);
		}
		synchronized (Class633.aClass205_8288) {
			Class633.aClass205_8288.method3793((byte) 56);
		}
	}

	static void method14268(Class665 class665, int i) {
		class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 1]), 235152268)).aBool2835 ? 1 : 0);
	}
}

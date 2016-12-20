/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.Map;

public class Class308 {
	float[] aFloatArray3448;
	public int[] anIntArray3449;
	public long aLong3450;
	int[][] anIntArrayArray3451;
	int[][] anIntArrayArray3452;
	public short[] aShortArray3453;
	public short[] aShortArray3454;

	public Class308(Class295 class295, boolean bool) {
		if (bool) {
			anIntArray3449 = new int[class295.anIntArray3281.length];
			aFloatArray3448 = new float[class295.anIntArray3281.length];
			anIntArrayArray3451 = new int[class295.anIntArray3281.length][3];
			anIntArrayArray3452 = new int[class295.anIntArray3281.length][3];
			System.arraycopy(class295.anIntArray3281, 0, anIntArray3449, 0, anIntArray3449.length);
		} else {
			anIntArray3449 = new int[class295.anIntArray3282.length];
			aFloatArray3448 = new float[class295.anIntArray3282.length];
			anIntArrayArray3451 = new int[class295.anIntArray3282.length][3];
			anIntArrayArray3452 = new int[class295.anIntArray3282.length][3];
			System.arraycopy(class295.anIntArray3282, 0, anIntArray3449, 0, anIntArray3449.length);
		}
		if (class295.aShortArray3286 != null) {
			aShortArray3454 = new short[class295.aShortArray3286.length];
			System.arraycopy(class295.aShortArray3286, 0, aShortArray3454, 0, aShortArray3454.length);
		}
		if (class295.aShortArray3289 != null) {
			aShortArray3453 = new short[class295.aShortArray3289.length];
			System.arraycopy(class295.aShortArray3289, 0, aShortArray3453, 0, aShortArray3453.length);
		}
	}

	public Class308(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_, short[] is_2_, short[] is_3_) {
		aLong3450 = l * -1114685536257316839L;
		anIntArray3449 = is;
		aFloatArray3448 = fs;
		anIntArrayArray3451 = is_0_;
		anIntArrayArray3452 = is_1_;
		aShortArray3454 = is_2_;
		aShortArray3453 = is_3_;
	}

	static final void method5620(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass61_11936.method1384((byte) 1) >> 3;
	}

	static final void method5621(Class665 class665, byte i) {
		int i_4_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class57 class57 = (Class57) Class664.aClass24_Sub15_8519.method81(i_4_, 390889895);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class57.method1339(1180447813);
	}

	static final void method5622(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -862917745 * class665.aClass346_8532.anInt3720;
	}

	static final void method5623(Class665 class665, short i) {
		class665.anInt8526 -= 307142523;
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_6_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_7_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4154(i_5_, 780492683).method4119(i_6_, i_7_, 790404651) == null ? 0 : 1;
	}

	static final void method5624(Class665 class665, int i) {
		Class237.method4369(class665, class665.aClass640_Sub1_Sub2_Sub1_8522, 1496034607);
	}

	static final void method5625(int i, int i_8_, byte i_9_) {
		if (Class529_Sub1.aFloat7133 < Class529_Sub1.aFloat7134) {
			Class529_Sub1.aFloat7133 += (double) Class529_Sub1.aFloat7133 / 30.0;
			if (Class529_Sub1.aFloat7133 > Class529_Sub1.aFloat7134)
				Class529_Sub1.aFloat7133 = Class529_Sub1.aFloat7134;
			Class146.method2401((byte) 93);
			Class529_Sub1.anInt7130 = (int) Class529_Sub1.aFloat7134 >> 1;
			Class529_Sub1.aByteArrayArrayArray7118 = Class265.method5039(Class529_Sub1.anInt7130, 672688101);
		} else if (Class529_Sub1.aFloat7133 > Class529_Sub1.aFloat7134) {
			Class529_Sub1.aFloat7133 -= (double) Class529_Sub1.aFloat7133 / 30.0;
			if (Class529_Sub1.aFloat7133 < Class529_Sub1.aFloat7134)
				Class529_Sub1.aFloat7133 = Class529_Sub1.aFloat7134;
			Class146.method2401((byte) 57);
			Class529_Sub1.anInt7130 = (int) Class529_Sub1.aFloat7134 >> 1;
			Class529_Sub1.aByteArrayArrayArray7118 = Class265.method5039(Class529_Sub1.anInt7130, 672688101);
		}
		if (-1 != 735713997 * Class529_Sub1.anInt10779 && -1 != Class529_Sub1.anInt10772 * 379055201) {
			int i_10_ = (Class529_Sub1.anInt10779 * 735713997 - -502443805 * Class529_Sub1.anInt10783);
			if (0 != i_10_)
				i_10_ /= Math.min(Class529_Sub1.anInt10767 * 1724714249, Math.abs(i_10_));
			int i_11_ = (Class529_Sub1.anInt10772 * 379055201 - Class635.anInt8302 * 1891819005);
			if (0 != i_11_)
				i_11_ /= Math.min(1724714249 * Class529_Sub1.anInt10767, Math.abs(i_11_));
			Class529_Sub1.anInt10783 = (Class529_Sub1.anInt10783 * -502443805 + i_10_) * 2049864907;
			Class635.anInt8302 = -1224612011 * (Class635.anInt8302 * 1891819005 + i_11_);
			if (0 == i_10_ && i_11_ == 0) {
				Class529_Sub1.anInt10779 = -1449615877;
				Class529_Sub1.anInt10772 = -1784395681;
			}
			Class146.method2401((byte) 31);
		}
		Iterator iterator = Class529_Sub1.aHashMap10782.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !Class529_Sub1.aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * Class529_Sub1.anInt10791;
				}
			}
		}
		iterator = Class529_Sub1.aHashMap10764.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !Class529_Sub1.aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * Class529_Sub1.anInt10791;
				}
			}
		}
		if (Class529_Sub1.aBool10765 && null != Class620.aClass694_8119) {
			for (Class527_Sub10 class527_sub10 = ((Class527_Sub10) Class620.aClass694_8119.method14081((short) 2601)); class527_sub10 != null; class527_sub10 = (Class527_Sub10) Class620.aClass694_8119.method14086(-65534)) {
				Class249 class249 = ((Class249) (Class529_Sub1.aClass24_Sub12_7164.method81((-558184067 * class527_sub10.aClass527_Sub30_10430.anInt10567), 1411893975)));
				if (class527_sub10.method16074(i, i_8_, -1177518820)) {
					if (class249.aStringArray2744 != null) {
						if (null != class249.aStringArray2744[4])
							Class687.method13961(class249.aStringArray2744[4], class249.aString2749, -1, 1012, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -104);
						if (class249.aStringArray2744[3] != null)
							Class687.method13961(class249.aStringArray2744[3], class249.aString2749, -1, 1011, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -63);
						if (null != class249.aStringArray2744[2])
							Class687.method13961(class249.aStringArray2744[2], class249.aString2749, -1, 1010, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), -1771553873 * class249.anInt2777, 0, true, false, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), false, (byte) -4);
						if (null != class249.aStringArray2744[1])
							Class687.method13961(class249.aStringArray2744[1], class249.aString2749, -1, 1009, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -28);
						if (null != class249.aStringArray2744[0])
							Class687.method13961(class249.aStringArray2744[0], class249.aString2749, -1, 1008, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -23);
					}
					if (!class527_sub10.aClass527_Sub30_10430.aBool10571) {
						class527_sub10.aClass527_Sub30_10430.aBool10571 = true;
						Class546.method9060(Class579.aClass579_7655, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -24);
					}
					if (class527_sub10.aClass527_Sub30_10430.aBool10571)
						Class546.method9060(Class579.aClass579_7666, (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), class249.anInt2777 * -1771553873, (byte) 9);
				} else if (class527_sub10.aClass527_Sub30_10430.aBool10571) {
					class527_sub10.aClass527_Sub30_10430.aBool10571 = false;
					Class546.method9060(Class579.aClass579_7656, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -48);
				}
			}
		}
	}

	static boolean method5626(String string, String string_12_, int i) {
		Class32.anInt286 = -1320406984;
		Class32.aClass109_270 = client.aClass109_11066;
		return Class40.method1166(false, false, string, string_12_, -1L);
	}
}

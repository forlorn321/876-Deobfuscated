/* Class613 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class613 {
	public static final int anInt8012 = 6;
	public static Class461 aClass461_8013;
	public static Class263 aClass263_8014;

	Class613() throws Throwable {
		throw new Error();
	}

	public static void method7316(boolean bool, boolean bool_0_, short i) {
		if (bool) {
			Class639.anInt8307 -= 1472561865;
			if (Class639.anInt8307 * -903071879 == 0)
				Class639.anIntArray8308 = null;
		}
		if (bool_0_) {
			Class639.anInt8306 -= 2092703225;
			if (-316402615 * Class639.anInt8306 == 0)
				Class639.anIntArray8309 = null;
		}
	}

	static final void method7317(InterfaceDefinitions class251, Class234 class234, Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		class251.modelOriginX = -2137233423 * (class668.anIntArray8541[1867269829 * class668.anInt8542]);
		class251.modelOriginY = (class668.anIntArray8541[1867269829 * class668.anInt8542 + 1] * -610004565);
		Class668.method8011(class251, 263642117);
	}

	static final void method7318(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		short i_2_ = (short) (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]);
		short i_3_ = (short) (class668.anIntArray8541[2 + 1867269829 * class668.anInt8542]);
		if (i_1_ >= 0 && i_1_ < 5) {
			class251.method3465(i_1_, i_2_, i_3_, -330942314);
			Class668.method8011(class251, 263642117);
			if (-1 == -809980533 * class251.anInt2546 && !class234.aBool2379)
				Class34_Sub14.method10347(class251.anInt2559 * -1591767037, i_1_, 1446721829);
		}
	}

	static final void method7319(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		aClass263_8014.method3645(i_4_ != 0, 1402121216);
	}

	static final void method7320(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_6_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class73 class73 = ((Class73) Class207.aClass34_Sub22_2244.method70(i_6_, (byte) -34));
		if (class73.method1128((byte) 44))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((Class248) Class398_Sub1.aClass34_Sub8_10110.method70(i_5_, (byte) -56)).method3434(i_6_, class73.aString805, (byte) 34);
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((Class248) Class398_Sub1.aClass34_Sub8_10110.method70(i_5_, (byte) 21)).method3437(i_6_, 1566477951 * class73.anInt803, (byte) -10));
	}
}

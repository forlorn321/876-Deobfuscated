/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class156 {
	public int anInt1734;
	public Class156 aClass156_1735;
	public int anInt1736;
	public int anInt1737;
	public int anInt1738;
	public int anInt1739;
	public Class443 aClass443_1740;

	Class156 method1881(int i, byte i_0_) {
		return new Class156(anInt1736 * -804329929, i);
	}

	public Class393 method1882(Interface46 interface46, int i) {
		return interface46.method333(-804329929 * anInt1736, 2088117183);
	}

	Class156(int i, int i_1_) {
		anInt1736 = i * -1159483513;
		anInt1738 = i_1_ * -1353675755;
	}

	public static int method1883(int i) {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class167 class167 = Class219.method3105(0, canvas, null, null, null, null, null, null, 0, -1001121825);
		long l = Class249.method3450(1352626123);
		for (int i_2_ = 0; i_2_ < 10000; i_2_++)
			class167.method2030(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i_3_ = (int) (Class249.method3450(1643643701) - l);
		class167.method2057(0, 0, 100, 100, -16777216, (short) -9261);
		class167.method2005(778784407);
		return i_3_;
	}

	static final void method1884(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class70.method1115(class251, class668, 1425304292);
	}

	static final void method1885(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_5_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		Class436 class436 = Class436.method5257((float) i_4_, (float) i_4_, (float) i_4_);
		if (class436.aFloat4850 == -1.0F)
			class436.aFloat4850 = Float.POSITIVE_INFINITY;
		if (class436.aFloat4852 == -1.0F)
			class436.aFloat4852 = Float.POSITIVE_INFINITY;
		if (-1.0F == class436.aFloat4853)
			class436.aFloat4853 = Float.POSITIVE_INFINITY;
		Class683.aClass301_Sub1_8651.method4036(class436, 263350573);
		Class683.aClass301_Sub1_8651.method4056((float) i_5_ / 1000.0F, 963634571);
		class436.method5239();
	}

	public static void method1886(String string, String string_6_, String string_7_, boolean bool, int i) {
		if (string.length() <= 320 && Class224.method3210(1416211746)) {
			client.aClass106_11218.method1418(-790244124);
			Class243.method3405(-204884336);
			Class61.aString679 = string;
			Class61.aString696 = string_6_;
			Class61.aString681 = string_7_;
			Class61.aBool682 = bool;
			Class673.method8026(1, -1798113843);
		}
	}
}

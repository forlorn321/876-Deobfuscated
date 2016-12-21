/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Desktop;
import java.net.URI;

public class Class420 {
	public int anInt4571;
	public static Class420 aClass420_4572;
	public static Class420 aClass420_4573;
	public static Class420 aClass420_4574;
	static Class420[] aClass420Array4575;
	public static Class420 aClass420_4576;
	public static Class420 aClass420_4577;
	static Class420 aClass420_4578;
	static Class420 aClass420_4579;
	public static Class420 aClass420_4580;
	public static Class420 aClass420_4581 = new Class420(14, 0);
	static Class420 aClass420_4582;
	static Class420 aClass420_4583;
	public static Class420 aClass420_4584;
	static int anInt4585;

	static {
		aClass420_4572 = new Class420(15, -1);
		aClass420_4573 = new Class420(16, -2);
		aClass420_4574 = new Class420(19, -2);
		aClass420_4579 = new Class420(23, 4);
		aClass420_4583 = new Class420(24, -1);
		aClass420_4577 = new Class420(26, 0);
		aClass420_4578 = new Class420(27, 0);
		aClass420_4584 = new Class420(28, -2);
		aClass420_4580 = new Class420(29, -2);
		aClass420_4576 = new Class420(30, -2);
		aClass420_4582 = new Class420(31, 4);
		aClass420Array4575 = new Class420[32];
		Class420[] class420s = Class380.method4805(-1634690095);
		for (int i = 0; i < class420s.length; i++)
			aClass420Array4575[1258126983 * class420s[i].anInt4571] = class420s[i];
	}

	Class420(int i, int i_0_) {
		anInt4571 = 271771447 * i;
	}

	static final void method5062(Class668 class668, int i) {
		Class387.method4847(class668, Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591, -2088204263);
	}

	public static void method5063(String string, boolean bool, String string_1_, boolean bool_2_, byte i) {
		if (bool) {
			do {
				if (!bool_2_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (Class509.aString6919.startsWith("win") && !bool_2_)
				Class51.method933(string, 0, -1930729809);
			else if (Class509.aString6919.startsWith("mac"))
				Class575.method7000(string, 1, string_1_, 1422452306);
			else
				Class51.method933(string, 2, -1603582352);
		} else
			Class51.method933(string, 3, 80240942);
	}

	static final void method5064(Class668 class668, int i) {
		class668.aClass382_8551 = new Class382();
		class668.aClass382_8551.anInt4013 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * -203156379;
		class668.aClass382_8551.aClass536_Sub18_Sub10_4012 = Class198.aClass32_2216.method788((class668.aClass382_8551.anInt4013) * 810974573, (byte) -23);
		class668.aClass382_8551.anIntArray4014 = new int[class668.aClass382_8551.aClass536_Sub18_Sub10_4012.method10714(426108405)];
	}
}

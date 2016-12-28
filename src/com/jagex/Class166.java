/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class166 {
	public static final int anInt1840 = 8191;
	public Class703 aClass703_1841 = new Class703();
	static IComponentDefinitions aClass251_1842;

	static final void method1994(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class524.method6409(class251, class234, class668, 2003687979);
	}

	static final void method1995(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class320.method4244(class251, class234, class668, 637295437);
	}

	static final void method1996(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_2_);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class251.text;
	}

	public static String method1997(String string, byte i) {
		int i_3_ = string.length();
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			char c = string.charAt(i_5_);
			if (c == '<' || c == '>')
				i_4_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_4_ + i_3_);
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
			char c = string.charAt(i_6_);
			if ('<' == c)
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	static final void method1998(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2711 * -1484799213;
	}

	public static void method1999(Canvas canvas, int i) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}
}

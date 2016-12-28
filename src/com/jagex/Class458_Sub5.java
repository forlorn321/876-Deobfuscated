/* Class458_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

final class Class458_Sub5 extends Class458 {
	static Class143[] aClass143Array10338;

	Class458_Sub5(Class648 class648, int i, boolean bool, boolean bool_0_) {
		super(class648, i, bool, bool_0_);
	}

	Object method5494(Class153 class153, int i) {
		if (class153.aClass453_1716 == Class453.aClass453_4955)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(-1431273810);
	}

	Object method5495(Class153 class153) {
		if (class153.aClass453_1716 == Class453.aClass453_4955)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(-1641200658);
	}

	Object method5496(Class153 class153) {
		if (class153.aClass453_1716 == Class453.aClass453_4955)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(-133708473);
	}

	static void method9373(int i, byte i_1_) {
		if (ClientSetting.aClass536_Sub40_8843.customCursorSetting.method10165((short) 836) == 0)
			i = -1;
		if (616246675 * client.anInt11085 != i) {
			if (i != -1) {
				Class638 class638 = ((Class638) Class580.aClass34_Sub19_7695.method70(i, (byte) -22));
				Class179 class179 = class638.method7645((byte) 3);
				if (class179 != null) {
					Class285.aClass517_3192.setcustomcursor(Class399.aCanvas4127, class179.method2643(true), class179.method2640(), class179.method2671(), new Point(class638.anInt8304 * -896197771, -1951713427 * class638.anInt8305));
					client.anInt11085 = i * -1031276389;
				} else
					i = -1;
			}
			if (-1 == i && client.anInt11085 * 616246675 != -1) {
				Class285.aClass517_3192.setcustomcursor(Class399.aCanvas4127, null, -1, -1, new Point());
				client.anInt11085 = 1031276389;
			}
		}
	}

	static final void method9374(Class668 class668, int i) {
		ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.customCursorSetting, (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) != 0 ? 1 : 0, (byte) 1);
		Class27.method763(2012497437);
	}

	static final void method9375(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ItemDefinitions class1 = (ItemDefinitions) Class111.aClass34_Sub13_1391.method70(i_2_, (byte) -76);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class1.aBool84 ? 1 : 0;
	}
}

/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class157 {
	public int anInt1722;
	public static Class157 aClass157_1723;
	public static Class157 aClass157_1724;
	public static Class157 aClass157_1725;
	public static Class157 aClass157_1726;
	public static Class157 aClass157_1727;
	public static Class157 aClass157_1728 = new Class157(6, 3);
	static Class157 aClass157_1729;
	public int anInt1730;
	public static Class157 aClass157_1731;
	static Class157 aClass157_1732;
	public static Class157 aClass157_1733;

	Class157(int i, int i_0_) {
		anInt1730 = i * -450006189;
		anInt1722 = i_0_ * -369884177;
	}

	static {
		aClass157_1723 = new Class157(1, 4);
		aClass157_1724 = new Class157(5, 1);
		aClass157_1725 = new Class157(8, 1);
		aClass157_1726 = new Class157(4, 2);
		aClass157_1727 = new Class157(7, 1);
		aClass157_1732 = new Class157(0, 3);
		aClass157_1729 = new Class157(9, 4);
		aClass157_1733 = new Class157(3, 1);
		aClass157_1731 = new Class157(2, 1);
	}

	public static final boolean method2559(char c, byte i) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c || c >= '[' && c <= '_' || c >= '{');
	}

	static final void method2560(int i) {
		Class32.aLong321 = -2730100241404364287L;
		Class32.aLong304 = 0L;
		Class32.anInt274 = 1833818503;
	}

	static final void method2561(int i, int i_1_, int i_2_, byte i_3_) {
		String string = new StringBuilder().append("tele ").append(i).append(Class33.aString325).append(i_1_ >> 6).append(Class33.aString325).append(i_2_ >> 6).append(Class33.aString325).append(i_1_ & 0x3f).append(Class33.aString325).append(i_2_ & 0x3f).toString();
		System.out.println(string);
		Class29.method868(string, true, false, -65185715);
	}

	static void method2562(int i) {
		synchronized (Class642.aQueue8341) {
			Point point;
			if (Class451.aCanvas4939.isShowing())
				point = Class451.aCanvas4939.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) Class642.aQueue8341.poll();
				if (null == class527_sub34_sub1)
					break;
				if (point == null || !Class451.aCanvas4939.isShowing() || !Class333.aBool3628)
					class527_sub34_sub1.method16363(182953128);
				else {
					class527_sub34_sub1.method18363(point, -1946613323);
					if (!class527_sub34_sub1.method18367(788762965) && (class527_sub34_sub1.method16356(1319623125) < -1803844265 * Class289.anInt3223) && (class527_sub34_sub1.method16357(719777205) < Class611.anInt8009 * -471480167) && class527_sub34_sub1.method16356(1319623125) >= 0 && class527_sub34_sub1.method16357(719777205) >= 0) {
						int i_4_ = class527_sub34_sub1.method16355(1029210433);
						if (class527_sub34_sub1.method16355(1029210433) == -1)
							Class642.aClass639_Sub2_8345.method10605(class527_sub34_sub1, -1553373411);
						else if (Class465_Sub5.method16026(i_4_, (byte) -20))
							Class642.aClass639_Sub2_8345.method16974(class527_sub34_sub1, -687096558);
					}
				}
			}
		}
	}

	static final boolean method2563(Class24_Sub6 class24_sub6, int i, int i_5_, int i_6_) {
		Class602 class602 = (Class602) class24_sub6.method81(i, 940169840);
		if (i_5_ == 11)
			i_5_ = 10;
		if (i_5_ >= 5 && i_5_ <= 8)
			i_5_ = 4;
		return class602.method9958(i_5_, 775441102);
	}
}

/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class402 implements Interface75 {
	static Class402 aClass402_4191;
	static Class402 aClass402_4192;
	static Class402 aClass402_4193 = new Class402(0, -1, true, false, true);
	static Class402 aClass402_4194;
	static Class402 aClass402_4195;
	static Class402 aClass402_4196;
	static Class402 aClass402_4197;
	static Class402 aClass402_4198;
	static Class402 aClass402_4199;
	int anInt4200;
	public int anInt4201;
	public boolean aBool4202;
	public boolean aBool4203;
	public static Class397 aClass397_4204;

	public static Class402[] method4922(int i) {
		return (new Class402[] { aClass402_4191, aClass402_4194, aClass402_4193, aClass402_4197, aClass402_4198, aClass402_4195, aClass402_4199, aClass402_4192, aClass402_4196 });
	}

	public int method78() {
		return -154962505 * anInt4200;
	}

	static {
		aClass402_4192 = new Class402(1, 0, true, true, true);
		aClass402_4199 = new Class402(2, 1, true, true, false);
		aClass402_4194 = new Class402(3, 8, false, true, true);
		aClass402_4191 = new Class402(4, 9, false, false, true);
		aClass402_4198 = new Class402(5, 10, false, true, true);
		aClass402_4196 = new Class402(6, 11, false, false, true);
		aClass402_4197 = new Class402(7, 12, false, false, true);
		aClass402_4195 = new Class402(8, 13, false, false, true);
	}

	public int method12() {
		return -154962505 * anInt4200;
	}

	Class402(int i, int i_0_, boolean bool, boolean bool_1_, boolean bool_2_) {
		anInt4200 = -1705609209 * i;
		anInt4201 = 1363030175 * i_0_;
		aBool4202 = bool_1_;
		aBool4203 = bool_2_;
	}

	public int method73() {
		return -154962505 * anInt4200;
	}

	static int[] method4923(Class536_Sub18_Sub9 class536_sub18_sub9, int i) {
		int[] is = null;
		if (Class432.method5189(-517484763 * class536_sub18_sub9.anInt11718, (short) 352))
			is = ((Class1) (Class111.aClass34_Sub13_1391.method70((int) (9092992429781309163L * class536_sub18_sub9.aLong11711), (byte) -28))).anIntArray80;
		else if (class536_sub18_sub9.anInt11710 * 245161179 != -1)
			is = ((Class1) (Class111.aClass34_Sub13_1391.method70(245161179 * class536_sub18_sub9.anInt11710, (byte) 24))).anIntArray80;
		else if (Class465.method5668((class536_sub18_sub9.anInt11718 * -517484763), (byte) -23)) {
			Class536_Sub13 class536_sub13 = ((Class536_Sub13) (client.aClass4_11050.method556((long) (int) (9092992429781309163L * class536_sub18_sub9.aLong11711))));
			if (null != class536_sub13) {
				Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class536_sub13.anObject10468);
				Class296 class296 = class649_sub1_sub5_sub1_sub1.aClass296_12174;
				if (class296.anIntArray3304 != null)
					class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -42);
				if (class296 != null)
					is = class296.anIntArray3297;
			}
		} else if (Class381.method4817((-517484763 * class536_sub18_sub9.anInt11718), 1753208976)) {
			Class612 class612 = ((Class612) (client.aClass515_11066.method6280(-1073841494).method70((int) ((class536_sub18_sub9.aLong11711 * 9092992429781309163L) >>> 32 & 0x7fffffffL), (byte) 41)));
			if (class612.anIntArray7988 != null)
				class612 = class612.method7293(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) 97);
			if (null != class612)
				is = class612.anIntArray8004;
		}
		return is;
	}

	public static Class234 method4924(int i, int i_3_) {
		return Class463.aClass234Array5227[i >> 16];
	}

	static void method4925(Class234 class234, InterfaceDefinitions class251, byte i) {
		if (class251 != null) {
			if (-1 != -809980533 * class251.anInt2546) {
				InterfaceDefinitions class251_4_ = (class234.aClass251Array2378[class251.anInt2577 * -1940204141 & 0xffff]);
				if (null != class251_4_) {
					if (class251_4_.aClass251Array2726 == class251_4_.aClass251Array2725) {
						class251_4_.aClass251Array2726 = (new InterfaceDefinitions[class251_4_.aClass251Array2725.length]);
						class251_4_.aClass251Array2726[0] = class251;
						Class687.method8116(class251_4_.aClass251Array2725, 0, class251_4_.aClass251Array2726, 1, class251.anInt2546 * -809980533);
						Class687.method8116(class251_4_.aClass251Array2725, -809980533 * class251.anInt2546 + 1, class251_4_.aClass251Array2726, class251.anInt2546 * -809980533 + 1, (class251_4_.aClass251Array2725.length - -809980533 * class251.anInt2546 - 1));
					} else {
						int i_5_ = 0;
						InterfaceDefinitions[] class251s;
						for (class251s = class251_4_.aClass251Array2726; (i_5_ < class251s.length && class251 != class251s[i_5_]); i_5_++) {
							/* empty */
						}
						if (i_5_ < class251s.length) {
							Class687.method8116(class251s, 0, class251s, 1, i_5_);
							class251s[0] = class251;
						}
					}
				}
			} else {
				InterfaceDefinitions[] class251s = class234.method3338(2011307086);
				int i_6_;
				for (i_6_ = 0; i_6_ < class251s.length && class251s[i_6_] != class251; i_6_++) {
					/* empty */
				}
				if (i_6_ < class251s.length) {
					Class687.method8116(class251s, 0, class251s, 1, i_6_);
					class251s[0] = class251;
				}
			}
		}
	}

	static final void method4926(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class657.method7947(class251, class234, class668, 1983868557);
	}

	static final void method4927(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		InterfaceDefinitions class251_7_ = Class648.method7834(class234, class251, -16777216);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251_7_ == null ? -1 : class251_7_.anInt2559 * -1591767037;
	}

	static final void method4928(Class668 class668, int i) {
		int i_8_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub29_10752.method8348(i_8_, -1102005131);
	}

	static boolean method4929(Interface66 interface66, Class536_Sub31 class536_sub31, int i) {
		return (null != interface66 && interface66.method422(class536_sub31, client.anInterface63Array11037, client.anInt11036 * -1621465757, Class331_Sub2.aClass549_10049, 640625295));
	}
}

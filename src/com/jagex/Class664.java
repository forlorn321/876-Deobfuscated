/* Class664 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Locale;

public class Class664 implements Interface75 {
	public static Class664 aClass664_8516;
	String aString8517;
	public static final int anInt8518 = 7;
	public static Class664 aClass664_8519;
	static Class664 aClass664_8520;
	public static Class664 aClass664_8521;
	public static Class664 aClass664_8522;
	String aString8523;
	public static Class664 aClass664_8524 = new Class664("EN", "en", "English", Class678.aClass678_8619, 0, "GB");
	public static Class664 aClass664_8525 = new Class664("DE", "de", "German", Class678.aClass678_8619, 1, "DE");
	public int anInt8526;
	Locale aLocale8527;
	static Class664[] aClass664Array8528;

	Class664(String string, String string_0_, String string_1_, Class678 class678, int i, String string_2_) {
		aString8523 = string;
		aString8517 = string_0_;
		anInt8526 = -980324837 * i;
		if (null != string_2_)
			aLocale8527 = new Locale(string_0_.substring(0, 2), string_2_);
		else
			aLocale8527 = new Locale(string_0_.substring(0, 2));
	}

	public int method78() {
		return anInt8526 * -1919173613;
	}

	public String method7988() {
		return method7992(1867269829).toLowerCase(Locale.ENGLISH);
	}

	public static Class664 method7989(int i, int i_3_) {
		if (i < 0 || i >= aClass664Array8528.length)
			return null;
		return aClass664Array8528[i];
	}

	static final void method7990(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_4_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_4_ >> 16];
		Class204.method2933(class251, class234, class668, 177738722);
	}

	static {
		aClass664_8516 = new Class664("FR", "fr", "French", Class678.aClass678_8619, 2, "FR");
		aClass664_8519 = new Class664("PT", "pt", "Portuguese", Class678.aClass678_8619, 3, "BR");
		aClass664_8520 = new Class664("NL", "nl", "Dutch", Class678.aClass678_8613, 4, "NL");
		aClass664_8521 = new Class664("ES", "es", "Spanish", Class678.aClass678_8613, 5, "ES");
		aClass664_8522 = new Class664("ES_MX", "es-mx", "Spanish (Latin American)", Class678.aClass678_8619, 6, "MX");
		Class664[] class664s = method7995((byte) 17);
		aClass664Array8528 = new Class664[class664s.length];
		Class664[] class664s_5_ = class664s;
		for (int i = 0; i < class664s_5_.length; i++) {
			Class664 class664 = class664s_5_[i];
			if (null != aClass664Array8528[class664.anInt8526 * -1919173613])
				throw new IllegalStateException();
			aClass664Array8528[-1919173613 * class664.anInt8526] = class664;
		}
	}

	public int method12() {
		return anInt8526 * -1919173613;
	}

	public int method73() {
		return anInt8526 * -1919173613;
	}

	public Locale method7991(byte i) {
		return aLocale8527;
	}

	String method7992(int i) {
		return aString8517;
	}

	public String method7993() {
		return method7992(1867269829).toLowerCase(Locale.ENGLISH);
	}

	public String toString() {
		return method7992(1867269829).toLowerCase(Locale.ENGLISH);
	}

	public String method7994() {
		return method7992(1867269829).toLowerCase(Locale.ENGLISH);
	}

	public static Class664[] method7995(byte i) {
		return new Class664[] { aClass664_8516, aClass664_8525, aClass664_8521, aClass664_8519, aClass664_8524, aClass664_8520, aClass664_8522 };
	}

	static final void method7996(Class668 class668, int i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_6_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_6_ >> 16];
		Class194.method2853(class251, class234, class668, (short) 2903);
	}

	static final void method7997(int i) {
		for (Class536_Sub18_Sub8 class536_sub18_sub8 = ((Class536_Sub18_Sub8) client.aClass708_11174.method8308(1867269829)); class536_sub18_sub8 != null; class536_sub18_sub8 = ((Class536_Sub18_Sub8) client.aClass708_11174.method8311(1934650678))) {
			Class649_Sub1_Sub5_Sub6 class649_sub1_sub5_sub6 = class536_sub18_sub8.aClass649_Sub1_Sub5_Sub6_11696;
			if (client.anInt11014 > 668402135 * class649_sub1_sub5_sub6.anInt12140) {
				class536_sub18_sub8.method6484(924692066);
				class649_sub1_sub5_sub6.method11048(2140220787);
			} else if (client.anInt11014 >= class649_sub1_sub5_sub6.anInt12139 * -861810539) {
				class649_sub1_sub5_sub6.method11054(219909430);
				if (class649_sub1_sub5_sub6.anInt12144 * -2056997773 > 0) {
					if (client.anInt11074 * 1542697723 == 4) {
						Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[(class649_sub1_sub5_sub6.anInt12144 * -2056997773) - 1].method2804(2108267828);
						if (null != class649_sub1_sub5_sub1) {
							Class436 class436 = (class649_sub1_sub5_sub1.method7837().aClass436_4823);
							if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < client.aClass515_11066.method6321((byte) -27) * 512) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < client.aClass515_11066.method6243(177401017) * 512))
								class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, ((Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, class649_sub1_sub5_sub1.aByte10839, 1882249542)) - -856318621 * (class649_sub1_sub5_sub6.anInt12155)), client.anInt11014, -1406563924);
						}
					} else {
						Class536_Sub13 class536_sub13 = ((Class536_Sub13) (client.aClass4_11050.method556((long) ((-2056997773 * class649_sub1_sub5_sub6.anInt12144) - 1))));
						if (null != class536_sub13) {
							Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class536_sub13.anObject10468);
							Class436 class436 = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
							if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < client.aClass515_11066.method6321((byte) -31) * 512) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < client.aClass515_11066.method6243(177401017) * 512))
								class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, ((Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, class649_sub1_sub5_sub6.aByte10839, 1881925281)) - (class649_sub1_sub5_sub6.anInt12155 * -856318621)), client.anInt11014, -1128511194);
						}
					}
				}
				if (-2056997773 * class649_sub1_sub5_sub6.anInt12144 < 0) {
					int i_7_ = (-(class649_sub1_sub5_sub6.anInt12144 * -2056997773) - 1);
					Player class649_sub1_sub5_sub1_sub2;
					if (-1791435655 * client.anInt11156 == i_7_)
						class649_sub1_sub5_sub1_sub2 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
					else
						class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_7_]);
					if (class649_sub1_sub5_sub1_sub2 != null) {
						Class436 class436 = (class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
						if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < client.aClass515_11066.method6321((byte) 117) * 512) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < (client.aClass515_11066.method6243(177401017) * 512)))
							class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, (Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub6.aByte10839), 1857285973) - (class649_sub1_sub5_sub6.anInt12155 * -856318621)), client.anInt11014, -2028781166);
					}
				}
				class649_sub1_sub5_sub6.method11047(client.anInt11180 * -1483561311, (byte) -81);
				client.aClass515_11066.method6249(-1637543021).method6711(class649_sub1_sub5_sub6, true, 744221598);
			}
		}
	}

	static final void method7998(Class668 class668, int i) {
		int i_8_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_8_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_8_ >> 16];
		Class200.method2914(class251, class234, class668, 65280);
	}
}

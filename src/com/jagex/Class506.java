/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;

public class Class506 {
	static Class603_Sub1[] aClass603_Sub1Array6890;

	Class506() throws Throwable {
		throw new Error();
	}

	public static void method6138(boolean bool) {
		Class184_Sub2.aClass211_9442.method2987((short) 18356);
		if (Class426.method5129(-708374433 * client.anInt11101, 1603352511)) {
			Class106[] class106s = client.aClass106Array11062;
			for (int i = 0; i < class106s.length; i++) {
				Class106 class106 = class106s[i];
				class106.anInt1265 += -768200239;
				if (-1086863567 * class106.anInt1265 < 50 && !bool)
					return;
				class106.anInt1265 = 0;
				if (!class106.aBool1266 && class106.method1413((short) 23212) != null) {
					Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4521, class106.aClass15_1258, 870919099);
					class106.method1409(class536_sub23, 567910352);
					try {
						class106.method1408(1193199381);
					} catch (IOException ioexception) {
						class106.aBool1266 = true;
					}
				}
			}
			Class184_Sub2.aClass211_9442.method2987((short) 16497);
		}
	}

	public static void method6139(boolean bool) {
		Class184_Sub2.aClass211_9442.method2987((short) 15850);
		if (Class426.method5129(-708374433 * client.anInt11101, 1603352511)) {
			Class106[] class106s = client.aClass106Array11062;
			for (int i = 0; i < class106s.length; i++) {
				Class106 class106 = class106s[i];
				class106.anInt1265 += -768200239;
				if (-1086863567 * class106.anInt1265 < 50 && !bool)
					return;
				class106.anInt1265 = 0;
				if (!class106.aBool1266 && class106.method1413((short) 27043) != null) {
					Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4521, class106.aClass15_1258, 1835719208);
					class106.method1409(class536_sub23, -338312800);
					try {
						class106.method1408(1396312959);
					} catch (IOException ioexception) {
						class106.aBool1266 = true;
					}
				}
			}
			Class184_Sub2.aClass211_9442.method2987((short) 20426);
		}
	}

	public static void method6140(boolean bool) {
		Class184_Sub2.aClass211_9442.method2987((short) 17099);
		if (Class426.method5129(-708374433 * client.anInt11101, 1603352511)) {
			Class106[] class106s = client.aClass106Array11062;
			for (int i = 0; i < class106s.length; i++) {
				Class106 class106 = class106s[i];
				class106.anInt1265 += -768200239;
				if (-1086863567 * class106.anInt1265 < 50 && !bool)
					return;
				class106.anInt1265 = 0;
				if (!class106.aBool1266 && class106.method1413((short) -12124) != null) {
					Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4521, class106.aClass15_1258, 1116261277);
					class106.method1409(class536_sub23, 1691947664);
					try {
						class106.method1408(304757111);
					} catch (IOException ioexception) {
						class106.aBool1266 = true;
					}
				}
			}
			Class184_Sub2.aClass211_9442.method2987((short) 26312);
		}
	}

	static final void method6141(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class542.method6563(i_0_);
		if (class536_sub18_sub14 == null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 626267709 * class536_sub18_sub14.anInt11766;
	}

	static void method6142(int i, int i_1_, int i_2_, int i_3_, boolean bool, byte i_4_) {
		if (Class707.aBool8822 && Class223.aFrame2336 != null && (3 != i_1_ || 698322721 * Class516.anInt7040 != i_2_ || Class114.anInt1412 * -201071885 != i_3_)) {
			Class310.method4176(Class464.aClass691_5228, Class223.aFrame2336, (byte) -3);
			Class223.aFrame2336 = null;
		}
		if (Class707.aBool8822 && 3 == i_1_ && Class223.aFrame2336 == null) {
			Class223.aFrame2336 = Class252.method3521(Class464.aClass691_5228, i_2_, i_3_, 0, 0, (byte) 3);
			if (Class223.aFrame2336 != null) {
				Class516.anInt7040 = -1776241439 * i_2_;
				Class114.anInt1412 = i_3_ * 1297286715;
				Class27.method763(1868857753);
			}
		}
		if (3 == i_1_ && (!Class707.aBool8822 || Class223.aFrame2336 == null))
			method6142(i, Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-404983866), -1, -1, true, (byte) -121);
		else {
			Container container = Class300.method4022((byte) 0);
			if (null != Class223.aFrame2336) {
				Class500.anInt6841 = i_2_ * -186574765;
				Class313.anInt3499 = i_3_ * 558289937;
			} else if (Class145.aFrame1692 != null) {
				Insets insets = Class145.aFrame1692.getInsets();
				Class500.anInt6841 = (Class145.aFrame1692.getSize().width - (insets.right + insets.left)) * -186574765;
				Class313.anInt3499 = (Class145.aFrame1692.getSize().height - (insets.top + insets.bottom)) * 558289937;
			} else {
				Class500.anInt6841 = container.getSize().width * -186574765;
				Class313.anInt3499 = container.getSize().height * 558289937;
			}
			if (Class500.anInt6841 * 569699291 <= 0)
				Class500.anInt6841 = -186574765;
			if (Class313.anInt3499 * 160996593 <= 0)
				Class313.anInt3499 = 558289937;
			if (1 != i_1_)
				Class521.method6359((byte) 2);
			else {
				Class144.anInt1679 = client.anInt11152 * -1243488649;
				client.anInt6887 = -257990163 * ((Class500.anInt6841 * 569699291 - client.anInt11152 * -125739413) / 2);
				Class34_Sub6.anInt10965 = 1249541775 * client.anInt11153;
				client.anInt6863 = 0;
			}
			if (Class47.aClass678_578 != Class678.aClass678_8619 && -1804846931 * Class144.anInt1679 < 1024 && 589116499 * Class34_Sub6.anInt10965 >= 768) {
				/* empty */
			}
			if (!bool) {
				Class399.aCanvas4127.setSize(Class144.anInt1679 * -1804846931, (Class34_Sub6.anInt10965 * 589116499));
				Class677.aClass167_8609.method2027(Class399.aCanvas4127, -1804846931 * Class144.anInt1679, 589116499 * Class34_Sub6.anInt10965, 1429395066);
				if (Class145.aFrame1692 == container) {
					Insets insets = Class145.aFrame1692.getInsets();
					Class399.aCanvas4127.setLocation(insets.left + 1509041125 * client.anInt6887, client.anInt6863 * -1413419225 + insets.top);
				} else
					Class399.aCanvas4127.setLocation((1509041125 * client.anInt6887), (-1413419225 * client.anInt6863));
			} else
				Class388.method4851(903312958);
			if (i_1_ >= 2)
				client.aBool11244 = true;
			else
				client.aBool11244 = false;
			Class698.method8234(-2111356122);
			if (-1 != -1959825479 * client.anInt11187)
				Class325_Sub1.method9206(true, 877401953);
			if (Class536_Sub41.method9871(2077853800).method1413((short) -3518) != null && (Class426.method5129(client.anInt11101 * -708374433, 1603352511) || Class233.method3334(client.anInt11101 * -708374433, (byte) -15)))
				Class30.method781(Class536_Sub41.method9871(2077853800), (byte) 79);
			for (int i_5_ = 0; i_5_ < 106; i_5_++)
				client.aBoolArray11240[i_5_] = true;
			client.aBool6889 = true;
		}
	}

	static int method6143(int i) {
		return 13;
	}

	public static final void method6144(int i) {
		if (0 != -129171495 * Class61.anInt680) {
			Class586.aClass106_7710.method1418(-1344195006);
			Class116.method1485(-510389163);
			Class314.method4203(861456321);
		}
	}

	static final void method6145(Class668 class668, byte i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class85.method1187(i_6_, 2060471582);
	}

	public static Class567 method6146(Socket socket, int i, byte i_7_) throws IOException {
		return new Class567_Sub1(socket, i);
	}
}

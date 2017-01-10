/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;

public class Class49 {
	static Class199 aClass199_580 = new Class199(32);

	Class49() throws Throwable {
		throw new Error();
	}

	public static void method917() {
		synchronized (aClass199_580) {
			aClass199_580.method2884((byte) -72);
		}
	}

	static void method918(int i) {
		Class588.anInt7740 = 254753283 * i;
		synchronized (aClass199_580) {
			aClass199_580.method2884((byte) -29);
		}
	}

	static void method919(int i) {
		synchronized (aClass199_580) {
			aClass199_580.method2883(i, -1782458201);
		}
	}

	static void method920(int i) {
		synchronized (aClass199_580) {
			aClass199_580.method2883(i, -2008938578);
		}
	}

	static void method921(int i) {
		synchronized (aClass199_580) {
			aClass199_580.method2883(i, -1435330292);
		}
	}

	static void method922() {
		synchronized (aClass199_580) {
			aClass199_580.method2892(-18510819);
		}
	}

	static void method923() {
		synchronized (aClass199_580) {
			aClass199_580.method2892(-1356514973);
		}
	}

	static final void method924(Class668 class668, int i) {
		Class532.method6442(class668, 1080859922);
	}

	static final void method925(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.loadingScreenTypeSetting.method10186(-957266183);
	}

	static void method926(byte i) {
		Class331_Sub2.aClass549_10049.method6648(1618181823);
		Class329.aClass550_3601.method6654((byte) 28);
		Class313.aclient3500.method6080((byte) 35);
		Class399.aCanvas4127.setBackground(Color.black);
		client.anInt11085 = 1031276389;
		Class331_Sub2.aClass549_10049 = Class50.method928(Class399.aCanvas4127, -1497572403);
		Class329.aClass550_3601 = Class34_Sub22.method10370(Class399.aCanvas4127, true, 1567645118);
	}

	public static final void method927(String string, int i) {
		if (null != string) {
			String string_0_ = Class473.method5740(string, Class302.aClass74_3406, (byte) -80);
			if (string_0_ != null) {
				for (int i_1_ = 0; i_1_ < client.anInt11288 * 142551095; i_1_++) {
					Class31 class31 = client.aClass31Array11291[i_1_];
					String string_2_ = class31.aString266;
					String string_3_ = Class473.method5740(string_2_, Class302.aClass74_3406, (byte) -70);
					if (FontRenderer.method2764(string, string_0_, string_2_, string_3_, -850056868)) {
						client.anInt11288 -= 500239751;
						for (int i_4_ = i_1_; i_4_ < 142551095 * client.anInt11288; i_4_++)
							client.aClass31Array11291[i_4_] = client.aClass31Array11291[i_4_ + 1];
						client.anInt11231 = client.anInt11215 * 1286029873;
						Class106 class106 = Class536_Sub41.method9871(2077853800);
						OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4477, class106.aClass15_1258, 1985049189);
						class536_sub23.stream.writeByte(Class555.method6802(string, 577105588));
						class536_sub23.stream.writeString(string);
						class106.writePacket(class536_sub23, 2002805730);
						break;
					}
				}
			}
		}
	}
}

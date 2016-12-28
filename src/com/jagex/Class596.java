/* Class596 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class596 {
	public static final int anInt7821 = 128;
	public static final int anInt7822 = 256;
	public static final int anInt7823 = 512;
	public static final int anInt7824 = 511;
	public static final int anInt7825 = 1024;
	public static final int anInt7826 = 9;
	public static final int anInt7827 = 8;
	public static final int anInt7828 = 2;
	public static final int anInt7829 = 7;
	public static int anInt7830;

	static {
		Math.sqrt(131072.0);
	}

	Class596() throws Throwable {
		throw new Error();
	}

	static final void method7136(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.aByte3704;
	}

	static void method7137(int i, int i_0_, int i_1_, Class536_Sub6 class536_sub6, int i_2_) {
		long l = (long) (i << 28 | i_1_ << 14 | i_0_);
		Class536_Sub9 class536_sub9 = (Class536_Sub9) client.aClass4_11170.method556(l);
		if (null == class536_sub9) {
			class536_sub9 = new Class536_Sub9();
			client.aClass4_11170.method560(class536_sub9, l);
			class536_sub9.aClass708_10433.method8335(class536_sub6, -472311645);
		} else {
			ItemDefinitions class1 = ((ItemDefinitions) Class111.aClass34_Sub13_1391.method70(((class536_sub6.anInt10419) * 1696543099), (byte) 103));
			int i_3_ = -680425497 * class1.value;
			if (1 == -1370184373 * class1.stackable)
				i_3_ *= 1 + 1740996619 * class536_sub6.anInt10420;
			for (Class536_Sub6 class536_sub6_4_ = ((Class536_Sub6) class536_sub9.aClass708_10433.method8308(1867269829)); class536_sub6_4_ != null; class536_sub6_4_ = (Class536_Sub6) class536_sub9.aClass708_10433.method8311(1179924953)) {
				class1 = (ItemDefinitions) (Class111.aClass34_Sub13_1391.method70(1696543099 * class536_sub6_4_.anInt10419, (byte) 39));
				int i_5_ = -680425497 * class1.value;
				if (1 == class1.stackable * -1370184373)
					i_5_ *= 1740996619 * class536_sub6_4_.anInt10420 + 1;
				if (i_3_ > i_5_) {
					Class80.method1163(class536_sub6, class536_sub6_4_, -839091445);
					return;
				}
			}
			class536_sub9.aClass708_10433.method8335(class536_sub6, 877167950);
		}
	}

	public static final void method7138(String string, byte i) {
		if (!string.equals("")) {
			Class106 class106 = Class536_Sub41.method9871(2077853800);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4494, class106.aClass15_1258, 1305482951);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class555.method6802(string, 1271712159));
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
			class106.method1409(class536_sub23, 65370716);
		}
	}
}

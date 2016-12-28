/* Class640 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class640 implements Runnable {
	public static Class143 aClass143_8311;

	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_10855.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_10855 = null;
	}

	public void method7668() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_10855.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_10855 = null;
	}

	static final void method7669(Class668 class668, short i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1] - 1;
		ItemDecoder class1 = (ItemDecoder) Class111.aClass34_Sub13_1391.method70(i_0_, (byte) 37);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class1.method508(i_1_, 1319985609);
	}

	static final void method7670(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_3_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class198.aClass32_2216.method788(i_2_, (byte) 22).anIntArray11724[i_3_]);
	}

	static final void method7671(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int i_4_ = 0;
		if (Class710_Sub30.method10184(string, -1506968299))
			i_4_ = Class392.method4867(string, 39454950);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4462, client.aClass106_11322.aClass15_1258, 1729398461);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(i_4_);
		client.aClass106_11322.method1409(class536_sub23, 1969176895);
	}

	static final void method7672(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aBool11290 ? 1 : 0;
	}

	static String method7673(String string, boolean bool, int i) {
		String string_5_ = bool ? "https://" : "http://";
		if (Class678.aClass678_8611 == Class47.aClass678_578)
			string = new StringBuilder().append(string).append("-wtrc").toString();
		else if (Class678.aClass678_8612 == Class47.aClass678_578)
			string = new StringBuilder().append(string).append("-wtqa").toString();
		else if (Class678.aClass678_8613 == Class47.aClass678_578)
			string = new StringBuilder().append(string).append("-wtwip").toString();
		else if (Class678.aClass678_8615 == Class47.aClass678_578)
			string = new StringBuilder().append(string).append("-wti").toString();
		else if (Class47.aClass678_578 == Class678.aClass678_8618)
			string = new StringBuilder().append(string).append("-demo").toString();
		else if (Class678.aClass678_8616 == Class47.aClass678_578)
			string = "local";
		String string_6_ = "";
		if (null != client.aString10986)
			string_6_ = new StringBuilder().append("/p=").append(client.aString10986).toString();
		String string_7_ = new StringBuilder().append(client.aClass670_11043.aString8573).append(".com").toString();
		return new StringBuilder().append(string_5_).append(string).append(".").append(string_7_).append("/l=").append(-1919173613 * Class459.aClass664_5178.anInt8526).append("/a=").append(client.anInt10987 * 1051867059).append(string_6_).append("/").toString();
	}

	static final void method7674(Class668 class668, byte i) {
		Class184_Sub1.method8644(class668.aClass649_Sub1_Sub5_Sub1_8554, class668, 2147483647);
	}

	static final void method7675(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int i_8_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class41_Sub1.method9625(string, i_8_, -1591767037);
	}

	public static Class433 method7676(int i) {
		Class433 class433 = new Class433();
		class433.method5206(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class433.method5200(f - 128.0F, 0.0F, 0.0F);
		class433.method5214(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class433;
	}
}

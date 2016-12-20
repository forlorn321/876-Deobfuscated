/* Class644 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.Clipboard;

final class Class644 implements Runnable {
	public static Clipboard aClipboard8347;

	public void method10739() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_10869.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_10869 = null;
	}

	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_10869.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_10869 = null;
	}

	public void method10740() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_10869.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_10869 = null;
	}

	public static void method10741(int i, int i_0_, int i_1_) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4497, client.aClass109_11067.aClass2_1367, (byte) 52);
		class527_sub15.buffer.writeIntV1(i, (byte) 7);
		class527_sub15.buffer.writeShortLE128(i_0_, 1607572137);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	static final void method10742(Class527_Sub38_Sub2 class527_sub38_sub2, int i, int i_2_) {
		Class105.anInt1294 = 0;
		Class534.method8955(class527_sub38_sub2, 1911573268);
		Class109.method1980(class527_sub38_sub2, 1665375870);
		if (class527_sub38_sub2.anInt10689 * -441238943 != i)
			throw new RuntimeException(new StringBuilder().append(class527_sub38_sub2.anInt10689 * -441238943).append(" ").append(i).toString());
	}

	public static Class384[] method10743(int i) {
		return (new Class384[] { Class384.aClass384_3947, Class384.aClass384_3948, Class384.aClass384_3949 });
	}
}

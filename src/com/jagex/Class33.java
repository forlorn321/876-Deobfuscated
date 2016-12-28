/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class33 implements Runnable {
	InetAddress anInetAddress285;
	volatile String aString286;

	public String method793(int i) {
		return aString286;
	}

	public void method794() {
		aString286 = anInetAddress285.getHostName();
	}

	public void run() {
		aString286 = anInetAddress285.getHostName();
	}

	Class33(int i) throws UnknownHostException {
		anInetAddress285 = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff), (byte) (i >> 16 & 0xff), (byte) (i >> 8 & 0xff), (byte) (i & 0xff) });
	}

	static final void method795(IComponentDefinitions class251, Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542] - 1;
		if (i_0_ < 0 || i_0_ > 9)
			throw new RuntimeException();
		Class406.method4945(class251, i_0_, class668, 551612438);
	}

	static final Object[] method796(String string, Class668 class668, short i) {
		Object[] objects = new Object[string.length() + 1];
		for (int i_1_ = objects.length - 1; i_1_ >= 1; i_1_--) {
			if (string.charAt(i_1_ - 1) == 's')
				objects[i_1_] = (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
			else if (string.charAt(i_1_ - 1) == 'l')
				objects[i_1_] = new Long(class668.aLongArray8565[((class668.anInt8546 -= 1792517805) * 1346022693)]);
			else
				objects[i_1_] = new Integer(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]);
		}
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (-1 != i_2_)
			objects[0] = new Integer(i_2_);
		else
			objects = null;
		return objects;
	}

	static final void method797(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class500.method6026(class251, class234, class668, 444823483);
	}

	static final void method798(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4473, class106.aClass15_1258, 1335974335);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		int i_4_ = (-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_3_);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(class668.aClass382_8551.anInt4013 * 810974573, -1778059594);
		class668.aClass382_8551.aClass536_Sub18_Sub10_4012.method10711(class536_sub23.aClass536_Sub33_Sub2_10528, class668.aClass382_8551.anIntArray4014, (byte) 0);
		class536_sub23.aClass536_Sub33_Sub2_10528.method9699((-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off - i_4_), 1483827605);
		class106.method1409(class536_sub23, -123569022);
	}

	static final void method799(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class231.method3317(234323744);
	}
}

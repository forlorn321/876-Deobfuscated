/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class442 implements Interface5 {
	Class461 aClass461_4877;

	public Class50 method46() {
		return Class50.aClass50_582;
	}

	public Class50 method45() {
		return Class50.aClass50_582;
	}

	public Class50 method50(byte i) {
		return Class50.aClass50_582;
	}

	public int method47() {
		if (aClass461_4877.method5561(-1376011786))
			return 100;
		return aClass461_4877.method5563(1944979007);
	}

	public int method48(int i) {
		if (aClass461_4877.method5561(-1376011786))
			return 100;
		return aClass461_4877.method5563(1954371199);
	}

	public Class50 method49() {
		return Class50.aClass50_582;
	}

	Class442(Class461 class461) {
		aClass461_4877 = class461;
	}

	static final void method5333(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.aBool2677 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		Class668.method8011(class251, 263642117);
		if (-1 == -809980533 * class251.anInt2546 && !class234.aBool2379)
			Class645_Sub1.method10044(class251.anInt2559 * -1591767037, (short) 15086);
	}

	static final void method5334(Class668 class668, byte i) {
		class668.anInt8544 -= 1946079257;
		class668.anInt8542 -= 61855783;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		boolean bool = 1 == class668.anIntArray8541[1867269829 * class668.anInt8542];
		boolean bool_0_ = (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1] == 1);
		boolean bool_1_ = 1 == (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2]);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4452, client.aClass106_11218.aClass15_1258, 1244265029);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(Class555.method6802(string, -1492239936) + 1, -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		int i_2_ = 0;
		if (bool)
			i_2_ |= 0x1;
		if (bool_0_)
			i_2_ |= 0x2;
		if (bool_1_)
			i_2_ |= 0x4;
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_2_);
		client.aClass106_11218.method1409(class536_sub23, 674054650);
	}

	static final void method5335(byte i) {
		for (Class521_Sub5 class521_sub5 = ((Class521_Sub5) client.aClass695_11131.method8213(-1423263947)); class521_sub5 != null; class521_sub5 = ((Class521_Sub5) client.aClass695_11131.method8213(-1423263947)))
			Class1.method524(class521_sub5, (byte) -60);
		int i_3_ = 0;
		int i_4_ = 3;
		if (1542697723 * client.anInt11074 == 4) {
			for (int i_5_ = i_3_; i_5_ <= i_4_; i_5_++)
				client.method10378(i_5_);
			client.method10380();
		} else {
			client.method10375();
			for (int i_6_ = i_3_; i_6_ <= i_4_; i_6_++) {
				client.method10376();
				client.method10377(i_6_);
				client.method10378(i_6_);
			}
			client.method10379();
			client.method10380();
		}
	}

	static void method5336(byte i) {
		client.aClass106_11218.method1418(-252572010);
		if (-507654277 * Class45.anInt527 < 2) {
			Class23.aClass5_230.method574(1024397715);
			Class45.anInt523 = 0;
			Class45.anInt527 += 632666035;
			Class45.aClass42_525 = Class42.aClass42_508;
		} else {
			Class45.aClass42_525 = null;
			Class45.aClass709_521 = Class709.aClass709_8831;
			Class673.method8026(16, -1798113843);
		}
	}
}

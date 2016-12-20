/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class149 implements Interface76 {
	static Class149 aClass149_1673;
	static Class149 aClass149_1674;
	int anInt1675;
	static Class149 aClass149_1676;
	static Class149 aClass149_1677;
	static Class149 aClass149_1678;
	static Class149 aClass149_1679;
	int anInt1680;
	static Class149 aClass149_1681 = new Class149(1, 1);

	static {
		aClass149_1674 = new Class149(6, 2);
		aClass149_1673 = new Class149(0, 3);
		aClass149_1676 = new Class149(4, 4);
		aClass149_1677 = new Class149(2, 5);
		aClass149_1678 = new Class149(5, 6);
		aClass149_1679 = new Class149(3, 7);
	}

	public int method87() {
		return anInt1675 * 616312963;
	}

	static Class149[] method2489() {
		return new Class149[] { aClass149_1673, aClass149_1679, aClass149_1677, aClass149_1674, aClass149_1681, aClass149_1678, aClass149_1676 };
	}

	public int method42() {
		return anInt1675 * 616312963;
	}

	public int method91() {
		return anInt1675 * 616312963;
	}

	static Class149[] method2490() {
		return new Class149[] { aClass149_1673, aClass149_1679, aClass149_1677, aClass149_1674, aClass149_1681, aClass149_1678, aClass149_1676 };
	}

	Class149(int i, int i_0_) {
		anInt1680 = -1105528949 * i;
		anInt1675 = 1196531243 * i_0_;
	}

	static void method2491(Class243 class243, int i) {
		if (client.aBool11188) {
			if (null != class243.anObjectArray2531) {
				Class243 class243_1_ = Class447.method7260(847840847 * Class275.anInt3157, client.anInt11078 * 968228363, 180499768);
				if (class243_1_ != null) {
					Class527_Sub33 class527_sub33 = new Class527_Sub33();
					class527_sub33.aClass243_10648 = class243;
					class527_sub33.aClass243_10652 = class243_1_;
					class527_sub33.anObjectArray10650 = class243.anObjectArray2531;
					Class491.method7980(class527_sub33, -1769595889);
				}
			}
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4486, client.aClass109_11067.aClass2_1367, (byte) 34);
			class527_sub15.buffer.writeShortLE2(1504620761 * client.anInt11190, (byte) -21);
			class527_sub15.buffer.writeShort128(-437471887 * class243.anInt2572, 975904654);
			class527_sub15.buffer.writeIntV1(class243.anInt2504 * -254728301, (byte) 7);
			class527_sub15.buffer.writeIntV1(Class275.anInt3157 * 847840847, (byte) 7);
			class527_sub15.buffer.writeShortLE2(-927924265 * class243.anInt2675, (byte) -98);
			class527_sub15.buffer.writeShort(client.anInt11078 * 968228363, 1404835786);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	public static void method2492(int[] is, int[] is_2_, int i, int i_3_, int i_4_) {
		if (i < i_3_) {
			int i_5_ = (i_3_ + i) / 2;
			int i_6_ = i;
			int i_7_ = is[i_5_];
			is[i_5_] = is[i_3_];
			is[i_3_] = i_7_;
			int i_8_ = is_2_[i_5_];
			is_2_[i_5_] = is_2_[i_3_];
			is_2_[i_3_] = i_8_;
			int i_9_ = 2147483647 == i_7_ ? 0 : 1;
			for (int i_10_ = i; i_10_ < i_3_; i_10_++) {
				if (is[i_10_] < (i_10_ & i_9_) + i_7_) {
					int i_11_ = is[i_10_];
					is[i_10_] = is[i_6_];
					is[i_6_] = i_11_;
					int i_12_ = is_2_[i_10_];
					is_2_[i_10_] = is_2_[i_6_];
					is_2_[i_6_++] = i_12_;
				}
			}
			is[i_3_] = is[i_6_];
			is[i_6_] = i_7_;
			is_2_[i_3_] = is_2_[i_6_];
			is_2_[i_6_] = i_8_;
			method2492(is, is_2_, i, i_6_ - 1, -1335712316);
			method2492(is, is_2_, i_6_ + 1, i_3_, 182040303);
		}
	}

	public static final void method2493(boolean bool, byte i) {
		Class109[] class109s = client.aClass109Array11068;
		for (int i_13_ = 0; i_13_ < class109s.length; i_13_++) {
			Class109 class109 = class109s[i_13_];
			try {
				class109.method1954(-1196803915);
			} catch (IOException ioexception) {
				/* empty */
			}
			class109.method1968((byte) 107);
		}
		Class106.method1886(262144);
		IncomingPacket.method6721(753843098);
		Class32.method942(false, -575157564);
		client.aClass509_11072.method8303(139289945);
		client.aClass509_11072.method8302((byte) 1);
		client.aClass509_11072.method8392(-183127866);
		Class592.method9876((byte) -1);
		Class258.method4741(-26533978);
		Class93.method1672(true, 1492314540);
		Class527_Sub16.method16164((byte) -38);
		Class666.method13742(1843826571);
		client.anInt11070 = -46813759;
		if (bool)
			Class78.method1560(4, (byte) 0);
		else {
			Class78.method1560(16, (byte) 0);
			try {
				Class60.method1375(Class212.anApplet2258, "loggedout", 889345034);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	public static void method2494(int i, int i_14_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(6, (long) i);
		class527_sub8_sub9.method18186(1363279944);
	}
}

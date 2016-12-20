/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class278 {
	byte[] aByteArray3167;
	int anInt3168;

	String method5157(int i) {
		int i_0_ = method5158((byte) 44);
		if (-1 == i_0_)
			return null;
		if (i_0_ > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray3167, anInt3168 * -584359025, i_0_);
		anInt3168 += i_0_ * -546022545;
		return string;
	}

	int method5158(byte i) {
		short i_1_ = 0;
		for (int i_2_ = 0; i_2_ < 2; i_2_++)
			i_1_ |= (aByteArray3167[(anInt3168 += -546022545) * -584359025 - 1] & 0xff) << 8 * i_2_;
		return i_1_;
	}

	String method5159() {
		int i = method5158((byte) 4);
		if (-1 == i)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray3167, anInt3168 * -584359025, i);
		anInt3168 += i * -546022545;
		return string;
	}

	int method5160() {
		short i = 0;
		for (int i_3_ = 0; i_3_ < 2; i_3_++)
			i |= (aByteArray3167[(anInt3168 += -546022545) * -584359025 - 1] & 0xff) << 8 * i_3_;
		return i;
	}

	Class278(byte[] is) {
		aByteArray3167 = is;
		anInt3168 = 0;
	}

	String method5161() {
		int i = method5158((byte) 83);
		if (-1 == i)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray3167, anInt3168 * -584359025, i);
		anInt3168 += i * -546022545;
		return string;
	}

	String method5162() {
		int i = method5158((byte) 39);
		if (-1 == i)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray3167, anInt3168 * -584359025, i);
		anInt3168 += i * -546022545;
		return string;
	}

	static Class574[] method5163(int i) {
		return (new Class574[] { Class574.aClass574_7632, Class574.aClass574_7634, Class574.aClass574_7633 });
	}

	public static Class595[] method5164(byte i) {
		return (new Class595[] { Class595.aClass595_7814, Class595.aClass595_7816, Class595.aClass595_7815 });
	}

	public static void method5165(String string, byte i) {
		if (client.aBool11188 && 0 != (Class477.anInt5388 * -1182072537 & 0x18)) {
			boolean bool = false;
			int i_4_ = 351100807 * Class105.anInt1300;
			int[] is = Class105.anIntArray1301;
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_5_]];
				if (class640_sub1_sub2_sub1_sub2.aString12179 != null && class640_sub1_sub2_sub1_sub2.aString12179.equalsIgnoreCase(string) && (((class640_sub1_sub2_sub1_sub2 == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) && 0 != (Class477.anInt5388 * -1182072537 & 0x10)) || 0 != (-1182072537 * Class477.anInt5388 & 0x8))) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4469, (client.aClass109_11067.aClass2_1367), (byte) -11);
					class527_sub15.buffer.writeShort128(client.anInt11078 * 968228363, 1187636815);
					class527_sub15.buffer.writeByte128(0, -362087053);
					class527_sub15.buffer.writeIntV1(Class275.anInt3157 * 847840847, (byte) 7);
					class527_sub15.buffer.writeShortLE2(client.anInt11190 * 1504620761, (byte) -7);
					class527_sub15.buffer.writeShortLE2(is[i_5_], (byte) -54);
					client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					Class388.method6457((class640_sub1_sub2_sub1_sub2.anIntArray11902[0]), (class640_sub1_sub2_sub1_sub2.anIntArray11944[0]), 465480290);
					bool = true;
					break;
				}
			}
			if (!bool)
				Class236.method4363(4, new StringBuilder().append(Class53.aClass53_654.method1290(Class144_Sub1.aClass671_8995, (byte) -97)).append(string).toString(), -2012116524);
			if (client.aBool11188)
				Class700.method14291(-459891374);
		}
	}

	static final void method5166(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool11172 ? 1 : 0;
	}

	public static void method5167(int i) {
		Class578.method9646(1436830330);
	}
}

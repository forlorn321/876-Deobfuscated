/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class54 {
	static GraphicalRenderer aClass167_600;
	static FontRenderer aClass184_601;
	static Class708 aClass708_602 = new Class708();

	Class54() throws Throwable {
		throw new Error();
	}

	static boolean method942(int i) {
		if (Class482.method5837(-708374433 * client.anInt11101, 498166073))
			return false;
		return true;
	}

	public static final void method943(byte i) {
		if (!client.aBool10999) {
			client.aFloat11107 += (-24.0F - client.aFloat11107) / 2.0F;
			client.aBool11242 = true;
			client.aBool10999 = true;
		}
	}

	public static final int method944(int i, int i_0_, int i_1_, int i_2_) {
		if (client.aClass515_11066.method6249(507599826) == null)
			return 0;
		int i_3_ = i >> 9;
		int i_4_ = i_0_ >> 9;
		if (i_3_ < 0 || i_4_ < 0 || i_3_ > client.aClass515_11066.method6321((byte) 5) - 1 || i_4_ > client.aClass515_11066.method6243(177401017) - 1)
			return 0;
		int i_5_ = i_1_;
		if (i_5_ < 3 && ((client.aClass515_11066.method6251(1372136609).aByteArrayArrayArray5154[1][i_3_][i_4_]) & 0x2) != 0)
			i_5_++;
		return client.aClass515_11066.method6249(-628118644).aClass160Array7431[i_5_].method1925(i, i_0_, (byte) -114);
	}

	static boolean method945(String string, String string_6_, int i) {
		Class76_Sub1.anInt10981 = 1864934367;
		Class586.aClass106_7710 = client.aClass106_11218;
		return Class188.method2796(false, false, string, string_6_, -1L);
	}
}

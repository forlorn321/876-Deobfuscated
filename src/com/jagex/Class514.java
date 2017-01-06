/* Class514 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class514 {
	public static final int anInt6968 = 6;
	public static final int anInt6969 = 29;
	public static final int anInt6970 = -4;
	public static final int anInt6971 = -5;
	public static final int anInt6972 = -3;
	public static final int anInt6973 = -2;
	public static final int anInt6974 = 15;
	public static final int anInt6975 = 2;
	public static final int anInt6976 = 7;
	public static final int anInt6977 = 9;
	public static final int anInt6978 = 42;
	public static final int anInt6979 = 21;
	public static final int anInt6980 = 23;
	public static final int anInt6981 = 3;
	public static final int anInt6982 = 35;
	public static final int anInt6983 = 1;
	public static final int anInt6984 = 45;
	public static final int anInt6985 = 48;
	public static final int anInt6986 = 49;
	public static final int anInt6987 = 52;
	public static final int anInt6988 = 53;
	static int anInt6989;
	static int anInt6990;

	Class514() throws Throwable {
		throw new Error();
	}

	static final void method6235(Class668 class668, short i) {
		class668.anInt8542 -= 1472892954;
		if (class668.anIntArray8541[1867269829 * class668.anInt8542] > class668.anIntArray8541[1 + 1867269829 * class668.anInt8542])
			class668.anInt8564 += -1531084683 * (class668.anIntArray8537[class668.anInt8564 * -1640738851]);
	}

	static final void method6236(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4493, client.aClass106_11322.aClass15_1258, 1861085072);
		class536_sub23.stream.writeShort(i_0_, -1778059594);
		client.aClass106_11322.writePacket(class536_sub23, 89488743);
	}

	static final void method6237(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -190052995 * Class223.anInt2337;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class553.anInt7482 * -953455409;
	}

	static final void method6238(Class668 class668, Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i) {
		class668.anInt8542 -= -1349181388;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		boolean bool = (class668.anIntArray8541[3 + 1867269829 * class668.anInt8542] == 1);
		if (Class683.aClass301_Sub1_8651.method4062(1851093186) != Class300.aClass300_3360)
			throw new RuntimeException();
		Class706_Sub2 class706_sub2 = ((Class706_Sub2) Class683.aClass301_Sub1_8651.method4052(-810172525));
		if (class649_sub1_sub5_sub1 != null)
			class706_sub2.method10255(class649_sub1_sub5_sub1, new Class436((float) i_1_, (float) i_2_, (float) i_3_), bool, -1066368348);
		client.aBool11242 = true;
	}

	static final void method6239(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ((Class565.MY_PLAYER.aClass617_12202 != null) && (Class565.MY_PLAYER.aClass617_12202.aBool8076)) ? 1 : 0;
	}
}

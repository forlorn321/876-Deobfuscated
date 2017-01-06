/* Class556 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class556 {
	public Class552 aClass552_7497;
	public Class556 aClass556_7498;
	public Class649_Sub1_Sub3 aClass649_Sub1_Sub3_7499;
	public Class649_Sub1_Sub3 aClass649_Sub1_Sub3_7500;
	public Class649_Sub1_Sub4 aClass649_Sub1_Sub4_7501;
	public Class649_Sub1_Sub4 aClass649_Sub1_Sub4_7502;
	public Class649_Sub1_Sub2 aClass649_Sub1_Sub2_7503;
	short aShort7504;
	Class649_Sub1_Sub1 aClass649_Sub1_Sub1_7505;
	short aShort7506;
	short aShort7507;
	public byte aByte7508;
	short aShort7509;
	static Class2 aClass2_7510;

	public Class556(int i) {
		aByte7508 = (byte) i;
	}

	static final void method6806(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4486, client.aClass106_11218.aClass15_1258, 1349982741);
		class536_sub23.stream.writeByte(Class555.method6802(string, 1082807001));
		class536_sub23.stream.writeString(string);
		client.aClass106_11218.writePacket(class536_sub23, 1699777960);
	}

	public static void method6807(Class628 class628, int i) {
		Class98_Sub1_Sub2.anInt11334 = class628.anInt8184 * -901976731;
		Class693.anInt8723 = class628.anInt8210 * -620169891;
		Class205_Sub5.anInt9870 = -258617961 * class628.anInt8188;
		Class694.anInt8731 = -1954584407 * class628.anInt8221;
		Class281.anInt3175 = class628.anInt8222 * 700807067;
		Class35.anInt293 = -515533941 * class628.anInt8223;
		Class389.anInt4047 = 433563783 * class628.anInt8224;
		Class35.anInt296 = 981097667 * class628.anInt8212;
		Class35.anInt299 = class628.anInt8226 * -1246912023;
		Class315_Sub1_Sub1.anInt11395 = -769836263 * class628.anInt8194;
		Class35.anInt297 = class628.anInt8228 * -842021151;
		Class662.anInt8513 = class628.anInt8229 * 1020534889;
	}
}

/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class95 {
	static int anInt1150;
	static final int anInt1151 = 1;
	static byte[] aByteArray1152;
	static byte[] aByteArray1153;
	static RSByteBuffer[] aClass536_Sub33Array1154;
	static RSByteBuffer[] aClass536_Sub33Array1155;
	public static int anInt1156;
	static int[] anIntArray1157;
	static int anInt1158;
	static int[] anIntArray1159;
	static int[] anIntArray1160;
	static final int anInt1161 = 2;
	static Class43[] aClass43Array1162;
	static boolean $assertionsDisabled = !com.jagex.Class95.class.desiredAssertionStatus();
	static long aLong1163;

	static void method1293() {
		anInt1156 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass536_Sub33Array1154[i] = null;
			aClass536_Sub33Array1155[i] = null;
			aByteArray1153[i] = Class680.aClass680_8639.aByte8644;
			aClass43Array1162[i] = null;
		}
	}

	static final void method1294(Class536_Sub33_Sub2 class536_sub33_sub2) {
		class536_sub33_sub2.method10779((byte) 82);
		int i = client.anInt11156 * -1791435655;
		Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i] = (new Class649_Sub1_Sub5_Sub1_Sub2(client.aClass515_11066.method6249(1248320850))));
		class649_sub1_sub5_sub1_sub2.anInt11889 = 675537735 * i;
		int i_0_ = class536_sub33_sub2.method10780(30, -659807831);
		byte i_1_ = (byte) (i_0_ >> 28);
		int i_2_ = i_0_ >> 14 & 0x3fff;
		int i_3_ = i_0_ & 0x3fff;
		Class598 class598 = client.aClass515_11066.method6255(-1332050267);
		class649_sub1_sub5_sub1_sub2.anIntArray11944[0] = i_2_ - class598.anInt7839 * 1858049507;
		class649_sub1_sub5_sub1_sub2.anIntArray11945[0] = i_3_ - class598.anInt7840 * 1479112045;
		class649_sub1_sub5_sub1_sub2.method7842((float) ((class649_sub1_sub5_sub1_sub2.anIntArray11944[0] << 9) + (class649_sub1_sub5_sub1_sub2.method10874(1355242333) << 8)), (class649_sub1_sub5_sub1_sub2.method7838().aClass436_4823.aFloat4852), (float) ((class649_sub1_sub5_sub1_sub2.anIntArray11945[0] << 9) + (class649_sub1_sub5_sub1_sub2.method10874(1355242333) << 8)));
		Class320.anInt3539 = (class649_sub1_sub5_sub1_sub2.aByte10839 = class649_sub1_sub5_sub1_sub2.aByte10840 = i_1_) * 1995486621;
		if (client.aClass515_11066.method6251(21756407).method5466(class649_sub1_sub5_sub1_sub2.anIntArray11944[0], class649_sub1_sub5_sub1_sub2.anIntArray11945[0], (byte) -63))
			class649_sub1_sub5_sub1_sub2.aByte10840++;
		if (null != aClass536_Sub33Array1154[i])
			class649_sub1_sub5_sub1_sub2.method11082(aClass536_Sub33Array1154[i], 1544934794);
		if (aClass536_Sub33Array1155[i] != null)
			class649_sub1_sub5_sub1_sub2.method11091(aClass536_Sub33Array1155[i], 1036735050);
		anInt1156 = 0;
		anIntArray1157[(anInt1156 += 1948535215) * -1482773169 - 1] = i;
		aByteArray1152[i] = (byte) 0;
		anInt1158 = 0;
		for (int i_4_ = 1; i_4_ < 2048; i_4_++) {
			if (i != i_4_) {
				int i_5_ = class536_sub33_sub2.method10780(18, -1466091495);
				int i_6_ = i_5_ >> 16 & 0x3;
				int i_7_ = i_5_ >> 8 & 0xff;
				int i_8_ = i_5_ & 0xff;
				Class43 class43 = aClass43Array1162[i_4_] = new Class43();
				class43.anInt514 = ((i_7_ << 14) + (i_6_ << 28) + i_8_) * 246702179;
				class43.anInt511 = 0;
				class43.anInt512 = 661209069;
				class43.aClass210_513 = Class210.aClass210_2258;
				class43.aBool510 = false;
				anIntArray1159[(anInt1158 += 190489201) * -745742703 - 1] = i_4_;
				aByteArray1152[i_4_] = (byte) 0;
			}
		}
		class536_sub33_sub2.method10781(-1630025338);
		Class290 class290 = Class683.aClass301_Sub1_8651.method4054(973708974);
		if (Class290.aClass290_3220 == class290) {
			Class333_Sub2 class333_sub2 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221));
			class333_sub2.method9168((byte) -79);
		}
		Class300 class300 = Class683.aClass301_Sub1_8651.method4062(827108893);
		if (class300 == Class300.aClass300_3360) {
			Class706_Sub2 class706_sub2 = ((Class706_Sub2) Class683.aClass301_Sub1_8651.method4052(-810172525));
			class706_sub2.method10258(1627394625);
		}
	}

	static {
		aByteArray1152 = new byte[2048];
		aByteArray1153 = new byte[2048];
		aClass536_Sub33Array1154 = new RSByteBuffer[2048];
		aClass536_Sub33Array1155 = new RSByteBuffer[2048];
		anInt1156 = 0;
		anIntArray1157 = new int[2048];
		anInt1158 = 0;
		anIntArray1159 = new int[2048];
		aClass43Array1162 = new Class43[2048];
		anInt1150 = 0;
		anIntArray1160 = new int[2048];
	}

	Class95() throws Throwable {
		throw new Error();
	}

	static void method1295() {
		anInt1156 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass536_Sub33Array1154[i] = null;
			aClass536_Sub33Array1155[i] = null;
			aByteArray1153[i] = Class680.aClass680_8639.aByte8644;
			aClass43Array1162[i] = null;
		}
	}

	public static int method1296(int i) {
		Class67_Sub1 class67_sub1 = Class477.method5752(-1712569216);
		Class109.method1450(class67_sub1, (byte) 110);
		return class67_sub1.method1079(1250557705);
	}

	static final void method1297(Class668 class668, byte i) {
		if (-523673047 * client.anInt11118 >= 5 && -523673047 * client.anInt11118 <= 9)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}

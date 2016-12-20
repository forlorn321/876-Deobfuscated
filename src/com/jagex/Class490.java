/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class490 implements Interface45 {
	Class494 this$0;
	public static Class617 aClass617_5473;

	public void method205(byte i) {
		this$0.method8083(true, 976297105);
	}

	public void method285() {
		this$0.method8083(true, 976297105);
	}

	Class490(Class494 class494) {
		this$0 = class494;
	}

	public void method129() {
		this$0.method8083(true, 976297105);
	}

	static void method7972(Class665 class665, byte i) {
		Class259 class259 = ((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]), -1257030651));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (class259.anIntArray2828 == null ? 0 : class259.anIntArray2828.length);
	}

	static final int method7973(int i, int i_0_, byte i_1_) {
		int i_2_ = (Class646.method10755(i - 1, i_0_ - 1, -1439676977) + Class646.method10755(i + 1, i_0_ - 1, -1173346862) + Class646.method10755(i - 1, i_0_ + 1, -1019268903) + Class646.method10755(1 + i, i_0_ + 1, -1548201235));
		int i_3_ = (Class646.method10755(i - 1, i_0_, -1912032708) + Class646.method10755(1 + i, i_0_, -2145517163) + Class646.method10755(i, i_0_ - 1, -2022960492) + Class646.method10755(i, i_0_ + 1, -1457446574));
		int i_4_ = Class646.method10755(i, i_0_, -806492319);
		return i_4_ / 4 + (i_2_ / 16 + i_3_ / 8);
	}

	public static Class527_Sub36 method7974(Class527_Sub36 class527_sub36, int i) {
		synchronized (Class527_Sub36.aClass527_Sub36Array10674) {
			if (0 == Class527_Sub36.anInt10672 * -706191715) {
				Class527_Sub36 class527_sub36_5_ = new Class527_Sub36(class527_sub36);
				return class527_sub36_5_;
			}
			Class527_Sub36.aClass527_Sub36Array10674[(Class527_Sub36.anInt10672 -= -1300686923) * -706191715].method16387(class527_sub36, -2083955513);
			Class527_Sub36 class527_sub36_6_ = (Class527_Sub36.aClass527_Sub36Array10674[-706191715 * Class527_Sub36.anInt10672]);
			return class527_sub36_6_;
		}
	}

	public static void method7975(int i) {
		Class529_Sub1.aHashMap10782.clear();
		Class529_Sub1.aHashMap10764.clear();
	}

	public static void method7976(String string, byte i) {
		if (11 == -1927019389 * client.anInt11048) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4446, client.aClass109_11066.aClass2_1367, (byte) -31);
			class527_sub15.buffer.writeByte(0, 1398080175);
			int i_7_ = (-441238943 * class527_sub15.buffer.anInt10689);
			class527_sub15.buffer.writeString(string, 325927397);
			class527_sub15.buffer.anInt10689 += 1733321575;
			class527_sub15.buffer.method16471(Class77.anIntArray797, i_7_, (-441238943 * class527_sub15.buffer.anInt10689), (byte) -24);
			class527_sub15.buffer.method16534(-441238943 * (class527_sub15.buffer.anInt10689) - i_7_, -401846091);
			client.aClass109_11066.method1969(class527_sub15, (byte) 1);
			Class497.aClass701_5581 = Class701.aClass701_8787;
		}
	}

	static final void method7977(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_8_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		boolean bool = 1 == (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]);
		int i_9_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		Class215 class215 = Class703.aClass219_8825.method3992(i_8_, -1143462365);
		if (class215.method3922((byte) 9) == null)
			class215.method3928(client.anInterface28_11187, 1792991772);
		if (bool) {
			Class160_Sub1 class160_sub1 = ((Class160_Sub1) Class248.aClass95_Sub1_Sub1_2731.method81(i_9_, -1763067133));
			switch (533573711 * class160_sub1.aClass462_1748.aClass475_5283.anInt5377) {
			case 1:
				class665.aLongArray8529[(class665.anInt8530 += 32636613) * -2076258291 - 1] = class215.method3922((byte) 9).method15(((class160_sub1.anInt1746) * 727971013), (byte) 13);
				break;
			case 3:
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class215.method3922((byte) 9).method21(((class160_sub1.anInt1746) * 727971013), (byte) -75);
				break;
			default:
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class215.method3922((byte) 9).method31(((class160_sub1.anInt1746) * 727971013), 1218801512);
			}
		} else {
			Class333 class333 = ((Class333) Class51.aClass24_Sub16_522.method81(i_9_, 474266767));
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class333.method5839((class215.method3922((byte) 9).method21((class333.aClass160_3626.anInt1746 * 727971013), (byte) -42)), (byte) 3);
		}
	}
}

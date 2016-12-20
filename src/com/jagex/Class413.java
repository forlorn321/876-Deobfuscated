/* Class413 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class413 {
	public static final int anInt4382 = 876;
	public static final int anInt4383 = 1;

	Class413() throws Throwable {
		throw new Error();
	}

	static void method6625(Class665 class665, int i) {
		class665.anIntArray8525[class665.anInt8526 * 1769813785 - 2] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((1769813785 * class665.anInt8526) - 2)]), 411199360)).method4752(Class671.aClass97_8584, class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1], -1592402582)) ? 1 : 0;
		class665.anInt8526 -= 102380841;
	}

	static final void method6626(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (string.startsWith(Class202.method3775(0, 2029564242)) || string.startsWith(Class202.method3775(1, 2036451269)))
			string = string.substring(7);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class181.method3552(string, -859351510);
	}

	static final void method6627(Class665 class665, int i) {
		if (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -19) != Class309.aClass309_3459)
			throw new RuntimeException();
		((Class696_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5472(-790003566)).method17153((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 8625971);
	}

	static final void method6628(Class665 class665, int i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub10_10611, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1 ? 1 : 0, 1140937182);
		Class631.method10465(107493666);
		client.aBool11020 = false;
	}

	static final void method6629(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class49.method1267(Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(276060196), 200, (short) 255);
	}

	static void method6630(Class243 class243, Class243 class243_0_, byte i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4396, client.aClass109_11067.aClass2_1367, (byte) -44);
		class527_sub15.buffer.writeShort(class243_0_.anInt2572 * -437471887, 1404835786);
		class527_sub15.buffer.writeShort(class243.anInt2572 * -437471887, 1404835786);
		class527_sub15.buffer.writeShortLE2(-927924265 * class243.anInt2675, (byte) -59);
		class527_sub15.buffer.writeIntV2(-254728301 * class243_0_.anInt2504, (byte) 6);
		class527_sub15.buffer.writeInt(class243.anInt2504 * -254728301, 1643236080);
		class527_sub15.buffer.writeShortLE2(-927924265 * class243_0_.anInt2675, (byte) -82);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	static int method6631(int i, int i_1_, int i_2_) {
		if (-1736797763 * Class596.aClass596_7826.anInt7844 == i || -1736797763 * Class596.aClass596_7838.anInt7844 == i)
			return Class640_Sub1_Sub3_Sub2.anIntArray12015[i_1_ & 0x3];
		return Class640_Sub1_Sub3_Sub2.anIntArray12011[i_1_ & 0x3];
	}
}

/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class497 {
	static Class701 aClass701_5581;

	Class497() throws Throwable {
		throw new Error();
	}

	public static void method8154(boolean bool) {
		Class245.aClass226_2698.method4200(1961581233);
		if (Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
			Class109[] class109s = client.aClass109Array11068;
			for (int i = 0; i < class109s.length; i++) {
				Class109 class109 = class109s[i];
				class109.anInt1368 += -1444708313;
				if (1750986647 * class109.anInt1368 < 50 && !bool)
					return;
				class109.anInt1368 = 0;
				if (!class109.aBool1378 && class109.method1967(1973046288) != null) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4494, class109.aClass2_1367, (byte) 15);
					class109.method1969(class527_sub15, (byte) 1);
					try {
						class109.method1954(-1958199268);
					} catch (IOException ioexception) {
						class109.aBool1378 = true;
					}
				}
			}
			Class245.aClass226_2698.method4200(-480987507);
		}
	}

	public static void method8155(boolean bool) {
		Class245.aClass226_2698.method4200(1093535304);
		if (Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
			Class109[] class109s = client.aClass109Array11068;
			for (int i = 0; i < class109s.length; i++) {
				Class109 class109 = class109s[i];
				class109.anInt1368 += -1444708313;
				if (1750986647 * class109.anInt1368 < 50 && !bool)
					return;
				class109.anInt1368 = 0;
				if (!class109.aBool1378 && class109.method1967(2120793959) != null) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4494, class109.aClass2_1367, (byte) 15);
					class109.method1969(class527_sub15, (byte) 1);
					try {
						class109.method1954(-1085516012);
					} catch (IOException ioexception) {
						class109.aBool1378 = true;
					}
				}
			}
			Class245.aClass226_2698.method4200(1540879397);
		}
	}

	public static void method8156(boolean bool) {
		Class245.aClass226_2698.method4200(915965529);
		if (Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
			Class109[] class109s = client.aClass109Array11068;
			for (int i = 0; i < class109s.length; i++) {
				Class109 class109 = class109s[i];
				class109.anInt1368 += -1444708313;
				if (1750986647 * class109.anInt1368 < 50 && !bool)
					return;
				class109.anInt1368 = 0;
				if (!class109.aBool1378 && class109.method1967(2097018681) != null) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4494, class109.aClass2_1367, (byte) -24);
					class109.method1969(class527_sub15, (byte) 1);
					try {
						class109.method1954(-1269514453);
					} catch (IOException ioexception) {
						class109.aBool1378 = true;
					}
				}
			}
			Class245.aClass226_2698.method4200(-385372839);
		}
	}

	public static Class586 method8157(RSByteBuffer class527_sub38, byte i) {
		int i_0_ = class527_sub38.readUnsignedByte();
		int[] is = new int[i_0_];
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
			is[i_1_] = class527_sub38.readUnsignedByte();
		return new Class586(is);
	}

	static final void method8158(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class160.method2581(class243, class240, class665, 414757624);
	}

	static final void method8159(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, 142785300);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class41.method1170(class243, class240, class665, -1807524865);
	}

	static final void method8160(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -943170217 * Class35.anInt346;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class35.anInt347 * -1282519069;
	}

	static final void method8161(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class392.method6483(class243, class240, class665, -739842364);
	}

	static final void method8162(Class665 class665, byte i) {
		class665.anInt8526 -= 307142523;
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_4_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_5_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2];
		if (-1 == i_4_)
			throw new RuntimeException();
		Class57 class57 = (Class57) Class664.aClass24_Sub15_8519.method81(i_4_, 174225515);
		if (class57.aClass462_718.method87() != i_3_)
			throw new RuntimeException();
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class57.method1337(Integer.valueOf(i_5_), (byte) 62) ? 1 : 0;
	}

	static final void method8163(Class665 class665, int i) {
		class665.anInt8526 -= 1126189251;
		Class400[] class400s = Class183.method3556(-2144780719);
		Class384[] class384s = Class644.method10743(-1015693904);
		Class293_Sub1.method15724((class400s[class665.anIntArray8525[class665.anInt8526 * 1769813785]]), (class384s[class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]]), class665.anIntArray8525[1769813785 * class665.anInt8526 + 2], class665.anIntArray8525[class665.anInt8526 * 1769813785 + 3], class665.anIntArray8525[class665.anInt8526 * 1769813785 + 4], class665.anIntArray8525[5 + class665.anInt8526 * 1769813785], class665.anIntArray8525[6 + class665.anInt8526 * 1769813785],
				class665.anIntArray8525[1769813785 * class665.anInt8526 + 7], class665.anIntArray8525[class665.anInt8526 * 1769813785 + 8], class665.anIntArray8525[class665.anInt8526 * 1769813785 + 9], class665.anIntArray8525[10 + class665.anInt8526 * 1769813785], 108638438);
	}
}

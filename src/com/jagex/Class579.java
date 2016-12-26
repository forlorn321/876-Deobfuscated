/* Class579 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class579 implements Interface66 {
	int[] anIntArray7690;

	public boolean method423(Class536_Sub31 class536_sub31, Interface63[] interface63s, int i, Class549 class549) {
		int[] is = anIntArray7690;
		for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
			int i_1_ = is[i_0_];
			if (!class549.method6638(i_1_, (byte) 0))
				return false;
		}
		return true;
	}

	public boolean method422(Class536_Sub31 class536_sub31, Interface63[] interface63s, int i, Class549 class549, int i_2_) {
		int[] is = anIntArray7690;
		for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
			int i_4_ = is[i_3_];
			if (!class549.method6638(i_4_, (byte) 0))
				return false;
		}
		return true;
	}

	Class579(int[] is) {
		anIntArray7690 = is;
	}

	public boolean method424(Class536_Sub31 class536_sub31, Interface63[] interface63s, int i, Class549 class549) {
		int[] is = anIntArray7690;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_ = is[i_5_];
			if (!class549.method6638(i_6_, (byte) 0))
				return false;
		}
		return true;
	}

	static final void method7009(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class621.method7410(class251, class234, class668, 2040083750);
	}

	static boolean method7010(int i) {
		Class76_Sub1.anInt10981 = -1447115612;
		Class586.aClass106_7710 = client.aClass106_11322;
		return Class188.method2796((Class61.aLong649 * -7692785137277514277L == -1L), true, "", "", -7692785137277514277L * Class61.aLong649);
	}

	static void method7011(Class106 class106, InterfaceDefinitions class251, int i, int i_7_, int i_8_, int i_9_) {
		if (1 == i) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_1, class106.aClass15_1258, 2041686680);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, -1484799213 * class251.anInt2711, -1795564833);
			class106.method1409(class536_sub23, 1218402730);
		}
		if (i == 2) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_2, class106.aClass15_1258, 1924138883);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, -1484799213 * class251.anInt2711, -1227356702);
			class106.method1409(class536_sub23, -383131430);
		}
		if (i == 3) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_3, class106.aClass15_1258, 1287735139);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, -1484799213 * class251.anInt2711, -851297188);
			class106.method1409(class536_sub23, 1048624472);
		}
		if (i == 4) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_4, class106.aClass15_1258, 914819347);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, class251.anInt2711 * -1484799213, -1650339113);
			class106.method1409(class536_sub23, 962542354);
		}
		if (i == 5) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_5, class106.aClass15_1258, 1814774091);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, class251.anInt2711 * -1484799213, -470307530);
			class106.method1409(class536_sub23, 63328735);
		}
		if (6 == i) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_6, class106.aClass15_1258, 1645136160);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, -1484799213 * class251.anInt2711, -1567775664);
			class106.method1409(class536_sub23, -1808102);
		}
		if (7 == i) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_7, class106.aClass15_1258, 2039381288);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, class251.anInt2711 * -1484799213, -325522629);
			class106.method1409(class536_sub23, -90974076);
		}
		if (8 == i) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_8, class106.aClass15_1258, 1533193068);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, -1484799213 * class251.anInt2711, -2105628648);
			class106.method1409(class536_sub23, 784341533);
		}
		if (9 == i) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_9, class106.aClass15_1258, 1382182077);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, -1484799213 * class251.anInt2711, -289170286);
			class106.method1409(class536_sub23, 1916627361);
		}
		if (10 == i) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.ACTION_BUTTON_10, class106.aClass15_1258, 597186841);
			Class710_Sub13.method10051(class536_sub23, i_7_, i_8_, class251.anInt2711 * -1484799213, -2015062708);
			class106.method1409(class536_sub23, 1927635583);
		}
	}
}

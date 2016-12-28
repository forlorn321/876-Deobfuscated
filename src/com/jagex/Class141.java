/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class141 implements Runnable {
	Class360_Sub2 this$0;
	static int anInt1658;
	public static int anInt1659;

	Class141(Class360_Sub2 class360_sub2) {
		this$0 = class360_sub2;
	}

	public void run() {
		try {
			while (!this$0.aBool10270) {
				HashMap hashmap = this$0.method9317((byte) -33);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5923(-1743772573);
					}
				}
				Class212.method3067(25L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) 27);
		}
	}

	public void method1706() {
		try {
			while (!this$0.aBool10270) {
				HashMap hashmap = this$0.method9317((byte) -11);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5923(-1527344935);
					}
				}
				Class212.method3067(25L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) 66);
		}
	}

	public static void method1707(boolean bool, int i) {
		/* empty */
	}

	static final void method1708(Class668 class668, short i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class171.method2427(class251, class234, class668, 1742667173);
	}

	static final void method1709(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		String string_1_ = ((String) class668.anObjectArray8543[1 + 366709801 * class668.anInt8544]);
		Class205_Sub20.method9092(string, string_1_, 1870395821);
	}

	static final void method1710(Class668 class668, int i) {
		class668.anInt8544 -= 1543270475;
		String string = ((String) class668.anObjectArray8543[366709801 * class668.anInt8544]);
		String string_2_ = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801 + 1]);
		String string_3_ = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801 + 2]);
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1);
		Class315_Sub2.method9204(string, string_2_, string_3_, bool, -1762828063);
	}

	static final void method1711(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class204.method2933(class251, class234, class668, -832529025);
	}

	static final void method1712(short i) {
		Class478.method5762(1080042266);
		client.aClass515_11066.method6258((byte) 0);
		for (int i_4_ = 0; i_4_ < client.aClass103Array11020.length; i_4_++)
			client.aClass103Array11020[i_4_] = null;
		for (int i_5_ = 0; i_5_ < client.aClass526Array11021.length; i_5_++)
			client.aClass526Array11021[i_5_] = null;
		Class324.method4276(-1786363719);
		for (int i_6_ = 0; i_6_ < 2048; i_6_++)
			client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_6_] = null;
		client.anInt11053 = 0;
		client.aClass4_11050.method561(-2117553523);
		client.anInt11164 = 0;
		client.aClass4_11170.method561(-2117553523);
		Class609.method7265(Class65.method1062());
		client.anInt11063 = 0;
		Class465_Sub1.aClass96_10352.aClass610_1164.method7271(-1056104537);
		Class50.aClass350_585 = null;
		Class256.aClass350_2762 = null;
		Class66.aClass536_Sub15_724 = null;
		Class646.aClass536_Sub15_8361 = null;
		Class63.aClass226_717 = null;
		client.aBool11172 = true;
		Class398.aClass654_4123 = null;
		Class567.aLong7600 = 0L;
		Class51.method930(-1398418648);
		Class452.method5434(807561423);
	}

	static int method1713(Class536_Sub18_Sub9 class536_sub18_sub9, Class2 class2, byte i) {
		String string = Class87.method1212(class536_sub18_sub9, -522514075);
		int[] is = Class402.method4923(class536_sub18_sub9, 2020813132);
		if (null != is)
			string = new StringBuilder().append(string).append(Class158.method1892(is, -1192355961)).toString();
		int i_7_ = class2.method531(string, Class195.aClass143Array2201, 1316241733);
		if (class536_sub18_sub9.aBool11715)
			i_7_ += Class289.aClass143_3215.method1720() + 4;
		return i_7_;
	}

	static final void method1714(Class167 class167, int i, int i_8_, int i_9_, int i_10_, int i_11_) {
		class167.method2369(i, i_8_, i_9_ + i, i_10_ + i_8_);
		class167.method2057(i, i_8_, i_9_, i_10_, -16777216, (short) -18613);
		if (Class542_Sub1.anInt10700 * 962386111 >= 100) {
			float f = ((float) Class542_Sub1.anInt7188 / (float) Class542_Sub1.anInt7187);
			int i_12_ = i_9_;
			int i_13_ = i_10_;
			if (f < 1.0F)
				i_13_ = (int) ((float) i_9_ * f);
			else
				i_12_ = (int) ((float) i_10_ / f);
			i += (i_9_ - i_12_) / 2;
			i_8_ += (i_10_ - i_13_) / 2;
			if (null == Class532.aClass143_7123 || Class532.aClass143_7123.method1720() != i_12_ || Class532.aClass143_7123.method1752() != i_13_) {
				Class542_Sub1.aClass199_7211 = Class542_Sub1.aClass199_7225;
				Class542_Sub1.method6568(Class542_Sub1.anInt7185, (Class542_Sub1.anInt7188 + Class542_Sub1.anInt7186), (Class542_Sub1.anInt7185 + Class542_Sub1.anInt7187), Class542_Sub1.anInt7186, i, i_8_, i + i_12_, i_13_ + i_8_);
				Class542_Sub1.method6548(class167, false, false, client.aBool11123, true);
				class167.method2084();
				Class532.aClass143_7123 = class167.method2205(i, i_8_, i_12_, i_13_, true);
			}
			Class532.aClass143_7123.method1728(i, i_8_);
			int i_14_ = (i_12_ * (Class223.anInt2337 * -190052995) / Class542_Sub1.anInt7187);
			int i_15_ = (i_13_ * (-953455409 * Class553.anInt7482) / Class542_Sub1.anInt7188);
			int i_16_ = ((i_12_ * (1171941285 * Class514.anInt6990) / Class542_Sub1.anInt7187) + i);
			int i_17_ = i_8_ + i_13_ - (i_13_ * (-2077040371 * Class360.anInt3828) / Class542_Sub1.anInt7188) - i_15_;
			int i_18_ = -1996554240;
			if (client.aClass670_11043 == Class670.aClass670_8575)
				i_18_ = -1996488705;
			class167.method2063(i_16_, i_17_, i_14_, i_15_, i_18_, 1);
			class167.method2062(i_16_, i_17_, i_14_, i_15_, i_18_, 0);
			for (Class536_Sub41 class536_sub41 = ((Class536_Sub41) Class542_Sub1.aClass708_7218.method8308(1867269829)); class536_sub41 != null; class536_sub41 = ((Class536_Sub41) Class542_Sub1.aClass708_7218.method8311(1800851651))) {
				Class248 class248 = ((Class248) (Class542_Sub1.aClass34_Sub8_7212.method70(2000440429 * class536_sub41.anInt10793, (byte) 82)));
				if (Class184_Sub6.method9082(class248, 2114236589)) {
					Class51 class51 = ((Class51) (Class542_Sub1.aHashMap10719.get(Integer.valueOf(2000440429 * class536_sub41.anInt10793))));
					if (class51 == null)
						class51 = ((Class51) (Class542_Sub1.aHashMap10715.get(Integer.valueOf(2086350461 * class248.anInt2508))));
					if (null != class51) {
						int i_19_;
						if (-531980961 * class51.anInt587 > Class542_Sub1.anInt10705 * 1468826811 / 2)
							i_19_ = ((Class542_Sub1.anInt10705 * 888682053 - class51.anInt587 * 1783808417) / (Class542_Sub1.anInt10705 * 1468826811));
						else
							i_19_ = (1783808417 * class51.anInt587 / (Class542_Sub1.anInt10705 * 1468826811));
						int i_20_ = ((753546687 * class536_sub41.anInt10794 * i_12_ / Class542_Sub1.anInt7187) + i);
						int i_21_ = (i_8_ + ((Class542_Sub1.anInt7188 - 1902597877 * class536_sub41.anInt10796) * i_13_ / Class542_Sub1.anInt7188));
						class167.method2057(i_20_ - 2, i_21_ - 2, 4, 4, i_19_ << 24 | 0xffff00, (short) -3423);
					}
				}
			}
			Class542_Sub1.aClass199_7225.method2883(5, -1959452764);
		}
	}

	static final void method1715(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -2000815627) != null)
			string = string.substring(0, string.length() - 1);
		class251.onKeyHook = Class33.method796(string, class668, (short) 3249);
		class251.hasComponentHook = true;
	}

	public static void method1716(Class167 class167, long l) {
		class167.method2393();
		Class575.aLinkedList7661.clear();
		Class575.aLinkedList7670.clear();
		Class575.aLong7663 = 6225798727630464827L * (l + (long) (Class575.anInt7656 * 84169589));
	}
}

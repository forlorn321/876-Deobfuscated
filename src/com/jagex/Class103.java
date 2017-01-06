/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class103 {
	int anInt1221;
	int anInt1222;
	public int anInt1223;
	public int anInt1224;
	public int anInt1225;
	public int anInt1226;
	int anInt1227;
	public int anInt1228;
	public int anInt1229 = 275637823;
	int anInt1230;
	static Class199 aClass199_1231 = new Class199(4);
	static short aShort1232;

	static void method1359(int i) {
		Class223.anInt2335 = 557728915 * i;
		aClass199_1231.method2884((byte) -67);
	}

	static void method1360(int i) {
		Class223.anInt2335 = 557728915 * i;
		aClass199_1231.method2884((byte) -105);
	}

	static void method1361(int i) {
		Class223.anInt2335 = 557728915 * i;
		aClass199_1231.method2884((byte) -79);
	}

	static void method1362() {
		aClass199_1231.method2892(-388976688);
	}

	Class103() {
		/* empty */
	}

	static void method1363(int i) {
		Class223.anInt2335 = 557728915 * i;
		aClass199_1231.method2884((byte) -107);
	}

	static void method1364() {
		aClass199_1231.method2884((byte) -103);
	}

	static void method1365(int i) {
		aClass199_1231.method2883(i, -1444554522);
	}

	static void method1366(int i) {
		aClass199_1231.method2883(i, -1574291277);
	}

	static void method1367() {
		aClass199_1231.method2892(-1927019673);
	}

	static void method1368() {
		aClass199_1231.method2892(1490249621);
	}

	static void method1369(int i) {
		aClass199_1231.method2883(i, -2057413239);
	}

	static void method1370() {
		aClass199_1231.method2892(266809290);
	}

	static void method1371(Class167 class167, Class161 class161, IComponentDefinitions class251, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class248 class248 = ((Class248) Class398_Sub1.aClass34_Sub8_10110.method70(i_3_, (byte) 91));
		if (class248 != null && class248.anIntArray2506 != null && class248.method3429(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, 440832876))
			class248 = class248.method3435(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, -1305113627);
		if (null != class248 && class248.aBool2493 && class248.method3429(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, 1566982519)) {
			if (null != class248.anIntArray2497) {
				int[] is = new int[class248.anIntArray2497.length];
				for (int i_5_ = 0; i_5_ < is.length / 2; i_5_++) {
					int i_6_;
					if (Class246.anInt2474 * 155362615 == 2)
						i_6_ = ((int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) -36) * 2607.5945876176133) + client.anInt11096 * -2011409073) & 0x3fff;
					else if (155362615 * Class246.anInt2474 == 6)
						i_6_ = (int) client.aFloat11106 & 0x3fff;
					else
						i_6_ = (client.anInt11096 * -2011409073 + (int) client.aFloat11106) & 0x3fff;
					int i_7_ = Class447.anIntArray4906[i_6_];
					int i_8_ = Class447.anIntArray4921[i_6_];
					if (6 != 155362615 * Class246.anInt2474) {
						i_7_ = 256 * i_7_ / (256 + client.anInt11098 * 1858649483);
						i_8_ = 256 * i_8_ / (1858649483 * client.anInt11098 + 256);
					}
					is[2 * i_5_] = ((((i_1_ + class248.anIntArray2497[2 * i_5_] * 4) * i_8_) + (class248.anIntArray2497[1 + 2 * i_5_] * 4 + i_2_) * i_7_) >> 14) + (i + class251.anInt2573 * -1606950689 / 2);
					is[i_5_ * 2 + 1] = (i_0_ + class251.anInt2574 * 223822141 / 2 - ((i_8_ * (i_2_ + 4 * (class248.anIntArray2497[1 + i_5_ * 2])) - (4 * class248.anIntArray2497[2 * i_5_] + i_1_) * i_7_) >> 14));
				}
				Class244 class244 = class251.method3478(class167, -401973024);
				if (null != class244)
					Class165.method1975(class167, is, class248.anInt2509 * -913229803, class244.anIntArray2462, class244.anIntArray2461);
				if (class248.anInt2512 * -36359057 > 0) {
					for (int i_9_ = 0; i_9_ < is.length / 2 - 1; i_9_++) {
						int i_10_ = is[2 * i_9_];
						int i_11_ = is[i_9_ * 2 + 1];
						int i_12_ = is[2 * (i_9_ + 1)];
						int i_13_ = is[1 + 2 * (i_9_ + 1)];
						if (i_12_ < i_10_) {
							int i_14_ = i_10_;
							int i_15_ = i_11_;
							i_10_ = i_12_;
							i_11_ = i_13_;
							i_12_ = i_14_;
							i_13_ = i_15_;
						} else if (i_10_ == i_12_ && i_13_ < i_11_) {
							int i_16_ = i_11_;
							i_11_ = i_13_;
							i_13_ = i_16_;
						}
						if (class161 != null)
							class167.method2070(i_10_, i_11_, i_12_, i_13_, (class248.anIntArray2519[class248.aByteArray2521[i_9_] & 0xff]), 1, class161, i, i_0_, class248.anInt2512 * -36359057, -1062329099 * class248.anInt2513, class248.anInt2514 * 365345513);
						else
							class167.method2069(i_10_, i_11_, i_12_, i_13_, (class248.anIntArray2519[class248.aByteArray2521[i_9_] & 0xff]), 1, class248.anInt2512 * -36359057, -1062329099 * class248.anInt2513, 365345513 * class248.anInt2514);
					}
					int i_17_ = is[is.length - 2];
					int i_18_ = is[is.length - 1];
					int i_19_ = is[0];
					int i_20_ = is[1];
					if (i_19_ < i_17_) {
						int i_21_ = i_17_;
						int i_22_ = i_18_;
						i_17_ = i_19_;
						i_18_ = i_20_;
						i_19_ = i_21_;
						i_20_ = i_22_;
					} else if (i_19_ == i_17_ && i_20_ < i_18_) {
						int i_23_ = i_18_;
						i_18_ = i_20_;
						i_20_ = i_23_;
					}
					if (class161 != null)
						class167.method2070(i_17_, i_18_, i_19_, i_20_, (class248.anIntArray2519[(class248.aByteArray2521[(class248.aByteArray2521.length - 1)]) & 0xff]), 1, class161, i, i_0_, class248.anInt2512 * -36359057, -1062329099 * class248.anInt2513, 365345513 * class248.anInt2514);
					else
						class167.method2069(i_17_, i_18_, i_19_, i_20_, (class248.anIntArray2519[(class248.aByteArray2521[(class248.aByteArray2521.length - 1)]) & 0xff]), 1, -36359057 * class248.anInt2512, class248.anInt2513 * -1062329099, 365345513 * class248.anInt2514);
				} else if (class161 != null) {
					for (int i_24_ = 0; i_24_ < is.length / 2 - 1; i_24_++)
						class167.method2354(is[2 * i_24_], is[i_24_ * 2 + 1], is[2 * (1 + i_24_)], is[2 * (1 + i_24_) + 1], (class248.anIntArray2519[(class248.aByteArray2521[i_24_] & 0xff)]), 1, class161, i, i_0_);
					class167.method2354(is[is.length - 2], is[is.length - 1], is[0], is[1], (class248.anIntArray2519[(class248.aByteArray2521[(class248.aByteArray2521.length - 1)]) & 0xff]), 1, class161, i, i_0_);
				} else {
					for (int i_25_ = 0; i_25_ < is.length / 2 - 1; i_25_++)
						class167.method2277(is[2 * i_25_], is[2 * i_25_ + 1], is[2 * (i_25_ + 1)], is[1 + 2 * (i_25_ + 1)], (class248.anIntArray2519[(class248.aByteArray2521[i_25_] & 0xff)]), 1);
					class167.method2277(is[is.length - 2], is[is.length - 1], is[0], is[1], (class248.anIntArray2519[(class248.aByteArray2521[(class248.aByteArray2521.length - 1)]) & 0xff]), 1);
				}
			}
			Class143 class143 = null;
			if (-1 != 400801363 * class248.anInt2481) {
				class143 = class248.method3430(class167, false, 276352132);
				if (class143 != null) {
					int i_26_ = (class248.anInt2524 * 1412695543 > 0 ? class248.anInt2524 * 1412695543 : -1272140623 * Class644.aClass628_8352.anInt8207);
					Class656.method7946(class251, class161, i, i_0_, i_1_, i_2_, class143, (double) i_26_, class248.aClass261_2505, class248.aClass283_2518, (byte) -1);
				}
			}
			if (null != class248.aString2483) {
				int i_27_ = 0;
				if (null != class143)
					i_27_ = class143.method1752();
				Class184 class184 = Class18.aClass184_190;
				Class2 class2 = Class556.aClass2_7510;
				if (class248.anInt2486 * 1093270539 == 1) {
					class184 = Clan.aClass184_10488;
					class2 = Class223.aClass2_2338;
				}
				if (1093270539 * class248.anInt2486 == 2) {
					class184 = Class26.aClass184_248;
					class2 = Class260.aClass2_2840;
				}
				Class504.method6079(class251, class161, i, i_0_, i_1_, i_2_, i_27_, class248.aString2483, class184, class2, -1877457153 * class248.anInt2484, 1965182425);
			}
		}
	}

	static final void method1372(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1151043453 * class251.anInt2571;
	}

	static final void method1373(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt10991 * -811133827;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11017 * -599766855;
	}

	static final void method1374(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		client.aShort11277 = (short) class668.anIntArray8541[class668.anInt8542 * 1867269829];
		if (client.aShort11277 <= 0)
			client.aShort11277 = (short) 256;
		client.aShort11278 = (short) (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]);
		if (client.aShort11278 <= 0)
			client.aShort11278 = (short) 320;
	}

	static final void method1375(IComponentDefinitions class251, int i) {
		if (-1769600535 * class251.anInt2562 == IComponentDefinitions.anInt2536 * 1542493203) {
			if (Class565.MY_PLAYER.username == null) {
				class251.modelId = 0;
				class251.anInt2603 = 0;
			} else {
				class251.xan2d = -1890992258;
				class251.yan2d = ((int) (Math.sin((double) client.cycles / 40.0) * 256.0) & 0x7ff) * -947955085;
				class251.modelType = -323602093;
				class251.modelId = -436498141 * client.anInt11156;
				class251.anInt2603 = Class264.method3677((Class565.MY_PLAYER.username), -311312947) * 721316367;
				Class688_Sub3 class688_sub3 = (Class565.MY_PLAYER.aClass688_Sub3_11914);
				if (class688_sub3 != null) {
					if (class251.aClass688_2653 == null)
						class251.aClass688_2653 = new Class688_Sub1();
					class251.animId = class688_sub3.method8120((byte) 118) * -726203335;
					class251.aClass688_2653.method8157(class688_sub3, 858459449);
				} else
					class251.aClass688_2653 = null;
			}
		}
	}

	static final void method1376(Class668 class668, int i) {
		int i_28_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_28_);
		Class234 class234 = Class463.aClass234Array5227[i_28_ >> 16];
		Class628.method7492(class251, class234, class668, 1993371298);
	}
}

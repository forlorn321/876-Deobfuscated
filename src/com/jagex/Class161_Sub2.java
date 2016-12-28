/* Class161_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class161_Sub2 extends Class161 {
	int[] anIntArray9444;
	int[] anIntArray9445;

	Class161_Sub2(int i, int i_0_, int[] is, int[] is_1_) {
		anIntArray9444 = is;
		anIntArray9445 = is_1_;
	}

	static final void method8670(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub11_10757.method10022((byte) -48) ? 1 : 0;
	}

	static final void method8671(int i) {
		for (int i_2_ = Class465_Sub1.aClass96_10352.aClass610_1164.method7268(true, 16711935); -1 != i_2_; i_2_ = Class465_Sub1.aClass96_10352.aClass610_1164.method7268(false, 16711935)) {
			Class205_Sub3.method9055(i_2_, -4729113);
			client.anIntArray11177[(client.anInt11219 += 853246961) * 2051607825 - 1 & 0x3f] = i_2_;
		}
		for (Class536_Sub18_Sub5 class536_sub18_sub5 = Class336_Sub1.method9157(1291428785); class536_sub18_sub5 != null; class536_sub18_sub5 = Class336_Sub1.method9157(45945349)) {
			int i_3_ = class536_sub18_sub5.method10671((short) -23199);
			long l = class536_sub18_sub5.method10661(1888522995);
			if (1 == i_3_) {
				Class153 class153 = ((Class153) Class309.aClass98_Sub1_Sub2_3465.method70((int) l, (byte) 12));
				Class590.aClass147_Sub1_7791.method101(class153, (-1670804733 * (class536_sub18_sub5.anInt11675)), 1584709141);
				client.anIntArray11224[(client.anInt11225 += -1650211755) * 381884669 - 1 & 0x3f] = (int) l;
			} else if (i_3_ == 2) {
				Class153 class153 = ((Class153) Class309.aClass98_Sub1_Sub2_3465.method70((int) l, (byte) 72));
				Class590.aClass147_Sub1_7791.method105(class153, (class536_sub18_sub5.aString11649), 2089714920);
				client.anIntArray11297[((client.anInt11227 += -1184662833) * 1393118255) - 1 & 0x3f] = (int) l;
			} else if (i_3_ == 3) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				if (!class536_sub18_sub5.aString11649.equals(class251.text)) {
					class251.text = class536_sub18_sub5.aString11649;
					Class668.method8011(class251, 263642117);
				}
			} else if (i_3_ == 23) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				if ((-1670804733 * class536_sub18_sub5.anInt11675 == 1) != class251.aBool2608) {
					class251.aBool2608 = 1 == class536_sub18_sub5.anInt11675 * -1670804733;
					Class668.method8011(class251, 263642117);
				}
			} else if (i_3_ == 4) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				int i_4_ = class536_sub18_sub5.anInt11675 * -1670804733;
				int i_5_ = 1457693901 * class536_sub18_sub5.anInt11659;
				int i_6_ = 1125309803 * class536_sub18_sub5.anInt11654;
				if (class251.modelType * 1939619399 != i_4_ || i_5_ != class251.modelId * -2011124813 || class251.anInt2603 * 2109818095 != i_6_) {
					class251.modelType = i_4_ * -1782707337;
					class251.modelId = 1639447419 * i_5_;
					class251.anInt2603 = i_6_ * 721316367;
					class251.aClass304_2583 = null;
					Class668.method8011(class251, 263642117);
				}
			} else if (5 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				if (1625008649 * class251.animId != -1670804733 * class536_sub18_sub5.anInt11675) {
					if (class536_sub18_sub5.anInt11675 * -1670804733 != -1) {
						if (class251.aClass688_2653 == null)
							class251.aClass688_2653 = new Class688_Sub1();
						class251.aClass688_2653.method8122(class536_sub18_sub5.anInt11675 * -1670804733, -834597376);
					} else
						class251.aClass688_2653 = null;
					class251.animId = class536_sub18_sub5.anInt11675 * 1422983083;
					Class668.method8011(class251, 263642117);
				}
			} else if (6 == i_3_) {
				int i_7_ = class536_sub18_sub5.anInt11675 * -1670804733;
				int i_8_ = i_7_ >> 10 & 0x1f;
				int i_9_ = i_7_ >> 5 & 0x1f;
				int i_10_ = i_7_ & 0x1f;
				int i_11_ = (i_10_ << 3) + ((i_9_ << 11) + (i_8_ << 19));
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				if (class251.colour * -336626187 != i_11_) {
					class251.colour = 1647150685 * i_11_;
					Class668.method8011(class251, 263642117);
				}
			} else if (i_3_ == 7) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				boolean bool = -1670804733 * class536_sub18_sub5.anInt11675 == 1;
				if (class251.hidden != bool) {
					class251.hidden = bool;
					Class668.method8011(class251, 263642117);
				}
			} else if (8 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				if ((-1670804733 * class536_sub18_sub5.anInt11675 != -1515601291 * class251.xan2d) || (class251.yan2d * 92396219 != 1457693901 * class536_sub18_sub5.anInt11659) || (class251.zoom2d * -632476725 != class536_sub18_sub5.anInt11654 * 1125309803)) {
					class251.xan2d = 58554519 * class536_sub18_sub5.anInt11675;
					class251.yan2d = class536_sub18_sub5.anInt11659 * -764208617;
					class251.zoom2d = class536_sub18_sub5.anInt11654 * -1835917087;
					if (-1 != class251.anInt2711 * -1484799213) {
						if (-555385111 * class251.anInt2614 > 0)
							class251.zoom2d = (-1926815261 * (class251.zoom2d * 1235581280 / (-555385111 * class251.anInt2614)));
						else if (101683265 * class251.sizeX > 0)
							class251.zoom2d = (class251.zoom2d * 1235581280 / (class251.sizeX * 101683265) * -1926815261);
					}
					Class668.method8011(class251, 263642117);
				}
			} else if (9 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				if ((-1670804733 * class536_sub18_sub5.anInt11675 != class251.anInt2711 * -1484799213) || (class536_sub18_sub5.anInt11659 * 1457693901 != class251.anInt2712 * -1880327077)) {
					class251.anInt2711 = 2060985937 * class536_sub18_sub5.anInt11675;
					class251.anInt2712 = class536_sub18_sub5.anInt11659 * -161985545;
					Class668.method8011(class251, 263642117);
				}
			} else if (i_3_ == 10) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				if ((class536_sub18_sub5.anInt11675 * -1670804733 != class251.anInt2658 * -1064708005) || (class251.anInt2606 * -1027484909 != class536_sub18_sub5.anInt11659 * 1457693901) || (class536_sub18_sub5.anInt11654 * 1125309803 != class251.zan2d * 1533121603)) {
					class251.anInt2658 = -937863047 * class536_sub18_sub5.anInt11675;
					class251.anInt2606 = class536_sub18_sub5.anInt11659 * 809682079;
					class251.zan2d = class536_sub18_sub5.anInt11654 * -566275143;
					Class668.method8011(class251, 263642117);
				}
			} else if (i_3_ == 11) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				class251.posXMode = (byte) 0;
				class251.anInt2571 = ((class251.posX = class536_sub18_sub5.anInt11675 * 1687040787) * 1462897253);
				class251.posYMode = (byte) 0;
				class251.anInt2572 = ((class251.posY = class536_sub18_sub5.anInt11659 * -819523519) * -1382197559);
				Class668.method8011(class251, 263642117);
			} else if (12 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				int i_12_ = class536_sub18_sub5.anInt11675 * -1670804733;
				if (class251 != null && 1049444347 * class251.anInt2728 == 0) {
					if (i_12_ > (452091921 * class251.anInt2586 - 223822141 * class251.anInt2574))
						i_12_ = (class251.anInt2586 * 452091921 - 223822141 * class251.anInt2574);
					if (i_12_ < 0)
						i_12_ = 0;
					if (i_12_ != -2092413585 * class251.anInt2584) {
						class251.anInt2584 = -794971761 * i_12_;
						Class668.method8011(class251, 263642117);
					}
				}
			} else if (13 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				class251.graphicId = class536_sub18_sub5.anInt11675 * 1795478385;
			} else if (14 == i_3_) {
				Class101.aBool1206 = true;
				Class101.anInt1205 = -194403919 * class536_sub18_sub5.anInt11675;
				Class101.anInt1194 = class536_sub18_sub5.anInt11659 * -1683799943;
			} else if (i_3_ == 15) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				class251.fontId = class536_sub18_sub5.anInt11675 * -232280163;
			} else if (21 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				class251.fontMono = 1 == class536_sub18_sub5.anInt11675 * -1670804733;
			} else if (22 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				class251.clickMask = 1 == -1670804733 * class536_sub18_sub5.anInt11675;
			} else if (17 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				int i_13_ = (int) (l >> 32);
				class251.method3465(i_13_, (short) (class536_sub18_sub5.anInt11675 * -1670804733), (short) (1457693901 * class536_sub18_sub5.anInt11659), -330942314);
			} else if (20 == i_3_) {
				IComponentDefinitions class251 = Class264.method3678((int) l, -689214737);
				int i_14_ = (int) (l >> 32);
				class251.method3481(i_14_, (short) (-1670804733 * class536_sub18_sub5.anInt11675), (short) (class536_sub18_sub5.anInt11659 * 1457693901), (byte) 45);
			}
		}
	}
}

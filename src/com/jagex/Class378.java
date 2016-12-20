/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class378 {
	public static Class378 aClass378_3926 = new Class378();
	public static Class378 aClass378_3927 = new Class378();

	Class378() {
		/* empty */
	}

	static final void method6391(int i, int i_0_, int i_1_, int i_2_, boolean bool, short i_3_) {
		if (client.aClass509_11072.method8314(-587149408) == null)
			Class402.aClass180_4150.method3174(i, i_0_, i_1_, i_2_, -16777216, -2038490987);
		else {
			Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
			boolean bool_4_ = false;
			if (-1481292237 * client.anInt11080 != 3) {
				if (!client.aBool11081)
					bool_4_ = true;
			} else {
				if ((int) class442.aFloat4918 < 0 || ((int) class442.aFloat4918 >= client.aClass509_11072.method8284((byte) 48) * 512) || (int) class442.aFloat4919 < 0 || ((int) class442.aFloat4919 >= (client.aClass509_11072.method8285(1956922490) * 512)))
					bool_4_ = true;
				if (2 == -349191067 * Class30.anInt265 && !Class208_Sub10.aClass296_Sub1_9923.method5369((byte) -1))
					bool_4_ = true;
			}
			if (bool_4_)
				Class402.aClass180_4150.method3174(i, i_0_, i_1_, i_2_, -16777216, -2099130930);
			else {
				client.anInt11129 += 1122368423;
				if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 != null && ((int) class442.aFloat4918 - (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18564(-1306046015) - 1) * 256) >> 9 == 1573687583 * Class106.anInt1323 && (((int) class442.aFloat4919 - (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18564(-2100857460) - 1) * 256) >> 9 == Class106.anInt1322 * -2130872497)) {
					Class106.anInt1323 = -1689365215;
					Class106.anInt1322 = 1880014929;
					Class563_Sub1.method16313((byte) 0);
				}
				Class95_Sub1.method14495(-207772596);
				if (!bool)
					Class539.method9001((byte) -99);
				Class591.method9854((byte) -96);
				for (int i_5_ = 0; i_5_ < client.aClass535Array11026.length; i_5_++) {
					if (client.aClass535Array11026[i_5_] != null && !client.aClass535Array11026[i_5_].method8964(-1089370802) && (client.aClass535Array11026[i_5_].method8965(Class402.aClass180_4150, -1439197704)))
						client.aClass535Array11026[i_5_].method8961(client.aClass509_11072.method8314(714885303), -1232776587);
				}
				Class47.method1242(i, i_0_, i_1_, i_2_, true, (short) -27545);
				i = 1902851817 * client.anInt11289;
				i_0_ = -1270596543 * client.anInt11097;
				i_1_ = client.anInt11291 * 473278291;
				i_2_ = client.anInt11040 * -1527615753;
				Class143.method2379(i, i_0_, 2017248892);
				if (-349191067 * Class30.anInt265 == 1) {
					int i_6_ = (int) client.aFloat11111;
					if (client.anInt11120 * -340124423 >> 8 > i_6_)
						i_6_ = client.anInt11120 * -340124423 >> 8;
					if (client.aBoolArray11060[4] && client.anIntArray11294[4] + 128 > i_6_)
						i_6_ = client.anIntArray11294[4] + 128;
					int i_7_ = (((int) client.aFloat11112 + 1325625329 * client.anInt11099) & 0x3fff);
					Class708.method14379(657661431 * Class286.anInt3211, (Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, 162317215 * Class673.anInt8585, (byte) 5) - client.anInt11036 * 80155925), Class608.anInt7995 * -1823634057, i_6_, i_7_, 600 + (i_6_ >> 3) * 3 << 2, i_2_, 1474750881);
				} else if (Class30.anInt265 * -349191067 == 6) {
					int i_8_ = (int) client.aFloat11111;
					if (client.anInt11120 * -340124423 >> 8 > i_8_)
						i_8_ = -340124423 * client.anInt11120 >> 8;
					if (client.aBoolArray11060[4] && client.anIntArray11294[4] + 128 > i_8_)
						i_8_ = client.anIntArray11294[4] + 128;
					int i_9_ = (int) client.aFloat11112 & 0x3fff;
					Class708.method14379(Class286.anInt3211 * 657661431, (Class590.method9853(2051886797 * client.anInt11179, 1446602977 * client.anInt11045, Class673.anInt8585 * 162317215, (byte) 5) - 80155925 * client.anInt11036), -1823634057 * Class608.anInt7995, i_8_, i_9_, 600 + (i_8_ >> 3) * 3 << 2, i_2_, 1474750881);
				} else if (5 == -349191067 * Class30.anInt265)
					Class28.method867(i_2_, 329269531);
				int i_10_ = Class320.anInt3543 * -1998563323;
				int i_11_ = Class142.anInt1657 * 298893113;
				int i_12_ = -1261737255 * Class201.anInt2211;
				int i_13_ = Class700_Sub34.anInt10928 * -1153148977;
				int i_14_ = Class12.anInt176 * -1728661517;
				for (int i_15_ = 0; i_15_ < 5; i_15_++) {
					if (client.aBoolArray11060[i_15_]) {
						int i_16_ = (int) ((Math.random() * (double) (1 + (client.anIntArray11277[i_15_]) * 2)) - (double) client.anIntArray11277[i_15_] + (Math.sin((double) (client.anIntArray11279[i_15_]) / 100.0 * (double) (client.anIntArray11280[i_15_])) * (double) (client.anIntArray11294[i_15_])));
						if (0 == i_15_)
							Class320.anInt3543 += 1149154509 * (i_16_ << 2);
						if (1 == i_15_)
							Class142.anInt1657 += (i_16_ << 2) * -1960018167;
						if (i_15_ == 2)
							Class201.anInt2211 += 421295465 * (i_16_ << 2);
						if (3 == i_15_)
							Class12.anInt176 = (i_16_ + -1728661517 * Class12.anInt176 & 0x3fff) * 355973435;
						if (4 == i_15_) {
							Class700_Sub34.anInt10928 += -290107601 * i_16_;
							if (-1153148977 * Class700_Sub34.anInt10928 < 1024)
								Class700_Sub34.anInt10928 = -717440000;
							else if (-1153148977 * Class700_Sub34.anInt10928 > 3072)
								Class700_Sub34.anInt10928 = 2142647296;
						}
					}
				}
				if (-1998563323 * Class320.anInt3543 < 0)
					Class320.anInt3543 = 0;
				if (-1998563323 * Class320.anInt3543 > ((client.aClass509_11072.method8314(-1683053098).anInt7443) * -547681223 << 9) - 1)
					Class320.anInt3543 = (((client.aClass509_11072.method8314(2099705634).anInt7443) * -547681223 << 9) - 1) * 1149154509;
				if (Class201.anInt2211 * -1261737255 < 0)
					Class201.anInt2211 = 0;
				if (Class201.anInt2211 * -1261737255 > ((client.aClass509_11072.method8314(-599917411).anInt7432 * -1437024153) << 9) - 1)
					Class201.anInt2211 = (((client.aClass509_11072.method8314(1589272326).anInt7432) * -1437024153 << 9) - 1) * 421295465;
				if (Class204.aClass527_Sub31_2213.aClass700_Sub13_10608.method16964((byte) -47) == 2)
					Class699.method14277(-1757403222);
				else if (Class204.aClass527_Sub31_2213.aClass700_Sub13_10608.method16964((byte) -77) == 3)
					Class520.method8663(1254789796);
				Class402.aClass180_4150.method3128(i, i_0_, i_1_, i_2_);
				Class402.aClass180_4150.method3124(true);
				Class402.aClass180_4150.method3132(i, i_0_, i + i_1_, i_2_ + i_0_);
				Class631 class631 = client.aClass509_11072.method8397(1688771584).method10240(2087979765);
				int i_17_ = class631.method10442(1265098296);
				Class302 class302 = new Class302();
				Class592 class592 = client.aClass509_11072.method8283((short) 3457);
				if (Class635.method10557(-2098464601))
					Class66.aClass296_Sub1_760.method5370(class302, client.aClass432_11013, client.aClass427_11012, class592.anInt7798 * 153371143 << 9, class592.anInt7799 * -2029646807 << 9, -1262509293);
				else if (2 == Class30.anInt265 * -349191067)
					Class208_Sub10.aClass296_Sub1_9923.method5370(class302, client.aClass432_11013, client.aClass427_11012, class592.anInt7798 * 153371143 << 9, -2029646807 * class592.anInt7799 << 9, -60378212);
				else {
					client.aClass432_11013.method6894((float) -(-1998563323 * Class320.anInt3543), (float) -(Class142.anInt1657 * 298893113), (float) -(-1261737255 * Class201.anInt2211));
					client.aClass432_11013.method6936(0.0F, -1.0F, 0.0F, Class428.method6863(-(Class12.anInt176 * -1728661517) & 0x3fff));
					client.aClass432_11013.method6936(-1.0F, 0.0F, 0.0F, Class428.method6863(-(-1153148977 * Class700_Sub34.anInt10928) & 0x3fff));
					client.aClass432_11013.method6936(0.0F, 0.0F, -1.0F, Class428.method6863(-(1451848499 * Class689.anInt8692) & 0x3fff));
					Class180_Sub1.method14881(client.aClass427_11012, true, (float) (i_1_ / 2), (float) (i_2_ / 2), (float) (client.anInt11062 * 1553632569 << 1), (float) (1553632569 * client.anInt11062 << 1), i_1_, i_2_, 58109801);
				}
				Class402.aClass180_4150.method3180(client.aClass432_11013);
				Class402.aClass180_4150.method3183(client.aClass427_11012);
				if (class631.method10443((byte) 1) != null) {
					Class402.aClass180_4150.method3478(1.0F);
					Class402.aClass180_4150.method3157(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					if (2 == Class30.anInt265 * -349191067) {
						int i_18_ = (int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5381(-201530118) * 2607.5945876176133);
						int i_19_ = (int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(1327214236) * 2607.5945876176133);
						class631.method10443((byte) 1).method8455(Class402.aClass180_4150, Class320.anInt3544 * 1059893777 << 3, i, i_0_, i_1_, i_2_, i_18_, i_19_, 0, i_17_, true, false, (byte) 10);
					} else
						class631.method10443((byte) 1).method8455(Class402.aClass180_4150, Class320.anInt3544 * 1059893777 << 3, i, i_0_, i_1_, i_2_, -1153148977 * Class700_Sub34.anInt10928, Class12.anInt176 * -1728661517, Class689.anInt8692 * 1451848499, i_17_, true, false, (byte) -112);
					Class402.aClass180_4150.method3165();
				} else
					Class402.aClass180_4150.method3136(3, i_17_);
				Class402.aClass180_4150.method3124(false);
				Class193.method3694(client.aClass432_11013, client.aClass427_11012, i_1_, i_2_, 1217821327);
				client.aClass509_11072.method8397(-1120617171).method10250(client.aClass509_11072, 1420561293);
				int i_20_ = Class204.aClass527_Sub31_2213.aClass700_Sub13_10608.method16964((byte) -33);
				byte i_21_;
				if (2 == i_20_)
					i_21_ = (byte) (client.anInt11129 * 1429404695);
				else if (i_20_ == 3)
					i_21_ = (byte) (client.aBool11001 ? 1 : -1);
				else
					i_21_ = (byte) 1;
				if (Class635.method10557(601757109) || 2 == -349191067 * Class30.anInt265)
					client.aClass509_11072.method8314(-1793815946).method9260(client.anInt11019, 1314222519 * class302.anInt3420, class302.anInt3419 * 790147417, class302.anInt3421 * 902255425, client.aClass509_11072.method8371((byte) 0), client.anIntArray11149, client.anIntArray11052, client.anIntArray11151, client.anIntArray11101, client.anIntArray11104, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) + 1, i_21_, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9,
							Class204.aClass527_Sub31_2213.aClass700_Sub12_10597.method16954(1426914276) == 0, true, 0, true);
				else
					client.aClass509_11072.method8314(2133166692).method9260(client.anInt11019, -1998563323 * Class320.anInt3543, 298893113 * Class142.anInt1657, Class201.anInt2211 * -1261737255, client.aClass509_11072.method8371((byte) 0), client.anIntArray11149, client.anIntArray11052, client.anIntArray11151, client.anIntArray11101, client.anIntArray11104, 1 + (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), i_21_, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9,
							Class204.aClass527_Sub31_2213.aClass700_Sub12_10597.method16954(710796830) == 0, true, 0, true);
				client.anInt11312 += 1421896793;
				if (!Class402.aClass180_4150.method3196() && -1927019389 * client.anInt11048 == 9)
					Class683.method13913(i, i_0_, i_1_, i_2_, -657261551);
				client.aClass509_11072.method8314(258432931).method9374(849712695);
				Class320.anInt3543 = 1149154509 * i_10_;
				Class142.anInt1657 = i_11_ * -1960018167;
				Class201.anInt2211 = i_12_ * 421295465;
				Class700_Sub34.anInt10928 = i_13_ * -290107601;
				Class12.anInt176 = 355973435 * i_14_;
				if (client.aBool11017 && Class454.aClass452_4972.method7301(1445673501) == 0)
					client.aBool11017 = false;
				if (client.aBool11017) {
					Class402.aClass180_4150.method3174(i, i_0_, i_1_, i_2_, -16777216, -1384669364);
					Class307.method5612(Class53.aClass53_625.method1290((Class144_Sub1.aClass671_8995), (byte) -46), false, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 799023920);
				}
				Class180_Sub1.method14881(client.aClass427_11012, false, (float) (i + i_1_ / 2), (float) (i_2_ / 2 + i_0_), (float) (client.anInt11062 * 1553632569 << 1), (float) (1553632569 * client.anInt11062 << 1), i_1_, i_2_, -1858648165);
				Class402.aClass180_4150.method3183(client.aClass427_11012);
				Class411.method6595(client.aClass427_11012, -2064658766);
			}
		}
	}
}

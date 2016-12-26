/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class69 implements Interface51 {
	public Object method350(byte[] is, Class2 class2, boolean bool, int i) {
		return Class677.aClass167_8609.method2089(class2, Class181.method2721(is), bool);
	}

	public Object method349(byte[] is, Class2 class2, boolean bool) {
		return Class677.aClass167_8609.method2089(class2, Class181.method2721(is), bool);
	}

	public Object method351(byte[] is, Class2 class2, boolean bool) {
		return Class677.aClass167_8609.method2089(class2, Class181.method2721(is), bool);
	}

	static void method1090(int i, int i_0_) {
		if (21 == i)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class98_Sub1.method8393(704690537);
			else if (16 == i)
				Class214.method3077(new StringBuilder().append("").append(-311312947 * Class505.anInt6856).toString(), -1644287657);
			else if (3 == i) {
				Class544 class544 = (client.aClass515_11066.method6249(-845501601).aClass544_7426);
				class544.aBool7239 = !class544.aBool7239;
			} else if (i == 24)
				client.aBool11314 = true;
			else if (i == 23)
				client.aBool11314 = false;
			else if (19 == i)
				client.aClass695_11176.method8211(1190714572);
			else if (i == 29) {
				Class528.method6436(144417792);
				for (int i_1_ = 0; i_1_ < 10; i_1_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_2_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.method3077(new StringBuilder().append("").append(i_2_).toString(), -636778411);
			} else if (i == 27) {
				Class528.method6436(-1176280653);
				for (int i_3_ = 0; i_3_ < 10; i_3_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_4_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.method3077(new StringBuilder().append("").append(i_4_).toString(), -1608816178);
				Class99.method1332((byte) 4);
				Class528.method6436(261780322);
				for (int i_5_ = 0; i_5_ < 10; i_5_++)
					System.gc();
				i_4_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.method3077(new StringBuilder().append("").append(i_4_).toString(), -828837439);
			} else if (5 == i)
				Class214.method3077((Class399.aClass530_4128.method209(-249394844) ? "Success" : "Failure"), -1788508942);
			else if (i == 28)
				Class23.aClass5_221.method574(121124127);
			else if (22 == i)
				Class176.aClass460_1936.method5532(-1116144133);
			else if (i == 13)
				Class176.aClass460_1936.method5531(-626516346);
			else if (i == 7)
				Class399.aCanvas4127.setLocation(50, 50);
			else if (i == 25)
				Class399.aCanvas4127.setLocation((Class505.anInt6887 * 1509041125), (Class505.anInt6863 * -1413419225));
			else if (i == 17)
				Class388.method4850((byte) -41);
			else if (8 == i) {
				client.aClass515_11066.aLong6997 = Class249.method3450(1954988296) * 3854533756139245955L;
				client.aClass515_11066.aBool7004 = true;
				Class388.method4850((byte) 21);
			} else if (i == 10) {
				Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
				Class214.method3077(new StringBuilder().append((int) class436.aFloat4850 >> 9).append(" ").append((int) class436.aFloat4853 >> 9).toString(), -1904318414);
			} else if (11 == i) {
				Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
				Class214.method3077(new StringBuilder().append("").append(client.aClass515_11066.method6249(-1446462339).aClass160Array7431[(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)].method1927((int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, -1753625776)).toString(), -382652481);
			} else if (i == 1) {
				Class214.method3077(new StringBuilder().append(Class251.aClass199_2552.method2885(2061537845)).append(" ").append(Class251.aClass199_2552.method2891(453221733)).toString(), -1287470147);
				Class214.method3077(new StringBuilder().append(Class251.aClass199_2694.method2885(2095019710)).append(" ").append(Class251.aClass199_2694.method2891(453221733)).toString(), -1450635911);
			} else if (4 == i)
				Class558.method6817(false, -988098835);
			else if (20 == i) {
				client.aBool11018 = !client.aBool11018;
				Class677.aClass167_8609.method2134(client.aBool11018);
				Class580.method7018(-275039626);
			} else if (14 == i) {
				client.anInt11027 = 0;
				client.aClass515_11066.method6319(-1132532377);
			} else if (15 == i) {
				client.anInt11027 = -560209343;
				client.aClass515_11066.method6319(-714040590);
			} else if (i == 26) {
				client.anInt11027 = -1120418686;
				client.aClass515_11066.method6319(-1309348381);
			}
		} catch (Exception exception) {
			Class214.method3077(Class38.aClass38_305.method840(Class459.aClass664_5178, 2073734058), -350741833);
		}
	}

	public static void method1091(boolean bool, short i) {
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub5_10760), 1, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub5_10761), 1, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub7_10753), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub16_10751), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub29_10752), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub21_10741), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub17_10763), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub10_10781), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub9_10756), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub2_10765), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub14_10755), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub3_10754), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub27_10746), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub27_10743), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub4_10759), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub8_10770, 2043381743 * Class287.aClass287_3208.anInt3207, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub34_10787), 0, (byte) 1);
		if (null != Class677.aClass167_8609 && Class677.aClass167_8609.method2013() && Class677.aClass167_8609.method2124())
			Class677.aClass167_8609.method2123();
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub25_10735), 0, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub23_10774), 0, (byte) 1);
		Class652.method7869(-215565124);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub33_10762), 2, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub43_10780), 1, (byte) 1);
		Class184.method2769(1553222404);
		client.aClass515_11066.method6252(1796531619).method7581((byte) 8);
		client.aBool11026 = true;
	}

	static final void method1092(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1015571801 * client.anInt10993;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -159434497 * client.anInt10990;
	}

	static void method1093(RSBitBuffer class536_sub33_sub2, int i, byte i_6_) {
		Class598 class598 = client.aClass515_11066.method6255(-1787184719);
		boolean bool = class536_sub33_sub2.readBits(1) == 1;
		if (bool)
			Class95.anIntArray1160[(Class95.anInt1150 += -1305881103) * 38697745 - 1] = i;
		int i_7_ = class536_sub33_sub2.readBits(2);
		Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i];
		if (i_7_ == 0) {
			if (!bool) {
				if (i == -1791435655 * client.anInt11156)
					throw new RuntimeException();
				Class43 class43 = Class95.aClass43Array1162[i] = new Class43();
				Class680.method8069(-1712165189);
				class43.anInt514 = (246702179 * ((class649_sub1_sub5_sub1_sub2.aByte10839 << 28) + ((class598.anInt7839 * 1858049507 + (class649_sub1_sub5_sub1_sub2.anIntArray11944[0])) >> 6 << 14) + ((class649_sub1_sub5_sub1_sub2.anIntArray11945[0] + 1479112045 * class598.anInt7840) >> 6)));
				if (1763663333 * class649_sub1_sub5_sub1_sub2.anInt12190 != -1)
					class43.anInt511 = -651215897 * class649_sub1_sub5_sub1_sub2.anInt12190;
				else
					class43.anInt511 = class649_sub1_sub5_sub1_sub2.aClass62_11940.method1047((byte) 16) * -1901349413;
				class43.anInt512 = 1737890159 * class649_sub1_sub5_sub1_sub2.anInt11911;
				class43.aClass210_513 = class649_sub1_sub5_sub1_sub2.aClass210_12200;
				class43.aBool510 = class649_sub1_sub5_sub1_sub2.aBool12194;
				if (692832581 * class649_sub1_sub5_sub1_sub2.anInt12199 > 0)
					Class47.method912(class649_sub1_sub5_sub1_sub2, (short) 255);
				client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i] = null;
				if (class536_sub33_sub2.readBits(1) != 0)
					Class206.method2959(class536_sub33_sub2, i, 2131751071);
			}
		} else if (i_7_ == 1) {
			int i_8_ = class536_sub33_sub2.readBits(3);
			int i_9_ = class536_sub33_sub2.readBits(1);
			int i_10_ = class649_sub1_sub5_sub1_sub2.anIntArray11944[0];
			int i_11_ = class649_sub1_sub5_sub1_sub2.anIntArray11945[0];
			if (i_9_ == 1) {
				Class95.aByteArray1153[i] = Class680.aClass680_8640.aByte8644;
				int i_12_ = class536_sub33_sub2.readBits(2);
				switch (i_12_) {
				case 1:
					class649_sub1_sub5_sub1_sub2.method11092(i_10_ - 1, i_11_, (Class95.aByteArray1153[i]), (byte) 1);
					break;
				case 2:
					class649_sub1_sub5_sub1_sub2.method11092(1 + i_10_, i_11_, (Class95.aByteArray1153[i]), (byte) 1);
					break;
				case 0:
					class649_sub1_sub5_sub1_sub2.method11092(i_10_, i_11_ + 1, (Class95.aByteArray1153[i]), (byte) 1);
					break;
				case 3:
					class649_sub1_sub5_sub1_sub2.method11092(i_10_, i_11_ - 1, (Class95.aByteArray1153[i]), (byte) 1);
					break;
				}
			}
			if (0 == i_8_) {
				i_10_--;
				i_11_--;
			} else if (i_8_ == 1)
				i_11_--;
			else if (2 == i_8_) {
				i_10_++;
				i_11_--;
			} else if (3 == i_8_)
				i_10_--;
			else if (i_8_ == 4)
				i_10_++;
			else if (5 == i_8_) {
				i_10_--;
				i_11_++;
			} else if (6 == i_8_)
				i_11_++;
			else if (7 == i_8_) {
				i_10_++;
				i_11_++;
			}
			class649_sub1_sub5_sub1_sub2.method11092(i_10_, i_11_, Class95.aByteArray1153[i], (byte) 1);
		} else if (i_7_ == 2) {
			int i_13_ = class536_sub33_sub2.readBits(4);
			int i_14_ = class649_sub1_sub5_sub1_sub2.anIntArray11944[0];
			int i_15_ = class649_sub1_sub5_sub1_sub2.anIntArray11945[0];
			if (i_13_ == 0) {
				i_14_ -= 2;
				i_15_ -= 2;
			} else if (i_13_ == 1) {
				i_14_--;
				i_15_ -= 2;
			} else if (i_13_ == 2)
				i_15_ -= 2;
			else if (i_13_ == 3) {
				i_14_++;
				i_15_ -= 2;
			} else if (4 == i_13_) {
				i_14_ += 2;
				i_15_ -= 2;
			} else if (i_13_ == 5) {
				i_14_ -= 2;
				i_15_--;
			} else if (6 == i_13_) {
				i_14_ += 2;
				i_15_--;
			} else if (i_13_ == 7)
				i_14_ -= 2;
			else if (8 == i_13_)
				i_14_ += 2;
			else if (i_13_ == 9) {
				i_14_ -= 2;
				i_15_++;
			} else if (10 == i_13_) {
				i_14_ += 2;
				i_15_++;
			} else if (11 == i_13_) {
				i_14_ -= 2;
				i_15_ += 2;
			} else if (12 == i_13_) {
				i_14_--;
				i_15_ += 2;
			} else if (i_13_ == 13)
				i_15_ += 2;
			else if (i_13_ == 14) {
				i_14_++;
				i_15_ += 2;
			} else if (15 == i_13_) {
				i_14_ += 2;
				i_15_ += 2;
			}
			class649_sub1_sub5_sub1_sub2.method11092(i_14_, i_15_, Class95.aByteArray1153[i], (byte) 1);
		} else {
			int i_16_ = class536_sub33_sub2.readBits(1);
			if (0 == i_16_) {
				int i_17_ = class536_sub33_sub2.readBits(15);
				int i_18_ = i_17_ >> 12 & 0x7;
				int i_19_ = (byte) (i_17_ >> 10) & 0x3;
				int i_20_ = i_17_ >> 5 & 0x1f;
				if (i_20_ > 15)
					i_20_ -= 32;
				int i_21_ = i_17_ & 0x1f;
				if (i_21_ > 15)
					i_21_ -= 32;
				int i_22_ = class649_sub1_sub5_sub1_sub2.anIntArray11944[0] + i_20_;
				int i_23_ = i_21_ + class649_sub1_sub5_sub1_sub2.anIntArray11945[0];
				if (i_18_ == 1415931903 * Class680.aClass680_8637.anInt8642)
					class649_sub1_sub5_sub1_sub2.method11087(i_22_, i_23_, (byte) 1);
				else {
					Class95.aByteArray1153[i] = (byte) (i_18_ - 1);
					class649_sub1_sub5_sub1_sub2.method11092(i_22_, i_23_, (Class95.aByteArray1153[i]), (byte) 1);
				}
				class649_sub1_sub5_sub1_sub2.aByte10839 = class649_sub1_sub5_sub1_sub2.aByte10840 = (byte) (i_19_ + class649_sub1_sub5_sub1_sub2.aByte10839 & 0x3);
				if (client.aClass515_11066.method6251(1388378707).method5466(i_22_, i_23_, (byte) -101))
					class649_sub1_sub5_sub1_sub2.aByte10840++;
				if (i == client.anInt11156 * -1791435655 && (class649_sub1_sub5_sub1_sub2.aByte10839 != -989431627 * Class320.anInt3539))
					Class320.anInt3539 = class649_sub1_sub5_sub1_sub2.aByte10839 * 1995486621;
			} else {
				int i_24_ = class536_sub33_sub2.readBits(3);
				int i_25_ = class536_sub33_sub2.readBits(30);
				int i_26_ = i_25_ >> 28 & 0x3;
				int i_27_ = i_25_ >> 14 & 0x3fff;
				int i_28_ = i_25_ & 0x3fff;
				int i_29_ = ((class598.anInt7839 * 1858049507 + class649_sub1_sub5_sub1_sub2.anIntArray11944[0] + i_27_) & 0x3fff) - class598.anInt7839 * 1858049507;
				int i_30_ = ((i_28_ + (1479112045 * class598.anInt7840 + (class649_sub1_sub5_sub1_sub2.anIntArray11945[0])) & 0x3fff) - 1479112045 * class598.anInt7840);
				if (1415931903 * Class680.aClass680_8637.anInt8642 == i_24_)
					class649_sub1_sub5_sub1_sub2.method11087(i_29_, i_30_, (byte) 1);
				else {
					Class95.aByteArray1153[i] = (byte) (i_24_ - 1);
					class649_sub1_sub5_sub1_sub2.method11092(i_29_, i_30_, (Class95.aByteArray1153[i]), (byte) 1);
				}
				class649_sub1_sub5_sub1_sub2.aByte10839 = class649_sub1_sub5_sub1_sub2.aByte10840 = (byte) (class649_sub1_sub5_sub1_sub2.aByte10839 + i_26_ & 0x3);
				if (client.aClass515_11066.method6251(1641673526).method5466(i_29_, i_30_, (byte) -96))
					class649_sub1_sub5_sub1_sub2.aByte10840++;
				if (client.anInt11156 * -1791435655 == i)
					Class320.anInt3539 = 1995486621 * class649_sub1_sub5_sub1_sub2.aByte10839;
			}
		}
	}

	public static void method1094(Class34_Sub11 class34_sub11, byte i) {
		Class688.aClass34_Sub11_8673 = class34_sub11;
	}

	static final void method1095(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= 1472892954;
		boolean bool = class668.anIntArray8541[1867269829 * class668.anInt8542] == 1;
		boolean bool_31_ = 1 == (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]);
		Class683.aClass301_Sub1_8651.method4030(bool, bool_31_, (byte) 27);
	}
}

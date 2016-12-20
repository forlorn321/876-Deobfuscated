/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.ping.Ping;

public class Class444 {
	static Class46[] aClass46Array4923;
	static int anInt4924 = 0;
	static int anInt4925 = 0;

	Class444() throws Throwable {
		throw new Error();
	}

	public static int method7242() {
		if (0 == -728202161 * anInt4924) {
			Class46.aClass46_467.method1230(new Class443("jaclib"), -2105613058);
			if (Class46.aClass46_467.method1219(726671807).method45((byte) 116) != 100)
				return 1;
			if (!((Class443) Class46.aClass46_467.method1219(6902106)).method7238((byte) 107) && !Class39.method1156((byte) 0)) {
				try {
					Class678.aclient8619.method8512(-565188992);
					Class55.method1315(-134698695);
					Ping.init();
				} catch (Exception_Sub2 exception_sub2) {
					Class637.method10570(Class71.aClass71_782, exception_sub2.aString11351, (exception_sub2.anInt11350 * 1805693481), exception_sub2.getCause(), -1389890797);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt4924 = -1701834065;
		}
		if (-728202161 * anInt4924 == 1) {
			aClass46Array4923 = Class46.method1222((byte) 37);
			Class46.aClass46_487.method1230(new Class447(Class616.aClass459_8091), 16785685);
			Class46.aClass46_466.method1230(new Class443("jaggl"), 732860022);
			Class443 class443 = new Class443("jagdx");
			if (!Class234.aString2373.startsWith("win"))
				class443.method7239((byte) 1);
			Class46.aClass46_469.method1230(class443, 969231544);
			Class46.aClass46_470.method1230(new Class443("sw3d"), -94961835);
			Class46.aClass46_471.method1230(new Class443("hw3d"), -809488817);
			Class46.aClass46_472.method1230(new Class447(Class478.aClass459_5395), 42434641);
			Class46.aClass46_489.method1230(new Class447(InputStream_Sub1.aClass459_10985), 1447734617);
			Class46.aClass46_494.method1230(new Class447(Class411.aClass459_4370), 2090397221);
			Class46.aClass46_475.method1230(new Class447(Class636.aClass459_8304), 680827233);
			Class46.aClass46_473.method1230(new Class447(Class102.aClass459_1237), 462476511);
			Class46.aClass46_477.method1230(new Class447(Class527_Sub1.aClass459_10336), 895155661);
			Class46.aClass46_476.method1230(new Class447(Class508.aClass459_6924), 1922625587);
			Class46.aClass46_479.method1230(new Class447(Class217.aClass459_2283), -1511071052);
			Class46.aClass46_484.method1230(new Class447(Class24.aClass459_234), 1212965069);
			Class46.aClass46_486.method1230(new Class447(Class675.aClass459_8591), 1257589414);
			Class46.aClass46_483.method1230(new Class447(Class388.aClass459_3990), 526444184);
			Class46.aClass46_478.method1230(new Class447(Class467.aClass459_5319), 1679244674);
			Class46.aClass46_468.method1230(new Class447(Class456_Sub1.aClass459_10324), 1279750170);
			Class46.aClass46_485.method1230(new Class447(Class684.aClass459_8654), -1032474554);
			Class46.aClass46_482.method1230(new Class447(Class87.aClass459_827), -876327238);
			Class46.aClass46_481.method1230(new Class430(Class31.aClass459_266, "huffman"), -1658709544);
			Class46.aClass46_488.method1230(new Class447(Class216.aClass459_2280), 741629973);
			Class46.aClass46_480.method1230(new Class447(Class293_Sub1.aClass459_10041), -1340504865);
			Class46.aClass46_490.method1230(new Class447(Class272.aClass459_3136), -13009843);
			Class46.aClass46_491.method1230(new Class429((Class596.aClass459_7845), 0), 911011470);
			for (int i = 0; i < aClass46Array4923.length; i++) {
				if (aClass46Array4923[i].method1219(1252083631) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class46[] class46s = aClass46Array4923;
			for (int i_0_ = 0; i_0_ < class46s.length; i_0_++) {
				Class46 class46 = class46s[i_0_];
				int i_1_ = class46.method1220((short) 2768);
				int i_2_ = class46.method1219(393055226).method45((byte) 85);
				i += i_2_ * i_1_ / 100;
			}
			anInt4925 = 323760781 * i;
			anInt4924 = 891299166;
		}
		if (aClass46Array4923 == null)
			return 100;
		int i = 0;
		int i_3_ = 0;
		boolean bool = true;
		Class46[] class46s = aClass46Array4923;
		for (int i_4_ = 0; i_4_ < class46s.length; i_4_++) {
			Class46 class46 = class46s[i_4_];
			int i_5_ = class46.method1220((short) -2541);
			int i_6_ = class46.method1219(-1911320914).method45((byte) 45);
			if (i_6_ < 100)
				bool = false;
			i += i_5_;
			i_3_ += i_5_ * i_6_ / 100;
		}
		if (bool)
			aClass46Array4923 = null;
		i_3_ -= anInt4925 * 1340596293;
		i -= anInt4925 * 1340596293;
		int i_7_ = i > 0 ? 100 * i_3_ / i : 100;
		if (!bool && i_7_ > 99)
			i_7_ = 99;
		return i_7_;
	}

	public static void method7243() {
		anInt4924 = 0;
		anInt4925 = 0;
	}

	static final void method7244(Class665 class665, byte i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method14289(i_8_, 107693457);
	}

	static final void method7245(Class180 class180, Class181 class181, int i) {
		if (100 != Class529_Sub1.anInt10773 * -1639647951 && null != Class529_Sub1.aClass527_Sub8_Sub12_7123) {
			Class234.method4347(-1408626088);
			Class234.method4347(-1408626088);
			if (Class529_Sub1.anInt10773 * -1639647951 < 10) {
				for (int i_9_ = 0; i_9_ < Class529_Sub1.aClass174ArrayArray10785.length; i_9_++) {
					for (int i_10_ = 0; i_10_ < (Class529_Sub1.aClass174ArrayArray10785[i_9_]).length; i_10_++) {
						Class338.aClass459_3656.method7480((Class529_Sub1.aClass630_7122.anIntArrayArray8218[i_9_][i_10_]), -913700799);
						Class272.aClass459_3136.method7480((Class529_Sub1.aClass630_7122.anIntArrayArray8218[i_9_][i_10_]), 985306393);
					}
				}
				if (!Class529_Sub1.aClass459_7115.method7485(Class529_Sub1.aClass527_Sub8_Sub12_7123.aString11755, 1168268969)) {
					Class529_Sub1.anInt10773 = (Class509.aClass459_6970.method7501((Class529_Sub1.aClass527_Sub8_Sub12_7123.aString11755), -424734829)) / 10 * 1409827793;
					return;
				}
				Class529_Sub1.anInt10773 = 1213376042;
			}
			if (10 == Class529_Sub1.anInt10773 * -1639647951) {
				Class529_Sub1.anInt7137 = -696795403 * (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11761) >> 6 << 6;
				Class529_Sub1.anInt7138 = (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11756 * 124580655) >> 6 << 6;
				Class529_Sub1.anInt7131 = ((-646015201 * Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11762) >> 6 << 6) - Class529_Sub1.anInt7137 + 64;
				Class529_Sub1.anInt7167 = ((1393632705 * Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11764) >> 6 << 6) - Class529_Sub1.anInt7138 + 64;
				int[] is = new int[3];
				int i_11_ = -1;
				int i_12_ = -1;
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class592 class592 = client.aClass509_11072.method8283((short) 14376);
				if (Class529_Sub1.aClass527_Sub8_Sub12_7123.method18314(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864, (153371143 * class592.anInt7798 + ((int) class442.aFloat4918 >> 9)), (-2029646807 * class592.anInt7799 + ((int) class442.aFloat4919 >> 9)), is, (short) -23134)) {
					i_11_ = is[1] - Class529_Sub1.anInt7137;
					i_12_ = is[2] - Class529_Sub1.anInt7138;
				}
				if (!Class529_Sub1.aBool10778 && i_11_ >= 0 && i_11_ < Class529_Sub1.anInt7131 && i_12_ >= 0 && i_12_ < Class529_Sub1.anInt7167) {
					i_11_ += (int) (Math.random() * 10.0) - 5;
					i_12_ += (int) (Math.random() * 10.0) - 5;
					Class529_Sub1.anInt10783 = i_11_ * 2049864907;
					Class635.anInt8302 = i_12_ * -1224612011;
				} else if (Class529_Sub1.anInt10776 * -220305373 != -1 && 697250921 * Class529_Sub1.anInt10777 != -1) {
					Class529_Sub1.aClass527_Sub8_Sub12_7123.method18305(Class529_Sub1.anInt10776 * -220305373, Class529_Sub1.anInt10777 * 697250921, is, (byte) 0);
					if (is != null) {
						Class529_Sub1.anInt10783 = (is[1] - Class529_Sub1.anInt7137) * 2049864907;
						Class635.anInt8302 = -1224612011 * (is[2] - Class529_Sub1.anInt7138);
					}
					Class529_Sub1.anInt10777 = 1984324647;
					Class529_Sub1.anInt10776 = -974227339;
					Class529_Sub1.aBool10778 = false;
				} else {
					Class529_Sub1.aClass527_Sub8_Sub12_7123.method18305((Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11763 * 18711255) >> 14 & 0x3fff, (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11763 * 18711255) & 0x3fff, is, (byte) 17);
					Class529_Sub1.anInt10783 = (is[1] - Class529_Sub1.anInt7137) * 2049864907;
					Class635.anInt8302 = -1224612011 * (is[2] - Class529_Sub1.anInt7138);
				}
				if (25 == (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11760 * -1417497333)) {
					Class529_Sub1.aFloat7133 = 2.0F;
					Class529_Sub1.aFloat7134 = 2.0F;
				} else if (-1417497333 * (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11760) == 37) {
					Class529_Sub1.aFloat7133 = 3.0F;
					Class529_Sub1.aFloat7134 = 3.0F;
				} else if (-1417497333 * (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11760) == 50) {
					Class529_Sub1.aFloat7133 = 4.0F;
					Class529_Sub1.aFloat7134 = 4.0F;
				} else if (75 == (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11760) * -1417497333) {
					Class529_Sub1.aFloat7133 = 6.0F;
					Class529_Sub1.aFloat7134 = 6.0F;
				} else if (100 == (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11760) * -1417497333) {
					Class529_Sub1.aFloat7133 = 8.0F;
					Class529_Sub1.aFloat7134 = 8.0F;
				} else if ((Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11760 * -1417497333) == 200) {
					Class529_Sub1.aFloat7133 = 16.0F;
					Class529_Sub1.aFloat7134 = 16.0F;
				} else {
					Class529_Sub1.aFloat7133 = 8.0F;
					Class529_Sub1.aFloat7134 = 8.0F;
				}
				Class529_Sub1.anInt7130 = (int) Class529_Sub1.aFloat7134 >> 1;
				Class529_Sub1.aByteArrayArrayArray7118 = Class265.method5039(Class529_Sub1.anInt7130, 672688101);
				Class146.method2401((byte) 16);
				Class529_Sub1.method8747();
				Class620.aClass694_8119 = new Class694();
				Class529_Sub1.anInt7116 += (int) (Math.random() * 5.0) - 2;
				if (Class529_Sub1.anInt7116 < -8)
					Class529_Sub1.anInt7116 = -8;
				if (Class529_Sub1.anInt7116 > 8)
					Class529_Sub1.anInt7116 = 8;
				Class529_Sub1.anInt7128 += (int) (Math.random() * 5.0) - 2;
				if (Class529_Sub1.anInt7128 < -16)
					Class529_Sub1.anInt7128 = -16;
				if (Class529_Sub1.anInt7128 > 16)
					Class529_Sub1.anInt7128 = 16;
				Class529_Sub1.method8866(class181, Class529_Sub1.anInt7116 >> 2 << 10, Class529_Sub1.anInt7128 >> 1);
				Class529_Sub1.aClass24_Sub12_7164.method17394(1024, 256, (byte) 114);
				Class529_Sub1.aClass24_Sub8_7119.method17378(256, 256, -1816263347);
				Class529_Sub1.aClass24_Sub6_7117.method838(4096, -2140493563);
				Class51.aClass24_Sub16_522.method838(256, -2091441275);
				Class529_Sub1.anInt10773 = -1868215212;
			} else if (-1639647951 * Class529_Sub1.anInt10773 == 20) {
				if (Class529_Sub1.aBool7172) {
					if (Class529_Sub1.method8808(class180, Class529_Sub1.anInt7116, Class529_Sub1.anInt7128, Class529_Sub1.aBool7172))
						Class529_Sub1.anInt10773 = -1309678340;
				} else {
					Class568.method9570(true, -690732715);
					Class529_Sub1.method8808(class180, Class529_Sub1.anInt7116, Class529_Sub1.anInt7128, Class529_Sub1.aBool7172);
					Class529_Sub1.anInt10773 = -1309678340;
					Class568.method9570(true, -2047568666);
					Class527_Sub3.method16047(-1325722034);
				}
			} else if (60 == -1639647951 * Class529_Sub1.anInt10773) {
				if (Class529_Sub1.aClass459_7115.method7495(Class529_Sub1.aClass527_Sub8_Sub12_7123.aString11755, 1720124823)) {
					if (!Class529_Sub1.aClass459_7115.method7485(Class529_Sub1.aClass527_Sub8_Sub12_7123.aString11755, -432328914))
						return;
					Class529_Sub1.aClass532_7135 = Class19.method770(Class529_Sub1.aClass459_7115, (Class529_Sub1.aClass527_Sub8_Sub12_7123.aString11755), client.aBool11165, 16777472);
				} else
					Class529_Sub1.aClass532_7135 = new Class532(0);
				Class529_Sub1.method8761();
				Class529_Sub1.anInt10773 = -96302298;
				Class568.method9570(true, -1623206292);
				Class527_Sub3.method16047(-1467525428);
			} else if (Class529_Sub1.anInt10773 * -1639647951 >= 70) {
				for (int i_13_ = 0; i_13_ < 3; i_13_++) {
					for (int i_14_ = 0; i_14_ < 5; i_14_++) {
						if ((Class529_Sub1.aClass174ArrayArray10785[i_13_][i_14_]) == null || (Class529_Sub1.aClass22ArrayArray10780[i_13_][i_14_]) == null) {
							Class529_Sub1.aClass174ArrayArray10785[i_13_][i_14_] = ((Class174) (Class211.aClass420_2256.method6684(client.anInterface50_11053, (Class529_Sub1.aClass630_7122.anIntArrayArray8218[i_13_][i_14_]), true, true, (byte) -85)));
							Class529_Sub1.aClass22ArrayArray10780[i_13_][i_14_] = (Class211.aClass420_2256.method6690(client.anInterface50_11053, (Class529_Sub1.aClass630_7122.anIntArrayArray8218[i_13_][i_14_]), -530973439));
							if ((Class529_Sub1.aClass174ArrayArray10785[i_13_][i_14_]) != null && (Class529_Sub1.aClass22ArrayArray10780[i_13_][i_14_]) != null)
								Class529_Sub1.anInt10773 += -65483917;
							else
								return;
						}
					}
				}
				Class529_Sub1.anInt10773 = -751141468;
				System.gc();
			}
		}
	}
}

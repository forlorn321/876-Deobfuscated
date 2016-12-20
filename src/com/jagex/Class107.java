/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Class107 {
	static String[] aStringArray1327;
	static int anInt1328;
	static int anInt1329 = 0;
	static final int anInt1330 = 100;
	static int anInt1331 = 0;
	static int anInt1332;
	static int[] anIntArray1333;
	static int[] anIntArray1334;
	static boolean aBool1335 = true;
	static final int anInt1336 = 350;
	static String aString1337 = "";
	static int anInt1338 = 0;
	static int anInt1339 = 0;
	static int[] anIntArray1340;
	static boolean aBool1341;
	static int anInt1342;
	static final String aString1343 = "\\/.:, _-+[]~@";
	static final String aString1344 = "Success";
	static final String aString1345 = "Failure";

	static boolean method1892() {
		if (Class606.method10059(client.anInt11048 * -1927019389, (byte) 1))
			return false;
		return true;
	}

	static void method1893() {
		if (-1549400497 * anInt1332 < 102)
			anInt1332 += 2011948058;
		if (-709492651 * anInt1342 != -1 && (Class24_Sub15.aLong10982 * 277395700449270335L < Class234.method4347(-1408626088))) {
			for (int i = anInt1342 * -709492651; i < Class551.aStringArray7306.length; i++) {
				if (Class551.aStringArray7306[i].startsWith("pause")) {
					int i_0_ = 5;
					try {
						i_0_ = Integer.parseInt(Class551.aStringArray7306[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class493.method7997(new StringBuilder().append("Pausing for ").append(i_0_).append(" seconds...").toString(), (byte) 8);
					anInt1342 = -1382613763 * (i + 1);
					Class24_Sub15.aLong10982 = (Class234.method4347(-1408626088) + (long) (i_0_ * 1000)) * 358060795605226943L;
					return;
				}
				aString1337 = Class551.aStringArray7306[i];
				Node_Sub6.method16054(false, -1163482689);
			}
			anInt1342 = 1382613763;
		}
		if (0 != client.anInt11005 * -1027814645) {
			anInt1331 -= client.anInt11005 * 963487785;
			if (656150623 * anInt1331 >= -2080366569 * anInt1329)
				anInt1331 = -604984503 * anInt1329 - -2131080289;
			if (anInt1331 * 656150623 < 0)
				anInt1331 = 0;
			client.anInt11005 = 0;
		}
		for (int i = 0; i < 1422154267 * client.anInt11038; i++) {
			Interface64 interface64 = client.anInterface64Array11039[i];
			int i_1_ = interface64.method396(158736759);
			char c = interface64.method418((byte) 31);
			int i_2_ = interface64.method415(457137508);
			if (84 == i_1_)
				Node_Sub6.method16054(false, -1163482689);
			if (80 == i_1_)
				Node_Sub6.method16054(true, -1163482689);
			else if (i_1_ == 66 && (i_2_ & 0x4) != 0) {
				if (Class644.aClipboard8347 != null) {
					String string = "";
					for (int i_3_ = aStringArray1327.length - 1; i_3_ >= 0; i_3_--) {
						if (aStringArray1327[i_3_] != null && aStringArray1327[i_3_].length() > 0)
							string = new StringBuilder().append(string).append(aStringArray1327[i_3_]).append('\n').toString();
					}
					Class644.aClipboard8347.setContents(new StringSelection(string), null);
				}
			} else if (i_1_ == 67 && (i_2_ & 0x4) != 0) {
				if (null != Class644.aClipboard8347) {
					try {
						Transferable transferable = Class644.aClipboard8347.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (null != string) {
								String[] strings = Class592.method9875(string, '\n', (short) -3629);
								Class633.method10517(strings, (short) 31559);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_1_ == 85 && anInt1339 * -1301288505 > 0) {
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339 - 1)).append(aString1337.substring(-1301288505 * anInt1339)).toString();
				anInt1339 -= 207030263;
			} else if (101 == i_1_ && -1301288505 * anInt1339 < aString1337.length())
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339)).append(aString1337.substring(1 + anInt1339 * -1301288505)).toString();
			else if (96 == i_1_ && anInt1339 * -1301288505 > 0)
				anInt1339 -= 207030263;
			else if (97 == i_1_ && anInt1339 * -1301288505 < aString1337.length())
				anInt1339 += 207030263;
			else if (i_1_ == 102)
				anInt1339 = 0;
			else if (103 == i_1_)
				anInt1339 = aString1337.length() * 207030263;
			else if (i_1_ == 104 && 1402258827 * anInt1338 < aStringArray1327.length) {
				anInt1338 += -1985562077;
				Class403.method6542(628832071);
				anInt1339 = aString1337.length() * 207030263;
			} else if (i_1_ == 105 && 1402258827 * anInt1338 > 0) {
				anInt1338 -= -1985562077;
				Class403.method6542(101380865);
				anInt1339 = aString1337.length() * 207030263;
			} else if (Class394.method6500(c, -1118635045) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339)).append(client.anInterface64Array11039[i].method418((byte) 113)).append(aString1337.substring(-1301288505 * anInt1339)).toString();
				anInt1339 += 207030263;
			}
		}
		client.anInt11038 = 0;
		client.anInt11041 = 0;
		if (-1803844265 * Class289.anInt3223 >> 1 != Class527_Sub41_Sub1.anIntArray11734.length)
			Class527_Sub41_Sub1.anIntArray11734 = new int[Class289.anInt3223 * -1803844265 >> 1];
		for (int i = 0; i < 100; i++) {
			anIntArray1333[i] += Class697.anIntArray8760[i];
			if (anIntArray1333[i] >> 4 >= 350) {
				int i_4_ = anIntArray1334[i] >> 4;
				int i_5_ = anIntArray1334[i] & 0xf;
				i_4_ += ((Class428.anIntArray4825[1023 * i_5_ + 64 * (350 + (i_4_ & 0x40)) & 0x3fff]) >> 10);
				i_4_ >>= 1;
				for (int i_6_ = -3; i_6_ <= 3; i_6_++) {
					if (i_6_ + i_4_ >= 0 && (i_4_ + i_6_ < Class527_Sub41_Sub1.anIntArray11734.length))
						Class527_Sub41_Sub1.anIntArray11734[i_6_ + i_4_] += 4 - Math.abs(i_6_);
				}
				anIntArray1334[i] = ((int) (Math.random() * (double) (-1803844265 * Class289.anInt3223)) << 4) + (int) (Math.random() * 15.0);
				anIntArray1333[i] = 0;
				anIntArray1340[i] = (int) (Math.random() * 102.0) + 51;
				Class697.anIntArray8760[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class289.method5226(712139150);
	}

	static void method1894(String[] strings) {
		if (strings.length > 1) {
			for (int i = 0; i < strings.length; i++) {
				if (strings[i].startsWith("pause")) {
					int i_7_ = 5;
					try {
						i_7_ = Integer.parseInt(strings[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class493.method7997(new StringBuilder().append("Pausing for ").append(i_7_).append(" seconds...").toString(), (byte) 8);
					Class551.aStringArray7306 = strings;
					anInt1342 = (i + 1) * -1382613763;
					Class24_Sub15.aLong10982 = (Class234.method4347(-1408626088) + (long) (i_7_ * 1000)) * 358060795605226943L;
					break;
				}
				aString1337 = strings[i];
				Node_Sub6.method16054(false, -1163482689);
			}
		} else {
			aString1337 = new StringBuilder().append(aString1337).append(strings[0]).toString();
			anInt1339 += strings[0].length() * 207030263;
		}
	}

	static void method1895() {
		if (Class500.method8189(-665048852)) {
			if (null == aStringArray1327)
				Class599.method9921((short) -18479);
			aBool1341 = true;
			anInt1332 = 0;
			anIntArray1334 = new int[100];
			anIntArray1333 = new int[100];
			anIntArray1340 = new int[100];
			Class697.anIntArray8760 = new int[100];
			for (int i = 0; i < 100; i++) {
				anIntArray1334[i] = ((int) (Math.random() * (double) (-1803844265 * Class289.anInt3223)) << 4) + (int) (Math.random() * 15.0);
				anIntArray1333[i] = (int) (Math.random() * 350.0) << 4;
				anIntArray1340[i] = (int) (Math.random() * 102.0) + 51;
				Class697.anIntArray8760[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class527_Sub41_Sub1.anIntArray11734 = new int[Class289.anInt3223 * -1803844265 >> 1];
		}
	}

	static void method1896() {
		aBool1341 = false;
		anIntArray1334 = null;
		anIntArray1333 = null;
		anIntArray1340 = null;
		Class697.anIntArray8760 = null;
		Class289.method5226(-678279406);
	}

	public static void method1897(String string) {
		if (aStringArray1327 == null)
			Class599.method9921((short) -14955);
		client.aCalendar11302.setTime(new Date(Class234.method4347(-1408626088)));
		int i = client.aCalendar11302.get(11);
		int i_8_ = client.aCalendar11302.get(12);
		int i_9_ = client.aCalendar11302.get(13);
		String string_10_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_8_ / 10).append(i_8_ % 10).append(":").append(i_9_ / 10).append(i_9_ % 10).toString();
		String[] strings = Class592.method9875(string, '\n', (short) -25984);
		for (int i_11_ = 0; i_11_ < strings.length; i_11_++) {
			for (int i_12_ = -2080366569 * anInt1329; i_12_ > 0; i_12_--)
				aStringArray1327[i_12_] = aStringArray1327[i_12_ - 1];
			aStringArray1327[0] = new StringBuilder().append(string_10_).append(": ").append(strings[i_11_]).toString();
			if (null != Class503.aFileOutputStream6884) {
				try {
					Class503.aFileOutputStream6884.write(Class539.method8999(new StringBuilder().append(aStringArray1327[0]).append("\n").toString(), (short) -8315));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt1329 * -2080366569 < aStringArray1327.length - 1) {
				anInt1329 += -1679878233;
				if (anInt1331 * 656150623 > 0)
					anInt1331 += -2131080289;
			}
		}
	}

	static void method1898() {
		anInt1328 = 1291721154 + (Class568.aClass22_7615.anInt215 * -886404573 + Class568.aClass22_7615.anInt213 * 1793920069);
		Class257.anInt2824 = 1040317558 + (-1347082297 * Class581.aClass22_7677.anInt213 + Class581.aClass22_7677.anInt215 * 1565342001);
		aStringArray1327 = new String[500];
		for (int i = 0; i < aStringArray1327.length; i++)
			aStringArray1327[i] = "";
		Class493.method7997(Class53.aClass53_607.method1290((Class144_Sub1.aClass671_8995), (byte) -82), (byte) 8);
	}

	static void method1899() {
		aBool1341 = false;
		anIntArray1334 = null;
		anIntArray1333 = null;
		anIntArray1340 = null;
		Class697.anIntArray8760 = null;
		Class289.method5226(256029668);
	}

	static void method1900(Class180 class180) {
		if (Class274.method5129(563992918) && Class457.method7445((byte) -53))
			Class37.method1144(0, 0, -1803844265 * Class289.anInt3223, 350, 880865283);
		class180.method3132(0, 0, Class289.anInt3223 * -1803844265, 350);
		class180.method3348(0, 0, -1803844265 * Class289.anInt3223, 350, -1549400497 * anInt1332 << 24 | 0x332277, 1);
		if (aBool1335) {
			for (int i = 0; i < 100; i++) {
				int i_13_ = anIntArray1334[i] >> 4;
				int i_14_ = anIntArray1333[i] >> 4;
				i_13_ += (Class428.anIntArray4825[((i_13_ & 0x40) + i_14_) * 64 & 0x3fff]) >> 10;
				if (i_13_ >= 0 && i_13_ >> 1 < Class527_Sub41_Sub1.anIntArray11734.length && (Class527_Sub41_Sub1.anIntArray11734[i_13_ >> 1] >> 2 < 350 - i_14_))
					class180.method3348(i_13_, i_14_, 2, 2, anIntArray1340[i] << 24 | 0xffffff, 1);
			}
			for (int i = 0; i < Class527_Sub41_Sub1.anIntArray11734.length; i++) {
				int i_15_ = Class527_Sub41_Sub1.anIntArray11734[i] >> 2;
				class180.method3348(i << 1, 350 - i_15_, 2, i_15_, -2130706433, 1);
			}
		}
		int i = 350 / (645606131 * Class257.anInt2824);
		if (anInt1329 * -2080366569 > 0) {
			int i_16_ = 346 - 645606131 * Class257.anInt2824 - 4;
			int i_17_ = i * i_16_ / (anInt1329 * -2080366569 + i - 1);
			int i_18_ = 4;
			if (anInt1329 * -2080366569 > 1)
				i_18_ += ((anInt1329 * -2080366569 - 1 - anInt1331 * 656150623) * (i_16_ - i_17_) / (-2080366569 * anInt1329 - 1));
			class180.method3348(-1803844265 * Class289.anInt3223 - 16, i_18_, 12, i_17_, -1549400497 * anInt1332 << 24 | 0x332277, 2);
			for (int i_19_ = 656150623 * anInt1331; (i_19_ < i + 656150623 * anInt1331 && i_19_ < anInt1329 * -2080366569); i_19_++) {
				String[] strings = Class592.method9875(aStringArray1327[i_19_], '\010', (short) -5802);
				int i_20_ = ((-1803844265 * Class289.anInt3223 - 8 - 16) / strings.length);
				for (int i_21_ = 0; i_21_ < strings.length; i_21_++) {
					int i_22_ = 8 + i_21_ * i_20_;
					class180.method3132(i_22_, 0, i_22_ + i_20_ - 8, 350);
					Class85.aClass174_819.method2770(Class215.method3960(strings[i_21_], (byte) -23), i_22_, (350 - anInt1328 * 104544033 - 2 - Class581.aClass22_7677.anInt213 * 672688101 - ((i_19_ - 656150623 * anInt1331) * (Class257.anInt2824 * 645606131))), -1, -16777216, 2146162811);
				}
			}
		}
		Class24_Sub9.aClass174_10977.method2744("876 1", (-1803844265 * Class289.anInt3223) - 25, 330, -1, -16777216, -237394952);
		class180.method3132(0, 0, Class289.anInt3223 * -1803844265, 350);
		class180.method3527(0, 350 - anInt1328 * 104544033, Class289.anInt3223 * -1803844265, -1, 1145940484);
		Class29.aClass174_262.method2770(new StringBuilder().append("--> ").append(Class215.method3960(aString1337, (byte) -14)).toString(), 10, 350 - Class568.aClass22_7615.anInt213 * 672688101 - 1, -1, -16777216, 2130050386);
		if (Class333.aBool3628) {
			int i_23_ = -1;
			if (client.anInt11019 % 30 > 15)
				i_23_ = 16777215;
			class180.method3141(10 + (Class568.aClass22_7615.method780(new StringBuilder().append("--> ").append(Class215.method3960(aString1337, (byte) -18).substring(0, anInt1339 * -1301288505)).toString(), (short) -21113)), 350 - Class568.aClass22_7615.anInt213 * 672688101 - 11, 12, i_23_, 1852596480);
		}
		class180.method3131();
		Class527_Sub42.method16687((byte) 34);
	}

	static void method1901() {
		if (Class503.aFileOutputStream6884 != null) {
			try {
				Class503.aFileOutputStream6884.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class503.aFileOutputStream6884 = null;
	}

	static boolean method1902() {
		return aBool1341;
	}

	static void method1903(int i) {
		if (i == 21)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class44.method1193((short) -8616);
			else if (16 == i)
				Class493.method7997(new StringBuilder().append("").append(-1176934951 * Class515.anInt7014).toString(), (byte) 8);
			else if (3 == i) {
				Class566 class566 = (client.aClass509_11072.method8314(-1384703076).aClass566_7430);
				class566.aBool7603 = !class566.aBool7603;
			} else if (i == 24)
				client.aBool11022 = true;
			else if (i == 23)
				client.aBool11022 = false;
			else if (i == 19)
				client.aClass705_11182.method14332(-1230860407);
			else if (i == 29) {
				Class676_Sub1.method17023(-479966688);
				for (int i_24_ = 0; i_24_ < 10; i_24_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_25_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_25_).toString(), (byte) 8);
			} else if (i == 27) {
				Class676_Sub1.method17023(1850683552);
				for (int i_26_ = 0; i_26_ < 10; i_26_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_27_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_27_).toString(), (byte) 8);
				Class172.method2741(1637744445);
				Class676_Sub1.method17023(2038050870);
				for (int i_28_ = 0; i_28_ < 10; i_28_++)
					System.gc();
				i_27_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_27_).toString(), (byte) 8);
			} else if (5 == i)
				Class493.method7997((Class234.aClass539_2374.method368((byte) -74) ? "Success" : "Failure"), (byte) 8);
			else if (28 == i)
				Class3.aClass13_34.method700(1399457407);
			else if (22 == i)
				Class454.aClass452_4972.method7307(-2124238260);
			else if (13 == i)
				Class454.aClass452_4972.method7306(-2138052895);
			else if (7 == i)
				Class451.aCanvas4939.setLocation(50, 50);
			else if (i == 25)
				Class451.aCanvas4939.setLocation((Class515.anInt7019 * -416298495), (Class515.anInt7020 * -1313216019));
			else if (17 == i)
				Class633.method10519((byte) 0);
			else if (8 == i) {
				client.aClass509_11072.aLong6966 = Class234.method4347(-1408626088) * -3945043459867598971L;
				client.aClass509_11072.aBool6939 = true;
				Class633.method10519((byte) 0);
			} else if (10 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append((int) class442.aFloat4918 >> 9).append(" ").append((int) class442.aFloat4919 >> 9).toString(), (byte) 8);
			} else if (11 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append("").append(client.aClass509_11072.method8314(-590647771).aClass161Array7434[(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)].method2595((int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, (byte) 59)).toString(), (byte) 8);
			} else if (1 == i) {
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2492.method3789(1888091418)).append(" ").append(Class243.aClass205_2492.method3810(-765273279)).toString(), (byte) 8);
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2497.method3789(1383037849)).append(" ").append(Class243.aClass205_2497.method3810(860045063)).toString(), (byte) 8);
			} else if (4 == i)
				Class32.method942(false, -2029356072);
			else if (20 == i) {
				client.aBool11023 = !client.aBool11023;
				Class402.aClass180_4150.method3339(client.aBool11023);
				Class527_Sub8_Sub16.method18399((byte) 94);
			} else if (14 == i) {
				client.anInt11032 = 0;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 15) {
				client.anInt11032 = 1087431529;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 26) {
				client.anInt11032 = -2120104238;
				client.aClass509_11072.method8361(-428559959);
			}
		} catch (Exception exception) {
			Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -97), (byte) 8);
		}
	}

	static boolean method1904() {
		return aBool1341;
	}

	static void method1905(String[] strings) {
		if (strings.length > 1) {
			for (int i = 0; i < strings.length; i++) {
				if (strings[i].startsWith("pause")) {
					int i_29_ = 5;
					try {
						i_29_ = Integer.parseInt(strings[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class493.method7997(new StringBuilder().append("Pausing for ").append(i_29_).append(" seconds...").toString(), (byte) 8);
					Class551.aStringArray7306 = strings;
					anInt1342 = (i + 1) * -1382613763;
					Class24_Sub15.aLong10982 = (Class234.method4347(-1408626088) + (long) (i_29_ * 1000)) * 358060795605226943L;
					break;
				}
				aString1337 = strings[i];
				Node_Sub6.method16054(false, -1163482689);
			}
		} else {
			aString1337 = new StringBuilder().append(aString1337).append(strings[0]).toString();
			anInt1339 += strings[0].length() * 207030263;
		}
	}

	static void method1906() {
		if (Class204.aClass527_Sub31_2213.aClass700_Sub22_10631.method17121((byte) -15) == 1)
			Class396.aClass506_4119.method8239(new Class514((Class503.aClass503_6881), null), (byte) -27);
		else {
			client.aClass509_11072.method8361(-428559959);
			Class49.method1264(-287576266);
		}
	}

	static void method1907() {
		if (-1549400497 * anInt1332 < 102)
			anInt1332 += 2011948058;
		if (-709492651 * anInt1342 != -1 && (Class24_Sub15.aLong10982 * 277395700449270335L < Class234.method4347(-1408626088))) {
			for (int i = anInt1342 * -709492651; i < Class551.aStringArray7306.length; i++) {
				if (Class551.aStringArray7306[i].startsWith("pause")) {
					int i_30_ = 5;
					try {
						i_30_ = Integer.parseInt(Class551.aStringArray7306[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class493.method7997(new StringBuilder().append("Pausing for ").append(i_30_).append(" seconds...").toString(), (byte) 8);
					anInt1342 = -1382613763 * (i + 1);
					Class24_Sub15.aLong10982 = (Class234.method4347(-1408626088) + (long) (i_30_ * 1000)) * 358060795605226943L;
					return;
				}
				aString1337 = Class551.aStringArray7306[i];
				Node_Sub6.method16054(false, -1163482689);
			}
			anInt1342 = 1382613763;
		}
		if (0 != client.anInt11005 * -1027814645) {
			anInt1331 -= client.anInt11005 * 963487785;
			if (656150623 * anInt1331 >= -2080366569 * anInt1329)
				anInt1331 = -604984503 * anInt1329 - -2131080289;
			if (anInt1331 * 656150623 < 0)
				anInt1331 = 0;
			client.anInt11005 = 0;
		}
		for (int i = 0; i < 1422154267 * client.anInt11038; i++) {
			Interface64 interface64 = client.anInterface64Array11039[i];
			int i_31_ = interface64.method396(-1058866334);
			char c = interface64.method418((byte) 24);
			int i_32_ = interface64.method415(1761264181);
			if (84 == i_31_)
				Node_Sub6.method16054(false, -1163482689);
			if (80 == i_31_)
				Node_Sub6.method16054(true, -1163482689);
			else if (i_31_ == 66 && (i_32_ & 0x4) != 0) {
				if (Class644.aClipboard8347 != null) {
					String string = "";
					for (int i_33_ = aStringArray1327.length - 1; i_33_ >= 0; i_33_--) {
						if (aStringArray1327[i_33_] != null && aStringArray1327[i_33_].length() > 0)
							string = new StringBuilder().append(string).append(aStringArray1327[i_33_]).append('\n').toString();
					}
					Class644.aClipboard8347.setContents(new StringSelection(string), null);
				}
			} else if (i_31_ == 67 && (i_32_ & 0x4) != 0) {
				if (null != Class644.aClipboard8347) {
					try {
						Transferable transferable = Class644.aClipboard8347.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (null != string) {
								String[] strings = Class592.method9875(string, '\n', (short) -8540);
								Class633.method10517(strings, (short) 12906);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_31_ == 85 && anInt1339 * -1301288505 > 0) {
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339 - 1)).append(aString1337.substring(-1301288505 * anInt1339)).toString();
				anInt1339 -= 207030263;
			} else if (101 == i_31_ && -1301288505 * anInt1339 < aString1337.length())
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339)).append(aString1337.substring(1 + anInt1339 * -1301288505)).toString();
			else if (96 == i_31_ && anInt1339 * -1301288505 > 0)
				anInt1339 -= 207030263;
			else if (97 == i_31_ && anInt1339 * -1301288505 < aString1337.length())
				anInt1339 += 207030263;
			else if (i_31_ == 102)
				anInt1339 = 0;
			else if (103 == i_31_)
				anInt1339 = aString1337.length() * 207030263;
			else if (i_31_ == 104 && 1402258827 * anInt1338 < aStringArray1327.length) {
				anInt1338 += -1985562077;
				Class403.method6542(-1622865225);
				anInt1339 = aString1337.length() * 207030263;
			} else if (i_31_ == 105 && 1402258827 * anInt1338 > 0) {
				anInt1338 -= -1985562077;
				Class403.method6542(12822464);
				anInt1339 = aString1337.length() * 207030263;
			} else if (Class394.method6500(c, -1897039939) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339)).append(client.anInterface64Array11039[i].method418((byte) 26)).append(aString1337.substring(-1301288505 * anInt1339)).toString();
				anInt1339 += 207030263;
			}
		}
		client.anInt11038 = 0;
		client.anInt11041 = 0;
		if (-1803844265 * Class289.anInt3223 >> 1 != Class527_Sub41_Sub1.anIntArray11734.length)
			Class527_Sub41_Sub1.anIntArray11734 = new int[Class289.anInt3223 * -1803844265 >> 1];
		for (int i = 0; i < 100; i++) {
			anIntArray1333[i] += Class697.anIntArray8760[i];
			if (anIntArray1333[i] >> 4 >= 350) {
				int i_34_ = anIntArray1334[i] >> 4;
				int i_35_ = anIntArray1334[i] & 0xf;
				i_34_ += ((Class428.anIntArray4825[1023 * i_35_ + 64 * (350 + (i_34_ & 0x40)) & 0x3fff]) >> 10);
				i_34_ >>= 1;
				for (int i_36_ = -3; i_36_ <= 3; i_36_++) {
					if (i_36_ + i_34_ >= 0 && (i_34_ + i_36_ < Class527_Sub41_Sub1.anIntArray11734.length))
						Class527_Sub41_Sub1.anIntArray11734[i_36_ + i_34_] += 4 - Math.abs(i_36_);
				}
				anIntArray1334[i] = ((int) (Math.random() * (double) (-1803844265 * Class289.anInt3223)) << 4) + (int) (Math.random() * 15.0);
				anIntArray1333[i] = 0;
				anIntArray1340[i] = (int) (Math.random() * 102.0) + 51;
				Class697.anIntArray8760[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class289.method5226(-384480814);
	}

	Class107() throws Throwable {
		throw new Error();
	}

	static void method1908() {
		anInt1328 = 1291721154 + (Class568.aClass22_7615.anInt215 * -886404573 + Class568.aClass22_7615.anInt213 * 1793920069);
		Class257.anInt2824 = 1040317558 + (-1347082297 * Class581.aClass22_7677.anInt213 + Class581.aClass22_7677.anInt215 * 1565342001);
		aStringArray1327 = new String[500];
		for (int i = 0; i < aStringArray1327.length; i++)
			aStringArray1327[i] = "";
		Class493.method7997(Class53.aClass53_607.method1290((Class144_Sub1.aClass671_8995), (byte) -101), (byte) 8);
	}

	static void method1909() {
		if (1402258827 * anInt1338 > 0) {
			int i = 0;
			for (int i_37_ = 0; i_37_ < aStringArray1327.length; i_37_++) {
				if (aStringArray1327[i_37_].indexOf("--> ") != -1 && ++i == anInt1338 * 1402258827) {
					aString1337 = aStringArray1327[i_37_].substring(aStringArray1327[i_37_].indexOf('>') + 2);
					break;
				}
			}
		} else
			aString1337 = "";
	}

	public static void method1910(String string) {
		aString1337 = string;
		anInt1339 = aString1337.length() * 207030263;
	}

	static void method1911() {
		if (Class500.method8189(-665048852)) {
			if (null == aStringArray1327)
				Class599.method9921((short) -11200);
			aBool1341 = true;
			anInt1332 = 0;
			anIntArray1334 = new int[100];
			anIntArray1333 = new int[100];
			anIntArray1340 = new int[100];
			Class697.anIntArray8760 = new int[100];
			for (int i = 0; i < 100; i++) {
				anIntArray1334[i] = ((int) (Math.random() * (double) (-1803844265 * Class289.anInt3223)) << 4) + (int) (Math.random() * 15.0);
				anIntArray1333[i] = (int) (Math.random() * 350.0) << 4;
				anIntArray1340[i] = (int) (Math.random() * 102.0) + 51;
				Class697.anIntArray8760[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class527_Sub41_Sub1.anIntArray11734 = new int[Class289.anInt3223 * -1803844265 >> 1];
		}
	}

	static void method1912(boolean bool) {
		aString1337 = aString1337.trim();
		anInt1338 = 0;
		if (aString1337.length() == 0)
			anInt1339 = 0;
		else {
			Class493.method7997(new StringBuilder().append("--> ").append(aString1337).toString(), (byte) 8);
			Class29.method868(aString1337, false, bool, -1584815089);
			if (!bool) {
				anInt1339 = 0;
				aString1337 = "";
			} else
				anInt1339 = aString1337.length() * 207030263;
		}
	}

	static void method1913(boolean bool) {
		aString1337 = aString1337.trim();
		anInt1338 = 0;
		if (aString1337.length() == 0)
			anInt1339 = 0;
		else {
			Class493.method7997(new StringBuilder().append("--> ").append(aString1337).toString(), (byte) 8);
			Class29.method868(aString1337, false, bool, -1223567007);
			if (!bool) {
				anInt1339 = 0;
				aString1337 = "";
			} else
				anInt1339 = aString1337.length() * 207030263;
		}
	}

	static void method1914() {
		if (-1549400497 * anInt1332 < 102)
			anInt1332 += 2011948058;
		if (-709492651 * anInt1342 != -1 && (Class24_Sub15.aLong10982 * 277395700449270335L < Class234.method4347(-1408626088))) {
			for (int i = anInt1342 * -709492651; i < Class551.aStringArray7306.length; i++) {
				if (Class551.aStringArray7306[i].startsWith("pause")) {
					int i_38_ = 5;
					try {
						i_38_ = Integer.parseInt(Class551.aStringArray7306[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class493.method7997(new StringBuilder().append("Pausing for ").append(i_38_).append(" seconds...").toString(), (byte) 8);
					anInt1342 = -1382613763 * (i + 1);
					Class24_Sub15.aLong10982 = (Class234.method4347(-1408626088) + (long) (i_38_ * 1000)) * 358060795605226943L;
					return;
				}
				aString1337 = Class551.aStringArray7306[i];
				Node_Sub6.method16054(false, -1163482689);
			}
			anInt1342 = 1382613763;
		}
		if (0 != client.anInt11005 * -1027814645) {
			anInt1331 -= client.anInt11005 * 963487785;
			if (656150623 * anInt1331 >= -2080366569 * anInt1329)
				anInt1331 = -604984503 * anInt1329 - -2131080289;
			if (anInt1331 * 656150623 < 0)
				anInt1331 = 0;
			client.anInt11005 = 0;
		}
		for (int i = 0; i < 1422154267 * client.anInt11038; i++) {
			Interface64 interface64 = client.anInterface64Array11039[i];
			int i_39_ = interface64.method396(1499759762);
			char c = interface64.method418((byte) 7);
			int i_40_ = interface64.method415(-1682826951);
			if (84 == i_39_)
				Node_Sub6.method16054(false, -1163482689);
			if (80 == i_39_)
				Node_Sub6.method16054(true, -1163482689);
			else if (i_39_ == 66 && (i_40_ & 0x4) != 0) {
				if (Class644.aClipboard8347 != null) {
					String string = "";
					for (int i_41_ = aStringArray1327.length - 1; i_41_ >= 0; i_41_--) {
						if (aStringArray1327[i_41_] != null && aStringArray1327[i_41_].length() > 0)
							string = new StringBuilder().append(string).append(aStringArray1327[i_41_]).append('\n').toString();
					}
					Class644.aClipboard8347.setContents(new StringSelection(string), null);
				}
			} else if (i_39_ == 67 && (i_40_ & 0x4) != 0) {
				if (null != Class644.aClipboard8347) {
					try {
						Transferable transferable = Class644.aClipboard8347.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (null != string) {
								String[] strings = Class592.method9875(string, '\n', (short) -4744);
								Class633.method10517(strings, (short) 13365);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_39_ == 85 && anInt1339 * -1301288505 > 0) {
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339 - 1)).append(aString1337.substring(-1301288505 * anInt1339)).toString();
				anInt1339 -= 207030263;
			} else if (101 == i_39_ && -1301288505 * anInt1339 < aString1337.length())
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339)).append(aString1337.substring(1 + anInt1339 * -1301288505)).toString();
			else if (96 == i_39_ && anInt1339 * -1301288505 > 0)
				anInt1339 -= 207030263;
			else if (97 == i_39_ && anInt1339 * -1301288505 < aString1337.length())
				anInt1339 += 207030263;
			else if (i_39_ == 102)
				anInt1339 = 0;
			else if (103 == i_39_)
				anInt1339 = aString1337.length() * 207030263;
			else if (i_39_ == 104 && 1402258827 * anInt1338 < aStringArray1327.length) {
				anInt1338 += -1985562077;
				Class403.method6542(2058695463);
				anInt1339 = aString1337.length() * 207030263;
			} else if (i_39_ == 105 && 1402258827 * anInt1338 > 0) {
				anInt1338 -= -1985562077;
				Class403.method6542(687029713);
				anInt1339 = aString1337.length() * 207030263;
			} else if (Class394.method6500(c, -1942756453) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1337 = new StringBuilder().append(aString1337.substring(0, -1301288505 * anInt1339)).append(client.anInterface64Array11039[i].method418((byte) 54)).append(aString1337.substring(-1301288505 * anInt1339)).toString();
				anInt1339 += 207030263;
			}
		}
		client.anInt11038 = 0;
		client.anInt11041 = 0;
		if (-1803844265 * Class289.anInt3223 >> 1 != Class527_Sub41_Sub1.anIntArray11734.length)
			Class527_Sub41_Sub1.anIntArray11734 = new int[Class289.anInt3223 * -1803844265 >> 1];
		for (int i = 0; i < 100; i++) {
			anIntArray1333[i] += Class697.anIntArray8760[i];
			if (anIntArray1333[i] >> 4 >= 350) {
				int i_42_ = anIntArray1334[i] >> 4;
				int i_43_ = anIntArray1334[i] & 0xf;
				i_42_ += ((Class428.anIntArray4825[1023 * i_43_ + 64 * (350 + (i_42_ & 0x40)) & 0x3fff]) >> 10);
				i_42_ >>= 1;
				for (int i_44_ = -3; i_44_ <= 3; i_44_++) {
					if (i_44_ + i_42_ >= 0 && (i_42_ + i_44_ < Class527_Sub41_Sub1.anIntArray11734.length))
						Class527_Sub41_Sub1.anIntArray11734[i_44_ + i_42_] += 4 - Math.abs(i_44_);
				}
				anIntArray1334[i] = ((int) (Math.random() * (double) (-1803844265 * Class289.anInt3223)) << 4) + (int) (Math.random() * 15.0);
				anIntArray1333[i] = 0;
				anIntArray1340[i] = (int) (Math.random() * 102.0) + 51;
				Class697.anIntArray8760[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class289.method5226(-1310825800);
	}

	public static void method1915(String string) {
		if (aStringArray1327 == null)
			Class599.method9921((short) 822);
		client.aCalendar11302.setTime(new Date(Class234.method4347(-1408626088)));
		int i = client.aCalendar11302.get(11);
		int i_45_ = client.aCalendar11302.get(12);
		int i_46_ = client.aCalendar11302.get(13);
		String string_47_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_45_ / 10).append(i_45_ % 10).append(":").append(i_46_ / 10).append(i_46_ % 10).toString();
		String[] strings = Class592.method9875(string, '\n', (short) -6572);
		for (int i_48_ = 0; i_48_ < strings.length; i_48_++) {
			for (int i_49_ = -2080366569 * anInt1329; i_49_ > 0; i_49_--)
				aStringArray1327[i_49_] = aStringArray1327[i_49_ - 1];
			aStringArray1327[0] = new StringBuilder().append(string_47_).append(": ").append(strings[i_48_]).toString();
			if (null != Class503.aFileOutputStream6884) {
				try {
					Class503.aFileOutputStream6884.write(Class539.method8999(new StringBuilder().append(aStringArray1327[0]).append("\n").toString(), (short) 71));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt1329 * -2080366569 < aStringArray1327.length - 1) {
				anInt1329 += -1679878233;
				if (anInt1331 * 656150623 > 0)
					anInt1331 += -2131080289;
			}
		}
	}

	public static void method1916(String string) {
		if (aStringArray1327 == null)
			Class599.method9921((short) -2889);
		client.aCalendar11302.setTime(new Date(Class234.method4347(-1408626088)));
		int i = client.aCalendar11302.get(11);
		int i_50_ = client.aCalendar11302.get(12);
		int i_51_ = client.aCalendar11302.get(13);
		String string_52_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_50_ / 10).append(i_50_ % 10).append(":").append(i_51_ / 10).append(i_51_ % 10).toString();
		String[] strings = Class592.method9875(string, '\n', (short) -24333);
		for (int i_53_ = 0; i_53_ < strings.length; i_53_++) {
			for (int i_54_ = -2080366569 * anInt1329; i_54_ > 0; i_54_--)
				aStringArray1327[i_54_] = aStringArray1327[i_54_ - 1];
			aStringArray1327[0] = new StringBuilder().append(string_52_).append(": ").append(strings[i_53_]).toString();
			if (null != Class503.aFileOutputStream6884) {
				try {
					Class503.aFileOutputStream6884.write(Class539.method8999(new StringBuilder().append(aStringArray1327[0]).append("\n").toString(), (short) -18330));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt1329 * -2080366569 < aStringArray1327.length - 1) {
				anInt1329 += -1679878233;
				if (anInt1331 * 656150623 > 0)
					anInt1331 += -2131080289;
			}
		}
	}

	public static void method1917(String string) {
		if (aStringArray1327 == null)
			Class599.method9921((short) -14323);
		client.aCalendar11302.setTime(new Date(Class234.method4347(-1408626088)));
		int i = client.aCalendar11302.get(11);
		int i_55_ = client.aCalendar11302.get(12);
		int i_56_ = client.aCalendar11302.get(13);
		String string_57_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_55_ / 10).append(i_55_ % 10).append(":").append(i_56_ / 10).append(i_56_ % 10).toString();
		String[] strings = Class592.method9875(string, '\n', (short) -22144);
		for (int i_58_ = 0; i_58_ < strings.length; i_58_++) {
			for (int i_59_ = -2080366569 * anInt1329; i_59_ > 0; i_59_--)
				aStringArray1327[i_59_] = aStringArray1327[i_59_ - 1];
			aStringArray1327[0] = new StringBuilder().append(string_57_).append(": ").append(strings[i_58_]).toString();
			if (null != Class503.aFileOutputStream6884) {
				try {
					Class503.aFileOutputStream6884.write(Class539.method8999(new StringBuilder().append(aStringArray1327[0]).append("\n").toString(), (short) -3055));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt1329 * -2080366569 < aStringArray1327.length - 1) {
				anInt1329 += -1679878233;
				if (anInt1331 * 656150623 > 0)
					anInt1331 += -2131080289;
			}
		}
	}

	static void method1918(Class180 class180) {
		if (Class274.method5129(1851484049) && Class457.method7445((byte) -12))
			Class37.method1144(0, 0, -1803844265 * Class289.anInt3223, 350, 921640344);
		class180.method3132(0, 0, Class289.anInt3223 * -1803844265, 350);
		class180.method3348(0, 0, -1803844265 * Class289.anInt3223, 350, -1549400497 * anInt1332 << 24 | 0x332277, 1);
		if (aBool1335) {
			for (int i = 0; i < 100; i++) {
				int i_60_ = anIntArray1334[i] >> 4;
				int i_61_ = anIntArray1333[i] >> 4;
				i_60_ += (Class428.anIntArray4825[((i_60_ & 0x40) + i_61_) * 64 & 0x3fff]) >> 10;
				if (i_60_ >= 0 && i_60_ >> 1 < Class527_Sub41_Sub1.anIntArray11734.length && (Class527_Sub41_Sub1.anIntArray11734[i_60_ >> 1] >> 2 < 350 - i_61_))
					class180.method3348(i_60_, i_61_, 2, 2, anIntArray1340[i] << 24 | 0xffffff, 1);
			}
			for (int i = 0; i < Class527_Sub41_Sub1.anIntArray11734.length; i++) {
				int i_62_ = Class527_Sub41_Sub1.anIntArray11734[i] >> 2;
				class180.method3348(i << 1, 350 - i_62_, 2, i_62_, -2130706433, 1);
			}
		}
		int i = 350 / (645606131 * Class257.anInt2824);
		if (anInt1329 * -2080366569 > 0) {
			int i_63_ = 346 - 645606131 * Class257.anInt2824 - 4;
			int i_64_ = i * i_63_ / (anInt1329 * -2080366569 + i - 1);
			int i_65_ = 4;
			if (anInt1329 * -2080366569 > 1)
				i_65_ += ((anInt1329 * -2080366569 - 1 - anInt1331 * 656150623) * (i_63_ - i_64_) / (-2080366569 * anInt1329 - 1));
			class180.method3348(-1803844265 * Class289.anInt3223 - 16, i_65_, 12, i_64_, -1549400497 * anInt1332 << 24 | 0x332277, 2);
			for (int i_66_ = 656150623 * anInt1331; (i_66_ < i + 656150623 * anInt1331 && i_66_ < anInt1329 * -2080366569); i_66_++) {
				String[] strings = Class592.method9875(aStringArray1327[i_66_], '\010', (short) -26266);
				int i_67_ = ((-1803844265 * Class289.anInt3223 - 8 - 16) / strings.length);
				for (int i_68_ = 0; i_68_ < strings.length; i_68_++) {
					int i_69_ = 8 + i_68_ * i_67_;
					class180.method3132(i_69_, 0, i_69_ + i_67_ - 8, 350);
					Class85.aClass174_819.method2770(Class215.method3960(strings[i_68_], (byte) -8), i_69_, (350 - anInt1328 * 104544033 - 2 - Class581.aClass22_7677.anInt213 * 672688101 - ((i_66_ - 656150623 * anInt1331) * (Class257.anInt2824 * 645606131))), -1, -16777216, 1389571548);
				}
			}
		}
		Class24_Sub9.aClass174_10977.method2744("876 1", (-1803844265 * Class289.anInt3223) - 25, 330, -1, -16777216, -18938072);
		class180.method3132(0, 0, Class289.anInt3223 * -1803844265, 350);
		class180.method3527(0, 350 - anInt1328 * 104544033, Class289.anInt3223 * -1803844265, -1, 1145940484);
		Class29.aClass174_262.method2770(new StringBuilder().append("--> ").append(Class215.method3960(aString1337, (byte) -94)).toString(), 10, 350 - Class568.aClass22_7615.anInt213 * 672688101 - 1, -1, -16777216, 1631264441);
		if (Class333.aBool3628) {
			int i_70_ = -1;
			if (client.anInt11019 % 30 > 15)
				i_70_ = 16777215;
			class180.method3141(10 + (Class568.aClass22_7615.method780(new StringBuilder().append("--> ").append(Class215.method3960(aString1337, (byte) -23).substring(0, anInt1339 * -1301288505)).toString(), (short) 6728)), 350 - Class568.aClass22_7615.anInt213 * 672688101 - 11, 12, i_70_, 1852596480);
		}
		class180.method3131();
		Class527_Sub42.method16687((byte) 73);
	}

	static void method1919(int i) {
		if (i == 21)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class44.method1193((short) -26808);
			else if (16 == i)
				Class493.method7997(new StringBuilder().append("").append(-1176934951 * Class515.anInt7014).toString(), (byte) 8);
			else if (3 == i) {
				Class566 class566 = (client.aClass509_11072.method8314(684873546).aClass566_7430);
				class566.aBool7603 = !class566.aBool7603;
			} else if (i == 24)
				client.aBool11022 = true;
			else if (i == 23)
				client.aBool11022 = false;
			else if (i == 19)
				client.aClass705_11182.method14332(-1395291629);
			else if (i == 29) {
				Class676_Sub1.method17023(-1852580294);
				for (int i_71_ = 0; i_71_ < 10; i_71_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_72_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_72_).toString(), (byte) 8);
			} else if (i == 27) {
				Class676_Sub1.method17023(1159863037);
				for (int i_73_ = 0; i_73_ < 10; i_73_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_74_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_74_).toString(), (byte) 8);
				Class172.method2741(665471330);
				Class676_Sub1.method17023(-1730572250);
				for (int i_75_ = 0; i_75_ < 10; i_75_++)
					System.gc();
				i_74_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_74_).toString(), (byte) 8);
			} else if (5 == i)
				Class493.method7997((Class234.aClass539_2374.method368((byte) -74) ? "Success" : "Failure"), (byte) 8);
			else if (28 == i)
				Class3.aClass13_34.method700(1414308491);
			else if (22 == i)
				Class454.aClass452_4972.method7307(-1669168913);
			else if (13 == i)
				Class454.aClass452_4972.method7306(-2138398677);
			else if (7 == i)
				Class451.aCanvas4939.setLocation(50, 50);
			else if (i == 25)
				Class451.aCanvas4939.setLocation((Class515.anInt7019 * -416298495), (Class515.anInt7020 * -1313216019));
			else if (17 == i)
				Class633.method10519((byte) 0);
			else if (8 == i) {
				client.aClass509_11072.aLong6966 = Class234.method4347(-1408626088) * -3945043459867598971L;
				client.aClass509_11072.aBool6939 = true;
				Class633.method10519((byte) 0);
			} else if (10 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append((int) class442.aFloat4918 >> 9).append(" ").append((int) class442.aFloat4919 >> 9).toString(), (byte) 8);
			} else if (11 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append("").append(client.aClass509_11072.method8314(951766835).aClass161Array7434[(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)].method2595((int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, (byte) 76)).toString(), (byte) 8);
			} else if (1 == i) {
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2492.method3789(1119468018)).append(" ").append(Class243.aClass205_2492.method3810(-1266049580)).toString(), (byte) 8);
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2497.method3789(1931322856)).append(" ").append(Class243.aClass205_2497.method3810(-687344879)).toString(), (byte) 8);
			} else if (4 == i)
				Class32.method942(false, 667506906);
			else if (20 == i) {
				client.aBool11023 = !client.aBool11023;
				Class402.aClass180_4150.method3339(client.aBool11023);
				Class527_Sub8_Sub16.method18399((byte) 54);
			} else if (14 == i) {
				client.anInt11032 = 0;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 15) {
				client.anInt11032 = 1087431529;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 26) {
				client.anInt11032 = -2120104238;
				client.aClass509_11072.method8361(-428559959);
			}
		} catch (Exception exception) {
			Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -19), (byte) 8);
		}
	}

	static void method1920() {
		/* empty */
	}

	public static void method1921(String string, boolean bool, boolean bool_76_) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class493.method7997("commands - This command", (byte) 8);
					Class493.method7997("cls - Clear console", (byte) 8);
					Class493.method7997("displayfps - Toggle FPS and other information", (byte) 8);
					Class493.method7997("renderer - Print graphics renderer information", (byte) 8);
					Class493.method7997("heap - Print java memory information", (byte) 8);
					Class493.method7997("getcamerapos - Print location and direction of camera for use in bug reports", (byte) 8);
				} else if (string.equalsIgnoreCase("cls")) {
					anInt1329 = 0;
					anInt1331 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11022 = !client.aBool11022;
					if (client.aBool11022)
						Class493.method7997("FPS on", (byte) 8);
					else
						Class493.method7997("FPS off", (byte) 8);
				} else if (string.equals("renderer")) {
					Class143 class143 = Class402.aClass180_4150.method3077();
					Class493.method7997(new StringBuilder().append("Toolkit ID: ").append(Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-421782253)).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Vendor: ").append(class143.anInt1664 * -1388704187).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Name: ").append(class143.aString1665).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Version: ").append(1758152749 * class143.anInt1660).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Device: ").append(class143.aString1667).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Driver Version: ").append(class143.aLong1668 * -3959867577634484715L).toString(), (byte) 8);
					String string_77_ = Class402.aClass180_4150.method3096();
					if (string_77_.length() > 0)
						Class493.method7997(string_77_, (byte) 8);
				} else if (string.equals("heap"))
					Class493.method7997(new StringBuilder().append("Heap: ").append(814176903 * Class515.anInt7045).append("MB").toString(), (byte) 8);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class592 class592 = client.aClass509_11072.method8283((short) 28811);
					if (2 == Class30.anInt265 * -349191067) {
						Class442 class442 = Class208_Sub10.aClass296_Sub1_9923.method5377(-1808842117);
						Class442 class442_78_ = Class208_Sub10.aClass296_Sub1_9923.method5379(1911834517);
						Class493.method7997(new StringBuilder().append("Pos: ").append(new Class592((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9).toString()).append(" Height: ")
								.append((Class590.method9853(((int) class442.aFloat4918 - (class592.anInt7798 * 153371143 << 9)), ((int) class442.aFloat4919 - (-2029646807 * class592.anInt7799 << 9)), (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) + (int) class442.aFloat4915).toString(), (byte) 8);
						Class493.method7997(new StringBuilder().append("Look: ").append(new Class592((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (int) class442_78_.aFloat4918 >> 9, (int) class442_78_.aFloat4919 >> 9).toString()).append(" Height: ")
								.append((Class590.method9853(((int) class442_78_.aFloat4918 - (153371143 * class592.anInt7798 << 9)), ((int) class442.aFloat4919 - (class592.anInt7799 * -2029646807 << 9)), (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) + (int) class442.aFloat4915).toString(), (byte) 8);
					} else {
						Class493.method7997(new StringBuilder().append("Pos: ").append(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864).append(",").append(((-1998563323 * Class320.anInt3543 >> 9) + class592.anInt7798 * 153371143) >> 6).append(",").append((-2029646807 * class592.anInt7799 + (Class201.anInt2211 * -1261737255 >> 9)) >> 6).append(",").append(((-1998563323 * Class320.anInt3543 >> 9) + 153371143 * class592.anInt7798) & 0x3f).append(",")
								.append(((Class201.anInt2211 * -1261737255 >> 9) + -2029646807 * class592.anInt7799) & 0x3f).append(" Height: ").append((Class590.method9853(-1998563323 * Class320.anInt3543, Class201.anInt2211 * -1261737255, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) - Class142.anInt1657 * 298893113).toString(), (byte) 8);
						Class493.method7997(new StringBuilder().append("Look: ").append(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864).append(",").append((153371143 * class592.anInt7798 + Class405.anInt4196 * 1947698627) >> 6).append(",").append((class592.anInt7799 * -2029646807 + -965941693 * Class170.anInt1881) >> 6).append(",").append((1947698627 * Class405.anInt4196 + class592.anInt7798 * 153371143) & 0x3f).append(",")
								.append((-965941693 * Class170.anInt1881 + -2029646807 * class592.anInt7799) & 0x3f).append(" Height: ").append((Class590.method9853(Class405.anInt4196 * 1947698627, -965941693 * Class170.anInt1881, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) - -1151746675 * Class447.anInt4930).toString(), (byte) 8);
					}
				}
			} catch (Exception exception) {
				Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -7), (byte) 8);
			}
			return;
		} while (false);
		if (Class73.aClass677_790 != Class677.aClass677_8596 || 962135673 * client.anInt11075 >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class188.method3663(1, -1, -1, false, (byte) -16);
					if (Class81.method1574((byte) 3) == 1)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class188.method3663(2, -1, -1, false, (byte) -25);
					if (Class81.method1574((byte) 3) == 2)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (Class707.aBool8841 && string.equalsIgnoreCase("wm3")) {
					Class188.method3663(3, 1024, 768, false, (byte) -98);
					if (Class81.method1574((byte) 3) == 3)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (16 != -1927019389 * client.anInt11048)
						Class493.method7997("Failure", (byte) 8);
					else {
						int i = -1;
						Object object = null;
						string = string.substring(9);
						int i_79_ = string.indexOf(' ');
						if (i_79_ == -1)
							Class493.method7997("Failure", (byte) 8);
						else {
							try {
								i = Integer.parseInt(string.substring(0, i_79_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i)
								Class493.method7997("Failure", (byte) 8);
							else {
								String string_80_ = new StringBuilder().append(string.substring(i_79_ + 1).trim()).append(".runescape.com").toString();
								Class674.method13849(string_80_, i, (byte) -7);
								Class493.method7997("Success", (byte) 8);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class535.method8982(0, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(201527466) == 0) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 0, 155790563);
						Class631.method10465(-364233181);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class535.method8982(1, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-515650727) == 1) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 1, 646033975);
						Class631.method10465(-443490571);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class535.method8982(3, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1805802765) == 3) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 3, 1058965038);
						Class631.method10465(-2096018003);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class535.method8982(5, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1685843163) == 5) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 5, 1895727071);
						Class631.method10465(554395006);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (9 == client.anInt11048 * -1927019389)
						Class313_Sub1.method15658((byte) -40);
					else if (10 == client.anInt11048 * -1927019389)
						client.aClass109_11067.aBool1378 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class109[] class109s = client.aClass109Array11068;
					for (int i = 0; i < class109s.length; i++) {
						Class109 class109 = class109s[i];
						if (class109.method1967(1947256583) != null)
							class109.method1967(2004133942).method9471(607173300);
					}
					Class454.aClass452_4972.method7329(1901046302);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i = Integer.parseInt(string.substring(17));
					Class493.method7997(new StringBuilder().append("varpbit=").append(Class671.aClass97_8584.method100(Class671.aClass97_8584.method123(i, 1072299351), (short) -22809)).toString(), (byte) 8);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i = Integer.parseInt(string.substring(14));
					Class493.method7997(new StringBuilder().append("varp=").append(Class671.aClass97_8584.method101((Class671.aClass97_8584.method125(Class465.aClass465_5313, i, -310062115)), 1096407173)).toString(), (byte) 8);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class592.method9875(string.substring(12), ' ', (short) -27373);
					if (2 == strings.length || strings.length == 3) {
						if (Class266.method5045((byte) 1))
							Class635.method10556(1700003266);
						Class327.method5803(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, -1608468072);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class592.method9875(string.substring(8), ' ', (short) -12309);
					int i = Integer.parseInt(strings[0]);
					String string_81_ = strings.length > 1 ? strings[1] : "";
					Class325.method5750(i, string_81_, true, -1173855569);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class234.method4347(-1408626088)).append(".log").toString());
						if (file.exists()) {
							Class493.method7997("file already exists!", (byte) 8);
							return;
						}
					}
					if (null != Class503.aFileOutputStream6884) {
						Class503.aFileOutputStream6884.close();
						Class503.aFileOutputStream6884 = null;
					}
					try {
						Class503.aFileOutputStream6884 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class493.method7997(new StringBuilder().append("Could not create ").append(file.getName()).toString(), (byte) 8);
					} catch (SecurityException securityexception) {
						Class493.method7997(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), (byte) 8);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (null != Class503.aFileOutputStream6884)
						Class503.aFileOutputStream6884.close();
					Class503.aFileOutputStream6884 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class493.method7997("No such file", (byte) 8);
						return;
					}
					byte[] is = Class389.method6464(file, 1403795015);
					if (is == null) {
						Class493.method7997("Failed to read file", (byte) 8);
						return;
					}
					String[] strings = (Class592.method9875(Class307.method5616(Class237.method4371(is, (byte) -9), '\r', "", -1424204501), '\n', (short) -23216));
					Class633.method10517(strings, (short) 6997);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					aBool1335 = !aBool1335;
					Class493.method7997("Success", (byte) 8);
					return;
				}
				if (-1927019389 * client.anInt11048 == 9 || 0 == -1927019389 * client.anInt11048) {
					Class109 class109 = Class203.method3782((byte) -1);
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4499, class109.aClass2_1367, (byte) -42);
					class527_sub15.buffer.writeByte(string.length() + 3, -377137136);
					class527_sub15.buffer.writeByte(bool ? 1 : 0, 2089878402);
					class527_sub15.buffer.writeByte(bool_76_ ? 1 : 0, 1379963027);
					class527_sub15.buffer.writeString(string, -985573837);
					class109.method1969(class527_sub15, (byte) 1);
				}
			} catch (Exception exception) {
				Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -23), (byte) 8);
				return;
			}
		}
		if (9 != -1927019389 * client.anInt11048 && -1927019389 * client.anInt11048 != 0)
			Class493.method7997(new StringBuilder().append(Class53.aClass53_530.method1290(Class144_Sub1.aClass671_8995, (byte) -48)).append(string).toString(), (byte) 8);
	}

	public static void method1922(String string, boolean bool, boolean bool_82_) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class493.method7997("commands - This command", (byte) 8);
					Class493.method7997("cls - Clear console", (byte) 8);
					Class493.method7997("displayfps - Toggle FPS and other information", (byte) 8);
					Class493.method7997("renderer - Print graphics renderer information", (byte) 8);
					Class493.method7997("heap - Print java memory information", (byte) 8);
					Class493.method7997("getcamerapos - Print location and direction of camera for use in bug reports", (byte) 8);
				} else if (string.equalsIgnoreCase("cls")) {
					anInt1329 = 0;
					anInt1331 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11022 = !client.aBool11022;
					if (client.aBool11022)
						Class493.method7997("FPS on", (byte) 8);
					else
						Class493.method7997("FPS off", (byte) 8);
				} else if (string.equals("renderer")) {
					Class143 class143 = Class402.aClass180_4150.method3077();
					Class493.method7997(new StringBuilder().append("Toolkit ID: ").append(Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-263339860)).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Vendor: ").append(class143.anInt1664 * -1388704187).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Name: ").append(class143.aString1665).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Version: ").append(1758152749 * class143.anInt1660).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Device: ").append(class143.aString1667).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Driver Version: ").append(class143.aLong1668 * -3959867577634484715L).toString(), (byte) 8);
					String string_83_ = Class402.aClass180_4150.method3096();
					if (string_83_.length() > 0)
						Class493.method7997(string_83_, (byte) 8);
				} else if (string.equals("heap"))
					Class493.method7997(new StringBuilder().append("Heap: ").append(814176903 * Class515.anInt7045).append("MB").toString(), (byte) 8);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class592 class592 = client.aClass509_11072.method8283((short) 23490);
					if (2 == Class30.anInt265 * -349191067) {
						Class442 class442 = Class208_Sub10.aClass296_Sub1_9923.method5377(-1152966156);
						Class442 class442_84_ = Class208_Sub10.aClass296_Sub1_9923.method5379(2135204638);
						Class493.method7997(new StringBuilder().append("Pos: ").append(new Class592((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9).toString()).append(" Height: ")
								.append((Class590.method9853(((int) class442.aFloat4918 - (class592.anInt7798 * 153371143 << 9)), ((int) class442.aFloat4919 - (-2029646807 * class592.anInt7799 << 9)), (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) + (int) class442.aFloat4915).toString(), (byte) 8);
						Class493.method7997(new StringBuilder().append("Look: ").append(new Class592((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (int) class442_84_.aFloat4918 >> 9, (int) class442_84_.aFloat4919 >> 9).toString()).append(" Height: ")
								.append((Class590.method9853(((int) class442_84_.aFloat4918 - (153371143 * class592.anInt7798 << 9)), ((int) class442.aFloat4919 - (class592.anInt7799 * -2029646807 << 9)), (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) + (int) class442.aFloat4915).toString(), (byte) 8);
					} else {
						Class493.method7997(new StringBuilder().append("Pos: ").append(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864).append(",").append(((-1998563323 * Class320.anInt3543 >> 9) + class592.anInt7798 * 153371143) >> 6).append(",").append((-2029646807 * class592.anInt7799 + (Class201.anInt2211 * -1261737255 >> 9)) >> 6).append(",").append(((-1998563323 * Class320.anInt3543 >> 9) + 153371143 * class592.anInt7798) & 0x3f).append(",")
								.append(((Class201.anInt2211 * -1261737255 >> 9) + -2029646807 * class592.anInt7799) & 0x3f).append(" Height: ").append((Class590.method9853(-1998563323 * Class320.anInt3543, Class201.anInt2211 * -1261737255, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) - Class142.anInt1657 * 298893113).toString(), (byte) 8);
						Class493.method7997(new StringBuilder().append("Look: ").append(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864).append(",").append((153371143 * class592.anInt7798 + Class405.anInt4196 * 1947698627) >> 6).append(",").append((class592.anInt7799 * -2029646807 + -965941693 * Class170.anInt1881) >> 6).append(",").append((1947698627 * Class405.anInt4196 + class592.anInt7798 * 153371143) & 0x3f).append(",")
								.append((-965941693 * Class170.anInt1881 + -2029646807 * class592.anInt7799) & 0x3f).append(" Height: ").append((Class590.method9853(Class405.anInt4196 * 1947698627, -965941693 * Class170.anInt1881, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) - -1151746675 * Class447.anInt4930).toString(), (byte) 8);
					}
				}
			} catch (Exception exception) {
				Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -45), (byte) 8);
			}
			return;
		} while (false);
		if (Class73.aClass677_790 != Class677.aClass677_8596 || 962135673 * client.anInt11075 >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class188.method3663(1, -1, -1, false, (byte) -4);
					if (Class81.method1574((byte) 3) == 1)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class188.method3663(2, -1, -1, false, (byte) -11);
					if (Class81.method1574((byte) 3) == 2)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (Class707.aBool8841 && string.equalsIgnoreCase("wm3")) {
					Class188.method3663(3, 1024, 768, false, (byte) -80);
					if (Class81.method1574((byte) 3) == 3)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (16 != -1927019389 * client.anInt11048)
						Class493.method7997("Failure", (byte) 8);
					else {
						int i = -1;
						Object object = null;
						string = string.substring(9);
						int i_85_ = string.indexOf(' ');
						if (i_85_ == -1)
							Class493.method7997("Failure", (byte) 8);
						else {
							try {
								i = Integer.parseInt(string.substring(0, i_85_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i)
								Class493.method7997("Failure", (byte) 8);
							else {
								String string_86_ = new StringBuilder().append(string.substring(i_85_ + 1).trim()).append(".runescape.com").toString();
								Class674.method13849(string_86_, i, (byte) -55);
								Class493.method7997("Success", (byte) 8);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class535.method8982(0, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(49441733) == 0) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 0, 871939457);
						Class631.method10465(-1917926748);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class535.method8982(1, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1909467488) == 1) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 1, 1906624038);
						Class631.method10465(914989089);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class535.method8982(3, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1753697533) == 3) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 3, 1483709023);
						Class631.method10465(-790954650);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class535.method8982(5, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(179893421) == 5) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 5, 1932727077);
						Class631.method10465(57462551);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (9 == client.anInt11048 * -1927019389)
						Class313_Sub1.method15658((byte) 24);
					else if (10 == client.anInt11048 * -1927019389)
						client.aClass109_11067.aBool1378 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class109[] class109s = client.aClass109Array11068;
					for (int i = 0; i < class109s.length; i++) {
						Class109 class109 = class109s[i];
						if (class109.method1967(2039487600) != null)
							class109.method1967(2010867592).method9471(845140387);
					}
					Class454.aClass452_4972.method7329(2069198714);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i = Integer.parseInt(string.substring(17));
					Class493.method7997(new StringBuilder().append("varpbit=").append(Class671.aClass97_8584.method100(Class671.aClass97_8584.method123(i, -1854516576), (short) -15629)).toString(), (byte) 8);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i = Integer.parseInt(string.substring(14));
					Class493.method7997(new StringBuilder().append("varp=").append(Class671.aClass97_8584.method101((Class671.aClass97_8584.method125(Class465.aClass465_5313, i, -2099760361)), 1096407173)).toString(), (byte) 8);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class592.method9875(string.substring(12), ' ', (short) -31173);
					if (2 == strings.length || strings.length == 3) {
						if (Class266.method5045((byte) 1))
							Class635.method10556(1700003266);
						Class327.method5803(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, -1894678938);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class592.method9875(string.substring(8), ' ', (short) -282);
					int i = Integer.parseInt(strings[0]);
					String string_87_ = strings.length > 1 ? strings[1] : "";
					Class325.method5750(i, string_87_, true, -1173855569);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class234.method4347(-1408626088)).append(".log").toString());
						if (file.exists()) {
							Class493.method7997("file already exists!", (byte) 8);
							return;
						}
					}
					if (null != Class503.aFileOutputStream6884) {
						Class503.aFileOutputStream6884.close();
						Class503.aFileOutputStream6884 = null;
					}
					try {
						Class503.aFileOutputStream6884 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class493.method7997(new StringBuilder().append("Could not create ").append(file.getName()).toString(), (byte) 8);
					} catch (SecurityException securityexception) {
						Class493.method7997(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), (byte) 8);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (null != Class503.aFileOutputStream6884)
						Class503.aFileOutputStream6884.close();
					Class503.aFileOutputStream6884 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class493.method7997("No such file", (byte) 8);
						return;
					}
					byte[] is = Class389.method6464(file, 1382514601);
					if (is == null) {
						Class493.method7997("Failed to read file", (byte) 8);
						return;
					}
					String[] strings = (Class592.method9875(Class307.method5616(Class237.method4371(is, (byte) 7), '\r', "", -841667009), '\n', (short) -11516));
					Class633.method10517(strings, (short) 28261);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					aBool1335 = !aBool1335;
					Class493.method7997("Success", (byte) 8);
					return;
				}
				if (-1927019389 * client.anInt11048 == 9 || 0 == -1927019389 * client.anInt11048) {
					Class109 class109 = Class203.method3782((byte) -1);
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4499, class109.aClass2_1367, (byte) 54);
					class527_sub15.buffer.writeByte(string.length() + 3, 121873860);
					class527_sub15.buffer.writeByte(bool ? 1 : 0, 135874512);
					class527_sub15.buffer.writeByte(bool_82_ ? 1 : 0, 1830447224);
					class527_sub15.buffer.writeString(string, 54790919);
					class109.method1969(class527_sub15, (byte) 1);
				}
			} catch (Exception exception) {
				Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -81), (byte) 8);
				return;
			}
		}
		if (9 != -1927019389 * client.anInt11048 && -1927019389 * client.anInt11048 != 0)
			Class493.method7997(new StringBuilder().append(Class53.aClass53_530.method1290(Class144_Sub1.aClass671_8995, (byte) -44)).append(string).toString(), (byte) 8);
	}

	static void method1923(int i) {
		if (i == 21)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class44.method1193((short) -8204);
			else if (16 == i)
				Class493.method7997(new StringBuilder().append("").append(-1176934951 * Class515.anInt7014).toString(), (byte) 8);
			else if (3 == i) {
				Class566 class566 = (client.aClass509_11072.method8314(1189290073).aClass566_7430);
				class566.aBool7603 = !class566.aBool7603;
			} else if (i == 24)
				client.aBool11022 = true;
			else if (i == 23)
				client.aBool11022 = false;
			else if (i == 19)
				client.aClass705_11182.method14332(-879877775);
			else if (i == 29) {
				Class676_Sub1.method17023(360736877);
				for (int i_88_ = 0; i_88_ < 10; i_88_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_89_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_89_).toString(), (byte) 8);
			} else if (i == 27) {
				Class676_Sub1.method17023(855518233);
				for (int i_90_ = 0; i_90_ < 10; i_90_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_91_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_91_).toString(), (byte) 8);
				Class172.method2741(924644131);
				Class676_Sub1.method17023(1358119130);
				for (int i_92_ = 0; i_92_ < 10; i_92_++)
					System.gc();
				i_91_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_91_).toString(), (byte) 8);
			} else if (5 == i)
				Class493.method7997((Class234.aClass539_2374.method368((byte) -49) ? "Success" : "Failure"), (byte) 8);
			else if (28 == i)
				Class3.aClass13_34.method700(1606043525);
			else if (22 == i)
				Class454.aClass452_4972.method7307(-6689119);
			else if (13 == i)
				Class454.aClass452_4972.method7306(-2143181470);
			else if (7 == i)
				Class451.aCanvas4939.setLocation(50, 50);
			else if (i == 25)
				Class451.aCanvas4939.setLocation((Class515.anInt7019 * -416298495), (Class515.anInt7020 * -1313216019));
			else if (17 == i)
				Class633.method10519((byte) 0);
			else if (8 == i) {
				client.aClass509_11072.aLong6966 = Class234.method4347(-1408626088) * -3945043459867598971L;
				client.aClass509_11072.aBool6939 = true;
				Class633.method10519((byte) 0);
			} else if (10 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append((int) class442.aFloat4918 >> 9).append(" ").append((int) class442.aFloat4919 >> 9).toString(), (byte) 8);
			} else if (11 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append("").append(client.aClass509_11072.method8314(207039320).aClass161Array7434[(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)].method2595((int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, (byte) 110)).toString(), (byte) 8);
			} else if (1 == i) {
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2492.method3789(1001793812)).append(" ").append(Class243.aClass205_2492.method3810(1774393907)).toString(), (byte) 8);
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2497.method3789(1150307218)).append(" ").append(Class243.aClass205_2497.method3810(1448279175)).toString(), (byte) 8);
			} else if (4 == i)
				Class32.method942(false, -592086956);
			else if (20 == i) {
				client.aBool11023 = !client.aBool11023;
				Class402.aClass180_4150.method3339(client.aBool11023);
				Class527_Sub8_Sub16.method18399((byte) -27);
			} else if (14 == i) {
				client.anInt11032 = 0;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 15) {
				client.anInt11032 = 1087431529;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 26) {
				client.anInt11032 = -2120104238;
				client.aClass509_11072.method8361(-428559959);
			}
		} catch (Exception exception) {
			Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -81), (byte) 8);
		}
	}

	static void method1924(int i) {
		if (i == 21)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class44.method1193((short) -20083);
			else if (16 == i)
				Class493.method7997(new StringBuilder().append("").append(-1176934951 * Class515.anInt7014).toString(), (byte) 8);
			else if (3 == i) {
				Class566 class566 = (client.aClass509_11072.method8314(-283914399).aClass566_7430);
				class566.aBool7603 = !class566.aBool7603;
			} else if (i == 24)
				client.aBool11022 = true;
			else if (i == 23)
				client.aBool11022 = false;
			else if (i == 19)
				client.aClass705_11182.method14332(-2011250080);
			else if (i == 29) {
				Class676_Sub1.method17023(2084437372);
				for (int i_93_ = 0; i_93_ < 10; i_93_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_94_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_94_).toString(), (byte) 8);
			} else if (i == 27) {
				Class676_Sub1.method17023(-986595216);
				for (int i_95_ = 0; i_95_ < 10; i_95_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_96_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_96_).toString(), (byte) 8);
				Class172.method2741(608263720);
				Class676_Sub1.method17023(402943455);
				for (int i_97_ = 0; i_97_ < 10; i_97_++)
					System.gc();
				i_96_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_96_).toString(), (byte) 8);
			} else if (5 == i)
				Class493.method7997((Class234.aClass539_2374.method368((byte) -46) ? "Success" : "Failure"), (byte) 8);
			else if (28 == i)
				Class3.aClass13_34.method700(1769165206);
			else if (22 == i)
				Class454.aClass452_4972.method7307(-249970183);
			else if (13 == i)
				Class454.aClass452_4972.method7306(-2142040631);
			else if (7 == i)
				Class451.aCanvas4939.setLocation(50, 50);
			else if (i == 25)
				Class451.aCanvas4939.setLocation((Class515.anInt7019 * -416298495), (Class515.anInt7020 * -1313216019));
			else if (17 == i)
				Class633.method10519((byte) 0);
			else if (8 == i) {
				client.aClass509_11072.aLong6966 = Class234.method4347(-1408626088) * -3945043459867598971L;
				client.aClass509_11072.aBool6939 = true;
				Class633.method10519((byte) 0);
			} else if (10 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append((int) class442.aFloat4918 >> 9).append(" ").append((int) class442.aFloat4919 >> 9).toString(), (byte) 8);
			} else if (11 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append("").append(client.aClass509_11072.method8314(2048358866).aClass161Array7434[(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)].method2595((int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, (byte) 66)).toString(), (byte) 8);
			} else if (1 == i) {
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2492.method3789(786543671)).append(" ").append(Class243.aClass205_2492.method3810(214169830)).toString(), (byte) 8);
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2497.method3789(658479947)).append(" ").append(Class243.aClass205_2497.method3810(618076982)).toString(), (byte) 8);
			} else if (4 == i)
				Class32.method942(false, -1404038755);
			else if (20 == i) {
				client.aBool11023 = !client.aBool11023;
				Class402.aClass180_4150.method3339(client.aBool11023);
				Class527_Sub8_Sub16.method18399((byte) 36);
			} else if (14 == i) {
				client.anInt11032 = 0;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 15) {
				client.anInt11032 = 1087431529;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 26) {
				client.anInt11032 = -2120104238;
				client.aClass509_11072.method8361(-428559959);
			}
		} catch (Exception exception) {
			Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -72), (byte) 8);
		}
	}

	static boolean method1925() {
		return aBool1341;
	}

	public static void method1926(String string) {
		aString1337 = string;
		anInt1339 = aString1337.length() * 207030263;
	}

	static {
		anInt1332 = 0;
		aBool1341 = false;
		anInt1342 = 1382613763;
	}

	static void method1927() {
		if (Class204.aClass527_Sub31_2213.aClass700_Sub22_10631.method17121((byte) -38) == 1)
			Class396.aClass506_4119.method8239(new Class514((Class503.aClass503_6881), null), (byte) -97);
		else {
			client.aClass509_11072.method8361(-428559959);
			Class49.method1264(-287576266);
		}
	}

	public static void method1928(byte i) {
		for (Class527_Sub8_Sub4 class527_sub8_sub4 = ((Class527_Sub8_Sub4) Class35.aClass693_350.method14072(1110356459)); class527_sub8_sub4 != null; class527_sub8_sub4 = ((Class527_Sub8_Sub4) Class35.aClass693_350.method14059(-2118230286))) {
			if (1731231531 * class527_sub8_sub4.anInt11625 > 1) {
				class527_sub8_sub4.anInt11625 = 0;
				Class35.aClass205_353.method3790(class527_sub8_sub4, (-721900060440722165L * (((Class527_Sub8_Sub7) (class527_sub8_sub4.aClass693_11624.aClass527_Sub8_8734.aClass527_Sub8_10400)).aLong11649)));
				class527_sub8_sub4.aClass693_11624.method14054(263278066);
			}
		}
		Class35.anInt347 = 0;
		Class35.anInt346 = 0;
		Class35.aClass694_348.method14105((byte) 77);
		Class35.aClass14_349.method721(962631306);
		Class35.aClass693_350.method14054(781422684);
		Class35.aBool338 = false;
	}
}

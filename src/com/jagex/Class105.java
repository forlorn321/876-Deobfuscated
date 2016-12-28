/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;

public class Class105 {
	static final String aString1236 = "Success";
	static int anInt1237;
	static int anInt1238;
	static int anInt1239;
	static int anInt1240;
	static final int anInt1241 = 100;
	static boolean aBool1242;
	static String aString1243;
	static int anInt1244;
	static final int anInt1245 = 350;
	static int anInt1246;
	static int anInt1247 = 0;
	static boolean aBool1248;
	static int anInt1249;
	static final String aString1250 = "\\/.:, _-+[]~@";
	static int[] anIntArray1251;
	static final String aString1252 = "Failure";
	public static int anInt1253;

	static void method1381(int i) {
		if (21 == i)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class98_Sub1.method8393(48831511);
			else if (16 == i)
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(-311312947 * Class505.anInt6856).toString());
			else if (3 == i) {
				Class544 class544 = (client.aClass515_11066.method6249(-1118250862).aClass544_7426);
				class544.aBool7239 = !class544.aBool7239;
			} else if (i == 24)
				client.aBool11314 = true;
			else if (i == 23)
				client.aBool11314 = false;
			else if (19 == i)
				client.aClass695_11176.method8211(1717321865);
			else if (i == 29) {
				Class528.method6436(-416780682);
				for (int i_0_ = 0; i_0_ < 10; i_0_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_1_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(i_1_).toString());
			} else if (i == 27) {
				Class528.method6436(-1032525149);
				for (int i_2_ = 0; i_2_ < 10; i_2_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_3_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(i_3_).toString());
				Class99.method1332((byte) -73);
				Class528.method6436(-977670580);
				for (int i_4_ = 0; i_4_ < 10; i_4_++)
					System.gc();
				i_3_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(i_3_).toString());
			} else if (5 == i)
				Class214.sendPanelBoxMessage((Class399.aClass530_4128.method209(1652125477) ? "Success" : "Failure"));
			else if (i == 28)
				Class23.aClass5_221.method574(549166085);
			else if (22 == i)
				Class176.aClass460_1936.method5532(-393412474);
			else if (i == 13)
				Class176.aClass460_1936.method5531(-1445320711);
			else if (i == 7)
				Class399.aCanvas4127.setLocation(50, 50);
			else if (i == 25)
				Class399.aCanvas4127.setLocation((Class505.anInt6887 * 1509041125), (Class505.anInt6863 * -1413419225));
			else if (i == 17)
				Class388.method4850((byte) 46);
			else if (8 == i) {
				client.aClass515_11066.aLong6997 = Class249.method3450(1901521319) * 3854533756139245955L;
				client.aClass515_11066.aBool7004 = true;
				Class388.method4850((byte) 57);
			} else if (i == 10) {
				Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
				Class214.sendPanelBoxMessage(new StringBuilder().append((int) class436.aFloat4850 >> 9).append(" ").append((int) class436.aFloat4853 >> 9).toString());
			} else if (11 == i) {
				Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(client.aClass515_11066.method6249(-799906230).aClass160Array7431[(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)].method1927((int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, -404152619)).toString());
			} else if (i == 1) {
				Class214.sendPanelBoxMessage(new StringBuilder().append(IComponentDefinitions.aClass199_2552.method2885(-182950659)).append(" ").append(IComponentDefinitions.aClass199_2552.method2891(453221733)).toString());
				Class214.sendPanelBoxMessage(new StringBuilder().append(IComponentDefinitions.aClass199_2694.method2885(932762102)).append(" ").append(IComponentDefinitions.aClass199_2694.method2891(453221733)).toString());
			} else if (4 == i)
				Class558.method6817(false, -1259622727);
			else if (20 == i) {
				client.aBool11018 = !client.aBool11018;
				Class677.aClass167_8609.method2134(client.aBool11018);
				Class580.method7018(-1095530067);
			} else if (14 == i) {
				client.anInt11027 = 0;
				client.aClass515_11066.method6319(-1267164241);
			} else if (15 == i) {
				client.anInt11027 = -560209343;
				client.aClass515_11066.method6319(-840841861);
			} else if (i == 26) {
				client.anInt11027 = -1120418686;
				client.aClass515_11066.method6319(-758828535);
			}
		} catch (Exception exception) {
			Class214.sendPanelBoxMessage(Class38.aClass38_305.method840(Class459.aClass664_5178, 1430231994));
		}
	}

	static {
		anInt1240 = 0;
		aBool1242 = true;
		aString1243 = "";
		anInt1239 = 0;
		anInt1246 = 0;
		anInt1244 = 0;
		aBool1248 = false;
		anInt1249 = 1325171319;
	}

	static void method1382() {
		if (Class54.method942(1239028333)) {
			if (null == Class205_Sub16.aStringArray9941)
				Class558.method6818(1551682379);
			aBool1248 = true;
			anInt1244 = 0;
			anIntArray1251 = new int[100];
			Class388.anIntArray4046 = new int[100];
			Class536_Sub22_Sub1.anIntArray11618 = new int[100];
			Class16_Sub1.anIntArray10976 = new int[100];
			for (int i = 0; i < 100; i++) {
				anIntArray1251[i] = ((int) (Math.random() * (double) (Class144.anInt1679 * -1804846931)) << 4) + (int) (Math.random() * 15.0);
				Class388.anIntArray4046[i] = (int) (Math.random() * 350.0) << 4;
				Class536_Sub22_Sub1.anIntArray11618[i] = (int) (Math.random() * 102.0) + 51;
				Class16_Sub1.anIntArray10976[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class271.anIntArray2887 = new int[-1804846931 * Class144.anInt1679 >> 1];
		}
	}

	static void method1383() {
		if (-1734559211 * anInt1239 > 0) {
			int i = 0;
			for (int i_5_ = 0; i_5_ < Class205_Sub16.aStringArray9941.length; i_5_++) {
				if (Class205_Sub16.aStringArray9941[i_5_].indexOf("--> ") != -1 && ++i == -1734559211 * anInt1239) {
					aString1243 = (Class205_Sub16.aStringArray9941[i_5_].substring(Class205_Sub16.aStringArray9941[i_5_].indexOf('>') + 2));
					break;
				}
			}
		} else
			aString1243 = "";
	}

	static void method1384() {
		/* empty */
	}

	static void method1385() {
		anInt1237 = (Class260.aClass2_2840.anInt91 * 877418673 + Class260.aClass2_2840.anInt92 * 1268958251 + -189901886);
		anInt1238 = -1999012470 + (-225540395 * Class223.aClass2_2338.anInt91 + 1806194679 * Class223.aClass2_2338.anInt92);
		Class205_Sub16.aStringArray9941 = new String[500];
		for (int i = 0; i < Class205_Sub16.aStringArray9941.length; i++)
			Class205_Sub16.aStringArray9941[i] = "";
		Class214.sendPanelBoxMessage(Class38.aClass38_364.method840((Class459.aClass664_5178), 1334253947));
	}

	static void method1386() {
		aBool1248 = false;
		anIntArray1251 = null;
		Class388.anIntArray4046 = null;
		Class536_Sub22_Sub1.anIntArray11618 = null;
		Class16_Sub1.anIntArray10976 = null;
		Class552.method6692(-1596111077);
	}

	static void method1387() {
		anInt1237 = (Class260.aClass2_2840.anInt91 * 877418673 + Class260.aClass2_2840.anInt92 * 1268958251 + -189901886);
		anInt1238 = -1999012470 + (-225540395 * Class223.aClass2_2338.anInt91 + 1806194679 * Class223.aClass2_2338.anInt92);
		Class205_Sub16.aStringArray9941 = new String[500];
		for (int i = 0; i < Class205_Sub16.aStringArray9941.length; i++)
			Class205_Sub16.aStringArray9941[i] = "";
		Class214.sendPanelBoxMessage(Class38.aClass38_364.method840((Class459.aClass664_5178), 2087226637));
	}

	static boolean method1388() {
		return aBool1248;
	}

	static boolean method1389() {
		return aBool1248;
	}

	static boolean method1390() {
		return aBool1248;
	}

	static boolean method1391() {
		return aBool1248;
	}

	static void method1392() {
		if (anInt1244 * 935006559 < 102)
			anInt1244 += -1634648134;
		if (-1 != 245237945 * anInt1249 && (-3539970786558336363L * Class332.aLong3619 < Class249.method3450(1562134580))) {
			for (int i = anInt1249 * 245237945; i < Class550_Sub1.aStringArray10618.length; i++) {
				if (Class550_Sub1.aStringArray10618[i].startsWith("pause")) {
					int i_6_ = 5;
					try {
						i_6_ = Integer.parseInt(Class550_Sub1.aStringArray10618[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class214.sendPanelBoxMessage(new StringBuilder().append("Pausing for ").append(i_6_).append(" seconds...").toString());
					anInt1249 = -1325171319 * (1 + i);
					Class332.aLong3619 = (Class249.method3450(1950168488) + (long) (1000 * i_6_)) * -5369841114397763395L;
					return;
				}
				aString1243 = Class550_Sub1.aStringArray10618[i];
				Class325.method4278(false, 434242750);
			}
			anInt1249 = 1325171319;
		}
		if (0 != 1990425561 * client.anInt11031) {
			anInt1240 -= 806501159 * client.anInt11031;
			if (anInt1240 * 817280251 >= -2122502799 * anInt1247)
				anInt1240 = -716381309 * anInt1247 - -2034813389;
			if (anInt1240 * 817280251 < 0)
				anInt1240 = 0;
			client.anInt11031 = 0;
		}
		for (int i = 0; i < client.anInt11033 * -1816034791; i++) {
			Interface63 interface63 = client.anInterface63Array11034[i];
			int i_7_ = interface63.method413(864830556);
			char c = interface63.method412((byte) -124);
			int i_8_ = interface63.method419(604216331);
			if (i_7_ == 84)
				Class325.method4278(false, 434242750);
			if (i_7_ == 80)
				Class325.method4278(true, 434242750);
			else if (66 == i_7_ && 0 != (i_8_ & 0x4)) {
				if (null != Class400.aClipboard4137) {
					String string = "";
					for (int i_9_ = Class205_Sub16.aStringArray9941.length - 1; i_9_ >= 0; i_9_--) {
						if (Class205_Sub16.aStringArray9941[i_9_] != null && (Class205_Sub16.aStringArray9941[i_9_].length() > 0))
							string = new StringBuilder().append(string).append(Class205_Sub16.aStringArray9941[i_9_]).append('\n').toString();
					}
					Class400.aClipboard4137.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_7_ && 0 != (i_8_ & 0x4)) {
				if (Class400.aClipboard4137 != null) {
					try {
						Transferable transferable = Class400.aClipboard4137.getContents(null);
						if (transferable != null) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (null != string) {
								String[] strings = Class344.method4483(string, '\n', (byte) -124);
								Class167_Sub1.method8472(strings, -14291209);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_7_ == 85 && -478568567 * anInt1246 > 0) {
				aString1243 = new StringBuilder().append(aString1243.substring(0, anInt1246 * -478568567 - 1)).append(aString1243.substring(anInt1246 * -478568567)).toString();
				anInt1246 -= -1505065287;
			} else if (i_7_ == 101 && -478568567 * anInt1246 < aString1243.length())
				aString1243 = new StringBuilder().append(aString1243.substring(0, -478568567 * anInt1246)).append(aString1243.substring(1 + anInt1246 * -478568567)).toString();
			else if (96 == i_7_ && anInt1246 * -478568567 > 0)
				anInt1246 -= -1505065287;
			else if (i_7_ == 97 && -478568567 * anInt1246 < aString1243.length())
				anInt1246 += -1505065287;
			else if (i_7_ == 102)
				anInt1246 = 0;
			else if (103 == i_7_)
				anInt1246 = aString1243.length() * -1505065287;
			else if (104 == i_7_ && (-1734559211 * anInt1239 < Class205_Sub16.aStringArray9941.length)) {
				anInt1239 += 1921008957;
				Class194.method2855(-1786401803);
				anInt1246 = aString1243.length() * -1505065287;
			} else if (105 == i_7_ && -1734559211 * anInt1239 > 0) {
				anInt1239 -= 1921008957;
				Class194.method2855(-1786401803);
				anInt1246 = aString1243.length() * -1505065287;
			} else if (Class608.method7260(c, 1684601051) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1243 = new StringBuilder().append(aString1243.substring(0, -478568567 * anInt1246)).append(client.anInterface63Array11034[i].method412((byte) -117)).append(aString1243.substring(-478568567 * anInt1246)).toString();
				anInt1246 += -1505065287;
			}
		}
		client.anInt11033 = 0;
		client.anInt11036 = 0;
		if (-1804846931 * Class144.anInt1679 >> 1 != Class271.anIntArray2887.length)
			Class271.anIntArray2887 = new int[Class144.anInt1679 * -1804846931 >> 1];
		for (int i = 0; i < 100; i++) {
			Class388.anIntArray4046[i] += Class16_Sub1.anIntArray10976[i];
			if (Class388.anIntArray4046[i] >> 4 >= 350) {
				int i_10_ = anIntArray1251[i] >> 4;
				int i_11_ = anIntArray1251[i] & 0xf;
				i_10_ += ((Class447.anIntArray4906[i_11_ * 1023 + (350 + (i_10_ & 0x40)) * 64 & 0x3fff]) >> 10);
				i_10_ >>= 1;
				for (int i_12_ = -3; i_12_ <= 3; i_12_++) {
					if (i_10_ + i_12_ >= 0 && i_12_ + i_10_ < Class271.anIntArray2887.length)
						Class271.anIntArray2887[i_12_ + i_10_] += 4 - Math.abs(i_12_);
				}
				anIntArray1251[i] = ((int) (Math.random() * (double) (-1804846931 * Class144.anInt1679)) << 4) + (int) (Math.random() * 15.0);
				Class388.anIntArray4046[i] = 0;
				Class536_Sub22_Sub1.anIntArray11618[i] = (int) (Math.random() * 102.0) + 51;
				Class16_Sub1.anIntArray10976[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class552.method6692(-1613925309);
	}

	static void method1393() {
		if (null != Class710_Sub7.aFileOutputStream10835) {
			try {
				Class710_Sub7.aFileOutputStream10835.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class710_Sub7.aFileOutputStream10835 = null;
	}

	static void method1394() {
		if (-1734559211 * anInt1239 > 0) {
			int i = 0;
			for (int i_13_ = 0; i_13_ < Class205_Sub16.aStringArray9941.length; i_13_++) {
				if ((Class205_Sub16.aStringArray9941[i_13_].indexOf("--> ") != -1) && ++i == -1734559211 * anInt1239) {
					aString1243 = (Class205_Sub16.aStringArray9941[i_13_].substring(Class205_Sub16.aStringArray9941[i_13_].indexOf('>') + 2));
					break;
				}
			}
		} else
			aString1243 = "";
	}

	static void method1395() {
		if (-1734559211 * anInt1239 > 0) {
			int i = 0;
			for (int i_14_ = 0; i_14_ < Class205_Sub16.aStringArray9941.length; i_14_++) {
				if ((Class205_Sub16.aStringArray9941[i_14_].indexOf("--> ") != -1) && ++i == -1734559211 * anInt1239) {
					aString1243 = (Class205_Sub16.aStringArray9941[i_14_].substring(Class205_Sub16.aStringArray9941[i_14_].indexOf('>') + 2));
					break;
				}
			}
		} else
			aString1243 = "";
	}

	static void method1396() {
		if (null != Class710_Sub7.aFileOutputStream10835) {
			try {
				Class710_Sub7.aFileOutputStream10835.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class710_Sub7.aFileOutputStream10835 = null;
	}

	Class105() throws Throwable {
		throw new Error();
	}

	static void method1397() {
		/* empty */
	}

	static void method1398() {
		if (anInt1244 * 935006559 < 102)
			anInt1244 += -1634648134;
		if (-1 != 245237945 * anInt1249 && (-3539970786558336363L * Class332.aLong3619 < Class249.method3450(1325448677))) {
			for (int i = anInt1249 * 245237945; i < Class550_Sub1.aStringArray10618.length; i++) {
				if (Class550_Sub1.aStringArray10618[i].startsWith("pause")) {
					int i_15_ = 5;
					try {
						i_15_ = Integer.parseInt(Class550_Sub1.aStringArray10618[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class214.sendPanelBoxMessage(new StringBuilder().append("Pausing for ").append(i_15_).append(" seconds...").toString());
					anInt1249 = -1325171319 * (1 + i);
					Class332.aLong3619 = (Class249.method3450(1558397123) + (long) (1000 * i_15_)) * -5369841114397763395L;
					return;
				}
				aString1243 = Class550_Sub1.aStringArray10618[i];
				Class325.method4278(false, 434242750);
			}
			anInt1249 = 1325171319;
		}
		if (0 != 1990425561 * client.anInt11031) {
			anInt1240 -= 806501159 * client.anInt11031;
			if (anInt1240 * 817280251 >= -2122502799 * anInt1247)
				anInt1240 = -716381309 * anInt1247 - -2034813389;
			if (anInt1240 * 817280251 < 0)
				anInt1240 = 0;
			client.anInt11031 = 0;
		}
		for (int i = 0; i < client.anInt11033 * -1816034791; i++) {
			Interface63 interface63 = client.anInterface63Array11034[i];
			int i_16_ = interface63.method413(1188473578);
			char c = interface63.method412((byte) -108);
			int i_17_ = interface63.method419(1206053913);
			if (i_16_ == 84)
				Class325.method4278(false, 434242750);
			if (i_16_ == 80)
				Class325.method4278(true, 434242750);
			else if (66 == i_16_ && 0 != (i_17_ & 0x4)) {
				if (null != Class400.aClipboard4137) {
					String string = "";
					for (int i_18_ = Class205_Sub16.aStringArray9941.length - 1; i_18_ >= 0; i_18_--) {
						if (Class205_Sub16.aStringArray9941[i_18_] != null && (Class205_Sub16.aStringArray9941[i_18_].length() > 0))
							string = new StringBuilder().append(string).append(Class205_Sub16.aStringArray9941[i_18_]).append('\n').toString();
					}
					Class400.aClipboard4137.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_16_ && 0 != (i_17_ & 0x4)) {
				if (Class400.aClipboard4137 != null) {
					try {
						Transferable transferable = Class400.aClipboard4137.getContents(null);
						if (transferable != null) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (null != string) {
								String[] strings = Class344.method4483(string, '\n', (byte) -102);
								Class167_Sub1.method8472(strings, -1996361148);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_16_ == 85 && -478568567 * anInt1246 > 0) {
				aString1243 = new StringBuilder().append(aString1243.substring(0, anInt1246 * -478568567 - 1)).append(aString1243.substring(anInt1246 * -478568567)).toString();
				anInt1246 -= -1505065287;
			} else if (i_16_ == 101 && -478568567 * anInt1246 < aString1243.length())
				aString1243 = new StringBuilder().append(aString1243.substring(0, -478568567 * anInt1246)).append(aString1243.substring(1 + anInt1246 * -478568567)).toString();
			else if (96 == i_16_ && anInt1246 * -478568567 > 0)
				anInt1246 -= -1505065287;
			else if (i_16_ == 97 && -478568567 * anInt1246 < aString1243.length())
				anInt1246 += -1505065287;
			else if (i_16_ == 102)
				anInt1246 = 0;
			else if (103 == i_16_)
				anInt1246 = aString1243.length() * -1505065287;
			else if (104 == i_16_ && (-1734559211 * anInt1239 < Class205_Sub16.aStringArray9941.length)) {
				anInt1239 += 1921008957;
				Class194.method2855(-1786401803);
				anInt1246 = aString1243.length() * -1505065287;
			} else if (105 == i_16_ && -1734559211 * anInt1239 > 0) {
				anInt1239 -= 1921008957;
				Class194.method2855(-1786401803);
				anInt1246 = aString1243.length() * -1505065287;
			} else if (Class608.method7260(c, 2015756713) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1243 = new StringBuilder().append(aString1243.substring(0, -478568567 * anInt1246)).append(client.anInterface63Array11034[i].method412((byte) -4)).append(aString1243.substring(-478568567 * anInt1246)).toString();
				anInt1246 += -1505065287;
			}
		}
		client.anInt11033 = 0;
		client.anInt11036 = 0;
		if (-1804846931 * Class144.anInt1679 >> 1 != Class271.anIntArray2887.length)
			Class271.anIntArray2887 = new int[Class144.anInt1679 * -1804846931 >> 1];
		for (int i = 0; i < 100; i++) {
			Class388.anIntArray4046[i] += Class16_Sub1.anIntArray10976[i];
			if (Class388.anIntArray4046[i] >> 4 >= 350) {
				int i_19_ = anIntArray1251[i] >> 4;
				int i_20_ = anIntArray1251[i] & 0xf;
				i_19_ += ((Class447.anIntArray4906[i_20_ * 1023 + (350 + (i_19_ & 0x40)) * 64 & 0x3fff]) >> 10);
				i_19_ >>= 1;
				for (int i_21_ = -3; i_21_ <= 3; i_21_++) {
					if (i_19_ + i_21_ >= 0 && i_21_ + i_19_ < Class271.anIntArray2887.length)
						Class271.anIntArray2887[i_21_ + i_19_] += 4 - Math.abs(i_21_);
				}
				anIntArray1251[i] = ((int) (Math.random() * (double) (-1804846931 * Class144.anInt1679)) << 4) + (int) (Math.random() * 15.0);
				Class388.anIntArray4046[i] = 0;
				Class536_Sub22_Sub1.anIntArray11618[i] = (int) (Math.random() * 102.0) + 51;
				Class16_Sub1.anIntArray10976[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class552.method6692(-1622094694);
	}

	static void method1399(int i) {
		if (21 == i)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class98_Sub1.method8393(1830015994);
			else if (16 == i)
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(-311312947 * Class505.anInt6856).toString());
			else if (3 == i) {
				Class544 class544 = (client.aClass515_11066.method6249(-1077234689).aClass544_7426);
				class544.aBool7239 = !class544.aBool7239;
			} else if (i == 24)
				client.aBool11314 = true;
			else if (i == 23)
				client.aBool11314 = false;
			else if (19 == i)
				client.aClass695_11176.method8211(-1115765055);
			else if (i == 29) {
				Class528.method6436(1611705172);
				for (int i_22_ = 0; i_22_ < 10; i_22_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_23_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(i_23_).toString());
			} else if (i == 27) {
				Class528.method6436(-1483275905);
				for (int i_24_ = 0; i_24_ < 10; i_24_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_25_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(i_25_).toString());
				Class99.method1332((byte) 4);
				Class528.method6436(563965388);
				for (int i_26_ = 0; i_26_ < 10; i_26_++)
					System.gc();
				i_25_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(i_25_).toString());
			} else if (5 == i)
				Class214.sendPanelBoxMessage((Class399.aClass530_4128.method209(1309067140) ? "Success" : "Failure"));
			else if (i == 28)
				Class23.aClass5_221.method574(-1545705023);
			else if (22 == i)
				Class176.aClass460_1936.method5532(-1524989436);
			else if (i == 13)
				Class176.aClass460_1936.method5531(-1419730574);
			else if (i == 7)
				Class399.aCanvas4127.setLocation(50, 50);
			else if (i == 25)
				Class399.aCanvas4127.setLocation((Class505.anInt6887 * 1509041125), (Class505.anInt6863 * -1413419225));
			else if (i == 17)
				Class388.method4850((byte) 92);
			else if (8 == i) {
				client.aClass515_11066.aLong6997 = Class249.method3450(1806863414) * 3854533756139245955L;
				client.aClass515_11066.aBool7004 = true;
				Class388.method4850((byte) -62);
			} else if (i == 10) {
				Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
				Class214.sendPanelBoxMessage(new StringBuilder().append((int) class436.aFloat4850 >> 9).append(" ").append((int) class436.aFloat4853 >> 9).toString());
			} else if (11 == i) {
				Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
				Class214.sendPanelBoxMessage(new StringBuilder().append("").append(client.aClass515_11066.method6249(-1531647082).aClass160Array7431[(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)].method1927((int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, 1753127527)).toString());
			} else if (i == 1) {
				Class214.sendPanelBoxMessage(new StringBuilder().append(IComponentDefinitions.aClass199_2552.method2885(713440655)).append(" ").append(IComponentDefinitions.aClass199_2552.method2891(453221733)).toString());
				Class214.sendPanelBoxMessage(new StringBuilder().append(IComponentDefinitions.aClass199_2694.method2885(-1569826992)).append(" ").append(IComponentDefinitions.aClass199_2694.method2891(453221733)).toString());
			} else if (4 == i)
				Class558.method6817(false, -363146685);
			else if (20 == i) {
				client.aBool11018 = !client.aBool11018;
				Class677.aClass167_8609.method2134(client.aBool11018);
				Class580.method7018(-2146922893);
			} else if (14 == i) {
				client.anInt11027 = 0;
				client.aClass515_11066.method6319(-1973975483);
			} else if (15 == i) {
				client.anInt11027 = -560209343;
				client.aClass515_11066.method6319(-1972475517);
			} else if (i == 26) {
				client.anInt11027 = -1120418686;
				client.aClass515_11066.method6319(-889838848);
			}
		} catch (Exception exception) {
			Class214.sendPanelBoxMessage(Class38.aClass38_305.method840(Class459.aClass664_5178, 1470767741));
		}
	}

	static void method1400() {
		if (Class54.method942(1377233443)) {
			if (null == Class205_Sub16.aStringArray9941)
				Class558.method6818(1551682379);
			aBool1248 = true;
			anInt1244 = 0;
			anIntArray1251 = new int[100];
			Class388.anIntArray4046 = new int[100];
			Class536_Sub22_Sub1.anIntArray11618 = new int[100];
			Class16_Sub1.anIntArray10976 = new int[100];
			for (int i = 0; i < 100; i++) {
				anIntArray1251[i] = ((int) (Math.random() * (double) (Class144.anInt1679 * -1804846931)) << 4) + (int) (Math.random() * 15.0);
				Class388.anIntArray4046[i] = (int) (Math.random() * 350.0) << 4;
				Class536_Sub22_Sub1.anIntArray11618[i] = (int) (Math.random() * 102.0) + 51;
				Class16_Sub1.anIntArray10976[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class271.anIntArray2887 = new int[-1804846931 * Class144.anInt1679 >> 1];
		}
	}

	static void method1401(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class426.method5127(1470941739);
	}

	static final void method1402(Class668 class668, int i) {
		class668.anIntArray8550[(class668.anIntArray8537[-1640738851 * class668.anInt8564])] = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
	}

	static final void method1403(Class668 class668, int i) {
		Class214.method3080(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)], -757839561);
	}

	static final void method1404(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		String string_27_ = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801 + 1]);
		if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202 != null && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202.aBool8076))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string_27_;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
	}

	static final void method1405(Class668 class668, int i) {
		int i_28_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class248 class248 = ((Class248) Class398_Sub1.aClass34_Sub8_10110.method70(i_28_, (byte) 4));
		if (null == class248.aString2483)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class248.aString2483;
	}

	static final void method1406(Class668 class668, int i) {
		Class198.method2875(Class542_Sub1.anInt10704 * 56223819, (byte) 120);
	}
}

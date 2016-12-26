/* Class624 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class624 {
	Class624() throws Throwable {
		throw new Error();
	}

	static final void method7426(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		Class161.method1968(i_2_, Class527.method6429(i_0_, i_1_, (byte) -30), class668, 228076253);
	}

	static void method7427(byte i) {
		if (Class105.anInt1244 * 935006559 < 102)
			Class105.anInt1244 += -1634648134;
		if (-1 != 245237945 * Class105.anInt1249 && (-3539970786558336363L * Class332.aLong3619 < Class249.method3450(1745385538))) {
			for (int i_3_ = Class105.anInt1249 * 245237945; i_3_ < Class550_Sub1.aStringArray10618.length; i_3_++) {
				if (Class550_Sub1.aStringArray10618[i_3_].startsWith("pause")) {
					int i_4_ = 5;
					try {
						i_4_ = Integer.parseInt(Class550_Sub1.aStringArray10618[i_3_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class214.method3077(new StringBuilder().append("Pausing for ").append(i_4_).append(" seconds...").toString(), -1393270231);
					Class105.anInt1249 = -1325171319 * (1 + i_3_);
					Class332.aLong3619 = (Class249.method3450(1872679951) + (long) (1000 * i_4_)) * -5369841114397763395L;
					return;
				}
				Class105.aString1243 = Class550_Sub1.aStringArray10618[i_3_];
				Class325.method4278(false, 434242750);
			}
			Class105.anInt1249 = 1325171319;
		}
		if (0 != 1990425561 * client.anInt11031) {
			Class105.anInt1240 -= 806501159 * client.anInt11031;
			if (Class105.anInt1240 * 817280251 >= -2122502799 * Class105.anInt1247)
				Class105.anInt1240 = -716381309 * Class105.anInt1247 - -2034813389;
			if (Class105.anInt1240 * 817280251 < 0)
				Class105.anInt1240 = 0;
			client.anInt11031 = 0;
		}
		for (int i_5_ = 0; i_5_ < client.anInt11033 * -1816034791; i_5_++) {
			Interface63 interface63 = client.anInterface63Array11034[i_5_];
			int i_6_ = interface63.method413(-958686968);
			char c = interface63.method412((byte) -15);
			int i_7_ = interface63.method419(1794578748);
			if (i_6_ == 84)
				Class325.method4278(false, 434242750);
			if (i_6_ == 80)
				Class325.method4278(true, 434242750);
			else if (66 == i_6_ && 0 != (i_7_ & 0x4)) {
				if (null != Class400.aClipboard4137) {
					String string = "";
					for (int i_8_ = Class205_Sub16.aStringArray9941.length - 1; i_8_ >= 0; i_8_--) {
						if (Class205_Sub16.aStringArray9941[i_8_] != null && (Class205_Sub16.aStringArray9941[i_8_].length() > 0))
							string = new StringBuilder().append(string).append(Class205_Sub16.aStringArray9941[i_8_]).append('\n').toString();
					}
					Class400.aClipboard4137.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_6_ && 0 != (i_7_ & 0x4)) {
				if (Class400.aClipboard4137 != null) {
					try {
						Transferable transferable = Class400.aClipboard4137.getContents(null);
						if (transferable != null) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (null != string) {
								String[] strings = Class344.method4483(string, '\n', (byte) -115);
								Class167_Sub1.method8472(strings, 235050493);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_6_ == 85 && -478568567 * Class105.anInt1246 > 0) {
				Class105.aString1243 = new StringBuilder().append(Class105.aString1243.substring(0, (Class105.anInt1246 * -478568567) - 1)).append(Class105.aString1243.substring(Class105.anInt1246 * -478568567)).toString();
				Class105.anInt1246 -= -1505065287;
			} else if (i_6_ == 101 && (-478568567 * Class105.anInt1246 < Class105.aString1243.length()))
				Class105.aString1243 = new StringBuilder().append(Class105.aString1243.substring(0, -478568567 * Class105.anInt1246)).append(Class105.aString1243.substring(1 + Class105.anInt1246 * -478568567)).toString();
			else if (96 == i_6_ && Class105.anInt1246 * -478568567 > 0)
				Class105.anInt1246 -= -1505065287;
			else if (i_6_ == 97 && (-478568567 * Class105.anInt1246 < Class105.aString1243.length()))
				Class105.anInt1246 += -1505065287;
			else if (i_6_ == 102)
				Class105.anInt1246 = 0;
			else if (103 == i_6_)
				Class105.anInt1246 = Class105.aString1243.length() * -1505065287;
			else if (104 == i_6_ && (-1734559211 * Class105.anInt1239 < Class205_Sub16.aStringArray9941.length)) {
				Class105.anInt1239 += 1921008957;
				Class194.method2855(-1786401803);
				Class105.anInt1246 = Class105.aString1243.length() * -1505065287;
			} else if (105 == i_6_ && -1734559211 * Class105.anInt1239 > 0) {
				Class105.anInt1239 -= 1921008957;
				Class194.method2855(-1786401803);
				Class105.anInt1246 = Class105.aString1243.length() * -1505065287;
			} else if (Class608.method7260(c, 999042073) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				Class105.aString1243 = new StringBuilder().append(Class105.aString1243.substring(0, -478568567 * Class105.anInt1246)).append(client.anInterface63Array11034[i_5_].method412((byte) -36)).append(Class105.aString1243.substring(-478568567 * Class105.anInt1246)).toString();
				Class105.anInt1246 += -1505065287;
			}
		}
		client.anInt11033 = 0;
		client.anInt11036 = 0;
		if (-1804846931 * Class144.anInt1679 >> 1 != Class271.anIntArray2887.length)
			Class271.anIntArray2887 = new int[Class144.anInt1679 * -1804846931 >> 1];
		for (int i_9_ = 0; i_9_ < 100; i_9_++) {
			Class388.anIntArray4046[i_9_] += Class16_Sub1.anIntArray10976[i_9_];
			if (Class388.anIntArray4046[i_9_] >> 4 >= 350) {
				int i_10_ = Class105.anIntArray1251[i_9_] >> 4;
				int i_11_ = Class105.anIntArray1251[i_9_] & 0xf;
				i_10_ += ((Class447.anIntArray4906[i_11_ * 1023 + (350 + (i_10_ & 0x40)) * 64 & 0x3fff]) >> 10);
				i_10_ >>= 1;
				for (int i_12_ = -3; i_12_ <= 3; i_12_++) {
					if (i_10_ + i_12_ >= 0 && i_12_ + i_10_ < Class271.anIntArray2887.length)
						Class271.anIntArray2887[i_12_ + i_10_] += 4 - Math.abs(i_12_);
				}
				Class105.anIntArray1251[i_9_] = ((int) (Math.random() * (double) (-1804846931 * Class144.anInt1679)) << 4) + (int) (Math.random() * 15.0);
				Class388.anIntArray4046[i_9_] = 0;
				Class536_Sub22_Sub1.anIntArray11618[i_9_] = (int) (Math.random() * 102.0) + 51;
				Class16_Sub1.anIntArray10976[i_9_] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class552.method6692(-1755905897);
	}

	static final boolean method7428(char c, int i) {
		return c == '\u00a0' || c == ' ' || c == '_' || c == '-';
	}

	static final void method7429(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_13_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_13_ >> 16];
		Class94.method1289(class251, class234, class668, (byte) 54);
	}
}

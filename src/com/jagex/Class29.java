/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

final class Class29 implements Interface28 {
	public static Class174 aClass174_262;

	public Class610 method152() {
		return Class525.aClass610_7102;
	}

	public Class95_Sub1 method159(int i) {
		return Class248.aClass95_Sub1_Sub1_2731;
	}

	public Class95_Sub1 method153(int i) {
		return Class104.aClass95_Sub1_Sub2_1292;
	}

	public Class610 method164() {
		return Class525.aClass610_7102;
	}

	public Class24_Sub16 method154(int i) {
		return Class51.aClass24_Sub16_522;
	}

	public Class95_Sub1 method166() {
		return Class248.aClass95_Sub1_Sub1_2731;
	}

	public Class95_Sub1 method167() {
		return Class248.aClass95_Sub1_Sub1_2731;
	}

	public Class24_Sub16 method162() {
		return Class51.aClass24_Sub16_522;
	}

	public Class610 method157(int i) {
		return Class525.aClass610_7102;
	}

	public Class24_Sub16 method160() {
		return Class51.aClass24_Sub16_522;
	}

	public Class24_Sub16 method161() {
		return Class51.aClass24_Sub16_522;
	}

	public Class95_Sub1 method156() {
		return Class104.aClass95_Sub1_Sub2_1292;
	}

	public Class95_Sub1 method158() {
		return Class104.aClass95_Sub1_Sub2_1292;
	}

	public Class610 method155() {
		return Class525.aClass610_7102;
	}

	public Class610 method165() {
		return Class525.aClass610_7102;
	}

	public Class610 method163() {
		return Class525.aClass610_7102;
	}

	public static void method868(String string, boolean bool, boolean bool_0_, int i) {
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
					Class107.anInt1329 = 0;
					Class107.anInt1331 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11022 = !client.aBool11022;
					if (client.aBool11022)
						Class493.method7997("FPS on", (byte) 8);
					else
						Class493.method7997("FPS off", (byte) 8);
				} else if (string.equals("renderer")) {
					Class143 class143 = Class402.aClass180_4150.method3077();
					Class493.method7997(new StringBuilder().append("Toolkit ID: ").append(Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-3406299)).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Vendor: ").append(class143.anInt1664 * -1388704187).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Name: ").append(class143.aString1665).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Version: ").append(1758152749 * class143.anInt1660).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Device: ").append(class143.aString1667).toString(), (byte) 8);
					Class493.method7997(new StringBuilder().append("Driver Version: ").append(class143.aLong1668 * -3959867577634484715L).toString(), (byte) 8);
					String string_1_ = Class402.aClass180_4150.method3096();
					if (string_1_.length() > 0)
						Class493.method7997(string_1_, (byte) 8);
				} else if (string.equals("heap"))
					Class493.method7997(new StringBuilder().append("Heap: ").append(814176903 * Class515.anInt7045).append("MB").toString(), (byte) 8);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class592 class592 = client.aClass509_11072.method8283((short) 11914);
					if (2 == Class30.anInt265 * -349191067) {
						Class442 class442 = Class208_Sub10.aClass296_Sub1_9923.method5377(-453033383);
						Class442 class442_2_ = Class208_Sub10.aClass296_Sub1_9923.method5379(1780071990);
						Class493.method7997(new StringBuilder().append("Pos: ").append(new Class592((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9).toString()).append(" Height: ")
								.append((Class590.method9853(((int) class442.aFloat4918 - (class592.anInt7798 * 153371143 << 9)), ((int) class442.aFloat4919 - (-2029646807 * class592.anInt7799 << 9)), (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) + (int) class442.aFloat4915).toString(), (byte) 8);
						Class493.method7997(new StringBuilder().append("Look: ").append(new Class592((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (int) class442_2_.aFloat4918 >> 9, (int) class442_2_.aFloat4919 >> 9).toString()).append(" Height: ")
								.append((Class590.method9853(((int) class442_2_.aFloat4918 - (153371143 * class592.anInt7798 << 9)), ((int) class442.aFloat4919 - (class592.anInt7799 * -2029646807 << 9)), (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) + (int) class442.aFloat4915).toString(), (byte) 8);
					} else {
						Class493.method7997(new StringBuilder().append("Pos: ").append(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864).append(",").append(((-1998563323 * Class320.anInt3543 >> 9) + class592.anInt7798 * 153371143) >> 6).append(",").append((-2029646807 * class592.anInt7799 + (Class201.anInt2211 * -1261737255 >> 9)) >> 6).append(",").append(((-1998563323 * Class320.anInt3543 >> 9) + 153371143 * class592.anInt7798) & 0x3f).append(",")
								.append(((Class201.anInt2211 * -1261737255 >> 9) + -2029646807 * class592.anInt7799) & 0x3f).append(" Height: ").append((Class590.method9853(-1998563323 * Class320.anInt3543, Class201.anInt2211 * -1261737255, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) - Class142.anInt1657 * 298893113).toString(), (byte) 8);
						Class493.method7997(new StringBuilder().append("Look: ").append(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864).append(",").append((153371143 * class592.anInt7798 + Class405.anInt4196 * 1947698627) >> 6).append(",").append((class592.anInt7799 * -2029646807 + -965941693 * Class170.anInt1881) >> 6).append(",").append((1947698627 * Class405.anInt4196 + class592.anInt7798 * 153371143) & 0x3f).append(",")
								.append((-965941693 * Class170.anInt1881 + -2029646807 * class592.anInt7799) & 0x3f).append(" Height: ").append((Class590.method9853(Class405.anInt4196 * 1947698627, -965941693 * Class170.anInt1881, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (byte) 5)) - -1151746675 * Class447.anInt4930).toString(), (byte) 8);
					}
				}
			} catch (Exception exception) {
				Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -84), (byte) 8);
			}
			return;
		} while (false);
		if (Class73.aClass677_790 != Class677.aClass677_8596 || 962135673 * client.anInt11075 >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class188.method3663(1, -1, -1, false, (byte) 10);
					if (Class81.method1574((byte) 3) == 1)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class188.method3663(2, -1, -1, false, (byte) -65);
					if (Class81.method1574((byte) 3) == 2)
						Class493.method7997("Success", (byte) 8);
					else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (Class707.aBool8841 && string.equalsIgnoreCase("wm3")) {
					Class188.method3663(3, 1024, 768, false, (byte) 6);
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
						int i_3_ = -1;
						Object object = null;
						string = string.substring(9);
						int i_4_ = string.indexOf(' ');
						if (i_4_ == -1)
							Class493.method7997("Failure", (byte) 8);
						else {
							try {
								i_3_ = Integer.parseInt(string.substring(0, i_4_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i_3_)
								Class493.method7997("Failure", (byte) 8);
							else {
								String string_5_ = new StringBuilder().append(string.substring(i_4_ + 1).trim()).append(".runescape.com").toString();
								Class674.method13849(string_5_, i_3_, (byte) -41);
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
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1603984789) == 0) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 0, 594871647);
						Class631.method10465(-1331558354);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class535.method8982(1, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-544107752) == 1) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 1, 1383358651);
						Class631.method10465(1204114900);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class535.method8982(3, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1949056097) == 3) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 3, 1120504688);
						Class631.method10465(-1364228101);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class535.method8982(5, false, 2038795974);
					if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-210188470) == 5) {
						Class493.method7997("Success", (byte) 8);
						Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 5, 956048018);
						Class631.method10465(-1580944085);
						client.aBool11020 = false;
					} else
						Class493.method7997("Failure", (byte) 8);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (9 == client.anInt11048 * -1927019389)
						Class313_Sub1.method15658((byte) -16);
					else if (10 == client.anInt11048 * -1927019389)
						client.aClass109_11067.aBool1378 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class109[] class109s = client.aClass109Array11068;
					for (int i_6_ = 0; i_6_ < class109s.length; i_6_++) {
						Class109 class109 = class109s[i_6_];
						if (class109.method1967(1893537894) != null)
							class109.method1967(1985340041).method9471(1625514002);
					}
					Class454.aClass452_4972.method7329(1723768486);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i_7_ = Integer.parseInt(string.substring(17));
					Class493.method7997(new StringBuilder().append("varpbit=").append(Class671.aClass97_8584.method100(Class671.aClass97_8584.method123(i_7_, -503530675), (short) -1746)).toString(), (byte) 8);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i_8_ = Integer.parseInt(string.substring(14));
					Class493.method7997(new StringBuilder().append("varp=").append(Class671.aClass97_8584.method101((Class671.aClass97_8584.method125(Class465.aClass465_5313, i_8_, -1759125261)), 1096407173)).toString(), (byte) 8);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class592.method9875(string.substring(12), ' ', (short) -24605);
					if (2 == strings.length || strings.length == 3) {
						if (Class266.method5045((byte) 1))
							Class635.method10556(1700003266);
						Class327.method5803(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, -1768577138);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class592.method9875(string.substring(8), ' ', (short) -30659);
					int i_9_ = Integer.parseInt(strings[0]);
					String string_10_ = strings.length > 1 ? strings[1] : "";
					Class325.method5750(i_9_, string_10_, true, -1173855569);
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
					byte[] is = Class389.method6464(file, 1669540306);
					if (is == null) {
						Class493.method7997("Failed to read file", (byte) 8);
						return;
					}
					String[] strings = (Class592.method9875((Class307.method5616(Class237.method4371(is, (byte) -34), '\r', "", -1265655902)), '\n', (short) -24400));
					Class633.method10517(strings, (short) 18431);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					Class107.aBool1335 = !Class107.aBool1335;
					Class493.method7997("Success", (byte) 8);
					return;
				}
				if (-1927019389 * client.anInt11048 == 9 || 0 == -1927019389 * client.anInt11048) {
					Class109 class109 = Class203.method3782((byte) -1);
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4499, class109.aClass2_1367, (byte) -9);
					class527_sub15.buffer.writeByte(string.length() + 3, -1451864825);
					class527_sub15.buffer.writeByte(bool ? 1 : 0, -629640640);
					class527_sub15.buffer.writeByte(bool_0_ ? 1 : 0, -1930226498);
					class527_sub15.buffer.writeString(string, -1661775409);
					class109.method1969(class527_sub15, (byte) 1);
				}
			} catch (Exception exception) {
				Class493.method7997((Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -116)), (byte) 8);
				return;
			}
		}
		if (9 != -1927019389 * client.anInt11048 && -1927019389 * client.anInt11048 != 0)
			Class493.method7997(new StringBuilder().append(Class53.aClass53_530.method1290(Class144_Sub1.aClass671_8995, (byte) -104)).append(string).toString(), (byte) 8);
	}

	static Class22 method869(int i) {
		Class22 class22;
		if (Class35.aBool365) {
			if (Class504.aClass174_6906 != null && null != Class153.aClass22_1715)
				class22 = Class153.aClass22_1715;
			else
				class22 = Class568.aClass22_7615;
		} else
			class22 = Class568.aClass22_7615;
		Class35.anInt335 = class22.anInt215 * -457310447 + 1732698855 * class22.anInt213;
		return class22;
	}

	static final void method870(Class665 class665, int i) {
		Class527_Sub36 class527_sub36 = ((Class527_Sub36) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -426691751 * class527_sub36.anInt10673;
	}

	static final void method871(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_11_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_12_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785] - 1;
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_11_, 57546097));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class9.method623(i_12_, -1519586240);
	}

	static final void method872(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class309.method5633(string, 455325449);
	}
}

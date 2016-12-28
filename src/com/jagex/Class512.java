/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class512 {
	static Class512 aClass512_6932;
	static Class512 aClass512_6933;
	public static Class512 aClass512_6934 = new Class512();
	static int scenePlane;
	static int anInt6936;

	static {
		aClass512_6932 = new Class512();
		aClass512_6933 = new Class512();
	}

	Class512() {
		/* empty */
	}

	public static void method6211(String string, boolean bool, boolean bool_0_, byte i) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class214.sendPanelBoxMessage("commands - This command");
					Class214.sendPanelBoxMessage("cls - Clear console");
					Class214.sendPanelBoxMessage("displayfps - Toggle FPS and other information");
					Class214.sendPanelBoxMessage("renderer - Print graphics renderer information");
					Class214.sendPanelBoxMessage("heap - Print java memory information");
					Class214.sendPanelBoxMessage("getcamerapos - Print location and direction of camera for use in bug reports");
				} else if (string.equalsIgnoreCase("cls")) {
					Class105.anInt1247 = 0;
					Class105.anInt1240 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11314 = !client.aBool11314;
					if (client.aBool11314)
						Class214.sendPanelBoxMessage("FPS on");
					else
						Class214.sendPanelBoxMessage("FPS off");
				} else if (string.equals("renderer")) {
					Class145 class145 = Class677.aClass167_8609.method2001();
					Class214.sendPanelBoxMessage(new StringBuilder().append("Toolkit ID: ").append(ClientSetting.aClass536_Sub40_8843.toolkit.method10071()).toString());
					Class214.sendPanelBoxMessage(new StringBuilder().append("Vendor: ").append(class145.anInt1687 * -808026883).toString());
					Class214.sendPanelBoxMessage(new StringBuilder().append("Name: ").append(class145.aString1682).toString());
					Class214.sendPanelBoxMessage(new StringBuilder().append("Version: ").append(class145.anInt1689 * -593755673).toString());
					Class214.sendPanelBoxMessage(new StringBuilder().append("Device: ").append(class145.aString1690).toString());
					Class214.sendPanelBoxMessage(new StringBuilder().append("Driver Version: ").append(-1138482170592229701L * class145.aLong1688).toString());
					String string_1_ = Class677.aClass167_8609.method2018();
					if (string_1_.length() > 0)
						Class214.sendPanelBoxMessage(string_1_);
				} else if (string.equals("heap"))
					Class214.sendPanelBoxMessage(new StringBuilder().append("Heap: ").append(-839563813 * GameShell.maxMemory).append("MB").toString());
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class598 class598 = client.aClass515_11066.method6255(-1575527493);
					if (2 == Class246.anInt2474 * 155362615) {
						Class436 class436 = Class683.aClass301_Sub1_8651.method4055((byte) 5);
						Class436 class436_2_ = Class683.aClass301_Sub1_8651.method4086(-418451567);
						Class214.sendPanelBoxMessage(new StringBuilder().append("Pos: ").append(new Class598((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9).toString()).append(" Height: ")
								.append((Class54.method944(((int) class436.aFloat4850 - (1858049507 * class598.anInt7839 << 9)), ((int) class436.aFloat4853 - (class598.anInt7840 * 1479112045 << 9)), (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), 1540566094)) + (int) class436.aFloat4852).toString());
						Class214.sendPanelBoxMessage(new StringBuilder().append("Look: ").append(new Class598((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), (int) class436_2_.aFloat4850 >> 9, (int) class436_2_.aFloat4853 >> 9).toString()).append(" Height: ")
								.append((Class54.method944(((int) class436_2_.aFloat4850 - (1858049507 * class598.anInt7839 << 9)), ((int) class436.aFloat4853 - (class598.anInt7840 * 1479112045 << 9)), (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), 1544113677)) + (int) class436.aFloat4852).toString());
					} else {
						Class214.sendPanelBoxMessage(new StringBuilder().append("Pos: ").append(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839).append(",").append(((Class637.anInt8301 * -1607026219 >> 9) + 1858049507 * class598.anInt7839) >> 6).append(",").append((1479112045 * class598.anInt7840 + (-1646092097 * Class685.anInt8665 >> 9)) >> 6).append(",").append((class598.anInt7839 * 1858049507 + (Class637.anInt8301 * -1607026219 >> 9)) & 0x3f).append(",")
								.append((1479112045 * class598.anInt7840 + (Class685.anInt8665 * -1646092097 >> 9)) & 0x3f).append(" Height: ").append((Class54.method944(Class637.anInt8301 * -1607026219, Class685.anInt8665 * -1646092097, (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), 1730204622)) - Class205_Sub21.anInt9958 * -1598853731).toString());
						Class214.sendPanelBoxMessage(new StringBuilder().append("Look: ").append(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839).append(",").append((1408133545 * Class438.anInt4868 + 1858049507 * class598.anInt7839) >> 6).append(",").append((1479112045 * class598.anInt7840 + Class550.anInt7412 * -1090574309) >> 6).append(",").append((class598.anInt7839 * 1858049507 + 1408133545 * Class438.anInt4868) & 0x3f).append(",")
								.append((1479112045 * class598.anInt7840 + -1090574309 * Class550.anInt7412) & 0x3f).append(" Height: ").append((Class54.method944(1408133545 * Class438.anInt4868, Class550.anInt7412 * -1090574309, (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), 2019852813)) - -565938271 * Class184_Sub6.anInt9934).toString());
					}
				}
			} catch (Exception exception) {
				Class214.sendPanelBoxMessage(Class38.aClass38_305.method840(Class459.aClass664_5178, 1547501832));
			}
			return;
		} while (false);
		if (Class678.aClass678_8619 != Class47.aClass678_578 || 423156687 * client.anInt11160 >= 0) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class15.method640(1, -1, -1, false, -1701378298);
					if (Class315.method4212((byte) 27) == 1)
						Class214.sendPanelBoxMessage("Success");
					else
						Class214.sendPanelBoxMessage("Failure");
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class15.method640(2, -1, -1, false, -2021020771);
					if (Class315.method4212((byte) 102) == 2)
						Class214.sendPanelBoxMessage("Success");
					else
						Class214.sendPanelBoxMessage("Failure");
					return;
				}
				if (Class707.aBool8822 && string.equalsIgnoreCase("wm3")) {
					Class15.method640(3, 1024, 768, false, -1183965299);
					if (Class315.method4212((byte) 104) == 3)
						Class214.sendPanelBoxMessage("Success");
					else
						Class214.sendPanelBoxMessage("Failure");
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (16 != -708374433 * client.anInt11101)
						Class214.sendPanelBoxMessage("Failure");
					else {
						int i_3_ = -1;
						Object object = null;
						string = string.substring(9);
						int i_4_ = string.indexOf(' ');
						if (-1 == i_4_)
							Class214.sendPanelBoxMessage("Failure");
						else {
							try {
								i_3_ = Integer.parseInt(string.substring(0, i_4_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i_3_)
								Class214.sendPanelBoxMessage("Failure");
							else {
								String string_5_ = new StringBuilder().append(string.substring(1 + i_4_).trim()).append(".runescape.com").toString();
								Class518.method6329(string_5_, i_3_, (byte) 0);
								Class214.sendPanelBoxMessage("Success");
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class704.method8264(0, false, (byte) 17);
					if (ClientSetting.aClass536_Sub40_8843.toolkit.method10071() == 0) {
						Class214.sendPanelBoxMessage("Success");
						ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.defaultToolkit), 0, (byte) 1);
						Class27.method763(2027184071);
						client.aBool11015 = false;
					} else
						Class214.sendPanelBoxMessage("Failure");
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class704.method8264(1, false, (byte) 32);
					if (ClientSetting.aClass536_Sub40_8843.toolkit.method10071() == 1) {
						Class214.sendPanelBoxMessage("Success");
						ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.defaultToolkit), 1, (byte) 1);
						Class27.method763(2146187357);
						client.aBool11015 = false;
					} else
						Class214.sendPanelBoxMessage("Failure");
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class704.method8264(3, false, (byte) 127);
					if (ClientSetting.aClass536_Sub40_8843.toolkit.method10071() == 3) {
						Class214.sendPanelBoxMessage("Success");
						ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.defaultToolkit), 3, (byte) 1);
						Class27.method763(1982180856);
						client.aBool11015 = false;
					} else
						Class214.sendPanelBoxMessage("Failure");
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class704.method8264(5, false, (byte) 95);
					if (ClientSetting.aClass536_Sub40_8843.toolkit.method10071() == 5) {
						Class214.sendPanelBoxMessage("Success");
						ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.defaultToolkit), 5, (byte) 1);
						Class27.method763(1943587194);
						client.aBool11015 = false;
					} else
						Class214.sendPanelBoxMessage("Failure");
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (-708374433 * client.anInt11101 == 9)
						Class628.method7496(-491009985);
					else if (10 == client.anInt11101 * -708374433)
						client.aClass106_11322.aBool1266 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class106[] class106s = client.aClass106Array11062;
					for (int i_6_ = 0; i_6_ < class106s.length; i_6_++) {
						Class106 class106 = class106s[i_6_];
						if (class106.method1413((short) -13400) != null)
							class106.method1413((short) 23287).method6902(2049213841);
					}
					Class176.aClass460_1936.method5533((byte) -50);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i_7_ = Integer.parseInt(string.substring(17));
					Class214.sendPanelBoxMessage(new StringBuilder().append("varpbit=").append(Class465_Sub1.aClass96_10352.method96(Class465_Sub1.aClass96_10352.method123(i_7_, -1018286558), 1261029271)).toString());
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i_8_ = Integer.parseInt(string.substring(14));
					Class214.sendPanelBoxMessage(new StringBuilder().append("varp=").append(Class465_Sub1.aClass96_10352.method99((Class465_Sub1.aClass96_10352.method124(Class458.aClass458_5176, i_8_, 323730415)), 1706069564)).toString());
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class344.method4483(string.substring(12), ' ', (byte) -78);
					if (2 == strings.length || 3 == strings.length) {
						if (Class344.method4487(-440129613))
							Class506.method6144(-1902701944);
						Class315_Sub2.method9204(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, 689173989);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class344.method4483(string.substring(8), ' ', (byte) -36);
					int i_9_ = Integer.parseInt(strings[0]);
					String string_10_ = strings.length > 1 ? strings[1] : "";
					Class709.method8344(i_9_, string_10_, true, (byte) -19);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class249.method3450(1666297861)).append(".log").toString());
						if (file.exists()) {
							Class214.sendPanelBoxMessage("file already exists!");
							return;
						}
					}
					if (null != GroundDecorationSetting.aFileOutputStream10835) {
						GroundDecorationSetting.aFileOutputStream10835.close();
						GroundDecorationSetting.aFileOutputStream10835 = null;
					}
					try {
						GroundDecorationSetting.aFileOutputStream10835 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class214.sendPanelBoxMessage(new StringBuilder().append("Could not create ").append(file.getName()).toString());
					} catch (SecurityException securityexception) {
						Class214.sendPanelBoxMessage(new StringBuilder().append("Cannot write to ").append(file.getName()).toString());
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (null != GroundDecorationSetting.aFileOutputStream10835)
						GroundDecorationSetting.aFileOutputStream10835.close();
					GroundDecorationSetting.aFileOutputStream10835 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class214.sendPanelBoxMessage("No such file");
						return;
					}
					byte[] is = Class335.method4374(file, (byte) -97);
					if (is == null) {
						Class214.sendPanelBoxMessage("Failed to read file");
						return;
					}
					String[] strings = (Class344.method4483(Class231.method3320(Class454.method5460(is, (byte) 57), '\r', "", 407769746), '\n', (byte) -31));
					Class167_Sub1.method8472(strings, -289970829);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					Class105.aBool1242 = !Class105.aBool1242;
					Class214.sendPanelBoxMessage("Success");
					return;
				}
				if (client.anInt11101 * -708374433 == 9 || -708374433 * client.anInt11101 == 0) {
					Class106 class106 = Class536_Sub41.method9871(2077853800);
					Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.COMMANDS_PACKET, class106.aClass15_1258, 1525134892);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(string.length() + 3);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(bool ? 1 : 0);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(bool_0_ ? 1 : 0);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
					class106.method1409(class536_sub23, 1530458000);
				}
			} catch (Exception exception) {
				Class214.sendPanelBoxMessage(Class38.aClass38_305.method840(Class459.aClass664_5178, 1311318412));
				return;
			}
		}
		if (-708374433 * client.anInt11101 != 9 && -708374433 * client.anInt11101 != 0)
			Class214.sendPanelBoxMessage(new StringBuilder().append(Class38.aClass38_307.method840(Class459.aClass664_5178, 1830765523)).append(string).toString());
	}

	static final void method6212(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_11_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_12_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		if (null != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202)
			Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202.method7354(i_11_, i_12_, Class111.aClass34_Sub13_1391, 1376312589);
	}

	static final void method6213(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class359.method4724(class251, class668, 1969746585);
	}

	static final void method6214(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}

	static final void method6215(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static void method6216(int i) {
		if (11 == client.anInt11101 * -708374433) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4459, client.aClass106_11218.aClass15_1258, 1400809161);
			client.aClass106_11218.method1409(class536_sub23, 506123486);
			Class4.aClass690_102 = Class690.aClass690_8694;
			Class45.aString528 = null;
		}
	}

	static final void method6217(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_13_);
		Class234 class234 = Class463.aClass234Array5227[i_13_ >> 16];
		Class186.method2774(class251, class234, class668, 1757410287);
	}

	static final void method6218(IComponentDefinitions class251, Class234 class234, Class668 class668, short i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int[] is = Class510.method6183(string, class668, -564863261);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class251.onVarTransmitHook = Class33.method796(string, class668, (short) -7169);
		class251.varTransmitList = is;
		class251.hasComponentHook = true;
	}
}

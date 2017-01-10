/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class27 implements Runnable {
	volatile long aLong249 = 8011195555581829813L;
	String aString250;
	InetAddress anInetAddress251;
	volatile boolean aBool252 = true;

	void method745() {
		if (anInetAddress251 != null) {
			try {
				byte[] is = anInetAddress251.getAddress();
				aLong249 = (long) Ping.method608(is[0], is[1], is[2], is[3], 10000L) * -8011195555581829813L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class212.method3067(1000L);
	}

	void method746(String string, int i) {
		aString250 = string;
		anInetAddress251 = null;
		aLong249 = 8011195555581829813L;
		if (aString250 != null) {
			try {
				anInetAddress251 = InetAddress.getByName(aString250);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	long method747(int i) {
		return aLong249 * -8276080951695948701L;
	}

	long method748() {
		return aLong249 * -8276080951695948701L;
	}

	public void run() {
		while (aBool252)
			method749(1395661776);
	}

	void method749(int i) {
		if (anInetAddress251 != null) {
			try {
				byte[] is = anInetAddress251.getAddress();
				aLong249 = (long) Ping.method608(is[0], is[1], is[2], is[3], 10000L) * -8011195555581829813L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class212.method3067(1000L);
	}

	void method750(String string) {
		aString250 = string;
		anInetAddress251 = null;
		aLong249 = 8011195555581829813L;
		if (aString250 != null) {
			try {
				anInetAddress251 = InetAddress.getByName(aString250);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	Class27() {
		/* empty */
	}

	long method751() {
		return aLong249 * -8276080951695948701L;
	}

	void method752() {
		aBool252 = false;
	}

	void method753() {
		aBool252 = false;
	}

	void method754(int i) {
		aBool252 = false;
	}

	public void method755() {
		while (aBool252)
			method749(1519436588);
	}

	long method756() {
		return aLong249 * -8276080951695948701L;
	}

	static Class569[] method757(int i) {
		return (new Class569[] { Class569.aClass569_7604, Class569.aClass569_7605 });
	}

	static final void method758(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class565.MY_PLAYER.method10881((byte) 33).method7145((byte) 76);
	}

	static final void method759(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (string.startsWith(Class635.method7563(0, (byte) 39)) || string.startsWith(Class635.method7563(1, (byte) -63)))
			string = string.substring(7);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClanSettings.method4638(string, (short) -220) ? 1 : 0;
	}

	static final void method760(Class668 class668, int i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.idleAnimationSetting), (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 1);
		method763(2133495125);
		client.aBool11015 = false;
	}

	static final void method761(GraphicalRenderer class167, Class174 class174, int i) {
		if (Class542_Sub1.anInt10700 * 962386111 != 100 && Class542_Sub1.aClass536_Sub18_Sub14_7202 != null) {
			Class249.method3450(1557328514);
			Class249.method3450(1962156685);
			if (962386111 * Class542_Sub1.anInt10700 < 10) {
				for (int i_0_ = 0; i_0_ < Class542_Sub1.aClass184ArrayArray10712.length; i_0_++) {
					for (int i_1_ = 0; i_1_ < (Class542_Sub1.aClass184ArrayArray10712[i_0_]).length; i_1_++) {
						Class398.aClass461_4122.method5580((Class542_Sub1.aClass622_7228.anIntArrayArray8107[i_0_][i_1_]), -964514165);
						Class710_Sub43.aClass461_10940.method5580((Class542_Sub1.aClass622_7228.anIntArrayArray8107[i_0_][i_1_]), -964514165);
					}
				}
				if (!Class542_Sub1.aClass461_7183.method5577(Class542_Sub1.aClass536_Sub18_Sub14_7202.aString11763, -530970241)) {
					Class542_Sub1.anInt10700 = (Class622.aClass461_8129.method5567((Class542_Sub1.aClass536_Sub18_Sub14_7202.aString11763), 71349210)) / 10 * 1999804223;
					return;
				}
				Class542_Sub1.anInt10700 = -1476794250;
			}
			if (962386111 * Class542_Sub1.anInt10700 == 10) {
				Class542_Sub1.anInt7185 = (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11769 * 1539255617) >> 6 << 6;
				Class542_Sub1.anInt7186 = -1266410161 * (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11771) >> 6 << 6;
				Class542_Sub1.anInt7187 = ((Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11770 * 615226225) >> 6 << 6) - Class542_Sub1.anInt7185 + 64;
				Class542_Sub1.anInt7188 = ((Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11772 * 888731475) >> 6 << 6) - Class542_Sub1.anInt7186 + 64;
				int[] is = new int[3];
				int i_2_ = -1;
				int i_3_ = -1;
				Class436 class436 = (Class565.MY_PLAYER.method7837().aClass436_4823);
				Class598 class598 = client.aClass515_11066.method6255(-2041832532);
				if (Class542_Sub1.aClass536_Sub18_Sub14_7202.method10767(Class565.MY_PLAYER.aByte10839, (((int) class436.aFloat4850 >> 9) + class598.anInt7839 * 1858049507), (((int) class436.aFloat4853 >> 9) + 1479112045 * class598.anInt7840), is, (byte) 5)) {
					i_2_ = is[1] - Class542_Sub1.anInt7185;
					i_3_ = is[2] - Class542_Sub1.anInt7186;
				}
				if (!Class542_Sub1.aBool10711 && i_2_ >= 0 && i_2_ < Class542_Sub1.anInt7187 && i_3_ >= 0 && i_3_ < Class542_Sub1.anInt7188) {
					i_2_ += (int) (Math.random() * 10.0) - 5;
					i_3_ += (int) (Math.random() * 10.0) - 5;
					Class552.anInt7416 = i_2_ * -406038895;
					Class391.anInt4063 = i_3_ * -1712142967;
				} else if (76292939 * Class542_Sub1.anInt10709 != -1 && -1 != Class542_Sub1.anInt10710 * 1778951559) {
					Class542_Sub1.aClass536_Sub18_Sub14_7202.method10766(Class542_Sub1.anInt10709 * 76292939, Class542_Sub1.anInt10710 * 1778951559, is, 946164565);
					if (null != is) {
						Class552.anInt7416 = (is[1] - Class542_Sub1.anInt7185) * -406038895;
						Class391.anInt4063 = (is[2] - Class542_Sub1.anInt7186) * -1712142967;
					}
					Class542_Sub1.anInt10710 = -382996535;
					Class542_Sub1.anInt10709 = 1556558237;
					Class542_Sub1.aBool10711 = false;
				} else {
					Class542_Sub1.aClass536_Sub18_Sub14_7202.method10766((Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11766 * 626267709) >> 14 & 0x3fff, 626267709 * (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11766) & 0x3fff, is, 946164565);
					Class552.anInt7416 = (is[1] - Class542_Sub1.anInt7185) * -406038895;
					Class391.anInt4063 = -1712142967 * (is[2] - Class542_Sub1.anInt7186);
				}
				if (25 == 1243816017 * (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11764)) {
					Class542_Sub1.aFloat7181 = 2.0F;
					Class542_Sub1.aFloat7232 = 2.0F;
				} else if (37 == (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11764) * 1243816017) {
					Class542_Sub1.aFloat7181 = 3.0F;
					Class542_Sub1.aFloat7232 = 3.0F;
				} else if (50 == (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11764) * 1243816017) {
					Class542_Sub1.aFloat7181 = 4.0F;
					Class542_Sub1.aFloat7232 = 4.0F;
				} else if (75 == (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11764) * 1243816017) {
					Class542_Sub1.aFloat7181 = 6.0F;
					Class542_Sub1.aFloat7232 = 6.0F;
				} else if (100 == 1243816017 * (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11764)) {
					Class542_Sub1.aFloat7181 = 8.0F;
					Class542_Sub1.aFloat7232 = 8.0F;
				} else if (1243816017 * (Class542_Sub1.aClass536_Sub18_Sub14_7202.anInt11764) == 200) {
					Class542_Sub1.aFloat7181 = 16.0F;
					Class542_Sub1.aFloat7232 = 16.0F;
				} else {
					Class542_Sub1.aFloat7181 = 8.0F;
					Class542_Sub1.aFloat7232 = 8.0F;
				}
				Class542_Sub1.anInt7178 = (int) Class542_Sub1.aFloat7232 >> 1;
				Class542_Sub1.aByteArrayArrayArray7177 = Class58.method974(Class542_Sub1.anInt7178, -733451043);
				Class455.method5480((byte) 109);
				Class542_Sub1.method6553();
				JS5ConfigGroup.aClass708_8457 = new Class708();
				Class542_Sub1.anInt7175 += (int) (Math.random() * 5.0) - 2;
				if (Class542_Sub1.anInt7175 < -8)
					Class542_Sub1.anInt7175 = -8;
				if (Class542_Sub1.anInt7175 > 8)
					Class542_Sub1.anInt7175 = 8;
				Class542_Sub1.anInt7176 += (int) (Math.random() * 5.0) - 2;
				if (Class542_Sub1.anInt7176 < -16)
					Class542_Sub1.anInt7176 = -16;
				if (Class542_Sub1.anInt7176 > 16)
					Class542_Sub1.anInt7176 = 16;
				Class542_Sub1.method6537(class174, Class542_Sub1.anInt7175 >> 2 << 10, Class542_Sub1.anInt7176 >> 1);
				Class542_Sub1.aClass34_Sub8_7212.method10330(1024, 256, -1779555126);
				Class542_Sub1.aClass34_Sub1_7223.method10300(256, 256, (byte) 31);
				Class542_Sub1.aClass34_Sub17_7165.method805(4096, -973399621);
				Class56.aClass34_Sub14_608.method805(256, -1271009451);
				Class542_Sub1.anInt10700 = 1341378796;
			} else if (20 == Class542_Sub1.anInt10700 * 962386111) {
				if (Class542_Sub1.aBool7220) {
					if (Class542_Sub1.method6540(class167, Class542_Sub1.anInt7175, Class542_Sub1.anInt7176, Class542_Sub1.aBool7220))
						Class542_Sub1.anInt10700 = -270830908;
				} else {
					Class106.method1424(true, 1581574012);
					Class542_Sub1.method6540(class167, Class542_Sub1.anInt7175, Class542_Sub1.anInt7176, Class542_Sub1.aBool7220);
					Class542_Sub1.anInt10700 = -270830908;
					Class106.method1424(true, 914359620);
					Class444.method5392(-182981710);
				}
			} else if (60 == Class542_Sub1.anInt10700 * 962386111) {
				if (Class542_Sub1.aClass461_7183.method5573(Class542_Sub1.aClass536_Sub18_Sub14_7202.aString11763, 1771500986)) {
					if (!Class542_Sub1.aClass461_7183.method5577((Class542_Sub1.aClass536_Sub18_Sub14_7202.aString11763), -2087649579))
						return;
					Class542_Sub1.aClass543_7192 = Class463.method5625(Class542_Sub1.aClass461_7183, (Class542_Sub1.aClass536_Sub18_Sub14_7202.aString11763), client.aBool11123, -1391903082);
				} else
					Class542_Sub1.aClass543_7192 = new Class543(0);
				Class542_Sub1.method6543();
				Class542_Sub1.anInt10700 = -1747625158;
				Class106.method1424(true, 1889250339);
				Class444.method5392(-1244298040);
			} else if (Class542_Sub1.anInt10700 * 962386111 >= 70) {
				for (int i_4_ = 0; i_4_ < 3; i_4_++) {
					for (int i_5_ = 0; i_5_ < 5; i_5_++) {
						if (null == (Class542_Sub1.aClass184ArrayArray10712[i_4_][i_5_]) || null == (Class542_Sub1.aClass2ArrayArray10723[i_4_][i_5_])) {
							Class542_Sub1.aClass184ArrayArray10712[i_4_][i_5_] = ((FontRenderer) (Class196.aClass410_2202.method4980(client.anInterface51_11196, (Class542_Sub1.aClass622_7228.anIntArrayArray8107[i_4_][i_5_]), true, true, (byte) -124)));
							Class542_Sub1.aClass2ArrayArray10723[i_4_][i_5_] = (Class196.aClass410_2202.method4981(client.anInterface51_11196, (Class542_Sub1.aClass622_7228.anIntArrayArray8107[i_4_][i_5_]), 1765934720));
							if ((Class542_Sub1.aClass184ArrayArray10712[i_4_][i_5_]) != null && (Class542_Sub1.aClass2ArrayArray10723[i_4_][i_5_]) != null)
								Class542_Sub1.anInt10700 += 1704445373;
							else
								return;
						}
					}
				}
				Class542_Sub1.anInt10700 = -1883040612;
				System.gc();
			}
		}
	}

	static final void method762(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class34_Sub6.method10321(((String) (class668.anObjectArray8543[366709801 * class668.anInt8544])), (String) (class668.anObjectArray8543[1 + (366709801 * class668.anInt8544)]), Class459.CLIENT_PARAMS, -1675425713);
	}

	public static void method763(int i) {
		Class6 class6 = null;
		try {
			class6 = Class153_Sub1.method8383("", client.aClass670_11043.aString8573, true, 2041514804);
			RSByteBuffer class536_sub33 = ClientSetting.aClass536_Sub40_8843.method9852(-534711081);
			class6.method584(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 1);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class6 != null)
				class6.method585(-1411037171);
		} catch (Exception exception) {
			/* empty */
		}
	}
}

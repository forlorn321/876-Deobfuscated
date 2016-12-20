/* Class536_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class536_Sub1 extends Class536 {
	Class537 this$0;
	public static Class24_Sub13 aClass24_Sub13_10343;

	Class536_Sub1(Class537 class537) {
		super(class537);
		this$0 = class537;
	}

	static void method16023(int i, int i_0_) {
		Class635.anInt8302 = i * -1224612011;
		Class529_Sub1.anInt10772 = -1784395681;
		Class529_Sub1.anInt10772 = -1784395681;
		Class146.method2401((byte) 18);
	}

	static void method16024(int i) {
		if (-1549400497 * Class107.anInt1332 < 102)
			Class107.anInt1332 += 2011948058;
		if (-709492651 * Class107.anInt1342 != -1 && (Class24_Sub15.aLong10982 * 277395700449270335L < Class234.method4347(-1408626088))) {
			for (int i_1_ = Class107.anInt1342 * -709492651; i_1_ < Class551.aStringArray7306.length; i_1_++) {
				if (Class551.aStringArray7306[i_1_].startsWith("pause")) {
					int i_2_ = 5;
					try {
						i_2_ = Integer.parseInt(Class551.aStringArray7306[i_1_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class493.method7997(new StringBuilder().append("Pausing for ").append(i_2_).append(" seconds...").toString(), (byte) 8);
					Class107.anInt1342 = -1382613763 * (i_1_ + 1);
					Class24_Sub15.aLong10982 = (Class234.method4347(-1408626088) + (long) (i_2_ * 1000)) * 358060795605226943L;
					return;
				}
				Class107.aString1337 = Class551.aStringArray7306[i_1_];
				Node_Sub6.method16054(false, -1163482689);
			}
			Class107.anInt1342 = 1382613763;
		}
		if (0 != client.anInt11005 * -1027814645) {
			Class107.anInt1331 -= client.anInt11005 * 963487785;
			if (656150623 * Class107.anInt1331 >= -2080366569 * Class107.anInt1329)
				Class107.anInt1331 = -604984503 * Class107.anInt1329 - -2131080289;
			if (Class107.anInt1331 * 656150623 < 0)
				Class107.anInt1331 = 0;
			client.anInt11005 = 0;
		}
		for (int i_3_ = 0; i_3_ < 1422154267 * client.anInt11038; i_3_++) {
			Interface64 interface64 = client.anInterface64Array11039[i_3_];
			int i_4_ = interface64.method396(-2020033987);
			char c = interface64.method418((byte) 111);
			int i_5_ = interface64.method415(-327260311);
			if (84 == i_4_)
				Node_Sub6.method16054(false, -1163482689);
			if (80 == i_4_)
				Node_Sub6.method16054(true, -1163482689);
			else if (i_4_ == 66 && (i_5_ & 0x4) != 0) {
				if (Class644.aClipboard8347 != null) {
					String string = "";
					for (int i_6_ = Class107.aStringArray1327.length - 1; i_6_ >= 0; i_6_--) {
						if (Class107.aStringArray1327[i_6_] != null && Class107.aStringArray1327[i_6_].length() > 0)
							string = new StringBuilder().append(string).append(Class107.aStringArray1327[i_6_]).append('\n').toString();
					}
					Class644.aClipboard8347.setContents(new StringSelection(string), null);
				}
			} else if (i_4_ == 67 && (i_5_ & 0x4) != 0) {
				if (null != Class644.aClipboard8347) {
					try {
						Transferable transferable = Class644.aClipboard8347.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (null != string) {
								String[] strings = Class592.method9875(string, '\n', (short) -30954);
								Class633.method10517(strings, (short) 27555);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_4_ == 85 && Class107.anInt1339 * -1301288505 > 0) {
				Class107.aString1337 = new StringBuilder().append(Class107.aString1337.substring(0, ((-1301288505 * (Class107.anInt1339)) - 1))).append(Class107.aString1337.substring(-1301288505 * Class107.anInt1339)).toString();
				Class107.anInt1339 -= 207030263;
			} else if (101 == i_4_ && (-1301288505 * Class107.anInt1339 < Class107.aString1337.length()))
				Class107.aString1337 = new StringBuilder().append(Class107.aString1337.substring(0, -1301288505 * Class107.anInt1339)).append(Class107.aString1337.substring(1 + (Class107.anInt1339 * -1301288505))).toString();
			else if (96 == i_4_ && Class107.anInt1339 * -1301288505 > 0)
				Class107.anInt1339 -= 207030263;
			else if (97 == i_4_ && (Class107.anInt1339 * -1301288505 < Class107.aString1337.length()))
				Class107.anInt1339 += 207030263;
			else if (i_4_ == 102)
				Class107.anInt1339 = 0;
			else if (103 == i_4_)
				Class107.anInt1339 = Class107.aString1337.length() * 207030263;
			else if (i_4_ == 104 && (1402258827 * Class107.anInt1338 < Class107.aStringArray1327.length)) {
				Class107.anInt1338 += -1985562077;
				Class403.method6542(-1720397284);
				Class107.anInt1339 = Class107.aString1337.length() * 207030263;
			} else if (i_4_ == 105 && 1402258827 * Class107.anInt1338 > 0) {
				Class107.anInt1338 -= -1985562077;
				Class403.method6542(-1576081590);
				Class107.anInt1339 = Class107.aString1337.length() * 207030263;
			} else if (Class394.method6500(c, -636609056) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				Class107.aString1337 = new StringBuilder().append(Class107.aString1337.substring(0, -1301288505 * Class107.anInt1339)).append(client.anInterface64Array11039[i_3_].method418((byte) 15)).append(Class107.aString1337.substring(-1301288505 * Class107.anInt1339)).toString();
				Class107.anInt1339 += 207030263;
			}
		}
		client.anInt11038 = 0;
		client.anInt11041 = 0;
		if (-1803844265 * Class289.anInt3223 >> 1 != Class527_Sub41_Sub1.anIntArray11734.length)
			Class527_Sub41_Sub1.anIntArray11734 = new int[Class289.anInt3223 * -1803844265 >> 1];
		for (int i_7_ = 0; i_7_ < 100; i_7_++) {
			Class107.anIntArray1333[i_7_] += Class697.anIntArray8760[i_7_];
			if (Class107.anIntArray1333[i_7_] >> 4 >= 350) {
				int i_8_ = Class107.anIntArray1334[i_7_] >> 4;
				int i_9_ = Class107.anIntArray1334[i_7_] & 0xf;
				i_8_ += ((Class428.anIntArray4825[1023 * i_9_ + 64 * (350 + (i_8_ & 0x40)) & 0x3fff]) >> 10);
				i_8_ >>= 1;
				for (int i_10_ = -3; i_10_ <= 3; i_10_++) {
					if (i_10_ + i_8_ >= 0 && (i_8_ + i_10_ < Class527_Sub41_Sub1.anIntArray11734.length))
						Class527_Sub41_Sub1.anIntArray11734[i_10_ + i_8_] += 4 - Math.abs(i_10_);
				}
				Class107.anIntArray1334[i_7_] = ((int) (Math.random() * (double) (-1803844265 * Class289.anInt3223)) << 4) + (int) (Math.random() * 15.0);
				Class107.anIntArray1333[i_7_] = 0;
				Class107.anIntArray1340[i_7_] = (int) (Math.random() * 102.0) + 51;
				Class697.anIntArray8760[i_7_] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class289.method5226(709967778);
	}

	static final void method16025(Class665 class665, int i) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[318492261 * class665.anInt8528]);
		String string_11_ = ((String) class665.anObjectArray8541[1 + 318492261 * class665.anInt8528]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class290.method5253(string, string_11_, 407116460);
	}
}

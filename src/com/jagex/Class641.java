/* Class641 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public final class Class641 {
	static boolean aBool8339 = false;

	static void method10648(Class665 class665) {
		int i = Class296_Sub1.method15693((short) -24085);
		if (i < 0) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class597.aTwitchEventLiveStreams7849.viewerCounts[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.channelUrls[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.previewUrlTemplates[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.streamTitles[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.channelDisplayNames[i];
		}
	}

	static void method10649(Class665 class665) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261]);
		String string_0_ = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261 + 1]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class299.method5523(string, string_0_, (byte) 0);
	}

	static void method10650(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class382.method6406(1805821961);
	}

	static void method10651(Class665 class665) {
		int i = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -51);
		if (twitchwebcamdevice == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevice.method1693();
	}

	static void method10652(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class272.method5083((byte) 0);
	}

	static void method10653(Class665 class665) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class277.method5152(string, -707340420);
	}

	static void method10654(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class272.method5083((byte) 0);
	}

	static void method10655(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class208_Sub11.method15616(Class402.aClass180_4150, 1783184772);
	}

	static void method10656(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class272.method5083((byte) 0);
	}

	static void method10657(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class224.method4186((byte) 12) ? 1 : 0;
	}

	static void method10658(Class665 class665) {
		class665.anInt8526 -= 204761682;
		class665.anIntArray8525[1769813785 * class665.anInt8526] = Class194.method3703((class665.anIntArray8525[class665.anInt8526 * 1769813785]), (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]), -2102812732);
		class665.anInt8526 += 102380841;
	}

	static void method10659(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class26.method855(-1493534543);
	}

	static void method10660(Class665 class665) {
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) != 0);
		Class79.method1564(bool, -1484375748);
	}

	Class641() throws Throwable {
		throw new Error();
	}

	static void method10661(Class665 class665) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class277.method5152(string, -1939718792);
	}

	static void method10662(Class665 class665) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class277.method5152(string, -37175139);
	}

	static void method10663(Class665 class665) {
		int i = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -8);
		if (twitchwebcamdevice == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevice.method1693();
	}

	static void method10664(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class67.method1475((byte) 85);
	}

	static void method10665(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class67.method1475((byte) -80);
	}

	static void method10666(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class482.method7842(1151932635);
	}

	static void method10667(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class208_Sub11.method15616(Class402.aClass180_4150, 1846176726);
	}

	static void method10668(Class665 class665) {
		Class142.method2375((byte) -80);
		Class466.method7659(class665, (byte) 44);
	}

	static void method10669(Class665 class665) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class559.method9448(string, (byte) 11);
	}

	static void method10670(Class665 class665) {
		class665.anInt8526 -= 204761682;
		int i = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -73);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1692(i_1_);
		if (null == twitchwebcamdevicecapability) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1129 * 654182613;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 268176839 * twitchwebcamdevicecapability.anInt1130;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1984150841 * twitchwebcamdevicecapability.anInt1131;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 187330919 * twitchwebcamdevicecapability.anInt1132;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1133 * 1447398877;
		}
	}

	static void method10671(Class665 class665) {
		class665.anInt8526 -= 204761682;
		int i = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -89);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1691(i_2_);
		if (null == twitchwebcamdevicecapability) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 654182613 * twitchwebcamdevicecapability.anInt1129;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1130 * 268176839;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1984150841 * twitchwebcamdevicecapability.anInt1131;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1132 * 187330919;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1447398877 * twitchwebcamdevicecapability.anInt1133;
		}
	}

	static void method10672(Class665 class665) {
		int i = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -44);
		if (twitchwebcamdevice == null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevice.anInt1120 * 1028486927;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = twitchwebcamdevice.aString1118;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = twitchwebcamdevice.aString1119;
		}
	}

	static void method10673(Class665 class665) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		TwitchWebcamDevice twitchwebcamdevice = Class690.method14002(string, (byte) -58);
		if (twitchwebcamdevice == null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1028486927 * twitchwebcamdevice.anInt1120;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = twitchwebcamdevice.aString1118;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = twitchwebcamdevice.aString1119;
		}
	}

	static void method10674(Class665 class665) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class559.method9448(string, (byte) 11);
	}

	static void method10675(Class665 class665) {
		class665.anInt8526 -= 409523364;
		int i = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_3_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		int i_5_ = class665.anIntArray8525[3 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class259.method4786(i, i_3_, i_4_, 0 != i_5_, (byte) -64);
	}

	static void method10676(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class208_Sub11.method15616(Class402.aClass180_4150, 1887958554);
	}

	static void method10677(Class665 class665) {
		int i = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -43);
		if (twitchwebcamdevice == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevice.method1693();
	}

	static void method10678(Class665 class665) {
		class665.anInt8526 -= 204761682;
		class665.anIntArray8525[1769813785 * class665.anInt8526] = Class194.method3703((class665.anIntArray8525[class665.anInt8526 * 1769813785]), (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]), -2102812732);
		class665.anInt8526 += 102380841;
	}

	static void method10679(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class482.method7842(1269340215);
	}

	static void method10680(Class665 class665) {
		class665.anInt8526 -= 204761682;
		int i = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_6_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -15);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1692(i_6_);
		if (null == twitchwebcamdevicecapability) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1129 * 654182613;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 268176839 * twitchwebcamdevicecapability.anInt1130;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1984150841 * twitchwebcamdevicecapability.anInt1131;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 187330919 * twitchwebcamdevicecapability.anInt1132;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1133 * 1447398877;
		}
	}

	static void method10681(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class272.method5083((byte) 0);
	}

	static void method10682(Class665 class665) {
		class665.anInt8526 -= 204761682;
		class665.anIntArray8525[1769813785 * class665.anInt8526] = Class194.method3703((class665.anIntArray8525[class665.anInt8526 * 1769813785]), (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]), -2102812732);
		class665.anInt8526 += 102380841;
	}

	static void method10683(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class272.method5083((byte) 0);
	}

	static void method10684(Class665 class665) {
		class665.anInt8526 -= 204761682;
		class665.anIntArray8525[1769813785 * class665.anInt8526] = Class194.method3703((class665.anIntArray8525[class665.anInt8526 * 1769813785]), (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]), -2102812732);
		class665.anInt8526 += 102380841;
	}

	static void method10685(Class665 class665) {
		int i = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -117);
		if (twitchwebcamdevice == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevice.method1693();
	}

	static void method10686(Class665 class665) {
		int i = Class231.method4327(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)], 446829221);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i;
	}

	static void method10687(Class665 class665) {
		int i = Class231.method4327(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)], -2118951496);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i;
	}

	static void method10688(Class665 class665) {
		class665.anInt8526 -= 204761682;
		boolean bool = 0 != class665.anIntArray8525[class665.anInt8526 * 1769813785];
		boolean bool_7_ = 0 != (class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]);
		Class403.method6539(bool, bool_7_, 463305278);
	}

	static void method10689(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class295.method5334(1529045533);
	}

	static void method10690(Class665 class665) {
		Class142.method2375((byte) -92);
		Class466.method7659(class665, (byte) -1);
	}

	static void method10691(Class665 class665) {
		Class142.method2375((byte) -70);
		Class466.method7659(class665, (byte) 2);
	}

	static void method10692(Class665 class665) {
		Class142.method2375((byte) -10);
		Class466.method7659(class665, (byte) -9);
	}

	static void method10693(Class665 class665) {
		Class142.method2375((byte) -92);
		Class466.method7659(class665, (byte) -19);
	}

	static void method10694(Class665 class665) {
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) != 0);
		Class79.method1564(bool, -1484375748);
	}

	static void method10695(Class665 class665) {
		int i = Class296_Sub1.method15693((short) -21580);
		if (i < 0) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class597.aTwitchEventLiveStreams7849.viewerCounts[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.channelUrls[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.previewUrlTemplates[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.streamTitles[i];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.channelDisplayNames[i];
		}
	}

	static void method10696(Class665 class665) {
		class665.anInt8526 -= 204761682;
		int i = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_8_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i, (byte) -32);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1692(i_8_);
		if (null == twitchwebcamdevicecapability) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1129 * 654182613;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 268176839 * twitchwebcamdevicecapability.anInt1130;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1984150841 * twitchwebcamdevicecapability.anInt1131;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 187330919 * twitchwebcamdevicecapability.anInt1132;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1133 * 1447398877;
		}
	}

	static void method10697(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class565.method9494((byte) 22) ? 1 : 0;
	}

	static void method10698(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class565.method9494((byte) -26) ? 1 : 0;
	}

	static void method10699(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class565.method9494((byte) -99) ? 1 : 0;
	}

	static void method10700(Class665 class665) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class565.method9494((byte) -99) ? 1 : 0;
	}

	static final void method10701(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_9_, -1491349363);
		Class208_Sub2.method15592(class243, class665, (short) 17520);
	}

	static final void method10702(Class640_Sub1 class640_sub1, int i, boolean bool, boolean bool_10_, byte i_11_) {
		int i_12_;
		int i_13_;
		if (class640_sub1 instanceof Class640_Sub1_Sub2 && class640_sub1 instanceof Interface62) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = (Class640_Sub1_Sub2) class640_sub1;
			int i_14_ = ((class640_sub1_sub2.aShort11770 - class640_sub1_sub2.aShort11775 + 1) << 9);
			int i_15_ = (1 + (class640_sub1_sub2.aShort11772 - class640_sub1_sub2.aShort11771) << 9);
			i_12_ = (class640_sub1_sub2.aShort11775 << 9) + i_14_ / 2;
			i_13_ = i_15_ / 2 + (class640_sub1_sub2.aShort11771 << 9);
		} else {
			Class442 class442 = class640_sub1.method10637().aClass442_4927;
			i_12_ = (int) class442.aFloat4918;
			i_13_ = (int) class442.aFloat4919;
		}
		Class638.method10576(class640_sub1.aByte10864, i_12_, i_13_, 0, i, bool, bool_10_, (short) 31989);
	}

	static void method10703(File file, int i) {
		Class502.aFile6872 = file;
		if (!Class502.aFile6872.exists())
			throw new RuntimeException("");
		Class502.aBool6873 = true;
	}

	public static String method10704(CharSequence charsequence, Class91 class91, int i) {
		if (null == charsequence)
			return null;
		int i_16_ = 0;
		int i_17_;
		for (i_17_ = charsequence.length(); (i_16_ < i_17_ && Class71.method1491(charsequence.charAt(i_16_), 526776408)); i_16_++) {
			/* empty */
		}
		for (/**/; (i_17_ > i_16_ && Class71.method1491(charsequence.charAt(i_17_ - 1), -470779091)); i_17_--) {
			/* empty */
		}
		int i_18_ = i_17_ - i_16_;
		if (i_18_ < 1 || i_18_ > Class300.method5565(class91, 1669382914))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_18_);
		for (int i_19_ = i_16_; i_19_ < i_17_; i_19_++) {
			char c = charsequence.charAt(i_19_);
			if (Class300.method5566(c, 211546141)) {
				char c_20_ = Class55.method1321(c, -1507719838);
				if (c_20_ != 0)
					stringbuilder.append(c_20_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static final void method10705(Class665 class665, byte i) {
		Class527_Sub8_Sub7 class527_sub8_sub7 = Class620.method10226(1801350492);
		if (Class43.method1182(class527_sub8_sub7, (byte) -30) == 7) {
			int i_21_ = (int) class527_sub8_sub7.method18179(-2001364458);
			if (i_21_ >= 0 && i_21_ <= 351100807 * Class105.anInt1300) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_21_];
				if (class640_sub1_sub2_sub1_sub2 != null) {
					class665.aClass640_Sub1_Sub2_Sub1_8522 = class640_sub1_sub2_sub1_sub2;
					class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
					return;
				}
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	public static void method10706(Class160 class160, int i) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(2, (long) (class160.anInt1746 * 727971013));
		class527_sub8_sub9.method18186(-1498453);
	}

	public static Class387 method10707(RSByteBuffer class527_sub38, int i) {
		int i_22_ = class527_sub38.method16466(-1604100542);
		return new Class387(i_22_);
	}
}

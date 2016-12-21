/* Class575 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;

import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class575 {
	static final int anInt7645 = 1;
	static final int anInt7646 = 0;
	static int anInt7647;
	static final int anInt7648 = 2;
	static int anInt7649;
	static String[] aStringArray7650;
	static TwitchWebcamFrameData aTwitchWebcamFrameData7651;
	static final int anInt7652 = 2;
	static boolean aBool7653;
	static int anInt7654;
	static int anInt7655;
	static int anInt7656;
	static boolean aBool7657 = false;
	static int anInt7658;
	static boolean aBool7659;
	static boolean[] aBoolArray7660;
	static LinkedList aLinkedList7661;
	static boolean aBool7662;
	static long aLong7663;
	static long aLong7664;
	static long aLong7665;
	static final int anInt7666 = 1;
	static boolean aBool7667;
	static final int anInt7668 = 3;
	static int anInt7669;
	static LinkedList aLinkedList7670;
	static int anInt7671;
	static float aFloat7672 = 0.2F;
	static int anInt7673;
	static TwitchWebcamDevice[] aTwitchWebcamDeviceArray7674;
	static long aLong7675;
	static Class143 aClass143_7676;
	static boolean aBool7677;
	static final int anInt7678 = 2000;
	static final int anInt7679 = 0;
	public static int anInt7680;

	static {
		anInt7654 = -1572113329;
		anInt7655 = -1475702304;
		anInt7656 = 0;
		anInt7647 = -933789744;
		anInt7658 = 0;
		anInt7671 = 0;
		aBoolArray7660 = null;
		aStringArray7650 = null;
		aBool7662 = false;
		aLong7663 = 0L;
		aLong7664 = 0L;
		aLong7665 = 0L;
		anInt7649 = 0;
		aBool7667 = false;
		aBool7659 = false;
		aTwitchWebcamFrameData7651 = null;
		aLinkedList7661 = new LinkedList();
		aLinkedList7670 = new LinkedList();
		anInt7673 = 1660262091;
		aTwitchWebcamDeviceArray7674 = null;
		aLong7675 = 0L;
		aClass143_7676 = null;
		aBool7677 = false;
		aBool7653 = false;
	}

	public static void method6948() {
		anInt7673 = 1660262091;
	}

	static int method6949() {
		try {
			for (int i = 0; i < aStringArray7650.length; i++) {
				if (aStringArray7650[i] != null && aBoolArray7660[i])
					Class114.method1481((byte) 94).method391(aStringArray7650[i], 485887217);
			}
		} catch (Exception_Sub6 exception_sub6) {
			return 3;
		}
		Class536_Sub42.aTwitchTV10811 = new TwitchTV();
		int i = Class536_Sub42.aTwitchTV10811.InitialiseTTV(Class237.method3354((byte) -67));
		if (i == 0)
			aBool7662 = true;
		else
			Class81.method1165(new StringBuilder().append(10).append(Class40.aString491).append(i).toString(), new RuntimeException(), (byte) 52);
		return 2;
	}

	public static int method6950() {
		if (null == Class325.aTwitchEventLiveStreams3561 || (-2017369827 * anInt7673 >= Class325.aTwitchEventLiveStreams3561.streamCount - 1))
			return -1;
		return (anInt7673 += -1660262091) * -2017369827;
	}

	public static int method6951() {
		return 179908453 * anInt7658;
	}

	public static void method6952(boolean bool) {
		/* empty */
	}

	static int method6953() {
		try {
			for (int i = 0; i < aStringArray7650.length; i++) {
				if (aStringArray7650[i] != null && aBoolArray7660[i])
					Class114.method1481((byte) 95).method391(aStringArray7650[i], 485887217);
			}
		} catch (Exception_Sub6 exception_sub6) {
			return 3;
		}
		Class536_Sub42.aTwitchTV10811 = new TwitchTV();
		int i = Class536_Sub42.aTwitchTV10811.InitialiseTTV(Class237.method3354((byte) -106));
		if (i == 0)
			aBool7662 = true;
		else
			Class81.method1165(new StringBuilder().append(10).append(Class40.aString491).append(i).toString(), new RuntimeException(), (byte) -30);
		return 2;
	}

	public static void method6954(boolean bool) {
		/* empty */
	}

	public static int method6955() {
		Class325.aTwitchEventLiveStreams3561 = null;
		int i = Class536_Sub42.aTwitchTV10811.RequestLiveStreams(client.aClass670_11043.aString8574);
		return i;
	}

	public static int method6956() {
		return Class536_Sub42.aTwitchTV10811.GetViewerCount();
	}

	public static void method6957() {
		anInt7673 = 1660262091;
	}

	static void method6958(int i, int i_0_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_0_);
		Class572 class572 = twitcheventresult.method4952();
		if (class572 != null)
			Class306.method4121(class572.method78(), twitcheventresult, (byte) 1);
	}

	static int method6959() {
		try {
			for (int i = 0; i < aStringArray7650.length; i++) {
				if (aStringArray7650[i] != null && aBoolArray7660[i])
					Class114.method1481((byte) 86).method391(aStringArray7650[i], 485887217);
			}
		} catch (Exception_Sub6 exception_sub6) {
			return 3;
		}
		Class536_Sub42.aTwitchTV10811 = new TwitchTV();
		int i = Class536_Sub42.aTwitchTV10811.InitialiseTTV(Class237.method3354((byte) -85));
		if (i == 0)
			aBool7662 = true;
		else
			Class81.method1165(new StringBuilder().append(10).append(Class40.aString491).append(i).toString(), new RuntimeException(), (byte) 5);
		return 2;
	}

	public static void method6960(boolean bool) {
		/* empty */
	}

	public static void method6961() {
		if (aBool7662) {
			int i = Class536_Sub42.aTwitchTV10811.ShutdownTTV();
			if (i == 0) {
				Class536_Sub42.aTwitchTV10811 = null;
				aBool7662 = false;
			}
		}
	}

	public static void method6962() {
		if (aBool7662) {
			int i = Class536_Sub42.aTwitchTV10811.ShutdownTTV();
			if (i == 0) {
				Class536_Sub42.aTwitchTV10811 = null;
				aBool7662 = false;
			}
		}
	}

	public static void method6963() {
		if (aBool7662) {
			int i = Class536_Sub42.aTwitchTV10811.ShutdownTTV();
			if (i == 0) {
				Class536_Sub42.aTwitchTV10811 = null;
				aBool7662 = false;
			}
		}
	}

	public static int method6964() {
		return Class536_Sub42.aTwitchTV10811.GetLoginState();
	}

	public static int method6965() {
		return (null == aTwitchWebcamDeviceArray7674 ? 0 : aTwitchWebcamDeviceArray7674.length);
	}

	public static int method6966() {
		if (!aBool7662)
			return 12;
		Class554.method6782(Class677.aClass167_8609, (byte) 35);
		return Class536_Sub42.aTwitchTV10811.Logout();
	}

	public static int method6967() {
		return Class536_Sub42.aTwitchTV10811.GetStreamState();
	}

	static void method6968() {
		aBool7667 = false;
		Class536_Sub22_Sub5.anIntArray11645 = null;
		Class508.anIntArray6917 = null;
		aLinkedList7661.clear();
		aLinkedList7670.clear();
		Class677.aClass167_8609.method2393();
	}

	public static int method6969() {
		return Class536_Sub42.aTwitchTV10811.GetLoginState();
	}

	static void method6970() {
		aBool7667 = false;
		Class536_Sub22_Sub5.anIntArray11645 = null;
		Class508.anIntArray6917 = null;
		aLinkedList7661.clear();
		aLinkedList7670.clear();
		Class677.aClass167_8609.method2393();
	}

	static int method6971() {
		try {
			for (int i = 0; i < aStringArray7650.length; i++) {
				if (aStringArray7650[i] != null && aBoolArray7660[i])
					Class114.method1481((byte) 101).method391(aStringArray7650[i], 485887217);
			}
		} catch (Exception_Sub6 exception_sub6) {
			return 3;
		}
		Class536_Sub42.aTwitchTV10811 = new TwitchTV();
		int i = Class536_Sub42.aTwitchTV10811.InitialiseTTV(Class237.method3354((byte) -56));
		if (i == 0)
			aBool7662 = true;
		else
			Class81.method1165(new StringBuilder().append(10).append(Class40.aString491).append(i).toString(), new RuntimeException(), (byte) -39);
		return 2;
	}

	public static int method6972() {
		return Class536_Sub42.aTwitchTV10811.GetChatState();
	}

	static void method6973() {
		if (aClass143_7676 == null || aClass143_7676.method1720() != aTwitchWebcamFrameData7651.width || (aClass143_7676.method1752() != aTwitchWebcamFrameData7651.height))
			aClass143_7676 = (Class677.aClass167_8609.method2080(aTwitchWebcamFrameData7651.buffer, 0, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.height, false));
		else
			aClass143_7676.method1783(0, 0, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.height, aTwitchWebcamFrameData7651.buffer, 0, aTwitchWebcamFrameData7651.width);
	}

	public static boolean method6974() {
		if (Class497.aString5550.startsWith("win"))
			return true;
		return false;
	}

	Class575() throws Throwable {
		throw new Error();
	}

	static void method6975() {
		aBool7667 = false;
		Class536_Sub22_Sub5.anIntArray11645 = null;
		Class508.anIntArray6917 = null;
		aLinkedList7661.clear();
		aLinkedList7670.clear();
		Class677.aClass167_8609.method2393();
	}

	public static boolean method6976() {
		if (Class497.aString5550.startsWith("win"))
			return true;
		return false;
	}

	static void method6977() {
		aBool7667 = false;
		Class536_Sub22_Sub5.anIntArray11645 = null;
		Class508.anIntArray6917 = null;
		aLinkedList7661.clear();
		aLinkedList7670.clear();
		Class677.aClass167_8609.method2393();
	}

	public static boolean method6978() {
		return (null != Class536_Sub42.aTwitchTV10811 && Class536_Sub42.aTwitchTV10811.IsStreaming());
	}

	public static int method6979() {
		return (null == aTwitchWebcamDeviceArray7674 ? 0 : aTwitchWebcamDeviceArray7674.length);
	}

	static void method6980() {
		if (aClass143_7676 == null || aClass143_7676.method1720() != aTwitchWebcamFrameData7651.width || (aClass143_7676.method1752() != aTwitchWebcamFrameData7651.height))
			aClass143_7676 = (Class677.aClass167_8609.method2080(aTwitchWebcamFrameData7651.buffer, 0, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.height, false));
		else
			aClass143_7676.method1783(0, 0, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.height, aTwitchWebcamFrameData7651.buffer, 0, aTwitchWebcamFrameData7651.width);
	}

	static void method6981() {
		if (aClass143_7676 == null || aClass143_7676.method1720() != aTwitchWebcamFrameData7651.width || (aClass143_7676.method1752() != aTwitchWebcamFrameData7651.height))
			aClass143_7676 = (Class677.aClass167_8609.method2080(aTwitchWebcamFrameData7651.buffer, 0, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.height, false));
		else
			aClass143_7676.method1783(0, 0, aTwitchWebcamFrameData7651.width, aTwitchWebcamFrameData7651.height, aTwitchWebcamFrameData7651.buffer, 0, aTwitchWebcamFrameData7651.width);
	}

	public static void method6982() {
		aClass143_7676 = null;
	}

	public static int method6983() {
		return 179908453 * anInt7658;
	}

	static void method6984() {
		aTwitchWebcamDeviceArray7674 = Class536_Sub42.aTwitchTV10811.GetWebcamDevices();
	}

	static void method6985() {
		aTwitchWebcamDeviceArray7674 = Class536_Sub42.aTwitchTV10811.GetWebcamDevices();
	}

	public static int method6986() {
		return Class536_Sub42.aTwitchTV10811.GetWebcamState();
	}

	public static void method6987(boolean bool) {
		/* empty */
	}

	public static int method6988() {
		return (null == aTwitchWebcamDeviceArray7674 ? 0 : aTwitchWebcamDeviceArray7674.length);
	}

	public static int method6989() {
		return (null == aTwitchWebcamDeviceArray7674 ? 0 : aTwitchWebcamDeviceArray7674.length);
	}

	public static int method6990() {
		Class325.aTwitchEventLiveStreams3561 = null;
		int i = Class536_Sub42.aTwitchTV10811.RequestLiveStreams(client.aClass670_11043.aString8574);
		return i;
	}

	public static int method6991() {
		Class325.aTwitchEventLiveStreams3561 = null;
		int i = Class536_Sub42.aTwitchTV10811.RequestLiveStreams(client.aClass670_11043.aString8574);
		return i;
	}

	public static void method6992() {
		if (aBool7662) {
			int i = Class536_Sub42.aTwitchTV10811.ShutdownTTV();
			if (i == 0) {
				Class536_Sub42.aTwitchTV10811 = null;
				aBool7662 = false;
			}
		}
	}

	public static int method6993() {
		return Class536_Sub42.aTwitchTV10811.GetViewerCount();
	}

	public static int method6994() {
		return Class536_Sub42.aTwitchTV10811.GetViewerCount();
	}

	public static void method6995(boolean bool) {
		/* empty */
	}

	public static boolean method6996() {
		if (Class497.aString5550.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_1_ = "msvcp110.dll";
			String[] strings = { string, string_1_ };
			String string_2_ = System.getenv("WINDIR");
			if (string_2_ == "")
				return false;
			for (int i = 0; i < strings.length; i++) {
				File file = new File(new StringBuilder().append(string_2_).append("\\system32\\").append(strings[i]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class497.aString5550.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_3_;
					try {
						int i = process.waitFor();
						if (i == 0)
							break;
						bool_3_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_3_;
				} while (false);
				boolean bool_4_ = false;
				while_33_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_33_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_4_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_4_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	static final void method6997(Class668 class668, byte i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class39.aClass450_490.method5424(i_5_, 1412432345).aString11757;
	}

	static final void method6998(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_7_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		int i_8_ = i_7_ >> 14 & 0x3fff;
		int i_9_ = i_7_ & 0x3fff;
		int i_10_ = Class591.method7114(i_6_, i_8_, i_9_, (byte) 101);
		if (i_10_ < 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_10_;
	}

	static final void method6999(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static boolean method7000(String string, int i, String string_11_, int i_12_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!Class509.aString6919.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_13_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_14_ = 0; i_14_ < string.length(); i_14_++) {
					if (string_13_.indexOf(string.charAt(i_14_)) == -1)
						throw new Exception();
				}
				Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
				bool = true;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (1 == i) {
			boolean bool;
			try {
				Object object = Class25.method730(Class509.anApplet6923, string_11_, (new Object[] { new URL(Class509.anApplet6923.getCodeBase(), string).toString() }), 1838118888);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (2 == i) {
			boolean bool;
			try {
				Class509.anApplet6923.getAppletContext().showDocument(new URL(Class509.anApplet6923.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class25.method729(Class509.anApplet6923, "loggedout", 886374175);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				Class509.anApplet6923.getAppletContext().showDocument(new URL(Class509.anApplet6923.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	static final void method7001(Class668 class668, int i) {
		Class38.method843((byte) -83);
		Class608.method7261((byte) 0);
		client.aClass515_11066.method6319(-1092261020);
		Class27.method763(1945237061);
		client.aBool11015 = false;
	}
}

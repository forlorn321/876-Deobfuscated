/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class585 {
	static int anInt7680;
	static int anInt7681;
	static final int anInt7682 = 1;
	static int anInt7683;
	static final int anInt7684 = 3;
	static String[] aStringArray7685;
	static final int anInt7686 = 1;
	static final int anInt7687 = 2;
	static Class147 aClass147_7688;
	static final int anInt7689 = 2;
	static int anInt7690;
	static final int anInt7691 = 0;
	static int anInt7692;
	static boolean aBool7693;
	static final int anInt7694 = 0;
	static boolean[] aBoolArray7695;
	static boolean aBool7696;
	static float aFloat7697;
	static TwitchTV aTwitchTV7698;
	static long aLong7699;
	static long aLong7700;
	static long aLong7701;
	static int anInt7702;
	static int anInt7703;
	static boolean aBool7704;
	static TwitchWebcamFrameData aTwitchWebcamFrameData7705;
	static LinkedList aLinkedList7706;
	static LinkedList aLinkedList7707;
	static int anInt7708;
	static TwitchWebcamDevice[] aTwitchWebcamDeviceArray7709;
	static long aLong7710;
	static boolean aBool7711;
	static boolean aBool7712;
	static final int anInt7713 = 2000;
	static boolean aBool7714 = false;

	public static void method9680(boolean bool) {
		/* empty */
	}

	static {
		aFloat7697 = 0.2F;
		anInt7680 = 870505995;
		anInt7690 = 1598273696;
		anInt7683 = 0;
		anInt7692 = -1961817200;
		anInt7681 = 0;
		anInt7703 = 0;
		aBoolArray7695 = null;
		aStringArray7685 = null;
		aBool7693 = false;
		aLong7699 = 0L;
		aLong7700 = 0L;
		aLong7701 = 0L;
		anInt7702 = 0;
		aBool7696 = false;
		aBool7704 = false;
		aTwitchWebcamFrameData7705 = null;
		aLinkedList7706 = new LinkedList();
		aLinkedList7707 = new LinkedList();
		anInt7708 = 640177411;
		aTwitchWebcamDeviceArray7709 = null;
		aLong7710 = 0L;
		aClass147_7688 = null;
		aBool7712 = false;
		aBool7711 = false;
	}

	public static void method9681() {
		anInt7708 = 640177411;
	}

	public static void method9682(Class180 class180, long l) {
		class180.method3126();
		aLinkedList7706.clear();
		aLinkedList7707.clear();
		aLong7699 = (l + (long) (anInt7683 * 1254703743)) * 1221725028280924535L;
	}

	public static int method9683(String string) {
		return aTwitchTV7698.ChatSendMessage(string);
	}

	public static void method9684(boolean bool) {
		/* empty */
	}

	public static void method9685(boolean bool) {
		/* empty */
	}

	Class585() throws Throwable {
		throw new Error();
	}

	public static int method9686() {
		if (Class597.aTwitchEventLiveStreams7849 == null || (490422869 * anInt7708 >= Class597.aTwitchEventLiveStreams7849.streamCount - 1))
			return -1;
		return (anInt7708 += -640177411) * 490422869;
	}

	public static int method9687() {
		return anInt7681 * -748564677;
	}

	public static int method9688() {
		if (anInt7681 * -748564677 == 3)
			return -1;
		if (0 != -748564677 * anInt7681)
			return 1114297849 * anInt7703;
		if (aStringArray7685 == null) {
			if (Class498.aString5584.startsWith("mac ")) {
				if (Class498.aString5583.startsWith("ppc")) {
					anInt7681 = 969840089;
					return -1;
				}
				aStringArray7685 = new String[3];
				aStringArray7685[0] = "sdk-mac-dynamic";
				aStringArray7685[1] = "twitchsdk";
				aStringArray7685[2] = "twitchtv";
				aBoolArray7695 = new boolean[3];
				aBoolArray7695[0] = false;
				aBoolArray7695[1] = false;
				aBoolArray7695[2] = true;
			} else if (Class498.aString5584.startsWith("win")) {
				aStringArray7685 = new String[6];
				aStringArray7685[0] = "avutil-ttv-51";
				aStringArray7685[1] = "libmp3lame-ttv";
				aStringArray7685[2] = "swresample-ttv-0";
				aStringArray7685[5] = "twitchtv";
				if (Class498.aString5583.startsWith("amd64") || Class498.aString5583.startsWith("x86_64")) {
					aStringArray7685[3] = "libmfxsw64";
					aStringArray7685[4] = "twitchsdk_64_release";
				} else if (Class498.aString5583.startsWith("i386") || Class498.aString5583.startsWith("i486") || Class498.aString5583.startsWith("i586") || Class498.aString5583.startsWith("x86")) {
					aStringArray7685[3] = "libmfxsw32";
					aStringArray7685[4] = "twitchsdk_32_release";
				} else {
					anInt7681 = 969840089;
					return -1;
				}
				aBoolArray7695 = new boolean[6];
				aBoolArray7695[0] = true;
				aBoolArray7695[1] = true;
				aBoolArray7695[2] = true;
				aBoolArray7695[3] = false;
				aBoolArray7695[4] = true;
				aBoolArray7695[5] = true;
			} else {
				anInt7681 = 969840089;
				return -1;
			}
		}
		anInt7681 = 1754935795;
		return 0;
	}

	static void method9689(int i, int i_0_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_0_);
		Class578 class578 = twitcheventresult.method6561();
		if (class578 != null)
			Class390.method6467(class578.method87(), twitcheventresult, -2108487825);
	}

	public static int method9690() {
		return anInt7681 * -748564677;
	}

	public static void method9691(boolean bool) {
		/* empty */
	}

	static int method9692() {
		try {
			for (int i = 0; i < aStringArray7685.length; i++) {
				if (null != aStringArray7685[i] && aBoolArray7695[i])
					Class177.method3056((byte) 47).method369(aStringArray7685[i], -877406334);
			}
		} catch (Exception_Sub2 exception_sub2) {
			return 3;
		}
		aTwitchTV7698 = new TwitchTV();
		int i = aTwitchTV7698.InitialiseTTV(Class488.method7969(529373274));
		if (0 == i)
			aBool7693 = true;
		else
			Class180.method3542(new StringBuilder().append(10).append(Class33.aString325).append(i).toString(), new RuntimeException(), 1604547405);
		return 2;
	}

	static int method9693() {
		try {
			for (int i = 0; i < aStringArray7685.length; i++) {
				if (null != aStringArray7685[i] && aBoolArray7695[i])
					Class177.method3056((byte) 54).method369(aStringArray7685[i], -336417818);
			}
		} catch (Exception_Sub2 exception_sub2) {
			return 3;
		}
		aTwitchTV7698 = new TwitchTV();
		int i = aTwitchTV7698.InitialiseTTV(Class488.method7969(1097745033));
		if (0 == i)
			aBool7693 = true;
		else
			Class180.method3542(new StringBuilder().append(10).append(Class33.aString325).append(i).toString(), new RuntimeException(), 1604547405);
		return 2;
	}

	public static void method9694() {
		if (aBool7693) {
			int i = aTwitchTV7698.ShutdownTTV();
			if (i == 0) {
				aTwitchTV7698 = null;
				aBool7693 = false;
			}
		}
	}

	public static void method9695() {
		if (aBool7693) {
			int i = aTwitchTV7698.ShutdownTTV();
			if (i == 0) {
				aTwitchTV7698 = null;
				aBool7693 = false;
			}
		}
	}

	static boolean method9696(TwitchEvent twitchevent, long l) {
		if (!aBool7714) {
			switch (twitchevent.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}
		if (33 == twitchevent.eventType) {
			if (null == aTwitchWebcamFrameData7705)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_1_ = aTwitchTV7698.GetWebcamFrameData(i, aTwitchWebcamFrameData7705);
			if (0 == i_1_) {
				if (aBool7712)
					aTwitchWebcamFrameData7705.method14418();
				if (aBool7711)
					aTwitchWebcamFrameData7705.method14419();
				Class524.method8718((byte) 8);
				aLong7710 = -7609805716521092341L * l;
				Class265.method5033(33, 0, -2015738787);
			} else
				aClass147_7688 = null;
			return false;
		}
		if (30 == twitchevent.eventType) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (0 == i || i == 1)
				Class373.method6375(1255108370);
			else if (2 == i)
				aLong7710 = l * -7609805716521092341L;
		}
		if (twitchevent.eventType == 34) {
			Class597.aTwitchEventLiveStreams7849 = (TwitchEventLiveStreams) twitchevent;
			Class265.method5033(34, 0, 731310295);
		}
		return true;
	}

	public static void method9697() {
		if (aBool7693) {
			int i = aTwitchTV7698.ShutdownTTV();
			if (i == 0) {
				aTwitchTV7698 = null;
				aBool7693 = false;
			}
		}
	}

	public static int method9698() {
		return aTwitchTV7698.GetLoginState();
	}

	static void method9699() {
		if (aClass147_7688 == null || aClass147_7688.method2407() != aTwitchWebcamFrameData7705.width || (aClass147_7688.method2424() != aTwitchWebcamFrameData7705.height))
			aClass147_7688 = (Class402.aClass180_4150.method3162(aTwitchWebcamFrameData7705.buffer, 0, aTwitchWebcamFrameData7705.width, aTwitchWebcamFrameData7705.width, aTwitchWebcamFrameData7705.height, false));
		else
			aClass147_7688.method2459(0, 0, aTwitchWebcamFrameData7705.width, aTwitchWebcamFrameData7705.height, aTwitchWebcamFrameData7705.buffer, 0, aTwitchWebcamFrameData7705.width);
	}

	public static int method9700() {
		if (!aBool7693)
			return 12;
		Class208_Sub11.method15616(Class402.aClass180_4150, 2066453444);
		return aTwitchTV7698.Logout();
	}

	public static void method9701(Class180 class180, long l) {
		if (-748564677 * anInt7681 != 3 && 0 != -748564677 * anInt7681) {
			if (1 == -748564677 * anInt7681) {
				if (aStringArray7685 == null || aStringArray7685.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_2_ = 0; i_2_ < aStringArray7685.length; i_2_++) {
					if (null != aStringArray7685[i_2_]) {
						try {
							i += (Class234.aClass539_2374.method8993(aStringArray7685[i_2_], (byte) 0));
						} catch (Exception_Sub4 exception_sub4) {
							Class637.method10570(Class71.aClass71_783, exception_sub4.aString11364, (exception_sub4.anInt11363 * 1122887509), exception_sub4.getCause(), 1388295543);
							anInt7681 = 969840089;
							return;
						}
					} else
						i += 100;
				}
				anInt7703 = -1432363959 * (i / aStringArray7685.length);
				if (anInt7703 * 1114297849 == 100) {
					anInt7681 = Class639_Sub2.method16983(1000578671) * 1754935795;
					if (2 != -748564677 * anInt7681)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = aTwitchTV7698.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (null != twitchevent && Class235.method4353(twitchevent, l)) {
						Class578 class578 = twitchevent.method6561();
						if (class578 != null)
							Class390.method6467(class578.method87(), twitchevent, -956301574);
					}
				}
			}
			if (aTwitchTV7698.IsStreaming() && (l - aLong7699 * -5842675412488605625L > Class512.aLong7008 * 2633100174167199109L)) {
				aLong7699 = l * 1221725028280924535L;
				if (class180.method3184())
					aBool7696 = true;
			}
			if (aTwitchTV7698.IsStreaming()) {
				if (l - aLong7700 * 4608545456380175315L < (long) (161905497 * anInt7690))
					anInt7702 = 823554538;
				else if (l - aLong7701 * -6495383206257305831L < (long) (161905497 * anInt7690))
					anInt7702 = -1735706379;
				else
					anInt7702 = 0;
			} else
				anInt7702 = 0;
			if (l - aLong7710 * 1418162785997322403L > (long) (1107878885 * anInt7692) && aTwitchTV7698.GetWebcamState() == 5) {
				aTwitchTV7698.RestartWebcamDevice();
				aLong7710 = -7609805716521092341L * l;
			}
		}
	}

	public static void method9702(int i, int i_3_, int i_4_, int i_5_) {
		aLinkedList7706.addLast(new Class568(i, i_3_, i_4_ - i, i_5_ - i_3_));
	}

	public static boolean method9703() {
		return aBool7696;
	}

	public static void method9704(boolean bool) {
		/* empty */
	}

	public static int method9705(Class180 class180) {
		Class305.method5592((byte) -33);
		return aTwitchTV7698.StopStreaming();
	}

	public static int method9706(Class180 class180) {
		Class305.method5592((byte) -39);
		return aTwitchTV7698.StopStreaming();
	}

	static void method9707() {
		aBool7696 = false;
		Class172.anIntArray1883 = null;
		Class398.anIntArray4124 = null;
		aLinkedList7706.clear();
		aLinkedList7707.clear();
		Class402.aClass180_4150.method3126();
	}

	static void method9708() {
		aBool7696 = false;
		Class172.anIntArray1883 = null;
		Class398.anIntArray4124 = null;
		aLinkedList7706.clear();
		aLinkedList7707.clear();
		Class402.aClass180_4150.method3126();
	}

	public static void method9709(Class180 class180, long l) {
		if (-748564677 * anInt7681 != 3 && 0 != -748564677 * anInt7681) {
			if (1 == -748564677 * anInt7681) {
				if (aStringArray7685 == null || aStringArray7685.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_6_ = 0; i_6_ < aStringArray7685.length; i_6_++) {
					if (null != aStringArray7685[i_6_]) {
						try {
							i += (Class234.aClass539_2374.method8993(aStringArray7685[i_6_], (byte) 2));
						} catch (Exception_Sub4 exception_sub4) {
							Class637.method10570(Class71.aClass71_783, exception_sub4.aString11364, (exception_sub4.anInt11363 * 1122887509), exception_sub4.getCause(), 506765849);
							anInt7681 = 969840089;
							return;
						}
					} else
						i += 100;
				}
				anInt7703 = -1432363959 * (i / aStringArray7685.length);
				if (anInt7703 * 1114297849 == 100) {
					anInt7681 = Class639_Sub2.method16983(-1209088234) * 1754935795;
					if (2 != -748564677 * anInt7681)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = aTwitchTV7698.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (null != twitchevent && Class235.method4353(twitchevent, l)) {
						Class578 class578 = twitchevent.method6561();
						if (class578 != null)
							Class390.method6467(class578.method87(), twitchevent, 1230645286);
					}
				}
			}
			if (aTwitchTV7698.IsStreaming() && (l - aLong7699 * -5842675412488605625L > Class512.aLong7008 * 2633100174167199109L)) {
				aLong7699 = l * 1221725028280924535L;
				if (class180.method3184())
					aBool7696 = true;
			}
			if (aTwitchTV7698.IsStreaming()) {
				if (l - aLong7700 * 4608545456380175315L < (long) (161905497 * anInt7690))
					anInt7702 = 823554538;
				else if (l - aLong7701 * -6495383206257305831L < (long) (161905497 * anInt7690))
					anInt7702 = -1735706379;
				else
					anInt7702 = 0;
			} else
				anInt7702 = 0;
			if (l - aLong7710 * 1418162785997322403L > (long) (1107878885 * anInt7692) && aTwitchTV7698.GetWebcamState() == 5) {
				aTwitchTV7698.RestartWebcamDevice();
				aLong7710 = -7609805716521092341L * l;
			}
		}
	}

	static void method9710() {
		aBool7696 = false;
		Class172.anIntArray1883 = null;
		Class398.anIntArray4124 = null;
		aLinkedList7706.clear();
		aLinkedList7707.clear();
		Class402.aClass180_4150.method3126();
	}

	public static int method9711(String string) {
		return aTwitchTV7698.SetStreamTitle(string, client.aClass678_11259.aString8618);
	}

	public static int method9712(String string, String string_7_) {
		if (!aBool7693)
			return 12;
		if (Class203.method3782((byte) -1) != client.aClass109_11067)
			return 42;
		return aTwitchTV7698.Login(string, string_7_);
	}

	static int method9713() {
		try {
			for (int i = 0; i < aStringArray7685.length; i++) {
				if (null != aStringArray7685[i] && aBoolArray7695[i])
					Class177.method3056((byte) 19).method369(aStringArray7685[i], -1885515125);
			}
		} catch (Exception_Sub2 exception_sub2) {
			return 3;
		}
		aTwitchTV7698 = new TwitchTV();
		int i = aTwitchTV7698.InitialiseTTV(Class488.method7969(1134354917));
		if (0 == i)
			aBool7693 = true;
		else
			Class180.method3542(new StringBuilder().append(10).append(Class33.aString325).append(i).toString(), new RuntimeException(), 1604547405);
		return 2;
	}

	public static void method9714(boolean bool) {
		if (aBool7704 != bool) {
			Class305.method5592((byte) 33);
			aBool7704 = bool;
		}
	}

	public static void method9715(boolean bool) {
		if (aBool7704 != bool) {
			Class305.method5592((byte) 5);
			aBool7704 = bool;
		}
	}

	public static int method9716() {
		return aTwitchTV7698.GetChatState();
	}

	public static int method9717() {
		return aTwitchTV7698.GetWebcamState();
	}

	public static int method9718(String string) {
		return aTwitchTV7698.ChatSendMessage(string);
	}

	public static int method9719(String string) {
		return aTwitchTV7698.ChatSendMessage(string);
	}

	public static int method9720() {
		return aTwitchTV7698.GetChatState();
	}

	public static int method9721(String string) {
		return aTwitchTV7698.ChatSendMessage(string);
	}

	public static int method9722() {
		return aTwitchTV7698.GetStreamState();
	}

	public static boolean method9723() {
		if (Class498.aString5584.startsWith("win"))
			return true;
		return false;
	}

	public static boolean method9724() {
		if (Class498.aString5584.startsWith("win"))
			return true;
		return false;
	}

	public static int method9725() {
		return (null == aTwitchWebcamDeviceArray7709 ? 0 : aTwitchWebcamDeviceArray7709.length);
	}

	public static void method9726(Class180 class180, long l) {
		if (-748564677 * anInt7681 != 3 && 0 != -748564677 * anInt7681) {
			if (1 == -748564677 * anInt7681) {
				if (aStringArray7685 == null || aStringArray7685.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_8_ = 0; i_8_ < aStringArray7685.length; i_8_++) {
					if (null != aStringArray7685[i_8_]) {
						try {
							i += (Class234.aClass539_2374.method8993(aStringArray7685[i_8_], (byte) -51));
						} catch (Exception_Sub4 exception_sub4) {
							Class637.method10570(Class71.aClass71_783, exception_sub4.aString11364, (exception_sub4.anInt11363 * 1122887509), exception_sub4.getCause(), 770718456);
							anInt7681 = 969840089;
							return;
						}
					} else
						i += 100;
				}
				anInt7703 = -1432363959 * (i / aStringArray7685.length);
				if (anInt7703 * 1114297849 == 100) {
					anInt7681 = Class639_Sub2.method16983(-599656910) * 1754935795;
					if (2 != -748564677 * anInt7681)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = aTwitchTV7698.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (null != twitchevent && Class235.method4353(twitchevent, l)) {
						Class578 class578 = twitchevent.method6561();
						if (class578 != null)
							Class390.method6467(class578.method87(), twitchevent, -1803019800);
					}
				}
			}
			if (aTwitchTV7698.IsStreaming() && (l - aLong7699 * -5842675412488605625L > Class512.aLong7008 * 2633100174167199109L)) {
				aLong7699 = l * 1221725028280924535L;
				if (class180.method3184())
					aBool7696 = true;
			}
			if (aTwitchTV7698.IsStreaming()) {
				if (l - aLong7700 * 4608545456380175315L < (long) (161905497 * anInt7690))
					anInt7702 = 823554538;
				else if (l - aLong7701 * -6495383206257305831L < (long) (161905497 * anInt7690))
					anInt7702 = -1735706379;
				else
					anInt7702 = 0;
			} else
				anInt7702 = 0;
			if (l - aLong7710 * 1418162785997322403L > (long) (1107878885 * anInt7692) && aTwitchTV7698.GetWebcamState() == 5) {
				aTwitchTV7698.RestartWebcamDevice();
				aLong7710 = -7609805716521092341L * l;
			}
		}
	}

	public static void method9727(Class180 class180, long l) {
		if (-748564677 * anInt7681 != 3 && 0 != -748564677 * anInt7681) {
			if (1 == -748564677 * anInt7681) {
				if (aStringArray7685 == null || aStringArray7685.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_9_ = 0; i_9_ < aStringArray7685.length; i_9_++) {
					if (null != aStringArray7685[i_9_]) {
						try {
							i += (Class234.aClass539_2374.method8993(aStringArray7685[i_9_], (byte) -41));
						} catch (Exception_Sub4 exception_sub4) {
							Class637.method10570(Class71.aClass71_783, exception_sub4.aString11364, (exception_sub4.anInt11363 * 1122887509), exception_sub4.getCause(), -1776514344);
							anInt7681 = 969840089;
							return;
						}
					} else
						i += 100;
				}
				anInt7703 = -1432363959 * (i / aStringArray7685.length);
				if (anInt7703 * 1114297849 == 100) {
					anInt7681 = Class639_Sub2.method16983(1571236956) * 1754935795;
					if (2 != -748564677 * anInt7681)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = aTwitchTV7698.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (null != twitchevent && Class235.method4353(twitchevent, l)) {
						Class578 class578 = twitchevent.method6561();
						if (class578 != null)
							Class390.method6467(class578.method87(), twitchevent, 2019090945);
					}
				}
			}
			if (aTwitchTV7698.IsStreaming() && (l - aLong7699 * -5842675412488605625L > Class512.aLong7008 * 2633100174167199109L)) {
				aLong7699 = l * 1221725028280924535L;
				if (class180.method3184())
					aBool7696 = true;
			}
			if (aTwitchTV7698.IsStreaming()) {
				if (l - aLong7700 * 4608545456380175315L < (long) (161905497 * anInt7690))
					anInt7702 = 823554538;
				else if (l - aLong7701 * -6495383206257305831L < (long) (161905497 * anInt7690))
					anInt7702 = -1735706379;
				else
					anInt7702 = 0;
			} else
				anInt7702 = 0;
			if (l - aLong7710 * 1418162785997322403L > (long) (1107878885 * anInt7692) && aTwitchTV7698.GetWebcamState() == 5) {
				aTwitchTV7698.RestartWebcamDevice();
				aLong7710 = -7609805716521092341L * l;
			}
		}
	}

	public static void method9728(Class180 class180, long l) {
		if (-748564677 * anInt7681 != 3 && 0 != -748564677 * anInt7681) {
			if (1 == -748564677 * anInt7681) {
				if (aStringArray7685 == null || aStringArray7685.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_10_ = 0; i_10_ < aStringArray7685.length; i_10_++) {
					if (null != aStringArray7685[i_10_]) {
						try {
							i += (Class234.aClass539_2374.method8993(aStringArray7685[i_10_], (byte) -90));
						} catch (Exception_Sub4 exception_sub4) {
							Class637.method10570(Class71.aClass71_783, exception_sub4.aString11364, (exception_sub4.anInt11363 * 1122887509), exception_sub4.getCause(), 1048665676);
							anInt7681 = 969840089;
							return;
						}
					} else
						i += 100;
				}
				anInt7703 = -1432363959 * (i / aStringArray7685.length);
				if (anInt7703 * 1114297849 == 100) {
					anInt7681 = Class639_Sub2.method16983(2032084556) * 1754935795;
					if (2 != -748564677 * anInt7681)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = aTwitchTV7698.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (null != twitchevent && Class235.method4353(twitchevent, l)) {
						Class578 class578 = twitchevent.method6561();
						if (class578 != null)
							Class390.method6467(class578.method87(), twitchevent, 299980178);
					}
				}
			}
			if (aTwitchTV7698.IsStreaming() && (l - aLong7699 * -5842675412488605625L > Class512.aLong7008 * 2633100174167199109L)) {
				aLong7699 = l * 1221725028280924535L;
				if (class180.method3184())
					aBool7696 = true;
			}
			if (aTwitchTV7698.IsStreaming()) {
				if (l - aLong7700 * 4608545456380175315L < (long) (161905497 * anInt7690))
					anInt7702 = 823554538;
				else if (l - aLong7701 * -6495383206257305831L < (long) (161905497 * anInt7690))
					anInt7702 = -1735706379;
				else
					anInt7702 = 0;
			} else
				anInt7702 = 0;
			if (l - aLong7710 * 1418162785997322403L > (long) (1107878885 * anInt7692) && aTwitchTV7698.GetWebcamState() == 5) {
				aTwitchTV7698.RestartWebcamDevice();
				aLong7710 = -7609805716521092341L * l;
			}
		}
	}

	public static int method9729() {
		return aTwitchTV7698.GetViewerCount();
	}

	public static int method9730() {
		return (null == aTwitchWebcamDeviceArray7709 ? 0 : aTwitchWebcamDeviceArray7709.length);
	}

	public static void method9731(Class180 class180, long l, int i, int i_11_) {
		do {
			if (class180.method3469() && class180.method3119() > -1) {
				int i_12_ = class180.method3119();
				Class571 class571 = null;
				if (!aLinkedList7707.isEmpty())
					class571 = (Class571) aLinkedList7707.getFirst();
				if (class571 == null || i_12_ != -678765547 * class571.anInt7623) {
					class180.method3120();
					aLinkedList7707.clear();
				} else {
					aLinkedList7707.removeFirst();
					class180.method3242();
					boolean bool = false;
					int i_13_;
					if (class571.aLinkedList7624.isEmpty() && class180.method3084()) {
						long l_14_ = class180.method3117(-127594503 * (Class700_Sub20.anInt10872), (Class174_Sub1.anInt9112 * -909192181));
						i_13_ = aTwitchTV7698.SubmitFrame(l_14_, class180.method3118(), aBool7704, i, i_11_);
						class180.method3123(l_14_);
					} else {
						class180.method3266((Class700_Sub20.anInt10872 * -127594503), (Class174_Sub1.anInt9112 * -909192181), Class172.anIntArray1883, Class398.anIntArray4124);
						Class289.method5221(Class172.anIntArray1883, class571.aLinkedList7624, class571.anInt7620 * -1399577493, 1772060341 * class571.anInt7621, class571.aFloat7622, 815571107);
						i_13_ = aTwitchTV7698.SubmitFrameRaw((Class172.anIntArray1883), aBool7704, i, i_11_);
					}
					class180.method3167();
					if (i_13_ == 2072)
						aLong7700 = 8999503276147174491L * l;
					else if (23 == i_13_)
						aLong7701 = -5423139962974464727L * l;
					else if (i_13_ == -995 || i_13_ != 0)
						break;
				}
			}
		} while (false);
		if (aBool7696) {
			if (Class172.anIntArray1883 == null) {
				Class172.anIntArray1883 = new int[(aBool7704 ? i * i_11_ : (-127594503 * Class700_Sub20.anInt10872 * (-909192181 * Class174_Sub1.anInt9112)))];
				Class398.anIntArray4124 = new int[(aBool7704 ? i * i_11_ : (-127594503 * Class700_Sub20.anInt10872 * (Class174_Sub1.anInt9112 * -909192181)))];
			}
			if (!class180.method3469()) {
				class180.method3242();
				class180.method3266(Class700_Sub20.anInt10872 * -127594503, -909192181 * Class174_Sub1.anInt9112, Class172.anIntArray1883, Class398.anIntArray4124);
				Class289.method5221(Class172.anIntArray1883, aLinkedList7706, class180.anInt2083 * -1964562579, 960890533 * class180.anInt2068, class180.aFloat2090, -122230855);
				int i_15_ = aTwitchTV7698.SubmitFrameRaw(Class172.anIntArray1883, aBool7704, i, i_11_);
				class180.method3167();
				aLinkedList7706.clear();
				do {
					if (i_15_ == 2072)
						aLong7700 = l * 8999503276147174491L;
					else if (23 == i_15_)
						aLong7701 = -5423139962974464727L * l;
					else if (-995 == i_15_ || 0 != i_15_)
						break;
				} while (false);
			} else {
				class180.method3121(client.anInt11019, -127594503 * Class700_Sub20.anInt10872, Class174_Sub1.anInt9112 * -909192181);
				aLinkedList7707.add(new Class571(client.anInt11019, aLinkedList7706, (class180.anInt2083 * -1964562579), (960890533 * class180.anInt2068), class180.aFloat2090));
				aLinkedList7706 = new LinkedList();
			}
			aBool7696 = false;
		}
	}

	public static void method9732(Class180 class180, long l, int i, int i_16_) {
		do {
			if (class180.method3469() && class180.method3119() > -1) {
				int i_17_ = class180.method3119();
				Class571 class571 = null;
				if (!aLinkedList7707.isEmpty())
					class571 = (Class571) aLinkedList7707.getFirst();
				if (class571 == null || i_17_ != -678765547 * class571.anInt7623) {
					class180.method3120();
					aLinkedList7707.clear();
				} else {
					aLinkedList7707.removeFirst();
					class180.method3242();
					boolean bool = false;
					int i_18_;
					if (class571.aLinkedList7624.isEmpty() && class180.method3084()) {
						long l_19_ = class180.method3117(-127594503 * (Class700_Sub20.anInt10872), (Class174_Sub1.anInt9112 * -909192181));
						i_18_ = aTwitchTV7698.SubmitFrame(l_19_, class180.method3118(), aBool7704, i, i_16_);
						class180.method3123(l_19_);
					} else {
						class180.method3266((Class700_Sub20.anInt10872 * -127594503), (Class174_Sub1.anInt9112 * -909192181), Class172.anIntArray1883, Class398.anIntArray4124);
						Class289.method5221(Class172.anIntArray1883, class571.aLinkedList7624, class571.anInt7620 * -1399577493, 1772060341 * class571.anInt7621, class571.aFloat7622, 1023983655);
						i_18_ = aTwitchTV7698.SubmitFrameRaw((Class172.anIntArray1883), aBool7704, i, i_16_);
					}
					class180.method3167();
					if (i_18_ == 2072)
						aLong7700 = 8999503276147174491L * l;
					else if (23 == i_18_)
						aLong7701 = -5423139962974464727L * l;
					else if (i_18_ == -995 || i_18_ != 0)
						break;
				}
			}
		} while (false);
		if (aBool7696) {
			if (Class172.anIntArray1883 == null) {
				Class172.anIntArray1883 = new int[(aBool7704 ? i * i_16_ : (-127594503 * Class700_Sub20.anInt10872 * (-909192181 * Class174_Sub1.anInt9112)))];
				Class398.anIntArray4124 = new int[(aBool7704 ? i * i_16_ : (-127594503 * Class700_Sub20.anInt10872 * (Class174_Sub1.anInt9112 * -909192181)))];
			}
			if (!class180.method3469()) {
				class180.method3242();
				class180.method3266(Class700_Sub20.anInt10872 * -127594503, -909192181 * Class174_Sub1.anInt9112, Class172.anIntArray1883, Class398.anIntArray4124);
				Class289.method5221(Class172.anIntArray1883, aLinkedList7706, class180.anInt2083 * -1964562579, 960890533 * class180.anInt2068, class180.aFloat2090, 300675771);
				int i_20_ = aTwitchTV7698.SubmitFrameRaw(Class172.anIntArray1883, aBool7704, i, i_16_);
				class180.method3167();
				aLinkedList7706.clear();
				do {
					if (i_20_ == 2072)
						aLong7700 = l * 8999503276147174491L;
					else if (23 == i_20_)
						aLong7701 = -5423139962974464727L * l;
					else if (-995 == i_20_ || 0 != i_20_)
						break;
				} while (false);
			} else {
				class180.method3121(client.anInt11019, -127594503 * Class700_Sub20.anInt10872, Class174_Sub1.anInt9112 * -909192181);
				aLinkedList7707.add(new Class571(client.anInt11019, aLinkedList7706, (class180.anInt2083 * -1964562579), (960890533 * class180.anInt2068), class180.aFloat2090));
				aLinkedList7706 = new LinkedList();
			}
			aBool7696 = false;
		}
	}

	public static int method9733(int i, int i_21_, int i_22_, boolean bool) {
		if (i != 0 && (i < 50 || i > 100))
			i = 0;
		if (i_21_ != 0 && (i_21_ < 50 || i_21_ > 100))
			i_21_ = 0;
		boolean bool_23_ = Class498.aString5584.startsWith("mac");
		int[] is = aTwitchTV7698.GetRecommendedSettings((-1803844265 * Class289.anInt3223), (-471480167 * Class611.anInt8009), i, 2000, i_22_, aFloat7697, bool_23_);
		if (is[0] != 0)
			return is[0];
		int i_24_ = is[1];
		int i_25_ = is[2];
		int i_26_ = is[3];
		int i_27_ = i_26_;
		aLong7699 = 0L;
		Class512.aLong7008 = (long) (1000.0F / (float) i_22_) * 1015595126069699405L;
		Class700_Sub20.anInt10872 = 170033737 * i_24_;
		Class174_Sub1.anInt9112 = i_25_ * 1543903139;
		if (0 != i_21_)
			i_26_ = i_21_ * i_26_ / 100;
		Class493.method7997(new StringBuilder().append("Stream - Input: ").append(-1803844265 * Class289.anInt3223).append("x").append(-471480167 * Class611.anInt8009).append(" (").append(i_27_).append("kbps)").append(" => ").append("Output: ").append(i_24_).append("x").append(i_25_).append(" [").append(i == 0 ? "auto" : new StringBuilder().append(i).append("%").toString()).append("] (").append(i_26_).append("kbps [")
				.append(i_21_ == 0 ? "auto" : new StringBuilder().append(i_21_).append("%").toString()).append("])").toString(), (byte) 8);
		return aTwitchTV7698.StartStreaming(i_24_, i_25_, i_22_, i_26_, 0 != i_21_, aFloat7697, -1855177309 * anInt7680, bool);
	}

	public static int method9734(String string) {
		return aTwitchTV7698.ChatSendMessage(string);
	}

	public static boolean method9735() {
		return aBool7696;
	}

	public static boolean method9736() {
		return null != aTwitchTV7698 && aTwitchTV7698.IsStreaming();
	}

	static void method9737(int[] is, LinkedList linkedlist, int i, int i_28_, float f) {
		if (!linkedlist.isEmpty()) {
			for (int i_29_ = 0; i_29_ < linkedlist.size(); i_29_++) {
				Class568 class568 = (Class568) linkedlist.get(i_29_);
				int i_30_ = i + (int) ((float) (class568.anInt7611 * 2105301417) * f);
				int i_31_ = i_28_ + (int) (f * (float) (691962005 * class568.anInt7612));
				int i_32_ = (int) (f * (float) (302324901 * class568.anInt7610));
				int i_33_ = (int) (f * (float) (-997086075 * class568.anInt7613));
				if (i_30_ < -127594503 * Class700_Sub20.anInt10872 && i_31_ < -909192181 * Class174_Sub1.anInt9112) {
					if (i_30_ + i_32_ > Class700_Sub20.anInt10872 * -127594503)
						i_32_ = Class700_Sub20.anInt10872 * -127594503 - i_30_;
					if (i_31_ + i_33_ > -909192181 * Class174_Sub1.anInt9112)
						i_33_ = Class174_Sub1.anInt9112 * -909192181 - i_31_;
					for (int i_34_ = i_31_; i_34_ < i_31_ + i_33_; i_34_++) {
						int i_35_ = i_30_ + i_34_ * (Class700_Sub20.anInt10872 * -127594503);
						Arrays.fill(is, i_35_, i_35_ + i_32_, -16777216);
					}
				}
			}
		}
	}

	public static void method9738(Class180 class180, long l) {
		class180.method3126();
		aLinkedList7706.clear();
		aLinkedList7707.clear();
		aLong7699 = (l + (long) (anInt7683 * 1254703743)) * 1221725028280924535L;
	}

	static void method9739() {
		aBool7696 = false;
		Class172.anIntArray1883 = null;
		Class398.anIntArray4124 = null;
		aLinkedList7706.clear();
		aLinkedList7707.clear();
		Class402.aClass180_4150.method3126();
	}

	public static int method9740() {
		return aTwitchTV7698.GetStreamState();
	}

	public static void method9741() {
		aClass147_7688 = null;
	}

	public static void method9742() {
		aClass147_7688 = null;
	}

	public static int method9743(String string) {
		return aTwitchTV7698.SetStreamTitle(string, client.aClass678_11259.aString8618);
	}

	public static void method9744() {
		aClass147_7688 = null;
	}

	public static void method9745() {
		anInt7708 = 640177411;
	}

	public static int method9746(int i, int i_36_) {
		aTwitchWebcamFrameData7705 = new TwitchWebcamFrameData();
		if (i < 0 || i >= aTwitchWebcamDeviceArray7709.length)
			return -1;
		return aTwitchTV7698.StartWebcamDevice((aTwitchWebcamDeviceArray7709[i].anInt1121) * 939179397, i_36_);
	}

	public static int method9747(int i, int i_37_) {
		aTwitchWebcamFrameData7705 = new TwitchWebcamFrameData();
		if (i < 0 || i >= aTwitchWebcamDeviceArray7709.length)
			return -1;
		return aTwitchTV7698.StartWebcamDevice((aTwitchWebcamDeviceArray7709[i].anInt1121) * 939179397, i_37_);
	}

	public static int method9748(int i) {
		aTwitchWebcamFrameData7705 = null;
		aClass147_7688 = null;
		if (i < 0 || i >= aTwitchWebcamDeviceArray7709.length)
			return -1;
		return aTwitchTV7698.StopWebcamDevice(939179397 * (aTwitchWebcamDeviceArray7709[i].anInt1121));
	}

	static void method9749() {
		aTwitchWebcamDeviceArray7709 = aTwitchTV7698.GetWebcamDevices();
	}

	public static TwitchWebcamDevice method9750(String string) {
		if (aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i = 0; i < aTwitchWebcamDeviceArray7709.length; i++) {
			if (aTwitchWebcamDeviceArray7709[i].aString1118.equals(string))
				return aTwitchWebcamDeviceArray7709[i];
		}
		return null;
	}

	public static int method9751() {
		if (!Class274.method5129(1809292228))
			return 0;
		return anInt7702 * -23743651;
	}

	public static TwitchWebcamDevice method9752(int i) {
		if (aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i_38_ = 0; i_38_ < aTwitchWebcamDeviceArray7709.length; i_38_++) {
			if (i == aTwitchWebcamDeviceArray7709[i_38_].anInt1120 * 1028486927)
				return aTwitchWebcamDeviceArray7709[i_38_];
		}
		return null;
	}

	public static TwitchWebcamDevice method9753(int i) {
		if (aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i_39_ = 0; i_39_ < aTwitchWebcamDeviceArray7709.length; i_39_++) {
			if (i == aTwitchWebcamDeviceArray7709[i_39_].anInt1120 * 1028486927)
				return aTwitchWebcamDeviceArray7709[i_39_];
		}
		return null;
	}

	public static TwitchWebcamDevice method9754(int i) {
		if (aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i_40_ = 0; i_40_ < aTwitchWebcamDeviceArray7709.length; i_40_++) {
			if (i == aTwitchWebcamDeviceArray7709[i_40_].anInt1120 * 1028486927)
				return aTwitchWebcamDeviceArray7709[i_40_];
		}
		return null;
	}

	public static void method9755() {
		aClass147_7688 = null;
	}

	public static TwitchWebcamDevice method9756(String string) {
		if (aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i = 0; i < aTwitchWebcamDeviceArray7709.length; i++) {
			if (aTwitchWebcamDeviceArray7709[i].aString1118.equals(string))
				return aTwitchWebcamDeviceArray7709[i];
		}
		return null;
	}

	public static TwitchWebcamDevice method9757(String string) {
		if (aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i = 0; i < aTwitchWebcamDeviceArray7709.length; i++) {
			if (aTwitchWebcamDeviceArray7709[i].aString1118.equals(string))
				return aTwitchWebcamDeviceArray7709[i];
		}
		return null;
	}

	public static int method9758() {
		Class597.aTwitchEventLiveStreams7849 = null;
		int i = aTwitchTV7698.RequestLiveStreams(client.aClass678_11259.aString8618);
		return i;
	}

	public static int method9759() {
		Class597.aTwitchEventLiveStreams7849 = null;
		int i = aTwitchTV7698.RequestLiveStreams(client.aClass678_11259.aString8618);
		return i;
	}

	public static void method9760(Class180 class180, long l, int i, int i_41_) {
		do {
			if (class180.method3469() && class180.method3119() > -1) {
				int i_42_ = class180.method3119();
				Class571 class571 = null;
				if (!aLinkedList7707.isEmpty())
					class571 = (Class571) aLinkedList7707.getFirst();
				if (class571 == null || i_42_ != -678765547 * class571.anInt7623) {
					class180.method3120();
					aLinkedList7707.clear();
				} else {
					aLinkedList7707.removeFirst();
					class180.method3242();
					boolean bool = false;
					int i_43_;
					if (class571.aLinkedList7624.isEmpty() && class180.method3084()) {
						long l_44_ = class180.method3117(-127594503 * (Class700_Sub20.anInt10872), (Class174_Sub1.anInt9112 * -909192181));
						i_43_ = aTwitchTV7698.SubmitFrame(l_44_, class180.method3118(), aBool7704, i, i_41_);
						class180.method3123(l_44_);
					} else {
						class180.method3266((Class700_Sub20.anInt10872 * -127594503), (Class174_Sub1.anInt9112 * -909192181), Class172.anIntArray1883, Class398.anIntArray4124);
						Class289.method5221(Class172.anIntArray1883, class571.aLinkedList7624, class571.anInt7620 * -1399577493, 1772060341 * class571.anInt7621, class571.aFloat7622, 1016859121);
						i_43_ = aTwitchTV7698.SubmitFrameRaw((Class172.anIntArray1883), aBool7704, i, i_41_);
					}
					class180.method3167();
					if (i_43_ == 2072)
						aLong7700 = 8999503276147174491L * l;
					else if (23 == i_43_)
						aLong7701 = -5423139962974464727L * l;
					else if (i_43_ == -995 || i_43_ != 0)
						break;
				}
			}
		} while (false);
		if (aBool7696) {
			if (Class172.anIntArray1883 == null) {
				Class172.anIntArray1883 = new int[(aBool7704 ? i * i_41_ : (-127594503 * Class700_Sub20.anInt10872 * (-909192181 * Class174_Sub1.anInt9112)))];
				Class398.anIntArray4124 = new int[(aBool7704 ? i * i_41_ : (-127594503 * Class700_Sub20.anInt10872 * (Class174_Sub1.anInt9112 * -909192181)))];
			}
			if (!class180.method3469()) {
				class180.method3242();
				class180.method3266(Class700_Sub20.anInt10872 * -127594503, -909192181 * Class174_Sub1.anInt9112, Class172.anIntArray1883, Class398.anIntArray4124);
				Class289.method5221(Class172.anIntArray1883, aLinkedList7706, class180.anInt2083 * -1964562579, 960890533 * class180.anInt2068, class180.aFloat2090, 136345471);
				int i_45_ = aTwitchTV7698.SubmitFrameRaw(Class172.anIntArray1883, aBool7704, i, i_41_);
				class180.method3167();
				aLinkedList7706.clear();
				do {
					if (i_45_ == 2072)
						aLong7700 = l * 8999503276147174491L;
					else if (23 == i_45_)
						aLong7701 = -5423139962974464727L * l;
					else if (-995 == i_45_ || 0 != i_45_)
						break;
				} while (false);
			} else {
				class180.method3121(client.anInt11019, -127594503 * Class700_Sub20.anInt10872, Class174_Sub1.anInt9112 * -909192181);
				aLinkedList7707.add(new Class571(client.anInt11019, aLinkedList7706, (class180.anInt2083 * -1964562579), (960890533 * class180.anInt2068), class180.aFloat2090));
				aLinkedList7706 = new LinkedList();
			}
			aBool7696 = false;
		}
	}

	public static int method9761() {
		return aTwitchTV7698.GetViewerCount();
	}

	public static int method9762() {
		return aTwitchTV7698.GetViewerCount();
	}

	public static void method9763(int i, int i_46_, int i_47_, int i_48_) {
		aLinkedList7706.addLast(new Class568(i, i_46_, i_47_ - i, i_48_ - i_46_));
	}

	public static int method9764(int i, int i_49_, int i_50_, boolean bool) {
		if (i != 0 && (i < 50 || i > 100))
			i = 0;
		if (i_49_ != 0 && (i_49_ < 50 || i_49_ > 100))
			i_49_ = 0;
		boolean bool_51_ = Class498.aString5584.startsWith("mac");
		int[] is = aTwitchTV7698.GetRecommendedSettings((-1803844265 * Class289.anInt3223), (-471480167 * Class611.anInt8009), i, 2000, i_50_, aFloat7697, bool_51_);
		if (is[0] != 0)
			return is[0];
		int i_52_ = is[1];
		int i_53_ = is[2];
		int i_54_ = is[3];
		int i_55_ = i_54_;
		aLong7699 = 0L;
		Class512.aLong7008 = (long) (1000.0F / (float) i_50_) * 1015595126069699405L;
		Class700_Sub20.anInt10872 = 170033737 * i_52_;
		Class174_Sub1.anInt9112 = i_53_ * 1543903139;
		if (0 != i_49_)
			i_54_ = i_49_ * i_54_ / 100;
		Class493.method7997(new StringBuilder().append("Stream - Input: ").append(-1803844265 * Class289.anInt3223).append("x").append(-471480167 * Class611.anInt8009).append(" (").append(i_55_).append("kbps)").append(" => ").append("Output: ").append(i_52_).append("x").append(i_53_).append(" [").append(i == 0 ? "auto" : new StringBuilder().append(i).append("%").toString()).append("] (").append(i_54_).append("kbps [")
				.append(i_49_ == 0 ? "auto" : new StringBuilder().append(i_49_).append("%").toString()).append("])").toString(), (byte) 8);
		return aTwitchTV7698.StartStreaming(i_52_, i_53_, i_50_, i_54_, 0 != i_49_, aFloat7697, -1855177309 * anInt7680, bool);
	}

	public static void method9765(int i, int i_56_, int i_57_, int i_58_) {
		aLinkedList7706.addLast(new Class568(i, i_56_, i_57_ - i, i_58_ - i_56_));
	}

	static void method9766(int[] is, LinkedList linkedlist, int i, int i_59_, float f) {
		if (!linkedlist.isEmpty()) {
			for (int i_60_ = 0; i_60_ < linkedlist.size(); i_60_++) {
				Class568 class568 = (Class568) linkedlist.get(i_60_);
				int i_61_ = i + (int) ((float) (class568.anInt7611 * 2105301417) * f);
				int i_62_ = i_59_ + (int) (f * (float) (691962005 * class568.anInt7612));
				int i_63_ = (int) (f * (float) (302324901 * class568.anInt7610));
				int i_64_ = (int) (f * (float) (-997086075 * class568.anInt7613));
				if (i_61_ < -127594503 * Class700_Sub20.anInt10872 && i_62_ < -909192181 * Class174_Sub1.anInt9112) {
					if (i_61_ + i_63_ > Class700_Sub20.anInt10872 * -127594503)
						i_63_ = Class700_Sub20.anInt10872 * -127594503 - i_61_;
					if (i_62_ + i_64_ > -909192181 * Class174_Sub1.anInt9112)
						i_64_ = Class174_Sub1.anInt9112 * -909192181 - i_62_;
					for (int i_65_ = i_62_; i_65_ < i_62_ + i_64_; i_65_++) {
						int i_66_ = i_61_ + i_65_ * (Class700_Sub20.anInt10872 * -127594503);
						Arrays.fill(is, i_66_, i_66_ + i_63_, -16777216);
					}
				}
			}
		}
	}

	static void method9767(int[] is, LinkedList linkedlist, int i, int i_67_, float f) {
		if (!linkedlist.isEmpty()) {
			for (int i_68_ = 0; i_68_ < linkedlist.size(); i_68_++) {
				Class568 class568 = (Class568) linkedlist.get(i_68_);
				int i_69_ = i + (int) ((float) (class568.anInt7611 * 2105301417) * f);
				int i_70_ = i_67_ + (int) (f * (float) (691962005 * class568.anInt7612));
				int i_71_ = (int) (f * (float) (302324901 * class568.anInt7610));
				int i_72_ = (int) (f * (float) (-997086075 * class568.anInt7613));
				if (i_69_ < -127594503 * Class700_Sub20.anInt10872 && i_70_ < -909192181 * Class174_Sub1.anInt9112) {
					if (i_69_ + i_71_ > Class700_Sub20.anInt10872 * -127594503)
						i_71_ = Class700_Sub20.anInt10872 * -127594503 - i_69_;
					if (i_70_ + i_72_ > -909192181 * Class174_Sub1.anInt9112)
						i_72_ = Class174_Sub1.anInt9112 * -909192181 - i_70_;
					for (int i_73_ = i_70_; i_73_ < i_70_ + i_72_; i_73_++) {
						int i_74_ = i_69_ + i_73_ * (Class700_Sub20.anInt10872 * -127594503);
						Arrays.fill(is, i_74_, i_74_ + i_71_, -16777216);
					}
				}
			}
		}
	}

	public static int method9768() {
		if (!aBool7693)
			return 12;
		Class208_Sub11.method15616(Class402.aClass180_4150, 1643737624);
		return aTwitchTV7698.Logout();
	}

	public static boolean method9769() {
		if (Class498.aString5584.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_75_ = "msvcp110.dll";
			String[] strings = { string, string_75_ };
			String string_76_ = System.getenv("WINDIR");
			if (string_76_ == "")
				return false;
			for (int i = 0; i < strings.length; i++) {
				File file = new File(new StringBuilder().append(string_76_).append("\\system32\\").append(strings[i]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class498.aString5584.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_77_;
					try {
						int i = process.waitFor();
						if (0 == i)
							break;
						bool_77_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_77_;
				} while (false);
				boolean bool_78_ = false;
				while_25_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_25_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_78_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_78_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	public static boolean method9770() {
		if (Class498.aString5584.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_79_ = "msvcp110.dll";
			String[] strings = { string, string_79_ };
			String string_80_ = System.getenv("WINDIR");
			if (string_80_ == "")
				return false;
			for (int i = 0; i < strings.length; i++) {
				File file = new File(new StringBuilder().append(string_80_).append("\\system32\\").append(strings[i]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class498.aString5584.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_81_;
					try {
						int i = process.waitFor();
						if (0 == i)
							break;
						bool_81_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_81_;
				} while (false);
				boolean bool_82_ = false;
				while_26_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_26_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_82_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_82_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	public static boolean method9771() {
		if (Class498.aString5584.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_83_ = "msvcp110.dll";
			String[] strings = { string, string_83_ };
			String string_84_ = System.getenv("WINDIR");
			if (string_84_ == "")
				return false;
			for (int i = 0; i < strings.length; i++) {
				File file = new File(new StringBuilder().append(string_84_).append("\\system32\\").append(strings[i]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class498.aString5584.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_85_;
					try {
						int i = process.waitFor();
						if (0 == i)
							break;
						bool_85_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_85_;
				} while (false);
				boolean bool_86_ = false;
				while_27_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_27_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_86_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_86_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	static final void method9772(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1521042319 * class243.anInt2549;
	}

	public static final void method9773(int i) {
		if (!client.aBool11116) {
			client.aFloat11156 += (-24.0F - client.aFloat11156) / 2.0F;
			client.aBool11119 = true;
			client.aBool11116 = true;
		}
	}
}

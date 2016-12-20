/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;

public class Class235 implements Interface27 {
	int anInt2376;
	int anInt2377;
	Class214 this$0;
	static Class192 aClass192_2378;

	public void method151(Class219 class219) {
		class219.method3999(-949986685 * anInt2377, anInt2376 * -1294223379, (byte) 75);
		class219.method3992(-949986685 * anInt2377, -763204214).method3942(-1916819785);
	}

	public void method150(Class219 class219, int i) {
		class219.method3999(-949986685 * anInt2377, anInt2376 * -1294223379, (byte) 87);
		class219.method3992(-949986685 * anInt2377, 435446440).method3942(-1557257592);
	}

	Class235(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2377 = class527_sub38.readUnsignedShort() * 121783339;
		anInt2376 = class527_sub38.readUnsignedShort() * 1795505637;
	}

	static Class306 method4352(int i, int i_0_) {
		if (i == Class306.aClass306_3440.anInt3442 * -355773215)
			return Class306.aClass306_3440;
		if (-355773215 * Class306.aClass306_3441.anInt3442 == i)
			return Class306.aClass306_3441;
		return null;
	}

	static boolean method4353(TwitchEvent twitchevent, long l) {
		if (!Class585.aBool7714) {
			switch (twitchevent.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}
		if (33 == twitchevent.eventType) {
			if (null == Class585.aTwitchWebcamFrameData7705)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_1_ = (Class585.aTwitchTV7698.GetWebcamFrameData(i, Class585.aTwitchWebcamFrameData7705));
			if (0 == i_1_) {
				if (Class585.aBool7712)
					Class585.aTwitchWebcamFrameData7705.method14418();
				if (Class585.aBool7711)
					Class585.aTwitchWebcamFrameData7705.method14419();
				Class524.method8718((byte) 8);
				Class585.aLong7710 = -7609805716521092341L * l;
				Class265.method5033(33, 0, 1682325038);
			} else
				Class585.aClass147_7688 = null;
			return false;
		}
		if (30 == twitchevent.eventType) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (0 == i || i == 1)
				Class373.method6375(511901753);
			else if (2 == i)
				Class585.aLong7710 = l * -7609805716521092341L;
		}
		if (twitchevent.eventType == 34) {
			Class597.aTwitchEventLiveStreams7849 = (TwitchEventLiveStreams) twitchevent;
			Class265.method5033(34, 0, 949173440);
		}
		return true;
	}

	static final void method4354(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, -274958322);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class208_Sub22.method15641(class243, class240, class665, -231193519);
	}

	static final long method4355(int i) {
		return (((long) ((Class666.anInt8561 += -2023242087) * -1587728983 - 1) << 32) | 0xffffffffL);
	}

	static final void method4356(Class243 class243, Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_4_ = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) - 1);
		int i_5_ = i_4_;
		if (-1260029751 * class243.anInt2541 != 6 && 2 != class243.anInt2541 * -1260029751)
			throw new RuntimeException("");
		Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(class243.anInt2542 * 1538136819, 1401667353));
		if (class243.aClass308_2513 == null)
			class243.aClass308_2513 = new Class308(class295, -1260029751 * class243.anInt2541 == 6);
		class243.aClass308_2513.aLong3450 = method4355(732560359) * -1114685536257316839L;
		if (class295.aByteArray3280 != null) {
			if (i_4_ < 0 || i_4_ >= class295.aByteArray3280.length)
				throw new RuntimeException("");
			i_5_ = class295.aByteArray3280[i_4_];
		}
		if (class295.aShortArray3289 == null || i_5_ < 0 || i_5_ >= class295.aShortArray3289.length)
			throw new RuntimeException("");
		class243.aClass308_2513.aShortArray3453[i_5_] = (short) i_3_;
		Class430.method6876(class243, (byte) 64);
	}

	public static Class383 method4357(RSByteBuffer class527_sub38, byte i) {
		int i_6_ = class527_sub38.method16466(-2072482993);
		Class400 class400 = (Class183.method3556(-582382281)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_7_ = class527_sub38.readShort();
		int i_8_ = class527_sub38.readShort();
		return new Class383(i_6_, class400, class384, i_7_, i_8_);
	}

	static final void method4358(Class665 class665, byte i) {
		class665.anInt8526 -= 102380841;
		int i_9_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class553.method9194(i_9_, -574052240);
	}
}

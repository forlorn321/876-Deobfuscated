/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class252 {
	static Map aMap2741;
	public static final long aLong2742 = 60000L;
	static HashMap aHashMap2743 = new HashMap();
	public static final long aLong2744 = 1000L;
	static Class461 aClass461_2745;
	public static int anInt2746;

	static TimeZone method3515(int i) {
		return method3518("Europe/London", -1627402089);
	}

	Class252() throws Throwable {
		throw new Error();
	}

	static String method3516(Date date, String string, TimeZone timezone, Class664 class664, byte i) {
		if (null == aMap2741) {
			aMap2741 = new HashMap(7);
			Class664[] class664s = Class664.method7995((byte) 11);
			for (int i_0_ = 0; i_0_ < class664s.length; i_0_++) {
				Class664 class664_1_ = class664s[i_0_];
				aMap2741.put(class664_1_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap2741.get(class664);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class664.method7991((byte) -55));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_2_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_2_;
	}

	public static String method3517(Date date, String string, byte i) {
		return method3516(date, string, method3515(-235980715), Class664.aClass664_8524, (byte) -99);
	}

	static {
		Calendar.getInstance(method3518("Europe/London", -1817505204));
	}

	static TimeZone method3518(String string, int i) {
		synchronized (aHashMap2743) {
			TimeZone timezone = (TimeZone) aHashMap2743.get(string);
			if (null == timezone) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap2743.put(string, timezone);
			}
			TimeZone timezone_3_ = timezone;
			return timezone_3_;
		}
	}

	static final void method3519(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_4_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_4_ >> 16];
		Class453.method5447(class251, class234, class668, (byte) 24);
	}

	static final void method3520(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class542.method6563(i_5_);
		if (null == class536_sub18_sub14) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1539255617 * class536_sub18_sub14.anInt11769;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1266410161 * class536_sub18_sub14.anInt11771;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub18_sub14.anInt11770 * 615226225;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub18_sub14.anInt11772 * 888731475;
		}
	}

	public static Frame method3521(Class691 class691, int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
		if (i_7_ == 0) {
			Class697[] class697s = Class250.method3461(class691, (byte) 0);
			if (class697s == null)
				return null;
			boolean bool = false;
			for (int i_10_ = 0; i_10_ < class697s.length; i_10_++) {
				if (class697s[i_10_].anInt8744 * -1090373425 == i && class697s[i_10_].anInt8743 * 832859273 == i_6_ && (i_8_ == 0 || i_8_ == -842437639 * class697s[i_10_].anInt8742) && (!bool || 1117205975 * class697s[i_10_].anInt8745 > i_7_)) {
					i_7_ = class697s[i_10_].anInt8745 * 1117205975;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class691.method8193(frame, i, i_6_, i_7_, i_8_, 755264394);
		return frame;
	}

	public static void method3522(short i) {
		if (Class23.aBool227) {
			if (Class23.anInt218 * -885753039 < -805119937 * Class220.lowestWorldId)
				Class23.anInt218 = Class220.lowestWorldId * -2095002001;
			while (Class23.anInt218 * -885753039 < Class593.highestWorldId * 870600939) {
				Class603_Sub1 class603_sub1 = Class324.method4269(-885753039 * Class23.anInt218, 664317011);
				if (null == class603_sub1 || class603_sub1.anInt10558 * 2023817915 != -1)
					Class23.anInt218 += 417922513;
				else {
					if (null == Class23.aClass654_223)
						Class23.aClass654_223 = (client.aClass661_11019.method7973(class603_sub1.worldIp, -1688650340));
					int i_11_ = -1190285297 * Class23.aClass654_223.anInt8493;
					if (-1 == i_11_)
						break;
					class603_sub1.anInt10558 = 1767240307 * i_11_;
					Class23.anInt218 += 417922513;
					Class23.aClass654_223 = null;
				}
			}
		}
	}
}

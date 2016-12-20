/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class253 {
	public static final long aLong2802 = 60000L;
	static HashMap aHashMap2803 = new HashMap();
	public static final long aLong2804 = 1000L;
	static Map aMap2805;

	static TimeZone method4682(byte i) {
		return method4684("Europe/London", -759826171);
	}

	public static String method4683(Date date, String string, byte i) {
		return method4685(date, string, method4682((byte) -94), Class671.aClass671_8572, 1351073595);
	}

	static {
		Calendar.getInstance(method4684("Europe/London", 1563378401));
	}

	static TimeZone method4684(String string, int i) {
		synchronized (aHashMap2803) {
			TimeZone timezone = (TimeZone) aHashMap2803.get(string);
			if (null == timezone) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap2803.put(string, timezone);
			}
			TimeZone timezone_0_ = timezone;
			return timezone_0_;
		}
	}

	static String method4685(Date date, String string, TimeZone timezone, Class671 class671, int i) {
		if (aMap2805 == null) {
			aMap2805 = new HashMap(7);
			Class671[] class671s = Class671.method13769(1699240335);
			for (int i_1_ = 0; i_1_ < class671s.length; i_1_++) {
				Class671 class671_2_ = class671s[i_1_];
				aMap2805.put(class671_2_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap2805.get(class671);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class671.method13768((byte) 12));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_3_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_3_;
	}

	public static String method4686(Date date, String string) {
		return method4685(date, string, method4682((byte) -26), Class671.aClass671_8572, -79975901);
	}

	public static String method4687(Date date, String string) {
		return method4685(date, string, method4682((byte) -60), Class671.aClass671_8572, -1651532249);
	}

	Class253() throws Throwable {
		throw new Error();
	}

	static TimeZone method4688() {
		return method4684("Europe/London", -1308514345);
	}

	static TimeZone method4689() {
		return method4684("Europe/London", -110357196);
	}

	static TimeZone method4690(String string) {
		synchronized (aHashMap2803) {
			TimeZone timezone = (TimeZone) aHashMap2803.get(string);
			if (null == timezone) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap2803.put(string, timezone);
			}
			TimeZone timezone_4_ = timezone;
			return timezone_4_;
		}
	}

	static boolean method4691(int i, byte i_5_) {
		return (i == 44 || i == 45 || 46 == i || 47 == i || 48 == i || 49 == i || 50 == i || i == 51 || 52 == i || i == 53 || 15 == i);
	}

	static void method4692(int i, int i_6_, Class243 class243, Class248 class248, int i_7_, int i_8_, byte i_9_) {
		Class100[] class100s = client.aClass100Array11025;
		for (int i_10_ = 0; i_10_ < class100s.length; i_10_++) {
			Class100 class100 = class100s[i_10_];
			if (class100 != null && -905648307 * class100.anInt1176 != 0 && client.anInt11019 % 20 < 10) {
				if (1 == -905648307 * class100.anInt1176) {
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) (1956653959 * class100.anInt1184))));
					if (class527_sub26 != null) {
						Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
						Class442 class442 = (class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
						int i_11_ = (int) class442.aFloat4918 / 128 - i / 128;
						int i_12_ = (int) class442.aFloat4919 / 128 - i_6_ / 128;
						Class207.method3841(class243, class248, i_7_, i_8_, i_11_, i_12_, 1280661885 * class100.anInt1177, 360000L);
					}
				}
				if (-905648307 * class100.anInt1176 == 2) {
					int i_13_ = 1807651153 * class100.anInt1180 / 128 - i / 128;
					int i_14_ = class100.anInt1178 * -1019199 / 128 - i_6_ / 128;
					long l = (long) (class100.anInt1182 * -1210062429 << 7);
					l *= l;
					Class207.method3841(class243, class248, i_7_, i_8_, i_13_, i_14_, 1280661885 * class100.anInt1177, l);
				}
				if (10 == class100.anInt1176 * -905648307 && class100.anInt1184 * 1956653959 >= 0 && (class100.anInt1184 * 1956653959 < (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161).length)) {
					Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[1956653959 * class100.anInt1184]);
					if (null != class640_sub1_sub2_sub1_sub2) {
						Class442 class442 = (class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
						int i_15_ = (int) class442.aFloat4918 / 128 - i / 128;
						int i_16_ = (int) class442.aFloat4919 / 128 - i_6_ / 128;
						Class207.method3841(class243, class248, i_7_, i_8_, i_15_, i_16_, 1280661885 * class100.anInt1177, 360000L);
					}
				}
			}
		}
	}

	static final void method4693(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method4694(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass346_8532.method6096(((String) (class665.anObjectArray8541[((class665.anInt8528 -= 433009517) * 318492261)])), 162472700);
	}

	public static final void method4695(int i, int i_17_) {
		if (Class627.aClass527_Sub21_8187 != null && (i >= 0 && i < (Class627.aClass527_Sub21_8187.anInt10486 * -1988380647))) {
			Class345 class345 = Class627.aClass527_Sub21_8187.aClass345Array10485[i];
			if (class345.aByte3699 == -1) {
				Class109 class109 = Class203.method3782((byte) -1);
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4479, class109.aClass2_1367, (byte) 19);
				class527_sub15.buffer.writeByte(2 + Class208_Sub18.method15632(class345.aString3697, (byte) 8), -96288820);
				class527_sub15.buffer.writeShort(i, 1404835786);
				class527_sub15.buffer.writeString(class345.aString3697, 2081201986);
				class109.method1969(class527_sub15, (byte) 1);
			}
		}
	}

	static final void method4696(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aBool2653 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1;
		Class430.method6876(class243, (byte) 118);
	}

	static final void method4697(Class665 class665, byte i) {
		int i_18_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class198) Class321.aClass24_Sub10_3551.method81(i_18_, -956651470)).anInt2180) * 1300821331;
	}
}

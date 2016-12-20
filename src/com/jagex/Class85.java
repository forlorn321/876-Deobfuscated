/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class85 {
	static Calendar aCalendar816;
	static String[][] aStringArrayArray817 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" },
			{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
	static Calendar aCalendar818;
	public static Class174 aClass174_819;

	public static String method1582(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class568.method9567(l);
			calendar = aCalendar818;
		} else {
			Class565.method9496(l);
			calendar = aCalendar816;
		}
		int i_0_ = calendar.get(5);
		int i_1_ = calendar.get(2);
		int i_2_ = calendar.get(1);
		int i_3_ = calendar.get(11);
		int i_4_ = calendar.get(12);
		if (i == 3)
			return Class525.method8728(l, i, bool, -252415276);
		return new StringBuilder().append(Integer.toString(i_0_ / 10)).append(i_0_ % 10).append("-").append(aStringArrayArray817[i][i_1_]).append("-").append(i_2_).append(" ").append(i_3_ / 10).append(i_3_ % 10).append(":").append(i_4_ / 10).append(i_4_ % 10).toString();
	}

	static {
		aCalendar816 = Calendar.getInstance();
		aCalendar818 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	public static String method1583(long l, int i) {
		Class565.method9496(l);
		int i_5_ = aCalendar816.get(5);
		int i_6_ = aCalendar816.get(2);
		int i_7_ = aCalendar816.get(1);
		if (3 == i)
			return Class660.method11021(l, i, 878219714);
		return new StringBuilder().append(Integer.toString(i_5_ / 10)).append(i_5_ % 10).append("-").append(aStringArrayArray817[i][i_6_]).append("-").append(i_7_).toString();
	}

	public static String method1584(long l, int i) {
		Class565.method9496(l);
		int i_8_ = aCalendar816.get(5);
		int i_9_ = aCalendar816.get(2);
		int i_10_ = aCalendar816.get(1);
		if (3 == i)
			return Class660.method11021(l, i, 1587503407);
		return new StringBuilder().append(Integer.toString(i_8_ / 10)).append(i_8_ % 10).append("-").append(aStringArrayArray817[i][i_9_]).append("-").append(i_10_).toString();
	}

	public static int method1585(long l) {
		Class565.method9496(l);
		return aCalendar816.get(1);
	}

	static String method1586(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class568.method9567(l);
			calendar = aCalendar818;
		} else {
			Class565.method9496(l);
			calendar = aCalendar816;
		}
		int i_11_ = calendar.get(5);
		int i_12_ = calendar.get(2) + 1;
		int i_13_ = calendar.get(1);
		int i_14_ = calendar.get(11);
		int i_15_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_11_ / 10)).append(i_11_ % 10).append("/").append(i_12_ / 10).append(i_12_ % 10).append("/").append(i_13_ % 100 / 10).append(i_13_ % 10).append(" ").append(i_14_ / 10).append(i_14_ % 10).append(":").append(i_15_ / 10).append(i_15_ % 10).toString();
	}

	static String method1587(long l, int i) {
		Class565.method9496(l);
		int i_16_ = aCalendar816.get(5);
		int i_17_ = aCalendar816.get(2) + 1;
		int i_18_ = aCalendar816.get(1);
		return new StringBuilder().append(Integer.toString(i_16_ / 10)).append(i_16_ % 10).append("/").append(i_17_ / 10).append(i_17_ % 10).append("/").append(i_18_ % 100 / 10).append(i_18_ % 10).toString();
	}

	public static long method1588(int i) {
		return 86400000L * (long) (i + 11745);
	}

	public static int method1589(long l) {
		Class565.method9496(l);
		return aCalendar816.get(1);
	}

	public static String method1590(long l, int i) {
		Class565.method9496(l);
		int i_19_ = aCalendar816.get(11);
		int i_20_ = aCalendar816.get(12);
		int i_21_ = aCalendar816.get(13);
		return new StringBuilder().append(Integer.toString(i_19_ / 10)).append(i_19_ % 10).append(":").append(i_20_ / 10).append(i_20_ % 10).append(":").append(i_21_ / 10).append(i_21_ % 10).toString();
	}

	public static String method1591(long l, int i) {
		Class565.method9496(l);
		int i_22_ = aCalendar816.get(11);
		int i_23_ = aCalendar816.get(12);
		int i_24_ = aCalendar816.get(13);
		return new StringBuilder().append(Integer.toString(i_22_ / 10)).append(i_22_ % 10).append(":").append(i_23_ / 10).append(i_23_ % 10).append(":").append(i_24_ / 10).append(i_24_ % 10).toString();
	}

	public static String method1592(long l, int i) {
		Class565.method9496(l);
		int i_25_ = aCalendar816.get(11);
		int i_26_ = aCalendar816.get(12);
		int i_27_ = aCalendar816.get(13);
		return new StringBuilder().append(Integer.toString(i_25_ / 10)).append(i_25_ % 10).append(":").append(i_26_ / 10).append(i_26_ % 10).append(":").append(i_27_ / 10).append(i_27_ % 10).toString();
	}

	public static int method1593(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	public static int method1594(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	static void method1595(long l) {
		aCalendar818.setTime(new Date(l));
	}

	static void method1596(long l) {
		aCalendar818.setTime(new Date(l));
	}

	static void method1597(long l) {
		aCalendar816.setTime(new Date(l));
	}

	static void method1598(long l) {
		aCalendar816.setTime(new Date(l));
	}

	static void method1599(long l) {
		aCalendar816.setTime(new Date(l));
	}

	public static long method1600(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		aCalendar818.clear();
		aCalendar818.set(i_32_, i_31_, i_30_, i_29_, i_28_, i);
		return aCalendar818.getTime().getTime();
	}

	public static long method1601(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		aCalendar818.clear();
		aCalendar818.set(i_37_, i_36_, i_35_, i_34_, i_33_, i);
		return aCalendar818.getTime().getTime();
	}

	public static long method1602(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		aCalendar818.clear();
		aCalendar818.set(i_42_, i_41_, i_40_, i_39_, i_38_, i);
		return aCalendar818.getTime().getTime();
	}

	public static long method1603(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		aCalendar818.clear();
		aCalendar818.set(i_47_, i_46_, i_45_, i_44_, i_43_, i);
		return aCalendar818.getTime().getTime();
	}

	public static int method1604(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	public static long method1605(int i) {
		return 86400000L * (long) (i + 11745);
	}

	Class85() throws Throwable {
		throw new Error();
	}

	public static int method1606(long l) {
		Class565.method9496(l);
		return aCalendar816.get(1);
	}

	static String method1607(long l, int i) {
		Class565.method9496(l);
		int i_48_ = aCalendar816.get(5);
		int i_49_ = aCalendar816.get(2) + 1;
		int i_50_ = aCalendar816.get(1);
		return new StringBuilder().append(Integer.toString(i_48_ / 10)).append(i_48_ % 10).append("/").append(i_49_ / 10).append(i_49_ % 10).append("/").append(i_50_ % 100 / 10).append(i_50_ % 10).toString();
	}
}

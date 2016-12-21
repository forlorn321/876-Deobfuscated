/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;

public final class Class6 {
	RandomAccessFile aRandomAccessFile114;
	long aLong115;
	long aLong116;

	final void method583(long l) throws IOException {
		aRandomAccessFile114.seek(l);
		aLong116 = l * -6536953642568287603L;
	}

	public final void method584(byte[] is, int i, int i_0_, byte i_1_) throws IOException {
		if ((long) i_0_ + aLong116 * -7099552948210116539L > aLong115 * 8197510276101094105L) {
			aRandomAccessFile114.seek(aLong115 * 8197510276101094105L);
			aRandomAccessFile114.write(1);
			throw new EOFException();
		}
		aRandomAccessFile114.write(is, i, i_0_);
		aLong116 += (long) i_0_ * -6536953642568287603L;
	}

	public final void method585(int i) throws IOException {
		if (aRandomAccessFile114 != null) {
			aRandomAccessFile114.close();
			aRandomAccessFile114 = null;
		}
	}

	public final long method586(int i) throws IOException {
		return aRandomAccessFile114.length();
	}

	public final int method587(byte[] is, int i, int i_2_, int i_3_) throws IOException {
		int i_4_ = aRandomAccessFile114.read(is, i, i_2_);
		if (i_4_ > 0)
			aLong116 += (long) i_4_ * -6536953642568287603L;
		return i_4_;
	}

	public void finalize() throws Throwable {
		if (null != aRandomAccessFile114) {
			System.out.println("");
			method585(-1411037171);
		}
	}

	void method588() throws Throwable {
		if (null != aRandomAccessFile114) {
			System.out.println("");
			method585(-1411037171);
		}
	}

	void method589() throws Throwable {
		if (null != aRandomAccessFile114) {
			System.out.println("");
			method585(-1411037171);
		}
	}

	public final void method590(byte[] is, int i, int i_5_) throws IOException {
		if ((long) i_5_ + aLong116 * -7099552948210116539L > aLong115 * 8197510276101094105L) {
			aRandomAccessFile114.seek(aLong115 * 8197510276101094105L);
			aRandomAccessFile114.write(1);
			throw new EOFException();
		}
		aRandomAccessFile114.write(is, i, i_5_);
		aLong116 += (long) i_5_ * -6536953642568287603L;
	}

	public final void method591() throws IOException {
		if (aRandomAccessFile114 != null) {
			aRandomAccessFile114.close();
			aRandomAccessFile114 = null;
		}
	}

	public Class6(File file, String string, long l) throws IOException {
		if (-1L == l)
			l = 9223372036854775807L;
		if (file.length() > l)
			file.delete();
		aRandomAccessFile114 = new RandomAccessFile(file, string);
		aLong115 = -7779658498458770071L * l;
		aLong116 = 0L;
		int i = aRandomAccessFile114.read();
		if (-1 != i && !string.equals("r")) {
			aRandomAccessFile114.seek(0L);
			aRandomAccessFile114.write(i);
		}
		aRandomAccessFile114.seek(0L);
	}

	public final long method592() throws IOException {
		return aRandomAccessFile114.length();
	}

	static void method593(int i) {
		if (null != Class483.aClass303_5431) {
			Class192.aClass292_2177 = new Class292();
			Class192.aClass292_2177.method3935(Class34_Sub14.aLong10970 * -1422508675219242683L, Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 2046336227), Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 1495148182), -1949228175 * Class483.aClass303_5431.anInt3431, Class483.aClass303_5431, 557818389);
			Class94.aThread1148 = new Thread(Class192.aClass292_2177, "");
			Class94.aThread1148.start();
		}
	}

	public static String method594(long l, int i, boolean bool, int i_6_) {
		Calendar calendar;
		if (bool) {
			Class151.method1853(l);
			calendar = Class81.aCalendar860;
		} else {
			Class164.method1972(l);
			calendar = Class81.aCalendar859;
		}
		int i_7_ = calendar.get(5);
		int i_8_ = calendar.get(2);
		int i_9_ = calendar.get(1);
		int i_10_ = calendar.get(11);
		int i_11_ = calendar.get(12);
		if (3 == i)
			return Class644.method7789(l, i, bool, (byte) 12);
		return new StringBuilder().append(Integer.toString(i_7_ / 10)).append(i_7_ % 10).append("-").append(Class81.aStringArrayArray858[i][i_8_]).append("-").append(i_9_).append(" ").append(i_10_ / 10).append(i_10_ % 10).append(":").append(i_11_ / 10).append(i_11_ % 10).toString();
	}
}

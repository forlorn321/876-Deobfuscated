/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

public class Class525 {
	static Class519 aClass519_7100;
	static final int anInt7101 = 5;
	public static Class610 aClass610_7102;

	static byte[] method8719(InputStream inputstream, int i) throws IOException {
		byte[] is = new byte[5];
		if (inputstream.read(is, 0, 5) != 5)
			throw new IOException("2");
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
		synchronized (aClass519_7100) {
			if (!aClass519_7100.method8641(is, (byte) 57))
				throw new IOException("3");
			aClass519_7100.method8640(inputstream, bytearrayoutputstream, (long) i);
		}
		bytearrayoutputstream.flush();
		return bytearrayoutputstream.toByteArray();
	}

	public static byte[] method8720(RSByteBuffer class527_sub38, int i) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class527_sub38.buffer);
		bytearrayinputstream.skip((long) (class527_sub38.anInt10689 * -441238943));
		return Class227.method4305(bytearrayinputstream, i, (byte) 0);
	}

	Class525() throws Throwable {
		throw new Error();
	}

	public static byte[] method8721(RSByteBuffer class527_sub38, int i) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class527_sub38.buffer);
		bytearrayinputstream.skip((long) (class527_sub38.anInt10689 * -441238943));
		return Class227.method4305(bytearrayinputstream, i, (byte) 0);
	}

	public static byte[] method8722(RSByteBuffer class527_sub38, int i) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class527_sub38.buffer);
		bytearrayinputstream.skip((long) (class527_sub38.anInt10689 * -441238943));
		return Class227.method4305(bytearrayinputstream, i, (byte) 0);
	}

	static {
		new Class537();
		aClass519_7100 = new Class519();
	}

	static final void method8723(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class186.method3651(class243, class240, class665, 1859543809);
	}

	static final void method8724(Class665 class665, int i) {
		class665.anInt8526 -= 511904205;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_2_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2];
		int i_3_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 3];
		int i_4_ = class665.anIntArray8525[4 + class665.anInt8526 * 1769813785];
		if (i_2_ == -1)
			throw new RuntimeException();
		Class57 class57 = ((Class57) Class664.aClass24_Sub15_8519.method81(i_2_, 2010450744));
		if (class57.aClass462_714.method87() != i_1_)
			throw new RuntimeException();
		if (class57.aClass462_718.method87() != i_0_)
			throw new RuntimeException();
		int[] is = class57.method1341(Integer.valueOf(i_3_), (byte) 4);
		if (i_4_ < 0 || is == null || is.length <= i_4_)
			throw new RuntimeException();
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = is[i_4_];
	}

	static char method8725(char c, int i) {
		if ('\u00c6' == c)
			return 'E';
		if ('\u00e6' == c)
			return 'e';
		if (c == '\u00df')
			return 's';
		if (c == '\u0152')
			return 'E';
		if (c == '\u0153')
			return 'e';
		return '\0';
	}

	public static long method8726(CharSequence charsequence, int i) {
		int i_5_ = charsequence.length();
		long l = 0L;
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_6_);
		return l;
	}

	static final void method8727(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1);
		Class296.method5503(class243, class240, class665, (bool ? Class237.aClass237_2385 : Class237.aClass237_2382), (byte) 1);
	}

	static String method8728(long l, int i, boolean bool, int i_7_) {
		Calendar calendar;
		if (bool) {
			Class568.method9567(l);
			calendar = Class85.aCalendar818;
		} else {
			Class565.method9496(l);
			calendar = Class85.aCalendar816;
		}
		int i_8_ = calendar.get(5);
		int i_9_ = calendar.get(2) + 1;
		int i_10_ = calendar.get(1);
		int i_11_ = calendar.get(11);
		int i_12_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_8_ / 10)).append(i_8_ % 10).append("/").append(i_9_ / 10).append(i_9_ % 10).append("/").append(i_10_ % 100 / 10).append(i_10_ % 10).append(" ").append(i_11_ / 10).append(i_11_ % 10).append(":").append(i_12_ / 10).append(i_12_ % 10).toString();
	}
}

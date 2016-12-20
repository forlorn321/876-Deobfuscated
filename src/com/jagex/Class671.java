/* Class671 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Locale;

public class Class671 implements Interface76 {
	String aString8571;
	public static Class671 aClass671_8572 = new Class671("EN", "en", "English", Class677.aClass677_8596, 0, "GB");
	public static Class671 aClass671_8573;
	public static Class671 aClass671_8574;
	static Class671 aClass671_8575;
	String aString8576;
	public static Class671 aClass671_8577;
	public static Class671 aClass671_8578;
	public static final int anInt8579 = 7;
	Locale aLocale8580;
	public int anInt8581;
	public static Class671 aClass671_8582 = new Class671("DE", "de", "German", Class677.aClass677_8596, 1, "DE");
	static Class671[] aClass671Array8583;
	public static Class97 aClass97_8584;

	static {
		aClass671_8573 = new Class671("FR", "fr", "French", Class677.aClass677_8596, 2, "FR");
		aClass671_8574 = new Class671("PT", "pt", "Portuguese", Class677.aClass677_8596, 3, "BR");
		aClass671_8575 = new Class671("NL", "nl", "Dutch", Class677.aClass677_8608, 4, "NL");
		aClass671_8578 = new Class671("ES", "es", "Spanish", Class677.aClass677_8608, 5, "ES");
		aClass671_8577 = new Class671("ES_MX", "es-mx", "Spanish (Latin American)", Class677.aClass677_8596, 6, "MX");
		Class671[] class671s = method13769(-792494533);
		aClass671Array8583 = new Class671[class671s.length];
		Class671[] class671s_0_ = class671s;
		for (int i = 0; i < class671s_0_.length; i++) {
			Class671 class671 = class671s_0_[i];
			if (null != aClass671Array8583[-53745175 * class671.anInt8581])
				throw new IllegalStateException();
			aClass671Array8583[-53745175 * class671.anInt8581] = class671;
		}
	}

	public String method13766() {
		return method13778((short) 19990).toLowerCase(Locale.ENGLISH);
	}

	public static Class671 method13767(int i, byte i_1_) {
		if (i < 0 || i >= aClass671Array8583.length)
			return null;
		return aClass671Array8583[i];
	}

	public int method87() {
		return anInt8581 * -53745175;
	}

	public Locale method13768(byte i) {
		return aLocale8580;
	}

	public int method91() {
		return anInt8581 * -53745175;
	}

	public static Class671[] method13769(int i) {
		return new Class671[] { aClass671_8582, aClass671_8578, aClass671_8575, aClass671_8577, aClass671_8572, aClass671_8573, aClass671_8574 };
	}

	public String toString() {
		return method13778((short) 290).toLowerCase(Locale.ENGLISH);
	}

	public int method42() {
		return anInt8581 * -53745175;
	}

	public Locale method13770() {
		return aLocale8580;
	}

	Class671(String string, String string_2_, String string_3_, Class677 class677, int i, String string_4_) {
		aString8571 = string;
		aString8576 = string_2_;
		anInt8581 = i * 1212382809;
		if (string_4_ != null)
			aLocale8580 = new Locale(string_2_.substring(0, 2), string_4_);
		else
			aLocale8580 = new Locale(string_2_.substring(0, 2));
	}

	public static Class671[] method13771() {
		return new Class671[] { aClass671_8582, aClass671_8578, aClass671_8575, aClass671_8577, aClass671_8572, aClass671_8573, aClass671_8574 };
	}

	public static Class671[] method13772() {
		return new Class671[] { aClass671_8582, aClass671_8578, aClass671_8575, aClass671_8577, aClass671_8572, aClass671_8573, aClass671_8574 };
	}

	public static Class671[] method13773() {
		return new Class671[] { aClass671_8582, aClass671_8578, aClass671_8575, aClass671_8577, aClass671_8572, aClass671_8573, aClass671_8574 };
	}

	String method13774() {
		return aString8576;
	}

	String method13775() {
		return aString8576;
	}

	String method13776() {
		return aString8576;
	}

	public Locale method13777() {
		return aLocale8580;
	}

	String method13778(short i) {
		return aString8576;
	}

	static final void method13779(Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class315.method5673((char) i_5_, (byte) 0) ? 1 : 0;
	}

	static final void method13780(Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		int i_6_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		boolean bool = 1 == (class665.anIntArray8525[1 + class665.anInt8526 * 1769813785]);
		int i_7_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2];
		boolean bool_8_ = (class665.anIntArray8525[3 + class665.anInt8526 * 1769813785] == 1);
		Class265.method5037(i_6_, bool, i_7_, bool_8_, 209100633);
	}

	static final void method13781(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method17261(551265884) ? 1 : 0;
	}

	static final void method13782(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -645136690) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2645 = Class103.method1800(string, class665, (byte) -75);
		class243.aBool2606 = true;
	}

	public static int method13783(int i) {
		if (2.0 == (double) Class529_Sub1.aFloat7134)
			return 25;
		if ((double) Class529_Sub1.aFloat7134 == 3.0)
			return 37;
		if (4.0 == (double) Class529_Sub1.aFloat7134)
			return 50;
		if ((double) Class529_Sub1.aFloat7134 == 6.0)
			return 75;
		if (8.0 == (double) Class529_Sub1.aFloat7134)
			return 100;
		return 200;
	}
}

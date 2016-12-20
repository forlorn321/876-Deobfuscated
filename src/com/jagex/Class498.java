/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public class Class498 {
	public static String aString5582;
	public static String aString5583;
	public static String aString5584;
	static String aString5585;
	static int anInt5586;

	Class498() throws Throwable {
		throw new Error();
	}

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5584 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5583 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5585 = string.toLowerCase();
		aString5582 = String.format("%s (%s) [%s]", new Object[] { aString5584, aString5583, aString5585 });
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}

	static final void method8164(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 531325299);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class253.method4696(class243, class240, class665, 1657665037);
	}

	static final void method8165(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -648250681 * Class32.anInt302;
	}

	static final void method8166(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3990((byte) 32) == i_1_ ? 1 : 0;
	}

	static void method8167(Class665 class665, int i) {
		class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 1]), -1748955445)).anInt2834 * 101323697);
	}
}

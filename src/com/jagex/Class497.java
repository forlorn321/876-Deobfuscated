/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public class Class497 {
	public static String aString5549;
	public static String aString5550;
	public static String aString5551;
	static String aString5552;
	static int anInt5553;
	public static Class34_Sub16 aClass34_Sub16_5554;

	Class497() throws Throwable {
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
		aString5550 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5551 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5552 = string.toLowerCase();
		aString5549 = String.format("%s (%s) [%s]", new Object[] { aString5550, aString5551, aString5552 });
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}

	static final void method6013(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		Class536_Sub18_Sub10 class536_sub18_sub10 = Class198.aClass32_2216.method788(i_0_, (byte) 71);
		if ((class536_sub18_sub10.method10721(i_1_, 178604027).anInt8020 * 630321193) != 0)
			throw new RuntimeException("");
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub18_sub10.method10716(i_1_, i_2_, 1956158279);
	}

	static final void method6014(Class668 class668, short i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_3_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_3_ >> 16];
		Class311.method4180(class251, class234, class668, (byte) 78);
	}
}

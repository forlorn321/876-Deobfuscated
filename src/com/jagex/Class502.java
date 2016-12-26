/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class Class502 {
	static Hashtable aHashtable6849;
	static File aFile6850;
	static boolean aBool6851 = false;

	public static String method6036() {
		return aFile6850.getAbsolutePath();
	}

	Class502() throws Throwable {
		throw new Error();
	}

	public static String method6037() {
		return aFile6850.getAbsolutePath();
	}

	static {
		aHashtable6849 = new Hashtable(16);
	}

	static final void method6038(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class309.method4152(class251, class234, class668, 125211835);
	}

	static final void method6039(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(-1485705955) == 1 ? 1 : 0;
	}

	public static void method6040(int i) {
		if (Class575.aBool7662) {
			int i_0_ = Class536_Sub42.aTwitchTV10811.ShutdownTTV();
			if (i_0_ == 0) {
				Class536_Sub42.aTwitchTV10811 = null;
				Class575.aBool7662 = false;
			}
		}
	}

	public static void method6041(int i, byte i_1_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(23, (long) i);
		class536_sub18_sub5.method10669(-718801276);
	}

	public static void method6042(RSByteBuffer class536_sub33, byte i) {
		byte[] is = new byte[24];
		try {
			Class505.aClass18_6878.method673(0L);
			Class505.aClass18_6878.method685(is, (byte) 78);
			int i_2_;
			for (i_2_ = 0; i_2_ < 24 && 0 == is[i_2_]; i_2_++) {
				/* empty */
			}
			if (i_2_ >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i_3_ = 0; i_3_ < 24; i_3_++)
				is[i_3_] = (byte) -1;
		}
		class536_sub33.writeBytes(is, 0, 24, (byte) 58);
	}
}

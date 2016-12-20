/* Class503 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.FileOutputStream;

public class Class503 {
	static Class503 aClass503_6874;
	public static Class503 aClass503_6875;
	public static Class503 aClass503_6876;
	public static Class503 aClass503_6877;
	static Class503 aClass503_6878;
	public static Class503 aClass503_6879 = new Class503(false, false);
	boolean aBool6880;
	public static Class503 aClass503_6881;
	boolean aBool6882;
	static Class503 aClass503_6883;
	static FileOutputStream aFileOutputStream6884;

	boolean method8205() {
		return aBool6882;
	}

	boolean method8206(int i) {
		return aBool6882;
	}

	Class503(boolean bool, boolean bool_0_) {
		aBool6882 = bool;
		aBool6880 = bool_0_;
	}

	static {
		aClass503_6875 = new Class503(true, false);
		aClass503_6876 = new Class503(false, false);
		aClass503_6877 = new Class503(true, false);
		aClass503_6878 = new Class503(true, false);
		aClass503_6874 = new Class503(true, true);
		aClass503_6883 = new Class503(true, true);
		aClass503_6881 = new Class503(false, false);
	}

	boolean method8207() {
		return aBool6882;
	}

	boolean method8208() {
		return aBool6882;
	}

	public boolean method8209() {
		return aBool6880;
	}

	public boolean method8210() {
		return aBool6880;
	}

	public boolean method8211(byte i) {
		return aBool6880;
	}

	public boolean method8212() {
		return aBool6880;
	}

	static String method8213(byte[] is, int i, int i_1_, int i_2_) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_3_ = i; i_3_ < i + i_1_; i_3_ += 3) {
			int i_4_ = is[i_3_] & 0xff;
			stringbuilder.append(Class667.aCharArray8565[i_4_ >>> 2]);
			if (i_3_ < i_1_ - 1) {
				int i_5_ = is[i_3_ + 1] & 0xff;
				stringbuilder.append(Class667.aCharArray8565[(i_4_ & 0x3) << 4 | i_5_ >>> 4]);
				if (i_3_ < i_1_ - 2) {
					int i_6_ = is[2 + i_3_] & 0xff;
					stringbuilder.append(Class667.aCharArray8565[(i_5_ & 0xf) << 2 | i_6_ >>> 6]).append(Class667.aCharArray8565[i_6_ & 0x3f]);
				} else
					stringbuilder.append(Class667.aCharArray8565[(i_5_ & 0xf) << 2]).append('=');
			} else
				stringbuilder.append(Class667.aCharArray8565[(i_4_ & 0x3) << 4]).append('=').append('=');
		}
		return stringbuilder.toString();
	}

	public static void method8214(int i) {
		Class19 class19 = Class32.method944("2", client.aClass678_11259.aString8616, true, (byte) 97);
		Class598.aClass144_Sub1_7852.method14497(class19, 1057890189);
	}

	static String method8215(Class243 class243, int i, int i_7_) {
		if (!client.method17815(class243).method16254(i, 1839258768) && class243.anObjectArray2632 == null)
			return null;
		if (class243.aStringArray2597 == null || class243.aStringArray2597.length <= i || class243.aStringArray2597[i] == null || class243.aStringArray2597[i].trim().length() == 0) {
			if (client.aBool11199)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class243.aStringArray2597[i];
	}
}

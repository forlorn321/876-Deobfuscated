/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class320 {
	String aString3540;
	String aString3541;
	String aString3542;
	public static int anInt3543;
	public static int anInt3544;

	Class320(String string, String string_0_, String string_1_) {
		aString3542 = string;
		aString3540 = string_0_;
		aString3541 = string_1_;
	}

	static final void method5692(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1480986097 * client.anInt11223;
	}

	static void method5693(String string, int i) {
		client.aString11162 = string;
		if (Class440.method7110((byte) 94) != Class516.aClass516_7049) {
			try {
				String string_2_ = Class212.anApplet2258.getParameter(Class407.aClass407_4259.aString4246);
				String string_3_ = Class212.anApplet2258.getParameter(Class407.aClass407_4235.aString4246);
				String string_4_ = new StringBuilder().append(string_2_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_3_).toString();
				if (string.length() == 0)
					string_4_ = new StringBuilder().append(string_4_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
				else
					string_4_ = new StringBuilder().append(string_4_).append("; Expires=").append(Class530.method8882(Class234.method4347(-1408626088) + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
				Class60.method1381(Class212.anApplet2258, new StringBuilder().append("document.cookie=\"").append(string_4_).append("\"").toString(), 693933689);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static void method5694(int i) {
		int i_5_ = -1;
		if (null != Class529_Sub1.aClass527_Sub8_Sub12_7123)
			i_5_ = (Class529_Sub1.aClass527_Sub8_Sub12_7123.anInt11765 * 911503199);
		Class592.method9876((byte) 79);
		for (int i_6_ = 0; i_6_ < 3; i_6_++) {
			for (int i_7_ = 0; i_7_ < 5; i_7_++) {
				Class529_Sub1.aClass174ArrayArray10785[i_6_][i_7_] = null;
				Class529_Sub1.aClass22ArrayArray10780[i_6_][i_7_] = null;
			}
		}
		Class529_Sub1.aClass527_Sub8_Sub12_7123 = null;
		if (i_5_ != -1)
			Class572.method9608(i_5_, -1, -1, false, 2109208253);
	}

	static void method5695(int i, int i_8_, int i_9_, int i_10_, byte i_11_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(8, (long) i);
		class527_sub8_sub9.method18187(-441802634);
		class527_sub8_sub9.anInt11676 = i_8_ * -281159195;
		class527_sub8_sub9.anInt11667 = i_9_ * -164049787;
		class527_sub8_sub9.anInt11678 = 1405416095 * i_10_;
	}

	public static byte[] method5696(Object object, int i, int i_12_, int i_13_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_12_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_12_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_12_);
			return is;
		}
		throw new IllegalArgumentException();
	}
}

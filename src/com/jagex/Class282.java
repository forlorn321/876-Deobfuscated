/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.URL;

public class Class282 {
	static Class282 aClass282_3190;
	static Class282 aClass282_3191;
	public static Class282 aClass282_3192 = new Class282(0, 104);
	static Class282 aClass282_3193;
	static Class282 aClass282_3194;
	static Class282 aClass282_3195;
	public int anInt3196;
	public int anInt3197;
	public static String aString3198;

	Class282(int i, int i_0_) {
		anInt3196 = 318722433 * i;
		anInt3197 = i_0_ * -1288936107;
	}

	static Class282[] method5188() {
		return (new Class282[] { aClass282_3191, aClass282_3193, aClass282_3192, aClass282_3194, aClass282_3190, aClass282_3195 });
	}

	static Class282[] method5189() {
		return (new Class282[] { aClass282_3191, aClass282_3193, aClass282_3192, aClass282_3194, aClass282_3190, aClass282_3195 });
	}

	static Class282[] method5190() {
		return (new Class282[] { aClass282_3191, aClass282_3193, aClass282_3192, aClass282_3194, aClass282_3190, aClass282_3195 });
	}

	static Class282[] method5191() {
		return (new Class282[] { aClass282_3191, aClass282_3193, aClass282_3192, aClass282_3194, aClass282_3190, aClass282_3195 });
	}

	static {
		aClass282_3190 = new Class282(1, 120);
		aClass282_3191 = new Class282(2, 136);
		aClass282_3193 = new Class282(3, 168);
		aClass282_3194 = new Class282(4, 72);
		aClass282_3195 = new Class282(5, 256);
	}

	public static Class282 method5192(int i) {
		Class282[] class282s = Class200.method3765(-1919446450);
		for (int i_1_ = 0; i_1_ < class282s.length; i_1_++) {
			Class282 class282 = class282s[i_1_];
			if (i == class282.anInt3196 * -1802310015)
				return class282;
		}
		return null;
	}

	public static Class282 method5193(int i) {
		Class282[] class282s = Class200.method3765(-1636476362);
		for (int i_2_ = 0; i_2_ < class282s.length; i_2_++) {
			Class282 class282 = class282s[i_2_];
			if (i == class282.anInt3196 * -1802310015)
				return class282;
		}
		return null;
	}

	public static boolean method5194(String string, int i, String string_3_, byte i_4_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!Class508.aString6922.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_5_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_6_ = 0; i_6_ < string.length(); i_6_++) {
					if (string_5_.indexOf(string.charAt(i_6_)) == -1)
						throw new Exception();
				}
				Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
				bool = true;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (1 == i) {
			boolean bool;
			try {
				Object object = Class60.method1378(Class508.anApplet6919, string_3_, (new Object[] { new URL(Class508.anApplet6919.getCodeBase(), string).toString() }), 2007676602);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				Class508.anApplet6919.getAppletContext().showDocument(new URL(Class508.anApplet6919.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class60.method1375(Class508.anApplet6919, "loggedout", 820898823);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				Class508.anApplet6919.getAppletContext().showDocument(new URL(Class508.anApplet6919.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	static Class527_Sub8_Sub10 method5195(int i, int i_7_) {
		Class527_Sub8_Sub10 class527_sub8_sub10 = ((Class527_Sub8_Sub10) Class648.aClass199_8370.method3748((long) i));
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		byte[] is = Class293_Sub1.aClass459_10041.method7470(i, 0, (byte) -22);
		if (null == is || is.length <= 1)
			return null;
		try {
			class527_sub8_sub10 = Class222.method4152(is, -635407399);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		Class648.aClass199_8370.method3749(class527_sub8_sub10, (long) i);
		return class527_sub8_sub10;
	}

	static final void method5196(Class665 class665, int i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub18 class527_sub8_sub18 = Class708.aClass463_8847.method7621(i_8_, 1908550611);
		if (null == class527_sub8_sub18.anIntArray11863)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class527_sub8_sub18.anIntArray11863.length;
	}

	static final void method5197(int i, int i_9_, int i_10_, int i_11_, Class599 class599, byte i_12_) {
		if (i_10_ >= 1 && i_11_ >= 1 && i_10_ <= client.aClass509_11072.method8284((byte) 16) - 2 && i_11_ <= client.aClass509_11072.method8285(814879716) - 2) {
			if (client.aClass509_11072.method8314(-1193260849) != null) {
				Interface62 interface62 = client.aClass509_11072.method8300((byte) 11).method15957(i, i_9_, i_10_, i_11_, (byte) 0);
				if (interface62 != null) {
					if (interface62 instanceof Class640_Sub1_Sub2_Sub2)
						((Class640_Sub1_Sub2_Sub2) interface62).method18669(class599, 1960413018);
					else if (interface62 instanceof Class640_Sub1_Sub4_Sub2)
						((Class640_Sub1_Sub4_Sub2) interface62).method18658(class599, -197667412);
					else if (interface62 instanceof Class640_Sub1_Sub3_Sub2)
						((Class640_Sub1_Sub3_Sub2) interface62).method18672(class599, 253781992);
					else if (interface62 instanceof Class640_Sub1_Sub1_Sub2)
						((Class640_Sub1_Sub1_Sub2) interface62).method18678(class599, 102380841);
				}
			}
		}
	}

	static final void method5198(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = ((Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -73) == null) ? -1 : (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -82).anInt3462) * 1240716057);
	}

	static final void method5199(Class665 class665, int i) {
		Class190.anInt2129 = 0;
	}
}

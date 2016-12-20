/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.net.URL;

public class Class508 {
	public static final int anInt6918 = 1;
	static Applet anApplet6919 = null;
	static final int anInt6920 = 0;
	static final int anInt6921 = 2;
	static String aString6922 = null;
	static final int anInt6923 = 3;
	public static Class459 aClass459_6924;

	static boolean method8258(String string, int i) {
		return Class282.method5194(string, i, "openjs", (byte) -26);
	}

	Class508() throws Throwable {
		throw new Error();
	}

	public static void method8259(Applet applet, String string) {
		anApplet6919 = applet;
		aString6922 = string;
	}

	static boolean method8260(String string, int i) {
		return Class282.method5194(string, i, "openjs", (byte) -20);
	}

	public static boolean method8261(String string, int i, String string_0_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!aString6922.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_1_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
					if (string_1_.indexOf(string.charAt(i_2_)) == -1)
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
				Object object = Class60.method1378(anApplet6919, string_0_, (new Object[] { new URL(anApplet6919.getCodeBase(), string).toString() }), -2118756927);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class60.method1375(anApplet6919, "loggedout", 557673711);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	static boolean method8262(String string, int i) {
		return Class282.method5194(string, i, "openjs", (byte) 109);
	}

	static boolean method8263(String string, int i) {
		return Class282.method5194(string, i, "openjs", (byte) -28);
	}

	public static void method8264(Applet applet, String string) {
		anApplet6919 = applet;
		aString6922 = string;
	}

	public static void method8265(Applet applet, String string) {
		anApplet6919 = applet;
		aString6922 = string;
	}

	static boolean method8266(String string, int i) {
		return Class282.method5194(string, i, "openjs", (byte) 37);
	}

	static boolean method8267(String string, int i) {
		return Class282.method5194(string, i, "openjs", (byte) 80);
	}

	public static boolean method8268(String string, int i, String string_3_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!aString6922.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_4_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_5_ = 0; i_5_ < string.length(); i_5_++) {
					if (string_4_.indexOf(string.charAt(i_5_)) == -1)
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
				Object object = Class60.method1378(anApplet6919, string_3_, (new Object[] { new URL(anApplet6919.getCodeBase(), string).toString() }), -1168341024);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class60.method1375(anApplet6919, "loggedout", 705199719);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	public static boolean method8269(String string, int i, String string_6_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!aString6922.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_7_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_8_ = 0; i_8_ < string.length(); i_8_++) {
					if (string_7_.indexOf(string.charAt(i_8_)) == -1)
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
				Object object = Class60.method1378(anApplet6919, string_6_, (new Object[] { new URL(anApplet6919.getCodeBase(), string).toString() }), -1224343077);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class60.method1375(anApplet6919, "loggedout", 1837623698);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	public static void method8270(String string, boolean bool, boolean bool_9_) {
		Class477.method7780(string, bool, "openjs", bool_9_, (byte) 41);
	}

	public static boolean method8271(String string, int i, String string_10_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!aString6922.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_11_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_12_ = 0; i_12_ < string.length(); i_12_++) {
					if (string_11_.indexOf(string.charAt(i_12_)) == -1)
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
				Object object = Class60.method1378(anApplet6919, string_10_, (new Object[] { new URL(anApplet6919.getCodeBase(), string).toString() }), -1549067971);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class60.method1375(anApplet6919, "loggedout", 1190470502);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				anApplet6919.getAppletContext().showDocument(new URL(anApplet6919.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	public static final int method8272(int i, int i_13_, byte i_14_) {
		if (-2 == i)
			return 12345678;
		if (i == -1) {
			if (i_13_ < 2)
				i_13_ = 2;
			else if (i_13_ > 126)
				i_13_ = 126;
			return i_13_;
		}
		i_13_ = (i & 0x7f) * i_13_ >> 7;
		if (i_13_ < 2)
			i_13_ = 2;
		else if (i_13_ > 126)
			i_13_ = 126;
		return i_13_ + (i & 0xff80);
	}

	static final void method8273(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class296.method5503(class243, class240, class665, ((Class627.aClass527_Sub21_8187 == class665.aClass527_Sub21_8537) ? Class237.aClass237_2383 : Class237.aClass237_2384), (byte) 1);
	}

	static final void method8274(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 890099494) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2643 = Class103.method1800(string, class665, (byte) -13);
		class243.aBool2606 = true;
	}

	static void method8275(Class109 class109, int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4406, class109.aClass2_1367, (byte) -70);
		class109.method1969(class527_sub15, (byte) 1);
		client.aBool11309 = true;
	}

	static final void method8276(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 274311576) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2637 = Class103.method1800(string, class665, (byte) -77);
		class243.aBool2606 = true;
	}

	public static Class389 method8277(RSByteBuffer class527_sub38, int i) {
		Class389 class389 = Class397.method6514(class527_sub38, -1495859584);
		int i_15_ = class527_sub38.readInt();
		int i_16_ = class527_sub38.readInt();
		int i_17_ = class527_sub38.method16466(-1958040831);
		return new Class389_Sub3(class389.aClass400_3991, class389.aClass384_3994, class389.anInt3993 * -1339829793, class389.anInt3992 * -827519441, -236249659 * class389.anInt3995, 1859543809 * class389.anInt3996, 449413251 * class389.anInt3997, -1063745743 * class389.anInt3998, class389.anInt3999 * 1002599463, i_15_, i_16_, i_17_);
	}
}

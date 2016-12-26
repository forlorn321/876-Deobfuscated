/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Class523 {
	static final int anInt7078 = 14;
	static final int anInt7079 = 8;
	static final int anInt7080 = 6;
	static final int anInt7081 = 4;
	static final int anInt7082 = 2;
	static final int anInt7083 = 8;
	static final int anInt7084 = 4;
	static final int anInt7085 = 2;
	static final int anInt7086 = 128;
	static final int anInt7087 = 8;
	static final int anInt7088 = 12;
	static final int anInt7089 = 4;
	static final int anInt7090 = 4;
	static final int anInt7091 = 16;
	static final int anInt7092 = 3;
	static final int anInt7093 = 3;
	static final int anInt7094 = 8;
	static final int anInt7095 = 4;
	static final int anInt7096 = 16;

	static final boolean method6385(int i) {
		return i < 7;
	}

	static final int method6386(int i) {
		if (i < 4)
			return 0;
		if (i < 10)
			return i - 3;
		return i - 6;
	}

	static final int method6387(int i) {
		if (i < 4)
			return 0;
		if (i < 10)
			return i - 3;
		return i - 6;
	}

	static final int method6388(int i) {
		return i < 7 ? 7 : 10;
	}

	static final int method6389(int i) {
		return i < 7 ? 8 : 11;
	}

	static final int method6390(int i) {
		i -= 2;
		if (i < 4)
			return i;
		return 3;
	}

	Class523() throws Throwable {
		throw new Error();
	}

	static final int method6391(int i) {
		return i < 7 ? 9 : 11;
	}

	static final boolean method6392(int i) {
		return i < 7;
	}

	static final int method6393(int i) {
		return i < 7 ? 9 : 11;
	}

	static final int method6394(int i) {
		return i < 7 ? 9 : 11;
	}

	static final boolean method6395(int i) {
		return i < 7;
	}

	static final int method6396(int i) {
		return i < 7 ? 8 : 11;
	}

	static final int method6397(int i) {
		i -= 2;
		if (i < 4)
			return i;
		return 3;
	}

	static final boolean method6398(int i) {
		return i < 7;
	}

	static final int method6399(int i) {
		i -= 2;
		if (i < 4)
			return i;
		return 3;
	}

	public static void method6400(Class536_Sub31 class536_sub31, short i) {
		if (!Class426.method5129(-708374433 * client.anInt11101, 1603352511))
			class536_sub31.method9641(-1529947918);
		else
			Class659.aClass637_Sub2_8502.method7640(class536_sub31, -2023086926);
	}

	static final void method6401(Class668 class668, int i) {
		if ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1)
			class668.anInt8564 += (class668.anIntArray8537[-1640738851 * class668.anInt8564] * -1531084683);
	}

	static final void method6402(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		ChunkSceneSubPackets.method4973(class251, class234, class668, (byte) -8);
	}

	static final void method6403(Class668 class668, int i) {
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1);
		if (bool)
			Class609.method7265(2, -258578822);
		else
			Class609.method7265(1, -250995234);
	}

	static final void method6404(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ((Class649_Sub1) class668.anInterface59_8555).method9953(-1792674650);
	}

	public static boolean method6405(int i) {
		if (Class497.aString5550.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_0_ = "msvcp110.dll";
			String[] strings = { string, string_0_ };
			String string_1_ = System.getenv("WINDIR");
			if (string_1_ == "")
				return false;
			for (int i_2_ = 0; i_2_ < strings.length; i_2_++) {
				File file = new File(new StringBuilder().append(string_1_).append("\\system32\\").append(strings[i_2_]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class497.aString5550.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_3_;
					try {
						int i_4_ = process.waitFor();
						if (i_4_ == 0)
							break;
						bool_3_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_3_;
				} while (false);
				boolean bool_5_ = false;
				while_4_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_4_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_5_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_5_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	static void method6406(int i, int i_6_, int i_7_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(13, (long) i);
		class536_sub18_sub5.method10659(1797382232);
		class536_sub18_sub5.anInt11675 = i_6_ * 1577826219;
	}
}

/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class227 implements Interface27 {
	Class214 this$0;
	static Class459 aClass459_2353;

	public void method151(Class219 class219) {
		class219.method4004(-2023131066);
	}

	public void method150(Class219 class219, int i) {
		class219.method4004(722983551);
	}

	Class227(Class214 class214) {
		this$0 = class214;
	}

	static byte[] method4305(InputStream inputstream, int i, byte i_0_) throws IOException {
		byte[] is = new byte[5];
		if (inputstream.read(is, 0, 5) != 5)
			throw new IOException("2");
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
		synchronized (Class525.aClass519_7100) {
			if (!Class525.aClass519_7100.method8641(is, (byte) 87))
				throw new IOException("3");
			Class525.aClass519_7100.method8640(inputstream, bytearrayoutputstream, (long) i);
		}
		bytearrayoutputstream.flush();
		return bytearrayoutputstream.toByteArray();
	}

	public static Class687 method4306(byte i) {
		if (null == Class565.aClass687_7578)
			return Class687.aClass687_8679;
		return Class565.aClass687_7578;
	}

	static final void method4307(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass346_8532.aByte3708;
	}

	public static void method4308(int i) {
		Class648.aClass199_8370.method3750((byte) -9);
	}

	static final void method4309(Class243[] class243s, int i, byte i_1_) {
		for (int i_2_ = 0; i_2_ < class243s.length; i_2_++) {
			Class243 class243 = class243s[i_2_];
			if (class243 != null) {
				if (0 == -270144907 * class243.anInt2501) {
					if (class243.aClass243Array2666 != null)
						method4309(class243.aClass243Array2666, i, (byte) -51);
					Class527_Sub41 class527_sub41 = ((Class527_Sub41) (client.aClass14_11276.method709((long) (-254728301 * class243.anInt2504))));
					if (class527_sub41 != null)
						Class316_Sub1.method15722(1307137747 * (class527_sub41.anInt10752), i, 1902440723);
				}
				if (0 == i && class243.anObjectArray2643 != null) {
					Class527_Sub33 class527_sub33 = new Class527_Sub33();
					class527_sub33.aClass243_10648 = class243;
					class527_sub33.anObjectArray10650 = class243.anObjectArray2643;
					Class491.method7980(class527_sub33, -659530295);
				}
				if (1 == i && class243.anObjectArray2600 != null) {
					if (class243.anInt2675 * -927924265 >= 0) {
						Class243 class243_3_ = Class648.method10837((class243.anInt2504 * -254728301), -1117071934);
						if (null == class243_3_ || class243_3_.aClass243Array2665 == null || (-927924265 * class243.anInt2675 >= class243_3_.aClass243Array2665.length) || class243 != (class243_3_.aClass243Array2665[class243.anInt2675 * -927924265]))
							continue;
					}
					Class527_Sub33 class527_sub33 = new Class527_Sub33();
					class527_sub33.aClass243_10648 = class243;
					class527_sub33.anObjectArray10650 = class243.anObjectArray2600;
					Class491.method7980(class527_sub33, -145503117);
				}
			}
		}
	}
}

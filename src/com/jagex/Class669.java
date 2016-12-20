/* Class669 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class669 {
	public static byte[] method13755(byte[] is) {
		if (null == is)
			return null;
		byte[] is_0_ = new byte[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}

	public static byte[] method13756(byte[] is) {
		if (null == is)
			return null;
		byte[] is_1_ = new byte[is.length];
		System.arraycopy(is, 0, is_1_, 0, is.length);
		return is_1_;
	}

	Class669() throws Throwable {
		throw new Error();
	}

	public static byte[] method13757(byte[] is) {
		if (null == is)
			return null;
		byte[] is_2_ = new byte[is.length];
		System.arraycopy(is, 0, is_2_, 0, is.length);
		return is_2_;
	}

	public static short[] method13758(short[] is) {
		if (null == is)
			return null;
		short[] is_3_ = new short[is.length];
		System.arraycopy(is, 0, is_3_, 0, is.length);
		return is_3_;
	}

	static final void method13759(byte i, byte i_4_) {
		byte[][][] is = client.aClass509_11072.method8371((byte) 0);
		if (is == null) {
			is = (new byte[4][client.aClass509_11072.method8284((byte) 44)][client.aClass509_11072.method8285(-444892914)]);
			client.aClass509_11072.method8299(is, (byte) -27);
		}
		for (int i_5_ = 0; i_5_ < 4; i_5_++) {
			for (int i_6_ = 0; i_6_ < client.aClass509_11072.method8284((byte) 21); i_6_++) {
				for (int i_7_ = 0; i_7_ < client.aClass509_11072.method8285(543253885); i_7_++)
					is[i_5_][i_6_][i_7_] = i;
			}
		}
	}

	static final void method13760(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 50) == null ? -1 : (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 25).anInt3417) * -2064516751);
	}

	static final void method13761(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_8_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_9_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class708.aClass463_8847.method7621(i_8_, 1024313966).aCharArray11865[i_9_]);
	}
}

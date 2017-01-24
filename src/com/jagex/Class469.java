/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.math.BigInteger;

public class Class469 {
	Class448[] aClass448Array5355;
	static int anInt5356;

	Class469(RSByteBuffer class536_sub33, BigInteger biginteger, BigInteger biginteger_0_) {
		class536_sub33.off = -1714089721;
		int i = class536_sub33.readUnsignedByte();
		class536_sub33.off += -1655631760 * i;
		byte[] is = new byte[(class536_sub33.buffer.length - -810172525 * class536_sub33.off)];
		class536_sub33.readToByteArray(is, 0, is.length);
		byte[] is_1_;
		if (biginteger == null || biginteger_0_ == null)
			is_1_ = is;
		else {
			BigInteger biginteger_2_ = new BigInteger(is);
			BigInteger biginteger_3_ = biginteger_2_.modPow(biginteger, biginteger_0_);
			is_1_ = biginteger_3_.toByteArray();
		}
//		if (is_1_.length != 65)
//			throw new RuntimeException();
		byte[] is_4_ = Class601.method7165(class536_sub33.buffer, 5, (class536_sub33.off * -810172525 - is.length - 5), (byte) -27);
//		for (int i_5_ = 0; i_5_ < 64; i_5_++) {
//			if (is_4_[i_5_] != is_1_[i_5_ + 1])
//				throw new RuntimeException();
//		}
		aClass448Array5355 = new Class448[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			class536_sub33.off = -1197914206 + -1655631760 * i_6_;
			int i_7_ = class536_sub33.readInt();
			int i_8_ = class536_sub33.readInt();
			int i_9_ = class536_sub33.readInt();
			int i_10_ = class536_sub33.readInt();
			byte[] is_11_ = new byte[64];
			class536_sub33.readToByteArray(is_11_, 0, 64);
			aClass448Array5355[i_6_] = new Class448(i_7_, i_9_, i_8_, i_10_, is_11_);
		}
	}

	static final void method5698(Class668 class668, byte i) {
		int i_12_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_12_);
		Class234 class234 = Class463.aClass234Array5227[i_12_ >> 16];
		Class520.method6348(class251, class234, class668, -301524179);
	}

	static final void method5699(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class471.method5715(class251, class234, class668, 984458878);
	}

	static final byte[] method5700(byte[] is) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		Class454 class454 = new Class454(class536_sub33);
		Class463 class463 = class454.method5450(-1601920795);
		int i_13_ = class454.method5451((byte) 57);
		if (i_13_ < 0 || (JS5ResourceProvider.anInt5207 * 2108509789 != 0 && i_13_ > JS5ResourceProvider.anInt5207 * 2108509789))
			throw new RuntimeException();
		if (Class463.aClass463_5222 == class463) {
			byte[] is_14_ = new byte[i_13_];
			class536_sub33.readToByteArray(is_14_, 0, i_13_);
			return is_14_;
		}
		int i_15_ = class454.method5455((byte) -57);
		if (i_15_ < 0 || (2108509789 * JS5ResourceProvider.anInt5207 != 0 && i_15_ > JS5ResourceProvider.anInt5207 * 2108509789))
			throw new RuntimeException();
		byte[] is_16_;
		if (Class463.aClass463_5221 == class463) {
			is_16_ = new byte[i_15_];
			Class696.method8228(is_16_, i_15_, is, i_13_, 9);
		} else if (Class463.aClass463_5226 == class463) {
			is_16_ = new byte[i_15_];
			synchronized (JS5ResourceProvider.aClass85_5204) {
				JS5ResourceProvider.aClass85_5204.method1184(class536_sub33, is_16_, 1538492433);
			}
		} else if (Class463.aClass463_5224 == class463) {
			try {
				is_16_ = JS5ResourceProvider.method5611(class536_sub33, i_15_, 1163542199);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return is_16_;
	}
}

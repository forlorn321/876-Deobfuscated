/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class10 {
	long[] aLongArray124;
	public static final int anInt125 = 64;
	long[] aLongArray126;
	static final String aString127 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	static long[][] aLongArrayArray128 = new long[8][256];
	static final int anInt129 = 10;
	byte[] aByteArray130 = new byte[32];
	byte[] aByteArray131 = new byte[64];
	int anInt132 = 0;
	int anInt133 = 0;
	long[] aLongArray134;
	static long[] aLongArray135 = new long[11];
	long[] aLongArray136;
	long[] aLongArray137 = new long[8];
	static final int anInt138 = 512;

	void method609() {
		int i = 0;
		int i_0_ = 0;
		while (i < 8) {
			aLongArray134[i] = ((long) aByteArray131[i_0_] << 56 ^ ((long) aByteArray131[1 + i_0_] & 0xffL) << 48 ^ ((long) aByteArray131[2 + i_0_] & 0xffL) << 40 ^ ((long) aByteArray131[i_0_ + 3] & 0xffL) << 32 ^ ((long) aByteArray131[i_0_ + 4] & 0xffL) << 24 ^ ((long) aByteArray131[5 + i_0_] & 0xffL) << 16 ^ ((long) aByteArray131[i_0_ + 6] & 0xffL) << 8 ^ (long) aByteArray131[7 + i_0_] & 0xffL);
			i++;
			i_0_ += 8;
		}
		for (i = 0; i < 8; i++)
			aLongArray126[i] = aLongArray134[i] ^ (aLongArray124[i] = aLongArray137[i]);
		for (i = 1; i <= 10; i++) {
			for (i_0_ = 0; i_0_ < 8; i_0_++) {
				aLongArray136[i_0_] = 0L;
				int i_1_ = 0;
				int i_2_ = 56;
				while (i_1_ < 8) {
					aLongArray136[i_0_] ^= (aLongArrayArray128[i_1_][((int) (aLongArray124[i_0_ - i_1_ & 0x7] >>> i_2_) & 0xff)]);
					i_1_++;
					i_2_ -= 8;
				}
			}
			for (i_0_ = 0; i_0_ < 8; i_0_++)
				aLongArray124[i_0_] = aLongArray136[i_0_];
			aLongArray124[0] ^= aLongArray135[i];
			for (i_0_ = 0; i_0_ < 8; i_0_++) {
				aLongArray136[i_0_] = aLongArray124[i_0_];
				int i_3_ = 0;
				int i_4_ = 56;
				while (i_3_ < 8) {
					aLongArray136[i_0_] ^= (aLongArrayArray128[i_3_][((int) (aLongArray126[i_0_ - i_3_ & 0x7] >>> i_4_) & 0xff)]);
					i_3_++;
					i_4_ -= 8;
				}
			}
			for (i_0_ = 0; i_0_ < 8; i_0_++)
				aLongArray126[i_0_] = aLongArray136[i_0_];
		}
		for (i = 0; i < 8; i++)
			aLongArray137[i] ^= aLongArray126[i] ^ aLongArray134[i];
	}

	void method610(byte[] is, long l) {
		int i = 0;
		int i_5_ = 8 - ((int) l & 0x7) & 0x7;
		int i_6_ = anInt132 * 1202043573 & 0x7;
		long l_7_ = l;
		int i_8_ = 31;
		int i_9_ = 0;
		for (/**/; i_8_ >= 0; i_8_--) {
			i_9_ += ((int) l_7_ & 0xff) + (aByteArray130[i_8_] & 0xff);
			aByteArray130[i_8_] = (byte) i_9_;
			i_9_ >>>= 8;
			l_7_ >>>= 8;
		}
		while (l > 8L) {
			int i_10_ = is[i] << i_5_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_5_;
			if (i_10_ < 0 || i_10_ >= 256)
				throw new RuntimeException();
			aByteArray131[anInt133 * 249521533] |= i_10_ >>> i_6_;
			anInt133 += 206306261;
			anInt132 += (8 - i_6_) * 441901981;
			if (512 == 1202043573 * anInt132) {
				method617(2098035761);
				anInt133 = 0;
				anInt132 = 0;
			}
			aByteArray131[249521533 * anInt133] = (byte) (i_10_ << 8 - i_6_ & 0xff);
			anInt132 += 441901981 * i_6_;
			l -= 8L;
			i++;
		}
		int i_11_;
		if (l > 0L) {
			i_11_ = is[i] << i_5_ & 0xff;
			aByteArray131[249521533 * anInt133] |= i_11_ >>> i_6_;
		} else
			i_11_ = 0;
		if (l + (long) i_6_ < 8L)
			anInt132 += l * 441901981L;
		else {
			anInt133 += 206306261;
			anInt132 += (8 - i_6_) * 441901981;
			l -= (long) (8 - i_6_);
			if (1202043573 * anInt132 == 512) {
				method617(1333926864);
				anInt133 = 0;
				anInt132 = 0;
			}
			aByteArray131[249521533 * anInt133] = (byte) (i_11_ << 8 - i_6_ & 0xff);
			anInt132 += (int) l * 441901981;
		}
	}

	void method611(byte[] is, int i, int i_12_) {
		aByteArray131[anInt133 * 249521533] |= 128 >>> (anInt132 * 1202043573 & 0x7);
		anInt133 += 206306261;
		if (anInt133 * 249521533 > 32) {
			while (249521533 * anInt133 < 64)
				aByteArray131[(anInt133 += 206306261) * 249521533 - 1] = (byte) 0;
			method617(1482797523);
			anInt133 = 0;
		}
		while (249521533 * anInt133 < 32)
			aByteArray131[(anInt133 += 206306261) * 249521533 - 1] = (byte) 0;
		System.arraycopy(aByteArray130, 0, aByteArray131, 32, 32);
		method617(1417474222);
		int i_13_ = 0;
		int i_14_ = i;
		while (i_13_ < 8) {
			long l = aLongArray137[i_13_];
			is[i_14_] = (byte) (int) (l >>> 56);
			is[1 + i_14_] = (byte) (int) (l >>> 48);
			is[2 + i_14_] = (byte) (int) (l >>> 40);
			is[3 + i_14_] = (byte) (int) (l >>> 32);
			is[i_14_ + 4] = (byte) (int) (l >>> 24);
			is[i_14_ + 5] = (byte) (int) (l >>> 16);
			is[6 + i_14_] = (byte) (int) (l >>> 8);
			is[i_14_ + 7] = (byte) (int) l;
			i_13_++;
			i_14_ += 8;
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_15_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			long l = (0 == (i & 0x1) ? (long) (i_15_ >>> 8) : (long) (i_15_ & 0xff));
			long l_16_ = l << 1;
			if (l_16_ >= 256L)
				l_16_ ^= 0x11dL;
			long l_17_ = l_16_ << 1;
			if (l_17_ >= 256L)
				l_17_ ^= 0x11dL;
			long l_18_ = l_17_ ^ l;
			long l_19_ = l_17_ << 1;
			if (l_19_ >= 256L)
				l_19_ ^= 0x11dL;
			long l_20_ = l_19_ ^ l;
			aLongArrayArray128[0][i] = (l << 56 | l << 48 | l_17_ << 40 | l << 32 | l_19_ << 24 | l_18_ << 16 | l_16_ << 8 | l_20_);
			for (int i_21_ = 1; i_21_ < 8; i_21_++)
				aLongArrayArray128[i_21_][i] = (aLongArrayArray128[i_21_ - 1][i] >>> 8 | aLongArrayArray128[i_21_ - 1][i] << 56);
		}
		aLongArray135[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_22_ = 8 * (i - 1);
			aLongArray135[i] = (aLongArrayArray128[0][i_22_] & ~0xffffffffffffffL ^ aLongArrayArray128[1][i_22_ + 1] & 0xff000000000000L ^ aLongArrayArray128[2][2 + i_22_] & 0xff0000000000L ^ aLongArrayArray128[3][i_22_ + 3] & 0xff00000000L ^ aLongArrayArray128[4][i_22_ + 4] & 0xff000000L ^ aLongArrayArray128[5][5 + i_22_] & 0xff0000L ^ aLongArrayArray128[6][6 + i_22_] & 0xff00L ^ aLongArrayArray128[7][7 + i_22_] & 0xffL);
		}
	}

	void method612(int i) {
		for (int i_23_ = 0; i_23_ < 32; i_23_++)
			aByteArray130[i_23_] = (byte) 0;
		anInt133 = 0;
		anInt132 = 0;
		aByteArray131[0] = (byte) 0;
		for (int i_24_ = 0; i_24_ < 8; i_24_++)
			aLongArray137[i_24_] = 0L;
	}

	void method613() {
		int i = 0;
		int i_25_ = 0;
		while (i < 8) {
			aLongArray134[i] = ((long) aByteArray131[i_25_] << 56 ^ ((long) aByteArray131[1 + i_25_] & 0xffL) << 48 ^ ((long) aByteArray131[2 + i_25_] & 0xffL) << 40 ^ ((long) aByteArray131[i_25_ + 3] & 0xffL) << 32 ^ ((long) aByteArray131[i_25_ + 4] & 0xffL) << 24 ^ ((long) aByteArray131[5 + i_25_] & 0xffL) << 16 ^ ((long) aByteArray131[i_25_ + 6] & 0xffL) << 8 ^ (long) aByteArray131[7 + i_25_] & 0xffL);
			i++;
			i_25_ += 8;
		}
		for (i = 0; i < 8; i++)
			aLongArray126[i] = aLongArray134[i] ^ (aLongArray124[i] = aLongArray137[i]);
		for (i = 1; i <= 10; i++) {
			for (i_25_ = 0; i_25_ < 8; i_25_++) {
				aLongArray136[i_25_] = 0L;
				int i_26_ = 0;
				int i_27_ = 56;
				while (i_26_ < 8) {
					aLongArray136[i_25_] ^= (aLongArrayArray128[i_26_][(int) (aLongArray124[i_25_ - i_26_ & 0x7] >>> i_27_) & 0xff]);
					i_26_++;
					i_27_ -= 8;
				}
			}
			for (i_25_ = 0; i_25_ < 8; i_25_++)
				aLongArray124[i_25_] = aLongArray136[i_25_];
			aLongArray124[0] ^= aLongArray135[i];
			for (i_25_ = 0; i_25_ < 8; i_25_++) {
				aLongArray136[i_25_] = aLongArray124[i_25_];
				int i_28_ = 0;
				int i_29_ = 56;
				while (i_28_ < 8) {
					aLongArray136[i_25_] ^= (aLongArrayArray128[i_28_][(int) (aLongArray126[i_25_ - i_28_ & 0x7] >>> i_29_) & 0xff]);
					i_28_++;
					i_29_ -= 8;
				}
			}
			for (i_25_ = 0; i_25_ < 8; i_25_++)
				aLongArray126[i_25_] = aLongArray136[i_25_];
		}
		for (i = 0; i < 8; i++)
			aLongArray137[i] ^= aLongArray126[i] ^ aLongArray134[i];
	}

	void method614() {
		for (int i = 0; i < 32; i++)
			aByteArray130[i] = (byte) 0;
		anInt133 = 0;
		anInt132 = 0;
		aByteArray131[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray137[i] = 0L;
	}

	void method615() {
		for (int i = 0; i < 32; i++)
			aByteArray130[i] = (byte) 0;
		anInt133 = 0;
		anInt132 = 0;
		aByteArray131[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray137[i] = 0L;
	}

	Class10() {
		aLongArray124 = new long[8];
		aLongArray136 = new long[8];
		aLongArray134 = new long[8];
		aLongArray126 = new long[8];
	}

	void method616(byte[] is, int i) {
		aByteArray131[anInt133 * 249521533] |= 128 >>> (anInt132 * 1202043573 & 0x7);
		anInt133 += 206306261;
		if (anInt133 * 249521533 > 32) {
			while (249521533 * anInt133 < 64)
				aByteArray131[(anInt133 += 206306261) * 249521533 - 1] = (byte) 0;
			method617(1837492386);
			anInt133 = 0;
		}
		while (249521533 * anInt133 < 32)
			aByteArray131[(anInt133 += 206306261) * 249521533 - 1] = (byte) 0;
		System.arraycopy(aByteArray130, 0, aByteArray131, 32, 32);
		method617(1963343039);
		int i_30_ = 0;
		int i_31_ = i;
		while (i_30_ < 8) {
			long l = aLongArray137[i_30_];
			is[i_31_] = (byte) (int) (l >>> 56);
			is[1 + i_31_] = (byte) (int) (l >>> 48);
			is[2 + i_31_] = (byte) (int) (l >>> 40);
			is[3 + i_31_] = (byte) (int) (l >>> 32);
			is[i_31_ + 4] = (byte) (int) (l >>> 24);
			is[i_31_ + 5] = (byte) (int) (l >>> 16);
			is[6 + i_31_] = (byte) (int) (l >>> 8);
			is[i_31_ + 7] = (byte) (int) l;
			i_30_++;
			i_31_ += 8;
		}
	}

	void method617(int i) {
		int i_32_ = 0;
		int i_33_ = 0;
		while (i_32_ < 8) {
			aLongArray134[i_32_] = ((long) aByteArray131[i_33_] << 56 ^ ((long) aByteArray131[1 + i_33_] & 0xffL) << 48 ^ ((long) aByteArray131[2 + i_33_] & 0xffL) << 40 ^ ((long) aByteArray131[i_33_ + 3] & 0xffL) << 32 ^ ((long) aByteArray131[i_33_ + 4] & 0xffL) << 24 ^ ((long) aByteArray131[5 + i_33_] & 0xffL) << 16 ^ ((long) aByteArray131[i_33_ + 6] & 0xffL) << 8 ^ (long) aByteArray131[7 + i_33_] & 0xffL);
			i_32_++;
			i_33_ += 8;
		}
		for (i_32_ = 0; i_32_ < 8; i_32_++)
			aLongArray126[i_32_] = aLongArray134[i_32_] ^ (aLongArray124[i_32_] = aLongArray137[i_32_]);
		for (i_32_ = 1; i_32_ <= 10; i_32_++) {
			for (i_33_ = 0; i_33_ < 8; i_33_++) {
				aLongArray136[i_33_] = 0L;
				int i_34_ = 0;
				int i_35_ = 56;
				while (i_34_ < 8) {
					aLongArray136[i_33_] ^= (aLongArrayArray128[i_34_][(int) (aLongArray124[i_33_ - i_34_ & 0x7] >>> i_35_) & 0xff]);
					i_34_++;
					i_35_ -= 8;
				}
			}
			for (i_33_ = 0; i_33_ < 8; i_33_++)
				aLongArray124[i_33_] = aLongArray136[i_33_];
			aLongArray124[0] ^= aLongArray135[i_32_];
			for (i_33_ = 0; i_33_ < 8; i_33_++) {
				aLongArray136[i_33_] = aLongArray124[i_33_];
				int i_36_ = 0;
				int i_37_ = 56;
				while (i_36_ < 8) {
					aLongArray136[i_33_] ^= (aLongArrayArray128[i_36_][(int) (aLongArray126[i_33_ - i_36_ & 0x7] >>> i_37_) & 0xff]);
					i_36_++;
					i_37_ -= 8;
				}
			}
			for (i_33_ = 0; i_33_ < 8; i_33_++)
				aLongArray126[i_33_] = aLongArray136[i_33_];
		}
		for (i_32_ = 0; i_32_ < 8; i_32_++)
			aLongArray137[i_32_] ^= aLongArray126[i_32_] ^ aLongArray134[i_32_];
	}

	static void method618(Class699 class699, int i) {
		Class45.aClass699_522 = class699;
	}
}

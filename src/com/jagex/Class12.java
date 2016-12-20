/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class12 {
	static final int anInt161 = 512;
	public static final int anInt162 = 64;
	long[] aLongArray163;
	static final String aString164 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	static long[][] aLongArrayArray165 = new long[8][256];
	static long[] aLongArray166 = new long[11];
	byte[] aByteArray167 = new byte[32];
	byte[] aByteArray168 = new byte[64];
	int anInt169 = 0;
	int anInt170 = 0;
	long[] aLongArray171;
	long[] aLongArray172;
	long[] aLongArray173;
	long[] aLongArray174;
	static final int anInt175 = 10;
	public static int anInt176;

	public static byte[] method686(byte[] is, int i, int i_0_) {
		byte[] is_1_;
		if (i > 0) {
			is_1_ = new byte[i_0_];
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
				is_1_[i_2_] = is[i + i_2_];
		} else
			is_1_ = is;
		Class12 class12 = new Class12();
		class12.method688(1436164855);
		class12.method692(is_1_, (long) (i_0_ * 8));
		byte[] is_3_ = new byte[64];
		class12.method690(is_3_, 0, (byte) 0);
		return is_3_;
	}

	void method687(int i) {
		int i_4_ = 0;
		int i_5_ = 0;
		while (i_4_ < 8) {
			aLongArray174[i_4_] = ((long) aByteArray168[i_5_] << 56 ^ ((long) aByteArray168[1 + i_5_] & 0xffL) << 48 ^ ((long) aByteArray168[2 + i_5_] & 0xffL) << 40 ^ ((long) aByteArray168[3 + i_5_] & 0xffL) << 32 ^ ((long) aByteArray168[i_5_ + 4] & 0xffL) << 24 ^ ((long) aByteArray168[5 + i_5_] & 0xffL) << 16 ^ ((long) aByteArray168[i_5_ + 6] & 0xffL) << 8 ^ (long) aByteArray168[7 + i_5_] & 0xffL);
			i_4_++;
			i_5_ += 8;
		}
		for (i_4_ = 0; i_4_ < 8; i_4_++)
			aLongArray172[i_4_] = aLongArray174[i_4_] ^ (aLongArray171[i_4_] = aLongArray163[i_4_]);
		for (i_4_ = 1; i_4_ <= 10; i_4_++) {
			for (i_5_ = 0; i_5_ < 8; i_5_++) {
				aLongArray173[i_5_] = 0L;
				int i_6_ = 0;
				int i_7_ = 56;
				while (i_6_ < 8) {
					aLongArray173[i_5_] ^= (aLongArrayArray165[i_6_][((int) (aLongArray171[i_5_ - i_6_ & 0x7] >>> i_7_) & 0xff)]);
					i_6_++;
					i_7_ -= 8;
				}
			}
			for (i_5_ = 0; i_5_ < 8; i_5_++)
				aLongArray171[i_5_] = aLongArray173[i_5_];
			aLongArray171[0] ^= aLongArray166[i_4_];
			for (i_5_ = 0; i_5_ < 8; i_5_++) {
				aLongArray173[i_5_] = aLongArray171[i_5_];
				int i_8_ = 0;
				int i_9_ = 56;
				while (i_8_ < 8) {
					aLongArray173[i_5_] ^= (aLongArrayArray165[i_8_][((int) (aLongArray172[i_5_ - i_8_ & 0x7] >>> i_9_) & 0xff)]);
					i_8_++;
					i_9_ -= 8;
				}
			}
			for (i_5_ = 0; i_5_ < 8; i_5_++)
				aLongArray172[i_5_] = aLongArray173[i_5_];
		}
		for (i_4_ = 0; i_4_ < 8; i_4_++)
			aLongArray163[i_4_] ^= aLongArray172[i_4_] ^ aLongArray174[i_4_];
	}

	void method688(int i) {
		for (int i_10_ = 0; i_10_ < 32; i_10_++)
			aByteArray167[i_10_] = (byte) 0;
		anInt170 = 0;
		anInt169 = 0;
		aByteArray168[0] = (byte) 0;
		for (int i_11_ = 0; i_11_ < 8; i_11_++)
			aLongArray163[i_11_] = 0L;
	}

	void method689() {
		for (int i = 0; i < 32; i++)
			aByteArray167[i] = (byte) 0;
		anInt170 = 0;
		anInt169 = 0;
		aByteArray168[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray163[i] = 0L;
	}

	void method690(byte[] is, int i, byte i_12_) {
		aByteArray168[anInt170 * -659739331] |= 128 >>> (anInt169 * -633337539 & 0x7);
		anInt170 += 316740117;
		if (-659739331 * anInt170 > 32) {
			while (-659739331 * anInt170 < 64)
				aByteArray168[(anInt170 += 316740117) * -659739331 - 1] = (byte) 0;
			method687(2081036770);
			anInt170 = 0;
		}
		while (-659739331 * anInt170 < 32)
			aByteArray168[(anInt170 += 316740117) * -659739331 - 1] = (byte) 0;
		System.arraycopy(aByteArray167, 0, aByteArray168, 32, 32);
		method687(2081036770);
		int i_13_ = 0;
		int i_14_ = i;
		while (i_13_ < 8) {
			long l = aLongArray163[i_13_];
			is[i_14_] = (byte) (int) (l >>> 56);
			is[i_14_ + 1] = (byte) (int) (l >>> 48);
			is[i_14_ + 2] = (byte) (int) (l >>> 40);
			is[3 + i_14_] = (byte) (int) (l >>> 32);
			is[4 + i_14_] = (byte) (int) (l >>> 24);
			is[5 + i_14_] = (byte) (int) (l >>> 16);
			is[i_14_ + 6] = (byte) (int) (l >>> 8);
			is[7 + i_14_] = (byte) (int) l;
			i_13_++;
			i_14_ += 8;
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_15_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			long l = ((i & 0x1) == 0 ? (long) (i_15_ >>> 8) : (long) (i_15_ & 0xff));
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
			aLongArrayArray165[0][i] = (l << 56 | l << 48 | l_17_ << 40 | l << 32 | l_19_ << 24 | l_18_ << 16 | l_16_ << 8 | l_20_);
			for (int i_21_ = 1; i_21_ < 8; i_21_++)
				aLongArrayArray165[i_21_][i] = (aLongArrayArray165[i_21_ - 1][i] >>> 8 | aLongArrayArray165[i_21_ - 1][i] << 56);
		}
		aLongArray166[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_22_ = (i - 1) * 8;
			aLongArray166[i] = (aLongArrayArray165[0][i_22_] & ~0xffffffffffffffL ^ aLongArrayArray165[1][i_22_ + 1] & 0xff000000000000L ^ aLongArrayArray165[2][2 + i_22_] & 0xff0000000000L ^ aLongArrayArray165[3][i_22_ + 3] & 0xff00000000L ^ aLongArrayArray165[4][i_22_ + 4] & 0xff000000L ^ aLongArrayArray165[5][i_22_ + 5] & 0xff0000L ^ aLongArrayArray165[6][6 + i_22_] & 0xff00L ^ aLongArrayArray165[7][7 + i_22_] & 0xffL);
		}
	}

	void method691() {
		int i = 0;
		int i_23_ = 0;
		while (i < 8) {
			aLongArray174[i] = ((long) aByteArray168[i_23_] << 56 ^ ((long) aByteArray168[1 + i_23_] & 0xffL) << 48 ^ ((long) aByteArray168[2 + i_23_] & 0xffL) << 40 ^ ((long) aByteArray168[3 + i_23_] & 0xffL) << 32 ^ ((long) aByteArray168[i_23_ + 4] & 0xffL) << 24 ^ ((long) aByteArray168[5 + i_23_] & 0xffL) << 16 ^ ((long) aByteArray168[i_23_ + 6] & 0xffL) << 8 ^ (long) aByteArray168[7 + i_23_] & 0xffL);
			i++;
			i_23_ += 8;
		}
		for (i = 0; i < 8; i++)
			aLongArray172[i] = aLongArray174[i] ^ (aLongArray171[i] = aLongArray163[i]);
		for (i = 1; i <= 10; i++) {
			for (i_23_ = 0; i_23_ < 8; i_23_++) {
				aLongArray173[i_23_] = 0L;
				int i_24_ = 0;
				int i_25_ = 56;
				while (i_24_ < 8) {
					aLongArray173[i_23_] ^= (aLongArrayArray165[i_24_][(int) (aLongArray171[i_23_ - i_24_ & 0x7] >>> i_25_) & 0xff]);
					i_24_++;
					i_25_ -= 8;
				}
			}
			for (i_23_ = 0; i_23_ < 8; i_23_++)
				aLongArray171[i_23_] = aLongArray173[i_23_];
			aLongArray171[0] ^= aLongArray166[i];
			for (i_23_ = 0; i_23_ < 8; i_23_++) {
				aLongArray173[i_23_] = aLongArray171[i_23_];
				int i_26_ = 0;
				int i_27_ = 56;
				while (i_26_ < 8) {
					aLongArray173[i_23_] ^= (aLongArrayArray165[i_26_][(int) (aLongArray172[i_23_ - i_26_ & 0x7] >>> i_27_) & 0xff]);
					i_26_++;
					i_27_ -= 8;
				}
			}
			for (i_23_ = 0; i_23_ < 8; i_23_++)
				aLongArray172[i_23_] = aLongArray173[i_23_];
		}
		for (i = 0; i < 8; i++)
			aLongArray163[i] ^= aLongArray172[i] ^ aLongArray174[i];
	}

	void method692(byte[] is, long l) {
		int i = 0;
		int i_28_ = 8 - ((int) l & 0x7) & 0x7;
		int i_29_ = anInt169 * -633337539 & 0x7;
		long l_30_ = l;
		int i_31_ = 31;
		int i_32_ = 0;
		for (/**/; i_31_ >= 0; i_31_--) {
			i_32_ += (aByteArray167[i_31_] & 0xff) + ((int) l_30_ & 0xff);
			aByteArray167[i_31_] = (byte) i_32_;
			i_32_ >>>= 8;
			l_30_ >>>= 8;
		}
		while (l > 8L) {
			int i_33_ = is[i] << i_28_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_28_;
			if (i_33_ < 0 || i_33_ >= 256)
				throw new RuntimeException();
			aByteArray168[anInt170 * -659739331] |= i_33_ >>> i_29_;
			anInt170 += 316740117;
			anInt169 += 1862538773 * (8 - i_29_);
			if (512 == anInt169 * -633337539) {
				method687(2081036770);
				anInt170 = 0;
				anInt169 = 0;
			}
			aByteArray168[anInt170 * -659739331] = (byte) (i_33_ << 8 - i_29_ & 0xff);
			anInt169 += 1862538773 * i_29_;
			l -= 8L;
			i++;
		}
		int i_34_;
		if (l > 0L) {
			i_34_ = is[i] << i_28_ & 0xff;
			aByteArray168[anInt170 * -659739331] |= i_34_ >>> i_29_;
		} else
			i_34_ = 0;
		if (l + (long) i_29_ < 8L)
			anInt169 += l * 1862538773L;
		else {
			anInt170 += 316740117;
			anInt169 += 1862538773 * (8 - i_29_);
			l -= (long) (8 - i_29_);
			if (anInt169 * -633337539 == 512) {
				method687(2081036770);
				anInt170 = 0;
				anInt169 = 0;
			}
			aByteArray168[anInt170 * -659739331] = (byte) (i_34_ << 8 - i_29_ & 0xff);
			anInt169 += (int) l * 1862538773;
		}
	}

	Class12() {
		aLongArray163 = new long[8];
		aLongArray171 = new long[8];
		aLongArray173 = new long[8];
		aLongArray174 = new long[8];
		aLongArray172 = new long[8];
	}

	public static byte[] method693(byte[] is, int i, int i_35_) {
		byte[] is_36_;
		if (i > 0) {
			is_36_ = new byte[i_35_];
			for (int i_37_ = 0; i_37_ < i_35_; i_37_++)
				is_36_[i_37_] = is[i + i_37_];
		} else
			is_36_ = is;
		Class12 class12 = new Class12();
		class12.method688(409432891);
		class12.method692(is_36_, (long) (i_35_ * 8));
		byte[] is_38_ = new byte[64];
		class12.method690(is_38_, 0, (byte) -20);
		return is_38_;
	}

	void method694(byte[] is, long l) {
		int i = 0;
		int i_39_ = 8 - ((int) l & 0x7) & 0x7;
		int i_40_ = anInt169 * -633337539 & 0x7;
		long l_41_ = l;
		int i_42_ = 31;
		int i_43_ = 0;
		for (/**/; i_42_ >= 0; i_42_--) {
			i_43_ += (aByteArray167[i_42_] & 0xff) + ((int) l_41_ & 0xff);
			aByteArray167[i_42_] = (byte) i_43_;
			i_43_ >>>= 8;
			l_41_ >>>= 8;
		}
		while (l > 8L) {
			int i_44_ = is[i] << i_39_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_39_;
			if (i_44_ < 0 || i_44_ >= 256)
				throw new RuntimeException();
			aByteArray168[anInt170 * -659739331] |= i_44_ >>> i_40_;
			anInt170 += 316740117;
			anInt169 += 1862538773 * (8 - i_40_);
			if (512 == anInt169 * -633337539) {
				method687(2081036770);
				anInt170 = 0;
				anInt169 = 0;
			}
			aByteArray168[anInt170 * -659739331] = (byte) (i_44_ << 8 - i_40_ & 0xff);
			anInt169 += 1862538773 * i_40_;
			l -= 8L;
			i++;
		}
		int i_45_;
		if (l > 0L) {
			i_45_ = is[i] << i_39_ & 0xff;
			aByteArray168[anInt170 * -659739331] |= i_45_ >>> i_40_;
		} else
			i_45_ = 0;
		if (l + (long) i_40_ < 8L)
			anInt169 += l * 1862538773L;
		else {
			anInt170 += 316740117;
			anInt169 += 1862538773 * (8 - i_40_);
			l -= (long) (8 - i_40_);
			if (anInt169 * -633337539 == 512) {
				method687(2081036770);
				anInt170 = 0;
				anInt169 = 0;
			}
			aByteArray168[anInt170 * -659739331] = (byte) (i_45_ << 8 - i_40_ & 0xff);
			anInt169 += (int) l * 1862538773;
		}
	}

	void method695() {
		for (int i = 0; i < 32; i++)
			aByteArray167[i] = (byte) 0;
		anInt170 = 0;
		anInt169 = 0;
		aByteArray168[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray163[i] = 0L;
	}

	void method696() {
		for (int i = 0; i < 32; i++)
			aByteArray167[i] = (byte) 0;
		anInt170 = 0;
		anInt169 = 0;
		aByteArray168[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray163[i] = 0L;
	}

	static boolean method697(int i, int i_46_, int i_47_, byte i_48_) {
		Class555 class555 = client.aClass509_11072.method8314(1020651968);
		boolean bool = true;
		Interface62 interface62 = (Interface62) class555.method9377(i, i_46_, i_47_, -910262463);
		if (interface62 != null)
			bool &= Class245.method4628(interface62, (byte) 1);
		interface62 = (Interface62) class555.method9254(i, i_46_, i_47_, client.anInterface63_11303, 113989023);
		if (interface62 != null)
			bool &= Class245.method4628(interface62, (byte) 1);
		interface62 = (Interface62) class555.method9256(i, i_46_, i_47_, -287395137);
		if (null != interface62)
			bool &= Class245.method4628(interface62, (byte) 1);
		return bool;
	}

	static final void method698(Class665 class665, short i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anInt8526 -= 204761682;
		int i_49_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_50_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = string.indexOf(i_49_, i_50_);
	}

	static final void method699(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (string.startsWith(Class202.method3775(0, 1969360044)) || string.startsWith(Class202.method3775(1, 1970495605)))
			string = string.substring(7);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class628.method10416(string, -1845376457) ? 1 : 0;
	}
}

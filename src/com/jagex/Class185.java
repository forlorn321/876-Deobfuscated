/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class185 {
	static final int anInt2106 = 2;
	static short[] aShortArray2107;
	static short[] aShortArray2108;
	short[] aShortArray2109;
	static short[] aShortArray2110;
	static byte[] aByteArray2111;
	short[] aShortArray2112;
	int anInt2113;
	short[] aShortArray2114;
	static short[] aShortArray2115 = new short[500];
	short[] aShortArray2116;
	static short[] aShortArray2117;
	Class536_Sub17 aClass536_Sub17_2118 = null;
	short[] aShortArray2119;
	boolean aBool2120;
	boolean aBool2121;
	boolean aBool2122;
	byte[] aByteArray2123;
	static final int anInt2124 = 1;
	static final int anInt2125 = 2;

	Class185(byte[] is, Class536_Sub17 class536_sub17) {
		anInt2113 = 0;
		aBool2120 = false;
		aBool2121 = false;
		aBool2122 = false;
		aClass536_Sub17_2118 = class536_sub17;
		try {
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			RSByteBuffer class536_sub33_0_ = new RSByteBuffer(is);
			int i = class536_sub33.readUnsignedByte(-8846425);
			class536_sub33.off += 1032351030;
			int i_1_ = class536_sub33.readUnsignedShort((short) 13207);
			int i_2_ = 0;
			int i_3_ = -1;
			int i_4_ = -1;
			class536_sub33_0_.off = (class536_sub33.off * -810172525 + i_1_) * 516175515;
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
				int i_6_ = aClass536_Sub17_2118.anIntArray10505[i_5_];
				if (i_6_ == 0)
					i_3_ = i_5_;
				int i_7_ = class536_sub33.readUnsignedByte(478113382);
				if (i_7_ > 0) {
					if (i_6_ == 0)
						i_4_ = i_5_;
					aShortArray2115[i_2_] = (short) i_5_;
					short i_8_ = 0;
					if (i_6_ == 3 || i_6_ == 10)
						i_8_ = (short) 128;
					if (i >= 2 && i_6_ == 7) {
						if ((i_7_ & 0x1) != 0) {
							aShortArray2107[i_2_] = (short) class536_sub33_0_.method9717(-145257913);
							class536_sub33_0_.method9717(522907877);
						} else
							aShortArray2107[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0) {
							aShortArray2108[i_2_] = (short) class536_sub33_0_.method9717(-1066351475);
							class536_sub33_0_.method9717(1027480271);
						} else
							aShortArray2108[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0) {
							aShortArray2117[i_2_] = (short) class536_sub33_0_.method9717(-555658531);
							class536_sub33_0_.method9717(1985349763);
						} else
							aShortArray2117[i_2_] = i_8_;
					} else {
						if ((i_7_ & 0x1) != 0)
							aShortArray2107[i_2_] = (short) class536_sub33_0_.method9717(-16650746);
						else
							aShortArray2107[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0)
							aShortArray2108[i_2_] = (short) class536_sub33_0_.method9717(-1445160206);
						else
							aShortArray2108[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0)
							aShortArray2117[i_2_] = (short) class536_sub33_0_.method9717(1434934005);
						else
							aShortArray2117[i_2_] = i_8_;
					}
					aByteArray2111[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
					if (i_6_ == 2 || i_6_ == 9) {
						aShortArray2107[i_2_] = (short) (aShortArray2107[i_2_] << 2 & 0x3fff);
						aShortArray2108[i_2_] = (short) (aShortArray2108[i_2_] << 2 & 0x3fff);
						aShortArray2117[i_2_] = (short) (aShortArray2117[i_2_] << 2 & 0x3fff);
					}
					aShortArray2110[i_2_] = (short) -1;
					if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
						if (i_3_ > i_4_) {
							aShortArray2110[i_2_] = (short) i_3_;
							i_4_ = i_3_;
						}
					} else if (i_6_ == 5)
						aBool2120 = true;
					else if (i_6_ == 7)
						aBool2121 = true;
					else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
						aBool2122 = true;
					i_2_++;
				}
			}
			if (class536_sub33_0_.off * -810172525 != is.length)
				throw new RuntimeException();
			anInt2113 = i_2_;
			aShortArray2119 = new short[i_2_];
			aShortArray2112 = new short[i_2_];
			aShortArray2116 = new short[i_2_];
			aShortArray2114 = new short[i_2_];
			aShortArray2109 = new short[i_2_];
			aByteArray2123 = new byte[i_2_];
			for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
				aShortArray2119[i_9_] = aShortArray2115[i_9_];
				aShortArray2112[i_9_] = aShortArray2107[i_9_];
				aShortArray2116[i_9_] = aShortArray2108[i_9_];
				aShortArray2114[i_9_] = aShortArray2117[i_9_];
				aShortArray2109[i_9_] = aShortArray2110[i_9_];
				aByteArray2123[i_9_] = aByteArray2111[i_9_];
			}
		} catch (Exception exception) {
			anInt2113 = 0;
			aBool2120 = false;
			aBool2121 = false;
		}
	}

	static {
		aShortArray2107 = new short[500];
		aShortArray2108 = new short[500];
		aShortArray2117 = new short[500];
		aShortArray2110 = new short[500];
		aByteArray2111 = new byte[500];
	}
}

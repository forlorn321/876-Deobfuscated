/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class164 {
	short[] aShortArray1811;
	static short[] aShortArray1812 = new short[500];
	static short[] aShortArray1813;
	static short[] aShortArray1814;
	static short[] aShortArray1815;
	byte[] aByteArray1816;
	Class527_Sub3 aClass527_Sub3_1817 = null;
	static byte[] aByteArray1818;
	static short[] aShortArray1819 = new short[500];
	short[] aShortArray1820;
	short[] aShortArray1821;
	short[] aShortArray1822;
	short[] aShortArray1823;
	static final int anInt1824 = 1;
	boolean aBool1825;
	boolean aBool1826;
	boolean aBool1827;
	int anInt1828 = 0;
	static final int anInt1829 = 2;
	static final int anInt1830 = 2;

	Class164(byte[] is, Class527_Sub3 class527_sub3) {
		aBool1825 = false;
		aBool1826 = false;
		aBool1827 = false;
		aClass527_Sub3_1817 = class527_sub3;
		try {
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			RSByteBuffer class527_sub38_0_ = new RSByteBuffer(is);
			int i = class527_sub38.readUnsignedByte();
			class527_sub38.anInt10689 += -1345465534;
			int i_1_ = class527_sub38.readUnsignedShort();
			int i_2_ = 0;
			int i_3_ = -1;
			int i_4_ = -1;
			class527_sub38_0_.anInt10689 = (class527_sub38.anInt10689 * -441238943 + i_1_) * 1474750881;
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
				int i_6_ = aClass527_Sub3_1817.anIntArray10367[i_5_];
				if (i_6_ == 0)
					i_3_ = i_5_;
				int i_7_ = class527_sub38.readUnsignedByte();
				if (i_7_ > 0) {
					if (i_6_ == 0)
						i_4_ = i_5_;
					aShortArray1812[i_2_] = (short) i_5_;
					short i_8_ = 0;
					if (i_6_ == 3 || i_6_ == 10)
						i_8_ = (short) 128;
					if (i >= 2 && i_6_ == 7) {
						if ((i_7_ & 0x1) != 0) {
							aShortArray1819[i_2_] = (short) class527_sub38_0_.readSmartVariant(983912765);
							class527_sub38_0_.readSmartVariant(983912765);
						} else
							aShortArray1819[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0) {
							aShortArray1813[i_2_] = (short) class527_sub38_0_.readSmartVariant(983912765);
							class527_sub38_0_.readSmartVariant(983912765);
						} else
							aShortArray1813[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0) {
							aShortArray1814[i_2_] = (short) class527_sub38_0_.readSmartVariant(983912765);
							class527_sub38_0_.readSmartVariant(983912765);
						} else
							aShortArray1814[i_2_] = i_8_;
					} else {
						if ((i_7_ & 0x1) != 0)
							aShortArray1819[i_2_] = (short) class527_sub38_0_.readSmartVariant(983912765);
						else
							aShortArray1819[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0)
							aShortArray1813[i_2_] = (short) class527_sub38_0_.readSmartVariant(983912765);
						else
							aShortArray1813[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0)
							aShortArray1814[i_2_] = (short) class527_sub38_0_.readSmartVariant(983912765);
						else
							aShortArray1814[i_2_] = i_8_;
					}
					aByteArray1818[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
					if (i_6_ == 2 || i_6_ == 9) {
						aShortArray1819[i_2_] = (short) (aShortArray1819[i_2_] << 2 & 0x3fff);
						aShortArray1813[i_2_] = (short) (aShortArray1813[i_2_] << 2 & 0x3fff);
						aShortArray1814[i_2_] = (short) (aShortArray1814[i_2_] << 2 & 0x3fff);
					}
					aShortArray1815[i_2_] = (short) -1;
					if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
						if (i_3_ > i_4_) {
							aShortArray1815[i_2_] = (short) i_3_;
							i_4_ = i_3_;
						}
					} else if (i_6_ == 5)
						aBool1825 = true;
					else if (i_6_ == 7)
						aBool1826 = true;
					else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
						aBool1827 = true;
					i_2_++;
				}
			}
			if (class527_sub38_0_.anInt10689 * -441238943 != is.length)
				throw new RuntimeException();
			anInt1828 = i_2_;
			aShortArray1821 = new short[i_2_];
			aShortArray1820 = new short[i_2_];
			aShortArray1811 = new short[i_2_];
			aShortArray1822 = new short[i_2_];
			aShortArray1823 = new short[i_2_];
			aByteArray1816 = new byte[i_2_];
			for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
				aShortArray1821[i_9_] = aShortArray1812[i_9_];
				aShortArray1820[i_9_] = aShortArray1819[i_9_];
				aShortArray1811[i_9_] = aShortArray1813[i_9_];
				aShortArray1822[i_9_] = aShortArray1814[i_9_];
				aShortArray1823[i_9_] = aShortArray1815[i_9_];
				aByteArray1816[i_9_] = aByteArray1818[i_9_];
			}
		} catch (Exception exception) {
			anInt1828 = 0;
			aBool1825 = false;
			aBool1826 = false;
		}
	}

	static {
		aShortArray1813 = new short[500];
		aShortArray1814 = new short[500];
		aShortArray1815 = new short[500];
		aByteArray1818 = new byte[500];
	}
}

/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class181 {
	static final int anInt1995 = 1;
	static final int anInt1996 = 0;
	static final int anInt1997 = 0;

	public static Class179 method2717(Class461 class461, int i) {
		byte[] is = class461.method5595(i, -1841100409);
		if (is == null)
			return null;
		return method2721(is)[0];
	}

	Class181() throws Throwable {
		throw new Error();
	}

	public static Class179 method2718(Class461 class461, int i, int i_0_) {
		byte[] is = class461.method5556(i, i_0_, (byte) 1);
		if (is == null)
			return null;
		return method2721(is)[0];
	}

	public static Class179[] method2719(Class461 class461, int i) {
		byte[] is = class461.method5595(i, -815817023);
		if (is == null)
			return null;
		return method2721(is);
	}

	public static Class179[] method2720(Class461 class461, int i, int i_1_) {
		byte[] is = class461.method5556(i, i_1_, (byte) 1);
		if (is == null)
			return null;
		return method2721(is);
	}

	public static Class179[] method2721(byte[] is) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		class536_sub33.off = (is.length - 2) * 516175515;
		int i = class536_sub33.readUnsignedShort();
		int i_2_ = i >> 15;
		int i_3_ = i & 0x7fff;
		if (i_2_ == 0) {
			Class179_Sub2[] class179_sub2s = new Class179_Sub2[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				class179_sub2s[i_4_] = new Class179_Sub2();
			class536_sub33.off = (is.length - 7 - i_3_ * 8) * 516175515;
			int i_5_ = class536_sub33.readUnsignedShort();
			int i_6_ = class536_sub33.readUnsignedShort();
			int i_7_ = (class536_sub33.readUnsignedByte(917268361) & 0xff) + 1;
			for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
				class179_sub2s[i_8_].anInt9815 = class536_sub33.readUnsignedShort();
			for (int i_9_ = 0; i_9_ < i_3_; i_9_++)
				class179_sub2s[i_9_].anInt9819 = class536_sub33.readUnsignedShort();
			for (int i_10_ = 0; i_10_ < i_3_; i_10_++)
				class179_sub2s[i_10_].anInt9817 = class536_sub33.readUnsignedShort();
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++)
				class179_sub2s[i_11_].anInt9814 = class536_sub33.readUnsignedShort();
			for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
				Class179_Sub2 class179_sub2 = class179_sub2s[i_12_];
				class179_sub2.anInt9816 = i_5_ - class179_sub2.anInt9817 - class179_sub2.anInt9815;
				class179_sub2.anInt9818 = i_6_ - class179_sub2.anInt9814 - class179_sub2.anInt9819;
			}
			class536_sub33.off = (is.length - 7 - i_3_ * 8 - (i_7_ - 1) * 3) * 516175515;
			int[] is_13_ = new int[i_7_];
			for (int i_14_ = 1; i_14_ < i_7_; i_14_++) {
				is_13_[i_14_] = class536_sub33.read24BitUnsignedInteger(1833446094);
				if (is_13_[i_14_] == 0)
					is_13_[i_14_] = 1;
			}
			for (int i_15_ = 0; i_15_ < i_3_; i_15_++)
				class179_sub2s[i_15_].anIntArray9813 = is_13_;
			class536_sub33.off = 0;
			for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
				Class179_Sub2 class179_sub2 = class179_sub2s[i_16_];
				int i_17_ = class179_sub2.anInt9817 * class179_sub2.anInt9814;
				class179_sub2.aByteArray9820 = new byte[i_17_];
				int i_18_ = class536_sub33.readUnsignedByte(470459605);
				if ((i_18_ & 0x2) == 0) {
					if ((i_18_ & 0x1) == 0) {
						for (int i_19_ = 0; i_19_ < i_17_; i_19_++)
							class179_sub2.aByteArray9820[i_19_] = class536_sub33.readByte();
					} else {
						for (int i_20_ = 0; i_20_ < class179_sub2.anInt9817; i_20_++) {
							for (int i_21_ = 0; i_21_ < class179_sub2.anInt9814; i_21_++)
								class179_sub2.aByteArray9820[i_20_ + i_21_ * class179_sub2.anInt9817] = class536_sub33.readByte();
						}
					}
				} else {
					boolean bool = false;
					class179_sub2.aByteArray9821 = new byte[i_17_];
					if ((i_18_ & 0x1) == 0) {
						for (int i_22_ = 0; i_22_ < i_17_; i_22_++)
							class179_sub2.aByteArray9820[i_22_] = class536_sub33.readByte();
						for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
							byte i_24_ = (class179_sub2.aByteArray9821[i_23_] = class536_sub33.readByte());
							bool = bool | i_24_ != -1;
						}
					} else {
						for (int i_25_ = 0; i_25_ < class179_sub2.anInt9817; i_25_++) {
							for (int i_26_ = 0; i_26_ < class179_sub2.anInt9814; i_26_++)
								class179_sub2.aByteArray9820[i_25_ + i_26_ * class179_sub2.anInt9817] = class536_sub33.readByte();
						}
						for (int i_27_ = 0; i_27_ < class179_sub2.anInt9817; i_27_++) {
							for (int i_28_ = 0; i_28_ < class179_sub2.anInt9814; i_28_++) {
								byte i_29_ = (class179_sub2.aByteArray9821[i_27_ + i_28_ * (class179_sub2.anInt9817)] = class536_sub33.readByte());
								bool = bool | i_29_ != -1;
							}
						}
					}
					if (!bool)
						class179_sub2.aByteArray9821 = null;
				}
			}
			return class179_sub2s;
		}
		Class179_Sub1[] class179_sub1s = new Class179_Sub1[i_3_];
		class536_sub33.off = 0;
		int i_30_ = class536_sub33.readUnsignedByte(1951396870);
		if (i_30_ == 0) {
			boolean bool = class536_sub33.readUnsignedByte(-355622771) == 1;
			int i_31_ = class536_sub33.readUnsignedShort();
			int i_32_ = class536_sub33.readUnsignedShort();
			for (int i_33_ = 0; i_33_ < i_3_; i_33_++) {
				int[] is_34_ = new int[i_31_ * i_32_];
				for (int i_35_ = 0; i_35_ < i_31_ * i_32_; i_35_++) {
					is_34_[i_35_] = ~0xffffff | class536_sub33.read24BitUnsignedInteger(1166802001);
					if (is_34_[i_35_] == -65281)
						is_34_[i_35_] = 0;
				}
				if (bool) {
					for (int i_36_ = 0; i_36_ < i_31_ * i_32_; i_36_++) {
						is_34_[i_36_] &= 0xffffff;
						is_34_[i_36_] |= class536_sub33.readUnsignedByte(-1812746657) << 24;
					}
				}
				class179_sub1s[i_33_] = new Class179_Sub1(i_31_, i_32_, is_34_);
			}
		} else {
			if (i_30_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class179_sub1s;
	}
}

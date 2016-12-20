/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class7 implements Interface14, Interface7 {
	public boolean aBool64;
	public int anInt65;
	public int anInt66;
	public int anInt67;
	public boolean aBool68;
	public int anInt69;
	public int anInt70;
	int anInt71 = 0;
	public int anInt72;

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method594(class527_sub38, i, -1538845007);
		}
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method594(class527_sub38, i_0_, -1538845007);
		}
	}

	public void method60(int i) {
		/* empty */
	}

	void method587(int i, int i_1_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_2_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_3_ = (double) (i & 0xff) / 256.0;
		double d_4_ = d;
		if (d_2_ < d_4_)
			d_4_ = d_2_;
		if (d_3_ < d_4_)
			d_4_ = d_3_;
		double d_5_ = d;
		if (d_2_ > d_5_)
			d_5_ = d_2_;
		if (d_3_ > d_5_)
			d_5_ = d_3_;
		double d_6_ = 0.0;
		double d_7_ = 0.0;
		double d_8_ = (d_5_ + d_4_) / 2.0;
		if (d_4_ != d_5_) {
			if (d_8_ < 0.5)
				d_7_ = (d_5_ - d_4_) / (d_4_ + d_5_);
			if (d_8_ >= 0.5)
				d_7_ = (d_5_ - d_4_) / (2.0 - d_5_ - d_4_);
			if (d_5_ == d)
				d_6_ = (d_2_ - d_3_) / (d_5_ - d_4_);
			else if (d_5_ == d_2_)
				d_6_ = 2.0 + (d_3_ - d) / (d_5_ - d_4_);
			else if (d_5_ == d_3_)
				d_6_ = 4.0 + (d - d_2_) / (d_5_ - d_4_);
		}
		d_6_ /= 6.0;
		anInt70 = (int) (256.0 * d_7_) * -1565216439;
		anInt69 = (int) (d_8_ * 256.0) * -99905543;
		if (-1261235975 * anInt70 < 0)
			anInt70 = 0;
		else if (-1261235975 * anInt70 > 255)
			anInt70 = 301766583;
		if (anInt69 * -2060189111 < 0)
			anInt69 = 0;
		else if (-2060189111 * anInt69 > 255)
			anInt69 = 293890311;
		if (d_8_ > 0.5)
			anInt72 = 175430581 * (int) (d_7_ * (1.0 - d_8_) * 512.0);
		else
			anInt72 = (int) (512.0 * (d_8_ * d_7_)) * 175430581;
		if (-1916962147 * anInt72 < 1)
			anInt72 = 175430581;
		anInt65 = -132868013 * (int) ((double) (-1916962147 * anInt72) * d_6_);
	}

	public void method85() {
		/* empty */
	}

	public void method16(int i, int i_9_) {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method594(class527_sub38, i, -1538845007);
		}
	}

	void method588(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			anInt71 = class527_sub38.read24BitUnsignedInteger(332963371) * 1930095843;
			method587(anInt71 * -619595573, 1344019253);
		} else if (2 == i) {
			anInt67 = class527_sub38.readUnsignedShort() * -2095899221;
			if (65535 == anInt67 * 1277621507)
				anInt67 = 2095899221;
		} else if (i == 3)
			anInt66 = (class527_sub38.readUnsignedShort() << 2) * -277539959;
		else if (i == 4)
			aBool64 = false;
		else if (i == 5)
			aBool68 = false;
	}

	public void method86(int i) {
		/* empty */
	}

	void method589(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_10_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_11_ = (double) (i & 0xff) / 256.0;
		double d_12_ = d;
		if (d_10_ < d_12_)
			d_12_ = d_10_;
		if (d_11_ < d_12_)
			d_12_ = d_11_;
		double d_13_ = d;
		if (d_10_ > d_13_)
			d_13_ = d_10_;
		if (d_11_ > d_13_)
			d_13_ = d_11_;
		double d_14_ = 0.0;
		double d_15_ = 0.0;
		double d_16_ = (d_13_ + d_12_) / 2.0;
		if (d_12_ != d_13_) {
			if (d_16_ < 0.5)
				d_15_ = (d_13_ - d_12_) / (d_12_ + d_13_);
			if (d_16_ >= 0.5)
				d_15_ = (d_13_ - d_12_) / (2.0 - d_13_ - d_12_);
			if (d_13_ == d)
				d_14_ = (d_10_ - d_11_) / (d_13_ - d_12_);
			else if (d_13_ == d_10_)
				d_14_ = 2.0 + (d_11_ - d) / (d_13_ - d_12_);
			else if (d_13_ == d_11_)
				d_14_ = 4.0 + (d - d_10_) / (d_13_ - d_12_);
		}
		d_14_ /= 6.0;
		anInt70 = (int) (256.0 * d_15_) * -1565216439;
		anInt69 = (int) (d_16_ * 256.0) * -99905543;
		if (-1261235975 * anInt70 < 0)
			anInt70 = 0;
		else if (-1261235975 * anInt70 > 255)
			anInt70 = 301766583;
		if (anInt69 * -2060189111 < 0)
			anInt69 = 0;
		else if (-2060189111 * anInt69 > 255)
			anInt69 = 293890311;
		if (d_16_ > 0.5)
			anInt72 = 175430581 * (int) (d_15_ * (1.0 - d_16_) * 512.0);
		else
			anInt72 = (int) (512.0 * (d_16_ * d_15_)) * 175430581;
		if (-1916962147 * anInt72 < 1)
			anInt72 = 175430581;
		anInt65 = -132868013 * (int) ((double) (-1916962147 * anInt72) * d_14_);
	}

	Class7() {
		anInt67 = 2095899221;
		anInt66 = -366538240;
		aBool64 = true;
		aBool68 = true;
	}

	void method590(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			anInt71 = class527_sub38.read24BitUnsignedInteger(1970917744) * 1930095843;
			method587(anInt71 * -619595573, -1194186875);
		} else if (2 == i) {
			anInt67 = class527_sub38.readUnsignedShort() * -2095899221;
			if (65535 == anInt67 * 1277621507)
				anInt67 = 2095899221;
		} else if (i == 3)
			anInt66 = (class527_sub38.readUnsignedShort() << 2) * -277539959;
		else if (i == 4)
			aBool64 = false;
		else if (i == 5)
			aBool68 = false;
	}

	public void method84() {
		/* empty */
	}

	void method591(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_17_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_18_ = (double) (i & 0xff) / 256.0;
		double d_19_ = d;
		if (d_17_ < d_19_)
			d_19_ = d_17_;
		if (d_18_ < d_19_)
			d_19_ = d_18_;
		double d_20_ = d;
		if (d_17_ > d_20_)
			d_20_ = d_17_;
		if (d_18_ > d_20_)
			d_20_ = d_18_;
		double d_21_ = 0.0;
		double d_22_ = 0.0;
		double d_23_ = (d_20_ + d_19_) / 2.0;
		if (d_19_ != d_20_) {
			if (d_23_ < 0.5)
				d_22_ = (d_20_ - d_19_) / (d_19_ + d_20_);
			if (d_23_ >= 0.5)
				d_22_ = (d_20_ - d_19_) / (2.0 - d_20_ - d_19_);
			if (d_20_ == d)
				d_21_ = (d_17_ - d_18_) / (d_20_ - d_19_);
			else if (d_20_ == d_17_)
				d_21_ = 2.0 + (d_18_ - d) / (d_20_ - d_19_);
			else if (d_20_ == d_18_)
				d_21_ = 4.0 + (d - d_17_) / (d_20_ - d_19_);
		}
		d_21_ /= 6.0;
		anInt70 = (int) (256.0 * d_22_) * -1565216439;
		anInt69 = (int) (d_23_ * 256.0) * -99905543;
		if (-1261235975 * anInt70 < 0)
			anInt70 = 0;
		else if (-1261235975 * anInt70 > 255)
			anInt70 = 301766583;
		if (anInt69 * -2060189111 < 0)
			anInt69 = 0;
		else if (-2060189111 * anInt69 > 255)
			anInt69 = 293890311;
		if (d_23_ > 0.5)
			anInt72 = 175430581 * (int) (d_22_ * (1.0 - d_23_) * 512.0);
		else
			anInt72 = (int) (512.0 * (d_23_ * d_22_)) * 175430581;
		if (-1916962147 * anInt72 < 1)
			anInt72 = 175430581;
		anInt65 = -132868013 * (int) ((double) (-1916962147 * anInt72) * d_21_);
	}

	void method592(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_24_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_25_ = (double) (i & 0xff) / 256.0;
		double d_26_ = d;
		if (d_24_ < d_26_)
			d_26_ = d_24_;
		if (d_25_ < d_26_)
			d_26_ = d_25_;
		double d_27_ = d;
		if (d_24_ > d_27_)
			d_27_ = d_24_;
		if (d_25_ > d_27_)
			d_27_ = d_25_;
		double d_28_ = 0.0;
		double d_29_ = 0.0;
		double d_30_ = (d_27_ + d_26_) / 2.0;
		if (d_26_ != d_27_) {
			if (d_30_ < 0.5)
				d_29_ = (d_27_ - d_26_) / (d_26_ + d_27_);
			if (d_30_ >= 0.5)
				d_29_ = (d_27_ - d_26_) / (2.0 - d_27_ - d_26_);
			if (d_27_ == d)
				d_28_ = (d_24_ - d_25_) / (d_27_ - d_26_);
			else if (d_27_ == d_24_)
				d_28_ = 2.0 + (d_25_ - d) / (d_27_ - d_26_);
			else if (d_27_ == d_25_)
				d_28_ = 4.0 + (d - d_24_) / (d_27_ - d_26_);
		}
		d_28_ /= 6.0;
		anInt70 = (int) (256.0 * d_29_) * -1565216439;
		anInt69 = (int) (d_30_ * 256.0) * -99905543;
		if (-1261235975 * anInt70 < 0)
			anInt70 = 0;
		else if (-1261235975 * anInt70 > 255)
			anInt70 = 301766583;
		if (anInt69 * -2060189111 < 0)
			anInt69 = 0;
		else if (-2060189111 * anInt69 > 255)
			anInt69 = 293890311;
		if (d_30_ > 0.5)
			anInt72 = 175430581 * (int) (d_29_ * (1.0 - d_30_) * 512.0);
		else
			anInt72 = (int) (512.0 * (d_30_ * d_29_)) * 175430581;
		if (-1916962147 * anInt72 < 1)
			anInt72 = 175430581;
		anInt65 = -132868013 * (int) ((double) (-1916962147 * anInt72) * d_28_);
	}

	void method593(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_31_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_32_ = (double) (i & 0xff) / 256.0;
		double d_33_ = d;
		if (d_31_ < d_33_)
			d_33_ = d_31_;
		if (d_32_ < d_33_)
			d_33_ = d_32_;
		double d_34_ = d;
		if (d_31_ > d_34_)
			d_34_ = d_31_;
		if (d_32_ > d_34_)
			d_34_ = d_32_;
		double d_35_ = 0.0;
		double d_36_ = 0.0;
		double d_37_ = (d_34_ + d_33_) / 2.0;
		if (d_33_ != d_34_) {
			if (d_37_ < 0.5)
				d_36_ = (d_34_ - d_33_) / (d_33_ + d_34_);
			if (d_37_ >= 0.5)
				d_36_ = (d_34_ - d_33_) / (2.0 - d_34_ - d_33_);
			if (d_34_ == d)
				d_35_ = (d_31_ - d_32_) / (d_34_ - d_33_);
			else if (d_34_ == d_31_)
				d_35_ = 2.0 + (d_32_ - d) / (d_34_ - d_33_);
			else if (d_34_ == d_32_)
				d_35_ = 4.0 + (d - d_31_) / (d_34_ - d_33_);
		}
		d_35_ /= 6.0;
		anInt70 = (int) (256.0 * d_36_) * -1565216439;
		anInt69 = (int) (d_37_ * 256.0) * -99905543;
		if (-1261235975 * anInt70 < 0)
			anInt70 = 0;
		else if (-1261235975 * anInt70 > 255)
			anInt70 = 301766583;
		if (anInt69 * -2060189111 < 0)
			anInt69 = 0;
		else if (-2060189111 * anInt69 > 255)
			anInt69 = 293890311;
		if (d_37_ > 0.5)
			anInt72 = 175430581 * (int) (d_36_ * (1.0 - d_37_) * 512.0);
		else
			anInt72 = (int) (512.0 * (d_37_ * d_36_)) * 175430581;
		if (-1916962147 * anInt72 < 1)
			anInt72 = 175430581;
		anInt65 = -132868013 * (int) ((double) (-1916962147 * anInt72) * d_35_);
	}

	void method594(RSByteBuffer class527_sub38, int i, int i_38_) {
		if (i == 1) {
			anInt71 = class527_sub38.read24BitUnsignedInteger(1313329420) * 1930095843;
			method587(anInt71 * -619595573, 2032047385);
		} else if (2 == i) {
			anInt67 = class527_sub38.readUnsignedShort() * -2095899221;
			if (65535 == anInt67 * 1277621507)
				anInt67 = 2095899221;
		} else if (i == 3)
			anInt66 = (class527_sub38.readUnsignedShort() << 2) * -277539959;
		else if (i == 4)
			aBool64 = false;
		else if (i == 5)
			aBool68 = false;
	}

	static final void method595(Class665 class665, byte i) {
		Class465_Sub1.method15934(class665, (byte) -59);
	}

	static final void method596(Class665 class665, byte i) {
		Class243 class243 = Class648.method10837(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)], 254451831);
		if (-1 != class243.anInt2572 * -437471887)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1109781355 * class243.anInt2589;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	public static Class527_Sub36 method597(int i, boolean bool, byte i_39_) {
		synchronized (Class527_Sub36.aClass527_Sub36Array10674) {
			if (-706191715 * Class527_Sub36.anInt10672 == 0) {
				Class527_Sub36 class527_sub36 = new Class527_Sub36(i, bool);
				return class527_sub36;
			}
			Class527_Sub36.aClass527_Sub36Array10674[(Class527_Sub36.anInt10672 -= -1300686923) * -706191715].method16384(i, bool, -2015314953);
			Class527_Sub36 class527_sub36 = (Class527_Sub36.aClass527_Sub36Array10674[Class527_Sub36.anInt10672 * -706191715]);
			return class527_sub36;
		}
	}
}

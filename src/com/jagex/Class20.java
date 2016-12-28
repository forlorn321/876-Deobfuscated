/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class20 implements ConfigType, Interface7 {
	public int anInt206;
	public int anInt207;
	int anInt208 = 0;
	public boolean aBool209;
	public boolean aBool210;
	public int anInt211;
	public int anInt212;
	public int anInt213;
	public int anInt214;
	public static JS5ResourceProvider aClass461_215;

	public void method58(int i) {
		/* empty */
	}

	void method693(RSByteBuffer class536_sub33, int i, int i_0_) {
		if (1 == i) {
			anInt208 = class536_sub33.read24BitUnsignedInteger() * 973856227;
			method694(-20295733 * anInt208, (byte) 21);
		} else if (2 == i) {
			anInt207 = class536_sub33.readUnsignedShort() * -39893207;
			if (anInt207 * -542882535 == 65535)
				anInt207 = 39893207;
		} else if (3 == i)
			anInt214 = (class536_sub33.readUnsignedShort() << 2) * 1489795809;
		else if (4 == i)
			aBool209 = false;
		else if (i == 5)
			aBool210 = false;
	}

	public void decodeType(RSByteBuffer class536_sub33) {
		for (;;) {
			int i_1_ = class536_sub33.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method693(class536_sub33, i_1_, 1962967612);
		}
	}

	void method694(int i, byte i_2_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_3_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_4_ = (double) (i & 0xff) / 256.0;
		double d_5_ = d;
		if (d_3_ < d_5_)
			d_5_ = d_3_;
		if (d_4_ < d_5_)
			d_5_ = d_4_;
		double d_6_ = d;
		if (d_3_ > d_6_)
			d_6_ = d_3_;
		if (d_4_ > d_6_)
			d_6_ = d_4_;
		double d_7_ = 0.0;
		double d_8_ = 0.0;
		double d_9_ = (d_5_ + d_6_) / 2.0;
		if (d_6_ != d_5_) {
			if (d_9_ < 0.5)
				d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_);
			if (d_9_ >= 0.5)
				d_8_ = (d_6_ - d_5_) / (2.0 - d_6_ - d_5_);
			if (d_6_ == d)
				d_7_ = (d_3_ - d_4_) / (d_6_ - d_5_);
			else if (d_3_ == d_6_)
				d_7_ = (d_4_ - d) / (d_6_ - d_5_) + 2.0;
			else if (d_6_ == d_4_)
				d_7_ = 4.0 + (d - d_3_) / (d_6_ - d_5_);
		}
		d_7_ /= 6.0;
		anInt212 = (int) (d_8_ * 256.0) * -1558311641;
		anInt213 = (int) (256.0 * d_9_) * 1095628423;
		if (anInt212 * -1278569833 < 0)
			anInt212 = 0;
		else if (anInt212 * -1278569833 > 255)
			anInt212 = 2062490073;
		if (-2044137673 * anInt213 < 0)
			anInt213 = 0;
		else if (anInt213 * -2044137673 > 255)
			anInt213 = 212373625;
		if (d_9_ > 0.5)
			anInt206 = 2032355655 * (int) (d_8_ * (1.0 - d_9_) * 512.0);
		else
			anInt206 = (int) (512.0 * (d_9_ * d_8_)) * 2032355655;
		if (-1374187401 * anInt206 < 1)
			anInt206 = 2032355655;
		anInt211 = -1718614957 * (int) ((double) (anInt206 * -1374187401) * d_7_);
	}

	public void postDecode() {
		/* empty */
	}

	public void method59(int i, int i_10_) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method693(class536_sub33, i, -176934254);
		}
	}

	void method695(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_11_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_12_ = (double) (i & 0xff) / 256.0;
		double d_13_ = d;
		if (d_11_ < d_13_)
			d_13_ = d_11_;
		if (d_12_ < d_13_)
			d_13_ = d_12_;
		double d_14_ = d;
		if (d_11_ > d_14_)
			d_14_ = d_11_;
		if (d_12_ > d_14_)
			d_14_ = d_12_;
		double d_15_ = 0.0;
		double d_16_ = 0.0;
		double d_17_ = (d_13_ + d_14_) / 2.0;
		if (d_14_ != d_13_) {
			if (d_17_ < 0.5)
				d_16_ = (d_14_ - d_13_) / (d_13_ + d_14_);
			if (d_17_ >= 0.5)
				d_16_ = (d_14_ - d_13_) / (2.0 - d_14_ - d_13_);
			if (d_14_ == d)
				d_15_ = (d_11_ - d_12_) / (d_14_ - d_13_);
			else if (d_11_ == d_14_)
				d_15_ = (d_12_ - d) / (d_14_ - d_13_) + 2.0;
			else if (d_14_ == d_12_)
				d_15_ = 4.0 + (d - d_11_) / (d_14_ - d_13_);
		}
		d_15_ /= 6.0;
		anInt212 = (int) (d_16_ * 256.0) * -1558311641;
		anInt213 = (int) (256.0 * d_17_) * 1095628423;
		if (anInt212 * -1278569833 < 0)
			anInt212 = 0;
		else if (anInt212 * -1278569833 > 255)
			anInt212 = 2062490073;
		if (-2044137673 * anInt213 < 0)
			anInt213 = 0;
		else if (anInt213 * -2044137673 > 255)
			anInt213 = 212373625;
		if (d_17_ > 0.5)
			anInt206 = 2032355655 * (int) (d_16_ * (1.0 - d_17_) * 512.0);
		else
			anInt206 = (int) (512.0 * (d_17_ * d_16_)) * 2032355655;
		if (-1374187401 * anInt206 < 1)
			anInt206 = 2032355655;
		anInt211 = -1718614957 * (int) ((double) (anInt206 * -1374187401) * d_15_);
	}

	public void method57(int i) {
		/* empty */
	}

	void method696(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			anInt208 = class536_sub33.read24BitUnsignedInteger() * 973856227;
			method694(-20295733 * anInt208, (byte) 17);
		} else if (2 == i) {
			anInt207 = class536_sub33.readUnsignedShort() * -39893207;
			if (anInt207 * -542882535 == 65535)
				anInt207 = 39893207;
		} else if (3 == i)
			anInt214 = (class536_sub33.readUnsignedShort() << 2) * 1489795809;
		else if (4 == i)
			aBool209 = false;
		else if (i == 5)
			aBool210 = false;
	}

	public void method56(int i) {
		/* empty */
	}

	void method697(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			anInt208 = class536_sub33.read24BitUnsignedInteger() * 973856227;
			method694(-20295733 * anInt208, (byte) -4);
		} else if (2 == i) {
			anInt207 = class536_sub33.readUnsignedShort() * -39893207;
			if (anInt207 * -542882535 == 65535)
				anInt207 = 39893207;
		} else if (3 == i)
			anInt214 = (class536_sub33.readUnsignedShort() << 2) * 1489795809;
		else if (4 == i)
			aBool209 = false;
		else if (i == 5)
			aBool210 = false;
	}

	public void method77() {
		/* empty */
	}

	void method698(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			anInt208 = class536_sub33.read24BitUnsignedInteger() * 973856227;
			method694(-20295733 * anInt208, (byte) -48);
		} else if (2 == i) {
			anInt207 = class536_sub33.readUnsignedShort() * -39893207;
			if (anInt207 * -542882535 == 65535)
				anInt207 = 39893207;
		} else if (3 == i)
			anInt214 = ((class536_sub33.readUnsignedShort() << 2) * 1489795809);
		else if (4 == i)
			aBool209 = false;
		else if (i == 5)
			aBool210 = false;
	}

	Class20() {
		anInt207 = 39893207;
		anInt214 = -1728724480;
		aBool209 = true;
		aBool210 = true;
	}

	void method699(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_18_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_19_ = (double) (i & 0xff) / 256.0;
		double d_20_ = d;
		if (d_18_ < d_20_)
			d_20_ = d_18_;
		if (d_19_ < d_20_)
			d_20_ = d_19_;
		double d_21_ = d;
		if (d_18_ > d_21_)
			d_21_ = d_18_;
		if (d_19_ > d_21_)
			d_21_ = d_19_;
		double d_22_ = 0.0;
		double d_23_ = 0.0;
		double d_24_ = (d_20_ + d_21_) / 2.0;
		if (d_21_ != d_20_) {
			if (d_24_ < 0.5)
				d_23_ = (d_21_ - d_20_) / (d_20_ + d_21_);
			if (d_24_ >= 0.5)
				d_23_ = (d_21_ - d_20_) / (2.0 - d_21_ - d_20_);
			if (d_21_ == d)
				d_22_ = (d_18_ - d_19_) / (d_21_ - d_20_);
			else if (d_18_ == d_21_)
				d_22_ = (d_19_ - d) / (d_21_ - d_20_) + 2.0;
			else if (d_21_ == d_19_)
				d_22_ = 4.0 + (d - d_18_) / (d_21_ - d_20_);
		}
		d_22_ /= 6.0;
		anInt212 = (int) (d_23_ * 256.0) * -1558311641;
		anInt213 = (int) (256.0 * d_24_) * 1095628423;
		if (anInt212 * -1278569833 < 0)
			anInt212 = 0;
		else if (anInt212 * -1278569833 > 255)
			anInt212 = 2062490073;
		if (-2044137673 * anInt213 < 0)
			anInt213 = 0;
		else if (anInt213 * -2044137673 > 255)
			anInt213 = 212373625;
		if (d_24_ > 0.5)
			anInt206 = 2032355655 * (int) (d_23_ * (1.0 - d_24_) * 512.0);
		else
			anInt206 = (int) (512.0 * (d_24_ * d_23_)) * 2032355655;
		if (-1374187401 * anInt206 < 1)
			anInt206 = 2032355655;
		anInt211 = -1718614957 * (int) ((double) (anInt206 * -1374187401) * d_22_);
	}

	void method700(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_25_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_26_ = (double) (i & 0xff) / 256.0;
		double d_27_ = d;
		if (d_25_ < d_27_)
			d_27_ = d_25_;
		if (d_26_ < d_27_)
			d_27_ = d_26_;
		double d_28_ = d;
		if (d_25_ > d_28_)
			d_28_ = d_25_;
		if (d_26_ > d_28_)
			d_28_ = d_26_;
		double d_29_ = 0.0;
		double d_30_ = 0.0;
		double d_31_ = (d_27_ + d_28_) / 2.0;
		if (d_28_ != d_27_) {
			if (d_31_ < 0.5)
				d_30_ = (d_28_ - d_27_) / (d_27_ + d_28_);
			if (d_31_ >= 0.5)
				d_30_ = (d_28_ - d_27_) / (2.0 - d_28_ - d_27_);
			if (d_28_ == d)
				d_29_ = (d_25_ - d_26_) / (d_28_ - d_27_);
			else if (d_25_ == d_28_)
				d_29_ = (d_26_ - d) / (d_28_ - d_27_) + 2.0;
			else if (d_28_ == d_26_)
				d_29_ = 4.0 + (d - d_25_) / (d_28_ - d_27_);
		}
		d_29_ /= 6.0;
		anInt212 = (int) (d_30_ * 256.0) * -1558311641;
		anInt213 = (int) (256.0 * d_31_) * 1095628423;
		if (anInt212 * -1278569833 < 0)
			anInt212 = 0;
		else if (anInt212 * -1278569833 > 255)
			anInt212 = 2062490073;
		if (-2044137673 * anInt213 < 0)
			anInt213 = 0;
		else if (anInt213 * -2044137673 > 255)
			anInt213 = 212373625;
		if (d_31_ > 0.5)
			anInt206 = 2032355655 * (int) (d_30_ * (1.0 - d_31_) * 512.0);
		else
			anInt206 = (int) (512.0 * (d_31_ * d_30_)) * 2032355655;
		if (-1374187401 * anInt206 < 1)
			anInt206 = 2032355655;
		anInt211 = -1718614957 * (int) ((double) (anInt206 * -1374187401) * d_29_);
	}

	void method701(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_32_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_33_ = (double) (i & 0xff) / 256.0;
		double d_34_ = d;
		if (d_32_ < d_34_)
			d_34_ = d_32_;
		if (d_33_ < d_34_)
			d_34_ = d_33_;
		double d_35_ = d;
		if (d_32_ > d_35_)
			d_35_ = d_32_;
		if (d_33_ > d_35_)
			d_35_ = d_33_;
		double d_36_ = 0.0;
		double d_37_ = 0.0;
		double d_38_ = (d_34_ + d_35_) / 2.0;
		if (d_35_ != d_34_) {
			if (d_38_ < 0.5)
				d_37_ = (d_35_ - d_34_) / (d_34_ + d_35_);
			if (d_38_ >= 0.5)
				d_37_ = (d_35_ - d_34_) / (2.0 - d_35_ - d_34_);
			if (d_35_ == d)
				d_36_ = (d_32_ - d_33_) / (d_35_ - d_34_);
			else if (d_32_ == d_35_)
				d_36_ = (d_33_ - d) / (d_35_ - d_34_) + 2.0;
			else if (d_35_ == d_33_)
				d_36_ = 4.0 + (d - d_32_) / (d_35_ - d_34_);
		}
		d_36_ /= 6.0;
		anInt212 = (int) (d_37_ * 256.0) * -1558311641;
		anInt213 = (int) (256.0 * d_38_) * 1095628423;
		if (anInt212 * -1278569833 < 0)
			anInt212 = 0;
		else if (anInt212 * -1278569833 > 255)
			anInt212 = 2062490073;
		if (-2044137673 * anInt213 < 0)
			anInt213 = 0;
		else if (anInt213 * -2044137673 > 255)
			anInt213 = 212373625;
		if (d_38_ > 0.5)
			anInt206 = 2032355655 * (int) (d_37_ * (1.0 - d_38_) * 512.0);
		else
			anInt206 = (int) (512.0 * (d_38_ * d_37_)) * 2032355655;
		if (-1374187401 * anInt206 < 1)
			anInt206 = 2032355655;
		anInt211 = -1718614957 * (int) ((double) (anInt206 * -1374187401) * d_36_);
	}

	public static void method702(byte i) {
		synchronized (Class617.aClass199_8081) {
			Class617.aClass199_8081.method2884((byte) -13);
		}
		synchronized (Class617.aClass199_8082) {
			Class617.aClass199_8082.method2884((byte) -38);
		}
	}

	static final void method703(Class668 class668, byte i) {
		if ((Class683.aClass301_Sub1_8651.method4054(-87983431) != Class290.aClass290_3220) || (Class683.aClass301_Sub1_8651.method4062(-1795040656) != Class300.aClass300_3360))
			throw new RuntimeException();
		Class436 class436 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221)).method9177((byte) 8);
		Class436 class436_39_ = ((Class706_Sub2) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10257(-73725721);
		Class436 class436_40_ = Class436.method5240(class436);
		class436_40_.method5251(class436_39_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) class436_40_.method5291();
	}
}

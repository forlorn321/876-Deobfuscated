/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class330 implements Interface33 {
	Class143 aClass143_3602;
	Class461 aClass461_3603;
	Class398 aClass398_3604;

	public void method211(boolean bool) {
		if (bool) {
			int i = (aClass398_3604.aClass395_4117.method4878(aClass143_3602.method12(), (client.anInt11152 * -125739413), 1635801890) + 21495479 * aClass398_3604.anInt4121);
			int i_0_ = (aClass398_3604.aClass399_4119.method4906(aClass143_3602.method1785(), (client.anInt11153 * -358673315), -1323596632) + -527690215 * aClass398_3604.anInt4118);
			aClass143_3602.method1728(i, i_0_);
		}
	}

	Class330(Class461 class461, Class398 class398) {
		aClass461_3603 = class461;
		aClass398_3604 = class398;
	}

	public void method206(int i) {
		aClass143_3602 = Class247.method3419(aClass461_3603, -269721035 * aClass398_3604.anInt4120, -1577786019);
	}

	public boolean method209(int i) {
		return aClass461_3603.method5580(-269721035 * aClass398_3604.anInt4120, -964514165);
	}

	public void method212(boolean bool) {
		if (bool) {
			int i = (aClass398_3604.aClass395_4117.method4878(aClass143_3602.method12(), (client.anInt11152 * -125739413), 2003879274) + 21495479 * aClass398_3604.anInt4121);
			int i_1_ = (aClass398_3604.aClass399_4119.method4906(aClass143_3602.method1785(), (client.anInt11153 * -358673315), -1440072270) + -527690215 * aClass398_3604.anInt4118);
			aClass143_3602.method1728(i, i_1_);
		}
	}

	public void method210(boolean bool) {
		if (bool) {
			int i = (aClass398_3604.aClass395_4117.method4878(aClass143_3602.method12(), (client.anInt11152 * -125739413), 1897549694) + 21495479 * aClass398_3604.anInt4121);
			int i_2_ = (aClass398_3604.aClass399_4119.method4906(aClass143_3602.method1785(), (client.anInt11153 * -358673315), -650501295) + -527690215 * aClass398_3604.anInt4118);
			aClass143_3602.method1728(i, i_2_);
		}
	}

	public void method208(boolean bool) {
		if (bool) {
			int i = (aClass398_3604.aClass395_4117.method4878(aClass143_3602.method12(), (client.anInt11152 * -125739413), 1373883330) + 21495479 * aClass398_3604.anInt4121);
			int i_3_ = (aClass398_3604.aClass399_4119.method4906(aClass143_3602.method1785(), (client.anInt11153 * -358673315), -852349421) + -527690215 * aClass398_3604.anInt4118);
			aClass143_3602.method1728(i, i_3_);
		}
	}

	public void method216(boolean bool, int i) {
		if (bool) {
			int i_4_ = (aClass398_3604.aClass395_4117.method4878(aClass143_3602.method12(), (client.anInt11152 * -125739413), 1346722184) + 21495479 * aClass398_3604.anInt4121);
			int i_5_ = (aClass398_3604.aClass399_4119.method4906(aClass143_3602.method1785(), (client.anInt11153 * -358673315), -680744448) + -527690215 * aClass398_3604.anInt4118);
			aClass143_3602.method1728(i_4_, i_5_);
		}
	}

	public void method213(boolean bool) {
		if (bool) {
			int i = (aClass398_3604.aClass395_4117.method4878(aClass143_3602.method12(), (client.anInt11152 * -125739413), 1229612799) + 21495479 * aClass398_3604.anInt4121);
			int i_6_ = (aClass398_3604.aClass399_4119.method4906(aClass143_3602.method1785(), (client.anInt11153 * -358673315), -1900259393) + -527690215 * aClass398_3604.anInt4118);
			aClass143_3602.method1728(i, i_6_);
		}
	}

	public boolean method214() {
		return aClass461_3603.method5580(-269721035 * aClass398_3604.anInt4120, -964514165);
	}

	public boolean method215() {
		return aClass461_3603.method5580(-269721035 * aClass398_3604.anInt4120, -964514165);
	}

	public boolean method207() {
		return aClass461_3603.method5580(-269721035 * aClass398_3604.anInt4120, -964514165);
	}

	public void method217() {
		aClass143_3602 = Class247.method3419(aClass461_3603, -269721035 * aClass398_3604.anInt4120, -1484987853);
	}

	public static int method4319(int i, int i_7_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_8_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_9_ = (double) (i & 0xff) / 256.0;
		double d_10_ = d;
		if (d_8_ < d_10_)
			d_10_ = d_8_;
		if (d_9_ < d_10_)
			d_10_ = d_9_;
		double d_11_ = d;
		if (d_8_ > d_11_)
			d_11_ = d_8_;
		if (d_9_ > d_11_)
			d_11_ = d_9_;
		double d_12_ = 0.0;
		double d_13_ = 0.0;
		double d_14_ = (d_11_ + d_10_) / 2.0;
		if (d_10_ != d_11_) {
			if (d_14_ < 0.5)
				d_13_ = (d_11_ - d_10_) / (d_10_ + d_11_);
			if (d_14_ >= 0.5)
				d_13_ = (d_11_ - d_10_) / (2.0 - d_11_ - d_10_);
			if (d_11_ == d)
				d_12_ = (d_8_ - d_9_) / (d_11_ - d_10_);
			else if (d_8_ == d_11_)
				d_12_ = (d_9_ - d) / (d_11_ - d_10_) + 2.0;
			else if (d_11_ == d_9_)
				d_12_ = 4.0 + (d - d_8_) / (d_11_ - d_10_);
		}
		d_12_ /= 6.0;
		int i_15_ = (int) (d_12_ * 256.0);
		int i_16_ = (int) (d_13_ * 256.0);
		int i_17_ = (int) (256.0 * d_14_);
		if (i_16_ < 0)
			i_16_ = 0;
		else if (i_16_ > 255)
			i_16_ = 255;
		if (i_17_ < 0)
			i_17_ = 0;
		else if (i_17_ > 255)
			i_17_ = 255;
		if (i_17_ > 243)
			i_16_ >>= 4;
		else if (i_17_ > 217)
			i_16_ >>= 3;
		else if (i_17_ > 192)
			i_16_ >>= 2;
		else if (i_17_ > 179)
			i_16_ >>= 1;
		return ((i_15_ & 0xff) >> 2 << 10) + (i_16_ >> 5 << 7) + (i_17_ >> 1);
	}

	static final void method4320(Class668 class668, int i) {
		Class208.method2972(-1082045390);
	}
}

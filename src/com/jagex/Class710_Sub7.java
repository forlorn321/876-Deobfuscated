/* Class710_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.FileOutputStream;

public class Class710_Sub7 extends Class710 {
	public static final int anInt10834 = 0;
	static FileOutputStream aFileOutputStream10835;
	public static final int anInt10836 = 1;

	public int method8357(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -126) == Class670.aClass670_8568)
			return 1;
		return 3;
	}

	public Class710_Sub7(int i, Class536_Sub40 class536_sub40) {
		super(i, class536_sub40);
	}

	public int method8355(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -92) == Class670.aClass670_8568)
			return 1;
		return 3;
	}

	int method8347(byte i) {
		return 1;
	}

	public boolean method9931(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -22) == Class670.aClass670_8568)
			return true;
		return false;
	}

	public int method8348(int i, int i_0_) {
		if (aClass536_Sub40_8841.method9865((byte) -30) == Class670.aClass670_8568)
			return 1;
		return 3;
	}

	void method8350(int i, int i_1_) {
		anInt8842 = i * -1100148889;
	}

	public int method9932(int i) {
		return -789865385 * anInt8842;
	}

	int method8353() {
		return 1;
	}

	void method8354(int i) {
		anInt8842 = i * -1100148889;
	}

	int method8351() {
		return 1;
	}

	void method8346(int i) {
		anInt8842 = i * -1100148889;
	}

	public void method9933(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -81) != Class670.aClass670_8568)
			anInt8842 = -1100148889;
		if (0 != -789865385 * anInt8842 && 1 != anInt8842 * -789865385)
			anInt8842 = method8347((byte) -54) * -1100148889;
	}

	int method8352() {
		return 1;
	}

	public int method8356(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -60) == Class670.aClass670_8568)
			return 1;
		return 3;
	}

	public Class710_Sub7(Class536_Sub40 class536_sub40) {
		super(class536_sub40);
	}

	public int method8358(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -76) == Class670.aClass670_8568)
			return 1;
		return 3;
	}

	public void method9934() {
		if (aClass536_Sub40_8841.method9865((byte) -102) != Class670.aClass670_8568)
			anInt8842 = -1100148889;
		if (0 != -789865385 * anInt8842 && 1 != anInt8842 * -789865385)
			anInt8842 = method8347((byte) 2) * -1100148889;
	}

	public boolean method9935() {
		if (aClass536_Sub40_8841.method9865((byte) -72) == Class670.aClass670_8568)
			return true;
		return false;
	}

	static final void method9936(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_2_, -689214737);
		if (null == class251.aString2556)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class251.aString2556;
	}

	static void method9937(int i) {
		if (Class639.anIntArray8309 == null) {
			Class639.anIntArray8309 = new int[65536];
			Class639.anIntArray8310 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i_3_ = 0; i_3_ < 65536; i_3_++) {
				double d_4_ = (double) (i_3_ >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_5_ = (double) (i_3_ >> 7 & 0x7) / 8.0 + 0.0625;
				double d_6_ = (double) (i_3_ & 0x7f) / 128.0;
				double d_7_ = d_6_;
				double d_8_ = d_6_;
				double d_9_ = d_6_;
				if (0.0 != d_5_) {
					double d_10_;
					if (d_6_ < 0.5)
						d_10_ = d_6_ * (1.0 + d_5_);
					else
						d_10_ = d_5_ + d_6_ - d_5_ * d_6_;
					double d_11_ = 2.0 * d_6_ - d_10_;
					double d_12_ = 0.3333333333333333 + d_4_;
					if (d_12_ > 1.0)
						d_12_--;
					double d_13_ = d_4_;
					double d_14_ = d_4_ - 0.3333333333333333;
					if (d_14_ < 0.0)
						d_14_++;
					if (6.0 * d_12_ < 1.0)
						d_7_ = d_12_ * (6.0 * (d_10_ - d_11_)) + d_11_;
					else if (d_12_ * 2.0 < 1.0)
						d_7_ = d_10_;
					else if (3.0 * d_12_ < 2.0)
						d_7_ = d_11_ + 6.0 * ((d_10_ - d_11_) * (0.6666666666666666 - d_12_));
					else
						d_7_ = d_11_;
					if (6.0 * d_13_ < 1.0)
						d_8_ = d_13_ * ((d_10_ - d_11_) * 6.0) + d_11_;
					else if (d_13_ * 2.0 < 1.0)
						d_8_ = d_10_;
					else if (3.0 * d_13_ < 2.0)
						d_8_ = d_11_ + ((d_10_ - d_11_) * (0.6666666666666666 - d_13_) * 6.0);
					else
						d_8_ = d_11_;
					if (d_14_ * 6.0 < 1.0)
						d_9_ = d_11_ + (d_10_ - d_11_) * 6.0 * d_14_;
					else if (2.0 * d_14_ < 1.0)
						d_9_ = d_10_;
					else if (d_14_ * 3.0 < 2.0)
						d_9_ = d_11_ + 6.0 * ((0.6666666666666666 - d_14_) * (d_10_ - d_11_));
					else
						d_9_ = d_11_;
				}
				d_7_ = Math.pow(d_7_, d);
				d_8_ = Math.pow(d_8_, d);
				d_9_ = Math.pow(d_9_, d);
				int i_15_ = (int) (d_7_ * 256.0);
				int i_16_ = (int) (256.0 * d_8_);
				int i_17_ = (int) (d_9_ * 256.0);
				int i_18_ = (i_16_ << 8) + (i_15_ << 16) + i_17_;
				Class639.anIntArray8309[i_3_] = i_18_ & 0xffffff;
				int i_19_ = i_15_ + ((i_17_ << 16) + (i_16_ << 8));
				Class639.anIntArray8310[i_3_] = i_19_;
			}
		}
	}
}

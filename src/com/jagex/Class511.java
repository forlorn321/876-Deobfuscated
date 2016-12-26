/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class Class511 {
	int anInt6926 = 0;
	int anInt6927;
	byte[] aByteArray6928;
	int anInt6929;
	OutputStream anOutputStream6930;
	static int anInt6931;

	public void method6189() throws IOException {
		int i = 556356379 * anInt6927 - 1527964413 * anInt6929;
		if (0 != i) {
			anOutputStream6930.write(aByteArray6928, 1527964413 * anInt6929, i);
			if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
				anInt6927 = 0;
			anInt6929 = -1078663689 * anInt6927;
		}
	}

	public void method6190(int i, int i_0_) {
		if (aByteArray6928 == null || 2054489743 * anInt6926 != i)
			aByteArray6928 = new byte[i];
		anInt6926 = 1534023791 * i;
		anInt6927 = 0;
		anInt6929 = 0;
	}

	public void method6191(OutputStream outputstream, byte i) throws IOException {
		method6192(-983738100);
		anOutputStream6930 = outputstream;
	}

	public void method6192(int i) throws IOException {
		method6206((byte) 15);
		anOutputStream6930 = null;
	}

	public void method6193(boolean bool, int i) {
		if (!bool) {
			anInt6929 = 0;
			anInt6927 = 0;
		}
	}

	public void method6194(byte i) throws IOException {
		aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = i;
		if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
			method6206((byte) 62);
	}

	public void method6195(byte i, byte i_1_) throws IOException {
		aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = i;
		if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
			method6206((byte) 39);
	}

	public byte method6196(int i, short i_2_) {
		int i_3_ = 556356379 * anInt6927 - i - 1;
		if (i_3_ < 0)
			i_3_ += 2054489743 * anInt6926;
		return aByteArray6928[i_3_];
	}

	public void method6197(int i) {
		if (aByteArray6928 == null || 2054489743 * anInt6926 != i)
			aByteArray6928 = new byte[i];
		anInt6926 = 1534023791 * i;
		anInt6927 = 0;
		anInt6929 = 0;
	}

	public void method6198(int i) {
		if (aByteArray6928 == null || 2054489743 * anInt6926 != i)
			aByteArray6928 = new byte[i];
		anInt6926 = 1534023791 * i;
		anInt6927 = 0;
		anInt6929 = 0;
	}

	public void method6199(int i, int i_4_) throws IOException {
		int i_5_ = 556356379 * anInt6927 - i - 1;
		if (i_5_ < 0)
			i_5_ += 2054489743 * anInt6926;
		for (/**/; 0 != i_4_; i_4_--) {
			if (i_5_ >= anInt6926 * 2054489743)
				i_5_ = 0;
			aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = aByteArray6928[i_5_++];
			if (anInt6927 * 556356379 >= 2054489743 * anInt6926)
				method6206((byte) 95);
		}
	}

	public void method6200(byte i) throws IOException {
		aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = i;
		if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
			method6206((byte) 65);
	}

	public void method6201(byte i) throws IOException {
		aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = i;
		if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
			method6206((byte) 93);
	}

	public void method6202(boolean bool) {
		if (!bool) {
			anInt6929 = 0;
			anInt6927 = 0;
		}
	}

	public void method6203(byte i) throws IOException {
		aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = i;
		if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
			method6206((byte) 11);
	}

	public void method6204() throws IOException {
		method6206((byte) 39);
		anOutputStream6930 = null;
	}

	public void method6205(int i, int i_6_, int i_7_) throws IOException {
		int i_8_ = 556356379 * anInt6927 - i - 1;
		if (i_8_ < 0)
			i_8_ += 2054489743 * anInt6926;
		for (/**/; 0 != i_6_; i_6_--) {
			if (i_8_ >= anInt6926 * 2054489743)
				i_8_ = 0;
			aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = aByteArray6928[i_8_++];
			if (anInt6927 * 556356379 >= 2054489743 * anInt6926)
				method6206((byte) 27);
		}
	}

	public void method6206(byte i) throws IOException {
		int i_9_ = 556356379 * anInt6927 - 1527964413 * anInt6929;
		if (0 != i_9_) {
			anOutputStream6930.write(aByteArray6928, 1527964413 * anInt6929, i_9_);
			if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
				anInt6927 = 0;
			anInt6929 = -1078663689 * anInt6927;
		}
	}

	public void method6207(byte i) throws IOException {
		aByteArray6928[(anInt6927 += 1593102099) * 556356379 - 1] = i;
		if (anInt6927 * 556356379 >= anInt6926 * 2054489743)
			method6206((byte) 35);
	}

	static final void method6208(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_10_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_10_ >> 16];
		Class471.method5715(class251, class234, class668, 984458878);
	}

	static final void method6209(Class668 class668, int i) {
		int i_11_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub10 class536_sub18_sub10 = Class198.aClass32_2216.method788(i_11_, (byte) -76);
		if (null == class536_sub18_sub10.anIntArray11724)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub18_sub10.anIntArray11724.length;
	}

	static final void method6210(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_12_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_13_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		if (null != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202)
			Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202.method7342(i_12_, i_13_, (byte) -67);
	}
}

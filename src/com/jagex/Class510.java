/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class Class510 {
	byte[] aByteArray6972;
	int anInt6973;
	static int anInt6974;
	int anInt6975;
	OutputStream anOutputStream6976;
	int anInt6977 = 0;
	public static byte aByte6978;

	public void method8423() throws IOException {
		method8425(264036901);
		anOutputStream6976 = null;
	}

	public void method8424(int i, int i_0_) {
		if (null == aByteArray6972 || anInt6977 * 389103239 != i)
			aByteArray6972 = new byte[i];
		anInt6977 = i * 959653687;
		anInt6973 = 0;
		anInt6975 = 0;
	}

	public void method8425(int i) throws IOException {
		int i_1_ = -148170455 * anInt6973 - 2066005613 * anInt6975;
		if (i_1_ != 0) {
			anOutputStream6976.write(aByteArray6972, 2066005613 * anInt6975, i_1_);
			if (-148170455 * anInt6973 >= anInt6977 * 389103239)
				anInt6973 = 0;
			anInt6975 = anInt6973 * -796385235;
		}
	}

	public void method8426(byte i) throws IOException {
		method8425(757777697);
		anOutputStream6976 = null;
	}

	public void method8427(boolean bool, int i) {
		if (!bool) {
			anInt6975 = 0;
			anInt6973 = 0;
		}
	}

	public void method8428(byte i) throws IOException {
		aByteArray6972[(anInt6973 += 1704497945) * -148170455 - 1] = i;
		if (-148170455 * anInt6973 >= anInt6977 * 389103239)
			method8425(-154099454);
	}

	public void method8429(int i, int i_2_, int i_3_) throws IOException {
		int i_4_ = -148170455 * anInt6973 - i - 1;
		if (i_4_ < 0)
			i_4_ += anInt6977 * 389103239;
		for (/**/; i_2_ != 0; i_2_--) {
			if (i_4_ >= 389103239 * anInt6977)
				i_4_ = 0;
			aByteArray6972[(anInt6973 += 1704497945) * -148170455 - 1] = aByteArray6972[i_4_++];
			if (anInt6973 * -148170455 >= anInt6977 * 389103239)
				method8425(-746419822);
		}
	}

	public void method8430(byte i, int i_5_) throws IOException {
		aByteArray6972[(anInt6973 += 1704497945) * -148170455 - 1] = i;
		if (-148170455 * anInt6973 >= anInt6977 * 389103239)
			method8425(-295976058);
	}

	public void method8431(byte i) throws IOException {
		aByteArray6972[(anInt6973 += 1704497945) * -148170455 - 1] = i;
		if (-148170455 * anInt6973 >= anInt6977 * 389103239)
			method8425(-1394927984);
	}

	public void method8432(OutputStream outputstream) throws IOException {
		method8426((byte) 1);
		anOutputStream6976 = outputstream;
	}

	public void method8433(OutputStream outputstream) throws IOException {
		method8426((byte) 1);
		anOutputStream6976 = outputstream;
	}

	public void method8434(OutputStream outputstream, int i) throws IOException {
		method8426((byte) 1);
		anOutputStream6976 = outputstream;
	}

	public void method8435(boolean bool) {
		if (!bool) {
			anInt6975 = 0;
			anInt6973 = 0;
		}
	}

	public void method8436(boolean bool) {
		if (!bool) {
			anInt6975 = 0;
			anInt6973 = 0;
		}
	}

	public void method8437() throws IOException {
		method8425(-802758290);
		anOutputStream6976 = null;
	}

	public void method8438() throws IOException {
		int i = -148170455 * anInt6973 - 2066005613 * anInt6975;
		if (i != 0) {
			anOutputStream6976.write(aByteArray6972, 2066005613 * anInt6975, i);
			if (-148170455 * anInt6973 >= anInt6977 * 389103239)
				anInt6973 = 0;
			anInt6975 = anInt6973 * -796385235;
		}
	}

	public void method8439(int i, int i_6_) throws IOException {
		int i_7_ = -148170455 * anInt6973 - i - 1;
		if (i_7_ < 0)
			i_7_ += anInt6977 * 389103239;
		for (/**/; i_6_ != 0; i_6_--) {
			if (i_7_ >= 389103239 * anInt6977)
				i_7_ = 0;
			aByteArray6972[(anInt6973 += 1704497945) * -148170455 - 1] = aByteArray6972[i_7_++];
			if (anInt6973 * -148170455 >= anInt6977 * 389103239)
				method8425(1639231213);
		}
	}

	public void method8440() throws IOException {
		int i = -148170455 * anInt6973 - 2066005613 * anInt6975;
		if (i != 0) {
			anOutputStream6976.write(aByteArray6972, 2066005613 * anInt6975, i);
			if (-148170455 * anInt6973 >= anInt6977 * 389103239)
				anInt6973 = 0;
			anInt6975 = anInt6973 * -796385235;
		}
	}

	public byte method8441(int i, int i_8_) {
		int i_9_ = anInt6973 * -148170455 - i - 1;
		if (i_9_ < 0)
			i_9_ += anInt6977 * 389103239;
		return aByteArray6972[i_9_];
	}

	static final void method8442(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass61_11936.method1384((byte) 1);
	}

	static boolean method8443(Class586 class586, int i) {
		return Class178.method3069(class586, null, 508129354);
	}

	public static Class527_Sub30 method8444(int i) {
		if (null == Class529_Sub1.aClass694_7147 || Class529_Sub1.aClass691_10771 == null)
			return null;
		Class529_Sub1.aClass691_10771.method14003(Class529_Sub1.aClass694_7147, -1350836079);
		Class527_Sub30 class527_sub30 = ((Class527_Sub30) Class529_Sub1.aClass691_10771.method14010(707377900));
		if (class527_sub30 == null)
			return null;
		Class249 class249 = ((Class249) Class529_Sub1.aClass24_Sub12_7164.method81(((class527_sub30.anInt10567) * -558184067), -87902628));
		if (null == class249 || !class249.aBool2776 || !class249.method4638(Class529_Sub1.anInterface20_7121, Class529_Sub1.anInterface18_7120, 1949405825))
			return Class493.method8001((byte) -2);
		return class527_sub30;
	}

	static final void method8445(Class665 class665, int i) {
		class665.anInt8530 -= 32636613;
	}
}

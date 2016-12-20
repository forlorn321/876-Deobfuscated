/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class540 {
	short[] aShortArray7234;
	Class534 this$1;

	byte method9004(Class325 class325) throws IOException {
		int i = 1;
		do
			i = i << 1 | class325.method5735(aShortArray7234, i, 1835574539);
		while (i < 256);
		return (byte) i;
	}

	void method9005(int i) {
		Class225.method4192(aShortArray7234, 1385257905);
	}

	byte method9006(Class325 class325) throws IOException {
		int i = 1;
		do
			i = i << 1 | class325.method5735(aShortArray7234, i, 761612810);
		while (i < 256);
		return (byte) i;
	}

	byte method9007(Class325 class325, byte i, int i_0_) throws IOException {
		int i_1_ = 1;
		do {
			int i_2_ = i >> 7 & 0x1;
			i <<= 1;
			int i_3_ = class325.method5735(aShortArray7234, i_1_ + (i_2_ + 1 << 8), 534470152);
			i_1_ = i_1_ << 1 | i_3_;
			if (i_3_ != i_2_) {
				for (/**/; i_1_ < 256; i_1_ = i_1_ << 1 | class325.method5735(aShortArray7234, i_1_, 1315449884)) {
					/* empty */
				}
				break;
			}
		} while (i_1_ < 256);
		return (byte) i_1_;
	}

	void method9008() {
		Class225.method4192(aShortArray7234, 1515513975);
	}

	byte method9009(Class325 class325, byte i) throws IOException {
		int i_4_ = 1;
		do
			i_4_ = i_4_ << 1 | class325.method5735(aShortArray7234, i_4_, 655225811);
		while (i_4_ < 256);
		return (byte) i_4_;
	}

	Class540(Class534 class534) {
		this$1 = class534;
		aShortArray7234 = new short[768];
	}

	byte method9010(Class325 class325, byte i) throws IOException {
		int i_5_ = 1;
		do {
			int i_6_ = i >> 7 & 0x1;
			i <<= 1;
			int i_7_ = class325.method5735(aShortArray7234, i_5_ + (i_6_ + 1 << 8), 1513610672);
			i_5_ = i_5_ << 1 | i_7_;
			if (i_7_ != i_6_) {
				for (/**/; i_5_ < 256; i_5_ = i_5_ << 1 | class325.method5735(aShortArray7234, i_5_, 1094215564)) {
					/* empty */
				}
				break;
			}
		} while (i_5_ < 256);
		return (byte) i_5_;
	}

	public static int method9011(int i, byte i_8_) {
		Class527_Sub8_Sub11 class527_sub8_sub11 = (Class527_Sub8_Sub11) Class264.aClass14_2870.method709((long) i);
		if (class527_sub8_sub11 == null)
			return -1;
		if (Class264.aClass693_2871.aClass527_Sub8_8734 == class527_sub8_sub11.aClass527_Sub8_10402)
			return -1;
		return (((Class527_Sub8_Sub11) class527_sub8_sub11.aClass527_Sub8_10402).anInt11752 * 867529685);
	}

	public static void method9012(short i) {
		synchronized (Class633.aClass205_8288) {
			Class633.aClass205_8288.method3793((byte) 90);
		}
		synchronized (Class633.aClass205_8289) {
			Class633.aClass205_8289.method3793((byte) 43);
		}
	}
}

/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class285 implements Interface6 {
	public Interface14 method52(int i, Interface13 interface13) {
		return new Class259(i, interface13);
	}

	public Interface14 method58(int i, Interface13 interface13, int i_0_) {
		return new Class259(i, interface13);
	}

	public Class method53(byte i) {
		return com.jagex.Class259.class;
	}

	public Class method59() {
		return com.jagex.Class259.class;
	}

	public Interface14 method54(int i, Interface13 interface13) {
		return new Class259(i, interface13);
	}

	public Interface14 method56(int i, Interface13 interface13) {
		return new Class259(i, interface13);
	}

	public Class method57() {
		return com.jagex.Class259.class;
	}

	public Class method55() {
		return com.jagex.Class259.class;
	}

	Class285() {
		/* empty */
	}

	public static boolean method5204(int i, byte i_1_) {
		if (554639759 * Class209.anInt2244 != i || null == Class235.aClass192_2378) {
			Class263.method4963(917947649);
			Class235.aClass192_2378 = Class192.aClass192_2140;
			Class209.anInt2244 = i * -1844912785;
		}
		if (Class235.aClass192_2378 == Class192.aClass192_2140) {
			byte[] is = Class186.aClass459_2118.method7512(i, 1447980132);
			if (is == null)
				return false;
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			Class178.method3064(class527_sub38, (byte) 89);
			int i_2_ = class527_sub38.readUnsignedByte();
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				Class209.aClass694_2243.method14147(new Class527_Sub5(class527_sub38), -1932137304);
			int i_4_ = class527_sub38.readUnsignedSmart((byte) -66);
			Class209.aClass191Array2242 = new Class191[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				Class209.aClass191Array2242[i_5_] = new Class191(class527_sub38);
			int i_6_ = class527_sub38.readUnsignedSmart((byte) -6);
			Class466.aClass196Array5314 = new Class196[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				Class466.aClass196Array5314[i_7_] = new Class196(class527_sub38, i_7_);
			int i_8_ = class527_sub38.readUnsignedSmart((byte) -44);
			Class689.aClass186Array8689 = new Class186[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				Class689.aClass186Array8689[i_9_] = new Class186(class527_sub38);
			int i_10_ = class527_sub38.readUnsignedSmart((byte) -96);
			Class232.aClass195Array2359 = new Class195[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				Class232.aClass195Array2359[i_11_] = new Class195(class527_sub38);
			int i_12_ = class527_sub38.readUnsignedSmart((byte) -24);
			Class181.aClass208Array2093 = new Class208[i_12_];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
				Class181.aClass208Array2093[i_13_] = Class237.method4367(class527_sub38, (short) 255);
			Class235.aClass192_2378 = Class192.aClass192_2141;
		}
		if (Class192.aClass192_2141 == Class235.aClass192_2378) {
			boolean bool = true;
			Class196[] class196s = Class466.aClass196Array5314;
			for (int i_14_ = 0; i_14_ < class196s.length; i_14_++) {
				Class196 class196 = class196s[i_14_];
				if (!class196.method3722(1840760718))
					bool = false;
			}
			Class208[] class208s = Class181.aClass208Array2093;
			for (int i_15_ = 0; i_15_ < class208s.length; i_15_++) {
				Class208 class208 = class208s[i_15_];
				if (!class208.method3847((byte) 28))
					bool = false;
			}
			Class186[] class186s = Class689.aClass186Array8689;
			for (int i_16_ = 0; i_16_ < class186s.length; i_16_++) {
				Class186 class186 = class186s[i_16_];
				if (!class186.method3641(-2099063510))
					bool = false;
			}
			if (!bool)
				return false;
			Class235.aClass192_2378 = Class192.aClass192_2139;
		}
		return true;
	}

	static final void method5205(Class665 class665, int i) {
		int i_17_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_17_, -1089805699)).anInt139) * -1808599605;
	}

	static final void method5206(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method5207(Class665 class665, int i) {
		int i_18_ = 0;
		int i_19_ = 0;
		for (int i_20_ = 0; i_20_ < Class711.aClass457_Sub1Array8857.length; i_20_++) {
			if (null != Class711.aClass457_Sub1Array8857[i_20_] && Class711.aClass457_Sub1Array8857[i_20_].method15883(-1045751338)) {
				i_18_ += Class711.aClass457_Sub1Array8857[i_20_].method15879(-945537161);
				i_19_ += Class711.aClass457_Sub1Array8857[i_20_].method15884((byte) -15);
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0 == i_18_ ? 0 : 100 * i_19_ / i_18_;
	}

	static final void method5208(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_21_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_22_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class693 class693 = Class529.method8810(i_21_ >> 14 & 0x3fff, i_21_ & 0x3fff);
		boolean bool = false;
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) class693.method14072(-1248074220); null != class527_sub8_sub12; class527_sub8_sub12 = (Class527_Sub8_Sub12) class693.method14059(1510901503)) {
			if (911503199 * class527_sub8_sub12.anInt11765 == i_22_) {
				bool = true;
				break;
			}
		}
		if (bool)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method5209(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class279.method5176(class243, class240, class665, (byte) -15);
	}
}

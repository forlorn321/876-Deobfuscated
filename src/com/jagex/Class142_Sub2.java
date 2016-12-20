/* Class142_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class142_Sub2 extends Class142 {
	Interface38 anInterface38_9018;

	static Class142_Sub2 method14521(Class180_Sub2 class180_sub2, int i, int i_0_, int[] is, int[] is_1_) {
		if (class180_sub2.method14960(Class157.aClass157_1724, Class184.aClass184_2104)) {
			byte[] is_2_ = new byte[i * i_0_];
			for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
				int i_4_ = i_3_ * i + is[i_3_];
				for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
					is_2_[i_4_++] = (byte) -1;
			}
			return new Class142_Sub2(class180_sub2, i, i_0_, is_2_);
		}
		int[] is_6_ = new int[i * i_0_];
		for (int i_7_ = 0; i_7_ < i_0_; i_7_++) {
			int i_8_ = i_7_ * i + is[i_7_];
			for (int i_9_ = 0; i_9_ < is_1_[i_7_]; i_9_++)
				is_6_[i_8_++] = -16777216;
		}
		return new Class142_Sub2(class180_sub2, i, i_0_, is_6_);
	}

	Class142_Sub2(Class180_Sub2 class180_sub2, int i, int i_10_, int[] is) {
		anInterface38_9018 = class180_sub2.method14962(i, i_10_, false, is);
		anInterface38_9018.method226(false, false);
	}

	static Class142_Sub2 method14522(Class180_Sub2 class180_sub2, int i, int i_11_, int[] is, int[] is_12_) {
		if (class180_sub2.method14960(Class157.aClass157_1724, Class184.aClass184_2104)) {
			byte[] is_13_ = new byte[i * i_11_];
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
				int i_15_ = i_14_ * i + is[i_14_];
				for (int i_16_ = 0; i_16_ < is_12_[i_14_]; i_16_++)
					is_13_[i_15_++] = (byte) -1;
			}
			return new Class142_Sub2(class180_sub2, i, i_11_, is_13_);
		}
		int[] is_17_ = new int[i * i_11_];
		for (int i_18_ = 0; i_18_ < i_11_; i_18_++) {
			int i_19_ = i_18_ * i + is[i_18_];
			for (int i_20_ = 0; i_20_ < is_12_[i_18_]; i_20_++)
				is_17_[i_19_++] = -16777216;
		}
		return new Class142_Sub2(class180_sub2, i, i_11_, is_17_);
	}

	static Class142_Sub2 method14523(Class180_Sub2 class180_sub2, int i, int i_21_, int[] is, int[] is_22_) {
		if (class180_sub2.method14960(Class157.aClass157_1724, Class184.aClass184_2104)) {
			byte[] is_23_ = new byte[i * i_21_];
			for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
				int i_25_ = i_24_ * i + is[i_24_];
				for (int i_26_ = 0; i_26_ < is_22_[i_24_]; i_26_++)
					is_23_[i_25_++] = (byte) -1;
			}
			return new Class142_Sub2(class180_sub2, i, i_21_, is_23_);
		}
		int[] is_27_ = new int[i * i_21_];
		for (int i_28_ = 0; i_28_ < i_21_; i_28_++) {
			int i_29_ = i_28_ * i + is[i_28_];
			for (int i_30_ = 0; i_30_ < is_22_[i_28_]; i_30_++)
				is_27_[i_29_++] = -16777216;
		}
		return new Class142_Sub2(class180_sub2, i, i_21_, is_27_);
	}

	Class142_Sub2(Class180_Sub2 class180_sub2, int i, int i_31_, byte[] is) {
		anInterface38_9018 = class180_sub2.method15022(Class157.aClass157_1724, i, i_31_, false, is);
		anInterface38_9018.method226(false, false);
	}
}

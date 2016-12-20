/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class279 {
	int[] anIntArray3169;
	byte[] aByteArray3170;
	int[] anIntArray3171;
	static int anInt3172;

	int method5168(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_, byte i_3_) {
		int i_4_ = 0;
		int i_5_ = i_2_ << 3;
		for (i_0_ += i; i < i_0_; i++) {
			int i_6_ = is[i] & 0xff;
			int i_7_ = anIntArray3171[i_6_];
			int i_8_ = aByteArray3170[i_6_];
			if (i_8_ == 0)
				throw new RuntimeException(new StringBuilder().append("").append(i_6_).toString());
			int i_9_ = i_5_ >> 3;
			int i_10_ = i_5_ & 0x7;
			i_4_ &= -i_10_ >> 31;
			int i_11_ = (i_8_ + i_10_ - 1 >> 3) + i_9_;
			i_10_ += 24;
			is_1_[i_9_] = (byte) (i_4_ |= i_7_ >>> i_10_);
			if (i_9_ < i_11_) {
				i_9_++;
				i_10_ -= 8;
				is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
				if (i_9_ < i_11_) {
					i_9_++;
					i_10_ -= 8;
					is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
					if (i_9_ < i_11_) {
						i_9_++;
						i_10_ -= 8;
						is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
						if (i_9_ < i_11_) {
							i_9_++;
							i_10_ -= 8;
							is_1_[i_9_] = (byte) (i_4_ = i_7_ << -i_10_);
						}
					}
				}
			}
			i_5_ += i_8_;
		}
		return (7 + i_5_ >> 3) - i_2_;
	}

	public Class279(byte[] is) {
		int i = is.length;
		anIntArray3171 = new int[i];
		aByteArray3170 = is;
		int[] is_12_ = new int[33];
		anIntArray3169 = new int[8];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			int i_15_ = is[i_14_];
			if (0 != i_15_) {
				int i_16_ = 1 << 32 - i_15_;
				int i_17_ = is_12_[i_15_];
				anIntArray3171[i_14_] = i_17_;
				int i_18_;
				if (0 != (i_17_ & i_16_))
					i_18_ = is_12_[i_15_ - 1];
				else {
					i_18_ = i_17_ | i_16_;
					for (int i_19_ = i_15_ - 1; i_19_ >= 1; i_19_--) {
						int i_20_ = is_12_[i_19_];
						if (i_17_ != i_20_)
							break;
						int i_21_ = 1 << 32 - i_19_;
						if ((i_20_ & i_21_) != 0) {
							is_12_[i_19_] = is_12_[i_19_ - 1];
							break;
						}
						is_12_[i_19_] = i_20_ | i_21_;
					}
				}
				is_12_[i_15_] = i_18_;
				for (int i_22_ = 1 + i_15_; i_22_ <= 32; i_22_++) {
					if (is_12_[i_22_] == i_17_)
						is_12_[i_22_] = i_18_;
				}
				int i_23_ = 0;
				for (int i_24_ = 0; i_24_ < i_15_; i_24_++) {
					int i_25_ = -2147483648 >>> i_24_;
					if ((i_17_ & i_25_) != 0) {
						if (0 == anIntArray3169[i_23_])
							anIntArray3169[i_23_] = i_13_;
						i_23_ = anIntArray3169[i_23_];
					} else
						i_23_++;
					if (i_23_ >= anIntArray3169.length) {
						int[] is_26_ = new int[2 * anIntArray3169.length];
						for (int i_27_ = 0; i_27_ < anIntArray3169.length; i_27_++)
							is_26_[i_27_] = anIntArray3169[i_27_];
						anIntArray3169 = is_26_;
					}
					i_25_ >>>= 1;
				}
				anIntArray3169[i_23_] = i_14_ ^ 0xffffffff;
				if (i_23_ >= i_13_)
					i_13_ = 1 + i_23_;
			}
		}
	}

	int method5169(byte[] is, int i, byte[] is_28_, int i_29_, int i_30_, int i_31_) {
		if (i_30_ == 0)
			return 0;
		int i_32_ = 0;
		i_30_ += i_29_;
		int i_33_ = i;
		for (;;) {
			byte i_34_ = is[i_33_];
			if (i_34_ < 0)
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			int i_35_;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x40) != 0)
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if (0 != (i_34_ & 0x20))
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if (0 != (i_34_ & 0x10))
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x8) != 0)
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x4) != 0)
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if (0 != (i_34_ & 0x2))
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x1) != 0)
				i_32_ = anIntArray3169[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3169[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			i_33_++;
		}
		return 1 + i_33_ - i;
	}

	static void method5170(Class665 class665, byte i) {
		class665.anIntArray8525[1769813785 * class665.anInt8526 - 1] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 1]), -454934524)).anInt2831 * -1997826637);
	}

	static final void method5171(Class665 class665, int i) {
		int i_36_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_36_, -1683662518);
		Class240 class240 = Class183.aClass240Array2100[i_36_ >> 16];
		Class425.method6729(class243, class240, class665, 39411999);
	}

	static final void method5172(Class665 class665, int i) {
		int i_37_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3992(i_37_, 1382083256).method3907(-1094372899);
	}

	static final void method5173(Class665 class665, short i) {
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) != 0);
		int i_38_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class683.method13911((long) i_38_, 0, bool, Class144_Sub1.aClass671_8995, -1995525570);
	}

	static final void method5174(Class665 class665, int i) {
		int i_39_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub17 class527_sub8_sub17 = Exception_Sub3.aClass51_11362.method1277(i_39_, 895770615);
		if (class527_sub8_sub17.anIntArray11823 == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class527_sub8_sub17.anIntArray11823.length;
	}

	static boolean method5175(int i) {
		Class32.anInt286 = -1320406984;
		Class32.aClass109_270 = client.aClass109_11066;
		return Class40.method1166(-1L == (-8573635942399706625L * Class32.aLong321), true, "", "", -8573635942399706625L * Class32.aLong321);
	}

	static final void method5176(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class665.anInt8526 -= 307142523;
		class243.anInt2580 = -1278651485 * (class665.anIntArray8525[1769813785 * class665.anInt8526]);
		class243.anInt2581 = (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1] * 1007227417);
		class243.anInt2579 = (class665.anIntArray8525[2 + class665.anInt8526 * 1769813785] * -1619900947);
		Class430.method6876(class243, (byte) 88);
	}

	static String method5177(Throwable throwable, short i) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder().append(runtimeexception_sub1.aString12046).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable12043;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_40_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_40_));
		String string_41_ = bufferedreader.readLine();
		for (;;) {
			String string_42_ = bufferedreader.readLine();
			if (string_42_ == null)
				break;
			int i_43_ = string_42_.indexOf('(');
			int i_44_ = string_42_.indexOf(')', 1 + i_43_);
			String string_45_;
			if (-1 != i_43_)
				string_45_ = string_42_.substring(0, i_43_);
			else
				string_45_ = string_42_;
			string_45_ = string_45_.trim();
			string_45_ = string_45_.substring(string_45_.lastIndexOf(' ') + 1);
			string_45_ = string_45_.substring(string_45_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_45_).toString();
			if (-1 != i_43_ && -1 != i_44_) {
				int i_46_ = string_42_.indexOf(".java:", i_43_);
				if (i_46_ >= 0)
					string = new StringBuilder().append(string).append(string_42_.substring(5 + i_46_, i_44_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_41_).toString();
		return string;
	}
}

/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Stack;

public class Class558 {
	Class546 aClass546_7529;
	boolean aBool7530;
	static Stack aStack7531 = new Stack();
	public Class640_Sub1 aClass640_Sub1_7532;

	public boolean method9432(Class180 class180, int i, int i_0_) {
		int i_1_ = aClass640_Sub1_7532.method17046(82553236);
		if (null != aClass640_Sub1_7532.aClass169Array10863) {
			for (int i_2_ = 0; i_2_ < aClass640_Sub1_7532.aClass169Array10863.length; i_2_++) {
				aClass640_Sub1_7532.aClass169Array10863[i_2_].anInt1877 <<= i_1_;
				if ((aClass640_Sub1_7532.aClass169Array10863[i_2_].method2705(aClass546_7529.anInt7261 * -1608358095 + i, i_0_ + aClass546_7529.anInt7263 * 1135605963)) && aClass640_Sub1_7532.method17033(class180, i, i_0_, (byte) 42)) {
					aClass640_Sub1_7532.aClass169Array10863[i_2_].anInt1877 >>= i_1_;
					return true;
				}
				aClass640_Sub1_7532.aClass169Array10863[i_2_].anInt1877 >>= i_1_;
			}
		}
		return false;
	}

	public boolean method9433(Class180 class180, int i, int i_3_, int i_4_) {
		int i_5_ = aClass640_Sub1_7532.method17046(-767085904);
		if (null != aClass640_Sub1_7532.aClass169Array10863) {
			for (int i_6_ = 0; i_6_ < aClass640_Sub1_7532.aClass169Array10863.length; i_6_++) {
				aClass640_Sub1_7532.aClass169Array10863[i_6_].anInt1877 <<= i_5_;
				if ((aClass640_Sub1_7532.aClass169Array10863[i_6_].method2705(aClass546_7529.anInt7261 * -1608358095 + i, i_3_ + aClass546_7529.anInt7263 * 1135605963)) && aClass640_Sub1_7532.method17033(class180, i, i_3_, (byte) 7)) {
					aClass640_Sub1_7532.aClass169Array10863[i_6_].anInt1877 >>= i_5_;
					return true;
				}
				aClass640_Sub1_7532.aClass169Array10863[i_6_].anInt1877 >>= i_5_;
			}
		}
		return false;
	}

	Class558() {
		/* empty */
	}

	public static Class558 method9434(boolean bool) {
		synchronized (aStack7531) {
			Class558 class558;
			if (aStack7531.isEmpty())
				class558 = new Class558();
			else
				class558 = (Class558) aStack7531.pop();
			class558.aBool7530 = bool;
			Class558 class558_7_ = class558;
			return class558_7_;
		}
	}

	public static Class558 method9435(boolean bool) {
		synchronized (aStack7531) {
			Class558 class558;
			if (aStack7531.isEmpty())
				class558 = new Class558();
			else
				class558 = (Class558) aStack7531.pop();
			class558.aBool7530 = bool;
			Class558 class558_8_ = class558;
			return class558_8_;
		}
	}

	public static void method9436() {
		synchronized (aStack7531) {
			aStack7531 = new Stack();
		}
	}

	public static void method9437() {
		synchronized (aStack7531) {
			aStack7531 = new Stack();
		}
	}

	public static void method9438() {
		synchronized (aStack7531) {
			aStack7531 = new Stack();
		}
	}

	public static Class558 method9439(boolean bool) {
		synchronized (aStack7531) {
			Class558 class558;
			if (aStack7531.isEmpty())
				class558 = new Class558();
			else
				class558 = (Class558) aStack7531.pop();
			class558.aBool7530 = bool;
			Class558 class558_9_ = class558;
			return class558_9_;
		}
	}

	static final void method9440(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class72.method1500(class243, class665, (byte) 29);
	}

	static final void method9441(Class665 class665, byte i) {
		Class642.method10729(264014236);
	}

	static final void method9442(Class665 class665, byte i) {
		Class527_Sub36 class527_sub36 = ((Class527_Sub36) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]));
		if (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -37) != Class309.aClass309_3456)
			throw new RuntimeException();
		Class696_Sub1 class696_sub1 = ((Class696_Sub1) Class208_Sub10.aClass296_Sub1_9923.method5472(-1489268390));
		class696_sub1.method17124(class527_sub36, (byte) 48);
		client.aBool11119 = true;
	}

	static void method9443(Class243 class243, Class142 class142, int i, int i_10_, int i_11_, int i_12_, int i_13_, String string, Class174 class174, Class22 class22, int i_14_, int i_15_) {
		int i_16_;
		if (Class30.anInt265 * -349191067 == 2)
			i_16_ = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(-1579710855) * 2607.5945876176133) + -973282125 * client.anInt11088) & 0x3fff;
		else if (6 == -349191067 * Class30.anInt265)
			i_16_ = (int) client.aFloat11112 & 0x3fff;
		else
			i_16_ = (-973282125 * client.anInt11088 + (int) client.aFloat11112 & 0x3fff);
		int i_17_ = (Math.max(-1054537975 * class243.anInt2511 / 2, class243.anInt2514 * -1386504031 / 2) + 10);
		int i_18_ = i_12_ * i_12_ + i_11_ * i_11_;
		if (i_18_ <= i_17_ * i_17_) {
			int i_19_ = Class428.anIntArray4825[i_16_];
			int i_20_ = Class428.anIntArray4819[i_16_];
			if (6 != -349191067 * Class30.anInt265) {
				i_19_ = 256 * i_19_ / (-2083955513 * client.anInt10991 + 256);
				i_20_ = i_20_ * 256 / (client.anInt10991 * -2083955513 + 256);
			}
			int i_21_ = i_12_ * i_19_ + i_20_ * i_11_ >> 14;
			int i_22_ = i_12_ * i_20_ - i_19_ * i_11_ >> 14;
			int i_23_ = class22.method798(string, 100, null, -841773909);
			int i_24_ = class22.method810(string, 100, 0, null, -1180189673);
			i_21_ -= i_23_ / 2;
			if (i_21_ >= -(class243.anInt2511 * -1054537975) && i_21_ <= class243.anInt2511 * -1054537975 && i_22_ >= -(-1386504031 * class243.anInt2514) && i_22_ <= -1386504031 * class243.anInt2514)
				class174.method2746(string, (class243.anInt2511 * -1054537975 / 2 + (i_21_ + i)), (i_10_ + -1386504031 * class243.anInt2514 / 2 - i_22_ - i_13_ - i_24_), i_23_, 50, i_14_, 0, 1, 0, 0, null, null, class142, i, i_10_, -1300246824);
		}
	}

	public static File method9444(String string, int i) {
		if (!Class502.aBool6873)
			throw new RuntimeException("");
		File file = (File) Class502.aHashtable6871.get(string);
		if (null != file)
			return file;
		File file_25_ = new File(Class502.aFile6872, string);
		RandomAccessFile randomaccessfile = null;
		File file_26_;
		try {
			File file_27_ = new File(file_25_.getParent());
			if (!file_27_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_25_, "rw");
			int i_28_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_28_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			Class502.aHashtable6871.put(string, file_25_);
			file_26_ = file_25_;
		} catch (Exception exception) {
			try {
				if (null != randomaccessfile) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_29_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_26_;
	}
}

/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.ping.Ping;

public class Class440 {
	static int anInt4871 = 0;
	static Class59[] aClass59Array4872;
	static int anInt4873 = 0;
	public static int anInt4874;

	public static int method5321() {
		if (-135589647 * anInt4871 == 0) {
			Class59.aClass59_613.method985(new Class432("jaclib"), (byte) 13);
			if (Class59.aClass59_613.method976(827910416).method48(-1965536233) != 100)
				return 1;
			if (!((Class432) Class59.aClass59_613.method976(-1755898842)).method5180((short) -16159) && !Class167.method2410(-1504778739)) {
				try {
					Class313.aclient3500.method6133((byte) 5);
					Class554.method6783((byte) 1);
					Ping.init();
				} catch (Exception_Sub6 exception_sub6) {
					Class684.method8105(Class52.aClass52_590, exception_sub6.aString11368, (-1224299617 * exception_sub6.anInt11367), exception_sub6.getCause(), 1877876975);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt4871 = 1671553041;
		}
		if (1 == -135589647 * anInt4871) {
			aClass59Array4872 = Class59.method983(-2147055264);
			Class59.aClass59_620.method985(new Class442(Class184_Sub2.aClass461_9443), (byte) 11);
			Class59.aClass59_614.method985(new Class432("jaggl"), (byte) -94);
			Class432 class432 = new Class432("jagdx");
			if (!Class241.osName.startsWith("win"))
				class432.method5181((byte) 101);
			Class59.aClass59_612.method985(class432, (byte) 55);
			Class59.aClass59_616.method985(new Class432("sw3d"), (byte) 82);
			Class59.aClass59_617.method985(new Class432("hw3d"), (byte) -12);
			Class59.aClass59_618.method985(new Class442(Class540.aClass461_7161), (byte) 42);
			Class59.aClass59_619.method985(new Class442(Class590.aClass461_7789), (byte) -40);
			Class59.aClass59_632.method985(new Class442(Class205_Sub9.aClass461_9887), (byte) -34);
			Class59.aClass59_638.method985(new Class442(Class214.aClass461_2301), (byte) 1);
			Class59.aClass59_621.method985(new Class442(Class303.aClass461_3432), (byte) -72);
			Class59.aClass59_623.method985(new Class442(Class214.aClass461_2302), (byte) -19);
			Class59.aClass59_624.method985(new Class442(Class154.aClass461_1720), (byte) -29);
			Class59.aClass59_622.method985(new Class442(Class20.aClass461_215), (byte) 4);
			Class59.aClass59_626.method985(new Class442(Class218.aClass461_2308), (byte) -19);
			Class59.aClass59_625.method985(new Class442(Class397.aClass461_4114), (byte) 72);
			Class59.aClass59_627.method985(new Class442(Class247_Sub1.aClass461_9968), (byte) -10);
			Class59.aClass59_629.method985(new Class442(Class576.aClass461_7687), (byte) -37);
			Class59.aClass59_630.method985(new Class442(Class711.aClass461_8849), (byte) -5);
			Class59.aClass59_631.method985(new Class442(Class550_Sub1.aClass461_10617), (byte) -10);
			Class59.aClass59_628.method985(new Class442(Class271.aClass461_2886), (byte) 7);
			Class59.aClass59_633.method985(new Class441((Class395.aClass461_4109), "huffman"), (byte) 49);
			Class59.aClass59_634.method985(new Class442(Class318.aClass461_3526), (byte) -14);
			Class59.aClass59_635.method985(new Class442(Class649_Sub1_Sub4_Sub2.aClass461_12021), (byte) 44);
			Class59.aClass59_636.method985(new Class442(Class710_Sub43.aClass461_10940), (byte) -33);
			Class59.aClass59_637.method985(new Class444((Class613.aClass461_8013), 0), (byte) -83);
			for (int i = 0; i < aClass59Array4872.length; i++) {
				if (aClass59Array4872[i].method976(-16477881) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class59[] class59s = aClass59Array4872;
			for (int i_0_ = 0; i_0_ < class59s.length; i_0_++) {
				Class59 class59 = class59s[i_0_];
				int i_1_ = class59.method975((byte) 125);
				int i_2_ = class59.method976(-1872075697).method48(-1948587878);
				i += i_1_ * i_2_ / 100;
			}
			anInt4873 = i * 1069307345;
			anInt4871 = -951861214;
		}
		if (null == aClass59Array4872)
			return 100;
		int i = 0;
		int i_3_ = 0;
		boolean bool = true;
		Class59[] class59s = aClass59Array4872;
		for (int i_4_ = 0; i_4_ < class59s.length; i_4_++) {
			Class59 class59 = class59s[i_4_];
			int i_5_ = class59.method975((byte) 97);
			int i_6_ = class59.method976(-1081385269).method48(-2076498628);
			if (i_6_ < 100)
				bool = false;
			i += i_5_;
			i_3_ += i_6_ * i_5_ / 100;
		}
		if (bool)
			aClass59Array4872 = null;
		i_3_ -= 800596785 * anInt4873;
		i -= anInt4873 * 800596785;
		int i_7_ = i > 0 ? i_3_ * 100 / i : 100;
		if (!bool && i_7_ > 99)
			i_7_ = 99;
		return i_7_;
	}

	Class440() throws Throwable {
		throw new Error();
	}

	public static int method5322() {
		if (-135589647 * anInt4871 == 0) {
			Class59.aClass59_613.method985(new Class432("jaclib"), (byte) -58);
			if (Class59.aClass59_613.method976(-156897680).method48(-2073460681) != 100)
				return 1;
			if (!((Class432) Class59.aClass59_613.method976(655224871)).method5180((short) 3403) && !Class167.method2410(-1504778739)) {
				try {
					Class313.aclient3500.method6133((byte) 5);
					Class554.method6783((byte) 7);
					Ping.init();
				} catch (Exception_Sub6 exception_sub6) {
					Class684.method8105(Class52.aClass52_590, exception_sub6.aString11368, (-1224299617 * exception_sub6.anInt11367), exception_sub6.getCause(), 785039306);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt4871 = 1671553041;
		}
		if (1 == -135589647 * anInt4871) {
			aClass59Array4872 = Class59.method983(-2140785721);
			Class59.aClass59_620.method985(new Class442(Class184_Sub2.aClass461_9443), (byte) 55);
			Class59.aClass59_614.method985(new Class432("jaggl"), (byte) -8);
			Class432 class432 = new Class432("jagdx");
			if (!Class241.osName.startsWith("win"))
				class432.method5181((byte) 112);
			Class59.aClass59_612.method985(class432, (byte) 22);
			Class59.aClass59_616.method985(new Class432("sw3d"), (byte) -55);
			Class59.aClass59_617.method985(new Class432("hw3d"), (byte) 73);
			Class59.aClass59_618.method985(new Class442(Class540.aClass461_7161), (byte) -53);
			Class59.aClass59_619.method985(new Class442(Class590.aClass461_7789), (byte) -24);
			Class59.aClass59_632.method985(new Class442(Class205_Sub9.aClass461_9887), (byte) -42);
			Class59.aClass59_638.method985(new Class442(Class214.aClass461_2301), (byte) 87);
			Class59.aClass59_621.method985(new Class442(Class303.aClass461_3432), (byte) -32);
			Class59.aClass59_623.method985(new Class442(Class214.aClass461_2302), (byte) -12);
			Class59.aClass59_624.method985(new Class442(Class154.aClass461_1720), (byte) 30);
			Class59.aClass59_622.method985(new Class442(Class20.aClass461_215), (byte) 22);
			Class59.aClass59_626.method985(new Class442(Class218.aClass461_2308), (byte) -23);
			Class59.aClass59_625.method985(new Class442(Class397.aClass461_4114), (byte) -39);
			Class59.aClass59_627.method985(new Class442(Class247_Sub1.aClass461_9968), (byte) -36);
			Class59.aClass59_629.method985(new Class442(Class576.aClass461_7687), (byte) -75);
			Class59.aClass59_630.method985(new Class442(Class711.aClass461_8849), (byte) 42);
			Class59.aClass59_631.method985(new Class442(Class550_Sub1.aClass461_10617), (byte) -3);
			Class59.aClass59_628.method985(new Class442(Class271.aClass461_2886), (byte) -70);
			Class59.aClass59_633.method985(new Class441((Class395.aClass461_4109), "huffman"), (byte) 24);
			Class59.aClass59_634.method985(new Class442(Class318.aClass461_3526), (byte) -61);
			Class59.aClass59_635.method985(new Class442(Class649_Sub1_Sub4_Sub2.aClass461_12021), (byte) -45);
			Class59.aClass59_636.method985(new Class442(Class710_Sub43.aClass461_10940), (byte) -41);
			Class59.aClass59_637.method985(new Class444((Class613.aClass461_8013), 0), (byte) -82);
			for (int i = 0; i < aClass59Array4872.length; i++) {
				if (aClass59Array4872[i].method976(-133480128) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class59[] class59s = aClass59Array4872;
			for (int i_8_ = 0; i_8_ < class59s.length; i_8_++) {
				Class59 class59 = class59s[i_8_];
				int i_9_ = class59.method975((byte) 113);
				int i_10_ = class59.method976(1231964061).method48(-2105651277);
				i += i_9_ * i_10_ / 100;
			}
			anInt4873 = i * 1069307345;
			anInt4871 = -951861214;
		}
		if (null == aClass59Array4872)
			return 100;
		int i = 0;
		int i_11_ = 0;
		boolean bool = true;
		Class59[] class59s = aClass59Array4872;
		for (int i_12_ = 0; i_12_ < class59s.length; i_12_++) {
			Class59 class59 = class59s[i_12_];
			int i_13_ = class59.method975((byte) 114);
			int i_14_ = class59.method976(1357868636).method48(-2077034522);
			if (i_14_ < 100)
				bool = false;
			i += i_13_;
			i_11_ += i_14_ * i_13_ / 100;
		}
		if (bool)
			aClass59Array4872 = null;
		i_11_ -= 800596785 * anInt4873;
		i -= anInt4873 * 800596785;
		int i_15_ = i > 0 ? i_11_ * 100 / i : 100;
		if (!bool && i_15_ > 99)
			i_15_ = 99;
		return i_15_;
	}

	public static int method5323() {
		if (-135589647 * anInt4871 == 0) {
			Class59.aClass59_613.method985(new Class432("jaclib"), (byte) -26);
			if (Class59.aClass59_613.method976(1504414219).method48(-2023401523) != 100)
				return 1;
			if (!((Class432) Class59.aClass59_613.method976(277025795)).method5180((short) -10286) && !Class167.method2410(-1504778739)) {
				try {
					Class313.aclient3500.method6133((byte) 5);
					Class554.method6783((byte) 24);
					Ping.init();
				} catch (Exception_Sub6 exception_sub6) {
					Class684.method8105(Class52.aClass52_590, exception_sub6.aString11368, (-1224299617 * exception_sub6.anInt11367), exception_sub6.getCause(), 1204005323);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt4871 = 1671553041;
		}
		if (1 == -135589647 * anInt4871) {
			aClass59Array4872 = Class59.method983(-2131965252);
			Class59.aClass59_620.method985(new Class442(Class184_Sub2.aClass461_9443), (byte) 8);
			Class59.aClass59_614.method985(new Class432("jaggl"), (byte) -27);
			Class432 class432 = new Class432("jagdx");
			if (!Class241.osName.startsWith("win"))
				class432.method5181((byte) 51);
			Class59.aClass59_612.method985(class432, (byte) 67);
			Class59.aClass59_616.method985(new Class432("sw3d"), (byte) 26);
			Class59.aClass59_617.method985(new Class432("hw3d"), (byte) -20);
			Class59.aClass59_618.method985(new Class442(Class540.aClass461_7161), (byte) 2);
			Class59.aClass59_619.method985(new Class442(Class590.aClass461_7789), (byte) 48);
			Class59.aClass59_632.method985(new Class442(Class205_Sub9.aClass461_9887), (byte) -36);
			Class59.aClass59_638.method985(new Class442(Class214.aClass461_2301), (byte) 28);
			Class59.aClass59_621.method985(new Class442(Class303.aClass461_3432), (byte) -13);
			Class59.aClass59_623.method985(new Class442(Class214.aClass461_2302), (byte) -64);
			Class59.aClass59_624.method985(new Class442(Class154.aClass461_1720), (byte) -77);
			Class59.aClass59_622.method985(new Class442(Class20.aClass461_215), (byte) 53);
			Class59.aClass59_626.method985(new Class442(Class218.aClass461_2308), (byte) 27);
			Class59.aClass59_625.method985(new Class442(Class397.aClass461_4114), (byte) -111);
			Class59.aClass59_627.method985(new Class442(Class247_Sub1.aClass461_9968), (byte) -66);
			Class59.aClass59_629.method985(new Class442(Class576.aClass461_7687), (byte) 35);
			Class59.aClass59_630.method985(new Class442(Class711.aClass461_8849), (byte) -18);
			Class59.aClass59_631.method985(new Class442(Class550_Sub1.aClass461_10617), (byte) -11);
			Class59.aClass59_628.method985(new Class442(Class271.aClass461_2886), (byte) -22);
			Class59.aClass59_633.method985(new Class441((Class395.aClass461_4109), "huffman"), (byte) -47);
			Class59.aClass59_634.method985(new Class442(Class318.aClass461_3526), (byte) 26);
			Class59.aClass59_635.method985(new Class442(Class649_Sub1_Sub4_Sub2.aClass461_12021), (byte) 33);
			Class59.aClass59_636.method985(new Class442(Class710_Sub43.aClass461_10940), (byte) 20);
			Class59.aClass59_637.method985(new Class444((Class613.aClass461_8013), 0), (byte) -3);
			for (int i = 0; i < aClass59Array4872.length; i++) {
				if (aClass59Array4872[i].method976(1936395143) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class59[] class59s = aClass59Array4872;
			for (int i_16_ = 0; i_16_ < class59s.length; i_16_++) {
				Class59 class59 = class59s[i_16_];
				int i_17_ = class59.method975((byte) 102);
				int i_18_ = class59.method976(-2851771).method48(-1996563862);
				i += i_17_ * i_18_ / 100;
			}
			anInt4873 = i * 1069307345;
			anInt4871 = -951861214;
		}
		if (null == aClass59Array4872)
			return 100;
		int i = 0;
		int i_19_ = 0;
		boolean bool = true;
		Class59[] class59s = aClass59Array4872;
		for (int i_20_ = 0; i_20_ < class59s.length; i_20_++) {
			Class59 class59 = class59s[i_20_];
			int i_21_ = class59.method975((byte) 31);
			int i_22_ = class59.method976(-111951138).method48(-2060120550);
			if (i_22_ < 100)
				bool = false;
			i += i_21_;
			i_19_ += i_22_ * i_21_ / 100;
		}
		if (bool)
			aClass59Array4872 = null;
		i_19_ -= 800596785 * anInt4873;
		i -= anInt4873 * 800596785;
		int i_23_ = i > 0 ? i_19_ * 100 / i : 100;
		if (!bool && i_23_ > 99)
			i_23_ = 99;
		return i_23_;
	}

	public static void method5324() {
		anInt4871 = 0;
		anInt4873 = 0;
	}

	public static void method5325() {
		anInt4871 = 0;
		anInt4873 = 0;
	}

	public static void method5326() {
		anInt4871 = 0;
		anInt4873 = 0;
	}

	static final void method5327(Class668 class668, int i) {
		int i_24_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (2 == -1484801557 * client.anInt11289 && i_24_ < 142551095 * client.anInt11288)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = client.aClass31Array11291[i_24_].aString268;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}
}

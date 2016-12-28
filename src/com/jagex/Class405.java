/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.ping.Ping;

public class Class405 {
	static final int anInt4234 = 12;
	static final int anInt4235 = 3;
	static final int anInt4236 = 1;
	static final int anInt4237 = 6;
	static final int anInt4238 = 10;
	static final int anInt4239 = 9;
	static final int anInt4240 = 11;
	static final int anInt4241 = 13;
	static final int anInt4242 = 8;
	static final int anInt4243 = 7;
	static final int anInt4244 = 5;
	static final int anInt4245 = 2;
	static final int anInt4246 = 4;

	Class405() throws Throwable {
		throw new Error();
	}

	public static int method4938(int i) {
		if (-135589647 * Class440.anInt4871 == 0) {
			Class59.aClass59_613.method985(new Class432("jaclib"), (byte) -97);
			if (Class59.aClass59_613.method976(-1894391340).method48(-2018821559) != 100)
				return 1;
			if (!((Class432) Class59.aClass59_613.method976(1866549365)).method5180((short) -11372) && !Class167.method2410(-1504778739)) {
				try {
					Class313.aclient3500.method6133((byte) 5);
					Class554.method6783((byte) -13);
					Ping.init();
				} catch (Exception_Sub6 exception_sub6) {
					Class684.method8105(Class52.aClass52_590, exception_sub6.aString11368, (-1224299617 * exception_sub6.anInt11367), exception_sub6.getCause(), 766165237);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			Class440.anInt4871 = 1671553041;
		}
		if (1 == -135589647 * Class440.anInt4871) {
			Class440.aClass59Array4872 = Class59.method983(-2133746640);
			Class59.aClass59_620.method985(new Class442(Class184_Sub2.aClass461_9443), (byte) -96);
			Class59.aClass59_614.method985(new Class432("jaggl"), (byte) 74);
			Class432 class432 = new Class432("jagdx");
			if (!Class241.aString2456.startsWith("win"))
				class432.method5181((byte) 55);
			Class59.aClass59_612.method985(class432, (byte) 35);
			Class59.aClass59_616.method985(new Class432("sw3d"), (byte) -47);
			Class59.aClass59_617.method985(new Class432("hw3d"), (byte) 53);
			Class59.aClass59_618.method985(new Class442(Class540.aClass461_7161), (byte) 51);
			Class59.aClass59_619.method985(new Class442(Class590.aClass461_7789), (byte) -107);
			Class59.aClass59_632.method985(new Class442(Class205_Sub9.aClass461_9887), (byte) -15);
			Class59.aClass59_638.method985(new Class442(Class214.aClass461_2301), (byte) 22);
			Class59.aClass59_621.method985(new Class442(Class303.aClass461_3432), (byte) -66);
			Class59.aClass59_623.method985(new Class442(Class214.aClass461_2302), (byte) -51);
			Class59.aClass59_624.method985(new Class442(Class154.aClass461_1720), (byte) 26);
			Class59.aClass59_622.method985(new Class442(Class20.aClass461_215), (byte) 107);
			Class59.aClass59_626.method985(new Class442(Class218.aClass461_2308), (byte) 82);
			Class59.aClass59_625.method985(new Class442(Class397.aClass461_4114), (byte) -6);
			Class59.aClass59_627.method985(new Class442(Class247_Sub1.aClass461_9968), (byte) -35);
			Class59.aClass59_629.method985(new Class442(Class576.aClass461_7687), (byte) 10);
			Class59.aClass59_630.method985(new Class442(Class711.aClass461_8849), (byte) 117);
			Class59.aClass59_631.method985(new Class442(Class550_Sub1.aClass461_10617), (byte) -5);
			Class59.aClass59_628.method985(new Class442(Class271.aClass461_2886), (byte) 22);
			Class59.aClass59_633.method985(new Class441((Class395.aClass461_4109), "huffman"), (byte) -33);
			Class59.aClass59_634.method985(new Class442(Class318.aClass461_3526), (byte) -67);
			Class59.aClass59_635.method985(new Class442(Class649_Sub1_Sub4_Sub2.aClass461_12021), (byte) -4);
			Class59.aClass59_636.method985(new Class442(Class710_Sub43.aClass461_10940), (byte) -2);
			Class59.aClass59_637.method985(new Class444((Class613.aClass461_8013), 0), (byte) -80);
			for (int i_0_ = 0; i_0_ < Class440.aClass59Array4872.length; i_0_++) {
				if (Class440.aClass59Array4872[i_0_].method976(-1143824623) == null)
					throw new RuntimeException();
			}
			int i_1_ = 0;
			Class59[] class59s = Class440.aClass59Array4872;
			for (int i_2_ = 0; i_2_ < class59s.length; i_2_++) {
				Class59 class59 = class59s[i_2_];
				int i_3_ = class59.method975((byte) 27);
				int i_4_ = class59.method976(1012455536).method48(-2095772073);
				i_1_ += i_3_ * i_4_ / 100;
			}
			Class440.anInt4873 = i_1_ * 1069307345;
			Class440.anInt4871 = -951861214;
		}
		if (null == Class440.aClass59Array4872)
			return 100;
		int i_5_ = 0;
		int i_6_ = 0;
		boolean bool = true;
		Class59[] class59s = Class440.aClass59Array4872;
		for (int i_7_ = 0; i_7_ < class59s.length; i_7_++) {
			Class59 class59 = class59s[i_7_];
			int i_8_ = class59.method975((byte) 102);
			int i_9_ = class59.method976(942082239).method48(-1982405749);
			if (i_9_ < 100)
				bool = false;
			i_5_ += i_8_;
			i_6_ += i_9_ * i_8_ / 100;
		}
		if (bool)
			Class440.aClass59Array4872 = null;
		i_6_ -= 800596785 * Class440.anInt4873;
		i_5_ -= Class440.anInt4873 * 800596785;
		int i_10_ = i_5_ > 0 ? i_6_ * 100 / i_5_ : 100;
		if (!bool && i_10_ > 99)
			i_10_ = 99;
		return i_10_;
	}

	static void method4939(Class668 class668, int i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[(class668.anInt8542 * 1867269829) - 2]), (byte) 80)).aStringArray3026[class668.anIntArray8541[class668.anInt8542 * 1867269829 - 1]]);
		class668.anInt8542 -= 1472892954;
	}

	static final void method4940(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class582.method7023(class251, class234, class668, -732139539);
	}

	static final void method4941(Class668 class668, int i) {
		int i_11_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_11_);
		Class234 class234 = Class463.aClass234Array5227[i_11_ >> 16];
		Class462.method5620(class251, class234, class668, -2003219911);
	}

	static final void method4942(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class325_Sub1.method9207(-613421836).method78();
	}

	static final void method4943(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class710.aClass536_Sub40_8843.aClass710_Sub34_10787.method10206(1599762845) && Class677.aClass167_8609.method2013()) ? 1 : 0;
	}

	static final void method4944(Class668 class668, int i) {
		int i_12_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class682.method8090(532675698);
		if (class536_sub18_sub14 != null) {
			boolean bool = class536_sub18_sub14.method10767(i_12_ >> 28 & 0x3, i_12_ >> 14 & 0x3fff, i_12_ & 0x3fff, Class685.anIntArray8657, (byte) 5);
			if (bool)
				Class399.method4911(Class685.anIntArray8657[1], Class685.anIntArray8657[2], 265647275);
		}
	}
}

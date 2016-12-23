/* Class676 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class Class676 {
	public static Class34_Sub6 aClass34_Sub6_8589;

	Class676() throws Throwable {
		throw new Error();
	}

	public static Object method8038(byte[] is, boolean bool, byte i) {
		if (null == is)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	static final void method8039(Class668 class668, int i) {
		Class671.method8017(class668.aClass649_Sub1_Sub1_Sub1_8556, class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)], true, 1642894017);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) client.aFloatArray11133[0];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) client.aFloatArray11133[1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) client.aFloatArray11133[2];
	}

	public static Class392 method8040(RSByteBuffer class536_sub33, byte i) {
		Class392 class392 = Class392.method4864(class536_sub33, -1168751813);
		int i_0_ = class536_sub33.readBigSmart((byte) 1);
		int i_1_ = class536_sub33.readBigSmart((byte) 1);
		int i_2_ = class536_sub33.readBigSmart((byte) 1);
		int i_3_ = class536_sub33.readBigSmart((byte) 1);
		int i_4_ = class536_sub33.readBigSmart((byte) 1);
		int i_5_ = class536_sub33.readBigSmart((byte) 1);
		return new Class392_Sub3(class392.aClass395_4064, class392.aClass399_4065, 316945261 * class392.anInt4066, class392.anInt4069 * 1917287119, -1755858667 * class392.anInt4068, class392.anInt4067 * -840030237, -2068781397 * class392.anInt4070, class392.anInt4071 * 1694830205, -369678755 * class392.anInt4072, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
	}

	static void method8041(Class167 class167, Class708 class708, int i, int i_6_, int i_7_) {
		Class648.aClass708_8457.method8304(454036827);
		if (!Class542_Sub1.aBool10708) {
			for (Class536_Sub41 class536_sub41 = (Class536_Sub41) class708.method8308(1867269829); class536_sub41 != null; class536_sub41 = (Class536_Sub41) class708.method8311(1268812365)) {
				Class248 class248 = ((Class248) (Class542_Sub1.aClass34_Sub8_7212.method70(2000440429 * class536_sub41.anInt10793, (byte) 32)));
				if (Class184_Sub6.method9082(class248, 950994070)) {
					boolean bool = Class458.method5504(class167, class536_sub41, class248, i, i_6_, (byte) 27);
					if (bool)
						Class611.method7280(class167, class536_sub41, class248, -1944514864);
				}
			}
		}
	}

	static final void method8042(Class668 class668, boolean bool, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_8_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_9_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class82 class82 = Class203.method2930(i_8_, 71748471);
		if (class82 == null)
			throw new RuntimeException();
		Class325.aList3562 = class82.method1166(Integer.valueOf(i_9_), 1188073615);
		if (null != Class325.aList3562) {
			Class61.anIterator698 = Class325.aList3562.iterator();
			if (bool)
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class325.aList3562.size();
		} else if (bool)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}

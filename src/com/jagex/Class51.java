/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class51 {
	int anInt587;
	int anInt588;

	Class51() {
		/* empty */
	}

	public static void method930(int i) {
		Class205_Sub20.method9093(1115734935);
		Class70.aBool752 = false;
		Class680.method8073(Class312.anInt3487 * -467577567, Class70.anInt768 * 1644471179, 917143623 * Class2.anInt95, -311054579 * Class153.anInt1719, (byte) 10);
		Class70.aClass536_Sub18_Sub9_759 = null;
		Class704.aClass536_Sub18_Sub9_8811 = null;
	}

	public static byte[] method931(Object object, boolean bool, int i) {
		if (object == null)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	static final void method932(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_0_ & i_1_;
	}

	static boolean method933(String string, int i, int i_2_) {
		return Class575.method7000(string, i, "openjs", 1965931980);
	}
}

/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class537 {
	static byte[] aByteArray7225 = new byte[2048];
	static final int anInt7226 = 4096;
	Class520[] aClass520Array7227;
	Class324[] aClass324Array7228;

	static {
		int i = 22;
		int i_0_ = 2;
		aByteArray7225[0] = (byte) 0;
		aByteArray7225[1] = (byte) 1;
		for (int i_1_ = 2; i_1_ < i; i_1_++) {
			int i_2_ = 1 << (i_1_ >> 1) - 1;
			int i_3_ = 0;
			while (i_3_ < i_2_) {
				aByteArray7225[i_0_] = (byte) i_1_;
				i_3_++;
				i_0_++;
			}
		}
	}

	Class537() {
		Class478.method7785(-1067126696);
		aClass520Array7227 = new Class520[4096];
		new Class323();
		aClass324Array7228 = new Class324[4];
		new Class324(4);
		new Class536_Sub1(this);
		new Class536_Sub1(this);
		new Class530(this);
		for (int i = 0; i < 4096; i++)
			aClass520Array7227[i] = new Class520(this);
		for (int i = 0; i < 4; i++)
			aClass324Array7228[i] = new Class324(6);
	}

	public static byte[] method8985(Object object, boolean bool, int i) {
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

	static final void method8986(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_4_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_5_, 1514591196));
		if (class80.method1566(-11829902))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class602) client.aClass509_11072.method8310(2032847714).method81(i_4_, 1240559776)).method10003(i_5_, class80.aString806, (byte) -115);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (((Class602) client.aClass509_11072.method8310(300821581).method81(i_4_, 564673685)).method9963(i_5_, 780718929 * class80.anInt804, (byte) -18));
	}

	static final void method8987(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method8988(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -756791279 * Class9.anInt152;
	}
}

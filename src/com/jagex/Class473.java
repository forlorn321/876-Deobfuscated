/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class473 {
	byte[] aByteArray5370;
	Class449 this$0;

	Class473(Class449 class449, InputStream inputstream, Class536_Sub18_Sub15_Sub3 class536_sub18_sub15_sub3, URL url) {
		this$0 = class449;
		aByteArray5370 = null;
		if (inputstream != null) {
			int i = 10240;
			RSByteBuffer class536_sub33 = new RSByteBuffer(i, true);
			int i_0_ = 0;
			byte[] is = Class705.method8268(1024, 1413422708);
			while (i_0_ >= 0) {
				try {
					i_0_ = inputstream.read(is);
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
					i_0_ = -1;
				}
				if (i_0_ > 0) {
					if (i_0_ + class536_sub33.off * -810172525 >= class536_sub33.buffer.length) {
						int i_1_ = class536_sub33.buffer.length + 10240;
						byte[] is_2_ = Class705.method8269(i_1_, true, 1810046795);
						System.arraycopy(class536_sub33.buffer, 0, is_2_, 0, (-810172525 * class536_sub33.off));
						Class705.method8270(class536_sub33.buffer, 565075853);
						class536_sub33.buffer = is_2_;
					}
					class536_sub33.writeBytes(is, 0, i_0_, (byte) 38);
				}
			}
			for (int i_3_ = 0; i_3_ < -2057604531 * class536_sub18_sub15_sub3.anInt12159; i_3_++)
				class536_sub33.writeByte(0);
			byte[] is_4_ = new byte[-810172525 * class536_sub33.off];
			System.arraycopy(class536_sub33.buffer, 0, is_4_, 0, class536_sub33.off * -810172525);
			class536_sub33.method9685(120764410);
			Object object = null;
			Class705.method8270(is, 1532840305);
			Object object_5_ = null;
			aByteArray5370 = is_4_;
			try {
				inputstream.close();
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
		}
		class536_sub18_sub15_sub3.aBool11777 = false;
		class449.method5407(-1848482096);
	}

	byte[] method5738(int i) {
		return aByteArray5370;
	}

	byte[] method5739() {
		return aByteArray5370;
	}

	public static String method5740(CharSequence charsequence, Class74 class74, byte i) {
		if (null == charsequence)
			return null;
		int i_6_ = 0;
		int i_7_;
		for (i_7_ = charsequence.length(); (i_6_ < i_7_ && Class624.method7428(charsequence.charAt(i_6_), 431624875)); i_6_++) {
			/* empty */
		}
		for (/**/; i_7_ > i_6_ && Class624.method7428(charsequence.charAt(i_7_ - 1), 1574746584); i_7_--) {
			/* empty */
		}
		int i_8_ = i_7_ - i_6_;
		if (i_8_ < 1 || i_8_ > Class242.method3395(class74, (byte) 105))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_8_);
		for (int i_9_ = i_6_; i_9_ < i_7_; i_9_++) {
			char c = charsequence.charAt(i_9_);
			if (Class175.method2453(c, 1938231546)) {
				char c_10_ = Class58.method973(c, 1867269829);
				if ('\0' != c_10_)
					stringbuilder.append(c_10_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static Class521_Sub5 method5741(int i) {
		Class521_Sub5 class521_sub5 = ((Class521_Sub5) Class521_Sub5.aClass695_10357.method8213(-1423263947));
		if (class521_sub5 != null) {
			Class521_Sub5.anInt10353 -= -148652163;
			return class521_sub5;
		}
		return new Class521_Sub5();
	}
}

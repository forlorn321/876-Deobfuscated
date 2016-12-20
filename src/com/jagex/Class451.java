/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class451 {
	byte[] aByteArray4937;
	Class468 this$0;
	public static int anInt4938;
	public static Canvas aCanvas4939;

	byte[] method7288() {
		return aByteArray4937;
	}

	byte[] method7289(int i) {
		return aByteArray4937;
	}

	Class451(Class468 class468, InputStream inputstream, Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2, URL url) {
		this$0 = class468;
		aByteArray4937 = null;
		if (null != inputstream) {
			int i = 10240;
			RSByteBuffer class527_sub38 = new RSByteBuffer(i, true);
			int i_0_ = 0;
			byte[] is = Class706.method14341(1024, -257729101);
			while (i_0_ >= 0) {
				try {
					i_0_ = inputstream.read(is);
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
					i_0_ = -1;
				}
				if (i_0_ > 0) {
					if (i_0_ + -441238943 * class527_sub38.anInt10689 >= class527_sub38.buffer.length) {
						int i_1_ = class527_sub38.buffer.length + 10240;
						byte[] is_2_ = Class706.method14340(i_1_, true, -740746889);
						System.arraycopy(class527_sub38.buffer, 0, is_2_, 0, (-441238943 * class527_sub38.anInt10689));
						Class706.method14342(class527_sub38.buffer, (byte) -43);
						class527_sub38.buffer = is_2_;
					}
					class527_sub38.writeBytes(is, 0, i_0_, (byte) 16);
				}
			}
			for (int i_3_ = 0; i_3_ < class527_sub8_sub13_sub2.anInt12108 * 1586786209; i_3_++)
				class527_sub38.writeByte(0, -787176170);
			byte[] is_4_ = new byte[-441238943 * class527_sub38.anInt10689];
			System.arraycopy(class527_sub38.buffer, 0, is_4_, 0, class527_sub38.anInt10689 * -441238943);
			class527_sub38.method16599((byte) 118);
			Object object = null;
			Class706.method14342(is, (byte) -11);
			Object object_5_ = null;
			aByteArray4937 = is_4_;
			try {
				inputstream.close();
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
		}
		class527_sub8_sub13_sub2.aBool11768 = false;
		class468.method7671((byte) -58);
	}

	byte[] method7290() {
		return aByteArray4937;
	}

	byte[] method7291() {
		return aByteArray4937;
	}

	byte[] method7292() {
		return aByteArray4937;
	}

	byte[] method7293() {
		return aByteArray4937;
	}

	static final void method7294(Class665 class665, int i) throws Exception_Sub6 {
		Class208_Sub10.aClass296_Sub1_9923.method5349((float) class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)] / 1000.0F, (byte) -93);
	}

	static final void method7295(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (client.anInt11080 * -1481292237 == 3) {
			int i_13_ = 351100807 * Class105.anInt1300;
			int[] is = Class105.anIntArray1301;
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_14_]]);
				if (class640_sub1_sub2_sub1_sub2 != null)
					class640_sub1_sub2_sub1_sub2.method18551(i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, (byte) -57);
			}
			for (int i_15_ = 0; i_15_ < -1599561389 * client.anInt11059; i_15_++) {
				int i_16_ = client.anIntArray11021[i_15_];
				Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_16_));
				if (null != class527_sub26)
					((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522).method18551(i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, (byte) -103);
			}
		}
	}
}

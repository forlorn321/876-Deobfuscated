/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class173 implements Interface24 {
	static int[] anIntArray1924;
	static double aDouble1925 = -1.0;

	float[] method2436(Class599 class599, int i, double d) {
		if (Class599.aClass599_7843 != class599)
			return null;
		int[] is = method2439(class599, i, d);
		if (is == null)
			return null;
		int[] is_0_ = null;
		byte[] is_1_ = method2437(Class599.aClass599_7842, i, 1849041297);
		if (is_1_ != null) {
			try {
				byte i_2_ = (byte) (is_1_[0] & 0xff);
				if (i_2_ != 1)
					return null;
				byte[] is_3_ = new byte[is_1_.length - 5];
				System.arraycopy(is_1_, 5, is_3_, 0, is_1_.length - 5);
				is_0_ = method2440(is_3_, false, -163709540);
				for (int i_4_ = 0; i_4_ < is_0_.length; i_4_++)
					is_0_[i_4_] = is_0_[i_4_] & 0xff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (null == is_0_)
			is_0_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_5_ = 0;
		for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
			int i_7_ = is[i_6_];
			int i_8_ = i_7_ >>> 24;
			int i_9_ = (i_7_ & 0xff0000) >> 16;
			int i_10_ = (i_7_ & 0xff00) >> 8;
			int i_11_ = i_7_ & 0xff;
			float f = 1.0F + 31.0F * (float) is_0_[i_6_] / 255.0F;
			fs[i_5_++] = (float) i_9_ * f / 255.0F;
			fs[i_5_++] = (float) i_10_ * f / 255.0F;
			fs[i_5_++] = (float) i_11_ * f / 255.0F;
			fs[i_5_++] = (float) i_8_ / 255.0F;
		}
		return fs;
	}

	abstract byte[] method2437(Class599 class599, int i, int i_12_);

	public abstract boolean method137(Class599 class599, int i, Class594 class594, float f, int i_13_, int i_14_, boolean bool, int i_15_);

	int[] method2438(Class599 class599, int i, double d) {
		int[] is = method2439(class599, i, d);
		if (null == is)
			return null;
		for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
			if (0 != (is[i_16_] & 0xffffff))
				is[i_16_] = is[i_16_] | ~0xffffff;
			else
				is[i_16_] = is[i_16_] & 0xffffff;
		}
		return is;
	}

	int[] method2439(Class599 class599, int i, double d) {
		byte[] is = method2437(class599, i, 1042996132);
		if (null == is)
			return null;
		int[] is_17_;
		try {
			byte i_18_ = (byte) (is[0] & 0xff);
			if (Class599.aClass599_7844 == class599) {
				if (6 != i_18_)
					return null;
				int[] is_19_ = null;
				int i_20_ = 1;
				for (int i_21_ = 0; i_21_ < 6; i_21_++) {
					int i_22_ = ((is[i_20_] & 0xff) << 24 | (is[1 + i_20_] & 0xff) << 16 | (is[2 + i_20_] & 0xff) << 8 | is[3 + i_20_] & 0xff);
					byte[] is_23_ = new byte[i_22_];
					System.arraycopy(is, i_20_ + 4, is_23_, 0, i_22_);
					int[] is_24_ = method2440(is_23_, false, 42307416);
					if (i_21_ == 0)
						is_19_ = new int[6 * is_24_.length];
					System.arraycopy(is_24_, 0, is_19_, is_24_.length * i_21_, is_24_.length);
					i_20_ += i_22_ + 4;
				}
				if (d != 1.0)
					Class41_Sub1.method9626(is_19_, d);
				return is_19_;
			}
			if (1 != i_18_)
				return null;
			byte[] is_25_ = new byte[is.length - 5];
			System.arraycopy(is, 5, is_25_, 0, is.length - 5);
			int[] is_26_ = method2440(is_25_, false, 509859750);
			if (is_26_ == null)
				return null;
			if (d != 1.0)
				Class41_Sub1.method9626(is_26_, d);
			is_17_ = is_26_;
		} catch (IOException ioexception) {
			return null;
		}
		return is_17_;
	}

	public float[] method142(Class599 class599, int i, float f, int i_27_, int i_28_, boolean bool) {
		return method2436(class599, i, (double) f);
	}

	public void method29(int i) {
		/* empty */
	}

	public int[] method133(Class599 class599, int i, float f, int i_29_, int i_30_, boolean bool, int i_31_) {
		return method2438(class599, i, (double) f);
	}

	public float[] method148(Class599 class599, int i, float f, int i_32_, int i_33_, boolean bool, byte i_34_) {
		return method2436(class599, i, (double) f);
	}

	int[] method2440(byte[] is, boolean bool, int i) throws IOException {
		BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
		if (null == bufferedimage)
			return null;
		int[] is_35_ = Class66.method1077(bufferedimage, -2108089303);
		if (bool) {
			for (int i_36_ = bufferedimage.getHeight() - 1; i_36_ >= 0; i_36_--) {
				int i_37_ = i_36_ * bufferedimage.getWidth();
				for (int i_38_ = (i_36_ + 1) * bufferedimage.getWidth(); i_37_ < i_38_; i_37_++) {
					i_38_--;
					int i_39_ = is_35_[i_37_];
					is_35_[i_37_] = is_35_[i_38_];
					is_35_[i_38_] = i_39_;
				}
			}
		}
		return is_35_;
	}

	public void method146() {
		/* empty */
	}

	public int[] method143(Class599 class599, int i, float f, int i_40_, int i_41_, boolean bool) {
		return method2439(class599, i, (double) f);
	}

	abstract byte[] method2441(Class599 class599, int i);

	static {
		anIntArray1924 = new int[256];
	}

	Class173() {
		/* empty */
	}

	public float[] method145(Class599 class599, int i, float f, int i_42_, int i_43_, boolean bool) {
		return method2436(class599, i, (double) f);
	}

	public abstract boolean method136(Class599 class599, int i, Class594 class594, float f, int i_44_, int i_45_, boolean bool);

	public int[] method140(Class599 class599, int i, float f, int i_46_, int i_47_, boolean bool) {
		return method2439(class599, i, (double) f);
	}

	public int[] method139(Class599 class599, int i, float f, int i_48_, int i_49_, boolean bool) {
		return method2439(class599, i, (double) f);
	}

	public int[] method135(Class599 class599, int i, float f, int i_50_, int i_51_, boolean bool) {
		return method2439(class599, i, (double) f);
	}

	public int[] method144(Class599 class599, int i, float f, int i_52_, int i_53_, boolean bool) {
		return method2439(class599, i, (double) f);
	}

	public float[] method147(Class599 class599, int i, float f, int i_54_, int i_55_, boolean bool) {
		return method2436(class599, i, (double) f);
	}

	public int[] method141(Class599 class599, int i, float f, int i_56_, int i_57_, boolean bool) {
		return method2439(class599, i, (double) f);
	}

	public void method138() {
		/* empty */
	}

	public int[] method134(Class599 class599, int i, float f, int i_58_, int i_59_, boolean bool, int i_60_) {
		return method2439(class599, i, (double) f);
	}

	public int[] method132(Class599 class599, int i, float f, int i_61_, int i_62_, boolean bool) {
		return method2438(class599, i, (double) f);
	}

	static final void method2442(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class61.anInt688 * 424684481;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -314905053 * Class61.anInt690;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -408633467 * Class61.anInt689;
		Class61.anInt688 = -1440467074;
		Class61.anInt690 = -1772368267;
		Class61.anInt689 = 1297260211;
	}

	static final void method2443(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.groundDecorationSetting.method9932(-2015548878) == 1 ? 1 : 0;
	}

	static final void method2444(Class668 class668, byte i) {
		int i_63_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class682.method8090(532675698);
		if (null != class536_sub18_sub14) {
			boolean bool = class536_sub18_sub14.method10767(i_63_ >> 28 & 0x3, i_63_ >> 14 & 0x3fff, i_63_ & 0x3fff, Class685.anIntArray8657, (byte) 5);
			if (bool) {
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class685.anIntArray8657[1];
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class685.anIntArray8657[2];
			} else {
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			}
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		}
	}

	public static final void method2445(String string, int i) {
		if (string != null) {
			String string_64_ = Class473.method5740(string, Class302.aClass74_3406, (byte) 0);
			if (string_64_ != null) {
				for (int i_65_ = 0; i_65_ < client.anInt11293 * 1857706641; i_65_++) {
					Class30 class30 = client.aClass30Array11295[i_65_];
					String string_66_ = class30.aString263;
					String string_67_ = Class473.method5740(string_66_, Class302.aClass74_3406, (byte) -87);
					if (Class184.method2764(string, string_64_, string_66_, string_67_, -1113769417)) {
						client.anInt11293 -= -758864271;
						for (int i_68_ = i_65_; i_68_ < 1857706641 * client.anInt11293; i_68_++)
							client.aClass30Array11295[i_68_] = client.aClass30Array11295[1 + i_68_];
						client.anInt11231 = client.anInt11215 * 1286029873;
						Class106 class106 = Class536_Sub41.method9871(2077853800);
						OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4498, class106.aClass15_1258, 1609417092);
						class536_sub23.stream.writeByte(Class555.method6802(string, -299105380));
						class536_sub23.stream.writeString(string);
						class106.writePacket(class536_sub23, 1707200102);
						break;
					}
				}
			}
		}
	}
}

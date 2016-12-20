/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class170 implements Interface24 {
	static int[] anIntArray1878;
	static double aDouble1879 = -1.0;
	public static Class517 aClass517_1880;
	public static int anInt1881;

	public void method138() {
		/* empty */
	}

	abstract byte[] method2708(Class609 class609, int i, int i_0_);

	public abstract boolean method134(Class609 class609, int i, Class591 class591, float f, int i_1_, int i_2_, boolean bool, int i_3_);

	int[] method2709(Class609 class609, int i, double d) {
		int[] is = method2710(class609, i, d);
		if (null == is)
			return null;
		for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
			if ((is[i_4_] & 0xffffff) != 0)
				is[i_4_] = is[i_4_] | ~0xffffff;
			else
				is[i_4_] = is[i_4_] & 0xffffff;
		}
		return is;
	}

	int[] method2710(Class609 class609, int i, double d) {
		byte[] is = method2708(class609, i, -479460057);
		if (null == is)
			return null;
		int[] is_5_;
		try {
			byte i_6_ = (byte) (is[0] & 0xff);
			if (class609 == Class609.aClass609_7997) {
				if (6 != i_6_)
					return null;
				int[] is_7_ = null;
				int i_8_ = 1;
				for (int i_9_ = 0; i_9_ < 6; i_9_++) {
					int i_10_ = ((is[i_8_] & 0xff) << 24 | (is[i_8_ + 1] & 0xff) << 16 | (is[i_8_ + 2] & 0xff) << 8 | is[3 + i_8_] & 0xff);
					byte[] is_11_ = new byte[i_10_];
					System.arraycopy(is, i_8_ + 4, is_11_, 0, i_10_);
					int[] is_12_ = method2713(is_11_, false, -1176250816);
					if (i_9_ == 0)
						is_7_ = new int[is_12_.length * 6];
					System.arraycopy(is_12_, 0, is_7_, is_12_.length * i_9_, is_12_.length);
					i_8_ += i_10_ + 4;
				}
				if (d != 1.0)
					Class63.method1443(is_7_, d);
				return is_7_;
			}
			if (1 != i_6_)
				return null;
			byte[] is_13_ = new byte[is.length - 5];
			System.arraycopy(is, 5, is_13_, 0, is.length - 5);
			int[] is_14_ = method2713(is_13_, false, -1176250816);
			if (null == is_14_)
				return null;
			if (1.0 != d)
				Class63.method1443(is_14_, d);
			is_5_ = is_14_;
		} catch (IOException ioexception) {
			return null;
		}
		return is_5_;
	}

	float[] method2711(Class609 class609, int i, double d) {
		if (Class609.aClass609_7996 != class609)
			return null;
		int[] is = method2710(class609, i, d);
		if (is == null)
			return null;
		int[] is_15_ = null;
		byte[] is_16_ = method2708(Class609.aClass609_7998, i, -479460057);
		if (null != is_16_) {
			try {
				byte i_17_ = (byte) (is_16_[0] & 0xff);
				if (1 != i_17_)
					return null;
				byte[] is_18_ = new byte[is_16_.length - 5];
				System.arraycopy(is_16_, 5, is_18_, 0, is_16_.length - 5);
				is_15_ = method2713(is_18_, false, -1176250816);
				for (int i_19_ = 0; i_19_ < is_15_.length; i_19_++)
					is_15_[i_19_] = is_15_[i_19_] & 0xff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (null == is_15_)
			is_15_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_20_ = 0;
		for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
			int i_22_ = is[i_21_];
			int i_23_ = i_22_ >>> 24;
			int i_24_ = (i_22_ & 0xff0000) >> 16;
			int i_25_ = (i_22_ & 0xff00) >> 8;
			int i_26_ = i_22_ & 0xff;
			float f = 1.0F + (float) is_15_[i_21_] * 31.0F / 255.0F;
			fs[i_20_++] = f * (float) i_24_ / 255.0F;
			fs[i_20_++] = f * (float) i_25_ / 255.0F;
			fs[i_20_++] = f * (float) i_26_ / 255.0F;
			fs[i_20_++] = (float) i_23_ / 255.0F;
		}
		return fs;
	}

	public void method19(byte i) {
		/* empty */
	}

	public int[] method132(Class609 class609, int i, float f, int i_27_, int i_28_, boolean bool, byte i_29_) {
		return method2709(class609, i, (double) f);
	}

	public int[] method133(Class609 class609, int i, float f, int i_30_, int i_31_, boolean bool, int i_32_) {
		return method2710(class609, i, (double) f);
	}

	public float[] method131(Class609 class609, int i, float f, int i_33_, int i_34_, boolean bool, int i_35_) {
		return method2711(class609, i, (double) f);
	}

	int[] method2712(Class609 class609, int i, double d) {
		int[] is = method2710(class609, i, d);
		if (null == is)
			return null;
		for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
			if ((is[i_36_] & 0xffffff) != 0)
				is[i_36_] = is[i_36_] | ~0xffffff;
			else
				is[i_36_] = is[i_36_] & 0xffffff;
		}
		return is;
	}

	public int[] method141(Class609 class609, int i, float f, int i_37_, int i_38_, boolean bool) {
		return method2709(class609, i, (double) f);
	}

	int[] method2713(byte[] is, boolean bool, int i) throws IOException {
		BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
		if (bufferedimage == null)
			return null;
		int[] is_39_ = Class115.method2026(bufferedimage, -605761803);
		if (bool) {
			for (int i_40_ = bufferedimage.getHeight() - 1; i_40_ >= 0; i_40_--) {
				int i_41_ = i_40_ * bufferedimage.getWidth();
				for (int i_42_ = (i_40_ + 1) * bufferedimage.getWidth(); i_41_ < i_42_; i_41_++) {
					i_42_--;
					int i_43_ = is_39_[i_41_];
					is_39_[i_41_] = is_39_[i_42_];
					is_39_[i_42_] = i_43_;
				}
			}
		}
		return is_39_;
	}

	public abstract boolean method140(Class609 class609, int i, Class591 class591, float f, int i_44_, int i_45_, boolean bool);

	public abstract boolean method136(Class609 class609, int i, Class591 class591, float f, int i_46_, int i_47_, boolean bool);

	static {
		anIntArray1878 = new int[256];
	}

	abstract byte[] method2714(Class609 class609, int i);

	public int[] method142(Class609 class609, int i, float f, int i_48_, int i_49_, boolean bool) {
		return method2710(class609, i, (double) f);
	}

	abstract byte[] method2715(Class609 class609, int i);

	abstract byte[] method2716(Class609 class609, int i);

	int[] method2717(Class609 class609, int i, double d) {
		int[] is = method2710(class609, i, d);
		if (null == is)
			return null;
		for (int i_50_ = 0; i_50_ < is.length; i_50_++) {
			if ((is[i_50_] & 0xffffff) != 0)
				is[i_50_] = is[i_50_] | ~0xffffff;
			else
				is[i_50_] = is[i_50_] & 0xffffff;
		}
		return is;
	}

	abstract byte[] method2718(Class609 class609, int i);

	float[] method2719(Class609 class609, int i, double d) {
		if (Class609.aClass609_7996 != class609)
			return null;
		int[] is = method2710(class609, i, d);
		if (is == null)
			return null;
		int[] is_51_ = null;
		byte[] is_52_ = method2708(Class609.aClass609_7998, i, -479460057);
		if (null != is_52_) {
			try {
				byte i_53_ = (byte) (is_52_[0] & 0xff);
				if (1 != i_53_)
					return null;
				byte[] is_54_ = new byte[is_52_.length - 5];
				System.arraycopy(is_52_, 5, is_54_, 0, is_52_.length - 5);
				is_51_ = method2713(is_54_, false, -1176250816);
				for (int i_55_ = 0; i_55_ < is_51_.length; i_55_++)
					is_51_[i_55_] = is_51_[i_55_] & 0xff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (null == is_51_)
			is_51_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_56_ = 0;
		for (int i_57_ = 0; i_57_ < is.length; i_57_++) {
			int i_58_ = is[i_57_];
			int i_59_ = i_58_ >>> 24;
			int i_60_ = (i_58_ & 0xff0000) >> 16;
			int i_61_ = (i_58_ & 0xff00) >> 8;
			int i_62_ = i_58_ & 0xff;
			float f = 1.0F + (float) is_51_[i_57_] * 31.0F / 255.0F;
			fs[i_56_++] = f * (float) i_60_ / 255.0F;
			fs[i_56_++] = f * (float) i_61_ / 255.0F;
			fs[i_56_++] = f * (float) i_62_ / 255.0F;
			fs[i_56_++] = (float) i_59_ / 255.0F;
		}
		return fs;
	}

	float[] method2720(Class609 class609, int i, double d) {
		if (Class609.aClass609_7996 != class609)
			return null;
		int[] is = method2710(class609, i, d);
		if (is == null)
			return null;
		int[] is_63_ = null;
		byte[] is_64_ = method2708(Class609.aClass609_7998, i, -479460057);
		if (null != is_64_) {
			try {
				byte i_65_ = (byte) (is_64_[0] & 0xff);
				if (1 != i_65_)
					return null;
				byte[] is_66_ = new byte[is_64_.length - 5];
				System.arraycopy(is_64_, 5, is_66_, 0, is_64_.length - 5);
				is_63_ = method2713(is_66_, false, -1176250816);
				for (int i_67_ = 0; i_67_ < is_63_.length; i_67_++)
					is_63_[i_67_] = is_63_[i_67_] & 0xff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (null == is_63_)
			is_63_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_68_ = 0;
		for (int i_69_ = 0; i_69_ < is.length; i_69_++) {
			int i_70_ = is[i_69_];
			int i_71_ = i_70_ >>> 24;
			int i_72_ = (i_70_ & 0xff0000) >> 16;
			int i_73_ = (i_70_ & 0xff00) >> 8;
			int i_74_ = i_70_ & 0xff;
			float f = 1.0F + (float) is_63_[i_69_] * 31.0F / 255.0F;
			fs[i_68_++] = f * (float) i_72_ / 255.0F;
			fs[i_68_++] = f * (float) i_73_ / 255.0F;
			fs[i_68_++] = f * (float) i_74_ / 255.0F;
			fs[i_68_++] = (float) i_71_ / 255.0F;
		}
		return fs;
	}

	Class170() {
		/* empty */
	}

	public void method139() {
		/* empty */
	}

	public int[] method135(Class609 class609, int i, float f, int i_75_, int i_76_, boolean bool) {
		return method2709(class609, i, (double) f);
	}

	public int[] method137(Class609 class609, int i, float f, int i_77_, int i_78_, boolean bool) {
		return method2709(class609, i, (double) f);
	}

	static void method2721(int[] is, double d) {
		if (d != aDouble1879) {
			for (int i = 0; i < 256; i++) {
				int i_79_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
				anIntArray1878[i] = i_79_ > 255 ? 255 : i_79_;
			}
			aDouble1879 = d;
		}
		for (int i = 0; i < is.length; i++) {
			int i_80_ = anIntArray1878[is[i] >> 16 & 0xff];
			int i_81_ = anIntArray1878[is[i] >> 8 & 0xff];
			int i_82_ = anIntArray1878[is[i] >> 0 & 0xff];
			is[i] = is[i] & ~0xffffff | i_80_ << 16 | i_81_ << 8 | i_82_;
		}
	}

	int[] method2722(Class609 class609, int i, double d) {
		int[] is = method2710(class609, i, d);
		if (null == is)
			return null;
		for (int i_83_ = 0; i_83_ < is.length; i_83_++) {
			if ((is[i_83_] & 0xffffff) != 0)
				is[i_83_] = is[i_83_] | ~0xffffff;
			else
				is[i_83_] = is[i_83_] & 0xffffff;
		}
		return is;
	}

	public int[] method143(Class609 class609, int i, float f, int i_84_, int i_85_, boolean bool) {
		return method2710(class609, i, (double) f);
	}

	public float[] method144(Class609 class609, int i, float f, int i_86_, int i_87_, boolean bool) {
		return method2711(class609, i, (double) f);
	}

	public float[] method145(Class609 class609, int i, float f, int i_88_, int i_89_, boolean bool) {
		return method2711(class609, i, (double) f);
	}

	int[] method2723(byte[] is, boolean bool) throws IOException {
		BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
		if (bufferedimage == null)
			return null;
		int[] is_90_ = Class115.method2026(bufferedimage, -605761803);
		if (bool) {
			for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
				int i_91_ = i * bufferedimage.getWidth();
				for (int i_92_ = (i + 1) * bufferedimage.getWidth(); i_91_ < i_92_; i_91_++) {
					i_92_--;
					int i_93_ = is_90_[i_91_];
					is_90_[i_91_] = is_90_[i_92_];
					is_90_[i_92_] = i_93_;
				}
			}
		}
		return is_90_;
	}

	public static int[] method2724(BufferedImage bufferedimage) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_94_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i = 0; i < is_94_.length; i++)
					is_94_[i] = -16777216 + (is[i] + ((is[i] << 16) + (is[i] << 8)));
			} else {
				for (int i = 0; i < is_94_.length; i++) {
					int i_95_ = i * 2;
					is_94_[i] = ((is[i_95_] << 8) + (is[i_95_] << 16) + (is[i_95_] + (is[i_95_ + 1] << 24)));
				}
			}
			return is_94_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	public static int[] method2725(BufferedImage bufferedimage) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_96_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i = 0; i < is_96_.length; i++)
					is_96_[i] = -16777216 + (is[i] + ((is[i] << 16) + (is[i] << 8)));
			} else {
				for (int i = 0; i < is_96_.length; i++) {
					int i_97_ = i * 2;
					is_96_[i] = ((is[i_97_] << 8) + (is[i_97_] << 16) + (is[i_97_] + (is[i_97_ + 1] << 24)));
				}
			}
			return is_96_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	static final void method2726(Class665 class665, short i) {
		class665.anInt8530 -= 65273226;
		if (class665.aLongArray8529[class665.anInt8530 * -2076258291] >= class665.aLongArray8529[-2076258291 * class665.anInt8530 + 1])
			class665.anInt8527 += (-1038991169 * class665.anIntArray8545[class665.anInt8527 * 891367231]);
	}

	public static void method2727(String string, int i) {
		Class107.aString1337 = string;
		Class107.anInt1339 = Class107.aString1337.length() * 207030263;
	}
}

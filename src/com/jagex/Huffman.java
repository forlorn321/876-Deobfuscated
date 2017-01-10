/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Huffman {
	byte[] aByteArray3176;
	int[] anIntArray3177;
	int[] anIntArray3178;

	int method3768(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_, int i_3_) {
		int i_4_ = 0;
		int i_5_ = i_2_ << 3;
		for (i_0_ += i; i < i_0_; i++) {
			int i_6_ = is[i] & 0xff;
			int i_7_ = anIntArray3177[i_6_];
			int i_8_ = aByteArray3176[i_6_];
			if (i_8_ == 0)
				throw new RuntimeException(new StringBuilder().append("").append(i_6_).toString());
			int i_9_ = i_5_ >> 3;
			int i_10_ = i_5_ & 0x7;
			i_4_ &= -i_10_ >> 31;
			int i_11_ = (i_10_ + i_8_ - 1 >> 3) + i_9_;
			i_10_ += 24;
			is_1_[i_9_] = (byte) (i_4_ |= i_7_ >>> i_10_);
			if (i_9_ < i_11_) {
				i_9_++;
				i_10_ -= 8;
				is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
				if (i_9_ < i_11_) {
					i_9_++;
					i_10_ -= 8;
					is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
					if (i_9_ < i_11_) {
						i_9_++;
						i_10_ -= 8;
						is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
						if (i_9_ < i_11_) {
							i_9_++;
							i_10_ -= 8;
							is_1_[i_9_] = (byte) (i_4_ = i_7_ << -i_10_);
						}
					}
				}
			}
			i_5_ += i_8_;
		}
		return (i_5_ + 7 >> 3) - i_2_;
	}

	public Huffman(byte[] is) {
		int i = is.length;
		anIntArray3177 = new int[i];
		aByteArray3176 = is;
		int[] is_12_ = new int[33];
		anIntArray3178 = new int[8];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			int i_15_ = is[i_14_];
			if (0 != i_15_) {
				int i_16_ = 1 << 32 - i_15_;
				int i_17_ = is_12_[i_15_];
				anIntArray3177[i_14_] = i_17_;
				int i_18_;
				if ((i_17_ & i_16_) != 0)
					i_18_ = is_12_[i_15_ - 1];
				else {
					i_18_ = i_17_ | i_16_;
					for (int i_19_ = i_15_ - 1; i_19_ >= 1; i_19_--) {
						int i_20_ = is_12_[i_19_];
						if (i_17_ != i_20_)
							break;
						int i_21_ = 1 << 32 - i_19_;
						if ((i_20_ & i_21_) != 0) {
							is_12_[i_19_] = is_12_[i_19_ - 1];
							break;
						}
						is_12_[i_19_] = i_20_ | i_21_;
					}
				}
				is_12_[i_15_] = i_18_;
				for (int i_22_ = 1 + i_15_; i_22_ <= 32; i_22_++) {
					if (i_17_ == is_12_[i_22_])
						is_12_[i_22_] = i_18_;
				}
				int i_23_ = 0;
				for (int i_24_ = 0; i_24_ < i_15_; i_24_++) {
					int i_25_ = -2147483648 >>> i_24_;
					if (0 != (i_17_ & i_25_)) {
						if (0 == anIntArray3178[i_23_])
							anIntArray3178[i_23_] = i_13_;
						i_23_ = anIntArray3178[i_23_];
					} else
						i_23_++;
					if (i_23_ >= anIntArray3178.length) {
						int[] is_26_ = new int[2 * anIntArray3178.length];
						for (int i_27_ = 0; i_27_ < anIntArray3178.length; i_27_++)
							is_26_[i_27_] = anIntArray3178[i_27_];
						anIntArray3178 = is_26_;
					}
					i_25_ >>>= 1;
				}
				anIntArray3178[i_23_] = i_14_ ^ 0xffffffff;
				if (i_23_ >= i_13_)
					i_13_ = i_23_ + 1;
			}
		}
	}

	int method3769(byte[] is, int i, byte[] is_28_, int i_29_, int i_30_, int i_31_) {
		if (i_30_ == 0)
			return 0;
		int i_32_ = 0;
		i_30_ += i_29_;
		int i_33_ = i;
		for (;;) {
			byte i_34_ = is[i_33_];
			if (i_34_ < 0)
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			int i_35_;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x40) != 0)
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if (0 != (i_34_ & 0x20))
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x10) != 0)
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x8) != 0)
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if (0 != (i_34_ & 0x4))
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x2) != 0)
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			if ((i_34_ & 0x1) != 0)
				i_32_ = anIntArray3178[i_32_];
			else
				i_32_++;
			if ((i_35_ = anIntArray3178[i_32_]) < 0) {
				is_28_[i_29_++] = (byte) (i_35_ ^ 0xffffffff);
				if (i_29_ >= i_30_)
					break;
				i_32_ = 0;
			}
			i_33_++;
		}
		return i_33_ + 1 - i;
	}

	int method3770(byte[] is, int i, byte[] is_36_, int i_37_, int i_38_) {
		if (i_38_ == 0)
			return 0;
		int i_39_ = 0;
		i_38_ += i_37_;
		int i_40_ = i;
		for (;;) {
			byte i_41_ = is[i_40_];
			if (i_41_ < 0)
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			int i_42_;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			if ((i_41_ & 0x40) != 0)
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			if (0 != (i_41_ & 0x20))
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			if ((i_41_ & 0x10) != 0)
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			if ((i_41_ & 0x8) != 0)
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			if (0 != (i_41_ & 0x4))
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			if ((i_41_ & 0x2) != 0)
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			if ((i_41_ & 0x1) != 0)
				i_39_ = anIntArray3178[i_39_];
			else
				i_39_++;
			if ((i_42_ = anIntArray3178[i_39_]) < 0) {
				is_36_[i_37_++] = (byte) (i_42_ ^ 0xffffffff);
				if (i_37_ >= i_38_)
					break;
				i_39_ = 0;
			}
			i_40_++;
		}
		return i_40_ + 1 - i;
	}

	static NativeSprite method3771(byte[] is, byte i) {
		if (null == is)
			throw new RuntimeException("");
		NativeSprite class143;
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(is);
				java.awt.Container container = Class300.method4022((byte) 0);
				MediaTracker mediatracker = new MediaTracker(container);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i_43_ = image.getWidth(container);
				int i_44_ = image.getHeight(container);
				if (mediatracker.isErrorAny() || i_43_ < 0 || i_44_ < 0)
					throw new RuntimeException("");
				int[] is_45_ = new int[i_44_ * i_43_];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_43_, i_44_, is_45_, 0, i_43_);
				pixelgrabber.grabPixels();
				class143 = Class677.aClass167_8609.createNativeSprite(is_45_, 0, i_43_, i_43_, i_44_, (byte) -26);
				break;
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
		return class143;
	}

	static final void method3772(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}

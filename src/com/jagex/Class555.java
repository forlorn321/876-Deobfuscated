/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class555 {
	boolean aBool7485;
	List aList7486;
	byte[] aByteArray7487;
	float aFloat7488;
	int anInt7489;
	SourceDataLine aSourceDataLine7490;
	int anInt7491;
	int anInt7492;
	int anInt7493;
	int anInt7494;
	Class360_Sub1 this$0;
	byte[] aByteArray7495;
	static long aLong7496;

	void method6787() {
		if (aBool7485) {
			if (aSourceDataLine7490 != null)
				anInt7489 = aSourceDataLine7490.available() * 1651808059;
		}
	}

	void method6788(byte i) {
		if (aBool7485) {
			if (aSourceDataLine7490 != null)
				anInt7489 = aSourceDataLine7490.available() * 1651808059;
		}
	}

	void method6789(int i) {
		anInt7492 = 0;
		method6790(-2034243230);
		int i_0_;
		for (/**/; anInt7492 * 1332437039 > 0; anInt7492 -= -1330780465 * i_0_) {
			i_0_ = anInt7492 * 1332437039;
			if (i_0_ + -1234600817 * anInt7491 >= aByteArray7487.length)
				i_0_ = aByteArray7487.length - -1234600817 * anInt7491;
			aSourceDataLine7490.write(aByteArray7487, -1234600817 * anInt7491, i_0_);
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				aByteArray7487[i_1_ + -1234600817 * anInt7491] = (byte) 0;
			anInt7491 += i_0_ * 180888175;
			anInt7491 = 180888175 * (-1234600817 * anInt7491 % aByteArray7487.length);
		}
	}

	void method6790(int i) {
		synchronized (this) {
			int i_2_ = 2147483647;
			double d = (double) (1684497575 * anInt7493 / 8 * (anInt7494 * 782431805));
			boolean bool = false;
			Iterator iterator = aList7486.iterator();
			while (iterator.hasNext()) {
				Class545 class545 = (Class545) iterator.next();
				int i_3_ = (class545.aByteArray7269.length - class545.anInt7273 * 1390500653);
				if (aFloat7488 != class545.aFloat7270) {
					i_3_ *= aFloat7488 / class545.aFloat7270;
					i_3_ = (int) (d * Math.ceil((double) i_3_ / d));
				}
				class545.anInt7275 = -715227191 * i_3_;
				if (i_3_ > 0 && i_3_ < i_2_) {
					bool = true;
					i_2_ = i_3_;
				}
			}
			if (i_2_ > anInt7489 * 1133783539)
				i_2_ = anInt7489 * 1133783539;
			if (i_2_ == 0 || false == bool) {
				/* empty */
			} else {
				int i_4_ = anInt7493 * 1684497575 / 8;
				Iterator iterator_5_ = aList7486.iterator();
				while (iterator_5_.hasNext()) {
					Class545 class545 = (Class545) iterator_5_.next();
					if (1945750137 * class545.anInt7275 >= i_2_) {
						int i_6_ = -1234600817 * anInt7491;
						int i_7_ = 0;
						int i_8_ = -2108560343 * class545.anInt7276 / 8;
						double d_9_ = 0.0;
						int i_10_ = 0;
						double d_11_ = (double) aFloat7488;
						double d_12_ = (double) class545.aFloat7270;
						int i_13_ = class545.anInt7271 * -1232152481;
						for (/**/; (1945750137 * class545.anInt7275 > 0 && i_7_ < i_2_); i_7_ += i_8_) {
							short i_14_ = 0;
							short i_15_ = 0;
							byte[] is = aByteArray7495;
							for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
								is[i_16_] = aByteArray7487[i_6_ + i_16_];
								i_14_ |= (is[i_16_] & 0xff) << 8 * i_16_;
							}
							if (aFloat7488 != class545.aFloat7270) {
								byte[] is_17_ = class545.aByteArray7274;
								float f = (float) (d_9_ / d_11_ * d_12_);
								float f_18_ = (float) Math.floor((double) f);
								short i_19_ = 0;
								short i_20_ = 0;
								int i_21_ = (int) Math.floor((double) f);
								int i_22_ = (int) Math.ceil((double) f);
								i_21_ = (i_10_ * is_17_.length + (is_17_.length * (-1432420543 * class545.anInt7272) * i_21_));
								i_22_ = (is_17_.length * (-1432420543 * class545.anInt7272) * i_22_) + i_10_ * is_17_.length;
								i_21_ += i_13_;
								i_22_ += i_13_;
								i_21_ %= class545.aByteArray7269.length;
								i_22_ %= class545.aByteArray7269.length;
								for (int i_23_ = 0; i_23_ < is_17_.length; i_23_++) {
									is_17_[i_23_] = (class545.aByteArray7269[i_23_ + i_21_]);
									i_19_ |= (is_17_[i_23_] & 0xff) << 8 * i_23_;
								}
								for (int i_24_ = 0; i_24_ < is_17_.length; i_24_++) {
									is_17_[i_24_] = (class545.aByteArray7269[i_24_ + i_22_]);
									i_20_ |= (is_17_[i_24_] & 0xff) << i_24_ * 8;
								}
								float f_25_ = f - f_18_;
								if (f_25_ < 0.0F || f_25_ > 1.0F)
									throw new RuntimeException("");
								float f_26_ = (float) (i_20_ - i_19_);
								i_15_ = (short) (int) ((float) i_19_ + f_25_ * f_26_);
								i_10_ = ++i_10_ % (class545.anInt7272 * -1432420543);
								if (i_10_ == 0)
									d_9_++;
							} else {
								byte[] is_27_ = class545.aByteArray7274;
								for (int i_28_ = 0; i_28_ < is_27_.length; i_28_++) {
									is_27_[i_28_] = (class545.aByteArray7269[(-1232152481 * class545.anInt7271 + i_28_)]);
									i_15_ |= (is_27_[i_28_] & 0xff) << i_28_ * 8;
								}
								class545.anInt7271 += -2116975713 * i_8_;
								Class545 class545_29_;
								(class545_29_ = class545).anInt7271 = (class545_29_.anInt7271 * -1232152481 % class545.aByteArray7269.length * -2116975713);
								class545.anInt7273 += i_8_ * -1338594139;
							}
							i_15_ += i_14_;
							if (i_15_ > 32767)
								i_15_ = (short) 32767;
							if (i_15_ < -32768)
								i_15_ = (short) -32768;
							aByteArray7487[i_6_] = (byte) i_15_;
							aByteArray7487[1 + i_6_] = (byte) (i_15_ >> 8);
							i_6_ += i_4_;
							i_6_ %= aByteArray7487.length;
						}
						if (class545.aFloat7270 != aFloat7488) {
							double d_30_ = d_12_ / d_11_ * (double) i_2_;
							int i_31_ = (int) (d * Math.ceil(d_30_ / d));
							class545.anInt7271 += i_31_ * -2116975713;
							Class545 class545_32_;
							(class545_32_ = class545).anInt7271 = (-2116975713 * (-1232152481 * class545_32_.anInt7271 % class545.aByteArray7269.length));
							class545.anInt7273 += -1338594139 * i_31_;
						}
					}
				}
				anInt7492 = i_2_ * -1330780465;
			}
		}
	}

	void method6791() {
		synchronized (this) {
			int i = 2147483647;
			double d = (double) (1684497575 * anInt7493 / 8 * (anInt7494 * 782431805));
			boolean bool = false;
			Iterator iterator = aList7486.iterator();
			while (iterator.hasNext()) {
				Class545 class545 = (Class545) iterator.next();
				int i_33_ = (class545.aByteArray7269.length - class545.anInt7273 * 1390500653);
				if (aFloat7488 != class545.aFloat7270) {
					i_33_ *= aFloat7488 / class545.aFloat7270;
					i_33_ = (int) (d * Math.ceil((double) i_33_ / d));
				}
				class545.anInt7275 = -715227191 * i_33_;
				if (i_33_ > 0 && i_33_ < i) {
					bool = true;
					i = i_33_;
				}
			}
			if (i > anInt7489 * 1133783539)
				i = anInt7489 * 1133783539;
			if (i == 0 || false == bool) {
				/* empty */
			} else {
				int i_34_ = anInt7493 * 1684497575 / 8;
				Iterator iterator_35_ = aList7486.iterator();
				while (iterator_35_.hasNext()) {
					Class545 class545 = (Class545) iterator_35_.next();
					if (1945750137 * class545.anInt7275 >= i) {
						int i_36_ = -1234600817 * anInt7491;
						int i_37_ = 0;
						int i_38_ = -2108560343 * class545.anInt7276 / 8;
						double d_39_ = 0.0;
						int i_40_ = 0;
						double d_41_ = (double) aFloat7488;
						double d_42_ = (double) class545.aFloat7270;
						int i_43_ = class545.anInt7271 * -1232152481;
						for (/**/; 1945750137 * class545.anInt7275 > 0 && i_37_ < i; i_37_ += i_38_) {
							short i_44_ = 0;
							short i_45_ = 0;
							byte[] is = aByteArray7495;
							for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
								is[i_46_] = aByteArray7487[i_36_ + i_46_];
								i_44_ |= (is[i_46_] & 0xff) << 8 * i_46_;
							}
							if (aFloat7488 != class545.aFloat7270) {
								byte[] is_47_ = class545.aByteArray7274;
								float f = (float) (d_39_ / d_41_ * d_42_);
								float f_48_ = (float) Math.floor((double) f);
								short i_49_ = 0;
								short i_50_ = 0;
								int i_51_ = (int) Math.floor((double) f);
								int i_52_ = (int) Math.ceil((double) f);
								i_51_ = (i_40_ * is_47_.length + (is_47_.length * (-1432420543 * class545.anInt7272) * i_51_));
								i_52_ = (is_47_.length * (-1432420543 * class545.anInt7272) * i_52_) + i_40_ * is_47_.length;
								i_51_ += i_43_;
								i_52_ += i_43_;
								i_51_ %= class545.aByteArray7269.length;
								i_52_ %= class545.aByteArray7269.length;
								for (int i_53_ = 0; i_53_ < is_47_.length; i_53_++) {
									is_47_[i_53_] = (class545.aByteArray7269[i_53_ + i_51_]);
									i_49_ |= (is_47_[i_53_] & 0xff) << 8 * i_53_;
								}
								for (int i_54_ = 0; i_54_ < is_47_.length; i_54_++) {
									is_47_[i_54_] = (class545.aByteArray7269[i_54_ + i_52_]);
									i_50_ |= (is_47_[i_54_] & 0xff) << i_54_ * 8;
								}
								float f_55_ = f - f_48_;
								if (f_55_ < 0.0F || f_55_ > 1.0F)
									throw new RuntimeException("");
								float f_56_ = (float) (i_50_ - i_49_);
								i_45_ = (short) (int) ((float) i_49_ + f_55_ * f_56_);
								i_40_ = ++i_40_ % (class545.anInt7272 * -1432420543);
								if (i_40_ == 0)
									d_39_++;
							} else {
								byte[] is_57_ = class545.aByteArray7274;
								for (int i_58_ = 0; i_58_ < is_57_.length; i_58_++) {
									is_57_[i_58_] = (class545.aByteArray7269[(-1232152481 * class545.anInt7271 + i_58_)]);
									i_45_ |= (is_57_[i_58_] & 0xff) << i_58_ * 8;
								}
								class545.anInt7271 += -2116975713 * i_38_;
								Class545 class545_59_;
								(class545_59_ = class545).anInt7271 = (class545_59_.anInt7271 * -1232152481 % class545.aByteArray7269.length * -2116975713);
								class545.anInt7273 += i_38_ * -1338594139;
							}
							i_45_ += i_44_;
							if (i_45_ > 32767)
								i_45_ = (short) 32767;
							if (i_45_ < -32768)
								i_45_ = (short) -32768;
							aByteArray7487[i_36_] = (byte) i_45_;
							aByteArray7487[1 + i_36_] = (byte) (i_45_ >> 8);
							i_36_ += i_34_;
							i_36_ %= aByteArray7487.length;
						}
						if (class545.aFloat7270 != aFloat7488) {
							double d_60_ = d_42_ / d_41_ * (double) i;
							int i_61_ = (int) (d * Math.ceil(d_60_ / d));
							class545.anInt7271 += i_61_ * -2116975713;
							Class545 class545_62_;
							(class545_62_ = class545).anInt7271 = (-2116975713 * (-1232152481 * class545_62_.anInt7271 % class545.aByteArray7269.length));
							class545.anInt7273 += -1338594139 * i_61_;
						}
					}
				}
				anInt7492 = i * -1330780465;
			}
		}
	}

	void method6792(Class545 class545, byte i) {
		aList7486.remove(class545);
	}

	Class555(Class360_Sub1 class360_sub1, float f, int i) {
		this$0 = class360_sub1;
		anInt7493 = 58732912;
		anInt7494 = -146431446;
		aList7486 = new ArrayList();
		if (!aBool7485) {
			aFloat7488 = f;
			if (anInt7493 * 1684497575 > 16)
				throw new RuntimeException("");
			try {
				AudioFormat audioformat = new AudioFormat(aFloat7488, anInt7493 * 1684497575, 782431805 * anInt7494, true, false);
				try {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, audioformat, i));
					aSourceDataLine7490 = (SourceDataLine) AudioSystem.getLine(info);
				} catch (IllegalArgumentException illegalargumentexception) {
					return;
				}
				aSourceDataLine7490.open(audioformat, i);
				aSourceDataLine7490.start();
			} catch (LineUnavailableException lineunavailableexception) {
				return;
			}
			aByteArray7487 = new byte[i];
			aByteArray7495 = new byte[anInt7493 * 1684497575 / 8];
			anInt7491 = 0;
			aBool7485 = true;
		}
	}

	void method6793() {
		if (aBool7485) {
			if (aSourceDataLine7490 != null)
				anInt7489 = aSourceDataLine7490.available() * 1651808059;
		}
	}

	void method6794() {
		anInt7492 = 0;
		method6790(-2116405360);
		int i;
		for (/**/; anInt7492 * 1332437039 > 0; anInt7492 -= -1330780465 * i) {
			i = anInt7492 * 1332437039;
			if (i + -1234600817 * anInt7491 >= aByteArray7487.length)
				i = aByteArray7487.length - -1234600817 * anInt7491;
			aSourceDataLine7490.write(aByteArray7487, -1234600817 * anInt7491, i);
			for (int i_63_ = 0; i_63_ < i; i_63_++)
				aByteArray7487[i_63_ + -1234600817 * anInt7491] = (byte) 0;
			anInt7491 += i * 180888175;
			anInt7491 = 180888175 * (-1234600817 * anInt7491 % aByteArray7487.length);
		}
	}

	void method6795() {
		if (aBool7485) {
			if (aSourceDataLine7490 != null)
				anInt7489 = aSourceDataLine7490.available() * 1651808059;
		}
	}

	void method6796() {
		anInt7492 = 0;
		method6790(-2100506046);
		int i;
		for (/**/; anInt7492 * 1332437039 > 0; anInt7492 -= -1330780465 * i) {
			i = anInt7492 * 1332437039;
			if (i + -1234600817 * anInt7491 >= aByteArray7487.length)
				i = aByteArray7487.length - -1234600817 * anInt7491;
			aSourceDataLine7490.write(aByteArray7487, -1234600817 * anInt7491, i);
			for (int i_64_ = 0; i_64_ < i; i_64_++)
				aByteArray7487[i_64_ + -1234600817 * anInt7491] = (byte) 0;
			anInt7491 += i * 180888175;
			anInt7491 = 180888175 * (-1234600817 * anInt7491 % aByteArray7487.length);
		}
	}

	void method6797(Class545 class545, int i) {
		aList7486.add(class545);
	}

	static void method6798(int i) {
		if (Class575.aClass143_7676 == null || (Class575.aClass143_7676.method1720() != Class575.aTwitchWebcamFrameData7651.width) || (Class575.aClass143_7676.method1752() != Class575.aTwitchWebcamFrameData7651.height))
			Class575.aClass143_7676 = (Class677.aClass167_8609.method2080(Class575.aTwitchWebcamFrameData7651.buffer, 0, Class575.aTwitchWebcamFrameData7651.width, Class575.aTwitchWebcamFrameData7651.width, Class575.aTwitchWebcamFrameData7651.height, false));
		else
			Class575.aClass143_7676.method1783(0, 0, Class575.aTwitchWebcamFrameData7651.width, Class575.aTwitchWebcamFrameData7651.height, Class575.aTwitchWebcamFrameData7651.buffer, 0, Class575.aTwitchWebcamFrameData7651.width);
	}

	static final void method6799(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_65_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_66_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class597.method7140(i_65_, i_66_, false, 1367435717);
	}

	static final void method6800(Class668 class668, int i) {
		int i_67_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_67_ >= 1 && i_67_ <= 2) {
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub12_10769), i_67_, (byte) 1);
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub12_10771), i_67_, (byte) 1);
			Class27.method763(1950857363);
		}
	}

	public static void method6801(short i) {
		if (Class653.aClass360_8489 != null)
			Class653.aClass360_8489.method4742(-1596752528);
	}

	public static int method6802(String string, int i) {
		return string.length() + 1;
	}

	public static final int method6803(String string, int i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_68_ = 0; i_68_ < client.anInt11293 * 1857706641; i_68_++) {
			if (string.equalsIgnoreCase(client.aClass30Array11295[i_68_].aString263))
				return i_68_;
		}
		return -1;
	}

	static final void method6804(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		int i_69_ = -1;
		int i_70_ = -1;
		Class244 class244 = class251.method3478(Class677.aClass167_8609, -385731150);
		if (class244 != null) {
			i_69_ = class244.anInt2464 * -598030877;
			i_70_ = class244.anInt2460 * -313075149;
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_69_;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_70_;
	}

	public static int method6805(Class536_Sub18_Sub9 class536_sub18_sub9, int i) {
		if (Class70.aBool752)
			return 6;
		if (null == class536_sub18_sub9)
			return 0;
		int i_71_ = class536_sub18_sub9.anInt11718 * -517484763;
		if (Class374.method4777(i_71_, (byte) -80))
			return 1;
		if (Class432.method5189(i_71_, (short) 352))
			return 2;
		if (Class381.method4817(i_71_, 1753208976))
			return 3;
		if (Class465.method5668(i_71_, (byte) -57))
			return 4;
		if (Class668.method8008(i_71_, (byte) 122))
			return 7;
		if (i_71_ == 16)
			return 8;
		return 5;
	}
}

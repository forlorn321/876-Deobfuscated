/* Class551 - Decompiled by JODE
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

public class Class551 {
	Class358_Sub1 this$0;
	int anInt7295;
	byte[] aByteArray7296;
	boolean aBool7297;
	SourceDataLine aSourceDataLine7298;
	int anInt7299;
	int anInt7300;
	float aFloat7301;
	int anInt7302;
	int anInt7303;
	List aList7304;
	byte[] aByteArray7305;
	static String[] aStringArray7306;

	void method9116(short i) {
		anInt7299 = 0;
		method9118((byte) -100);
		int i_0_;
		for (/**/; -80101527 * anInt7299 > 0; anInt7299 -= 1187954905 * i_0_) {
			i_0_ = anInt7299 * -80101527;
			if (anInt7300 * 1494447963 + i_0_ >= aByteArray7296.length)
				i_0_ = aByteArray7296.length - anInt7300 * 1494447963;
			aSourceDataLine7298.write(aByteArray7296, 1494447963 * anInt7300, i_0_);
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				aByteArray7296[i_1_ + 1494447963 * anInt7300] = (byte) 0;
			anInt7300 += i_0_ * 832561363;
			anInt7300 = anInt7300 * 1494447963 % aByteArray7296.length * 832561363;
		}
	}

	Class551(Class358_Sub1 class358_sub1, float f, int i) {
		this$0 = class358_sub1;
		anInt7302 = 1798390320;
		anInt7303 = -808318722;
		aList7304 = new ArrayList();
		if (!aBool7297) {
			aFloat7301 = f;
			if (-1906295925 * anInt7302 > 16)
				throw new RuntimeException("");
			try {
				AudioFormat audioformat = new AudioFormat(aFloat7301, anInt7302 * -1906295925, anInt7303 * 1004714879, true, false);
				try {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, audioformat, i));
					aSourceDataLine7298 = (SourceDataLine) AudioSystem.getLine(info);
				} catch (IllegalArgumentException illegalargumentexception) {
					return;
				}
				aSourceDataLine7298.open(audioformat, i);
				aSourceDataLine7298.start();
			} catch (LineUnavailableException lineunavailableexception) {
				return;
			}
			aByteArray7296 = new byte[i];
			aByteArray7305 = new byte[anInt7302 * -1906295925 / 8];
			anInt7300 = 0;
			aBool7297 = true;
		}
	}

	void method9117() {
		if (aBool7297) {
			if (null != aSourceDataLine7298)
				anInt7295 = aSourceDataLine7298.available() * -403868571;
		}
	}

	void method9118(byte i) {
		synchronized (this) {
			int i_2_ = 2147483647;
			double d = (double) (-1906295925 * anInt7302 / 8 * (anInt7303 * 1004714879));
			boolean bool = false;
			Iterator iterator = aList7304.iterator();
			while (iterator.hasNext()) {
				Class557 class557 = (Class557) iterator.next();
				int i_3_ = (class557.aByteArray7527.length - -1320912489 * class557.anInt7524);
				if (aFloat7301 != class557.aFloat7526) {
					i_3_ *= aFloat7301 / class557.aFloat7526;
					i_3_ = (int) (d * Math.ceil((double) i_3_ / d));
				}
				class557.anInt7519 = i_3_ * 1787253039;
				if (i_3_ > 0 && i_3_ < i_2_) {
					bool = true;
					i_2_ = i_3_;
				}
			}
			if (i_2_ > anInt7295 * -797041299)
				i_2_ = -797041299 * anInt7295;
			if (0 == i_2_ || false == bool) {
				/* empty */
			} else {
				int i_4_ = anInt7302 * -1906295925 / 8;
				Iterator iterator_5_ = aList7304.iterator();
				while (iterator_5_.hasNext()) {
					Class557 class557 = (Class557) iterator_5_.next();
					if (-1011116593 * class557.anInt7519 >= i_2_) {
						int i_6_ = 1494447963 * anInt7300;
						int i_7_ = 0;
						int i_8_ = class557.anInt7521 * 1046437053 / 8;
						double d_9_ = 0.0;
						int i_10_ = 0;
						double d_11_ = (double) aFloat7301;
						double d_12_ = (double) class557.aFloat7526;
						int i_13_ = -1808841167 * class557.anInt7522;
						for (/**/; (class557.anInt7519 * -1011116593 > 0 && i_7_ < i_2_); i_7_ += i_8_) {
							short i_14_ = 0;
							short i_15_ = 0;
							byte[] is = aByteArray7305;
							for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
								is[i_16_] = aByteArray7296[i_16_ + i_6_];
								i_14_ |= (is[i_16_] & 0xff) << i_16_ * 8;
							}
							if (class557.aFloat7526 != aFloat7301) {
								byte[] is_17_ = class557.aByteArray7525;
								float f = (float) (d_9_ / d_11_ * d_12_);
								float f_18_ = (float) Math.floor((double) f);
								short i_19_ = 0;
								short i_20_ = 0;
								int i_21_ = (int) Math.floor((double) f);
								int i_22_ = (int) Math.ceil((double) f);
								i_21_ = (is_17_.length * (1424963227 * class557.anInt7528) * i_21_) + is_17_.length * i_10_;
								i_22_ = (i_10_ * is_17_.length + i_22_ * (class557.anInt7528 * 1424963227 * is_17_.length));
								i_21_ += i_13_;
								i_22_ += i_13_;
								i_21_ %= class557.aByteArray7527.length;
								i_22_ %= class557.aByteArray7527.length;
								for (int i_23_ = 0; i_23_ < is_17_.length; i_23_++) {
									is_17_[i_23_] = (class557.aByteArray7527[i_21_ + i_23_]);
									i_19_ |= (is_17_[i_23_] & 0xff) << 8 * i_23_;
								}
								for (int i_24_ = 0; i_24_ < is_17_.length; i_24_++) {
									is_17_[i_24_] = (class557.aByteArray7527[i_22_ + i_24_]);
									i_20_ |= (is_17_[i_24_] & 0xff) << 8 * i_24_;
								}
								float f_25_ = f - f_18_;
								if (f_25_ < 0.0F || f_25_ > 1.0F)
									throw new RuntimeException("");
								float f_26_ = (float) (i_20_ - i_19_);
								i_15_ = (short) (int) ((float) i_19_ + f_25_ * f_26_);
								i_10_ = ++i_10_ % (1424963227 * class557.anInt7528);
								if (i_10_ == 0)
									d_9_++;
							} else {
								byte[] is_27_ = class557.aByteArray7525;
								for (int i_28_ = 0; i_28_ < is_27_.length; i_28_++) {
									is_27_[i_28_] = (class557.aByteArray7527[(class557.anInt7522 * -1808841167 + i_28_)]);
									i_15_ |= (is_27_[i_28_] & 0xff) << 8 * i_28_;
								}
								class557.anInt7522 += i_8_ * 950817489;
								Class557 class557_29_;
								(class557_29_ = class557).anInt7522 = (-1808841167 * class557_29_.anInt7522 % class557.aByteArray7527.length * 950817489);
								class557.anInt7524 += -1482320345 * i_8_;
							}
							i_15_ += i_14_;
							if (i_15_ > 32767)
								i_15_ = (short) 32767;
							if (i_15_ < -32768)
								i_15_ = (short) -32768;
							aByteArray7296[i_6_] = (byte) i_15_;
							aByteArray7296[i_6_ + 1] = (byte) (i_15_ >> 8);
							i_6_ += i_4_;
							i_6_ %= aByteArray7296.length;
						}
						if (aFloat7301 != class557.aFloat7526) {
							double d_30_ = d_12_ / d_11_ * (double) i_2_;
							int i_31_ = (int) (d * Math.ceil(d_30_ / d));
							class557.anInt7522 += i_31_ * 950817489;
							Class557 class557_32_;
							(class557_32_ = class557).anInt7522 = (-1808841167 * class557_32_.anInt7522 % class557.aByteArray7527.length * 950817489);
							class557.anInt7524 += i_31_ * -1482320345;
						}
					}
				}
				anInt7299 = i_2_ * 1187954905;
			}
		}
	}

	void method9119(Class557 class557) {
		aList7304.remove(class557);
	}

	void method9120(Class557 class557, byte i) {
		aList7304.remove(class557);
	}

	void method9121() {
		if (aBool7297) {
			if (null != aSourceDataLine7298)
				anInt7295 = aSourceDataLine7298.available() * -403868571;
		}
	}

	void method9122() {
		if (aBool7297) {
			if (null != aSourceDataLine7298)
				anInt7295 = aSourceDataLine7298.available() * -403868571;
		}
	}

	void method9123() {
		synchronized (this) {
			int i = 2147483647;
			double d = (double) (-1906295925 * anInt7302 / 8 * (anInt7303 * 1004714879));
			boolean bool = false;
			Iterator iterator = aList7304.iterator();
			while (iterator.hasNext()) {
				Class557 class557 = (Class557) iterator.next();
				int i_33_ = (class557.aByteArray7527.length - -1320912489 * class557.anInt7524);
				if (aFloat7301 != class557.aFloat7526) {
					i_33_ *= aFloat7301 / class557.aFloat7526;
					i_33_ = (int) (d * Math.ceil((double) i_33_ / d));
				}
				class557.anInt7519 = i_33_ * 1787253039;
				if (i_33_ > 0 && i_33_ < i) {
					bool = true;
					i = i_33_;
				}
			}
			if (i > anInt7295 * -797041299)
				i = -797041299 * anInt7295;
			if (0 == i || false == bool) {
				/* empty */
			} else {
				int i_34_ = anInt7302 * -1906295925 / 8;
				Iterator iterator_35_ = aList7304.iterator();
				while (iterator_35_.hasNext()) {
					Class557 class557 = (Class557) iterator_35_.next();
					if (-1011116593 * class557.anInt7519 >= i) {
						int i_36_ = 1494447963 * anInt7300;
						int i_37_ = 0;
						int i_38_ = class557.anInt7521 * 1046437053 / 8;
						double d_39_ = 0.0;
						int i_40_ = 0;
						double d_41_ = (double) aFloat7301;
						double d_42_ = (double) class557.aFloat7526;
						int i_43_ = -1808841167 * class557.anInt7522;
						for (/**/; class557.anInt7519 * -1011116593 > 0 && i_37_ < i; i_37_ += i_38_) {
							short i_44_ = 0;
							short i_45_ = 0;
							byte[] is = aByteArray7305;
							for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
								is[i_46_] = aByteArray7296[i_46_ + i_36_];
								i_44_ |= (is[i_46_] & 0xff) << i_46_ * 8;
							}
							if (class557.aFloat7526 != aFloat7301) {
								byte[] is_47_ = class557.aByteArray7525;
								float f = (float) (d_39_ / d_41_ * d_42_);
								float f_48_ = (float) Math.floor((double) f);
								short i_49_ = 0;
								short i_50_ = 0;
								int i_51_ = (int) Math.floor((double) f);
								int i_52_ = (int) Math.ceil((double) f);
								i_51_ = (is_47_.length * (1424963227 * class557.anInt7528) * i_51_) + is_47_.length * i_40_;
								i_52_ = (i_40_ * is_47_.length + i_52_ * (class557.anInt7528 * 1424963227 * is_47_.length));
								i_51_ += i_43_;
								i_52_ += i_43_;
								i_51_ %= class557.aByteArray7527.length;
								i_52_ %= class557.aByteArray7527.length;
								for (int i_53_ = 0; i_53_ < is_47_.length; i_53_++) {
									is_47_[i_53_] = (class557.aByteArray7527[i_51_ + i_53_]);
									i_49_ |= (is_47_[i_53_] & 0xff) << 8 * i_53_;
								}
								for (int i_54_ = 0; i_54_ < is_47_.length; i_54_++) {
									is_47_[i_54_] = (class557.aByteArray7527[i_52_ + i_54_]);
									i_50_ |= (is_47_[i_54_] & 0xff) << 8 * i_54_;
								}
								float f_55_ = f - f_48_;
								if (f_55_ < 0.0F || f_55_ > 1.0F)
									throw new RuntimeException("");
								float f_56_ = (float) (i_50_ - i_49_);
								i_45_ = (short) (int) ((float) i_49_ + f_55_ * f_56_);
								i_40_ = ++i_40_ % (1424963227 * class557.anInt7528);
								if (i_40_ == 0)
									d_39_++;
							} else {
								byte[] is_57_ = class557.aByteArray7525;
								for (int i_58_ = 0; i_58_ < is_57_.length; i_58_++) {
									is_57_[i_58_] = (class557.aByteArray7527[(class557.anInt7522 * -1808841167 + i_58_)]);
									i_45_ |= (is_57_[i_58_] & 0xff) << 8 * i_58_;
								}
								class557.anInt7522 += i_38_ * 950817489;
								Class557 class557_59_;
								(class557_59_ = class557).anInt7522 = (-1808841167 * class557_59_.anInt7522 % class557.aByteArray7527.length * 950817489);
								class557.anInt7524 += -1482320345 * i_38_;
							}
							i_45_ += i_44_;
							if (i_45_ > 32767)
								i_45_ = (short) 32767;
							if (i_45_ < -32768)
								i_45_ = (short) -32768;
							aByteArray7296[i_36_] = (byte) i_45_;
							aByteArray7296[i_36_ + 1] = (byte) (i_45_ >> 8);
							i_36_ += i_34_;
							i_36_ %= aByteArray7296.length;
						}
						if (aFloat7301 != class557.aFloat7526) {
							double d_60_ = d_42_ / d_41_ * (double) i;
							int i_61_ = (int) (d * Math.ceil(d_60_ / d));
							class557.anInt7522 += i_61_ * 950817489;
							Class557 class557_62_;
							(class557_62_ = class557).anInt7522 = (-1808841167 * class557_62_.anInt7522 % class557.aByteArray7527.length * 950817489);
							class557.anInt7524 += i_61_ * -1482320345;
						}
					}
				}
				anInt7299 = i * 1187954905;
			}
		}
	}

	void method9124() {
		if (aBool7297) {
			if (null != aSourceDataLine7298)
				anInt7295 = aSourceDataLine7298.available() * -403868571;
		}
	}

	void method9125() {
		synchronized (this) {
			int i = 2147483647;
			double d = (double) (-1906295925 * anInt7302 / 8 * (anInt7303 * 1004714879));
			boolean bool = false;
			Iterator iterator = aList7304.iterator();
			while (iterator.hasNext()) {
				Class557 class557 = (Class557) iterator.next();
				int i_63_ = (class557.aByteArray7527.length - -1320912489 * class557.anInt7524);
				if (aFloat7301 != class557.aFloat7526) {
					i_63_ *= aFloat7301 / class557.aFloat7526;
					i_63_ = (int) (d * Math.ceil((double) i_63_ / d));
				}
				class557.anInt7519 = i_63_ * 1787253039;
				if (i_63_ > 0 && i_63_ < i) {
					bool = true;
					i = i_63_;
				}
			}
			if (i > anInt7295 * -797041299)
				i = -797041299 * anInt7295;
			if (0 == i || false == bool) {
				/* empty */
			} else {
				int i_64_ = anInt7302 * -1906295925 / 8;
				Iterator iterator_65_ = aList7304.iterator();
				while (iterator_65_.hasNext()) {
					Class557 class557 = (Class557) iterator_65_.next();
					if (-1011116593 * class557.anInt7519 >= i) {
						int i_66_ = 1494447963 * anInt7300;
						int i_67_ = 0;
						int i_68_ = class557.anInt7521 * 1046437053 / 8;
						double d_69_ = 0.0;
						int i_70_ = 0;
						double d_71_ = (double) aFloat7301;
						double d_72_ = (double) class557.aFloat7526;
						int i_73_ = -1808841167 * class557.anInt7522;
						for (/**/; class557.anInt7519 * -1011116593 > 0 && i_67_ < i; i_67_ += i_68_) {
							short i_74_ = 0;
							short i_75_ = 0;
							byte[] is = aByteArray7305;
							for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
								is[i_76_] = aByteArray7296[i_76_ + i_66_];
								i_74_ |= (is[i_76_] & 0xff) << i_76_ * 8;
							}
							if (class557.aFloat7526 != aFloat7301) {
								byte[] is_77_ = class557.aByteArray7525;
								float f = (float) (d_69_ / d_71_ * d_72_);
								float f_78_ = (float) Math.floor((double) f);
								short i_79_ = 0;
								short i_80_ = 0;
								int i_81_ = (int) Math.floor((double) f);
								int i_82_ = (int) Math.ceil((double) f);
								i_81_ = (is_77_.length * (1424963227 * class557.anInt7528) * i_81_) + is_77_.length * i_70_;
								i_82_ = (i_70_ * is_77_.length + i_82_ * (class557.anInt7528 * 1424963227 * is_77_.length));
								i_81_ += i_73_;
								i_82_ += i_73_;
								i_81_ %= class557.aByteArray7527.length;
								i_82_ %= class557.aByteArray7527.length;
								for (int i_83_ = 0; i_83_ < is_77_.length; i_83_++) {
									is_77_[i_83_] = (class557.aByteArray7527[i_81_ + i_83_]);
									i_79_ |= (is_77_[i_83_] & 0xff) << 8 * i_83_;
								}
								for (int i_84_ = 0; i_84_ < is_77_.length; i_84_++) {
									is_77_[i_84_] = (class557.aByteArray7527[i_82_ + i_84_]);
									i_80_ |= (is_77_[i_84_] & 0xff) << 8 * i_84_;
								}
								float f_85_ = f - f_78_;
								if (f_85_ < 0.0F || f_85_ > 1.0F)
									throw new RuntimeException("");
								float f_86_ = (float) (i_80_ - i_79_);
								i_75_ = (short) (int) ((float) i_79_ + f_85_ * f_86_);
								i_70_ = ++i_70_ % (1424963227 * class557.anInt7528);
								if (i_70_ == 0)
									d_69_++;
							} else {
								byte[] is_87_ = class557.aByteArray7525;
								for (int i_88_ = 0; i_88_ < is_87_.length; i_88_++) {
									is_87_[i_88_] = (class557.aByteArray7527[(class557.anInt7522 * -1808841167 + i_88_)]);
									i_75_ |= (is_87_[i_88_] & 0xff) << 8 * i_88_;
								}
								class557.anInt7522 += i_68_ * 950817489;
								Class557 class557_89_;
								(class557_89_ = class557).anInt7522 = (-1808841167 * class557_89_.anInt7522 % class557.aByteArray7527.length * 950817489);
								class557.anInt7524 += -1482320345 * i_68_;
							}
							i_75_ += i_74_;
							if (i_75_ > 32767)
								i_75_ = (short) 32767;
							if (i_75_ < -32768)
								i_75_ = (short) -32768;
							aByteArray7296[i_66_] = (byte) i_75_;
							aByteArray7296[i_66_ + 1] = (byte) (i_75_ >> 8);
							i_66_ += i_64_;
							i_66_ %= aByteArray7296.length;
						}
						if (aFloat7301 != class557.aFloat7526) {
							double d_90_ = d_72_ / d_71_ * (double) i;
							int i_91_ = (int) (d * Math.ceil(d_90_ / d));
							class557.anInt7522 += i_91_ * 950817489;
							Class557 class557_92_;
							(class557_92_ = class557).anInt7522 = (-1808841167 * class557_92_.anInt7522 % class557.aByteArray7527.length * 950817489);
							class557.anInt7524 += i_91_ * -1482320345;
						}
					}
				}
				anInt7299 = i * 1187954905;
			}
		}
	}

	void method9126() {
		synchronized (this) {
			int i = 2147483647;
			double d = (double) (-1906295925 * anInt7302 / 8 * (anInt7303 * 1004714879));
			boolean bool = false;
			Iterator iterator = aList7304.iterator();
			while (iterator.hasNext()) {
				Class557 class557 = (Class557) iterator.next();
				int i_93_ = (class557.aByteArray7527.length - -1320912489 * class557.anInt7524);
				if (aFloat7301 != class557.aFloat7526) {
					i_93_ *= aFloat7301 / class557.aFloat7526;
					i_93_ = (int) (d * Math.ceil((double) i_93_ / d));
				}
				class557.anInt7519 = i_93_ * 1787253039;
				if (i_93_ > 0 && i_93_ < i) {
					bool = true;
					i = i_93_;
				}
			}
			if (i > anInt7295 * -797041299)
				i = -797041299 * anInt7295;
			if (0 == i || false == bool) {
				/* empty */
			} else {
				int i_94_ = anInt7302 * -1906295925 / 8;
				Iterator iterator_95_ = aList7304.iterator();
				while (iterator_95_.hasNext()) {
					Class557 class557 = (Class557) iterator_95_.next();
					if (-1011116593 * class557.anInt7519 >= i) {
						int i_96_ = 1494447963 * anInt7300;
						int i_97_ = 0;
						int i_98_ = class557.anInt7521 * 1046437053 / 8;
						double d_99_ = 0.0;
						int i_100_ = 0;
						double d_101_ = (double) aFloat7301;
						double d_102_ = (double) class557.aFloat7526;
						int i_103_ = -1808841167 * class557.anInt7522;
						for (/**/; class557.anInt7519 * -1011116593 > 0 && i_97_ < i; i_97_ += i_98_) {
							short i_104_ = 0;
							short i_105_ = 0;
							byte[] is = aByteArray7305;
							for (int i_106_ = 0; i_106_ < is.length; i_106_++) {
								is[i_106_] = aByteArray7296[i_106_ + i_96_];
								i_104_ |= (is[i_106_] & 0xff) << i_106_ * 8;
							}
							if (class557.aFloat7526 != aFloat7301) {
								byte[] is_107_ = class557.aByteArray7525;
								float f = (float) (d_99_ / d_101_ * d_102_);
								float f_108_ = (float) Math.floor((double) f);
								short i_109_ = 0;
								short i_110_ = 0;
								int i_111_ = (int) Math.floor((double) f);
								int i_112_ = (int) Math.ceil((double) f);
								i_111_ = (is_107_.length * (1424963227 * class557.anInt7528) * i_111_) + is_107_.length * i_100_;
								i_112_ = (i_100_ * is_107_.length + i_112_ * (class557.anInt7528 * 1424963227 * is_107_.length));
								i_111_ += i_103_;
								i_112_ += i_103_;
								i_111_ %= class557.aByteArray7527.length;
								i_112_ %= class557.aByteArray7527.length;
								for (int i_113_ = 0; i_113_ < is_107_.length; i_113_++) {
									is_107_[i_113_] = (class557.aByteArray7527[i_111_ + i_113_]);
									i_109_ |= ((is_107_[i_113_] & 0xff) << 8 * i_113_);
								}
								for (int i_114_ = 0; i_114_ < is_107_.length; i_114_++) {
									is_107_[i_114_] = (class557.aByteArray7527[i_112_ + i_114_]);
									i_110_ |= ((is_107_[i_114_] & 0xff) << 8 * i_114_);
								}
								float f_115_ = f - f_108_;
								if (f_115_ < 0.0F || f_115_ > 1.0F)
									throw new RuntimeException("");
								float f_116_ = (float) (i_110_ - i_109_);
								i_105_ = (short) (int) ((float) i_109_ + f_115_ * f_116_);
								i_100_ = ++i_100_ % (1424963227 * class557.anInt7528);
								if (i_100_ == 0)
									d_99_++;
							} else {
								byte[] is_117_ = class557.aByteArray7525;
								for (int i_118_ = 0; i_118_ < is_117_.length; i_118_++) {
									is_117_[i_118_] = (class557.aByteArray7527[(class557.anInt7522 * -1808841167 + i_118_)]);
									i_105_ |= ((is_117_[i_118_] & 0xff) << 8 * i_118_);
								}
								class557.anInt7522 += i_98_ * 950817489;
								Class557 class557_119_;
								(class557_119_ = class557).anInt7522 = (-1808841167 * class557_119_.anInt7522 % class557.aByteArray7527.length * 950817489);
								class557.anInt7524 += -1482320345 * i_98_;
							}
							i_105_ += i_104_;
							if (i_105_ > 32767)
								i_105_ = (short) 32767;
							if (i_105_ < -32768)
								i_105_ = (short) -32768;
							aByteArray7296[i_96_] = (byte) i_105_;
							aByteArray7296[i_96_ + 1] = (byte) (i_105_ >> 8);
							i_96_ += i_94_;
							i_96_ %= aByteArray7296.length;
						}
						if (aFloat7301 != class557.aFloat7526) {
							double d_120_ = d_102_ / d_101_ * (double) i;
							int i_121_ = (int) (d * Math.ceil(d_120_ / d));
							class557.anInt7522 += i_121_ * 950817489;
							Class557 class557_122_;
							(class557_122_ = class557).anInt7522 = (-1808841167 * class557_122_.anInt7522 % class557.aByteArray7527.length * 950817489);
							class557.anInt7524 += i_121_ * -1482320345;
						}
					}
				}
				anInt7299 = i * 1187954905;
			}
		}
	}

	void method9127(Class557 class557, int i) {
		aList7304.add(class557);
	}

	void method9128(Class557 class557) {
		aList7304.remove(class557);
	}

	void method9129(int i) {
		if (aBool7297) {
			if (null != aSourceDataLine7298)
				anInt7295 = aSourceDataLine7298.available() * -403868571;
		}
	}

	void method9130(Class557 class557) {
		aList7304.remove(class557);
	}

	void method9131(Class557 class557) {
		aList7304.remove(class557);
	}

	static final void method9132(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class70.method1484(class243, class240, class665, 1655959570);
	}

	static final void method9133(Class243 class243, int i) {
		if (-1608878399 * Class243.anInt2476 == -2084214243 * class243.anInt2528) {
			if (null == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179) {
				class243.anInt2542 = 0;
				class243.anInt2543 = 0;
			} else {
				class243.anInt2547 = 1033378566;
				class243.anInt2548 = ((int) (Math.sin((double) client.anInt11019 / 40.0) * 256.0) & 0x7ff) * -1017938173;
				class243.anInt2541 = 605595485;
				class243.anInt2542 = 961629445 * client.anInt11070;
				class243.anInt2543 = Class429.method6866((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179), 1556455295) * 708326095;
				Class695_Sub2 class695_sub2 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass695_Sub2_11913);
				if (class695_sub2 != null) {
					if (null == class243.aClass695_2664)
						class243.aClass695_2664 = new Class695_Sub1();
					class243.anInt2663 = class695_sub2.method14164(-826013028) * -113697567;
					class243.aClass695_2664.method14161(class695_sub2, (byte) 5);
				} else
					class243.aClass695_2664 = null;
			}
		}
	}

	static void method9134(int i) {
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4399, class109.aClass2_1367, (byte) -14);
		class527_sub15.buffer.writeInt(client.anInt11069 * -256103321, 1910987679);
		class109.method1969(class527_sub15, (byte) 1);
	}
}

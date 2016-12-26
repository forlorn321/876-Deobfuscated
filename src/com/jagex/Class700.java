/* Class700 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class700 implements Iterable {
	public Class536_Sub18 aClass536_Sub18_8794 = new Class536_Sub18();
	Class536_Sub18 aClass536_Sub18_8795;

	public Class536_Sub18 method8237(int i) {
		Class536_Sub18 class536_sub18 = aClass536_Sub18_8794.aClass536_Sub18_10506;
		if (class536_sub18 == aClass536_Sub18_8794)
			return null;
		class536_sub18.method9521(-1118392533);
		return class536_sub18;
	}

	public void method8238(int i) {
		while (aClass536_Sub18_8794.aClass536_Sub18_10506 != aClass536_Sub18_8794)
			aClass536_Sub18_8794.aClass536_Sub18_10506.method9521(-215113255);
	}

	public void method8239(Class536_Sub18 class536_sub18, byte i) {
		if (null != class536_sub18.aClass536_Sub18_10508)
			class536_sub18.method9521(-1976898080);
		class536_sub18.aClass536_Sub18_10508 = aClass536_Sub18_8794.aClass536_Sub18_10508;
		class536_sub18.aClass536_Sub18_10506 = aClass536_Sub18_8794;
		class536_sub18.aClass536_Sub18_10508.aClass536_Sub18_10506 = class536_sub18;
		class536_sub18.aClass536_Sub18_10506.aClass536_Sub18_10508 = class536_sub18;
	}

	public Class700() {
		aClass536_Sub18_8794.aClass536_Sub18_10506 = aClass536_Sub18_8794;
		aClass536_Sub18_8794.aClass536_Sub18_10508 = aClass536_Sub18_8794;
	}

	public void method8240() {
		while (aClass536_Sub18_8794.aClass536_Sub18_10506 != aClass536_Sub18_8794)
			aClass536_Sub18_8794.aClass536_Sub18_10506.method9521(-1975427462);
	}

	public Class536_Sub18 method8241(int i) {
		Class536_Sub18 class536_sub18 = aClass536_Sub18_8795;
		if (class536_sub18 == aClass536_Sub18_8794) {
			aClass536_Sub18_8795 = null;
			return null;
		}
		aClass536_Sub18_8795 = class536_sub18.aClass536_Sub18_10506;
		return class536_sub18;
	}

	public Iterator iterator() {
		return new Class689(this);
	}

	public Iterator method8242() {
		return new Class689(this);
	}

	public Iterator method8243() {
		return new Class689(this);
	}

	public Iterator method8244() {
		return new Class689(this);
	}

	public void method8245() {
		while (aClass536_Sub18_8794.aClass536_Sub18_10506 != aClass536_Sub18_8794)
			aClass536_Sub18_8794.aClass536_Sub18_10506.method9521(-1725442253);
	}

	public int method8246(byte i) {
		int i_0_ = 0;
		for (Class536_Sub18 class536_sub18 = aClass536_Sub18_8794.aClass536_Sub18_10506; class536_sub18 != aClass536_Sub18_8794; class536_sub18 = class536_sub18.aClass536_Sub18_10506)
			i_0_++;
		return i_0_;
	}

	Class536_Sub18 method8247(Class536_Sub18 class536_sub18, int i) {
		Class536_Sub18 class536_sub18_1_;
		if (null == class536_sub18)
			class536_sub18_1_ = aClass536_Sub18_8794.aClass536_Sub18_10506;
		else
			class536_sub18_1_ = class536_sub18;
		if (class536_sub18_1_ == aClass536_Sub18_8794) {
			aClass536_Sub18_8795 = null;
			return null;
		}
		aClass536_Sub18_8795 = class536_sub18_1_.aClass536_Sub18_10506;
		return class536_sub18_1_;
	}

	public Class536_Sub18 method8248(int i) {
		return method8247(null, 325441285);
	}

	public int method8249() {
		int i = 0;
		for (Class536_Sub18 class536_sub18 = aClass536_Sub18_8794.aClass536_Sub18_10506; class536_sub18 != aClass536_Sub18_8794; class536_sub18 = class536_sub18.aClass536_Sub18_10506)
			i++;
		return i;
	}

	static int method8250(byte[][] is, byte[][] is_2_, int[] is_3_, byte[] is_4_, int[] is_5_, int i, int i_6_, byte i_7_) {
		int i_8_ = is_3_[i];
		int i_9_ = i_8_ + is_5_[i];
		int i_10_ = is_3_[i_6_];
		int i_11_ = i_10_ + is_5_[i_6_];
		int i_12_ = i_8_;
		if (i_10_ > i_8_)
			i_12_ = i_10_;
		int i_13_ = i_9_;
		if (i_11_ < i_9_)
			i_13_ = i_11_;
		int i_14_ = is_4_[i] & 0xff;
		if ((is_4_[i_6_] & 0xff) < i_14_)
			i_14_ = is_4_[i_6_] & 0xff;
		byte[] is_15_ = is_2_[i];
		byte[] is_16_ = is[i_6_];
		int i_17_ = i_12_ - i_8_;
		int i_18_ = i_12_ - i_10_;
		for (int i_19_ = i_12_; i_19_ < i_13_; i_19_++) {
			int i_20_ = is_15_[i_17_++] + is_16_[i_18_++];
			if (i_20_ < i_14_)
				i_14_ = i_20_;
		}
		return -i_14_;
	}

	static final void method8251(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= -1349181388;
		class251.anInt2623 = (class668.anIntArray8541[class668.anInt8542 * 1867269829] * -475660893);
		class251.anInt2681 = (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1] * 863180553);
		class251.anInt2625 = (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2] * 1666957795);
		class251.anInt2687 = (class668.anIntArray8541[3 + class668.anInt8542 * 1867269829] * 1162256095);
		Class668.method8011(class251, 263642117);
	}
}

/* Class629 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Image;

public class Class629 {
	int anInt8205;
	int anInt8206;
	int anInt8207;
	int anInt8208;
	int anInt8209;
	int anInt8210;
	int anInt8211;
	int anInt8212;
	int anInt8213;
	int anInt8214;
	int anInt8215;
	int anInt8216;
	public static Image anImage8217;

	boolean method10417(Class629 class629_0_, int i) {
		if (-2123172549 * anInt8209 == class629_0_.anInt8209 * -2123172549 && anInt8213 * 1537223537 == 1537223537 * class629_0_.anInt8213 && anInt8216 * 1388892867 == class629_0_.anInt8216 * 1388892867)
			return true;
		return false;
	}

	Class629() {
		/* empty */
	}

	boolean method10418(Class629 class629_1_) {
		if (-2123172549 * anInt8209 == class629_1_.anInt8209 * -2123172549 && anInt8213 * 1537223537 == 1537223537 * class629_1_.anInt8213 && anInt8216 * 1388892867 == class629_1_.anInt8216 * 1388892867)
			return true;
		return false;
	}

	static final void method10419(Class665 class665, byte i) {
		Class523 class523 = class665.aClass640_Sub1_Sub2_Sub1_8522.method18547(304048448);
		if (null == class523)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class523.method8686(946206455);
	}

	static final void method10420(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_2_ & 0x3fff;
	}

	static final void method10421(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class269.method5053(class243, class240, class665, (byte) 64);
	}

	static final void method10422(long l) {
		int i = client.anInt11179 * 2051886797;
		int i_3_ = client.anInt11045 * 1446602977;
		if (Class286.anInt3211 * 657661431 != i) {
			int i_4_ = i - Class286.anInt3211 * 657661431;
			int i_5_ = (int) ((long) i_4_ * l / 320L);
			if (i_4_ > 0) {
				if (0 == i_5_)
					i_5_ = 1;
				else if (i_5_ > i_4_)
					i_5_ = i_4_;
			} else if (0 == i_5_)
				i_5_ = -1;
			else if (i_5_ < i_4_)
				i_5_ = i_4_;
			Class286.anInt3211 += 1831908295 * i_5_;
		}
		if (i_3_ != Class608.anInt7995 * -1823634057) {
			int i_6_ = i_3_ - -1823634057 * Class608.anInt7995;
			int i_7_ = (int) (l * (long) i_6_ / 320L);
			if (i_6_ > 0) {
				if (0 == i_7_)
					i_7_ = 1;
				else if (i_7_ > i_6_)
					i_7_ = i_6_;
			} else if (0 == i_7_)
				i_7_ = -1;
			else if (i_7_ < i_6_)
				i_7_ = i_6_;
			Class608.anInt7995 += -1672389561 * i_7_;
		}
		client.aFloat11112 += 8.0F * ((float) l * client.aFloat11156 / 40.0F);
		client.aFloat11111 += client.aFloat11114 * (float) l / 40.0F * 8.0F;
		Class229.method4317((byte) -108);
	}
}

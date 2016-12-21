/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class354 {
	Class521_Sub2_Sub1[][] aClass521_Sub2_Sub1ArrayArray3741;
	Interface38 anInterface38_3742;
	Class343 aClass343_3743;
	int anInt3744 = 64;
	int anInt3745 = 768;
	int anInt3746;
	Interface41 anInterface41_3747;
	int anInt3748;
	int anInt3749 = 64;
	int[] anIntArray3750;
	int[] anIntArray3751;
	int[] anIntArray3752;
	Class521_Sub2_Sub1[][] aClass521_Sub2_Sub1ArrayArray3753;
	Interface38 anInterface38_3754;
	int anInt3755 = 1600;
	static float aFloat3756;

	void method4650(Class167_Sub3 class167_sub3) {
		anInterface38_3754.method271(786336, 24);
	}

	void method4651() {
		anInterface38_3754.method131();
	}

	void method4652(Class167_Sub3 class167_sub3, Class166 class166) {
		class167_sub3.method2302(false);
		aFloat3756 = class167_sub3.aFloat9626;
		float f = class167_sub3.aClass443_9698.aFloatArray4878[2];
		float f_0_ = class167_sub3.aClass443_9698.aFloatArray4878[6];
		float f_1_ = class167_sub3.aClass443_9698.aFloatArray4878[10];
		float f_2_ = class167_sub3.aClass443_9698.aFloatArray4878[14];
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class521_Sub2 class521_sub2 = class166.aClass703_1841.aClass521_Sub2_8803;
		for (Class521_Sub2 class521_sub2_5_ = class521_sub2.aClass521_Sub2_10295; class521_sub2_5_ != class521_sub2; class521_sub2_5_ = class521_sub2_5_.aClass521_Sub2_10295) {
			Class521_Sub2_Sub1 class521_sub2_sub1 = (Class521_Sub2_Sub1) class521_sub2_5_;
			int i_6_ = (int) (f * (float) (class521_sub2_sub1.anInt11595 >> 12) + f_0_ * (float) (class521_sub2_sub1.anInt11592 >> 12) + f_1_ * (float) (class521_sub2_sub1.anInt11597 >> 12) + f_2_);
			if (i_6_ > i_4_)
				i_4_ = i_6_;
			if (i_6_ < i_3_)
				i_3_ = i_6_;
			anIntArray3750[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
			i_8_ = 1 + Class98_Sub1.method8392(i_7_, (byte) -99) - anInt3746;
			i_7_ = (i_7_ >> i_8_) + 2;
		} else {
			i_8_ = 0;
			i_7_ += 2;
		}
		class167_sub3.method8809(anInterface41_3747);
		Class331 class331 = class167_sub3.aClass331_9606;
		class331.method4324(Class443.aClass443_4879);
		class331.aClass443_3605.method5338();
		class331.anInt3608 = -1;
		boolean bool = class167_sub3.anInt9550 > 0;
		if (bool) {
			class331.aClass427_3609.method5131(0.0F, 0.0F, 1.0F, -class167_sub3.aFloat9675);
			class331.aClass436_3610.method5243((float) (class167_sub3.anInt9672 >> 16 & 0xff) / 255.0F, (float) (class167_sub3.anInt9672 >> 8 & 0xff) / 255.0F, (float) (class167_sub3.anInt9672 >> 0 & 0xff) / 255.0F);
			class331.aClass427_3609.method5137(class167_sub3.aClass443_9565);
			class331.aClass427_3609.method5134(1.0F / (class167_sub3.aFloat9676 - class167_sub3.aFloat9675));
		} else {
			class331.aClass427_3609.method5131(0.0F, 0.0F, 0.0F, 0.0F);
			class331.aClass436_3610.method5243(0.0F, 0.0F, 0.0F);
		}
		method4653(class167_sub3, class521_sub2, i_7_, i_3_, i_8_, class331, bool);
		if (class167_sub3.aFloat9626 != aFloat3756)
			class167_sub3.method2006(aFloat3756);
		class167_sub3.method2302(true);
	}

	void method4653(Class167_Sub3 class167_sub3, Class521_Sub2 class521_sub2, int i, int i_9_, int i_10_, Class331 class331, boolean bool) {
		Class521_Sub2 class521_sub2_11_ = class521_sub2.aClass521_Sub2_10295;
		int i_12_ = 0;
		int i_13_ = -2;
		boolean bool_14_ = true;
		boolean bool_15_ = true;
		while (class521_sub2_11_ != class521_sub2) {
			anInt3748 = 0;
			for (int i_16_ = 0; i_16_ < i; i_16_++)
				anIntArray3751[i_16_] = 0;
			for (int i_17_ = 0; i_17_ < 64; i_17_++)
				anIntArray3752[i_17_] = 0;
			for (/**/; class521_sub2_11_ != class521_sub2; class521_sub2_11_ = class521_sub2_11_.aClass521_Sub2_10295) {
				Class521_Sub2_Sub1 class521_sub2_sub1 = (Class521_Sub2_Sub1) class521_sub2_11_;
				if (bool_15_) {
					i_13_ = class521_sub2_sub1.anInt11593;
					bool_14_ = class521_sub2_sub1.aBool11601;
					bool_15_ = false;
				}
				if (i_12_ > 0 && (i_13_ != class521_sub2_sub1.anInt11593 || bool_14_ != class521_sub2_sub1.aBool11601)) {
					bool_15_ = true;
					break;
				}
				method4654(anIntArray3750[i_12_++] - i_9_ >> i_10_, class521_sub2_sub1);
			}
			class331.anInterface36_3606 = null;
			if (i_13_ >= 0) {
				Class164 class164 = class167_sub3.aClass174_1852.method2446(i_13_, -1532946161);
				if (class164.aBool1814)
					class331.anInterface36_3606 = class167_sub3.aClass340_9561.method4456(class164);
				byte i_18_ = 0;
				if (class164.aClass595_1805 == Class595.aClass595_7818)
					i_18_ = class164.aByte1806;
				class167_sub3.method8796(i_18_);
			}
			if (bool_14_ && class167_sub3.aFloat9626 != aFloat3756)
				class167_sub3.method2006(aFloat3756);
			else if (class167_sub3.aFloat9626 != 1.0F)
				class167_sub3.method2006(1.0F);
			method4656(class167_sub3, i, bool);
		}
	}

	void method4654(int i, Class521_Sub2_Sub1 class521_sub2_sub1) {
		if (i < 1600) {
			if (anIntArray3751[i] < 64)
				aClass521_Sub2_Sub1ArrayArray3753[i][anIntArray3751[i]++] = class521_sub2_sub1;
			else {
				if (anIntArray3751[i] == 64) {
					if (anInt3748 == 64)
						return;
					anIntArray3751[i] += 1 + anInt3748++;
				}
				aClass521_Sub2_Sub1ArrayArray3741[anIntArray3751[i] - 64 - 1][anIntArray3752[anIntArray3751[i] - 64 - 1]++] = class521_sub2_sub1;
			}
		}
	}

	void method4655() {
		anInterface38_3754.method131();
	}

	void method4656(Class167_Sub3 class167_sub3, int i, boolean bool) {
		int i_19_ = 0;
		Class443 class443 = class167_sub3.aClass443_9698;
		float f = class443.aFloatArray4878[0];
		float f_20_ = class443.aFloatArray4878[4];
		float f_21_ = class443.aFloatArray4878[8];
		float f_22_ = class443.aFloatArray4878[1];
		float f_23_ = class443.aFloatArray4878[5];
		float f_24_ = class443.aFloatArray4878[9];
		float f_25_ = f + f_22_;
		float f_26_ = f_20_ + f_23_;
		float f_27_ = f_21_ + f_24_;
		float f_28_ = f - f_22_;
		float f_29_ = f_20_ - f_23_;
		float f_30_ = f_21_ - f_24_;
		float f_31_ = f_22_ - f;
		float f_32_ = f_23_ - f_20_;
		float f_33_ = f_24_ - f_21_;
		float[] fs = new float[3];
		float[] fs_34_ = new float[3];
		class167_sub3.aClass443_9570.method5340(class167_sub3.aClass443_9564);
		ByteBuffer bytebuffer = class167_sub3.aByteBuffer9549;
		bytebuffer.clear();
		for (int i_35_ = i - 1; i_35_ >= 0; i_35_--) {
			int i_36_ = anIntArray3751[i_35_] > 64 ? 64 : anIntArray3751[i_35_];
			if (i_36_ > 0) {
				for (int i_37_ = i_36_ - 1; i_37_ >= 0; i_37_--) {
					Class521_Sub2_Sub1 class521_sub2_sub1 = aClass521_Sub2_Sub1ArrayArray3753[i_35_][i_37_];
					int i_38_ = class521_sub2_sub1.anInt11594;
					byte i_39_ = (byte) (i_38_ >> 16);
					byte i_40_ = (byte) (i_38_ >> 8);
					byte i_41_ = (byte) i_38_;
					byte i_42_ = (byte) (i_38_ >>> 24);
					if (class167_sub3.anInt9689 == 0) {
						byte i_43_ = i_39_;
						i_39_ = i_41_;
						i_41_ = i_43_;
					}
					float f_44_ = (float) (class521_sub2_sub1.anInt11595 >> 12);
					float f_45_ = (float) (class521_sub2_sub1.anInt11592 >> 12);
					float f_46_ = (float) (class521_sub2_sub1.anInt11597 >> 12);
					int i_47_ = class521_sub2_sub1.anInt11598 >> 12;
					if (class521_sub2_sub1.aShort11600 != 0) {
						class167_sub3.aClass443_9643.method5365(class521_sub2_sub1.aShort11600, i_47_, i_47_, 0.0F, 0.0F, 0.0F);
						class167_sub3.aClass443_9643.method5390(class167_sub3.aClass443_9570);
						class167_sub3.aClass443_9643.method5346(1.0F, 0.0F, 0.0F, fs);
						class167_sub3.aClass443_9643.method5346(0.0F, 1.0F, 0.0F, fs_34_);
						bytebuffer.putFloat(f_44_ - fs[0] - fs_34_[0]);
						bytebuffer.putFloat(f_45_ - fs[1] - fs_34_[1]);
						bytebuffer.putFloat(f_46_ - fs[2] - fs_34_[2]);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_44_ - fs[0] + fs_34_[0]);
						bytebuffer.putFloat(f_45_ - fs[1] + fs_34_[1]);
						bytebuffer.putFloat(f_46_ - fs[2] + fs_34_[2]);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_44_ + fs[0] + fs_34_[0]);
						bytebuffer.putFloat(f_45_ + fs[1] + fs_34_[1]);
						bytebuffer.putFloat(f_46_ + fs[2] + fs_34_[2]);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_44_ + fs[0] - fs_34_[0]);
						bytebuffer.putFloat(f_45_ + fs[1] - fs_34_[1]);
						bytebuffer.putFloat(f_46_ + fs[2] - fs_34_[2]);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_44_ + f_25_ * (float) -i_47_);
						bytebuffer.putFloat(f_45_ + f_26_ * (float) -i_47_);
						bytebuffer.putFloat(f_46_ + f_27_ * (float) -i_47_);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_44_ + f_31_ * (float) i_47_);
						bytebuffer.putFloat(f_45_ + f_32_ * (float) i_47_);
						bytebuffer.putFloat(f_46_ + f_33_ * (float) i_47_);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_44_ + f_25_ * (float) i_47_);
						bytebuffer.putFloat(f_45_ + f_26_ * (float) i_47_);
						bytebuffer.putFloat(f_46_ + f_27_ * (float) i_47_);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_44_ + f_28_ * (float) i_47_);
						bytebuffer.putFloat(f_45_ + f_29_ * (float) i_47_);
						bytebuffer.putFloat(f_46_ + f_30_ * (float) i_47_);
						bytebuffer.put(i_39_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_19_++;
				}
				if (anIntArray3751[i_35_] > 64) {
					int i_48_ = anIntArray3751[i_35_] - 64 - 1;
					for (int i_49_ = anIntArray3752[i_48_] - 1; i_49_ >= 0; i_49_--) {
						Class521_Sub2_Sub1 class521_sub2_sub1 = aClass521_Sub2_Sub1ArrayArray3741[i_48_][i_49_];
						int i_50_ = class521_sub2_sub1.anInt11594;
						byte i_51_ = (byte) (i_50_ >> 16);
						byte i_52_ = (byte) (i_50_ >> 8);
						byte i_53_ = (byte) i_50_;
						byte i_54_ = (byte) (i_50_ >>> 24);
						float f_55_ = (float) (class521_sub2_sub1.anInt11595 >> 12);
						float f_56_ = (float) (class521_sub2_sub1.anInt11592 >> 12);
						float f_57_ = (float) (class521_sub2_sub1.anInt11597 >> 12);
						int i_58_ = class521_sub2_sub1.anInt11598 >> 12;
						if (class167_sub3.anInt9689 == 0) {
							byte i_59_ = i_51_;
							i_51_ = i_53_;
							i_53_ = i_59_;
						}
						if (class521_sub2_sub1.aShort11600 != 0) {
							class167_sub3.aClass443_9643.method5365(class521_sub2_sub1.aShort11600, i_58_, i_58_, 0.0F, 0.0F, 0.0F);
							class167_sub3.aClass443_9643.method5390(class167_sub3.aClass443_9570);
							class167_sub3.aClass443_9643.method5346(1.0F, 0.0F, 0.0F, fs);
							class167_sub3.aClass443_9643.method5346(0.0F, 1.0F, 0.0F, fs_34_);
							bytebuffer.putFloat(f_55_ - fs[0] - fs_34_[0]);
							bytebuffer.putFloat(f_56_ - fs[1] - fs_34_[1]);
							bytebuffer.putFloat(f_57_ - fs[2] - fs_34_[2]);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_55_ - fs[0] + fs_34_[0]);
							bytebuffer.putFloat(f_56_ - fs[1] + fs_34_[1]);
							bytebuffer.putFloat(f_57_ - fs[2] + fs_34_[2]);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_55_ + fs[0] + fs_34_[0]);
							bytebuffer.putFloat(f_56_ + fs[1] + fs_34_[1]);
							bytebuffer.putFloat(f_57_ + fs[2] + fs_34_[2]);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_55_ + fs[0] - fs_34_[0]);
							bytebuffer.putFloat(f_56_ + fs[1] - fs_34_[1]);
							bytebuffer.putFloat(f_57_ + fs[2] - fs_34_[2]);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_55_ + f_25_ * (float) -i_58_);
							bytebuffer.putFloat(f_56_ + f_26_ * (float) -i_58_);
							bytebuffer.putFloat(f_57_ + f_27_ * (float) -i_58_);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_55_ + f_31_ * (float) i_58_);
							bytebuffer.putFloat(f_56_ + f_32_ * (float) i_58_);
							bytebuffer.putFloat(f_57_ + f_33_ * (float) i_58_);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_55_ + f_25_ * (float) i_58_);
							bytebuffer.putFloat(f_56_ + f_26_ * (float) i_58_);
							bytebuffer.putFloat(f_57_ + f_27_ * (float) i_58_);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_55_ + f_28_ * (float) i_58_);
							bytebuffer.putFloat(f_56_ + f_29_ * (float) i_58_);
							bytebuffer.putFloat(f_57_ + f_30_ * (float) i_58_);
							bytebuffer.put(i_51_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_19_++;
					}
				}
			}
		}
		anInterface38_3754.method264(0, bytebuffer.position(), class167_sub3.aLong9586);
		class167_sub3.method8808(0, anInterface38_3754);
		class167_sub3.method8808(1, anInterface38_3742);
		class167_sub3.method8807(aClass343_3743);
		Class331 class331 = class167_sub3.aClass331_9606;
		class331.method4323(i_19_, bool);
	}

	Class354(Class167_Sub3 class167_sub3) {
		anInt3746 = Class98_Sub1.method8392(1600, (byte) 59);
		anInt3749 = 64;
		anIntArray3750 = new int[8191];
		anIntArray3751 = new int[1600];
		anIntArray3752 = new int[64];
		aClass521_Sub2_Sub1ArrayArray3753 = new Class521_Sub2_Sub1[1600][64];
		aClass521_Sub2_Sub1ArrayArray3741 = new Class521_Sub2_Sub1[64][768];
		anInt3748 = 0;
		aClass343_3743 = (class167_sub3.method8806(new Class362[] { new Class362(new Class355[] { Class355.aClass355_3763, Class355.aClass355_3759, Class355.aClass355_3761 }), new Class362(Class355.aClass355_3758) }));
		anInterface38_3754 = class167_sub3.method8805(true);
		anInterface38_3742 = class167_sub3.method8805(false);
		anInterface38_3742.method271(393168, 12);
		anInterface41_3747 = class167_sub3.method8804(false);
		anInterface41_3747.method283(49146);
		ByteBuffer bytebuffer = class167_sub3.aByteBuffer9549;
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			int i_60_ = i * 4;
			bytebuffer.putShort((short) i_60_);
			bytebuffer.putShort((short) (i_60_ + 1));
			bytebuffer.putShort((short) (i_60_ + 2));
			bytebuffer.putShort((short) (i_60_ + 2));
			bytebuffer.putShort((short) (i_60_ + 3));
			bytebuffer.putShort((short) i_60_);
		}
		anInterface41_3747.method264(0, bytebuffer.position(), class167_sub3.aLong9586);
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
		}
		anInterface38_3742.method264(0, bytebuffer.position(), class167_sub3.aLong9586);
	}
}

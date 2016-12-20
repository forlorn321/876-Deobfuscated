/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class496 {
	Class147 aClass147_5550;
	static Class147 aClass147_5551;
	static final int anInt5552 = 1;
	static final int anInt5553 = 2;
	int anInt5554;
	int anInt5555;
	static Class176 aClass176_5556;
	static final int anInt5557 = 512;
	int anInt5558;
	boolean aBool5559;
	int anInt5560;
	int anInt5561;
	static final int anInt5562 = 24;
	int anInt5563;
	int anInt5564;
	int anInt5565;
	int anInt5566;
	int anInt5567;
	int anInt5568;
	int anInt5569;
	int anInt5570;
	static final int anInt5571 = 24;
	int anInt5572;
	static final int anInt5573 = 192;
	static final int anInt5574 = 128;
	static final int anInt5575 = 13;
	int anInt5576;
	static final int anInt5577 = 0;
	static final int anInt5578 = 16;
	static Class147 aClass147_5579;
	static int[] anIntArray5580 = new int[4];

	void method8126(Class180 class180, Class496 class496_0_) {
		Class175 class175 = Class175.method2814(Class269.aClass459_3121, anInt5560, 0);
		if (class175 != null) {
			class180.method3135(anIntArray5580);
			class180.method3132(0, 0, anInt5576, anInt5576);
			class180.method3136(2, 0);
			class180.method3348(0, 0, anInt5576, anInt5576, 0, 0);
			int i = 0;
			int i_1_ = 0;
			int i_2_ = 256;
			if (class496_0_ != null) {
				if (class496_0_.aBool5559) {
					i = -class496_0_.anInt5567;
					i_1_ = -class496_0_.anInt5555;
					i_2_ = -class496_0_.anInt5558;
				} else {
					i = anInt5567 - class496_0_.anInt5567;
					i_1_ = anInt5555 - class496_0_.anInt5555;
					i_2_ = anInt5558 - class496_0_.anInt5558;
				}
			}
			if (anInt5572 != 0) {
				int i_3_ = -anInt5572 & 0x3fff;
				int i_4_ = Class428.anIntArray4825[i_3_];
				int i_5_ = Class428.anIntArray4819[i_3_];
				int i_6_ = i_1_ * i_5_ - i_2_ * i_4_ >> 14;
				i_2_ = i_1_ * i_4_ + i_2_ * i_5_ >> 14;
				i_1_ = i_6_;
			}
			if (anInt5563 != 0) {
				int i_7_ = -anInt5563 & 0x3fff;
				int i_8_ = Class428.anIntArray4825[i_7_];
				int i_9_ = Class428.anIntArray4819[i_7_];
				int i_10_ = i_2_ * i_8_ + i * i_9_ >> 14;
				i_2_ = i_2_ * i_9_ - i * i_8_ >> 14;
				i = i_10_;
			}
			class180.method3478(1.0F);
			class180.method3157(anInt5561, 1.0F, 1.0F, (float) i, (float) i_1_, (float) i_2_);
			class175.method2840(anInt5568 & 0x3fff, anInt5569 & 0x3fff, anInt5570 & 0x3fff);
			Class176 class176 = class180.method3376(class175, 2048, 0, 64, 768);
			int i_11_ = class176.method2939() - class176.method2894();
			int i_12_ = class176.method2897() - class176.method2896();
			int i_13_ = i_11_ > i_12_ ? i_11_ : i_12_;
			int i_14_ = 1024 * anInt5576 / i_13_;
			Class427 class427 = class180.method3364();
			Class427 class427_15_ = class180.method3171();
			class427_15_.method6753((float) (anInt5576 / 2), (float) (anInt5576 / 2), (float) i_14_, (float) i_14_, 50.0F, 50000.0F, (float) class180.method3285(2118407517).method2728(), (float) class180.method3285(1110796495).method2729(), 1024.0F);
			class180.method3183(class427_15_);
			Class432 class432 = new Class432();
			class180.method3180(class432);
			Class432 class432_16_ = class180.method3172();
			class432_16_.method6894(0.0F, 0.0F, (float) (50 - class176.method2898()));
			class176.method2889(class432_16_, null, 1);
			aClass147_5550 = class180.method3226(0, 0, anInt5576, anInt5576, true);
			aClass147_5550.method2486(0, 0, 3);
			class180.method3183(class427);
			class180.method3132(anIntArray5580[0], anIntArray5580[1], anIntArray5580[2], anIntArray5580[3]);
		}
	}

	static void method8127() {
		aClass176_5556 = null;
		aClass147_5579 = null;
	}

	boolean method8128(int i, int i_17_, int i_18_, int i_19_) {
		int i_20_;
		int i_21_;
		int i_22_;
		if (!aBool5559) {
			i_20_ = anInt5567 - i;
			i_21_ = anInt5555 - i_17_;
			i_22_ = anInt5558 - i_18_;
			anInt5564 = (int) Math.sqrt((double) (i_20_ * i_20_ + i_21_ * i_21_ + i_22_ * i_22_));
			if (anInt5564 == 0)
				anInt5564 = 1;
			i_20_ = (i_20_ << 8) / anInt5564;
			i_21_ = (i_21_ << 8) / anInt5564;
			i_22_ = (i_22_ << 8) / anInt5564;
		} else {
			anInt5564 = 1073741823;
			i_20_ = anInt5567;
			i_21_ = anInt5555;
			i_22_ = anInt5558;
		}
		int i_23_ = (int) (Math.sqrt((double) (i_20_ * i_20_ + i_21_ * i_21_ + i_22_ * i_22_)) * 256.0);
		if (i_23_ > 128) {
			i_20_ = (i_20_ << 16) / i_23_;
			i_21_ = (i_21_ << 16) / i_23_;
			i_22_ = (i_22_ << 16) / i_23_;
			anInt5566 = anInt5565 * i_19_ / (aBool5559 ? 1024 : anInt5564);
		} else
			anInt5566 = 0;
		if (anInt5566 < 8) {
			aClass147_5550 = null;
			return false;
		}
		int i_24_ = Class186.method3652(anInt5566, -36159335);
		if (i_24_ > i_19_)
			i_24_ = Class203.method3783(i_19_, 1065864200);
		if (i_24_ > 512)
			i_24_ = 512;
		if (i_24_ != anInt5576)
			anInt5576 = i_24_;
		anInt5572 = (int) (Math.asin((double) ((float) i_21_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt5563 = (int) (Math.atan2((double) i_20_, (double) -i_22_) * 2607.5945876176133) & 0x3fff;
		aClass147_5550 = null;
		return true;
	}

	void method8129(Class180 class180, Class496 class496_25_) {
		method8134(class180);
		method8135(class180);
		class180.method3135(anIntArray5580);
		class180.method3132(0, 0, anInt5576, anInt5576);
		class180.method3136(2, 0);
		class180.method3348(0, 0, anInt5576, anInt5576, ~0xffffff | anInt5561, 0);
		int i = 0;
		int i_26_ = 0;
		int i_27_ = 256;
		if (class496_25_ != null) {
			if (class496_25_.aBool5559) {
				i = -class496_25_.anInt5567;
				i_26_ = -class496_25_.anInt5555;
				i_27_ = -class496_25_.anInt5558;
			} else {
				i = class496_25_.anInt5567 - anInt5567;
				i_26_ = class496_25_.anInt5555 - anInt5555;
				i_27_ = class496_25_.anInt5558 - anInt5558;
			}
		}
		if (anInt5572 != 0) {
			int i_28_ = Class428.anIntArray4825[anInt5572];
			int i_29_ = Class428.anIntArray4819[anInt5572];
			int i_30_ = i_26_ * i_29_ - i_27_ * i_28_ >> 14;
			i_27_ = i_26_ * i_28_ + i_27_ * i_29_ >> 14;
			i_26_ = i_30_;
		}
		if (anInt5563 != 0) {
			int i_31_ = Class428.anIntArray4825[anInt5563];
			int i_32_ = Class428.anIntArray4819[anInt5563];
			int i_33_ = i_27_ * i_31_ + i * i_32_ >> 14;
			i_27_ = i_27_ * i_32_ - i * i_31_ >> 14;
			i = i_33_;
		}
		Class176 class176 = aClass176_5556.method2862((byte) 0, 51200, true);
		class176.method2909((short) 0, (short) anInt5560);
		class180.method3478(1.0F);
		class180.method3157(16777215, 1.0F, 1.0F, (float) i, (float) i_26_, (float) i_27_);
		int i_34_ = (1024 * anInt5576 / (class176.method2939() - class176.method2894()));
		if (anInt5561 != 0)
			i_34_ = i_34_ * 13 / 16;
		Class427 class427 = class180.method3364();
		Class427 class427_35_ = class180.method3171();
		class427_35_.method6753((float) (anInt5576 / 2), (float) (anInt5576 / 2), (float) i_34_, (float) i_34_, 50.0F, 50000.0F, (float) class180.method3285(848894403).method2728(), (float) class180.method3285(1138852175).method2729(), 1024.0F);
		class180.method3183(class427_35_);
		class180.method3180(new Class432());
		Class432 class432 = new Class432();
		class432.method6894(0.0F, 0.0F, (float) (50 - class176.method2898()));
		class176.method2889(class432, null, 1);
		int i_36_ = anInt5576 * 13 / 16;
		int i_37_ = (anInt5576 - i_36_) / 2;
		aClass147_5551.method2419(i_37_, i_37_, i_36_, i_36_, 0, ~0xffffff | anInt5561, 1);
		aClass147_5550 = class180.method3226(0, 0, anInt5576, anInt5576, true);
		class180.method3136(2, 0);
		class180.method3348(0, 0, anInt5576, anInt5576, 0, 0);
		aClass147_5579.method2419(0, 0, anInt5576, anInt5576, 1, 0, 0);
		aClass147_5550.method2486(0, 0, 3);
		class180.method3183(class427);
		class180.method3132(anIntArray5580[0], anIntArray5580[1], anIntArray5580[2], anIntArray5580[3]);
	}

	static void method8130() {
		aClass176_5556 = null;
		aClass147_5579 = null;
	}

	boolean method8131(Class180 class180, Class496 class496_38_) {
		if (aClass147_5550 == null) {
			if (anInt5554 == 0) {
				if (Class511.anInterface24_6980.method134(Class609.aClass609_7996, anInt5560, Class591.aClass591_7796, 0.7F, anInt5576, anInt5576, false, -1025581977)) {
					int[] is = (Class511.anInterface24_6980.method133(Class609.aClass609_7996, anInt5560, 0.7F, anInt5576, anInt5576, false, -1228054157));
					aClass147_5550 = class180.method3163(is, 0, anInt5576, anInt5576, anInt5576, -1507617931);
				}
			} else if (anInt5554 == 2)
				method8126(class180, class496_38_);
			else if (anInt5554 == 1)
				method8129(class180, class496_38_);
		}
		return aClass147_5550 != null;
	}

	boolean method8132(Class180 class180, Class496 class496_39_) {
		return aClass147_5550 != null || method8131(class180, class496_39_);
	}

	static void method8133() {
		aClass176_5556 = null;
		aClass147_5579 = null;
	}

	static void method8134(Class180 class180) {
		if (aClass176_5556 == null) {
			Class175 class175 = new Class175(580, 1104, 1);
			class175.method2806((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class175.method2849(0, 128, 0);
			class175.method2849(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_40_ = i * 8192 / 24;
				int i_41_ = Class428.anIntArray4825[i_40_];
				int i_42_ = Class428.anIntArray4819[i_40_];
				for (int i_43_ = 1; i_43_ < 24; i_43_++) {
					int i_44_ = i_43_ * 8192 / 24;
					int i_45_ = Class428.anIntArray4819[i_44_] >> 7;
					int i_46_ = Class428.anIntArray4825[i_44_] * i_41_ >> 21;
					int i_47_ = Class428.anIntArray4825[i_44_] * i_42_ >> 21;
					class175.method2849(i_47_, i_45_, -i_46_);
				}
				if (i > 0) {
					int i_48_ = i * 23 + 2;
					int i_49_ = i_48_ - 23;
					class175.method2804(0, i_49_, i_48_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_50_ = 1; i_50_ < 23; i_50_++) {
						int i_51_ = i_49_ + 1;
						int i_52_ = i_48_ + 1;
						class175.method2804(i_49_, i_51_, i_48_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class175.method2804(i_51_, i_52_, i_48_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_49_ = i_51_;
						i_48_ = i_52_;
					}
					class175.method2804(i_48_, i_49_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class175.anInt1912 = class175.anInt1906;
			class175.anIntArray1914 = null;
			class175.anIntArray1921 = null;
			class175.aByteArray1924 = null;
			aClass176_5556 = class180.method3376(class175, 51200, 33, 64, 768);
		}
	}

	static void method8135(Class180 class180) {
		if (aClass147_5579 == null) {
			int[] is = new int[16384];
			int[] is_53_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_54_ = 64 - i;
				i_54_ *= i_54_;
				int i_55_ = 128 - i - 1;
				int i_56_ = i * 128;
				int i_57_ = i_55_ * 128;
				for (int i_58_ = 0; i_58_ < 64; i_58_++) {
					int i_59_ = 64 - i_58_;
					i_59_ *= i_59_;
					int i_60_ = 128 - i_58_ - 1;
					int i_61_ = 256 - (i_59_ + i_54_ << 8) / 4096;
					i_61_ = i_61_ * 3072 / 1536;
					if (i_61_ < 0)
						i_61_ = 0;
					else if (i_61_ > 255)
						i_61_ = 255;
					int i_62_ = i_61_ / 2;
					is_53_[i_56_ + i_58_] = is_53_[i_56_ + i_60_] = is_53_[i_57_ + i_58_] = is_53_[i_57_ + i_60_] = ~0xffffff | i_61_ << 16;
					is[i_56_ + i_58_] = is[i_56_ + i_60_] = is[i_57_ + i_58_] = is[i_57_ + i_60_] = 127 - i_62_ << 24 | 0xffffff;
				}
			}
			aClass147_5579 = class180.method3163(is_53_, 0, 128, 128, 128, -237624411);
			aClass147_5551 = class180.method3163(is, 0, 128, 128, 128, -13199914);
		}
	}

	static void method8136() {
		aClass176_5556 = null;
		aClass147_5579 = null;
	}

	static void method8137(Class180 class180) {
		if (aClass176_5556 == null) {
			Class175 class175 = new Class175(580, 1104, 1);
			class175.method2806((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class175.method2849(0, 128, 0);
			class175.method2849(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_63_ = i * 8192 / 24;
				int i_64_ = Class428.anIntArray4825[i_63_];
				int i_65_ = Class428.anIntArray4819[i_63_];
				for (int i_66_ = 1; i_66_ < 24; i_66_++) {
					int i_67_ = i_66_ * 8192 / 24;
					int i_68_ = Class428.anIntArray4819[i_67_] >> 7;
					int i_69_ = Class428.anIntArray4825[i_67_] * i_64_ >> 21;
					int i_70_ = Class428.anIntArray4825[i_67_] * i_65_ >> 21;
					class175.method2849(i_70_, i_68_, -i_69_);
				}
				if (i > 0) {
					int i_71_ = i * 23 + 2;
					int i_72_ = i_71_ - 23;
					class175.method2804(0, i_72_, i_71_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_73_ = 1; i_73_ < 23; i_73_++) {
						int i_74_ = i_72_ + 1;
						int i_75_ = i_71_ + 1;
						class175.method2804(i_72_, i_74_, i_71_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class175.method2804(i_74_, i_75_, i_71_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_72_ = i_74_;
						i_71_ = i_75_;
					}
					class175.method2804(i_71_, i_72_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class175.anInt1912 = class175.anInt1906;
			class175.anIntArray1914 = null;
			class175.anIntArray1921 = null;
			class175.aByteArray1924 = null;
			aClass176_5556 = class180.method3376(class175, 51200, 33, 64, 768);
		}
	}

	static void method8138(Class180 class180) {
		if (aClass147_5579 == null) {
			int[] is = new int[16384];
			int[] is_76_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_77_ = 64 - i;
				i_77_ *= i_77_;
				int i_78_ = 128 - i - 1;
				int i_79_ = i * 128;
				int i_80_ = i_78_ * 128;
				for (int i_81_ = 0; i_81_ < 64; i_81_++) {
					int i_82_ = 64 - i_81_;
					i_82_ *= i_82_;
					int i_83_ = 128 - i_81_ - 1;
					int i_84_ = 256 - (i_82_ + i_77_ << 8) / 4096;
					i_84_ = i_84_ * 3072 / 1536;
					if (i_84_ < 0)
						i_84_ = 0;
					else if (i_84_ > 255)
						i_84_ = 255;
					int i_85_ = i_84_ / 2;
					is_76_[i_79_ + i_81_] = is_76_[i_79_ + i_83_] = is_76_[i_80_ + i_81_] = is_76_[i_80_ + i_83_] = ~0xffffff | i_84_ << 16;
					is[i_79_ + i_81_] = is[i_79_ + i_83_] = is[i_80_ + i_81_] = is[i_80_ + i_83_] = 127 - i_85_ << 24 | 0xffffff;
				}
			}
			aClass147_5579 = class180.method3163(is_76_, 0, 128, 128, 128, -397428395);
			aClass147_5551 = class180.method3163(is, 0, 128, 128, 128, 1216717315);
		}
	}

	void method8139(Class180 class180, int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_) {
		if (aClass147_5550 != null) {
			float[] fs = new float[3];
			float f = (float) -(anInt5567 - i_91_ << 16);
			float f_95_ = (float) (anInt5555 - i_92_ << 15);
			float f_96_ = (float) -(anInt5558 - i_93_ << 16);
			float[] fs_97_ = new float[3];
			class180.method3181().method6903(fs_97_);
			f += fs_97_[0];
			f_95_ += fs_97_[1];
			f_96_ += fs_97_[2];
			class180.method3333(f, f_95_, f_96_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_98_ = (int) (fs[0] - (float) (anInt5566 / 2));
				int i_99_ = (int) (fs[1] - (float) (anInt5566 / 2));
				if (i_99_ < i_88_ && i_99_ + anInt5566 > 0 && i_98_ < i_87_ && i_98_ + anInt5566 > 0)
					aClass147_5550.method2419(i_98_, i_99_, anInt5566, anInt5566, 0, i_94_ << 24 | 0xffffff, 1);
			}
		}
	}

	boolean method8140(int i, int i_100_, int i_101_, int i_102_) {
		int i_103_;
		int i_104_;
		int i_105_;
		if (!aBool5559) {
			i_103_ = anInt5567 - i;
			i_104_ = anInt5555 - i_100_;
			i_105_ = anInt5558 - i_101_;
			anInt5564 = (int) Math.sqrt((double) (i_103_ * i_103_ + i_104_ * i_104_ + i_105_ * i_105_));
			if (anInt5564 == 0)
				anInt5564 = 1;
			i_103_ = (i_103_ << 8) / anInt5564;
			i_104_ = (i_104_ << 8) / anInt5564;
			i_105_ = (i_105_ << 8) / anInt5564;
		} else {
			anInt5564 = 1073741823;
			i_103_ = anInt5567;
			i_104_ = anInt5555;
			i_105_ = anInt5558;
		}
		int i_106_ = (int) (Math.sqrt((double) (i_103_ * i_103_ + i_104_ * i_104_ + i_105_ * i_105_)) * 256.0);
		if (i_106_ > 128) {
			i_103_ = (i_103_ << 16) / i_106_;
			i_104_ = (i_104_ << 16) / i_106_;
			i_105_ = (i_105_ << 16) / i_106_;
			anInt5566 = anInt5565 * i_102_ / (aBool5559 ? 1024 : anInt5564);
		} else
			anInt5566 = 0;
		if (anInt5566 < 8) {
			aClass147_5550 = null;
			return false;
		}
		int i_107_ = Class186.method3652(anInt5566, 2138639477);
		if (i_107_ > i_102_)
			i_107_ = Class203.method3783(i_102_, 1992577879);
		if (i_107_ > 512)
			i_107_ = 512;
		if (i_107_ != anInt5576)
			anInt5576 = i_107_;
		anInt5572 = (int) (Math.asin((double) ((float) i_104_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt5563 = (int) (Math.atan2((double) i_103_, (double) -i_105_) * 2607.5945876176133) & 0x3fff;
		aClass147_5550 = null;
		return true;
	}

	boolean method8141(int i, int i_108_, int i_109_, int i_110_) {
		int i_111_;
		int i_112_;
		int i_113_;
		if (!aBool5559) {
			i_111_ = anInt5567 - i;
			i_112_ = anInt5555 - i_108_;
			i_113_ = anInt5558 - i_109_;
			anInt5564 = (int) Math.sqrt((double) (i_111_ * i_111_ + i_112_ * i_112_ + i_113_ * i_113_));
			if (anInt5564 == 0)
				anInt5564 = 1;
			i_111_ = (i_111_ << 8) / anInt5564;
			i_112_ = (i_112_ << 8) / anInt5564;
			i_113_ = (i_113_ << 8) / anInt5564;
		} else {
			anInt5564 = 1073741823;
			i_111_ = anInt5567;
			i_112_ = anInt5555;
			i_113_ = anInt5558;
		}
		int i_114_ = (int) (Math.sqrt((double) (i_111_ * i_111_ + i_112_ * i_112_ + i_113_ * i_113_)) * 256.0);
		if (i_114_ > 128) {
			i_111_ = (i_111_ << 16) / i_114_;
			i_112_ = (i_112_ << 16) / i_114_;
			i_113_ = (i_113_ << 16) / i_114_;
			anInt5566 = anInt5565 * i_110_ / (aBool5559 ? 1024 : anInt5564);
		} else
			anInt5566 = 0;
		if (anInt5566 < 8) {
			aClass147_5550 = null;
			return false;
		}
		int i_115_ = Class186.method3652(anInt5566, 1517103844);
		if (i_115_ > i_110_)
			i_115_ = Class203.method3783(i_110_, 2140824152);
		if (i_115_ > 512)
			i_115_ = 512;
		if (i_115_ != anInt5576)
			anInt5576 = i_115_;
		anInt5572 = (int) (Math.asin((double) ((float) i_112_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt5563 = (int) (Math.atan2((double) i_111_, (double) -i_113_) * 2607.5945876176133) & 0x3fff;
		aClass147_5550 = null;
		return true;
	}

	boolean method8142(Class180 class180, Class496 class496_116_) {
		return aClass147_5550 != null || method8131(class180, class496_116_);
	}

	public Class496(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, boolean bool, int i_123_, int i_124_, int i_125_) {
		anInt5567 = i_118_;
		anInt5555 = i_119_;
		anInt5558 = i_120_;
		aBool5559 = bool;
		anInt5560 = i_117_;
		anInt5561 = i_122_;
		anInt5565 = i_121_;
		anInt5554 = i;
		anInt5568 = i_123_;
		anInt5569 = i_124_;
		anInt5570 = i_125_;
	}

	void method8143(Class180 class180, int i, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_) {
		if (aClass147_5550 != null) {
			float[] fs = new float[3];
			float f = (float) -(anInt5567 - i_131_ << 16);
			float f_135_ = (float) (anInt5555 - i_132_ << 15);
			float f_136_ = (float) -(anInt5558 - i_133_ << 16);
			float[] fs_137_ = new float[3];
			class180.method3181().method6903(fs_137_);
			f += fs_137_[0];
			f_135_ += fs_137_[1];
			f_136_ += fs_137_[2];
			class180.method3333(f, f_135_, f_136_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_138_ = (int) (fs[0] - (float) (anInt5566 / 2));
				int i_139_ = (int) (fs[1] - (float) (anInt5566 / 2));
				if (i_139_ < i_128_ && i_139_ + anInt5566 > 0 && i_138_ < i_127_ && i_138_ + anInt5566 > 0)
					aClass147_5550.method2419(i_138_, i_139_, anInt5566, anInt5566, 0, i_134_ << 24 | 0xffffff, 1);
			}
		}
	}

	void method8144(Class180 class180, int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_) {
		if (aClass147_5550 != null) {
			float[] fs = new float[3];
			float f = (float) -(anInt5567 - i_145_ << 16);
			float f_149_ = (float) (anInt5555 - i_146_ << 15);
			float f_150_ = (float) -(anInt5558 - i_147_ << 16);
			float[] fs_151_ = new float[3];
			class180.method3181().method6903(fs_151_);
			f += fs_151_[0];
			f_149_ += fs_151_[1];
			f_150_ += fs_151_[2];
			class180.method3333(f, f_149_, f_150_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_152_ = (int) (fs[0] - (float) (anInt5566 / 2));
				int i_153_ = (int) (fs[1] - (float) (anInt5566 / 2));
				if (i_153_ < i_142_ && i_153_ + anInt5566 > 0 && i_152_ < i_141_ && i_152_ + anInt5566 > 0)
					aClass147_5550.method2419(i_152_, i_153_, anInt5566, anInt5566, 0, i_148_ << 24 | 0xffffff, 1);
			}
		}
	}

	boolean method8145(Class180 class180, Class496 class496_154_) {
		if (aClass147_5550 == null) {
			if (anInt5554 == 0) {
				if (Class511.anInterface24_6980.method134(Class609.aClass609_7996, anInt5560, Class591.aClass591_7796, 0.7F, anInt5576, anInt5576, false, -394493171)) {
					int[] is = (Class511.anInterface24_6980.method133(Class609.aClass609_7996, anInt5560, 0.7F, anInt5576, anInt5576, false, 1203417080));
					aClass147_5550 = class180.method3163(is, 0, anInt5576, anInt5576, anInt5576, 373316035);
				}
			} else if (anInt5554 == 2)
				method8126(class180, class496_154_);
			else if (anInt5554 == 1)
				method8129(class180, class496_154_);
		}
		return aClass147_5550 != null;
	}

	boolean method8146(int i, int i_155_, int i_156_, int i_157_) {
		int i_158_;
		int i_159_;
		int i_160_;
		if (!aBool5559) {
			i_158_ = anInt5567 - i;
			i_159_ = anInt5555 - i_155_;
			i_160_ = anInt5558 - i_156_;
			anInt5564 = (int) Math.sqrt((double) (i_158_ * i_158_ + i_159_ * i_159_ + i_160_ * i_160_));
			if (anInt5564 == 0)
				anInt5564 = 1;
			i_158_ = (i_158_ << 8) / anInt5564;
			i_159_ = (i_159_ << 8) / anInt5564;
			i_160_ = (i_160_ << 8) / anInt5564;
		} else {
			anInt5564 = 1073741823;
			i_158_ = anInt5567;
			i_159_ = anInt5555;
			i_160_ = anInt5558;
		}
		int i_161_ = (int) (Math.sqrt((double) (i_158_ * i_158_ + i_159_ * i_159_ + i_160_ * i_160_)) * 256.0);
		if (i_161_ > 128) {
			i_158_ = (i_158_ << 16) / i_161_;
			i_159_ = (i_159_ << 16) / i_161_;
			i_160_ = (i_160_ << 16) / i_161_;
			anInt5566 = anInt5565 * i_157_ / (aBool5559 ? 1024 : anInt5564);
		} else
			anInt5566 = 0;
		if (anInt5566 < 8) {
			aClass147_5550 = null;
			return false;
		}
		int i_162_ = Class186.method3652(anInt5566, -1204963221);
		if (i_162_ > i_157_)
			i_162_ = Class203.method3783(i_157_, 1120465971);
		if (i_162_ > 512)
			i_162_ = 512;
		if (i_162_ != anInt5576)
			anInt5576 = i_162_;
		anInt5572 = (int) (Math.asin((double) ((float) i_159_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt5563 = (int) (Math.atan2((double) i_158_, (double) -i_160_) * 2607.5945876176133) & 0x3fff;
		aClass147_5550 = null;
		return true;
	}

	void method8147(Class180 class180, Class496 class496_163_) {
		Class175 class175 = Class175.method2814(Class269.aClass459_3121, anInt5560, 0);
		if (class175 != null) {
			class180.method3135(anIntArray5580);
			class180.method3132(0, 0, anInt5576, anInt5576);
			class180.method3136(2, 0);
			class180.method3348(0, 0, anInt5576, anInt5576, 0, 0);
			int i = 0;
			int i_164_ = 0;
			int i_165_ = 256;
			if (class496_163_ != null) {
				if (class496_163_.aBool5559) {
					i = -class496_163_.anInt5567;
					i_164_ = -class496_163_.anInt5555;
					i_165_ = -class496_163_.anInt5558;
				} else {
					i = anInt5567 - class496_163_.anInt5567;
					i_164_ = anInt5555 - class496_163_.anInt5555;
					i_165_ = anInt5558 - class496_163_.anInt5558;
				}
			}
			if (anInt5572 != 0) {
				int i_166_ = -anInt5572 & 0x3fff;
				int i_167_ = Class428.anIntArray4825[i_166_];
				int i_168_ = Class428.anIntArray4819[i_166_];
				int i_169_ = i_164_ * i_168_ - i_165_ * i_167_ >> 14;
				i_165_ = i_164_ * i_167_ + i_165_ * i_168_ >> 14;
				i_164_ = i_169_;
			}
			if (anInt5563 != 0) {
				int i_170_ = -anInt5563 & 0x3fff;
				int i_171_ = Class428.anIntArray4825[i_170_];
				int i_172_ = Class428.anIntArray4819[i_170_];
				int i_173_ = i_165_ * i_171_ + i * i_172_ >> 14;
				i_165_ = i_165_ * i_172_ - i * i_171_ >> 14;
				i = i_173_;
			}
			class180.method3478(1.0F);
			class180.method3157(anInt5561, 1.0F, 1.0F, (float) i, (float) i_164_, (float) i_165_);
			class175.method2840(anInt5568 & 0x3fff, anInt5569 & 0x3fff, anInt5570 & 0x3fff);
			Class176 class176 = class180.method3376(class175, 2048, 0, 64, 768);
			int i_174_ = class176.method2939() - class176.method2894();
			int i_175_ = class176.method2897() - class176.method2896();
			int i_176_ = i_174_ > i_175_ ? i_174_ : i_175_;
			int i_177_ = 1024 * anInt5576 / i_176_;
			Class427 class427 = class180.method3364();
			Class427 class427_178_ = class180.method3171();
			class427_178_.method6753((float) (anInt5576 / 2), (float) (anInt5576 / 2), (float) i_177_, (float) i_177_, 50.0F, 50000.0F, (float) class180.method3285(1160387178).method2728(), (float) class180.method3285(1907797583).method2729(), 1024.0F);
			class180.method3183(class427_178_);
			Class432 class432 = new Class432();
			class180.method3180(class432);
			Class432 class432_179_ = class180.method3172();
			class432_179_.method6894(0.0F, 0.0F, (float) (50 - class176.method2898()));
			class176.method2889(class432_179_, null, 1);
			aClass147_5550 = class180.method3226(0, 0, anInt5576, anInt5576, true);
			aClass147_5550.method2486(0, 0, 3);
			class180.method3183(class427);
			class180.method3132(anIntArray5580[0], anIntArray5580[1], anIntArray5580[2], anIntArray5580[3]);
		}
	}

	boolean method8148(Class180 class180, Class496 class496_180_) {
		if (aClass147_5550 == null) {
			if (anInt5554 == 0) {
				if (Class511.anInterface24_6980.method134(Class609.aClass609_7996, anInt5560, Class591.aClass591_7796, 0.7F, anInt5576, anInt5576, false, -371504121)) {
					int[] is = (Class511.anInterface24_6980.method133(Class609.aClass609_7996, anInt5560, 0.7F, anInt5576, anInt5576, false, -682342115));
					aClass147_5550 = class180.method3163(is, 0, anInt5576, anInt5576, anInt5576, 214959911);
				}
			} else if (anInt5554 == 2)
				method8126(class180, class496_180_);
			else if (anInt5554 == 1)
				method8129(class180, class496_180_);
		}
		return aClass147_5550 != null;
	}

	static void method8149(Class180 class180) {
		if (aClass176_5556 == null) {
			Class175 class175 = new Class175(580, 1104, 1);
			class175.method2806((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class175.method2849(0, 128, 0);
			class175.method2849(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_181_ = i * 8192 / 24;
				int i_182_ = Class428.anIntArray4825[i_181_];
				int i_183_ = Class428.anIntArray4819[i_181_];
				for (int i_184_ = 1; i_184_ < 24; i_184_++) {
					int i_185_ = i_184_ * 8192 / 24;
					int i_186_ = Class428.anIntArray4819[i_185_] >> 7;
					int i_187_ = Class428.anIntArray4825[i_185_] * i_182_ >> 21;
					int i_188_ = Class428.anIntArray4825[i_185_] * i_183_ >> 21;
					class175.method2849(i_188_, i_186_, -i_187_);
				}
				if (i > 0) {
					int i_189_ = i * 23 + 2;
					int i_190_ = i_189_ - 23;
					class175.method2804(0, i_190_, i_189_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_191_ = 1; i_191_ < 23; i_191_++) {
						int i_192_ = i_190_ + 1;
						int i_193_ = i_189_ + 1;
						class175.method2804(i_190_, i_192_, i_189_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class175.method2804(i_192_, i_193_, i_189_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_190_ = i_192_;
						i_189_ = i_193_;
					}
					class175.method2804(i_189_, i_190_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class175.anInt1912 = class175.anInt1906;
			class175.anIntArray1914 = null;
			class175.anIntArray1921 = null;
			class175.aByteArray1924 = null;
			aClass176_5556 = class180.method3376(class175, 51200, 33, 64, 768);
		}
	}

	static void method8150(Class180 class180) {
		if (aClass176_5556 == null) {
			Class175 class175 = new Class175(580, 1104, 1);
			class175.method2806((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class175.method2849(0, 128, 0);
			class175.method2849(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_194_ = i * 8192 / 24;
				int i_195_ = Class428.anIntArray4825[i_194_];
				int i_196_ = Class428.anIntArray4819[i_194_];
				for (int i_197_ = 1; i_197_ < 24; i_197_++) {
					int i_198_ = i_197_ * 8192 / 24;
					int i_199_ = Class428.anIntArray4819[i_198_] >> 7;
					int i_200_ = Class428.anIntArray4825[i_198_] * i_195_ >> 21;
					int i_201_ = Class428.anIntArray4825[i_198_] * i_196_ >> 21;
					class175.method2849(i_201_, i_199_, -i_200_);
				}
				if (i > 0) {
					int i_202_ = i * 23 + 2;
					int i_203_ = i_202_ - 23;
					class175.method2804(0, i_203_, i_202_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_204_ = 1; i_204_ < 23; i_204_++) {
						int i_205_ = i_203_ + 1;
						int i_206_ = i_202_ + 1;
						class175.method2804(i_203_, i_205_, i_202_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class175.method2804(i_205_, i_206_, i_202_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_203_ = i_205_;
						i_202_ = i_206_;
					}
					class175.method2804(i_202_, i_203_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class175.anInt1912 = class175.anInt1906;
			class175.anIntArray1914 = null;
			class175.anIntArray1921 = null;
			class175.aByteArray1924 = null;
			aClass176_5556 = class180.method3376(class175, 51200, 33, 64, 768);
		}
	}

	static void method8151(Class180 class180) {
		if (aClass176_5556 == null) {
			Class175 class175 = new Class175(580, 1104, 1);
			class175.method2806((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class175.method2849(0, 128, 0);
			class175.method2849(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_207_ = i * 8192 / 24;
				int i_208_ = Class428.anIntArray4825[i_207_];
				int i_209_ = Class428.anIntArray4819[i_207_];
				for (int i_210_ = 1; i_210_ < 24; i_210_++) {
					int i_211_ = i_210_ * 8192 / 24;
					int i_212_ = Class428.anIntArray4819[i_211_] >> 7;
					int i_213_ = Class428.anIntArray4825[i_211_] * i_208_ >> 21;
					int i_214_ = Class428.anIntArray4825[i_211_] * i_209_ >> 21;
					class175.method2849(i_214_, i_212_, -i_213_);
				}
				if (i > 0) {
					int i_215_ = i * 23 + 2;
					int i_216_ = i_215_ - 23;
					class175.method2804(0, i_216_, i_215_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_217_ = 1; i_217_ < 23; i_217_++) {
						int i_218_ = i_216_ + 1;
						int i_219_ = i_215_ + 1;
						class175.method2804(i_216_, i_218_, i_215_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class175.method2804(i_218_, i_219_, i_215_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_216_ = i_218_;
						i_215_ = i_219_;
					}
					class175.method2804(i_215_, i_216_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class175.anInt1912 = class175.anInt1906;
			class175.anIntArray1914 = null;
			class175.anIntArray1921 = null;
			class175.aByteArray1924 = null;
			aClass176_5556 = class180.method3376(class175, 51200, 33, 64, 768);
		}
	}

	boolean method8152(Class180 class180, Class496 class496_220_) {
		return aClass147_5550 != null || method8131(class180, class496_220_);
	}

	static void method8153(Class180 class180) {
		if (aClass147_5579 == null) {
			int[] is = new int[16384];
			int[] is_221_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_222_ = 64 - i;
				i_222_ *= i_222_;
				int i_223_ = 128 - i - 1;
				int i_224_ = i * 128;
				int i_225_ = i_223_ * 128;
				for (int i_226_ = 0; i_226_ < 64; i_226_++) {
					int i_227_ = 64 - i_226_;
					i_227_ *= i_227_;
					int i_228_ = 128 - i_226_ - 1;
					int i_229_ = 256 - (i_227_ + i_222_ << 8) / 4096;
					i_229_ = i_229_ * 3072 / 1536;
					if (i_229_ < 0)
						i_229_ = 0;
					else if (i_229_ > 255)
						i_229_ = 255;
					int i_230_ = i_229_ / 2;
					is_221_[i_224_ + i_226_] = is_221_[i_224_ + i_228_] = is_221_[i_225_ + i_226_] = is_221_[i_225_ + i_228_] = ~0xffffff | i_229_ << 16;
					is[i_224_ + i_226_] = is[i_224_ + i_228_] = is[i_225_ + i_226_] = is[i_225_ + i_228_] = 127 - i_230_ << 24 | 0xffffff;
				}
			}
			aClass147_5579 = class180.method3163(is_221_, 0, 128, 128, 128, -1467839410);
			aClass147_5551 = class180.method3163(is, 0, 128, 128, 128, -804208505);
		}
	}
}

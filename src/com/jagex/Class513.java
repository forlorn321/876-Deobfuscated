/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class513 {
	boolean aBool6937;
	static final int anInt6938 = 0;
	static final int anInt6939 = 1;
	int anInt6940;
	int anInt6941;
	int anInt6942;
	int anInt6943;
	static final int anInt6944 = 13;
	int anInt6945;
	static final int anInt6946 = 24;
	int anInt6947;
	static NativeSprite aClass143_6948;
	static final int anInt6949 = 2;
	int anInt6950;
	int anInt6951;
	int anInt6952;
	int anInt6953;
	NativeSprite aClass143_6954;
	int anInt6955;
	int anInt6956;
	int anInt6957;
	static final int anInt6958 = 24;
	static final int anInt6959 = 512;
	static final int anInt6960 = 192;
	static NativeSprite aClass143_6961;
	int anInt6962;
	static final int anInt6963 = 16;
	static MeshRasterizer aClass177_6964;
	int anInt6965;
	static final int anInt6966 = 128;
	static int[] anIntArray6967 = new int[4];

	void method6219(GraphicalRenderer class167, Class513 class513_0_) {
		method6225(class167);
		method6229(class167);
		class167.method2054(anIntArray6967);
		class167.method2369(0, 0, anInt6952, anInt6952);
		class167.method2000(2, 0);
		class167.method2063(0, 0, anInt6952, anInt6952, ~0xffffff | anInt6965, 0);
		int i = 0;
		int i_1_ = 0;
		int i_2_ = 256;
		if (class513_0_ != null) {
			if (class513_0_.aBool6937) {
				i = -class513_0_.anInt6943;
				i_1_ = -class513_0_.anInt6942;
				i_2_ = -class513_0_.anInt6945;
			} else {
				i = class513_0_.anInt6943 - anInt6943;
				i_1_ = class513_0_.anInt6942 - anInt6942;
				i_2_ = class513_0_.anInt6945 - anInt6945;
			}
		}
		if (anInt6962 != 0) {
			int i_3_ = Class447.anIntArray4906[anInt6962];
			int i_4_ = Class447.anIntArray4921[anInt6962];
			int i_5_ = i_1_ * i_4_ - i_2_ * i_3_ >> 14;
			i_2_ = i_1_ * i_3_ + i_2_ * i_4_ >> 14;
			i_1_ = i_5_;
		}
		if (anInt6950 != 0) {
			int i_6_ = Class447.anIntArray4906[anInt6950];
			int i_7_ = Class447.anIntArray4921[anInt6950];
			int i_8_ = i_2_ * i_6_ + i * i_7_ >> 14;
			i_2_ = i_2_ * i_7_ - i * i_6_ >> 14;
			i = i_8_;
		}
		MeshRasterizer class177 = aClass177_6964.method2623((byte) 0, 51200, true);
		class177.method2509((short) 0, (short) anInt6947);
		class167.method2006(1.0F);
		class167.method2105(16777215, 1.0F, 1.0F, (float) i, (float) i_1_, (float) i_2_);
		int i_9_ = (1024 * anInt6952 / (class177.method2483() - class177.method2563()));
		if (anInt6965 != 0)
			i_9_ = i_9_ * 13 / 16;
		Class443 class443 = class167.method2103();
		Class443 class443_10_ = class167.method2391();
		class443_10_.method5388((float) (anInt6952 / 2), (float) (anInt6952 / 2), (float) i_9_, (float) i_9_, 50.0F, 50000.0F, (float) class167.method2278((byte) 73).method2725(), (float) class167.method2278((byte) -7).method2726(), 1024.0F);
		class167.method2390(class443_10_);
		class167.method2099(new Class433());
		Class433 class433 = new Class433();
		class433.method5203(0.0F, 0.0F, (float) (50 - class177.method2498()));
		class177.method2490(class433, null, 1);
		int i_11_ = anInt6952 * 13 / 16;
		int i_12_ = (anInt6952 - i_11_) / 2;
		aClass143_6961.method1731(i_12_, i_12_, i_11_, i_11_, 0, ~0xffffff | anInt6965, 1);
		aClass143_6954 = class167.method2205(0, 0, anInt6952, anInt6952, true);
		class167.method2000(2, 0);
		class167.method2063(0, 0, anInt6952, anInt6952, 0, 0);
		aClass143_6948.method1731(0, 0, anInt6952, anInt6952, 1, 0, 0);
		aClass143_6954.method1727(0, 0, 3);
		class167.method2390(class443);
		class167.method2369(anIntArray6967[0], anIntArray6967[1], anIntArray6967[2], anIntArray6967[3]);
	}

	static void method6220() {
		aClass177_6964 = null;
		aClass143_6948 = null;
	}

	boolean method6221(int i, int i_13_, int i_14_, int i_15_) {
		int i_16_;
		int i_17_;
		int i_18_;
		if (!aBool6937) {
			i_16_ = anInt6943 - i;
			i_17_ = anInt6942 - i_13_;
			i_18_ = anInt6945 - i_14_;
			anInt6951 = (int) Math.sqrt((double) (i_16_ * i_16_ + i_17_ * i_17_ + i_18_ * i_18_));
			if (anInt6951 == 0)
				anInt6951 = 1;
			i_16_ = (i_16_ << 8) / anInt6951;
			i_17_ = (i_17_ << 8) / anInt6951;
			i_18_ = (i_18_ << 8) / anInt6951;
		} else {
			anInt6951 = 1073741823;
			i_16_ = anInt6943;
			i_17_ = anInt6942;
			i_18_ = anInt6945;
		}
		int i_19_ = (int) (Math.sqrt((double) (i_16_ * i_16_ + i_17_ * i_17_ + i_18_ * i_18_)) * 256.0);
		if (i_19_ > 128) {
			i_16_ = (i_16_ << 16) / i_19_;
			i_17_ = (i_17_ << 16) / i_19_;
			i_18_ = (i_18_ << 16) / i_19_;
			anInt6953 = anInt6940 * i_15_ / (aBool6937 ? 1024 : anInt6951);
		} else
			anInt6953 = 0;
		if (anInt6953 < 8) {
			aClass143_6954 = null;
			return false;
		}
		int i_20_ = Class528.method6434(anInt6953, -1072769875);
		if (i_20_ > i_15_)
			i_20_ = Class72.method1124(i_15_, 1051390672);
		if (i_20_ > 512)
			i_20_ = 512;
		if (i_20_ != anInt6952)
			anInt6952 = i_20_;
		anInt6962 = (int) (Math.asin((double) ((float) i_17_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt6950 = (int) (Math.atan2((double) i_16_, (double) -i_18_) * 2607.5945876176133) & 0x3fff;
		aClass143_6954 = null;
		return true;
	}

	static void method6222(GraphicalRenderer class167) {
		if (aClass143_6948 == null) {
			int[] is = new int[16384];
			int[] is_21_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_22_ = 64 - i;
				i_22_ *= i_22_;
				int i_23_ = 128 - i - 1;
				int i_24_ = i * 128;
				int i_25_ = i_23_ * 128;
				for (int i_26_ = 0; i_26_ < 64; i_26_++) {
					int i_27_ = 64 - i_26_;
					i_27_ *= i_27_;
					int i_28_ = 128 - i_26_ - 1;
					int i_29_ = 256 - (i_27_ + i_22_ << 8) / 4096;
					i_29_ = i_29_ * 3072 / 1536;
					if (i_29_ < 0)
						i_29_ = 0;
					else if (i_29_ > 255)
						i_29_ = 255;
					int i_30_ = i_29_ / 2;
					is_21_[i_24_ + i_26_] = is_21_[i_24_ + i_28_] = is_21_[i_25_ + i_26_] = is_21_[i_25_ + i_28_] = ~0xffffff | i_29_ << 16;
					is[i_24_ + i_26_] = is[i_24_ + i_28_] = is[i_25_ + i_26_] = is[i_25_ + i_28_] = 127 - i_30_ << 24 | 0xffffff;
				}
			}
			aClass143_6948 = class167.createNativeSprite(is_21_, 0, 128, 128, 128, (byte) -39);
			aClass143_6961 = class167.createNativeSprite(is, 0, 128, 128, 128, (byte) 0);
		}
	}

	void method6223(GraphicalRenderer class167, int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_) {
		if (aClass143_6954 != null) {
			float[] fs = new float[3];
			float f = (float) -(anInt6943 - i_36_ << 16);
			float f_40_ = (float) (anInt6942 - i_37_ << 15);
			float f_41_ = (float) -(anInt6945 - i_38_ << 16);
			float[] fs_42_ = new float[3];
			class167.method2100().method5230(fs_42_);
			f += fs_42_[0];
			f_40_ += fs_42_[1];
			f_41_ += fs_42_[2];
			class167.method2017(f, f_40_, f_41_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_43_ = (int) (fs[0] - (float) (anInt6953 / 2));
				int i_44_ = (int) (fs[1] - (float) (anInt6953 / 2));
				if (i_44_ < i_33_ && i_44_ + anInt6953 > 0 && i_43_ < i_32_ && i_43_ + anInt6953 > 0)
					aClass143_6954.method1731(i_43_, i_44_, anInt6953, anInt6953, 0, i_39_ << 24 | 0xffffff, 1);
			}
		}
	}

	void method6224(GraphicalRenderer class167, Class513 class513_45_) {
		RSMesh class180 = RSMesh.decodeMesh(Class269.aClass461_2879, anInt6947, 0);
		if (class180 != null) {
			class167.method2054(anIntArray6967);
			class167.method2369(0, 0, anInt6952, anInt6952);
			class167.method2000(2, 0);
			class167.method2063(0, 0, anInt6952, anInt6952, 0, 0);
			int i = 0;
			int i_46_ = 0;
			int i_47_ = 256;
			if (class513_45_ != null) {
				if (class513_45_.aBool6937) {
					i = -class513_45_.anInt6943;
					i_46_ = -class513_45_.anInt6942;
					i_47_ = -class513_45_.anInt6945;
				} else {
					i = anInt6943 - class513_45_.anInt6943;
					i_46_ = anInt6942 - class513_45_.anInt6942;
					i_47_ = anInt6945 - class513_45_.anInt6945;
				}
			}
			if (anInt6962 != 0) {
				int i_48_ = -anInt6962 & 0x3fff;
				int i_49_ = Class447.anIntArray4906[i_48_];
				int i_50_ = Class447.anIntArray4921[i_48_];
				int i_51_ = i_46_ * i_50_ - i_47_ * i_49_ >> 14;
				i_47_ = i_46_ * i_49_ + i_47_ * i_50_ >> 14;
				i_46_ = i_51_;
			}
			if (anInt6950 != 0) {
				int i_52_ = -anInt6950 & 0x3fff;
				int i_53_ = Class447.anIntArray4906[i_52_];
				int i_54_ = Class447.anIntArray4921[i_52_];
				int i_55_ = i_47_ * i_53_ + i * i_54_ >> 14;
				i_47_ = i_47_ * i_54_ - i * i_53_ >> 14;
				i = i_55_;
			}
			class167.method2006(1.0F);
			class167.method2105(anInt6965, 1.0F, 1.0F, (float) i, (float) i_46_, (float) i_47_);
			class180.method2711(anInt6955 & 0x3fff, anInt6956 & 0x3fff, anInt6957 & 0x3fff);
			MeshRasterizer class177 = class167.createMeshRasterizer(class180, 2048, 0, 64, 768);
			int i_56_ = class177.method2483() - class177.method2563();
			int i_57_ = class177.method2497() - class177.method2562();
			int i_58_ = i_56_ > i_57_ ? i_56_ : i_57_;
			int i_59_ = 1024 * anInt6952 / i_58_;
			Class443 class443 = class167.method2103();
			Class443 class443_60_ = class167.method2391();
			class443_60_.method5388((float) (anInt6952 / 2), (float) (anInt6952 / 2), (float) i_59_, (float) i_59_, 50.0F, 50000.0F, (float) class167.method2278((byte) 34).method2725(), (float) class167.method2278((byte) 13).method2726(), 1024.0F);
			class167.method2390(class443_60_);
			Class433 class433 = new Class433();
			class167.method2099(class433);
			Class433 class433_61_ = class167.method2091();
			class433_61_.method5203(0.0F, 0.0F, (float) (50 - class177.method2498()));
			class177.method2490(class433_61_, null, 1);
			aClass143_6954 = class167.method2205(0, 0, anInt6952, anInt6952, true);
			aClass143_6954.method1727(0, 0, 3);
			class167.method2390(class443);
			class167.method2369(anIntArray6967[0], anIntArray6967[1], anIntArray6967[2], anIntArray6967[3]);
		}
	}

	static void method6225(GraphicalRenderer class167) {
		if (aClass177_6964 == null) {
			RSMesh class180 = new RSMesh(580, 1104, 1);
			class180.method2712((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class180.method2697(0, 128, 0);
			class180.method2697(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_62_ = i * 8192 / 24;
				int i_63_ = Class447.anIntArray4906[i_62_];
				int i_64_ = Class447.anIntArray4921[i_62_];
				for (int i_65_ = 1; i_65_ < 24; i_65_++) {
					int i_66_ = i_65_ * 8192 / 24;
					int i_67_ = Class447.anIntArray4921[i_66_] >> 7;
					int i_68_ = Class447.anIntArray4906[i_66_] * i_63_ >> 21;
					int i_69_ = Class447.anIntArray4906[i_66_] * i_64_ >> 21;
					class180.method2697(i_69_, i_67_, -i_68_);
				}
				if (i > 0) {
					int i_70_ = i * 23 + 2;
					int i_71_ = i_70_ - 23;
					class180.method2706(0, i_71_, i_70_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_72_ = 1; i_72_ < 23; i_72_++) {
						int i_73_ = i_71_ + 1;
						int i_74_ = i_70_ + 1;
						class180.method2706(i_71_, i_73_, i_70_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class180.method2706(i_73_, i_74_, i_70_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_71_ = i_73_;
						i_70_ = i_74_;
					}
					class180.method2706(i_70_, i_71_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class180.anInt1951 = class180.anInt1947;
			class180.anIntArray1974 = null;
			class180.anIntArray1953 = null;
			class180.aByteArray1969 = null;
			aClass177_6964 = class167.createMeshRasterizer(class180, 51200, 33, 64, 768);
		}
	}

	boolean method6226(GraphicalRenderer class167, Class513 class513_75_) {
		if (aClass143_6954 == null) {
			if (anInt6941 == 0) {
				if (Class218.anInterface24_2306.method137(Class599.aClass599_7843, anInt6947, Class594.aClass594_7815, 0.7F, anInt6952, anInt6952, false, 2097168017)) {
					int[] is = (Class218.anInterface24_2306.method134(Class599.aClass599_7843, anInt6947, 0.7F, anInt6952, anInt6952, false, 215442236));
					aClass143_6954 = class167.createNativeSprite(is, 0, anInt6952, anInt6952, anInt6952, (byte) -117);
				}
			} else if (anInt6941 == 2)
				method6224(class167, class513_75_);
			else if (anInt6941 == 1)
				method6219(class167, class513_75_);
		}
		return aClass143_6954 != null;
	}

	boolean method6227(int i, int i_76_, int i_77_, int i_78_) {
		int i_79_;
		int i_80_;
		int i_81_;
		if (!aBool6937) {
			i_79_ = anInt6943 - i;
			i_80_ = anInt6942 - i_76_;
			i_81_ = anInt6945 - i_77_;
			anInt6951 = (int) Math.sqrt((double) (i_79_ * i_79_ + i_80_ * i_80_ + i_81_ * i_81_));
			if (anInt6951 == 0)
				anInt6951 = 1;
			i_79_ = (i_79_ << 8) / anInt6951;
			i_80_ = (i_80_ << 8) / anInt6951;
			i_81_ = (i_81_ << 8) / anInt6951;
		} else {
			anInt6951 = 1073741823;
			i_79_ = anInt6943;
			i_80_ = anInt6942;
			i_81_ = anInt6945;
		}
		int i_82_ = (int) (Math.sqrt((double) (i_79_ * i_79_ + i_80_ * i_80_ + i_81_ * i_81_)) * 256.0);
		if (i_82_ > 128) {
			i_79_ = (i_79_ << 16) / i_82_;
			i_80_ = (i_80_ << 16) / i_82_;
			i_81_ = (i_81_ << 16) / i_82_;
			anInt6953 = anInt6940 * i_78_ / (aBool6937 ? 1024 : anInt6951);
		} else
			anInt6953 = 0;
		if (anInt6953 < 8) {
			aClass143_6954 = null;
			return false;
		}
		int i_83_ = Class528.method6434(anInt6953, -1926466067);
		if (i_83_ > i_78_)
			i_83_ = Class72.method1124(i_78_, 286755120);
		if (i_83_ > 512)
			i_83_ = 512;
		if (i_83_ != anInt6952)
			anInt6952 = i_83_;
		anInt6962 = (int) (Math.asin((double) ((float) i_80_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt6950 = (int) (Math.atan2((double) i_79_, (double) -i_81_) * 2607.5945876176133) & 0x3fff;
		aClass143_6954 = null;
		return true;
	}

	boolean method6228(int i, int i_84_, int i_85_, int i_86_) {
		int i_87_;
		int i_88_;
		int i_89_;
		if (!aBool6937) {
			i_87_ = anInt6943 - i;
			i_88_ = anInt6942 - i_84_;
			i_89_ = anInt6945 - i_85_;
			anInt6951 = (int) Math.sqrt((double) (i_87_ * i_87_ + i_88_ * i_88_ + i_89_ * i_89_));
			if (anInt6951 == 0)
				anInt6951 = 1;
			i_87_ = (i_87_ << 8) / anInt6951;
			i_88_ = (i_88_ << 8) / anInt6951;
			i_89_ = (i_89_ << 8) / anInt6951;
		} else {
			anInt6951 = 1073741823;
			i_87_ = anInt6943;
			i_88_ = anInt6942;
			i_89_ = anInt6945;
		}
		int i_90_ = (int) (Math.sqrt((double) (i_87_ * i_87_ + i_88_ * i_88_ + i_89_ * i_89_)) * 256.0);
		if (i_90_ > 128) {
			i_87_ = (i_87_ << 16) / i_90_;
			i_88_ = (i_88_ << 16) / i_90_;
			i_89_ = (i_89_ << 16) / i_90_;
			anInt6953 = anInt6940 * i_86_ / (aBool6937 ? 1024 : anInt6951);
		} else
			anInt6953 = 0;
		if (anInt6953 < 8) {
			aClass143_6954 = null;
			return false;
		}
		int i_91_ = Class528.method6434(anInt6953, -1463982467);
		if (i_91_ > i_86_)
			i_91_ = Class72.method1124(i_86_, 1163229424);
		if (i_91_ > 512)
			i_91_ = 512;
		if (i_91_ != anInt6952)
			anInt6952 = i_91_;
		anInt6962 = (int) (Math.asin((double) ((float) i_88_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt6950 = (int) (Math.atan2((double) i_87_, (double) -i_89_) * 2607.5945876176133) & 0x3fff;
		aClass143_6954 = null;
		return true;
	}

	public Class513(int i, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, boolean bool, int i_98_, int i_99_, int i_100_) {
		anInt6943 = i_93_;
		anInt6942 = i_94_;
		anInt6945 = i_95_;
		aBool6937 = bool;
		anInt6947 = i_92_;
		anInt6965 = i_97_;
		anInt6940 = i_96_;
		anInt6941 = i;
		anInt6955 = i_98_;
		anInt6956 = i_99_;
		anInt6957 = i_100_;
	}

	static void method6229(GraphicalRenderer class167) {
		if (aClass143_6948 == null) {
			int[] is = new int[16384];
			int[] is_101_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_102_ = 64 - i;
				i_102_ *= i_102_;
				int i_103_ = 128 - i - 1;
				int i_104_ = i * 128;
				int i_105_ = i_103_ * 128;
				for (int i_106_ = 0; i_106_ < 64; i_106_++) {
					int i_107_ = 64 - i_106_;
					i_107_ *= i_107_;
					int i_108_ = 128 - i_106_ - 1;
					int i_109_ = 256 - (i_107_ + i_102_ << 8) / 4096;
					i_109_ = i_109_ * 3072 / 1536;
					if (i_109_ < 0)
						i_109_ = 0;
					else if (i_109_ > 255)
						i_109_ = 255;
					int i_110_ = i_109_ / 2;
					is_101_[i_104_ + i_106_] = is_101_[i_104_ + i_108_] = is_101_[i_105_ + i_106_] = is_101_[i_105_ + i_108_] = ~0xffffff | i_109_ << 16;
					is[i_104_ + i_106_] = is[i_104_ + i_108_] = is[i_105_ + i_106_] = is[i_105_ + i_108_] = 127 - i_110_ << 24 | 0xffffff;
				}
			}
			aClass143_6948 = class167.createNativeSprite(is_101_, 0, 128, 128, 128, (byte) -36);
			aClass143_6961 = class167.createNativeSprite(is, 0, 128, 128, 128, (byte) -48);
		}
	}

	static void method6230() {
		aClass177_6964 = null;
		aClass143_6948 = null;
	}

	static void method6231(GraphicalRenderer class167) {
		if (aClass143_6948 == null) {
			int[] is = new int[16384];
			int[] is_111_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_112_ = 64 - i;
				i_112_ *= i_112_;
				int i_113_ = 128 - i - 1;
				int i_114_ = i * 128;
				int i_115_ = i_113_ * 128;
				for (int i_116_ = 0; i_116_ < 64; i_116_++) {
					int i_117_ = 64 - i_116_;
					i_117_ *= i_117_;
					int i_118_ = 128 - i_116_ - 1;
					int i_119_ = 256 - (i_117_ + i_112_ << 8) / 4096;
					i_119_ = i_119_ * 3072 / 1536;
					if (i_119_ < 0)
						i_119_ = 0;
					else if (i_119_ > 255)
						i_119_ = 255;
					int i_120_ = i_119_ / 2;
					is_111_[i_114_ + i_116_] = is_111_[i_114_ + i_118_] = is_111_[i_115_ + i_116_] = is_111_[i_115_ + i_118_] = ~0xffffff | i_119_ << 16;
					is[i_114_ + i_116_] = is[i_114_ + i_118_] = is[i_115_ + i_116_] = is[i_115_ + i_118_] = 127 - i_120_ << 24 | 0xffffff;
				}
			}
			aClass143_6948 = class167.createNativeSprite(is_111_, 0, 128, 128, 128, (byte) -128);
			aClass143_6961 = class167.createNativeSprite(is, 0, 128, 128, 128, (byte) -119);
		}
	}

	boolean method6232(GraphicalRenderer class167, Class513 class513_121_) {
		return aClass143_6954 != null || method6226(class167, class513_121_);
	}

	static void method6233(GraphicalRenderer class167) {
		if (aClass143_6948 == null) {
			int[] is = new int[16384];
			int[] is_122_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_123_ = 64 - i;
				i_123_ *= i_123_;
				int i_124_ = 128 - i - 1;
				int i_125_ = i * 128;
				int i_126_ = i_124_ * 128;
				for (int i_127_ = 0; i_127_ < 64; i_127_++) {
					int i_128_ = 64 - i_127_;
					i_128_ *= i_128_;
					int i_129_ = 128 - i_127_ - 1;
					int i_130_ = 256 - (i_128_ + i_123_ << 8) / 4096;
					i_130_ = i_130_ * 3072 / 1536;
					if (i_130_ < 0)
						i_130_ = 0;
					else if (i_130_ > 255)
						i_130_ = 255;
					int i_131_ = i_130_ / 2;
					is_122_[i_125_ + i_127_] = is_122_[i_125_ + i_129_] = is_122_[i_126_ + i_127_] = is_122_[i_126_ + i_129_] = ~0xffffff | i_130_ << 16;
					is[i_125_ + i_127_] = is[i_125_ + i_129_] = is[i_126_ + i_127_] = is[i_126_ + i_129_] = 127 - i_131_ << 24 | 0xffffff;
				}
			}
			aClass143_6948 = class167.createNativeSprite(is_122_, 0, 128, 128, 128, (byte) -25);
			aClass143_6961 = class167.createNativeSprite(is, 0, 128, 128, 128, (byte) -85);
		}
	}

	static void method6234(GraphicalRenderer class167) {
		if (aClass143_6948 == null) {
			int[] is = new int[16384];
			int[] is_132_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_133_ = 64 - i;
				i_133_ *= i_133_;
				int i_134_ = 128 - i - 1;
				int i_135_ = i * 128;
				int i_136_ = i_134_ * 128;
				for (int i_137_ = 0; i_137_ < 64; i_137_++) {
					int i_138_ = 64 - i_137_;
					i_138_ *= i_138_;
					int i_139_ = 128 - i_137_ - 1;
					int i_140_ = 256 - (i_138_ + i_133_ << 8) / 4096;
					i_140_ = i_140_ * 3072 / 1536;
					if (i_140_ < 0)
						i_140_ = 0;
					else if (i_140_ > 255)
						i_140_ = 255;
					int i_141_ = i_140_ / 2;
					is_132_[i_135_ + i_137_] = is_132_[i_135_ + i_139_] = is_132_[i_136_ + i_137_] = is_132_[i_136_ + i_139_] = ~0xffffff | i_140_ << 16;
					is[i_135_ + i_137_] = is[i_135_ + i_139_] = is[i_136_ + i_137_] = is[i_136_ + i_139_] = 127 - i_141_ << 24 | 0xffffff;
				}
			}
			aClass143_6948 = class167.createNativeSprite(is_132_, 0, 128, 128, 128, (byte) -40);
			aClass143_6961 = class167.createNativeSprite(is, 0, 128, 128, 128, (byte) -19);
		}
	}
}

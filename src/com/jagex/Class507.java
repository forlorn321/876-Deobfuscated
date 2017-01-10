/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class507 {
	int anInt6891;
	int anInt6892;
	int anInt6893;
	Class513 aClass513_6894;
	int anInt6895;
	Class513[] aClass513Array6896;
	int anInt6897;
	NativeSprite aClass143_6898;
	int anInt6899;
	int anInt6900 = 1325974445;
	int anInt6901;
	int anInt6902;
	Class513[] aClass513Array6903;
	int anInt6904;
	int anInt6905;
	static final int anInt6906 = 512;
	boolean aBool6907 = true;
	MeshRasterizer aClass177_6908;
	byte[] aByteArray6909;
	boolean aBool6910;
	Class569 aClass569_6911;
	Class507 aClass507_6912;
	int anInt6913;
	int anInt6914;
	static int anInt6915;

	public void method6147(int i, int i_0_, int i_1_) {
		if (aBool6910) {
			/* empty */
		}
		anInt6902 = 1172459901 * (-1263644181 * anInt6914 + i * (i_0_ - -1263644181 * anInt6914) / 255);
	}

	public void method6148() {
		aBool6910 = false;
		aClass507_6912 = null;
		anInt6902 = 0;
	}

	public Class507(int i, Class513[] class513s, int i_2_, int i_3_, int i_4_, int i_5_, Class569 class569, int i_6_) {
		anInt6899 = i_3_ * 1856142255;
		anInt6891 = 2021672107 * i_4_;
		anInt6895 = i_5_ * 213133575;
		anInt6892 = 570637057 * i;
		aClass513Array6903 = class513s;
		aClass569_6911 = class569;
		if (class513s != null) {
			aClass513Array6896 = new Class513[class513s.length];
			aClass513_6894 = i_2_ >= 0 ? class513s[i_2_] : null;
		} else {
			aClass513Array6896 = null;
			aClass513_6894 = null;
		}
		anInt6901 = 2065758183 * i_6_;
	}

	void method6149(GraphicalRenderer class167, int i, int i_7_, int i_8_, int i_9_, byte i_10_) {
		Class433 class433 = class167.method2100();
		Class433 class433_11_ = new Class433();
		class433_11_.method5203(0.0F, 0.0F, 0.0F);
		class433_11_.method5214(0.0F, -1.0F, 0.0F, Class447.method5400(-i_7_ & 0x3fff));
		class433_11_.method5214(-1.0F, 0.0F, 0.0F, Class447.method5400(-i & 0x3fff));
		class433_11_.method5214(0.0F, 0.0F, -1.0F, Class447.method5400(-i_8_ & 0x3fff));
		class167.method2099(class433_11_);
		Class433 class433_12_ = new Class433();
		if (i_9_ != -1860266857 * anInt6913) {
			aClass177_6908.method2508((byte) i_9_, aByteArray6909);
			anInt6913 = i_9_ * -336712921;
		}
		aClass177_6908.method2490(class433_12_, null, 0);
		class167.method2099(class433);
	}

	public Class507 method6150(byte i) {
		return aClass507_6912;
	}

	public boolean method6151(GraphicalRenderer class167, int i, int i_13_, int i_14_) {
		if (i != 2023647195 * anInt6900) {
			anInt6900 = -1325974445 * i;
			int i_15_ = Class72.method1124(i, 1254841045);
			if (i_15_ > 512)
				i_15_ = 512;
			if (i_15_ <= 0)
				i_15_ = 1;
			if (-1522661639 * anInt6893 != i_15_) {
				anInt6893 = i_15_ * -715007159;
				aClass143_6898 = null;
			}
			if (null != aClass513Array6903) {
				anInt6897 = 0;
				int[] is = new int[aClass513Array6903.length];
				for (int i_16_ = 0; i_16_ < aClass513Array6903.length; i_16_++) {
					Class513 class513 = aClass513Array6903[i_16_];
					if (class513.method6221(510507855 * anInt6899, anInt6891 * -1932945917, anInt6895 * -268110665, 2023647195 * anInt6900)) {
						is[anInt6897 * -643053789] = class513.anInt6951;
						aClass513Array6896[(anInt6897 += -1233674101) * -643053789 - 1] = class513;
					}
				}
				Class455.method5477(is, aClass513Array6896, 0, anInt6897 * -643053789 - 1, -1901226605);
			}
			aBool6907 = true;
		}
		boolean bool = false;
		if (aBool6907) {
			aBool6907 = false;
			for (int i_17_ = -643053789 * anInt6897 - 1; i_17_ >= 0; i_17_--) {
				boolean bool_18_ = aClass513Array6896[i_17_].method6232(class167, aClass513_6894);
				Class507 class507_19_ = this;
				class507_19_.aBool6907 = class507_19_.aBool6907 | !bool_18_;
				bool |= bool_18_;
			}
		}
		if (0 == i_13_ || !class167.method2014())
			aClass177_6908 = null;
		else if (aClass177_6908 == null && 1601448919 * anInt6901 >= 0)
			method6152(class167, (byte) 9);
		if (null != aClass507_6912 && aClass507_6912 != this) {
			aClass507_6912.method6166((byte) 65);
			bool |= aClass507_6912.method6151(class167, i, i_13_, -2077011761);
		}
		return bool;
	}

	void method6152(GraphicalRenderer class167, byte i) {
		try {
			boolean bool = Class269.aClass461_2879.method5560(anInt6901 * 1601448919, 324927502);
			if (bool) {
				class167.method2105(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				RSMesh class180 = RSMesh.decodeMesh(Class269.aClass461_2879, anInt6901 * 1601448919, 0);
				aClass177_6908 = class167.createMeshRasterizer(class180, 1099776, 0, 255, 1);
				byte[] is = aClass177_6908.method2506();
				if (null == is)
					aByteArray6909 = null;
				else {
					aByteArray6909 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray6909, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method6153(GraphicalRenderer class167, int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, short i_28_) {
		method6154(class167, i, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, 0, i_27_, true, false, -149796516);
	}

	public void method6154(GraphicalRenderer class167, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, boolean bool, boolean bool_37_, int i_38_) {
		int i_39_ = 0;
		if (aBool6910)
			i_39_ = anInt6902 * -1922994219;
		if (null != aClass507_6912) {
			Class507 class507_40_ = this;
			Class507 class507_41_ = aClass507_6912;
			if (class507_40_.hashCode() > class507_41_.hashCode()) {
				class507_40_ = aClass507_6912;
				class507_41_ = this;
				i_39_ = 255 - i_39_;
			}
			class507_40_.method6155(class167, i, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_, bool, bool_37_, i_39_, -2014215913);
			class507_41_.method6155(class167, i, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_, false, bool_37_, 255 - i_39_, -210225436);
		} else {
			if (-1 == 177587457 * anInt6892)
				class167.method2063(i_29_, i_30_, i_31_, i_32_, ~0xffffff | i_36_, 0);
			method6155(class167, i, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_, bool, bool_37_, i_39_, -19712789);
		}
	}

	void method6155(GraphicalRenderer class167, int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, boolean bool, boolean bool_50_, int i_51_, int i_52_) {
		int i_53_ = 255 - i_51_;
		class167.method2084();
		class167.method2085();
		if (null == aClass177_6908) {
			class167.method2000(2, 0);
			i_47_ = i + i_47_ & 0x3fff;
			if (-1 != anInt6892 * 177587457 && 0 != anInt6893 * -1522661639) {
				Class164 class164 = Class215.aClass174_2304.method2446(anInt6892 * 177587457, -984516463);
				if (null == aClass143_6898 && (Class218.anInterface24_2306.method137(Class599.aClass599_7843, -398625547 * class164.anInt1801, (Class595.aClass595_7819 == class164.aClass595_1805 ? Class594.aClass594_7815 : Class594.aClass594_7814), 0.7F, -1522661639 * anInt6893, -1522661639 * anInt6893, false, 2114398945))) {
					int[] is = (class164.aClass595_1805 == Class595.aClass595_7819 ? (Class218.anInterface24_2306.method134(Class599.aClass599_7843, class164.anInt1801 * -398625547, 0.7F, -1522661639 * anInt6893, anInt6893 * -1522661639, false, -745501863)) : (Class218.anInterface24_2306.method133(Class599.aClass599_7843, -398625547 * class164.anInt1801, 0.7F, anInt6893 * -1522661639, -1522661639 * anInt6893, false, -521320062)));
					anInt6904 = is[0] * 894472427;
					anInt6905 = -708742741 * is[is.length - 1];
					aClass143_6898 = class167.createNativeSprite(is, 0, class164.anInt1815 * -1174323635, -1174323635 * class164.anInt1815, -1174323635 * class164.anInt1815, (byte) -2);
				}
				int i_54_ = (i_53_ == 255 ? (class164.aClass595_1805 == Class595.aClass595_7819 ? 1 : 0) : 1);
				if (1 == i_54_ && bool)
					class167.method2063(i_42_, i_43_, i_44_, i_45_, i_49_, 0);
				if (null != aClass143_6898) {
					int i_55_ = i_45_ * i_46_ / -4096;
					int i_56_;
					for (i_56_ = (i_44_ - i_45_) / 2 + i_45_ * i_47_ / 4096; i_56_ > i_45_; i_56_ -= i_45_) {
						/* empty */
					}
					for (/**/; i_56_ < 0; i_56_ += i_45_) {
						/* empty */
					}
					if (aClass569_6911 == Class569.aClass569_7605) {
						for (int i_57_ = i_56_ - i_45_; i_57_ < i_44_; i_57_ += i_45_)
							aClass143_6898.method1731(i_42_ + i_57_, i_55_ + i_43_, i_45_, i_45_, 0, i_53_ << 24 | 0xffffff, i_54_);
						if (0 != (951424963 * anInt6904 & ~0xffffff))
							class167.method2057(0, 0, i_44_, 1 + (i_55_ + i_43_), 951424963 * anInt6904, (short) -5473);
						if ((anInt6905 * -2116157181 & ~0xffffff) != 0)
							class167.method2057(0, i_45_ + (i_55_ + i_43_), i_44_, i_45_ - (i_45_ + (i_43_ + i_55_)), -2116157181 * anInt6905, (short) -29284);
					} else {
						for (/**/; i_55_ > i_45_; i_55_ -= i_45_) {
							/* empty */
						}
						for (/**/; i_55_ < 0; i_55_ += i_45_) {
							/* empty */
						}
						for (int i_58_ = i_56_ - i_45_; i_58_ < i_44_; i_58_ += i_45_) {
							for (int i_59_ = i_55_ - i_45_; i_59_ < i_45_; i_59_ += i_45_)
								aClass143_6898.method1731(i_58_ + i_42_, i_59_ + i_43_, i_45_, i_45_, 0, (i_53_ << 24 | 0xffffff), i_54_);
						}
					}
				}
			} else
				class167.method2063(i_42_, i_43_, i_44_, i_45_, i_53_ << 24 | i_49_, bool ? 0 : 1);
		} else if (bool_50_) {
			Class443 class443 = class167.method2103();
			Class443 class443_60_ = class167.method2103();
			class443.aFloatArray4878[2] = class443.aFloatArray4878[3];
			class443.aFloatArray4878[6] = class443.aFloatArray4878[7];
			class443.aFloatArray4878[10] = class443.aFloatArray4878[11];
			class443.aFloatArray4878[14] = class443.aFloatArray4878[15];
			class167.method2390(class443);
			method6149(class167, i_46_, i_47_, i_48_, i_51_, (byte) -35);
			class167.method2390(class443_60_);
		} else {
			if (bool)
				class167.method2000(3, i_49_);
			method6149(class167, i_46_, i_47_, i_48_, i_51_, (byte) -15);
		}
		for (int i_61_ = anInt6897 * -643053789 - 1; i_61_ >= 0; i_61_--)
			aClass513Array6896[i_61_].method6223(class167, i_42_, i_43_, i_44_, i_45_, i_46_, i_47_, anInt6899 * 510507855, -1932945917 * anInt6891, anInt6895 * -268110665, i_53_);
		class167.method2000(2, 0);
		class167.method2086();
	}

	public void method6156(Class507 class507_62_, byte i) {
		if (aBool6910)
			anInt6914 = 428414271 * anInt6902;
		else if (class507_62_ != null && class507_62_.aBool6910)
			anInt6914 = -1308068803 - class507_62_.anInt6902 * 428414271;
		else
			anInt6914 = 0;
		aBool6910 = true;
		aClass507_6912 = class507_62_;
		anInt6902 = 0;
	}

	public void method6157(int i, int i_63_) {
		if (aBool6910) {
			/* empty */
		}
		anInt6902 = 1172459901 * (-1263644181 * anInt6914 + i * (i_63_ - -1263644181 * anInt6914) / 255);
	}

	public void method6158(int i, int i_64_) {
		if (aBool6910) {
			/* empty */
		}
		anInt6902 = 1172459901 * (-1263644181 * anInt6914 + i * (i_64_ - -1263644181 * anInt6914) / 255);
	}

	public void method6159(int i, int i_65_) {
		if (aBool6910) {
			/* empty */
		}
		anInt6902 = 1172459901 * (-1263644181 * anInt6914 + i * (i_65_ - -1263644181 * anInt6914) / 255);
	}

	public void method6160() {
		aBool6910 = false;
		aClass507_6912 = null;
		anInt6902 = 0;
	}

	public boolean method6161(int i) {
		return aBool6910;
	}

	public void method6162() {
		aBool6910 = false;
		aClass507_6912 = null;
		anInt6902 = 0;
	}

	public void method6163() {
		aBool6910 = false;
		aClass507_6912 = null;
		anInt6902 = 0;
	}

	public void method6164() {
		aBool6910 = false;
		aClass507_6912 = null;
		anInt6902 = 0;
	}

	public boolean method6165() {
		return aBool6910;
	}

	public void method6166(byte i) {
		aBool6910 = false;
		aClass507_6912 = null;
		anInt6902 = 0;
	}

	public void method6167() {
		aBool6910 = false;
		aClass507_6912 = null;
		anInt6902 = 0;
	}

	public static boolean method6168(int i, int i_66_, byte i_67_) {
		if (null == Class653.aClass360_8489 || Class653.aClass360_8489.method4756(-1457842903) == null)
			return false;
		if (i == i_66_)
			return true;
		Class374 class374 = Class653.aClass360_8489.method4756(-321839894).method4717(i, 644299289);
		Class374 class374_68_ = Class653.aClass360_8489.method4756(2023269264).method4717(i_66_, 880018489);
		Class374 class374_69_ = class374;
		while_27_: do {
			do {
				if (class374_69_ == null)
					break while_27_;
				class374_69_ = class374_69_.method4772(953493684);
				if (class374_69_ == class374_68_)
					return true;
			} while (class374_69_ != class374);
			return false;
		} while (false);
		class374_69_ = class374_68_;
		while_28_: do {
			do {
				if (class374_69_ == null)
					break while_28_;
				class374_69_ = class374_69_.method4772(-478217752);
				if (class374_69_ == class374)
					return true;
			} while (class374_69_ != class374_68_);
			return false;
		} while (false);
		return false;
	}

	static void method6169(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_70_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_71_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		TwitchWebcamDevice twitchwebcamdevice = Class484.method5843(i_70_, -1072974816);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1265(i_71_);
		if (twitchwebcamdevicecapability == null) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1967448571 * twitchwebcamdevicecapability.anInt1136;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = twitchwebcamdevicecapability.anInt1137 * 974204841;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 605817251 * twitchwebcamdevicecapability.anInt1138;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 928044193 * twitchwebcamdevicecapability.anInt1139;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 762345981 * twitchwebcamdevicecapability.anInt1140;
		}
	}

	static final void method6170(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		String string_72_ = ((String) class668.anObjectArray8543[366709801 * class668.anInt8544 + 1]);
		Class207.method2965(string, string_72_, (byte) 12);
	}

	static void method6171(GraphicalRenderer class167, int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_) {
		Class553 class553 = client.aClass515_11066.method6249(-493122155);
		Interface59 interface59 = (Interface59) class553.method6716(i, i_73_, i_74_, -342954341);
		if (interface59 != null) {
			ObjTypeDecoder class612 = ((ObjTypeDecoder) (client.aClass515_11066.method6280(-1073841494).method70(interface59.method373((byte) -67), (byte) 46)));
			int i_80_ = interface59.method367((byte) -65) & 0x3;
			int i_81_ = interface59.method71(-862308074);
			if (-1070948127 * class612.anInt7941 != -1)
				Class643.method7736(class167, class612, i_80_, i_75_, i_76_, -1046614944);
			else {
				int i_82_ = i_77_;
				if (1248110961 * class612.anInt7953 > 0)
					i_82_ = i_78_;
				if (i_81_ == ObjShapes.aClass606_7892.anInt7878 * -723459231 || (-723459231 * ObjShapes.aClass606_7875.anInt7878 == i_81_)) {
					if (i_80_ == 0)
						class167.method2385(i_75_, i_76_, 4, i_82_, 1399787617);
					else if (1 == i_80_)
						class167.method2059(i_75_, i_76_, 4, i_82_, -1399442393);
					else if (2 == i_80_)
						class167.method2385(3 + i_75_, i_76_, 4, i_82_, 1399787617);
					else if (3 == i_80_)
						class167.method2059(i_75_, i_76_ + 3, 4, i_82_, -1399442393);
				}
				if (-723459231 * ObjShapes.aClass606_7876.anInt7878 == i_81_) {
					if (0 == i_80_)
						class167.method2057(i_75_, i_76_, 1, 1, i_82_, (short) -5811);
					else if (i_80_ == 1)
						class167.method2057(i_75_ + 3, i_76_, 1, 1, i_82_, (short) -19418);
					else if (2 == i_80_)
						class167.method2057(i_75_ + 3, 3 + i_76_, 1, 1, i_82_, (short) -19427);
					else if (3 == i_80_)
						class167.method2057(i_75_, i_76_ + 3, 1, 1, i_82_, (short) -13455);
				}
				if (i_81_ == ObjShapes.aClass606_7875.anInt7878 * -723459231) {
					if (i_80_ == 0)
						class167.method2059(i_75_, i_76_, 4, i_82_, -1399442393);
					else if (1 == i_80_)
						class167.method2385(i_75_ + 3, i_76_, 4, i_82_, 1399787617);
					else if (i_80_ == 2)
						class167.method2059(i_75_, 3 + i_76_, 4, i_82_, -1399442393);
					else if (i_80_ == 3)
						class167.method2385(i_75_, i_76_, 4, i_82_, 1399787617);
				}
			}
		}
		interface59 = (Interface59) class553.method6736(i, i_73_, i_74_, client.anInterface64_11113, (byte) -50);
		if (null != interface59) {
			ObjTypeDecoder class612 = ((ObjTypeDecoder) (client.aClass515_11066.method6280(-1073841494).method70(interface59.method373((byte) 25), (byte) -123)));
			int i_83_ = interface59.method367((byte) -120) & 0x3;
			int i_84_ = interface59.method71(836222206);
			if (-1070948127 * class612.anInt7941 != -1)
				Class643.method7736(class167, class612, i_83_, i_75_, i_76_, 1783441034);
			else if (-723459231 * ObjShapes.aClass606_7873.anInt7878 == i_84_) {
				int i_85_ = -1118482;
				if (class612.anInt7953 * 1248110961 > 0)
					i_85_ = -1179648;
				if (0 == i_83_ || i_83_ == 2)
					class167.method2060(i_75_, 3 + i_76_, 3 + i_75_, i_76_, i_85_, -182493014);
				else
					class167.method2060(i_75_, i_76_, 3 + i_75_, 3 + i_76_, i_85_, -122175984);
			}
		}
		interface59 = (Interface59) class553.method6726(i, i_73_, i_74_, 1672121015);
		if (interface59 != null) {
			ObjTypeDecoder class612 = ((ObjTypeDecoder) (client.aClass515_11066.method6280(-1073841494).method70(interface59.method373((byte) -29), (byte) 11)));
			int i_86_ = interface59.method367((byte) 5) & 0x3;
			if (-1 != -1070948127 * class612.anInt7941)
				Class643.method7736(class167, class612, i_86_, i_75_, i_76_, 2132973468);
		}
	}

	public static void method6172(long[] ls, Object[] objects, int i) {
		Class632.method7539(ls, objects, 0, ls.length - 1, -1682781552);
	}
}

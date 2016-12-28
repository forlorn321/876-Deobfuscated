/* Class677 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class677 implements ConfigType {
	static final int anInt8590 = 8224;
	Class681 aClass681_8591;
	int anInt8592;
	int anInt8593;
	short[] aShortArray8594;
	short[] aShortArray8595;
	short[] aShortArray8596;
	int anInt8597;
	short[] aShortArray8598;
	byte[] aByteArray8599;
	byte[] aByteArray8600;
	int anInt8601;
	byte aByte8602;
	int anInt8603;
	public boolean aBool8604;
	int anInt8605;
	int anInt8606;
	public int anInt8607 = 1803903681;
	int anInt8608;
	public static Class167 aClass167_8609;

	final Class177 method8043(Class167 class167, int i, boolean bool, Class160 class160, Class160 class160_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class688 class688, byte i_8_, int i_9_) {
		int i_10_ = i;
		bool = bool & aByte8602 != 0;
		if (class688 != null)
			i_10_ |= class688.method8162((byte) 6);
		if (anInt8605 * -754018359 != 128)
			i_10_ |= 0x2;
		if (-1986333679 * anInt8601 != 128 || 1802811017 * anInt8606 != 0 || 0 != i_4_)
			i_10_ |= 0x5;
		if (bool)
			i_10_ |= 0x7;
		Class177 class177;
		synchronized (aClass681_8591.aClass199_8646) {
			class177 = ((Class177) (aClass681_8591.aClass199_8646.method2886((long) (anInt8592 * -970719055 | class167.anInt1850 * 1526643673 << 29))));
		}
		if (null == class177 || class167.method2308(class177.method2466(), i_10_) != 0) {
			if (null != class177)
				i_10_ = class167.method2068(i_10_, class177.method2466());
			int i_11_ = i_10_;
			if (null != aShortArray8595)
				i_11_ |= 0x4000;
			if (null != aShortArray8594)
				i_11_ |= 0x8000;
			Class180 class180 = Class180.method2708(aClass681_8591.aClass461_8645, anInt8593 * -825664967, 0);
			if (class180 == null)
				return null;
			if (class180.anInt1949 < 13)
				class180.method2707(2);
			class177 = class167.method2093(class180, i_11_, aClass681_8591.anInt8647 * 385850151, -618422655 * anInt8603 + 64, -1585442343 * anInt8597 + 850);
			if (aShortArray8595 != null) {
				for (int i_12_ = 0; i_12_ < aShortArray8595.length; i_12_++)
					class177.method2507(aShortArray8595[i_12_], aShortArray8596[i_12_]);
			}
			if (aShortArray8594 != null) {
				for (int i_13_ = 0; i_13_ < aShortArray8594.length; i_13_++)
					class177.method2509(aShortArray8594[i_13_], aShortArray8598[i_13_]);
			}
			class177.method2465(i_10_);
			synchronized (aClass681_8591.aClass199_8646) {
				aClass681_8591.aClass199_8646.method2881(class177, (long) (anInt8592 * -970719055 | class167.anInt1850 * 1526643673 << 29));
			}
		}
		Class177 class177_14_ = class177.method2623(i_8_, i_10_, true);
		if (class688 != null)
			class688.method8132(class177_14_, 0, -630825472);
		if (anInt8601 * -1986333679 != 128 || 128 != -754018359 * anInt8605)
			class177_14_.method2474(anInt8601 * -1986333679, -754018359 * anInt8605, -1986333679 * anInt8601);
		if (1802811017 * anInt8606 != 0) {
			if (anInt8606 * 1802811017 == 90)
				i_4_ += 4096;
			if (anInt8606 * 1802811017 == 180)
				i_4_ += 8192;
			if (270 == anInt8606 * 1802811017)
				i_4_ += 12288;
		}
		if (0 != i_4_) {
			i_4_ &= 0x3fff;
			class177_14_.method2541(i_4_);
		}
		if (bool) {
			if (class160 != null)
				class177_14_.method2475(aByte8602, -2037835897 * anInt8608, class160, class160_0_, i_1_, i_2_, i_3_);
			else {
				if (i_5_ != 0)
					class177_14_.method2457(i_5_);
				if (0 != i_6_)
					class177_14_.method2529(i_6_);
				if (i_7_ != 0)
					class177_14_.method2472(0, i_7_, 0);
			}
		}
		class177_14_.method2465(i);
		return class177_14_;
	}

	void method8044(RSByteBuffer class536_sub33, int i, byte i_15_) {
		do {
			if (1 == i)
				anInt8593 = class536_sub33.readBigSmart() * -161844215;
			else if (i == 2)
				anInt8607 = class536_sub33.readBigSmart() * -1803903681;
			else if (i == 4)
				anInt8601 = class536_sub33.readUnsignedShort() * 1080589553;
			else if (i == 5)
				anInt8605 = class536_sub33.readUnsignedShort() * 1431122553;
			else if (i == 6)
				anInt8606 = class536_sub33.readUnsignedShort() * -826171463;
			else if (7 == i)
				anInt8603 = class536_sub33.readUnsignedByte() * 2036244865;
			else if (8 == i)
				anInt8597 = class536_sub33.readUnsignedByte() * 1566793321;
			else if (i == 10)
				aBool8604 = true;
			else if (i == 9) {
				aByte8602 = (byte) 3;
				anInt8608 = -1519999264;
			} else if (i == 15) {
				aByte8602 = (byte) 3;
				anInt8608 = class536_sub33.readUnsignedShort() * -1205010889;
			} else if (16 == i) {
				aByte8602 = (byte) 3;
				anInt8608 = class536_sub33.readInt() * -1205010889;
			} else if (i == 40) {
				int i_16_ = class536_sub33.readUnsignedByte();
				aShortArray8595 = new short[i_16_];
				aShortArray8596 = new short[i_16_];
				for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
					aShortArray8595[i_17_] = (short) class536_sub33.readUnsignedShort();
					aShortArray8596[i_17_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_18_ = class536_sub33.readUnsignedByte();
				aShortArray8594 = new short[i_18_];
				aShortArray8598 = new short[i_18_];
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					aShortArray8594[i_19_] = (short) class536_sub33.readUnsignedShort();
					aShortArray8598[i_19_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (i == 44) {
				int i_20_ = class536_sub33.readUnsignedShort();
				int i_21_ = 0;
				for (int i_22_ = i_20_; i_22_ > 0; i_22_ >>= 1)
					i_21_++;
				aByteArray8599 = new byte[i_21_];
				byte i_23_ = 0;
				for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
					if ((i_20_ & 1 << i_24_) > 0) {
						aByteArray8599[i_24_] = i_23_;
						i_23_++;
					} else
						aByteArray8599[i_24_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_25_ = class536_sub33.readUnsignedShort();
				int i_26_ = 0;
				for (int i_27_ = i_25_; i_27_ > 0; i_27_ >>= 1)
					i_26_++;
				aByteArray8600 = new byte[i_26_];
				byte i_28_ = 0;
				for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
					if ((i_25_ & 1 << i_29_) > 0) {
						aByteArray8600[i_29_] = i_28_;
						i_28_++;
					} else
						aByteArray8600[i_29_] = (byte) -1;
				}
			} else if (i == 46)
				break;
		} while (false);
	}

	public final Class177 method8045(Class167 class167, int i, Class688 class688, byte i_30_, int i_31_) {
		return method8043(class167, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class688, i_30_, 934687717);
	}

	public final Class177 method8046(Class167 class167, int i, int i_32_, int i_33_, int i_34_, int i_35_, Class688 class688, byte i_36_, int i_37_) {
		if (aByte8602 != 3)
			return method8043(class167, i, false, null, null, 0, 0, 0, i_32_, 0, 0, 0, class688, i_36_, -1798442424);
		return method8043(class167, i, true, null, null, 0, 0, 0, i_32_, i_33_, i_34_, i_35_, class688, i_36_, 1988042164);
	}

	public final Class177 method8047(Class167 class167, int i, int i_38_, Class160 class160, Class160 class160_39_, int i_40_, int i_41_, int i_42_, Class688 class688, byte i_43_, int i_44_) {
		return method8043(class167, i, true, class160, class160_39_, i_40_, i_41_, i_42_, i_38_, 0, 0, 0, class688, i_43_, -1058445949);
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			method8044(class536_sub33, i, (byte) -32);
		}
	}

	public final boolean method8048(int i) {
		if (-825664967 * anInt8593 == -1)
			return true;
		return aClass681_8591.aClass461_8645.method5558(-825664967 * anInt8593, 0, -422106845);
	}

	public void postDecode() {
		/* empty */
	}

	public final boolean method8049() {
		if (-825664967 * anInt8593 == -1)
			return true;
		return aClass681_8591.aClass461_8645.method5558(-825664967 * anInt8593, 0, 719789047);
	}

	public void method77() {
		/* empty */
	}

	Class677(int i, Class681 class681) {
		anInt8601 = 876509312;
		anInt8605 = -1499906944;
		anInt8606 = 0;
		anInt8603 = 0;
		anInt8597 = 0;
		aBool8604 = false;
		aByte8602 = (byte) 0;
		anInt8608 = 1205010889;
		anInt8592 = i * 2139768913;
		aClass681_8591 = class681;
	}

	public final boolean method8050() {
		if (-825664967 * anInt8593 == -1)
			return true;
		return aClass681_8591.aClass461_8645.method5558(-825664967 * anInt8593, 0, 166988655);
	}

	public void decodeType(RSByteBuffer class536_sub33) {
		for (;;) {
			int i_45_ = class536_sub33.readUnsignedByte();
			if (0 == i_45_)
				break;
			method8044(class536_sub33, i_45_, (byte) -16);
		}
	}

	public static int method8051(byte i) {
		if (3 == 179908453 * Class575.anInt7658)
			return -1;
		if (0 != Class575.anInt7658 * 179908453)
			return -2028696083 * Class575.anInt7671;
		if (null == Class575.aStringArray7650) {
			if (Class497.aString5550.startsWith("mac ")) {
				if (Class497.aString5551.startsWith("ppc")) {
					Class575.anInt7658 = -445497529;
					return -1;
				}
				Class575.aStringArray7650 = new String[3];
				Class575.aStringArray7650[0] = "sdk-mac-dynamic";
				Class575.aStringArray7650[1] = "twitchsdk";
				Class575.aStringArray7650[2] = "twitchtv";
				Class575.aBoolArray7660 = new boolean[3];
				Class575.aBoolArray7660[0] = false;
				Class575.aBoolArray7660[1] = false;
				Class575.aBoolArray7660[2] = true;
			} else if (Class497.aString5550.startsWith("win")) {
				Class575.aStringArray7650 = new String[6];
				Class575.aStringArray7650[0] = "avutil-ttv-51";
				Class575.aStringArray7650[1] = "libmp3lame-ttv";
				Class575.aStringArray7650[2] = "swresample-ttv-0";
				Class575.aStringArray7650[5] = "twitchtv";
				if (Class497.aString5551.startsWith("amd64") || Class497.aString5551.startsWith("x86_64")) {
					Class575.aStringArray7650[3] = "libmfxsw64";
					Class575.aStringArray7650[4] = "twitchsdk_64_release";
				} else if (Class497.aString5551.startsWith("i386") || Class497.aString5551.startsWith("i486") || Class497.aString5551.startsWith("i586") || Class497.aString5551.startsWith("x86")) {
					Class575.aStringArray7650[3] = "libmfxsw32";
					Class575.aStringArray7650[4] = "twitchsdk_32_release";
				} else {
					Class575.anInt7658 = -445497529;
					return -1;
				}
				Class575.aBoolArray7660 = new boolean[6];
				Class575.aBoolArray7660[0] = true;
				Class575.aBoolArray7660[1] = true;
				Class575.aBoolArray7660[2] = true;
				Class575.aBoolArray7660[3] = false;
				Class575.aBoolArray7660[4] = true;
				Class575.aBoolArray7660[5] = true;
			} else {
				Class575.anInt7658 = -445497529;
				return -1;
			}
		}
		Class575.anInt7658 = 1283156589;
		return 0;
	}

	static final void method8052(Class668 class668, int i) {
		int i_46_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_47_ = Class392_Sub3.method9307(i_46_, (byte) -73);
		if (i_47_ < 0)
			throw new RuntimeException();
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_47_;
	}

	static void method8053(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, boolean bool, int i_61_, byte i_62_) {
		if (0 != i_48_ && -1 != i_50_) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = null;
			if (i_48_ < 0) {
				int i_63_ = -i_48_ - 1;
				if (i_63_ == -1791435655 * client.anInt11156)
					class649_sub1_sub5_sub1 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
				else
					class649_sub1_sub5_sub1 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_63_]);
			} else {
				int i_64_ = i_48_ - 1;
				ObjectParam class536_sub13 = ((ObjectParam) client.aClass4_11050.method556((long) i_64_));
				if (class536_sub13 != null)
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) class536_sub13.value);
			}
			if (class649_sub1_sub5_sub1 != null) {
				Class589 class589 = class649_sub1_sub5_sub1.method10877(2123636973);
				if (class589.anIntArrayArray7749 != null && null != class589.anIntArrayArray7749[i_50_])
					i_51_ -= class589.anIntArrayArray7749[i_50_][1];
				if (null != class589.anIntArrayArray7775 && null != class589.anIntArrayArray7775[i_50_])
					i_51_ -= class589.anIntArrayArray7775[i_50_][1];
			}
		}
		Class649_Sub1_Sub5_Sub6 class649_sub1_sub5_sub6 = new Class649_Sub1_Sub5_Sub6(client.aClass515_11066.method6249(-193218004), i, -502818839 * Class512.scenePlane, Class512.scenePlane * -502818839, i_53_, i_54_, i_51_, client.cycles + i_57_, client.cycles + i_58_, i_59_, i_60_, i_48_, i_49_, i_52_, bool, i_50_, i_61_);
		class649_sub1_sub5_sub6.method11046(i_55_, i_56_, Class54.method944(i_55_, i_56_, -502818839 * Class512.scenePlane, 1507692935) - i_52_, i_57_ + client.cycles, -1657848192);
		client.aClass708_11174.method8335(new Class536_Sub18_Sub8(class649_sub1_sub5_sub6), -419514451);
	}

	static final void method8054(Class668 class668, int i) {
		class668.anInt8542 -= 247423132;
		Class51.method930(-1398418648);
		Class432.method5188(-816291493);
		Class105.anInt1253 = (class668.anIntArray8541[class668.anInt8542 * 1867269829] * -1203480541);
		Class42.anInt509 = (class668.anIntArray8541[1867269829 * class668.anInt8542 + 1] * -395803243);
		Class582.anInt7699 = (-650718371 * class668.anIntArray8541[1867269829 * class668.anInt8542 + 2]);
		Class26.anInt247 = (class668.anIntArray8541[3 + class668.anInt8542 * 1867269829] * 2088111479);
		Class28.anInt260 = (-1904654023 * class668.anIntArray8541[4 + class668.anInt8542 * 1867269829]);
		FogSetting.anInt10862 = (class668.anIntArray8541[1867269829 * class668.anInt8542 + 5] * 43031081);
		Class587.anInt7739 = (class668.anIntArray8541[6 + class668.anInt8542 * 1867269829] * 1517005929);
		Class252.anInt2746 = (class668.anIntArray8541[7 + class668.anInt8542 * 1867269829] * -341267247);
		Class575.anInt7680 = (class668.anIntArray8541[8 + 1867269829 * class668.anInt8542] * -1348047085);
		Class158.anInt1743 = (class668.anIntArray8541[9 + class668.anInt8542 * 1867269829] * -1202232779);
		Class461.anInt5217 = (class668.anIntArray8541[10 + 1867269829 * class668.anInt8542] * -1458393235);
		Class301.anInt3400 = -308671957 * (class668.anIntArray8541[1867269829 * class668.anInt8542 + 11]);
		Class398.aClass461_4122.method5580(-1034889975 * Class28.anInt260, -964514165);
		Class398.aClass461_4122.method5580(FogSetting.anInt10862 * -1675910631, -964514165);
		Class398.aClass461_4122.method5580(Class587.anInt7739 * 1037345753, -964514165);
		Class398.aClass461_4122.method5580(-1147982799 * Class252.anInt2746, -964514165);
		Class398.aClass461_4122.method5580(Class575.anInt7680 * -1877429477, -964514165);
		Class398.aClass461_4122.method5580(Class301.anInt3400 * 614229123, -964514165);
		Class710_Sub43.aClass461_10940.method5580(Class301.anInt3400 * 614229123, -964514165);
		Class472.aClass143_5369 = null;
		Class662.aClass143_8514 = null;
		Class204.aClass143_2234 = null;
		Class640.aClass143_8311 = null;
		Class247_Sub1.aClass143_9969 = null;
		Class536_Sub5.aClass143_10418 = null;
		Class106.aClass143_1275 = null;
		Class323.aClass143_3550 = null;
		Class70.aBool780 = true;
	}
}

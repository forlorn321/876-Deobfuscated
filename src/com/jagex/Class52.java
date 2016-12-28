/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class52 implements Interface75 {
	public static Class52 aClass52_589 = new Class52(0);
	public static Class52 aClass52_590 = new Class52(1);
	int anInt591;

	public int method78() {
		return anInt591 * 691100175;
	}

	Class52(int i) {
		anInt591 = -257927953 * i;
	}

	public int method12() {
		return anInt591 * 691100175;
	}

	public int method73() {
		return anInt591 * 691100175;
	}

	public static void method934(int i, int i_0_, int i_1_, byte i_2_) {
		Class598 class598 = client.aClass515_11066.method6255(-2047638825);
		int i_3_ = i_0_ + class598.anInt7839 * 1858049507;
		int i_4_ = i_1_ + 1479112045 * class598.anInt7840;
		if (client.aClass515_11066.method6249(161559030) != null && (client.aClass515_11066.method6315(-1329880244) != Class498.aClass498_5556) && i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass515_11066.method6321((byte) -53) && i_1_ < client.aClass515_11066.method6243(177401017)) {
			long l = (long) (i << 28 | i_4_ << 14 | i_3_);
			Class536_Sub9 class536_sub9 = (Class536_Sub9) client.aClass4_11170.method556(l);
			if (class536_sub9 == null)
				client.aClass515_11066.method6249(900885169).method6718(i, i_0_, i_1_, -661339768);
			else {
				Class536_Sub6 class536_sub6 = ((Class536_Sub6) class536_sub9.aClass708_10433.method8308(1867269829));
				if (class536_sub6 == null)
					client.aClass515_11066.method6249(-1758886412).method6718(i, i_0_, i_1_, -421705374);
				else {
					int i_5_ = -1;
					int i_6_ = -1;
					int i_7_ = -1;
					Class433 class433 = null;
					Class433 class433_8_ = null;
					Class433 class433_9_ = null;
					Class649_Sub1_Sub1_Sub1 class649_sub1_sub1_sub1 = ((Class649_Sub1_Sub1_Sub1) client.aClass515_11066.method6249(953724802).method6718(i, i_0_, i_1_, -1982851242));
					if (null == class649_sub1_sub1_sub1)
						class649_sub1_sub1_sub1 = (new Class649_Sub1_Sub1_Sub1(client.aClass515_11066.method6249(-40812736), i_0_ << 9, client.aClass515_11066.method6249(590147907).aClass160Array7431[i].method1927(i_0_, i_1_, -1530617255), i_1_ << 9, i, i));
					else {
						i_5_ = -1572171437 * class649_sub1_sub1_sub1.anInt12122;
						i_6_ = class649_sub1_sub1_sub1.anInt12134 * -1536784811;
						i_7_ = class649_sub1_sub1_sub1.anInt12124 * 1015387979;
						class433 = class649_sub1_sub1_sub1.aClass433_12120;
						class433_8_ = class649_sub1_sub1_sub1.aClass433_12127;
						class433_9_ = class649_sub1_sub1_sub1.aClass433_12128;
						Class649_Sub1_Sub1_Sub1 class649_sub1_sub1_sub1_10_ = class649_sub1_sub1_sub1;
						class649_sub1_sub1_sub1.anInt12124 = 989939101;
						class649_sub1_sub1_sub1_10_.anInt12134 = 1540733187;
						class649_sub1_sub1_sub1.aClass553_10838 = client.aClass515_11066.method6249(-1795787584);
					}
					class649_sub1_sub1_sub1.anInt12122 = class536_sub6.anInt10419 * 1071583801;
					class649_sub1_sub1_sub1.anInt12121 = 1451681839 * class536_sub6.anInt10420;
					while_84_: do {
						Class536_Sub6 class536_sub6_11_;
						do {
							class536_sub6_11_ = (Class536_Sub6) class536_sub9.aClass708_10433.method8311(1829676480);
							if (null == class536_sub6_11_)
								break while_84_;
						} while (1696543099 * class536_sub6_11_.anInt10419 == (class649_sub1_sub1_sub1.anInt12122 * -1572171437));
						class649_sub1_sub1_sub1.anInt12134 = class536_sub6_11_.anInt10419 * 1636403343;
						class649_sub1_sub1_sub1.anInt12123 = 260731307 * class536_sub6_11_.anInt10420;
						for (;;) {
							Class536_Sub6 class536_sub6_12_ = (Class536_Sub6) class536_sub9.aClass708_10433.method8311(1335056885);
							if (null == class536_sub6_12_)
								break;
							if ((1696543099 * class536_sub6_12_.anInt10419 != (class649_sub1_sub1_sub1.anInt12122 * -1572171437)) && ((-1536784811 * class649_sub1_sub1_sub1.anInt12134) != (1696543099 * class536_sub6_12_.anInt10419))) {
								class649_sub1_sub1_sub1.anInt12124 = 151879825 * class536_sub6_12_.anInt10419;
								class649_sub1_sub1_sub1.anInt12125 = class536_sub6_12_.anInt10420 * 888350631;
							}
						}
					} while (false);
					int i_13_ = Class54.method944(256 + (i_0_ << 9), 256 + (i_1_ << 9), i, 1801913609);
					class649_sub1_sub1_sub1.method7842((float) (i_0_ << 9), (float) i_13_, (float) (i_1_ << 9));
					if (i_5_ != class649_sub1_sub1_sub1.anInt12122 * -1572171437) {
						if (class649_sub1_sub1_sub1.anInt12122 * -1572171437 == i_6_)
							class649_sub1_sub1_sub1.aClass433_12120 = class433_8_;
						else if ((class649_sub1_sub1_sub1.anInt12122 * -1572171437) == i_7_)
							class649_sub1_sub1_sub1.aClass433_12120 = class433_9_;
						else if (((ItemTypeDecoder) (Class111.aClass34_Sub13_1391.method70((class649_sub1_sub1_sub1.anInt12122 * -1572171437), (byte) 110))).aBool49)
							class649_sub1_sub1_sub1.aClass433_12120 = Class640.method7676(-2129701817);
						else
							class649_sub1_sub1_sub1.aClass433_12120 = null;
					}
					if (-1536784811 * class649_sub1_sub1_sub1.anInt12134 == -1)
						class649_sub1_sub1_sub1.aClass433_12127 = null;
					else if (i_6_ != (class649_sub1_sub1_sub1.anInt12134 * -1536784811)) {
						if (-1536784811 * class649_sub1_sub1_sub1.anInt12134 == i_5_)
							class649_sub1_sub1_sub1.aClass433_12127 = class433;
						else if ((-1536784811 * class649_sub1_sub1_sub1.anInt12134) == i_7_)
							class649_sub1_sub1_sub1.aClass433_12127 = class433_9_;
						else if (((ItemTypeDecoder) (Class111.aClass34_Sub13_1391.method70((-1536784811 * class649_sub1_sub1_sub1.anInt12134), (byte) 50))).aBool49)
							class649_sub1_sub1_sub1.aClass433_12127 = Class640.method7676(-2129701817);
						else
							class649_sub1_sub1_sub1.aClass433_12127 = null;
					}
					if (class649_sub1_sub1_sub1.anInt12124 * 1015387979 == -1)
						class649_sub1_sub1_sub1.aClass433_12128 = null;
					else if (class649_sub1_sub1_sub1.anInt12124 * 1015387979 != i_7_) {
						if (i_5_ == class649_sub1_sub1_sub1.anInt12124 * 1015387979)
							class649_sub1_sub1_sub1.aClass433_12128 = class433;
						else if ((class649_sub1_sub1_sub1.anInt12124 * 1015387979) == i_6_)
							class649_sub1_sub1_sub1.aClass433_12128 = class433_8_;
						else if (((ItemTypeDecoder) (Class111.aClass34_Sub13_1391.method70((1015387979 * class649_sub1_sub1_sub1.anInt12124), (byte) 16))).aBool49)
							class649_sub1_sub1_sub1.aClass433_12128 = Class640.method7676(-2129701817);
						else
							class649_sub1_sub1_sub1.aClass433_12128 = null;
					}
					class649_sub1_sub1_sub1.anInt12129 = 0;
					class649_sub1_sub1_sub1.aByte10839 = (byte) i;
					class649_sub1_sub1_sub1.aByte10840 = (byte) i;
					if (client.aClass515_11066.method6251(43007343).method5466(i_0_, i_1_, (byte) 0))
						class649_sub1_sub1_sub1.aByte10840++;
					client.aClass515_11066.method6249(-351172985).method6708(i, i_0_, i_1_, i_13_, class649_sub1_sub1_sub1, 287140749);
				}
			}
		}
	}

	static final void method935(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class613.method7318(class251, class234, class668, -2054513679);
	}
}

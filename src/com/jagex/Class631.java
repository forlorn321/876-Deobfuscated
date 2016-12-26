/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class631 {
	static final int anInt8238 = 2;
	public static final int anInt8239 = 0;
	public static final int anInt8240 = 1;
	public int[] anIntArray8241;
	public int anInt8242 = 802846703;
	public int anInt8243 = 1199033349;
	public int[] anIntArray8244;
	public int[] anIntArray8245;

	public Class631(Class461 class461) {
		byte[] is = class461.method5595((-848473139 * Class633.aClass633_8256.anInt8258), -1334086885);
		method7529(new RSByteBuffer(is), 175597207);
	}

	void method7529(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			if (i_0_ == 1) {
				int i_1_ = class536_sub33.readUnsignedByte();
				anIntArray8241 = new int[i_1_];
				for (int i_2_ = 0; i_2_ < anIntArray8241.length; i_2_++) {
					anIntArray8241[i_2_] = class536_sub33.readUnsignedByte();
					if (0 != anIntArray8241[i_2_] && 2 != anIntArray8241[i_2_]) {
						/* empty */
					}
				}
			} else if (i_0_ == 3)
				anInt8242 = class536_sub33.readUnsignedByte() * -802846703;
			else if (4 == i_0_)
				anInt8243 = class536_sub33.readUnsignedByte() * -1199033349;
			else if (5 == i_0_) {
				anIntArray8244 = new int[class536_sub33.readUnsignedByte()];
				for (int i_3_ = 0; i_3_ < anIntArray8244.length; i_3_++)
					anIntArray8244[i_3_] = class536_sub33.readUnsignedByte();
			} else if (i_0_ == 6) {
				anIntArray8245 = new int[class536_sub33.readUnsignedByte()];
				for (int i_4_ = 0; i_4_ < anIntArray8245.length; i_4_++)
					anIntArray8245[i_4_] = class536_sub33.readUnsignedByte();
			}
		}
		if (anIntArray8241 == null)
			throw new RuntimeException("");
	}

	void method7530(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1) {
				int i_5_ = class536_sub33.readUnsignedByte();
				anIntArray8241 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < anIntArray8241.length; i_6_++) {
					anIntArray8241[i_6_] = class536_sub33.readUnsignedByte();
					if (0 != anIntArray8241[i_6_] && 2 != anIntArray8241[i_6_]) {
						/* empty */
					}
				}
			} else if (i == 3)
				anInt8242 = class536_sub33.readUnsignedByte() * -802846703;
			else if (4 == i)
				anInt8243 = class536_sub33.readUnsignedByte() * -1199033349;
			else if (5 == i) {
				anIntArray8244 = new int[class536_sub33.readUnsignedByte()];
				for (int i_7_ = 0; i_7_ < anIntArray8244.length; i_7_++)
					anIntArray8244[i_7_] = class536_sub33.readUnsignedByte();
			} else if (i == 6) {
				anIntArray8245 = new int[class536_sub33.readUnsignedByte()];
				for (int i_8_ = 0; i_8_ < anIntArray8245.length; i_8_++)
					anIntArray8245[i_8_] = class536_sub33.readUnsignedByte();
			}
		}
		if (anIntArray8241 == null)
			throw new RuntimeException("");
	}

	static final void method7531(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method7532(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class39.method866(class251, class234, class668, (byte) 127);
	}

	static void method7533(Class167 class167, Class251 class251, int i, int i_9_, int i_10_) {
		if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null) {
			class167.method2084();
			Class244 class244 = null;
			Class161 class161 = null;
			if (1049444347 * class251.anInt2728 == 5) {
				class244 = class251.method3478(class167, -989567720);
				if (class244 == null)
					return;
				class161 = class244.aClass161_2463;
				if ((class244.anInt2464 * -598030877 != -1606950689 * class251.anInt2573) || (class251.anInt2574 * 223822141 != class244.anInt2460 * -313075149))
					throw new IllegalStateException("");
			}
			class167.method2369(i, i_9_, class251.anInt2573 * -1606950689 + i, i_9_ + class251.anInt2574 * 223822141);
			if (Class101.anInt1200 * 2131718319 != 2 && 2131718319 * Class101.anInt1200 != 5 && null != Class536_Sub8.aClass143_10432) {
				class167.method2049(Class101.anIntArray1209);
				class167.method2047();
				Class598 class598 = client.aClass515_11066.method6255(-1908908622);
				int i_11_;
				int i_12_;
				int i_13_;
				int i_14_;
				if (6 == 155362615 * Class246.anInt2474) {
					i_11_ = 289882095 * client.anInt11082;
					i_12_ = client.anInt11236 * 182288133;
					i_13_ = (int) -client.aFloat11106 & 0x3fff;
					i_14_ = 4096;
				} else {
					Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
					i_11_ = (int) class436.aFloat4850;
					i_12_ = (int) class436.aFloat4853;
					if (2 == Class246.anInt2474 * 155362615)
						i_13_ = ((int) -((double) Class683.aClass301_Sub1_8651.method4092((byte) 3) * 2607.5945876176133) + client.anInt11096 * -2011409073) & 0x3fff;
					else
						i_13_ = ((int) -client.aFloat11106 + client.anInt11096 * -2011409073) & 0x3fff;
					i_14_ = 4096 - -326379344 * client.anInt11098;
				}
				int i_15_ = 48 + i_11_ / 128;
				int i_16_ = (48 + client.aClass515_11066.method6243(177401017) * 4 - i_12_ / 128);
				if (class161 != null)
					Class536_Sub8.aClass143_10432.method1739(((float) (class251.anInt2573 * -1606950689) / 2.0F + (float) i), ((float) (class251.anInt2574 * 223822141) / 2.0F + (float) i_9_), (float) i_15_, (float) i_16_, i_14_, i_13_ << 2, class161, i, i_9_);
				else
					Class536_Sub8.aClass143_10432.method1744(((float) i + (float) (class251.anInt2573 * -1606950689) / 2.0F), ((float) (223822141 * class251.anInt2574) / 2.0F + (float) i_9_), (float) i_15_, (float) i_16_, i_14_, i_13_ << 2, 1, -1, 1);
				Class543 class543 = client.aClass515_11066.method6244((byte) -119);
				for (Class536_Sub26 class536_sub26 = ((Class536_Sub26) Class101.aClass708_1197.method8308(1867269829)); class536_sub26 != null; class536_sub26 = ((Class536_Sub26) Class101.aClass708_1197.method8311(1798723961))) {
					int i_17_ = 2083602213 * class536_sub26.anInt10533;
					int i_18_ = ((class543.anIntArray7235[i_17_] >> 14 & 0x3fff) - 1858049507 * class598.anInt7839);
					int i_19_ = ((class543.anIntArray7235[i_17_] & 0x3fff) - class598.anInt7840 * 1479112045);
					int i_20_ = 2 + i_18_ * 4 - i_11_ / 128;
					int i_21_ = 4 * i_19_ + 2 - i_12_ / 128;
					Class103.method1371(class167, class161, class251, i, i_9_, i_20_, i_21_, class543.anIntArray7236[i_17_], -33191159);
				}
				for (int i_22_ = 0; i_22_ < Class101.anInt1199 * -1314589555; i_22_++) {
					int i_23_ = 4 * Class101.anIntArray1198[i_22_] + 2 - i_11_ / 128;
					int i_24_ = 2 + 4 * Class101.anIntArray1203[i_22_] - i_12_ / 128;
					Class612 class612 = ((Class612) (client.aClass515_11066.method6280(-1073841494).method70(Class101.anIntArray1202[i_22_], (byte) -49)));
					if (null != class612.anIntArray7988) {
						class612 = class612.method7293(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) 69);
						if (class612 == null || -1 == -876565287 * class612.anInt7994)
							continue;
					}
					Class103.method1371(class167, class161, class251, i, i_9_, i_23_, i_24_, class612.anInt7994 * -876565287, -33191159);
				}
				for (Class536_Sub9 class536_sub9 = ((Class536_Sub9) client.aClass4_11170.method562(-858620095)); null != class536_sub9; class536_sub9 = ((Class536_Sub9) client.aClass4_11170.method567(-1347104097))) {
					int i_25_ = (int) ((class536_sub9.aLong7133 * -6909195213925454795L) >> 28 & 0x3L);
					if (i_25_ == Class101.anInt1201 * 1140813693) {
						int i_26_ = ((int) ((-6909195213925454795L * class536_sub9.aLong7133) & 0x3fffL) - class598.anInt7839 * 1858049507);
						int i_27_ = ((int) ((class536_sub9.aLong7133 * -6909195213925454795L) >> 14 & 0x3fffL) - class598.anInt7840 * 1479112045);
						int i_28_ = 2 + i_26_ * 4 - i_11_ / 128;
						int i_29_ = 2 + 4 * i_27_ - i_12_ / 128;
						Class533.method6467(class251, class161, i, i_9_, i_28_, i_29_, Class35.aClass143Array292[0], (byte) 49);
					}
				}
				Class335.method4377(class167, i_11_, i_12_, class251, class161, i, i_9_, -264434942);
				Class26.method744(i_11_, i_12_, class251, class161, i, i_9_, (short) 16383);
				Class537.method6508(i_11_, i_12_, class251, class244, i, i_9_, 1315924436);
				if (6 != Class246.anInt2474 * 155362615) {
					if (-349564685 * Class101.anInt1205 != -1) {
						int i_30_ = (2 + Class101.anInt1205 * -1398258740 - i_11_ / 128 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10874() - 1) * 2);
						int i_31_ = (2 + Class101.anInt1194 * 1603069908 - i_12_ / 128 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10874() - 1) * 2);
						Class656.method7946(class251, class161, i - (Class694.anInt8731 * -1334329881), i_9_ - (-856950269 * Class281.anInt3175), i_30_, i_31_, (Class610.aClass143Array7922[Class101.aBool1206 ? 1 : 0]), 100.0, Class261.aClass261_2844, Class283.aClass283_3181, (byte) -1);
					}
					if (!Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass623_12201.method7421(714021316))
						class167.method2057(i + class251.anInt2573 * -1606950689 / 2 - 1, i_9_ + class251.anInt2574 * 223822141 / 2 - 1, 3, 3, -1, (short) -5110);
				}
				class167.method2048(Class101.anIntArray1209[0], Class101.anIntArray1209[1], Class101.anIntArray1209[2], Class101.anIntArray1209[3]);
			} else if (null != class161)
				class167.method2088(-16777216, class161, i, i_9_);
		}
	}
}

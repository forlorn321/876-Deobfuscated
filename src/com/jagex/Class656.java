/* Class656 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656 {
	public int anInt8497;

	public Class656(int i) {
		anInt8497 = i * -994926531;
	}

	static final void method7942(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class466.method5683(class251, class234, class668, -1887000816);
	}

	static final void method7943(Class668 class668, byte i) {
		Class63.method1056(-1650594828);
	}

	static final void method7944(IComponentDefinitions class251, Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_1_ = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) - 1);
		if (1939619399 * class251.modelType != 2)
			throw new RuntimeException("");
		NPCDecoder class296 = ((NPCDecoder) Class172.aClass34_Sub7_1922.method70(class251.modelId * -2011124813, (byte) 23));
		if (null == class251.aClass304_2583)
			class251.aClass304_2583 = new NPCCustomization(class296, false);
		class251.aClass304_2583.aLong3434 = Class584.method7047(-852559198) * 1195640203384682761L;
		if (i_1_ < 0 || i_1_ >= class296.anIntArray3274.length)
			throw new RuntimeException("");
		class251.aClass304_2583.anIntArray3433[i_1_] = i_0_;
		Class668.method8011(class251, 263642117);
	}

	public static void method7945(int i, String string, boolean bool, byte i_2_) {
		if (0 == i) {
			Class677.aClass167_8609 = Class219.method3105(0, Class399.aCanvas4127, CPUUsageSetting.aClass174_10892, Class175.anInterface24_1935, Class53.aClass385_598, Class402.aClass397_4204, Class237.aClass396_2422, Class540.aClass461_7161, ClientSetting.aClass536_Sub40_8843.antiAliasingSetting.method10156() * 2, -983900446);
			if (string != null) {
				Class677.aClass167_8609.method2000(1, 0);
				Class2 class2 = Class651.method7862(Class710_Sub43.aClass461_10940, Class35.anInt298 * 1743452435, 0, Class196.aClass410_2202, 1551196755);
				Class184 class184 = (Class677.aClass167_8609.method2089(class2, Class181.method2720(Class398.aClass461_4122, 1743452435 * Class35.anInt298, 0), true));
				Class477.method5751((byte) -100);
				Class306.method4120(string, true, Class677.aClass167_8609, class184, class2, (byte) 0);
			}
		} else {
			Class167 class167 = null;
			if (string != null) {
				class167 = Class219.method3105(0, Class399.aCanvas4127, CPUUsageSetting.aClass174_10892, Class175.anInterface24_1935, Class53.aClass385_598, Class402.aClass397_4204, Class237.aClass396_2422, Class540.aClass461_7161, 0, 1351324176);
				class167.method2000(1, 0);
				Class2 class2 = Class259.method3608(Class710_Sub43.aClass461_10940, Class35.anInt298 * 1743452435, 0, (byte) 91);
				Class184 class184 = (class167.method2089(class2, Class181.method2720(Class398.aClass461_4122, Class35.anInt298 * 1743452435, 0), true));
				Class477.method5751((byte) -113);
				Class306.method4120(string, true, class167, class184, class2, (byte) 0);
				try {
					class167.method2005(778784407);
					class167 = null;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			try {
				try {
					Class545.method6610(-1899357371);
					System.gc();
					Class677.aClass167_8609 = Class219.method3105(i, Class399.aCanvas4127, CPUUsageSetting.aClass174_10892, Class175.anInterface24_1935, Class53.aClass385_598, Class402.aClass397_4204, Class237.aClass396_2422, Class540.aClass461_7161, ClientSetting.aClass536_Sub40_8843.antiAliasingSetting.method10156() * 2, -1839673831);
					Class196.aClass410_2202 = new Class410(Class677.aClass167_8609, Class398.aClass461_4122, Class710_Sub43.aClass461_10940, Class308.method4135(648600930));
					if (Class677.aClass167_8609.method2009()) {
						boolean bool_3_ = true;
						try {
							bool_3_ = (Class458_Sub4.aClass536_Sub38_10336.anInt10684) * -853108975 > 256;
						} catch (Throwable throwable) {
							/* empty */
						}
						Class536_Sub25 class536_sub25;
						if (bool_3_)
							class536_sub25 = Class677.aClass167_8609.method2076(146800640);
						else
							class536_sub25 = Class677.aClass167_8609.method2076(104857600);
						Class677.aClass167_8609.method2077(class536_sub25);
					}
				} catch (Throwable throwable) {
					switch (i) {
					case 1:
						Class398.method4898(Class63.aClass63_705, (byte) 0);
						break;
					case 3:
						Class398.method4898(Class63.aClass63_715, (byte) 0);
						break;
					}
					if (throwable instanceof RuntimeException_Sub3) {
						ClientSetting.aClass536_Sub40_8843.defaultAntiAliasingSetting.method8350(0, -16777216);
						ClientSetting.aClass536_Sub40_8843.antiAliasingSetting.method8350(0, -16777216);
					}
					int i_4_ = ClientSetting.aClass536_Sub40_8843.toolkit.method10071();
					ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.toolkit, 0, (byte) 1);
					if (class167 != null) {
						try {
							class167.method2005(778784407);
							class167 = null;
						} catch (Throwable throwable_5_) {
							/* empty */
						}
					}
					Class545.method6610(-1600092135);
					System.gc();
					method7945(i_4_, string, bool, (byte) -95);
					if (null != class167) {
						try {
							class167.method2005(778784407);
						} catch (Throwable throwable_6_) {
							/* empty */
						}
					}
					return;
				}
				if (null != class167) {
					try {
						class167.method2005(778784407);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Exception object) {
				if (null != class167) {
					try {
						class167.method2005(778784407);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				throw object;
			}
		}
		if (bool)
			ClientSetting.aClass536_Sub40_8843.method9858((ClientSetting.aClass536_Sub40_8843.toolkit), !bool, (byte) 59);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.toolkit), i, (byte) 1);
		if (!bool)
			ClientSetting.aClass536_Sub40_8843.method9858((ClientSetting.aClass536_Sub40_8843.toolkit), !bool, (byte) 57);
		Class333_Sub3.method9229(-712411722);
		Class677.aClass167_8609.method2092(20000);
		Class677.aClass167_8609.method2106(32);
		client.aClass515_11066.method6263(872445774);
		if (Class677.aClass167_8609.method2013())
			Class651.method7863(ClientSetting.aClass536_Sub40_8843.bloomSetting.method10204(1867269829) == 1, (byte) 16);
		client.aClass515_11066.method6261(true, 2007522021);
		client.aClass515_11066.method6252(1796531619).method7581((byte) 8);
		Class40.method873(1855890559);
		client.aBool11015 = false;
		client.aBool11223 = false;
		client.aBool11026 = true;
		ObjTypeTransformation.aClass697Array7790 = null;
		Class677.aClass167_8609.method2039(0.0F, 1.0F);
	}

	static void method7946(IComponentDefinitions class251, Class161 class161, int i, int i_7_, int i_8_, int i_9_, Class143 class143, double d, Class261 class261, Class283 class283, byte i_10_) {
		if (class143 != null) {
			int i_11_;
			if (Class246.anInt2474 * 155362615 == 2)
				i_11_ = ((int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) -94) * 2607.5945876176133) + client.anInt11096 * -2011409073) & 0x3fff;
			else if (155362615 * Class246.anInt2474 == 6)
				i_11_ = (int) client.aFloat11106 & 0x3fff;
			else
				i_11_ = ((int) client.aFloat11106 + client.anInt11096 * -2011409073) & 0x3fff;
			int i_12_ = (Math.max(class251.anInt2573 * -1606950689 / 2, 223822141 * class251.anInt2574 / 2) + 10);
			int i_13_ = i_9_ * i_9_ + i_8_ * i_8_;
			if (i_13_ <= i_12_ * i_12_) {
				int i_14_ = Class447.anIntArray4906[i_11_];
				int i_15_ = Class447.anIntArray4921[i_11_];
				if (6 != Class246.anInt2474 * 155362615) {
					i_14_ = 256 * i_14_ / (client.anInt11098 * 1858649483 + 256);
					i_15_ = 256 * i_15_ / (256 + client.anInt11098 * 1858649483);
				}
				int i_16_ = i_14_ * i_9_ + i_15_ * i_8_ >> 14;
				int i_17_ = i_9_ * i_15_ - i_8_ * i_14_ >> 14;
				double d_18_ = d / 100.0;
				switch (897910875 * class261.anInt2842) {
				case 2:
					i = (i_16_ + (i + class251.anInt2573 * -1606950689 / 2) - (int) ((double) class143.method12() * d_18_));
					break;
				case 0:
					i = i_16_ + (i + -1606950689 * class251.anInt2573 / 2);
					break;
				case 1:
					i = (i_16_ + (i + -1606950689 * class251.anInt2573 / 2) - (int) ((double) (class143.method12() / 2) * d_18_));
					break;
				}
				switch (-53403555 * class283.anInt3180) {
				case 0:
					i_7_ = (class251.anInt2574 * 223822141 / 2 + i_7_ - i_17_ - (int) ((double) (class143.method1785() / 2) * d_18_));
					break;
				case 2:
					i_7_ = (class251.anInt2574 * 223822141 / 2 + i_7_ - i_17_ - (int) ((double) class143.method1785() * d_18_));
					break;
				case 1:
					i_7_ = 223822141 * class251.anInt2574 / 2 + i_7_ - i_17_;
					break;
				}
				if (null != class161) {
					if (d_18_ == 1.0)
						class143.method1730(i, i_7_, class161, i, i_7_);
					else
						class143.method1724(i, i_7_, (int) ((double) class143.method12() * d_18_), (int) ((double) class143.method1785() * d_18_));
				} else {
					if (1.0 == d_18_)
						class143.method1728(i, i_7_);
					class143.method1724(i, i_7_, (int) ((double) class143.method12() * d_18_), (int) ((double) class143.method1785() * d_18_));
				}
			}
		}
	}
}

/* Class389_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;

public class Class389_Sub2 extends Class389 {
	public int anInt10168;
	public int anInt10169;
	static int anInt10170;

	public static Class389 method15801(RSByteBuffer class527_sub38) {
		Class389 class389 = Class397.method6514(class527_sub38, 1780567452);
		int i = class527_sub38.readInt();
		int i_0_ = class527_sub38.readInt();
		return new Class389_Sub2(class389.aClass400_3991, class389.aClass384_3994, class389.anInt3993 * -1339829793, -827519441 * class389.anInt3992, -236249659 * class389.anInt3995, class389.anInt3996 * 1859543809, 449413251 * class389.anInt3997, class389.anInt3998 * -1063745743, 1002599463 * class389.anInt3999, i, i_0_);
	}

	public Class396 method334(int i) {
		return Class396.aClass396_4108;
	}

	Class389_Sub2(Class400 class400, Class384 class384, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class400, class384, i, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		anInt10169 = i_7_ * 1427645965;
		anInt10168 = i_8_ * 153260227;
	}

	public static Class389 method15802(RSByteBuffer class527_sub38) {
		Class389 class389 = Class397.method6514(class527_sub38, -1790744973);
		int i = class527_sub38.readInt();
		int i_9_ = class527_sub38.readInt();
		return new Class389_Sub2(class389.aClass400_3991, class389.aClass384_3994, class389.anInt3993 * -1339829793, -827519441 * class389.anInt3992, -236249659 * class389.anInt3995, class389.anInt3996 * 1859543809, 449413251 * class389.anInt3997, class389.anInt3998 * -1063745743, 1002599463 * class389.anInt3999, i, i_9_);
	}

	public static Class389 method15803(RSByteBuffer class527_sub38) {
		Class389 class389 = Class397.method6514(class527_sub38, -1412659609);
		int i = class527_sub38.readInt();
		int i_10_ = class527_sub38.readInt();
		return new Class389_Sub2(class389.aClass400_3991, class389.aClass384_3994, class389.anInt3993 * -1339829793, -827519441 * class389.anInt3992, -236249659 * class389.anInt3995, class389.anInt3996 * 1859543809, 449413251 * class389.anInt3997, class389.anInt3998 * -1063745743, 1002599463 * class389.anInt3999, i, i_10_);
	}

	public static Class389 method15804(RSByteBuffer class527_sub38) {
		Class389 class389 = Class397.method6514(class527_sub38, -419663495);
		int i = class527_sub38.readInt();
		int i_11_ = class527_sub38.readInt();
		return new Class389_Sub2(class389.aClass400_3991, class389.aClass384_3994, class389.anInt3993 * -1339829793, -827519441 * class389.anInt3992, -236249659 * class389.anInt3995, class389.anInt3996 * 1859543809, 449413251 * class389.anInt3997, class389.anInt3998 * -1063745743, 1002599463 * class389.anInt3999, i, i_11_);
	}

	public Class396 method333() {
		return Class396.aClass396_4108;
	}

	public static Class389 method15805(RSByteBuffer class527_sub38) {
		Class389 class389 = Class397.method6514(class527_sub38, -172511331);
		int i = class527_sub38.readInt();
		int i_12_ = class527_sub38.readInt();
		return new Class389_Sub2(class389.aClass400_3991, class389.aClass384_3994, class389.anInt3993 * -1339829793, -827519441 * class389.anInt3992, -236249659 * class389.anInt3995, class389.anInt3996 * 1859543809, 449413251 * class389.anInt3997, class389.anInt3998 * -1063745743, 1002599463 * class389.anInt3999, i, i_12_);
	}

	static void method15806(int i) {
		synchronized (Class678.aclient8619) {
			if (Class56.aFrame711 != null) {
				/* empty */
			} else {
				Container container = Class198.method3745((byte) 31);
				if (null == container) {
					/* empty */
				} else {
					Class358.anInt3831 = container.getSize().width * -1411879007;
					Class76.anInt796 = container.getSize().height * -1322100701;
					if (Class514.aFrame7012 == container) {
						Insets insets = Class514.aFrame7012.getInsets();
						Class358.anInt3831 -= -1411879007 * (insets.right + insets.left);
						Class76.anInt796 -= (insets.top + insets.bottom) * -1322100701;
					}
					if (-21941151 * Class358.anInt3831 <= 0)
						Class358.anInt3831 = -1411879007;
					if (Class76.anInt796 * -239790197 <= 0)
						Class76.anInt796 = -1322100701;
					if (Class81.method1574((byte) 3) != 1)
						Class295.method5335(-736879272);
					else {
						Class289.anInt3223 = client.anInt11158 * 70008131;
						client.anInt7019 = -63687167 * ((-21941151 * Class358.anInt3831 - client.anInt11158 * -1844600635) / 2);
						Class611.anInt8009 = client.anInt11058 * -1951628069;
						client.anInt7020 = 0;
					}
					if (Class73.aClass677_790 != Class677.aClass677_8596 && -1803844265 * Class289.anInt3223 < 1024 && Class611.anInt8009 * -471480167 >= 768) {
						/* empty */
					}
					Class451.aCanvas4939.setSize((Class289.anInt3223 * -1803844265), (Class611.anInt8009 * -471480167));
					if (Class402.aClass180_4150 != null) {
						Class402.aClass180_4150.method3159(Class451.aCanvas4939, -1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009, -2137288048);
						Class329.method5810(Class402.aClass180_4150, Class234.method4347(-1408626088));
					}
					if (container == Class514.aFrame7012) {
						Insets insets = Class514.aFrame7012.getInsets();
						Class451.aCanvas4939.setLocation(client.anInt7019 * -416298495 + insets.left, client.anInt7020 * -1313216019 + insets.top);
					} else
						Class451.aCanvas4939.setLocation((-416298495 * client.anInt7019), (-1313216019 * client.anInt7020));
					Class225.method4191(406942694);
					if (client.anInt11237 * -2119864417 != -1)
						Class316_Sub1.method15721(true, -1423252757);
					Class19.method767((byte) -32);
				}
			}
		}
	}
}

/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

class Class154 implements Runnable {
	Class360_Sub2 this$0;
	public static JS5ResourceProvider aClass461_1720;

	public void method1870() {
		try {
			while (!this$0.aBool10270) {
				HashMap hashmap = this$0.method9317((byte) -2);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5912(128000);
					}
				}
				Class212.method3067(50L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) 10);
		}
	}

	public void run() {
		try {
			while (!this$0.aBool10270) {
				HashMap hashmap = this$0.method9317((byte) -37);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5912(128000);
					}
				}
				Class212.method3067(50L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) 43);
		}
	}

	Class154(Class360_Sub2 class360_sub2) {
		this$0 = class360_sub2;
	}

	static void method1871(int i) {
		if (null != Class45.aClass42_525) {
			try {
				int i_0_;
				if (0 == Class45.anInt527 * -507654277)
					i_0_ = 250;
				else
					i_0_ = 2000;
				Class45.anInt523 += 790597225;
				if (Class45.anInt523 * -358161959 > i_0_)
					Class442.method5336((byte) 1);
				if (Class45.aClass42_525 == Class42.aClass42_508) {
					client.aClass106_11218.method1420(Class506.createRSSocket(Class23.aClass5_230.createSocket((byte) 20), 40000, (byte) 59), Class23.aClass5_230.aString112, -1933050734);
					client.aClass106_11218.method1407(-452273809);
					Class536_Sub23 class536_sub23 = Class458_Sub3.method9359(1304470174);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(1258126983 * Class420.aClass420_4584.connectionType);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(0, -1778059594);
					int i_1_ = (class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(876, -1778059594);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(1, -1778059594);
					Class45.anIntArray526 = Class62.method1053(class536_sub23, 1719876200);
					int i_2_ = (-810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off));
					class536_sub23.aClass536_Sub33_Sub2_10528.writeString(client.GAMEPACK_KEY);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(1051867059 * client.anInt10987, -1778059594);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(client.anInt10991 * -811133827);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(client.anInt11017 * -599766855);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeString(Class210.aString2260);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class459.CLIENT_PARAMS.method78());
					class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(client.aClass670_11043.anInt8567 * 273023065);
					Class502.method6042((class536_sub23.aClass536_Sub33_Sub2_10528), (byte) 87);
					String string = client.aString10996;
					class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(null == string ? 0 : 1);
					if (string != null)
						class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
					Class458_Sub4.aClass536_Sub38_10336.method9822(class536_sub23.aClass536_Sub33_Sub2_10528, 65536);
					class536_sub23.aClass536_Sub33_Sub2_10528.off += -681738691;
					class536_sub23.aClass536_Sub33_Sub2_10528.method9725(Class45.anIntArray526, i_2_, -810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off), -365428796);
					class536_sub23.aClass536_Sub33_Sub2_10528.method9698((-810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off) - i_1_), 1082460538);
					client.aClass106_11218.method1409(class536_sub23, 1108355328);
					client.aClass106_11218.method1408(864600008);
					Class45.aClass42_525 = Class42.aClass42_507;
				}
				if (Class45.aClass42_525 == Class42.aClass42_507) {
					if (client.aClass106_11218.method1413((short) 16381) == null)
						Class442.method5336((byte) 1);
					else if (client.aClass106_11218.method1413((short) 16167).bitsRemaining(1, -1036446546)) {
						client.aClass106_11218.method1413((short) -17086).copyBuffer((client.aClass106_11218.byteBuffer.buffer), 0, 1, -1779776192);
						Class45.aClass709_521 = ((Class709) Class682.method8091(Class184_Sub6.method9084(2053659211), ((client.aClass106_11218.byteBuffer.buffer[0]) & 0xff), 1858049507));
						if (Class709.aClass709_8832 == Class45.aClass709_521) {
							client.aClass106_11218.aClass15_1258 = new Class15(Class45.anIntArray526);
							int[] is = new int[4];
							for (int i_3_ = 0; i_3_ < 4; i_3_++)
								is[i_3_] = Class45.anIntArray526[i_3_] + 50;
							client.aClass106_11218.aClass15_1260 = new Class15(is);
							new Class15(is);
							client.aClass106_11218.byteBuffer.method10782(client.aClass106_11218.aClass15_1260, -2019890215);
							Class673.method8026(11, -1798113843);
							client.aClass106_11218.method1407(-337933597);
							client.aClass106_11218.byteBuffer.off = 0;
							client.aClass106_11218.aClass422_1270 = null;
							client.aClass106_11218.aClass422_1271 = null;
							client.aClass106_11218.aClass422_1274 = null;
							client.aClass106_11218.anInt1264 = 0;
							Class465_Sub1.aClass96_10352.aClass610_1164.method7271(-1056104537);
							Class688_Sub3.method10358((byte) -104);
						} else
							client.aClass106_11218.method1418(873323420);
						client.aClass106_11218.currentPacket = null;
						Class45.aClass42_525 = null;
					}
				}
			} catch (IOException ioexception) {
				Class442.method5336((byte) 1);
			}
		}
	}

	static final void method1872(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class151.aBool1712 ? 1 : 0;
	}

	static void method1873(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i) {
		if (class649_sub1_sub5_sub1 instanceof NPC) {
			NPC class649_sub1_sub5_sub1_sub1 = (NPC) class649_sub1_sub5_sub1;
			if (class649_sub1_sub5_sub1_sub1.aClass296_12174 != null)
				Class11.method620(class649_sub1_sub5_sub1_sub1, (class649_sub1_sub5_sub1_sub1.aByte10839 != (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)), (byte) -44);
		} else if (class649_sub1_sub5_sub1 instanceof Player) {
			Player class649_sub1_sub5_sub1_sub2 = (Player) class649_sub1_sub5_sub1;
			Class451.method5433(class649_sub1_sub5_sub1_sub2, (class649_sub1_sub5_sub1_sub2.aByte10839 != (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)), 1460237797);
		}
	}

	static final String[] method1874(String[] strings, int i) {
		String[] strings_4_ = new String[5];
		for (int i_5_ = 0; i_5_ < 5; i_5_++) {
			strings_4_[i_5_] = new StringBuilder().append(i_5_).append(" ").toString();
			if (strings != null && null != strings[i_5_])
				strings_4_[i_5_] = new StringBuilder().append(strings_4_[i_5_]).append(strings[i_5_]).toString();
		}
		return strings_4_;
	}

	public static void method1875(byte i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.defaultRemoveRoofSetting), 2, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.removeRoofSetting), 2, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.groundDecorationSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.groundBlendingSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.idleAnimationSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.flickeringSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.spotShadowSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.textureSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.shadowSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.lightingDetailSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.waterDetailSetting), 0, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.fogSetting), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.defaultAntiAliasingSetting), 0, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.antiAliasingSetting), 0, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub4_10759), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.buildAreaSetting, 2043381743 * Class287.aClass287_3208.anInt3207, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.bloomSetting), 0, (byte) 1);
		if (Class677.aClass167_8609 != null && Class677.aClass167_8609.method2013() && Class677.aClass167_8609.method2124())
			Class677.aClass167_8609.method2123();
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub25_10735), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.animationDetailSetting), 1, (byte) 1);
		Class652.method7869(-484022156);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub33_10762), 1, (byte) 1);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub43_10780), 3, (byte) 1);
		Class184.method2769(1160866938);
		client.aClass515_11066.method6252(1796531619).method7581((byte) 8);
		client.aBool11026 = true;
	}
}

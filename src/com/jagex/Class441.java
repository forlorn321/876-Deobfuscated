/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class441 implements Interface5 {
	JS5ResourceProvider aClass461_4875;
	String aString4876;

	public Class50 method49() {
		return Class50.aClass50_581;
	}

	Class441(JS5ResourceProvider class461, String string) {
		aClass461_4875 = class461;
		aString4876 = string;
	}

	public Class50 method50(byte i) {
		return Class50.aClass50_581;
	}

	public int method47() {
		if (aClass461_4875.method5602(aString4876, -531761284))
			return 100;
		return 0;
	}

	public Class50 method46() {
		return Class50.aClass50_581;
	}

	public Class50 method45() {
		return Class50.aClass50_581;
	}

	public int method48(int i) {
		if (aClass461_4875.method5602(aString4876, -1501345660))
			return 100;
		return 0;
	}

	static void method5328(Class692 class692, short i) {
		Exception_Sub3.aClass692_11348 = class692;
	}

	static final void method5329(Class668 class668, int i) {
		throw new RuntimeException("");
	}

	static final void method5330(int i) {
		Class668.method8011(client.aClass251_10992, 263642117);
		Class360.anInt3827 += 822231753;
		if (!client.aBool11208 || !client.aBool11274) {
			if (Class360.anInt3827 * 2018211705 > 1) {
				client.aClass251_10992 = null;
				client.aClass251_11199 = null;
			}
		} else {
			int i_0_ = Class329.aClass550_3601.method6656(-1012647454);
			int i_1_ = Class329.aClass550_3601.method6657(-1933284303);
			i_0_ -= -1721422785 * client.anInt11281;
			i_1_ -= client.anInt11201 * 671669755;
			if (i_0_ < client.anInt11204 * 1828303855)
				i_0_ = client.anInt11204 * 1828303855;
			if (client.aClass251_10992.anInt2573 * -1606950689 + i_0_ > (171675909 * client.anInt11206 + 1828303855 * client.anInt11204))
				i_0_ = (client.anInt11204 * 1828303855 + client.anInt11206 * 171675909 - -1606950689 * client.aClass251_10992.anInt2573);
			if (i_1_ < client.anInt11205 * 1260646355)
				i_1_ = client.anInt11205 * 1260646355;
			if (client.aClass251_10992.anInt2574 * 223822141 + i_1_ > (1260646355 * client.anInt11205 + client.anInt11207 * 904217971))
				i_1_ = (904217971 * client.anInt11207 + client.anInt11205 * 1260646355 - client.aClass251_10992.anInt2574 * 223822141);
			int i_2_;
			int i_3_;
			if (Class107.aClass251_1323 == client.aClass251_11199) {
				i_2_ = i_0_;
				i_3_ = i_1_;
			} else {
				i_2_ = (client.aClass251_11199.anInt2581 * 1428895931 + (i_0_ - 1828303855 * client.anInt11204));
				i_3_ = (client.aClass251_11199.anInt2584 * -2092413585 + (i_1_ - client.anInt11205 * 1260646355));
			}
			if (!Class329.aClass550_3601.method6655((short) 255)) {
				if (client.aBool11121) {
					Class270.method3717(-919424081);
					if (null != client.aClass251_10992.onDragCompleteHook) {
						Class536_Sub42 class536_sub42 = new Class536_Sub42();
						class536_sub42.aClass251_10804 = client.aClass251_10992;
						class536_sub42.anInt10803 = 1761425895 * i_2_;
						class536_sub42.anInt10800 = -1275012151 * i_3_;
						IComponentDefinitions class251 = client.method10382(client.aClass251_10992);
						IComponentDefinitions class251_4_ = client.aClass251_11202;
						boolean bool = false;
						for (/**/; (null != class251_4_ && -1 != class251_4_.parentLayer * -1940204141 && null != class251); class251_4_ = (Class463.aClass234Array5227[-1591767037 * class251_4_.anInt2559 >> 16].icomponentDefinitions[(-1940204141 * class251_4_.parentLayer & 0xffff)])) {
							if (-1591767037 * class251.anInt2559 == -1591767037 * class251_4_.anInt2559) {
								bool = true;
								break;
							}
						}
						if (null != class251_4_ && null != class251 && class251 != Class107.aClass251_1323 && !bool)
							class536_sub42.aClass251_10806 = Class107.aClass251_1323;
						else
							class536_sub42.aClass251_10806 = client.aClass251_11202;
						class536_sub42.anObjectArray10802 = client.aClass251_10992.onDragCompleteHook;
						PlayerStat.method7388(class536_sub42, -1442250412);
					}
					if (client.aClass251_11202 != null && client.method10382(client.aClass251_10992) != null)
						Class578.method7008(client.aClass251_10992, client.aClass251_11202, -2145704482);
				} else if ((1 == 1862126853 * client.anInt11040 || Class622.method7417((byte) -67)) && 1780207751 * Class70.anInt760 > 2)
					GameMode.method8014((client.anInt11209 * 1961670097 + client.anInt11281 * -1721422785), (client.anInt11210 * 411701121 + client.anInt11201 * 671669755), -1978761146);
				else if (Clan.method9518(419371655))
					GameMode.method8014((1961670097 * client.anInt11209 + -1721422785 * client.anInt11281), (411701121 * client.anInt11210 + 671669755 * client.anInt11201), 937499902);
				client.aClass251_10992 = null;
				client.aClass251_11199 = null;
			} else {
				if (Class360.anInt3827 * 2018211705 > client.aClass251_10992.dragDeadTime * 1330942333) {
					int i_5_ = i_0_ - 1961670097 * client.anInt11209;
					int i_6_ = i_1_ - 411701121 * client.anInt11210;
					if (i_5_ > 632017109 * client.aClass251_10992.dragDeadZone || i_5_ < -(632017109 * client.aClass251_10992.dragDeadZone) || i_6_ > 632017109 * client.aClass251_10992.dragDeadZone || i_6_ < -(client.aClass251_10992.dragDeadZone * 632017109))
						client.aBool11121 = true;
				}
				if (null != client.aClass251_10992.onDragHook && client.aBool11121) {
					Class536_Sub42 class536_sub42 = new Class536_Sub42();
					class536_sub42.aClass251_10804 = client.aClass251_10992;
					class536_sub42.anInt10803 = i_2_ * 1761425895;
					class536_sub42.anInt10800 = -1275012151 * i_3_;
					class536_sub42.anObjectArray10802 = client.aClass251_10992.onDragHook;
					PlayerStat.method7388(class536_sub42, 307961802);
				}
			}
		}
	}

	static final void method5331(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_7_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_8_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass485ArrayArray11266[i_8_][i_7_].method5850(-49644043);
	}

	public static Class308 method5332(int i, byte i_9_) {
		if (-388744715 * Class308.aClass308_3456.anInt3455 == i)
			return Class308.aClass308_3456;
		if (Class308.aClass308_3457.anInt3455 * -388744715 == i)
			return Class308.aClass308_3457;
		return null;
	}
}

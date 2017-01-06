/* Class586 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;

public class Class586 {
	static LinkedList aLinkedList7708 = new LinkedList();
	public static JS5ResourceProvider aClass461_7709;
	static Class106 aClass106_7710;

	Class586() throws Throwable {
		throw new Error();
	}

	public static void method7052(int i) {
		Class467.method5689(new Class585(i), -1613154317);
	}

	public static void method7053(int i, int i_0_, int i_1_) {
		Class467.method5689(new Class41_Sub1(i, i_0_, i_1_, client.handshakeStage * -275818405, -2073269917 * Class176.aClass460_1936.anInt5195, 917679433 * Class176.aClass460_1936.anInt5196, Class176.aClass460_1936.method5528((byte) 1), Class176.aClass460_1936.method5523(-2015865302), Class246.aClass466_2473.method5675(1673118807)), -2045597697);
	}

	public static void method7054(int i, int i_2_, int i_3_) {
		Class467.method5689(new Class41_Sub1(i, i_2_, i_3_, client.handshakeStage * -275818405, -2073269917 * Class176.aClass460_1936.anInt5195, 917679433 * Class176.aClass460_1936.anInt5196, Class176.aClass460_1936.method5528((byte) 1), Class176.aClass460_1936.method5523(1669743846), Class246.aClass466_2473.method5675(1966283679)), -1070872449);
	}

	public static void method7055(int i) {
		Class467.method5689(new Class585(i), -1447475330);
	}

	public static void method7056(int i, int i_4_, int i_5_) {
		Class467.method5689(new Class41_Sub1(i, i_4_, i_5_, client.handshakeStage * -275818405, -2073269917 * Class176.aClass460_1936.anInt5195, 917679433 * Class176.aClass460_1936.anInt5196, Class176.aClass460_1936.method5528((byte) 1), Class176.aClass460_1936.method5523(-919492330), Class246.aClass466_2473.method5675(1988536340)), -1722800986);
	}

	public static void method7057(int i, int i_6_, int i_7_) {
		Class467.method5689(new Class41_Sub1(i, i_6_, i_7_, client.handshakeStage * -275818405, -2073269917 * Class176.aClass460_1936.anInt5195, 917679433 * Class176.aClass460_1936.anInt5196, Class176.aClass460_1936.method5528((byte) 1), Class176.aClass460_1936.method5523(1481059752), Class246.aClass466_2473.method5675(1414919576)), -1047665384);
	}

	public static void method7058() {
		if ((9 == client.anInt11101 * -708374433 || client.anInt11101 * -708374433 == 10) && null != client.aClass106_11322) {
			for (;;) {
				Interface68 interface68 = (Interface68) aLinkedList7708.poll();
				if (interface68 == null)
					break;
				interface68.method206(731986243);
			}
		}
	}

	static final void method7059(Class668 class668, int i) {
		client.aBool11200 = true;
		Class625.method7449((short) -2804);
	}

	static final void method7060(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_8_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_9_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class273.method3730(7, i_8_, i_9_, "", -1903806756);
	}

	public static final void method7061(String string, boolean bool, int i) {
		int i_10_ = client.aBool11290 ? 400 : 100;
		if (null != string) {
			if (1857706641 * client.anInt11293 >= i_10_)
				Class173_Sub1.method8634(4, (client.aBool11290 ? Class38.aClass38_452.method840(Class459.CLIENT_PARAMS, 1351190051) : Class38.aClass38_470.method840(Class459.CLIENT_PARAMS, 1728387528)), 1335636841);
			else {
				String string_11_ = Class473.method5740(string, Class302.aClass74_3406, (byte) -127);
				if (null != string_11_) {
					for (int i_12_ = 0; i_12_ < 1857706641 * client.anInt11293; i_12_++) {
						Class30 class30 = client.aClass30Array11295[i_12_];
						String string_13_ = Class473.method5740(class30.aString263, Class302.aClass74_3406, (byte) -113);
						if (string_13_ != null && string_13_.equals(string_11_)) {
							Class173_Sub1.method8634(4, new StringBuilder().append(string).append(Class38.aClass38_454.method840(Class459.CLIENT_PARAMS, 1506934663)).toString(), -320170583);
							return;
						}
						if (null != class30.aString262) {
							String string_14_ = Class473.method5740(class30.aString262, Class302.aClass74_3406, (byte) -99);
							if (string_14_ != null && string_14_.equals(string_11_)) {
								Class173_Sub1.method8634(4, new StringBuilder().append(string).append(Class38.aClass38_454.method840(Class459.CLIENT_PARAMS, 1703675556)).toString(), 1220406469);
								return;
							}
						}
					}
					for (int i_15_ = 0; i_15_ < client.anInt11288 * 142551095; i_15_++) {
						Class31 class31 = client.aClass31Array11291[i_15_];
						String string_16_ = Class473.method5740(class31.aString266, Class302.aClass74_3406, (byte) -112);
						if (null != string_16_ && string_16_.equals(string_11_)) {
							Class173_Sub1.method8634(4, new StringBuilder().append(Class38.aClass38_460.method840(Class459.CLIENT_PARAMS, 1640174149)).append(string).append(Class38.aClass38_340.method840(Class459.CLIENT_PARAMS, 1479968765)).toString(), 301639759);
							return;
						}
						if (class31.aString267 != null) {
							String string_17_ = Class473.method5740(class31.aString267, Class302.aClass74_3406, (byte) -44);
							if (null != string_17_ && string_17_.equals(string_11_)) {
								Class173_Sub1.method8634(4, new StringBuilder().append(Class38.aClass38_460.method840(Class459.CLIENT_PARAMS, 1370804959)).append(string).append(Class38.aClass38_340.method840(Class459.CLIENT_PARAMS, 1770754178)).toString(), 1355539697);
								return;
							}
						}
					}
					if (Class473.method5740((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.username), Class302.aClass74_3406, (byte) -9).equals(string_11_))
						Class173_Sub1.method8634(4, (Class38.aClass38_379.method840(Class459.CLIENT_PARAMS, 2056636684)), 391318944);
					else {
						Class106 class106 = Class536_Sub41.method9871(2077853800);
						Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4502, class106.aClass15_1258, 1006023601);
						class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class555.method6802(string, 1311863979) + 1);
						class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
						class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(bool ? 1 : 0);
						class106.method1409(class536_sub23, 1268430293);
					}
				}
			}
		}
	}

	public static final void method7062(int i) {
		for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10320.method8308(1867269829)); null != class536_sub2; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10320.method8311(2103016698)) {
			if (!class536_sub2.aBool10319) {
				class536_sub2.aBool10318 = true;
				if (848380705 * class536_sub2.anInt10309 >= 0 && -499217723 * class536_sub2.anInt10312 >= 0 && (848380705 * class536_sub2.anInt10309 < client.aClass515_11066.method6321((byte) -49)) && (-499217723 * class536_sub2.anInt10312 < client.aClass515_11066.method6243(177401017)))
					Class601.method7168(class536_sub2, 16711935);
			} else
				class536_sub2.method6484();
		}
		for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10321.method8308(1867269829)); class536_sub2 != null; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10321.method8311(1088670935)) {
			if (!class536_sub2.aBool10319)
				class536_sub2.aBool10318 = true;
			else
				class536_sub2.method6484();
		}
	}

	static final Class668 method7063(byte i) {
		if (Class685.anInt8663 * 620750811 == Class685.anArrayList8662.size())
			Class685.anArrayList8662.add(new Class668());
		Class668 class668 = ((Class668) Class685.anArrayList8662.get(Class685.anInt8663 * 620750811));
		Class685.anInt8663 += 1228520531;
		return class668;
	}

	static boolean method7064(TwitchEvent twitchevent, long l) {
		if (!Class575.aBool7657) {
			switch (twitchevent.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}
		if (twitchevent.eventType == 33) {
			if (null == Class575.aTwitchWebcamFrameData7651)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_18_ = (Class536_Sub42.aTwitchTV10811.GetWebcamFrameData(i, Class575.aTwitchWebcamFrameData7651));
			if (0 == i_18_) {
				if (Class575.aBool7677)
					Class575.aTwitchWebcamFrameData7651.method8378();
				if (Class575.aBool7653)
					Class575.aTwitchWebcamFrameData7651.method8379();
				Class555.method6798(-820363456);
				Class575.aLong7675 = 7973063499720905353L * l;
				Class397.method4896(33, 0, (byte) -110);
			} else
				Class575.aClass143_7676 = null;
			return false;
		}
		if (30 == twitchevent.eventType) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (i == 0 || 1 == i)
				Class153.method1865(-1835391594);
			else if (i == 2)
				Class575.aLong7675 = l * 7973063499720905353L;
		}
		if (twitchevent.eventType == 34) {
			Class325.aTwitchEventLiveStreams3561 = (TwitchEventLiveStreams) twitchevent;
			Class397.method4896(34, 0, (byte) -73);
		}
		return true;
	}

	static final void method7065(Class668 class668, short i) {
		int i_19_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.aClass710_Sub25_10735.method8348(i_19_, -1102005131);
	}
}

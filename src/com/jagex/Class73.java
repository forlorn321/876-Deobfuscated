/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class73 {
	public Interface47[] anInterface47Array789;
	public static Class677 aClass677_790;

	void method1501(RSByteBuffer class527_sub38) {
		anInterface47Array789 = new Interface47[class527_sub38.readUnsignedByte()];
		Class396[] class396s = Class166.method2667(-1469798952);
		for (int i = 0; i < anInterface47Array789.length; i++)
			anInterface47Array789[i] = method1504(class527_sub38, class396s[class527_sub38.readUnsignedByte()], 1828067114);
	}

	void method1502(RSByteBuffer class527_sub38, byte i) {
		anInterface47Array789 = new Interface47[class527_sub38.readUnsignedByte()];
		Class396[] class396s = Class166.method2667(-1264913519);
		for (int i_0_ = 0; i_0_ < anInterface47Array789.length; i_0_++)
			anInterface47Array789[i_0_] = method1504(class527_sub38, class396s[class527_sub38.readUnsignedByte()], 1625750037);
	}

	void method1503(RSByteBuffer class527_sub38) {
		anInterface47Array789 = new Interface47[class527_sub38.readUnsignedByte()];
		Class396[] class396s = Class166.method2667(-961228572);
		for (int i = 0; i < anInterface47Array789.length; i++)
			anInterface47Array789[i] = method1504(class527_sub38, class396s[class527_sub38.readUnsignedByte()], 1694892431);
	}

	Interface47 method1504(RSByteBuffer class527_sub38, Class396 class396, int i) {
		if (Class396.aClass396_4109 == class396)
			return Class346.method6160(class527_sub38, -125591960);
		if (Class396.aClass396_4108 == class396)
			return Class99.method1765(class527_sub38, -2028425897);
		if (class396 == Class396.aClass396_4117)
			return Class387.method6442(class527_sub38, 859154750);
		if (Class396.aClass396_4111 == class396)
			return Class390.method6473(class527_sub38, (byte) 43);
		if (Class396.aClass396_4112 == class396)
			return Class235.method4357(class527_sub38, (byte) 18);
		if (class396 == Class396.aClass396_4107)
			return Class508.method8277(class527_sub38, -1022827278);
		if (class396 == Class396.aClass396_4110)
			return Class624.method10334(class527_sub38, 1813349801);
		if (class396 == Class396.aClass396_4114)
			return Class214.method3904(class527_sub38, 1605200888);
		if (class396 == Class396.aClass396_4115)
			return Class641.method10707(class527_sub38, -1228905830);
		if (Class396.aClass396_4116 == class396)
			return Class655.method10967(class527_sub38, -660538958);
		if (class396 == Class396.aClass396_4113)
			return Class581.method9667(class527_sub38, 72306252);
		return null;
	}

	Interface47 method1505(RSByteBuffer class527_sub38, Class396 class396) {
		if (Class396.aClass396_4109 == class396)
			return Class346.method6160(class527_sub38, -654565836);
		if (Class396.aClass396_4108 == class396)
			return Class99.method1765(class527_sub38, -1797727765);
		if (class396 == Class396.aClass396_4117)
			return Class387.method6442(class527_sub38, 1036937645);
		if (Class396.aClass396_4111 == class396)
			return Class390.method6473(class527_sub38, (byte) 118);
		if (Class396.aClass396_4112 == class396)
			return Class235.method4357(class527_sub38, (byte) 41);
		if (class396 == Class396.aClass396_4107)
			return Class508.method8277(class527_sub38, -1870591491);
		if (class396 == Class396.aClass396_4110)
			return Class624.method10334(class527_sub38, -424143649);
		if (class396 == Class396.aClass396_4114)
			return Class214.method3904(class527_sub38, 1231663919);
		if (class396 == Class396.aClass396_4115)
			return Class641.method10707(class527_sub38, -1240099633);
		if (Class396.aClass396_4116 == class396)
			return Class655.method10967(class527_sub38, -463504070);
		if (class396 == Class396.aClass396_4113)
			return Class581.method9667(class527_sub38, 1824663321);
		return null;
	}

	Interface47 method1506(RSByteBuffer class527_sub38, Class396 class396) {
		if (Class396.aClass396_4109 == class396)
			return Class346.method6160(class527_sub38, -1014853236);
		if (Class396.aClass396_4108 == class396)
			return Class99.method1765(class527_sub38, -2059914503);
		if (class396 == Class396.aClass396_4117)
			return Class387.method6442(class527_sub38, -709586545);
		if (Class396.aClass396_4111 == class396)
			return Class390.method6473(class527_sub38, (byte) 107);
		if (Class396.aClass396_4112 == class396)
			return Class235.method4357(class527_sub38, (byte) 20);
		if (class396 == Class396.aClass396_4107)
			return Class508.method8277(class527_sub38, -2081307700);
		if (class396 == Class396.aClass396_4110)
			return Class624.method10334(class527_sub38, 1085169195);
		if (class396 == Class396.aClass396_4114)
			return Class214.method3904(class527_sub38, 2028535246);
		if (class396 == Class396.aClass396_4115)
			return Class641.method10707(class527_sub38, 1059067141);
		if (Class396.aClass396_4116 == class396)
			return Class655.method10967(class527_sub38, -1817707533);
		if (class396 == Class396.aClass396_4113)
			return Class581.method9667(class527_sub38, 1365179563);
		return null;
	}

	Interface47 method1507(RSByteBuffer class527_sub38, Class396 class396) {
		if (Class396.aClass396_4109 == class396)
			return Class346.method6160(class527_sub38, 730302820);
		if (Class396.aClass396_4108 == class396)
			return Class99.method1765(class527_sub38, -2042846166);
		if (class396 == Class396.aClass396_4117)
			return Class387.method6442(class527_sub38, 379402238);
		if (Class396.aClass396_4111 == class396)
			return Class390.method6473(class527_sub38, (byte) 67);
		if (Class396.aClass396_4112 == class396)
			return Class235.method4357(class527_sub38, (byte) -40);
		if (class396 == Class396.aClass396_4107)
			return Class508.method8277(class527_sub38, -1813129945);
		if (class396 == Class396.aClass396_4110)
			return Class624.method10334(class527_sub38, 349362290);
		if (class396 == Class396.aClass396_4114)
			return Class214.method3904(class527_sub38, 1379306344);
		if (class396 == Class396.aClass396_4115)
			return Class641.method10707(class527_sub38, -583527614);
		if (Class396.aClass396_4116 == class396)
			return Class655.method10967(class527_sub38, -591364002);
		if (class396 == Class396.aClass396_4113)
			return Class581.method9667(class527_sub38, -744197804);
		return null;
	}

	Class73() {
		/* empty */
	}

	Interface47 method1508(RSByteBuffer class527_sub38, Class396 class396) {
		if (Class396.aClass396_4109 == class396)
			return Class346.method6160(class527_sub38, -1903160268);
		if (Class396.aClass396_4108 == class396)
			return Class99.method1765(class527_sub38, -1894435829);
		if (class396 == Class396.aClass396_4117)
			return Class387.method6442(class527_sub38, -6207863);
		if (Class396.aClass396_4111 == class396)
			return Class390.method6473(class527_sub38, (byte) 35);
		if (Class396.aClass396_4112 == class396)
			return Class235.method4357(class527_sub38, (byte) -85);
		if (class396 == Class396.aClass396_4107)
			return Class508.method8277(class527_sub38, -1326423354);
		if (class396 == Class396.aClass396_4110)
			return Class624.method10334(class527_sub38, -410068418);
		if (class396 == Class396.aClass396_4114)
			return Class214.method3904(class527_sub38, 2076560889);
		if (class396 == Class396.aClass396_4115)
			return Class641.method10707(class527_sub38, 1633029039);
		if (Class396.aClass396_4116 == class396)
			return Class655.method10967(class527_sub38, -540176908);
		if (class396 == Class396.aClass396_4113)
			return Class581.method9667(class527_sub38, 1875120470);
		return null;
	}

	static void method1509(int i, int i_1_) {
		if (Class204.aClass527_Sub31_2213.aClass700_Sub41_10626.method17310(-1560657815) == 0)
			i = -1;
		if (-1322772099 * client.anInt11171 != i) {
			if (i != -1) {
				Class650 class650 = ((Class650) Class312.aClass24_Sub11_3497.method81(i, 1430862258));
				Class185 class185 = class650.method10856(-2079914321);
				if (class185 != null) {
					Class330.aClass513_3609.setcustomcursor(Class451.aCanvas4939, class185.method3584(true), class185.method3576(), class185.method3577(), new Point(1457650385 * class650.anInt8374, class650.anInt8375 * 1637067115));
					client.anInt11171 = i * -828381227;
				} else
					i = -1;
			}
			if (-1 == i && -1322772099 * client.anInt11171 != -1) {
				Class330.aClass513_3609.setcustomcursor(Class451.aCanvas4939, null, -1, -1, new Point());
				client.anInt11171 = 828381227;
			}
		}
	}

	public static void method1510(int i) {
		Class243.aClass205_2492.method3793((byte) 34);
		Class243.aClass205_2497.method3793((byte) 36);
		Class243.aClass205_2493.method3793((byte) 33);
		Class243.aClass205_2477.method3793((byte) 19);
	}

	public static int method1511(int i, int i_2_, boolean bool, int i_3_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 126);
		if (class527_sub1 == null)
			return 0;
		if (i_2_ < 0 || i_2_ >= class527_sub1.anIntArray10330.length)
			return 0;
		return class527_sub1.anIntArray10330[i_2_];
	}
}

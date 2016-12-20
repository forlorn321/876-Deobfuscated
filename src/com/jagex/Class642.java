/* Class642 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Class642 {
	static int anInt8340;
	static Queue aQueue8341;
	static boolean aBool8342;
	static long aLong8343 = 682336048790384357L;
	static Class639_Sub1 aClass639_Sub1_8344;
	static Class639_Sub2 aClass639_Sub2_8345;

	Class642() throws Throwable {
		throw new Error();
	}

	static {
		anInt8340 = 0;
		aBool8342 = true;
		aClass639_Sub1_8344 = new Class639_Sub1();
		aClass639_Sub2_8345 = new Class639_Sub2();
		aQueue8341 = new LinkedList();
	}

	public static void method10708() {
		if (Class231.method4328(736666097))
			Class265.method5041(new Class622(), -52513558);
	}

	public static void method10709() {
		Class275.method5143((byte) -5);
	}

	public static void method10710() {
		Class275.method5143((byte) -115);
	}

	public static void method10711() {
		Class275.method5143((byte) -62);
	}

	public static void method10712() {
		Class275.method5143((byte) -4);
	}

	public static void method10713() {
		aClass639_Sub1_8344.method10579(-390015659);
		aClass639_Sub2_8345.method10579(-390015659);
		aLong8343 = 682336048790384357L;
		aBool8342 = true;
	}

	static void method10714() {
		synchronized (aQueue8341) {
			Point point;
			if (Class451.aCanvas4939.isShowing())
				point = Class451.aCanvas4939.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue8341.poll();
				if (null == class527_sub34_sub1)
					break;
				if (point == null || !Class451.aCanvas4939.isShowing() || !Class333.aBool3628)
					class527_sub34_sub1.method16363(182953128);
				else {
					class527_sub34_sub1.method18363(point, -1362806808);
					if (!class527_sub34_sub1.method18367(788762965) && (class527_sub34_sub1.method16356(1319623125) < -1803844265 * Class289.anInt3223) && (class527_sub34_sub1.method16357(719777205) < Class611.anInt8009 * -471480167) && class527_sub34_sub1.method16356(1319623125) >= 0 && class527_sub34_sub1.method16357(719777205) >= 0) {
						int i = class527_sub34_sub1.method16355(1029210433);
						if (class527_sub34_sub1.method16355(1029210433) == -1)
							aClass639_Sub2_8345.method10605(class527_sub34_sub1, -731926681);
						else if (Class465_Sub5.method16026(i, (byte) -74))
							aClass639_Sub2_8345.method16974(class527_sub34_sub1, 66286742);
					}
				}
			}
		}
	}

	public static void method10715(Class527_Sub34 class527_sub34) {
		if (!Class167.method2677(-1927019389 * client.anInt11048, (byte) 17))
			class527_sub34.method16363(182953128);
		else
			aClass639_Sub1_8344.method10605(class527_sub34, -1153246683);
	}

	public static void method10716(Class527_Sub34 class527_sub34) {
		if (!Class167.method2677(-1927019389 * client.anInt11048, (byte) 17))
			class527_sub34.method16363(182953128);
		else
			aClass639_Sub1_8344.method10605(class527_sub34, -1032014277);
	}

	public static void method10717() {
		synchronized (aQueue8341) {
			for (;;) {
				Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue8341.poll();
				if (class527_sub34_sub1 == null)
					break;
				class527_sub34_sub1.method16363(182953128);
			}
		}
	}

	static void method10718() {
		synchronized (aQueue8341) {
			Point point;
			if (Class451.aCanvas4939.isShowing())
				point = Class451.aCanvas4939.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue8341.poll();
				if (null == class527_sub34_sub1)
					break;
				if (point == null || !Class451.aCanvas4939.isShowing() || !Class333.aBool3628)
					class527_sub34_sub1.method16363(182953128);
				else {
					class527_sub34_sub1.method18363(point, -1966689594);
					if (!class527_sub34_sub1.method18367(788762965) && (class527_sub34_sub1.method16356(1319623125) < -1803844265 * Class289.anInt3223) && (class527_sub34_sub1.method16357(719777205) < Class611.anInt8009 * -471480167) && class527_sub34_sub1.method16356(1319623125) >= 0 && class527_sub34_sub1.method16357(719777205) >= 0) {
						int i = class527_sub34_sub1.method16355(1029210433);
						if (class527_sub34_sub1.method16355(1029210433) == -1)
							aClass639_Sub2_8345.method10605(class527_sub34_sub1, 1775461251);
						else if (Class465_Sub5.method16026(i, (byte) -37))
							aClass639_Sub2_8345.method16974(class527_sub34_sub1, -954418285);
					}
				}
			}
		}
	}

	public static void method10719() {
		synchronized (aQueue8341) {
			for (;;) {
				Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue8341.poll();
				if (class527_sub34_sub1 == null)
					break;
				class527_sub34_sub1.method16363(182953128);
			}
		}
	}

	public static void method10720() {
		Class275.method5143((byte) -54);
	}

	public static void method10721() {
		synchronized (aQueue8341) {
			for (;;) {
				Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue8341.poll();
				if (class527_sub34_sub1 == null)
					break;
				class527_sub34_sub1.method16363(182953128);
			}
		}
	}

	public static void method10722() {
		Class157.method2562(1026249976);
		aClass639_Sub1_8344.method10578(1982981079);
		aClass639_Sub2_8345.method10578(2115621817);
		if (-7744771 * client.anInt11041 > 0) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4470, client.aClass109_11067.aClass2_1367, (byte) 31);
			class527_sub15.buffer.writeShort(-30979084 * client.anInt11041, 1404835786);
			for (int i = 0; i < -7744771 * client.anInt11041; i++) {
				Interface64 interface64 = client.anInterface64Array11166[i];
				long l = (interface64.method414(433009517) - 4722132655032049939L * aLong8343);
				if (l > 16777215L)
					l = 16777215L;
				aLong8343 = interface64.method414(433009517) * -682336048790384357L;
				class527_sub15.buffer.writeByte(interface64.method396(2090210637), -581763334);
				class527_sub15.buffer.writeTriByte((int) l, -1907553583);
			}
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (881989347 * anInt8340 > 0)
			anInt8340 -= -1599742261;
		if (client.aBool11119 && 881989347 * anInt8340 <= 0) {
			anInt8340 = -1930074148;
			client.aBool11119 = false;
			int i;
			int i_0_;
			if (2 == Class30.anInt265 * -349191067) {
				if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) -26) == Class301.aClass301_3418) {
					Class327_Sub2 class327_sub2 = (Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0);
					i = Class208_Sub1.method15588((class327_sub2.aClass438_10044), -289362138) >> 3;
					int i_1_ = 1024;
					i_0_ = (3 * i_1_ - (Class293_Sub1.method15725((class327_sub2.aClass438_10044), 1234287563) >> 3)) % (2 * i_1_);
				} else {
					i = 0;
					i_0_ = 0;
				}
			} else {
				i = (int) client.aFloat11111 >> 3;
				i_0_ = (int) client.aFloat11112 >> 3;
			}
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4501, client.aClass109_11067.aClass2_1367, (byte) 38);
			class527_sub15.buffer.writeShort(i_0_, 1404835786);
			class527_sub15.buffer.writeShortLE128(i, 1754469535);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (aBool8342 != Class333.aBool3628) {
			aBool8342 = Class333.aBool3628;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4407, client.aClass109_11067.aClass2_1367, (byte) -19);
			class527_sub15.buffer.writeByte(Class333.aBool3628 ? 1 : 0, -1520099133);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!client.aBool11020) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4394, client.aClass109_11067.aClass2_1367, (byte) 16);
			class527_sub15.buffer.writeByte(0, 1447735305);
			int i = (class527_sub15.buffer.anInt10689 * -441238943);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class527_sub15.buffer.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 63);
			class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943) - i, -1425593003);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11020 = true;
		}
		if (!client.aBool11248 && Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16894(-442670176) == 1) {
			int[] is = Class402.aClass180_4150.method3284();
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4438, client.aClass109_11067.aClass2_1367, (byte) 62);
			class527_sub15.buffer.writeShort(0, 1404835786);
			int i = (class527_sub15.buffer.anInt10689 * -441238943);
			if (null != is && is.length != 0) {
				class527_sub15.buffer.writeByte(1, 1028522776);
				Class138[] class138s = Class138.method2316(-806466104);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
					boolean bool = false;
					for (int i_3_ = 0; i_3_ < class138s.length; i_3_++) {
						if (class138s[i_3_].anInt1600 == is[i_2_]) {
							hashset.add(class138s[i_3_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_2_]));
				}
				Class26.method856(hashset, class527_sub15.buffer, -1830097795);
				class527_sub15.buffer.method16439(arraylist.size(), (byte) -125);
				if (arraylist.size() > 0) {
					int i_4_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_4_)
							i_4_ = integer.intValue();
					}
					class527_sub15.buffer.method16520(i_4_, 362076493);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_4_)
							class527_sub15.buffer.method16520(integer.intValue() - i_4_, -647858775);
					}
				}
			} else
				class527_sub15.buffer.writeByte(0, -1081068727);
			class527_sub15.buffer.method16437((class527_sub15.buffer.anInt10689 * -441238943) - i, -18705907);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11248 = true;
		}
	}

	public static void method10723() {
		Class157.method2562(1638443646);
		aClass639_Sub1_8344.method10578(2089505735);
		aClass639_Sub2_8345.method10578(2076826162);
		if (-7744771 * client.anInt11041 > 0) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4470, client.aClass109_11067.aClass2_1367, (byte) -61);
			class527_sub15.buffer.writeShort(-30979084 * client.anInt11041, 1404835786);
			for (int i = 0; i < -7744771 * client.anInt11041; i++) {
				Interface64 interface64 = client.anInterface64Array11166[i];
				long l = (interface64.method414(433009517) - 4722132655032049939L * aLong8343);
				if (l > 16777215L)
					l = 16777215L;
				aLong8343 = interface64.method414(433009517) * -682336048790384357L;
				class527_sub15.buffer.writeByte(interface64.method396(-2006160658), 1213523137);
				class527_sub15.buffer.writeTriByte((int) l, -1908688685);
			}
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (881989347 * anInt8340 > 0)
			anInt8340 -= -1599742261;
		if (client.aBool11119 && 881989347 * anInt8340 <= 0) {
			anInt8340 = -1930074148;
			client.aBool11119 = false;
			int i;
			int i_5_;
			if (2 == Class30.anInt265 * -349191067) {
				if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 33) == Class301.aClass301_3418) {
					Class327_Sub2 class327_sub2 = (Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0);
					i = Class208_Sub1.method15588((class327_sub2.aClass438_10044), -866537431) >> 3;
					int i_6_ = 1024;
					i_5_ = (3 * i_6_ - (Class293_Sub1.method15725((class327_sub2.aClass438_10044), 1987632583) >> 3)) % (2 * i_6_);
				} else {
					i = 0;
					i_5_ = 0;
				}
			} else {
				i = (int) client.aFloat11111 >> 3;
				i_5_ = (int) client.aFloat11112 >> 3;
			}
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4501, client.aClass109_11067.aClass2_1367, (byte) -8);
			class527_sub15.buffer.writeShort(i_5_, 1404835786);
			class527_sub15.buffer.writeShortLE128(i, 1078442240);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (aBool8342 != Class333.aBool3628) {
			aBool8342 = Class333.aBool3628;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4407, client.aClass109_11067.aClass2_1367, (byte) -56);
			class527_sub15.buffer.writeByte(Class333.aBool3628 ? 1 : 0, 1821675452);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!client.aBool11020) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4394, client.aClass109_11067.aClass2_1367, (byte) -32);
			class527_sub15.buffer.writeByte(0, 1359591322);
			int i = (class527_sub15.buffer.anInt10689 * -441238943);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class527_sub15.buffer.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 32);
			class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943) - i, -890814623);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11020 = true;
		}
		if (!client.aBool11248 && Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16894(-567601205) == 1) {
			int[] is = Class402.aClass180_4150.method3284();
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4438, client.aClass109_11067.aClass2_1367, (byte) 7);
			class527_sub15.buffer.writeShort(0, 1404835786);
			int i = (class527_sub15.buffer.anInt10689 * -441238943);
			if (null != is && is.length != 0) {
				class527_sub15.buffer.writeByte(1, -713906000);
				Class138[] class138s = Class138.method2316(-1707887134);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
					boolean bool = false;
					for (int i_8_ = 0; i_8_ < class138s.length; i_8_++) {
						if (class138s[i_8_].anInt1600 == is[i_7_]) {
							hashset.add(class138s[i_8_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_7_]));
				}
				Class26.method856(hashset, class527_sub15.buffer, -1818080602);
				class527_sub15.buffer.method16439(arraylist.size(), (byte) -20);
				if (arraylist.size() > 0) {
					int i_9_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_9_)
							i_9_ = integer.intValue();
					}
					class527_sub15.buffer.method16520(i_9_, -2127730773);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_9_)
							class527_sub15.buffer.method16520(integer.intValue() - i_9_, -2014482516);
					}
				}
			} else
				class527_sub15.buffer.writeByte(0, 1327680280);
			class527_sub15.buffer.method16437((class527_sub15.buffer.anInt10689 * -441238943) - i, -18705907);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11248 = true;
		}
	}

	public static void method10724() {
		Class157.method2562(1555844059);
		aClass639_Sub1_8344.method10578(1847758557);
		aClass639_Sub2_8345.method10578(1833393341);
		if (-7744771 * client.anInt11041 > 0) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4470, client.aClass109_11067.aClass2_1367, (byte) -31);
			class527_sub15.buffer.writeShort(-30979084 * client.anInt11041, 1404835786);
			for (int i = 0; i < -7744771 * client.anInt11041; i++) {
				Interface64 interface64 = client.anInterface64Array11166[i];
				long l = (interface64.method414(433009517) - 4722132655032049939L * aLong8343);
				if (l > 16777215L)
					l = 16777215L;
				aLong8343 = interface64.method414(433009517) * -682336048790384357L;
				class527_sub15.buffer.writeByte(interface64.method396(-1602070490), -1836477039);
				class527_sub15.buffer.writeTriByte((int) l, -797446381);
			}
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (881989347 * anInt8340 > 0)
			anInt8340 -= -1599742261;
		if (client.aBool11119 && 881989347 * anInt8340 <= 0) {
			anInt8340 = -1930074148;
			client.aBool11119 = false;
			int i;
			int i_10_;
			if (2 == Class30.anInt265 * -349191067) {
				if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 1) == Class301.aClass301_3418) {
					Class327_Sub2 class327_sub2 = (Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0);
					i = Class208_Sub1.method15588((class327_sub2.aClass438_10044), -1494272826) >> 3;
					int i_11_ = 1024;
					i_10_ = (3 * i_11_ - (Class293_Sub1.method15725((class327_sub2.aClass438_10044), 665494392) >> 3)) % (2 * i_11_);
				} else {
					i = 0;
					i_10_ = 0;
				}
			} else {
				i = (int) client.aFloat11111 >> 3;
				i_10_ = (int) client.aFloat11112 >> 3;
			}
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4501, client.aClass109_11067.aClass2_1367, (byte) -78);
			class527_sub15.buffer.writeShort(i_10_, 1404835786);
			class527_sub15.buffer.writeShortLE128(i, 1670819866);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (aBool8342 != Class333.aBool3628) {
			aBool8342 = Class333.aBool3628;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4407, client.aClass109_11067.aClass2_1367, (byte) 29);
			class527_sub15.buffer.writeByte(Class333.aBool3628 ? 1 : 0, 255389843);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!client.aBool11020) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4394, client.aClass109_11067.aClass2_1367, (byte) -44);
			class527_sub15.buffer.writeByte(0, 538093241);
			int i = (class527_sub15.buffer.anInt10689 * -441238943);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class527_sub15.buffer.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 20);
			class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943) - i, -741019846);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11020 = true;
		}
		if (!client.aBool11248 && Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16894(-1332104683) == 1) {
			int[] is = Class402.aClass180_4150.method3284();
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4438, client.aClass109_11067.aClass2_1367, (byte) -31);
			class527_sub15.buffer.writeShort(0, 1404835786);
			int i = (class527_sub15.buffer.anInt10689 * -441238943);
			if (null != is && is.length != 0) {
				class527_sub15.buffer.writeByte(1, 1434424474);
				Class138[] class138s = Class138.method2316(508369187);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
					boolean bool = false;
					for (int i_13_ = 0; i_13_ < class138s.length; i_13_++) {
						if (class138s[i_13_].anInt1600 == is[i_12_]) {
							hashset.add(class138s[i_13_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_12_]));
				}
				Class26.method856(hashset, class527_sub15.buffer, 2017588806);
				class527_sub15.buffer.method16439(arraylist.size(), (byte) -82);
				if (arraylist.size() > 0) {
					int i_14_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_14_)
							i_14_ = integer.intValue();
					}
					class527_sub15.buffer.method16520(i_14_, -700978731);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_14_)
							class527_sub15.buffer.method16520(integer.intValue() - i_14_, -760520501);
					}
				}
			} else
				class527_sub15.buffer.writeByte(0, 178317117);
			class527_sub15.buffer.method16437((class527_sub15.buffer.anInt10689 * -441238943) - i, -18705907);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11248 = true;
		}
	}

	static final void method10725(Class665 class665, int i) {
		class665.aLongArray8529[((class665.anInt8530 += 32636613) * -2076258291 - 1)] = (class665.aLongArray8547[class665.anIntArray8545[891367231 * class665.anInt8527]]);
	}

	static final void method10726(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class311.method5648(class243, class240, class665, -838576210);
	}

	static final void method10727(Class665 class665, byte i) {
		int i_15_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_15_, 442720628)).aBool122) ? 1 : 0;
	}

	public static Class459 method10728(Class36 class36, boolean bool, int i, boolean bool_16_, boolean bool_17_, int i_18_) {
		if (Class711.aClass457_Sub1Array8857 == null) {
			Class711.aClass457_Sub1Array8857 = new Class457_Sub1[Class299.method5522((byte) -104)];
			Class319.aMap3538 = new HashMap();
		}
		Class552 class552 = null;
		int i_19_ = class36.method1134((byte) 72);
		if (null != client.aClass1_7032 && !Class104.aBool1291)
			class552 = new Class552(i_19_, client.aClass1_7032, Class550.aClass1Array7294[i_19_], (i_19_ == Class36.aClass36_405.method1134((byte) 64) ? 8000000 : 2500000));
		Class711.aClass457_Sub1Array8857[i_19_] = Class309.aClass440_3464.method7098(i_19_, class552, Class30_Sub1.aClass552_10967, class36.method1133(-80776423), -1139350978);
		if (bool_17_)
			Class711.aClass457_Sub1Array8857[i_19_].method15900(1997054613);
		Class459 class459 = new Class459(Class711.aClass457_Sub1Array8857[i_19_], bool, i);
		Class319.aMap3538.put(class36, class459);
		return class459;
	}

	public static final void method10729(int i) {
		for (int i_20_ = 0; i_20_ < 5; i_20_++)
			client.aBoolArray11060[i_20_] = false;
		client.anInt11124 = -709159557;
		client.anInt11125 = 1118587303;
		Class209.anInt2246 = 0;
		Class78.anInt801 = 0;
		Class30.anInt265 = -1770487007;
		if (Class527_Sub29.method16288(1007874837) == 2) {
			Class592 class592 = client.aClass509_11072.method8283((short) 12205);
			int i_21_ = class592.anInt7798 * 153371143 << 9;
			int i_22_ = -2029646807 * class592.anInt7799 << 9;
			int i_23_ = 1000 / Class259.method4781((byte) 39);
			Class208_Sub10.aClass296_Sub1_9923.method5343((float) i_23_ / 1000.0F, (client.aClass509_11072.method8300((byte) 37).anIntArrayArrayArray4989), client.aClass509_11072.method8359(1663514152), i_21_, i_22_, (byte) 1);
		}
		Class452.anInt4964 = 1432081761;
		Class400.anInt4141 = -228665961;
		client.anInt11273 = client.anInt11019 * -2095434163;
		Class389_Sub2.anInt10170 = -927915685 * Class320.anInt3543;
		Class303.anInt3427 = -898623569 * Class142.anInt1657;
		Class105.anInt1308 = Class201.anInt2211 * -59383269;
		Class319.anInt3539 = 1212231383 * Class700_Sub34.anInt10928;
		Class268.anInt3113 = -1703615453 * Class12.anInt176;
		Class639.anInt8327 = client.anInt11062 * 1868309311;
	}
}

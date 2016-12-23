/* Class659 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Class659 {
	static Queue aQueue8499;
	static int anInt8500;
	static long aLong8501 = -8021461918566662789L;
	static Class637_Sub2 aClass637_Sub2_8502;
	static Class637_Sub1 aClass637_Sub1_8503;
	static boolean aBool8504;

	public static void method7952() {
		aClass637_Sub2_8502.method7626(-1224210338);
		aClass637_Sub1_8503.method7626(-1984110196);
		aLong8501 = -8021461918566662789L;
		aBool8504 = true;
	}

	static {
		anInt8500 = 0;
		aBool8504 = true;
		aClass637_Sub2_8502 = new Class637_Sub2();
		aClass637_Sub1_8503 = new Class637_Sub1();
		aQueue8499 = new LinkedList();
	}

	static void method7953() {
		synchronized (aQueue8499) {
			Point point;
			if (Class399.aCanvas4127.isShowing())
				point = Class399.aCanvas4127.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue8499.poll();
				if (null == class536_sub31_sub2)
					break;
				if (point == null || !Class399.aCanvas4127.isShowing() || !Class67_Sub1.aBool10601)
					class536_sub31_sub2.method9641(-1418109190);
				else {
					class536_sub31_sub2.method10822(point, 1597943880);
					if (!class536_sub31_sub2.method10821(-284062489) && (class536_sub31_sub2.method9647(-2115530899) < Class144.anInt1679 * -1804846931) && (class536_sub31_sub2.method9643((byte) 1) < 589116499 * Class34_Sub6.anInt10965) && class536_sub31_sub2.method9647(-2009335400) >= 0 && class536_sub31_sub2.method9643((byte) 1) >= 0) {
						int i = class536_sub31_sub2.method9642(-972676186);
						if (class536_sub31_sub2.method9642(-2122171136) == -1)
							aClass637_Sub1_8503.method7640(class536_sub31_sub2, -1966586552);
						else if (Class160.method1960(i, (byte) -59))
							aClass637_Sub1_8503.method9914(class536_sub31_sub2, -1378215512);
					}
				}
			}
		}
	}

	public static void method7954() {
		if (Class225.method3218(1616259432))
			Class536_Sub14.method9498(new Class629(), (byte) -71);
	}

	static void method7955() {
		synchronized (aQueue8499) {
			Point point;
			if (Class399.aCanvas4127.isShowing())
				point = Class399.aCanvas4127.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue8499.poll();
				if (null == class536_sub31_sub2)
					break;
				if (point == null || !Class399.aCanvas4127.isShowing() || !Class67_Sub1.aBool10601)
					class536_sub31_sub2.method9641(-1530887925);
				else {
					class536_sub31_sub2.method10822(point, -897957915);
					if (!class536_sub31_sub2.method10821(-430254441) && (class536_sub31_sub2.method9647(-1583574952) < Class144.anInt1679 * -1804846931) && (class536_sub31_sub2.method9643((byte) 1) < 589116499 * Class34_Sub6.anInt10965) && class536_sub31_sub2.method9647(-2122249720) >= 0 && class536_sub31_sub2.method9643((byte) 1) >= 0) {
						int i = class536_sub31_sub2.method9642(-2042029394);
						if (class536_sub31_sub2.method9642(-1183614580) == -1)
							aClass637_Sub1_8503.method7640(class536_sub31_sub2, -1992490559);
						else if (Class160.method1960(i, (byte) -106))
							aClass637_Sub1_8503.method9914(class536_sub31_sub2, -1605742785);
					}
				}
			}
		}
	}

	static void method7956() {
		synchronized (aQueue8499) {
			Point point;
			if (Class399.aCanvas4127.isShowing())
				point = Class399.aCanvas4127.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue8499.poll();
				if (null == class536_sub31_sub2)
					break;
				if (point == null || !Class399.aCanvas4127.isShowing() || !Class67_Sub1.aBool10601)
					class536_sub31_sub2.method9641(-1852658136);
				else {
					class536_sub31_sub2.method10822(point, -1072836836);
					if (!class536_sub31_sub2.method10821(-448377670) && (class536_sub31_sub2.method9647(-1758713237) < Class144.anInt1679 * -1804846931) && (class536_sub31_sub2.method9643((byte) 1) < 589116499 * Class34_Sub6.anInt10965) && class536_sub31_sub2.method9647(-1939249070) >= 0 && class536_sub31_sub2.method9643((byte) 1) >= 0) {
						int i = class536_sub31_sub2.method9642(-2006801023);
						if (class536_sub31_sub2.method9642(-1250543002) == -1)
							aClass637_Sub1_8503.method7640(class536_sub31_sub2, -2018808813);
						else if (Class160.method1960(i, (byte) 47))
							aClass637_Sub1_8503.method9914(class536_sub31_sub2, -1546764824);
					}
				}
			}
		}
	}

	public static void method7957() {
		Class690.method8186((short) -21577);
	}

	public static void method7958() {
		Class690.method8186((short) -16506);
	}

	Class659() throws Throwable {
		throw new Error();
	}

	public static void method7959() {
		aClass637_Sub2_8502.method7626(-2051913074);
		aClass637_Sub1_8503.method7626(-142403593);
		aLong8501 = -8021461918566662789L;
		aBool8504 = true;
	}

	public static void method7960() {
		aClass637_Sub2_8502.method7626(-568921452);
		aClass637_Sub1_8503.method7626(-1782611621);
		aLong8501 = -8021461918566662789L;
		aBool8504 = true;
	}

	public static void method7961() {
		if (Class225.method3218(-1973807708))
			Class536_Sub14.method9498(new Class629(), (byte) -42);
	}

	public static void method7962() {
		Class690.method8186((short) -4719);
	}

	static void method7963() {
		synchronized (aQueue8499) {
			Point point;
			if (Class399.aCanvas4127.isShowing())
				point = Class399.aCanvas4127.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue8499.poll();
				if (null == class536_sub31_sub2)
					break;
				if (point == null || !Class399.aCanvas4127.isShowing() || !Class67_Sub1.aBool10601)
					class536_sub31_sub2.method9641(-1597656205);
				else {
					class536_sub31_sub2.method10822(point, 1941299642);
					if (!class536_sub31_sub2.method10821(1339407266) && (class536_sub31_sub2.method9647(-2000055786) < Class144.anInt1679 * -1804846931) && (class536_sub31_sub2.method9643((byte) 1) < 589116499 * Class34_Sub6.anInt10965) && class536_sub31_sub2.method9647(-1808744166) >= 0 && class536_sub31_sub2.method9643((byte) 1) >= 0) {
						int i = class536_sub31_sub2.method9642(-1903987511);
						if (class536_sub31_sub2.method9642(-1799991412) == -1)
							aClass637_Sub1_8503.method7640(class536_sub31_sub2, -2119870015);
						else if (Class160.method1960(i, (byte) 7))
							aClass637_Sub1_8503.method9914(class536_sub31_sub2, 1627153585);
					}
				}
			}
		}
	}

	public static void method7964() {
		Class690.method8186((short) 3431);
	}

	public static void method7965() {
		synchronized (aQueue8499) {
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue8499.poll();
				if (class536_sub31_sub2 == null)
					break;
				class536_sub31_sub2.method9641(-1646203601);
			}
		}
	}

	public static void method7966() {
		synchronized (aQueue8499) {
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue8499.poll();
				if (class536_sub31_sub2 == null)
					break;
				class536_sub31_sub2.method9641(-1282344884);
			}
		}
	}

	public static void method7967() {
		Class303.method4106(1423940611);
		aClass637_Sub2_8502.method7625((short) -20737);
		aClass637_Sub1_8503.method7625((short) -11675);
		if (-1621465757 * client.anInt11036 > 0) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4488, client.aClass106_11322.aClass15_1258, 1825204396);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(2104071564 * client.anInt11036, -1778059594);
			for (int i = 0; i < client.anInt11036 * -1621465757; i++) {
				Interface63 interface63 = client.anInterface63Array11037[i];
				long l = (interface63.method415((byte) 0) - 9159861578683278925L * aLong8501);
				if (l > 16777215L)
					l = 16777215L;
				aLong8501 = interface63.method415((byte) 0) * 8021461918566662789L;
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(interface63.method413(-31039471));
				class536_sub23.aClass536_Sub33_Sub2_10528.write24BitInt((int) l, 1570430299);
			}
			client.aClass106_11322.method1409(class536_sub23, -311098576);
		}
		if (-518444133 * anInt8500 > 0)
			anInt8500 -= -1681243501;
		if (client.aBool11242 && -518444133 * anInt8500 <= 0) {
			anInt8500 = 734868348;
			client.aBool11242 = false;
			int i;
			int i_0_;
			if (2 == 155362615 * Class246.anInt2474) {
				if (Class683.aClass301_Sub1_8651.method4054(1121883093) == Class290.aClass290_3220) {
					Class333_Sub2 class333_sub2 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221));
					i = Class297.method4006(class333_sub2.aClass425_10030, -236483963) >> 3;
					int i_1_ = 1024;
					i_0_ = (i_1_ * 3 - (Class153_Sub1.method8386((class333_sub2.aClass425_10030), -795691835) >> 3)) % (i_1_ * 2);
				} else {
					i = 0;
					i_0_ = 0;
				}
			} else {
				i = (int) client.aFloat11271 >> 3;
				i_0_ = (int) client.aFloat11106 >> 3;
			}
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4481, client.aClass106_11322.aClass15_1258, 2131157936);
			class536_sub23.aClass536_Sub33_Sub2_10528.write128Short(i_0_, -1952316498);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeLEShort(i, -1411037171);
			client.aClass106_11322.method1409(class536_sub23, 1215750867);
		}
		if (aBool8504 != Class67_Sub1.aBool10601) {
			aBool8504 = Class67_Sub1.aBool10601;
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4427, client.aClass106_11322.aClass15_1258, 888578123);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class67_Sub1.aBool10601 ? 1 : 0);
			client.aClass106_11322.method1409(class536_sub23, 377696083);
		}
		if (!client.aBool11015) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4412, client.aClass106_11322.aClass15_1258, 1042749459);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
			int i = (-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off);
			RSByteBuffer class536_sub33 = Class710.aClass536_Sub40_8843.method9852(-534711081);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeBytes(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 53);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9699((class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525) - i, 1907156316);
			client.aClass106_11322.method1409(class536_sub23, 1863604243);
			client.aBool11015 = true;
		}
		if (!client.aBool11223 && Class710.aClass536_Sub40_8843.aClass710_Sub15_10766.method10071(761671864) == 1) {
			int[] is = Class677.aClass167_8609.method2019();
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4402, client.aClass106_11322.aClass15_1258, 1218152329);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(0, -1778059594);
			int i = (class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525);
			if (null != is && 0 != is.length) {
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(1);
				Class126[] class126s = Class126.method1643((byte) 10);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
					boolean bool = false;
					for (int i_3_ = 0; i_3_ < class126s.length; i_3_++) {
						if (class126s[i_3_].anInt1557 == is[i_2_]) {
							hashset.add(class126s[i_3_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_2_]));
				}
				Class527.method6430(hashset, class536_sub23.aClass536_Sub33_Sub2_10528, -646740399);
				class536_sub23.aClass536_Sub33_Sub2_10528.method9700(arraylist.size(), (byte) 16);
				if (arraylist.size() > 0) {
					int i_4_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_4_)
							i_4_ = integer.intValue();
					}
					class536_sub23.aClass536_Sub33_Sub2_10528.method9702(i_4_, -1405228760);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_4_)
							class536_sub23.aClass536_Sub33_Sub2_10528.method9702(integer.intValue() - i_4_, -1383320022);
					}
				}
			} else
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9698((-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off) - i, 527726870);
			client.aClass106_11322.method1409(class536_sub23, 1453322325);
			client.aBool11223 = true;
		}
	}

	public static void method7968() {
		Class303.method4106(1423940611);
		aClass637_Sub2_8502.method7625((short) -27229);
		aClass637_Sub1_8503.method7625((short) -16086);
		if (-1621465757 * client.anInt11036 > 0) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4488, client.aClass106_11322.aClass15_1258, 798977185);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(2104071564 * client.anInt11036, -1778059594);
			for (int i = 0; i < client.anInt11036 * -1621465757; i++) {
				Interface63 interface63 = client.anInterface63Array11037[i];
				long l = (interface63.method415((byte) 0) - 9159861578683278925L * aLong8501);
				if (l > 16777215L)
					l = 16777215L;
				aLong8501 = interface63.method415((byte) 0) * 8021461918566662789L;
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(interface63.method413(-14240644));
				class536_sub23.aClass536_Sub33_Sub2_10528.write24BitInt((int) l, 1462337635);
			}
			client.aClass106_11322.method1409(class536_sub23, 1163544504);
		}
		if (-518444133 * anInt8500 > 0)
			anInt8500 -= -1681243501;
		if (client.aBool11242 && -518444133 * anInt8500 <= 0) {
			anInt8500 = 734868348;
			client.aBool11242 = false;
			int i;
			int i_5_;
			if (2 == 155362615 * Class246.anInt2474) {
				if (Class683.aClass301_Sub1_8651.method4054(-812040625) == Class290.aClass290_3220) {
					Class333_Sub2 class333_sub2 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221));
					i = Class297.method4006(class333_sub2.aClass425_10030, -236483963) >> 3;
					int i_6_ = 1024;
					i_5_ = (i_6_ * 3 - (Class153_Sub1.method8386((class333_sub2.aClass425_10030), -795691835) >> 3)) % (i_6_ * 2);
				} else {
					i = 0;
					i_5_ = 0;
				}
			} else {
				i = (int) client.aFloat11271 >> 3;
				i_5_ = (int) client.aFloat11106 >> 3;
			}
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4481, client.aClass106_11322.aClass15_1258, 1165677141);
			class536_sub23.aClass536_Sub33_Sub2_10528.write128Short(i_5_, -1952316498);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeLEShort(i, -1411037171);
			client.aClass106_11322.method1409(class536_sub23, 1886196241);
		}
		if (aBool8504 != Class67_Sub1.aBool10601) {
			aBool8504 = Class67_Sub1.aBool10601;
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4427, client.aClass106_11322.aClass15_1258, 1074750048);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class67_Sub1.aBool10601 ? 1 : 0);
			client.aClass106_11322.method1409(class536_sub23, -306276302);
		}
		if (!client.aBool11015) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4412, client.aClass106_11322.aClass15_1258, 781344754);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
			int i = (-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off);
			RSByteBuffer class536_sub33 = Class710.aClass536_Sub40_8843.method9852(-534711081);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeBytes(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 91);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9699((class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525) - i, -1137567716);
			client.aClass106_11322.method1409(class536_sub23, -325217742);
			client.aBool11015 = true;
		}
		if (!client.aBool11223 && Class710.aClass536_Sub40_8843.aClass710_Sub15_10766.method10071(2058964926) == 1) {
			int[] is = Class677.aClass167_8609.method2019();
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4402, client.aClass106_11322.aClass15_1258, 1545829479);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(0, -1778059594);
			int i = (class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525);
			if (null != is && 0 != is.length) {
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(1);
				Class126[] class126s = Class126.method1643((byte) 10);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
					boolean bool = false;
					for (int i_8_ = 0; i_8_ < class126s.length; i_8_++) {
						if (class126s[i_8_].anInt1557 == is[i_7_]) {
							hashset.add(class126s[i_8_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_7_]));
				}
				Class527.method6430(hashset, class536_sub23.aClass536_Sub33_Sub2_10528, -1431106576);
				class536_sub23.aClass536_Sub33_Sub2_10528.method9700(arraylist.size(), (byte) 16);
				if (arraylist.size() > 0) {
					int i_9_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_9_)
							i_9_ = integer.intValue();
					}
					class536_sub23.aClass536_Sub33_Sub2_10528.method9702(i_9_, -1797532134);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_9_)
							class536_sub23.aClass536_Sub33_Sub2_10528.method9702(integer.intValue() - i_9_, -1739643820);
					}
				}
			} else
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9698((-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off) - i, 827623205);
			client.aClass106_11322.method1409(class536_sub23, 384695811);
			client.aBool11223 = true;
		}
	}

	static final void method7969(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub10_10781.method8348(i_10_, -1102005131);
	}

	static Class536_Sub1 method7970(int i, boolean bool, int i_11_) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		return (Class536_Sub1) Class536_Sub1.aClass4_10303.method556(l);
	}
}

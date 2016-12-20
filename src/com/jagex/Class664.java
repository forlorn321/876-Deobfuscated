/* Class664 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class664 {
	static Map aMap8518 = new HashMap();
	public static Class24_Sub15 aClass24_Sub15_8519;

	Class664() throws Throwable {
		throw new Error();
	}

	public static Interface76 method11044(Class var_class, int i) {
		synchronized (aMap8518) {
			Map map = (Map) aMap8518.get(var_class);
			if (null == map) {
				map = new HashMap();
				Interface76[] interface76s = (Interface76[]) var_class.getEnumConstants();
				for (int i_0_ = 0; i_0_ < interface76s.length; i_0_++) {
					Interface76 interface76 = interface76s[i_0_];
					map.put(Integer.valueOf(interface76.method87()), interface76);
				}
				aMap8518.put(var_class, map);
			}
			Interface76 interface76 = (Interface76) map.get(Integer.valueOf(i));
			return interface76;
		}
	}

	public static Interface76 method11045(Interface76[] interface76s, int i) {
		Interface76[] interface76s_1_ = interface76s;
		for (int i_2_ = 0; i_2_ < interface76s_1_.length; i_2_++) {
			Interface76 interface76 = interface76s_1_[i_2_];
			if (i == interface76.method87())
				return interface76;
		}
		return null;
	}

	public static Interface76 method11046(Interface76[] interface76s, int i) {
		Interface76[] interface76s_3_ = interface76s;
		for (int i_4_ = 0; i_4_ < interface76s_3_.length; i_4_++) {
			Interface76 interface76 = interface76s_3_[i_4_];
			if (i == interface76.method87())
				return interface76;
		}
		return null;
	}

	public static void method11047(Iterable iterable, RSByteBuffer class527_sub38) {
		int i = Class115.method2027(iterable, -1217041482);
		class527_sub38.method16652(i, 917385536);
		if (i != 0) {
			for (int i_5_ = 0; i_5_ < i; i_5_++)
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_5_] = (byte) 0;
			Iterator iterator = iterable.iterator();
			while (iterator.hasNext()) {
				Interface76 interface76 = (Interface76) iterator.next();
				int i_6_ = interface76.method87();
				int i_7_ = i_6_ / 8;
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_7_] |= 1 << (i_6_ & 0x7);
			}
			class527_sub38.anInt10689 += 1474750881 * i;
		}
	}

	public static void method11048(Iterable iterable, RSByteBuffer class527_sub38) {
		int i = Class115.method2027(iterable, -2111641585);
		class527_sub38.method16652(i, 760614807);
		if (i != 0) {
			for (int i_8_ = 0; i_8_ < i; i_8_++)
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_8_] = (byte) 0;
			Iterator iterator = iterable.iterator();
			while (iterator.hasNext()) {
				Interface76 interface76 = (Interface76) iterator.next();
				int i_9_ = interface76.method87();
				int i_10_ = i_9_ / 8;
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_10_] |= 1 << (i_9_ & 0x7);
			}
			class527_sub38.anInt10689 += 1474750881 * i;
		}
	}

	public static void method11049(Iterable iterable, RSByteBuffer class527_sub38) {
		int i = Class115.method2027(iterable, -1649650662);
		class527_sub38.method16652(i, 1027505494);
		if (i != 0) {
			for (int i_11_ = 0; i_11_ < i; i_11_++)
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_11_] = (byte) 0;
			Iterator iterator = iterable.iterator();
			while (iterator.hasNext()) {
				Interface76 interface76 = (Interface76) iterator.next();
				int i_12_ = interface76.method87();
				int i_13_ = i_12_ / 8;
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_13_] |= 1 << (i_12_ & 0x7);
			}
			class527_sub38.anInt10689 += 1474750881 * i;
		}
	}

	static final void method11050(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1335703211 * class243.anInt2532;
	}

	static final void method11051(int i) {
		Class45.method1217(Class402.aClass180_4150, (long) client.anInt11019);
		if (-1 != client.anInt11237 * -2119864417)
			Class706.method14353(client.anInt11237 * -2119864417, -1634398593);
		for (int i_14_ = 0; i_14_ < 195456631 * client.anInt11260; i_14_++) {
			client.aBoolArray11254[i_14_] = client.aBoolArray11310[i_14_];
			client.aBoolArray11310[i_14_] = false;
		}
		client.anInt11252 = -404058165 * client.anInt11019;
		if (client.anInt11237 * -2119864417 != -1) {
			client.anInt11260 = 0;
			Class700_Sub36.method17274(2017985262);
		}
		Class402.aClass180_4150.method3131();
		Class611.method10120(Class402.aClass180_4150, -1232251043);
		int i_15_ = Class635.method10558((byte) 65);
		if (i_15_ == -1)
			i_15_ = 227760777 * client.anInt11185;
		if (-1 == i_15_)
			i_15_ = 957177321 * client.anInt11167;
		Class73.method1509(i_15_, 193608500);
		client.anInt11108 = 0;
	}

	public static RuntimeException_Sub1 method11052(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (throwable instanceof RuntimeException_Sub1) {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub1 runtimeexception_sub1_16_ = runtimeexception_sub1;
			runtimeexception_sub1_16_.aString12046 = stringbuilder.append(runtimeexception_sub1_16_.aString12046).append(' ').append(string).toString();
		} else
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		return runtimeexception_sub1;
	}
}

/* Class653 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;

public class Class653 {
	Class378 aClass378_8385;
	public HashMap aHashMap8386;

	public Class653(Class378 class378) {
		method10897(-561854489);
		aClass378_8385 = class378;
	}

	void method10897(int i) {
		aHashMap8386 = new HashMap();
		aHashMap8386.put(Class485.aClass485_5453, Integer.valueOf(50));
	}

	void method10898() {
		aHashMap8386 = new HashMap();
		aHashMap8386.put(Class485.aClass485_5453, Integer.valueOf(50));
	}

	void method10899() {
		aHashMap8386 = new HashMap();
		aHashMap8386.put(Class485.aClass485_5453, Integer.valueOf(50));
	}

	void method10900() {
		aHashMap8386 = new HashMap();
		aHashMap8386.put(Class485.aClass485_5453, Integer.valueOf(50));
	}

	static final void method10901(Class665 class665, int i) {
		Class160 class160 = (Class160) (class665.aClass527_Sub8_Sub10_8548.anObjectArray11725[891367231 * class665.anInt8527]);
		Interface19 interface19 = ((Interface19) (0 == class665.anIntArray8545[891367231 * class665.anInt8527] ? class665.aMap8523.get(class160.aClass465_1745) : class665.aMap8536.get(class160.aClass465_1745)));
		Class475 class475 = class160.aClass462_1748.method7606(-337726213);
		if (class475 == Class475.aClass475_5374) {
			if (class160.aClass465_1745 == Class465.aClass465_5303)
				Class602.method10012(class160, -1784395681);
			interface19.method105(class160, class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)], (byte) 100);
		} else if (class475 == Class475.aClass475_5375)
			interface19.method110(class160, class665.aLongArray8529[((class665.anInt8530 -= 32636613) * -2076258291)]);
		else if (class475 == Class475.aClass475_5376) {
			if (Class465.aClass465_5303 == class160.aClass465_1745)
				Class641.method10706(class160, -2144449393);
			interface19.method111(class160, (class665.anObjectArray8541[((class665.anInt8528 -= 433009517) * 318492261)]), 1706151692);
		} else
			throw new RuntimeException();
	}

	static final void method10902(Class665 class665, byte i) {
		class665.anInt8526 -= 409523364;
		client.aShort11285 = (short) class665.anIntArray8525[1769813785 * class665.anInt8526];
		if (client.aShort11285 <= 0)
			client.aShort11285 = (short) 1;
		client.aShort11043 = (short) (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]);
		if (client.aShort11043 <= 0)
			client.aShort11043 = (short) 32767;
		else if (client.aShort11043 < client.aShort11285)
			client.aShort11043 = client.aShort11285;
		client.aShort11287 = (short) (class665.anIntArray8525[1769813785 * class665.anInt8526 + 2]);
		if (client.aShort11287 <= 0)
			client.aShort11287 = (short) 1;
		client.aShort11211 = (short) (class665.anIntArray8525[1769813785 * class665.anInt8526 + 3]);
		if (client.aShort11211 <= 0)
			client.aShort11211 = (short) 32767;
		else if (client.aShort11211 < client.aShort11287)
			client.aShort11211 = client.aShort11287;
	}

	static final void method10903(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class215.method3961(-1179367114).method87();
	}
}

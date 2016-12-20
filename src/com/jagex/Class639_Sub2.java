/* Class639_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;
import java.util.Queue;

import com.jagex.twitchtv.TwitchTV;

public class Class639_Sub2 extends Class639 {
	Queue aQueue10853 = new LinkedList();

	boolean method10581() {
		return (!aQueue10853.isEmpty() || (aLong8322 * -2812603364086814583L < Class234.method4347(-1408626088) - 2000L));
	}

	void method16974(Class527_Sub34_Sub1 class527_sub34_sub1, int i) {
		aQueue10853.add(class527_sub34_sub1);
		if (aQueue10853.size() > 10)
			aQueue10853.poll();
	}

	void method16975(RSByteBuffer class527_sub38, Class527_Sub34_Sub1 class527_sub34_sub1, byte i) {
		class527_sub38.writeByte(class527_sub34_sub1.method18364((byte) -37), 1251643220);
	}

	boolean method10577(int i) {
		return (!aQueue10853.isEmpty() || (aLong8322 * -2812603364086814583L < Class234.method4347(-1408626088) - 2000L));
	}

	Class527_Sub15 method10586(int i) {
		return Class70.method1489(OutgoingPacket.aClass414_4437, client.aClass109_11067.aClass2_1367, (byte) -82);
	}

	Class639_Sub2() {
		/* empty */
	}

	void method10594(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34) {
		method16975(class527_sub38, (Class527_Sub34_Sub1) class527_sub34, (byte) -64);
	}

	void method10583(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34, byte i) {
		method16975(class527_sub38, (Class527_Sub34_Sub1) class527_sub34, (byte) 46);
	}

	void method16976(Class527_Sub34_Sub1 class527_sub34_sub1) {
		aQueue10853.add(class527_sub34_sub1);
		if (aQueue10853.size() > 10)
			aQueue10853.poll();
	}

	void method10607() {
		Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue10853.poll();
		if (null != class527_sub34_sub1) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4411, client.aClass109_11067.aClass2_1367, (byte) 25);
			class527_sub15.buffer.writeShortLE128(method10587(class527_sub34_sub1, 65535, -1729826532), 1616929328);
			class527_sub15.buffer.writeIntLE2((class527_sub34_sub1.method16356(1319623125) | class527_sub34_sub1.method16357(719777205) << 16), (byte) 62);
			class527_sub15.buffer.write128Byte((class527_sub34_sub1.method18366((byte) 98) << 1 | class527_sub34_sub1.method18364((byte) -94) & 0x1), (byte) 8);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			class527_sub34_sub1.method16363(182953128);
		}
	}

	void method16977(Class527_Sub34_Sub1 class527_sub34_sub1) {
		aQueue10853.add(class527_sub34_sub1);
		if (aQueue10853.size() > 10)
			aQueue10853.poll();
	}

	void method10584(int i) {
		Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue10853.poll();
		if (null != class527_sub34_sub1) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4411, client.aClass109_11067.aClass2_1367, (byte) 12);
			class527_sub15.buffer.writeShortLE128(method10587(class527_sub34_sub1, 65535, -1729826532), 1503796731);
			class527_sub15.buffer.writeIntLE2((class527_sub34_sub1.method16356(1319623125) | class527_sub34_sub1.method16357(719777205) << 16), (byte) 6);
			class527_sub15.buffer.write128Byte((class527_sub34_sub1.method18366((byte) 48) << 1 | class527_sub34_sub1.method18364((byte) -26) & 0x1), (byte) 8);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			class527_sub34_sub1.method16363(182953128);
		}
	}

	boolean method10588() {
		return (!aQueue10853.isEmpty() || (aLong8322 * -2812603364086814583L < Class234.method4347(-1408626088) - 2000L));
	}

	Class527_Sub15 method10589() {
		return Class70.method1489(OutgoingPacket.aClass414_4437, client.aClass109_11067.aClass2_1367, (byte) -21);
	}

	Class527_Sub15 method10595() {
		return Class70.method1489(OutgoingPacket.aClass414_4437, client.aClass109_11067.aClass2_1367, (byte) -27);
	}

	Class527_Sub15 method10585() {
		return Class70.method1489(OutgoingPacket.aClass414_4437, client.aClass109_11067.aClass2_1367, (byte) 88);
	}

	void method16978(RSByteBuffer class527_sub38, Class527_Sub34_Sub1 class527_sub34_sub1) {
		class527_sub38.writeByte(class527_sub34_sub1.method18364((byte) -71), 1999625468);
	}

	void method16979(RSByteBuffer class527_sub38, Class527_Sub34_Sub1 class527_sub34_sub1) {
		class527_sub38.writeByte(class527_sub34_sub1.method18364((byte) 0), 1330198056);
	}

	void method16980(RSByteBuffer class527_sub38, Class527_Sub34_Sub1 class527_sub34_sub1) {
		class527_sub38.writeByte(class527_sub34_sub1.method18364((byte) -28), -1908156520);
	}

	void method16981(Class527_Sub34_Sub1 class527_sub34_sub1) {
		aQueue10853.add(class527_sub34_sub1);
		if (aQueue10853.size() > 10)
			aQueue10853.poll();
	}

	int method10592() {
		return 1;
	}

	int method10593() {
		return 1;
	}

	void method10608() {
		Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue10853.poll();
		if (null != class527_sub34_sub1) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4411, client.aClass109_11067.aClass2_1367, (byte) 61);
			class527_sub15.buffer.writeShortLE128(method10587(class527_sub34_sub1, 65535, -1729826532), 1432598493);
			class527_sub15.buffer.writeIntLE2((class527_sub34_sub1.method16356(1319623125) | class527_sub34_sub1.method16357(719777205) << 16), (byte) 50);
			class527_sub15.buffer.write128Byte((class527_sub34_sub1.method18366((byte) 75) << 1 | class527_sub34_sub1.method18364((byte) -114) & 0x1), (byte) 8);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			class527_sub34_sub1.method16363(182953128);
		}
	}

	void method10604(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34) {
		method16975(class527_sub38, (Class527_Sub34_Sub1) class527_sub34, (byte) 41);
	}

	void method16982(RSByteBuffer class527_sub38, Class527_Sub34_Sub1 class527_sub34_sub1) {
		class527_sub38.writeByte(class527_sub34_sub1.method18364((byte) -115), -1935272504);
	}

	int method10580(int i) {
		return 1;
	}

	void method10609() {
		Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) aQueue10853.poll();
		if (null != class527_sub34_sub1) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4411, client.aClass109_11067.aClass2_1367, (byte) -68);
			class527_sub15.buffer.writeShortLE128(method10587(class527_sub34_sub1, 65535, -1729826532), 1125501201);
			class527_sub15.buffer.writeIntLE2((class527_sub34_sub1.method16356(1319623125) | class527_sub34_sub1.method16357(719777205) << 16), (byte) 47);
			class527_sub15.buffer.write128Byte((class527_sub34_sub1.method18366((byte) 43) << 1 | class527_sub34_sub1.method18364((byte) -98) & 0x1), (byte) 8);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			class527_sub34_sub1.method16363(182953128);
		}
	}

	static int method16983(int i) {
		try {
			for (int i_0_ = 0; i_0_ < Class585.aStringArray7685.length; i_0_++) {
				if (null != Class585.aStringArray7685[i_0_] && Class585.aBoolArray7695[i_0_])
					Class177.method3056((byte) -70).method369(Class585.aStringArray7685[i_0_], 230196298);
			}
		} catch (Exception_Sub2 exception_sub2) {
			return 3;
		}
		Class585.aTwitchTV7698 = new TwitchTV();
		int i_1_ = Class585.aTwitchTV7698.InitialiseTTV(Class488.method7969(-192389150));
		if (0 == i_1_)
			Class585.aBool7693 = true;
		else
			Class180.method3542(new StringBuilder().append(10).append(Class33.aString325).append(i_1_).toString(), new RuntimeException(), 1604547405);
		return 2;
	}
}

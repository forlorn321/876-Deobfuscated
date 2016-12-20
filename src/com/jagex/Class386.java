/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class386 implements Interface48 {
	Class459 aClass459_3962;
	Class205 aClass205_3963 = new Class205(64);
	public static Class346 aClass346_3964;

	public Class393 method335(int i) {
		Class393 class393 = (Class393) aClass205_3963.method3787((long) i);
		if (null != class393)
			return class393;
		byte[] is = aClass459_3962.method7470(0, i, (byte) -72);
		class393 = new Class393();
		if (is != null)
			class393.method6485(new RSByteBuffer(is), i, (byte) 7);
		aClass205_3963.method3790(class393, (long) i);
		return class393;
	}

	public Class393 method336(int i, int i_0_) {
		Class393 class393 = (Class393) aClass205_3963.method3787((long) i);
		if (null != class393)
			return class393;
		byte[] is = aClass459_3962.method7470(0, i, (byte) -1);
		class393 = new Class393();
		if (is != null)
			class393.method6485(new RSByteBuffer(is), i, (byte) 7);
		aClass205_3963.method3790(class393, (long) i);
		return class393;
	}

	public Class386(Class459 class459) {
		aClass459_3962 = class459;
	}

	static void method6432(Class665 class665, byte i) {
		class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1] = ((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((1769813785 * class665.anInt8526) - 1)]), -1952542382)).method4750(Class671.aClass97_8584, (byte) 1) ? 1 : 0;
	}

	static final void method6433(Class665 class665, int i) {
		class665.anInt8528 -= 433009517;
		class665.anInt8526 -= 307142523;
		String string = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261]);
		boolean bool = class665.anIntArray8525[1769813785 * class665.anInt8526] == 1;
		boolean bool_1_ = (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1] == 1);
		boolean bool_2_ = (class665.anIntArray8525[2 + 1769813785 * class665.anInt8526] == 1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4502, client.aClass109_11066.aClass2_1367, (byte) -73);
		class527_sub15.buffer.writeShort(Class208_Sub18.method15632(string, (byte) -120) + 1, 1404835786);
		class527_sub15.buffer.writeString(string, -878797225);
		int i_3_ = 0;
		if (bool)
			i_3_ |= 0x1;
		if (bool_1_)
			i_3_ |= 0x2;
		if (bool_2_)
			i_3_ |= 0x4;
		class527_sub15.buffer.writeByte(i_3_, -1038500326);
		client.aClass109_11066.method1969(class527_sub15, (byte) 1);
	}

	static final void method6434(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class266.method5045((byte) 1) ? 1 : 0;
	}

	static final void method6435(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class508.method8274(class243, class240, class665, 435105191);
	}
}

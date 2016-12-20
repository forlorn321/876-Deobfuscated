/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class391 implements Interface46 {
	Class205 aClass205_4006 = new Class205(64);
	Class459 aClass459_4007;

	public void method6474() {
		aClass205_4006.method3793((byte) 92);
	}

	public synchronized Class394 method330(int i, int i_0_) {
		Class394 class394 = (Class394) aClass205_4006.method3787((long) i);
		if (null != class394)
			return class394;
		byte[] is = aClass459_4007.method7470(0, i, (byte) -54);
		class394 = new Class394();
		if (null != is)
			class394.method6492(new RSByteBuffer(is), (byte) 1);
		class394.method6494(-908837490);
		aClass205_4006.method3790(class394, (long) i);
		return class394;
	}

	public void method6475(int i) {
		aClass205_4006.method3793((byte) 75);
	}

	public synchronized Class394 method331(int i) {
		Class394 class394 = (Class394) aClass205_4006.method3787((long) i);
		if (null != class394)
			return class394;
		byte[] is = aClass459_4007.method7470(0, i, (byte) -77);
		class394 = new Class394();
		if (null != is)
			class394.method6492(new RSByteBuffer(is), (byte) 1);
		class394.method6494(-908837490);
		aClass205_4006.method3790(class394, (long) i);
		return class394;
	}

	public void method6476() {
		aClass205_4006.method3793((byte) 103);
	}

	public Class391(Class459 class459) {
		aClass459_4007 = class459;
	}

	public synchronized Class394 method332(int i) {
		Class394 class394 = (Class394) aClass205_4006.method3787((long) i);
		if (null != class394)
			return class394;
		byte[] is = aClass459_4007.method7470(0, i, (byte) -88);
		class394 = new Class394();
		if (null != is)
			class394.method6492(new RSByteBuffer(is), (byte) 1);
		class394.method6494(-908837490);
		aClass205_4006.method3790(class394, (long) i);
		return class394;
	}

	public void method6477() {
		aClass205_4006.method3793((byte) 122);
	}

	static final void method6478(Class665 class665, byte i) throws Exception_Sub6 {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class303 class303 = Class622.method10234(i_1_, 277580544);
		if (null == class303)
			throw new RuntimeException();
		Class208_Sub10.aClass296_Sub1_9923.method5367(class303, (byte) 8);
	}

	static final void method6479(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	public static final void method6480(int i) {
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4466, class109.aClass2_1367, (byte) 41);
		class527_sub15.buffer.writeByte(0, 1557111935);
		class109.method1969(class527_sub15, (byte) 1);
	}
}

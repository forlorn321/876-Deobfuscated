/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class397 implements Interface49 {
	Class459 aClass459_4120;
	Class205 aClass205_4121 = new Class205(64);

	public void method6509(int i) {
		aClass205_4121.method3793((byte) 119);
	}

	public Class388 method337(int i) {
		Class388 class388 = (Class388) aClass205_4121.method3787((long) i);
		if (class388 != null)
			return class388;
		byte[] is = aClass459_4120.method7470(1, i, (byte) -82);
		class388 = new Class388();
		class388.anInt3975 = 1329650645 * i;
		if (null != is)
			class388.method6444(new RSByteBuffer(is), 456151903);
		class388.method6453(1999821874);
		aClass205_4121.method3790(class388, (long) i);
		return class388;
	}

	public Class397(Class459 class459) {
		aClass459_4120 = class459;
	}

	public Class388 method339(int i, byte i_0_) {
		Class388 class388 = (Class388) aClass205_4121.method3787((long) i);
		if (class388 != null)
			return class388;
		byte[] is = aClass459_4120.method7470(1, i, (byte) -51);
		class388 = new Class388();
		class388.anInt3975 = 1329650645 * i;
		if (null != is)
			class388.method6444(new RSByteBuffer(is), 456151903);
		class388.method6453(1999821874);
		aClass205_4121.method3790(class388, (long) i);
		return class388;
	}

	public Class388 method338(int i) {
		Class388 class388 = (Class388) aClass205_4121.method3787((long) i);
		if (class388 != null)
			return class388;
		byte[] is = aClass459_4120.method7470(1, i, (byte) -55);
		class388 = new Class388();
		class388.anInt3975 = 1329650645 * i;
		if (null != is)
			class388.method6444(new RSByteBuffer(is), 456151903);
		class388.method6453(1999821874);
		aClass205_4121.method3790(class388, (long) i);
		return class388;
	}

	public void method6510() {
		aClass205_4121.method3793((byte) 119);
	}

	public void method6511() {
		aClass205_4121.method3793((byte) 73);
	}

	static final void method6512(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int i_1_ = 0;
		if (Class281.method5186(string, 2135970854))
			i_1_ = Class360.method6326(string, (byte) 27);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4465, client.aClass109_11067.aClass2_1367, (byte) 57);
		class527_sub15.buffer.writeInt(i_1_, 900740643);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public static void method6513(Class240 class240, Class243 class243, boolean bool, int i) {
		Class296_Sub1.method15695(class240.aClass243Array2392, class243, bool, 1785185870);
	}

	static Class389 method6514(RSByteBuffer class527_sub38, int i) {
		Class400 class400 = (Class183.method3556(1641508725)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_2_ = class527_sub38.readShort();
		int i_3_ = class527_sub38.readShort();
		int i_4_ = class527_sub38.readUnsignedShort();
		int i_5_ = class527_sub38.readUnsignedShort();
		int i_6_ = class527_sub38.readShort();
		int i_7_ = class527_sub38.method16466(-1982472463);
		int i_8_ = class527_sub38.readInt();
		return new Class389(class400, class384, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_);
	}
}

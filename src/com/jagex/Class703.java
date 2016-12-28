/* Class703 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class703 {
	public Class521_Sub2 aClass521_Sub2_8803 = new Class521_Sub2();
	Class521_Sub2 aClass521_Sub2_8804;

	public Class521_Sub2 method8252(int i) {
		Class521_Sub2 class521_sub2 = aClass521_Sub2_8803.aClass521_Sub2_10295;
		if (class521_sub2 == aClass521_Sub2_8803) {
			aClass521_Sub2_8804 = null;
			return null;
		}
		aClass521_Sub2_8804 = class521_sub2.aClass521_Sub2_10295;
		return class521_sub2;
	}

	public Class521_Sub2 method8253(int i) {
		Class521_Sub2 class521_sub2 = aClass521_Sub2_8804;
		if (class521_sub2 == aClass521_Sub2_8803) {
			aClass521_Sub2_8804 = null;
			return null;
		}
		aClass521_Sub2_8804 = class521_sub2.aClass521_Sub2_10295;
		return class521_sub2;
	}

	public void method8254(int i) {
		for (;;) {
			Class521_Sub2 class521_sub2 = aClass521_Sub2_8803.aClass521_Sub2_10295;
			if (class521_sub2 == aClass521_Sub2_8803)
				break;
			class521_sub2.method9336(477111219);
		}
		aClass521_Sub2_8804 = null;
	}

	public Class703() {
		aClass521_Sub2_8803.aClass521_Sub2_10295 = aClass521_Sub2_8803;
		aClass521_Sub2_8803.aClass521_Sub2_10294 = aClass521_Sub2_8803;
	}

	public void method8255(Class521_Sub2 class521_sub2, int i) {
		if (null != class521_sub2.aClass521_Sub2_10294)
			class521_sub2.method9336(-91559777);
		class521_sub2.aClass521_Sub2_10294 = aClass521_Sub2_8803.aClass521_Sub2_10294;
		class521_sub2.aClass521_Sub2_10295 = aClass521_Sub2_8803;
		class521_sub2.aClass521_Sub2_10294.aClass521_Sub2_10295 = class521_sub2;
		class521_sub2.aClass521_Sub2_10295.aClass521_Sub2_10294 = class521_sub2;
	}

	public void method8256() {
		for (;;) {
			Class521_Sub2 class521_sub2 = aClass521_Sub2_8803.aClass521_Sub2_10295;
			if (class521_sub2 == aClass521_Sub2_8803)
				break;
			class521_sub2.method9336(2115506363);
		}
		aClass521_Sub2_8804 = null;
	}

	public static Class387 method8257(RSByteBuffer class536_sub33, byte i) {
		int i_0_ = class536_sub33.readUnsignedByte();
		Class395 class395 = (Class333_Sub3.method9230(1524574745)[class536_sub33.readUnsignedByte()]);
		Class399 class399 = (Class266.method3692(878827744)[class536_sub33.readUnsignedByte()]);
		int i_1_ = class536_sub33.readShort();
		int i_2_ = class536_sub33.readShort();
		int i_3_ = class536_sub33.readUnsignedShort();
		int i_4_ = class536_sub33.readUnsignedShort();
		int i_5_ = class536_sub33.readInt();
		int i_6_ = class536_sub33.readInt();
		int i_7_ = class536_sub33.readInt();
		boolean bool = class536_sub33.readUnsignedByte() == 1;
		return new Class387(i_0_, class395, class399, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, bool);
	}

	static final void method8259(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4415, class106.aClass15_1258, 1684418284);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		int i_9_ = (class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(810974573 * class668.aClass382_8551.anInt4013, -1778059594);
		class668.aClass382_8551.aClass536_Sub18_Sub10_4012.method10711(class536_sub23.aClass536_Sub33_Sub2_10528, class668.aClass382_8551.anIntArray4014, (byte) 0);
		class536_sub23.aClass536_Sub33_Sub2_10528.method9699((class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525 - i_9_), -300297454);
		class106.method1409(class536_sub23, 346931047);
	}
}

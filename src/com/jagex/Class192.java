/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class192 implements Interface42 {
	Class211 this$0;
	public static Class292 aClass292_2177;

	public float method285(int i) {
		return ((float) ClientSetting.aClass536_Sub40_8843.soundVolumeSetting.method10213(544654630) / 255.0F);
	}

	Class192(Class211 class211) {
		this$0 = class211;
	}

	public float method286() {
		return ((float) ClientSetting.aClass536_Sub40_8843.soundVolumeSetting.method10213(-1113385635) / 255.0F);
	}

	public float method287() {
		return ((float) ClientSetting.aClass536_Sub40_8843.soundVolumeSetting.method10213(231527432) / 255.0F);
	}

	public float method288() {
		return ((float) ClientSetting.aClass536_Sub40_8843.soundVolumeSetting.method10213(-1895917188) / 255.0F);
	}

	static final void method2841(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.groundBlendingSetting.method10172(1602714949) ? 1 : 0;
	}

	public static void method2842(GraphicalRenderer class167, long l) {
		Class626.anInt8153 = 1485776131 * Class626.anInt8160;
		Class626.anInt8160 = 0;
		Class249.method3450(1465734066);
		Iterator iterator = Class626.aList8161.iterator();
		while (iterator.hasNext()) {
			Class627 class627 = (Class627) iterator.next();
			boolean bool = class627.method7471(class167, l);
			if (!bool) {
				iterator.remove();
				Class626.aClass627Array8157[Class626.anInt8162 * 1973009219] = class627;
				Class626.anInt8162 = (1 + Class626.anInt8162 * 1973009219 & (Class169.anIntArray1878[500175661 * Class626.anInt8167])) * 212543851;
			}
		}
	}

	static void method2843(int i, String string, String string_0_, int i_1_) {
		if (null != client.aClass106_11322) {
			OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4514, client.aClass106_11322.aClass15_1258, 1777800533);
			class536_sub23.stream.writeShort((1 + ObjTypeDecoder.method7315(string, -1311964413) + ObjTypeDecoder.method7315(string_0_, -1311964413)), -1778059594);
			class536_sub23.stream.method9729(i, -1433897343);
			class536_sub23.stream.method9785(string_0_, (byte) 76);
			class536_sub23.stream.method9785(string, (byte) 85);
			client.aClass106_11322.writePacket(class536_sub23, 418524173);
		}
	}
}

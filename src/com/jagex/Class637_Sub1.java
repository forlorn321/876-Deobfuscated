/* Class637_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;
import java.util.Queue;

public class Class637_Sub1 extends Class637 {
	Queue aQueue10826 = new LinkedList();

	Class637_Sub1() {
		/* empty */
	}

	void method7624(int i) {
		Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue10826.poll();
		if (class536_sub31_sub2 != null) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4429, client.aClass106_11322.aClass15_1258, 829843227);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeIntLE((class536_sub31_sub2.method9647(-2090995109) | class536_sub31_sub2.method9643((byte) 1) << 16), 1884805680);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort128(method7628(class536_sub31_sub2, 65535, 52652528), (byte) 0);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9728((class536_sub31_sub2.method10820(65536) << 1 | class536_sub31_sub2.method10834(-1411037171) & 0x1), (byte) 54);
			client.aClass106_11322.method1409(class536_sub23, 1114928092);
			class536_sub31_sub2.method9641(-2111772564);
		}
	}

	boolean method7632(byte i) {
		return (!aQueue10826.isEmpty() || (1257646413264406655L * aLong8298 < Class249.method3450(1679308468) - 2000L));
	}

	Class536_Sub23 method7633(int i) {
		return Class213.method3075(OutgoingPacket.aClass414_4455, client.aClass106_11322.aClass15_1258, 1667170378);
	}

	void method9913(RSByteBuffer class536_sub33, Class536_Sub31_Sub2 class536_sub31_sub2, int i) {
		class536_sub33.writeByte(class536_sub31_sub2.method10834(-1411037171), 465637339);
	}

	int method7629(int i) {
		return 1;
	}

	void method7631() {
		Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) aQueue10826.poll();
		if (class536_sub31_sub2 != null) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4429, client.aClass106_11322.aClass15_1258, 1786998046);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeIntLE((class536_sub31_sub2.method9647(-1657912532) | class536_sub31_sub2.method9643((byte) 1) << 16), 1795334448);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort128(method7628(class536_sub31_sub2, 65535, -195482653), (byte) 0);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9728((class536_sub31_sub2.method10820(65536) << 1 | class536_sub31_sub2.method10834(-1411037171) & 0x1), (byte) 101);
			client.aClass106_11322.method1409(class536_sub23, 1236869222);
			class536_sub31_sub2.method9641(-2013730592);
		}
	}

	boolean method7639() {
		return (!aQueue10826.isEmpty() || (1257646413264406655L * aLong8298 < Class249.method3450(1383023823) - 2000L));
	}

	void method7627(RSByteBuffer class536_sub33, Class536_Sub31 class536_sub31, int i) {
		method9913(class536_sub33, (Class536_Sub31_Sub2) class536_sub31, 1280517682);
	}

	Class536_Sub23 method7634() {
		return Class213.method3075(OutgoingPacket.aClass414_4455, client.aClass106_11322.aClass15_1258, 2040563639);
	}

	int method7635() {
		return 1;
	}

	void method7636(RSByteBuffer class536_sub33, Class536_Sub31 class536_sub31) {
		method9913(class536_sub33, (Class536_Sub31_Sub2) class536_sub31, 5589289);
	}

	void method9914(Class536_Sub31_Sub2 class536_sub31_sub2, int i) {
		aQueue10826.add(class536_sub31_sub2);
		if (aQueue10826.size() > 10)
			aQueue10826.poll();
	}
}

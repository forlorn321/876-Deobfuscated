/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class227 implements Interface27 {
	Class213 this$0;
	int anInt2358;

	Class227(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2358 = class536_sub33.readUnsignedShort() * -1090852449;
	}

	public void method154(Class226 class226, short i) {
		Class224 class224 = ((Class224) class226.method3220((byte) 35).get(anInt2358 * 2048258655));
		class226.method3232(anInt2358 * 2048258655, 1779872941);
		class224.method3204((byte) 54);
	}

	public void method153(Class226 class226) {
		Class224 class224 = ((Class224) class226.method3220((byte) 69).get(anInt2358 * 2048258655));
		class226.method3232(anInt2358 * 2048258655, 1301432198);
		class224.method3204((byte) 32);
	}

	public void method155(Class226 class226) {
		Class224 class224 = ((Class224) class226.method3220((byte) 38).get(anInt2358 * 2048258655));
		class226.method3232(anInt2358 * 2048258655, 1472894004);
		class224.method3204((byte) 104);
	}

	static final void method3284(IComponentDefinitions class251, Class668 class668, int i) {
		Class2 class2 = class251.method3470(Class196.aClass410_2202, client.anInterface51_11196, (byte) -98);
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Point point = class2.method544(class251.text, -1606950689 * class251.anInt2573, -1204882523 * class251.lineHeight, i_0_, Class195.aClass143Array2201, 1648633153);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = point.x;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = point.y;
	}

	public static void method3285(byte i) {
		synchronized (PlayerAppearance.aClass199_8081) {
			PlayerAppearance.aClass199_8081.method2892(-2002707872);
		}
		synchronized (PlayerAppearance.aClass199_8082) {
			PlayerAppearance.aClass199_8082.method2892(465491948);
		}
	}
}

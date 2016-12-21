/* Class205_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;

public class Class205_Sub1 extends Class205 {
	int anInt9855;
	int anInt9856;
	int anInt9857;

	Class205_Sub1(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9856 = class536_sub33.readUnsignedShort() * 362021527;
		anInt9855 = class536_sub33.readUnsignedShort() * 1093093763;
		anInt9857 = class536_sub33.readUnsignedByte(-622415479) * -921148139;
	}

	public void method2940(int i) {
		Class189 class189 = Class193.aClass189Array2180[984325415 * anInt9856];
		Class204 class204 = Class193.aClass204Array2182[1354304811 * anInt9855];
		class204.method2931(class189, anInt9857 * 129942077, 1602443825);
	}

	public void method2943() {
		Class189 class189 = Class193.aClass189Array2180[984325415 * anInt9856];
		Class204 class204 = Class193.aClass204Array2182[1354304811 * anInt9855];
		class204.method2931(class189, anInt9857 * 129942077, 1602443825);
	}

	public void method2942() {
		Class189 class189 = Class193.aClass189Array2180[984325415 * anInt9856];
		Class204 class204 = Class193.aClass204Array2182[1354304811 * anInt9855];
		class204.method2931(class189, anInt9857 * 129942077, 1602443825);
	}

	public static void method9054(int i) {
		Container container = Class300.method4022((byte) 0);
		int i_0_ = container.getSize().width;
		int i_1_ = container.getSize().height;
		if (container == Class145.aFrame1692) {
			Insets insets = Class145.aFrame1692.getInsets();
			i_0_ -= insets.left + insets.right;
			i_1_ -= insets.top + insets.bottom;
		}
		if (Class500.anInt6841 * 569699291 != i_0_ || Class313.anInt3499 * 160996593 != i_1_ || client.aBool11026) {
			if (Class677.aClass167_8609 == null || Class677.aClass167_8609.method2011())
				Class66.method1075(-1665442280);
			else {
				Class500.anInt6841 = -186574765 * i_0_;
				Class313.anInt3499 = i_1_ * 558289937;
			}
			client.aLong11148 = ((Class249.method3450(1458582149) + 500L) * 9143835520898944831L);
			client.aBool11026 = false;
		}
	}
}

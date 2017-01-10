/* Class536_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class536_Sub34 extends Class536 {
	int anInt10619;
	int[] anIntArray10620;
	int anInt10621;
	int[] anIntArray10622;
	Field[] aFieldArray10623;
	int[] anIntArray10624;
	Method[] aMethodArray10625;
	byte[][][] aByteArrayArrayArray10626;

	Class536_Sub34() {
		/* empty */
	}

	public static void method9816(GraphicalRenderer class167, JS5ResourceProvider class461, byte i) {
		Class179[] class179s = Class181.method2720(class461, Class98_Sub1_Sub2.anInt11334 * -96459827, 0);
		Class458_Sub5.aClass143Array10338 = new NativeSprite[class179s.length];
		for (int i_0_ = 0; i_0_ < class179s.length; i_0_++)
			Class458_Sub5.aClass143Array10338[i_0_] = class167.method2082(class179s[i_0_], true);
		class179s = Class181.method2720(class461, -468583255 * Class693.anInt8723, 0);
		Class688_Sub2_Sub1.aClass143Array11872 = new NativeSprite[class179s.length];
		for (int i_1_ = 0; i_1_ < class179s.length; i_1_++)
			Class688_Sub2_Sub1.aClass143Array11872[i_1_] = class167.method2082(class179s[i_1_], true);
		class179s = Class181.method2720(class461, 590375313 * Class205_Sub5.anInt9870, 0);
		Class610.aClass143Array7922 = new NativeSprite[class179s.length];
		int i_2_ = 25;
		for (int i_3_ = 0; i_3_ < class179s.length; i_3_++) {
			class179s[i_3_].method2649(-i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0));
			Class610.aClass143Array7922[i_3_] = class167.method2082(class179s[i_3_], true);
		}
		class179s = Class181.method2720(class461, -1246344865 * Class35.anInt293, 0);
		Class28.aClass143Array259 = new NativeSprite[class179s.length];
		for (int i_4_ = 0; i_4_ < class179s.length; i_4_++)
			Class28.aClass143Array259[i_4_] = class167.method2082(class179s[i_4_], true);
		class179s = Class181.method2720(class461, Class389.anInt4047 * 1917064127, 0);
		Class35.aClass143Array292 = new NativeSprite[class179s.length];
		i_2_ = 12;
		for (int i_5_ = 0; i_5_ < class179s.length; i_5_++) {
			class179s[i_5_].method2649(-i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0));
			Class35.aClass143Array292[i_5_] = class167.method2082(class179s[i_5_], true);
		}
		class179s = Class181.method2720(class461, Class35.anInt296 * -709600219, 0);
		Class195.aClass143Array2201 = new NativeSprite[class179s.length];
		i_2_ = 12;
		for (int i_6_ = 0; i_6_ < class179s.length; i_6_++) {
			class179s[i_6_].method2649(-i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0));
			Class195.aClass143Array2201[i_6_] = class167.method2082(class179s[i_6_], true);
		}
		PlayerStat.aClass143_8090 = class167.method2082(Class181.method2718(class461, (157454897 * (Class315_Sub1_Sub1.anInt11395)), 0), true);
		Class289.aClass143_3215 = class167.method2082(Class181.method2718(class461, (Class35.anInt297 * 1355499421), 0), true);
		class179s = Class181.method2720(class461, Class662.anInt8513 * 1869435031, 0);
		Class62.aClass143Array701 = new NativeSprite[class179s.length];
		for (int i_7_ = 0; i_7_ < class179s.length; i_7_++)
			Class62.aClass143Array701[i_7_] = class167.method2082(class179s[i_7_], true);
	}
}

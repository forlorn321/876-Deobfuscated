/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.Stack;

public class Class270 implements Interface6 {
	public Class method52() {
		return com.jagex.Class277.class;
	}

	Class270() {
		/* empty */
	}

	public Class method51(int i) {
		return com.jagex.Class277.class;
	}

	public DefinitionI method53(int i, Interface12 interface12) {
		return new Class277(i, interface12);
	}

	public DefinitionI method54(int i, Interface12 interface12) {
		return new Class277(i, interface12);
	}

	public DefinitionI method55(int i, Interface12 interface12, int i_0_) {
		return new Class277(i, interface12);
	}

	public static void method3713(int i) {
		synchronized (Class563.aStack7580) {
			Class563.aStack7580 = new Stack();
		}
	}

	public static Class390[] method3714(byte i) {
		return (new Class390[] { Class390.aClass390_4056, Class390.aClass390_4049, Class390.aClass390_4059, Class390.aClass390_4051, Class390.aClass390_4052, Class390.aClass390_4053, Class390.aClass390_4050, Class390.aClass390_4054, Class390.aClass390_4048, Class390.aClass390_4057, Class390.aClass390_4058 });
	}

	static final void method3715(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}

	static boolean method3716(int i, int i_1_) {
		return i == 0 || 8 == i;
	}

	public static void method3717(int i) {
		if (client.aBool11188) {
			IComponentDefinitions class251 = Class527.method6429(1625551467 * Class663.anInt8515, client.anInt11183 * -1059472497, (byte) -11);
			if (null != class251 && null != class251.onTargetLeaveHook) {
				Class536_Sub42 class536_sub42 = new Class536_Sub42();
				class536_sub42.aClass251_10804 = class251;
				class536_sub42.anObjectArray10802 = class251.onTargetLeaveHook;
				Class618.method7388(class536_sub42, -1182649216);
			}
			client.anInt11179 = -937599055;
			client.anInt11184 = 1443325723;
			client.aBool11188 = false;
			if (null != class251)
				Class668.method8011(class251, 263642117);
		}
	}

	static final void method3718(byte i) {
		Iterator iterator = client.aClass4_11175.iterator();
		while (iterator.hasNext()) {
			Class536_Sub18_Sub4 class536_sub18_sub4 = (Class536_Sub18_Sub4) iterator.next();
			Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619;
			class649_sub1_sub5_sub4.method11028(1, (byte) 3);
			if (class649_sub1_sub5_sub4.method11032(1259470197)) {
				class536_sub18_sub4.method6484();
				class649_sub1_sub5_sub4.method11026(-159343355);
			}
		}
	}
}

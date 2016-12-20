/* Class24_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class24_Sub2 extends Class24 {
	public static Class587 aClass587_10964 = new Class587(-1);

	public Class24_Sub2(Class678 class678, Class671 class671, Class459 class459) {
		super(class678, class671, class459, Class657.aClass657_8426, 64, new Class43(com.jagex.Class587.class));
	}

	static void method17352(Class665 class665, Class501 class501, Exception exception, String string, int i) {
		StringBuilder stringbuilder = new StringBuilder(30);
		stringbuilder.append(new StringBuilder().append(string).append(" ").toString()).append(-8168620736534281759L * class665.aClass527_Sub8_Sub10_8548.aLong7106).append(" ");
		for (int i_0_ = -305384391 * class665.anInt8531 - 1; i_0_ >= 0; i_0_--)
			stringbuilder.append("").append(-8168620736534281759L * (class665.aClass659Array8520[i_0_].aClass527_Sub8_Sub10_8494.aLong7106)).append(" ");
		stringbuilder.append("").append(Integer.valueOf(class501.anInt6590 * 165927437));
		Class180.method3542(stringbuilder.toString(), exception, 1604547405);
	}
}

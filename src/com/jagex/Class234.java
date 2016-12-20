/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class234 {
	static long aLong2371;
	static long aLong2372;
	public static String aString2373;
	public static Class539 aClass539_2374;
	public static Class24_Sub18 aClass24_Sub18_2375;

	Class234() throws Throwable {
		throw new Error();
	}

	public static final synchronized long method4347(int i) {
		long l = System.currentTimeMillis();
		if (l < aLong2371 * 2008414051713072741L)
			aLong2372 += 3714074417190756217L * (2008414051713072741L * aLong2371 - l);
		aLong2371 = l * -7643567606725164179L;
		return l + 6582159358268005065L * aLong2372;
	}

	public static final synchronized long method4348() {
		long l = System.currentTimeMillis();
		if (l < aLong2371 * 2008414051713072741L)
			aLong2372 += 3714074417190756217L * (2008414051713072741L * aLong2371 - l);
		aLong2371 = l * -7643567606725164179L;
		return l + 6582159358268005065L * aLong2372;
	}

	public static final synchronized long method4349() {
		long l = System.currentTimeMillis();
		if (l < aLong2371 * 2008414051713072741L)
			aLong2372 += 3714074417190756217L * (2008414051713072741L * aLong2371 - l);
		aLong2371 = l * -7643567606725164179L;
		return l + 6582159358268005065L * aLong2372;
	}

	static String method4350(int i, int i_0_) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static final void method4351(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		for (Class522_Sub3 class522_sub3 = ((Class522_Sub3) client.aClass705_11182.method14317(297060422)); null != class522_sub3; class522_sub3 = (Class522_Sub3) client.aClass705_11182.method14320((byte) -127)) {
			if (client.anInt11019 >= -597795203 * class522_sub3.anInt10304)
				class522_sub3.method8682(98613600);
			else {
				Class638.method10576(-1058577441 * class522_sub3.anInt10301, (333227581 * class522_sub3.anInt10305 << 9) + 256, (256 + (1427941475 * class522_sub3.anInt10302 << 9)), 0, -2113695354 * class522_sub3.anInt10303, false, false, (short) 5172);
				Class29.aClass174_262.method2745(class522_sub3.aString10306, (int) (client.aFloatArray11139[0] + (float) i), (int) (client.aFloatArray11139[1] + (float) i_1_), ~0xffffff | -1268086981 * class522_sub3.anInt10300, 0, 1348145444);
			}
		}
	}
}

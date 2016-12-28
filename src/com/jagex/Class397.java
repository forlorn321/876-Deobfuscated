/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.EventQueue;

import com.jagex.twitchtv.TwitchEventResult;

public class Class397 implements Interface48 {
	Class199 aClass199_4112 = new Class199(64);
	Class461 aClass461_4113;
	public static Class461 aClass461_4114;
	static IComponentDefinitions[] aClass251Array4115;
	static EventQueue anEventQueue4116;

	public synchronized Class381 method339(int i) {
		Class381 class381 = (Class381) aClass199_4112.method2886((long) i);
		if (null != class381)
			return class381;
		byte[] is = aClass461_4113.method5556(0, i, (byte) 1);
		class381 = new Class381();
		if (is != null)
			class381.method4811(new RSByteBuffer(is), (short) 8192);
		class381.method4810(-594992518);
		aClass199_4112.method2881(class381, (long) i);
		return class381;
	}

	public synchronized Class381 method338(int i, byte i_0_) {
		Class381 class381 = (Class381) aClass199_4112.method2886((long) i);
		if (null != class381)
			return class381;
		byte[] is = aClass461_4113.method5556(0, i, (byte) 1);
		class381 = new Class381();
		if (is != null)
			class381.method4811(new RSByteBuffer(is), (short) 8192);
		class381.method4810(-743000566);
		aClass199_4112.method2881(class381, (long) i);
		return class381;
	}

	public void method4891(int i) {
		aClass199_4112.method2884((byte) -92);
	}

	public Class397(Class461 class461) {
		aClass461_4113 = class461;
	}

	public void method4892() {
		aClass199_4112.method2884((byte) -50);
	}

	public synchronized Class381 method341(int i) {
		Class381 class381 = (Class381) aClass199_4112.method2886((long) i);
		if (null != class381)
			return class381;
		byte[] is = aClass461_4113.method5556(0, i, (byte) 1);
		class381 = new Class381();
		if (is != null)
			class381.method4811(new RSByteBuffer(is), (short) 8192);
		class381.method4810(941587169);
		aClass199_4112.method2881(class381, (long) i);
		return class381;
	}

	public void method4893() {
		aClass199_4112.method2884((byte) -67);
	}

	public synchronized Class381 method340(int i) {
		Class381 class381 = (Class381) aClass199_4112.method2886((long) i);
		if (null != class381)
			return class381;
		byte[] is = aClass461_4113.method5556(0, i, (byte) 1);
		class381 = new Class381();
		if (is != null)
			class381.method4811(new RSByteBuffer(is), (short) 8192);
		class381.method4810(-1448524625);
		aClass199_4112.method2881(class381, (long) i);
		return class381;
	}

	public void method4894() {
		aClass199_4112.method2884((byte) -40);
	}

	public void method4895() {
		aClass199_4112.method2884((byte) -118);
	}

	static void method4896(int i, int i_1_, byte i_2_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_1_);
		Class572 class572 = twitcheventresult.method4952();
		if (class572 != null)
			Class306.method4121(class572.method78(), twitcheventresult, (byte) 1);
	}

	static final void method4897(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub35_10790.method10213(2121927808);
	}
}

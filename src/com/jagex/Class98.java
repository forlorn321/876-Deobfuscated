/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class98 implements Interface12 {
	protected int anInt1180;
	static short aShort1181;

	public int method73() {
		return 1628850519 * anInt1180;
	}

	public int method71(int i) {
		return 1628850519 * anInt1180;
	}

	public int method12() {
		return 1628850519 * anInt1180;
	}

	Class98(Class670 class670, Class664 class664, int i) {
		anInt1180 = 1862709863 * i;
	}

	static final void method1322(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1519907750) != null)
			string = string.substring(0, string.length() - 1);
		class251.onPlayerGroupVarpTransmitHook = Class33.method796(string, class668, (short) 14501);
		class251.hasComponentHook = true;
	}
}

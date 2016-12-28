/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class99 {
	static boolean aBool1182 = false;

	public static void method1323() {
		if (!aBool1182) {
			Class55.method954((client.aClass515_11066.method6249(-666795002).aClass556ArrayArrayArray7432), 1644201860);
			if ((client.aClass515_11066.method6249(397301314).aClass556ArrayArrayArray7437) != null)
				Class55.method954((client.aClass515_11066.method6249(-262233497).aClass556ArrayArrayArray7437), 1255640503);
			aBool1182 = true;
		}
	}

	Class99() throws Throwable {
		throw new Error();
	}

	public static void method1324(byte i) {
		synchronized (Class659.aQueue8499) {
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) Class659.aQueue8499.poll();
				if (class536_sub31_sub2 == null)
					break;
				class536_sub31_sub2.method9641(-1538012883);
			}
		}
	}

	static final void method1325(IComponentDefinitions class251, int i, int i_0_, Class668 class668, int i_1_) {
		if (null == class251.opChars) {
			if (i_0_ > 0) {
				class251.opKeys = new byte[11][];
				class251.aByteArrayArray2648 = new byte[11][];
				class251.opKeyRates = new int[11];
				class251.anIntArray2722 = new int[11];
				class251.opChars = new int[11];
			} else
				return;
		}
		class251.opChars[i] = i_0_;
		if (i_0_ > 0)
			class251.aBool2582 = true;
		else {
			class251.aBool2582 = false;
			for (int i_2_ = 0; i_2_ < class251.opKeys.length; i_2_++) {
				if (null != class251.opKeys[i_2_] || class251.opChars[i_2_] > 0) {
					class251.aBool2582 = true;
					break;
				}
			}
		}
	}

	static final void method1326(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1548100402) != null)
			string = string.substring(0, string.length() - 1);
		class251.onDialogAbortHook = Class33.method796(string, class668, (short) -15409);
		class251.hasComponentHook = true;
	}

	static final void method1327(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1640364600) != null)
			string = string.substring(0, string.length() - 1);
		class251.onOptHook = Class33.method796(string, class668, (short) 12386);
		class251.hasComponentHook = true;
	}

	static final void method1328(Class668 class668, byte i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_3_ < 0 || i_3_ > 1)
			i_3_ = 0;
		Class651.method7863(1 == i_3_, (byte) 109);
	}

	static final void method1329(Class668 class668, short i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
	}

	static void method1330(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class226.method3276(string, (byte) 68);
	}

	public static Class536_Sub18_Sub18 method1331(int i, Class288 class288, RSByteBuffer class536_sub33, int i_4_) {
		if (Class288.aClass288_3212 == class288)
			return new Class536_Sub18_Sub18_Sub1(i, class536_sub33);
		if (Class288.aClass288_3211 == class288)
			return new Class536_Sub18_Sub18_Sub2(i, class536_sub33);
		return null;
	}

	public static void method1332(byte i) {
		if (!aBool1182) {
			Class55.method954((client.aClass515_11066.method6249(1124939809).aClass556ArrayArrayArray7432), 1529060771);
			if ((client.aClass515_11066.method6249(-1950149946).aClass556ArrayArrayArray7437) != null)
				Class55.method954((client.aClass515_11066.method6249(1031777303).aClass556ArrayArrayArray7437), 1588069801);
			aBool1182 = true;
		}
	}
}

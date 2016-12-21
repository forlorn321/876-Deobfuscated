/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class212 implements Interface27 {
	Class213 this$0;
	int anInt2293;
	int anInt2294;

	public void method153(Class226 class226) {
		if (anInt2294 * -1343194413 != -1) {
			try {
				class226.method3228(513272781).method107(((Class324) this$0.anInterface28_2296.method158(-2121815637).method70(-1343194413 * anInt2294, (byte) 72)), 1289296955 * anInt2293, (byte) 25);
			} catch (Exception_Sub4 exception_sub4) {
				/* empty */
			}
		}
	}

	Class212(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		int i = class536_sub33.readUnsignedShort((short) 12672);
		if (65535 != i) {
			anInt2294 = -308941477 * i;
			anInt2293 = class536_sub33.readInt(-643681586) * 738155763;
		} else {
			anInt2294 = 308941477;
			anInt2293 = 0;
		}
	}

	public void method154(Class226 class226, short i) {
		if (anInt2294 * -1343194413 != -1) {
			try {
				class226.method3228(-1157383056).method107(((Class324) this$0.anInterface28_2296.method158(-2006166930).method70(-1343194413 * anInt2294, (byte) 15)), 1289296955 * anInt2293, (byte) -12);
			} catch (Exception_Sub4 exception_sub4) {
				/* empty */
			}
		}
	}

	public void method155(Class226 class226) {
		if (anInt2294 * -1343194413 != -1) {
			try {
				class226.method3228(1329910302).method107(((Class324) this$0.anInterface28_2296.method158(-2136471968).method70(-1343194413 * anInt2294, (byte) -9)), 1289296955 * anInt2293, (byte) 82);
			} catch (Exception_Sub4 exception_sub4) {
				/* empty */
			}
		}
	}

	public static final void method3067(long l) {
		if (l > 0L) {
			if (l % 10L == 0L) {
				Class310.method4177(l - 1L);
				Class310.method4177(1L);
			} else
				Class310.method4177(l);
		}
	}

	static final void method3068(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1158267747 * Class75.anInt819;
	}

	static final void method3069(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 57582191 * client.anInt11073;
	}
}

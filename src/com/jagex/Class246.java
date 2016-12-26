/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class246 implements Interface75 {
	static int anInt2466;
	static Class246 aClass246_2467;
	static Class246 aClass246_2468;
	static Class246 aClass246_2469;
	static Class246 aClass246_2470 = new Class246(0, 0);
	int anInt2471;
	int anInt2472;
	public static Class466 aClass466_2473;
	public static int anInt2474;
	static int anInt2475;

	public int method73() {
		return 122144917 * anInt2471;
	}

	static {
		aClass246_2467 = new Class246(1, 1);
		aClass246_2468 = new Class246(3, 2);
		aClass246_2469 = new Class246(2, 3);
	}

	public int method78() {
		return 122144917 * anInt2471;
	}

	static Class246[] method3415(int i) {
		return new Class246[] { aClass246_2470, aClass246_2467, aClass246_2469, aClass246_2468 };
	}

	public int method12() {
		return 122144917 * anInt2471;
	}

	Class246(int i, int i_0_) {
		anInt2472 = i * -254338549;
		anInt2471 = -771702083 * i_0_;
	}

	static final void method3416(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class520.method6351(class251, class234, class668, 2093598409);
	}

	static final void method3417(Class668 class668, byte i) {
		Class683.aClass301_Sub1_8651.method4047((byte) 31);
	}

	public static void method3418(byte i) {
		if ((9 == client.anInt11101 * -708374433 || client.anInt11101 * -708374433 == 10) && null != client.aClass106_11322) {
			for (;;) {
				Interface68 interface68 = (Interface68) Class586.aLinkedList7708.poll();
				if (interface68 == null)
					break;
				interface68.method206(1196366798);
			}
		}
	}
}

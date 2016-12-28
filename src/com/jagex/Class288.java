/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class288 {
	int anInt3210;
	static Class288 aClass288_3211;
	static Class288 aClass288_3212 = new Class288(0);

	static {
		aClass288_3211 = new Class288(1);
	}

	Class288(int i) {
		anInt3210 = 1865017257 * i;
	}

	static void method3915(RSByteBuffer class536_sub33, int i, int i_0_) {
		if (GameShell.aClass18_6878 != null) {
			try {
				GameShell.aClass18_6878.method673(0L);
				GameShell.aClass18_6878.method678((class536_sub33.buffer), i, 24, -1030297220);
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	static final void method3916(Class668 class668, int i) {
		ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.lightingDetailSetting, (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1 ? 1 : 0, (byte) 1);
		Class184.method2769(1441080267);
		client.aClass515_11066.method6252(1796531619).method7581((byte) 8);
		Class27.method763(1916697484);
		client.aBool11015 = false;
	}
}

/* Class421 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class SubIncomingPacket {
	public static SubIncomingPacket REMOVE_GROUND_ITEM;
	public static SubIncomingPacket aClass421_4593;
	public static SubIncomingPacket aClass421_4594;
	public static SubIncomingPacket aClass421_4595 = new SubIncomingPacket(21);
	public static SubIncomingPacket aClass421_4596;
	public static SubIncomingPacket aClass421_4597;
	public static SubIncomingPacket aClass421_4598;
	public static SubIncomingPacket aClass421_4599;
	public static SubIncomingPacket ADD_GROUND_ITEM;
	public static SubIncomingPacket aClass421_4601;
	public static SubIncomingPacket aClass421_4602;
	public static SubIncomingPacket aClass421_4603;
	public static SubIncomingPacket aClass421_4604;
	public static SubIncomingPacket aClass421_4605;
	public static SubIncomingPacket aClass421_4606;

	public static SubIncomingPacket[] method6714() {
		return (new SubIncomingPacket[] { aClass421_4595, aClass421_4593, aClass421_4594, aClass421_4606, aClass421_4597, aClass421_4598, REMOVE_GROUND_ITEM, aClass421_4599, ADD_GROUND_ITEM, aClass421_4601, aClass421_4602, aClass421_4603, aClass421_4596, aClass421_4605, aClass421_4604 });
	}
	
	public int id;

	static {
		aClass421_4593 = new SubIncomingPacket(0);
		aClass421_4594 = new SubIncomingPacket(1);
		aClass421_4606 = new SubIncomingPacket(2);
		aClass421_4597 = new SubIncomingPacket(3);
		aClass421_4598 = new SubIncomingPacket(4);
		REMOVE_GROUND_ITEM = new SubIncomingPacket(5);
		aClass421_4599 = new SubIncomingPacket(6);
		ADD_GROUND_ITEM = new SubIncomingPacket(7);
		aClass421_4601 = new SubIncomingPacket(8);
		aClass421_4602 = new SubIncomingPacket(9);
		aClass421_4603 = new SubIncomingPacket(10);
		aClass421_4596 = new SubIncomingPacket(11);
		aClass421_4605 = new SubIncomingPacket(12);
		aClass421_4604 = new SubIncomingPacket(13);
	}

	SubIncomingPacket(int i) {
		this.id = i;
		/* empty */
	}

	public static void method6715(Class527_Sub34 class527_sub34, int i) {
		if (!Class167.method2677(-1927019389 * client.anInt11048, (byte) 17))
			class527_sub34.method16363(182953128);
		else
			Class642.aClass639_Sub1_8344.method10605(class527_sub34, -1494079014);
	}

	static final void method6716(Class665 class665, int i) {
		if (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -51) != Class309.aClass309_3459)
			throw new RuntimeException();
		((Class696_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5472(257334422)).method17152((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 2147480106);
	}
}

/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class353 {
	static final int anInt3732 = 2;
	long aLong3733;
	Class708 aClass708_3734;
	static final int anInt3735 = 1;
	long aLong3736 = -3913866828255632411L;
	static final int anInt3737 = 3;
	static final int anInt3738 = 4;
	static final int anInt3739 = 5;
	public static int anInt3740;

	public Class353(RSByteBuffer buffer) {
		aClass708_3734 = new Class708();
		changeSettings(buffer);
	}

	void changeSettings(RSByteBuffer buffer) {
		aLong3733 = buffer.readLong() * 7828786957485518831L;
		aLong3736 = buffer.readLong() * 3913866828255632411L;
		for (int opcode = buffer.readUnsignedByte(); opcode != 0; opcode = buffer.readUnsignedByte()) {
			ChangeClanSettings setting;
			if (opcode == 1)
				setting = new AddMemberSetting(this);
			else if (opcode == 2)
				setting = new EditMemberSetting(this);
			else if (opcode == 3)
				setting = new RemoveMemberSetting(this);
			else if (opcode == 4)
				setting = new ChangesMajorSettings(this);
			else if (opcode == 5)
				setting = new Class536_Sub24_Sub3(this); //exact same as editMemberSetting. guessing one is edit rank and one is edit name or something
			else
				throw new RuntimeException("");
			setting.decodeSetting(buffer);
			aClass708_3734.method8335(setting, -1070277825);
		}
	}

	public void method4643(Clan class536_sub15, int i) {
		if ((-6909195213925454795L * class536_sub15.aLong7133 != -1183593751974355185L * aLong3733) || (class536_sub15.aLong10484 * 7994147041570885677L != aLong3736 * 2552204525009362451L))
			throw new RuntimeException("");
		for (ChangeClanSettings class536_sub24 = (ChangeClanSettings) aClass708_3734.method8308(1867269829); class536_sub24 != null; class536_sub24 = (ChangeClanSettings) aClass708_3734.method8311(1975091977))
			class536_sub24.applySetting(class536_sub15);
		class536_sub15.aLong10484 += -6958170873332875355L;
	}

	static final void method4645(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		Class242.method3397((String) (class668.anObjectArray8543[366709801 * class668.anInt8544]), (String) (class668.anObjectArray8543[1 + 366709801 * class668.anInt8544]), "", class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] == 1, false, -432846471);
	}

	static final void method4646(Class668 class668, int i) {
		Class706.method8297((byte) -80);
	}

	static final void method4647(Class668 class668, byte i) {
		class668.aLongArray8538[(class668.anIntArray8537[class668.anInt8564 * -1640738851])] = (class668.aLongArray8565[(class668.anInt8546 -= 1792517805) * 1346022693]);
	}

	static final void method4648(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1490832696) != null)
			string = string.substring(0, string.length() - 1);
		class251.onResizeHook = Class33.method796(string, class668, (short) -17682);
		class251.hasComponentHook = true;
	}

	static final void method4649(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i_1_ = 0; i_1_ < string.length(); i_1_++) {
			char c = string.charAt(i_1_);
			if (c == '<')
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool)
				stringbuilder.append(c);
		}
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = stringbuilder.toString();
	}
}

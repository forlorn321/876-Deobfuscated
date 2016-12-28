/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class73 implements DefinitionI, Interface7 {
	public boolean aBool802 = true;
	public int anInt803;
	Class453 aClass453_804;
	public String aString805;

	public void method58(int i) {
		/* empty */
	}

	Class73() {
		/* empty */
	}

	void method1127(RSByteBuffer class536_sub33, int i, int i_0_) {
		if (1 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), 838295628);
			aClass453_804 = Class453.method5440(c, 1079519051);
		} else if (i == 2)
			anInt803 = class536_sub33.readInt() * -726716033;
		else if (i == 4)
			aBool802 = false;
		else if (5 == i)
			aString805 = class536_sub33.readString();
		else if (i == 101)
			aClass453_804 = ((Class453) Class682.method8091(Class453.method5438((byte) 42), class536_sub33.readUnsignedSmart(), 1858049507));
	}

	public boolean method1128(byte i) {
		return Class453.aClass453_5084 == aClass453_804;
	}

	public void method75(byte i) {
		/* empty */
	}

	public void method59(int i, int i_1_) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method1127(class536_sub33, i, 1867269829);
		}
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_2_ = class536_sub33.readUnsignedByte();
			if (i_2_ == 0)
				break;
			method1127(class536_sub33, i_2_, 1867269829);
		}
	}

	public void method57(int i) {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	void method1129(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), 731931135);
			aClass453_804 = Class453.method5440(c, -1663603691);
		} else if (i == 2)
			anInt803 = class536_sub33.readInt() * -726716033;
		else if (i == 4)
			aBool802 = false;
		else if (5 == i)
			aString805 = class536_sub33.readString();
		else if (i == 101)
			aClass453_804 = ((Class453) Class682.method8091(Class453.method5438((byte) 89), class536_sub33.readUnsignedSmart(), 1858049507));
	}

	public boolean method1130() {
		return Class453.aClass453_5084 == aClass453_804;
	}

	public boolean method1131() {
		return Class453.aClass453_5084 == aClass453_804;
	}

	static int method1132(InterfaceDefinitions class251, int i, int i_3_) {
		if (!client.getIComponentSettings(class251).method9472(i) && class251.onOpHook == null)
			return -1;
		return ((null != class251.opCursors && class251.opCursors.length > i) ? class251.opCursors[i] : -1);
	}
}

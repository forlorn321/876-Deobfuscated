/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class92 implements ConfigType, Interface7 {
	public Class453[][] aClass453ArrayArray885;
	public Object[][] anObjectArrayArray886;

	public void method77() {
		/* empty */
	}

	public void decodeType(RSByteBuffer class536_sub33) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method1230(class536_sub33, i_0_, 2100384398);
		}
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method1230(class536_sub33, i, 1698024886);
		}
	}

	public void postDecode() {
		/* empty */
	}

	public void method59(int i, int i_1_) {
		/* empty */
	}

	public void method58(int i) {
		/* empty */
	}

	Class92() {
		/* empty */
	}

	void method1230(RSByteBuffer class536_sub33, int i, int i_2_) {
		if (i == 1) {
			int i_3_ = class536_sub33.readUnsignedByte();
			if (aClass453ArrayArray885 == null)
				aClass453ArrayArray885 = new Class453[i_3_][];
			for (int i_4_ = class536_sub33.readUnsignedByte(); i_4_ != 255; i_4_ = class536_sub33.readUnsignedByte()) {
				int i_5_ = i_4_ & 0x7f;
				boolean bool = (i_4_ & 0x80) != 0;
				Class453[] class453s = new Class453[class536_sub33.readUnsignedByte()];
				for (int i_6_ = 0; i_6_ < class453s.length; i_6_++)
					class453s[i_6_] = ((Class453) Class682.method8091(Class453.method5438((byte) 50), class536_sub33.readUnsignedSmart(), 1858049507));
				aClass453ArrayArray885[i_5_] = class453s;
				if (bool) {
					if (anObjectArrayArray886 == null)
						anObjectArrayArray886 = new Object[aClass453ArrayArray885.length][];
					anObjectArrayArray886[i_5_] = Class655.method7940(class536_sub33, class453s, 1594603721);
				}
			}
		}
	}

	public void method57(int i) {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	void method1231(RSByteBuffer class536_sub33, int i) {
		if (i == 1) {
			int i_7_ = class536_sub33.readUnsignedByte();
			if (aClass453ArrayArray885 == null)
				aClass453ArrayArray885 = new Class453[i_7_][];
			for (int i_8_ = class536_sub33.readUnsignedByte(); i_8_ != 255; i_8_ = class536_sub33.readUnsignedByte()) {
				int i_9_ = i_8_ & 0x7f;
				boolean bool = (i_8_ & 0x80) != 0;
				Class453[] class453s = new Class453[class536_sub33.readUnsignedByte()];
				for (int i_10_ = 0; i_10_ < class453s.length; i_10_++)
					class453s[i_10_] = ((Class453) Class682.method8091(Class453.method5438((byte) 55), class536_sub33.readUnsignedSmart(), 1858049507));
				aClass453ArrayArray885[i_9_] = class453s;
				if (bool) {
					if (anObjectArrayArray886 == null)
						anObjectArrayArray886 = new Object[aClass453ArrayArray885.length][];
					anObjectArrayArray886[i_9_] = Class655.method7940(class536_sub33, class453s, 1594603721);
				}
			}
		}
	}

	static final void method1232(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class521_Sub4.method9369((byte) -28).method78();
	}
}

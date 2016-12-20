/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class255 {
	public static Class255 method4704(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		if (0 == i)
			return null;
		i--;
		class527_sub38.anInt10689 += 1474750881;
		int i_0_ = class527_sub38.readInt();
		Object[] objects = new Object[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			int i_2_ = class527_sub38.readUnsignedByte();
			if (i_2_ == 0)
				objects[i_1_] = Class475.method7758(java.lang.Integer.class, 318492261).method75(class527_sub38, (byte) -31);
			else if (1 == i_2_)
				objects[i_1_] = Class475.method7758(java.lang.String.class, 318492261).method75(class527_sub38, (byte) -59);
			else
				throw new IllegalStateException(new StringBuilder().append("Unrecognised type ID in deserialise: ").append(i_2_).toString());
		}
		return new Class255(i_0_, objects);
	}

	Class255(int i, Object[] objects) {
		/* empty */
	}

	public static Class282 method4705(int i, int i_3_) {
		Class282[] class282s = Class200.method3765(-1645821505);
		for (int i_4_ = 0; i_4_ < class282s.length; i_4_++) {
			Class282 class282 = class282s[i_4_];
			if (i == class282.anInt3196 * -1802310015)
				return class282;
		}
		return null;
	}

	static Class294[] method4706(int i) {
		return (new Class294[] { Class294.aClass294_3269, Class294.aClass294_3268, Class294.aClass294_3267 });
	}

	public static Class681[] method4707(int i) {
		return (new Class681[] { Class681.aClass681_8634, Class681.aClass681_8636, Class681.aClass681_8639, Class681.aClass681_8638, Class681.aClass681_8635, Class681.aClass681_8640, Class681.aClass681_8641, Class681.aClass681_8633 });
	}

	public static final void method4708(String string, int i) {
		if (null != Class679.aClass104Array8629) {
			Class109 class109 = Class203.method3782((byte) -1);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4481, class109.aClass2_1367, (byte) 101);
			class527_sub15.buffer.writeByte(Class208_Sub18.method15632(string, (byte) -16), 498660516);
			class527_sub15.buffer.writeString(string, -1073616836);
			class109.method1969(class527_sub15, (byte) 1);
		}
	}
}

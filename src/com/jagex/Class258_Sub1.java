/* Class258_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class258_Sub1 extends Class258 {
	public Interface14 method54(int i, Interface13 interface13) {
		return new Class249(i, interface13, this);
	}

	public Interface14 method58(int i, Interface13 interface13, int i_0_) {
		return new Class249(i, interface13, this);
	}

	public Class method53(byte i) {
		return com.jagex.Class249.class;
	}

	public Interface14 method52(int i, Interface13 interface13) {
		return new Class249(i, interface13, this);
	}

	public Class method57() {
		return com.jagex.Class249.class;
	}

	public Interface14 method56(int i, Interface13 interface13) {
		return new Class249(i, interface13, this);
	}

	Class258_Sub1(Class459 class459, int i) {
		super(class459, i);
	}

	public Class method55() {
		return com.jagex.Class249.class;
	}

	public Class method59() {
		return com.jagex.Class249.class;
	}

	static final void method15715(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub12_10597.method16954(1619700621) == 1 ? 1 : 0;
	}

	static final void method15716(int i, int i_1_) {
		Class527_Sub6.method16053((short) 26490);
		int i_2_ = (((Class160_Sub1) Class248.aClass95_Sub1_Sub1_2731.method81(i, -1624629660)).anInt8983 * -1385380771);
		if (0 != i_2_) {
			int i_3_ = (Class671.aClass97_8584.method101((Class160) Class248.aClass95_Sub1_Sub1_2731.method81(i, 408745932), 1096407173));
			if (i_2_ == 5)
				client.anInt11113 = -779444255 * i_3_;
			if (i_2_ == 6)
				client.anInt11042 = 1022321723 * i_3_;
		}
	}

	public static void method15717(int[] is, int[] is_4_, int i) {
		if (null == is || is_4_ == null) {
			Class706.anIntArray8839 = null;
			Class700_Sub43.anIntArray10955 = null;
			Class706.aByteArrayArrayArray8840 = null;
		} else {
			Class706.anIntArray8839 = is;
			Class700_Sub43.anIntArray10955 = new int[is.length];
			Class706.aByteArrayArrayArray8840 = new byte[is.length][][];
			for (int i_5_ = 0; i_5_ < Class706.anIntArray8839.length; i_5_++)
				Class706.aByteArrayArrayArray8840[i_5_] = new byte[is_4_[i_5_]][];
		}
	}
}

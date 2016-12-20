/* Class527_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;

public class Class527_Sub8_Sub1 extends Class527_Sub8 implements Interface14, Interface7 {
	public int[] anIntArray11332;
	public int anInt11333 = 0;
	public int[] anIntArray11334;
	public int anInt11335 = 0;

	void method17868(RSByteBuffer class527_sub38, int i, int i_0_) {
		if (2 == i)
			anInt11335 = class527_sub38.readUnsignedShort() * 1689918637;
		else if (i == 4) {
			anInt11333 = class527_sub38.readUnsignedByte() * 1131214899;
			anIntArray11332 = new int[631685883 * anInt11333];
			anIntArray11334 = new int[anInt11333 * 631685883];
			for (int i_1_ = 0; i_1_ < anInt11333 * 631685883; i_1_++) {
				anIntArray11332[i_1_] = class527_sub38.readUnsignedShort();
				anIntArray11334[i_1_] = class527_sub38.readUnsignedShort();
			}
		}
	}

	public void method84() {
		/* empty */
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_2_ = class527_sub38.readUnsignedByte();
			if (0 == i_2_)
				break;
			method17868(class527_sub38, i_2_, -1115735092);
		}
	}

	public void method60(int i) {
		/* empty */
	}

	public void method16(int i, int i_3_) {
		/* empty */
	}

	public void method86(int i) {
		/* empty */
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method17868(class527_sub38, i, -1261711895);
		}
	}

	public void method85() {
		/* empty */
	}

	Class527_Sub8_Sub1() {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method17868(class527_sub38, i, -1234540575);
		}
	}

	void method17869(RSByteBuffer class527_sub38, int i) {
		if (2 == i)
			anInt11335 = class527_sub38.readUnsignedShort() * 1689918637;
		else if (i == 4) {
			anInt11333 = class527_sub38.readUnsignedByte() * 1131214899;
			anIntArray11332 = new int[631685883 * anInt11333];
			anIntArray11334 = new int[anInt11333 * 631685883];
			for (int i_4_ = 0; i_4_ < anInt11333 * 631685883; i_4_++) {
				anIntArray11332[i_4_] = class527_sub38.readUnsignedShort();
				anIntArray11334[i_4_] = class527_sub38.readUnsignedShort();
			}
		}
	}

	void method17870(RSByteBuffer class527_sub38, int i) {
		if (2 == i)
			anInt11335 = class527_sub38.readUnsignedShort() * 1689918637;
		else if (i == 4) {
			anInt11333 = class527_sub38.readUnsignedByte() * 1131214899;
			anIntArray11332 = new int[631685883 * anInt11333];
			anIntArray11334 = new int[anInt11333 * 631685883];
			for (int i_5_ = 0; i_5_ < anInt11333 * 631685883; i_5_++) {
				anIntArray11332[i_5_] = class527_sub38.readUnsignedShort();
				anIntArray11334[i_5_] = class527_sub38.readUnsignedShort();
			}
		}
	}

	void method17871(RSByteBuffer class527_sub38, int i) {
		if (2 == i)
			anInt11335 = class527_sub38.readUnsignedShort() * 1689918637;
		else if (i == 4) {
			anInt11333 = class527_sub38.readUnsignedByte() * 1131214899;
			anIntArray11332 = new int[631685883 * anInt11333];
			anIntArray11334 = new int[anInt11333 * 631685883];
			for (int i_6_ = 0; i_6_ < anInt11333 * 631685883; i_6_++) {
				anIntArray11332[i_6_] = class527_sub38.readUnsignedShort();
				anIntArray11334[i_6_] = class527_sub38.readUnsignedShort();
			}
		}
	}

	static void method17872(int i) {
		Class681.aClass554_8644.method9201(2141543540);
		Class534.aClass553_7213.method9161(-2147429900);
		Class678.aclient8619.method8501(1132253204);
		Class451.aCanvas4939.setBackground(Color.black);
		client.anInt11171 = 828381227;
		Class681.aClass554_8644 = Class491.method7978(Class451.aCanvas4939, -131618851);
		Class534.aClass553_7213 = Class514.method8491(Class451.aCanvas4939, true, -355079103);
	}
}

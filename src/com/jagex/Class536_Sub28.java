/* Class536_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class536_Sub28 extends Class536 {
	float aFloat10543;
	Class160_Sub1 aClass160_Sub1_10544;
	int anInt10545;
	Stream aStream10546;
	Class175 aClass175_10547;
	Class130 aClass130_10548;
	Class122_Sub1 aClass122_Sub1_10549;
	NativeHeapBuffer aNativeHeapBuffer10550;
	int[] anIntArray10551;
	Class167_Sub2 aClass167_Sub2_10552;

	void method9595(int i, int i_0_, int i_1_) {
		anIntArray10551[(i_0_ * (aClass160_Sub1_10544.anInt1766 * 1718142487) + i)] |= 1 << i_1_;
	}

	void method9596(int i) {
		aNativeHeapBuffer10550 = aClass167_Sub2_10552.aNativeHeap9180.method1440(i * 4, true);
		aStream10546 = new Stream(aNativeHeapBuffer10550);
	}

	void method9597(int i) {
		aStream10546.method1271(i * 4 + 3);
		aStream10546.method1272(-1);
	}

	void method9598(int i, int i_2_, int i_3_) {
		anIntArray10551[(i_2_ * (aClass160_Sub1_10544.anInt1766 * 1718142487) + i)] |= 1 << i_3_;
	}

	void method9599(int i) {
		aStream10546.method1275();
		Interface15 interface15 = aClass167_Sub2_10552.method8545(4, aNativeHeapBuffer10550, i * 4, false);
		if (interface15 instanceof Class127_Sub1)
			aNativeHeapBuffer10550.method1248();
		aClass130_10548 = new Class130(interface15, 5121, 4, 0);
		aNativeHeapBuffer10550 = null;
		aStream10546 = null;
	}

	void method9600(int[] is, int i) {
		int i_4_ = 0;
		Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_10552.aClass536_Sub33_Sub1_9136;
		class536_sub33_sub1.off = 0;
		if (aClass167_Sub2_10552.aBool9284) {
			for (int i_5_ = 0; i_5_ < i; i_5_++) {
				int i_6_ = is[i_5_];
				short[] is_7_ = aClass160_Sub1_10544.aShortArrayArray9380[i_6_];
				int i_8_ = anIntArray10551[i_6_];
				if (i_8_ != 0 && is_7_ != null) {
					int i_9_ = 0;
					int i_10_ = 0;
					while (i_10_ < is_7_.length) {
						if ((i_8_ & 1 << i_9_++) != 0) {
							class536_sub33_sub1.writeShort((is_7_[i_10_++] & 0xffff), -1778059594);
							i_4_++;
							class536_sub33_sub1.writeShort((is_7_[i_10_++] & 0xffff), -1778059594);
							i_4_++;
							class536_sub33_sub1.writeShort((is_7_[i_10_++] & 0xffff), -1778059594);
							i_4_++;
						} else
							i_10_ += 3;
					}
				}
			}
		} else {
			for (int i_11_ = 0; i_11_ < i; i_11_++) {
				int i_12_ = is[i_11_];
				short[] is_13_ = aClass160_Sub1_10544.aShortArrayArray9380[i_12_];
				int i_14_ = anIntArray10551[i_12_];
				if (i_14_ != 0 && is_13_ != null) {
					int i_15_ = 0;
					int i_16_ = 0;
					while (i_16_ < is_13_.length) {
						if ((i_14_ & 1 << i_15_++) != 0) {
							class536_sub33_sub1.writeShortLE((is_13_[i_16_++] & 0xffff), 1449633476);
							i_4_++;
							class536_sub33_sub1.writeShortLE((is_13_[i_16_++] & 0xffff), -1831964858);
							i_4_++;
							class536_sub33_sub1.writeShortLE((is_13_[i_16_++] & 0xffff), 54907496);
							i_4_++;
						} else
							i_16_ += 3;
					}
				}
			}
		}
		if (i_4_ > 0) {
			aClass122_Sub1_10549.method91(5123, class536_sub33_sub1.buffer, (class536_sub33_sub1.off * -810172525));
			aClass167_Sub2_10552.method8547(aClass160_Sub1_10544.aClass130_9381, aClass160_Sub1_10544.aClass130_9372, aClass130_10548, aClass160_Sub1_10544.aClass130_9373);
			aClass167_Sub2_10552.method8577(anInt10545, (aClass160_Sub1_10544.anInt9375 & 0x7) != 0, (aClass160_Sub1_10544.anInt9375 & 0x8) != 0);
			if (aClass167_Sub2_10552.aBool9266)
				aClass167_Sub2_10552.method2282(2147483647, aClass175_10547);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / aFloat10543, 1.0F / aFloat10543, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_10552.method8547(aClass160_Sub1_10544.aClass130_9381, aClass160_Sub1_10544.aClass130_9372, aClass130_10548, aClass160_Sub1_10544.aClass130_9373);
			aClass167_Sub2_10552.method8511(aClass122_Sub1_10549, 4, 0, i_4_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method9601(int i) {
		aStream10546.method1271(i * 4 + 3);
		aStream10546.method1272(-1);
	}

	void method9602(int i) {
		aNativeHeapBuffer10550 = aClass167_Sub2_10552.aNativeHeap9180.method1440(i * 4, true);
		aStream10546 = new Stream(aNativeHeapBuffer10550);
	}

	void method9603(int i) {
		aNativeHeapBuffer10550 = aClass167_Sub2_10552.aNativeHeap9180.method1440(i * 4, true);
		aStream10546 = new Stream(aNativeHeapBuffer10550);
	}

	void method9604(int i) {
		aStream10546.method1271(i * 4 + 3);
		aStream10546.method1272(-1);
	}

	void method9605(int i) {
		aStream10546.method1271(i * 4 + 3);
		aStream10546.method1272(-1);
	}

	void method9606(int i, int i_17_, int i_18_) {
		anIntArray10551[(i_17_ * (aClass160_Sub1_10544.anInt1766 * 1718142487) + i)] |= 1 << i_18_;
	}

	Class536_Sub28(Class160_Sub1 class160_sub1, int i, int i_19_, Class175 class175) {
		aClass160_Sub1_10544 = class160_sub1;
		aClass167_Sub2_10552 = aClass160_Sub1_10544.aClass167_Sub2_9350;
		anInt10545 = i;
		aFloat10543 = (float) i_19_;
		aClass175_10547 = class175;
		anIntArray10551 = new int[(aClass160_Sub1_10544.anInt1766 * 1718142487 * (aClass160_Sub1_10544.anInt1769 * -889224915))];
		aClass122_Sub1_10549 = new Class122_Sub1(aClass167_Sub2_10552, 5123, null, 1);
	}

	void method9607(int i, int i_20_, int i_21_, float f) {
		if (anInt10545 != -1) {
			Class164 class164 = aClass167_Sub2_10552.aClass174_1852.method2446(anInt10545, -1098765834);
			int i_22_ = class164.aByte1829 & 0xff;
			if (i_22_ != 0 && class164.aByte1797 != 4) {
				int i_23_;
				if (i_21_ < 0)
					i_23_ = 0;
				else if (i_21_ > 127)
					i_23_ = 16777215;
				else
					i_23_ = 131586 * i_21_;
				if (i_22_ == 256)
					i_20_ = i_23_;
				else {
					int i_24_ = i_22_;
					int i_25_ = 256 - i_22_;
					i_20_ = ((((i_23_ & 0xff00ff) * i_24_ + (i_20_ & 0xff00ff) * i_25_) & ~0xff00ff) + (((i_23_ & 0xff00) * i_24_ + (i_20_ & 0xff00) * i_25_) & 0xff0000)) >> 8;
				}
			}
			int i_26_ = class164.aByte1828 & 0xff;
			if (i_26_ != 0) {
				i_26_ += 256;
				int i_27_ = ((i_20_ & 0xff0000) >> 16) * i_26_;
				if (i_27_ > 65535)
					i_27_ = 65535;
				int i_28_ = ((i_20_ & 0xff00) >> 8) * i_26_;
				if (i_28_ > 65535)
					i_28_ = 65535;
				int i_29_ = (i_20_ & 0xff) * i_26_;
				if (i_29_ > 65535)
					i_29_ = 65535;
				i_20_ = (i_27_ << 8 & 0xff0000) + (i_28_ & 0xff00) + (i_29_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_30_ = i_20_ >> 16 & 0xff;
			int i_31_ = i_20_ >> 8 & 0xff;
			int i_32_ = i_20_ & 0xff;
			i_30_ *= f;
			if (i_30_ < 0)
				i_30_ = 0;
			else if (i_30_ > 255)
				i_30_ = 255;
			i_31_ *= f;
			if (i_31_ < 0)
				i_31_ = 0;
			else if (i_31_ > 255)
				i_31_ = 255;
			i_32_ *= f;
			if (i_32_ < 0)
				i_32_ = 0;
			else if (i_32_ > 255)
				i_32_ = 255;
			i_20_ = i_30_ << 16 | i_31_ << 8 | i_32_;
		}
		aStream10546.method1271(i * 4);
		aStream10546.method1272((byte) (i_20_ >> 16));
		aStream10546.method1272((byte) (i_20_ >> 8));
		aStream10546.method1272((byte) i_20_);
	}

	void method9608(int i) {
		aStream10546.method1275();
		Interface15 interface15 = aClass167_Sub2_10552.method8545(4, aNativeHeapBuffer10550, i * 4, false);
		if (interface15 instanceof Class127_Sub1)
			aNativeHeapBuffer10550.method1248();
		aClass130_10548 = new Class130(interface15, 5121, 4, 0);
		aNativeHeapBuffer10550 = null;
		aStream10546 = null;
	}

	void method9609(int i) {
		aStream10546.method1275();
		Interface15 interface15 = aClass167_Sub2_10552.method8545(4, aNativeHeapBuffer10550, i * 4, false);
		if (interface15 instanceof Class127_Sub1)
			aNativeHeapBuffer10550.method1248();
		aClass130_10548 = new Class130(interface15, 5121, 4, 0);
		aNativeHeapBuffer10550 = null;
		aStream10546 = null;
	}

	void method9610(int i) {
		aStream10546.method1275();
		Interface15 interface15 = aClass167_Sub2_10552.method8545(4, aNativeHeapBuffer10550, i * 4, false);
		if (interface15 instanceof Class127_Sub1)
			aNativeHeapBuffer10550.method1248();
		aClass130_10548 = new Class130(interface15, 5121, 4, 0);
		aNativeHeapBuffer10550 = null;
		aStream10546 = null;
	}

	void method9611(int i) {
		aStream10546.method1275();
		Interface15 interface15 = aClass167_Sub2_10552.method8545(4, aNativeHeapBuffer10550, i * 4, false);
		if (interface15 instanceof Class127_Sub1)
			aNativeHeapBuffer10550.method1248();
		aClass130_10548 = new Class130(interface15, 5121, 4, 0);
		aNativeHeapBuffer10550 = null;
		aStream10546 = null;
	}

	void method9612(int i) {
		aStream10546.method1275();
		Interface15 interface15 = aClass167_Sub2_10552.method8545(4, aNativeHeapBuffer10550, i * 4, false);
		if (interface15 instanceof Class127_Sub1)
			aNativeHeapBuffer10550.method1248();
		aClass130_10548 = new Class130(interface15, 5121, 4, 0);
		aNativeHeapBuffer10550 = null;
		aStream10546 = null;
	}
}

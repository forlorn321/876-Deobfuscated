/* Class527_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class527_Sub14 extends Class527 {
	NativeHeapBuffer aNativeHeapBuffer10446;
	Class161_Sub2 aClass161_Sub2_10447;
	Class180_Sub3 aClass180_Sub3_10448;
	int anInt10449;
	Class178 aClass178_10450;
	Class129 aClass129_10451;
	Class131_Sub1 aClass131_Sub1_10452;
	int[] anIntArray10453;
	float aFloat10454;
	Stream aStream10455;

	void method16101(int i, int i_0_, int i_1_) {
		anIntArray10453[(i_0_ * (aClass161_Sub2_10447.anInt1750 * 1210322533) + i)] |= 1 << i_1_;
	}

	void method16102(int i) {
		aNativeHeapBuffer10446 = aClass180_Sub3_10448.aNativeHeap9667.method1940(i * 4, true);
		aStream10455 = new Stream(aNativeHeapBuffer10446);
	}

	void method16103(int i, int i_2_, int i_3_, float f) {
		if (anInt10449 != -1) {
			Class163 class163 = aClass180_Sub3_10448.aClass181_2059.method3544(anInt10449, (byte) -29);
			int i_4_ = class163.aByte1808 & 0xff;
			if (i_4_ != 0 && class163.aByte1801 != 4) {
				int i_5_;
				if (i_3_ < 0)
					i_5_ = 0;
				else if (i_3_ > 127)
					i_5_ = 16777215;
				else
					i_5_ = 131586 * i_3_;
				if (i_4_ == 256)
					i_2_ = i_5_;
				else {
					int i_6_ = i_4_;
					int i_7_ = 256 - i_4_;
					i_2_ = (((i_5_ & 0xff00ff) * i_6_ + (i_2_ & 0xff00ff) * i_7_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_6_ + (i_2_ & 0xff00) * i_7_ & 0xff0000)) >> 8;
				}
			}
			int i_8_ = class163.aByte1802 & 0xff;
			if (i_8_ != 0) {
				i_8_ += 256;
				int i_9_ = ((i_2_ & 0xff0000) >> 16) * i_8_;
				if (i_9_ > 65535)
					i_9_ = 65535;
				int i_10_ = ((i_2_ & 0xff00) >> 8) * i_8_;
				if (i_10_ > 65535)
					i_10_ = 65535;
				int i_11_ = (i_2_ & 0xff) * i_8_;
				if (i_11_ > 65535)
					i_11_ = 65535;
				i_2_ = (i_9_ << 8 & 0xff0000) + (i_10_ & 0xff00) + (i_11_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_12_ = i_2_ >> 16 & 0xff;
			int i_13_ = i_2_ >> 8 & 0xff;
			int i_14_ = i_2_ & 0xff;
			i_12_ *= f;
			if (i_12_ < 0)
				i_12_ = 0;
			else if (i_12_ > 255)
				i_12_ = 255;
			i_13_ *= f;
			if (i_13_ < 0)
				i_13_ = 0;
			else if (i_13_ > 255)
				i_13_ = 255;
			i_14_ *= f;
			if (i_14_ < 0)
				i_14_ = 0;
			else if (i_14_ > 255)
				i_14_ = 255;
			i_2_ = i_12_ << 16 | i_13_ << 8 | i_14_;
		}
		aStream10455.method1705(i * 4);
		aStream10455.method1706((byte) (i_2_ >> 16));
		aStream10455.method1706((byte) (i_2_ >> 8));
		aStream10455.method1706((byte) i_2_);
	}

	void method16104(int i, int i_15_, int i_16_) {
		anIntArray10453[(i_15_ * (aClass161_Sub2_10447.anInt1750 * 1210322533) + i)] |= 1 << i_16_;
	}

	void method16105(int i, int i_17_, int i_18_, float f) {
		if (anInt10449 != -1) {
			Class163 class163 = aClass180_Sub3_10448.aClass181_2059.method3544(anInt10449, (byte) -38);
			int i_19_ = class163.aByte1808 & 0xff;
			if (i_19_ != 0 && class163.aByte1801 != 4) {
				int i_20_;
				if (i_18_ < 0)
					i_20_ = 0;
				else if (i_18_ > 127)
					i_20_ = 16777215;
				else
					i_20_ = 131586 * i_18_;
				if (i_19_ == 256)
					i_17_ = i_20_;
				else {
					int i_21_ = i_19_;
					int i_22_ = 256 - i_19_;
					i_17_ = ((((i_20_ & 0xff00ff) * i_21_ + (i_17_ & 0xff00ff) * i_22_) & ~0xff00ff) + (((i_20_ & 0xff00) * i_21_ + (i_17_ & 0xff00) * i_22_) & 0xff0000)) >> 8;
				}
			}
			int i_23_ = class163.aByte1802 & 0xff;
			if (i_23_ != 0) {
				i_23_ += 256;
				int i_24_ = ((i_17_ & 0xff0000) >> 16) * i_23_;
				if (i_24_ > 65535)
					i_24_ = 65535;
				int i_25_ = ((i_17_ & 0xff00) >> 8) * i_23_;
				if (i_25_ > 65535)
					i_25_ = 65535;
				int i_26_ = (i_17_ & 0xff) * i_23_;
				if (i_26_ > 65535)
					i_26_ = 65535;
				i_17_ = (i_24_ << 8 & 0xff0000) + (i_25_ & 0xff00) + (i_26_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_27_ = i_17_ >> 16 & 0xff;
			int i_28_ = i_17_ >> 8 & 0xff;
			int i_29_ = i_17_ & 0xff;
			i_27_ *= f;
			if (i_27_ < 0)
				i_27_ = 0;
			else if (i_27_ > 255)
				i_27_ = 255;
			i_28_ *= f;
			if (i_28_ < 0)
				i_28_ = 0;
			else if (i_28_ > 255)
				i_28_ = 255;
			i_29_ *= f;
			if (i_29_ < 0)
				i_29_ = 0;
			else if (i_29_ > 255)
				i_29_ = 255;
			i_17_ = i_27_ << 16 | i_28_ << 8 | i_29_;
		}
		aStream10455.method1705(i * 4);
		aStream10455.method1706((byte) (i_17_ >> 16));
		aStream10455.method1706((byte) (i_17_ >> 8));
		aStream10455.method1706((byte) i_17_);
	}

	void method16106(int i) {
		aStream10455.method1709();
		Interface15 interface15 = aClass180_Sub3_10448.method15435(4, aNativeHeapBuffer10446, i * 4, false);
		if (interface15 instanceof Class120_Sub1)
			aNativeHeapBuffer10446.method1679();
		aClass129_10451 = new Class129(interface15, 5121, 4, 0);
		aNativeHeapBuffer10446 = null;
		aStream10455 = null;
	}

	void method16107(int[] is, int i) {
		int i_30_ = 0;
		Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_10448.aClass527_Sub38_Sub1_9819;
		class527_sub38_sub1.anInt10689 = 0;
		if (aClass180_Sub3_10448.aBool9788) {
			for (int i_31_ = 0; i_31_ < i; i_31_++) {
				int i_32_ = is[i_31_];
				short[] is_33_ = aClass161_Sub2_10447.aShortArrayArray9261[i_32_];
				int i_34_ = anIntArray10453[i_32_];
				if (i_34_ != 0 && is_33_ != null) {
					int i_35_ = 0;
					int i_36_ = 0;
					while (i_36_ < is_33_.length) {
						if ((i_34_ & 1 << i_35_++) != 0) {
							class527_sub38_sub1.writeShort((is_33_[i_36_++] & 0xffff), 1404835786);
							i_30_++;
							class527_sub38_sub1.writeShort((is_33_[i_36_++] & 0xffff), 1404835786);
							i_30_++;
							class527_sub38_sub1.writeShort((is_33_[i_36_++] & 0xffff), 1404835786);
							i_30_++;
						} else
							i_36_ += 3;
					}
				}
			}
		} else {
			for (int i_37_ = 0; i_37_ < i; i_37_++) {
				int i_38_ = is[i_37_];
				short[] is_39_ = aClass161_Sub2_10447.aShortArrayArray9261[i_38_];
				int i_40_ = anIntArray10453[i_38_];
				if (i_40_ != 0 && is_39_ != null) {
					int i_41_ = 0;
					int i_42_ = 0;
					while (i_42_ < is_39_.length) {
						if ((i_40_ & 1 << i_41_++) != 0) {
							class527_sub38_sub1.writeShortLE((is_39_[i_42_++] & 0xffff), -659486232);
							i_30_++;
							class527_sub38_sub1.writeShortLE((is_39_[i_42_++] & 0xffff), 698636242);
							i_30_++;
							class527_sub38_sub1.writeShortLE((is_39_[i_42_++] & 0xffff), 250440884);
							i_30_++;
						} else
							i_42_ += 3;
					}
				}
			}
		}
		if (i_30_ > 0) {
			aClass131_Sub1_10452.method98(5123, class527_sub38_sub1.buffer, (class527_sub38_sub1.anInt10689 * -441238943));
			aClass180_Sub3_10448.method15385(aClass161_Sub2_10447.aClass129_9282, aClass161_Sub2_10447.aClass129_9284, aClass129_10451, aClass161_Sub2_10447.aClass129_9281);
			aClass180_Sub3_10448.method15465(anInt10449, (aClass161_Sub2_10447.anInt9270 & 0x7) != 0, (aClass161_Sub2_10447.anInt9270 & 0x8) != 0);
			if (aClass180_Sub3_10448.aBool9648)
				aClass180_Sub3_10448.method3144(2147483647, aClass178_10450);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / aFloat10454, 1.0F / aFloat10454, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass180_Sub3_10448.method15385(aClass161_Sub2_10447.aClass129_9282, aClass161_Sub2_10447.aClass129_9284, aClass129_10451, aClass161_Sub2_10447.aClass129_9281);
			aClass180_Sub3_10448.method15433(aClass131_Sub1_10452, 4, 0, i_30_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method16108(int i) {
		aNativeHeapBuffer10446 = aClass180_Sub3_10448.aNativeHeap9667.method1940(i * 4, true);
		aStream10455 = new Stream(aNativeHeapBuffer10446);
	}

	void method16109(int i) {
		aNativeHeapBuffer10446 = aClass180_Sub3_10448.aNativeHeap9667.method1940(i * 4, true);
		aStream10455 = new Stream(aNativeHeapBuffer10446);
	}

	Class527_Sub14(Class161_Sub2 class161_sub2, int i, int i_43_, Class178 class178) {
		aClass161_Sub2_10447 = class161_sub2;
		aClass180_Sub3_10448 = aClass161_Sub2_10447.aClass180_Sub3_9262;
		anInt10449 = i;
		aFloat10454 = (float) i_43_;
		aClass178_10450 = class178;
		anIntArray10453 = new int[(aClass161_Sub2_10447.anInt1750 * 1210322533 * (aClass161_Sub2_10447.anInt1751 * -533476177))];
		aClass131_Sub1_10452 = new Class131_Sub1(aClass180_Sub3_10448, 5123, null, 1);
	}

	void method16110(int i) {
		aStream10455.method1705(i * 4 + 3);
		aStream10455.method1706(-1);
	}

	void method16111(int i) {
		aStream10455.method1705(i * 4 + 3);
		aStream10455.method1706(-1);
	}

	void method16112(int i, int i_44_, int i_45_) {
		anIntArray10453[(i_44_ * (aClass161_Sub2_10447.anInt1750 * 1210322533) + i)] |= 1 << i_45_;
	}

	void method16113(int i) {
		aStream10455.method1705(i * 4 + 3);
		aStream10455.method1706(-1);
	}

	void method16114(int[] is, int i) {
		int i_46_ = 0;
		Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_10448.aClass527_Sub38_Sub1_9819;
		class527_sub38_sub1.anInt10689 = 0;
		if (aClass180_Sub3_10448.aBool9788) {
			for (int i_47_ = 0; i_47_ < i; i_47_++) {
				int i_48_ = is[i_47_];
				short[] is_49_ = aClass161_Sub2_10447.aShortArrayArray9261[i_48_];
				int i_50_ = anIntArray10453[i_48_];
				if (i_50_ != 0 && is_49_ != null) {
					int i_51_ = 0;
					int i_52_ = 0;
					while (i_52_ < is_49_.length) {
						if ((i_50_ & 1 << i_51_++) != 0) {
							class527_sub38_sub1.writeShort((is_49_[i_52_++] & 0xffff), 1404835786);
							i_46_++;
							class527_sub38_sub1.writeShort((is_49_[i_52_++] & 0xffff), 1404835786);
							i_46_++;
							class527_sub38_sub1.writeShort((is_49_[i_52_++] & 0xffff), 1404835786);
							i_46_++;
						} else
							i_52_ += 3;
					}
				}
			}
		} else {
			for (int i_53_ = 0; i_53_ < i; i_53_++) {
				int i_54_ = is[i_53_];
				short[] is_55_ = aClass161_Sub2_10447.aShortArrayArray9261[i_54_];
				int i_56_ = anIntArray10453[i_54_];
				if (i_56_ != 0 && is_55_ != null) {
					int i_57_ = 0;
					int i_58_ = 0;
					while (i_58_ < is_55_.length) {
						if ((i_56_ & 1 << i_57_++) != 0) {
							class527_sub38_sub1.writeShortLE((is_55_[i_58_++] & 0xffff), 1907278821);
							i_46_++;
							class527_sub38_sub1.writeShortLE((is_55_[i_58_++] & 0xffff), -2027220059);
							i_46_++;
							class527_sub38_sub1.writeShortLE((is_55_[i_58_++] & 0xffff), -422022383);
							i_46_++;
						} else
							i_58_ += 3;
					}
				}
			}
		}
		if (i_46_ > 0) {
			aClass131_Sub1_10452.method98(5123, class527_sub38_sub1.buffer, (class527_sub38_sub1.anInt10689 * -441238943));
			aClass180_Sub3_10448.method15385(aClass161_Sub2_10447.aClass129_9282, aClass161_Sub2_10447.aClass129_9284, aClass129_10451, aClass161_Sub2_10447.aClass129_9281);
			aClass180_Sub3_10448.method15465(anInt10449, (aClass161_Sub2_10447.anInt9270 & 0x7) != 0, (aClass161_Sub2_10447.anInt9270 & 0x8) != 0);
			if (aClass180_Sub3_10448.aBool9648)
				aClass180_Sub3_10448.method3144(2147483647, aClass178_10450);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / aFloat10454, 1.0F / aFloat10454, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass180_Sub3_10448.method15385(aClass161_Sub2_10447.aClass129_9282, aClass161_Sub2_10447.aClass129_9284, aClass129_10451, aClass161_Sub2_10447.aClass129_9281);
			aClass180_Sub3_10448.method15433(aClass131_Sub1_10452, 4, 0, i_46_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method16115(int i) {
		aStream10455.method1705(i * 4 + 3);
		aStream10455.method1706(-1);
	}

	void method16116(int i) {
		aStream10455.method1709();
		Interface15 interface15 = aClass180_Sub3_10448.method15435(4, aNativeHeapBuffer10446, i * 4, false);
		if (interface15 instanceof Class120_Sub1)
			aNativeHeapBuffer10446.method1679();
		aClass129_10451 = new Class129(interface15, 5121, 4, 0);
		aNativeHeapBuffer10446 = null;
		aStream10455 = null;
	}
}

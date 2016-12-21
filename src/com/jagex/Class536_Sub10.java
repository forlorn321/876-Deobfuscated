/* Class536_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class536_Sub10 extends Class536 {
	int anInt10434;
	Class160_Sub2 aClass160_Sub2_10435;
	int anInt10436;
	float aFloat10437;
	Class175 aClass175_10438;
	Interface38 anInterface38_10439;
	int[] anIntArray10440;
	int anInt10441;
	ByteBuffer aByteBuffer10442;
	Class167_Sub3 aClass167_Sub3_10443;
	int anInt10444;
	long aLong10445;
	int anInt10446 = 0;

	void method9410(int i) {
		aByteBuffer10442 = aClass167_Sub3_10443.method8858(i * 4);
		aLong10445 = aClass167_Sub3_10443.method8772(aByteBuffer10442);
		for (int i_0_ = 3; i_0_ < i * 4; i_0_ += 4)
			aClass167_Sub3_10443.anUnsafe9548.putByte(aLong10445 + (long) i_0_, (byte) 0);
	}

	void method9411(int i) {
		aClass167_Sub3_10443.anUnsafe9548.putByte(aLong10445 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method9412(int i, int i_1_, int i_2_) {
		anIntArray10440[(i_1_ * (aClass160_Sub2_10435.anInt1766 * 1718142487) + i)] |= 1 << i_2_;
		anInt10446++;
	}

	void method9413(int i) {
		aByteBuffer10442 = aClass167_Sub3_10443.method8858(i * 4);
		aLong10445 = aClass167_Sub3_10443.method8772(aByteBuffer10442);
		for (int i_3_ = 3; i_3_ < i * 4; i_3_ += 4)
			aClass167_Sub3_10443.anUnsafe9548.putByte(aLong10445 + (long) i_3_, (byte) 0);
	}

	void method9414(int i) {
		anInterface38_10439 = aClass167_Sub3_10443.method8805(false);
		anInterface38_10439.method271(i * 4, 4);
		anInterface38_10439.method264(0, i * 4, aLong10445);
		aByteBuffer10442.clear();
		aByteBuffer10442 = null;
		aLong10445 = 0L;
	}

	void method9415(int[] is, int i) {
		anInt10434 = 0;
		anInt10441 = 32767;
		anInt10444 = -32768;
		ByteBuffer bytebuffer = aClass167_Sub3_10443.aByteBuffer9549;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			int i_5_ = is[i_4_];
			short[] is_6_ = aClass160_Sub2_10435.aShortArrayArray9402[i_5_];
			int i_7_ = anIntArray10440[i_5_];
			if (i_7_ != 0 && is_6_ != null) {
				int i_8_ = 0;
				int i_9_ = 0;
				while (i_9_ < is_6_.length) {
					if ((i_7_ & 1 << i_8_++) != 0) {
						for (int i_10_ = 0; i_10_ < 3; i_10_++) {
							int i_11_ = is_6_[i_9_++] & 0xffff;
							if (i_11_ > anInt10444)
								anInt10444 = i_11_;
							if (i_11_ < anInt10441)
								anInt10441 = i_11_;
							bytebuffer.putShort((short) i_11_);
						}
						anInt10434 += 3;
					} else
						i_9_ += 3;
				}
			}
		}
	}

	void method9416(int i, int i_12_, int i_13_, float f) {
		if (anInt10436 != -1) {
			Class164 class164 = aClass167_Sub3_10443.aClass174_1852.method2446(anInt10436, -479377753);
			int i_14_ = class164.aByte1829 & 0xff;
			if (i_14_ != 0 && class164.aByte1797 != 4) {
				int i_15_;
				if (i_13_ < 0)
					i_15_ = 0;
				else if (i_13_ > 127)
					i_15_ = 16777215;
				else
					i_15_ = 131586 * i_13_;
				if (i_14_ == 256)
					i_12_ = i_15_;
				else {
					int i_16_ = i_14_;
					int i_17_ = 256 - i_14_;
					i_12_ = ((((i_15_ & 0xff00ff) * i_16_ + (i_12_ & 0xff00ff) * i_17_) & ~0xff00ff) + (((i_15_ & 0xff00) * i_16_ + (i_12_ & 0xff00) * i_17_) & 0xff0000)) >> 8;
				}
			}
			int i_18_ = class164.aByte1828 & 0xff;
			if (i_18_ != 0) {
				i_18_ += 256;
				int i_19_ = ((i_12_ & 0xff0000) >> 16) * i_18_;
				if (i_19_ > 65535)
					i_19_ = 65535;
				int i_20_ = ((i_12_ & 0xff00) >> 8) * i_18_;
				if (i_20_ > 65535)
					i_20_ = 65535;
				int i_21_ = (i_12_ & 0xff) * i_18_;
				if (i_21_ > 65535)
					i_21_ = 65535;
				i_12_ = (i_19_ << 8 & 0xff0000) + (i_20_ & 0xff00) + (i_21_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_22_ = i_12_ >> 16 & 0xff;
			int i_23_ = i_12_ >> 8 & 0xff;
			int i_24_ = i_12_ & 0xff;
			i_22_ *= f;
			if (i_22_ < 0)
				i_22_ = 0;
			else if (i_22_ > 255)
				i_22_ = 255;
			i_23_ *= f;
			if (i_23_ < 0)
				i_23_ = 0;
			else if (i_23_ > 255)
				i_23_ = 255;
			i_24_ *= f;
			if (i_24_ < 0)
				i_24_ = 0;
			else if (i_24_ > 255)
				i_24_ = 255;
			i_12_ = i_22_ << 16 | i_23_ << 8 | i_24_;
		}
		if (aClass167_Sub3_10443.anInt9689 == 0) {
			aByteBuffer10442.put(i * 4 + 0, (byte) (i_12_ >> 16));
			aByteBuffer10442.put(i * 4 + 1, (byte) (i_12_ >> 8));
			aByteBuffer10442.put(i * 4 + 2, (byte) (i_12_ >> 0));
		} else {
			aByteBuffer10442.put(i * 4 + 0, (byte) (i_12_ >> 0));
			aByteBuffer10442.put(i * 4 + 1, (byte) (i_12_ >> 8));
			aByteBuffer10442.put(i * 4 + 2, (byte) (i_12_ >> 16));
		}
	}

	void method9417(int i) {
		aByteBuffer10442 = aClass167_Sub3_10443.method8858(i * 4);
		aLong10445 = aClass167_Sub3_10443.method8772(aByteBuffer10442);
		for (int i_25_ = 3; i_25_ < i * 4; i_25_ += 4)
			aClass167_Sub3_10443.anUnsafe9548.putByte(aLong10445 + (long) i_25_, (byte) 0);
	}

	Class536_Sub10(Class160_Sub2 class160_sub2, int i, int i_26_, Class175 class175) {
		anInt10434 = 0;
		anInt10441 = 0;
		anInt10444 = 0;
		aClass160_Sub2_10435 = class160_sub2;
		aClass167_Sub3_10443 = aClass160_Sub2_10435.aClass167_Sub3_9421;
		anInt10436 = i;
		aFloat10437 = (float) i_26_;
		aClass175_10438 = class175;
		anIntArray10440 = new int[(aClass160_Sub2_10435.anInt1766 * 1718142487 * (aClass160_Sub2_10435.anInt1769 * -889224915))];
	}

	void method9418(int i) {
		aClass167_Sub3_10443.anUnsafe9548.putByte(aLong10445 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method9419(int i) {
		aByteBuffer10442 = aClass167_Sub3_10443.method8858(i * 4);
		aLong10445 = aClass167_Sub3_10443.method8772(aByteBuffer10442);
		for (int i_27_ = 3; i_27_ < i * 4; i_27_ += 4)
			aClass167_Sub3_10443.anUnsafe9548.putByte(aLong10445 + (long) i_27_, (byte) 0);
	}

	void method9420(int i, int i_28_, int i_29_) {
		anIntArray10440[(i_28_ * (aClass160_Sub2_10435.anInt1766 * 1718142487) + i)] |= 1 << i_29_;
		anInt10446++;
	}

	void method9421(int i, int i_30_, int i_31_) {
		anIntArray10440[(i_30_ * (aClass160_Sub2_10435.anInt1766 * 1718142487) + i)] |= 1 << i_31_;
		anInt10446++;
	}

	void method9422(int i, int i_32_, int i_33_) {
		anIntArray10440[(i_32_ * (aClass160_Sub2_10435.anInt1766 * 1718142487) + i)] |= 1 << i_33_;
		anInt10446++;
	}

	void method9423(int i) {
		aClass167_Sub3_10443.anUnsafe9548.putByte(aLong10445 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method9424(int i) {
		anInterface38_10439 = aClass167_Sub3_10443.method8805(false);
		anInterface38_10439.method271(i * 4, 4);
		anInterface38_10439.method264(0, i * 4, aLong10445);
		aByteBuffer10442.clear();
		aByteBuffer10442 = null;
		aLong10445 = 0L;
	}
}

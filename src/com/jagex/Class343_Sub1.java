/* Class343_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class343_Sub1 extends Class343 {
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_10221;
	long aLong10222 = 0L;

	void method9297() {
		if (aLong10222 != 0L) {
			aClass167_Sub3_Sub2_10221.method10620(aLong10222);
			aLong10222 = 0L;
		}
	}

	Class343_Sub1(Class167_Sub3_Sub2 class167_sub3_sub2, Class362[] class362s) {
		super(class362s);
		aClass167_Sub3_Sub2_10221 = class167_sub3_sub2;
		byte i = 0;
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_10221.aByteBuffer9549;
		bytebuffer.clear();
		for (short i_0_ = 0; i_0_ < aClass362Array3664.length; i_0_++) {
			short i_1_ = 0;
			Class362 class362 = aClass362Array3664[i_0_];
			for (int i_2_ = 0; i_2_ < class362.method4760(); i_2_++) {
				Class355 class355 = class362.method4759(i_2_);
				if (class355 == Class355.aClass355_3763)
					method9301(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				else if (class355 == Class355.aClass355_3758)
					method9301(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				else if (class355 == Class355.aClass355_3759)
					method9301(bytebuffer, i_0_, i_1_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				else if (class355 == Class355.aClass355_3760) {
					Class343_Sub1 class343_sub1_3_ = this;
					ByteBuffer bytebuffer_4_ = bytebuffer;
					short i_5_ = i_0_;
					short i_6_ = i_1_;
					byte i_7_ = 0;
					byte i_8_ = 0;
					byte i_9_ = 5;
					byte i_10_ = i;
					i++;
					class343_sub1_3_.method9301(bytebuffer_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_);
				} else if (class355 == Class355.aClass355_3761) {
					Class343_Sub1 class343_sub1_11_ = this;
					ByteBuffer bytebuffer_12_ = bytebuffer;
					short i_13_ = i_0_;
					short i_14_ = i_1_;
					byte i_15_ = 1;
					byte i_16_ = 0;
					byte i_17_ = 5;
					byte i_18_ = i;
					i++;
					class343_sub1_11_.method9301(bytebuffer_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_);
				} else if (class355 == Class355.aClass355_3762) {
					Class343_Sub1 class343_sub1_19_ = this;
					ByteBuffer bytebuffer_20_ = bytebuffer;
					short i_21_ = i_0_;
					short i_22_ = i_1_;
					byte i_23_ = 2;
					byte i_24_ = 0;
					byte i_25_ = 5;
					byte i_26_ = i;
					i++;
					class343_sub1_19_.method9301(bytebuffer_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_);
				} else if (class355 == Class355.aClass355_3766) {
					Class343_Sub1 class343_sub1_27_ = this;
					ByteBuffer bytebuffer_28_ = bytebuffer;
					short i_29_ = i_0_;
					short i_30_ = i_1_;
					byte i_31_ = 3;
					byte i_32_ = 0;
					byte i_33_ = 5;
					byte i_34_ = i;
					i++;
					class343_sub1_27_.method9301(bytebuffer_28_, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_);
				}
				i_1_ += class355.anInt3773;
			}
		}
		method9301(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		aLong10222 = (IDirect3DDevice.CreateVertexDeclaration(aClass167_Sub3_Sub2_10221.aLong11573, aClass167_Sub3_Sub2_10221.aLong9586));
		aClass167_Sub3_Sub2_10221.method8894(this);
	}

	public void method131() {
		if (aLong10222 != 0L) {
			IUnknown.Release(aLong10222);
			aLong10222 = 0L;
		}
		aClass167_Sub3_Sub2_10221.method8936(this);
	}

	void method9298() {
		if (aLong10222 != 0L) {
			aClass167_Sub3_Sub2_10221.method10620(aLong10222);
			aLong10222 = 0L;
		}
	}

	public void finalize() {
		method9298();
	}

	void method9299() {
		method9298();
	}

	public void method129() {
		if (aLong10222 != 0L) {
			IUnknown.Release(aLong10222);
			aLong10222 = 0L;
		}
		aClass167_Sub3_Sub2_10221.method8936(this);
	}

	void method9300() {
		method9298();
	}

	void method9301(ByteBuffer bytebuffer, short i, short i_35_, byte i_36_, byte i_37_, byte i_38_, byte i_39_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_35_);
		bytebuffer.put(i_36_);
		bytebuffer.put(i_37_);
		bytebuffer.put(i_38_);
		bytebuffer.put(i_39_);
	}

	void method9302() {
		if (aLong10222 != 0L) {
			aClass167_Sub3_Sub2_10221.method10620(aLong10222);
			aLong10222 = 0L;
		}
	}

	public void method130() {
		if (aLong10222 != 0L) {
			IUnknown.Release(aLong10222);
			aLong10222 = 0L;
		}
		aClass167_Sub3_Sub2_10221.method8936(this);
	}
}

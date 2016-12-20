/* Class355_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class355_Sub1 extends Class355 {
	long aLong10120 = 0L;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_10121;

	public void method130() {
		if (aLong10120 != 0L) {
			IUnknown.Release(aLong10120);
			aLong10120 = 0L;
		}
		aClass180_Sub2_Sub2_10121.method14886(this);
	}

	Class355_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, Class372[] class372s) {
		super(class372s);
		aClass180_Sub2_Sub2_10121 = class180_sub2_sub2;
		byte i = 0;
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_10121.aByteBuffer9438;
		bytebuffer.clear();
		for (short i_0_ = 0; i_0_ < aClass372Array3810.length; i_0_++) {
			short i_1_ = 0;
			Class372 class372 = aClass372Array3810[i_0_];
			for (int i_2_ = 0; i_2_ < class372.method6365(); i_2_++) {
				Class347 class347 = class372.method6366(i_2_);
				if (class347 == Class347.aClass347_3742)
					method15783(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				else if (class347 == Class347.aClass347_3732)
					method15783(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				else if (class347 == Class347.aClass347_3734)
					method15783(bytebuffer, i_0_, i_1_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				else if (class347 == Class347.aClass347_3735) {
					Class355_Sub1 class355_sub1_3_ = this;
					ByteBuffer bytebuffer_4_ = bytebuffer;
					short i_5_ = i_0_;
					short i_6_ = i_1_;
					byte i_7_ = 0;
					byte i_8_ = 0;
					byte i_9_ = 5;
					byte i_10_ = i;
					i++;
					class355_sub1_3_.method15783(bytebuffer_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_);
				} else if (class347 == Class347.aClass347_3738) {
					Class355_Sub1 class355_sub1_11_ = this;
					ByteBuffer bytebuffer_12_ = bytebuffer;
					short i_13_ = i_0_;
					short i_14_ = i_1_;
					byte i_15_ = 1;
					byte i_16_ = 0;
					byte i_17_ = 5;
					byte i_18_ = i;
					i++;
					class355_sub1_11_.method15783(bytebuffer_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_);
				} else if (class347 == Class347.aClass347_3737) {
					Class355_Sub1 class355_sub1_19_ = this;
					ByteBuffer bytebuffer_20_ = bytebuffer;
					short i_21_ = i_0_;
					short i_22_ = i_1_;
					byte i_23_ = 2;
					byte i_24_ = 0;
					byte i_25_ = 5;
					byte i_26_ = i;
					i++;
					class355_sub1_19_.method15783(bytebuffer_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_);
				} else if (class347 == Class347.aClass347_3749) {
					Class355_Sub1 class355_sub1_27_ = this;
					ByteBuffer bytebuffer_28_ = bytebuffer;
					short i_29_ = i_0_;
					short i_30_ = i_1_;
					byte i_31_ = 3;
					byte i_32_ = 0;
					byte i_33_ = 5;
					byte i_34_ = i;
					i++;
					class355_sub1_27_.method15783(bytebuffer_28_, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_);
				}
				i_1_ += class347.anInt3748;
			}
		}
		method15783(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		aLong10120 = (IDirect3DDevice.CreateVertexDeclaration(aClass180_Sub2_Sub2_10121.aLong11572, aClass180_Sub2_Sub2_10121.aLong9439));
		aClass180_Sub2_Sub2_10121.method15055(this);
	}

	void method15781() {
		method15782();
	}

	void method15782() {
		if (aLong10120 != 0L) {
			aClass180_Sub2_Sub2_10121.method18107(aLong10120);
			aLong10120 = 0L;
		}
	}

	void method15783(ByteBuffer bytebuffer, short i, short i_35_, byte i_36_, byte i_37_, byte i_38_, byte i_39_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_35_);
		bytebuffer.put(i_36_);
		bytebuffer.put(i_37_);
		bytebuffer.put(i_38_);
		bytebuffer.put(i_39_);
	}

	public void method129() {
		if (aLong10120 != 0L) {
			IUnknown.Release(aLong10120);
			aLong10120 = 0L;
		}
		aClass180_Sub2_Sub2_10121.method14886(this);
	}

	public void finalize() {
		method15782();
	}

	void method15784() {
		method15782();
	}

	void method15785() {
		method15782();
	}

	void method15786() {
		method15782();
	}

	void method15787() {
		method15782();
	}

	void method15788() {
		if (aLong10120 != 0L) {
			aClass180_Sub2_Sub2_10121.method18107(aLong10120);
			aLong10120 = 0L;
		}
	}

	void method15789() {
		if (aLong10120 != 0L) {
			aClass180_Sub2_Sub2_10121.method18107(aLong10120);
			aLong10120 = 0L;
		}
	}

	void method15790() {
		if (aLong10120 != 0L) {
			aClass180_Sub2_Sub2_10121.method18107(aLong10120);
			aLong10120 = 0L;
		}
	}
}

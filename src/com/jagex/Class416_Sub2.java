/* Class416_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class416_Sub2 extends Class416 implements Interface35 {
	int anInt10273;
	int anInt10274;
	int anInt10275;

	long method6651() {
		return aLong4518;
	}

	long method6642() {
		return aLong4518;
	}

	public void method277() {
		aClass180_Sub2_Sub2_4516.method18082(this);
	}

	public void method273(Class343 class343) {
		super.method273(class343);
	}

	public void method129() {
		super.method129();
	}

	Class416_Sub2(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class180_sub2_sub2, class157, Class184.aClass184_2104, false, i * i_0_ * i_1_);
		anInt10274 = i;
		anInt10275 = i_0_;
		anInt10273 = i_1_;
		aLong4518 = (IDirect3DDevice.CreateVolumeTexture(aClass180_Sub2_Sub2_4516.aLong11572, i, i_0_, i_1_, 1, 0, Class180_Sub2_Sub2.method18096(class157, aClass184_4515), 1));
		aClass180_Sub2_Sub2_4516.method15097(anInt10274 * anInt10275 * (class157.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(aLong4518, 0, 0, 0, 0, anInt10274, anInt10275, anInt10273, anInt10274 * (class157.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public void method130() {
		super.method129();
	}

	public void method276() {
		aClass180_Sub2_Sub2_4516.method18082(this);
	}

	public void method274(Class343 class343) {
		super.method273(class343);
	}

	long method6650() {
		return aLong4518;
	}

	public void method275() {
		aClass180_Sub2_Sub2_4516.method18082(this);
	}
}

/* Class416_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class416_Sub3 extends Class416 implements Interface39 {
	int anInt10276;

	Class416_Sub3(Class180_Sub2_Sub2 class180_sub2_sub2, int i, boolean bool, int[][] is) {
		super(class180_sub2_sub2, Class157.aClass157_1723, Class184.aClass184_2104, bool && class180_sub2_sub2.aBool11593, i * i * 6);
		anInt10276 = i;
		if (aBool4517)
			aLong4518 = IDirect3DDevice.CreateCubeTexture((aClass180_Sub2_Sub2_4516.aLong11572), anInt10276, 0, 1024, 21, 1);
		else
			aLong4518 = IDirect3DDevice.CreateCubeTexture((aClass180_Sub2_Sub2_4516.aLong11572), anInt10276, 1, 0, 21, 1);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		aClass180_Sub2_Sub2_4516.method15097(anInt10276 * anInt10276 * 4);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			bytebuffer.clear();
			bytebuffer.asIntBuffer().put(is[i_0_]);
			IDirect3DCubeTexture.Upload(aLong4518, i_0_, 0, 0, 0, anInt10276, anInt10276, anInt10276 * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		}
	}

	public void method273(Class343 class343) {
		super.method273(class343);
	}

	public void method129() {
		super.method129();
	}

	public void method277() {
		aClass180_Sub2_Sub2_4516.method18086(this);
	}

	public void method130() {
		super.method129();
	}

	public void method275() {
		aClass180_Sub2_Sub2_4516.method18086(this);
	}

	public void method276() {
		aClass180_Sub2_Sub2_4516.method18086(this);
	}

	public void method274(Class343 class343) {
		super.method273(class343);
	}
}

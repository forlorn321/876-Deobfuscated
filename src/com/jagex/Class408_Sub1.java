/* Class408_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class408_Sub1 extends Class408 implements Interface39 {
	int anInt10111;

	public void method279(Class342 class342) {
		super.method274(class342);
	}

	public void method275() {
		aClass167_Sub3_Sub2_4302.method10611(this);
	}

	public void method131() {
		super.method131();
	}

	public void method274(Class342 class342) {
		super.method274(class342);
	}

	public void method130() {
		super.method131();
	}

	public void method129() {
		super.method131();
	}

	public void method276() {
		aClass167_Sub3_Sub2_4302.method10611(this);
	}

	public void method277() {
		aClass167_Sub3_Sub2_4302.method10611(this);
	}

	Class408_Sub1(Class167_Sub3_Sub2 class167_sub3_sub2, int i, boolean bool, int[][] is) {
		super(class167_sub3_sub2, Class155.aClass155_1722, Class171.aClass171_1905, bool && class167_sub3_sub2.aBool11546, i * i * 6);
		anInt10111 = i;
		if (aBool4305)
			aLong4306 = IDirect3DDevice.CreateCubeTexture((aClass167_Sub3_Sub2_4302.aLong11573), anInt10111, 0, 1024, 21, 1);
		else
			aLong4306 = IDirect3DDevice.CreateCubeTexture((aClass167_Sub3_Sub2_4302.aLong11573), anInt10111, 1, 0, 21, 1);
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		aClass167_Sub3_Sub2_4302.method8713(anInt10111 * anInt10111 * 4);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			bytebuffer.clear();
			bytebuffer.asIntBuffer().put(is[i_0_]);
			IDirect3DCubeTexture.Upload(aLong4306, i_0_, 0, 0, 0, anInt10111, anInt10111, anInt10111 * 4, 0, aClass167_Sub3_Sub2_4302.aLong9586);
		}
	}

	public void method278(Class342 class342) {
		super.method274(class342);
	}
}

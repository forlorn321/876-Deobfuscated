/* Class408_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class408_Sub3 extends Class408 implements Interface34 {
	int anInt10187;
	int anInt10188;
	int anInt10189;

	public void method131() {
		super.method131();
	}

	public void method277() {
		aClass167_Sub3_Sub2_4302.method10613(this);
	}

	public void method275() {
		aClass167_Sub3_Sub2_4302.method10613(this);
	}

	public void method274(Class342 class342) {
		super.method274(class342);
	}

	public void method276() {
		aClass167_Sub3_Sub2_4302.method10613(this);
	}

	public void method130() {
		super.method131();
	}

	public void method129() {
		super.method131();
	}

	long method4960() {
		return aLong4306;
	}

	Class408_Sub3(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class167_sub3_sub2, class155, Class171.aClass171_1905, false, i * i_0_ * i_1_);
		anInt10189 = i;
		anInt10188 = i_0_;
		anInt10187 = i_1_;
		aLong4306 = (IDirect3DDevice.CreateVolumeTexture(aClass167_Sub3_Sub2_4302.aLong11573, i, i_0_, i_1_, 1, 0, Class167_Sub3_Sub2.method10618(class155, aClass171_4304), 1));
		aClass167_Sub3_Sub2_4302.method8713(anInt10189 * anInt10188 * (class155.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(aLong4306, 0, 0, 0, 0, anInt10189, anInt10188, anInt10187, anInt10189 * (class155.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	long method4958() {
		return aLong4306;
	}

	public void method279(Class342 class342) {
		super.method274(class342);
	}

	public void method278(Class342 class342) {
		super.method274(class342);
	}

	long method4959() {
		return aLong4306;
	}

	long method4964() {
		return aLong4306;
	}

	long method4965() {
		return aLong4306;
	}
}

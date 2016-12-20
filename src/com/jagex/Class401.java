/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class401 implements Interface54, Interface51 {
	long aLong4143;
	Class416_Sub1_Sub1 aClass416_Sub1_Sub1_4144;
	int anInt4145;

	public long method95() {
		if (aLong4143 == 0L)
			aLong4143 = IDirect3DTexture.GetSurfaceLevel((aClass416_Sub1_Sub1_4144.aLong4518), anInt4145);
		return aLong4143;
	}

	public int method42() {
		return aClass416_Sub1_Sub1_4144.method1();
	}

	public int method87() {
		return aClass416_Sub1_Sub1_4144.method87();
	}

	public long method346() {
		if (aLong4143 == 0L)
			aLong4143 = IDirect3DTexture.GetSurfaceLevel((aClass416_Sub1_Sub1_4144.aLong4518), anInt4145);
		return aLong4143;
	}

	public void method129() {
		if (aLong4143 != 0L) {
			IUnknown.Release(aLong4143);
			aLong4143 = 0L;
		}
		aClass416_Sub1_Sub1_4144.aClass180_Sub2_Sub2_4516.method14886(this);
	}

	public void method343() {
		if (aLong4143 != 0L) {
			aClass416_Sub1_Sub1_4144.aClass180_Sub2_Sub2_4516.method18107(aLong4143);
			aLong4143 = 0L;
		}
	}

	public long method96() {
		if (aLong4143 == 0L)
			aLong4143 = IDirect3DTexture.GetSurfaceLevel((aClass416_Sub1_Sub1_4144.aLong4518), anInt4145);
		return aLong4143;
	}

	Class401(Class416_Sub1_Sub1 class416_sub1_sub1, int i) {
		anInt4145 = i;
		aClass416_Sub1_Sub1_4144 = class416_sub1_sub1;
		aClass416_Sub1_Sub1_4144.aClass180_Sub2_Sub2_4516.method15055(this);
	}

	public int method91() {
		return aClass416_Sub1_Sub1_4144.method87();
	}

	public int method6() {
		return aClass416_Sub1_Sub1_4144.method87();
	}

	void method6533() {
		method343();
	}

	void method6534() {
		method343();
	}

	public void finalize() {
		method343();
	}

	void method6535() {
		method343();
	}

	void method6536() {
		method343();
	}

	void method6537() {
		method343();
	}

	public long method345() {
		if (aLong4143 == 0L)
			aLong4143 = IDirect3DTexture.GetSurfaceLevel((aClass416_Sub1_Sub1_4144.aLong4518), anInt4145);
		return aLong4143;
	}

	public int method1() {
		return aClass416_Sub1_Sub1_4144.method1();
	}

	public void method130() {
		if (aLong4143 != 0L) {
			IUnknown.Release(aLong4143);
			aLong4143 = 0L;
		}
		aClass416_Sub1_Sub1_4144.aClass180_Sub2_Sub2_4516.method14886(this);
	}

	public void method344() {
		if (aLong4143 != 0L) {
			aClass416_Sub1_Sub1_4144.aClass180_Sub2_Sub2_4516.method18107(aLong4143);
			aLong4143 = 0L;
		}
	}

	public void method342() {
		if (aLong4143 != 0L) {
			aClass416_Sub1_Sub1_4144.aClass180_Sub2_Sub2_4516.method18107(aLong4143);
			aLong4143 = 0L;
		}
	}

	public void method347() {
		if (aLong4143 != 0L) {
			aClass416_Sub1_Sub1_4144.aClass180_Sub2_Sub2_4516.method18107(aLong4143);
			aLong4143 = 0L;
		}
	}
}

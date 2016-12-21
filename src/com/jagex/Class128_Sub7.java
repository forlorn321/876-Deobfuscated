/* Class128_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub7 extends Class128 {
	static float[] aFloatArray8929 = { 0.0F, -1.0F, 0.0F, 0.0F };
	Class123 aClass123_8930;
	static final String aString8931 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	static final String aString8932 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	boolean aBool8933;
	boolean aBool8934;
	boolean aBool8935;
	boolean aBool8936 = false;
	Class124_Sub1 aClass124_Sub1_8937;
	Class123 aClass123_8938;
	static final String aString8939 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	Class123 aClass123_8940;
	Class123 aClass123_8941;
	static final String aString8942 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	void method1660(boolean bool) {
		aBool8935 = bool;
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(aClass124_Sub1_8937);
		aClass167_Sub2_1567.method8558(34165, 7681);
		aClass167_Sub2_1567.method8520(0, 34166, 768);
		aClass167_Sub2_1567.method8520(2, 5890, 770);
		aClass167_Sub2_1567.method8560(0, 34168, 770);
		aClass167_Sub2_1567.method8556(0);
		method8424();
	}

	void method1671(int i, int i_0_) {
		/* empty */
	}

	void method1653(boolean bool) {
		aBool8935 = bool;
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(aClass124_Sub1_8937);
		aClass167_Sub2_1567.method8558(34165, 7681);
		aClass167_Sub2_1567.method8520(0, 34166, 768);
		aClass167_Sub2_1567.method8520(2, 5890, 770);
		aClass167_Sub2_1567.method8560(0, 34168, 770);
		aClass167_Sub2_1567.method8556(0);
		method8424();
	}

	void method1673(boolean bool) {
		/* empty */
	}

	void method1662(boolean bool) {
		aBool8935 = bool;
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(aClass124_Sub1_8937);
		aClass167_Sub2_1567.method8558(34165, 7681);
		aClass167_Sub2_1567.method8520(0, 34166, 768);
		aClass167_Sub2_1567.method8520(2, 5890, 770);
		aClass167_Sub2_1567.method8560(0, 34168, 770);
		aClass167_Sub2_1567.method8556(0);
		method8424();
	}

	void method8424() {
		Class443 class443 = aClass167_Sub2_1567.aClass443_9280;
		if (aBool8935)
			OpenGL.glBindProgramARB(34336, ((aClass167_Sub2_1567.anInt9268 == 2147483647) ? aClass123_8940.anInt1486 : aClass123_8938.anInt1486));
		else
			OpenGL.glBindProgramARB(34336, ((aClass167_Sub2_1567.anInt9268 == 2147483647) ? aClass123_8941.anInt1486 : aClass123_8930.anInt1486));
		float f = (float) aClass167_Sub2_1567.anInt9268;
		float f_1_ = class443.aFloatArray4878[4] * f + class443.aFloatArray4878[12];
		float f_2_ = class443.aFloatArray4878[5] * f + class443.aFloatArray4878[13];
		float f_3_ = class443.aFloatArray4878[6] * f + class443.aFloatArray4878[14];
		aFloatArray8929[0] = -class443.aFloatArray4878[4];
		aFloatArray8929[1] = -class443.aFloatArray4878[5];
		aFloatArray8929[2] = -class443.aFloatArray4878[6];
		aFloatArray8929[3] = -(aFloatArray8929[0] * f_1_ + aFloatArray8929[1] * f_2_ + aFloatArray8929[2] * f_3_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8929[0], aFloatArray8929[1], aFloatArray8929[2], aFloatArray8929[3]);
		OpenGL.glEnable(34336);
		aBool8934 = true;
		method8426();
	}

	void method1665(boolean bool) {
		/* empty */
	}

	void method1674(Class124 class124, int i) {
		if (class124 == null) {
			if (!aBool8936) {
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8557(1);
				aClass167_Sub2_1567.method8520(0, 34168, 768);
				aClass167_Sub2_1567.method8560(0, 34168, 770);
				aBool8936 = true;
			}
		} else {
			if (aBool8936) {
				aClass167_Sub2_1567.method8520(0, 5890, 768);
				aClass167_Sub2_1567.method8560(0, 5890, 770);
				aBool8936 = false;
			}
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method1656(int i, int i_4_) {
		/* empty */
	}

	boolean method1657() {
		return aBool8933;
	}

	boolean method1658() {
		return aBool8933;
	}

	boolean method1659() {
		return aBool8933;
	}

	void method1667(boolean bool) {
		aBool8935 = bool;
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(aClass124_Sub1_8937);
		aClass167_Sub2_1567.method8558(34165, 7681);
		aClass167_Sub2_1567.method8520(0, 34166, 768);
		aClass167_Sub2_1567.method8520(2, 5890, 770);
		aClass167_Sub2_1567.method8560(0, 34168, 770);
		aClass167_Sub2_1567.method8556(0);
		method8424();
	}

	void method1666(boolean bool) {
		/* empty */
	}

	void method8425() {
		if (aBool8934) {
			float f = aClass167_Sub2_1567.aFloat9173;
			float f_5_ = aClass167_Sub2_1567.aFloat9207;
			float f_6_ = f - (f - f_5_) * 0.125F;
			float f_7_ = f - (f - f_5_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_7_, f_6_, 256.0F / (float) (aClass167_Sub2_1567.aClass175_9269.anInt1934 * 71478565), (float) (aClass167_Sub2_1567.aClass175_9269.anInt1930 * 1487365757) / 255.0F);
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8561((aClass167_Sub2_1567.aClass175_9269.anInt1932) * 432289019);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1655(boolean bool) {
		/* empty */
	}

	void method1664(boolean bool) {
		/* empty */
	}

	boolean method1652() {
		return aBool8933;
	}

	void method1654() {
		if (aBool8934) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8934 = false;
		}
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		aClass167_Sub2_1567.method8520(2, 34166, 770);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		if (aBool8936) {
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
			aBool8936 = false;
		}
	}

	void method1651() {
		if (aBool8934) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8934 = false;
		}
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		aClass167_Sub2_1567.method8520(2, 34166, 770);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		if (aBool8936) {
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
			aBool8936 = false;
		}
	}

	void method1661() {
		if (aBool8934) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8934 = false;
		}
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		aClass167_Sub2_1567.method8520(2, 34166, 770);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		if (aBool8936) {
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
			aBool8936 = false;
		}
	}

	void method8426() {
		if (aBool8934) {
			float f = aClass167_Sub2_1567.aFloat9173;
			float f_8_ = aClass167_Sub2_1567.aFloat9207;
			float f_9_ = f - (f - f_8_) * 0.125F;
			float f_10_ = f - (f - f_8_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_10_, f_9_, 256.0F / (float) (aClass167_Sub2_1567.aClass175_9269.anInt1934 * 71478565), (float) (aClass167_Sub2_1567.aClass175_9269.anInt1930 * 1487365757) / 255.0F);
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8561((aClass167_Sub2_1567.aClass175_9269.anInt1932) * 432289019);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1670() {
		if (aBool8934) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8934 = false;
		}
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		aClass167_Sub2_1567.method8520(2, 34166, 770);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		if (aBool8936) {
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
			aBool8936 = false;
		}
	}

	Class128_Sub7(Class167_Sub2 class167_sub2) {
		super(class167_sub2);
		if (aClass167_Sub2_1567.aBool9167) {
			aClass123_8941 = (Class123.method1607(aClass167_Sub2_1567, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			aClass123_8940 = (Class123.method1607(aClass167_Sub2_1567, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			aClass123_8930 = (Class123.method1607(aClass167_Sub2_1567, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			aClass123_8938 = (Class123.method1607(aClass167_Sub2_1567, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			if (aClass123_8941 != null & aClass123_8940 != null & aClass123_8930 != null & aClass123_8938 != null) {
				aClass124_Sub1_8937 = new Class124_Sub1(class167_sub2, 3553, Class155.aClass155_1729, Class171.aClass171_1905, 2, 1, false, new byte[] { 0, -1 }, Class155.aClass155_1729, false);
				aClass124_Sub1_8937.method8394(false, false);
				aBool8933 = true;
			} else
				aBool8933 = false;
		} else
			aBool8933 = false;
	}

	void method1669() {
		if (aBool8934) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8934 = false;
		}
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		aClass167_Sub2_1567.method8520(2, 34166, 770);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		if (aBool8936) {
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
			aBool8936 = false;
		}
	}

	void method1668(Class124 class124, int i) {
		if (class124 == null) {
			if (!aBool8936) {
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8557(1);
				aClass167_Sub2_1567.method8520(0, 34168, 768);
				aClass167_Sub2_1567.method8560(0, 34168, 770);
				aBool8936 = true;
			}
		} else {
			if (aBool8936) {
				aClass167_Sub2_1567.method8520(0, 5890, 768);
				aClass167_Sub2_1567.method8560(0, 5890, 770);
				aBool8936 = false;
			}
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method1663(Class124 class124, int i) {
		if (class124 == null) {
			if (!aBool8936) {
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8557(1);
				aClass167_Sub2_1567.method8520(0, 34168, 768);
				aClass167_Sub2_1567.method8560(0, 34168, 770);
				aBool8936 = true;
			}
		} else {
			if (aBool8936) {
				aClass167_Sub2_1567.method8520(0, 5890, 768);
				aClass167_Sub2_1567.method8560(0, 5890, 770);
				aBool8936 = false;
			}
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method8427() {
		Class443 class443 = aClass167_Sub2_1567.aClass443_9280;
		if (aBool8935)
			OpenGL.glBindProgramARB(34336, ((aClass167_Sub2_1567.anInt9268 == 2147483647) ? aClass123_8940.anInt1486 : aClass123_8938.anInt1486));
		else
			OpenGL.glBindProgramARB(34336, ((aClass167_Sub2_1567.anInt9268 == 2147483647) ? aClass123_8941.anInt1486 : aClass123_8930.anInt1486));
		float f = (float) aClass167_Sub2_1567.anInt9268;
		float f_11_ = class443.aFloatArray4878[4] * f + class443.aFloatArray4878[12];
		float f_12_ = class443.aFloatArray4878[5] * f + class443.aFloatArray4878[13];
		float f_13_ = class443.aFloatArray4878[6] * f + class443.aFloatArray4878[14];
		aFloatArray8929[0] = -class443.aFloatArray4878[4];
		aFloatArray8929[1] = -class443.aFloatArray4878[5];
		aFloatArray8929[2] = -class443.aFloatArray4878[6];
		aFloatArray8929[3] = -(aFloatArray8929[0] * f_11_ + aFloatArray8929[1] * f_12_ + aFloatArray8929[2] * f_13_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8929[0], aFloatArray8929[1], aFloatArray8929[2], aFloatArray8929[3]);
		OpenGL.glEnable(34336);
		aBool8934 = true;
		method8426();
	}

	void method1672(Class124 class124, int i) {
		if (class124 == null) {
			if (!aBool8936) {
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8557(1);
				aClass167_Sub2_1567.method8520(0, 34168, 768);
				aClass167_Sub2_1567.method8560(0, 34168, 770);
				aBool8936 = true;
			}
		} else {
			if (aBool8936) {
				aClass167_Sub2_1567.method8520(0, 5890, 768);
				aClass167_Sub2_1567.method8560(0, 5890, 770);
				aBool8936 = false;
			}
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method8428() {
		if (aBool8934) {
			float f = aClass167_Sub2_1567.aFloat9173;
			float f_14_ = aClass167_Sub2_1567.aFloat9207;
			float f_15_ = f - (f - f_14_) * 0.125F;
			float f_16_ = f - (f - f_14_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_16_, f_15_, 256.0F / (float) (aClass167_Sub2_1567.aClass175_9269.anInt1934 * 71478565), (float) (aClass167_Sub2_1567.aClass175_9269.anInt1930 * 1487365757) / 255.0F);
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8561((aClass167_Sub2_1567.aClass175_9269.anInt1932) * 432289019);
			aClass167_Sub2_1567.method8556(0);
		}
	}
}

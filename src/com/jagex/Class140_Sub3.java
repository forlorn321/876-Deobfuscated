/* Class140_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class140_Sub3 extends Class140 {
	boolean aBool8918 = false;
	static final String aString8919 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	static final String aString8920 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	Class122 aClass122_8921;
	boolean aBool8922;
	Class122 aClass122_8923;
	boolean aBool8924;
	Class122 aClass122_8925;
	Class118_Sub3 aClass118_Sub3_8926;
	static final String aString8927 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	Class122 aClass122_8928;
	static final String aString8929 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	boolean aBool8930;
	static float[] aFloatArray8931 = { 0.0F, -1.0F, 0.0F, 0.0F };

	void method2341(boolean bool) {
		/* empty */
	}

	boolean method2319() {
		return aBool8922;
	}

	void method2324(boolean bool) {
		aBool8924 = bool;
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(aClass118_Sub3_8926);
		aClass180_Sub3_1647.method15403(34165, 7681);
		aClass180_Sub3_1647.method15404(0, 34166, 768);
		aClass180_Sub3_1647.method15404(2, 5890, 770);
		aClass180_Sub3_1647.method15405(0, 34168, 770);
		aClass180_Sub3_1647.method15400(0);
		method14434();
	}

	boolean method2321() {
		return aBool8922;
	}

	void method2322() {
		if (aBool8930) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8930 = false;
		}
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(null);
		aClass180_Sub3_1647.method15403(8448, 8448);
		aClass180_Sub3_1647.method15404(0, 5890, 768);
		aClass180_Sub3_1647.method15404(2, 34166, 770);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		if (aBool8918) {
			aClass180_Sub3_1647.method15404(0, 5890, 768);
			aClass180_Sub3_1647.method15405(0, 5890, 770);
			aBool8918 = false;
		}
	}

	void method14434() {
		Class427 class427 = aClass180_Sub3_1647.aClass427_9736;
		if (aBool8924)
			OpenGL.glBindProgramARB(34336, ((aClass180_Sub3_1647.anInt9845 == 2147483647) ? aClass122_8923.anInt1492 : aClass122_8921.anInt1492));
		else
			OpenGL.glBindProgramARB(34336, ((aClass180_Sub3_1647.anInt9845 == 2147483647) ? aClass122_8925.anInt1492 : aClass122_8928.anInt1492));
		float f = (float) aClass180_Sub3_1647.anInt9845;
		float f_0_ = class427.aFloatArray4807[4] * f + class427.aFloatArray4807[12];
		float f_1_ = class427.aFloatArray4807[5] * f + class427.aFloatArray4807[13];
		float f_2_ = class427.aFloatArray4807[6] * f + class427.aFloatArray4807[14];
		aFloatArray8931[0] = -class427.aFloatArray4807[4];
		aFloatArray8931[1] = -class427.aFloatArray4807[5];
		aFloatArray8931[2] = -class427.aFloatArray4807[6];
		aFloatArray8931[3] = -(aFloatArray8931[0] * f_0_ + aFloatArray8931[1] * f_1_ + aFloatArray8931[2] * f_2_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8931[0], aFloatArray8931[1], aFloatArray8931[2], aFloatArray8931[3]);
		OpenGL.glEnable(34336);
		aBool8930 = true;
		method14435();
	}

	void method14435() {
		if (aBool8930) {
			float f = aClass180_Sub3_1647.aFloat9812;
			float f_3_ = aClass180_Sub3_1647.aFloat9741;
			float f_4_ = f - (f - f_3_) * 0.125F;
			float f_5_ = f - (f - f_3_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_5_, f_4_, 256.0F / (float) (aClass180_Sub3_1647.aClass178_9672.anInt2050 * 112490777), (float) (aClass180_Sub3_1647.aClass178_9672.anInt2051 * -1449092429) / 255.0F);
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15344((aClass180_Sub3_1647.aClass178_9672.anInt2055) * -2080392837);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2320(Class118 class118, int i) {
		if (class118 == null) {
			if (!aBool8918) {
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15402(1);
				aClass180_Sub3_1647.method15404(0, 34168, 768);
				aClass180_Sub3_1647.method15405(0, 34168, 770);
				aBool8918 = true;
			}
		} else {
			if (aBool8918) {
				aClass180_Sub3_1647.method15404(0, 5890, 768);
				aClass180_Sub3_1647.method15405(0, 5890, 770);
				aBool8918 = false;
			}
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	Class140_Sub3(Class180_Sub3 class180_sub3) {
		super(class180_sub3);
		if (aClass180_Sub3_1647.aBool9832) {
			aClass122_8925 = (Class122.method2141(aClass180_Sub3_1647, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			aClass122_8923 = (Class122.method2141(aClass180_Sub3_1647, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			aClass122_8928 = (Class122.method2141(aClass180_Sub3_1647, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			aClass122_8921 = (Class122.method2141(aClass180_Sub3_1647, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			if (aClass122_8925 != null & aClass122_8923 != null & aClass122_8928 != null & aClass122_8921 != null) {
				aClass118_Sub3_8926 = new Class118_Sub3(class180_sub3, 3553, Class157.aClass157_1724, Class184.aClass184_2104, 2, 1, false, new byte[] { 0, -1 }, Class157.aClass157_1724, false);
				aClass118_Sub3_8926.method14450(false, false);
				aBool8922 = true;
			} else
				aBool8922 = false;
		} else
			aBool8922 = false;
	}

	void method2340(boolean bool) {
		/* empty */
	}

	void method2338() {
		if (aBool8930) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8930 = false;
		}
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(null);
		aClass180_Sub3_1647.method15403(8448, 8448);
		aClass180_Sub3_1647.method15404(0, 5890, 768);
		aClass180_Sub3_1647.method15404(2, 34166, 770);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		if (aBool8918) {
			aClass180_Sub3_1647.method15404(0, 5890, 768);
			aClass180_Sub3_1647.method15405(0, 5890, 770);
			aBool8918 = false;
		}
	}

	void method2326(boolean bool) {
		/* empty */
	}

	void method2329(boolean bool) {
		/* empty */
	}

	void method2328(boolean bool) {
		/* empty */
	}

	void method2330(int i, int i_6_) {
		/* empty */
	}

	boolean method2325() {
		return aBool8922;
	}

	void method2318(int i, int i_7_) {
		/* empty */
	}

	void method2332(int i, int i_8_) {
		/* empty */
	}

	void method2333(int i, int i_9_) {
		/* empty */
	}

	void method2334(int i, int i_10_) {
		/* empty */
	}

	void method14436() {
		if (aBool8930) {
			float f = aClass180_Sub3_1647.aFloat9812;
			float f_11_ = aClass180_Sub3_1647.aFloat9741;
			float f_12_ = f - (f - f_11_) * 0.125F;
			float f_13_ = f - (f - f_11_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_13_, f_12_, 256.0F / (float) (aClass180_Sub3_1647.aClass178_9672.anInt2050 * 112490777), (float) (aClass180_Sub3_1647.aClass178_9672.anInt2051 * -1449092429) / 255.0F);
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15344((aClass180_Sub3_1647.aClass178_9672.anInt2055) * -2080392837);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2339(Class118 class118, int i) {
		if (class118 == null) {
			if (!aBool8918) {
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15402(1);
				aClass180_Sub3_1647.method15404(0, 34168, 768);
				aClass180_Sub3_1647.method15405(0, 34168, 770);
				aBool8918 = true;
			}
		} else {
			if (aBool8918) {
				aClass180_Sub3_1647.method15404(0, 5890, 768);
				aClass180_Sub3_1647.method15405(0, 5890, 770);
				aBool8918 = false;
			}
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2337(boolean bool) {
		aBool8924 = bool;
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(aClass118_Sub3_8926);
		aClass180_Sub3_1647.method15403(34165, 7681);
		aClass180_Sub3_1647.method15404(0, 34166, 768);
		aClass180_Sub3_1647.method15404(2, 5890, 770);
		aClass180_Sub3_1647.method15405(0, 34168, 770);
		aClass180_Sub3_1647.method15400(0);
		method14434();
	}

	void method14437() {
		Class427 class427 = aClass180_Sub3_1647.aClass427_9736;
		if (aBool8924)
			OpenGL.glBindProgramARB(34336, ((aClass180_Sub3_1647.anInt9845 == 2147483647) ? aClass122_8923.anInt1492 : aClass122_8921.anInt1492));
		else
			OpenGL.glBindProgramARB(34336, ((aClass180_Sub3_1647.anInt9845 == 2147483647) ? aClass122_8925.anInt1492 : aClass122_8928.anInt1492));
		float f = (float) aClass180_Sub3_1647.anInt9845;
		float f_14_ = class427.aFloatArray4807[4] * f + class427.aFloatArray4807[12];
		float f_15_ = class427.aFloatArray4807[5] * f + class427.aFloatArray4807[13];
		float f_16_ = class427.aFloatArray4807[6] * f + class427.aFloatArray4807[14];
		aFloatArray8931[0] = -class427.aFloatArray4807[4];
		aFloatArray8931[1] = -class427.aFloatArray4807[5];
		aFloatArray8931[2] = -class427.aFloatArray4807[6];
		aFloatArray8931[3] = -(aFloatArray8931[0] * f_14_ + aFloatArray8931[1] * f_15_ + aFloatArray8931[2] * f_16_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8931[0], aFloatArray8931[1], aFloatArray8931[2], aFloatArray8931[3]);
		OpenGL.glEnable(34336);
		aBool8930 = true;
		method14435();
	}

	void method2335(boolean bool) {
		aBool8924 = bool;
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(aClass118_Sub3_8926);
		aClass180_Sub3_1647.method15403(34165, 7681);
		aClass180_Sub3_1647.method15404(0, 34166, 768);
		aClass180_Sub3_1647.method15404(2, 5890, 770);
		aClass180_Sub3_1647.method15405(0, 34168, 770);
		aClass180_Sub3_1647.method15400(0);
		method14434();
	}

	void method2327(Class118 class118, int i) {
		if (class118 == null) {
			if (!aBool8918) {
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15402(1);
				aClass180_Sub3_1647.method15404(0, 34168, 768);
				aClass180_Sub3_1647.method15405(0, 34168, 770);
				aBool8918 = true;
			}
		} else {
			if (aBool8918) {
				aClass180_Sub3_1647.method15404(0, 5890, 768);
				aClass180_Sub3_1647.method15405(0, 5890, 770);
				aBool8918 = false;
			}
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2331(Class118 class118, int i) {
		if (class118 == null) {
			if (!aBool8918) {
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15402(1);
				aClass180_Sub3_1647.method15404(0, 34168, 768);
				aClass180_Sub3_1647.method15405(0, 34168, 770);
				aBool8918 = true;
			}
		} else {
			if (aBool8918) {
				aClass180_Sub3_1647.method15404(0, 5890, 768);
				aClass180_Sub3_1647.method15405(0, 5890, 770);
				aBool8918 = false;
			}
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2323(int i, int i_17_) {
		/* empty */
	}

	void method14438() {
		if (aBool8930) {
			float f = aClass180_Sub3_1647.aFloat9812;
			float f_18_ = aClass180_Sub3_1647.aFloat9741;
			float f_19_ = f - (f - f_18_) * 0.125F;
			float f_20_ = f - (f - f_18_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_20_, f_19_, 256.0F / (float) (aClass180_Sub3_1647.aClass178_9672.anInt2050 * 112490777), (float) (aClass180_Sub3_1647.aClass178_9672.anInt2051 * -1449092429) / 255.0F);
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15344((aClass180_Sub3_1647.aClass178_9672.anInt2055) * -2080392837);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2336(boolean bool) {
		aBool8924 = bool;
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(aClass118_Sub3_8926);
		aClass180_Sub3_1647.method15403(34165, 7681);
		aClass180_Sub3_1647.method15404(0, 34166, 768);
		aClass180_Sub3_1647.method15404(2, 5890, 770);
		aClass180_Sub3_1647.method15405(0, 34168, 770);
		aClass180_Sub3_1647.method15400(0);
		method14434();
	}
}

/* Class140_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class140_Sub5 extends Class140 {
	float[] aFloatArray8946;
	static final char aChar8947 = '\0';
	static final char aChar8948 = '\001';
	static final String aString8949 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	int anInt8950;
	Class121 aClass121_8951;
	float aFloat8952;
	Class122 aClass122_8953;
	Class136 aClass136_8954;
	static float[] aFloatArray8955 = new float[4];

	void method2320(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method14443() {
		aClass121_8951 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8951.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15344(-16777216);
		aClass180_Sub3_1647.method15403(260, 7681);
		aClass180_Sub3_1647.method15405(0, 34166, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, aClass122_8953.anInt1492);
		OpenGL.glEnable(34336);
		aClass121_8951.method2129();
		aClass121_8951.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass180_Sub3_1647.method15402(0);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass121_8951.method2129();
	}

	void method2324(boolean bool) {
		if (aClass121_8951 != null) {
			aClass121_8951.method2127('\0');
			aClass180_Sub3_1647.method15400(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass180_Sub3_1647.aClass427_9729.aFloatArray4807), 0);
			OpenGL.glMatrixMode(5888);
			aClass180_Sub3_1647.method15400(0);
			if (anInt8950 != aClass180_Sub3_1647.anInt9705) {
				int i = aClass180_Sub3_1647.anInt9705 % 5000 * 128 / 5000;
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, aFloatArray8946, i);
					i += 2;
				}
				if (aClass136_8954.aBool1570)
					aFloat8952 = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8950 = aClass180_Sub3_1647.anInt9705;
			}
		}
	}

	void method2333(int i, int i_1_) {
		if (aClass121_8951 != null) {
			aClass180_Sub3_1647.method15400(1);
			if ((i & 0x80) == 0) {
				if ((i_1_ & 0x1) == 1) {
					if (!aClass136_8954.aBool1570) {
						int i_2_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[i_2_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8952, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_8954.aBool1570)
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
					else
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			if ((i & 0x40) == 0) {
				aFloatArray8955[0] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9795);
				aFloatArray8955[1] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9777);
				aFloatArray8955[2] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9778);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8955, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_3_ = i & 0x3;
			if (i_3_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2322() {
		if (aClass121_8951 != null) {
			aClass121_8951.method2127('\001');
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	boolean method2321() {
		return true;
	}

	boolean method2319() {
		return true;
	}

	void method2323(int i, int i_4_) {
		if (aClass121_8951 != null) {
			aClass180_Sub3_1647.method15400(1);
			if ((i & 0x80) == 0) {
				if ((i_4_ & 0x1) == 1) {
					if (!aClass136_8954.aBool1570) {
						int i_5_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[i_5_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8952, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_8954.aBool1570)
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
					else
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			if ((i & 0x40) == 0) {
				aFloatArray8955[0] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9795);
				aFloatArray8955[1] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9777);
				aFloatArray8955[2] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9778);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8955, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_6_ = i & 0x3;
			if (i_6_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_6_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2332(int i, int i_7_) {
		if (aClass121_8951 != null) {
			aClass180_Sub3_1647.method15400(1);
			if ((i & 0x80) == 0) {
				if ((i_7_ & 0x1) == 1) {
					if (!aClass136_8954.aBool1570) {
						int i_8_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[i_8_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8952, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_8954.aBool1570)
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
					else
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			if ((i & 0x40) == 0) {
				aFloatArray8955[0] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9795);
				aFloatArray8955[1] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9777);
				aFloatArray8955[2] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9778);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8955, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_9_ = i & 0x3;
			if (i_9_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_9_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	boolean method2325() {
		return true;
	}

	void method14444() {
		aClass121_8951 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8951.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15344(-16777216);
		aClass180_Sub3_1647.method15403(260, 7681);
		aClass180_Sub3_1647.method15405(0, 34166, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, aClass122_8953.anInt1492);
		OpenGL.glEnable(34336);
		aClass121_8951.method2129();
		aClass121_8951.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass180_Sub3_1647.method15402(0);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass121_8951.method2129();
	}

	void method14445() {
		aClass121_8951 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8951.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15344(-16777216);
		aClass180_Sub3_1647.method15403(260, 7681);
		aClass180_Sub3_1647.method15405(0, 34166, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, aClass122_8953.anInt1492);
		OpenGL.glEnable(34336);
		aClass121_8951.method2129();
		aClass121_8951.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass180_Sub3_1647.method15402(0);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass121_8951.method2129();
	}

	void method14446() {
		aClass121_8951 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8951.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15344(-16777216);
		aClass180_Sub3_1647.method15403(260, 7681);
		aClass180_Sub3_1647.method15405(0, 34166, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, aClass122_8953.anInt1492);
		OpenGL.glEnable(34336);
		aClass121_8951.method2129();
		aClass121_8951.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass180_Sub3_1647.method15402(0);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass121_8951.method2129();
	}

	void method14447() {
		aClass121_8951 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8951.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15344(-16777216);
		aClass180_Sub3_1647.method15403(260, 7681);
		aClass180_Sub3_1647.method15405(0, 34166, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, aClass122_8953.anInt1492);
		OpenGL.glEnable(34336);
		aClass121_8951.method2129();
		aClass121_8951.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass180_Sub3_1647.method15402(0);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass121_8951.method2129();
	}

	void method14448() {
		aClass121_8951 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8951.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15344(-16777216);
		aClass180_Sub3_1647.method15403(260, 7681);
		aClass180_Sub3_1647.method15405(0, 34166, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, aClass122_8953.anInt1492);
		OpenGL.glEnable(34336);
		aClass121_8951.method2129();
		aClass121_8951.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass180_Sub3_1647.method15402(0);
		aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass121_8951.method2129();
	}

	void method2326(boolean bool) {
		/* empty */
	}

	void method2341(boolean bool) {
		/* empty */
	}

	void method2328(boolean bool) {
		/* empty */
	}

	void method2329(boolean bool) {
		/* empty */
	}

	void method2330(int i, int i_10_) {
		if (aClass121_8951 != null) {
			aClass180_Sub3_1647.method15400(1);
			if ((i & 0x80) == 0) {
				if ((i_10_ & 0x1) == 1) {
					if (!aClass136_8954.aBool1570) {
						int i_11_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[i_11_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8952, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_8954.aBool1570)
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
					else
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			if ((i & 0x40) == 0) {
				aFloatArray8955[0] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9795);
				aFloatArray8955[1] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9777);
				aFloatArray8955[2] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9778);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8955, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_12_ = i & 0x3;
			if (i_12_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_12_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2318(int i, int i_13_) {
		if (aClass121_8951 != null) {
			aClass180_Sub3_1647.method15400(1);
			if ((i & 0x80) == 0) {
				if ((i_13_ & 0x1) == 1) {
					if (!aClass136_8954.aBool1570) {
						int i_14_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[i_14_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8952, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_8954.aBool1570)
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
					else
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			if ((i & 0x40) == 0) {
				aFloatArray8955[0] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9795);
				aFloatArray8955[1] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9777);
				aFloatArray8955[2] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9778);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8955, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_15_ = i & 0x3;
			if (i_15_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_15_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2340(boolean bool) {
		/* empty */
	}

	Class140_Sub5(Class180_Sub3 class180_sub3, Class136 class136) {
		super(class180_sub3);
		aClass136_8954 = class136;
		if (aClass180_Sub3_1647.aBool9832 && aClass180_Sub3_1647.anInt9815 >= 2) {
			aClass122_8953 = (Class122.method2141(aClass180_Sub3_1647, 34336,
					"!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (aClass122_8953 != null) {
				int[][] is = Class517_Sub2.method16046(64, 256, 0, 4, 4, 3, 0.4F, false, (byte) 0);
				int[][] is_16_ = Class517_Sub2.method16046(64, 256, 8, 4, 4, 3, 0.4F, false, (byte) 0);
				int i = 0;
				aFloatArray8946 = new float[32768];
				for (int i_17_ = 0; i_17_ < 256; i_17_++) {
					int[] is_18_ = is[i_17_];
					int[] is_19_ = is_16_[i_17_];
					for (int i_20_ = 0; i_20_ < 64; i_20_++) {
						aFloatArray8946[i++] = (float) is_18_[i_20_] / 4096.0F;
						aFloatArray8946[i++] = (float) is_19_[i_20_] / 4096.0F;
					}
				}
				method14448();
			}
		}
	}

	void method2334(int i, int i_21_) {
		if (aClass121_8951 != null) {
			aClass180_Sub3_1647.method15400(1);
			if ((i & 0x80) == 0) {
				if ((i_21_ & 0x1) == 1) {
					if (!aClass136_8954.aBool1570) {
						int i_22_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[i_22_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8952, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_8954.aBool1570)
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub4_1572);
					else
						aClass180_Sub3_1647.method15401(aClass136_8954.aClass118_Sub3Array1571[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			if ((i & 0x40) == 0) {
				aFloatArray8955[0] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9795);
				aFloatArray8955[1] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9777);
				aFloatArray8955[2] = (aClass180_Sub3_1647.aFloat9779 * aClass180_Sub3_1647.aFloat9778);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8955, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_23_ = i & 0x3;
			if (i_23_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_23_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2335(boolean bool) {
		if (aClass121_8951 != null) {
			aClass121_8951.method2127('\0');
			aClass180_Sub3_1647.method15400(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass180_Sub3_1647.aClass427_9729.aFloatArray4807), 0);
			OpenGL.glMatrixMode(5888);
			aClass180_Sub3_1647.method15400(0);
			if (anInt8950 != aClass180_Sub3_1647.anInt9705) {
				int i = aClass180_Sub3_1647.anInt9705 % 5000 * 128 / 5000;
				for (int i_24_ = 0; i_24_ < 64; i_24_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_24_, aFloatArray8946, i);
					i += 2;
				}
				if (aClass136_8954.aBool1570)
					aFloat8952 = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8950 = aClass180_Sub3_1647.anInt9705;
			}
		}
	}

	void method2336(boolean bool) {
		if (aClass121_8951 != null) {
			aClass121_8951.method2127('\0');
			aClass180_Sub3_1647.method15400(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass180_Sub3_1647.aClass427_9729.aFloatArray4807), 0);
			OpenGL.glMatrixMode(5888);
			aClass180_Sub3_1647.method15400(0);
			if (anInt8950 != aClass180_Sub3_1647.anInt9705) {
				int i = aClass180_Sub3_1647.anInt9705 % 5000 * 128 / 5000;
				for (int i_25_ = 0; i_25_ < 64; i_25_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_25_, aFloatArray8946, i);
					i += 2;
				}
				if (aClass136_8954.aBool1570)
					aFloat8952 = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8950 = aClass180_Sub3_1647.anInt9705;
			}
		}
	}

	void method2337(boolean bool) {
		if (aClass121_8951 != null) {
			aClass121_8951.method2127('\0');
			aClass180_Sub3_1647.method15400(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass180_Sub3_1647.aClass427_9729.aFloatArray4807), 0);
			OpenGL.glMatrixMode(5888);
			aClass180_Sub3_1647.method15400(0);
			if (anInt8950 != aClass180_Sub3_1647.anInt9705) {
				int i = aClass180_Sub3_1647.anInt9705 % 5000 * 128 / 5000;
				for (int i_26_ = 0; i_26_ < 64; i_26_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_26_, aFloatArray8946, i);
					i += 2;
				}
				if (aClass136_8954.aBool1570)
					aFloat8952 = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8950 = aClass180_Sub3_1647.anInt9705;
			}
		}
	}

	void method2338() {
		if (aClass121_8951 != null) {
			aClass121_8951.method2127('\001');
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2339(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method2327(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method2331(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}
}

/* Class128_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub4 extends Class128 {
	Class123 aClass123_8906;
	float[] aFloatArray8907;
	static final char aChar8908 = '\001';
	Class125 aClass125_8909;
	int anInt8910;
	Class131 aClass131_8911;
	float aFloat8912;
	static final String aString8913 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	static final char aChar8914 = '\0';
	static float[] aFloatArray8915 = new float[4];

	boolean method1659() {
		return true;
	}

	void method1651() {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method8415() {
		aClass125_8909 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8909.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8561(-16777216);
		aClass167_Sub2_1567.method8558(260, 7681);
		aClass167_Sub2_1567.method8560(0, 34166, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, aClass123_8906.anInt1486);
		OpenGL.glEnable(34336);
		aClass125_8909.method1638();
		aClass125_8909.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_1567.method8557(0);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass125_8909.method1638();
	}

	void method1653(boolean bool) {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.aFloatArray4878), 0);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			if (anInt8910 != aClass167_Sub2_1567.anInt9176) {
				int i = aClass167_Sub2_1567.anInt9176 % 5000 * 128 / 5000;
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, aFloatArray8907, i);
					i += 2;
				}
				if (aClass131_8911.aBool1594)
					aFloat8912 = (float) (aClass167_Sub2_1567.anInt9176 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8910 = aClass167_Sub2_1567.anInt9176;
			}
		}
	}

	void method1667(boolean bool) {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.aFloatArray4878), 0);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			if (anInt8910 != aClass167_Sub2_1567.anInt9176) {
				int i = aClass167_Sub2_1567.anInt9176 % 5000 * 128 / 5000;
				for (int i_1_ = 0; i_1_ < 64; i_1_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_1_, aFloatArray8907, i);
					i += 2;
				}
				if (aClass131_8911.aBool1594)
					aFloat8912 = (float) (aClass167_Sub2_1567.anInt9176 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8910 = aClass167_Sub2_1567.anInt9176;
			}
		}
	}

	void method1654() {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1656(int i, int i_2_) {
		if (aClass125_8909 != null) {
			aClass167_Sub2_1567.method8556(1);
			if ((i & 0x80) == 0) {
				if ((i_2_ & 0x1) == 1) {
					if (!aClass131_8911.aBool1594) {
						int i_3_ = aClass167_Sub2_1567.anInt9176 % 4000 * 16 / 4000;
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub1Array1595[i_3_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub2_1596);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8912, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass131_8911.aBool1594)
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub2_1596);
					else
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub1Array1595[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			if ((i & 0x40) == 0) {
				aFloatArray8915[0] = (aClass167_Sub2_1567.aFloat9250 * aClass167_Sub2_1567.aFloat9247);
				aFloatArray8915[1] = (aClass167_Sub2_1567.aFloat9250 * aClass167_Sub2_1567.aFloat9248);
				aFloatArray8915[2] = (aClass167_Sub2_1567.aFloat9250 * aClass167_Sub2_1567.aFloat9249);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8915, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_4_ = i & 0x3;
			if (i_4_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_4_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method1674(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1663(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1673(boolean bool) {
		/* empty */
	}

	void method1665(boolean bool) {
		/* empty */
	}

	void method8416() {
		aClass125_8909 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8909.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8561(-16777216);
		aClass167_Sub2_1567.method8558(260, 7681);
		aClass167_Sub2_1567.method8560(0, 34166, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, aClass123_8906.anInt1486);
		OpenGL.glEnable(34336);
		aClass125_8909.method1638();
		aClass125_8909.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_1567.method8557(0);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass125_8909.method1638();
	}

	void method8417() {
		aClass125_8909 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8909.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8561(-16777216);
		aClass167_Sub2_1567.method8558(260, 7681);
		aClass167_Sub2_1567.method8560(0, 34166, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, aClass123_8906.anInt1486);
		OpenGL.glEnable(34336);
		aClass125_8909.method1638();
		aClass125_8909.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_1567.method8557(0);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass125_8909.method1638();
	}

	void method8418() {
		aClass125_8909 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8909.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8561(-16777216);
		aClass167_Sub2_1567.method8558(260, 7681);
		aClass167_Sub2_1567.method8560(0, 34166, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, aClass123_8906.anInt1486);
		OpenGL.glEnable(34336);
		aClass125_8909.method1638();
		aClass125_8909.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_1567.method8557(0);
		aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass125_8909.method1638();
	}

	Class128_Sub4(Class167_Sub2 class167_sub2, Class131 class131) {
		super(class167_sub2);
		aClass131_8911 = class131;
		if (aClass167_Sub2_1567.aBool9167 && aClass167_Sub2_1567.anInt9286 >= 2) {
			aClass123_8906 = (Class123.method1607(aClass167_Sub2_1567, 34336,
					"!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (aClass123_8906 != null) {
				int[][] is = CustomCursorSetting.method10170(64, 256, 0, 4, 4, 3, 0.4F, false, (byte) 8);
				int[][] is_5_ = CustomCursorSetting.method10170(64, 256, 8, 4, 4, 3, 0.4F, false, (byte) 8);
				int i = 0;
				aFloatArray8907 = new float[32768];
				for (int i_6_ = 0; i_6_ < 256; i_6_++) {
					int[] is_7_ = is[i_6_];
					int[] is_8_ = is_5_[i_6_];
					for (int i_9_ = 0; i_9_ < 64; i_9_++) {
						aFloatArray8907[i++] = (float) is_7_[i_9_] / 4096.0F;
						aFloatArray8907[i++] = (float) is_8_[i_9_] / 4096.0F;
					}
				}
				method8415();
			}
		}
	}

	boolean method1658() {
		return true;
	}

	void method1662(boolean bool) {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.aFloatArray4878), 0);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			if (anInt8910 != aClass167_Sub2_1567.anInt9176) {
				int i = aClass167_Sub2_1567.anInt9176 % 5000 * 128 / 5000;
				for (int i_10_ = 0; i_10_ < 64; i_10_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_10_, aFloatArray8907, i);
					i += 2;
				}
				if (aClass131_8911.aBool1594)
					aFloat8912 = (float) (aClass167_Sub2_1567.anInt9176 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8910 = aClass167_Sub2_1567.anInt9176;
			}
		}
	}

	void method1655(boolean bool) {
		/* empty */
	}

	void method1666(boolean bool) {
		/* empty */
	}

	void method1670() {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	boolean method1657() {
		return true;
	}

	void method1660(boolean bool) {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.aFloatArray4878), 0);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			if (anInt8910 != aClass167_Sub2_1567.anInt9176) {
				int i = aClass167_Sub2_1567.anInt9176 % 5000 * 128 / 5000;
				for (int i_11_ = 0; i_11_ < 64; i_11_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_11_, aFloatArray8907, i);
					i += 2;
				}
				if (aClass131_8911.aBool1594)
					aFloat8912 = (float) (aClass167_Sub2_1567.anInt9176 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8910 = aClass167_Sub2_1567.anInt9176;
			}
		}
	}

	void method1664(boolean bool) {
		/* empty */
	}

	void method1669() {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	boolean method1652() {
		return true;
	}

	void method1671(int i, int i_12_) {
		if (aClass125_8909 != null) {
			aClass167_Sub2_1567.method8556(1);
			if ((i & 0x80) == 0) {
				if ((i_12_ & 0x1) == 1) {
					if (!aClass131_8911.aBool1594) {
						int i_13_ = aClass167_Sub2_1567.anInt9176 % 4000 * 16 / 4000;
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub1Array1595[i_13_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub2_1596);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8912, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass131_8911.aBool1594)
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub2_1596);
					else
						aClass167_Sub2_1567.method8617(aClass131_8911.aClass124_Sub1Array1595[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			if ((i & 0x40) == 0) {
				aFloatArray8915[0] = (aClass167_Sub2_1567.aFloat9250 * aClass167_Sub2_1567.aFloat9247);
				aFloatArray8915[1] = (aClass167_Sub2_1567.aFloat9250 * aClass167_Sub2_1567.aFloat9248);
				aFloatArray8915[2] = (aClass167_Sub2_1567.aFloat9250 * aClass167_Sub2_1567.aFloat9249);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8915, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_14_ = i & 0x3;
			if (i_14_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_14_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method1672(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1668(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1661() {
		if (aClass125_8909 != null) {
			aClass125_8909.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		}
	}
}

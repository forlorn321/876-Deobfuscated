/* Class536_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class536_Sub12_Sub1 extends Class536_Sub12 {
	int anInt11468;
	static float aFloat11469 = 0.25F;
	static float aFloat11470 = 1.0F;
	static final String aString11471 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	static final int anInt11472 = 256;
	static final String aString11473 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	static final String aString11474 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
	static final String aString11475 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
	static float aFloat11476 = 1.0F;
	Class183_Sub2_Sub3 aClass183_Sub2_Sub3_11477;
	Class137 aClass137_11478;
	Class124_Sub1 aClass124_Sub1_11479;
	Class124_Sub1[] aClass124_Sub1Array11480;
	int anInt11481;
	int anInt11482;
	int anInt11483;
	Class137 aClass137_11484;
	Class137 aClass137_11485;
	Class137 aClass137_11486;
	Class183_Sub2_Sub3 aClass183_Sub2_Sub3_11487;
	Class124_Sub1 aClass124_Sub1_11488;

	boolean method10575() {
		return (aClass167_Sub2_10466.aBool9289 && aClass167_Sub2_10466.aBool9306 && aClass167_Sub2_10466.aBool9301);
	}

	boolean method9451() {
		return aClass183_Sub2_Sub3_11487 != null;
	}

	void method9449(int i, int i_0_) {
		anInt11481 = i;
		anInt11482 = i_0_;
		int i_1_ = Class72.method1124(anInt11481, 1917277084);
		int i_2_ = Class72.method1124(anInt11482, 1448234410);
		if (anInt11483 != i_1_ || anInt11468 != i_2_) {
			if (aClass124_Sub1Array11480 != null) {
				for (int i_3_ = 0; i_3_ < aClass124_Sub1Array11480.length; i_3_++)
					aClass124_Sub1Array11480[i_3_].method1613();
				aClass124_Sub1Array11480 = null;
			}
			if (i_1_ > 256 || i_2_ > 256) {
				int i_4_ = i_1_;
				int i_5_ = i_2_;
				int i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
					i_6_++;
				}
				if (aClass183_Sub2_Sub3_11477 == null)
					aClass183_Sub2_Sub3_11477 = new Class183_Sub2_Sub3(aClass167_Sub2_10466);
				aClass124_Sub1Array11480 = new Class124_Sub1[i_6_];
				i_4_ = i_1_;
				i_5_ = i_2_;
				i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					aClass124_Sub1Array11480[i_6_++] = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), i_4_, i_5_);
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
				}
			} else
				aClass183_Sub2_Sub3_11477 = null;
			anInt11483 = i_1_;
			anInt11468 = i_2_;
		}
	}

	Class536_Sub12_Sub1(Class167_Sub2 class167_sub2) {
		super(class167_sub2);
	}

	void method9432(int i, int i_7_) {
		anInt11481 = i;
		anInt11482 = i_7_;
		int i_8_ = Class72.method1124(anInt11481, 2086915576);
		int i_9_ = Class72.method1124(anInt11482, 900775600);
		if (anInt11483 != i_8_ || anInt11468 != i_9_) {
			if (aClass124_Sub1Array11480 != null) {
				for (int i_10_ = 0; i_10_ < aClass124_Sub1Array11480.length; i_10_++)
					aClass124_Sub1Array11480[i_10_].method1613();
				aClass124_Sub1Array11480 = null;
			}
			if (i_8_ > 256 || i_9_ > 256) {
				int i_11_ = i_8_;
				int i_12_ = i_9_;
				int i_13_ = 0;
				while (i_11_ > 256 || i_12_ > 256) {
					if (i_11_ > 256)
						i_11_ >>= 1;
					if (i_12_ > 256)
						i_12_ >>= 1;
					i_13_++;
				}
				if (aClass183_Sub2_Sub3_11477 == null)
					aClass183_Sub2_Sub3_11477 = new Class183_Sub2_Sub3(aClass167_Sub2_10466);
				aClass124_Sub1Array11480 = new Class124_Sub1[i_13_];
				i_11_ = i_8_;
				i_12_ = i_9_;
				i_13_ = 0;
				while (i_11_ > 256 || i_12_ > 256) {
					aClass124_Sub1Array11480[i_13_++] = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), i_11_, i_12_);
					if (i_11_ > 256)
						i_11_ >>= 1;
					if (i_12_ > 256)
						i_12_ >>= 1;
				}
			} else
				aClass183_Sub2_Sub3_11477 = null;
			anInt11483 = i_8_;
			anInt11468 = i_9_;
		}
	}

	void method9434() {
		anInt11468 = -1;
		anInt11483 = -1;
		aClass183_Sub2_Sub3_11477 = null;
		aClass124_Sub1Array11480 = null;
		aClass183_Sub2_Sub3_11487 = null;
		aClass124_Sub1_11488 = null;
		aClass124_Sub1_11479 = null;
		aClass137_11484 = null;
		aClass137_11478 = null;
		aClass137_11486 = null;
		aClass137_11485 = null;
	}

	void method9435(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_14_, int i_15_, int i_16_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass124_Sub1Array11480 != null) {
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11477, -409819235);
			int i_17_ = Class72.method1124(anInt11481, -102242504);
			int i_18_ = Class72.method1124(anInt11482, 1391034644);
			int i_19_ = 0;
			while (i_17_ > 256 || i_18_ > 256) {
				OpenGL.glViewport(0, 0, i_17_, i_18_);
				aClass183_Sub2_Sub3_11477.method9035(0, aClass124_Sub1Array11480[i_19_].method8398(0));
				if (i_19_ == 0) {
					aClass167_Sub2_10466.method8617(class124_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11482 - i_15_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_16_), (float) (anInt11482 - i_15_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_16_), (float) anInt11482);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_19_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_17_ > 256)
					i_17_ >>= 1;
				if (i_18_ > 256)
					i_18_ >>= 1;
				i_19_++;
			}
			aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11477, (byte) 1);
			aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_19_ - 1]);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_20_ = aClass137_11478.anInt1635;
			OpenGL.glUseProgram(i_20_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_20_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_20_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			aClass167_Sub2_10466.method8617(class124_sub1);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_21_ = aClass137_11484.anInt1635;
			OpenGL.glUseProgram(i_21_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_21_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_21_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11481, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11481, (float) anInt11482);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass183_Sub2_Sub3_11487.method10542(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		int i_22_ = aClass137_11485.anInt1635;
		OpenGL.glUseProgram(i_22_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_22_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_22_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		aClass183_Sub2_Sub3_11487.method10542(0);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11479);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_22_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
		int i_23_ = aClass137_11486.anInt1635;
		OpenGL.glUseProgram(i_23_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_23_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_23_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_23_, "params"), aFloat11469, aFloat11470, 0.0F);
		aClass167_Sub2_10466.method8556(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	void method9436(int i) {
		OpenGL.glUseProgram(0);
		aClass167_Sub2_10466.method8556(1);
		aClass167_Sub2_10466.method8617(null);
		aClass167_Sub2_10466.method8556(0);
	}

	Class171 method9437() {
		return Class171.aClass171_1902;
	}

	int method9438() {
		return 0;
	}

	boolean method9442() {
		return false;
	}

	boolean method9443() {
		return aClass183_Sub2_Sub3_11487 != null;
	}

	boolean method9444() {
		return aClass183_Sub2_Sub3_11487 != null;
	}

	boolean method9445() {
		if (aClass167_Sub2_10466.aBool9289 && aClass167_Sub2_10466.aBool9306 && aClass167_Sub2_10466.aBool9301) {
			aClass183_Sub2_Sub3_11487 = new Class183_Sub2_Sub3(aClass167_Sub2_10466);
			aClass124_Sub1_11488 = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), 256, 256);
			aClass124_Sub1_11488.method8394(false, false);
			aClass124_Sub1_11479 = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), 256, 256);
			aClass124_Sub1_11479.method8394(false, false);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method9035(0, aClass124_Sub1_11488.method8398(0));
			aClass183_Sub2_Sub3_11487.method9035(1, aClass124_Sub1_11479.method8398(0));
			aClass183_Sub2_Sub3_11487.method10542(0);
			if (!aClass183_Sub2_Sub3_11487.method9036()) {
				aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
				return false;
			}
			aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
			aClass137_11484 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass137_11478 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass137_11486 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass137_11485 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass137_11478 != null && aClass137_11484 != null && aClass137_11486 != null && aClass137_11485 != null);
		}
		return false;
	}

	int method9457() {
		return 0;
	}

	Class171 method9460() {
		return Class171.aClass171_1902;
	}

	void method9448(int i, int i_24_) {
		anInt11481 = i;
		anInt11482 = i_24_;
		int i_25_ = Class72.method1124(anInt11481, 1409772203);
		int i_26_ = Class72.method1124(anInt11482, 389276722);
		if (anInt11483 != i_25_ || anInt11468 != i_26_) {
			if (aClass124_Sub1Array11480 != null) {
				for (int i_27_ = 0; i_27_ < aClass124_Sub1Array11480.length; i_27_++)
					aClass124_Sub1Array11480[i_27_].method1613();
				aClass124_Sub1Array11480 = null;
			}
			if (i_25_ > 256 || i_26_ > 256) {
				int i_28_ = i_25_;
				int i_29_ = i_26_;
				int i_30_ = 0;
				while (i_28_ > 256 || i_29_ > 256) {
					if (i_28_ > 256)
						i_28_ >>= 1;
					if (i_29_ > 256)
						i_29_ >>= 1;
					i_30_++;
				}
				if (aClass183_Sub2_Sub3_11477 == null)
					aClass183_Sub2_Sub3_11477 = new Class183_Sub2_Sub3(aClass167_Sub2_10466);
				aClass124_Sub1Array11480 = new Class124_Sub1[i_30_];
				i_28_ = i_25_;
				i_29_ = i_26_;
				i_30_ = 0;
				while (i_28_ > 256 || i_29_ > 256) {
					aClass124_Sub1Array11480[i_30_++] = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), i_28_, i_29_);
					if (i_28_ > 256)
						i_28_ >>= 1;
					if (i_29_ > 256)
						i_29_ >>= 1;
				}
			} else
				aClass183_Sub2_Sub3_11477 = null;
			anInt11483 = i_25_;
			anInt11468 = i_26_;
		}
	}

	Class171 method9462() {
		return Class171.aClass171_1902;
	}

	void method9450(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_31_, int i_32_, int i_33_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass124_Sub1Array11480 != null) {
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11477, -409819235);
			int i_34_ = Class72.method1124(anInt11481, 146628669);
			int i_35_ = Class72.method1124(anInt11482, 772422901);
			int i_36_ = 0;
			while (i_34_ > 256 || i_35_ > 256) {
				OpenGL.glViewport(0, 0, i_34_, i_35_);
				aClass183_Sub2_Sub3_11477.method9035(0, aClass124_Sub1Array11480[i_36_].method8398(0));
				if (i_36_ == 0) {
					aClass167_Sub2_10466.method8617(class124_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11482 - i_32_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_33_), (float) (anInt11482 - i_32_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_33_), (float) anInt11482);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_36_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_34_ > 256)
					i_34_ >>= 1;
				if (i_35_ > 256)
					i_35_ >>= 1;
				i_36_++;
			}
			aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11477, (byte) 1);
			aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_36_ - 1]);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_37_ = aClass137_11478.anInt1635;
			OpenGL.glUseProgram(i_37_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_37_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			aClass167_Sub2_10466.method8617(class124_sub1);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_38_ = aClass137_11484.anInt1635;
			OpenGL.glUseProgram(i_38_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_38_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_38_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11481, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11481, (float) anInt11482);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass183_Sub2_Sub3_11487.method10542(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		int i_39_ = aClass137_11485.anInt1635;
		OpenGL.glUseProgram(i_39_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_39_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_39_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		aClass183_Sub2_Sub3_11487.method10542(0);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11479);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_39_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
		int i_40_ = aClass137_11486.anInt1635;
		OpenGL.glUseProgram(i_40_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_40_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_40_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_40_, "params"), aFloat11469, aFloat11470, 0.0F);
		aClass167_Sub2_10466.method8556(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	void method9431(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_41_, int i_42_, int i_43_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass124_Sub1Array11480 != null) {
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11477, -409819235);
			int i_44_ = Class72.method1124(anInt11481, 477737330);
			int i_45_ = Class72.method1124(anInt11482, 88058041);
			int i_46_ = 0;
			while (i_44_ > 256 || i_45_ > 256) {
				OpenGL.glViewport(0, 0, i_44_, i_45_);
				aClass183_Sub2_Sub3_11477.method9035(0, aClass124_Sub1Array11480[i_46_].method8398(0));
				if (i_46_ == 0) {
					aClass167_Sub2_10466.method8617(class124_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11482 - i_42_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_43_), (float) (anInt11482 - i_42_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_43_), (float) anInt11482);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_46_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_44_ > 256)
					i_44_ >>= 1;
				if (i_45_ > 256)
					i_45_ >>= 1;
				i_46_++;
			}
			aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11477, (byte) 1);
			aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_46_ - 1]);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_47_ = aClass137_11478.anInt1635;
			OpenGL.glUseProgram(i_47_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_47_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_47_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			aClass167_Sub2_10466.method8617(class124_sub1);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_48_ = aClass137_11484.anInt1635;
			OpenGL.glUseProgram(i_48_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_48_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_48_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11481, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11481, (float) anInt11482);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass183_Sub2_Sub3_11487.method10542(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		int i_49_ = aClass137_11485.anInt1635;
		OpenGL.glUseProgram(i_49_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_49_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_49_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		aClass183_Sub2_Sub3_11487.method10542(0);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11479);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_49_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
		int i_50_ = aClass137_11486.anInt1635;
		OpenGL.glUseProgram(i_50_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_50_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_50_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_50_, "params"), aFloat11469, aFloat11470, 0.0F);
		aClass167_Sub2_10466.method8556(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	boolean method9433() {
		if (aClass167_Sub2_10466.aBool9289 && aClass167_Sub2_10466.aBool9306 && aClass167_Sub2_10466.aBool9301) {
			aClass183_Sub2_Sub3_11487 = new Class183_Sub2_Sub3(aClass167_Sub2_10466);
			aClass124_Sub1_11488 = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), 256, 256);
			aClass124_Sub1_11488.method8394(false, false);
			aClass124_Sub1_11479 = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), 256, 256);
			aClass124_Sub1_11479.method8394(false, false);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method9035(0, aClass124_Sub1_11488.method8398(0));
			aClass183_Sub2_Sub3_11487.method9035(1, aClass124_Sub1_11479.method8398(0));
			aClass183_Sub2_Sub3_11487.method10542(0);
			if (!aClass183_Sub2_Sub3_11487.method9036()) {
				aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
				return false;
			}
			aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
			aClass137_11484 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass137_11478 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass137_11486 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass137_11485 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass137_11478 != null && aClass137_11484 != null && aClass137_11486 != null && aClass137_11485 != null);
		}
		return false;
	}

	void method9453(int i) {
		OpenGL.glUseProgram(0);
		aClass167_Sub2_10466.method8556(1);
		aClass167_Sub2_10466.method8617(null);
		aClass167_Sub2_10466.method8556(0);
	}

	void method9454(int i) {
		OpenGL.glUseProgram(0);
		aClass167_Sub2_10466.method8556(1);
		aClass167_Sub2_10466.method8617(null);
		aClass167_Sub2_10466.method8556(0);
	}

	Class171 method9456() {
		return Class171.aClass171_1902;
	}

	void method9447(int i, int i_51_) {
		anInt11481 = i;
		anInt11482 = i_51_;
		int i_52_ = Class72.method1124(anInt11481, 1421825934);
		int i_53_ = Class72.method1124(anInt11482, -340462883);
		if (anInt11483 != i_52_ || anInt11468 != i_53_) {
			if (aClass124_Sub1Array11480 != null) {
				for (int i_54_ = 0; i_54_ < aClass124_Sub1Array11480.length; i_54_++)
					aClass124_Sub1Array11480[i_54_].method1613();
				aClass124_Sub1Array11480 = null;
			}
			if (i_52_ > 256 || i_53_ > 256) {
				int i_55_ = i_52_;
				int i_56_ = i_53_;
				int i_57_ = 0;
				while (i_55_ > 256 || i_56_ > 256) {
					if (i_55_ > 256)
						i_55_ >>= 1;
					if (i_56_ > 256)
						i_56_ >>= 1;
					i_57_++;
				}
				if (aClass183_Sub2_Sub3_11477 == null)
					aClass183_Sub2_Sub3_11477 = new Class183_Sub2_Sub3(aClass167_Sub2_10466);
				aClass124_Sub1Array11480 = new Class124_Sub1[i_57_];
				i_55_ = i_52_;
				i_56_ = i_53_;
				i_57_ = 0;
				while (i_55_ > 256 || i_56_ > 256) {
					aClass124_Sub1Array11480[i_57_++] = new Class124_Sub1(aClass167_Sub2_10466, 3553, Class155.aClass155_1722, method9437(), i_55_, i_56_);
					if (i_55_ > 256)
						i_55_ >>= 1;
					if (i_56_ > 256)
						i_56_ >>= 1;
				}
			} else
				aClass183_Sub2_Sub3_11477 = null;
			anInt11483 = i_52_;
			anInt11468 = i_53_;
		}
	}

	void method9452(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_58_, int i_59_, int i_60_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass124_Sub1Array11480 != null) {
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11477, -409819235);
			int i_61_ = Class72.method1124(anInt11481, -19613850);
			int i_62_ = Class72.method1124(anInt11482, 2034432326);
			int i_63_ = 0;
			while (i_61_ > 256 || i_62_ > 256) {
				OpenGL.glViewport(0, 0, i_61_, i_62_);
				aClass183_Sub2_Sub3_11477.method9035(0, aClass124_Sub1Array11480[i_63_].method8398(0));
				if (i_63_ == 0) {
					aClass167_Sub2_10466.method8617(class124_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11482 - i_59_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_60_), (float) (anInt11482 - i_59_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_60_), (float) anInt11482);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_63_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_61_ > 256)
					i_61_ >>= 1;
				if (i_62_ > 256)
					i_62_ >>= 1;
				i_63_++;
			}
			aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11477, (byte) 1);
			aClass167_Sub2_10466.method8617(aClass124_Sub1Array11480[i_63_ - 1]);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_64_ = aClass137_11478.anInt1635;
			OpenGL.glUseProgram(i_64_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_64_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_64_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			aClass167_Sub2_10466.method8617(class124_sub1);
			aClass167_Sub2_10466.method2028(aClass183_Sub2_Sub3_11487, -409819235);
			aClass183_Sub2_Sub3_11487.method10542(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_65_ = aClass137_11484.anInt1635;
			OpenGL.glUseProgram(i_65_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_65_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_65_, "params"), aFloat11476, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11481, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11481, (float) anInt11482);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11482);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass183_Sub2_Sub3_11487.method10542(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		int i_66_ = aClass137_11485.anInt1635;
		OpenGL.glUseProgram(i_66_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_66_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_66_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		aClass183_Sub2_Sub3_11487.method10542(0);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11479);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_66_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		aClass167_Sub2_10466.method2029(aClass183_Sub2_Sub3_11487, (byte) 1);
		int i_67_ = aClass137_11486.anInt1635;
		OpenGL.glUseProgram(i_67_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_67_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_67_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_67_, "params"), aFloat11469, aFloat11470, 0.0F);
		aClass167_Sub2_10466.method8556(1);
		aClass167_Sub2_10466.method8617(aClass124_Sub1_11488);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	Class171 method9441() {
		return Class171.aClass171_1902;
	}

	boolean method9468() {
		return false;
	}

	boolean method9466() {
		return false;
	}

	int method9458() {
		return 0;
	}

	boolean method9467() {
		return false;
	}

	void method9446() {
		anInt11468 = -1;
		anInt11483 = -1;
		aClass183_Sub2_Sub3_11477 = null;
		aClass124_Sub1Array11480 = null;
		aClass183_Sub2_Sub3_11487 = null;
		aClass124_Sub1_11488 = null;
		aClass124_Sub1_11479 = null;
		aClass137_11484 = null;
		aClass137_11478 = null;
		aClass137_11486 = null;
		aClass137_11485 = null;
	}

	boolean method10576() {
		return (aClass167_Sub2_10466.aBool9289 && aClass167_Sub2_10466.aBool9306 && aClass167_Sub2_10466.aBool9301);
	}
}

/* Class527_Sub17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class527_Sub17_Sub2 extends Class527_Sub17 {
	Class125 aClass125_11445;
	static float aFloat11446 = 0.25F;
	static float aFloat11447 = 1.0F;
	static float aFloat11448 = 1.0F;
	static final String aString11449 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	Class125 aClass125_11450;
	static final String aString11451 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
	int anInt11452;
	Class171_Sub2_Sub2 aClass171_Sub2_Sub2_11453;
	Class171_Sub2_Sub2 aClass171_Sub2_Sub2_11454;
	Class118_Sub3 aClass118_Sub3_11455;
	Class118_Sub3 aClass118_Sub3_11456;
	Class118_Sub3[] aClass118_Sub3Array11457;
	Class125 aClass125_11458;
	static final int anInt11459 = 256;
	int anInt11460;
	int anInt11461;
	Class125 aClass125_11462;
	static final String aString11463 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	static final String aString11464 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
	int anInt11465;

	void method16181() {
		anInt11461 = -1;
		anInt11460 = -1;
		aClass171_Sub2_Sub2_11454 = null;
		aClass118_Sub3Array11457 = null;
		aClass171_Sub2_Sub2_11453 = null;
		aClass118_Sub3_11455 = null;
		aClass118_Sub3_11456 = null;
		aClass125_11450 = null;
		aClass125_11458 = null;
		aClass125_11445 = null;
		aClass125_11462 = null;
	}

	boolean method16165() {
		return false;
	}

	boolean method16183() {
		return aClass171_Sub2_Sub2_11453 != null;
	}

	boolean method16191() {
		if (aClass180_Sub3_10472.aBool9818 && aClass180_Sub3_10472.aBool9734 && aClass180_Sub3_10472.aBool9830) {
			aClass171_Sub2_Sub2_11453 = new Class171_Sub2_Sub2(aClass180_Sub3_10472);
			aClass118_Sub3_11455 = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), 256, 256);
			aClass118_Sub3_11455.method14450(false, false);
			aClass118_Sub3_11456 = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), 256, 256);
			aClass118_Sub3_11456.method14450(false, false);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -3);
			aClass171_Sub2_Sub2_11453.method15321(0, aClass118_Sub3_11455.method14459(0));
			aClass171_Sub2_Sub2_11453.method15321(1, aClass118_Sub3_11456.method14459(0));
			aClass171_Sub2_Sub2_11453.method17933(0);
			if (!aClass171_Sub2_Sub2_11453.method15322()) {
				aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
				return false;
			}
			aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
			aClass125_11450 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass125_11458 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass125_11445 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass125_11462 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass125_11458 != null && aClass125_11450 != null && aClass125_11445 != null && aClass125_11462 != null);
		}
		return false;
	}

	int method16172() {
		return 0;
	}

	void method16198() {
		anInt11461 = -1;
		anInt11460 = -1;
		aClass171_Sub2_Sub2_11454 = null;
		aClass118_Sub3Array11457 = null;
		aClass171_Sub2_Sub2_11453 = null;
		aClass118_Sub3_11455 = null;
		aClass118_Sub3_11456 = null;
		aClass125_11450 = null;
		aClass125_11458 = null;
		aClass125_11445 = null;
		aClass125_11462 = null;
	}

	void method16176(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_0_, int i_1_, int i_2_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass118_Sub3Array11457 != null) {
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11454, (byte) -14);
			int i_3_ = Class203.method3783(anInt11452, 1345673033);
			int i_4_ = Class203.method3783(anInt11465, 1224646532);
			int i_5_ = 0;
			while (i_3_ > 256 || i_4_ > 256) {
				OpenGL.glViewport(0, 0, i_3_, i_4_);
				aClass171_Sub2_Sub2_11454.method15321(0, aClass118_Sub3Array11457[i_5_].method14459(0));
				if (i_5_ == 0) {
					aClass180_Sub3_10472.method15401(class118_sub3);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11465 - i_1_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_2_), (float) (anInt11465 - i_1_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_2_), (float) anInt11465);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11465);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass180_Sub3_10472.method15401(aClass118_Sub3Array11457[i_5_ - 1]);
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
				if (i_3_ > 256)
					i_3_ >>= 1;
				if (i_4_ > 256)
					i_4_ >>= 1;
				i_5_++;
			}
			aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11454, -677418425);
			aClass180_Sub3_10472.method15401(aClass118_Sub3Array11457[i_5_ - 1]);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -47);
			aClass171_Sub2_Sub2_11453.method17933(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_6_ = aClass125_11458.anInt1517;
			OpenGL.glUseProgram(i_6_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_6_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_6_, "params"), aFloat11448, 0.0F, 0.0F);
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
			aClass180_Sub3_10472.method15401(class118_sub3);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -124);
			aClass171_Sub2_Sub2_11453.method17933(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_7_ = aClass125_11450.anInt1517;
			OpenGL.glUseProgram(i_7_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_7_, "params"), aFloat11448, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11452, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11452, (float) anInt11465);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11465);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass171_Sub2_Sub2_11453.method17933(1);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11455);
		int i_8_ = aClass125_11462.anInt1517;
		OpenGL.glUseProgram(i_8_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_8_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		aClass171_Sub2_Sub2_11453.method17933(0);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11456);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
		int i_9_ = aClass125_11445.anInt1517;
		OpenGL.glUseProgram(i_9_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_9_, "params"), aFloat11446, aFloat11447, 0.0F);
		aClass180_Sub3_10472.method15400(1);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11455);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(class118_sub3);
	}

	void method16170(int i) {
		OpenGL.glUseProgram(0);
		aClass180_Sub3_10472.method15400(1);
		aClass180_Sub3_10472.method15401(null);
		aClass180_Sub3_10472.method15400(0);
	}

	void method16182(int i, int i_10_) {
		anInt11452 = i;
		anInt11465 = i_10_;
		int i_11_ = Class203.method3783(anInt11452, 965442905);
		int i_12_ = Class203.method3783(anInt11465, 909694096);
		if (anInt11460 != i_11_ || anInt11461 != i_12_) {
			if (aClass118_Sub3Array11457 != null) {
				for (int i_13_ = 0; i_13_ < aClass118_Sub3Array11457.length; i_13_++)
					aClass118_Sub3Array11457[i_13_].method2064();
				aClass118_Sub3Array11457 = null;
			}
			if (i_11_ > 256 || i_12_ > 256) {
				int i_14_ = i_11_;
				int i_15_ = i_12_;
				int i_16_ = 0;
				while (i_14_ > 256 || i_15_ > 256) {
					if (i_14_ > 256)
						i_14_ >>= 1;
					if (i_15_ > 256)
						i_15_ >>= 1;
					i_16_++;
				}
				if (aClass171_Sub2_Sub2_11454 == null)
					aClass171_Sub2_Sub2_11454 = new Class171_Sub2_Sub2(aClass180_Sub3_10472);
				aClass118_Sub3Array11457 = new Class118_Sub3[i_16_];
				i_14_ = i_11_;
				i_15_ = i_12_;
				i_16_ = 0;
				while (i_14_ > 256 || i_15_ > 256) {
					aClass118_Sub3Array11457[i_16_++] = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), i_14_, i_15_);
					if (i_14_ > 256)
						i_14_ >>= 1;
					if (i_15_ > 256)
						i_15_ >>= 1;
				}
			} else
				aClass171_Sub2_Sub2_11454 = null;
			anInt11460 = i_11_;
			anInt11461 = i_12_;
		}
	}

	boolean method16189() {
		if (aClass180_Sub3_10472.aBool9818 && aClass180_Sub3_10472.aBool9734 && aClass180_Sub3_10472.aBool9830) {
			aClass171_Sub2_Sub2_11453 = new Class171_Sub2_Sub2(aClass180_Sub3_10472);
			aClass118_Sub3_11455 = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), 256, 256);
			aClass118_Sub3_11455.method14450(false, false);
			aClass118_Sub3_11456 = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), 256, 256);
			aClass118_Sub3_11456.method14450(false, false);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -86);
			aClass171_Sub2_Sub2_11453.method15321(0, aClass118_Sub3_11455.method14459(0));
			aClass171_Sub2_Sub2_11453.method15321(1, aClass118_Sub3_11456.method14459(0));
			aClass171_Sub2_Sub2_11453.method17933(0);
			if (!aClass171_Sub2_Sub2_11453.method15322()) {
				aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
				return false;
			}
			aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
			aClass125_11450 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass125_11458 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass125_11445 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass125_11462 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass125_11458 != null && aClass125_11450 != null && aClass125_11445 != null && aClass125_11462 != null);
		}
		return false;
	}

	void method16168(int i, int i_17_) {
		anInt11452 = i;
		anInt11465 = i_17_;
		int i_18_ = Class203.method3783(anInt11452, 950766994);
		int i_19_ = Class203.method3783(anInt11465, 1505123812);
		if (anInt11460 != i_18_ || anInt11461 != i_19_) {
			if (aClass118_Sub3Array11457 != null) {
				for (int i_20_ = 0; i_20_ < aClass118_Sub3Array11457.length; i_20_++)
					aClass118_Sub3Array11457[i_20_].method2064();
				aClass118_Sub3Array11457 = null;
			}
			if (i_18_ > 256 || i_19_ > 256) {
				int i_21_ = i_18_;
				int i_22_ = i_19_;
				int i_23_ = 0;
				while (i_21_ > 256 || i_22_ > 256) {
					if (i_21_ > 256)
						i_21_ >>= 1;
					if (i_22_ > 256)
						i_22_ >>= 1;
					i_23_++;
				}
				if (aClass171_Sub2_Sub2_11454 == null)
					aClass171_Sub2_Sub2_11454 = new Class171_Sub2_Sub2(aClass180_Sub3_10472);
				aClass118_Sub3Array11457 = new Class118_Sub3[i_23_];
				i_21_ = i_18_;
				i_22_ = i_19_;
				i_23_ = 0;
				while (i_21_ > 256 || i_22_ > 256) {
					aClass118_Sub3Array11457[i_23_++] = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), i_21_, i_22_);
					if (i_21_ > 256)
						i_21_ >>= 1;
					if (i_22_ > 256)
						i_22_ >>= 1;
				}
			} else
				aClass171_Sub2_Sub2_11454 = null;
			anInt11460 = i_18_;
			anInt11461 = i_19_;
		}
	}

	boolean method16177() {
		return aClass171_Sub2_Sub2_11453 != null;
	}

	boolean method17996() {
		return (aClass180_Sub3_10472.aBool9818 && aClass180_Sub3_10472.aBool9734 && aClass180_Sub3_10472.aBool9830);
	}

	Class527_Sub17_Sub2(Class180_Sub3 class180_sub3) {
		super(class180_sub3);
	}

	void method16180() {
		anInt11461 = -1;
		anInt11460 = -1;
		aClass171_Sub2_Sub2_11454 = null;
		aClass118_Sub3Array11457 = null;
		aClass171_Sub2_Sub2_11453 = null;
		aClass118_Sub3_11455 = null;
		aClass118_Sub3_11456 = null;
		aClass125_11450 = null;
		aClass125_11458 = null;
		aClass125_11445 = null;
		aClass125_11462 = null;
	}

	Class184 method16167() {
		return Class184.aClass184_2108;
	}

	void method16179(int i, int i_24_) {
		anInt11452 = i;
		anInt11465 = i_24_;
		int i_25_ = Class203.method3783(anInt11452, 1144735560);
		int i_26_ = Class203.method3783(anInt11465, 1024958267);
		if (anInt11460 != i_25_ || anInt11461 != i_26_) {
			if (aClass118_Sub3Array11457 != null) {
				for (int i_27_ = 0; i_27_ < aClass118_Sub3Array11457.length; i_27_++)
					aClass118_Sub3Array11457[i_27_].method2064();
				aClass118_Sub3Array11457 = null;
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
				if (aClass171_Sub2_Sub2_11454 == null)
					aClass171_Sub2_Sub2_11454 = new Class171_Sub2_Sub2(aClass180_Sub3_10472);
				aClass118_Sub3Array11457 = new Class118_Sub3[i_30_];
				i_28_ = i_25_;
				i_29_ = i_26_;
				i_30_ = 0;
				while (i_28_ > 256 || i_29_ > 256) {
					aClass118_Sub3Array11457[i_30_++] = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), i_28_, i_29_);
					if (i_28_ > 256)
						i_28_ >>= 1;
					if (i_29_ > 256)
						i_29_ >>= 1;
				}
			} else
				aClass171_Sub2_Sub2_11454 = null;
			anInt11460 = i_25_;
			anInt11461 = i_26_;
		}
	}

	boolean method16178() {
		if (aClass180_Sub3_10472.aBool9818 && aClass180_Sub3_10472.aBool9734 && aClass180_Sub3_10472.aBool9830) {
			aClass171_Sub2_Sub2_11453 = new Class171_Sub2_Sub2(aClass180_Sub3_10472);
			aClass118_Sub3_11455 = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), 256, 256);
			aClass118_Sub3_11455.method14450(false, false);
			aClass118_Sub3_11456 = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), 256, 256);
			aClass118_Sub3_11456.method14450(false, false);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -72);
			aClass171_Sub2_Sub2_11453.method15321(0, aClass118_Sub3_11455.method14459(0));
			aClass171_Sub2_Sub2_11453.method15321(1, aClass118_Sub3_11456.method14459(0));
			aClass171_Sub2_Sub2_11453.method17933(0);
			if (!aClass171_Sub2_Sub2_11453.method15322()) {
				aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
				return false;
			}
			aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
			aClass125_11450 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass125_11458 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass125_11445 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass125_11462 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass125_11458 != null && aClass125_11450 != null && aClass125_11445 != null && aClass125_11462 != null);
		}
		return false;
	}

	void method16184(int i, int i_31_) {
		anInt11452 = i;
		anInt11465 = i_31_;
		int i_32_ = Class203.method3783(anInt11452, 993708579);
		int i_33_ = Class203.method3783(anInt11465, 1533072777);
		if (anInt11460 != i_32_ || anInt11461 != i_33_) {
			if (aClass118_Sub3Array11457 != null) {
				for (int i_34_ = 0; i_34_ < aClass118_Sub3Array11457.length; i_34_++)
					aClass118_Sub3Array11457[i_34_].method2064();
				aClass118_Sub3Array11457 = null;
			}
			if (i_32_ > 256 || i_33_ > 256) {
				int i_35_ = i_32_;
				int i_36_ = i_33_;
				int i_37_ = 0;
				while (i_35_ > 256 || i_36_ > 256) {
					if (i_35_ > 256)
						i_35_ >>= 1;
					if (i_36_ > 256)
						i_36_ >>= 1;
					i_37_++;
				}
				if (aClass171_Sub2_Sub2_11454 == null)
					aClass171_Sub2_Sub2_11454 = new Class171_Sub2_Sub2(aClass180_Sub3_10472);
				aClass118_Sub3Array11457 = new Class118_Sub3[i_37_];
				i_35_ = i_32_;
				i_36_ = i_33_;
				i_37_ = 0;
				while (i_35_ > 256 || i_36_ > 256) {
					aClass118_Sub3Array11457[i_37_++] = new Class118_Sub3(aClass180_Sub3_10472, 3553, Class157.aClass157_1723, method16167(), i_35_, i_36_);
					if (i_35_ > 256)
						i_35_ >>= 1;
					if (i_36_ > 256)
						i_36_ >>= 1;
				}
			} else
				aClass171_Sub2_Sub2_11454 = null;
			anInt11460 = i_32_;
			anInt11461 = i_33_;
		}
	}

	void method16185(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_38_, int i_39_, int i_40_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass118_Sub3Array11457 != null) {
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11454, (byte) -22);
			int i_41_ = Class203.method3783(anInt11452, 943158650);
			int i_42_ = Class203.method3783(anInt11465, 1439827938);
			int i_43_ = 0;
			while (i_41_ > 256 || i_42_ > 256) {
				OpenGL.glViewport(0, 0, i_41_, i_42_);
				aClass171_Sub2_Sub2_11454.method15321(0, aClass118_Sub3Array11457[i_43_].method14459(0));
				if (i_43_ == 0) {
					aClass180_Sub3_10472.method15401(class118_sub3);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11465 - i_39_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_40_), (float) (anInt11465 - i_39_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_40_), (float) anInt11465);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11465);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass180_Sub3_10472.method15401(aClass118_Sub3Array11457[i_43_ - 1]);
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
				if (i_41_ > 256)
					i_41_ >>= 1;
				if (i_42_ > 256)
					i_42_ >>= 1;
				i_43_++;
			}
			aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11454, -677418425);
			aClass180_Sub3_10472.method15401(aClass118_Sub3Array11457[i_43_ - 1]);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -2);
			aClass171_Sub2_Sub2_11453.method17933(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_44_ = aClass125_11458.anInt1517;
			OpenGL.glUseProgram(i_44_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_44_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_44_, "params"), aFloat11448, 0.0F, 0.0F);
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
			aClass180_Sub3_10472.method15401(class118_sub3);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -39);
			aClass171_Sub2_Sub2_11453.method17933(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_45_ = aClass125_11450.anInt1517;
			OpenGL.glUseProgram(i_45_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_45_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_45_, "params"), aFloat11448, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11452, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11452, (float) anInt11465);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11465);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass171_Sub2_Sub2_11453.method17933(1);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11455);
		int i_46_ = aClass125_11462.anInt1517;
		OpenGL.glUseProgram(i_46_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_46_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_46_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		aClass171_Sub2_Sub2_11453.method17933(0);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11456);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_46_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
		int i_47_ = aClass125_11445.anInt1517;
		OpenGL.glUseProgram(i_47_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_47_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_47_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_47_, "params"), aFloat11446, aFloat11447, 0.0F);
		aClass180_Sub3_10472.method15400(1);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11455);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(class118_sub3);
	}

	void method16186(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_48_, int i_49_, int i_50_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass118_Sub3Array11457 != null) {
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11454, (byte) 0);
			int i_51_ = Class203.method3783(anInt11452, 1493834621);
			int i_52_ = Class203.method3783(anInt11465, 1409246888);
			int i_53_ = 0;
			while (i_51_ > 256 || i_52_ > 256) {
				OpenGL.glViewport(0, 0, i_51_, i_52_);
				aClass171_Sub2_Sub2_11454.method15321(0, aClass118_Sub3Array11457[i_53_].method14459(0));
				if (i_53_ == 0) {
					aClass180_Sub3_10472.method15401(class118_sub3);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11465 - i_49_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_50_), (float) (anInt11465 - i_49_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_50_), (float) anInt11465);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11465);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass180_Sub3_10472.method15401(aClass118_Sub3Array11457[i_53_ - 1]);
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
				if (i_51_ > 256)
					i_51_ >>= 1;
				if (i_52_ > 256)
					i_52_ >>= 1;
				i_53_++;
			}
			aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11454, -677418425);
			aClass180_Sub3_10472.method15401(aClass118_Sub3Array11457[i_53_ - 1]);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -86);
			aClass171_Sub2_Sub2_11453.method17933(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_54_ = aClass125_11458.anInt1517;
			OpenGL.glUseProgram(i_54_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_54_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_54_, "params"), aFloat11448, 0.0F, 0.0F);
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
			aClass180_Sub3_10472.method15401(class118_sub3);
			aClass180_Sub3_10472.method3106(aClass171_Sub2_Sub2_11453, (byte) -47);
			aClass171_Sub2_Sub2_11453.method17933(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_55_ = aClass125_11450.anInt1517;
			OpenGL.glUseProgram(i_55_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_55_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_55_, "params"), aFloat11448, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11452, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11452, (float) anInt11465);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11465);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass171_Sub2_Sub2_11453.method17933(1);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11455);
		int i_56_ = aClass125_11462.anInt1517;
		OpenGL.glUseProgram(i_56_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_56_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_56_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		aClass171_Sub2_Sub2_11453.method17933(0);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11456);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_56_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		aClass180_Sub3_10472.method3107(aClass171_Sub2_Sub2_11453, -677418425);
		int i_57_ = aClass125_11445.anInt1517;
		OpenGL.glUseProgram(i_57_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_57_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_57_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_57_, "params"), aFloat11446, aFloat11447, 0.0F);
		aClass180_Sub3_10472.method15400(1);
		aClass180_Sub3_10472.method15401(aClass118_Sub3_11455);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(class118_sub3);
	}

	void method16187(int i) {
		OpenGL.glUseProgram(0);
		aClass180_Sub3_10472.method15400(1);
		aClass180_Sub3_10472.method15401(null);
		aClass180_Sub3_10472.method15400(0);
	}

	int method16169() {
		return 0;
	}

	Class184 method16174() {
		return Class184.aClass184_2108;
	}

	Class184 method16196() {
		return Class184.aClass184_2108;
	}

	boolean method16195() {
		return false;
	}

	boolean method16199() {
		return false;
	}

	boolean method17997() {
		return (aClass180_Sub3_10472.aBool9818 && aClass180_Sub3_10472.aBool9734 && aClass180_Sub3_10472.aBool9830);
	}

	boolean method17998() {
		return (aClass180_Sub3_10472.aBool9818 && aClass180_Sub3_10472.aBool9734 && aClass180_Sub3_10472.aBool9830);
	}
}

/* Class536_Sub12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class536_Sub12_Sub2 extends Class536_Sub12 {
	static final String aString11495 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
	static float aFloat11496 = 1.0F;
	static float aFloat11497;
	static float aFloat11498;
	static float aFloat11499 = 0.0F;
	static float aFloat11500;
	Class137 aClass137_11501;

	Class536_Sub12_Sub2(Class167_Sub2 class167_sub2) {
		super(class167_sub2);
	}

	void method9450(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_0_, int i_1_, int i_2_) {
		int i_3_ = aClass137_11501.anInt1635;
		OpenGL.glUseProgram(i_3_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3_, "paramsGamma"), aFloat11496);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3_, "paramsRanges"), aFloat11499, aFloat11497, aFloat11498, aFloat11500);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	boolean method10588() {
		return aClass167_Sub2_10466.aBool9306;
	}

	static {
		aFloat11497 = 1.0F;
		aFloat11498 = 0.0F;
		aFloat11500 = 1.0F;
	}

	void method9432(int i, int i_4_) {
		/* empty */
	}

	void method9434() {
		aClass137_11501 = null;
	}

	void method9435(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_5_, int i_6_, int i_7_) {
		int i_8_ = aClass137_11501.anInt1635;
		OpenGL.glUseProgram(i_8_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_8_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "paramsGamma"), aFloat11496);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_8_, "paramsRanges"), aFloat11499, aFloat11497, aFloat11498, aFloat11500);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	void method9436(int i) {
		OpenGL.glUseProgram(0);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(null);
	}

	boolean method9451() {
		return aClass137_11501 != null;
	}

	boolean method9443() {
		return aClass137_11501 != null;
	}

	boolean method9442() {
		return (aFloat11496 == 1.0F && aFloat11499 == 0.0F && aFloat11497 == 1.0F && aFloat11498 == 0.0F && aFloat11500 == 1.0F);
	}

	void method9449(int i, int i_9_) {
		/* empty */
	}

	void method9431(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_10_, int i_11_, int i_12_) {
		int i_13_ = aClass137_11501.anInt1635;
		OpenGL.glUseProgram(i_13_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_13_, "paramsGamma"), aFloat11496);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_13_, "paramsRanges"), aFloat11499, aFloat11497, aFloat11498, aFloat11500);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	boolean method9444() {
		return aClass137_11501 != null;
	}

	boolean method9445() {
		if (aClass167_Sub2_10466.aBool9306) {
			aClass137_11501 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass137_11501 != null;
		}
		return false;
	}

	Class171 method9437() {
		return Class171.aClass171_1905;
	}

	void method9447(int i, int i_14_) {
		/* empty */
	}

	void method9448(int i, int i_15_) {
		/* empty */
	}

	boolean method9466() {
		return (aFloat11496 == 1.0F && aFloat11499 == 0.0F && aFloat11497 == 1.0F && aFloat11498 == 0.0F && aFloat11500 == 1.0F);
	}

	void method9446() {
		aClass137_11501 = null;
	}

	int method9438() {
		return 1;
	}

	void method9452(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_16_, int i_17_, int i_18_) {
		int i_19_ = aClass137_11501.anInt1635;
		OpenGL.glUseProgram(i_19_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_19_, "paramsGamma"), aFloat11496);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_19_, "paramsRanges"), aFloat11499, aFloat11497, aFloat11498, aFloat11500);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(class124_sub1);
	}

	void method9453(int i) {
		OpenGL.glUseProgram(0);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(null);
	}

	void method9454(int i) {
		OpenGL.glUseProgram(0);
		aClass167_Sub2_10466.method8556(0);
		aClass167_Sub2_10466.method8617(null);
	}

	int method9457() {
		return 1;
	}

	int method9458() {
		return 1;
	}

	Class171 method9460() {
		return Class171.aClass171_1905;
	}

	Class171 method9441() {
		return Class171.aClass171_1905;
	}

	Class171 method9462() {
		return Class171.aClass171_1905;
	}

	Class171 method9456() {
		return Class171.aClass171_1905;
	}

	boolean method9433() {
		if (aClass167_Sub2_10466.aBool9306) {
			aClass137_11501 = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass137_11501 != null;
		}
		return false;
	}

	boolean method9467() {
		return (aFloat11496 == 1.0F && aFloat11499 == 0.0F && aFloat11497 == 1.0F && aFloat11498 == 0.0F && aFloat11500 == 1.0F);
	}

	boolean method9468() {
		return (aFloat11496 == 1.0F && aFloat11499 == 0.0F && aFloat11497 == 1.0F && aFloat11498 == 0.0F && aFloat11500 == 1.0F);
	}

	boolean method10589() {
		return aClass167_Sub2_10466.aBool9306;
	}

	boolean method10590() {
		return aClass167_Sub2_10466.aBool9306;
	}
}

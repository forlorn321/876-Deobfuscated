/* Class527_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class527_Sub17_Sub1 extends Class527_Sub17 {
	static float aFloat11438;
	static float aFloat11439;
	static float aFloat11440;
	static float aFloat11441 = 1.0F;
	static float aFloat11442;
	static final String aString11443 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
	Class125 aClass125_11444;

	boolean method16165() {
		return (aFloat11441 == 1.0F && aFloat11439 == 0.0F && aFloat11442 == 1.0F && aFloat11440 == 0.0F && aFloat11438 == 1.0F);
	}

	boolean method17994() {
		return aClass180_Sub3_10472.aBool9734;
	}

	boolean method16183() {
		return aClass125_11444 != null;
	}

	Class184 method16174() {
		return Class184.aClass184_2104;
	}

	void method16198() {
		aClass125_11444 = null;
	}

	void method16168(int i, int i_0_) {
		/* empty */
	}

	boolean method16191() {
		if (aClass180_Sub3_10472.aBool9734) {
			aClass125_11444 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass125_11444 != null;
		}
		return false;
	}

	void method16170(int i) {
		OpenGL.glUseProgram(0);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(null);
	}

	Class184 method16167() {
		return Class184.aClass184_2104;
	}

	int method16172() {
		return 1;
	}

	void method16176(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_1_, int i_2_, int i_3_) {
		int i_4_ = aClass125_11444.anInt1517;
		OpenGL.glUseProgram(i_4_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "paramsGamma"), aFloat11441);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4_, "paramsRanges"), aFloat11439, aFloat11442, aFloat11440, aFloat11438);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(class118_sub3);
	}

	static {
		aFloat11439 = 0.0F;
		aFloat11442 = 1.0F;
		aFloat11440 = 0.0F;
		aFloat11438 = 1.0F;
	}

	boolean method16199() {
		return (aFloat11441 == 1.0F && aFloat11439 == 0.0F && aFloat11442 == 1.0F && aFloat11440 == 0.0F && aFloat11438 == 1.0F);
	}

	boolean method16178() {
		if (aClass180_Sub3_10472.aBool9734) {
			aClass125_11444 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass125_11444 != null;
		}
		return false;
	}

	boolean method16189() {
		if (aClass180_Sub3_10472.aBool9734) {
			aClass125_11444 = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass125_11444 != null;
		}
		return false;
	}

	void method16180() {
		aClass125_11444 = null;
	}

	void method16181() {
		aClass125_11444 = null;
	}

	void method16179(int i, int i_5_) {
		/* empty */
	}

	boolean method17995() {
		return aClass180_Sub3_10472.aBool9734;
	}

	void method16184(int i, int i_6_) {
		/* empty */
	}

	void method16185(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_7_, int i_8_, int i_9_) {
		int i_10_ = aClass125_11444.anInt1517;
		OpenGL.glUseProgram(i_10_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "paramsGamma"), aFloat11441);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_10_, "paramsRanges"), aFloat11439, aFloat11442, aFloat11440, aFloat11438);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(class118_sub3);
	}

	void method16186(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_11_, int i_12_, int i_13_) {
		int i_14_ = aClass125_11444.anInt1517;
		OpenGL.glUseProgram(i_14_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "paramsGamma"), aFloat11441);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_14_, "paramsRanges"), aFloat11439, aFloat11442, aFloat11440, aFloat11438);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(class118_sub3);
	}

	void method16182(int i, int i_15_) {
		/* empty */
	}

	int method16169() {
		return 1;
	}

	boolean method16177() {
		return aClass125_11444 != null;
	}

	Class184 method16196() {
		return Class184.aClass184_2104;
	}

	boolean method16195() {
		return (aFloat11441 == 1.0F && aFloat11439 == 0.0F && aFloat11442 == 1.0F && aFloat11440 == 0.0F && aFloat11438 == 1.0F);
	}

	void method16187(int i) {
		OpenGL.glUseProgram(0);
		aClass180_Sub3_10472.method15400(0);
		aClass180_Sub3_10472.method15401(null);
	}

	Class527_Sub17_Sub1(Class180_Sub3 class180_sub3) {
		super(class180_sub3);
	}
}

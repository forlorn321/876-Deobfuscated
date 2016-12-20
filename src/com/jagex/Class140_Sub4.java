/* Class140_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class140_Sub4 extends Class140 {
	boolean aBool8939;
	static final String aString8940 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	Class125 aClass125_8941;
	boolean aBool8942 = false;
	static final String aString8943 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	Class136 aClass136_8944;

	void method2334(int i, int i_0_) {
		if (aBool8942) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			int i_4_ = aClass125_8941.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"), (float) (i_1_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterOffset"), f_3_);
		}
	}

	boolean method2319() {
		return aBool8939;
	}

	void method2324(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8939 && class118_sub2 != null) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8944.aClass118_Sub4_1575);
			int i = aClass125_8941.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795, aClass180_Sub3_1647.aFloat9777, aClass180_Sub3_1647.aFloat9778, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8942 = true;
		}
	}

	void method2322() {
		if (aBool8942) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(null);
			OpenGL.glUseProgram(0);
			aBool8942 = false;
		}
	}

	void method2340(boolean bool) {
		/* empty */
	}

	void method2338() {
		if (aBool8942) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(null);
			OpenGL.glUseProgram(0);
			aBool8942 = false;
		}
	}

	void method2335(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8939 && class118_sub2 != null) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8944.aClass118_Sub4_1575);
			int i = aClass125_8941.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795, aClass180_Sub3_1647.aFloat9777, aClass180_Sub3_1647.aFloat9778, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8942 = true;
		}
	}

	boolean method2325() {
		return aBool8939;
	}

	boolean method2321() {
		return aBool8939;
	}

	void method2326(boolean bool) {
		/* empty */
	}

	Class140_Sub4(Class180_Sub3 class180_sub3, Class136 class136) {
		super(class180_sub3);
		aBool8939 = false;
		aClass136_8944 = class136;
		if (aClass136_8944.aClass118_Sub4_1575 != null && aClass180_Sub3_1647.aBool9833 && aClass180_Sub3_1647.aBool9734) {
			Class135 class135 = (Class135.method2299(aClass180_Sub3_1647, 35633,
					"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class135 class135_5_ = (Class135.method2299(aClass180_Sub3_1647, 35632,
					"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			aClass125_8941 = Class125.method2160(aClass180_Sub3_1647, new Class135[] { class135, class135_5_ });
			aBool8939 = aClass125_8941 != null;
		}
	}

	void method2328(boolean bool) {
		/* empty */
	}

	void method2329(boolean bool) {
		/* empty */
	}

	void method2330(int i, int i_6_) {
		if (aBool8942) {
			int i_7_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_8_ = i_6_ & 0xffff;
			float f_9_ = (float) (i_6_ >> 16 & 0x3) / 8.0F;
			int i_10_ = aClass125_8941.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "time"), (float) (i_7_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "breakWaterDepth"), (float) i_8_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "breakWaterOffset"), f_9_);
		}
	}

	void method2318(int i, int i_11_) {
		if (aBool8942) {
			int i_12_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_13_ = i_11_ & 0xffff;
			float f_14_ = (float) (i_11_ >> 16 & 0x3) / 8.0F;
			int i_15_ = aClass125_8941.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"), (float) (i_12_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterDepth"), (float) i_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterOffset"), f_14_);
		}
	}

	void method2332(int i, int i_16_) {
		if (aBool8942) {
			int i_17_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_18_ = i_16_ & 0xffff;
			float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
			int i_20_ = aClass125_8941.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "time"), (float) (i_17_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "breakWaterDepth"), (float) i_18_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "breakWaterOffset"), f_19_);
		}
	}

	void method2333(int i, int i_21_) {
		if (aBool8942) {
			int i_22_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_23_ = i_21_ & 0xffff;
			float f_24_ = (float) (i_21_ >> 16 & 0x3) / 8.0F;
			int i_25_ = aClass125_8941.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "time"), (float) (i_22_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "breakWaterDepth"), (float) i_23_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "breakWaterOffset"), f_24_);
		}
	}

	void method2341(boolean bool) {
		/* empty */
	}

	void method2336(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8939 && class118_sub2 != null) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8944.aClass118_Sub4_1575);
			int i = aClass125_8941.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795, aClass180_Sub3_1647.aFloat9777, aClass180_Sub3_1647.aFloat9778, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8942 = true;
		}
	}

	void method2320(Class118 class118, int i) {
		if (!aBool8942) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2337(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8939 && class118_sub2 != null) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8944.aClass118_Sub4_1575);
			int i = aClass125_8941.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795, aClass180_Sub3_1647.aFloat9777, aClass180_Sub3_1647.aFloat9778, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8942 = true;
		}
	}

	void method2323(int i, int i_26_) {
		if (aBool8942) {
			int i_27_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_28_ = i_26_ & 0xffff;
			float f_29_ = (float) (i_26_ >> 16 & 0x3) / 8.0F;
			int i_30_ = aClass125_8941.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "time"), (float) (i_27_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "breakWaterDepth"), (float) i_28_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "breakWaterOffset"), f_29_);
		}
	}

	void method2339(Class118 class118, int i) {
		if (!aBool8942) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2327(Class118 class118, int i) {
		if (!aBool8942) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2331(Class118 class118, int i) {
		if (!aBool8942) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}
}

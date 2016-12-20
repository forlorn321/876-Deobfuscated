/* Class140_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class140_Sub2 extends Class140 {
	boolean aBool8912;
	static final String aString8913 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	Class125 aClass125_8914;
	Class136 aClass136_8915;
	static final String aString8916 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	boolean aBool8917 = false;

	void method2339(Class118 class118, int i) {
		if (!aBool8917) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2341(boolean bool) {
		/* empty */
	}

	Class140_Sub2(Class180_Sub3 class180_sub3, Class136 class136) {
		super(class180_sub3);
		aBool8912 = false;
		aClass136_8915 = class136;
		if (aClass136_8915.aClass118_Sub4_1575 != null && aClass180_Sub3_1647.aBool9833 && aClass180_Sub3_1647.aBool9734) {
			Class135 class135 = (Class135.method2299(aClass180_Sub3_1647, 35633,
					"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class135 class135_0_ = (Class135.method2299(aClass180_Sub3_1647, 35632,
					"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			aClass125_8914 = Class125.method2160(aClass180_Sub3_1647, new Class135[] { class135, class135_0_ });
			aBool8912 = aClass125_8914 != null;
		}
	}

	void method2336(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8912 && class118_sub2 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass180_Sub3_1647.aFloatArray9773[1])) * 2.0F;
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8915.aClass118_Sub4_1575);
			int i = aClass125_8914.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795 * f, aClass180_Sub3_1647.aFloat9777 * f, aClass180_Sub3_1647.aFloat9778 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8917 = true;
		}
	}

	void method2322() {
		if (aBool8917) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(null);
			OpenGL.glUseProgram(0);
			aBool8917 = false;
		}
	}

	void method2323(int i, int i_1_) {
		if (aBool8917) {
			int i_2_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_3_ = i_1_ & 0xffff;
			float f_4_ = (float) (i_1_ >> 16 & 0x3) / 8.0F;
			float f_5_ = (float) (i_1_ >> 19 & 0xf) / 16.0F;
			float f_6_ = (float) (i_1_ >> 23 & 0xf) / 16.0F;
			int i_7_ = i_1_ >> 27 & 0xf;
			int i_8_ = aClass125_8914.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "time"), (float) (i_2_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "breakWaterDepth"), (float) i_3_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "breakWaterOffset"), f_4_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_8_, "waveIntensity"), f_6_, f_5_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "waveExponent"), (float) i_7_);
		}
	}

	void method2324(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8912 && class118_sub2 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass180_Sub3_1647.aFloatArray9773[1])) * 2.0F;
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8915.aClass118_Sub4_1575);
			int i = aClass125_8914.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795 * f, aClass180_Sub3_1647.aFloat9777 * f, aClass180_Sub3_1647.aFloat9778 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8917 = true;
		}
	}

	void method2320(Class118 class118, int i) {
		if (!aBool8917) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	boolean method2321() {
		return aBool8912;
	}

	void method2326(boolean bool) {
		/* empty */
	}

	boolean method2325() {
		return aBool8912;
	}

	void method2328(boolean bool) {
		/* empty */
	}

	void method2329(boolean bool) {
		/* empty */
	}

	void method2330(int i, int i_9_) {
		if (aBool8917) {
			int i_10_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_11_ = i_9_ & 0xffff;
			float f_12_ = (float) (i_9_ >> 16 & 0x3) / 8.0F;
			float f_13_ = (float) (i_9_ >> 19 & 0xf) / 16.0F;
			float f_14_ = (float) (i_9_ >> 23 & 0xf) / 16.0F;
			int i_15_ = i_9_ >> 27 & 0xf;
			int i_16_ = aClass125_8914.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "time"), (float) (i_10_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterDepth"), (float) i_11_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterOffset"), f_12_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_16_, "waveIntensity"), f_14_, f_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "waveExponent"), (float) i_15_);
		}
	}

	void method2318(int i, int i_17_) {
		if (aBool8917) {
			int i_18_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_19_ = i_17_ & 0xffff;
			float f_20_ = (float) (i_17_ >> 16 & 0x3) / 8.0F;
			float f_21_ = (float) (i_17_ >> 19 & 0xf) / 16.0F;
			float f_22_ = (float) (i_17_ >> 23 & 0xf) / 16.0F;
			int i_23_ = i_17_ >> 27 & 0xf;
			int i_24_ = aClass125_8914.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "time"), (float) (i_18_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterDepth"), (float) i_19_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterOffset"), f_20_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_24_, "waveIntensity"), f_22_, f_21_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "waveExponent"), (float) i_23_);
		}
	}

	void method2338() {
		if (aBool8917) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(null);
			OpenGL.glUseProgram(0);
			aBool8917 = false;
		}
	}

	void method2333(int i, int i_25_) {
		if (aBool8917) {
			int i_26_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_27_ = i_25_ & 0xffff;
			float f_28_ = (float) (i_25_ >> 16 & 0x3) / 8.0F;
			float f_29_ = (float) (i_25_ >> 19 & 0xf) / 16.0F;
			float f_30_ = (float) (i_25_ >> 23 & 0xf) / 16.0F;
			int i_31_ = i_25_ >> 27 & 0xf;
			int i_32_ = aClass125_8914.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "time"), (float) (i_26_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "breakWaterDepth"), (float) i_27_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "breakWaterOffset"), f_28_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_32_, "waveIntensity"), f_30_, f_29_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "waveExponent"), (float) i_31_);
		}
	}

	void method2334(int i, int i_33_) {
		if (aBool8917) {
			int i_34_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_35_ = i_33_ & 0xffff;
			float f_36_ = (float) (i_33_ >> 16 & 0x3) / 8.0F;
			float f_37_ = (float) (i_33_ >> 19 & 0xf) / 16.0F;
			float f_38_ = (float) (i_33_ >> 23 & 0xf) / 16.0F;
			int i_39_ = i_33_ >> 27 & 0xf;
			int i_40_ = aClass125_8914.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "time"), (float) (i_34_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "breakWaterDepth"), (float) i_35_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "breakWaterOffset"), f_36_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_40_, "waveIntensity"), f_38_, f_37_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "waveExponent"), (float) i_39_);
		}
	}

	void method2335(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8912 && class118_sub2 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass180_Sub3_1647.aFloatArray9773[1])) * 2.0F;
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8915.aClass118_Sub4_1575);
			int i = aClass125_8914.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795 * f, aClass180_Sub3_1647.aFloat9777 * f, aClass180_Sub3_1647.aFloat9778 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8917 = true;
		}
	}

	void method2332(int i, int i_41_) {
		if (aBool8917) {
			int i_42_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_43_ = i_41_ & 0xffff;
			float f_44_ = (float) (i_41_ >> 16 & 0x3) / 8.0F;
			float f_45_ = (float) (i_41_ >> 19 & 0xf) / 16.0F;
			float f_46_ = (float) (i_41_ >> 23 & 0xf) / 16.0F;
			int i_47_ = i_41_ >> 27 & 0xf;
			int i_48_ = aClass125_8914.anInt1517;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "time"), (float) (i_42_ * aClass180_Sub3_1647.anInt9705 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "breakWaterDepth"), (float) i_43_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "breakWaterOffset"), f_44_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_48_, "waveIntensity"), f_46_, f_45_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "waveExponent"), (float) i_47_);
		}
	}

	void method2337(boolean bool) {
		Class118_Sub2 class118_sub2 = aClass180_Sub3_1647.method15382();
		if (aBool8912 && class118_sub2 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass180_Sub3_1647.aFloatArray9773[1])) * 2.0F;
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(class118_sub2);
			aClass180_Sub3_1647.method15400(0);
			aClass180_Sub3_1647.method15401(aClass136_8915.aClass118_Sub4_1575);
			int i = aClass125_8914.anInt1517;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass180_Sub3_1647.aFloatArray9773[0], -aClass180_Sub3_1647.aFloatArray9773[1], -aClass180_Sub3_1647.aFloatArray9773[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass180_Sub3_1647.aFloat9795 * f, aClass180_Sub3_1647.aFloat9777 * f, aClass180_Sub3_1647.aFloat9778 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass180_Sub3_1647.aFloatArray9773[1]) * 928.0F);
			aBool8917 = true;
		}
	}

	boolean method2319() {
		return aBool8912;
	}

	void method2340(boolean bool) {
		/* empty */
	}

	void method2327(Class118 class118, int i) {
		if (!aBool8917) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}

	void method2331(Class118 class118, int i) {
		if (!aBool8917) {
			aClass180_Sub3_1647.method15401(class118);
			aClass180_Sub3_1647.method15402(i);
		}
	}
}

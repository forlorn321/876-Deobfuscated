/* Class128_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub5 extends Class128 {
	static final String aString8916 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	static final String aString8917 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	Class137 aClass137_8918;
	boolean aBool8919 = false;
	Class131 aClass131_8920;
	boolean aBool8921 = false;

	void method1661() {
		if (aBool8919) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8919 = false;
		}
	}

	boolean method1652() {
		return aBool8921;
	}

	void method1653(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8921 && class124_sub4 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass167_Sub2_1567.aFloatArray9181[1])) * 2.0F;
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8920.aClass124_Sub2_1592);
			int i = aClass137_8918.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247 * f, aClass167_Sub2_1567.aFloat9248 * f, aClass167_Sub2_1567.aFloat9249 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8919 = true;
		}
	}

	void method1672(Class124 class124, int i) {
		if (!aBool8919) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method1654() {
		if (aBool8919) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8919 = false;
		}
	}

	void method1656(int i, int i_0_) {
		if (aBool8919) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			float f_4_ = (float) (i_0_ >> 19 & 0xf) / 16.0F;
			float f_5_ = (float) (i_0_ >> 23 & 0xf) / 16.0F;
			int i_6_ = i_0_ >> 27 & 0xf;
			int i_7_ = aClass137_8918.anInt1635;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "time"), (float) (i_1_ * aClass167_Sub2_1567.anInt9176 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterOffset"), f_3_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_7_, "waveIntensity"), f_5_, f_4_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "waveExponent"), (float) i_6_);
		}
	}

	void method1674(Class124 class124, int i) {
		if (!aBool8919) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	boolean method1659() {
		return aBool8921;
	}

	boolean method1658() {
		return aBool8921;
	}

	void method1673(boolean bool) {
		/* empty */
	}

	void method1664(boolean bool) {
		/* empty */
	}

	void method1660(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8921 && class124_sub4 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass167_Sub2_1567.aFloatArray9181[1])) * 2.0F;
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8920.aClass124_Sub2_1592);
			int i = aClass137_8918.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247 * f, aClass167_Sub2_1567.aFloat9248 * f, aClass167_Sub2_1567.aFloat9249 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8919 = true;
		}
	}

	void method1662(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8921 && class124_sub4 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass167_Sub2_1567.aFloatArray9181[1])) * 2.0F;
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8920.aClass124_Sub2_1592);
			int i = aClass137_8918.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247 * f, aClass167_Sub2_1567.aFloat9248 * f, aClass167_Sub2_1567.aFloat9249 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8919 = true;
		}
	}

	void method1655(boolean bool) {
		/* empty */
	}

	void method1669() {
		if (aBool8919) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8919 = false;
		}
	}

	void method1665(boolean bool) {
		/* empty */
	}

	boolean method1657() {
		return aBool8921;
	}

	void method1668(Class124 class124, int i) {
		if (!aBool8919) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method1651() {
		if (aBool8919) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8919 = false;
		}
	}

	Class128_Sub5(Class167_Sub2 class167_sub2, Class131 class131) {
		super(class167_sub2);
		aClass131_8920 = class131;
		if (aClass131_8920.aClass124_Sub2_1592 != null && aClass167_Sub2_1567.aBool9152 && aClass167_Sub2_1567.aBool9306) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1567, 35633,
					"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class119 class119_8_ = (Class119.method1600(aClass167_Sub2_1567, 35632,
					"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			aClass137_8918 = Class137.method1686(aClass167_Sub2_1567, new Class119[] { class119, class119_8_ });
			aBool8921 = aClass137_8918 != null;
		}
	}

	void method1670() {
		if (aBool8919) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8919 = false;
		}
	}

	void method1671(int i, int i_9_) {
		if (aBool8919) {
			int i_10_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_11_ = i_9_ & 0xffff;
			float f_12_ = (float) (i_9_ >> 16 & 0x3) / 8.0F;
			float f_13_ = (float) (i_9_ >> 19 & 0xf) / 16.0F;
			float f_14_ = (float) (i_9_ >> 23 & 0xf) / 16.0F;
			int i_15_ = i_9_ >> 27 & 0xf;
			int i_16_ = aClass137_8918.anInt1635;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "time"), (float) (i_10_ * aClass167_Sub2_1567.anInt9176 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterDepth"), (float) i_11_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterOffset"), f_12_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_16_, "waveIntensity"), f_14_, f_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "waveExponent"), (float) i_15_);
		}
	}

	void method1666(boolean bool) {
		/* empty */
	}

	void method1667(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8921 && class124_sub4 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass167_Sub2_1567.aFloatArray9181[1])) * 2.0F;
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8920.aClass124_Sub2_1592);
			int i = aClass137_8918.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247 * f, aClass167_Sub2_1567.aFloat9248 * f, aClass167_Sub2_1567.aFloat9249 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8919 = true;
		}
	}

	void method1663(Class124 class124, int i) {
		if (!aBool8919) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}
}

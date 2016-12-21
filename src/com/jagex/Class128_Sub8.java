/* Class128_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub8 extends Class128 {
	boolean aBool8980 = false;
	static final String aString8981 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	Class137 aClass137_8982;
	boolean aBool8983 = false;
	static final String aString8984 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	Class131 aClass131_8985;

	void method1656(int i, int i_0_) {
		if (aBool8980) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			int i_4_ = aClass137_8982.anInt1635;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"), (float) (i_1_ * aClass167_Sub2_1567.anInt9176 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterOffset"), f_3_);
		}
	}

	boolean method1652() {
		return aBool8983;
	}

	void method1653(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8983 && class124_sub4 != null) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8985.aClass124_Sub2_1592);
			int i = aClass137_8982.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247, aClass167_Sub2_1567.aFloat9248, aClass167_Sub2_1567.aFloat9249, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8980 = true;
		}
	}

	boolean method1658() {
		return aBool8983;
	}

	void method1673(boolean bool) {
		/* empty */
	}

	void method1671(int i, int i_5_) {
		if (aBool8980) {
			int i_6_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_7_ = i_5_ & 0xffff;
			float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
			int i_9_ = aClass137_8982.anInt1635;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"), (float) (i_6_ * aClass167_Sub2_1567.anInt9176 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterDepth"), (float) i_7_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterOffset"), f_8_);
		}
	}

	void method1674(Class124 class124, int i) {
		if (!aBool8980) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	boolean method1657() {
		return aBool8983;
	}

	void method1655(boolean bool) {
		/* empty */
	}

	boolean method1659() {
		return aBool8983;
	}

	void method1660(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8983 && class124_sub4 != null) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8985.aClass124_Sub2_1592);
			int i = aClass137_8982.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247, aClass167_Sub2_1567.aFloat9248, aClass167_Sub2_1567.aFloat9249, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8980 = true;
		}
	}

	void method1667(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8983 && class124_sub4 != null) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8985.aClass124_Sub2_1592);
			int i = aClass137_8982.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247, aClass167_Sub2_1567.aFloat9248, aClass167_Sub2_1567.aFloat9249, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8980 = true;
		}
	}

	void method1654() {
		if (aBool8980) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8980 = false;
		}
	}

	void method1662(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aBool8983 && class124_sub4 != null) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(aClass131_8985.aClass124_Sub2_1592);
			int i = aClass137_8982.anInt1635;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass167_Sub2_1567.aFloatArray9181[0], -aClass167_Sub2_1567.aFloatArray9181[1], -aClass167_Sub2_1567.aFloatArray9181[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass167_Sub2_1567.aFloat9247, aClass167_Sub2_1567.aFloat9248, aClass167_Sub2_1567.aFloat9249, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass167_Sub2_1567.aFloatArray9181[1]) * 928.0F);
			aBool8980 = true;
		}
	}

	void method1664(boolean bool) {
		/* empty */
	}

	void method1665(boolean bool) {
		/* empty */
	}

	void method1666(boolean bool) {
		/* empty */
	}

	void method1651() {
		if (aBool8980) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8980 = false;
		}
	}

	Class128_Sub8(Class167_Sub2 class167_sub2, Class131 class131) {
		super(class167_sub2);
		aClass131_8985 = class131;
		if (aClass131_8985.aClass124_Sub2_1592 != null && aClass167_Sub2_1567.aBool9152 && aClass167_Sub2_1567.aBool9306) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1567, 35633,
					"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class119 class119_10_ = (Class119.method1600(aClass167_Sub2_1567, 35632,
					"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			aClass137_8982 = Class137.method1686(aClass167_Sub2_1567, new Class119[] { class119, class119_10_ });
			aBool8983 = aClass137_8982 != null;
		}
	}

	void method1669() {
		if (aBool8980) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8980 = false;
		}
	}

	void method1663(Class124 class124, int i) {
		if (!aBool8980) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method1661() {
		if (aBool8980) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8980 = false;
		}
	}

	void method1672(Class124 class124, int i) {
		if (!aBool8980) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method1668(Class124 class124, int i) {
		if (!aBool8980) {
			aClass167_Sub2_1567.method8617(class124);
			aClass167_Sub2_1567.method8557(i);
		}
	}

	void method1670() {
		if (aBool8980) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass167_Sub2_1567.method8617(null);
			OpenGL.glUseProgram(0);
			aBool8980 = false;
		}
	}
}

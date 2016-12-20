/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class162 {
	Class180_Sub3 aClass180_Sub3_1755;
	static final String aString1756 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
	Class125 aClass125_1757;

	boolean method2643() {
		if (aClass180_Sub3_1755.aBool9818 && aClass180_Sub3_1755.aBool9734 && aClass125_1757 == null) {
			Class135 class135 = (Class135.method2299(aClass180_Sub3_1755, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class135 != null)
				aClass125_1757 = Class125.method2160(aClass180_Sub3_1755, new Class135[] { class135 });
		}
		return aClass125_1757 != null;
	}

	boolean method2644() {
		if (aClass180_Sub3_1755.aBool9818 && aClass180_Sub3_1755.aBool9734 && aClass125_1757 == null) {
			Class135 class135 = (Class135.method2299(aClass180_Sub3_1755, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class135 != null)
				aClass125_1757 = Class125.method2160(aClass180_Sub3_1755, new Class135[] { class135 });
		}
		return aClass125_1757 != null;
	}

	boolean method2645() {
		if (aClass180_Sub3_1755.aBool9818 && aClass180_Sub3_1755.aBool9734 && aClass125_1757 == null) {
			Class135 class135 = (Class135.method2299(aClass180_Sub3_1755, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class135 != null)
				aClass125_1757 = Class125.method2160(aClass180_Sub3_1755, new Class135[] { class135 });
		}
		return aClass125_1757 != null;
	}

	boolean method2646(Class118_Sub4 class118_sub4, Class118_Sub4 class118_sub4_0_, float f) {
		if (!method2644())
			return false;
		Class171_Sub2_Sub2 class171_sub2_sub2 = aClass180_Sub3_1755.aClass171_Sub2_Sub2_9798;
		Class527_Sub8_Sub3 class527_sub8_sub3 = new Class527_Sub8_Sub3(aClass180_Sub3_1755, Class157.aClass157_1723, Class184.aClass184_2104, class118_sub4.anInt8980, class118_sub4.anInt8981);
		boolean bool = false;
		aClass180_Sub3_1755.method3106(class171_sub2_sub2, (byte) -90);
		class171_sub2_sub2.method15321(0, class527_sub8_sub3);
		if (class171_sub2_sub2.method15322()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, class118_sub4.anInt8980, class118_sub4.anInt8981);
			OpenGL.glUseProgram(aClass125_1757.anInt1517);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass125_1757.anInt1517), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass125_1757.anInt1517), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass125_1757.anInt1517), "sampleSize"), 1.0F / (float) class118_sub4_0_.anInt8980, 1.0F / (float) class118_sub4_0_.anInt8981);
			for (int i = 0; i < class118_sub4.anInt8982; i++) {
				float f_1_ = (float) i / (float) class118_sub4.anInt8982;
				aClass180_Sub3_1755.method15401(class118_sub4_0_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class118_sub4.method14475(0, 0, i, class118_sub4.anInt8980, class118_sub4.anInt8981, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class171_sub2_sub2.method15321(0, null);
		aClass180_Sub3_1755.method3107(class171_sub2_sub2, -677418425);
		return bool;
	}

	Class162(Class180_Sub3 class180_sub3) {
		aClass180_Sub3_1755 = class180_sub3;
	}

	boolean method2647(Class118_Sub4 class118_sub4, Class118_Sub4 class118_sub4_2_, float f) {
		if (!method2644())
			return false;
		Class171_Sub2_Sub2 class171_sub2_sub2 = aClass180_Sub3_1755.aClass171_Sub2_Sub2_9798;
		Class527_Sub8_Sub3 class527_sub8_sub3 = new Class527_Sub8_Sub3(aClass180_Sub3_1755, Class157.aClass157_1723, Class184.aClass184_2104, class118_sub4.anInt8980, class118_sub4.anInt8981);
		boolean bool = false;
		aClass180_Sub3_1755.method3106(class171_sub2_sub2, (byte) -74);
		class171_sub2_sub2.method15321(0, class527_sub8_sub3);
		if (class171_sub2_sub2.method15322()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, class118_sub4.anInt8980, class118_sub4.anInt8981);
			OpenGL.glUseProgram(aClass125_1757.anInt1517);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass125_1757.anInt1517), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass125_1757.anInt1517), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass125_1757.anInt1517), "sampleSize"), 1.0F / (float) class118_sub4_2_.anInt8980, 1.0F / (float) class118_sub4_2_.anInt8981);
			for (int i = 0; i < class118_sub4.anInt8982; i++) {
				float f_3_ = (float) i / (float) class118_sub4.anInt8982;
				aClass180_Sub3_1755.method15401(class118_sub4_2_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_3_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_3_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_3_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_3_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class118_sub4.method14475(0, 0, i, class118_sub4.anInt8980, class118_sub4.anInt8981, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class171_sub2_sub2.method15321(0, null);
		aClass180_Sub3_1755.method3107(class171_sub2_sub2, -677418425);
		return bool;
	}
}

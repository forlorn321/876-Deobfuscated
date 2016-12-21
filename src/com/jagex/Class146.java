/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class146 {
	Class167_Sub2 aClass167_Sub2_1693;
	Class137 aClass137_1694;
	static final String aString1695 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	boolean method1802() {
		if (aClass167_Sub2_1693.aBool9289 && aClass167_Sub2_1693.aBool9306 && aClass137_1694 == null) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1693, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class119 != null)
				aClass137_1694 = Class137.method1686(aClass167_Sub2_1693, new Class119[] { class119 });
		}
		return aClass137_1694 != null;
	}

	boolean method1803() {
		if (aClass167_Sub2_1693.aBool9289 && aClass167_Sub2_1693.aBool9306 && aClass137_1694 == null) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1693, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class119 != null)
				aClass137_1694 = Class137.method1686(aClass167_Sub2_1693, new Class119[] { class119 });
		}
		return aClass137_1694 != null;
	}

	Class146(Class167_Sub2 class167_sub2) {
		aClass167_Sub2_1693 = class167_sub2;
	}

	boolean method1804() {
		if (aClass167_Sub2_1693.aBool9289 && aClass167_Sub2_1693.aBool9306 && aClass137_1694 == null) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1693, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class119 != null)
				aClass137_1694 = Class137.method1686(aClass167_Sub2_1693, new Class119[] { class119 });
		}
		return aClass137_1694 != null;
	}

	boolean method1805() {
		if (aClass167_Sub2_1693.aBool9289 && aClass167_Sub2_1693.aBool9306 && aClass137_1694 == null) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1693, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class119 != null)
				aClass137_1694 = Class137.method1686(aClass167_Sub2_1693, new Class119[] { class119 });
		}
		return aClass137_1694 != null;
	}

	boolean method1806() {
		if (aClass167_Sub2_1693.aBool9289 && aClass167_Sub2_1693.aBool9306 && aClass137_1694 == null) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1693, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class119 != null)
				aClass137_1694 = Class137.method1686(aClass167_Sub2_1693, new Class119[] { class119 });
		}
		return aClass137_1694 != null;
	}

	boolean method1807(Class124_Sub2 class124_sub2, Class124_Sub2 class124_sub2_0_, float f) {
		if (!method1803())
			return false;
		Class183_Sub2_Sub3 class183_sub2_sub3 = aClass167_Sub2_1693.aClass183_Sub2_Sub3_9314;
		Class536_Sub18_Sub3 class536_sub18_sub3 = new Class536_Sub18_Sub3(aClass167_Sub2_1693, Class155.aClass155_1722, Class171.aClass171_1905, class124_sub2.anInt8895, class124_sub2.anInt8894);
		boolean bool = false;
		aClass167_Sub2_1693.method2028(class183_sub2_sub3, -409819235);
		class183_sub2_sub3.method9035(0, class536_sub18_sub3);
		if (class183_sub2_sub3.method9036()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, class124_sub2.anInt8895, class124_sub2.anInt8894);
			OpenGL.glUseProgram(aClass137_1694.anInt1635);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass137_1694.anInt1635), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass137_1694.anInt1635), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass137_1694.anInt1635), "sampleSize"), 1.0F / (float) class124_sub2_0_.anInt8895, 1.0F / (float) class124_sub2_0_.anInt8894);
			for (int i = 0; i < class124_sub2.anInt8896; i++) {
				float f_1_ = (float) i / (float) class124_sub2.anInt8896;
				aClass167_Sub2_1693.method8617(class124_sub2_0_);
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
				class124_sub2.method8414(0, 0, i, class124_sub2.anInt8895, class124_sub2.anInt8894, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class183_sub2_sub3.method9035(0, null);
		aClass167_Sub2_1693.method2029(class183_sub2_sub3, (byte) 1);
		return bool;
	}

	boolean method1808() {
		if (aClass167_Sub2_1693.aBool9289 && aClass167_Sub2_1693.aBool9306 && aClass137_1694 == null) {
			Class119 class119 = (Class119.method1600(aClass167_Sub2_1693, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class119 != null)
				aClass137_1694 = Class137.method1686(aClass167_Sub2_1693, new Class119[] { class119 });
		}
		return aClass137_1694 != null;
	}
}

/* Class527_Sub17_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class527_Sub17_Sub3 extends Class527_Sub17 {
	static int anInt11555;
	static final String aString11556 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static float[] aFloatArray11557 = { 0.0F, 0.0F, 0.0F };
	static Class172_Sub1[] aClass172_Sub1Array11558;
	static final String aString11559 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
	static final String aString11560 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11561 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11562 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
	static float aFloat11563 = 1.0F;
	static final String aString11564 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11565 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11566 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	Class125[] aClass125Array11567 = null;

	boolean method16199() {
		return (aFloat11563 == 1.0F || (aFloatArray11557[0] + aFloatArray11557[1] + aFloatArray11557[2]) == 0.0F || (aClass172_Sub1Array11558[0] == null && aClass172_Sub1Array11558[1] == null && aClass172_Sub1Array11558[2] == null));
	}

	Class184 method16174() {
		return Class184.aClass184_2104;
	}

	boolean method16183() {
		return aClass125Array11567 != null;
	}

	boolean method16191() {
		if (aClass180_Sub3_10472.aBool9734) {
			aClass125Array11567 = new Class125[3];
			if (aClass180_Sub3_10472.aBool9826) {
				aClass125Array11567[0] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
						.concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[1] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[2] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass125Array11567[i] == null)
						return false;
				}
			} else {
				aClass125Array11567[0] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[1] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[2] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass125Array11567[i] == null)
						return false;
				}
			}
			return aClass125Array11567 != null;
		}
		return false;
	}

	void method16168(int i, int i_0_) {
		/* empty */
	}

	void method16198() {
		if (aClass125Array11567 != null) {
			for (int i = 0; i < aClass125Array11567.length; i++)
				aClass125Array11567[i] = null;
			aClass125Array11567 = null;
		}
	}

	void method16176(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_1_, int i_2_, int i_3_) {
		if (anInt11555 >= 1 && anInt11555 <= 3) {
			int i_4_ = aClass125Array11567[anInt11555 - 1].anInt1517;
			OpenGL.glUseProgram(i_4_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4_, "paramsWeightings"), aFloat11563, aFloatArray11557[0], aFloatArray11557[1], aFloatArray11557[2]);
			aClass180_Sub3_10472.method15400(0);
			aClass180_Sub3_10472.method15401(class118_sub3);
			for (int i_5_ = anInt11555 - 1; i_5_ >= 0; i_5_--) {
				if (aClass172_Sub1Array11558[i_5_] != null) {
					if (i_5_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "remap_1"), 1);
					if (i_5_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "remap_2"), 2);
					if (i_5_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "remap_3"), 3);
					aClass180_Sub3_10472.method15400(i_5_ + 1);
					Class118 class118 = aClass172_Sub1Array11558[i_5_].method14720();
					if (class118 != null)
						aClass180_Sub3_10472.method15401(class118);
				}
			}
		}
	}

	void method16170(int i) {
		OpenGL.glUseProgram(0);
		for (int i_6_ = anInt11555; i_6_ >= 0; i_6_--) {
			aClass180_Sub3_10472.method15400(i_6_);
			aClass180_Sub3_10472.method15401(null);
		}
	}

	Class184 method16167() {
		return Class184.aClass184_2104;
	}

	void method16186(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_7_, int i_8_, int i_9_) {
		if (anInt11555 >= 1 && anInt11555 <= 3) {
			int i_10_ = aClass125Array11567[anInt11555 - 1].anInt1517;
			OpenGL.glUseProgram(i_10_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_10_, "paramsWeightings"), aFloat11563, aFloatArray11557[0], aFloatArray11557[1], aFloatArray11557[2]);
			aClass180_Sub3_10472.method15400(0);
			aClass180_Sub3_10472.method15401(class118_sub3);
			for (int i_11_ = anInt11555 - 1; i_11_ >= 0; i_11_--) {
				if (aClass172_Sub1Array11558[i_11_] != null) {
					if (i_11_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "remap_1"), 1);
					if (i_11_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "remap_2"), 2);
					if (i_11_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "remap_3"), 3);
					aClass180_Sub3_10472.method15400(i_11_ + 1);
					Class118 class118 = aClass172_Sub1Array11558[i_11_].method14720();
					if (class118 != null)
						aClass180_Sub3_10472.method15401(class118);
				}
			}
		}
	}

	boolean method16165() {
		return (aFloat11563 == 1.0F || (aFloatArray11557[0] + aFloatArray11557[1] + aFloatArray11557[2]) == 0.0F || (aClass172_Sub1Array11558[0] == null && aClass172_Sub1Array11558[1] == null && aClass172_Sub1Array11558[2] == null));
	}

	Class527_Sub17_Sub3(Class180_Sub3 class180_sub3) {
		super(class180_sub3);
	}

	static {
		anInt11555 = 1;
		aClass172_Sub1Array11558 = new Class172_Sub1[] { null, null, null };
	}

	boolean method16178() {
		if (aClass180_Sub3_10472.aBool9734) {
			aClass125Array11567 = new Class125[3];
			if (aClass180_Sub3_10472.aBool9826) {
				aClass125Array11567[0] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
						.concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[1] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[2] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass125Array11567[i] == null)
						return false;
				}
			} else {
				aClass125Array11567[0] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[1] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[2] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass125Array11567[i] == null)
						return false;
				}
			}
			return aClass125Array11567 != null;
		}
		return false;
	}

	boolean method16189() {
		if (aClass180_Sub3_10472.aBool9734) {
			aClass125Array11567 = new Class125[3];
			if (aClass180_Sub3_10472.aBool9826) {
				aClass125Array11567[0] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
						.concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[1] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[2] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass125Array11567[i] == null)
						return false;
				}
			} else {
				aClass125Array11567[0] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[1] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass125Array11567[2] = (Class125.method2160(aClass180_Sub3_10472, (new Class135[] { Class135.method2299(aClass180_Sub3_10472, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass125Array11567[i] == null)
						return false;
				}
			}
			return aClass125Array11567 != null;
		}
		return false;
	}

	void method16180() {
		if (aClass125Array11567 != null) {
			for (int i = 0; i < aClass125Array11567.length; i++)
				aClass125Array11567[i] = null;
			aClass125Array11567 = null;
		}
	}

	boolean method18069() {
		return aClass180_Sub3_10472.aBool9734;
	}

	void method16179(int i, int i_12_) {
		/* empty */
	}

	boolean method18070() {
		return aClass180_Sub3_10472.aBool9734;
	}

	void method16184(int i, int i_13_) {
		/* empty */
	}

	boolean method18071() {
		return aClass180_Sub3_10472.aBool9734;
	}

	void method16182(int i, int i_14_) {
		/* empty */
	}

	void method16187(int i) {
		OpenGL.glUseProgram(0);
		for (int i_15_ = anInt11555; i_15_ >= 0; i_15_--) {
			aClass180_Sub3_10472.method15400(i_15_);
			aClass180_Sub3_10472.method15401(null);
		}
	}

	int method16169() {
		return 2;
	}

	boolean method16177() {
		return aClass125Array11567 != null;
	}

	void method16181() {
		if (aClass125Array11567 != null) {
			for (int i = 0; i < aClass125Array11567.length; i++)
				aClass125Array11567[i] = null;
			aClass125Array11567 = null;
		}
	}

	boolean method16195() {
		return (aFloat11563 == 1.0F || (aFloatArray11557[0] + aFloatArray11557[1] + aFloatArray11557[2]) == 0.0F || (aClass172_Sub1Array11558[0] == null && aClass172_Sub1Array11558[1] == null && aClass172_Sub1Array11558[2] == null));
	}

	Class184 method16196() {
		return Class184.aClass184_2104;
	}

	int method16172() {
		return 2;
	}

	void method16185(int i, Class118_Sub3 class118_sub3, Class118_Sub3 class118_sub3_16_, int i_17_, int i_18_) {
		if (anInt11555 >= 1 && anInt11555 <= 3) {
			int i_19_ = aClass125Array11567[anInt11555 - 1].anInt1517;
			OpenGL.glUseProgram(i_19_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_19_, "paramsWeightings"), aFloat11563, aFloatArray11557[0], aFloatArray11557[1], aFloatArray11557[2]);
			aClass180_Sub3_10472.method15400(0);
			aClass180_Sub3_10472.method15401(class118_sub3);
			for (int i_20_ = anInt11555 - 1; i_20_ >= 0; i_20_--) {
				if (aClass172_Sub1Array11558[i_20_] != null) {
					if (i_20_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "remap_1"), 1);
					if (i_20_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "remap_2"), 2);
					if (i_20_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "remap_3"), 3);
					aClass180_Sub3_10472.method15400(i_20_ + 1);
					Class118 class118 = aClass172_Sub1Array11558[i_20_].method14720();
					if (class118 != null)
						aClass180_Sub3_10472.method15401(class118);
				}
			}
		}
	}
}

/* Class536_Sub12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class536_Sub12_Sub3 extends Class536_Sub12 {
	static final String aString11602 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static float[] aFloatArray11603 = { 0.0F, 0.0F, 0.0F };
	static int anInt11604;
	static final String aString11605 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
	static final String aString11606 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
	static final String aString11607 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11608 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11609 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static float aFloat11610 = 1.0F;
	static Class168_Sub1[] aClass168_Sub1Array11611;
	static final String aString11612 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11613 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	Class137[] aClass137Array11614 = null;

	void method9431(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_0_, int i_1_, int i_2_) {
		if (anInt11604 >= 1 && anInt11604 <= 3) {
			int i_3_ = aClass137Array11614[anInt11604 - 1].anInt1635;
			OpenGL.glUseProgram(i_3_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3_, "paramsWeightings"), aFloat11610, aFloatArray11603[0], aFloatArray11603[1], aFloatArray11603[2]);
			aClass167_Sub2_10466.method8556(0);
			aClass167_Sub2_10466.method8617(class124_sub1);
			for (int i_4_ = anInt11604 - 1; i_4_ >= 0; i_4_--) {
				if (aClass168_Sub1Array11611[i_4_] != null) {
					if (i_4_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "remap_1"), 1);
					if (i_4_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "remap_2"), 2);
					if (i_4_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "remap_3"), 3);
					aClass167_Sub2_10466.method8556(i_4_ + 1);
					Class124 class124 = aClass168_Sub1Array11611[i_4_].method8673();
					if (class124 != null)
						aClass167_Sub2_10466.method8617(class124);
				}
			}
		}
	}

	boolean method10635() {
		return aClass167_Sub2_10466.aBool9306;
	}

	void method9436(int i) {
		OpenGL.glUseProgram(0);
		for (int i_5_ = anInt11604; i_5_ >= 0; i_5_--) {
			aClass167_Sub2_10466.method8556(i_5_);
			aClass167_Sub2_10466.method8617(null);
		}
	}

	boolean method9433() {
		if (aClass167_Sub2_10466.aBool9306) {
			aClass137Array11614 = new Class137[3];
			if (aClass167_Sub2_10466.aBool9230) {
				aClass137Array11614[0] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
						.concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[1] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[2] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass137Array11614[i] == null)
						return false;
				}
			} else {
				aClass137Array11614[0] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[1] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[2] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass137Array11614[i] == null)
						return false;
				}
			}
			return aClass137Array11614 != null;
		}
		return false;
	}

	void method9432(int i, int i_6_) {
		/* empty */
	}

	static {
		anInt11604 = 1;
		aClass168_Sub1Array11611 = new Class168_Sub1[] { null, null, null };
	}

	Class171 method9462() {
		return Class171.aClass171_1905;
	}

	boolean method9466() {
		return (aFloat11610 == 1.0F || (aFloatArray11603[0] + aFloatArray11603[1] + aFloatArray11603[2]) == 0.0F || (aClass168_Sub1Array11611[0] == null && aClass168_Sub1Array11611[1] == null && aClass168_Sub1Array11611[2] == null));
	}

	Class171 method9437() {
		return Class171.aClass171_1905;
	}

	int method9458() {
		return 2;
	}

	void method9446() {
		if (aClass137Array11614 != null) {
			for (int i = 0; i < aClass137Array11614.length; i++)
				aClass137Array11614[i] = null;
			aClass137Array11614 = null;
		}
	}

	boolean method9468() {
		return (aFloat11610 == 1.0F || (aFloatArray11603[0] + aFloatArray11603[1] + aFloatArray11603[2]) == 0.0F || (aClass168_Sub1Array11611[0] == null && aClass168_Sub1Array11611[1] == null && aClass168_Sub1Array11611[2] == null));
	}

	boolean method9443() {
		return aClass137Array11614 != null;
	}

	boolean method9444() {
		return aClass137Array11614 != null;
	}

	void method9434() {
		if (aClass137Array11614 != null) {
			for (int i = 0; i < aClass137Array11614.length; i++)
				aClass137Array11614[i] = null;
			aClass137Array11614 = null;
		}
	}

	Class536_Sub12_Sub3(Class167_Sub2 class167_sub2) {
		super(class167_sub2);
	}

	void method9447(int i, int i_7_) {
		/* empty */
	}

	void method9448(int i, int i_8_) {
		/* empty */
	}

	void method9449(int i, int i_9_) {
		/* empty */
	}

	void method9450(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_10_, int i_11_, int i_12_) {
		if (anInt11604 >= 1 && anInt11604 <= 3) {
			int i_13_ = aClass137Array11614[anInt11604 - 1].anInt1635;
			OpenGL.glUseProgram(i_13_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_13_, "paramsWeightings"), aFloat11610, aFloatArray11603[0], aFloatArray11603[1], aFloatArray11603[2]);
			aClass167_Sub2_10466.method8556(0);
			aClass167_Sub2_10466.method8617(class124_sub1);
			for (int i_14_ = anInt11604 - 1; i_14_ >= 0; i_14_--) {
				if (aClass168_Sub1Array11611[i_14_] != null) {
					if (i_14_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "remap_1"), 1);
					if (i_14_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "remap_2"), 2);
					if (i_14_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "remap_3"), 3);
					aClass167_Sub2_10466.method8556(i_14_ + 1);
					Class124 class124 = aClass168_Sub1Array11611[i_14_].method8673();
					if (class124 != null)
						aClass167_Sub2_10466.method8617(class124);
				}
			}
		}
	}

	boolean method9451() {
		return aClass137Array11614 != null;
	}

	void method9452(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_15_, int i_16_, int i_17_) {
		if (anInt11604 >= 1 && anInt11604 <= 3) {
			int i_18_ = aClass137Array11614[anInt11604 - 1].anInt1635;
			OpenGL.glUseProgram(i_18_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_18_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_18_, "paramsWeightings"), aFloat11610, aFloatArray11603[0], aFloatArray11603[1], aFloatArray11603[2]);
			aClass167_Sub2_10466.method8556(0);
			aClass167_Sub2_10466.method8617(class124_sub1);
			for (int i_19_ = anInt11604 - 1; i_19_ >= 0; i_19_--) {
				if (aClass168_Sub1Array11611[i_19_] != null) {
					if (i_19_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_18_, "remap_1"), 1);
					if (i_19_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_18_, "remap_2"), 2);
					if (i_19_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_18_, "remap_3"), 3);
					aClass167_Sub2_10466.method8556(i_19_ + 1);
					Class124 class124 = aClass168_Sub1Array11611[i_19_].method8673();
					if (class124 != null)
						aClass167_Sub2_10466.method8617(class124);
				}
			}
		}
	}

	void method9453(int i) {
		OpenGL.glUseProgram(0);
		for (int i_20_ = anInt11604; i_20_ >= 0; i_20_--) {
			aClass167_Sub2_10466.method8556(i_20_);
			aClass167_Sub2_10466.method8617(null);
		}
	}

	void method9454(int i) {
		OpenGL.glUseProgram(0);
		for (int i_21_ = anInt11604; i_21_ >= 0; i_21_--) {
			aClass167_Sub2_10466.method8556(i_21_);
			aClass167_Sub2_10466.method8617(null);
		}
	}

	int method9457() {
		return 2;
	}

	void method9435(int i, Class124_Sub1 class124_sub1, Class124_Sub1 class124_sub1_22_, int i_23_, int i_24_) {
		if (anInt11604 >= 1 && anInt11604 <= 3) {
			int i_25_ = aClass137Array11614[anInt11604 - 1].anInt1635;
			OpenGL.glUseProgram(i_25_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_25_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_25_, "paramsWeightings"), aFloat11610, aFloatArray11603[0], aFloatArray11603[1], aFloatArray11603[2]);
			aClass167_Sub2_10466.method8556(0);
			aClass167_Sub2_10466.method8617(class124_sub1);
			for (int i_26_ = anInt11604 - 1; i_26_ >= 0; i_26_--) {
				if (aClass168_Sub1Array11611[i_26_] != null) {
					if (i_26_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_25_, "remap_1"), 1);
					if (i_26_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_25_, "remap_2"), 2);
					if (i_26_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_25_, "remap_3"), 3);
					aClass167_Sub2_10466.method8556(i_26_ + 1);
					Class124 class124 = aClass168_Sub1Array11611[i_26_].method8673();
					if (class124 != null)
						aClass167_Sub2_10466.method8617(class124);
				}
			}
		}
	}

	Class171 method9460() {
		return Class171.aClass171_1905;
	}

	Class171 method9441() {
		return Class171.aClass171_1905;
	}

	boolean method9445() {
		if (aClass167_Sub2_10466.aBool9306) {
			aClass137Array11614 = new Class137[3];
			if (aClass167_Sub2_10466.aBool9230) {
				aClass137Array11614[0] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
						.concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[1] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[2] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat(
						"void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass137Array11614[i] == null)
						return false;
				}
			} else {
				aClass137Array11614[0] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[1] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass137Array11614[2] = (Class137.method1686(aClass167_Sub2_10466, (new Class119[] { Class119.method1600(aClass167_Sub2_10466, 35632,
						("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat(
								"void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass137Array11614[i] == null)
						return false;
				}
			}
			return aClass137Array11614 != null;
		}
		return false;
	}

	Class171 method9456() {
		return Class171.aClass171_1905;
	}

	int method9438() {
		return 2;
	}

	boolean method9467() {
		return (aFloat11610 == 1.0F || (aFloatArray11603[0] + aFloatArray11603[1] + aFloatArray11603[2]) == 0.0F || (aClass168_Sub1Array11611[0] == null && aClass168_Sub1Array11611[1] == null && aClass168_Sub1Array11611[2] == null));
	}

	boolean method9442() {
		return (aFloat11610 == 1.0F || (aFloatArray11603[0] + aFloatArray11603[1] + aFloatArray11603[2]) == 0.0F || (aClass168_Sub1Array11611[0] == null && aClass168_Sub1Array11611[1] == null && aClass168_Sub1Array11611[2] == null));
	}

	boolean method10636() {
		return aClass167_Sub2_10466.aBool9306;
	}

	boolean method10637() {
		return aClass167_Sub2_10466.aBool9306;
	}
}

/* Class265_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

import jaggl.OpenGL;

public class Class265_Sub1 extends Class265 {
	Map aMap9973;
	static final int anInt9974 = 35632;
	Map aMap9975;
	Class180_Sub2_Sub1 aClass180_Sub2_Sub1_9976;
	Class261_Sub1 aClass261_Sub1_9977;
	int anInt9978 = 0;
	static final int anInt9979 = 13;
	String aString9980;
	boolean aBool9981;
	static boolean $assertionsDisabled = !com.jagex.Class265_Sub1.class.desiredAssertionStatus();
	static int[] anIntArray9982 = new int[2];
	int anInt9983 = 0;
	static final int anInt9984 = 35633;
	int[] anIntArray9985;
	Map aMap9986;
	Map aMap9987;
	int anInt9988 = 0;
	static float[] aFloatArray9989 = new float[16];
	String aString9990;
	Map aMap9991;

	void method5009(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_0_, float f_1_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || aMap9975.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_0_) || (((Float) aMap9975.get(Integer.valueOf(i))).floatValue() != f_1_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_0_));
				aMap9975.put(Integer.valueOf(i), Float.valueOf(f_1_));
				if (class527_sub18_sub1.method18147(-1197389251) != Class266.aClass266_2903)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform3f(i, f, f_0_, f_1_);
			}
		}
	}

	Class265_Sub1(Class180_Sub2_Sub1 class180_sub2_sub1, Class287 class287) {
		aBool9981 = false;
		anIntArray9985 = new int[13];
		aMap9991 = new HashMap();
		aMap9986 = new HashMap();
		aMap9975 = new HashMap();
		aMap9987 = new HashMap();
		aMap9973 = new HashMap();
		aString2874 = class287.aString3214;
		StringBuilder stringbuilder = new StringBuilder();
		if (class287.aString3213 != null) {
			aString2873 = class287.aString3213;
			if (class287.aClass260Array3212 != null) {
				Class260[] class260s = class287.aClass260Array3212;
				for (int i = 0; i < class260s.length; i++) {
					Class260 class260 = class260s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class260.aString2852).append(" ").append(class260.aString2851).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class180_sub2_sub1.method18020(aString2873)));
			aString9980 = stringbuilder.toString();
		}
		if (class287.aString3215 != null) {
			aString2875 = class287.aString3215;
			stringbuilder.setLength(0);
			if (class287.aClass260Array3216 != null) {
				Class260[] class260s = class287.aClass260Array3216;
				for (int i = 0; i < class260s.length; i++) {
					Class260 class260 = class260s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class260.aString2852).append(" ").append(class260.aString2851).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class180_sub2_sub1.method18020(aString2875)));
			aString9990 = stringbuilder.toString();
		}
		Class692.method14029(anIntArray9985, 0, anIntArray9985.length, -1);
	}

	void method4986(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_2_ = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i_2_ != -1)
			OpenGL.glUniform4fv(i_2_, i, fs, 0);
	}

	public boolean method4988() {
		if (aBool9981)
			return true;
		aClass180_Sub2_Sub1_9976.aClass265_Sub1_11483 = null;
		anInt9983 = method15643(35633, aString9980, aString2873);
		anInt9988 = method15643(35632, aString9990, aString2875);
		if (anInt9983 == 0 || anInt9988 == 0) {
			if (anInt9983 != 0)
				OpenGL.glDeleteShader(anInt9983);
			if (anInt9988 != 0)
				OpenGL.glDeleteShader(anInt9988);
			return false;
		}
		anInt9978 = OpenGL.glCreateProgram();
		if (anInt9983 != 0)
			OpenGL.glAttachShader(anInt9978, anInt9983);
		if (anInt9988 != 0)
			OpenGL.glAttachShader(anInt9978, anInt9988);
		OpenGL.glLinkProgram(anInt9978);
		OpenGL.glGetProgramiv(anInt9978, 35714, anIntArray9982, 0);
		if (anIntArray9982[0] == 0) {
			if (anInt9983 != 0) {
				OpenGL.glDetachShader(anInt9978, anInt9983);
				OpenGL.glDeleteShader(anInt9983);
			}
			if (anInt9988 != 0) {
				OpenGL.glDetachShader(anInt9978, anInt9988);
				OpenGL.glDeleteShader(anInt9988);
			}
			OpenGL.glDeleteProgram(anInt9978);
			return false;
		}
		OpenGL.glUseProgram(anInt9978);
		int i = -1;
		for (int i_3_ = 0; i_3_ < aClass261_Sub1_9977.method4806(284062620); i_3_++) {
			if (aClass261_Sub1_9977.method4841(i_3_, (byte) -18) == this) {
				i = i_3_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_4_ = 0; i_4_ < aClass261_Sub1_9977.method4836(95601612); i_4_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub1_9977.method4837(i_4_, 1360052931);
			if (class527_sub18_sub1 != null)
				class527_sub18_sub1.method18144(i);
		}
		for (int i_5_ = 0; i_5_ < aClass261_Sub1_9977.method4832(-1172369665); i_5_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub1_9977.method4856(i_5_, (byte) 44);
			if (class527_sub18_sub1 != null)
				class527_sub18_sub1.method18144(i);
		}
		aString9980 = null;
		aString9990 = null;
		aBool9981 = true;
		return true;
	}

	void method4989(Class527_Sub18_Sub1 class527_sub18_sub1, float f) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || (((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class527_sub18_sub1.method18147(1225416578) != Class266.aClass266_2995) && (class527_sub18_sub1.method18147(1821515942) != Class266.aClass266_2947))
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method4990(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_6_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_6_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_6_));
				if (class527_sub18_sub1.method18147(1883494126) != Class266.aClass266_2902)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform2f(i, f, f_6_);
			}
		}
	}

	void method4991(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_7_, float f_8_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || aMap9975.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_7_) || (((Float) aMap9975.get(Integer.valueOf(i))).floatValue() != f_8_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_7_));
				aMap9975.put(Integer.valueOf(i), Float.valueOf(f_8_));
				if (class527_sub18_sub1.method18147(1111768533) != Class266.aClass266_2903)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform3f(i, f, f_7_, f_8_);
			}
		}
	}

	void method5016(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		if (!$assertionsDisabled && (class527_sub18_sub1.method18147(796790392) != Class266.aClass266_2918))
			throw new AssertionError();
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class427.method6767(aFloatArray9989), 0);
	}

	void method4993(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_9_ = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i_9_ != -1)
			OpenGL.glUniform4fv(i_9_, i, fs, 0);
	}

	void method4996(int i, float f, float f_10_, float f_11_) {
		OpenGL.glUniform3f(i, f, f_10_, f_11_);
	}

	void method5028(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		if (!$assertionsDisabled && (class527_sub18_sub1.method18147(685953431) != Class266.aClass266_2882))
			throw new AssertionError();
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class427.method6763(aFloatArray9989), 0);
	}

	void method4995(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41) {
		int i_12_ = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i_12_ != -1) {
			if (interface41 == null)
				interface41 = aClass180_Sub2_Sub1_9976.anInterface38_9533;
			if (i < aClass180_Sub2_Sub1_9976.anInt9521) {
				aClass180_Sub2_Sub1_9976.method14970(i);
				aClass180_Sub2_Sub1_9976.method14971(interface41);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class480) interface41).anInt5412, ((Class480) interface41).anInt5411);
			}
			if (aMap9973.get(Integer.valueOf(i_12_)) == null || (((Integer) aMap9973.get(Integer.valueOf(i_12_))).intValue() != i)) {
				aMap9973.put(Integer.valueOf(i_12_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_12_, i);
			}
		}
	}

	Class265_Sub1(Class180_Sub2_Sub1 class180_sub2_sub1, Class261_Sub1 class261_sub1, Class287 class287) {
		this(class180_sub2_sub1, class287);
		aClass261_Sub1_9977 = class261_sub1;
		aClass180_Sub2_Sub1_9976 = class180_sub2_sub1;
	}

	void method4992(int i, float f, float f_13_, float f_14_, float f_15_) {
		OpenGL.glUniform4f(i, f, f_13_, f_14_, f_15_);
	}

	void method4987(int i, Class427 class427) {
		OpenGL.glUniform2fv(i, 4, class427.method6767(aFloatArray9989), 0);
	}

	void method4999(int i, Class427 class427) {
		OpenGL.glUniform3fv(i, 3, class427.method6765(aFloatArray9989), 0);
	}

	int method15643(int i, String string, String string_16_) {
		if (string == null)
			return 0;
		int i_17_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_17_, string);
		OpenGL.glCompileShader(i_17_);
		OpenGL.glGetShaderiv(i_17_, 35713, anIntArray9982, 0);
		if (anIntArray9982[0] == 0) {
			OpenGL.glDeleteShader(i_17_);
			i_17_ = 0;
		}
		return i_17_;
	}

	void method5013(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_18_ = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i_18_ != -1)
			OpenGL.glUniform4fv(i_18_, i, fs, 0);
	}

	void method5002(int i, int i_19_, Interface41 interface41) {
		aClass180_Sub2_Sub1_9976.method14970(i_19_);
		aClass180_Sub2_Sub1_9976.method14971(interface41);
		OpenGL.glUniform1i(i, i_19_);
	}

	public void method129() {
		if (anInt9978 != 0) {
			aClass180_Sub2_Sub1_9976.method18006(anInt9978);
			if (anInt9983 != 0)
				aClass180_Sub2_Sub1_9976.method18003((long) anInt9983);
			if (anInt9988 != 0)
				aClass180_Sub2_Sub1_9976.method18003((long) anInt9988);
			anInt9978 = 0;
			anInt9983 = 0;
			anInt9988 = 0;
		}
	}

	public void finalize() {
		method129();
	}

	public void method130() {
		if (anInt9978 != 0) {
			aClass180_Sub2_Sub1_9976.method18006(anInt9978);
			if (anInt9983 != 0)
				aClass180_Sub2_Sub1_9976.method18003((long) anInt9983);
			if (anInt9988 != 0)
				aClass180_Sub2_Sub1_9976.method18003((long) anInt9988);
			anInt9978 = 0;
			anInt9983 = 0;
			anInt9988 = 0;
		}
	}

	void method15644() {
		method129();
	}

	void method5000(int i, Class427 class427) {
		OpenGL.glUniform4fv(i, 4, class427.method6763(aFloatArray9989), 0);
	}

	void method15645() {
		method129();
	}

	void method15646() {
		method129();
	}

	void method15647() {
		method129();
	}

	void method5032(int i, Class427 class427) {
		OpenGL.glUniform4fv(i, 4, class427.method6763(aFloatArray9989), 0);
	}

	void method5010(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_20_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_20_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_20_));
				if (class527_sub18_sub1.method18147(2022505882) != Class266.aClass266_2902)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform2f(i, f, f_20_);
			}
		}
	}

	void method5020(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_21_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_21_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_21_));
				if (class527_sub18_sub1.method18147(1283247228) != Class266.aClass266_2902)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform2f(i, f, f_21_);
			}
		}
	}

	void method5007(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_22_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_22_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_22_));
				if (class527_sub18_sub1.method18147(24204547) != Class266.aClass266_2902)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform2f(i, f, f_22_);
			}
		}
	}

	void method5008(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_23_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_23_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_23_));
				if (class527_sub18_sub1.method18147(1421176250) != Class266.aClass266_2902)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform2f(i, f, f_23_);
			}
		}
	}

	void method5023(int i, Class427 class427) {
		OpenGL.glUniform3fv(i, 3, class427.method6765(aFloatArray9989), 0);
	}

	void method5027(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_24_, float f_25_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || aMap9975.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_24_) || (((Float) aMap9975.get(Integer.valueOf(i))).floatValue() != f_25_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_24_));
				aMap9975.put(Integer.valueOf(i), Float.valueOf(f_25_));
				if (class527_sub18_sub1.method18147(51958509) != Class266.aClass266_2903)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform3f(i, f, f_24_, f_25_);
			}
		}
	}

	void method5031(int i, float[] fs, int i_26_) {
		OpenGL.glUniform4fv(i, i_26_, fs, 0);
	}

	void method5012(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_27_, float f_28_, float f_29_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || aMap9975.get(Integer.valueOf(i)) == null || aMap9987.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_27_) || (((Float) aMap9975.get(Integer.valueOf(i))).floatValue() != f_28_) || (((Float) aMap9987.get(Integer.valueOf(i))).floatValue() != f_29_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_27_));
				aMap9975.put(Integer.valueOf(i), Float.valueOf(f_28_));
				aMap9987.put(Integer.valueOf(i), Float.valueOf(f_29_));
				if (class527_sub18_sub1.method18147(-75851792) != Class266.aClass266_2904)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform4f(i, f, f_27_, f_28_, f_29_);
			}
		}
	}

	void method5011(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_30_, float f_31_, float f_32_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || aMap9975.get(Integer.valueOf(i)) == null || aMap9987.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_30_) || (((Float) aMap9975.get(Integer.valueOf(i))).floatValue() != f_31_) || (((Float) aMap9987.get(Integer.valueOf(i))).floatValue() != f_32_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_30_));
				aMap9975.put(Integer.valueOf(i), Float.valueOf(f_31_));
				aMap9987.put(Integer.valueOf(i), Float.valueOf(f_32_));
				if (class527_sub18_sub1.method18147(1601896009) != Class266.aClass266_2904)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform4f(i, f, f_30_, f_31_, f_32_);
			}
		}
	}

	void method5014(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_33_ = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i_33_ != -1)
			OpenGL.glUniform4fv(i_33_, i, fs, 0);
	}

	void method15648() {
		method129();
	}

	void method4994(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		if (!$assertionsDisabled && (class527_sub18_sub1.method18147(1982735485) != Class266.aClass266_2918))
			throw new AssertionError();
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class427.method6767(aFloatArray9989), 0);
	}

	void method5017(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		if (!$assertionsDisabled && (class527_sub18_sub1.method18147(925193785) != Class266.aClass266_2918))
			throw new AssertionError();
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class427.method6767(aFloatArray9989), 0);
	}

	void method5018(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		if (!$assertionsDisabled && (class527_sub18_sub1.method18147(-239080397) != Class266.aClass266_2882))
			throw new AssertionError();
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class427.method6763(aFloatArray9989), 0);
	}

	void method5019(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		if (!$assertionsDisabled && (class527_sub18_sub1.method18147(1560332575) != Class266.aClass266_2882))
			throw new AssertionError();
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class427.method6763(aFloatArray9989), 0);
	}

	void method5005(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41) {
		int i_34_ = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i_34_ != -1) {
			if (interface41 == null)
				interface41 = aClass180_Sub2_Sub1_9976.anInterface38_9533;
			if (i < aClass180_Sub2_Sub1_9976.anInt9521) {
				aClass180_Sub2_Sub1_9976.method14970(i);
				aClass180_Sub2_Sub1_9976.method14971(interface41);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class480) interface41).anInt5412, ((Class480) interface41).anInt5411);
			}
			if (aMap9973.get(Integer.valueOf(i_34_)) == null || (((Integer) aMap9973.get(Integer.valueOf(i_34_))).intValue() != i)) {
				aMap9973.put(Integer.valueOf(i_34_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_34_, i);
			}
		}
	}

	void method5021(int i, float f, float f_35_, float f_36_) {
		OpenGL.glUniform3f(i, f, f_35_, f_36_);
	}

	void method5015(int i, float f, float f_37_, float f_38_, float f_39_) {
		OpenGL.glUniform4f(i, f, f_37_, f_38_, f_39_);
	}

	void method4997(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_40_, float f_41_, float f_42_) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || aMap9975.get(Integer.valueOf(i)) == null || aMap9987.get(Integer.valueOf(i)) == null || ((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_40_) || (((Float) aMap9975.get(Integer.valueOf(i))).floatValue() != f_41_) || (((Float) aMap9987.get(Integer.valueOf(i))).floatValue() != f_42_)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_40_));
				aMap9975.put(Integer.valueOf(i), Float.valueOf(f_41_));
				aMap9987.put(Integer.valueOf(i), Float.valueOf(f_42_));
				if (class527_sub18_sub1.method18147(-1770409112) != Class266.aClass266_2904)
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform4f(i, f, f_40_, f_41_, f_42_);
			}
		}
	}

	void method5024(int i, Class427 class427) {
		OpenGL.glUniform2fv(i, 4, class427.method6767(aFloatArray9989), 0);
	}

	void method5025(int i, Class427 class427) {
		OpenGL.glUniform2fv(i, 4, class427.method6767(aFloatArray9989), 0);
	}

	void method5026(int i, Class427 class427) {
		OpenGL.glUniform4fv(i, 4, class427.method6763(aFloatArray9989), 0);
	}

	int method15649(int i, String string, String string_43_) {
		if (string == null)
			return 0;
		int i_44_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_44_, string);
		OpenGL.glCompileShader(i_44_);
		OpenGL.glGetShaderiv(i_44_, 35713, anIntArray9982, 0);
		if (anIntArray9982[0] == 0) {
			OpenGL.glDeleteShader(i_44_);
			i_44_ = 0;
		}
		return i_44_;
	}

	void method4998(int i, int i_45_, Interface41 interface41) {
		aClass180_Sub2_Sub1_9976.method14970(i_45_);
		aClass180_Sub2_Sub1_9976.method14971(interface41);
		OpenGL.glUniform1i(i, i_45_);
	}

	void method5029(Class527_Sub18_Sub1 class527_sub18_sub1, float f) {
		int i = ((Class527_Sub18_Sub1_Sub1) class527_sub18_sub1).method18723();
		if (i != -1) {
			if (aMap9991.get(Integer.valueOf(i)) == null || (((Float) aMap9991.get(Integer.valueOf(i))).floatValue() != f)) {
				aMap9991.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class527_sub18_sub1.method18147(-2114199083) != Class266.aClass266_2995) && (class527_sub18_sub1.method18147(827582254) != Class266.aClass266_2947))
					throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method5030(int i, float[] fs, int i_46_) {
		OpenGL.glUniform4fv(i, i_46_, fs, 0);
	}

	void method5022(int i, float[] fs, int i_47_) {
		OpenGL.glUniform4fv(i, i_47_, fs, 0);
	}

	void method5001(int i, float[] fs, int i_48_) {
		OpenGL.glUniform4fv(i, i_48_, fs, 0);
	}

	public boolean method5006() {
		if (aBool9981)
			return true;
		aClass180_Sub2_Sub1_9976.aClass265_Sub1_11483 = null;
		anInt9983 = method15643(35633, aString9980, aString2873);
		anInt9988 = method15643(35632, aString9990, aString2875);
		if (anInt9983 == 0 || anInt9988 == 0) {
			if (anInt9983 != 0)
				OpenGL.glDeleteShader(anInt9983);
			if (anInt9988 != 0)
				OpenGL.glDeleteShader(anInt9988);
			return false;
		}
		anInt9978 = OpenGL.glCreateProgram();
		if (anInt9983 != 0)
			OpenGL.glAttachShader(anInt9978, anInt9983);
		if (anInt9988 != 0)
			OpenGL.glAttachShader(anInt9978, anInt9988);
		OpenGL.glLinkProgram(anInt9978);
		OpenGL.glGetProgramiv(anInt9978, 35714, anIntArray9982, 0);
		if (anIntArray9982[0] == 0) {
			if (anInt9983 != 0) {
				OpenGL.glDetachShader(anInt9978, anInt9983);
				OpenGL.glDeleteShader(anInt9983);
			}
			if (anInt9988 != 0) {
				OpenGL.glDetachShader(anInt9978, anInt9988);
				OpenGL.glDeleteShader(anInt9988);
			}
			OpenGL.glDeleteProgram(anInt9978);
			return false;
		}
		OpenGL.glUseProgram(anInt9978);
		int i = -1;
		for (int i_49_ = 0; i_49_ < aClass261_Sub1_9977.method4806(-107505732); i_49_++) {
			if (aClass261_Sub1_9977.method4841(i_49_, (byte) 47) == this) {
				i = i_49_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_50_ = 0; i_50_ < aClass261_Sub1_9977.method4836(666074568); i_50_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub1_9977.method4837(i_50_, 496752482);
			if (class527_sub18_sub1 != null)
				class527_sub18_sub1.method18144(i);
		}
		for (int i_51_ = 0; i_51_ < aClass261_Sub1_9977.method4832(-1609158686); i_51_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub1_9977.method4856(i_51_, (byte) -69);
			if (class527_sub18_sub1 != null)
				class527_sub18_sub1.method18144(i);
		}
		aString9980 = null;
		aString9990 = null;
		aBool9981 = true;
		return true;
	}
}

/* Class285_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

import jaggl.OpenGL;

public class Class285_Sub2 extends Class285 {
	int anInt10050;
	static final int anInt10051 = 35632;
	static final int anInt10052 = 13;
	Class167_Sub3_Sub1 aClass167_Sub3_Sub1_10053;
	Class286_Sub2 aClass286_Sub2_10054;
	int anInt10055 = 0;
	static boolean $assertionsDisabled = !com.jagex.Class285_Sub2.class.desiredAssertionStatus();
	int anInt10056;
	boolean aBool10057;
	int[] anIntArray10058;
	static final int anInt10059 = 35633;
	Map aMap10060;
	static float[] aFloatArray10061;
	Map aMap10062;
	static int[] anIntArray10063 = new int[2];
	Map aMap10064;
	Map aMap10065;
	String aString10066;
	String aString10067;
	Map aMap10068;

	void method3833(int i, int i_0_, Interface40 interface40) {
		aClass167_Sub3_Sub1_10053.method8780(i_0_);
		aClass167_Sub3_Sub1_10053.method8781(interface40);
		OpenGL.glUniform1i(i, i_0_);
	}

	public void finalize() {
		method131();
	}

	int method9185(int i, String string, String string_1_) {
		if (string == null)
			return 0;
		int i_2_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_2_, string);
		OpenGL.glCompileShader(i_2_);
		OpenGL.glGetShaderiv(i_2_, 35713, anIntArray10063, 0);
		if (anIntArray10063[0] == 0) {
			OpenGL.glDeleteShader(i_2_);
			i_2_ = 0;
		}
		return i_2_;
	}

	void method9186() {
		method131();
	}

	void method3786(Class536_Sub8_Sub1 class536_sub8_sub1, float f) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class536_sub8_sub1.method10642((byte) 76) != Class273.aClass273_2915) && (class536_sub8_sub1.method10642((byte) 83) != Class273.aClass273_2961))
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method3804(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_3_, float f_4_, float f_5_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || aMap10064.get(Integer.valueOf(i)) == null || aMap10062.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_3_) || (((Float) aMap10064.get(Integer.valueOf(i))).floatValue() != f_4_) || (((Float) aMap10062.get(Integer.valueOf(i))).floatValue() != f_5_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_3_));
				aMap10064.put(Integer.valueOf(i), Float.valueOf(f_4_));
				aMap10062.put(Integer.valueOf(i), Float.valueOf(f_5_));
				if (class536_sub8_sub1.method10642((byte) 96) != Class273.aClass273_2918)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform4f(i, f, f_3_, f_4_, f_5_);
			}
		}
	}

	void method3793(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		int i_6_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_6_ != -1) {
			if (interface40 == null)
				interface40 = aClass167_Sub3_Sub1_10053.anInterface36_9691;
			if (i < aClass167_Sub3_Sub1_10053.anInt9690) {
				aClass167_Sub3_Sub1_10053.method8780(i);
				aClass167_Sub3_Sub1_10053.method8781(interface40);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class493) interface40).anInt5531, ((Class493) interface40).anInt5530);
			}
			if (aMap10065.get(Integer.valueOf(i_6_)) == null || (((Integer) aMap10065.get(Integer.valueOf(i_6_))).intValue() != i)) {
				aMap10065.put(Integer.valueOf(i_6_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_6_, i);
			}
		}
	}

	void method3835(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_7_, float f_8_, float f_9_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || aMap10064.get(Integer.valueOf(i)) == null || aMap10062.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_7_) || (((Float) aMap10064.get(Integer.valueOf(i))).floatValue() != f_8_) || (((Float) aMap10062.get(Integer.valueOf(i))).floatValue() != f_9_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_7_));
				aMap10064.put(Integer.valueOf(i), Float.valueOf(f_8_));
				aMap10062.put(Integer.valueOf(i), Float.valueOf(f_9_));
				if (class536_sub8_sub1.method10642((byte) -31) != Class273.aClass273_2918)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform4f(i, f, f_7_, f_8_, f_9_);
			}
		}
	}

	void method3790(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_10_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_10_ != -1)
			OpenGL.glUniform4fv(i_10_, i, fs, 0);
	}

	void method3791(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		if (!$assertionsDisabled && (class536_sub8_sub1.method10642((byte) -59) != Class273.aClass273_2932))
			throw new AssertionError();
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class443.method5363(aFloatArray10061), 0);
	}

	void method3784(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		if (!$assertionsDisabled && (class536_sub8_sub1.method10642((byte) 47) != Class273.aClass273_2934))
			throw new AssertionError();
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class443.method5377(aFloatArray10061), 0);
	}

	void method3787(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_11_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_11_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_11_));
				if (class536_sub8_sub1.method10642((byte) 61) != Class273.aClass273_3008)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform2f(i, f, f_11_);
			}
		}
	}

	void method3830(int i, float f, float f_12_, float f_13_) {
		OpenGL.glUniform3f(i, f, f_12_, f_13_);
	}

	void method3795(int i, float f, float f_14_, float f_15_, float f_16_) {
		OpenGL.glUniform4f(i, f, f_14_, f_15_, f_16_);
	}

	void method3798(int i, Class443 class443) {
		OpenGL.glUniform2fv(i, 4, class443.method5363(aFloatArray10061), 0);
	}

	void method3797(int i, Class443 class443) {
		OpenGL.glUniform3fv(i, 3, class443.method5361(aFloatArray10061), 0);
	}

	static {
		aFloatArray10061 = new float[16];
	}

	void method3799(int i, Class443 class443) {
		OpenGL.glUniform4fv(i, 4, class443.method5377(aFloatArray10061), 0);
	}

	Class285_Sub2(Class167_Sub3_Sub1 class167_sub3_sub1, Class264 class264) {
		anInt10050 = 0;
		anInt10056 = 0;
		aBool10057 = false;
		anIntArray10058 = new int[13];
		aMap10060 = new HashMap();
		aMap10068 = new HashMap();
		aMap10064 = new HashMap();
		aMap10062 = new HashMap();
		aMap10065 = new HashMap();
		aString3191 = class264.aString2858;
		StringBuilder stringbuilder = new StringBuilder();
		if (class264.aString2854 != null) {
			aString3189 = class264.aString2854;
			if (class264.aClass267Array2855 != null) {
				Class267[] class267s = class264.aClass267Array2855;
				for (int i = 0; i < class267s.length; i++) {
					Class267 class267 = class267s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class267.aString2868).append(" ").append(class267.aString2869).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class167_sub3_sub1.method10572(aString3189)));
			aString10066 = stringbuilder.toString();
		}
		if (class264.aString2856 != null) {
			aString3190 = class264.aString2856;
			stringbuilder.setLength(0);
			if (class264.aClass267Array2857 != null) {
				Class267[] class267s = class264.aClass267Array2857;
				for (int i = 0; i < class267s.length; i++) {
					Class267 class267 = class267s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class267.aString2868).append(" ").append(class267.aString2869).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class167_sub3_sub1.method10572(aString3190)));
			aString10067 = stringbuilder.toString();
		}
		Class687.method8115(anIntArray10058, 0, anIntArray10058.length, -1);
	}

	void method3796(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		int i_17_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_17_ != -1) {
			if (interface40 == null)
				interface40 = aClass167_Sub3_Sub1_10053.anInterface36_9691;
			if (i < aClass167_Sub3_Sub1_10053.anInt9690) {
				aClass167_Sub3_Sub1_10053.method8780(i);
				aClass167_Sub3_Sub1_10053.method8781(interface40);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class493) interface40).anInt5531, ((Class493) interface40).anInt5530);
			}
			if (aMap10065.get(Integer.valueOf(i_17_)) == null || ((Integer) aMap10065.get(Integer.valueOf(i_17_))).intValue() != i) {
				aMap10065.put(Integer.valueOf(i_17_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_17_, i);
			}
		}
	}

	void method3829(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_18_, float f_19_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || aMap10064.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_18_) || (((Float) aMap10064.get(Integer.valueOf(i))).floatValue() != f_19_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_18_));
				aMap10064.put(Integer.valueOf(i), Float.valueOf(f_19_));
				if (class536_sub8_sub1.method10642((byte) -27) != Class273.aClass273_3009)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform3f(i, f, f_18_, f_19_);
			}
		}
	}

	void method3788(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_20_, float f_21_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || aMap10064.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_20_) || (((Float) aMap10064.get(Integer.valueOf(i))).floatValue() != f_21_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_20_));
				aMap10064.put(Integer.valueOf(i), Float.valueOf(f_21_));
				if (class536_sub8_sub1.method10642((byte) -76) != Class273.aClass273_3009)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform3f(i, f, f_20_, f_21_);
			}
		}
	}

	public void method130() {
		if (anInt10055 != 0) {
			aClass167_Sub3_Sub1_10053.method10571(anInt10055);
			if (anInt10050 != 0)
				aClass167_Sub3_Sub1_10053.method10564((long) anInt10050);
			if (anInt10056 != 0)
				aClass167_Sub3_Sub1_10053.method10564((long) anInt10056);
			anInt10055 = 0;
			anInt10050 = 0;
			anInt10056 = 0;
		}
	}

	public void method129() {
		if (anInt10055 != 0) {
			aClass167_Sub3_Sub1_10053.method10571(anInt10055);
			if (anInt10050 != 0)
				aClass167_Sub3_Sub1_10053.method10564((long) anInt10050);
			if (anInt10056 != 0)
				aClass167_Sub3_Sub1_10053.method10564((long) anInt10056);
			anInt10055 = 0;
			anInt10050 = 0;
			anInt10056 = 0;
		}
	}

	void method9187() {
		method131();
	}

	void method3828(Class536_Sub8_Sub1 class536_sub8_sub1, float f) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class536_sub8_sub1.method10642((byte) -29) != Class273.aClass273_2915) && (class536_sub8_sub1.method10642((byte) -25) != Class273.aClass273_2961))
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method3806(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		if (!$assertionsDisabled && (class536_sub8_sub1.method10642((byte) -22) != Class273.aClass273_2934))
			throw new AssertionError();
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class443.method5377(aFloatArray10061), 0);
	}

	public boolean method3818() {
		if (aBool10057)
			return true;
		aClass167_Sub3_Sub1_10053.aClass285_Sub2_11442 = null;
		anInt10050 = method9185(35633, aString10066, aString3189);
		anInt10056 = method9185(35632, aString10067, aString3190);
		if (anInt10050 == 0 || anInt10056 == 0) {
			if (anInt10050 != 0)
				OpenGL.glDeleteShader(anInt10050);
			if (anInt10056 != 0)
				OpenGL.glDeleteShader(anInt10056);
			return false;
		}
		anInt10055 = OpenGL.glCreateProgram();
		if (anInt10050 != 0)
			OpenGL.glAttachShader(anInt10055, anInt10050);
		if (anInt10056 != 0)
			OpenGL.glAttachShader(anInt10055, anInt10056);
		OpenGL.glLinkProgram(anInt10055);
		OpenGL.glGetProgramiv(anInt10055, 35714, anIntArray10063, 0);
		if (anIntArray10063[0] == 0) {
			if (anInt10050 != 0) {
				OpenGL.glDetachShader(anInt10055, anInt10050);
				OpenGL.glDeleteShader(anInt10050);
			}
			if (anInt10056 != 0) {
				OpenGL.glDetachShader(anInt10055, anInt10056);
				OpenGL.glDeleteShader(anInt10056);
			}
			OpenGL.glDeleteProgram(anInt10055);
			return false;
		}
		OpenGL.glUseProgram(anInt10055);
		int i = -1;
		for (int i_22_ = 0; i_22_ < aClass286_Sub2_10054.method3848(1606328444); i_22_++) {
			if (aClass286_Sub2_10054.method3871(i_22_, -701310166) == this) {
				i = i_22_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_23_ = 0; i_23_ < aClass286_Sub2_10054.method3869(-1625121039); i_23_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub2_10054.method3870(i_23_, 1957590239);
			if (class536_sub8_sub1 != null)
				class536_sub8_sub1.method10640(i);
		}
		for (int i_24_ = 0; i_24_ < aClass286_Sub2_10054.method3876((byte) 35); i_24_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub2_10054.method3893(i_24_, (byte) 5);
			if (class536_sub8_sub1 != null)
				class536_sub8_sub1.method10640(i);
		}
		aString10066 = null;
		aString10067 = null;
		aBool10057 = true;
		return true;
	}

	Class285_Sub2(Class167_Sub3_Sub1 class167_sub3_sub1, Class286_Sub2 class286_sub2, Class264 class264) {
		this(class167_sub3_sub1, class264);
		aClass286_Sub2_10054 = class286_sub2;
		aClass167_Sub3_Sub1_10053 = class167_sub3_sub1;
	}

	void method3832(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_25_, float f_26_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || aMap10064.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_25_) || (((Float) aMap10064.get(Integer.valueOf(i))).floatValue() != f_26_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_25_));
				aMap10064.put(Integer.valueOf(i), Float.valueOf(f_26_));
				if (class536_sub8_sub1.method10642((byte) -24) != Class273.aClass273_3009)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform3f(i, f, f_25_, f_26_);
			}
		}
	}

	void method3800(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_27_, float f_28_, float f_29_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || aMap10064.get(Integer.valueOf(i)) == null || aMap10062.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_27_) || (((Float) aMap10064.get(Integer.valueOf(i))).floatValue() != f_28_) || (((Float) aMap10062.get(Integer.valueOf(i))).floatValue() != f_29_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_27_));
				aMap10064.put(Integer.valueOf(i), Float.valueOf(f_28_));
				aMap10062.put(Integer.valueOf(i), Float.valueOf(f_29_));
				if (class536_sub8_sub1.method10642((byte) 53) != Class273.aClass273_2918)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform4f(i, f, f_27_, f_28_, f_29_);
			}
		}
	}

	void method3823(int i, float[] fs, int i_30_) {
		OpenGL.glUniform4fv(i, i_30_, fs, 0);
	}

	void method3807(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		if (!$assertionsDisabled && (class536_sub8_sub1.method10642((byte) -65) != Class273.aClass273_2934))
			throw new AssertionError();
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class443.method5377(aFloatArray10061), 0);
	}

	void method3792(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		if (!$assertionsDisabled && (class536_sub8_sub1.method10642((byte) 16) != Class273.aClass273_2934))
			throw new AssertionError();
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class443.method5377(aFloatArray10061), 0);
	}

	void method3809(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		int i_31_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_31_ != -1) {
			if (interface40 == null)
				interface40 = aClass167_Sub3_Sub1_10053.anInterface36_9691;
			if (i < aClass167_Sub3_Sub1_10053.anInt9690) {
				aClass167_Sub3_Sub1_10053.method8780(i);
				aClass167_Sub3_Sub1_10053.method8781(interface40);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class493) interface40).anInt5531, ((Class493) interface40).anInt5530);
			}
			if (aMap10065.get(Integer.valueOf(i_31_)) == null || ((Integer) aMap10065.get(Integer.valueOf(i_31_))).intValue() != i) {
				aMap10065.put(Integer.valueOf(i_31_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_31_, i);
			}
		}
	}

	void method3810(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		int i_32_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_32_ != -1) {
			if (interface40 == null)
				interface40 = aClass167_Sub3_Sub1_10053.anInterface36_9691;
			if (i < aClass167_Sub3_Sub1_10053.anInt9690) {
				aClass167_Sub3_Sub1_10053.method8780(i);
				aClass167_Sub3_Sub1_10053.method8781(interface40);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class493) interface40).anInt5531, ((Class493) interface40).anInt5530);
			}
			if (aMap10065.get(Integer.valueOf(i_32_)) == null || ((Integer) aMap10065.get(Integer.valueOf(i_32_))).intValue() != i) {
				aMap10065.put(Integer.valueOf(i_32_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_32_, i);
			}
		}
	}

	void method3834(int i, float f, float f_33_, float f_34_) {
		OpenGL.glUniform3f(i, f, f_33_, f_34_);
	}

	void method3812(int i, float f, float f_35_, float f_36_) {
		OpenGL.glUniform3f(i, f, f_35_, f_36_);
	}

	void method3813(int i, float f, float f_37_, float f_38_) {
		OpenGL.glUniform3f(i, f, f_37_, f_38_);
	}

	void method3820(int i, float f, float f_39_, float f_40_, float f_41_) {
		OpenGL.glUniform4f(i, f, f_39_, f_40_, f_41_);
	}

	void method3821(int i, float f, float f_42_, float f_43_, float f_44_) {
		OpenGL.glUniform4f(i, f, f_42_, f_43_, f_44_);
	}

	void method3816(int i, float f, float f_45_, float f_46_) {
		OpenGL.glUniform3f(i, f, f_45_, f_46_);
	}

	void method3817(int i, float f, float f_47_, float f_48_, float f_49_) {
		OpenGL.glUniform4f(i, f, f_47_, f_48_, f_49_);
	}

	void method3808(int i, float[] fs, int i_50_) {
		OpenGL.glUniform4fv(i, i_50_, fs, 0);
	}

	void method3819(int i, float f, float f_51_, float f_52_, float f_53_) {
		OpenGL.glUniform4f(i, f, f_51_, f_52_, f_53_);
	}

	void method3815(int i, float f, float f_54_, float f_55_, float f_56_) {
		OpenGL.glUniform4f(i, f, f_54_, f_55_, f_56_);
	}

	public boolean method3785() {
		if (aBool10057)
			return true;
		aClass167_Sub3_Sub1_10053.aClass285_Sub2_11442 = null;
		anInt10050 = method9185(35633, aString10066, aString3189);
		anInt10056 = method9185(35632, aString10067, aString3190);
		if (anInt10050 == 0 || anInt10056 == 0) {
			if (anInt10050 != 0)
				OpenGL.glDeleteShader(anInt10050);
			if (anInt10056 != 0)
				OpenGL.glDeleteShader(anInt10056);
			return false;
		}
		anInt10055 = OpenGL.glCreateProgram();
		if (anInt10050 != 0)
			OpenGL.glAttachShader(anInt10055, anInt10050);
		if (anInt10056 != 0)
			OpenGL.glAttachShader(anInt10055, anInt10056);
		OpenGL.glLinkProgram(anInt10055);
		OpenGL.glGetProgramiv(anInt10055, 35714, anIntArray10063, 0);
		if (anIntArray10063[0] == 0) {
			if (anInt10050 != 0) {
				OpenGL.glDetachShader(anInt10055, anInt10050);
				OpenGL.glDeleteShader(anInt10050);
			}
			if (anInt10056 != 0) {
				OpenGL.glDetachShader(anInt10055, anInt10056);
				OpenGL.glDeleteShader(anInt10056);
			}
			OpenGL.glDeleteProgram(anInt10055);
			return false;
		}
		OpenGL.glUseProgram(anInt10055);
		int i = -1;
		for (int i_57_ = 0; i_57_ < aClass286_Sub2_10054.method3848(2046358189); i_57_++) {
			if (aClass286_Sub2_10054.method3871(i_57_, 1178915739) == this) {
				i = i_57_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_58_ = 0; i_58_ < aClass286_Sub2_10054.method3869(-1493495366); i_58_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub2_10054.method3870(i_58_, 1957590239);
			if (class536_sub8_sub1 != null)
				class536_sub8_sub1.method10640(i);
		}
		for (int i_59_ = 0; i_59_ < aClass286_Sub2_10054.method3876((byte) 124); i_59_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub2_10054.method3893(i_59_, (byte) 5);
			if (class536_sub8_sub1 != null)
				class536_sub8_sub1.method10640(i);
		}
		aString10066 = null;
		aString10067 = null;
		aBool10057 = true;
		return true;
	}

	void method3822(int i, float[] fs, int i_60_) {
		OpenGL.glUniform4fv(i, i_60_, fs, 0);
	}

	void method3814(int i, float f, float f_61_, float f_62_) {
		OpenGL.glUniform3f(i, f, f_61_, f_62_);
	}

	public void method131() {
		if (anInt10055 != 0) {
			aClass167_Sub3_Sub1_10053.method10571(anInt10055);
			if (anInt10050 != 0)
				aClass167_Sub3_Sub1_10053.method10564((long) anInt10050);
			if (anInt10056 != 0)
				aClass167_Sub3_Sub1_10053.method10564((long) anInt10056);
			anInt10055 = 0;
			anInt10050 = 0;
			anInt10056 = 0;
		}
	}

	void method3825(int i, Class443 class443) {
		OpenGL.glUniform3fv(i, 3, class443.method5361(aFloatArray10061), 0);
	}

	void method3836(int i, Class443 class443) {
		OpenGL.glUniform2fv(i, 4, class443.method5363(aFloatArray10061), 0);
	}

	void method3827(int i, Class443 class443) {
		OpenGL.glUniform2fv(i, 4, class443.method5363(aFloatArray10061), 0);
	}

	void method3805(int i, Class443 class443) {
		OpenGL.glUniform4fv(i, 4, class443.method5377(aFloatArray10061), 0);
	}

	void method3811(int i, Class443 class443) {
		OpenGL.glUniform4fv(i, 4, class443.method5377(aFloatArray10061), 0);
	}

	void method3803(int i, int i_63_, Interface40 interface40) {
		aClass167_Sub3_Sub1_10053.method8780(i_63_);
		aClass167_Sub3_Sub1_10053.method8781(interface40);
		OpenGL.glUniform1i(i, i_63_);
	}

	void method3831(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_64_) {
		int i = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i != -1) {
			if (aMap10060.get(Integer.valueOf(i)) == null || aMap10068.get(Integer.valueOf(i)) == null || (((Float) aMap10060.get(Integer.valueOf(i))).floatValue() != f) || (((Float) aMap10068.get(Integer.valueOf(i))).floatValue() != f_64_)) {
				aMap10060.put(Integer.valueOf(i), Float.valueOf(f));
				aMap10068.put(Integer.valueOf(i), Float.valueOf(f_64_));
				if (class536_sub8_sub1.method10642((byte) 86) != Class273.aClass273_3008)
					throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
				OpenGL.glUniform2f(i, f, f_64_);
			}
		}
	}

	public boolean method3801() {
		if (aBool10057)
			return true;
		aClass167_Sub3_Sub1_10053.aClass285_Sub2_11442 = null;
		anInt10050 = method9185(35633, aString10066, aString3189);
		anInt10056 = method9185(35632, aString10067, aString3190);
		if (anInt10050 == 0 || anInt10056 == 0) {
			if (anInt10050 != 0)
				OpenGL.glDeleteShader(anInt10050);
			if (anInt10056 != 0)
				OpenGL.glDeleteShader(anInt10056);
			return false;
		}
		anInt10055 = OpenGL.glCreateProgram();
		if (anInt10050 != 0)
			OpenGL.glAttachShader(anInt10055, anInt10050);
		if (anInt10056 != 0)
			OpenGL.glAttachShader(anInt10055, anInt10056);
		OpenGL.glLinkProgram(anInt10055);
		OpenGL.glGetProgramiv(anInt10055, 35714, anIntArray10063, 0);
		if (anIntArray10063[0] == 0) {
			if (anInt10050 != 0) {
				OpenGL.glDetachShader(anInt10055, anInt10050);
				OpenGL.glDeleteShader(anInt10050);
			}
			if (anInt10056 != 0) {
				OpenGL.glDetachShader(anInt10055, anInt10056);
				OpenGL.glDeleteShader(anInt10056);
			}
			OpenGL.glDeleteProgram(anInt10055);
			return false;
		}
		OpenGL.glUseProgram(anInt10055);
		int i = -1;
		for (int i_65_ = 0; i_65_ < aClass286_Sub2_10054.method3848(1925961871); i_65_++) {
			if (aClass286_Sub2_10054.method3871(i_65_, 437998795) == this) {
				i = i_65_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_66_ = 0; i_66_ < aClass286_Sub2_10054.method3869(-1148050942); i_66_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub2_10054.method3870(i_66_, 1957590239);
			if (class536_sub8_sub1 != null)
				class536_sub8_sub1.method10640(i);
		}
		for (int i_67_ = 0; i_67_ < aClass286_Sub2_10054.method3876((byte) 69); i_67_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub2_10054.method3893(i_67_, (byte) 5);
			if (class536_sub8_sub1 != null)
				class536_sub8_sub1.method10640(i);
		}
		aString10066 = null;
		aString10067 = null;
		aBool10057 = true;
		return true;
	}

	void method3824(int i, float[] fs, int i_68_) {
		OpenGL.glUniform4fv(i, i_68_, fs, 0);
	}

	void method3789(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_69_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_69_ != -1)
			OpenGL.glUniform4fv(i_69_, i, fs, 0);
	}

	void method3826(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_70_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_70_ != -1)
			OpenGL.glUniform4fv(i_70_, i, fs, 0);
	}

	void method3794(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_71_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_71_ != -1)
			OpenGL.glUniform4fv(i_71_, i, fs, 0);
	}

	void method3837(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_72_ = ((Class536_Sub8_Sub1_Sub1) class536_sub8_sub1).method10985();
		if (i_72_ != -1)
			OpenGL.glUniform4fv(i_72_, i, fs, 0);
	}
}

/* Class167_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class167_Sub3_Sub1 extends Class167_Sub3 {
	Class708 aClass708_11425;
	Class708 aClass708_11426 = new Class708();
	Class708 aClass708_11427 = new Class708();
	Class708 aClass708_11428 = new Class708();
	Class708 aClass708_11429 = new Class708();
	Class708 aClass708_11430 = new Class708();
	Class708 aClass708_11431 = new Class708();
	int[] anIntArray11432;
	boolean aBool11433;
	int[] anIntArray11434;
	Class488_Sub1[] aClass488_Sub1Array11435;
	float[] aFloatArray11436;
	boolean aBool11437;
	int anInt11438;
	int[] anIntArray11439;
	boolean aBool11440;
	OpenGL anOpenGL11441;
	Class285_Sub2 aClass285_Sub2_11442;
	boolean aBool11443;
	String aString11444;
	boolean aBool11445;
	int anInt11446;
	boolean aBool11447;
	boolean aBool11448;
	int[] anIntArray11449;
	boolean aBool11450;
	boolean aBool11451;
	long aLong11452;
	boolean aBool11453;
	int anInt11454;
	boolean aBool11455;
	boolean aBool11456;
	String aString11457;
	float[] aFloatArray11458;
	static final int anInt11459 = 3;
	Class143 aClass143_11460;
	Class143 aClass143_11461;
	Class183_Sub2 aClass183_Sub2_11462;
	Class488_Sub2 aClass488_Sub2_11463;
	long[] aLongArray11464;
	boolean aBool11465;
	int anInt11466;
	int anInt11467;

	final Interface41 method8897(boolean bool) {
		return new Class488_Sub2(this, Class171.aClass171_1899, bool);
	}

	public int[] method2171(int i, int i_0_, int i_1_, int i_2_) {
		int[] is = new int[i_1_ * i_2_];
		int i_3_ = aClass183_1849.method2726();
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
			OpenGL.glReadPixelsi(i, i_3_ - i_0_ - i_4_ - 1, i_1_, 1, 32993, anInt11454, is, i_4_ * i_1_);
		return is;
	}

	void method8809(Interface41 interface41) {
		aClass488_Sub2_11463 = (Class488_Sub2) interface41;
		aClass488_Sub2_11463.method5868();
	}

	void method8955() {
		if (aBool9703)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9688 & 0xff) / 255.0F);
		if (anInt9568 > 1) {
			if (aByte9688 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	Interface36 method8842(Class155 class155, int i, int i_5_, boolean bool, float[] fs, int i_6_, int i_7_) {
		return new Class493_Sub3(this, class155, i, i_5_, bool, fs, i_6_, i_7_);
	}

	Class167_Sub3_Sub1(OpenGL opengl, Canvas canvas, long l, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, JS5ResourceProvider class461, int i) {
		super(class174, interface24, interface47, interface48, interface46, class461, i, 1);
		aClass708_11425 = new Class708();
		anIntArray11434 = new int[1000];
		aClass488_Sub1Array11435 = new Class488_Sub1[16];
		new MapBuffer();
		new MapBuffer();
		aFloatArray11436 = new float[4];
		aFloatArray11458 = new float[16];
		aClass143_11460 = null;
		aClass143_11461 = null;
		aClass183_Sub2_11462 = null;
		anIntArray11449 = new int[3];
		aLongArray11464 = new long[3];
		anIntArray11432 = new int[3];
		anInt11466 = 0;
		anInt11467 = 0;
		int[] is = new int[1];
		try {
			anOpenGL11441 = opengl;
			anOpenGL11441.method1241();
			aString11444 = OpenGL.glGetString(7936).toLowerCase();
			aString11457 = OpenGL.glGetString(7937).toLowerCase();
			if (aString11444.indexOf("microsoft") != -1 || aString11444.indexOf("brian paul") != -1 || aString11444.indexOf("mesa") != -1)
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class344.method4483(string.replace('.', ' '), ' ', (byte) -57);
			if (strings.length >= 2) {
				try {
					int i_8_ = Class392.method4867(strings[0], 1613833397);
					int i_9_ = Class392.method4867(strings[1], -2008529146);
					anInt11446 = i_8_ * 10 + i_9_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (anInt11446 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt9690 = is[0];
			if (anInt9690 < 2)
				throw new RuntimeException("");
			anInt9539 = 8;
			aBool11433 = anOpenGL11441.method1240("GL_ARB_vertex_buffer_object");
			aBool9695 = anOpenGL11441.method1240("GL_ARB_multisample");
			aBool9545 = anOpenGL11441.method1240("GL_EXT_blend_func_separate");
			aBool11448 = anOpenGL11441.method1240("GL_ARB_texture_rectangle");
			aBool9622 = anOpenGL11441.method1240("GL_ARB_texture_cube_map");
			aBool11440 = anOpenGL11441.method1240("GL_ARB_texture_non_power_of_two");
			aBool9697 = true;
			aBool11450 = anOpenGL11441.method1240("GL_ARB_vertex_shader");
			aBool11447 = anOpenGL11441.method1240("GL_ARB_vertex_program");
			aBool11465 = anOpenGL11441.method1240("GL_ARB_fragment_shader");
			aBool11453 = anOpenGL11441.method1240("GL_ARB_fragment_program");
			aBool9692 = anOpenGL11441.method1240("GL_EXT_framebuffer_object");
			aBool9693 = aBool9692;
			aBool9658 = anOpenGL11441.method1240("GL_EXT_framebuffer_blit");
			aBool9694 = anOpenGL11441.method1240("GL_EXT_framebuffer_multisample");
			aBool11455 = (anUnsafe9548 != null && (anInt11446 >= 32 || anOpenGL11441.method1240("GL_ARB_sync")));
			anIntArray11439 = new int[anInt9690];
			if (!method8900() || !method8710()) {
				if (!anOpenGL11441.method1240("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!anOpenGL11441.method1240("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			Class497.aString5550.startsWith("mac");
			anInt11454 = Stream.method1276() ? 33639 : 5121;
			if (aString11457.indexOf("radeon") != -1 || aString11444.indexOf("intel") != -1) {
				int i_10_ = 0;
				boolean bool = aString11444.indexOf("intel") != -1;
				boolean bool_11_ = false;
				boolean bool_12_ = false;
				String[] strings_13_ = Class344.method4483(aString11457.replace('/', ' '), ' ', (byte) -105);
				for (int i_14_ = 0; i_14_ < strings_13_.length; i_14_++) {
					String string_15_ = strings_13_[i_14_];
					try {
						if (string_15_.length() <= 0)
							continue;
						if (string_15_.charAt(0) == 'x' && string_15_.length() >= 3 && Class710_Sub30.method10184(string_15_.substring(1, 3), -1506968299)) {
							string_15_ = string_15_.substring(1);
							bool_12_ = true;
						}
						if (string_15_.equals("hd")) {
							bool_11_ = true;
							continue;
						}
						if (string_15_.startsWith("hd")) {
							string_15_ = string_15_.substring(2);
							bool_11_ = true;
						}
						if (string_15_.length() < 4 || !(Class710_Sub30.method10184(string_15_.substring(0, 4), -1506968299)))
							continue;
						i_10_ = Class392.method4867(string_15_.substring(0, 4), -134078902);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (bool) {
					if (!bool_11_)
						aBool9692 = false;
				} else {
					if (!bool_12_ && !bool_11_) {
						if (i_10_ >= 7000 && i_10_ <= 7999)
							aBool11433 = false;
						if (i_10_ >= 7000 && i_10_ <= 9250)
							aBool9697 = false;
					}
					aBool11448 &= anOpenGL11441.method1240("GL_ARB_half_float_pixel");
					aBool11443 = true;
				}
			}
			if (aBool11433) {
				try {
					int[] is_16_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_16_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			method2331(canvas, new Class183_Sub1_Sub1_Sub2(this, canvas, l), 2024498147);
			method2026(canvas, 1212247258);
			method8736(32768, false);
			method8736(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2005(778784407);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	Interface39 method8932(int i, boolean bool, int[][] is) {
		return new Class493_Sub2(this, i, bool, is);
	}

	public Class145 method2001() {
		int i = -1;
		if (aString11444.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11444.indexOf("intel") != -1)
			i = 32902;
		else if (aString11444.indexOf("ati") != -1)
			i = 4098;
		return new Class145(i, method8916() ? "OpenGL FF" : "OpenGL", anInt11446, aString11457, 0L, method8916());
	}

	void method2003(int i, int i_17_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8650();
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(-1182658555);
	}

	public void method2004() {
		OpenGL.glFinish();
	}

	void method8879() {
		OpenGL.glDepthFunc(515);
		method10573();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9695) {
			method8803(anInt9568 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9690 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_18_ = 16384 + i;
			OpenGL.glLightfv(i_18_, 4608, fs, 0);
			OpenGL.glLightf(i_18_, 4615, 0.0F);
			OpenGL.glLightf(i_18_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11441.setSwapInterval(0);
		super.method8717();
	}

	public float method8725() {
		return 0.0F;
	}

	Class183_Sub1 method2131(Canvas canvas, int i, int i_19_) {
		return new Class183_Sub1_Sub1_Sub2(this, canvas);
	}

	public Class183_Sub2 method2304() {
		return new Class183_Sub2_Sub2_Sub1(this);
	}

	public Interface22 method2032(int i, int i_20_, Class155 class155, Class171 class171, int i_21_) {
		return new Class490(this, class155, class171, i, i_20_, i_21_);
	}

	public Interface21 method2386(int i, int i_22_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_22_);
	}

	public Interface21 method2229(int i, int i_23_, int i_24_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_23_, i_24_);
	}

	public int[] method2078(int i, int i_25_, int i_26_, int i_27_) {
		int[] is = new int[i_26_ * i_27_];
		int i_28_ = aClass183_1849.method2726();
		for (int i_29_ = 0; i_29_ < i_27_; i_29_++)
			OpenGL.glReadPixelsi(i, i_28_ - i_25_ - i_29_ - 1, i_26_, 1, 32993, anInt11454, is, i_29_ * i_26_);
		return is;
	}

	void method8980(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	public boolean method2284() {
		return aBool11455;
	}

	public boolean method2036() {
		if (aBool11455 && aLongArray11464[anInt11467] != 0L)
			return false;
		return true;
	}

	public boolean method2037() {
		return true;
	}

	Interface36 method8834(Class155 class155, int i, int i_30_, boolean bool, byte[] is, int i_31_, int i_32_) {
		return new Class493_Sub3(this, class155, i, i_30_, bool, is, i_31_, i_32_);
	}

	public boolean method2176() {
		return aBool11455;
	}

	public void method2041(int i, int i_33_, int i_34_) {
		method2085();
		if (aClass183_Sub2_11462 == null)
			method10570(i_33_, i_34_);
		if (aClass143_11460 == null)
			aClass143_11460 = method2205(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), false);
		else
			aClass143_11460.method1726(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), 0, 0);
		method2028(aClass183_Sub2_11462, -409819235);
		method2000(1, -16777216);
		aClass143_11460.method1724(anInt1872 * 1475697639, anInt1873 * 398729877, anInt1856 * -397142117, anInt1875 * -915384365);
		OpenGL.glBindBufferARB(35051, anIntArray11449[anInt11467]);
		OpenGL.glReadPixelsub(0, 0, anInt1870 * -896601365, anInt1848 * 232979335, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method2029(aClass183_Sub2_11462, (byte) 1);
		aLongArray11464[anInt11467] = OpenGL.glFenceSync(37143, 0);
		anIntArray11432[anInt11467] = i;
		if (++anInt11467 >= 3)
			anInt11467 = 0;
		method2086();
	}

	public void method2040() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11464[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11464[i]);
				aLongArray11464[i] = 0L;
			}
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	Interface44 method8869(Class155 class155, Class171 class171, int i, int i_35_) {
		return new Class493_Sub3(this, class155, class171, i, i_35_);
	}

	public void method8965(int i, Interface38 interface38) {
		aClass488_Sub1Array11435[i] = (Class488_Sub1) interface38;
	}

	long method10558(int i, int i_36_, int[] is, int[] is_37_) {
		if (aBool11455) {
			if (aLongArray11464[anInt11466] != 0L) {
				OpenGL.glDeleteSync(aLongArray11464[anInt11466]);
				aLongArray11464[anInt11466] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray11449[anInt11466]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_38_ = 0; i_38_ < i * i_36_; i_38_++)
					is[i_38_] = anUnsafe9548.getInt(l + (long) (i_38_ * 4));
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt11466 >= 3)
				anInt11466 = 0;
			return l;
		}
		if (aClass143_11461 == null)
			method10570(i, i_36_);
		if (aClass143_11460 == null)
			aClass143_11460 = method2205(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), false);
		else
			aClass143_11460.method1726(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), 0, 0);
		method2028(aClass183_Sub2_11462, -409819235);
		method2000(1, -16777216);
		aClass143_11460.method1724(anInt1872 * 1475697639, anInt1873 * 398729877, anInt1856 * -397142117, anInt1875 * -915384365);
		aClass143_11461.method1761(0, 0, i, i_36_, is, is_37_, 0, i);
		method2029(aClass183_Sub2_11462, (byte) 1);
		return 0L;
	}

	void method8950() {
		OpenGL.glActiveTexture(33984 + anInt9636);
	}

	void method8820() {
		OpenGL.glActiveTexture(33984 + anInt9636);
	}

	public void method2034() {
		if (aClass183_1849 != null) {
			int i = aClass183_1849.method2725();
			int i_39_ = aClass183_1849.method2726();
			if (i > 0 || i_39_ > 0) {
				int i_40_ = anInt9618;
				int i_41_ = anInt9547;
				int i_42_ = anInt9607;
				int i_43_ = anInt9608;
				method2047();
				int i_44_ = anInt9599;
				int i_45_ = anInt9600;
				int i_46_ = anInt9624;
				int i_47_ = anInt9598;
				method2051();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method8745();
				method8799(false);
				method8762(false);
				method8742(false);
				method8760(false);
				method8781(null);
				method8782(1);
				method8763(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_39_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method2369(i_44_, i_46_, i_45_, i_47_);
				method2048(i_40_, i_41_, i_42_, i_43_);
			}
		}
	}

	public Class176 method2112(Class176 class176, Class176 class176_48_, float f, Class176 class176_49_) {
		return f < 0.5F ? class176 : class176_48_;
	}

	public void method2000(int i, int i_50_) {
		int i_51_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_50_ & 0xff0000) / 1.671168E7F, (float) (i_50_ & 0xff00) / 65280.0F, (float) (i_50_ & 0xff) / 255.0F, (float) (i_50_ >>> 24) / 255.0F);
			i_51_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method8760(true);
			i_51_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_51_ |= 0x400;
		OpenGL.glClear(i_51_);
	}

	void method8741() {
		if (aClass183_1849 != null)
			OpenGL.glViewport(anInt9609 + anInt9618, (anInt9610 + aClass183_1849.method2726() - anInt9547 - anInt9608), anInt9607, anInt9608);
		OpenGL.glDepthRange(aFloat9591, aFloat9592);
	}

	void method8824() {
		if (aClass183_1849 != null) {
			int i = anInt9609 + anInt9599;
			int i_52_ = anInt9610 + aClass183_1849.method2726() - anInt9598;
			int i_53_ = anInt9600 - anInt9599;
			int i_54_ = anInt9598 - anInt9624;
			if (i_53_ < 0)
				i_53_ = 0;
			if (i_54_ < 0)
				i_54_ = 0;
			OpenGL.glScissor(i, i_52_, i_53_, i_54_);
		}
	}

	public void method8759(Class443 class443, Class443 class443_55_, Class443 class443_56_) {
		OpenGL.glMatrixMode(5888);
		aClass443_9570.method5383(class443, class443_55_);
		OpenGL.glLoadMatrixf(aClass443_9570.aFloatArray4878, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class443_56_.aFloatArray4878, 0);
	}

	public void method8721(Class443 class443) {
		float[] fs = class443.aFloatArray4878;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public void method8937() {
		int i = anIntArray11439[anInt9636];
		if (i != 0) {
			anIntArray11439[anInt9636] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	public int method2184() {
		if (aBool11455) {
			if (aLongArray11464[anInt11466] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11464[anInt11466], 0, 0);
			if (i == 37149) {
				method2040();
				return -1;
			}
			return i != 37147 ? anIntArray11432[anInt11466] : -1;
		}
		return -1;
	}

	void method8764() {
		if (aBool9700 && !aBool9617)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method8765() {
		aFloatArray11436[0] = aFloat9626 * aFloat9678;
		aFloatArray11436[1] = aFloat9626 * aFloat9649;
		aFloatArray11436[2] = aFloat9626 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11436, 0);
	}

	void method8822() {
		aFloatArray11436[0] = aFloat9573 * aFloat9678;
		aFloatArray11436[1] = aFloat9573 * aFloat9649;
		aFloatArray11436[2] = aFloat9573 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11436, 0);
		aFloatArray11436[0] = -aFloat9579 * aFloat9678;
		aFloatArray11436[1] = -aFloat9579 * aFloat9649;
		aFloatArray11436[2] = -aFloat9579 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11436, 0);
	}

	public void method2393() {
		if (aBool11455) {
			aClass143_11460 = null;
			if (aClass183_Sub2_11462 != null) {
				aClass183_Sub2_11462.method131();
				aClass183_Sub2_11462 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11449, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11449[i] = 0;
				if (aLongArray11464[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11464[i]);
					aLongArray11464[i] = 0L;
				}
			}
		} else {
			aClass183_Sub2_11462 = null;
			aClass143_11461 = null;
			aClass143_11460 = null;
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	public void method8983(Class343 class343) {
		Class362[] class362s = class343.aClass362Array3664;
		int i = 0;
		boolean bool = false;
		boolean bool_57_ = false;
		boolean bool_58_ = false;
		for (int i_59_ = 0; i_59_ < class362s.length; i_59_++) {
			Class362 class362 = class362s[i_59_];
			Class488_Sub1 class488_sub1 = aClass488_Sub1Array11435[i_59_];
			int i_60_ = 0;
			int i_61_ = class488_sub1.method9210();
			long l = class488_sub1.method5864();
			class488_sub1.method5868();
			for (int i_62_ = 0; i_62_ < class362.method4760(); i_62_++) {
				Class355 class355 = class362.method4759(i_62_);
				switch (class355.anInt3769) {
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_61_, l + (long) i_60_);
					bool_58_ = true;
					break;
				case 6:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_61_, l + (long) i_60_);
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_61_, l + (long) i_60_);
					break;
				case 11:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_61_, l + (long) i_60_);
					break;
				default:
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_61_, l + (long) i_60_);
					break;
				case 9:
					OpenGL.glNormalPointer(5126, i_61_, l + (long) i_60_);
					bool_57_ = true;
					break;
				case 10:
					OpenGL.glColorPointer(4, 5121, i_61_, l + (long) i_60_);
					bool = true;
				}
				i_60_ += class355.anInt3773;
			}
		}
		if (aBool11445 != bool_58_) {
			if (bool_58_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11445 = bool_58_;
		}
		if (aBool11451 != bool_57_) {
			if (bool_57_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11451 = bool_57_;
		}
		if (aBool11437 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11437 = bool;
		}
		if (anInt11438 < i) {
			for (int i_63_ = anInt11438; i_63_ < i; i_63_++) {
				OpenGL.glClientActiveTexture(33984 + i_63_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11438 = i;
		} else if (anInt11438 > i) {
			for (int i_64_ = i; i_64_ < anInt11438; i_64_++) {
				OpenGL.glClientActiveTexture(33984 + i_64_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11438 = i;
		}
	}

	void method8766() {
		/* empty */
	}

	void method8984() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_65_ = class536_sub19.method9528(-676299569);
			int i_66_ = 16386 + i;
			float f = class536_sub19.method9531(1302327648) / 255.0F;
			aFloatArray11436[0] = (float) class536_sub19.method9548(-1172197606);
			aFloatArray11436[1] = (float) class536_sub19.method9549(130208290);
			aFloatArray11436[2] = (float) class536_sub19.method9551((byte) 0);
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_66_, 4611, aFloatArray11436, 0);
			aFloatArray11436[0] = (float) (i_65_ >> 16 & 0xff) * f;
			aFloatArray11436[1] = (float) (i_65_ >> 8 & 0xff) * f;
			aFloatArray11436[2] = (float) (i_65_ & 0xff) * f;
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_66_, 4609, aFloatArray11436, 0);
			OpenGL.glLightf(i_66_, 4617, (1.0F / (float) (class536_sub19.method9530(709506739) * class536_sub19.method9530(-1814047962))));
			OpenGL.glEnable(i_66_);
		}
		for (/**/; i < anInt9630; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method8769(Class155 class155, Class171 class171) {
		return true;
	}

	static final int method10559(Class379 class379) {
		if (class379 == Class379.aClass379_3924)
			return 5890;
		if (class379 == Class379.aClass379_3925)
			return 34167;
		if (class379 == Class379.aClass379_3926)
			return 34168;
		if (class379 == Class379.aClass379_3923)
			return 34166;
		throw new IllegalArgumentException();
	}

	Interface36 method8774(Class155 class155, Class171 class171, int i, int i_67_) {
		return method8779(class155, class171, i, i_67_);
	}

	Interface36 method8776(int i, int i_68_, boolean bool, int[] is, int i_69_, int i_70_) {
		return new Class493_Sub3(this, i, i_68_, bool, is, i_69_, i_70_);
	}

	Interface36 method8775(Class155 class155, int i, int i_71_, boolean bool, byte[] is, int i_72_, int i_73_) {
		return new Class493_Sub3(this, class155, i, i_71_, bool, is, i_72_, i_73_);
	}

	Interface36 method8938(Class155 class155, int i, int i_74_, boolean bool, float[] fs, int i_75_, int i_76_) {
		return new Class493_Sub3(this, class155, i, i_74_, bool, fs, i_75_, i_76_);
	}

	Interface44 method8779(Class155 class155, Class171 class171, int i, int i_77_) {
		return new Class493_Sub3(this, class155, class171, i, i_77_);
	}

	final void method8940(int i, Class379 class379, boolean bool, boolean bool_78_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10559(class379));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_78_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_78_ ? 769 : 768);
	}

	Interface34 method8870(Class155 class155, int i, int i_79_, int i_80_, boolean bool, byte[] is) {
		return new Class493_Sub1(this, class155, i, i_79_, i_80_, bool, is);
	}

	public void method8827() {
		int i = anIntArray11439[anInt9636];
		if (i != 0) {
			anIntArray11439[anInt9636] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	final Interface38 method8961(boolean bool) {
		return new Class488_Sub1(this, bool);
	}

	void method8977(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method8793() {
		OpenGL.glTexEnvi(8960, 34161, method10569(aClass371Array9640[anInt9636]));
	}

	void method8913() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9542, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9619, 0);
	}

	final void method8785(int i, Class379 class379, boolean bool, boolean bool_81_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10559(class379));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_81_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_81_ ? 769 : 768);
	}

	final void method8954(int i, Class379 class379, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method10559(class379));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method8791() {
		aFloatArray11436[0] = (float) (anInt9642 & 0xff0000) / 1.671168E7F;
		aFloatArray11436[1] = (float) (anInt9642 & 0xff00) / 65280.0F;
		aFloatArray11436[2] = (float) (anInt9642 & 0xff) / 255.0F;
		aFloatArray11436[3] = (float) (anInt9642 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11436, 0);
	}

	void method8922() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_82_ = class536_sub19.method9528(-737718333);
			int i_83_ = 16386 + i;
			float f = class536_sub19.method9531(1355057823) / 255.0F;
			aFloatArray11436[0] = (float) class536_sub19.method9548(-89372660);
			aFloatArray11436[1] = (float) class536_sub19.method9549(328165210);
			aFloatArray11436[2] = (float) class536_sub19.method9551((byte) 0);
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_83_, 4611, aFloatArray11436, 0);
			aFloatArray11436[0] = (float) (i_82_ >> 16 & 0xff) * f;
			aFloatArray11436[1] = (float) (i_82_ >> 8 & 0xff) * f;
			aFloatArray11436[2] = (float) (i_82_ & 0xff) * f;
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_83_, 4609, aFloatArray11436, 0);
			OpenGL.glLightf(i_83_, 4617, (1.0F / (float) (class536_sub19.method9530(-2092913375) * class536_sub19.method9530(901522043))));
			OpenGL.glEnable(i_83_);
		}
		for (/**/; i < anInt9630; i++)
			OpenGL.glDisable(16386 + i);
	}

	void method8947() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9542, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9619, 0);
	}

	void method8911() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9542, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9619, 0);
	}

	void method8787() {
		if (aBool9703)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9688 & 0xff) / 255.0F);
		if (anInt9568 > 1) {
			if (aByte9688 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method8828() {
		if (aBool9545) {
			int i = 0;
			int i_84_ = 0;
			if (anInt9560 == 0) {
				i = 0;
				i_84_ = 0;
			} else if (anInt9560 == 1) {
				i = 1;
				i_84_ = 0;
			} else if (anInt9560 == 2) {
				i = 1;
				i_84_ = 1;
			} else if (anInt9560 == 3) {
				i = 0;
				i_84_ = 1;
			}
			if (aClass365_9679 == Class365.aClass365_3843)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_84_);
			else if (aClass365_9679 == Class365.aClass365_3840)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_84_);
			else if (aClass365_9679 == Class365.aClass365_3841)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_84_);
			else if (aClass365_9679 == Class365.aClass365_3842)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_84_);
		} else if (aClass365_9679 == Class365.aClass365_3843) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass365_9679 == Class365.aClass365_3840) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass365_9679 == Class365.aClass365_3841) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	void method8722() {
		OpenGL.glDepthMask(aBool9611 && aBool9653);
	}

	void method8949() {
		OpenGL.glActiveTexture(33984 + anInt9636);
	}

	void method8802() {
		if (aBool9671 && aBool9674 && anInt9550 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public boolean method2064() {
		return false;
	}

	public int method2149() {
		if (aBool11455) {
			if (aLongArray11464[anInt11466] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11464[anInt11466], 0, 0);
			if (i == 37149) {
				method2040();
				return -1;
			}
			return i != 37147 ? anIntArray11432[anInt11466] : -1;
		}
		return -1;
	}

	final Interface38 method8805(boolean bool) {
		return new Class488_Sub1(this, bool);
	}

	final Interface41 method8804(boolean bool) {
		return new Class488_Sub2(this, Class171.aClass171_1899, bool);
	}

	Class343 method8806(Class362[] class362s) {
		return new Class343_Sub2(class362s);
	}

	public void method8808(int i, Interface38 interface38) {
		aClass488_Sub1Array11435[i] = (Class488_Sub1) interface38;
	}

	void method8778() {
		OpenGL.glMatrixMode(5890);
		if (aClass367Array9639[anInt9636] != Class367.aClass367_3860)
			OpenGL.glLoadMatrixf(aClass443Array9638[anInt9636].method5377(aFloatArray11458), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public void method8807(Class343 class343) {
		Class362[] class362s = class343.aClass362Array3664;
		int i = 0;
		boolean bool = false;
		boolean bool_85_ = false;
		boolean bool_86_ = false;
		for (int i_87_ = 0; i_87_ < class362s.length; i_87_++) {
			Class362 class362 = class362s[i_87_];
			Class488_Sub1 class488_sub1 = aClass488_Sub1Array11435[i_87_];
			int i_88_ = 0;
			int i_89_ = class488_sub1.method9210();
			long l = class488_sub1.method5864();
			class488_sub1.method5868();
			for (int i_90_ = 0; i_90_ < class362.method4760(); i_90_++) {
				Class355 class355 = class362.method4759(i_90_);
				switch (class355.anInt3769) {
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_89_, l + (long) i_88_);
					bool_86_ = true;
					break;
				case 6:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_89_, l + (long) i_88_);
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_89_, l + (long) i_88_);
					break;
				case 11:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_89_, l + (long) i_88_);
					break;
				default:
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_89_, l + (long) i_88_);
					break;
				case 9:
					OpenGL.glNormalPointer(5126, i_89_, l + (long) i_88_);
					bool_85_ = true;
					break;
				case 10:
					OpenGL.glColorPointer(4, 5121, i_89_, l + (long) i_88_);
					bool = true;
				}
				i_88_ += class355.anInt3773;
			}
		}
		if (aBool11445 != bool_86_) {
			if (bool_86_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11445 = bool_86_;
		}
		if (aBool11451 != bool_85_) {
			if (bool_85_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11451 = bool_85_;
		}
		if (aBool11437 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11437 = bool;
		}
		if (anInt11438 < i) {
			for (int i_91_ = anInt11438; i_91_ < i; i_91_++) {
				OpenGL.glClientActiveTexture(33984 + i_91_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11438 = i;
		} else if (anInt11438 > i) {
			for (int i_92_ = i; i_92_ < anInt11438; i_92_++) {
				OpenGL.glClientActiveTexture(33984 + i_92_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11438 = i;
		}
	}

	void method8847() {
		if (aClass183_1849 != null)
			OpenGL.glViewport(anInt9609 + anInt9618, (anInt9610 + aClass183_1849.method2726() - anInt9547 - anInt9608), anInt9607, anInt9608);
		OpenGL.glDepthRange(aFloat9591, aFloat9592);
	}

	void method8890() {
		if (aBool9554)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	public final void method8817(Class377 class377, int i, int i_93_, int i_94_, int i_95_) {
		int i_96_;
		int i_97_;
		if (class377 == Class377.aClass377_3914) {
			i_96_ = 1;
			i_97_ = i_95_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_96_ = 3;
			i_97_ = i_95_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_96_ = 4;
			i_97_ = i_95_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_96_ = 6;
			i_97_ = i_95_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_96_ = 5;
			i_97_ = i_95_ + 2;
		} else {
			i_96_ = 0;
			i_97_ = i_95_;
		}
		Class171 class171 = aClass488_Sub2_11463.method281();
		OpenGL.glDrawElements(i_96_, i_97_, method10565(class171), (aClass488_Sub2_11463.method5864() + (long) (i_94_ * (class171.anInt1898 * -147747987))));
	}

	public void method2044(int i, int i_98_, int[] is, int[] is_99_) {
		method10558(i, i_98_, is, is_99_);
	}

	final synchronized void method10560(int i, int i_100_) {
		IntParam class536_sub26 = new IntParam(i_100_);
		class536_sub26.aLong7133 = (long) i * -6756113042487376355L;
		aClass708_11427.method8335(class536_sub26, -1157652688);
	}

	final synchronized void method10561(int i, int i_101_) {
		IntParam class536_sub26 = new IntParam(i_101_);
		class536_sub26.aLong7133 = (long) i * -6756113042487376355L;
		aClass708_11428.method8335(class536_sub26, -382306705);
	}

	final synchronized void method10562(int i) {
		IntParam class536_sub26 = new IntParam(i);
		aClass708_11429.method8335(class536_sub26, 13480224);
	}

	final synchronized void method10563(int i, int i_102_) {
		IntParam class536_sub26 = new IntParam(i_102_);
		class536_sub26.aLong7133 = (long) i * -6756113042487376355L;
		aClass708_11430.method8335(class536_sub26, -644109518);
	}

	final synchronized void method10564(long l) {
		Class536 class536 = new Class536();
		class536.aLong7133 = l * -6756113042487376355L;
		aClass708_11425.method8335(class536, -1678181030);
	}

	void method8792() {
		OpenGL.glActiveTexture(33984 + anInt9636);
	}

	static final int method10565(Class171 class171) {
		switch (class171.anInt1904 * 608193561) {
		case 8:
			return 5120;
		case 6:
			return 5123;
		case 3:
			return 5122;
		case 5:
			return 5125;
		case 7:
			return 5131;
		case 2:
			return 5121;
		default:
			return 5121;
		case 1:
			return 5124;
		case 0:
			return 5126;
		}
	}

	static int method10566(Class155 class155) {
		switch (class155.anInt1723 * 1319222349) {
		case 7:
			return 6408;
		case 0:
			return 6409;
		case 8:
			return 6402;
		default:
			throw new IllegalStateException();
		case 2:
			return 6407;
		case 9:
			return 6406;
		case 1:
			return 6410;
		}
	}

	static int method10567(Class155 class155, Class171 class171) {
		if (class171 == Class171.aClass171_1905) {
			switch (class155.anInt1723 * 1319222349) {
			case 2:
				return 6407;
			case 4:
				return 33777;
			default:
				throw new IllegalArgumentException();
			case 9:
				return 6406;
			case 0:
				return 6409;
			case 6:
				return 33779;
			case 7:
				return 6408;
			case 1:
				return 6410;
			}
		}
		if (class171 == Class171.aClass171_1899) {
			switch (class155.anInt1723 * 1319222349) {
			case 2:
				return 32852;
			case 1:
				return 36219;
			case 0:
				return 32834;
			case 7:
				return 32859;
			case 9:
				return 32830;
			default:
				throw new IllegalArgumentException();
			case 8:
				return 33189;
			}
		}
		if (class171 == Class171.aClass171_1895) {
			switch (class155.anInt1723 * 1319222349) {
			default:
				throw new IllegalArgumentException();
			case 8:
				return 33190;
			}
		}
		if (class171 == Class171.aClass171_1901) {
			switch (class155.anInt1723 * 1319222349) {
			default:
				throw new IllegalArgumentException();
			case 8:
				return 33191;
			}
		}
		if (class171 == Class171.aClass171_1902) {
			switch (class155.anInt1723 * 1319222349) {
			case 9:
				return 34844;
			case 7:
				return 34842;
			case 1:
				return 34847;
			case 0:
				return 34846;
			default:
				throw new IllegalArgumentException();
			case 2:
				return 34843;
			}
		}
		if (class171 == Class171.aClass171_1903) {
			switch (class155.anInt1723 * 1319222349) {
			case 2:
				return 34837;
			case 9:
				return 34838;
			case 0:
				return 34840;
			default:
				throw new IllegalArgumentException();
			case 7:
				return 34836;
			case 1:
				return 34841;
			}
		}
		throw new IllegalArgumentException();
	}

	public int[] method2172(int i, int i_103_, int i_104_, int i_105_) {
		int[] is = new int[i_104_ * i_105_];
		int i_106_ = aClass183_1849.method2726();
		for (int i_107_ = 0; i_107_ < i_105_; i_107_++)
			OpenGL.glReadPixelsi(i, i_106_ - i_103_ - i_107_ - 1, i_104_, 1, 32993, anInt11454, is, i_107_ * i_104_);
		return is;
	}

	void method10568() {
		int i = 0;
		while (!anOpenGL11441.method1241()) {
			if (i++ > 5)
				throw new RuntimeException("");
			Class212.method3067(1000L);
		}
	}

	void method8711(int i) {
		if (!aBool11456)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public String method2018() {
		String string = "Caps: 4:";
		String string_108_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_108_).toString();
		string = new StringBuilder().append(string).append(anInt11454).append(string_108_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_108_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool11447 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool11453 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool11450 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool11465 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool11448 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool11440 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_108_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	public Class145 method2135() {
		int i = -1;
		if (aString11444.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11444.indexOf("intel") != -1)
			i = 32902;
		else if (aString11444.indexOf("ati") != -1)
			i = 4098;
		return new Class145(i, method8916() ? "OpenGL FF" : "OpenGL", anInt11446, aString11457, 0L, method8916());
	}

	void method2136(int i, int i_109_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8650();
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(514162616);
	}

	void method2137(int i, int i_110_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8650();
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(-613938875);
	}

	void method2138(int i, int i_111_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8650();
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(1748707719);
	}

	void method2139(int i, int i_112_) throws Exception_Sub5 {
		aClass183_Sub1_1866.method8650();
		if (anInterface24_1851 != null)
			anInterface24_1851.method29(-1563453094);
	}

	public void method2140() {
		OpenGL.glFinish();
	}

	public void method2141() {
		OpenGL.glFinish();
	}

	void method8945() {
		if (aBool9715)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public String method2164() {
		String string = "Caps: 4:";
		String string_113_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_113_).toString();
		string = new StringBuilder().append(string).append(anInt11454).append(string_113_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_113_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool11447 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool11453 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool11450 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool11465 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool11448 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool11440 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_113_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	void method8912() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9542, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9619, 0);
	}

	public void method2350(int i, int i_114_, int[] is, int[] is_115_) {
		method10558(i, i_114_, is, is_115_);
	}

	static final int method10569(Class371 class371) {
		if (class371 == Class371.aClass371_3882)
			return 7681;
		if (class371 == Class371.aClass371_3880)
			return 8448;
		if (class371 == Class371.aClass371_3884)
			return 34165;
		if (class371 == Class371.aClass371_3883)
			return 260;
		if (class371 == Class371.aClass371_3881)
			return 34023;
		throw new IllegalArgumentException();
	}

	public int[] method2170(int i, int i_116_, int i_117_, int i_118_) {
		int[] is = new int[i_117_ * i_118_];
		int i_119_ = aClass183_1849.method2726();
		for (int i_120_ = 0; i_120_ < i_118_; i_120_++)
			OpenGL.glReadPixelsi(i, i_119_ - i_116_ - i_120_ - 1, i_117_, 1, 32993, anInt11454, is, i_120_ * i_117_);
		return is;
	}

	Interface36 method8926(Class155 class155, int i, int i_121_, boolean bool, byte[] is, int i_122_, int i_123_) {
		return new Class493_Sub3(this, class155, i, i_121_, bool, is, i_122_, i_123_);
	}

	void method8832() {
		OpenGL.glActiveTexture(33984 + anInt9636);
	}

	public int[] method2173(int i, int i_124_, int i_125_, int i_126_) {
		int[] is = new int[i_125_ * i_126_];
		int i_127_ = aClass183_1849.method2726();
		for (int i_128_ = 0; i_128_ < i_126_; i_128_++)
			OpenGL.glReadPixelsi(i, i_127_ - i_124_ - i_128_ - 1, i_125_, 1, 32993, anInt11454, is, i_128_ * i_125_);
		return is;
	}

	public void method2117() {
		if (aClass183_1849 != null) {
			int i = aClass183_1849.method2725();
			int i_129_ = aClass183_1849.method2726();
			if (i > 0 || i_129_ > 0) {
				int i_130_ = anInt9618;
				int i_131_ = anInt9547;
				int i_132_ = anInt9607;
				int i_133_ = anInt9608;
				method2047();
				int i_134_ = anInt9599;
				int i_135_ = anInt9600;
				int i_136_ = anInt9624;
				int i_137_ = anInt9598;
				method2051();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method8745();
				method8799(false);
				method8762(false);
				method8742(false);
				method8760(false);
				method8781(null);
				method8782(1);
				method8763(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_129_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method2369(i_134_, i_136_, i_135_, i_137_);
				method2048(i_130_, i_131_, i_132_, i_133_);
			}
		}
	}

	void method10570(int i, int i_138_) {
		method2393();
		method2045(i, i_138_, -2051792599);
		if (aBool11455) {
			aClass143_11461 = method2050(i, i_138_, false, true);
			aClass183_Sub2_11462 = method2304();
			aClass183_Sub2_11462.method9035(0, aClass143_11461.method1782());
			OpenGL.glGenBuffersARB(3, anIntArray11449, 0);
			for (int i_139_ = 0; i_139_ < 3; i_139_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11449[i_139_]);
				OpenGL.glBufferDataARBa(35051, i * i_138_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass143_11461 = method2050(i, i_138_, false, true);
			aClass183_Sub2_11462 = method2304();
			aClass183_Sub2_11462.method9035(0, aClass143_11461.method1782());
		}
	}

	public boolean method2346() {
		return aBool11455;
	}

	public boolean method2179() {
		return true;
	}

	Interface36 method8930(int i, int i_140_, boolean bool, int[] is, int i_141_, int i_142_) {
		return new Class493_Sub3(this, i, i_140_, bool, is, i_141_, i_142_);
	}

	public boolean method8866(boolean bool) {
		return true;
	}

	public int method2392() {
		if (aBool11455) {
			if (aLongArray11464[anInt11466] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11464[anInt11466], 0, 0);
			if (i == 37149) {
				method2040();
				return -1;
			}
			return i != 37147 ? anIntArray11432[anInt11466] : -1;
		}
		return -1;
	}

	public int method2183() {
		if (aBool11455) {
			if (aLongArray11464[anInt11466] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11464[anInt11466], 0, 0);
			if (i == 37149) {
				method2040();
				return -1;
			}
			return i != 37147 ? anIntArray11432[anInt11466] : -1;
		}
		return -1;
	}

	public final synchronized void method2378(int i) {
		try {
			method10568();
		} catch (Exception exception) {
			return;
		}
		int i_143_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11427.method8313(686244725)) {
			IntParam class536_sub26 = (IntParam) aClass708_11427.method8305(1536224423);
			anIntArray11434[i_143_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9557 -= class536_sub26.value * 2083602213;
			if (i_143_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_143_, anIntArray11434, 0);
				i_143_ = 0;
			}
		}
		if (i_143_ > 0) {
			OpenGL.glDeleteBuffersARB(i_143_, anIntArray11434, 0);
			i_143_ = 0;
		}
		while (!aClass708_11428.method8313(342978512)) {
			IntParam class536_sub26 = (IntParam) aClass708_11428.method8305(-1989809503);
			anIntArray11434[i_143_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9556 -= class536_sub26.value * 2083602213;
			if (i_143_ == 1000) {
				OpenGL.glDeleteTextures(i_143_, anIntArray11434, 0);
				i_143_ = 0;
			}
		}
		if (i_143_ > 0) {
			OpenGL.glDeleteTextures(i_143_, anIntArray11434, 0);
			i_143_ = 0;
		}
		while (!aClass708_11429.method8313(58991542)) {
			IntParam class536_sub26 = (IntParam) aClass708_11429.method8305(-1935080411);
			anIntArray11434[i_143_++] = class536_sub26.value * 2083602213;
			if (i_143_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_143_, anIntArray11434, 0);
				i_143_ = 0;
			}
		}
		if (i_143_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_143_, anIntArray11434, 0);
			i_143_ = 0;
		}
		while (!aClass708_11430.method8313(-931632039)) {
			IntParam class536_sub26 = (IntParam) aClass708_11430.method8305(1558200512);
			anIntArray11434[i_143_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9558 -= class536_sub26.value * 2083602213;
			if (i_143_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_143_, anIntArray11434, 0);
				i_143_ = 0;
			}
		}
		if (i_143_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_143_, anIntArray11434, 0);
			boolean bool = false;
		}
		while (!aClass708_11426.method8313(534976598)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(-1182198425);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		while (!aClass708_11431.method8313(-702652599)) {
			Class536 class536 = aClass708_11431.method8305(661691356);
			OpenGL.glDeleteProgram((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11425.method8313(-1975134950)) {
			Class536 class536 = aClass708_11425.method8305(29154948);
			OpenGL.glDeleteShader((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11426.method8313(890158858)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(954385050);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		if (method2008() > 100663296 && Class249.method3450(1691086061) > aLong11452 + 60000L) {
			System.gc();
			aLong11452 = Class249.method3450(1360583900);
		}
		super.method2007(i);
	}

	public void method2185() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11464[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11464[i]);
				aLongArray11464[i] = 0L;
			}
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	void method8908() {
		aFloatArray11436[0] = aFloat9626 * aFloat9678;
		aFloatArray11436[1] = aFloat9626 * aFloat9649;
		aFloatArray11436[2] = aFloat9626 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11436, 0);
	}

	public void method2271() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11464[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11464[i]);
				aLongArray11464[i] = 0L;
			}
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	void method8880() {
		OpenGL.glDepthFunc(515);
		method10573();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9695) {
			method8803(anInt9568 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9690 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_144_ = 16384 + i;
			OpenGL.glLightfv(i_144_, 4608, fs, 0);
			OpenGL.glLightf(i_144_, 4615, 0.0F);
			OpenGL.glLightf(i_144_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11441.setSwapInterval(0);
		super.method8717();
	}

	public void method2190(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public void method2191(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public void method2356() {
		if (aBool11455) {
			aClass143_11460 = null;
			if (aClass183_Sub2_11462 != null) {
				aClass183_Sub2_11462.method131();
				aClass183_Sub2_11462 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11449, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11449[i] = 0;
				if (aLongArray11464[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11464[i]);
					aLongArray11464[i] = 0L;
				}
			}
		} else {
			aClass183_Sub2_11462 = null;
			aClass143_11461 = null;
			aClass143_11460 = null;
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	public void method2403() {
		if (aBool11455) {
			aClass143_11460 = null;
			if (aClass183_Sub2_11462 != null) {
				aClass183_Sub2_11462.method131();
				aClass183_Sub2_11462 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11449, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11449[i] = 0;
				if (aLongArray11464[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11464[i]);
					aLongArray11464[i] = 0L;
				}
			}
		} else {
			aClass183_Sub2_11462 = null;
			aClass143_11461 = null;
			aClass143_11460 = null;
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	void method8978(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public void method2395() {
		if (aBool11455) {
			aClass143_11460 = null;
			if (aClass183_Sub2_11462 != null) {
				aClass183_Sub2_11462.method131();
				aClass183_Sub2_11462 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11449, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11449[i] = 0;
				if (aLongArray11464[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11464[i]);
					aLongArray11464[i] = 0L;
				}
			}
		} else {
			aClass183_Sub2_11462 = null;
			aClass143_11461 = null;
			aClass143_11460 = null;
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	public void method2186() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11464[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11464[i]);
				aLongArray11464[i] = 0L;
			}
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	public boolean method2038() {
		return false;
	}

	public void method2221(int i, int i_145_) {
		int i_146_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_145_ & 0xff0000) / 1.671168E7F, (float) (i_145_ & 0xff00) / 65280.0F, (float) (i_145_ & 0xff) / 255.0F, (float) (i_145_ >>> 24) / 255.0F);
			i_146_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method8760(true);
			i_146_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_146_ |= 0x400;
		OpenGL.glClear(i_146_);
	}

	public void method2222(int i, int i_147_) {
		int i_148_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_147_ & 0xff0000) / 1.671168E7F, (float) (i_147_ & 0xff00) / 65280.0F, (float) (i_147_ & 0xff) / 255.0F, (float) (i_147_ >>> 24) / 255.0F);
			i_148_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method8760(true);
			i_148_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_148_ |= 0x400;
		OpenGL.glClear(i_148_);
	}

	public Class176 method2293(Class176 class176, Class176 class176_149_, float f, Class176 class176_150_) {
		return f < 0.5F ? class176 : class176_149_;
	}

	public Class176 method2294(Class176 class176, Class176 class176_151_, float f, Class176 class176_152_) {
		return f < 0.5F ? class176 : class176_151_;
	}

	public Class286 method8790(String string) {
		byte[] is = method10572(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub2(this, class274);
	}

	public Class183_Sub2 method2094() {
		return new Class183_Sub2_Sub2_Sub1(this);
	}

	public Class183_Sub2 method2058() {
		return new Class183_Sub2_Sub2_Sub1(this);
	}

	public Interface22 method2121(int i, int i_153_, Class155 class155, Class171 class171, int i_154_) {
		return new Class490(this, class155, class171, i, i_153_, i_154_);
	}

	public Interface22 method2335(int i, int i_155_, Class155 class155, Class171 class171, int i_156_) {
		return new Class490(this, class155, class171, i, i_155_, i_156_);
	}

	public Interface21 method2193(int i, int i_157_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_157_);
	}

	public Interface21 method2079(int i, int i_158_, int i_159_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_158_, i_159_);
	}

	public Interface21 method2337(int i, int i_160_, int i_161_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_160_, i_161_);
	}

	public Interface21 method2338(int i, int i_162_, int i_163_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_162_, i_163_);
	}

	public Interface21 method2097(int i, int i_164_, int i_165_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_164_, i_165_);
	}

	final Interface41 method8968(boolean bool) {
		return new Class488_Sub2(this, Class171.aClass171_1899, bool);
	}

	public void method2339(int i, int i_166_, int i_167_) {
		method2085();
		if (aClass183_Sub2_11462 == null)
			method10570(i_166_, i_167_);
		if (aClass143_11460 == null)
			aClass143_11460 = method2205(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), false);
		else
			aClass143_11460.method1726(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), 0, 0);
		method2028(aClass183_Sub2_11462, -409819235);
		method2000(1, -16777216);
		aClass143_11460.method1724(anInt1872 * 1475697639, anInt1873 * 398729877, anInt1856 * -397142117, anInt1875 * -915384365);
		OpenGL.glBindBufferARB(35051, anIntArray11449[anInt11467]);
		OpenGL.glReadPixelsub(0, 0, anInt1870 * -896601365, anInt1848 * 232979335, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method2029(aClass183_Sub2_11462, (byte) 1);
		aLongArray11464[anInt11467] = OpenGL.glFenceSync(37143, 0);
		anIntArray11432[anInt11467] = i;
		if (++anInt11467 >= 3)
			anInt11467 = 0;
		method2086();
	}

	public void method2348(int i, int i_168_, int i_169_) {
		method2085();
		if (aClass183_Sub2_11462 == null)
			method10570(i_168_, i_169_);
		if (aClass143_11460 == null)
			aClass143_11460 = method2205(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), false);
		else
			aClass143_11460.method1726(0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), 0, 0);
		method2028(aClass183_Sub2_11462, -409819235);
		method2000(1, -16777216);
		aClass143_11460.method1724(anInt1872 * 1475697639, anInt1873 * 398729877, anInt1856 * -397142117, anInt1875 * -915384365);
		OpenGL.glBindBufferARB(35051, anIntArray11449[anInt11467]);
		OpenGL.glReadPixelsub(0, 0, anInt1870 * -896601365, anInt1848 * 232979335, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method2029(aClass183_Sub2_11462, (byte) 1);
		aLongArray11464[anInt11467] = OpenGL.glFenceSync(37143, 0);
		anIntArray11432[anInt11467] = i;
		if (++anInt11467 >= 3)
			anInt11467 = 0;
		method2086();
	}

	public void method2349(int i, int i_170_, int[] is, int[] is_171_) {
		method10558(i, i_170_, is, is_171_);
	}

	final synchronized void method10571(int i) {
		Class536 class536 = new Class536();
		class536.aLong7133 = (long) i * -6756113042487376355L;
		aClass708_11431.method8335(class536, -417395604);
	}

	public void method2024(int i, int i_172_, int[] is, int[] is_173_) {
		method10558(i, i_172_, is, is_173_);
	}

	public final synchronized void method2377(int i) {
		try {
			method10568();
		} catch (Exception exception) {
			return;
		}
		int i_174_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11427.method8313(-2137202953)) {
			IntParam class536_sub26 = (IntParam) aClass708_11427.method8305(1568570459);
			anIntArray11434[i_174_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9557 -= class536_sub26.value * 2083602213;
			if (i_174_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_174_, anIntArray11434, 0);
				i_174_ = 0;
			}
		}
		if (i_174_ > 0) {
			OpenGL.glDeleteBuffersARB(i_174_, anIntArray11434, 0);
			i_174_ = 0;
		}
		while (!aClass708_11428.method8313(-1628621164)) {
			IntParam class536_sub26 = (IntParam) aClass708_11428.method8305(1868066722);
			anIntArray11434[i_174_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9556 -= class536_sub26.value * 2083602213;
			if (i_174_ == 1000) {
				OpenGL.glDeleteTextures(i_174_, anIntArray11434, 0);
				i_174_ = 0;
			}
		}
		if (i_174_ > 0) {
			OpenGL.glDeleteTextures(i_174_, anIntArray11434, 0);
			i_174_ = 0;
		}
		while (!aClass708_11429.method8313(-701458333)) {
			IntParam class536_sub26 = (IntParam) aClass708_11429.method8305(919104064);
			anIntArray11434[i_174_++] = class536_sub26.value * 2083602213;
			if (i_174_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_174_, anIntArray11434, 0);
				i_174_ = 0;
			}
		}
		if (i_174_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_174_, anIntArray11434, 0);
			i_174_ = 0;
		}
		while (!aClass708_11430.method8313(-2073608932)) {
			IntParam class536_sub26 = (IntParam) aClass708_11430.method8305(-42712320);
			anIntArray11434[i_174_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9558 -= class536_sub26.value * 2083602213;
			if (i_174_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_174_, anIntArray11434, 0);
				i_174_ = 0;
			}
		}
		if (i_174_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_174_, anIntArray11434, 0);
			boolean bool = false;
		}
		while (!aClass708_11426.method8313(-1863343221)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(-62013127);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		while (!aClass708_11431.method8313(321386292)) {
			Class536 class536 = aClass708_11431.method8305(-1059072475);
			OpenGL.glDeleteProgram((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11425.method8313(-1825020623)) {
			Class536 class536 = aClass708_11425.method8305(-1477939833);
			OpenGL.glDeleteShader((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11426.method8313(-1241314585)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(-507144249);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		if (method2008() > 100663296 && Class249.method3450(1998579638) > aLong11452 + 60000L) {
			System.gc();
			aLong11452 = Class249.method3450(1354259058);
		}
		super.method2007(i);
	}

	void method8761() {
		if (aBool9613 && aBool9614)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	public void method8708(Class443 class443) {
		float[] fs = class443.aFloatArray4878;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method2132() {
		super.method2072();
		if (anOpenGL11441 != null) {
			anOpenGL11441.method1242();
			anOpenGL11441.release();
			anOpenGL11441 = null;
		}
	}

	public boolean method8863() {
		return aBool11450;
	}

	public boolean method8864() {
		return aBool11465;
	}

	public boolean method8865() {
		return aBool11465;
	}

	Interface39 method8777(int i, boolean bool, int[][] is) {
		return new Class493_Sub2(this, i, bool, is);
	}

	public boolean method8843(boolean bool) {
		return true;
	}

	public Class286 method8898(String string) {
		byte[] is = method10572(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub2(this, class274);
	}

	Interface36 method8859(Class155 class155, int i, int i_175_, boolean bool, float[] fs, int i_176_, int i_177_) {
		return new Class493_Sub3(this, class155, i, i_175_, bool, fs, i_176_, i_177_);
	}

	public void method8871(Class443 class443, Class443 class443_178_, Class443 class443_179_) {
		OpenGL.glMatrixMode(5888);
		aClass443_9570.method5383(class443, class443_178_);
		OpenGL.glLoadMatrixf(aClass443_9570.aFloatArray4878, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class443_179_.aFloatArray4878, 0);
	}

	void method8878() {
		OpenGL.glDepthFunc(515);
		method10573();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9695) {
			method8803(anInt9568 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9690 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_180_ = 16384 + i;
			OpenGL.glLightfv(i_180_, 4608, fs, 0);
			OpenGL.glLightf(i_180_, 4615, 0.0F);
			OpenGL.glLightf(i_180_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11441.setSwapInterval(0);
		super.method8717();
	}

	public void method2219(int i, int i_181_) {
		int i_182_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_181_ & 0xff0000) / 1.671168E7F, (float) (i_181_ & 0xff00) / 65280.0F, (float) (i_181_ & 0xff) / 255.0F, (float) (i_181_ >>> 24) / 255.0F);
			i_182_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method8760(true);
			i_182_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_182_ |= 0x400;
		OpenGL.glClear(i_182_);
	}

	public float method8887() {
		return 0.0F;
	}

	public float method8735() {
		return 0.0F;
	}

	void method8734(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method8874() {
		if (aClass183_1849 != null)
			OpenGL.glViewport(anInt9609 + anInt9618, (anInt9610 + aClass183_1849.method2726() - anInt9547 - anInt9608), anInt9607, anInt9608);
		OpenGL.glDepthRange(aFloat9591, aFloat9592);
	}

	void method8893() {
		if (aClass183_1849 != null)
			OpenGL.glViewport(anInt9609 + anInt9618, (anInt9610 + aClass183_1849.method2726() - anInt9547 - anInt9608), anInt9607, anInt9608);
		OpenGL.glDepthRange(aFloat9591, aFloat9592);
	}

	Class183_Sub1 method2169(Canvas canvas, int i, int i_183_) {
		return new Class183_Sub1_Sub1_Sub2(this, canvas);
	}

	void method8738() {
		if (aClass183_1849 != null) {
			int i = anInt9609 + anInt9599;
			int i_184_ = anInt9610 + aClass183_1849.method2726() - anInt9598;
			int i_185_ = anInt9600 - anInt9599;
			int i_186_ = anInt9598 - anInt9624;
			if (i_185_ < 0)
				i_185_ = 0;
			if (i_186_ < 0)
				i_186_ = 0;
			OpenGL.glScissor(i, i_184_, i_185_, i_186_);
		}
	}

	void method8895() {
		if (aClass183_1849 != null) {
			int i = anInt9609 + anInt9599;
			int i_187_ = anInt9610 + aClass183_1849.method2726() - anInt9598;
			int i_188_ = anInt9600 - anInt9599;
			int i_189_ = anInt9598 - anInt9624;
			if (i_188_ < 0)
				i_188_ = 0;
			if (i_189_ < 0)
				i_189_ = 0;
			OpenGL.glScissor(i, i_187_, i_188_, i_189_);
		}
	}

	void method8709() {
		if (aBool9715)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method8896() {
		if (aBool9715)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public void method8901(Class443 class443) {
		float[] fs = class443.aFloatArray4878;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	final void method8816(Interface41 interface41, Class377 class377, int i, int i_190_, int i_191_, int i_192_) {
		int i_193_;
		int i_194_;
		if (class377 == Class377.aClass377_3914) {
			i_193_ = 1;
			i_194_ = i_192_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_193_ = 3;
			i_194_ = i_192_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_193_ = 4;
			i_194_ = i_192_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_193_ = 6;
			i_194_ = i_192_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_193_ = 5;
			i_194_ = i_192_ + 2;
		} else {
			i_193_ = 0;
			i_194_ = i_192_;
		}
		Class171 class171 = interface41.method281();
		Class488_Sub2 class488_sub2 = (Class488_Sub2) interface41;
		class488_sub2.method5868();
		OpenGL.glDrawElements(i_193_, i_194_, method10565(class171), (class488_sub2.method5864() + (long) (i_191_ * (class171.anInt1898 * -147747987))));
	}

	public void method8902(Class443 class443) {
		float[] fs = class443.aFloatArray4878;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method8904() {
		if (aBool9613 && aBool9614)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method8860() {
		if (aBool9613 && aBool9614)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method8905() {
		OpenGL.glDepthMask(aBool9611 && aBool9653);
	}

	void method8981(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	void method8906() {
		if (aBool9700 && !aBool9617)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method8907() {
		aFloatArray11436[0] = aFloat9626 * aFloat9678;
		aFloatArray11436[1] = aFloat9626 * aFloat9649;
		aFloatArray11436[2] = aFloat9626 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11436, 0);
	}

	void method8831() {
		if (aBool9616) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method8849() {
		aFloatArray11436[0] = aFloat9573 * aFloat9678;
		aFloatArray11436[1] = aFloat9573 * aFloat9649;
		aFloatArray11436[2] = aFloat9573 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11436, 0);
		aFloatArray11436[0] = -aFloat9579 * aFloat9678;
		aFloatArray11436[1] = -aFloat9579 * aFloat9649;
		aFloatArray11436[2] = -aFloat9579 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11436, 0);
	}

	void method8797() {
		aFloatArray11436[0] = aFloat9573 * aFloat9678;
		aFloatArray11436[1] = aFloat9573 * aFloat9649;
		aFloatArray11436[2] = aFloat9573 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11436, 0);
		aFloatArray11436[0] = -aFloat9579 * aFloat9678;
		aFloatArray11436[1] = -aFloat9579 * aFloat9649;
		aFloatArray11436[2] = -aFloat9579 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11436, 0);
	}

	void method8841() {
		aFloatArray11436[0] = aFloat9573 * aFloat9678;
		aFloatArray11436[1] = aFloat9573 * aFloat9649;
		aFloatArray11436[2] = aFloat9573 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11436, 0);
		aFloatArray11436[0] = -aFloat9579 * aFloat9678;
		aFloatArray11436[1] = -aFloat9579 * aFloat9649;
		aFloatArray11436[2] = -aFloat9579 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11436, 0);
	}

	void method8910() {
		aFloatArray11436[0] = aFloat9573 * aFloat9678;
		aFloatArray11436[1] = aFloat9573 * aFloat9649;
		aFloatArray11436[2] = aFloat9573 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11436, 0);
		aFloatArray11436[0] = -aFloat9579 * aFloat9678;
		aFloatArray11436[1] = -aFloat9579 * aFloat9649;
		aFloatArray11436[2] = -aFloat9579 * aFloat9701;
		aFloatArray11436[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11436, 0);
	}

	public void method2404(int i, int i_195_) {
		int i_196_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_195_ & 0xff0000) / 1.671168E7F, (float) (i_195_ & 0xff00) / 65280.0F, (float) (i_195_ & 0xff) / 255.0F, (float) (i_195_ >>> 24) / 255.0F);
			i_196_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method8760(true);
			i_196_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_196_ |= 0x400;
		OpenGL.glClear(i_196_);
	}

	public void method2168(boolean bool) {
		/* empty */
	}

	void method8752() {
		if (aBool9703)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9688 & 0xff) / 255.0F);
		if (anInt9568 > 1) {
			if (aByte9688 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method8914() {
		/* empty */
	}

	void method8915() {
		if (aBool9616) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method2072() {
		super.method2072();
		if (anOpenGL11441 != null) {
			anOpenGL11441.method1242();
			anOpenGL11441.release();
			anOpenGL11441 = null;
		}
	}

	void method8917() {
		if (aBool9616) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method8918() {
		if (aBool9616) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method8919() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_197_ = class536_sub19.method9528(842708309);
			int i_198_ = 16386 + i;
			float f = class536_sub19.method9531(-1854024431) / 255.0F;
			aFloatArray11436[0] = (float) class536_sub19.method9548(-222858398);
			aFloatArray11436[1] = (float) class536_sub19.method9549(1871640290);
			aFloatArray11436[2] = (float) class536_sub19.method9551((byte) 0);
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_198_, 4611, aFloatArray11436, 0);
			aFloatArray11436[0] = (float) (i_197_ >> 16 & 0xff) * f;
			aFloatArray11436[1] = (float) (i_197_ >> 8 & 0xff) * f;
			aFloatArray11436[2] = (float) (i_197_ & 0xff) * f;
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_198_, 4609, aFloatArray11436, 0);
			OpenGL.glLightf(i_198_, 4617, (1.0F / (float) (class536_sub19.method9530(-1325400181) * class536_sub19.method9530(-1341876308))));
			OpenGL.glEnable(i_198_);
		}
		for (/**/; i < anInt9630; i++)
			OpenGL.glDisable(16386 + i);
	}

	final void method8941(int i, Class379 class379, boolean bool, boolean bool_199_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10559(class379));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_199_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_199_ ? 769 : 768);
	}

	void method8963() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_200_ = class536_sub19.method9528(729604485);
			int i_201_ = 16386 + i;
			float f = class536_sub19.method9531(1823133323) / 255.0F;
			aFloatArray11436[0] = (float) class536_sub19.method9548(-620687681);
			aFloatArray11436[1] = (float) class536_sub19.method9549(1194261615);
			aFloatArray11436[2] = (float) class536_sub19.method9551((byte) 0);
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_201_, 4611, aFloatArray11436, 0);
			aFloatArray11436[0] = (float) (i_200_ >> 16 & 0xff) * f;
			aFloatArray11436[1] = (float) (i_200_ >> 8 & 0xff) * f;
			aFloatArray11436[2] = (float) (i_200_ & 0xff) * f;
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_201_, 4609, aFloatArray11436, 0);
			OpenGL.glLightf(i_201_, 4617, (1.0F / (float) (class536_sub19.method9530(-1525277356) * class536_sub19.method9530(1128997784))));
			OpenGL.glEnable(i_201_);
		}
		for (/**/; i < anInt9630; i++)
			OpenGL.glDisable(16386 + i);
	}

	void method8921() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_202_ = class536_sub19.method9528(1115331239);
			int i_203_ = 16386 + i;
			float f = class536_sub19.method9531(-1249326971) / 255.0F;
			aFloatArray11436[0] = (float) class536_sub19.method9548(-2056819678);
			aFloatArray11436[1] = (float) class536_sub19.method9549(359269906);
			aFloatArray11436[2] = (float) class536_sub19.method9551((byte) 0);
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_203_, 4611, aFloatArray11436, 0);
			aFloatArray11436[0] = (float) (i_202_ >> 16 & 0xff) * f;
			aFloatArray11436[1] = (float) (i_202_ >> 8 & 0xff) * f;
			aFloatArray11436[2] = (float) (i_202_ & 0xff) * f;
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_203_, 4609, aFloatArray11436, 0);
			OpenGL.glLightf(i_203_, 4617, (1.0F / (float) (class536_sub19.method9530(-1692996927) * class536_sub19.method9530(-667995044))));
			OpenGL.glEnable(i_203_);
		}
		for (/**/; i < anInt9630; i++)
			OpenGL.glDisable(16386 + i);
	}

	public boolean method2180() {
		return true;
	}

	boolean method8845(Class155 class155, Class171 class171) {
		return true;
	}

	boolean method8923(Class155 class155, Class171 class171) {
		return true;
	}

	Interface36 method8924(Class155 class155, Class171 class171, int i, int i_204_) {
		return method8779(class155, class171, i, i_204_);
	}

	void method8794() {
		OpenGL.glTexEnvi(8960, 34162, method10569(aClass371Array9641[anInt9636]));
	}

	void method8801() {
		aFloat9676 = aFloat9596 - (float) anInt9644;
		aFloat9675 = aFloat9676 - (float) anInt9550;
		if (aFloat9675 < aFloat9631)
			aFloat9675 = aFloat9631;
		if (aBool9704) {
			OpenGL.glFogf(2915, aFloat9675);
			OpenGL.glFogf(2916, aFloat9676);
			aFloatArray11436[0] = (float) (anInt9672 & 0xff0000) / 1.671168E7F;
			aFloatArray11436[1] = (float) (anInt9672 & 0xff00) / 65280.0F;
			aFloatArray11436[2] = (float) (anInt9672 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray11436, 0);
		}
	}

	Interface36 method8927(Class155 class155, int i, int i_205_, boolean bool, byte[] is, int i_206_, int i_207_) {
		return new Class493_Sub3(this, class155, i, i_205_, bool, is, i_206_, i_207_);
	}

	public boolean method2178() {
		if (aBool11455 && aLongArray11464[anInt11467] != 0L)
			return false;
		return true;
	}

	public void method2134(boolean bool) {
		/* empty */
	}

	Interface36 method8931(int i, int i_208_, boolean bool, int[] is, int i_209_, int i_210_) {
		return new Class493_Sub3(this, i, i_208_, bool, is, i_209_, i_210_);
	}

	Interface39 method8857(int i, boolean bool, int[][] is) {
		return new Class493_Sub2(this, i, bool, is);
	}

	byte[] method10572(String string) {
		return method8830("gl", string);
	}

	Interface39 method8933(int i, boolean bool, int[][] is) {
		return new Class493_Sub2(this, i, bool, is);
	}

	Interface34 method8934(Class155 class155, int i, int i_211_, int i_212_, boolean bool, byte[] is) {
		return new Class493_Sub1(this, class155, i, i_211_, i_212_, bool, is);
	}

	Interface34 method8935(Class155 class155, int i, int i_213_, int i_214_, boolean bool, byte[] is) {
		return new Class493_Sub1(this, class155, i, i_213_, i_214_, bool, is);
	}

	public void method8875() {
		int i = anIntArray11439[anInt9636];
		if (i != 0) {
			anIntArray11439[anInt9636] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method8846() {
		OpenGL.glTexEnvi(8960, 34161, method10569(aClass371Array9640[anInt9636]));
	}

	final void method8727(int i, Class379 class379, boolean bool, boolean bool_215_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10559(class379));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_215_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_215_ ? 769 : 768);
	}

	final void method8939(int i, Class379 class379, boolean bool, boolean bool_216_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10559(class379));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_216_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_216_ ? 769 : 768);
	}

	boolean method8838(Class155 class155, Class171 class171) {
		return aBool9697;
	}

	void method8975() {
		if (aBool9616) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	final void method8942(int i, Class379 class379, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method10559(class379));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method8944() {
		aFloatArray11436[0] = (float) (anInt9642 & 0xff0000) / 1.671168E7F;
		aFloatArray11436[1] = (float) (anInt9642 & 0xff00) / 65280.0F;
		aFloatArray11436[2] = (float) (anInt9642 & 0xff) / 255.0F;
		aFloatArray11436[3] = (float) (anInt9642 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11436, 0);
	}

	final void method8856() {
		aFloatArray11436[0] = (float) (anInt9642 & 0xff0000) / 1.671168E7F;
		aFloatArray11436[1] = (float) (anInt9642 & 0xff00) / 65280.0F;
		aFloatArray11436[2] = (float) (anInt9642 & 0xff) / 255.0F;
		aFloatArray11436[3] = (float) (anInt9642 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11436, 0);
	}

	final void method8836() {
		aFloatArray11436[0] = (float) (anInt9642 & 0xff0000) / 1.671168E7F;
		aFloatArray11436[1] = (float) (anInt9642 & 0xff00) / 65280.0F;
		aFloatArray11436[2] = (float) (anInt9642 & 0xff) / 255.0F;
		aFloatArray11436[3] = (float) (anInt9642 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11436, 0);
	}

	void method8821() {
		OpenGL.glMatrixMode(5890);
		if (aClass367Array9639[anInt9636] != Class367.aClass367_3860)
			OpenGL.glLoadMatrixf(aClass443Array9638[anInt9636].method5377(aFloatArray11458), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public void method2188() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11464[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11464[i]);
				aLongArray11464[i] = 0L;
			}
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	public String method2240() {
		String string = "Caps: 4:";
		String string_217_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_217_).toString();
		string = new StringBuilder().append(string).append(anInt11454).append(string_217_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_217_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool11447 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool11453 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool11450 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool11465 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool11448 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool11440 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_217_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	public Class286 method8868(String string) {
		byte[] is = method10572(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub2(this, class274);
	}

	void method8920() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass443_9698.aFloatArray4878, 0);
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_218_ = class536_sub19.method9528(-32078420);
			int i_219_ = 16386 + i;
			float f = class536_sub19.method9531(-353374080) / 255.0F;
			aFloatArray11436[0] = (float) class536_sub19.method9548(-892665549);
			aFloatArray11436[1] = (float) class536_sub19.method9549(1742503829);
			aFloatArray11436[2] = (float) class536_sub19.method9551((byte) 0);
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_219_, 4611, aFloatArray11436, 0);
			aFloatArray11436[0] = (float) (i_218_ >> 16 & 0xff) * f;
			aFloatArray11436[1] = (float) (i_218_ >> 8 & 0xff) * f;
			aFloatArray11436[2] = (float) (i_218_ & 0xff) * f;
			aFloatArray11436[3] = 1.0F;
			OpenGL.glLightfv(i_219_, 4609, aFloatArray11436, 0);
			OpenGL.glLightf(i_219_, 4617, (1.0F / (float) (class536_sub19.method9530(-1014271030) * class536_sub19.method9530(-1616937535))));
			OpenGL.glEnable(i_219_);
		}
		for (/**/; i < anInt9630; i++)
			OpenGL.glDisable(16386 + i);
	}

	void method10573() {
		if (anInt9615 == 1)
			OpenGL.glDisable(2884);
		else {
			OpenGL.glEnable(2884);
			if (anInt9615 == 2)
				OpenGL.glCullFace(1029);
			else if (anInt9615 == 3)
				OpenGL.glCullFace(1028);
		}
	}

	void method8951() {
		OpenGL.glTexEnvi(8960, 34161, method10569(aClass371Array9640[anInt9636]));
	}

	public void method2291() {
		if (aBool11455) {
			aClass143_11460 = null;
			if (aClass183_Sub2_11462 != null) {
				aClass183_Sub2_11462.method131();
				aClass183_Sub2_11462 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11449, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11449[i] = 0;
				if (aLongArray11464[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11464[i]);
					aLongArray11464[i] = 0L;
				}
			}
		} else {
			aClass183_Sub2_11462 = null;
			aClass143_11461 = null;
			aClass143_11460 = null;
		}
		anInt11467 = 0;
		anInt11466 = 0;
	}

	void method8728() {
		OpenGL.glTexEnvi(8960, 34161, method10569(aClass371Array9640[anInt9636]));
	}

	void method8835() {
		OpenGL.glTexEnvi(8960, 34162, method10569(aClass371Array9641[anInt9636]));
	}

	void method8953() {
		OpenGL.glTexEnvi(8960, 34162, method10569(aClass371Array9641[anInt9636]));
	}

	void method8732() {
		OpenGL.glTexEnvi(8960, 34162, method10569(aClass371Array9641[anInt9636]));
	}

	void method8768() {
		OpenGL.glDepthMask(aBool9611 && aBool9653);
	}

	public boolean method8948(boolean bool) {
		return true;
	}

	void method8957() {
		if (aBool9703)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9688 & 0xff) / 255.0F);
		if (anInt9568 > 1) {
			if (aByte9688 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	public float method8889() {
		return 0.0F;
	}

	void method8960() {
		if (aBool9545) {
			int i = 0;
			int i_220_ = 0;
			if (anInt9560 == 0) {
				i = 0;
				i_220_ = 0;
			} else if (anInt9560 == 1) {
				i = 1;
				i_220_ = 0;
			} else if (anInt9560 == 2) {
				i = 1;
				i_220_ = 1;
			} else if (anInt9560 == 3) {
				i = 0;
				i_220_ = 1;
			}
			if (aClass365_9679 == Class365.aClass365_3843)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_220_);
			else if (aClass365_9679 == Class365.aClass365_3840)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_220_);
			else if (aClass365_9679 == Class365.aClass365_3841)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_220_);
			else if (aClass365_9679 == Class365.aClass365_3842)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_220_);
		} else if (aClass365_9679 == Class365.aClass365_3843) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass365_9679 == Class365.aClass365_3840) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass365_9679 == Class365.aClass365_3841) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	void method8958() {
		if (aBool9671 && aBool9674 && anInt9550 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	final Interface41 method8854(boolean bool) {
		return new Class488_Sub2(this, Class171.aClass171_1899, bool);
	}

	final Interface41 method8959(boolean bool) {
		return new Class488_Sub2(this, Class171.aClass171_1899, bool);
	}

	final Interface41 method8952(boolean bool) {
		return new Class488_Sub2(this, Class171.aClass171_1899, bool);
	}

	final Interface41 method8844(boolean bool) {
		return new Class488_Sub2(this, Class171.aClass171_1899, bool);
	}

	public void method2043(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	Class343 method8962(Class362[] class362s) {
		return new Class343_Sub2(class362s);
	}

	Class343 method8848(Class362[] class362s) {
		return new Class343_Sub2(class362s);
	}

	public void method8964(int i, Interface38 interface38) {
		aClass488_Sub1Array11435[i] = (Class488_Sub1) interface38;
	}

	public void method8839(int i, Interface38 interface38) {
		aClass488_Sub1Array11435[i] = (Class488_Sub1) interface38;
	}

	public long method2189(int i, int i_221_) {
		return method10558(i, i_221_, null, null);
	}

	public void method8810(int i, Interface38 interface38) {
		aClass488_Sub1Array11435[i] = (Class488_Sub1) interface38;
	}

	void method8967(Interface41 interface41) {
		aClass488_Sub2_11463 = (Class488_Sub2) interface41;
		aClass488_Sub2_11463.method5868();
	}

	void method8966(Interface41 interface41) {
		aClass488_Sub2_11463 = (Class488_Sub2) interface41;
		aClass488_Sub2_11463.method5868();
	}

	void method8969(Interface41 interface41) {
		aClass488_Sub2_11463 = (Class488_Sub2) interface41;
		aClass488_Sub2_11463.method5868();
	}

	final void method8825(Interface41 interface41, Class377 class377, int i, int i_222_, int i_223_, int i_224_) {
		int i_225_;
		int i_226_;
		if (class377 == Class377.aClass377_3914) {
			i_225_ = 1;
			i_226_ = i_224_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_225_ = 3;
			i_226_ = i_224_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_225_ = 4;
			i_226_ = i_224_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_225_ = 6;
			i_226_ = i_224_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_225_ = 5;
			i_226_ = i_224_ + 2;
		} else {
			i_225_ = 0;
			i_226_ = i_224_;
		}
		Class171 class171 = interface41.method281();
		Class488_Sub2 class488_sub2 = (Class488_Sub2) interface41;
		class488_sub2.method5868();
		OpenGL.glDrawElements(i_225_, i_226_, method10565(class171), (class488_sub2.method5864() + (long) (i_223_ * (class171.anInt1898 * -147747987))));
	}

	final void method8970(Interface41 interface41, Class377 class377, int i, int i_227_, int i_228_, int i_229_) {
		int i_230_;
		int i_231_;
		if (class377 == Class377.aClass377_3914) {
			i_230_ = 1;
			i_231_ = i_229_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_230_ = 3;
			i_231_ = i_229_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_230_ = 4;
			i_231_ = i_229_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_230_ = 6;
			i_231_ = i_229_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_230_ = 5;
			i_231_ = i_229_ + 2;
		} else {
			i_230_ = 0;
			i_231_ = i_229_;
		}
		Class171 class171 = interface41.method281();
		Class488_Sub2 class488_sub2 = (Class488_Sub2) interface41;
		class488_sub2.method5868();
		OpenGL.glDrawElements(i_230_, i_231_, method10565(class171), (class488_sub2.method5864() + (long) (i_228_ * (class171.anInt1898 * -147747987))));
	}

	public final void method8971(Class377 class377, int i, int i_232_, int i_233_, int i_234_) {
		int i_235_;
		int i_236_;
		if (class377 == Class377.aClass377_3914) {
			i_235_ = 1;
			i_236_ = i_234_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_235_ = 3;
			i_236_ = i_234_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_235_ = 4;
			i_236_ = i_234_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_235_ = 6;
			i_236_ = i_234_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_235_ = 5;
			i_236_ = i_234_ + 2;
		} else {
			i_235_ = 0;
			i_236_ = i_234_;
		}
		Class171 class171 = aClass488_Sub2_11463.method281();
		OpenGL.glDrawElements(i_235_, i_236_, method10565(class171), (aClass488_Sub2_11463.method5864() + (long) (i_233_ * (class171.anInt1898 * -147747987))));
	}

	public final void method8972(Class377 class377, int i, int i_237_, int i_238_, int i_239_) {
		int i_240_;
		int i_241_;
		if (class377 == Class377.aClass377_3914) {
			i_240_ = 1;
			i_241_ = i_239_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_240_ = 3;
			i_241_ = i_239_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_240_ = 4;
			i_241_ = i_239_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_240_ = 6;
			i_241_ = i_239_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_240_ = 5;
			i_241_ = i_239_ + 2;
		} else {
			i_240_ = 0;
			i_241_ = i_239_;
		}
		Class171 class171 = aClass488_Sub2_11463.method281();
		OpenGL.glDrawElements(i_240_, i_241_, method10565(class171), (aClass488_Sub2_11463.method5864() + (long) (i_238_ * (class171.anInt1898 * -147747987))));
	}

	void method8974(int i) {
		if (!aBool11456)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method8928(int i) {
		if (!aBool11456)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	boolean method8855(Class155 class155, Class171 class171) {
		return aBool9697;
	}

	void method8803(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	public final synchronized void method2324(int i) {
		try {
			method10568();
		} catch (Exception exception) {
			return;
		}
		int i_242_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11427.method8313(-1824793777)) {
			IntParam class536_sub26 = (IntParam) aClass708_11427.method8305(-1587972085);
			anIntArray11434[i_242_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9557 -= class536_sub26.value * 2083602213;
			if (i_242_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_242_, anIntArray11434, 0);
				i_242_ = 0;
			}
		}
		if (i_242_ > 0) {
			OpenGL.glDeleteBuffersARB(i_242_, anIntArray11434, 0);
			i_242_ = 0;
		}
		while (!aClass708_11428.method8313(-1281393781)) {
			IntParam class536_sub26 = (IntParam) aClass708_11428.method8305(-977175828);
			anIntArray11434[i_242_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9556 -= class536_sub26.value * 2083602213;
			if (i_242_ == 1000) {
				OpenGL.glDeleteTextures(i_242_, anIntArray11434, 0);
				i_242_ = 0;
			}
		}
		if (i_242_ > 0) {
			OpenGL.glDeleteTextures(i_242_, anIntArray11434, 0);
			i_242_ = 0;
		}
		while (!aClass708_11429.method8313(-150778548)) {
			IntParam class536_sub26 = (IntParam) aClass708_11429.method8305(1520656350);
			anIntArray11434[i_242_++] = class536_sub26.value * 2083602213;
			if (i_242_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_242_, anIntArray11434, 0);
				i_242_ = 0;
			}
		}
		if (i_242_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_242_, anIntArray11434, 0);
			i_242_ = 0;
		}
		while (!aClass708_11430.method8313(697471711)) {
			IntParam class536_sub26 = (IntParam) aClass708_11430.method8305(115153236);
			anIntArray11434[i_242_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9558 -= class536_sub26.value * 2083602213;
			if (i_242_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_242_, anIntArray11434, 0);
				i_242_ = 0;
			}
		}
		if (i_242_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_242_, anIntArray11434, 0);
			boolean bool = false;
		}
		while (!aClass708_11426.method8313(-1118636925)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(-1546100489);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		while (!aClass708_11431.method8313(-1425045902)) {
			Class536 class536 = aClass708_11431.method8305(304723258);
			OpenGL.glDeleteProgram((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11425.method8313(-1196201500)) {
			Class536 class536 = aClass708_11425.method8305(643704895);
			OpenGL.glDeleteShader((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11426.method8313(-1564024182)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(-458599878);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		if (method2008() > 100663296 && Class249.method3450(1569841928) > aLong11452 + 60000L) {
			System.gc();
			aLong11452 = Class249.method3450(1668793295);
		}
		super.method2007(i);
	}

	void method8979() {
		if (aBool9554)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	public Interface21 method2319(int i, int i_243_, int i_244_) {
		return new Class490(this, Class155.aClass155_1726, Class171.aClass171_1895, i, i_243_, i_244_);
	}

	public final synchronized void method2007(int i) {
		try {
			method10568();
		} catch (Exception exception) {
			return;
		}
		int i_245_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11427.method8313(-1846625823)) {
			IntParam class536_sub26 = (IntParam) aClass708_11427.method8305(497241173);
			anIntArray11434[i_245_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9557 -= class536_sub26.value * 2083602213;
			if (i_245_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_245_, anIntArray11434, 0);
				i_245_ = 0;
			}
		}
		if (i_245_ > 0) {
			OpenGL.glDeleteBuffersARB(i_245_, anIntArray11434, 0);
			i_245_ = 0;
		}
		while (!aClass708_11428.method8313(-1018447195)) {
			IntParam class536_sub26 = (IntParam) aClass708_11428.method8305(-24837890);
			anIntArray11434[i_245_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9556 -= class536_sub26.value * 2083602213;
			if (i_245_ == 1000) {
				OpenGL.glDeleteTextures(i_245_, anIntArray11434, 0);
				i_245_ = 0;
			}
		}
		if (i_245_ > 0) {
			OpenGL.glDeleteTextures(i_245_, anIntArray11434, 0);
			i_245_ = 0;
		}
		while (!aClass708_11429.method8313(833053026)) {
			IntParam class536_sub26 = (IntParam) aClass708_11429.method8305(-68133346);
			anIntArray11434[i_245_++] = class536_sub26.value * 2083602213;
			if (i_245_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_245_, anIntArray11434, 0);
				i_245_ = 0;
			}
		}
		if (i_245_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_245_, anIntArray11434, 0);
			i_245_ = 0;
		}
		while (!aClass708_11430.method8313(-1462194068)) {
			IntParam class536_sub26 = (IntParam) aClass708_11430.method8305(2030173149);
			anIntArray11434[i_245_++] = (int) (class536_sub26.aLong7133 * -6909195213925454795L);
			anInt9558 -= class536_sub26.value * 2083602213;
			if (i_245_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_245_, anIntArray11434, 0);
				i_245_ = 0;
			}
		}
		if (i_245_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_245_, anIntArray11434, 0);
			boolean bool = false;
		}
		while (!aClass708_11426.method8313(-72803492)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(-1673624806);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		while (!aClass708_11431.method8313(95123950)) {
			Class536 class536 = aClass708_11431.method8305(-99700574);
			OpenGL.glDeleteProgram((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11425.method8313(-1998128306)) {
			Class536 class536 = aClass708_11425.method8305(2003612343);
			OpenGL.glDeleteShader((int) (class536.aLong7133 * -6909195213925454795L));
		}
		while (!aClass708_11426.method8313(-1700108715)) {
			IntParam class536_sub26 = (IntParam) aClass708_11426.method8305(366402316);
			OpenGL.glDeleteLists((int) (class536_sub26.aLong7133 * -6909195213925454795L), class536_sub26.value * 2083602213);
		}
		if (method2008() > 100663296 && Class249.method3450(1851282244) > aLong11452 + 60000L) {
			System.gc();
			aLong11452 = Class249.method3450(1660815857);
		}
		super.method2007(i);
	}

	public void method8982(Class343 class343) {
		Class362[] class362s = class343.aClass362Array3664;
		int i = 0;
		boolean bool = false;
		boolean bool_246_ = false;
		boolean bool_247_ = false;
		for (int i_248_ = 0; i_248_ < class362s.length; i_248_++) {
			Class362 class362 = class362s[i_248_];
			Class488_Sub1 class488_sub1 = aClass488_Sub1Array11435[i_248_];
			int i_249_ = 0;
			int i_250_ = class488_sub1.method9210();
			long l = class488_sub1.method5864();
			class488_sub1.method5868();
			for (int i_251_ = 0; i_251_ < class362.method4760(); i_251_++) {
				Class355 class355 = class362.method4759(i_251_);
				switch (class355.anInt3769) {
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_250_, l + (long) i_249_);
					bool_247_ = true;
					break;
				case 6:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_250_, l + (long) i_249_);
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_250_, l + (long) i_249_);
					break;
				case 11:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_250_, l + (long) i_249_);
					break;
				default:
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_250_, l + (long) i_249_);
					break;
				case 9:
					OpenGL.glNormalPointer(5126, i_250_, l + (long) i_249_);
					bool_246_ = true;
					break;
				case 10:
					OpenGL.glColorPointer(4, 5121, i_250_, l + (long) i_249_);
					bool = true;
				}
				i_249_ += class355.anInt3773;
			}
		}
		if (aBool11445 != bool_247_) {
			if (bool_247_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11445 = bool_247_;
		}
		if (aBool11451 != bool_246_) {
			if (bool_246_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11451 = bool_246_;
		}
		if (aBool11437 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11437 = bool;
		}
		if (anInt11438 < i) {
			for (int i_252_ = anInt11438; i_252_ < i; i_252_++) {
				OpenGL.glClientActiveTexture(33984 + i_252_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11438 = i;
		} else if (anInt11438 > i) {
			for (int i_253_ = i; i_253_ < anInt11438; i_253_++) {
				OpenGL.glClientActiveTexture(33984 + i_253_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11438 = i;
		}
	}

	void method8891() {
		OpenGL.glMatrixMode(5890);
		if (aClass367Array9639[anInt9636] != Class367.aClass367_3860)
			OpenGL.glLoadMatrixf(aClass443Array9638[anInt9636].method5377(aFloatArray11458), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public final void method8723(Class377 class377, int i, int i_254_) {
		int i_255_;
		int i_256_;
		if (class377 == Class377.aClass377_3914) {
			i_255_ = 1;
			i_256_ = i_254_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_255_ = 3;
			i_256_ = i_254_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_255_ = 4;
			i_256_ = i_254_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_255_ = 6;
			i_256_ = i_254_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_255_ = 5;
			i_256_ = i_254_ + 2;
		} else {
			i_255_ = 0;
			i_256_ = i_254_;
		}
		OpenGL.glDrawArrays(i_255_, i, i_256_);
	}

	byte[] method10574(String string) {
		return method8830("gl", string);
	}

	void method8956() {
		if (aBool9703)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9688 & 0xff) / 255.0F);
		if (anInt9568 > 1) {
			if (aByte9688 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	public Class286 method8714(String string) {
		byte[] is = method10572(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub2(this, class274);
	}

	public long method2042(int i, int i_257_) {
		return method10558(i, i_257_, null, null);
	}

	public boolean method8710() {
		return aBool11465;
	}

	void method8840() {
		aFloat9676 = aFloat9596 - (float) anInt9644;
		aFloat9675 = aFloat9676 - (float) anInt9550;
		if (aFloat9675 < aFloat9631)
			aFloat9675 = aFloat9631;
		if (aBool9704) {
			OpenGL.glFogf(2915, aFloat9675);
			OpenGL.glFogf(2916, aFloat9676);
			aFloatArray11436[0] = (float) (anInt9672 & 0xff0000) / 1.671168E7F;
			aFloatArray11436[1] = (float) (anInt9672 & 0xff00) / 65280.0F;
			aFloatArray11436[2] = (float) (anInt9672 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray11436, 0);
		}
	}

	public Class183_Sub2 method2332() {
		return new Class183_Sub2_Sub2_Sub1(this);
	}

	void method8717() {
		OpenGL.glDepthFunc(515);
		method10573();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9695) {
			method8803(anInt9568 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9690 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_258_ = 16384 + i;
			OpenGL.glLightfv(i_258_, 4608, fs, 0);
			OpenGL.glLightf(i_258_, 4615, 0.0F);
			OpenGL.glLightf(i_258_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11441.setSwapInterval(0);
		super.method8717();
	}

	public String method2165() {
		String string = "Caps: 4:";
		String string_259_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_259_).toString();
		string = new StringBuilder().append(string).append(anInt11454).append(string_259_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_259_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool11447 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool11453 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool11450 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool11465 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool11448 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool11440 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_259_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	void method8798() {
		if (aBool9554)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	public boolean method8862() {
		return aBool11450;
	}

	public boolean method8900() {
		return aBool11450;
	}

	public boolean method8833() {
		return aBool11450;
	}

	public final void method8815(Class377 class377, int i, int i_260_) {
		int i_261_;
		int i_262_;
		if (class377 == Class377.aClass377_3914) {
			i_261_ = 1;
			i_262_ = i_260_ * 2;
		} else if (class377 == Class377.aClass377_3915) {
			i_261_ = 3;
			i_262_ = i_260_ + 1;
		} else if (class377 == Class377.aClass377_3917) {
			i_261_ = 4;
			i_262_ = i_260_ * 3;
		} else if (class377 == Class377.aClass377_3918) {
			i_261_ = 6;
			i_262_ = i_260_ + 2;
		} else if (class377 == Class377.aClass377_3919) {
			i_261_ = 5;
			i_262_ = i_260_ + 2;
		} else {
			i_261_ = 0;
			i_262_ = i_260_;
		}
		OpenGL.glDrawArrays(i_261_, i, i_262_);
	}
}

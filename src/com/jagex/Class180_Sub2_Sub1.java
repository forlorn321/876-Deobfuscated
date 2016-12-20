/* Class180_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class180_Sub2_Sub1 extends Class180_Sub2 {
	Class694 aClass694_11466 = new Class694();
	Class694 aClass694_11467 = new Class694();
	float[] aFloatArray11468;
	Class694 aClass694_11469 = new Class694();
	Class479_Sub1[] aClass479_Sub1Array11470;
	Class694 aClass694_11471;
	int[] anIntArray11472;
	boolean aBool11473;
	long aLong11474;
	int[] anIntArray11475;
	boolean aBool11476;
	boolean aBool11477;
	int[] anIntArray11478;
	int anInt11479;
	Class694 aClass694_11480;
	Class479_Sub2 aClass479_Sub2_11481;
	OpenGL anOpenGL11482;
	Class265_Sub1 aClass265_Sub1_11483;
	boolean aBool11484;
	String aString11485;
	String aString11486;
	int anInt11487;
	boolean aBool11488;
	boolean aBool11489;
	boolean aBool11490;
	boolean aBool11491;
	int anInt11492;
	boolean aBool11493;
	boolean aBool11494;
	int anInt11495;
	boolean aBool11496;
	boolean aBool11497;
	int[] anIntArray11498;
	float[] aFloatArray11499;
	static final int anInt11500 = 3;
	Class147 aClass147_11501;
	Class147 aClass147_11502;
	Class694 aClass694_11503;
	Class694 aClass694_11504 = new Class694();
	long[] aLongArray11505;
	Class171_Sub2 aClass171_Sub2_11506;
	int anInt11507;
	boolean aBool11508;

	public boolean method15068() {
		return aBool11491;
	}

	public Class261 method14894(String string) {
		byte[] is = method18020(string);
		if (is == null)
			return null;
		Class272 class272 = method14896(is);
		return new Class261_Sub1(this, class272);
	}

	public int[] method3260(int i, int i_0_, int i_1_, int i_2_) {
		int[] is = new int[i_1_ * i_2_];
		int i_3_ = aClass171_2080.method2729();
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
			OpenGL.glReadPixelsi(i, i_3_ - i_0_ - i_4_ - 1, i_1_, 1, 32993, anInt11495, is, i_4_ * i_1_);
		return is;
	}

	void method14995() {
		aFloat9565 = aFloat9485 - (float) anInt9589;
		aFloat9517 = aFloat9565 - (float) anInt9562;
		if (aFloat9517 < aFloat9484)
			aFloat9517 = aFloat9484;
		if (aBool9597) {
			OpenGL.glFogf(2915, aFloat9517);
			OpenGL.glFogf(2916, aFloat9565);
			aFloatArray11468[0] = (float) (anInt9561 & 0xff0000) / 1.671168E7F;
			aFloatArray11468[1] = (float) (anInt9561 & 0xff00) / 65280.0F;
			aFloatArray11468[2] = (float) (anInt9561 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray11468, 0);
		}
	}

	public boolean method15053(boolean bool) {
		return true;
	}

	Class180_Sub2_Sub1(OpenGL opengl, Canvas canvas, long l, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, int i) {
		super(class181, interface24, interface48, interface46, interface49, class459, i, 1);
		aClass694_11471 = new Class694();
		aClass694_11503 = new Class694();
		aClass694_11480 = new Class694();
		anIntArray11472 = new int[1000];
		aClass479_Sub1Array11470 = new Class479_Sub1[16];
		new MapBuffer();
		new MapBuffer();
		aFloatArray11468 = new float[4];
		aFloatArray11499 = new float[16];
		aClass147_11501 = null;
		aClass147_11502 = null;
		aClass171_Sub2_11506 = null;
		anIntArray11475 = new int[3];
		aLongArray11505 = new long[3];
		anIntArray11498 = new int[3];
		anInt11507 = 0;
		anInt11492 = 0;
		int[] is = new int[1];
		try {
			anOpenGL11482 = opengl;
			anOpenGL11482.method1674();
			aString11485 = OpenGL.glGetString(7936).toLowerCase();
			aString11486 = OpenGL.glGetString(7937).toLowerCase();
			if (aString11485.indexOf("microsoft") != -1 || aString11485.indexOf("brian paul") != -1 || aString11485.indexOf("mesa") != -1)
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class592.method9875(string.replace('.', ' '), ' ', (short) -15149);
			if (strings.length >= 2) {
				try {
					int i_5_ = Class360.method6326(strings[0], (byte) -68);
					int i_6_ = Class360.method6326(strings[1], (byte) 32);
					anInt11487 = i_5_ * 10 + i_6_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (anInt11487 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt9521 = is[0];
			if (anInt9521 < 2)
				throw new RuntimeException("");
			anInt9580 = 8;
			aBool11488 = anOpenGL11482.method1673("GL_ARB_vertex_buffer_object");
			aBool9518 = anOpenGL11482.method1673("GL_ARB_multisample");
			aBool9588 = anOpenGL11482.method1673("GL_EXT_blend_func_separate");
			aBool11484 = anOpenGL11482.method1673("GL_ARB_texture_rectangle");
			aBool9585 = anOpenGL11482.method1673("GL_ARB_texture_cube_map");
			aBool11490 = anOpenGL11482.method1673("GL_ARB_texture_non_power_of_two");
			aBool9587 = true;
			aBool11491 = anOpenGL11482.method1673("GL_ARB_vertex_shader");
			aBool11473 = anOpenGL11482.method1673("GL_ARB_vertex_program");
			aBool11493 = anOpenGL11482.method1673("GL_ARB_fragment_shader");
			aBool11494 = anOpenGL11482.method1673("GL_ARB_fragment_program");
			aBool9581 = anOpenGL11482.method1673("GL_EXT_framebuffer_object");
			aBool9488 = aBool9581;
			aBool9494 = anOpenGL11482.method1673("GL_EXT_framebuffer_blit");
			aBool9567 = anOpenGL11482.method1673("GL_EXT_framebuffer_multisample");
			aBool11496 = (anUnsafe9437 != null && (anInt11487 >= 32 || anOpenGL11482.method1673("GL_ARB_sync")));
			anIntArray11478 = new int[anInt9521];
			if (!method14888() || !method14889()) {
				if (!anOpenGL11482.method1673("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!anOpenGL11482.method1673("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			Class498.aString5584.startsWith("mac");
			anInt11495 = Stream.method1710() ? 33639 : 5121;
			if (aString11486.indexOf("radeon") != -1 || aString11485.indexOf("intel") != -1) {
				int i_7_ = 0;
				boolean bool = aString11485.indexOf("intel") != -1;
				boolean bool_8_ = false;
				boolean bool_9_ = false;
				String[] strings_10_ = Class592.method9875(aString11486.replace('/', ' '), ' ', (short) -3101);
				for (int i_11_ = 0; i_11_ < strings_10_.length; i_11_++) {
					String string_12_ = strings_10_[i_11_];
					try {
						if (string_12_.length() <= 0)
							continue;
						if (string_12_.charAt(0) == 'x' && string_12_.length() >= 3 && Class281.method5186(string_12_.substring(1, 3), 2135970854)) {
							string_12_ = string_12_.substring(1);
							bool_9_ = true;
						}
						if (string_12_.equals("hd")) {
							bool_8_ = true;
							continue;
						}
						if (string_12_.startsWith("hd")) {
							string_12_ = string_12_.substring(2);
							bool_8_ = true;
						}
						if (string_12_.length() < 4 || !Class281.method5186(string_12_.substring(0, 4), 2135970854))
							continue;
						i_7_ = Class360.method6326(string_12_.substring(0, 4), (byte) 16);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (bool) {
					if (!bool_8_)
						aBool9581 = false;
				} else {
					if (!bool_9_ && !bool_8_) {
						if (i_7_ >= 7000 && i_7_ <= 7999)
							aBool11488 = false;
						if (i_7_ >= 7000 && i_7_ <= 9250)
							aBool9587 = false;
					}
					aBool11484 &= anOpenGL11482.method1673("GL_ARB_half_float_pixel");
					aBool11508 = true;
				}
			}
			if (aBool11488) {
				try {
					int[] is_13_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_13_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			method3102(canvas, new Class171_Sub1_Sub1_Sub2(this, canvas, l), -158912915);
			method3104(canvas, 673954373);
			method14921(32768, false);
			method14921(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3081((byte) 13);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	void method14900() {
		OpenGL.glDepthFunc(515);
		method18019();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9518) {
			method14997(anInt9573 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9521 - 1; i >= 0; i--) {
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
			int i_14_ = 16384 + i;
			OpenGL.glLightfv(i_14_, 4608, fs, 0);
			OpenGL.glLightf(i_14_, 4615, 0.0F);
			OpenGL.glLightf(i_14_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11482.setSwapInterval(0);
		super.method14900();
	}

	public Class143 method3077() {
		int i = -1;
		if (aString11485.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11485.indexOf("intel") != -1)
			i = 32902;
		else if (aString11485.indexOf("ati") != -1)
			i = 4098;
		return new Class143(i, method14891() ? "OpenGL FF" : "OpenGL", anInt11487, aString11486, 0L, method14891());
	}

	void method3079(int i, int i_15_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14726();
		if (anInterface24_2085 != null)
			anInterface24_2085.method19((byte) -104);
	}

	public void method3080() {
		OpenGL.glFinish();
	}

	void method14929() {
		if (aClass171_2080 != null) {
			int i = anInt9504 + anInt9468;
			int i_16_ = anInt9499 + aClass171_2080.method2729() - anInt9487;
			int i_17_ = anInt9603 - anInt9468;
			int i_18_ = anInt9487 - anInt9486;
			if (i_17_ < 0)
				i_17_ = 0;
			if (i_18_ < 0)
				i_18_ = 0;
			OpenGL.glScissor(i, i_16_, i_17_, i_18_);
		}
	}

	public Interface23 method3111(int i, int i_19_) {
		return new Class486(this, Class157.aClass157_1727, Class184.aClass184_2106, i, i_19_);
	}

	Class171_Sub1 method3108(Canvas canvas, int i, int i_20_) {
		return new Class171_Sub1_Sub1_Sub2(this, canvas);
	}

	void method3224(int i, int i_21_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14726();
		if (anInterface24_2085 != null)
			anInterface24_2085.method19((byte) -76);
	}

	public Interface21 method3419(int i, int i_22_, Class157 class157, Class184 class184, int i_23_) {
		return new Class486(this, class157, class184, i, i_22_, i_23_);
	}

	final Interface44 method15025(boolean bool) {
		return new Class479_Sub2(this, Class184.aClass184_2110, bool);
	}

	public void method3229() {
		OpenGL.glFinish();
	}

	public int[] method3113(int i, int i_24_, int i_25_, int i_26_) {
		int[] is = new int[i_25_ * i_26_];
		int i_27_ = aClass171_2080.method2729();
		for (int i_28_ = 0; i_28_ < i_26_; i_28_++)
			OpenGL.glReadPixelsi(i, i_27_ - i_24_ - i_28_ - 1, i_25_, 1, 32993, anInt11495, is, i_28_ * i_25_);
		return is;
	}

	public void method3114() {
		if (aClass171_2080 != null) {
			int i = aClass171_2080.method2728();
			int i_29_ = aClass171_2080.method2729();
			if (i > 0 || i_29_ > 0) {
				int i_30_ = anInt9586;
				int i_31_ = anInt9510;
				int i_32_ = anInt9466;
				int i_33_ = anInt9450;
				method3127();
				int i_34_ = anInt9468;
				int i_35_ = anInt9603;
				int i_36_ = anInt9486;
				int i_37_ = anInt9487;
				method3131();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method14941();
				method14993(false);
				method14954(false);
				method14950(false);
				method14951(false);
				method14971(null);
				method14973(1);
				method15238(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_29_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method3132(i_34_, i_36_, i_35_, i_37_);
				method3128(i_30_, i_31_, i_32_, i_33_);
			}
		}
	}

	public boolean method3469() {
		return aBool11496;
	}

	public boolean method3184() {
		if (aBool11496 && aLongArray11505[anInt11492] != 0L)
			return false;
		return true;
	}

	public boolean method3084() {
		return true;
	}

	public boolean method3118() {
		return false;
	}

	public int method3119() {
		if (aBool11496) {
			if (aLongArray11505[anInt11507] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11505[anInt11507], 0, 0);
			if (i == 37149) {
				method3120();
				return -1;
			}
			return i != 37147 ? anIntArray11498[anInt11507] : -1;
		}
		return -1;
	}

	public void method3121(int i, int i_38_, int i_39_) {
		method3242();
		if (aClass171_Sub2_11506 == null)
			method18000(i_38_, i_39_);
		if (aClass147_11501 == null)
			aClass147_11501 = method3226(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), false);
		else
			aClass147_11501.method2445(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), 0, 0);
		method3106(aClass171_Sub2_11506, (byte) -124);
		method3136(1, -16777216);
		aClass147_11501.method2418(anInt2083 * -1964562579, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293);
		OpenGL.glBindBufferARB(35051, anIntArray11475[anInt11492]);
		OpenGL.glReadPixelsub(0, 0, anInt2084 * -413349937, anInt2057 * 2000082117, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method3107(aClass171_Sub2_11506, -677418425);
		aLongArray11505[anInt11492] = OpenGL.glFenceSync(37143, 0);
		anIntArray11498[anInt11492] = i;
		if (++anInt11492 >= 3)
			anInt11492 = 0;
		method3167();
	}

	public void method3120() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11505[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11505[i]);
				aLongArray11505[i] = 0L;
			}
		}
		anInt11492 = 0;
		anInt11507 = 0;
	}

	public long method3117(int i, int i_40_) {
		return method17999(i, i_40_, null, null);
	}

	public Interface23 method3156(int i, int i_41_, int i_42_) {
		return new Class486(this, Class157.aClass157_1727, Class184.aClass184_2106, i, i_41_, i_42_);
	}

	long method17999(int i, int i_43_, int[] is, int[] is_44_) {
		if (aBool11496) {
			if (aLongArray11505[anInt11507] != 0L) {
				OpenGL.glDeleteSync(aLongArray11505[anInt11507]);
				aLongArray11505[anInt11507] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray11475[anInt11507]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_45_ = 0; i_45_ < i * i_43_; i_45_++)
					is[i_45_] = anUnsafe9437.getInt(l + (long) (i_45_ * 4));
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt11507 >= 3)
				anInt11507 = 0;
			return l;
		}
		if (aClass147_11502 == null)
			method18000(i, i_43_);
		if (aClass147_11501 == null)
			aClass147_11501 = method3226(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), false);
		else
			aClass147_11501.method2445(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), 0, 0);
		method3106(aClass171_Sub2_11506, (byte) -61);
		method3136(1, -16777216);
		aClass147_11501.method2418(anInt2083 * -1964562579, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293);
		aClass147_11502.method2412(0, 0, i, i_43_, is, is_44_, 0, i);
		method3107(aClass171_Sub2_11506, -677418425);
		return 0L;
	}

	public void method3123(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	Interface39 method14968(int i, boolean bool, int[][] is) {
		return new Class480_Sub3(this, i, bool, is);
	}

	void method18000(int i, int i_46_) {
		method3126();
		method3482(i, i_46_, -1784395681);
		if (aBool11496) {
			aClass147_11502 = method3161(i, i_46_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
			OpenGL.glGenBuffersARB(3, anIntArray11475, 0);
			for (int i_47_ = 0; i_47_ < 3; i_47_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11475[i_47_]);
				OpenGL.glBufferDataARBa(35051, i * i_46_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass147_11502 = method3161(i, i_46_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
		}
	}

	void method15285(int i) {
		if (!aBool11497)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public void method3136(int i, int i_48_) {
		int i_49_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_48_ & 0xff0000) / 1.671168E7F, (float) (i_48_ & 0xff00) / 65280.0F, (float) (i_48_ & 0xff) / 255.0F, (float) (i_48_ >>> 24) / 255.0F);
			i_49_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method14951(true);
			i_49_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_49_ |= 0x400;
		OpenGL.glClear(i_49_);
	}

	void method14928() {
		if (aClass171_2080 != null)
			OpenGL.glViewport(anInt9504 + anInt9586, (anInt9499 + aClass171_2080.method2729() - anInt9510 - anInt9450), anInt9466, anInt9450);
		OpenGL.glDepthRange(aFloat9480, aFloat9524);
	}

	static final int method18001(Class368 class368) {
		if (class368 == Class368.aClass368_3889)
			return 5890;
		if (class368 == Class368.aClass368_3887)
			return 34167;
		if (class368 == Class368.aClass368_3888)
			return 34168;
		if (class368 == Class368.aClass368_3890)
			return 34166;
		throw new IllegalArgumentException();
	}

	public void method3126() {
		if (aBool11496) {
			aClass147_11501 = null;
			if (aClass171_Sub2_11506 != null) {
				aClass171_Sub2_11506.method129();
				aClass171_Sub2_11506 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11475, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11475[i] = 0;
				if (aLongArray11505[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11505[i]);
					aLongArray11505[i] = 0L;
				}
			}
		} else {
			aClass171_Sub2_11506 = null;
			aClass147_11502 = null;
			aClass147_11501 = null;
		}
		anInt11492 = 0;
		anInt11507 = 0;
	}

	public boolean method3264() {
		return aBool11496;
	}

	public void method14940(Class427 class427) {
		float[] fs = class427.aFloatArray4807;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method15175() {
		/* empty */
	}

	void method15214() {
		OpenGL.glDepthMask(aBool9559 && aBool9563);
	}

	void method15247() {
		if (aBool9515 && !aBool9506)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method15193() {
		aFloatArray11468[0] = aFloat9551 * aFloat9583;
		aFloatArray11468[1] = aFloat9551 * aFloat9513;
		aFloatArray11468[2] = aFloat9551 * aFloat9448;
		aFloatArray11468[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11468, 0);
	}

	void method15044() {
		aFloatArray11468[0] = aFloat9516 * aFloat9583;
		aFloatArray11468[1] = aFloat9516 * aFloat9513;
		aFloatArray11468[2] = aFloat9516 * aFloat9448;
		aFloatArray11468[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11468, 0);
		aFloatArray11468[0] = -aFloat9548 * aFloat9583;
		aFloatArray11468[1] = -aFloat9548 * aFloat9513;
		aFloatArray11468[2] = -aFloat9548 * aFloat9448;
		aFloatArray11468[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11468, 0);
	}

	void method14955() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9507, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9519, 0);
	}

	void method18002(int i, int i_50_) {
		method3126();
		method3482(i, i_50_, -1784395681);
		if (aBool11496) {
			aClass147_11502 = method3161(i, i_50_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
			OpenGL.glGenBuffersARB(3, anIntArray11475, 0);
			for (int i_51_ = 0; i_51_ < 3; i_51_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11475[i_51_]);
				OpenGL.glBufferDataARBa(35051, i * i_50_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass147_11502 = method3161(i, i_50_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
		}
	}

	void method14956() {
		/* empty */
	}

	void method15185() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		int i;
		for (i = 0; i < anInt9440; i++) {
			Class527_Sub16 class527_sub16 = aClass527_Sub16Array9520[i];
			int i_52_ = class527_sub16.method16133((byte) 0);
			int i_53_ = 16386 + i;
			float f = class527_sub16.method16162(-1189174397) / 255.0F;
			aFloatArray11468[0] = (float) class527_sub16.method16129((byte) -80);
			aFloatArray11468[1] = (float) class527_sub16.method16130((byte) 34);
			aFloatArray11468[2] = (float) class527_sub16.method16131((byte) -1);
			aFloatArray11468[3] = 1.0F;
			OpenGL.glLightfv(i_53_, 4611, aFloatArray11468, 0);
			aFloatArray11468[0] = (float) (i_52_ >> 16 & 0xff) * f;
			aFloatArray11468[1] = (float) (i_52_ >> 8 & 0xff) * f;
			aFloatArray11468[2] = (float) (i_52_ & 0xff) * f;
			aFloatArray11468[3] = 1.0F;
			OpenGL.glLightfv(i_53_, 4609, aFloatArray11468, 0);
			OpenGL.glLightf(i_53_, 4617, (1.0F / (float) (class527_sub16.method16132(1084049312) * class527_sub16.method16132(-622292503))));
			OpenGL.glEnable(i_53_);
		}
		for (/**/; i < anInt9526; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method14960(Class157 class157, Class184 class184) {
		return true;
	}

	void method15181() {
		if (aBool9505) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	Interface38 method14964(Class157 class157, Class184 class184, int i, int i_54_) {
		return method15027(class157, class184, i, i_54_);
	}

	Interface38 method14967(int i, int i_55_, boolean bool, int[] is, int i_56_, int i_57_) {
		return new Class480_Sub1(this, i, i_55_, bool, is, i_56_, i_57_);
	}

	Interface38 method14965(Class157 class157, int i, int i_58_, boolean bool, byte[] is, int i_59_, int i_60_) {
		return new Class480_Sub1(this, class157, i, i_58_, bool, is, i_59_, i_60_);
	}

	void method14984() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9528[anInt9525] != Class377.aClass377_3923)
			OpenGL.glLoadMatrixf(aClass427Array9527[anInt9525].method6763(aFloatArray11499), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	Interface40 method15027(Class157 class157, Class184 class184, int i, int i_61_) {
		return new Class480_Sub1(this, class157, class184, i, i_61_);
	}

	Class355 method15152(Class372[] class372s) {
		return new Class355_Sub2(class372s);
	}

	Interface35 method15179(Class157 class157, int i, int i_62_, int i_63_, boolean bool, byte[] is) {
		return new Class480_Sub2(this, class157, i, i_62_, i_63_, bool, is);
	}

	public void method14906() {
		int i = anIntArray11478[anInt9525];
		if (i != 0) {
			anIntArray11478[anInt9525] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	public boolean method15250() {
		return aBool11493;
	}

	void method15255() {
		if (aBool9569)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method14986() {
		OpenGL.glTexEnvi(8960, 34161, method18016(aClass374Array9536[anInt9525]));
	}

	void method15039() {
		OpenGL.glTexEnvi(8960, 34162, method18016(aClass374Array9472[anInt9525]));
	}

	final void method14976(int i, Class368 class368, boolean bool, boolean bool_64_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method18010(class368));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_64_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_64_ ? 769 : 768);
	}

	final void method15289(int i, Class368 class368, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method18010(class368));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method15239() {
		aFloatArray11468[0] = (float) (anInt9531 & 0xff0000) / 1.671168E7F;
		aFloatArray11468[1] = (float) (anInt9531 & 0xff00) / 65280.0F;
		aFloatArray11468[2] = (float) (anInt9531 & 0xff) / 255.0F;
		aFloatArray11468[3] = (float) (anInt9531 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11468, 0);
	}

	void method15229() {
		OpenGL.glTexEnvi(8960, 34161, method18016(aClass374Array9536[anInt9525]));
	}

	Interface40 method15184(Class157 class157, Class184 class184, int i, int i_65_) {
		return new Class480_Sub1(this, class157, class184, i, i_65_);
	}

	void method14991(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public final synchronized void method3267(int i) {
		try {
			method18009();
		} catch (Exception exception) {
			return;
		}
		int i_66_ = 0;
		i &= 0x7fffffff;
		while (!aClass694_11467.method14088(997244402)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11467.method14077(-1608114503);
			anIntArray11472[i_66_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9502 -= class527_sub7.anInt10398 * -78845949;
			if (i_66_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_66_, anIntArray11472, 0);
				i_66_ = 0;
			}
		}
		if (i_66_ > 0) {
			OpenGL.glDeleteBuffersARB(i_66_, anIntArray11472, 0);
			i_66_ = 0;
		}
		while (!aClass694_11469.method14088(-424356146)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11469.method14077(-1533395280);
			anIntArray11472[i_66_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9445 -= class527_sub7.anInt10398 * -78845949;
			if (i_66_ == 1000) {
				OpenGL.glDeleteTextures(i_66_, anIntArray11472, 0);
				i_66_ = 0;
			}
		}
		if (i_66_ > 0) {
			OpenGL.glDeleteTextures(i_66_, anIntArray11472, 0);
			i_66_ = 0;
		}
		while (!aClass694_11504.method14088(696977332)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11504.method14077(-1470317479);
			anIntArray11472[i_66_++] = class527_sub7.anInt10398 * -78845949;
			if (i_66_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_66_, anIntArray11472, 0);
				i_66_ = 0;
			}
		}
		if (i_66_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_66_, anIntArray11472, 0);
			i_66_ = 0;
		}
		while (!aClass694_11471.method14088(-1218730721)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11471.method14077(-301561965);
			anIntArray11472[i_66_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9447 -= class527_sub7.anInt10398 * -78845949;
			if (i_66_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_66_, anIntArray11472, 0);
				i_66_ = 0;
			}
		}
		if (i_66_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_66_, anIntArray11472, 0);
			boolean bool = false;
		}
		while (!aClass694_11466.method14088(-340461962)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-1306713805);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		while (!aClass694_11503.method14088(-1192164880)) {
			Class527 class527 = aClass694_11503.method14077(-1256561875);
			OpenGL.glDeleteProgram((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11480.method14088(-178437131)) {
			Class527 class527 = aClass694_11480.method14077(-2013126869);
			OpenGL.glDeleteShader((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11466.method14088(1516142856)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-614138018);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		if (method3304() > 100663296 && Class234.method4347(-1408626088) > aLong11474 + 60000L) {
			System.gc();
			aLong11474 = Class234.method4347(-1408626088);
		}
		super.method3209(i);
	}

	void method14992() {
		if (aBool9588) {
			int i = 0;
			int i_67_ = 0;
			if (anInt9593 == 0) {
				i = 0;
				i_67_ = 0;
			} else if (anInt9593 == 1) {
				i = 1;
				i_67_ = 0;
			} else if (anInt9593 == 2) {
				i = 1;
				i_67_ = 1;
			} else if (anInt9593 == 3) {
				i = 0;
				i_67_ = 1;
			}
			if (aClass357_9568 == Class357.aClass357_3830)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_67_);
			else if (aClass357_9568 == Class357.aClass357_3826)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_67_);
			else if (aClass357_9568 == Class357.aClass357_3828)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_67_);
			else if (aClass357_9568 == Class357.aClass357_3829)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_67_);
		} else if (aClass357_9568 == Class357.aClass357_3830) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass357_9568 == Class357.aClass357_3826) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass357_9568 == Class357.aClass357_3828) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	void method15155() {
		if (aBool9569)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	public final void method15019(Class364 class364, int i, int i_68_) {
		int i_69_;
		int i_70_;
		if (class364 == Class364.aClass364_3863) {
			i_69_ = 1;
			i_70_ = i_68_ * 2;
		} else if (class364 == Class364.aClass364_3864) {
			i_69_ = 3;
			i_70_ = i_68_ + 1;
		} else if (class364 == Class364.aClass364_3861) {
			i_69_ = 4;
			i_70_ = i_68_ * 3;
		} else if (class364 == Class364.aClass364_3862) {
			i_69_ = 6;
			i_70_ = i_68_ + 2;
		} else if (class364 == Class364.aClass364_3858) {
			i_69_ = 5;
			i_70_ = i_68_ + 2;
		} else {
			i_69_ = 0;
			i_70_ = i_68_;
		}
		OpenGL.glDrawArrays(i_69_, i, i_70_);
	}

	void method14996() {
		if (aBool9560 && aBool9473 && anInt9562 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method14938() {
		if (aBool9505) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	final synchronized void method18003(long l) {
		Class527 class527 = new Class527();
		class527.aLong7106 = l * -42244196890836447L;
		aClass694_11480.method14147(class527, -2113255695);
	}

	final Interface37 method15035(boolean bool) {
		return new Class479_Sub1(this, bool);
	}

	Interface38 method15190(Class157 class157, Class184 class184, int i, int i_71_) {
		return method15027(class157, class184, i, i_71_);
	}

	void method15040() {
		if (aBool9588) {
			int i = 0;
			int i_72_ = 0;
			if (anInt9593 == 0) {
				i = 0;
				i_72_ = 0;
			} else if (anInt9593 == 1) {
				i = 1;
				i_72_ = 0;
			} else if (anInt9593 == 2) {
				i = 1;
				i_72_ = 1;
			} else if (anInt9593 == 3) {
				i = 0;
				i_72_ = 1;
			}
			if (aClass357_9568 == Class357.aClass357_3830)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_72_);
			else if (aClass357_9568 == Class357.aClass357_3826)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_72_);
			else if (aClass357_9568 == Class357.aClass357_3828)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_72_);
			else if (aClass357_9568 == Class357.aClass357_3829)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_72_);
		} else if (aClass357_9568 == Class357.aClass357_3830) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass357_9568 == Class357.aClass357_3826) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass357_9568 == Class357.aClass357_3828) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	public void method14988(int i, Interface37 interface37) {
		aClass479_Sub1Array11470[i] = (Class479_Sub1) interface37;
	}

	void method15001(Interface44 interface44) {
		aClass479_Sub2_11481 = (Class479_Sub2) interface44;
		aClass479_Sub2_11481.method7790();
	}

	final Interface37 method15002(boolean bool) {
		return new Class479_Sub1(this, bool);
	}

	final synchronized void method18004(int i) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i);
		aClass694_11504.method14147(class527_sub7, -2039668238);
	}

	final void method15009(Interface44 interface44, Class364 class364, int i, int i_73_, int i_74_, int i_75_) {
		int i_76_;
		int i_77_;
		if (class364 == Class364.aClass364_3863) {
			i_76_ = 1;
			i_77_ = i_75_ * 2;
		} else if (class364 == Class364.aClass364_3864) {
			i_76_ = 3;
			i_77_ = i_75_ + 1;
		} else if (class364 == Class364.aClass364_3861) {
			i_76_ = 4;
			i_77_ = i_75_ * 3;
		} else if (class364 == Class364.aClass364_3862) {
			i_76_ = 6;
			i_77_ = i_75_ + 2;
		} else if (class364 == Class364.aClass364_3858) {
			i_76_ = 5;
			i_77_ = i_75_ + 2;
		} else {
			i_76_ = 0;
			i_77_ = i_75_;
		}
		Class184 class184 = interface44.method329();
		Class479_Sub2 class479_sub2 = (Class479_Sub2) interface44;
		class479_sub2.method7790();
		OpenGL.glDrawElements(i_76_, i_77_, method18007(class184), (class479_sub2.method7789() + (long) (i_74_ * (class184.anInt2111 * 408933829))));
	}

	public final void method15010(Class364 class364, int i, int i_78_, int i_79_, int i_80_) {
		int i_81_;
		int i_82_;
		if (class364 == Class364.aClass364_3863) {
			i_81_ = 1;
			i_82_ = i_80_ * 2;
		} else if (class364 == Class364.aClass364_3864) {
			i_81_ = 3;
			i_82_ = i_80_ + 1;
		} else if (class364 == Class364.aClass364_3861) {
			i_81_ = 4;
			i_82_ = i_80_ * 3;
		} else if (class364 == Class364.aClass364_3862) {
			i_81_ = 6;
			i_82_ = i_80_ + 2;
		} else if (class364 == Class364.aClass364_3858) {
			i_81_ = 5;
			i_82_ = i_80_ + 2;
		} else {
			i_81_ = 0;
			i_82_ = i_80_;
		}
		Class184 class184 = aClass479_Sub2_11481.method329();
		OpenGL.glDrawElements(i_81_, i_82_, method18007(class184), (aClass479_Sub2_11481.method7789() + (long) (i_79_ * (class184.anInt2111 * 408933829))));
	}

	public final synchronized void method3209(int i) {
		try {
			method18009();
		} catch (Exception exception) {
			return;
		}
		int i_83_ = 0;
		i &= 0x7fffffff;
		while (!aClass694_11467.method14088(1375247135)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11467.method14077(-1242280785);
			anIntArray11472[i_83_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9502 -= class527_sub7.anInt10398 * -78845949;
			if (i_83_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_83_, anIntArray11472, 0);
				i_83_ = 0;
			}
		}
		if (i_83_ > 0) {
			OpenGL.glDeleteBuffersARB(i_83_, anIntArray11472, 0);
			i_83_ = 0;
		}
		while (!aClass694_11469.method14088(-1285693440)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11469.method14077(-1447856696);
			anIntArray11472[i_83_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9445 -= class527_sub7.anInt10398 * -78845949;
			if (i_83_ == 1000) {
				OpenGL.glDeleteTextures(i_83_, anIntArray11472, 0);
				i_83_ = 0;
			}
		}
		if (i_83_ > 0) {
			OpenGL.glDeleteTextures(i_83_, anIntArray11472, 0);
			i_83_ = 0;
		}
		while (!aClass694_11504.method14088(131713606)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11504.method14077(-852871159);
			anIntArray11472[i_83_++] = class527_sub7.anInt10398 * -78845949;
			if (i_83_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_83_, anIntArray11472, 0);
				i_83_ = 0;
			}
		}
		if (i_83_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_83_, anIntArray11472, 0);
			i_83_ = 0;
		}
		while (!aClass694_11471.method14088(146260512)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11471.method14077(-1070897660);
			anIntArray11472[i_83_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9447 -= class527_sub7.anInt10398 * -78845949;
			if (i_83_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_83_, anIntArray11472, 0);
				i_83_ = 0;
			}
		}
		if (i_83_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_83_, anIntArray11472, 0);
			boolean bool = false;
		}
		while (!aClass694_11466.method14088(-938608712)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-2074202654);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		while (!aClass694_11503.method14088(-1683181337)) {
			Class527 class527 = aClass694_11503.method14077(-1072184697);
			OpenGL.glDeleteProgram((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11480.method14088(1803401288)) {
			Class527 class527 = aClass694_11480.method14077(-1035054858);
			OpenGL.glDeleteShader((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11466.method14088(1169165554)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-362070046);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		if (method3304() > 100663296 && Class234.method4347(-1408626088) > aLong11474 + 60000L) {
			System.gc();
			aLong11474 = Class234.method4347(-1408626088);
		}
		super.method3209(i);
	}

	boolean method15188(Class157 class157, Class184 class184) {
		return aBool9587;
	}

	final synchronized void method18005(int i, int i_84_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_84_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11469.method14147(class527_sub7, -1349851401);
	}

	public Class143 method3370() {
		int i = -1;
		if (aString11485.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11485.indexOf("intel") != -1)
			i = 32902;
		else if (aString11485.indexOf("ati") != -1)
			i = 4098;
		return new Class143(i, method14891() ? "OpenGL FF" : "OpenGL", anInt11487, aString11486, 0L, method14891());
	}

	Class355 method14999(Class372[] class372s) {
		return new Class355_Sub2(class372s);
	}

	void method15093() {
		OpenGL.glActiveTexture(33984 + anInt9525);
	}

	final synchronized void method18006(int i) {
		Class527 class527 = new Class527();
		class527.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11503.method14147(class527, -908538029);
	}

	static final int method18007(Class184 class184) {
		switch (class184.anInt2103 * -1159397783) {
		case 6:
			return 5120;
		case 8:
			return 5126;
		case 4:
			return 5123;
		default:
			return 5121;
		case 1:
			return 5125;
		case 7:
			return 5124;
		case 3:
			return 5121;
		case 2:
			return 5122;
		case 0:
			return 5131;
		}
	}

	static int method18008(Class157 class157) {
		switch (class157.anInt1730 * -524990245) {
		case 7:
			return 6402;
		case 5:
			return 6406;
		case 8:
			return 6409;
		case 4:
			return 6410;
		case 1:
			return 6408;
		default:
			throw new IllegalStateException();
		case 6:
			return 6407;
		}
	}

	public Class171_Sub2 method3109() {
		return new Class171_Sub2_Sub1_Sub2(this);
	}

	void method14985() {
		OpenGL.glActiveTexture(33984 + anInt9525);
	}

	void method18009() {
		int i = 0;
		while (!anOpenGL11482.method1674()) {
			if (i++ > 5)
				throw new RuntimeException("");
			Class518.method8635(1000L);
		}
	}

	void method15013(int i) {
		if (!aBool11497)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method15208() {
		if (aBool9570)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9571 & 0xff) / 255.0F);
		if (anInt9573 > 1) {
			if (aByte9571 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	static final int method18010(Class368 class368) {
		if (class368 == Class368.aClass368_3889)
			return 5890;
		if (class368 == Class368.aClass368_3887)
			return 34167;
		if (class368 == Class368.aClass368_3888)
			return 34168;
		if (class368 == Class368.aClass368_3890)
			return 34166;
		throw new IllegalArgumentException();
	}

	public Class143 method3218() {
		int i = -1;
		if (aString11485.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11485.indexOf("intel") != -1)
			i = 32902;
		else if (aString11485.indexOf("ati") != -1)
			i = 4098;
		return new Class143(i, method14891() ? "OpenGL FF" : "OpenGL", anInt11487, aString11486, 0L, method14891());
	}

	public void method14916(Class427 class427, Class427 class427_85_, Class427 class427_86_) {
		OpenGL.glMatrixMode(5888);
		aClass427_9435.method6739(class427, class427_85_);
		OpenGL.glLoadMatrixf(aClass427_9435.aFloatArray4807, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class427_86_.aFloatArray4807, 0);
	}

	public Class143 method3220() {
		int i = -1;
		if (aString11485.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11485.indexOf("intel") != -1)
			i = 32902;
		else if (aString11485.indexOf("ati") != -1)
			i = 4098;
		return new Class143(i, method14891() ? "OpenGL FF" : "OpenGL", anInt11487, aString11486, 0L, method14891());
	}

	Interface38 method15057(Class157 class157, int i, int i_87_, boolean bool, byte[] is, int i_88_, int i_89_) {
		return new Class480_Sub1(this, class157, i, i_87_, bool, is, i_88_, i_89_);
	}

	void method3122(int i, int i_90_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14726();
		if (anInterface24_2085 != null)
			anInterface24_2085.method19((byte) -123);
	}

	final synchronized void method18011(int i, int i_91_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_91_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11467.method14147(class527_sub7, -1259912641);
	}

	public void method3225() {
		OpenGL.glFinish();
	}

	Interface39 method14957(int i, boolean bool, int[][] is) {
		return new Class480_Sub3(this, i, bool, is);
	}

	public boolean method14889() {
		return aBool11493;
	}

	long method18012(int i, int i_92_, int[] is, int[] is_93_) {
		if (aBool11496) {
			if (aLongArray11505[anInt11507] != 0L) {
				OpenGL.glDeleteSync(aLongArray11505[anInt11507]);
				aLongArray11505[anInt11507] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray11475[anInt11507]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_94_ = 0; i_94_ < i * i_92_; i_94_++)
					is[i_94_] = anUnsafe9437.getInt(l + (long) (i_94_ * 4));
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt11507 >= 3)
				anInt11507 = 0;
			return l;
		}
		if (aClass147_11502 == null)
			method18000(i, i_92_);
		if (aClass147_11501 == null)
			aClass147_11501 = method3226(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), false);
		else
			aClass147_11501.method2445(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), 0, 0);
		method3106(aClass171_Sub2_11506, (byte) -97);
		method3136(1, -16777216);
		aClass147_11501.method2418(anInt2083 * -1964562579, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293);
		aClass147_11502.method2412(0, 0, i, i_92_, is, is_93_, 0, i);
		method3107(aClass171_Sub2_11506, -677418425);
		return 0L;
	}

	void method3228() {
		super.method3082();
		if (anOpenGL11482 != null) {
			anOpenGL11482.method1675();
			anOpenGL11482.release();
			anOpenGL11482 = null;
		}
	}

	void method3092() {
		super.method3082();
		if (anOpenGL11482 != null) {
			anOpenGL11482.method1675();
			anOpenGL11482.release();
			anOpenGL11482 = null;
		}
	}

	void method3230() {
		super.method3082();
		if (anOpenGL11482 != null) {
			anOpenGL11482.method1675();
			anOpenGL11482.release();
			anOpenGL11482 = null;
		}
	}

	void method3310() {
		super.method3082();
		if (anOpenGL11482 != null) {
			anOpenGL11482.method1675();
			anOpenGL11482.release();
			anOpenGL11482 = null;
		}
	}

	void method3423() {
		super.method3082();
		if (anOpenGL11482 != null) {
			anOpenGL11482.method1675();
			anOpenGL11482.release();
			anOpenGL11482 = null;
		}
	}

	public final synchronized void method3233(int i) {
		try {
			method18009();
		} catch (Exception exception) {
			return;
		}
		int i_95_ = 0;
		i &= 0x7fffffff;
		while (!aClass694_11467.method14088(-709896494)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11467.method14077(-1130869996);
			anIntArray11472[i_95_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9502 -= class527_sub7.anInt10398 * -78845949;
			if (i_95_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_95_, anIntArray11472, 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteBuffersARB(i_95_, anIntArray11472, 0);
			i_95_ = 0;
		}
		while (!aClass694_11469.method14088(789942508)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11469.method14077(-1219190609);
			anIntArray11472[i_95_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9445 -= class527_sub7.anInt10398 * -78845949;
			if (i_95_ == 1000) {
				OpenGL.glDeleteTextures(i_95_, anIntArray11472, 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteTextures(i_95_, anIntArray11472, 0);
			i_95_ = 0;
		}
		while (!aClass694_11504.method14088(-258699388)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11504.method14077(-335416363);
			anIntArray11472[i_95_++] = class527_sub7.anInt10398 * -78845949;
			if (i_95_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_95_, anIntArray11472, 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_95_, anIntArray11472, 0);
			i_95_ = 0;
		}
		while (!aClass694_11471.method14088(-2084715170)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11471.method14077(-1457099018);
			anIntArray11472[i_95_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9447 -= class527_sub7.anInt10398 * -78845949;
			if (i_95_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_95_, anIntArray11472, 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_95_, anIntArray11472, 0);
			boolean bool = false;
		}
		while (!aClass694_11466.method14088(835137587)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-1129961151);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		while (!aClass694_11503.method14088(155443580)) {
			Class527 class527 = aClass694_11503.method14077(-1217738854);
			OpenGL.glDeleteProgram((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11480.method14088(-1943573080)) {
			Class527 class527 = aClass694_11480.method14077(-1068185724);
			OpenGL.glDeleteShader((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11466.method14088(1916201207)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-1028719434);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		if (method3304() > 100663296 && Class234.method4347(-1408626088) > aLong11474 + 60000L) {
			System.gc();
			aLong11474 = Class234.method4347(-1408626088);
		}
		super.method3209(i);
	}

	void method18013(int i, int i_96_) {
		method3126();
		method3482(i, i_96_, -1784395681);
		if (aBool11496) {
			aClass147_11502 = method3161(i, i_96_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
			OpenGL.glGenBuffersARB(3, anIntArray11475, 0);
			for (int i_97_ = 0; i_97_ < 3; i_97_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11475[i_97_]);
				OpenGL.glBufferDataARBa(35051, i * i_96_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass147_11502 = method3161(i, i_96_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
		}
	}

	public void method15268(Class355 class355) {
		Class372[] class372s = class355.aClass372Array3810;
		int i = 0;
		boolean bool = false;
		boolean bool_98_ = false;
		boolean bool_99_ = false;
		for (int i_100_ = 0; i_100_ < class372s.length; i_100_++) {
			Class372 class372 = class372s[i_100_];
			Class479_Sub1 class479_sub1 = aClass479_Sub1Array11470[i_100_];
			int i_101_ = 0;
			int i_102_ = class479_sub1.method15838();
			long l = class479_sub1.method7789();
			class479_sub1.method7790();
			for (int i_103_ = 0; i_103_ < class372.method6365(); i_103_++) {
				Class347 class347 = class372.method6366(i_103_);
				switch (class347.anInt3744) {
				case 11:
					OpenGL.glVertexPointer(3, 5126, i_102_, l + (long) i_101_);
					bool_99_ = true;
					break;
				case 1:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_102_, l + (long) i_101_);
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_102_, l + (long) i_101_);
					break;
				case 6:
					OpenGL.glColorPointer(4, 5121, i_102_, l + (long) i_101_);
					bool = true;
					break;
				default:
					break;
				case 2:
					OpenGL.glNormalPointer(5126, i_102_, l + (long) i_101_);
					bool_98_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_102_, l + (long) i_101_);
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_102_, l + (long) i_101_);
				}
				i_101_ += class347.anInt3748;
			}
		}
		if (aBool11489 != bool_99_) {
			if (bool_99_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11489 = bool_99_;
		}
		if (aBool11476 != bool_98_) {
			if (bool_98_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11476 = bool_98_;
		}
		if (aBool11477 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11477 = bool;
		}
		if (anInt11479 < i) {
			for (int i_104_ = anInt11479; i_104_ < i; i_104_++) {
				OpenGL.glClientActiveTexture(33984 + i_104_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11479 = i;
		} else if (anInt11479 > i) {
			for (int i_105_ = i; i_105_ < anInt11479; i_105_++) {
				OpenGL.glClientActiveTexture(33984 + i_105_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11479 = i;
		}
	}

	public String method3254() {
		String string = "Caps: 4:";
		String string_106_ = ":";
		string = new StringBuilder().append(string).append(anInt9573).append(string_106_).toString();
		string = new StringBuilder().append(string).append(anInt11495).append(string_106_).toString();
		string = new StringBuilder().append(string).append(anInt9521).append(string_106_).toString();
		string = new StringBuilder().append(string).append(anInt9580).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool11488 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool9518 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool11473 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool11494 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool11491 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool11493 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool9587 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool11484 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool9585 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool11490 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool9581 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool9494 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool9567 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(aBool9588 ? 1 : 0).append(string_106_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	public String method3101() {
		String string = "Caps: 4:";
		String string_107_ = ":";
		string = new StringBuilder().append(string).append(anInt9573).append(string_107_).toString();
		string = new StringBuilder().append(string).append(anInt11495).append(string_107_).toString();
		string = new StringBuilder().append(string).append(anInt9521).append(string_107_).toString();
		string = new StringBuilder().append(string).append(anInt9580).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool11488 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool9518 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool11473 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool11494 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool11491 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool11493 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool9587 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool11484 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool9585 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool11490 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool9581 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool9494 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool9567 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(aBool9588 ? 1 : 0).append(string_107_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	public void method3257(boolean bool) {
		/* empty */
	}

	public void method3258(boolean bool) {
		/* empty */
	}

	Class171_Sub1 method3491(Canvas canvas, int i, int i_108_) {
		return new Class171_Sub1_Sub1_Sub2(this, canvas);
	}

	void method15113() {
		if (aClass171_2080 != null)
			OpenGL.glViewport(anInt9504 + anInt9586, (anInt9499 + aClass171_2080.method2729() - anInt9510 - anInt9450), anInt9466, anInt9450);
		OpenGL.glDepthRange(aFloat9480, aFloat9524);
	}

	void method14949() {
		OpenGL.glTexEnvi(8960, 34161, method18016(aClass374Array9536[anInt9525]));
	}

	public void method3261() {
		if (aClass171_2080 != null) {
			int i = aClass171_2080.method2728();
			int i_109_ = aClass171_2080.method2729();
			if (i > 0 || i_109_ > 0) {
				int i_110_ = anInt9586;
				int i_111_ = anInt9510;
				int i_112_ = anInt9466;
				int i_113_ = anInt9450;
				method3127();
				int i_114_ = anInt9468;
				int i_115_ = anInt9603;
				int i_116_ = anInt9486;
				int i_117_ = anInt9487;
				method3131();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method14941();
				method14993(false);
				method14954(false);
				method14950(false);
				method14951(false);
				method14971(null);
				method14973(1);
				method15238(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_109_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method3132(i_114_, i_116_, i_115_, i_117_);
				method3128(i_110_, i_111_, i_112_, i_113_);
			}
		}
	}

	public void method3227() {
		OpenGL.glFinish();
	}

	public boolean method3265() {
		return aBool11496;
	}

	Interface35 method15204(Class157 class157, int i, int i_118_, int i_119_, boolean bool, byte[] is) {
		return new Class480_Sub2(this, class157, i, i_118_, i_119_, bool, is);
	}

	public boolean method3247() {
		if (aBool11496 && aLongArray11505[anInt11492] != 0L)
			return false;
		return true;
	}

	public boolean method3140() {
		if (aBool11496 && aLongArray11505[anInt11492] != 0L)
			return false;
		return true;
	}

	public boolean method3133() {
		return true;
	}

	public boolean method3316() {
		return true;
	}

	public int method3402() {
		if (aBool11496) {
			if (aLongArray11505[anInt11507] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11505[anInt11507], 0, 0);
			if (i == 37149) {
				method3120();
				return -1;
			}
			return i != 37147 ? anIntArray11498[anInt11507] : -1;
		}
		return -1;
	}

	public void method3272(int i, int i_120_, int i_121_) {
		method3242();
		if (aClass171_Sub2_11506 == null)
			method18000(i_120_, i_121_);
		if (aClass147_11501 == null)
			aClass147_11501 = method3226(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), false);
		else
			aClass147_11501.method2445(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), 0, 0);
		method3106(aClass171_Sub2_11506, (byte) -56);
		method3136(1, -16777216);
		aClass147_11501.method2418(anInt2083 * -1964562579, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293);
		OpenGL.glBindBufferARB(35051, anIntArray11475[anInt11492]);
		OpenGL.glReadPixelsub(0, 0, anInt2084 * -413349937, anInt2057 * 2000082117, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method3107(aClass171_Sub2_11506, -677418425);
		aLongArray11505[anInt11492] = OpenGL.glFenceSync(37143, 0);
		anIntArray11498[anInt11492] = i;
		if (++anInt11492 >= 3)
			anInt11492 = 0;
		method3167();
	}

	public void method3273() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11505[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11505[i]);
				aLongArray11505[i] = 0L;
			}
		}
		anInt11492 = 0;
		anInt11507 = 0;
	}

	public long method3274(int i, int i_122_) {
		return method17999(i, i_122_, null, null);
	}

	public long method3275(int i, int i_123_) {
		return method17999(i, i_123_, null, null);
	}

	public void method3276(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public void method3246(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public void method3278(int i, int i_124_, int[] is, int[] is_125_) {
		method17999(i, i_124_, is, is_125_);
	}

	public void method3429(int i, int i_126_) {
		int i_127_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_126_ & 0xff0000) / 1.671168E7F, (float) (i_126_ & 0xff00) / 65280.0F, (float) (i_126_ & 0xff) / 255.0F, (float) (i_126_ >>> 24) / 255.0F);
			i_127_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method14951(true);
			i_127_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_127_ |= 0x400;
		OpenGL.glClear(i_127_);
	}

	public Class179 method3390(Class179 class179, Class179 class179_128_, float f, Class179 class179_129_) {
		return f < 0.5F ? class179 : class179_128_;
	}

	public Class179 method3391(Class179 class179, Class179 class179_130_, float f, Class179 class179_131_) {
		return f < 0.5F ? class179 : class179_130_;
	}

	public Class171_Sub2 method3464() {
		return new Class171_Sub2_Sub1_Sub2(this);
	}

	void method15168() {
		aFloatArray11468[0] = aFloat9516 * aFloat9583;
		aFloatArray11468[1] = aFloat9516 * aFloat9513;
		aFloatArray11468[2] = aFloat9516 * aFloat9448;
		aFloatArray11468[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11468, 0);
		aFloatArray11468[0] = -aFloat9548 * aFloat9583;
		aFloatArray11468[1] = -aFloat9548 * aFloat9513;
		aFloatArray11468[2] = -aFloat9548 * aFloat9448;
		aFloatArray11468[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11468, 0);
	}

	public Interface21 method3431(int i, int i_132_, Class157 class157, Class184 class184, int i_133_) {
		return new Class486(this, class157, class184, i, i_132_, i_133_);
	}

	public Interface21 method3432(int i, int i_134_, Class157 class157, Class184 class184, int i_135_) {
		return new Class486(this, class157, class184, i, i_134_, i_135_);
	}

	public Interface23 method3522(int i, int i_136_) {
		return new Class486(this, Class157.aClass157_1727, Class184.aClass184_2106, i, i_136_);
	}

	public Interface23 method3434(int i, int i_137_) {
		return new Class486(this, Class157.aClass157_1727, Class184.aClass184_2106, i, i_137_);
	}

	public Interface23 method3435(int i, int i_138_, int i_139_) {
		return new Class486(this, Class157.aClass157_1727, Class184.aClass184_2106, i, i_138_, i_139_);
	}

	public boolean method3441() {
		return false;
	}

	public boolean method3442() {
		return false;
	}

	public void method3219() {
		if (aBool11496) {
			aClass147_11501 = null;
			if (aClass171_Sub2_11506 != null) {
				aClass171_Sub2_11506.method129();
				aClass171_Sub2_11506 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11475, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11475[i] = 0;
				if (aLongArray11505[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11505[i]);
					aLongArray11505[i] = 0L;
				}
			}
		} else {
			aClass171_Sub2_11506 = null;
			aClass147_11502 = null;
			aClass147_11501 = null;
		}
		anInt11492 = 0;
		anInt11507 = 0;
	}

	public void method3444() {
		if (aBool11496) {
			aClass147_11501 = null;
			if (aClass171_Sub2_11506 != null) {
				aClass171_Sub2_11506.method129();
				aClass171_Sub2_11506 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11475, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11475[i] = 0;
				if (aLongArray11505[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11505[i]);
					aLongArray11505[i] = 0L;
				}
			}
		} else {
			aClass171_Sub2_11506 = null;
			aClass147_11502 = null;
			aClass147_11501 = null;
		}
		anInt11492 = 0;
		anInt11507 = 0;
	}

	public boolean method15067() {
		return aBool11491;
	}

	static final int method18014(Class184 class184) {
		switch (class184.anInt2103 * -1159397783) {
		case 6:
			return 5120;
		case 8:
			return 5126;
		case 4:
			return 5123;
		default:
			return 5121;
		case 1:
			return 5125;
		case 7:
			return 5124;
		case 3:
			return 5121;
		case 2:
			return 5122;
		case 0:
			return 5131;
		}
	}

	public boolean method15069() {
		return aBool11493;
	}

	void method14919() {
		/* empty */
	}

	Class355 method15267(Class372[] class372s) {
		return new Class355_Sub2(class372s);
	}

	public boolean method15075() {
		return aBool11493;
	}

	public boolean method15072() {
		return aBool11493;
	}

	public boolean method15073(boolean bool) {
		return true;
	}

	public boolean method14898(boolean bool) {
		return true;
	}

	public boolean method15058(boolean bool) {
		return true;
	}

	public boolean method15076(boolean bool) {
		return true;
	}

	public int[] method3259(int i, int i_140_, int i_141_, int i_142_) {
		int[] is = new int[i_141_ * i_142_];
		int i_143_ = aClass171_2080.method2729();
		for (int i_144_ = 0; i_144_ < i_142_; i_144_++)
			OpenGL.glReadPixelsi(i, i_143_ - i_140_ - i_144_ - 1, i_141_, 1, 32993, anInt11495, is, i_144_ * i_141_);
		return is;
	}

	public Class261 method15086(String string) {
		byte[] is = method18020(string);
		if (is == null)
			return null;
		Class272 class272 = method14896(is);
		return new Class261_Sub1(this, class272);
	}

	public void method15090(Class427 class427, Class427 class427_145_, Class427 class427_146_) {
		OpenGL.glMatrixMode(5888);
		aClass427_9435.method6739(class427, class427_145_);
		OpenGL.glLoadMatrixf(aClass427_9435.aFloatArray4807, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class427_146_.aFloatArray4807, 0);
	}

	public void method15301(Class427 class427, Class427 class427_147_, Class427 class427_148_) {
		OpenGL.glMatrixMode(5888);
		aClass427_9435.method6739(class427, class427_147_);
		OpenGL.glLoadMatrixf(aClass427_9435.aFloatArray4807, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class427_148_.aFloatArray4807, 0);
	}

	public void method14969(Class427 class427, Class427 class427_149_, Class427 class427_150_) {
		OpenGL.glMatrixMode(5888);
		aClass427_9435.method6739(class427, class427_149_);
		OpenGL.glLoadMatrixf(aClass427_9435.aFloatArray4807, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class427_150_.aFloatArray4807, 0);
	}

	public float method15102() {
		return 0.0F;
	}

	Interface38 method15191(Class157 class157, int i, int i_151_, boolean bool, byte[] is, int i_152_, int i_153_) {
		return new Class480_Sub1(this, class157, i, i_151_, bool, is, i_152_, i_153_);
	}

	void method15114() {
		if (aClass171_2080 != null)
			OpenGL.glViewport(anInt9504 + anInt9586, (anInt9499 + aClass171_2080.method2729() - anInt9510 - anInt9450), anInt9466, anInt9450);
		OpenGL.glDepthRange(aFloat9480, aFloat9524);
	}

	void method15115() {
		if (aClass171_2080 != null)
			OpenGL.glViewport(anInt9504 + anInt9586, (anInt9499 + aClass171_2080.method2729() - anInt9510 - anInt9450), anInt9466, anInt9450);
		OpenGL.glDepthRange(aFloat9480, aFloat9524);
	}

	void method15116() {
		if (aClass171_2080 != null) {
			int i = anInt9504 + anInt9468;
			int i_154_ = anInt9499 + aClass171_2080.method2729() - anInt9487;
			int i_155_ = anInt9603 - anInt9468;
			int i_156_ = anInt9487 - anInt9486;
			if (i_155_ < 0)
				i_155_ = 0;
			if (i_156_ < 0)
				i_156_ = 0;
			OpenGL.glScissor(i, i_154_, i_155_, i_156_);
		}
	}

	void method15059() {
		if (aClass171_2080 != null) {
			int i = anInt9504 + anInt9468;
			int i_157_ = anInt9499 + aClass171_2080.method2729() - anInt9487;
			int i_158_ = anInt9603 - anInt9468;
			int i_159_ = anInt9487 - anInt9486;
			if (i_158_ < 0)
				i_158_ = 0;
			if (i_159_ < 0)
				i_159_ = 0;
			OpenGL.glScissor(i, i_157_, i_158_, i_159_);
		}
	}

	public void method15138(Class427 class427) {
		float[] fs = class427.aFloatArray4807;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public void method15139(Class427 class427) {
		float[] fs = class427.aFloatArray4807;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public void method15140(Class427 class427) {
		float[] fs = class427.aFloatArray4807;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public void method15043(Class427 class427) {
		float[] fs = class427.aFloatArray4807;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method14918() {
		if (aBool9427 && aBool9503)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method15164() {
		if (aBool9427 && aBool9503)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method15046() {
		if (aBool9515 && !aBool9506)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method15131() {
		if (aBool9515 && !aBool9506)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method15167() {
		if (aBool9515 && !aBool9506)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	static int method18015(Class157 class157, Class184 class184) {
		if (class184 == Class184.aClass184_2104) {
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 6408;
			case 4:
				return 6410;
			case 8:
				return 6409;
			case 6:
				return 6407;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 33777;
			case 2:
				return 33779;
			case 5:
				return 6406;
			}
		}
		if (class184 == Class184.aClass184_2110) {
			switch (class157.anInt1730 * -524990245) {
			case 4:
				return 36219;
			case 8:
				return 32834;
			case 1:
				return 32859;
			case 7:
				return 33189;
			case 5:
				return 32830;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 32852;
			}
		}
		if (class184 == Class184.aClass184_2106) {
			switch (class157.anInt1730 * -524990245) {
			case 7:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class184 == Class184.aClass184_2107) {
			switch (class157.anInt1730 * -524990245) {
			default:
				throw new IllegalArgumentException();
			case 7:
				return 33191;
			}
		}
		if (class184 == Class184.aClass184_2108) {
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 34842;
			case 8:
				return 34846;
			case 6:
				return 34843;
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34847;
			case 5:
				return 34844;
			}
		}
		if (class184 == Class184.aClass184_2109) {
			switch (class157.anInt1730 * -524990245) {
			case 4:
				return 34841;
			case 5:
				return 34838;
			case 1:
				return 34836;
			case 6:
				return 34837;
			case 8:
				return 34840;
			default:
				throw new IllegalArgumentException();
			}
		}
		throw new IllegalArgumentException();
	}

	void method15169() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9507, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9519, 0);
	}

	void method14963() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9507, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9519, 0);
	}

	void method14983(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	void method15052() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9507, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9519, 0);
	}

	void method15172() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9507, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9519, 0);
	}

	void method15206(int i) {
		if (!aBool11497)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method15230() {
		if (aBool9505) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	static final int method18016(Class374 class374) {
		if (class374 == Class374.aClass374_3909)
			return 7681;
		if (class374 == Class374.aClass374_3910)
			return 8448;
		if (class374 == Class374.aClass374_3912)
			return 34165;
		if (class374 == Class374.aClass374_3913)
			return 260;
		if (class374 == Class374.aClass374_3911)
			return 34023;
		throw new IllegalArgumentException();
	}

	public Interface21 method3430(int i, int i_160_, Class157 class157, Class184 class184, int i_161_) {
		return new Class486(this, class157, class184, i, i_160_, i_161_);
	}

	static final int method18017(Class368 class368) {
		if (class368 == Class368.aClass368_3889)
			return 5890;
		if (class368 == Class368.aClass368_3887)
			return 34167;
		if (class368 == Class368.aClass368_3888)
			return 34168;
		if (class368 == Class368.aClass368_3890)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method15178() {
		if (aBool9505) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method15032() {
		if (aBool9505) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public Class261 method15085(String string) {
		byte[] is = method18020(string);
		if (is == null)
			return null;
		Class272 class272 = method14896(is);
		return new Class261_Sub1(this, class272);
	}

	void method18018(int i, int i_162_) {
		method3126();
		method3482(i, i_162_, -1784395681);
		if (aBool11496) {
			aClass147_11502 = method3161(i, i_162_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
			OpenGL.glGenBuffersARB(3, anIntArray11475, 0);
			for (int i_163_ = 0; i_163_ < 3; i_163_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11475[i_163_]);
				OpenGL.glBufferDataARBa(35051, i * i_162_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass147_11502 = method3161(i, i_162_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
		}
	}

	void method15305() {
		aFloat9565 = aFloat9485 - (float) anInt9589;
		aFloat9517 = aFloat9565 - (float) anInt9562;
		if (aFloat9517 < aFloat9484)
			aFloat9517 = aFloat9484;
		if (aBool9597) {
			OpenGL.glFogf(2915, aFloat9517);
			OpenGL.glFogf(2916, aFloat9565);
			aFloatArray11468[0] = (float) (anInt9561 & 0xff0000) / 1.671168E7F;
			aFloatArray11468[1] = (float) (anInt9561 & 0xff00) / 65280.0F;
			aFloatArray11468[2] = (float) (anInt9561 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray11468, 0);
		}
	}

	void method15183() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		int i;
		for (i = 0; i < anInt9440; i++) {
			Class527_Sub16 class527_sub16 = aClass527_Sub16Array9520[i];
			int i_164_ = class527_sub16.method16133((byte) 0);
			int i_165_ = 16386 + i;
			float f = class527_sub16.method16162(-1969621092) / 255.0F;
			aFloatArray11468[0] = (float) class527_sub16.method16129((byte) -68);
			aFloatArray11468[1] = (float) class527_sub16.method16130((byte) 102);
			aFloatArray11468[2] = (float) class527_sub16.method16131((byte) 10);
			aFloatArray11468[3] = 1.0F;
			OpenGL.glLightfv(i_165_, 4611, aFloatArray11468, 0);
			aFloatArray11468[0] = (float) (i_164_ >> 16 & 0xff) * f;
			aFloatArray11468[1] = (float) (i_164_ >> 8 & 0xff) * f;
			aFloatArray11468[2] = (float) (i_164_ & 0xff) * f;
			aFloatArray11468[3] = 1.0F;
			OpenGL.glLightfv(i_165_, 4609, aFloatArray11468, 0);
			OpenGL.glLightf(i_165_, 4617, (1.0F / (float) (class527_sub16.method16132(37156162) * class527_sub16.method16132(-760678529))));
			OpenGL.glEnable(i_165_);
		}
		for (/**/; i < anInt9526; i++)
			OpenGL.glDisable(16386 + i);
	}

	void method15295() {
		aFloatArray11468[0] = aFloat9551 * aFloat9583;
		aFloatArray11468[1] = aFloat9551 * aFloat9513;
		aFloatArray11468[2] = aFloat9551 * aFloat9448;
		aFloatArray11468[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11468, 0);
	}

	Interface38 method15189(Class157 class157, Class184 class184, int i, int i_166_) {
		return method15027(class157, class184, i, i_166_);
	}

	public Class143 method3217() {
		int i = -1;
		if (aString11485.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11485.indexOf("intel") != -1)
			i = 32902;
		else if (aString11485.indexOf("ati") != -1)
			i = 4098;
		return new Class143(i, method14891() ? "OpenGL FF" : "OpenGL", anInt11487, aString11486, 0L, method14891());
	}

	void method18019() {
		if (anInt9572 == 1)
			OpenGL.glDisable(2884);
		else {
			OpenGL.glEnable(2884);
			if (anInt9572 == 2)
				OpenGL.glCullFace(1029);
			else if (anInt9572 == 3)
				OpenGL.glCullFace(1028);
		}
	}

	public boolean method3335() {
		if (aBool11496 && aLongArray11505[anInt11492] != 0L)
			return false;
		return true;
	}

	byte[] method18020(String string) {
		return method14895("gl", string);
	}

	Interface38 method15194(Class157 class157, int i, int i_167_, boolean bool, float[] fs, int i_168_, int i_169_) {
		return new Class480_Sub1(this, class157, i, i_167_, bool, fs, i_168_, i_169_);
	}

	Interface38 method15195(Class157 class157, int i, int i_170_, boolean bool, float[] fs, int i_171_, int i_172_) {
		return new Class480_Sub1(this, class157, i, i_170_, bool, fs, i_171_, i_172_);
	}

	Interface38 method14966(Class157 class157, int i, int i_173_, boolean bool, float[] fs, int i_174_, int i_175_) {
		return new Class480_Sub1(this, class157, i, i_173_, bool, fs, i_174_, i_175_);
	}

	Interface38 method15196(int i, int i_176_, boolean bool, int[] is, int i_177_, int i_178_) {
		return new Class480_Sub1(this, i, i_176_, bool, is, i_177_, i_178_);
	}

	Interface38 method15197(int i, int i_179_, boolean bool, int[] is, int i_180_, int i_181_) {
		return new Class480_Sub1(this, i, i_179_, bool, is, i_180_, i_181_);
	}

	Interface38 method15198(int i, int i_182_, boolean bool, int[] is, int i_183_, int i_184_) {
		return new Class480_Sub1(this, i, i_182_, bool, is, i_183_, i_184_);
	}

	public float method14911() {
		return 0.0F;
	}

	Interface39 method14917(int i, boolean bool, int[][] is) {
		return new Class480_Sub3(this, i, bool, is);
	}

	public boolean method14888() {
		return aBool11491;
	}

	boolean method14961(Class157 class157, Class184 class184) {
		return aBool9587;
	}

	Interface35 method15202(Class157 class157, int i, int i_185_, int i_186_, boolean bool, byte[] is) {
		return new Class480_Sub2(this, class157, i, i_185_, i_186_, bool, is);
	}

	Interface35 method15203(Class157 class157, int i, int i_187_, int i_188_, boolean bool, byte[] is) {
		return new Class480_Sub2(this, class157, i, i_187_, i_188_, bool, is);
	}

	void method3223(int i, int i_189_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14726();
		if (anInterface24_2085 != null)
			anInterface24_2085.method19((byte) -11);
	}

	Interface35 method15005(Class157 class157, int i, int i_190_, int i_191_, boolean bool, byte[] is) {
		return new Class480_Sub2(this, class157, i, i_190_, i_191_, bool, is);
	}

	public void method15211() {
		int i = anIntArray11478[anInt9525];
		if (i != 0) {
			anIntArray11478[anInt9525] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	final void method15223(int i, Class368 class368, boolean bool, boolean bool_192_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method18010(class368));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_192_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_192_ ? 769 : 768);
	}

	final void method15224(int i, Class368 class368, boolean bool, boolean bool_193_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method18010(class368));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_193_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_193_ ? 769 : 768);
	}

	final void method15225(int i, Class368 class368, boolean bool, boolean bool_194_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method18010(class368));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_194_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_194_ ? 769 : 768);
	}

	final void method15226(int i, Class368 class368, boolean bool, boolean bool_195_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method18010(class368));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_195_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_195_ ? 769 : 768);
	}

	final void method15293(int i, Class368 class368, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method18010(class368));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	void method15228() {
		OpenGL.glActiveTexture(33984 + anInt9525);
	}

	void method14924() {
		OpenGL.glActiveTexture(33984 + anInt9525);
	}

	void method15182() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		int i;
		for (i = 0; i < anInt9440; i++) {
			Class527_Sub16 class527_sub16 = aClass527_Sub16Array9520[i];
			int i_196_ = class527_sub16.method16133((byte) 0);
			int i_197_ = 16386 + i;
			float f = class527_sub16.method16162(-1990440527) / 255.0F;
			aFloatArray11468[0] = (float) class527_sub16.method16129((byte) 84);
			aFloatArray11468[1] = (float) class527_sub16.method16130((byte) -51);
			aFloatArray11468[2] = (float) class527_sub16.method16131((byte) -45);
			aFloatArray11468[3] = 1.0F;
			OpenGL.glLightfv(i_197_, 4611, aFloatArray11468, 0);
			aFloatArray11468[0] = (float) (i_196_ >> 16 & 0xff) * f;
			aFloatArray11468[1] = (float) (i_196_ >> 8 & 0xff) * f;
			aFloatArray11468[2] = (float) (i_196_ & 0xff) * f;
			aFloatArray11468[3] = 1.0F;
			OpenGL.glLightfv(i_197_, 4609, aFloatArray11468, 0);
			OpenGL.glLightf(i_197_, 4617, (1.0F / (float) (class527_sub16.method16132(348652468) * class527_sub16.method16132(-861597071))));
			OpenGL.glEnable(i_197_);
		}
		for (/**/; i < anInt9526; i++)
			OpenGL.glDisable(16386 + i);
	}

	Interface38 method15163(Class157 class157, int i, int i_198_, boolean bool, float[] fs, int i_199_, int i_200_) {
		return new Class480_Sub1(this, class157, i, i_198_, bool, fs, i_199_, i_200_);
	}

	void method15094() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9507, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9519, 0);
	}

	public Class179 method3409(Class179 class179, Class179 class179_201_, float f, Class179 class179_202_) {
		return f < 0.5F ? class179 : class179_201_;
	}

	Interface39 method15201(int i, boolean bool, int[][] is) {
		return new Class480_Sub3(this, i, bool, is);
	}

	void method15242() {
		OpenGL.glTexEnvi(8960, 34162, method18016(aClass374Array9472[anInt9525]));
	}

	void method14952() {
		if (aBool9427 && aBool9503)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method15251(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method15192() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9528[anInt9525] != Class377.aClass377_3923)
			OpenGL.glLoadMatrixf(aClass427Array9527[anInt9525].method6763(aFloatArray11499), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method15261() {
		if (aBool9560 && aBool9473 && anInt9562 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	static final int method18021(Class368 class368) {
		if (class368 == Class368.aClass368_3889)
			return 5890;
		if (class368 == Class368.aClass368_3887)
			return 34167;
		if (class368 == Class368.aClass368_3888)
			return 34168;
		if (class368 == Class368.aClass368_3890)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method15254() {
		if (aBool9588) {
			int i = 0;
			int i_203_ = 0;
			if (anInt9593 == 0) {
				i = 0;
				i_203_ = 0;
			} else if (anInt9593 == 1) {
				i = 1;
				i_203_ = 0;
			} else if (anInt9593 == 2) {
				i = 1;
				i_203_ = 1;
			} else if (anInt9593 == 3) {
				i = 0;
				i_203_ = 1;
			}
			if (aClass357_9568 == Class357.aClass357_3830)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_203_);
			else if (aClass357_9568 == Class357.aClass357_3826)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_203_);
			else if (aClass357_9568 == Class357.aClass357_3828)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_203_);
			else if (aClass357_9568 == Class357.aClass357_3829)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_203_);
		} else if (aClass357_9568 == Class357.aClass357_3830) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass357_9568 == Class357.aClass357_3826) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass357_9568 == Class357.aClass357_3828) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	void method15173() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass427_9459.aFloatArray4807, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9507, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9519, 0);
	}

	void method15241() {
		OpenGL.glTexEnvi(8960, 34161, method18016(aClass374Array9536[anInt9525]));
	}

	void method15180() {
		if (aBool9505) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method15262(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	void method14981(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	final Interface37 method15282(boolean bool) {
		return new Class479_Sub1(this, bool);
	}

	static final int method18022(Class368 class368) {
		if (class368 == Class368.aClass368_3889)
			return 5890;
		if (class368 == Class368.aClass368_3887)
			return 34167;
		if (class368 == Class368.aClass368_3888)
			return 34168;
		if (class368 == Class368.aClass368_3890)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method14922() {
		if (aBool9604)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	Class355 method15266(Class372[] class372s) {
		return new Class355_Sub2(class372s);
	}

	void method3350(int i, int i_204_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14726();
		if (anInterface24_2085 != null)
			anInterface24_2085.method19((byte) -107);
	}

	void method3082() {
		super.method3082();
		if (anOpenGL11482 != null) {
			anOpenGL11482.method1675();
			anOpenGL11482.release();
			anOpenGL11482 = null;
		}
	}

	public void method15045(Class355 class355) {
		Class372[] class372s = class355.aClass372Array3810;
		int i = 0;
		boolean bool = false;
		boolean bool_205_ = false;
		boolean bool_206_ = false;
		for (int i_207_ = 0; i_207_ < class372s.length; i_207_++) {
			Class372 class372 = class372s[i_207_];
			Class479_Sub1 class479_sub1 = aClass479_Sub1Array11470[i_207_];
			int i_208_ = 0;
			int i_209_ = class479_sub1.method15838();
			long l = class479_sub1.method7789();
			class479_sub1.method7790();
			for (int i_210_ = 0; i_210_ < class372.method6365(); i_210_++) {
				Class347 class347 = class372.method6366(i_210_);
				switch (class347.anInt3744) {
				case 11:
					OpenGL.glVertexPointer(3, 5126, i_209_, l + (long) i_208_);
					bool_206_ = true;
					break;
				case 1:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_209_, l + (long) i_208_);
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_209_, l + (long) i_208_);
					break;
				case 6:
					OpenGL.glColorPointer(4, 5121, i_209_, l + (long) i_208_);
					bool = true;
					break;
				default:
					break;
				case 2:
					OpenGL.glNormalPointer(5126, i_209_, l + (long) i_208_);
					bool_205_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_209_, l + (long) i_208_);
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_209_, l + (long) i_208_);
				}
				i_208_ += class347.anInt3748;
			}
		}
		if (aBool11489 != bool_206_) {
			if (bool_206_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11489 = bool_206_;
		}
		if (aBool11476 != bool_205_) {
			if (bool_205_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11476 = bool_205_;
		}
		if (aBool11477 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11477 = bool;
		}
		if (anInt11479 < i) {
			for (int i_211_ = anInt11479; i_211_ < i; i_211_++) {
				OpenGL.glClientActiveTexture(33984 + i_211_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11479 = i;
		} else if (anInt11479 > i) {
			for (int i_212_ = i; i_212_ < anInt11479; i_212_++) {
				OpenGL.glClientActiveTexture(33984 + i_212_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11479 = i;
		}
	}

	public void method15269(int i, Interface37 interface37) {
		aClass479_Sub1Array11470[i] = (Class479_Sub1) interface37;
	}

	public void method15270(int i, Interface37 interface37) {
		aClass479_Sub1Array11470[i] = (Class479_Sub1) interface37;
	}

	final synchronized void method18023(int i) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i);
		aClass694_11504.method14147(class527_sub7, -1762088042);
	}

	void method15271(Interface44 interface44) {
		aClass479_Sub2_11481 = (Class479_Sub2) interface44;
		aClass479_Sub2_11481.method7790();
	}

	void method15272(Interface44 interface44) {
		aClass479_Sub2_11481 = (Class479_Sub2) interface44;
		aClass479_Sub2_11481.method7790();
	}

	void method15037(Interface44 interface44) {
		aClass479_Sub2_11481 = (Class479_Sub2) interface44;
		aClass479_Sub2_11481.method7790();
	}

	public final void method15042(Class364 class364, int i, int i_213_) {
		int i_214_;
		int i_215_;
		if (class364 == Class364.aClass364_3863) {
			i_214_ = 1;
			i_215_ = i_213_ * 2;
		} else if (class364 == Class364.aClass364_3864) {
			i_214_ = 3;
			i_215_ = i_213_ + 1;
		} else if (class364 == Class364.aClass364_3861) {
			i_214_ = 4;
			i_215_ = i_213_ * 3;
		} else if (class364 == Class364.aClass364_3862) {
			i_214_ = 6;
			i_215_ = i_213_ + 2;
		} else if (class364 == Class364.aClass364_3858) {
			i_214_ = 5;
			i_215_ = i_213_ + 2;
		} else {
			i_214_ = 0;
			i_215_ = i_213_;
		}
		OpenGL.glDrawArrays(i_214_, i, i_215_);
	}

	final Interface44 method15263(boolean bool) {
		return new Class479_Sub2(this, Class184.aClass184_2110, bool);
	}

	final void method15281(Interface44 interface44, Class364 class364, int i, int i_216_, int i_217_, int i_218_) {
		int i_219_;
		int i_220_;
		if (class364 == Class364.aClass364_3863) {
			i_219_ = 1;
			i_220_ = i_218_ * 2;
		} else if (class364 == Class364.aClass364_3864) {
			i_219_ = 3;
			i_220_ = i_218_ + 1;
		} else if (class364 == Class364.aClass364_3861) {
			i_219_ = 4;
			i_220_ = i_218_ * 3;
		} else if (class364 == Class364.aClass364_3862) {
			i_219_ = 6;
			i_220_ = i_218_ + 2;
		} else if (class364 == Class364.aClass364_3858) {
			i_219_ = 5;
			i_220_ = i_218_ + 2;
		} else {
			i_219_ = 0;
			i_220_ = i_218_;
		}
		Class184 class184 = interface44.method329();
		Class479_Sub2 class479_sub2 = (Class479_Sub2) interface44;
		class479_sub2.method7790();
		OpenGL.glDrawElements(i_219_, i_220_, method18007(class184), (class479_sub2.method7789() + (long) (i_217_ * (class184.anInt2111 * 408933829))));
	}

	public final void method15234(Class364 class364, int i, int i_221_, int i_222_, int i_223_) {
		int i_224_;
		int i_225_;
		if (class364 == Class364.aClass364_3863) {
			i_224_ = 1;
			i_225_ = i_223_ * 2;
		} else if (class364 == Class364.aClass364_3864) {
			i_224_ = 3;
			i_225_ = i_223_ + 1;
		} else if (class364 == Class364.aClass364_3861) {
			i_224_ = 4;
			i_225_ = i_223_ * 3;
		} else if (class364 == Class364.aClass364_3862) {
			i_224_ = 6;
			i_225_ = i_223_ + 2;
		} else if (class364 == Class364.aClass364_3858) {
			i_224_ = 5;
			i_225_ = i_223_ + 2;
		} else {
			i_224_ = 0;
			i_225_ = i_223_;
		}
		Class184 class184 = aClass479_Sub2_11481.method329();
		OpenGL.glDrawElements(i_224_, i_225_, method18007(class184), (aClass479_Sub2_11481.method7789() + (long) (i_222_ * (class184.anInt2111 * 408933829))));
	}

	final synchronized void method18024(int i, int i_226_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_226_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11469.method14147(class527_sub7, -1645540202);
	}

	void method15286(int i) {
		if (!aBool11497)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method15287(int i) {
		if (!aBool11497)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	final synchronized void method18025(int i, int i_227_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_227_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11471.method14147(class527_sub7, -1620551310);
	}

	void method15292() {
		OpenGL.glDepthFunc(515);
		method18019();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9518) {
			method14997(anInt9573 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9521 - 1; i >= 0; i--) {
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
			int i_228_ = 16384 + i;
			OpenGL.glLightfv(i_228_, 4608, fs, 0);
			OpenGL.glLightf(i_228_, 4615, 0.0F);
			OpenGL.glLightf(i_228_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11482.setSwapInterval(0);
		super.method14900();
	}

	void method15264() {
		if (aBool9604)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method15294() {
		OpenGL.glDepthMask(aBool9559 && aBool9563);
	}

	Interface38 method14978(Class157 class157, int i, int i_229_, boolean bool, byte[] is, int i_230_, int i_231_) {
		return new Class480_Sub1(this, class157, i, i_229_, bool, is, i_230_, i_231_);
	}

	public final void method15008(Class364 class364, int i, int i_232_) {
		int i_233_;
		int i_234_;
		if (class364 == Class364.aClass364_3863) {
			i_233_ = 1;
			i_234_ = i_232_ * 2;
		} else if (class364 == Class364.aClass364_3864) {
			i_233_ = 3;
			i_234_ = i_232_ + 1;
		} else if (class364 == Class364.aClass364_3861) {
			i_233_ = 4;
			i_234_ = i_232_ * 3;
		} else if (class364 == Class364.aClass364_3862) {
			i_233_ = 6;
			i_234_ = i_232_ + 2;
		} else if (class364 == Class364.aClass364_3858) {
			i_233_ = 5;
			i_234_ = i_232_ + 2;
		} else {
			i_233_ = 0;
			i_234_ = i_232_;
		}
		OpenGL.glDrawArrays(i_233_, i, i_234_);
	}

	boolean method15016(Class157 class157, Class184 class184) {
		return true;
	}

	boolean method15296(Class157 class157, Class184 class184) {
		return true;
	}

	boolean method15297(Class157 class157, Class184 class184) {
		return true;
	}

	public boolean method15021() {
		return aBool11493;
	}

	Interface39 method15199(int i, boolean bool, int[][] is) {
		return new Class480_Sub3(this, i, bool, is);
	}

	void method15300() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9528[anInt9525] != Class377.aClass377_3923)
			OpenGL.glLoadMatrixf(aClass427Array9527[anInt9525].method6763(aFloatArray11499), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method15252() {
		if (aBool9570)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9571 & 0xff) / 255.0F);
		if (anInt9573 > 1) {
			if (aByte9571 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method15004() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9528[anInt9525] != Class377.aClass377_3923)
			OpenGL.glLoadMatrixf(aClass427Array9527[anInt9525].method6763(aFloatArray11499), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	final void method15303() {
		aFloatArray11468[0] = (float) (anInt9531 & 0xff0000) / 1.671168E7F;
		aFloatArray11468[1] = (float) (anInt9531 & 0xff00) / 65280.0F;
		aFloatArray11468[2] = (float) (anInt9531 & 0xff) / 255.0F;
		aFloatArray11468[3] = (float) (anInt9531 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11468, 0);
	}

	final void method15095() {
		aFloatArray11468[0] = (float) (anInt9531 & 0xff0000) / 1.671168E7F;
		aFloatArray11468[1] = (float) (anInt9531 & 0xff00) / 65280.0F;
		aFloatArray11468[2] = (float) (anInt9531 & 0xff) / 255.0F;
		aFloatArray11468[3] = (float) (anInt9531 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11468, 0);
	}

	final void method15304() {
		aFloatArray11468[0] = (float) (anInt9531 & 0xff0000) / 1.671168E7F;
		aFloatArray11468[1] = (float) (anInt9531 & 0xff00) / 65280.0F;
		aFloatArray11468[2] = (float) (anInt9531 & 0xff) / 255.0F;
		aFloatArray11468[3] = (float) (anInt9531 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11468, 0);
	}

	byte[] method18026(String string) {
		return method14895("gl", string);
	}

	long method18027(int i, int i_235_, int[] is, int[] is_236_) {
		if (aBool11496) {
			if (aLongArray11505[anInt11507] != 0L) {
				OpenGL.glDeleteSync(aLongArray11505[anInt11507]);
				aLongArray11505[anInt11507] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray11475[anInt11507]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_237_ = 0; i_237_ < i * i_235_; i_237_++)
					is[i_237_] = anUnsafe9437.getInt(l + (long) (i_237_ * 4));
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt11507 >= 3)
				anInt11507 = 0;
			return l;
		}
		if (aClass147_11502 == null)
			method18000(i, i_235_);
		if (aClass147_11501 == null)
			aClass147_11501 = method3226(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), false);
		else
			aClass147_11501.method2445(0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), 0, 0);
		method3106(aClass171_Sub2_11506, (byte) -110);
		method3136(1, -16777216);
		aClass147_11501.method2418(anInt2083 * -1964562579, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293);
		aClass147_11502.method2412(0, 0, i, i_235_, is, is_236_, 0, i);
		method3107(aClass171_Sub2_11506, -677418425);
		return 0L;
	}

	public void method3266(int i, int i_238_, int[] is, int[] is_239_) {
		method17999(i, i_238_, is, is_239_);
	}

	void method15176() {
		/* empty */
	}

	void method18028(int i, int i_240_) {
		method3126();
		method3482(i, i_240_, -1784395681);
		if (aBool11496) {
			aClass147_11502 = method3161(i, i_240_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
			OpenGL.glGenBuffersARB(3, anIntArray11475, 0);
			for (int i_241_ = 0; i_241_ < 3; i_241_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11475[i_241_]);
				OpenGL.glBufferDataARBa(35051, i * i_240_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass147_11502 = method3161(i, i_240_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
		}
	}

	void method14910() {
		OpenGL.glTexEnvi(8960, 34161, method18016(aClass374Array9536[anInt9525]));
	}

	void method18029(int i, int i_242_) {
		method3126();
		method3482(i, i_242_, -1784395681);
		if (aBool11496) {
			aClass147_11502 = method3161(i, i_242_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
			OpenGL.glGenBuffersARB(3, anIntArray11475, 0);
			for (int i_243_ = 0; i_243_ < 3; i_243_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11475[i_243_]);
				OpenGL.glBufferDataARBa(35051, i * i_242_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass147_11502 = method3161(i, i_242_, false, true);
			aClass171_Sub2_11506 = method3109();
			aClass171_Sub2_11506.method15321(0, aClass147_11502.method2454());
		}
	}

	public final synchronized void method3235(int i) {
		try {
			method18009();
		} catch (Exception exception) {
			return;
		}
		int i_244_ = 0;
		i &= 0x7fffffff;
		while (!aClass694_11467.method14088(1686455924)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11467.method14077(-640401127);
			anIntArray11472[i_244_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9502 -= class527_sub7.anInt10398 * -78845949;
			if (i_244_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_244_, anIntArray11472, 0);
				i_244_ = 0;
			}
		}
		if (i_244_ > 0) {
			OpenGL.glDeleteBuffersARB(i_244_, anIntArray11472, 0);
			i_244_ = 0;
		}
		while (!aClass694_11469.method14088(-257090886)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11469.method14077(-1000531138);
			anIntArray11472[i_244_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9445 -= class527_sub7.anInt10398 * -78845949;
			if (i_244_ == 1000) {
				OpenGL.glDeleteTextures(i_244_, anIntArray11472, 0);
				i_244_ = 0;
			}
		}
		if (i_244_ > 0) {
			OpenGL.glDeleteTextures(i_244_, anIntArray11472, 0);
			i_244_ = 0;
		}
		while (!aClass694_11504.method14088(-857992183)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11504.method14077(-1330238974);
			anIntArray11472[i_244_++] = class527_sub7.anInt10398 * -78845949;
			if (i_244_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_244_, anIntArray11472, 0);
				i_244_ = 0;
			}
		}
		if (i_244_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_244_, anIntArray11472, 0);
			i_244_ = 0;
		}
		while (!aClass694_11471.method14088(-1836595274)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11471.method14077(-1154080219);
			anIntArray11472[i_244_++] = (int) (class527_sub7.aLong7106 * -8168620736534281759L);
			anInt9447 -= class527_sub7.anInt10398 * -78845949;
			if (i_244_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_244_, anIntArray11472, 0);
				i_244_ = 0;
			}
		}
		if (i_244_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_244_, anIntArray11472, 0);
			boolean bool = false;
		}
		while (!aClass694_11466.method14088(140937971)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-617609864);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		while (!aClass694_11503.method14088(-1686500903)) {
			Class527 class527 = aClass694_11503.method14077(-1710667363);
			OpenGL.glDeleteProgram((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11480.method14088(192777953)) {
			Class527 class527 = aClass694_11480.method14077(-1055407004);
			OpenGL.glDeleteShader((int) (class527.aLong7106 * -8168620736534281759L));
		}
		while (!aClass694_11466.method14088(-878956037)) {
			Node_Sub6 class527_sub7 = (Node_Sub6) aClass694_11466.method14077(-1997516344);
			OpenGL.glDeleteLists((int) (class527_sub7.aLong7106 * -8168620736534281759L), class527_sub7.anInt10398 * -78845949);
		}
		if (method3304() > 100663296 && Class234.method4347(-1408626088) > aLong11474 + 60000L) {
			System.gc();
			aLong11474 = Class234.method4347(-1408626088);
		}
		super.method3209(i);
	}

	public String method3096() {
		String string = "Caps: 4:";
		String string_245_ = ":";
		string = new StringBuilder().append(string).append(anInt9573).append(string_245_).toString();
		string = new StringBuilder().append(string).append(anInt11495).append(string_245_).toString();
		string = new StringBuilder().append(string).append(anInt9521).append(string_245_).toString();
		string = new StringBuilder().append(string).append(anInt9580).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool11488 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool9518 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool11473 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool11494 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool11491 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool11493 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool9587 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool11484 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool9585 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool11490 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool9581 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool9494 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool9567 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(aBool9588 ? 1 : 0).append(string_245_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	public void method3339(boolean bool) {
		/* empty */
	}

	final synchronized void method18030(int i, int i_246_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_246_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11471.method14147(class527_sub7, -1343380923);
	}

	void method14997(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	void method18031() {
		if (anInt9572 == 1)
			OpenGL.glDisable(2884);
		else {
			OpenGL.glEnable(2884);
			if (anInt9572 == 2)
				OpenGL.glCullFace(1029);
			else if (anInt9572 == 3)
				OpenGL.glCullFace(1028);
		}
	}

	void method15299() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9528[anInt9525] != Class377.aClass377_3923)
			OpenGL.glLoadMatrixf(aClass427Array9527[anInt9525].method6763(aFloatArray11499), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	final synchronized void method18032(int i, int i_247_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_247_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11467.method14147(class527_sub7, -178263852);
	}

	final synchronized void method18033(int i, int i_248_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_248_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11467.method14147(class527_sub7, -88060909);
	}

	final synchronized void method18034(int i, int i_249_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_249_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11469.method14147(class527_sub7, -1419297386);
	}

	final synchronized void method18035(int i, int i_250_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_250_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11469.method14147(class527_sub7, -742595967);
	}

	void method15015() {
		OpenGL.glDepthMask(aBool9559 && aBool9563);
	}

	final synchronized void method18036(int i) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i);
		aClass694_11504.method14147(class527_sub7, -1457823610);
	}

	public void method15077(int i, Interface37 interface37) {
		aClass479_Sub1Array11470[i] = (Class479_Sub1) interface37;
	}

	final synchronized void method18037(int i, int i_251_) {
		Node_Sub6 class527_sub7 = new Node_Sub6(i_251_);
		class527_sub7.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11471.method14147(class527_sub7, -1803293330);
	}

	public void method15149(Class355 class355) {
		Class372[] class372s = class355.aClass372Array3810;
		int i = 0;
		boolean bool = false;
		boolean bool_252_ = false;
		boolean bool_253_ = false;
		for (int i_254_ = 0; i_254_ < class372s.length; i_254_++) {
			Class372 class372 = class372s[i_254_];
			Class479_Sub1 class479_sub1 = aClass479_Sub1Array11470[i_254_];
			int i_255_ = 0;
			int i_256_ = class479_sub1.method15838();
			long l = class479_sub1.method7789();
			class479_sub1.method7790();
			for (int i_257_ = 0; i_257_ < class372.method6365(); i_257_++) {
				Class347 class347 = class372.method6366(i_257_);
				switch (class347.anInt3744) {
				case 11:
					OpenGL.glVertexPointer(3, 5126, i_256_, l + (long) i_255_);
					bool_253_ = true;
					break;
				case 1:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_256_, l + (long) i_255_);
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_256_, l + (long) i_255_);
					break;
				case 6:
					OpenGL.glColorPointer(4, 5121, i_256_, l + (long) i_255_);
					bool = true;
					break;
				default:
					break;
				case 2:
					OpenGL.glNormalPointer(5126, i_256_, l + (long) i_255_);
					bool_252_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_256_, l + (long) i_255_);
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_256_, l + (long) i_255_);
				}
				i_255_ += class347.anInt3748;
			}
		}
		if (aBool11489 != bool_253_) {
			if (bool_253_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11489 = bool_253_;
		}
		if (aBool11476 != bool_252_) {
			if (bool_252_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11476 = bool_252_;
		}
		if (aBool11477 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11477 = bool;
		}
		if (anInt11479 < i) {
			for (int i_258_ = anInt11479; i_258_ < i; i_258_++) {
				OpenGL.glClientActiveTexture(33984 + i_258_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11479 = i;
		} else if (anInt11479 > i) {
			for (int i_259_ = i; i_259_ < anInt11479; i_259_++) {
				OpenGL.glClientActiveTexture(33984 + i_259_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11479 = i;
		}
	}

	final synchronized void method18038(long l) {
		Class527 class527 = new Class527();
		class527.aLong7106 = l * -42244196890836447L;
		aClass694_11480.method14147(class527, -237689284);
	}

	final synchronized void method18039(int i) {
		Class527 class527 = new Class527();
		class527.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11503.method14147(class527, -316604010);
	}

	final synchronized void method18040(int i) {
		Class527 class527 = new Class527();
		class527.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11503.method14147(class527, -1478196875);
	}

	final synchronized void method18041(int i) {
		Class527 class527 = new Class527();
		class527.aLong7106 = (long) i * -42244196890836447L;
		aClass694_11503.method14147(class527, -2125508069);
	}

	void method15031() {
		if (aBool9570)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9571 & 0xff) / 255.0F);
		if (anInt9573 > 1) {
			if (aByte9571 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	static final int method18042(Class184 class184) {
		switch (class184.anInt2103 * -1159397783) {
		case 6:
			return 5120;
		case 8:
			return 5126;
		case 4:
			return 5123;
		default:
			return 5121;
		case 1:
			return 5125;
		case 7:
			return 5124;
		case 3:
			return 5121;
		case 2:
			return 5122;
		case 0:
			return 5131;
		}
	}

	static int method18043(Class157 class157) {
		switch (class157.anInt1730 * -524990245) {
		case 7:
			return 6402;
		case 5:
			return 6406;
		case 8:
			return 6409;
		case 4:
			return 6410;
		case 1:
			return 6408;
		default:
			throw new IllegalStateException();
		case 6:
			return 6407;
		}
	}

	static int method18044(Class157 class157) {
		switch (class157.anInt1730 * -524990245) {
		case 7:
			return 6402;
		case 5:
			return 6406;
		case 8:
			return 6409;
		case 4:
			return 6410;
		case 1:
			return 6408;
		default:
			throw new IllegalStateException();
		case 6:
			return 6407;
		}
	}

	static int method18045(Class157 class157) {
		switch (class157.anInt1730 * -524990245) {
		case 7:
			return 6402;
		case 5:
			return 6406;
		case 8:
			return 6409;
		case 4:
			return 6410;
		case 1:
			return 6408;
		default:
			throw new IllegalStateException();
		case 6:
			return 6407;
		}
	}

	static int method18046(Class157 class157, Class184 class184) {
		if (class184 == Class184.aClass184_2104) {
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 6408;
			case 4:
				return 6410;
			case 8:
				return 6409;
			case 6:
				return 6407;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 33777;
			case 2:
				return 33779;
			case 5:
				return 6406;
			}
		}
		if (class184 == Class184.aClass184_2110) {
			switch (class157.anInt1730 * -524990245) {
			case 4:
				return 36219;
			case 8:
				return 32834;
			case 1:
				return 32859;
			case 7:
				return 33189;
			case 5:
				return 32830;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 32852;
			}
		}
		if (class184 == Class184.aClass184_2106) {
			switch (class157.anInt1730 * -524990245) {
			case 7:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class184 == Class184.aClass184_2107) {
			switch (class157.anInt1730 * -524990245) {
			default:
				throw new IllegalArgumentException();
			case 7:
				return 33191;
			}
		}
		if (class184 == Class184.aClass184_2108) {
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 34842;
			case 8:
				return 34846;
			case 6:
				return 34843;
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34847;
			case 5:
				return 34844;
			}
		}
		if (class184 == Class184.aClass184_2109) {
			switch (class157.anInt1730 * -524990245) {
			case 4:
				return 34841;
			case 5:
				return 34838;
			case 1:
				return 34836;
			case 6:
				return 34837;
			case 8:
				return 34840;
			default:
				throw new IllegalArgumentException();
			}
		}
		throw new IllegalArgumentException();
	}

	static int method18047(Class157 class157, Class184 class184) {
		if (class184 == Class184.aClass184_2104) {
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 6408;
			case 4:
				return 6410;
			case 8:
				return 6409;
			case 6:
				return 6407;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 33777;
			case 2:
				return 33779;
			case 5:
				return 6406;
			}
		}
		if (class184 == Class184.aClass184_2110) {
			switch (class157.anInt1730 * -524990245) {
			case 4:
				return 36219;
			case 8:
				return 32834;
			case 1:
				return 32859;
			case 7:
				return 33189;
			case 5:
				return 32830;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 32852;
			}
		}
		if (class184 == Class184.aClass184_2106) {
			switch (class157.anInt1730 * -524990245) {
			case 7:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class184 == Class184.aClass184_2107) {
			switch (class157.anInt1730 * -524990245) {
			default:
				throw new IllegalArgumentException();
			case 7:
				return 33191;
			}
		}
		if (class184 == Class184.aClass184_2108) {
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 34842;
			case 8:
				return 34846;
			case 6:
				return 34843;
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34847;
			case 5:
				return 34844;
			}
		}
		if (class184 == Class184.aClass184_2109) {
			switch (class157.anInt1730 * -524990245) {
			case 4:
				return 34841;
			case 5:
				return 34838;
			case 1:
				return 34836;
			case 6:
				return 34837;
			case 8:
				return 34840;
			default:
				throw new IllegalArgumentException();
			}
		}
		throw new IllegalArgumentException();
	}

	void method18048() {
		int i = 0;
		while (!anOpenGL11482.method1674()) {
			if (i++ > 5)
				throw new RuntimeException("");
			Class518.method8635(1000L);
		}
	}
}

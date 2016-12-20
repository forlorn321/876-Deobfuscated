/* Class709 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class709 {
	GraphicsDevice aGraphicsDevice8848;
	DisplayMode aDisplayMode8849;

	void method14381(Frame frame, int i, int i_0_, int i_1_, int i_2_) {
		aDisplayMode8849 = aGraphicsDevice8848.getDisplayMode();
		if (aDisplayMode8849 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method14382(frame, 336792165);
		if (0 == i_2_) {
			int i_3_ = aDisplayMode8849.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
			boolean bool = false;
			for (int i_4_ = 0; i_4_ < displaymodes.length; i_4_++) {
				if (displaymodes[i_4_].getWidth() == i && displaymodes[i_4_].getHeight() == i_0_ && displaymodes[i_4_].getBitDepth() == i_1_) {
					int i_5_ = displaymodes[i_4_].getRefreshRate();
					if (!bool || Math.abs(i_5_ - i_3_) < Math.abs(i_2_ - i_3_)) {
						i_2_ = i_5_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_2_ = i_3_;
		}
		aGraphicsDevice8848.setDisplayMode(new DisplayMode(i, i_0_, i_1_, i_2_));
	}

	void method14382(Frame frame, int i) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_6_ = ((Boolean) field.get(aGraphicsDevice8848)).booleanValue();
			if (bool_6_) {
				field.set(aGraphicsDevice8848, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			aGraphicsDevice8848.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8848, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8848, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			throw object;
		}
	}

	void method14383(Frame frame, int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		aDisplayMode8849 = aGraphicsDevice8848.getDisplayMode();
		if (aDisplayMode8849 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method14382(frame, 1154665701);
		if (0 == i_9_) {
			int i_11_ = aDisplayMode8849.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
			boolean bool = false;
			for (int i_12_ = 0; i_12_ < displaymodes.length; i_12_++) {
				if (displaymodes[i_12_].getWidth() == i && displaymodes[i_12_].getHeight() == i_7_ && displaymodes[i_12_].getBitDepth() == i_8_) {
					int i_13_ = displaymodes[i_12_].getRefreshRate();
					if (!bool || Math.abs(i_13_ - i_11_) < Math.abs(i_9_ - i_11_)) {
						i_9_ = i_13_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_9_ = i_11_;
		}
		aGraphicsDevice8848.setDisplayMode(new DisplayMode(i, i_7_, i_8_, i_9_));
	}

	void method14384(int i) {
		if (aDisplayMode8849 != null) {
			DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_14_ = displaymodes;
			for (int i_15_ = 0; i_15_ < displaymodes_14_.length; i_15_++) {
				DisplayMode displaymode = displaymodes_14_[i_15_];
				if (displaymode.equals(aDisplayMode8849)) {
					aGraphicsDevice8848.setDisplayMode(aDisplayMode8849);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8848, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8849 = null;
		}
		method14382(null, 175730991);
	}

	void method14385(Frame frame) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_16_ = ((Boolean) field.get(aGraphicsDevice8848)).booleanValue();
			if (bool_16_) {
				field.set(aGraphicsDevice8848, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			aGraphicsDevice8848.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8848, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8848, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			throw object;
		}
	}

	int[] method14386() {
		DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 2] = displaymodes[i].getWidth();
			is[1 + (i << 2)] = displaymodes[i].getHeight();
			is[2 + (i << 2)] = displaymodes[i].getBitDepth();
			is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	void method14387(Frame frame) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_17_ = ((Boolean) field.get(aGraphicsDevice8848)).booleanValue();
			if (bool_17_) {
				field.set(aGraphicsDevice8848, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			aGraphicsDevice8848.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8848, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8848, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			throw object;
		}
	}

	int[] method14388() {
		DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 2] = displaymodes[i].getWidth();
			is[1 + (i << 2)] = displaymodes[i].getHeight();
			is[2 + (i << 2)] = displaymodes[i].getBitDepth();
			is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	int[] method14389(int i) {
		DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i_18_ = 0; i_18_ < displaymodes.length; i_18_++) {
			is[i_18_ << 2] = displaymodes[i_18_].getWidth();
			is[1 + (i_18_ << 2)] = displaymodes[i_18_].getHeight();
			is[2 + (i_18_ << 2)] = displaymodes[i_18_].getBitDepth();
			is[(i_18_ << 2) + 3] = displaymodes[i_18_].getRefreshRate();
		}
		return is;
	}

	void method14390(Frame frame, int i, int i_19_, int i_20_, int i_21_) {
		aDisplayMode8849 = aGraphicsDevice8848.getDisplayMode();
		if (aDisplayMode8849 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method14382(frame, 1418800544);
		if (0 == i_21_) {
			int i_22_ = aDisplayMode8849.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
			boolean bool = false;
			for (int i_23_ = 0; i_23_ < displaymodes.length; i_23_++) {
				if (displaymodes[i_23_].getWidth() == i && displaymodes[i_23_].getHeight() == i_19_ && displaymodes[i_23_].getBitDepth() == i_20_) {
					int i_24_ = displaymodes[i_23_].getRefreshRate();
					if (!bool || Math.abs(i_24_ - i_22_) < Math.abs(i_21_ - i_22_)) {
						i_21_ = i_24_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_21_ = i_22_;
		}
		aGraphicsDevice8848.setDisplayMode(new DisplayMode(i, i_19_, i_20_, i_21_));
	}

	void method14391() {
		if (aDisplayMode8849 != null) {
			DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_25_ = displaymodes;
			for (int i = 0; i < displaymodes_25_.length; i++) {
				DisplayMode displaymode = displaymodes_25_[i];
				if (displaymode.equals(aDisplayMode8849)) {
					aGraphicsDevice8848.setDisplayMode(aDisplayMode8849);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8848, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8849 = null;
		}
		method14382(null, 197974012);
	}

	void method14392() {
		if (aDisplayMode8849 != null) {
			DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_26_ = displaymodes;
			for (int i = 0; i < displaymodes_26_.length; i++) {
				DisplayMode displaymode = displaymodes_26_[i];
				if (displaymode.equals(aDisplayMode8849)) {
					aGraphicsDevice8848.setDisplayMode(aDisplayMode8849);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8848, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8849 = null;
		}
		method14382(null, 216387571);
	}

	public Class709() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		aGraphicsDevice8848 = graphicsenvironment.getDefaultScreenDevice();
		if (!aGraphicsDevice8848.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_27_ = graphicsdevices;
			for (int i = 0; i < graphicsdevices_27_.length; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_27_[i];
				if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
					aGraphicsDevice8848 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	int[] method14393() {
		DisplayMode[] displaymodes = aGraphicsDevice8848.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 2] = displaymodes[i].getWidth();
			is[1 + (i << 2)] = displaymodes[i].getHeight();
			is[2 + (i << 2)] = displaymodes[i].getBitDepth();
			is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	static int method14394(int i) {
		return 13;
	}

	static final void method14395(Class665 class665, byte i) {
		int i_28_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_28_, -73368567);
		Class240 class240 = Class183.aClass240Array2100[i_28_ >> 16];
		Class403.method6540(class243, class240, class665, (byte) -44);
	}

	static final void method14396(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class665.anInt8526 -= 307142523;
		int i_29_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		short i_30_ = (short) (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]);
		short i_31_ = (short) (class665.anIntArray8525[2 + 1769813785 * class665.anInt8526]);
		if (i_29_ >= 0 && i_29_ < 5) {
			class243.method4531(i_29_, i_30_, i_31_, 1665831656);
			Class430.method6876(class243, (byte) 54);
			if (-927924265 * class243.anInt2675 == -1 && !class240.aBool2394)
				Class459.method7570(-254728301 * class243.anInt2504, i_29_, -1390068891);
		}
	}

	static final void method14397(Class665 class665, byte i) {
		class665.anInt8526 -= 307142523;
		long l = (long) class665.anIntArray8525[class665.anInt8526 * 1769813785];
		long l_32_ = (long) (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]);
		long l_33_ = (long) (class665.anIntArray8525[2 + 1769813785 * class665.anInt8526]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (l * l_33_ / l_32_);
	}
}

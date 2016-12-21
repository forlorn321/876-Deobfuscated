/* Class691 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class691 {
	DisplayMode aDisplayMode8700;
	GraphicsDevice aGraphicsDevice8701;

	int[] method8188(int i) {
		DisplayMode[] displaymodes = aGraphicsDevice8701.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i_0_ = 0; i_0_ < displaymodes.length; i_0_++) {
			is[i_0_ << 2] = displaymodes[i_0_].getWidth();
			is[(i_0_ << 2) + 1] = displaymodes[i_0_].getHeight();
			is[(i_0_ << 2) + 2] = displaymodes[i_0_].getBitDepth();
			is[3 + (i_0_ << 2)] = displaymodes[i_0_].getRefreshRate();
		}
		return is;
	}

	void method8189() {
		if (null != aDisplayMode8700) {
			DisplayMode[] displaymodes = aGraphicsDevice8701.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_1_ = displaymodes;
			for (int i = 0; i < displaymodes_1_.length; i++) {
				DisplayMode displaymode = displaymodes_1_[i];
				if (displaymode.equals(aDisplayMode8700)) {
					aGraphicsDevice8701.setDisplayMode(aDisplayMode8700);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8701, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8700 = null;
		}
		method8191(null, (byte) 32);
	}

	void method8190(int i) {
		if (null != aDisplayMode8700) {
			DisplayMode[] displaymodes = aGraphicsDevice8701.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_2_ = displaymodes;
			for (int i_3_ = 0; i_3_ < displaymodes_2_.length; i_3_++) {
				DisplayMode displaymode = displaymodes_2_[i_3_];
				if (displaymode.equals(aDisplayMode8700)) {
					aGraphicsDevice8701.setDisplayMode(aDisplayMode8700);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8701, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8700 = null;
		}
		method8191(null, (byte) 32);
	}

	public Class691() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		aGraphicsDevice8701 = graphicsenvironment.getDefaultScreenDevice();
		if (!aGraphicsDevice8701.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_4_ = graphicsdevices;
			for (int i = 0; i < graphicsdevices_4_.length; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_4_[i];
				if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
					aGraphicsDevice8701 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	void method8191(Frame frame, byte i) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_5_ = ((Boolean) field.get(aGraphicsDevice8701)).booleanValue();
			if (bool_5_) {
				field.set(aGraphicsDevice8701, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			aGraphicsDevice8701.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8701, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8701, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			throw object;
		}
	}

	void method8192() {
		if (null != aDisplayMode8700) {
			DisplayMode[] displaymodes = aGraphicsDevice8701.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_6_ = displaymodes;
			for (int i = 0; i < displaymodes_6_.length; i++) {
				DisplayMode displaymode = displaymodes_6_[i];
				if (displaymode.equals(aDisplayMode8700)) {
					aGraphicsDevice8701.setDisplayMode(aDisplayMode8700);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8701, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8700 = null;
		}
		method8191(null, (byte) 32);
	}

	void method8193(Frame frame, int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		aDisplayMode8700 = aGraphicsDevice8701.getDisplayMode();
		if (aDisplayMode8700 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method8191(frame, (byte) 32);
		if (i_9_ == 0) {
			int i_11_ = aDisplayMode8700.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice8701.getDisplayModes();
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
		aGraphicsDevice8701.setDisplayMode(new DisplayMode(i, i_7_, i_8_, i_9_));
	}
}

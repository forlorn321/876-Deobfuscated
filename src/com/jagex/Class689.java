/* Class689 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.image.PixelGrabber;
import java.util.Iterator;

public class Class689 implements Iterator {
	Class527_Sub8 aClass527_Sub8_8688;
	static Class186[] aClass186Array8689;
	Class693 aClass693_8690;
	Class527_Sub8 aClass527_Sub8_8691 = null;
	static int anInt8692;

	public void method13985() {
		if (aClass527_Sub8_8691 == null)
			throw new IllegalStateException();
		aClass527_Sub8_8691.method16057((byte) -110);
		aClass527_Sub8_8691 = null;
	}

	void method13986(int i) {
		aClass527_Sub8_8688 = aClass693_8690.aClass527_Sub8_8734.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = null;
	}

	public Class527_Sub8 method13987(byte i) {
		method13986(-924945272);
		return (Class527_Sub8) next();
	}

	public Class689(Class693 class693) {
		aClass693_8690 = class693;
		aClass527_Sub8_8688 = aClass693_8690.aClass527_Sub8_8734.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = null;
	}

	public boolean hasNext() {
		return aClass527_Sub8_8688 != aClass693_8690.aClass527_Sub8_8734;
	}

	public Object method13988() {
		Class527_Sub8 class527_sub8 = aClass527_Sub8_8688;
		if (class527_sub8 == aClass693_8690.aClass527_Sub8_8734) {
			class527_sub8 = null;
			aClass527_Sub8_8688 = null;
		} else
			aClass527_Sub8_8688 = class527_sub8.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = class527_sub8;
		return class527_sub8;
	}

	public boolean method13989() {
		return aClass527_Sub8_8688 != aClass693_8690.aClass527_Sub8_8734;
	}

	public Object method13990() {
		Class527_Sub8 class527_sub8 = aClass527_Sub8_8688;
		if (class527_sub8 == aClass693_8690.aClass527_Sub8_8734) {
			class527_sub8 = null;
			aClass527_Sub8_8688 = null;
		} else
			aClass527_Sub8_8688 = class527_sub8.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = class527_sub8;
		return class527_sub8;
	}

	void method13991() {
		aClass527_Sub8_8688 = aClass693_8690.aClass527_Sub8_8734.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = null;
	}

	void method13992() {
		aClass527_Sub8_8688 = aClass693_8690.aClass527_Sub8_8734.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = null;
	}

	void method13993() {
		aClass527_Sub8_8688 = aClass693_8690.aClass527_Sub8_8734.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = null;
	}

	void method13994() {
		aClass527_Sub8_8688 = aClass693_8690.aClass527_Sub8_8734.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = null;
	}

	public Class527_Sub8 method13995() {
		method13986(-829468162);
		return (Class527_Sub8) next();
	}

	public void remove() {
		if (aClass527_Sub8_8691 == null)
			throw new IllegalStateException();
		aClass527_Sub8_8691.method16057((byte) -46);
		aClass527_Sub8_8691 = null;
	}

	public Object next() {
		Class527_Sub8 class527_sub8 = aClass527_Sub8_8688;
		if (class527_sub8 == aClass693_8690.aClass527_Sub8_8734) {
			class527_sub8 = null;
			aClass527_Sub8_8688 = null;
		} else
			aClass527_Sub8_8688 = class527_sub8.aClass527_Sub8_10400;
		aClass527_Sub8_8691 = class527_sub8;
		return class527_sub8;
	}

	public static Class294 method13996(int i, int i_0_) {
		Class294[] class294s = Class255.method4706(697238993);
		for (int i_1_ = 0; i_1_ < class294s.length; i_1_++) {
			Class294 class294 = class294s[i_1_];
			if (i == class294.anInt3270 * -1242618333)
				return class294;
		}
		return null;
	}

	static final void method13997(Class665 class665, int i) {
		String string = "";
		if (null != Class644.aClipboard8347) {
			Transferable transferable = Class644.aClipboard8347.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null)
						string = "";
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
	}

	static final void method13998(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub31_10628.method17223(218043907);
	}

	static byte method13999(int i, int i_2_, int i_3_) {
		if (i != -1736797763 * Class596.aClass596_7824.anInt7844)
			return (byte) 0;
		if ((i_2_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	static Class147 method14000(byte[] is, int i) {
		if (null == is)
			throw new RuntimeException("");
		Class147 class147;
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(is);
				java.awt.Container container = Class198.method3745((byte) 31);
				MediaTracker mediatracker = new MediaTracker(container);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i_4_ = image.getWidth(container);
				int i_5_ = image.getHeight(container);
				if (mediatracker.isErrorAny() || i_4_ < 0 || i_5_ < 0)
					throw new RuntimeException("");
				int[] is_6_ = new int[i_4_ * i_5_];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_4_, i_5_, is_6_, 0, i_4_);
				pixelgrabber.grabPixels();
				class147 = Class402.aClass180_4150.method3163(is_6_, 0, i_4_, i_4_, i_5_, 171028919);
				break;
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
		return class147;
	}
}

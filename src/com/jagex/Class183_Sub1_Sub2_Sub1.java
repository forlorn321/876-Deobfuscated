/* Class183_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class183_Sub1_Sub2_Sub1 extends Class183_Sub1_Sub2 {
	Image anImage12095;

	public void method130() {
		/* empty */
	}

	void method10537(short i) {
		super.method10537((short) 3474);
		DataBufferInt databufferint = new DataBufferInt(anIntArray11373, anIntArray11373.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(anInt11370 * -2099688677, anInt11372 * 581659131)), databufferint, null);
		anImage12095 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public int method8650() {
		return method8651(0, 0);
	}

	public int method8655() {
		return method8651(0, 0);
	}

	public void method131() {
		/* empty */
	}

	public void method355() {
		/* empty */
	}

	void method10539() {
		super.method10537((short) -12966);
		DataBufferInt databufferint = new DataBufferInt(anIntArray11373, anIntArray11373.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(anInt11370 * -2099688677, anInt11372 * 581659131)), databufferint, null);
		anImage12095 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public void method129() {
		/* empty */
	}

	public final int method8653(int i, int i_0_) {
		Graphics graphics = aCanvas11369.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12095, i, i_0_, aCanvas11369);
		return 0;
	}

	void method10538() {
		super.method10537((short) 4782);
		DataBufferInt databufferint = new DataBufferInt(anIntArray11373, anIntArray11373.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(anInt11370 * -2099688677, anInt11372 * 581659131)), databufferint, null);
		anImage12095 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	Class183_Sub1_Sub2_Sub1(Class167_Sub1 class167_sub1, Canvas canvas, int i, int i_1_) {
		super(class167_sub1, canvas, i, i_1_);
		new Rectangle();
		method10537((short) 8157);
	}

	public int method8658() {
		return method8651(0, 0);
	}

	public final int method8654(int i, int i_2_) {
		Graphics graphics = aCanvas11369.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12095, i, i_2_, aCanvas11369);
		return 0;
	}

	public final int method8651(int i, int i_3_) {
		Graphics graphics = aCanvas11369.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12095, i, i_3_, aCanvas11369);
		return 0;
	}
}

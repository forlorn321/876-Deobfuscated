/* Class171_Sub1_Sub3_Sub1 - Decompiled by JODE
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

public final class Class171_Sub1_Sub3_Sub1 extends Class171_Sub1_Sub3 {
	Image anImage12059;

	public void method344() {
		/* empty */
	}

	void method17963(byte i) {
		super.method17963((byte) 74);
		DataBufferInt databufferint = new DataBufferInt(anIntArray11382, anIntArray11382.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(anInt11387 * 1751718137, anInt11384 * -1747580435)), databufferint, null);
		anImage12059 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public final int method14727(int i, int i_0_) {
		Graphics graphics = aCanvas11383.getGraphics();
		if (graphics == null)
			return 0;
		graphics.drawImage(anImage12059, i, i_0_, aCanvas11383);
		return 0;
	}

	void method17962() {
		super.method17963((byte) 77);
		DataBufferInt databufferint = new DataBufferInt(anIntArray11382, anIntArray11382.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(anInt11387 * 1751718137, anInt11384 * -1747580435)), databufferint, null);
		anImage12059 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public void method129() {
		/* empty */
	}

	public int method14726() {
		return method14727(0, 0);
	}

	void method17967() {
		super.method17963((byte) 121);
		DataBufferInt databufferint = new DataBufferInt(anIntArray11382, anIntArray11382.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(anInt11387 * 1751718137, anInt11384 * -1747580435)), databufferint, null);
		anImage12059 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	Class171_Sub1_Sub3_Sub1(Class180_Sub1 class180_sub1, Canvas canvas, int i, int i_1_) {
		super(class180_sub1, canvas, i, i_1_);
		new Rectangle();
		method17963((byte) 84);
	}

	public int method14732() {
		return method14727(0, 0);
	}

	public int method14731() {
		return method14727(0, 0);
	}

	public final int method14733(int i, int i_2_) {
		Graphics graphics = aCanvas11383.getGraphics();
		if (graphics == null)
			return 0;
		graphics.drawImage(anImage12059, i, i_2_, aCanvas11383);
		return 0;
	}
}

/* Class314_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class314_Sub1 extends Class314 {
	boolean aBool10011;
	Font aFont10012;
	FontMetrics aFontMetrics10013;
	Color aColor10014;
	Class292 this$0;

	Class314_Sub1(Class292 class292, boolean bool, String string, int i, int i_0_, int i_1_, int i_2_) {
		super(class292, i_1_, i_2_);
		this$0 = class292;
		aBool10011 = bool;
		aFont10012 = new Font(string, 0, i);
		aFontMetrics10013 = Class451.aCanvas4939.getFontMetrics(aFont10012);
		aColor10014 = new Color(i_0_);
	}

	void method5664(Graphics graphics) {
		String string;
		if (aBool10011)
			string = this$0.aString3254;
		else
			string = new StringBuilder().append(this$0.aString3256).append(" ").append(this$0.aString3254).toString();
		graphics.setFont(aFont10012);
		graphics.setColor(aColor10014);
		graphics.drawString(string, (this$0.method5258(aFontMetrics10013.stringWidth(string), 257578414) + 899934251 * anInt3506), (this$0.method5259(0, 494903388) + -755285989 * anInt3505));
	}

	void method5663(Graphics graphics) {
		String string;
		if (aBool10011)
			string = this$0.aString3254;
		else
			string = new StringBuilder().append(this$0.aString3256).append(" ").append(this$0.aString3254).toString();
		graphics.setFont(aFont10012);
		graphics.setColor(aColor10014);
		graphics.drawString(string, (this$0.method5258(aFontMetrics10013.stringWidth(string), -62691434) + 899934251 * anInt3506), (this$0.method5259(0, 1099698813) + -755285989 * anInt3505));
	}

	void method5659(Graphics graphics) {
		String string;
		if (aBool10011)
			string = this$0.aString3254;
		else
			string = new StringBuilder().append(this$0.aString3256).append(" ").append(this$0.aString3254).toString();
		graphics.setFont(aFont10012);
		graphics.setColor(aColor10014);
		graphics.drawString(string, (this$0.method5258(aFontMetrics10013.stringWidth(string), 1961214198) + 899934251 * anInt3506), (this$0.method5259(0, 1895496099) + -755285989 * anInt3505));
	}

	void method5662(Graphics graphics) {
		String string;
		if (aBool10011)
			string = this$0.aString3254;
		else
			string = new StringBuilder().append(this$0.aString3256).append(" ").append(this$0.aString3254).toString();
		graphics.setFont(aFont10012);
		graphics.setColor(aColor10014);
		graphics.drawString(string, (this$0.method5258(aFontMetrics10013.stringWidth(string), 85730308) + 899934251 * anInt3506), (this$0.method5259(0, 729982053) + -755285989 * anInt3505));
	}

	void method5661(Graphics graphics) {
		String string;
		if (aBool10011)
			string = this$0.aString3254;
		else
			string = new StringBuilder().append(this$0.aString3256).append(" ").append(this$0.aString3254).toString();
		graphics.setFont(aFont10012);
		graphics.setColor(aColor10014);
		graphics.drawString(string, (this$0.method5258(aFontMetrics10013.stringWidth(string), 2062636797) + 899934251 * anInt3506), (this$0.method5259(0, 1038547151) + -755285989 * anInt3505));
	}

	void method5665(Graphics graphics) {
		String string;
		if (aBool10011)
			string = this$0.aString3254;
		else
			string = new StringBuilder().append(this$0.aString3256).append(" ").append(this$0.aString3254).toString();
		graphics.setFont(aFont10012);
		graphics.setColor(aColor10014);
		graphics.drawString(string, (this$0.method5258(aFontMetrics10013.stringWidth(string), 1417579835) + 899934251 * anInt3506), (this$0.method5259(0, 911210233) + -755285989 * anInt3505));
	}

	void method5660(Graphics graphics, int i) {
		String string;
		if (aBool10011)
			string = this$0.aString3254;
		else
			string = new StringBuilder().append(this$0.aString3256).append(" ").append(this$0.aString3254).toString();
		graphics.setFont(aFont10012);
		graphics.setColor(aColor10014);
		graphics.drawString(string, (this$0.method5258(aFontMetrics10013.stringWidth(string), 409660783) + 899934251 * anInt3506), (this$0.method5259(0, 1154546005) + -755285989 * anInt3505));
	}

	static final void method15662(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class243.anInt2583 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * 1925284695;
		Class430.method6876(class243, (byte) 125);
	}

	public static int method15663(int i, boolean bool, int i_3_) {
		if (bool)
			return 0;
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 96);
		if (class527_sub1 == null)
			return ((((Class527_Sub8_Sub1) Class527_Sub26.aClass24_Sub20_10523.method81(i, 115874611)).anInt11335) * 429500197);
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < class527_sub1.anIntArray10332.length; i_5_++) {
			if (class527_sub1.anIntArray10332[i_5_] == -1)
				i_4_++;
		}
		i_4_ += ((((Class527_Sub8_Sub1) Class527_Sub26.aClass24_Sub20_10523.method81(i, 995338599)).anInt11335) * 429500197 - class527_sub1.anIntArray10332.length);
		return i_4_;
	}
}

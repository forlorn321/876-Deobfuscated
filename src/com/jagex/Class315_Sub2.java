/* Class315_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class315_Sub2 extends Class315 {
	Font aFont10101;
	Color aColor10102;
	FontMetrics aFontMetrics10103;
	boolean aBool10104;
	Class306 this$0;

	void method4205(Graphics graphics) {
		String string;
		if (aBool10104)
			string = this$0.aString3451;
		else
			string = new StringBuilder().append(this$0.aString3450).append(" ").append(this$0.aString3451).toString();
		graphics.setFont(aFont10101);
		graphics.setColor(aColor10102);
		graphics.drawString(string, (this$0.method4109(aFontMetrics10103.stringWidth(string), 1874708401) + anInt3506 * 28572035), (this$0.method4118(0, (byte) -96) + anInt3505 * 1161853173));
	}

	void method4206(Graphics graphics, int i) {
		String string;
		if (aBool10104)
			string = this$0.aString3451;
		else
			string = new StringBuilder().append(this$0.aString3450).append(" ").append(this$0.aString3451).toString();
		graphics.setFont(aFont10101);
		graphics.setColor(aColor10102);
		graphics.drawString(string, (this$0.method4109(aFontMetrics10103.stringWidth(string), 825246519) + anInt3506 * 28572035), (this$0.method4118(0, (byte) 87) + anInt3505 * 1161853173));
	}

	Class315_Sub2(Class306 class306, boolean bool, String string, int i, int i_0_, int i_1_, int i_2_) {
		super(class306, i_1_, i_2_);
		this$0 = class306;
		aBool10104 = bool;
		aFont10101 = new Font(string, 0, i);
		aFontMetrics10103 = Class399.aCanvas4127.getFontMetrics(aFont10101);
		aColor10102 = new Color(i_0_);
	}

	void method4208(Graphics graphics) {
		String string;
		if (aBool10104)
			string = this$0.aString3451;
		else
			string = new StringBuilder().append(this$0.aString3450).append(" ").append(this$0.aString3451).toString();
		graphics.setFont(aFont10101);
		graphics.setColor(aColor10102);
		graphics.drawString(string, (this$0.method4109(aFontMetrics10103.stringWidth(string), 629762678) + anInt3506 * 28572035), (this$0.method4118(0, (byte) -72) + anInt3505 * 1161853173));
	}

	void method4209(Graphics graphics) {
		String string;
		if (aBool10104)
			string = this$0.aString3451;
		else
			string = new StringBuilder().append(this$0.aString3450).append(" ").append(this$0.aString3451).toString();
		graphics.setFont(aFont10101);
		graphics.setColor(aColor10102);
		graphics.drawString(string, (this$0.method4109(aFontMetrics10103.stringWidth(string), 368702823) + anInt3506 * 28572035), (this$0.method4118(0, (byte) -37) + anInt3505 * 1161853173));
	}

	void method4207(Graphics graphics) {
		String string;
		if (aBool10104)
			string = this$0.aString3451;
		else
			string = new StringBuilder().append(this$0.aString3450).append(" ").append(this$0.aString3451).toString();
		graphics.setFont(aFont10101);
		graphics.setColor(aColor10102);
		graphics.drawString(string, (this$0.method4109(aFontMetrics10103.stringWidth(string), 1784357307) + anInt3506 * 28572035), (this$0.method4118(0, (byte) 58) + anInt3505 * 1161853173));
	}

	static void method9202(byte i) {
		Class103.aClass199_1231.method2884((byte) -47);
	}

	static final void method9203(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class320.method4243(class251, class234, class668, 2072366986);
	}

	public static void method9204(String string, String string_3_, String string_4_, boolean bool, int i) {
		if (string.length() <= 320 && Class224.method3210(-454215079)) {
			Class243.method3405(-204884336);
			Class61.aString679 = string;
			Class61.aString696 = string_3_;
			Class61.aString681 = string_4_;
			Class61.aBool682 = bool;
			Class673.method8026(3, -1798113843);
		}
	}

	static final void method9205(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}

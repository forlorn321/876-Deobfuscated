/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class UpdateKey {
	public static UpdateKey aClass59_612;
	public static UpdateKey aClass59_613;
	public static UpdateKey aClass59_614;
	Class50 aClass50_615;
	public static UpdateKey aClass59_616;
	public static UpdateKey aClass59_617;
	public static UpdateKey aClass59_618;
	public static UpdateKey aClass59_619;
	public static UpdateKey aClass59_620 = new UpdateKey(Class50.aClass50_582);
	public static UpdateKey aClass59_621;
	public static UpdateKey aClass59_622;
	public static UpdateKey aClass59_623;
	public static UpdateKey aClass59_624;
	public static UpdateKey aClass59_625;
	public static UpdateKey aClass59_626;
	public static UpdateKey aClass59_627;
	public static UpdateKey aClass59_628;
	public static UpdateKey aClass59_629;
	public static UpdateKey aClass59_630;
	public static UpdateKey aClass59_631;
	public static UpdateKey aClass59_632;
	public static UpdateKey aClass59_633;
	public static UpdateKey aClass59_634;
	public static UpdateKey aClass59_635;
	public static UpdateKey aClass59_636;
	public static UpdateKey aClass59_637;
	public static UpdateKey aClass59_638;
	int anInt639;
	Interface5 anInterface5_640;

	public int method975(byte i) {
		return 1964392591 * anInt639;
	}

	UpdateKey(Class50 class50) {
		aClass50_615 = class50;
		anInt639 = 1304616559;
	}

	public Interface5 method976(int i) {
		return anInterface5_640;
	}

	public void setValue(int i) {
		anInt639 = 1304616559 * i;
	}

	public void method978(int i) {
		anInt639 = 1304616559 * i;
	}

	public int method979() {
		return 1964392591 * anInt639;
	}

	static {
		aClass59_613 = new UpdateKey(Class50.aClass50_584);
		aClass59_614 = new UpdateKey(Class50.aClass50_584);
		aClass59_612 = new UpdateKey(Class50.aClass50_584);
		aClass59_616 = new UpdateKey(Class50.aClass50_584);
		aClass59_617 = new UpdateKey(Class50.aClass50_584);
		aClass59_618 = new UpdateKey(Class50.aClass50_582);
		aClass59_619 = new UpdateKey(Class50.aClass50_582);
		aClass59_632 = new UpdateKey(Class50.aClass50_582);
		aClass59_638 = new UpdateKey(Class50.aClass50_582);
		aClass59_621 = new UpdateKey(Class50.aClass50_582);
		aClass59_623 = new UpdateKey(Class50.aClass50_582);
		aClass59_624 = new UpdateKey(Class50.aClass50_582);
		aClass59_622 = new UpdateKey(Class50.aClass50_582);
		aClass59_626 = new UpdateKey(Class50.aClass50_582);
		aClass59_625 = new UpdateKey(Class50.aClass50_582);
		aClass59_627 = new UpdateKey(Class50.aClass50_582);
		aClass59_629 = new UpdateKey(Class50.aClass50_582);
		aClass59_630 = new UpdateKey(Class50.aClass50_582);
		aClass59_631 = new UpdateKey(Class50.aClass50_582);
		aClass59_628 = new UpdateKey(Class50.aClass50_582);
		aClass59_633 = new UpdateKey(Class50.aClass50_581);
		aClass59_634 = new UpdateKey(Class50.aClass50_582);
		aClass59_635 = new UpdateKey(Class50.aClass50_582);
		aClass59_636 = new UpdateKey(Class50.aClass50_582);
		aClass59_637 = new UpdateKey(Class50.aClass50_583);
	}

	public int method980() {
		return 1964392591 * anInt639;
	}

	static final void method981(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class184_Sub1.method8643(i_1_, i_2_, true, false, (byte) 87);
	}

	public int method982() {
		return 1964392591 * anInt639;
	}

	public static UpdateKey[] getReferenceList() {
		return (new UpdateKey[] { aClass59_620, aClass59_613, aClass59_614, aClass59_612, aClass59_616, aClass59_617, aClass59_618, aClass59_619, aClass59_632, aClass59_638, aClass59_621, aClass59_623, aClass59_624, aClass59_622, aClass59_626, aClass59_625, aClass59_627, aClass59_629, aClass59_630, aClass59_631, aClass59_628, aClass59_633, aClass59_634, aClass59_635, aClass59_636, aClass59_637 });
	}

	public static int method984(int i, int i_3_, int i_4_, int i_5_) {
		int i_6_ = 255 - i_4_;
		i_3_ = (i_4_ * (i_3_ & 0xff00ff) & ~0xff00ff | (i_3_ & 0xff00) * i_4_ & 0xff0000) >>> 8;
		return i_3_ + (((i & 0xff00ff) * i_6_ & ~0xff00ff | (i & 0xff00) * i_6_ & 0xff0000) >>> 8);
	}

	public void method985(Interface5 interface5, byte i) {
		if (interface5.method50((byte) 0) != aClass50_615)
			throw new IllegalArgumentException();
		anInterface5_640 = interface5;
	}

	public static long method986(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		Class81.aCalendar860.clear();
		Class81.aCalendar860.set(i_11_, i_10_, i_9_, i_8_, i_7_, i);
		return Class81.aCalendar860.getTime().getTime();
	}

	public static void method987(boolean bool, byte i) {
		/* empty */
	}

	static final void method988(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_13_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_14_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		boolean bool = (class668.anIntArray8541[1867269829 * class668.anInt8542 + 2] == 1);
		PlayerStat class618 = Class63.aClass226_717.method3227(i_13_, -781094290).method3125(i_14_, -1848040133);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (bool ? class618.getBaseLevel() : class618.getExperience());
	}
}

/* Class649_Sub1_Sub5_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub5_Sub4 extends Class649_Sub1_Sub5 {
	int anInt12107;
	int anInt12108 = 0;
	Class627 aClass627_12109;
	Class688 aClass688_12110;
	boolean aBool12111;
	int anInt12112;
	int anInt12113 = 0;

	boolean method9969(Class167 class167, int i, int i_0_) {
		return false;
	}

	boolean method9974(int i) {
		return false;
	}

	public void method11026(int i) {
		if (aClass627_12109 != null)
			aClass627_12109.method7469();
	}

	boolean method9942(int i) {
		return aBool12111;
	}

	public int method11027(int i) {
		return -857366931 * anInt12107;
	}

	public Class559 method9946(Class167 class167, int i) {
		return null;
	}

	public final void method11028(int i, byte i_1_) {
		if (null != aClass688_12110 && !aClass688_12110.method8135(1731511361))
			aClass688_12110.method8138(i, 1729617001);
	}

	boolean method9956() {
		return aBool12111;
	}

	public int method9960(int i) {
		return 1646167845 * anInt12113;
	}

	Class177 method11029(Class167 class167, int i, int i_2_, int i_3_) {
		Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70(i_2_, (byte) -67));
		Class160 class160 = aClass553_10838.aClass160Array7459[aByte10839];
		Class160 class160_4_ = (aByte10840 < 3 ? aClass553_10838.aClass160Array7459[1 + aByte10840] : null);
		Class436 class436 = method7837().aClass436_4823;
		return ((aClass688_12110 != null && !aClass688_12110.method8135(-1207711990)) ? class677.method8047(class167, i, -866007040 * anInt12108, class160, class160_4_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, aClass688_12110, (byte) 2, -747083676) : class677.method8047(class167, i, -866007040 * anInt12108, class160, class160_4_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, null, (byte) 2, 458431025));
	}

	void method9945(Class167 class167, int i) {
		Class177 class177 = method11029(class167, 0, 495660189 * anInt12112, 1649475209);
		if (class177 != null)
			method11030(class167, class177, method7851(), 639315588);
	}

	void method11030(Class167 class167, Class177 class177, Class433 class433, int i) {
		class177.method2513(class433);
		Class172[] class172s = class177.method2514();
		Class156[] class156s = class177.method2515();
		if ((aClass627_12109 == null || aClass627_12109.aBool8168) && (class172s != null || null != class156s))
			aClass627_12109 = Class627.method7484(client.anInt11014, true);
		if (null != aClass627_12109) {
			aClass627_12109.method7474(class167, (long) client.anInt11014, class172s, class156s, false);
			aClass627_12109.method7473(aByte10839, aShort11867, aShort11864, aShort11865, aShort11870);
		}
	}

	final boolean method9938() {
		return false;
	}

	public Class559 method9963(Class167 class167) {
		return null;
	}

	final boolean method9973() {
		return false;
	}

	public final boolean method11031() {
		return (null != aClass688_12110 && !aClass688_12110.method8128(-144709969));
	}

	boolean method9987() {
		return false;
	}

	public int method9958() {
		return 1646167845 * anInt12113;
	}

	public int method9941() {
		return 1646167845 * anInt12113;
	}

	Class563 method9966(Class167 class167) {
		Class177 class177 = method11029(class167, 0x800 | (0 != anInt12108 * 641305657 ? 5 : 0), anInt12112 * 495660189, -1259946999);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		method11030(class167, class177, class433, -1402559264);
		Class563 class563 = Class225.method3212(false, -1650422832);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12109) {
			Class166 class166 = aClass627_12109.method7476();
			class167.method2351(class166);
		}
		aBool12111 = class177.method2511();
		anInt12113 = class177.method2562() * -984990547;
		class177.method2579();
		return class563;
	}

	public int method9984() {
		return 1646167845 * anInt12113;
	}

	public Class559 method9955(Class167 class167) {
		return null;
	}

	public final boolean method11032(int i) {
		return (aClass688_12110 == null || aClass688_12110.method8135(-445606629));
	}

	public Class559 method9962(Class167 class167) {
		return null;
	}

	public Class649_Sub1_Sub5_Sub4(Class553 class553, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_) {
		super(class553, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, false, (byte) 0);
		aBool12111 = true;
		anInt12107 = 0;
		anInt12112 = i * -1710442059;
		anInt12108 = 1664000521 * i_15_;
		anInt12107 = 1017060197 * i_16_;
		Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70(anInt12112 * 495660189, (byte) -32));
		int i_17_ = -1078340929 * class677.anInt8607;
		if (i_17_ != -1) {
			aClass688_12110 = new Class688_Sub2(this, false);
			int i_18_ = class677.aBool8604 ? 0 : 2;
			if (bool)
				i_18_ = 1;
			aClass688_12110.method8126(i_17_, i_5_, i_18_, false, 166540622);
		}
		method9968(1, -665612676);
	}

	public final boolean method11033() {
		return (aClass688_12110 == null || aClass688_12110.method8135(-839584136));
	}

	Class563 method9965(Class167 class167) {
		Class177 class177 = method11029(class167, 0x800 | (0 != anInt12108 * 641305657 ? 5 : 0), anInt12112 * 495660189, -1931906782);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		method11030(class167, class177, class433, -2119707744);
		Class563 class563 = Class225.method3212(false, -1311562487);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12109) {
			Class166 class166 = aClass627_12109.method7476();
			class167.method2351(class166);
		}
		aBool12111 = class177.method2511();
		anInt12113 = class177.method2562() * -984990547;
		class177.method2579();
		return class563;
	}

	final boolean method9940(int i) {
		return false;
	}

	void method9967(Class167 class167) {
		Class177 class177 = method11029(class167, 0, 495660189 * anInt12112, -372392303);
		if (class177 != null)
			method11030(class167, class177, method7851(), 696291395);
	}

	void method9975(Class167 class167) {
		Class177 class177 = method11029(class167, 0, 495660189 * anInt12112, -903025287);
		if (class177 != null)
			method11030(class167, class177, method7851(), -2117540928);
	}

	public Class559 method9961(Class167 class167) {
		return null;
	}

	boolean method9957(Class167 class167, int i, int i_19_) {
		return false;
	}

	boolean method9971(Class167 class167, int i, int i_20_) {
		return false;
	}

	public int method11034() {
		return -857366931 * anInt12107;
	}

	final boolean method9972() {
		return false;
	}

	Class563 method9985(Class167 class167) {
		Class177 class177 = method11029(class167, 0x800 | (0 != anInt12108 * 641305657 ? 5 : 0), anInt12112 * 495660189, 1801391102);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		method11030(class167, class177, class433, -849236016);
		Class563 class563 = Class225.method3212(false, 880856810);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12109) {
			Class166 class166 = aClass627_12109.method7476();
			class167.method2351(class166);
		}
		aBool12111 = class177.method2511();
		anInt12113 = class177.method2562() * -984990547;
		class177.method2579();
		return class563;
	}

	final void method9947(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_21_, int i_22_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method9978(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_23_, int i_24_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method9976() {
		throw new IllegalStateException();
	}

	Class563 method9944(Class167 class167, byte i) {
		Class177 class177 = method11029(class167, 0x800 | (0 != anInt12108 * 641305657 ? 5 : 0), anInt12112 * 495660189, -1102345087);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		method11030(class167, class177, class433, -1879749666);
		Class563 class563 = Class225.method3212(false, 822915026);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12109) {
			Class166 class166 = aClass627_12109.method7476();
			class167.method2351(class166);
		}
		aBool12111 = class177.method2511();
		anInt12113 = class177.method2562() * -984990547;
		class177.method2579();
		return class563;
	}

	public int method11035() {
		return -857366931 * anInt12107;
	}

	public final void method11036(int i) {
		if (null != aClass688_12110 && !aClass688_12110.method8135(1994165111))
			aClass688_12110.method8138(i, 1875677694);
	}

	public final void method11037(int i) {
		if (null != aClass688_12110 && !aClass688_12110.method8135(156831434))
			aClass688_12110.method8138(i, 1671378609);
	}

	public final void method11038(int i) {
		if (null != aClass688_12110 && !aClass688_12110.method8135(206544644))
			aClass688_12110.method8138(i, 1887720171);
	}

	final void method9986(int i) {
		throw new IllegalStateException();
	}

	public final boolean method11039(int i) {
		return (null != aClass688_12110 && !aClass688_12110.method8128(-144709969));
	}

	public void method11040() {
		if (aClass627_12109 != null)
			aClass627_12109.method7469();
	}

	final void method9943(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_25_, int i_26_, boolean bool, int i_27_) {
		throw new IllegalStateException();
	}

	boolean method9939(Class167 class167, int i, int i_28_, byte i_29_) {
		return false;
	}
}

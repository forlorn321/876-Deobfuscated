/* Class98_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class98_Sub1_Sub1 extends Class98_Sub1 implements Interface12 {
	static int anInt11323;
	Class199 aClass199_11324 = new Class199(64);
	Class461 aClass461_11325;
	public static Class461 aClass461_11326;

	public int method73() {
		return super.method71(1702716710);
	}

	public void method10461() {
		synchronized (aClass199_11324) {
			aClass199_11324.method2884((byte) -88);
		}
	}

	Class153_Sub1 method10462(int i, byte i_0_) {
		byte[] is = aClass461_11325.method5556((aClass458_8868.method5498(776323541).id) * 1716263195, i, (byte) 1);
		Class153_Sub1 class153_sub1 = new Class153_Sub1(aClass458_8868, i);
		if (null != is)
			class153_sub1.method74(new RSByteBuffer(is), -346288842);
		return class153_sub1;
	}

	public void method10463(int i) {
		synchronized (aClass199_11324) {
			aClass199_11324.method2884((byte) -69);
		}
	}

	public void method10464() {
		synchronized (aClass199_11324) {
			aClass199_11324.method2892(-1578096215);
		}
	}

	public void method10465(int i) {
		synchronized (aClass199_11324) {
			aClass199_11324.method2892(-2107284183);
		}
	}

	public Iterator iterator() {
		return new Class242(this);
	}

	public int method71(int i) {
		return super.method71(2130342145);
	}

	public DefinitionI method72(int i) {
		Class153_Sub1 class153_sub1;
		synchronized (aClass199_11324) {
			class153_sub1 = (Class153_Sub1) aClass199_11324.method2886((long) i);
			if (null == class153_sub1) {
				class153_sub1 = method10462(i, (byte) 14);
				aClass199_11324.method2881(class153_sub1, (long) i);
			}
		}
		return class153_sub1;
	}

	public int method12() {
		return super.method71(1791951026);
	}

	public Iterator method10466() {
		return new Class242(this);
	}

	public void method10467(int i, byte i_1_) {
		synchronized (aClass199_11324) {
			aClass199_11324.method2883(i, -1170289537);
		}
	}

	public Iterator method10468() {
		return new Class242(this);
	}

	public void method10469() {
		synchronized (aClass199_11324) {
			aClass199_11324.method2884((byte) -33);
		}
	}

	public Iterator method10470() {
		return new Class242(this);
	}

	public void method10471() {
		synchronized (aClass199_11324) {
			aClass199_11324.method2884((byte) -121);
		}
	}

	public void method10472(int i) {
		synchronized (aClass199_11324) {
			aClass199_11324.method2883(i, -1713674443);
		}
	}

	public void method10473(int i) {
		synchronized (aClass199_11324) {
			aClass199_11324.method2883(i, -1606585411);
		}
	}

	public Class98_Sub1_Sub1(GameMode class670, Class458 class458, Class664 class664, Class461 class461) {
		super(class670, class458, class664, (null != class461 ? class461.method5566((class458.method5498(1821017415).id * 1716263195), 1053953900) : 0));
		aClass461_11325 = class461;
	}

	public DefinitionI method70(int i, byte i_2_) {
		Class153_Sub1 class153_sub1;
		synchronized (aClass199_11324) {
			class153_sub1 = (Class153_Sub1) aClass199_11324.method2886((long) i);
			if (null == class153_sub1) {
				class153_sub1 = method10462(i, (byte) 14);
				aClass199_11324.method2881(class153_sub1, (long) i);
			}
		}
		return class153_sub1;
	}

	static final void method10474(Class668 class668, byte i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.soundVolumeSetting), (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 1);
		Class27.method763(2123244716);
		client.aBool11015 = false;
	}

	static final void method10475(Class668 class668, int i) {
		NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class668.aClass649_Sub1_Sub5_Sub1_8554);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class649_sub1_sub5_sub1_sub1.anInt12160 * 400189673;
	}

	static void method10476(int i, String string) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(3, (long) i);
		class536_sub18_sub5.method10659(1686354484);
		class536_sub18_sub5.aString11649 = string;
	}
}

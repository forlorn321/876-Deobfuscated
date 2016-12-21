/* Class587 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class587 implements Interface13 {
	public int anInt7711;
	Class584 aClass584_7712;
	public static final int anInt7713 = -1;
	public int anInt7714;
	public int anInt7715;
	static final int anInt7716 = 16777215;
	static final int anInt7717 = 70;
	public boolean aBool7718 = false;
	public int anInt7719 = -224880251;
	public static final int anInt7720 = 0;
	Interface12 anInterface12_7721;
	int anInt7722;
	int anInt7723;
	int anInt7724;
	int anInt7725;
	int anInt7726;
	public int anInt7727;
	int anInt7728;
	String aString7729;
	public int anInt7730;
	public int anInt7731;
	public int anInt7732;
	public int anInt7733;
	public int[] anIntArray7734;
	public int anInt7735;
	int anInt7736;
	int anInt7737;
	public static final int anInt7738 = 1;
	public static int anInt7739;

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte(2067277761);
			if (0 == i_0_)
				break;
			method7066(class536_sub33, i_0_, (byte) -31);
		}
	}

	void method7066(RSByteBuffer class536_sub33, int i, byte i_1_) {
		if (i == 1)
			anInt7719 = class536_sub33.method9720((byte) 1) * 224880251;
		else if (i == 2) {
			anInt7711 = class536_sub33.method9742(1629502606) * 1123951115;
			aBool7718 = true;
		} else if (i == 3)
			anInt7722 = class536_sub33.method9720((byte) 1) * 1834581293;
		else if (i == 4)
			anInt7724 = class536_sub33.method9720((byte) 1) * -827412131;
		else if (5 == i)
			anInt7723 = class536_sub33.method9720((byte) 1) * -978085053;
		else if (6 == i)
			anInt7725 = class536_sub33.method9720((byte) 1) * 299529583;
		else if (7 == i)
			anInt7731 = class536_sub33.readShort((byte) -125) * 104053305;
		else if (i == 8)
			aString7729 = class536_sub33.method9714((byte) 12);
		else if (9 == i)
			anInt7715 = class536_sub33.readUnsignedShort((short) 3531) * -649903291;
		else if (i == 10)
			anInt7727 = class536_sub33.readShort((byte) -70) * -841503441;
		else if (i == 11)
			anInt7735 = 0;
		else if (12 == i)
			anInt7730 = class536_sub33.readUnsignedByte(-307995047) * -217317801;
		else if (i == 13)
			anInt7733 = class536_sub33.readShort((byte) -54) * -1019225517;
		else if (i == 14)
			anInt7735 = class536_sub33.readUnsignedShort((short) -8730) * 163526433;
		else if (i == 16) {
			anInt7732 = class536_sub33.readShort((byte) -64) * 1542216787;
			anInt7714 = class536_sub33.readShort((byte) -45) * 995308857;
		} else if (i == 17 || i == 18) {
			anInt7728 = class536_sub33.readUnsignedShort((short) -31898) * -816379749;
			if (65535 == 1085119891 * anInt7728)
				anInt7728 = 816379749;
			anInt7736 = class536_sub33.readUnsignedShort((short) 3891) * -1920174597;
			if (65535 == 437800243 * anInt7736)
				anInt7736 = 1920174597;
			int i_2_ = -1;
			if (i == 18) {
				i_2_ = class536_sub33.readUnsignedShort((short) -23799);
				if (i_2_ == 65535)
					i_2_ = -1;
			}
			int i_3_ = class536_sub33.readUnsignedByte(302269136);
			anIntArray7734 = new int[i_3_ + 2];
			for (int i_4_ = 0; i_4_ <= i_3_; i_4_++) {
				anIntArray7734[i_4_] = class536_sub33.readUnsignedShort((short) 15014);
				if (65535 == anIntArray7734[i_4_])
					anIntArray7734[i_4_] = -1;
			}
			anIntArray7734[1 + i_3_] = i_2_;
		} else if (i == 19)
			anInt7737 = class536_sub33.readUnsignedShort((short) -10586) * 478092401;
		else if (20 == i)
			anInt7726 = class536_sub33.readUnsignedShort((short) 5671) * -1024398757;
	}

	public final Class587 method7067(Interface20 interface20, Interface18 interface18, int i) {
		int i_5_ = -1;
		if (anIntArray7734 == null)
			return this;
		if (interface20 == null || null == interface18)
			return null;
		if (-1 != 1085119891 * anInt7728) {
			Class324 class324 = interface20.method123(anInt7728 * 1085119891, -1018286558);
			if (class324 != null)
				i_5_ = interface18.method96(class324, 1171548423);
		} else if (anInt7736 * 437800243 != -1) {
			Class153 class153 = interface20.method124(Class458.aClass458_5176, 437800243 * anInt7736, 323730415);
			if (class153 != null)
				i_5_ = interface18.method99(class153, 2075788655);
		}
		if (i_5_ < 0 || i_5_ >= anIntArray7734.length - 1) {
			int i_6_ = anIntArray7734[anIntArray7734.length - 1];
			if (-1 != i_6_)
				return (Class587) anInterface12_7721.method70(i_6_, (byte) 11);
			return null;
		}
		if (-1 == anIntArray7734[i_5_])
			return null;
		return ((Class587) anInterface12_7721.method70(anIntArray7734[i_5_], (byte) -49));
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(1927076451);
			if (0 == i)
				break;
			method7066(class536_sub33, i, (byte) -55);
		}
	}

	void method7068(Class167 class167, int i) {
		Class461 class461 = aClass584_7712.aClass461_7705;
		if (1810029221 * anInt7722 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (anInt7722 * 1810029221)) == null) && class461.method5580(1810029221 * anInt7722, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7722 * 1810029221);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (anInt7722 * 1810029221));
		}
		if (anInt7723 * 272124267 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (272124267 * anInt7723)) == null) && class461.method5580(272124267 * anInt7723, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7723 * 272124267);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (272124267 * anInt7723));
		}
		if (-769447179 * anInt7724 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (anInt7724 * -769447179)) == null) && class461.method5580(anInt7724 * -769447179, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7724 * -769447179);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (anInt7724 * -769447179));
		}
		if (-203388529 * anInt7725 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (-203388529 * anInt7725)) == null) && class461.method5580(anInt7725 * -203388529, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7725 * -203388529);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (anInt7725 * -203388529));
		}
	}

	public String method7069(int i, byte i_7_) {
		String string = aString7729;
		i = anInt7737 * -527358831 * i / (685651411 * anInt7726);
		for (;;) {
			int i_8_ = string.indexOf("%1");
			if (i_8_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_8_)).append(Class707.method8298(i, false, (byte) -10)).append(string.substring(2 + i_8_)).toString();
		}
		return string;
	}

	public Class143 method7070(Class167 class167, byte i) {
		if (anInt7722 * 1810029221 < 0)
			return null;
		Class143 class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7722 * 1810029221));
		if (null == class143) {
			method7068(class167, 851234370);
			class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (1810029221 * anInt7722));
		}
		return class143;
	}

	void method7071(Class167 class167) {
		Class461 class461 = aClass584_7712.aClass461_7705;
		if (1810029221 * anInt7722 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (anInt7722 * 1810029221)) == null) && class461.method5580(1810029221 * anInt7722, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7722 * 1810029221);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (anInt7722 * 1810029221));
		}
		if (anInt7723 * 272124267 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (272124267 * anInt7723)) == null) && class461.method5580(272124267 * anInt7723, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7723 * 272124267);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (272124267 * anInt7723));
		}
		if (-769447179 * anInt7724 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (anInt7724 * -769447179)) == null) && class461.method5580(anInt7724 * -769447179, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7724 * -769447179);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (anInt7724 * -769447179));
		}
		if (-203388529 * anInt7725 >= 0 && (aClass584_7712.aClass199_7706.method2886((long) (-203388529 * anInt7725)) == null) && class461.method5580(anInt7725 * -203388529, -964514165)) {
			Class179 class179 = Class181.method2717(class461, anInt7725 * -203388529);
			aClass584_7712.aClass199_7706.method2881(class167.method2082(class179, true), (long) (anInt7725 * -203388529));
		}
	}

	public void method75(byte i) {
		/* empty */
	}

	Class587(int i, Class584 class584, Interface12 interface12) {
		anInt7711 = -939401739;
		anInt7715 = 1751409886;
		anInt7722 = -1834581293;
		anInt7723 = 978085053;
		anInt7724 = 827412131;
		anInt7725 = -299529583;
		anInt7731 = 0;
		anInt7727 = 0;
		anInt7735 = -163526433;
		aString7729 = "";
		anInt7730 = 217317801;
		anInt7733 = 0;
		anInt7732 = 0;
		anInt7714 = 0;
		anInt7728 = 816379749;
		anInt7736 = 1920174597;
		anInt7737 = 478092401;
		anInt7726 = -1024398757;
		aClass584_7712 = class584;
		anInterface12_7721 = interface12;
	}

	public void method77() {
		/* empty */
	}

	void method7072(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt7719 = class536_sub33.method9720((byte) 1) * 224880251;
		else if (i == 2) {
			anInt7711 = class536_sub33.method9742(1809588909) * 1123951115;
			aBool7718 = true;
		} else if (i == 3)
			anInt7722 = class536_sub33.method9720((byte) 1) * 1834581293;
		else if (i == 4)
			anInt7724 = class536_sub33.method9720((byte) 1) * -827412131;
		else if (5 == i)
			anInt7723 = class536_sub33.method9720((byte) 1) * -978085053;
		else if (6 == i)
			anInt7725 = class536_sub33.method9720((byte) 1) * 299529583;
		else if (7 == i)
			anInt7731 = class536_sub33.readShort((byte) -61) * 104053305;
		else if (i == 8)
			aString7729 = class536_sub33.method9714((byte) 55);
		else if (9 == i)
			anInt7715 = class536_sub33.readUnsignedShort((short) 13711) * -649903291;
		else if (i == 10)
			anInt7727 = class536_sub33.readShort((byte) -12) * -841503441;
		else if (i == 11)
			anInt7735 = 0;
		else if (12 == i)
			anInt7730 = class536_sub33.readUnsignedByte(1275860406) * -217317801;
		else if (i == 13)
			anInt7733 = class536_sub33.readShort((byte) -91) * -1019225517;
		else if (i == 14)
			anInt7735 = class536_sub33.readUnsignedShort((short) -20571) * 163526433;
		else if (i == 16) {
			anInt7732 = class536_sub33.readShort((byte) -70) * 1542216787;
			anInt7714 = class536_sub33.readShort((byte) -15) * 995308857;
		} else if (i == 17 || i == 18) {
			anInt7728 = class536_sub33.readUnsignedShort((short) -9378) * -816379749;
			if (65535 == 1085119891 * anInt7728)
				anInt7728 = 816379749;
			anInt7736 = class536_sub33.readUnsignedShort((short) 23911) * -1920174597;
			if (65535 == 437800243 * anInt7736)
				anInt7736 = 1920174597;
			int i_9_ = -1;
			if (i == 18) {
				i_9_ = class536_sub33.readUnsignedShort((short) 14321);
				if (i_9_ == 65535)
					i_9_ = -1;
			}
			int i_10_ = class536_sub33.readUnsignedByte(-1205497342);
			anIntArray7734 = new int[i_10_ + 2];
			for (int i_11_ = 0; i_11_ <= i_10_; i_11_++) {
				anIntArray7734[i_11_] = class536_sub33.readUnsignedShort((short) -2833);
				if (65535 == anIntArray7734[i_11_])
					anIntArray7734[i_11_] = -1;
			}
			anIntArray7734[1 + i_10_] = i_9_;
		} else if (i == 19)
			anInt7737 = class536_sub33.readUnsignedShort((short) -8965) * 478092401;
		else if (20 == i)
			anInt7726 = class536_sub33.readUnsignedShort((short) -4570) * -1024398757;
	}

	public Class143 method7073(Class167 class167, byte i) {
		if (anInt7724 * -769447179 < 0)
			return null;
		Class143 class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7724 * -769447179));
		if (class143 == null) {
			method7068(class167, 1874696550);
			class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7724 * -769447179));
		}
		return class143;
	}

	public Class143 method7074(Class167 class167, int i) {
		if (272124267 * anInt7723 < 0)
			return null;
		Class143 class143 = ((Class143) aClass584_7712.aClass199_7706.method2886((long) (272124267 * anInt7723)));
		if (null == class143) {
			method7068(class167, 1807208828);
			class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7723 * 272124267));
		}
		return class143;
	}

	public Class143 method7075(Class167 class167) {
		if (anInt7722 * 1810029221 < 0)
			return null;
		Class143 class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7722 * 1810029221));
		if (null == class143) {
			method7068(class167, 1215324507);
			class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (1810029221 * anInt7722));
		}
		return class143;
	}

	public Class143 method7076(Class167 class167) {
		if (anInt7722 * 1810029221 < 0)
			return null;
		Class143 class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7722 * 1810029221));
		if (null == class143) {
			method7068(class167, 1302803686);
			class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (1810029221 * anInt7722));
		}
		return class143;
	}

	public Class143 method7077(Class167 class167, int i) {
		if (-203388529 * anInt7725 < 0)
			return null;
		Class143 class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7725 * -203388529));
		if (null == class143) {
			method7068(class167, 1165101202);
			class143 = (Class143) aClass584_7712.aClass199_7706.method2886((long) (anInt7725 * -203388529));
		}
		return class143;
	}

	void method7078(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt7719 = class536_sub33.method9720((byte) 1) * 224880251;
		else if (i == 2) {
			anInt7711 = class536_sub33.method9742(571320232) * 1123951115;
			aBool7718 = true;
		} else if (i == 3)
			anInt7722 = class536_sub33.method9720((byte) 1) * 1834581293;
		else if (i == 4)
			anInt7724 = class536_sub33.method9720((byte) 1) * -827412131;
		else if (5 == i)
			anInt7723 = class536_sub33.method9720((byte) 1) * -978085053;
		else if (6 == i)
			anInt7725 = class536_sub33.method9720((byte) 1) * 299529583;
		else if (7 == i)
			anInt7731 = class536_sub33.readShort((byte) -31) * 104053305;
		else if (i == 8)
			aString7729 = class536_sub33.method9714((byte) 62);
		else if (9 == i)
			anInt7715 = class536_sub33.readUnsignedShort((short) -13756) * -649903291;
		else if (i == 10)
			anInt7727 = class536_sub33.readShort((byte) -79) * -841503441;
		else if (i == 11)
			anInt7735 = 0;
		else if (12 == i)
			anInt7730 = class536_sub33.readUnsignedByte(1116248376) * -217317801;
		else if (i == 13)
			anInt7733 = class536_sub33.readShort((byte) -92) * -1019225517;
		else if (i == 14)
			anInt7735 = class536_sub33.readUnsignedShort((short) -18822) * 163526433;
		else if (i == 16) {
			anInt7732 = class536_sub33.readShort((byte) -86) * 1542216787;
			anInt7714 = class536_sub33.readShort((byte) -97) * 995308857;
		} else if (i == 17 || i == 18) {
			anInt7728 = class536_sub33.readUnsignedShort((short) -5997) * -816379749;
			if (65535 == 1085119891 * anInt7728)
				anInt7728 = 816379749;
			anInt7736 = class536_sub33.readUnsignedShort((short) 22732) * -1920174597;
			if (65535 == 437800243 * anInt7736)
				anInt7736 = 1920174597;
			int i_12_ = -1;
			if (i == 18) {
				i_12_ = class536_sub33.readUnsignedShort((short) 6461);
				if (i_12_ == 65535)
					i_12_ = -1;
			}
			int i_13_ = class536_sub33.readUnsignedByte(-1517082602);
			anIntArray7734 = new int[i_13_ + 2];
			for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
				anIntArray7734[i_14_] = class536_sub33.readUnsignedShort((short) 7946);
				if (65535 == anIntArray7734[i_14_])
					anIntArray7734[i_14_] = -1;
			}
			anIntArray7734[1 + i_13_] = i_12_;
		} else if (i == 19)
			anInt7737 = class536_sub33.readUnsignedShort((short) -23902) * 478092401;
		else if (20 == i)
			anInt7726 = class536_sub33.readUnsignedShort((short) 8299) * -1024398757;
	}

	static void method7079(Class668 class668, short i) {
		Class190.method2825(-1693259264);
		Class642.method7732(class668, 1795220199);
	}

	static final void method7080(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_15_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_16_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class39 class39 = (Class39) Class676.aClass34_Sub6_8589.method70(i_15_, (byte) 25);
		if (Class453.aClass453_5084 == class39.aClass453_483) {
			/* empty */
		}
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class39.method851(i_16_, 199065355);
	}

	static final void method7081(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_17_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_18_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_17_ - i_18_;
	}
}

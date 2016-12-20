/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Class197 implements Interface56 {
	Class226 this$0;

	public void method362(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1395759601);
		float f = class483.method7869((short) 16571);
		float f_0_ = class483.method7915((byte) 94);
		Class442 class442_1_ = this$0.method4197((byte) -94);
		Class442 class442_2_ = Class442.method7155(class442, class442_1_);
		float f_3_ = 0.0F;
		int i = 8192;
		float f_4_ = class442_2_.method7160();
		float f_5_ = 0.0F;
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_6_ = ((Float) objects[0]).floatValue();
			float f_7_ = ((Float) objects[1]).floatValue();
			if (class442_1_.aFloat4918 > class442.aFloat4918 - f_6_ / 2.0F && class442_1_.aFloat4918 < f_6_ / 2.0F + class442.aFloat4918 && class442_1_.aFloat4919 > class442.aFloat4919 - f_7_ / 2.0F && (class442_1_.aFloat4919 < f_7_ / 2.0F + class442.aFloat4919)) {
				float f_8_ = Math.abs(class442_1_.aFloat4918 - (class442.aFloat4918 + f_6_ / 2.0F));
				float f_9_ = Math.abs(class442_1_.aFloat4918 - (class442.aFloat4918 - f_6_ / 2.0F));
				float f_10_ = Math.abs(class442_1_.aFloat4919 - (class442.aFloat4918 + f_7_ / 2.0F));
				float f_11_ = Math.abs(class442_1_.aFloat4919 - (class442.aFloat4918 - f_7_ / 2.0F));
				float f_12_ = f_0_ - f;
				float f_13_ = Math.min(f_8_, f_9_);
				float f_14_ = Math.min(f_10_, f_11_);
				float f_15_ = f_13_ * (1.0F / f_12_);
				float f_16_ = f_14_ * (1.0F / f_12_);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
				f_3_ = Math.min(f_15_, f_16_);
			}
			if (0.0F != class442_2_.aFloat4918 || class442_2_.aFloat4919 != 0.0F) {
				if (-349191067 * Class30.anInt265 == 2) {
					float f_17_ = Class208_Sub10.aClass296_Sub1_9923.method5382(1748986003);
					if (class442_2_.aFloat4918 != 0.0F || class442_2_.aFloat4919 != 0.0F) {
						int i_18_ = (((int) (2607.5945876176133 * (double) (f_17_ * -1.0F)) - (int) (Math.atan2((double) (class442_2_.aFloat4918), (double) (class442_2_.aFloat4919)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_18_ > 8192)
							i_18_ = 16384 - i_18_;
						int i_19_;
						if (f_4_ <= 0.0F)
							i_19_ = 8192;
						else if (f_4_ >= 4096.0F)
							i_19_ = 16384;
						else
							i_19_ = (int) (8192.0F + 8192.0F * f_4_ / 4096.0F);
						i = i_18_ * i_19_ / 8192 + (16384 - i_19_ >> 1);
					}
					f_5_ = 6.1035156E-5F * (float) i;
				} else {
					int i_20_ = (-(Class12.anInt176 * -1728661517) - (int) (Math.atan2((double) class442_2_.aFloat4918, (double) class442_2_.aFloat4919) * 2607.5945876176133) - 4096) & 0x3fff;
					if (i_20_ > 8192)
						i_20_ = 16384 - i_20_;
					int i_21_;
					if (f_4_ <= 0.0F)
						i_21_ = 8192;
					else if (f_4_ >= 4096.0F)
						i_21_ = 16384;
					else
						i_21_ = (int) (8192.0F * f_4_ / 4096.0F + 8192.0F);
					i = i_20_ * i_21_ / 8192 + (16384 - i_21_ >> 1);
					f_5_ = 6.1035156E-5F * (float) i;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_3_ : (double) f_3_ * Math.sqrt((double) (1.0F - f_5_)));
		fs[1] = (float) (i < 0 ? (double) -f_3_ : (double) f_3_ * Math.sqrt((double) f_5_));
	}

	public void method361(Object object, float[] fs, Object[] objects, int i) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(554033717);
		float f = class483.method7869((short) -2303);
		float f_22_ = class483.method7915((byte) -35);
		Class442 class442_23_ = this$0.method4197((byte) -120);
		Class442 class442_24_ = Class442.method7155(class442, class442_23_);
		float f_25_ = 0.0F;
		int i_26_ = 8192;
		float f_27_ = class442_24_.method7160();
		float f_28_ = 0.0F;
		if (f_27_ >= f_22_)
			f_25_ = 0.0F;
		else {
			float f_29_ = ((Float) objects[0]).floatValue();
			float f_30_ = ((Float) objects[1]).floatValue();
			if (class442_23_.aFloat4918 > class442.aFloat4918 - f_29_ / 2.0F && class442_23_.aFloat4918 < f_29_ / 2.0F + class442.aFloat4918 && class442_23_.aFloat4919 > class442.aFloat4919 - f_30_ / 2.0F && (class442_23_.aFloat4919 < f_30_ / 2.0F + class442.aFloat4919)) {
				float f_31_ = Math.abs(class442_23_.aFloat4918 - (class442.aFloat4918 + f_29_ / 2.0F));
				float f_32_ = Math.abs(class442_23_.aFloat4918 - (class442.aFloat4918 - f_29_ / 2.0F));
				float f_33_ = Math.abs(class442_23_.aFloat4919 - (class442.aFloat4918 + f_30_ / 2.0F));
				float f_34_ = Math.abs(class442_23_.aFloat4919 - (class442.aFloat4918 - f_30_ / 2.0F));
				float f_35_ = f_22_ - f;
				float f_36_ = Math.min(f_31_, f_32_);
				float f_37_ = Math.min(f_33_, f_34_);
				float f_38_ = f_36_ * (1.0F / f_35_);
				float f_39_ = f_37_ * (1.0F / f_35_);
				f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
				f_39_ = Math.min(Math.max(f_39_, 0.0F), 1.0F);
				f_25_ = Math.min(f_38_, f_39_);
			}
			if (0.0F != class442_24_.aFloat4918 || class442_24_.aFloat4919 != 0.0F) {
				if (-349191067 * Class30.anInt265 == 2) {
					float f_40_ = Class208_Sub10.aClass296_Sub1_9923.method5382(163474876);
					if (class442_24_.aFloat4918 != 0.0F || class442_24_.aFloat4919 != 0.0F) {
						int i_41_ = (((int) (2607.5945876176133 * (double) (f_40_ * -1.0F)) - (int) (Math.atan2((double) (class442_24_.aFloat4918), (double) (class442_24_.aFloat4919)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_41_ > 8192)
							i_41_ = 16384 - i_41_;
						int i_42_;
						if (f_27_ <= 0.0F)
							i_42_ = 8192;
						else if (f_27_ >= 4096.0F)
							i_42_ = 16384;
						else
							i_42_ = (int) (8192.0F + 8192.0F * f_27_ / 4096.0F);
						i_26_ = i_41_ * i_42_ / 8192 + (16384 - i_42_ >> 1);
					}
					f_28_ = 6.1035156E-5F * (float) i_26_;
				} else {
					int i_43_ = ((-(Class12.anInt176 * -1728661517) - (int) (Math.atan2((double) (class442_24_.aFloat4918), (double) (class442_24_.aFloat4919)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_43_ > 8192)
						i_43_ = 16384 - i_43_;
					int i_44_;
					if (f_27_ <= 0.0F)
						i_44_ = 8192;
					else if (f_27_ >= 4096.0F)
						i_44_ = 16384;
					else
						i_44_ = (int) (8192.0F * f_27_ / 4096.0F + 8192.0F);
					i_26_ = i_43_ * i_44_ / 8192 + (16384 - i_44_ >> 1);
					f_28_ = 6.1035156E-5F * (float) i_26_;
				}
			}
		}
		fs[0] = (float) (i_26_ < 0 ? (double) f_25_ : (double) f_25_ * Math.sqrt((double) (1.0F - f_28_)));
		fs[1] = (float) (i_26_ < 0 ? (double) -f_25_ : (double) f_25_ * Math.sqrt((double) f_28_));
	}

	Class197(Class226 class226) {
		this$0 = class226;
	}

	public void method363(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1378528309);
		float f = class483.method7869((short) -12703);
		float f_45_ = class483.method7915((byte) -6);
		Class442 class442_46_ = this$0.method4197((byte) -89);
		Class442 class442_47_ = Class442.method7155(class442, class442_46_);
		float f_48_ = 0.0F;
		int i = 8192;
		float f_49_ = class442_47_.method7160();
		float f_50_ = 0.0F;
		if (f_49_ >= f_45_)
			f_48_ = 0.0F;
		else {
			float f_51_ = ((Float) objects[0]).floatValue();
			float f_52_ = ((Float) objects[1]).floatValue();
			if (class442_46_.aFloat4918 > class442.aFloat4918 - f_51_ / 2.0F && class442_46_.aFloat4918 < f_51_ / 2.0F + class442.aFloat4918 && class442_46_.aFloat4919 > class442.aFloat4919 - f_52_ / 2.0F && (class442_46_.aFloat4919 < f_52_ / 2.0F + class442.aFloat4919)) {
				float f_53_ = Math.abs(class442_46_.aFloat4918 - (class442.aFloat4918 + f_51_ / 2.0F));
				float f_54_ = Math.abs(class442_46_.aFloat4918 - (class442.aFloat4918 - f_51_ / 2.0F));
				float f_55_ = Math.abs(class442_46_.aFloat4919 - (class442.aFloat4918 + f_52_ / 2.0F));
				float f_56_ = Math.abs(class442_46_.aFloat4919 - (class442.aFloat4918 - f_52_ / 2.0F));
				float f_57_ = f_45_ - f;
				float f_58_ = Math.min(f_53_, f_54_);
				float f_59_ = Math.min(f_55_, f_56_);
				float f_60_ = f_58_ * (1.0F / f_57_);
				float f_61_ = f_59_ * (1.0F / f_57_);
				f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
				f_61_ = Math.min(Math.max(f_61_, 0.0F), 1.0F);
				f_48_ = Math.min(f_60_, f_61_);
			}
			if (0.0F != class442_47_.aFloat4918 || class442_47_.aFloat4919 != 0.0F) {
				if (-349191067 * Class30.anInt265 == 2) {
					float f_62_ = Class208_Sub10.aClass296_Sub1_9923.method5382(-531873593);
					if (class442_47_.aFloat4918 != 0.0F || class442_47_.aFloat4919 != 0.0F) {
						int i_63_ = (((int) (2607.5945876176133 * (double) (f_62_ * -1.0F)) - (int) (Math.atan2((double) (class442_47_.aFloat4918), (double) (class442_47_.aFloat4919)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_63_ > 8192)
							i_63_ = 16384 - i_63_;
						int i_64_;
						if (f_49_ <= 0.0F)
							i_64_ = 8192;
						else if (f_49_ >= 4096.0F)
							i_64_ = 16384;
						else
							i_64_ = (int) (8192.0F + 8192.0F * f_49_ / 4096.0F);
						i = i_63_ * i_64_ / 8192 + (16384 - i_64_ >> 1);
					}
					f_50_ = 6.1035156E-5F * (float) i;
				} else {
					int i_65_ = ((-(Class12.anInt176 * -1728661517) - (int) (Math.atan2((double) (class442_47_.aFloat4918), (double) (class442_47_.aFloat4919)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_65_ > 8192)
						i_65_ = 16384 - i_65_;
					int i_66_;
					if (f_49_ <= 0.0F)
						i_66_ = 8192;
					else if (f_49_ >= 4096.0F)
						i_66_ = 16384;
					else
						i_66_ = (int) (8192.0F * f_49_ / 4096.0F + 8192.0F);
					i = i_65_ * i_66_ / 8192 + (16384 - i_66_ >> 1);
					f_50_ = 6.1035156E-5F * (float) i;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_48_ : (double) f_48_ * Math.sqrt((double) (1.0F - f_50_)));
		fs[1] = (float) (i < 0 ? (double) -f_48_ : (double) f_48_ * Math.sqrt((double) f_50_));
	}

	static final void method3728(Class665 class665, int i) {
		int i_67_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_67_, -1921113811);
		Class240 class240 = Class183.aClass240Array2100[i_67_ >> 16];
		Class637.method10567(class243, class240, class665, (byte) 65);
	}

	public static void method3729(int i) {
		Class157.method2562(1233604289);
		Class642.aClass639_Sub1_8344.method10578(1827107284);
		Class642.aClass639_Sub2_8345.method10578(1839656197);
		if (-7744771 * client.anInt11041 > 0) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4470, client.aClass109_11067.aClass2_1367, (byte) -21);
			class527_sub15.buffer.writeShort(-30979084 * client.anInt11041, 1404835786);
			for (int i_68_ = 0; i_68_ < -7744771 * client.anInt11041; i_68_++) {
				Interface64 interface64 = client.anInterface64Array11166[i_68_];
				long l = (interface64.method414(433009517) - 4722132655032049939L * Class642.aLong8343);
				if (l > 16777215L)
					l = 16777215L;
				Class642.aLong8343 = interface64.method414(433009517) * -682336048790384357L;
				class527_sub15.buffer.writeByte(interface64.method396(932502361), -1494478796);
				class527_sub15.buffer.writeTriByte((int) l, 900977911);
			}
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (881989347 * Class642.anInt8340 > 0)
			Class642.anInt8340 -= -1599742261;
		if (client.aBool11119 && 881989347 * Class642.anInt8340 <= 0) {
			Class642.anInt8340 = -1930074148;
			client.aBool11119 = false;
			int i_69_;
			int i_70_;
			if (2 == Class30.anInt265 * -349191067) {
				if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) -90) == Class301.aClass301_3418) {
					Class327_Sub2 class327_sub2 = (Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0);
					i_69_ = Class208_Sub1.method15588((class327_sub2.aClass438_10044), -1544880337) >> 3;
					int i_71_ = 1024;
					i_70_ = (3 * i_71_ - (Class293_Sub1.method15725((class327_sub2.aClass438_10044), 511197817) >> 3)) % (2 * i_71_);
				} else {
					i_69_ = 0;
					i_70_ = 0;
				}
			} else {
				i_69_ = (int) client.aFloat11111 >> 3;
				i_70_ = (int) client.aFloat11112 >> 3;
			}
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4501, client.aClass109_11067.aClass2_1367, (byte) 21);
			class527_sub15.buffer.writeShort(i_70_, 1404835786);
			class527_sub15.buffer.writeShortLE128(i_69_, 1342304867);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (Class642.aBool8342 != Class333.aBool3628) {
			Class642.aBool8342 = Class333.aBool3628;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4407, client.aClass109_11067.aClass2_1367, (byte) -12);
			class527_sub15.buffer.writeByte(Class333.aBool3628 ? 1 : 0, -2130415351);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!client.aBool11020) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4394, client.aClass109_11067.aClass2_1367, (byte) -77);
			class527_sub15.buffer.writeByte(0, -596459613);
			int i_72_ = (class527_sub15.buffer.anInt10689 * -441238943);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class527_sub15.buffer.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 81);
			class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943) - i_72_, -534116933);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11020 = true;
		}
		if (!client.aBool11248 && Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16894(-2088349267) == 1) {
			int[] is = Class402.aClass180_4150.method3284();
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4438, client.aClass109_11067.aClass2_1367, (byte) 77);
			class527_sub15.buffer.writeShort(0, 1404835786);
			int i_73_ = (class527_sub15.buffer.anInt10689 * -441238943);
			if (null != is && is.length != 0) {
				class527_sub15.buffer.writeByte(1, 965900951);
				Class138[] class138s = Class138.method2316(-2019805187);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_74_ = 0; i_74_ < is.length; i_74_++) {
					boolean bool = false;
					for (int i_75_ = 0; i_75_ < class138s.length; i_75_++) {
						if (class138s[i_75_].anInt1600 == is[i_74_]) {
							hashset.add(class138s[i_75_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_74_]));
				}
				Class26.method856(hashset, class527_sub15.buffer, -402018422);
				class527_sub15.buffer.method16439(arraylist.size(), (byte) -115);
				if (arraylist.size() > 0) {
					int i_76_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_76_)
							i_76_ = integer.intValue();
					}
					class527_sub15.buffer.method16520(i_76_, -2021382270);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_76_)
							class527_sub15.buffer.method16520(integer.intValue() - i_76_, -1864299490);
					}
				}
			} else
				class527_sub15.buffer.writeByte(0, 231418408);
			class527_sub15.buffer.method16437((class527_sub15.buffer.anInt10689 * -441238943) - i_73_, -18705907);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			client.aBool11248 = true;
		}
	}
}

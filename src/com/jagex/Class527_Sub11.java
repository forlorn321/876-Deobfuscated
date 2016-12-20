/* Class527_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class527_Sub11 extends Class527 {
	Class180_Sub2 aClass180_Sub2_10431;
	Class161_Sub3 aClass161_Sub3_10432;
	int anInt10433;
	Interface37 anInterface37_10434;
	int anInt10435;
	Class178 aClass178_10436;
	int anInt10437 = 0;
	int[] anIntArray10438;
	int anInt10439 = 0;
	int anInt10440 = 0;
	float aFloat10441;
	long aLong10442;
	ByteBuffer aByteBuffer10443;

	Class527_Sub11(Class161_Sub3 class161_sub3, int i, int i_0_, Class178 class178) {
		anInt10433 = 0;
		aClass161_Sub3_10432 = class161_sub3;
		aClass180_Sub2_10431 = aClass161_Sub3_10432.aClass180_Sub2_9607;
		anInt10435 = i;
		aFloat10441 = (float) i_0_;
		aClass178_10436 = class178;
		anIntArray10438 = new int[(aClass161_Sub3_10432.anInt1750 * 1210322533 * (aClass161_Sub3_10432.anInt1751 * -533476177))];
	}

	void method16077(int i) {
		aByteBuffer10443 = aClass180_Sub2_10431.method14892(i * 4);
		aLong10442 = aClass180_Sub2_10431.method14893(aByteBuffer10443);
		for (int i_1_ = 3; i_1_ < i * 4; i_1_ += 4)
			aClass180_Sub2_10431.anUnsafe9437.putByte(aLong10442 + (long) i_1_, (byte) 0);
	}

	void method16078(int i) {
		anInterface37_10434 = aClass180_Sub2_10431.method15035(false);
		anInterface37_10434.method219(i * 4, 4);
		anInterface37_10434.method213(0, i * 4, aLong10442);
		aByteBuffer10443.clear();
		aByteBuffer10443 = null;
		aLong10442 = 0L;
	}

	void method16079(int i, int i_2_, int i_3_, float f) {
		if (anInt10435 != -1) {
			Class163 class163 = aClass180_Sub2_10431.aClass181_2059.method3544(anInt10435, (byte) -25);
			int i_4_ = class163.aByte1808 & 0xff;
			if (i_4_ != 0 && class163.aByte1801 != 4) {
				int i_5_;
				if (i_3_ < 0)
					i_5_ = 0;
				else if (i_3_ > 127)
					i_5_ = 16777215;
				else
					i_5_ = 131586 * i_3_;
				if (i_4_ == 256)
					i_2_ = i_5_;
				else {
					int i_6_ = i_4_;
					int i_7_ = 256 - i_4_;
					i_2_ = (((i_5_ & 0xff00ff) * i_6_ + (i_2_ & 0xff00ff) * i_7_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_6_ + (i_2_ & 0xff00) * i_7_ & 0xff0000)) >> 8;
				}
			}
			int i_8_ = class163.aByte1802 & 0xff;
			if (i_8_ != 0) {
				i_8_ += 256;
				int i_9_ = ((i_2_ & 0xff0000) >> 16) * i_8_;
				if (i_9_ > 65535)
					i_9_ = 65535;
				int i_10_ = ((i_2_ & 0xff00) >> 8) * i_8_;
				if (i_10_ > 65535)
					i_10_ = 65535;
				int i_11_ = (i_2_ & 0xff) * i_8_;
				if (i_11_ > 65535)
					i_11_ = 65535;
				i_2_ = (i_9_ << 8 & 0xff0000) + (i_10_ & 0xff00) + (i_11_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_12_ = i_2_ >> 16 & 0xff;
			int i_13_ = i_2_ >> 8 & 0xff;
			int i_14_ = i_2_ & 0xff;
			i_12_ *= f;
			if (i_12_ < 0)
				i_12_ = 0;
			else if (i_12_ > 255)
				i_12_ = 255;
			i_13_ *= f;
			if (i_13_ < 0)
				i_13_ = 0;
			else if (i_13_ > 255)
				i_13_ = 255;
			i_14_ *= f;
			if (i_14_ < 0)
				i_14_ = 0;
			else if (i_14_ > 255)
				i_14_ = 255;
			i_2_ = i_12_ << 16 | i_13_ << 8 | i_14_;
		}
		if (aClass180_Sub2_10431.anInt9578 == 0) {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_2_ >> 16));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_2_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_2_ >> 0));
		} else {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_2_ >> 0));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_2_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_2_ >> 16));
		}
	}

	void method16080(int i, int i_15_, int i_16_, float f) {
		if (anInt10435 != -1) {
			Class163 class163 = aClass180_Sub2_10431.aClass181_2059.method3544(anInt10435, (byte) -72);
			int i_17_ = class163.aByte1808 & 0xff;
			if (i_17_ != 0 && class163.aByte1801 != 4) {
				int i_18_;
				if (i_16_ < 0)
					i_18_ = 0;
				else if (i_16_ > 127)
					i_18_ = 16777215;
				else
					i_18_ = 131586 * i_16_;
				if (i_17_ == 256)
					i_15_ = i_18_;
				else {
					int i_19_ = i_17_;
					int i_20_ = 256 - i_17_;
					i_15_ = ((((i_18_ & 0xff00ff) * i_19_ + (i_15_ & 0xff00ff) * i_20_) & ~0xff00ff) + (((i_18_ & 0xff00) * i_19_ + (i_15_ & 0xff00) * i_20_) & 0xff0000)) >> 8;
				}
			}
			int i_21_ = class163.aByte1802 & 0xff;
			if (i_21_ != 0) {
				i_21_ += 256;
				int i_22_ = ((i_15_ & 0xff0000) >> 16) * i_21_;
				if (i_22_ > 65535)
					i_22_ = 65535;
				int i_23_ = ((i_15_ & 0xff00) >> 8) * i_21_;
				if (i_23_ > 65535)
					i_23_ = 65535;
				int i_24_ = (i_15_ & 0xff) * i_21_;
				if (i_24_ > 65535)
					i_24_ = 65535;
				i_15_ = (i_22_ << 8 & 0xff0000) + (i_23_ & 0xff00) + (i_24_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_25_ = i_15_ >> 16 & 0xff;
			int i_26_ = i_15_ >> 8 & 0xff;
			int i_27_ = i_15_ & 0xff;
			i_25_ *= f;
			if (i_25_ < 0)
				i_25_ = 0;
			else if (i_25_ > 255)
				i_25_ = 255;
			i_26_ *= f;
			if (i_26_ < 0)
				i_26_ = 0;
			else if (i_26_ > 255)
				i_26_ = 255;
			i_27_ *= f;
			if (i_27_ < 0)
				i_27_ = 0;
			else if (i_27_ > 255)
				i_27_ = 255;
			i_15_ = i_25_ << 16 | i_26_ << 8 | i_27_;
		}
		if (aClass180_Sub2_10431.anInt9578 == 0) {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_15_ >> 16));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_15_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_15_ >> 0));
		} else {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_15_ >> 0));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_15_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_15_ >> 16));
		}
	}

	void method16081(int i) {
		anInterface37_10434 = aClass180_Sub2_10431.method15035(false);
		anInterface37_10434.method219(i * 4, 4);
		anInterface37_10434.method213(0, i * 4, aLong10442);
		aByteBuffer10443.clear();
		aByteBuffer10443 = null;
		aLong10442 = 0L;
	}

	void method16082(int[] is, int i) {
		anInt10439 = 0;
		anInt10440 = 32767;
		anInt10433 = -32768;
		ByteBuffer bytebuffer = aClass180_Sub2_10431.aByteBuffer9438;
		for (int i_28_ = 0; i_28_ < i; i_28_++) {
			int i_29_ = is[i_28_];
			short[] is_30_ = aClass161_Sub3_10432.aShortArrayArray9621[i_29_];
			int i_31_ = anIntArray10438[i_29_];
			if (i_31_ != 0 && is_30_ != null) {
				int i_32_ = 0;
				int i_33_ = 0;
				while (i_33_ < is_30_.length) {
					if ((i_31_ & 1 << i_32_++) != 0) {
						for (int i_34_ = 0; i_34_ < 3; i_34_++) {
							int i_35_ = is_30_[i_33_++] & 0xffff;
							if (i_35_ > anInt10433)
								anInt10433 = i_35_;
							if (i_35_ < anInt10440)
								anInt10440 = i_35_;
							bytebuffer.putShort((short) i_35_);
						}
						anInt10439 += 3;
					} else
						i_33_ += 3;
				}
			}
		}
	}

	void method16083(int i) {
		aClass180_Sub2_10431.anUnsafe9437.putByte(aLong10442 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method16084(int i) {
		aByteBuffer10443 = aClass180_Sub2_10431.method14892(i * 4);
		aLong10442 = aClass180_Sub2_10431.method14893(aByteBuffer10443);
		for (int i_36_ = 3; i_36_ < i * 4; i_36_ += 4)
			aClass180_Sub2_10431.anUnsafe9437.putByte(aLong10442 + (long) i_36_, (byte) 0);
	}

	void method16085(int i, int i_37_, int i_38_, float f) {
		if (anInt10435 != -1) {
			Class163 class163 = aClass180_Sub2_10431.aClass181_2059.method3544(anInt10435, (byte) -96);
			int i_39_ = class163.aByte1808 & 0xff;
			if (i_39_ != 0 && class163.aByte1801 != 4) {
				int i_40_;
				if (i_38_ < 0)
					i_40_ = 0;
				else if (i_38_ > 127)
					i_40_ = 16777215;
				else
					i_40_ = 131586 * i_38_;
				if (i_39_ == 256)
					i_37_ = i_40_;
				else {
					int i_41_ = i_39_;
					int i_42_ = 256 - i_39_;
					i_37_ = ((((i_40_ & 0xff00ff) * i_41_ + (i_37_ & 0xff00ff) * i_42_) & ~0xff00ff) + (((i_40_ & 0xff00) * i_41_ + (i_37_ & 0xff00) * i_42_) & 0xff0000)) >> 8;
				}
			}
			int i_43_ = class163.aByte1802 & 0xff;
			if (i_43_ != 0) {
				i_43_ += 256;
				int i_44_ = ((i_37_ & 0xff0000) >> 16) * i_43_;
				if (i_44_ > 65535)
					i_44_ = 65535;
				int i_45_ = ((i_37_ & 0xff00) >> 8) * i_43_;
				if (i_45_ > 65535)
					i_45_ = 65535;
				int i_46_ = (i_37_ & 0xff) * i_43_;
				if (i_46_ > 65535)
					i_46_ = 65535;
				i_37_ = (i_44_ << 8 & 0xff0000) + (i_45_ & 0xff00) + (i_46_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_47_ = i_37_ >> 16 & 0xff;
			int i_48_ = i_37_ >> 8 & 0xff;
			int i_49_ = i_37_ & 0xff;
			i_47_ *= f;
			if (i_47_ < 0)
				i_47_ = 0;
			else if (i_47_ > 255)
				i_47_ = 255;
			i_48_ *= f;
			if (i_48_ < 0)
				i_48_ = 0;
			else if (i_48_ > 255)
				i_48_ = 255;
			i_49_ *= f;
			if (i_49_ < 0)
				i_49_ = 0;
			else if (i_49_ > 255)
				i_49_ = 255;
			i_37_ = i_47_ << 16 | i_48_ << 8 | i_49_;
		}
		if (aClass180_Sub2_10431.anInt9578 == 0) {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_37_ >> 16));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_37_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_37_ >> 0));
		} else {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_37_ >> 0));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_37_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_37_ >> 16));
		}
	}

	void method16086(int i) {
		aClass180_Sub2_10431.anUnsafe9437.putByte(aLong10442 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method16087(int i, int i_50_, int i_51_) {
		anIntArray10438[(i_50_ * (aClass161_Sub3_10432.anInt1750 * 1210322533) + i)] |= 1 << i_51_;
		anInt10437++;
	}

	void method16088(int i, int i_52_, int i_53_) {
		anIntArray10438[(i_52_ * (aClass161_Sub3_10432.anInt1750 * 1210322533) + i)] |= 1 << i_53_;
		anInt10437++;
	}

	void method16089(int i, int i_54_, int i_55_, float f) {
		if (anInt10435 != -1) {
			Class163 class163 = aClass180_Sub2_10431.aClass181_2059.method3544(anInt10435, (byte) -106);
			int i_56_ = class163.aByte1808 & 0xff;
			if (i_56_ != 0 && class163.aByte1801 != 4) {
				int i_57_;
				if (i_55_ < 0)
					i_57_ = 0;
				else if (i_55_ > 127)
					i_57_ = 16777215;
				else
					i_57_ = 131586 * i_55_;
				if (i_56_ == 256)
					i_54_ = i_57_;
				else {
					int i_58_ = i_56_;
					int i_59_ = 256 - i_56_;
					i_54_ = ((((i_57_ & 0xff00ff) * i_58_ + (i_54_ & 0xff00ff) * i_59_) & ~0xff00ff) + (((i_57_ & 0xff00) * i_58_ + (i_54_ & 0xff00) * i_59_) & 0xff0000)) >> 8;
				}
			}
			int i_60_ = class163.aByte1802 & 0xff;
			if (i_60_ != 0) {
				i_60_ += 256;
				int i_61_ = ((i_54_ & 0xff0000) >> 16) * i_60_;
				if (i_61_ > 65535)
					i_61_ = 65535;
				int i_62_ = ((i_54_ & 0xff00) >> 8) * i_60_;
				if (i_62_ > 65535)
					i_62_ = 65535;
				int i_63_ = (i_54_ & 0xff) * i_60_;
				if (i_63_ > 65535)
					i_63_ = 65535;
				i_54_ = (i_61_ << 8 & 0xff0000) + (i_62_ & 0xff00) + (i_63_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_64_ = i_54_ >> 16 & 0xff;
			int i_65_ = i_54_ >> 8 & 0xff;
			int i_66_ = i_54_ & 0xff;
			i_64_ *= f;
			if (i_64_ < 0)
				i_64_ = 0;
			else if (i_64_ > 255)
				i_64_ = 255;
			i_65_ *= f;
			if (i_65_ < 0)
				i_65_ = 0;
			else if (i_65_ > 255)
				i_65_ = 255;
			i_66_ *= f;
			if (i_66_ < 0)
				i_66_ = 0;
			else if (i_66_ > 255)
				i_66_ = 255;
			i_54_ = i_64_ << 16 | i_65_ << 8 | i_66_;
		}
		if (aClass180_Sub2_10431.anInt9578 == 0) {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_54_ >> 16));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_54_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_54_ >> 0));
		} else {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_54_ >> 0));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_54_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_54_ >> 16));
		}
	}

	void method16090(int i) {
		aByteBuffer10443 = aClass180_Sub2_10431.method14892(i * 4);
		aLong10442 = aClass180_Sub2_10431.method14893(aByteBuffer10443);
		for (int i_67_ = 3; i_67_ < i * 4; i_67_ += 4)
			aClass180_Sub2_10431.anUnsafe9437.putByte(aLong10442 + (long) i_67_, (byte) 0);
	}

	void method16091(int i, int i_68_, int i_69_, float f) {
		if (anInt10435 != -1) {
			Class163 class163 = aClass180_Sub2_10431.aClass181_2059.method3544(anInt10435, (byte) -36);
			int i_70_ = class163.aByte1808 & 0xff;
			if (i_70_ != 0 && class163.aByte1801 != 4) {
				int i_71_;
				if (i_69_ < 0)
					i_71_ = 0;
				else if (i_69_ > 127)
					i_71_ = 16777215;
				else
					i_71_ = 131586 * i_69_;
				if (i_70_ == 256)
					i_68_ = i_71_;
				else {
					int i_72_ = i_70_;
					int i_73_ = 256 - i_70_;
					i_68_ = ((((i_71_ & 0xff00ff) * i_72_ + (i_68_ & 0xff00ff) * i_73_) & ~0xff00ff) + (((i_71_ & 0xff00) * i_72_ + (i_68_ & 0xff00) * i_73_) & 0xff0000)) >> 8;
				}
			}
			int i_74_ = class163.aByte1802 & 0xff;
			if (i_74_ != 0) {
				i_74_ += 256;
				int i_75_ = ((i_68_ & 0xff0000) >> 16) * i_74_;
				if (i_75_ > 65535)
					i_75_ = 65535;
				int i_76_ = ((i_68_ & 0xff00) >> 8) * i_74_;
				if (i_76_ > 65535)
					i_76_ = 65535;
				int i_77_ = (i_68_ & 0xff) * i_74_;
				if (i_77_ > 65535)
					i_77_ = 65535;
				i_68_ = (i_75_ << 8 & 0xff0000) + (i_76_ & 0xff00) + (i_77_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_78_ = i_68_ >> 16 & 0xff;
			int i_79_ = i_68_ >> 8 & 0xff;
			int i_80_ = i_68_ & 0xff;
			i_78_ *= f;
			if (i_78_ < 0)
				i_78_ = 0;
			else if (i_78_ > 255)
				i_78_ = 255;
			i_79_ *= f;
			if (i_79_ < 0)
				i_79_ = 0;
			else if (i_79_ > 255)
				i_79_ = 255;
			i_80_ *= f;
			if (i_80_ < 0)
				i_80_ = 0;
			else if (i_80_ > 255)
				i_80_ = 255;
			i_68_ = i_78_ << 16 | i_79_ << 8 | i_80_;
		}
		if (aClass180_Sub2_10431.anInt9578 == 0) {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_68_ >> 16));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_68_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_68_ >> 0));
		} else {
			aByteBuffer10443.put(i * 4 + 0, (byte) (i_68_ >> 0));
			aByteBuffer10443.put(i * 4 + 1, (byte) (i_68_ >> 8));
			aByteBuffer10443.put(i * 4 + 2, (byte) (i_68_ >> 16));
		}
	}

	void method16092(int i) {
		aClass180_Sub2_10431.anUnsafe9437.putByte(aLong10442 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method16093(int i) {
		anInterface37_10434 = aClass180_Sub2_10431.method15035(false);
		anInterface37_10434.method219(i * 4, 4);
		anInterface37_10434.method213(0, i * 4, aLong10442);
		aByteBuffer10443.clear();
		aByteBuffer10443 = null;
		aLong10442 = 0L;
	}

	void method16094(int i) {
		anInterface37_10434 = aClass180_Sub2_10431.method15035(false);
		anInterface37_10434.method219(i * 4, 4);
		anInterface37_10434.method213(0, i * 4, aLong10442);
		aByteBuffer10443.clear();
		aByteBuffer10443 = null;
		aLong10442 = 0L;
	}

	void method16095(int i, int i_81_, int i_82_) {
		anIntArray10438[(i_81_ * (aClass161_Sub3_10432.anInt1750 * 1210322533) + i)] |= 1 << i_82_;
		anInt10437++;
	}

	void method16096(int i) {
		anInterface37_10434 = aClass180_Sub2_10431.method15035(false);
		anInterface37_10434.method219(i * 4, 4);
		anInterface37_10434.method213(0, i * 4, aLong10442);
		aByteBuffer10443.clear();
		aByteBuffer10443 = null;
		aLong10442 = 0L;
	}
}

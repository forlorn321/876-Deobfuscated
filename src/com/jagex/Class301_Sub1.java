/* Class301_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class301_Sub1 extends Class301 {
	int anInt10100 = 0;

	public Class301_Sub1(Interface32 interface32) {
		super(Class289.aClass289_3213, interface32);
	}

	public void method9198(RSByteBuffer class536_sub33, int i, int i_0_) {
		int i_1_ = -810172525 * class536_sub33.off;
		int i_2_ = class536_sub33.readUnsignedByte(1569702074);
		method4033(Class646.method7809(i_2_ & 0x1, 1017591568), -693000904);
		if ((i_2_ & 0x8) != 0) {
			Class300 class300 = Class642.method7734(class536_sub33.readUnsignedByte(1520115635), (byte) 10);
			if (aClass300_3366 != class300) {
				try {
					method4082(class300, true, (byte) 0);
				} catch (Exception_Sub3 exception_sub3) {
					exception_sub3.printStackTrace();
				}
			}
		}
		if ((i_2_ & 0x10) != 0) {
			Class290 class290 = Class243.method3399(class536_sub33.readUnsignedByte(650898336), 1855636510);
			if (class290 != aClass290_3371) {
				try {
					method4031(class290, true, -203145218);
				} catch (Exception_Sub3 exception_sub3) {
					exception_sub3.printStackTrace();
				}
			}
		}
		if (1 == (i_2_ >> 7 & 0x1)) {
			int i_3_ = class536_sub33.readUnsignedShort((short) -16708);
			if ((i_3_ >> Class295.aClass295_3257.anInt3264 * -1131119493 & 0x1) == 1)
				aClass436_3374.method5242(class536_sub33);
			if (1 == (i_3_ >> -1131119493 * Class295.aClass295_3249.anInt3264 & 0x1))
				aClass436_3375.method5242(class536_sub33);
			if (1 == (i_3_ >> -1131119493 * Class295.aClass295_3254.anInt3264 & 0x1))
				aClass436_3377.method5242(class536_sub33);
			if (1 == (i_3_ >> Class295.aClass295_3252.anInt3264 * -1131119493 & 0x1))
				aClass436_3378.method5242(class536_sub33);
			if (1 == (i_3_ >> Class295.aClass295_3253.anInt3264 * -1131119493 & 0x1)) {
				aFloat3389 = class536_sub33.method9712(562321351);
				aFloat3368 = class536_sub33.method9712(-890260358);
			}
			if ((i_3_ >> Class295.aClass295_3250.anInt3264 * -1131119493 & 0x1) == 1) {
				aFloat3393 = class536_sub33.method9712(-1478242299);
				aFloat3398 = class536_sub33.method9712(-413426940);
			}
			if ((i_3_ >> Class295.aClass295_3255.anInt3264 * -1131119493 & 0x1) == 1)
				aClass302_3365 = Class580.method7014(class536_sub33.readUnsignedByte(-1501923841), (byte) 2);
			if ((i_3_ >> Class295.aClass295_3256.anInt3264 * -1131119493 & 0x1) == 1) {
				anInt3376 = class536_sub33.read24BitUnsignedInteger(1295985534) * -86569843;
				class536_sub33.readUnsignedByte(1236267804);
			}
			if ((i_3_ >> Class295.aClass295_3251.anInt3264 * -1131119493 & 0x1) == 1) {
				int i_4_ = class536_sub33.readUnsignedByte(778136761);
				aBool3395 = (i_4_ & 0x1) == 1;
				aBool3363 = 2 == (i_4_ & 0x2);
			}
			if ((i_3_ >> -1131119493 * Class295.aClass295_3258.anInt3264 & 0x1) == 1) {
				int i_5_ = class536_sub33.readUnsignedByte(558181344);
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					int i_7_ = class536_sub33.readUnsignedByte(-446872792);
					int i_8_ = class536_sub33.readUnsignedByte(-1171544828);
					if (i_7_ == 0)
						method4089(i_8_, (byte) 21);
					else {
						Class288 class288 = Class306.method4130(class536_sub33.readUnsignedByte(-1204258624), -2147298823);
						boolean bool = true;
						Iterator iterator = aClass4_3399.iterator();
						while (iterator.hasNext()) {
							Class536_Sub18_Sub18 class536_sub18_sub18 = (Class536_Sub18_Sub18) iterator.next();
							if (1164011507 * class536_sub18_sub18.anInt11824 == i_8_) {
								class536_sub18_sub18.method10809(class536_sub33, -1554847226);
								bool = false;
								break;
							}
						}
						if (bool)
							method4063(Class99.method1331(i_8_, class288, class536_sub33, 947676168), -1081235108);
					}
				}
			}
			if ((i_3_ >> Class295.aClass295_3260.anInt3264 * -1131119493 & 0x1) == 1) {
				anInt3394 = class536_sub33.readUnsignedShort((short) 199) * 734446143;
				aFloat3390 = class536_sub33.method9712(-1837192895);
			}
			if ((i_3_ >> -1131119493 * Class295.aClass295_3259.anInt3264 & 0x1) == 1)
				aClass298_3379 = Class267.method3704(class536_sub33.readUnsignedByte(1648525214), -601537386);
			if ((i_3_ >> Class295.aClass295_3261.anInt3264 * -1131119493 & 0x1) == 1) {
				aClass436_3385.method5242(class536_sub33);
				aClass436_3386.method5242(class536_sub33);
				aFloat3380 = class536_sub33.method9712(-2096030522);
				aFloat3388 = class536_sub33.method9712(188363161);
			}
			if ((i_3_ >> Class295.aClass295_3262.anInt3264 * -1131119493 & 0x1) == 1)
				class536_sub33.method9712(60321306);
			if ((i_3_ >> -1131119493 * Class295.aClass295_3263.anInt3264 & 0x1) == 1)
				aFloat3373 = class536_sub33.method9712(723347770);
		}
		if (null != aClass706_3397 && (i_2_ >> 5 & 0x1) == 1)
			aClass706_3397.method8277(class536_sub33, -733964050);
		if (null != aClass333_3367 && (i_2_ >> 6 & 0x1) == 1)
			aClass333_3367.method4348(class536_sub33, (byte) 98);
		if (-810172525 * class536_sub33.off - i_1_ != i)
			throw new RuntimeException(new StringBuilder().append(-810172525 * (class536_sub33.off) - i_1_).append(",").append(i).toString());
	}

	public int method9199() {
		anInt10100 += 129966261;
		if (126 == -1086796387 * anInt10100)
			anInt10100 = 0;
		return anInt10100 * -1086796387;
	}

	public int method9200(int i) {
		anInt10100 += 129966261;
		if (126 == -1086796387 * anInt10100)
			anInt10100 = 0;
		return anInt10100 * -1086796387;
	}

	static boolean method9201(int i) {
		boolean bool = true;
		if (null == Class100.aClass179_1186) {
			if (Class398.aClass461_4122.method5580(2027086611 * Class100.anInt1189, -964514165))
				Class100.aClass179_1186 = Class181.method2717(Class398.aClass461_4122, Class100.anInt1189 * 2027086611);
			else
				bool = false;
		}
		if (Class100.aClass179_1192 == null) {
			if (Class398.aClass461_4122.method5580(Class577.anInt7689 * 2021035779, -964514165))
				Class100.aClass179_1192 = Class181.method2717(Class398.aClass461_4122, 2021035779 * Class577.anInt7689);
			else
				bool = false;
		}
		if (Class100.aClass179_1193 == null) {
			if (Class398.aClass461_4122.method5580(Class576.anInt7683 * -1782676425, -964514165))
				Class100.aClass179_1193 = Class181.method2717(Class398.aClass461_4122, Class576.anInt7683 * -1782676425);
			else
				bool = false;
		}
		if (null == Class70.aClass2_793) {
			if (Class710_Sub43.aClass461_10940.method5580(1930213931 * Class100.anInt1190, -964514165))
				Class70.aClass2_793 = (Class196.aClass410_2202.method4981(client.anInterface51_11196, 1930213931 * Class100.anInt1190, -990341547));
			else
				bool = false;
		}
		if (Class24.aClass179_Sub2Array233 == null) {
			if (Class398.aClass461_4122.method5580(1930213931 * Class100.anInt1190, -964514165))
				Class24.aClass179_Sub2Array233 = ((Class179_Sub2[]) Class181.method2719(Class398.aClass461_4122, Class100.anInt1190 * 1930213931));
			else
				bool = false;
		}
		return bool;
	}
}

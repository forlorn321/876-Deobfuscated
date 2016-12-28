/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class374 {
	long aLong3899;
	Class374 aClass374_3900;
	float aFloat3901;
	Interface42 anInterface42_3902;
	float aFloat3903;
	float aFloat3904;
	long aLong3905;
	float aFloat3906;
	public static Class33 aClass33_3907;

	public float method4767() {
		return aFloat3901;
	}

	float method4768(int i) {
		return aFloat3906;
	}

	void method4769(int i) {
		if (anInterface42_3902 != null) {
			float f = anInterface42_3902.method285(-1289598155);
			if (f != aFloat3901 && aFloat3903 < 0.0F) {
				aFloat3904 = aFloat3901;
				aFloat3903 = f;
				aLong3905 = Class249.method3450(1960876278) * -8133197377042652597L;
				aLong3899 = 7911425639056878540L + -2640061256018086943L * aLong3905;
			}
		}
		if (aFloat3903 >= 0.0F) {
			long l = Class249.method3450(1704848727);
			if (l > aLong3899 * -5617657913976540221L) {
				aFloat3901 = aFloat3903;
				aFloat3903 = -1.0F;
			} else {
				float f = aFloat3903 - aFloat3904;
				long l_0_ = (aLong3899 * -5617657913976540221L - -2374935929299118237L * aLong3905);
				float f_1_ = f / (float) l_0_;
				aFloat3901 = ((float) (l - -2374935929299118237L * aLong3905) * f_1_ + aFloat3904);
				if (aFloat3901 == aFloat3903)
					aFloat3903 = -1.0F;
			}
		}
		aFloat3901 = Math.min(1.0F, Math.max(aFloat3901, 0.0F));
	}

	public float method4770(byte i) {
		return aFloat3901;
	}

	public void method4771(float f, byte i) {
		if (null == anInterface42_3902) {
			aFloat3903 = f;
			aFloat3904 = aFloat3901;
			aLong3905 = Class249.method3450(1671559105) * -8133197377042652597L;
			aLong3899 = 7911425639056878540L + -2640061256018086943L * aLong3905;
		}
	}

	public Class374 method4772(int i) {
		return aClass374_3900;
	}

	Class374(int i, float f, Object object, Class359 class359, Interface42 interface42, Class374 class374_2_) {
		aClass374_3900 = class374_2_;
		anInterface42_3902 = interface42;
		aFloat3901 = 1.0F;
		aFloat3906 = f;
		aFloat3904 = -1.0F;
		aFloat3903 = -1.0F;
		aLong3905 = 8133197377042652597L;
		aLong3899 = -6535474682188911851L;
	}

	public float method4773(int i) {
		float f = aFloat3901;
		for (Class374 class374_3_ = aClass374_3900; null != class374_3_; class374_3_ = class374_3_.method4772(1821873429))
			f *= class374_3_.method4770((byte) -27);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	void method4774() {
		if (anInterface42_3902 != null) {
			float f = anInterface42_3902.method285(-470365222);
			if (f != aFloat3901 && aFloat3903 < 0.0F) {
				aFloat3904 = aFloat3901;
				aFloat3903 = f;
				aLong3905 = Class249.method3450(1926756258) * -8133197377042652597L;
				aLong3899 = 7911425639056878540L + -2640061256018086943L * aLong3905;
			}
		}
		if (aFloat3903 >= 0.0F) {
			long l = Class249.method3450(1432730808);
			if (l > aLong3899 * -5617657913976540221L) {
				aFloat3901 = aFloat3903;
				aFloat3903 = -1.0F;
			} else {
				float f = aFloat3903 - aFloat3904;
				long l_4_ = (aLong3899 * -5617657913976540221L - -2374935929299118237L * aLong3905);
				float f_5_ = f / (float) l_4_;
				aFloat3901 = ((float) (l - -2374935929299118237L * aLong3905) * f_5_ + aFloat3904);
				if (aFloat3901 == aFloat3903)
					aFloat3903 = -1.0F;
			}
		}
		aFloat3901 = Math.min(1.0F, Math.max(aFloat3901, 0.0F));
	}

	public float method4775() {
		float f = aFloat3901;
		for (Class374 class374_6_ = aClass374_3900; null != class374_6_; class374_6_ = class374_6_.method4772(-1688246020))
			f *= class374_6_.method4770((byte) 17);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	public float method4776(byte i) {
		float f = 1.0F;
		for (Class374 class374_7_ = this; null != class374_7_; class374_7_ = class374_7_.method4772(1317311555))
			f *= class374_7_.method4768(1657719290);
		return f;
	}

	static boolean method4777(int i, byte i_8_) {
		return i == 57 || i == 58 || 1007 == i || i == 25 || i == 30;
	}

	public static IncomingPacket[] method4778(int i) {
		return (new IncomingPacket[] { IncomingPacket.aClass422_4715, IncomingPacket.aClass422_4592, IncomingPacket.aClass422_4593, IncomingPacket.ICOMPONENT_SPRITE, IncomingPacket.aClass422_4756, IncomingPacket.SKILLS, IncomingPacket.aClass422_4639, IncomingPacket.aClass422_4598, IncomingPacket.SET_INTERFACE, IncomingPacket.aClass422_4600, IncomingPacket.aClass422_4720, IncomingPacket.SOUND_EFFECT, IncomingPacket.aClass422_4772, IncomingPacket.aClass422_4604, IncomingPacket.UPDATE_ITEM_CONTAINER, IncomingPacket.aClass422_4765, IncomingPacket.aClass422_4607, IncomingPacket.aClass422_4608,
				IncomingPacket.aClass422_4609, IncomingPacket.aClass422_4610, IncomingPacket.aClass422_4732, IncomingPacket.aClass422_4647, IncomingPacket.aClass422_4613, IncomingPacket.aClass422_4614, IncomingPacket.aClass422_4615, IncomingPacket.aClass422_4677, IncomingPacket.ADD_GROUND_ITEM, IncomingPacket.CAMERA_SHAKE, IncomingPacket.aClass422_4619, IncomingPacket.RUN_ENERGY, IncomingPacket.aClass422_4621, IncomingPacket.aClass422_4622, IncomingPacket.PING, IncomingPacket.aClass422_4624, IncomingPacket.ICOMPONENT_TEXT, IncomingPacket.PUBLIC_CHAT, IncomingPacket.aClass422_4627,
				IncomingPacket.aClass422_4628, IncomingPacket.aClass422_4629, IncomingPacket.NPC_UPDATE, IncomingPacket.STOP_CAMERA_SHAKE, IncomingPacket.CS_VAR_1, IncomingPacket.aClass422_4785, IncomingPacket.GAME_MESSAGE, IncomingPacket.aClass422_4635, IncomingPacket.CLIENT_SCRIPT, IncomingPacket.aClass422_4637, IncomingPacket.aClass422_4764, IncomingPacket.CLOSE_INTERFACE, IncomingPacket.aClass422_4595, IncomingPacket.aClass422_4641, IncomingPacket.aClass422_4656, IncomingPacket.aClass422_4643, IncomingPacket.aClass422_4761, IncomingPacket.PLAYER_UPDATE, IncomingPacket.aClass422_4646,
				IncomingPacket.CS_VAR_STRING_1, IncomingPacket.CS_VAR_STRING_2, IncomingPacket.aClass422_4597, IncomingPacket.aClass422_4596, IncomingPacket.aClass422_4651, IncomingPacket.PLAYER_UNDER_NPC_PRIORITY, IncomingPacket.aClass422_4779, IncomingPacket.aClass422_4650, IncomingPacket.aClass422_4655, IncomingPacket.aClass422_4755, IncomingPacket.MAP_REGION, IncomingPacket.aClass422_4658, IncomingPacket.aClass422_4659, IncomingPacket.aClass422_4660, IncomingPacket.aClass422_4648, IncomingPacket.aClass422_4712, IncomingPacket.aClass422_4663, IncomingPacket.ROOT_INTERFACE, IncomingPacket.aClass422_4665,
				IncomingPacket.aClass422_4666, IncomingPacket.aClass422_4667, IncomingPacket.CHUNK_SCENE, IncomingPacket.aClass422_4669, IncomingPacket.aClass422_4670, IncomingPacket.aClass422_4671, IncomingPacket.aClass422_4672, IncomingPacket.aClass422_4752, IncomingPacket.aClass422_4640, IncomingPacket.PLAYER_OPTION, IncomingPacket.aClass422_4676, IncomingPacket.aClass422_4692, IncomingPacket.CS_VAR_2, IncomingPacket.aClass422_4679, IncomingPacket.aClass422_4636, IncomingPacket.aClass422_4681, IncomingPacket.OBJECT_RELATED_MAYBE, IncomingPacket.ICOMPONENT_ANIMATION, IncomingPacket.aClass422_4684,
				IncomingPacket.aClass422_4685, IncomingPacket.aClass422_4745, IncomingPacket.REMOVE_GROUND_ITEM, IncomingPacket.aClass422_4688, IncomingPacket.aClass422_4689, IncomingPacket.aClass422_4690, IncomingPacket.aClass422_4691, IncomingPacket.aClass422_4654, IncomingPacket.aClass422_4759, IncomingPacket.aClass422_4694, IncomingPacket.NPC_HEAD_ON_ICOMPONENT, IncomingPacket.aClass422_4696, IncomingPacket.aClass422_4697, IncomingPacket.aClass422_4698, IncomingPacket.aClass422_4699, IncomingPacket.ITEM_ON_ICOMPONENT, IncomingPacket.aClass422_4642, IncomingPacket.MINIMAP_FLAG, IncomingPacket.aClass422_4703,
				IncomingPacket.aClass422_4771, IncomingPacket.aClass422_4705, IncomingPacket.aClass422_4718, IncomingPacket.aClass422_4707, IncomingPacket.aClass422_4708, IncomingPacket.aClass422_4709, IncomingPacket.aClass422_4710, IncomingPacket.aClass422_4711, IncomingPacket.aClass422_4735, IncomingPacket.aClass422_4713, IncomingPacket.aClass422_4714, IncomingPacket.INTERFACE_SETTINGS, IncomingPacket.MOVE_INTERFACE, IncomingPacket.aClass422_4717, IncomingPacket.aClass422_4763, IncomingPacket.VARP_2, IncomingPacket.HINT_ICON, IncomingPacket.aClass422_4721, IncomingPacket.GRAND_EXCHANGE,
				IncomingPacket.aClass422_4644, IncomingPacket.aClass422_4724, IncomingPacket.HIDE_ICOMPONENT, IncomingPacket.aClass422_4726, IncomingPacket.aClass422_4727, IncomingPacket.aClass422_4728, IncomingPacket.aClass422_4704, IncomingPacket.aClass422_4730, IncomingPacket.ITEM_CONTAINER, IncomingPacket.aClass422_4638, IncomingPacket.VARP_1, IncomingPacket.aClass422_4773, IncomingPacket.aClass422_4751, IncomingPacket.aClass422_4736, IncomingPacket.aClass422_4737, IncomingPacket.RESET_NIS_VARS, IncomingPacket.aClass422_4739, IncomingPacket.WORLD_LIST, IncomingPacket.aClass422_4729,
				IncomingPacket.aClass422_4742, IncomingPacket.aClass422_4743, IncomingPacket.aClass422_4744, IncomingPacket.aClass422_4778, IncomingPacket.aClass422_4746, IncomingPacket.aClass422_4591, IncomingPacket.aClass422_4661, IncomingPacket.aClass422_4749, IncomingPacket.aClass422_4781, IncomingPacket.PLAYER_HEAD_ON_ICOMPONENT, IncomingPacket.aClass422_4626, IncomingPacket.aClass422_4753, IncomingPacket.aClass422_4754, IncomingPacket.aClass422_4612, IncomingPacket.aClass422_4594, IncomingPacket.aClass422_4757, IncomingPacket.aClass422_4725, IncomingPacket.aClass422_4653, IncomingPacket.aClass422_4760,
				IncomingPacket.aClass422_4701, IncomingPacket.ICOMPONENT_MODEL, IncomingPacket.aClass422_4603, IncomingPacket.DYNAMIC_MAP_SCENE, IncomingPacket.aClass422_4758, IncomingPacket.aClass422_4748, IncomingPacket.PING_2, IncomingPacket.aClass422_4768, IncomingPacket.aClass422_4611, IncomingPacket.aClass422_4770, IncomingPacket.PLAYER_LOOK, IncomingPacket.aClass422_4620, IncomingPacket.aClass422_4673, IncomingPacket.aClass422_4774, IncomingPacket.CLIENT_EDIT_CHECK, IncomingPacket.aClass422_4776, IncomingPacket.aClass422_4777, IncomingPacket.aClass422_4633, IncomingPacket.aClass422_4723,
				IncomingPacket.aClass422_4780, IncomingPacket.aClass422_4769, IncomingPacket.aClass422_4782, IncomingPacket.aClass422_4662 });
	}

	public static boolean method4779(int i, int i_9_) {
		return ((i >= Class606.aClass606_7892.anInt7878 * -723459231 && i <= Class606.aClass606_7876.anInt7878 * -723459231) || Class606.aClass606_7873.anInt7878 * -723459231 == i);
	}

	static final void method4780(Class668 class668, int i) {
		class668.anInt8542 -= 1534748737;
	}

	static final void method4781(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class248 class248 = ((Class248) Class398_Sub1.aClass34_Sub8_10110.method70(i_10_, (byte) 12));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class248.anInt2481 * 400801363;
	}

	static final void method4782(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class426.method5129(client.anInt11101 * -708374433, 1603352511) ? 1 : 0);
	}

	static final void method4783(Class668 class668, int i) {
		if (client.anInt11101 * -708374433 == 1) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4500, client.aClass106_11218.aClass15_1258, 1718207817);
			client.aClass106_11218.method1409(class536_sub23, 743027212);
		}
	}

	static final void method4784(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_11_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_12_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_11_ * i_12_;
	}
}

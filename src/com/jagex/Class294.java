/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class294 {
	static Class294 aClass294_3267 = new Class294(0, 4);
	static Class294 aClass294_3268 = new Class294(1, 5);
	static Class294 aClass294_3269 = new Class294(2, 6);
	int anInt3270;
	public int anInt3271;
	static Class147[] aClass147Array3272;

	public static Class294 method5293(int i) {
		Class294[] class294s = Class255.method4706(1418416463);
		for (int i_0_ = 0; i_0_ < class294s.length; i_0_++) {
			Class294 class294 = class294s[i_0_];
			if (i == class294.anInt3270 * -1242618333)
				return class294;
		}
		return null;
	}

	static Class294[] method5294() {
		return (new Class294[] { aClass294_3269, aClass294_3268, aClass294_3267 });
	}

	Class294(int i, int i_1_) {
		anInt3270 = i * -1124222581;
		anInt3271 = 744542721 * i_1_;
	}

	public static Class294 method5295(int i) {
		Class294[] class294s = Class255.method4706(-3184444);
		for (int i_2_ = 0; i_2_ < class294s.length; i_2_++) {
			Class294 class294 = class294s[i_2_];
			if (i == class294.anInt3270 * -1242618333)
				return class294;
		}
		return null;
	}

	public static IncomingPacket[] method5296(int i) {
		return (new IncomingPacket[] { IncomingPacket.aClass422_4763, IncomingPacket.aClass422_4647, IncomingPacket.aClass422_4609, IncomingPacket.aClass422_4610, IncomingPacket.aClass422_4611, IncomingPacket.UNIDENTIFIED_SENDS_ON_LOGIN, IncomingPacket.aClass422_4776, IncomingPacket.aClass422_4637, IncomingPacket.SET_INTERFACE, IncomingPacket.aClass422_4616, IncomingPacket.aClass422_4784, IncomingPacket.SOUND_EFFECT, IncomingPacket.aClass422_4619, IncomingPacket.aClass422_4693, IncomingPacket.SEND_ITEMS, IncomingPacket.aClass422_4622, IncomingPacket.aClass422_4623, IncomingPacket.aClass422_4640,
				IncomingPacket.aClass422_4625, IncomingPacket.aClass422_4626, IncomingPacket.aClass422_4627, IncomingPacket.aClass422_4628, IncomingPacket.aClass422_4629, IncomingPacket.aClass422_4630, IncomingPacket.aClass422_4631, IncomingPacket.aClass422_4632, IncomingPacket.ADD_GROUND_ITEM, IncomingPacket.aClass422_4634, IncomingPacket.aClass422_4635, IncomingPacket.aClass422_4700, IncomingPacket.aClass422_4691, IncomingPacket.aClass422_4638, IncomingPacket.PING, IncomingPacket.aClass422_4661, IncomingPacket.aClass422_4641, IncomingPacket.aClass422_4799, IncomingPacket.aClass422_4643,
				IncomingPacket.aClass422_4725, IncomingPacket.aClass422_4645, IncomingPacket.NPC_UPDATE, IncomingPacket.aClass422_4769, IncomingPacket.CS_VAR_1, IncomingPacket.aClass422_4649, IncomingPacket.GAME_MESSAGE, IncomingPacket.aClass422_4651, IncomingPacket.CLIENT_SCRIPT, IncomingPacket.aClass422_4653, IncomingPacket.aClass422_4654, IncomingPacket.aClass422_4655, IncomingPacket.aClass422_4656, IncomingPacket.aClass422_4765, IncomingPacket.aClass422_4675, IncomingPacket.aClass422_4615, IncomingPacket.aClass422_4660, IncomingPacket.PLAYER_UPDATE, IncomingPacket.aClass422_4662,
				IncomingPacket.CS_VAR_STRING_1, IncomingPacket.CS_VAR_STRING_2, IncomingPacket.aClass422_4665, IncomingPacket.aClass422_4666, IncomingPacket.aClass422_4670, IncomingPacket.aClass422_4668, IncomingPacket.aClass422_4767, IncomingPacket.aClass422_4723, IncomingPacket.aClass422_4671, IncomingPacket.aClass422_4702, IncomingPacket.aClass422_4673, IncomingPacket.aClass422_4705, IncomingPacket.aClass422_4614, IncomingPacket.aClass422_4676, IncomingPacket.aClass422_4677, IncomingPacket.aClass422_4678, IncomingPacket.aClass422_4679, IncomingPacket.aClass422_4687, IncomingPacket.aClass422_4681,
				IncomingPacket.aClass422_4682, IncomingPacket.aClass422_4683, IncomingPacket.CHUNK_SCENE, IncomingPacket.aClass422_4685, IncomingPacket.aClass422_4686, IncomingPacket.aClass422_4652, IncomingPacket.aClass422_4688, IncomingPacket.aClass422_4689, IncomingPacket.aClass422_4690, IncomingPacket.PLAYER_OPTION, IncomingPacket.aClass422_4692, IncomingPacket.aClass422_4642, IncomingPacket.CS_VAR_2, IncomingPacket.aClass422_4695, IncomingPacket.aClass422_4680, IncomingPacket.aClass422_4707, IncomingPacket.OBJECT_RELATED_MAYBE, IncomingPacket.aClass422_4699, IncomingPacket.aClass422_4657,
				IncomingPacket.aClass422_4701, IncomingPacket.aClass422_4800, IncomingPacket.REMOVE_GROUND_ITEM, IncomingPacket.aClass422_4704, IncomingPacket.aClass422_4758, IncomingPacket.aClass422_4719, IncomingPacket.aClass422_4658, IncomingPacket.aClass422_4708, IncomingPacket.aClass422_4709, IncomingPacket.aClass422_4794, IncomingPacket.aClass422_4711, IncomingPacket.aClass422_4712, IncomingPacket.aClass422_4713, IncomingPacket.aClass422_4714, IncomingPacket.aClass422_4715, IncomingPacket.aClass422_4716, IncomingPacket.aClass422_4717, IncomingPacket.MINIMAP_FLAG, IncomingPacket.aClass422_4739,
				IncomingPacket.aClass422_4720, IncomingPacket.aClass422_4608, IncomingPacket.aClass422_4730, IncomingPacket.aClass422_4737, IncomingPacket.aClass422_4724, IncomingPacket.aClass422_4706, IncomingPacket.aClass422_4726, IncomingPacket.aClass422_4612, IncomingPacket.aClass422_4743, IncomingPacket.aClass422_4731, IncomingPacket.aClass422_4759, IncomingPacket.INTERFACE_SETTINGS, IncomingPacket.aClass422_4618, IncomingPacket.aClass422_4733, IncomingPacket.aClass422_4672, IncomingPacket.VARP_2, IncomingPacket.HINT_ICON, IncomingPacket.aClass422_4696, IncomingPacket.aClass422_4738,
				IncomingPacket.aClass422_4729, IncomingPacket.aClass422_4740, IncomingPacket.aClass422_4741, IncomingPacket.aClass422_4742, IncomingPacket.aClass422_4796, IncomingPacket.aClass422_4744, IncomingPacket.aClass422_4745, IncomingPacket.aClass422_4746, IncomingPacket.aClass422_4747, IncomingPacket.aClass422_4748, IncomingPacket.VARP_1, IncomingPacket.aClass422_4750, IncomingPacket.aClass422_4751, IncomingPacket.aClass422_4752, IncomingPacket.aClass422_4753, IncomingPacket.aClass422_4754, IncomingPacket.aClass422_4755, IncomingPacket.WORLD_LIST, IncomingPacket.aClass422_4757,
				IncomingPacket.aClass422_4617, IncomingPacket.aClass422_4694, IncomingPacket.aClass422_4760, IncomingPacket.aClass422_4761, IncomingPacket.aClass422_4762, IncomingPacket.aClass422_4727, IncomingPacket.aClass422_4764, IncomingPacket.aClass422_4734, IncomingPacket.aClass422_4766, IncomingPacket.aClass422_4697, IncomingPacket.aClass422_4768, IncomingPacket.aClass422_4732, IncomingPacket.aClass422_4770, IncomingPacket.aClass422_4771, IncomingPacket.aClass422_4772, IncomingPacket.aClass422_4613, IncomingPacket.aClass422_4774, IncomingPacket.aClass422_4775, IncomingPacket.aClass422_4667,
				IncomingPacket.aClass422_4777, IncomingPacket.aClass422_4778, IncomingPacket.aClass422_4779, IncomingPacket.aClass422_4780, IncomingPacket.aClass422_4781, IncomingPacket.aClass422_4782, IncomingPacket.PING_2, IncomingPacket.aClass422_4795, IncomingPacket.aClass422_4785, IncomingPacket.aClass422_4710, IncomingPacket.aClass422_4659, IncomingPacket.aClass422_4788, IncomingPacket.aClass422_4789, IncomingPacket.aClass422_4790, IncomingPacket.CLIENT_EDIT_CHECK, IncomingPacket.aClass422_4792, IncomingPacket.aClass422_4793, IncomingPacket.aClass422_4728, IncomingPacket.aClass422_4620,
				IncomingPacket.aClass422_4607, IncomingPacket.aClass422_4797, IncomingPacket.aClass422_4798, IncomingPacket.aClass422_4722 });
	}

	static final void method5297(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass492ArrayArray11272[i_4_][i_3_].method7986(1992815415);
	}

	public static String method5298(byte[] is, int i) {
		return Class503.method8213(is, 0, is.length, 1711156690);
	}

	static final void method5299(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class527_Sub35.method16379(class243, class240, class665, -1908418469);
	}
}

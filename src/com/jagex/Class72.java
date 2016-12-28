/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

import com.RS3Applet;

public class Class72 {
	static BigInteger LOGIN_PUBLIC_MODULUS;
	static BigInteger LOGIN_PUBLIC_EXPONENT = new BigInteger("10001", 16);
	public static BigInteger GRAB_PUBLIC_EXPONENT;
	public static BigInteger GRAB_PUBLIC_MODULUS;
	static IComponentDefinitions aClass251_801;

	static {
		LOGIN_PUBLIC_MODULUS = (new BigInteger("826245b9420b77bf7e7558ad119b4f1f64067e86a7588468ad926b4aecd56a8f48220c5560106598134876e5b0293057a7c71a737b95a61263560e0e9b1a4cfdd8f4b9d458bd449674420eb6152c6cbbd62caf2d180473c2d2b458dcf4cefb20a826fc55920c176773e5fd26d472c82aae7708d8be8b0f3362fbddacb223f95d", 16));
		GRAB_PUBLIC_EXPONENT = new BigInteger("10001", 16);
		GRAB_PUBLIC_MODULUS = (new BigInteger("8287102833de9b4831f7800153cff1a64e05778cb3920e93cd99176e356f4d7cc2df510be174fde0c9c22b9461f41f5ec319d35a6f73f76798cf91b9a4c51ce1b1fa1c43cd145290db89c47c51bd67e498b1d1f318bbdd1cd4b3fbbde65d828a225565a9a27c9f40d5d3cfe6f9b2323f7359cc426b40668e5505682650e97384d59b189b355f8f4bc038cdcf4d7523b1c98b49184ac08703a00cf60ad1c23f38bd485b6191706ede35a91aa22f7ca0375cd5577466440fa7e6201b7c07d182553a77ee1c7806223a5528ec12079380ef0931204992b7538685c2cc95bcbc631020cc72715e721d034304d381183e0fdf59fc9c843c863ef4f5874311d749a87313deefce93c3f30f16a536988662afcdd92441049f81f646e4d1507cc693cfb4b3eb0416a6f278d6407f682304718cbd5a395a8e4b812c66e34db1d15b13597f52ed42671be388b9215968d2ba01bc49c97c4b2ecf216d371110c181273f4d0e386dd37ab53faeaaac2bf8b7c73314442fff07c1de0e0441f1a0ac1184758159faceb3e2ffbf85ee03f9bf5faf7ad19b9e499e7dff91c5a6cacfe44d8cd3410d45bb94b2d2e50b6f20f80091390893844fe64f760394398da7ad72732e3386c83f08133fffd6588112eccad4b263633fddcaecf4a9070f2411cfcca12b9631be85174c8d1ed0b3fd86684c26b13df15735e3072ded14e50f99e3e1d8ab853ead", 16));
		if (RS3Applet.RSPS) {
			LOGIN_PUBLIC_MODULUS = GRAB_PUBLIC_MODULUS = new BigInteger("aea878beb679fd5b152998e3a10f13e3edc739b3541f837a881f5f32cbdfdb3d79b90b4ce4821e05488e26f5420b1975c0d7349244ab47e12e13d4347d205d26b620d60ba49177dd6dc4468a91f5d4137563c422756c7c31c0d8bddee5517fe7209d29158462642803e6897c49bbcc3f5cff81552c338194ce271caa901d750ec8df4490fbbb93bcc390c28f740add5025004ce19a88783c9d418ab78bc6bd90226e60edee81a5153adf03da277803a7b3790161c68cbfd4efb39a9348e289f77c39147a175ddf3f53c9225bc995bb0d675213a4a0281df3e1be4bfba4d439dcc7671abc43b7d9ed2d98d98677144a0d3492fde64cf4550a7c7040b85bde373c100e45ad20abded61d59b5ba1e3afe542a14aa922b7a576d3fcf0365ff3bcf71c299be9a81aabaa3c121c0da9d46d90ad24d74a90f63d86af1537cedfbc85b052a2623ff0f3f496b9a0fa21e752a2f76a951f6b46c6ba9a3631043ef8685f9e1507d840f661d9216f7660e7b8f44f6a93e3a0793206e99d488ba3857e5bc8b754d63e35d2129408fed915d7759968c7dc202c4472f0a2d81e90b832f7d9caa841867decd127b64f0d33247e1d2d333eb72cae6a8d497841a494ec46d43468f5f4e6d37e6db98315bf324814a8795e224863f77e951b11301501d195accb3440c580e9b81ebec96c5f1d5260892c206155708bb5acc9186027c40c1317ce242df", 16);
		}
	}

	Class72() throws Throwable {
		throw new Error();
	}

	public static int method1124(int i, int i_0_) {
		int i_1_ = i >>> 1;
		i_1_ |= i_1_ >>> 1;
		i_1_ |= i_1_ >>> 2;
		i_1_ |= i_1_ >>> 4;
		i_1_ |= i_1_ >>> 8;
		i_1_ |= i_1_ >>> 16;
		return i & (i_1_ ^ 0xffffffff);
	}

	static final void method1125(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class484.method5845(class251, class234, class668, -213751254);
	}

	public static GameMode method1126(int i, byte i_2_) {
		GameMode[] class670s = Class500.method6029((byte) 0);
		for (int i_3_ = 0; i_3_ < class670s.length; i_3_++) {
			GameMode class670 = class670s[i_3_];
			if (i == 273023065 * class670.anInt8567)
				return class670;
		}
		return null;
	}
}

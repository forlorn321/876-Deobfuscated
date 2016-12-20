/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

import com.RS3Applet;

public class Class52 {
	static BigInteger LOGIN_PUBLIC_EXPONENT = new BigInteger("10001", 16);
	static BigInteger LOGIN_PUBLIC_MODULUS = (new BigInteger("826245b9420b77bf7e7558ad119b4f1f64067e86a7588468ad926b4aecd56a8f48220c5560106598134876e5b0293057a7c71a737b95a61263560e0e9b1a4cfdd8f4b9d458bd449674420eb6152c6cbbd62caf2d180473c2d2b458dcf4cefb20a826fc55920c176773e5fd26d472c82aae7708d8be8b0f3362fbddacb223f95d", 16));
	public static BigInteger GRAB_PUBLIC_EXPONENT = new BigInteger("10001", 16);
	public static BigInteger GRAB_PUBLIC_MODULUS = (new BigInteger(
			"8287102833de9b4831f7800153cff1a64e05778cb3920e93cd99176e356f4d7cc2df510be174fde0c9c22b9461f41f5ec319d35a6f73f76798cf91b9a4c51ce1b1fa1c43cd145290db89c47c51bd67e498b1d1f318bbdd1cd4b3fbbde65d828a225565a9a27c9f40d5d3cfe6f9b2323f7359cc426b40668e5505682650e97384d59b189b355f8f4bc038cdcf4d7523b1c98b49184ac08703a00cf60ad1c23f38bd485b6191706ede35a91aa22f7ca0375cd5577466440fa7e6201b7c07d182553a77ee1c7806223a5528ec12079380ef0931204992b7538685c2cc95bcbc631020cc72715e721d034304d381183e0fdf59fc9c843c863ef4f5874311d749a87313deefce93c3f30f16a536988662afcdd92441049f81f646e4d1507cc693cfb4b3eb0416a6f278d6407f682304718cbd5a395a8e4b812c66e34db1d15b13597f52ed42671be388b9215968d2ba01bc49c97c4b2ecf216d371110c181273f4d0e386dd37ab53faeaaac2bf8b7c73314442fff07c1de0e0441f1a0ac1184758159faceb3e2ffbf85ee03f9bf5faf7ad19b9e499e7dff91c5a6cacfe44d8cd3410d45bb94b2d2e50b6f20f80091390893844fe64f760394398da7ad72732e3386c83f08133fffd6588112eccad4b263633fddcaecf4a9070f2411cfcca12b9631be85174c8d1ed0b3fd86684c26b13df15735e3072ded14e50f99e3e1d8ab853ead",
			16));
	
	static {
		GRAB_PUBLIC_EXPONENT = new BigInteger("10001", 16);
		GRAB_PUBLIC_MODULUS = (new BigInteger("d5a82d38a6ad583bff491480f47f5f5e9743238ab28157e4285643a5ea21404296f520334cbe9d502fe6c126de33820aa0d288b37b9177a28fde4f53f815bc8f37963a28040dfbe7f56f8ee64d7ffe7e2f3b4654a126b786dcd52ed4afdb8bc0319bc5f30bf32a560aa16b2d6e49731b589345452617795533719807fc48df5de03bd20378e053b2b7a0a39016f49c753b154698ef4f7bed1225837ecd079cca7086e335ff2264cc3ca0f87e81d87fa2fe683aa1fe23febf728dd812e445f1516ed6a943aa5dcabbac7487be0eaf8a964d2fb8d3410990353b090dc365de8d76b751dbfa852cc54837bcfc37b9219b49a6a8cbe3bfd913d634086669b99802825f4df060ccfc719903c1f1110bd256be38d2acad1fe9e9e70f125f2b8f6e3a6227408fa69dbdd62ed81e9b37346e05d74ed6fbc93a552a183a996c07cb7577e4b5ba419b10bc9d114913296db11525e470cef85180ec73351557866e2f765460cdc485c64fad6ee4b4689256bd98e794dadc6fa055dca72b2a61e83cbba07cd0afc63ed84d097e0b9a3d9a48c0547a9c19fd20f9bc927b3d78b597cce3fcbe67e6cbde545ce647b5e649c81070ebb7c3689cfc838a0e042838e2761ed72f1abe89c59744e0acc00d4db3f2f08763c869ba848f0583bc95844c5f6b1a5b928a062b725033844a57ee642bbe1724fd8629279f6239570940aaff8c0b9a1538da81", 16));
		new BigInteger("10001", 16);
		new BigInteger("89e9276bcb118875146a6e0bb384e156da667fa359779e065c720a27eec6a3bc8cffa7ee5192fd34cfaaa63c8ebbe6a68339efb17a68e5d4bd45c67d2ca6efdb", 16);
		if (RS3Applet.RSPS) {
			LOGIN_PUBLIC_MODULUS = GRAB_PUBLIC_MODULUS = new BigInteger("aea878beb679fd5b152998e3a10f13e3edc739b3541f837a881f5f32cbdfdb3d79b90b4ce4821e05488e26f5420b1975c0d7349244ab47e12e13d4347d205d26b620d60ba49177dd6dc4468a91f5d4137563c422756c7c31c0d8bddee5517fe7209d29158462642803e6897c49bbcc3f5cff81552c338194ce271caa901d750ec8df4490fbbb93bcc390c28f740add5025004ce19a88783c9d418ab78bc6bd90226e60edee81a5153adf03da277803a7b3790161c68cbfd4efb39a9348e289f77c39147a175ddf3f53c9225bc995bb0d675213a4a0281df3e1be4bfba4d439dcc7671abc43b7d9ed2d98d98677144a0d3492fde64cf4550a7c7040b85bde373c100e45ad20abded61d59b5ba1e3afe542a14aa922b7a576d3fcf0365ff3bcf71c299be9a81aabaa3c121c0da9d46d90ad24d74a90f63d86af1537cedfbc85b052a2623ff0f3f496b9a0fa21e752a2f76a951f6b46c6ba9a3631043ef8685f9e1507d840f661d9216f7660e7b8f44f6a93e3a0793206e99d488ba3857e5bc8b754d63e35d2129408fed915d7759968c7dc202c4472f0a2d81e90b832f7d9caa841867decd127b64f0d33247e1d2d333eb72cae6a8d497841a494ec46d43468f5f4e6d37e6db98315bf324814a8795e224863f77e951b11301501d195accb3440c580e9b81ebec96c5f1d5260892c206155708bb5acc9186027c40c1317ce242df", 16);
		}
	}

	Class52() throws Throwable {
		throw new Error();
	}

	static final void method1285(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -2134068563);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class324.method5728(class243, class240, class665, (byte) -73);
	}

	static final void method1286(Class665 class665, int i) {
		if (client.aString11010 != null)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = client.aString11010;
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}

	static final void method1287(Class665 class665, short i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_2_ = i_1_ >> 16;
		if (null == Class183.aClass240Array2100[i_2_])
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else {
			String string = (Class183.aClass240Array2100[i_2_].aClass243Array2392[i_1_].aString2667);
			if (null == string)
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			else
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
		}
	}

	public static void method1288(int i) {
		if (null != Class649.aClass358_8371)
			Class649.aClass358_8371.method6272((byte) 107);
	}

	static final void method1289(Class665 class665, byte i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_3_ != -1) {
			int i_4_ = i_3_ >> 14 & 0x3fff;
			int i_5_ = i_3_ & 0x3fff;
			Class592 class592 = client.aClass509_11072.method8283((short) 20627);
			i_4_ -= class592.anInt7798 * 153371143;
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ >= client.aClass509_11072.method8284((byte) 13))
				i_4_ = client.aClass509_11072.method8284((byte) 124);
			i_5_ -= -2029646807 * class592.anInt7799;
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ >= client.aClass509_11072.method8285(1175395790))
				i_5_ = client.aClass509_11072.method8285(-1047661470);
			Class400.anInt4141 = 228665961 * (256 + (i_4_ << 9));
			Class452.anInt4964 = -1432081761 * (256 + (i_5_ << 9));
		} else {
			Class400.anInt4141 = -228665961;
			Class452.anInt4964 = 1432081761;
		}
	}
}

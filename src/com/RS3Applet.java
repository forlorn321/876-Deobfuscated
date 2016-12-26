package com;

import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFrame;

import com.jagex.IncomingPacket;
import com.jagex.ChunkSceneSubPackets;

public class RS3Applet extends Applet implements AppletStub {

	/**
	 * An generated serial UID.
	 */
	private static final long serialVersionUID = 1670498001014004354L;

	/**
	 * load url
	 */
	private static final String LOAD_URL = "http://world35.runescape.com/,j0";

	/**
	 * library path
	 */
	private static final String LIB_DIR = "./library/";
	
	public static final ArrayList<IncomingPacket> IDENTIFIED = new ArrayList<IncomingPacket>();
	public static final ArrayList<ChunkSceneSubPackets> IDENTIFIED_SUB = new ArrayList<ChunkSceneSubPackets>();
	
	static {
		IDENTIFIED.add(IncomingPacket.PING); // Lobby ping? idk
		IDENTIFIED.add(IncomingPacket.PING_2); //implemented
		IDENTIFIED.add(IncomingPacket.aClass422_4672); //lobby refresh
		IDENTIFIED.add(IncomingPacket.VARP_1); //implemented
		IDENTIFIED.add(IncomingPacket.VARP_2); //implementedc
		IDENTIFIED.add(IncomingPacket.CS_VAR_1); //implemented
		IDENTIFIED.add(IncomingPacket.CS_VAR_2); //implemented
		IDENTIFIED.add(IncomingPacket.CS_VAR_STRING_1); //implemented
		IDENTIFIED.add(IncomingPacket.CS_VAR_STRING_2); //implemented
		IDENTIFIED.add(IncomingPacket.SET_INTERFACE); //implemented
		IDENTIFIED.add(IncomingPacket.CLIENT_SCRIPT); //implemented
		IDENTIFIED.add(IncomingPacket.WORLD_LIST); //implemented
		IDENTIFIED.add(IncomingPacket.CLIENT_EDIT_CHECK); //implemented
		IDENTIFIED.add(IncomingPacket.INTERFACE_SETTINGS); //implemented
		IDENTIFIED.add(IncomingPacket.ROOT_INTERFACE); //implemented
		IDENTIFIED.add(IncomingPacket.RESET_NIS_VARS); //implemented
		IDENTIFIED.add(IncomingPacket.SKILLS); //implemented
		IDENTIFIED.add(IncomingPacket.MAP_REGION); //implemented
		IDENTIFIED.add(IncomingPacket.SEND_ITEMS); //implemented
		IDENTIFIED.add(IncomingPacket.DYNAMIC_MAP_SCENE); //implemented
		
		IDENTIFIED.add(IncomingPacket.OBJECT_RELATED_MAYBE);
		IDENTIFIED.add(IncomingPacket.aClass422_4704); //spamming up my console and commenting it out does nothing noticeable
		
		IDENTIFIED.add(IncomingPacket.aClass422_4644); //sent when joining a dung party yet commenting it out doesn't have any immediately noticable effects
		IDENTIFIED.add(IncomingPacket.aClass422_4676); //sent when joining a dung party seems to change the color of the outline on some of the buttons
		
		IDENTIFIED.add(IncomingPacket.aClass422_4718); //varpbits
		IDENTIFIED.add(IncomingPacket.aClass422_4759);
		
		IDENTIFIED.add(IncomingPacket.ADD_GROUND_ITEM);
		IDENTIFIED.add(IncomingPacket.REMOVE_GROUND_ITEM);
		IDENTIFIED.add(IncomingPacket.ICOMPONENT_TEXT);
		IDENTIFIED.add(IncomingPacket.HIDE_ICOMPONENT);
		IDENTIFIED.add(IncomingPacket.CHUNK_SCENE);
		IDENTIFIED.add(IncomingPacket.NPC_UPDATE);
		IDENTIFIED.add(IncomingPacket.PLAYER_UPDATE);
		IDENTIFIED.add(IncomingPacket.GAME_MESSAGE);
		IDENTIFIED.add(IncomingPacket.MINIMAP_FLAG);
		IDENTIFIED.add(IncomingPacket.PLAYER_OPTION);
		IDENTIFIED.add(IncomingPacket.HINT_ICON);
		IDENTIFIED.add(IncomingPacket.SOUND_EFFECT);
		IDENTIFIED.add(IncomingPacket.NPC_HEAD_ON_ICOMPONENT);
		IDENTIFIED.add(IncomingPacket.PLAYER_HEAD_ON_ICOMPONENT);
		IDENTIFIED.add(IncomingPacket.RUN_ENERGY);
		IDENTIFIED.add(IncomingPacket.CLOSE_INTERFACE);
		IDENTIFIED.add(IncomingPacket.ITEM_ON_ICOMPONENT);
		IDENTIFIED.add(IncomingPacket.ICOMPONENT_SPRITE);
		
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.ADD_GROUND_ITEM);
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.REMOVE_GROUND_ITEM);
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.PROJECTILE);
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.REMOVE_GAME_OBJECT);
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.ADD_GAME_OBJECT);
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.GRAPHICS_ON_TILE);
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.GROUND_GRAPHIC_RELATED);
		IDENTIFIED_SUB.add(ChunkSceneSubPackets.aClass409_4317); //sent during goblin raids for something
	}

	/**
	 * Connecting to Rs or a Rsps
	 */
	public static boolean RSPS = false;

	/**
	 * Chooses ip based on if Rs or Rsps
	 */
	public static String Host = RSPS ? "127.0.0.1" : "world35.runescape.com";

	/**
	 * Whether or not to dump info such as vars
	 */
	public static boolean DUMP = true;

	/**
	 * The parameters of the client.
	 */
	private Properties map = new Properties();

	/**
	 * The current frame of the client application.
	 */
	public JFrame clientFrame = null;

	/**
	 * The main entry point of the current application.
	 * 
	 * @param args
	 *            The command line arguments.
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public static void main(String... args) throws MalformedURLException, IOException {
		RS3Applet rs3applet = new RS3Applet();
		rs3applet.prepareDeobForRun();
		rs3applet.openFrame();
		rs3applet.startClient();
		rs3applet.clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Starts the actual client.
	 */
	private void startClient() {
		try {
			Class<?> client_class = Class.forName("com.jagex.client");

			Object v_client = client_class.getConstructor().newInstance();
			client_class.getSuperclass().getMethod("supplyApplet", Applet.class).invoke(v_client, this);
			client_class.getMethod("init").invoke(v_client);
			client_class.getMethod("start").invoke(v_client);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Opens the actual frame application.
	 */
	private void openFrame() {
		clientFrame = new JFrame("RS");
		clientFrame.add(this);
		clientFrame.setVisible(true);
		clientFrame.setSize(1000, 800);
	}

	/**
	 * Reads the parameters text file, and stores the parameters.
	 * 
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	private void prepareDeobForRun() throws MalformedURLException, IOException {
		if (!RSPS) {
			String packUrl = LOAD_URL;// getPackUrl();
			if (packUrl == "")
				throw new RuntimeException("Invalid Pack URL");
			Host = packUrl.substring(packUrl.indexOf("http://") + "http://".length(), packUrl.indexOf("/,"));
			String gamePackUrl = "";
			for (String line : fetchPageDetails(packUrl)) {
				if (line.contains("<param name=")) {
					String key = line.split("<param name=\"")[1].split("\" ")[0];
					String value = line.split("value=\"")[1].split("\">'")[0];
					value = value.replaceAll("\">", "");
					if (value.isEmpty())
						value = "";
					// System.out.println("[" + key + ", " + value + "]");
					map.put(key, value);
				}
				if (line.contains("archive=")) {
					// System.out.println(line);
					gamePackUrl = line.substring(line.indexOf("archive=") + "archive=".length()).replaceAll("\'\\);", "").trim();
					gamePackUrl = gamePackUrl.substring(0, gamePackUrl.indexOf(".jar") + ".jar".length());
					gamePackUrl = "http://" + Host + "/" + gamePackUrl;
				}
			}
			if (gamePackUrl == "")
				throw new RuntimeException("Invalid GamePack URL");
			downloadAndApplyGamePack(gamePackUrl);
			// System.out.println("Connecting to: " + Host);
		} else {
			map.put("44", "80");
			map.put("45", ".runescape.com");
			map.put("46", "1016377029");
			map.put("47", "true");
			map.put("48", "127.0.0.1");
			map.put("49", "0");
			map.put("50", "43594");
			map.put("51", "443");
			map.put("52", "43594");
			map.put("10", "http://127.0.0.1");
			map.put("11", "");
			map.put("12", "halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
			map.put("13", "0");
			map.put("14", "http://127.0.0.1");
			map.put("15", "");
			map.put("-1", "N485gvjJSjUF06hj3*AiQA");
			map.put("17", "0");
			map.put("18", "3");
			map.put("19", "false");
			map.put("0", "d6EmilV2mm9Qh2E1YQJU*w");
			map.put("1", "true");
			map.put("2", "1200");
			map.put("3", "Ymi9Liy-EKAQPDzvIFDOawIZao205SgIjSoemJvZ5wo");
			map.put("4", "443");
			map.put("5", "false");
			map.put("6", "127.0.0.1");
			map.put("7", "225");
			map.put("8", "true");
			map.put("9", "43594");
			map.put("20", "0");
			map.put("22", "MQyBA3iltpjF-r*tzY3dx7TdJZk4t-ej");
			map.put("23", "841974411");
			map.put("25", "false");
			map.put("26", "127.0.0.1");
			map.put("27", "0");
			map.put("28", "0");
			map.put("29", "false");
			map.put("30", "3F110CFC079B70003DDFA581F69AF06E8D34A1418C593CC61BBE7C986041C46BC75A1074E9BCBCC0C15E5034192981D2");
			map.put("31", "15493010");
			map.put("32", "http://services.runescape.com/m=gamelogspecs/clientstats?data=");
			map.put("33", "443");
			map.put("34", "");
			map.put("35", "0");
			map.put("36", "1105");
			map.put("37", "0");
			map.put("38", "443");
			map.put("39", "24569");
			map.put("40", "false");
			map.put("41", "0");
			map.put("42", "");
			map.put("43", "false");
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(int dimensionX, int dimensionY) {
		super.resize(new Dimension(dimensionX, dimensionY));
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String paramName) {
		return (String) map.get(paramName);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL("http://" + Host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + Host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Fetches the current parameters from the specified address
	 * 
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public ArrayList<String> fetchPageDetails(String packUrl) throws MalformedURLException, IOException {
		ArrayList<String> pageSource = new ArrayList<String>();
		URL urlToLoad = new URL(packUrl);
		HttpURLConnection urlConn = (HttpURLConnection) urlToLoad.openConnection();
		urlConn.setRequestMethod("GET");
		urlConn.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
		urlConn.addRequestProperty("Cookie",
				"rs_splash_count=1; __gads=ID=01f7f06c469d4de0:T=1403584864:S=ALNI_MbSLYC85isVmQ2Vp6vX6dC7HByMSw; loggedIn=true; _vwo_uuid=8D094E414AAA655A792DF418F185E3E2; mlUserID=v63eXwJhc0DZ; _vis_opt_exp_163_combi=1; _vis_opt_exp_163_goal_1=1; _vis_opt_exp_162_combi=1; _vis_opt_exp_162_goal_1=1; seenOverlay=true; slangpref=0; _vis_opt_exp_181_combi=1; _vis_opt_exp_181_goal_1=1; billing_core-ReacquiredUserCookie=MzA3O05FVwAAAAFHyy6aCQ==; _vis_opt_exp_186_exclude=1; _vis_opt_exp_188_combi=1; _vis_opt_exp_196_combi=1; _vis_opt_exp_196_goal_1=1; openjdkInstalled=true; _vis_opt_exp_188_goal_10=1; _vis_opt_s=16%7C; JXDOB=19960320; JXFLOWCONTROL=66541972282977989; rememberme=99JIgg6bTL2wh7meQD96tg; settings=Ymi9Liy-EKAQPDzvIFDOawIZao205SgIjSoemJvZ5wo; rs_poll_en=1412682750699; rs_poll_vote_iden=3; JXTRACKING=011826805000000149A56AF817; JXWEBUID=3F110CFC079B70003DDFA581F69AF06E8D34A1418C593CC61BBE7C986041C46BC75A1074E9BCBCC0C15E5034192981D2; JXADDINFO=DBXPZaBPotHnzeZldoHBTz5oe0oBfX6CHwAAAAE; __utma=197813168.605710466.1416094128.1416094128.1416094128.1; __utmb=197813168.2.10.1416094128; __utmc=197813168; __utmz=197813168.1416094128.1.1.utmcsr=runescape.com|utmccn=(referral)|utmcmd=referral|utmcct=/game");
		urlConn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.111 Safari/537.36");
		BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null)
			pageSource.add(line);
		reader.close();
		return pageSource;
	}

	public String getPackUrl() {
		String url = "";
		try {
			URL urlToLoad = new URL(LOAD_URL);
			HttpURLConnection urlConn = (HttpURLConnection) urlToLoad.openConnection();
			urlConn.setRequestMethod("GET");
			urlConn.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
			urlConn.addRequestProperty("Cookie",
					"rs_splash_count=1; __gads=ID=01f7f06c469d4de0:T=1403584864:S=ALNI_MbSLYC85isVmQ2Vp6vX6dC7HByMSw; loggedIn=true; _vwo_uuid=8D094E414AAA655A792DF418F185E3E2; mlUserID=v63eXwJhc0DZ; _vis_opt_exp_163_combi=1; _vis_opt_exp_163_goal_1=1; _vis_opt_exp_162_combi=1; _vis_opt_exp_162_goal_1=1; seenOverlay=true; slangpref=0; _vis_opt_exp_181_combi=1; _vis_opt_exp_181_goal_1=1; billing_core-ReacquiredUserCookie=MzA3O05FVwAAAAFHyy6aCQ==; _vis_opt_exp_186_exclude=1; _vis_opt_exp_188_combi=1; _vis_opt_exp_196_combi=1; _vis_opt_exp_196_goal_1=1; HIRO_COOKIE=data=&newSession=true&id=2013476584614&timestamp=1412214683492; openjdkInstalled=true; _vis_opt_exp_188_goal_10=1; _vis_opt_s=16%7C; JXDOB=19960320; JXFLOWCONTROL=66541972282977989; rememberme=99JIgg6bTL2wh7meQD96tg; settings=Ymi9Liy-EKAQPDzvIFDOawIZao205SgIjSoemJvZ5wo; rs_poll_en=1412682750699; rs_poll_vote_iden=3; JXTRACKING=011826805000000149A56AF817; JXWEBUID=3F110CFC079B70003DDFA581F69AF06E8D34A1418C593CC61BBE7C986041C46BC75A1074E9BCBCC0C15E5034192981D2; JXADDINFO=DBXPZaBPotHnzeZldoHBTz5oe0oBfX6CHwAAAAE; __utmt=1; __utmt_~1=1; __utma=197813168.2077452718.1416094101.1416094101.1416094101.1; __utmb=197813168.2.10.1416094101; __utmc=197813168; __utmz=197813168.1416094101.1.1.utmcsr=runescape.com|utmccn=(referral)|utmcmd=referral|utmcct=/game");
			urlConn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.111 Safari/537.36");
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null)
				if (line.startsWith("<iframe id=\"game\"")) {
					// System.out.println(line);
					url = line.substring(line.indexOf("src=\"") + "src=\"".length(), line.indexOf("\" frameborder="));
					// System.out.println(url);
				}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}

	public void downloadAndApplyGamePack(String packUrl) {
		String packName = packUrl.substring(packUrl.indexOf("gamepack")).replace('*', '_');
		try {
			System.out.println("Downloading GamePack: " + packUrl);
			URL url = new URL(packUrl);
			InputStream is = new BufferedInputStream(url.openStream());
			OutputStream os = new BufferedOutputStream(new FileOutputStream(new File(LIB_DIR + packName)));

			int read;
			while ((read = is.read()) != -1) {
				os.write(read);
			}
			os.close();
			// addPath(LIB_DIR +
			// (packUrl.substring(packUrl.indexOf("gamepack"))));
			Map<String, ByteBuffer> classes = new HashMap<String, ByteBuffer>();

			// Decrypt and decompress the inner pack.
			try {
				InnerPackDecrypter decrypter = new InnerPackDecrypter(LIB_DIR + packName, (String) map.get("0"), (String) map.get("-1"));
				classes = decrypter.decrypt();
				decrypter.close();
			} catch (GeneralSecurityException e) {
				System.err.println("Error decrypting the inner archive.");
				e.printStackTrace();
				System.exit(0);
			}
			if (classes.size() > 0) {
				writeJar(classes, LIB_DIR + "gamepack.jar");
				addPath(LIB_DIR + "gamepack.jar");
			} else {
				System.err.println("No classes found in archive...");
				System.exit(0);
			}
		} catch (Exception e) {
			System.err.println("Error retrieving gamepack(" + packName + ") ... try again.");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private void writeJar(Map<String, ByteBuffer> classes, String loc) throws IOException {

		try (JarOutputStream jos = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(new File(loc))))) {
			for (Entry<String, ByteBuffer> clazz : classes.entrySet()) {
				ZipEntry zip = new ZipEntry(clazz.getKey());

				jos.putNextEntry(zip);
				jos.write(clazz.getValue().array());
			}
		} catch (IOException e) {
			System.err.println("Error writing classes to jar - please ensure this program has write permissions.");
			throw new IOException(e);
		}
	}

	public void addPath(String s) throws Exception {
		File f = new File(s);
		URL u = f.toURI().toURL();
		URLClassLoader urlClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
		Class<?> urlClass = URLClassLoader.class;
		Method method = urlClass.getDeclaredMethod("addURL", new Class[] { URL.class });
		method.setAccessible(true);
		method.invoke(urlClassLoader, new Object[] { u });
		System.out.println("Gamepack added to classpath!");

		ClassLoader cl = ClassLoader.getSystemClassLoader();

		URL[] urls = ((URLClassLoader) cl).getURLs();

		// for (URL url : urls) {
		// System.out.println(url.getFile());
		// }
	}

	public final class InnerPackDecrypter implements Closeable {

		/**
		 * The key returned if an empty (i.e. {@code length == 0} string is
		 * decrypted.
		 */
		private final byte[] EMPTY_KEY = new byte[0];

		/**
		 * The encoded secret key for the AES block cipher.
		 */
		private final String encodedSecret;

		/**
		 * The encoded initialisation vector for the AES block cipher.
		 */
		private final String encodedVector;

		/**
		 * The input stream to the {@code inner.pack.gz} file.
		 */
		private final InputStream input;

		/**
		 * The gamepack jar file.
		 */
		private final JarFile jar;

		/**
		 * Creates the inner pack decrypter.
		 *
		 * @param gamepack
		 *            The {@link Path} to the gamepack jar.
		 * @param secret
		 *            The encoded secret key.
		 * @param vector
		 *            The encoded initialisation vector.
		 * @throws IOException
		 *             If the path to the gamepack is invalid.
		 */
		public InnerPackDecrypter(String gamePack, String secret, String vector) throws IOException {
			this.encodedSecret = secret;
			this.encodedVector = vector;
			this.jar = new JarFile(new File(gamePack));

			ZipEntry archive = jar.getEntry("inner.pack.gz");
			this.input = new BufferedInputStream(jar.getInputStream(archive));
		}

		@Override
		public void close() throws IOException {
			input.close();
			jar.close();
		}

		/**
		 * Decrypts the {@code inner.pack.gz} archive using the AES cipher. The
		 * decrypted data is then un-gzipped and unpacked from the pack200
		 * format, before finally being split into a {@link ByteBuffer} per
		 * class. The data is then returned as a {@link Map} of class names to
		 * byte buffers.
		 *
		 * @return The map of class names to the byte buffers containing their
		 *         data.
		 * @throws NoSuchAlgorithmException
		 *             If the current system does not have an AES
		 *             implementation.
		 * @throws NoSuchPaddingException
		 *             If the current system does not support the specified
		 *             padding scheme.
		 * @throws InvalidKeyException
		 *             If the secret key is invalid.
		 * @throws InvalidAlgorithmParameterException
		 *             If the initialisation vector is invalid.
		 * @throws IOException
		 *             If there is an error reading from or writing to any of
		 *             the various streams used.
		 * @throws IllegalBlockSizeException
		 *             If AES is unable to process the input data provided.
		 * @throws BadPaddingException
		 *             If the data lacks the appropriate padding bytes.
		 */
		public Map<String, ByteBuffer> decrypt() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IOException, IllegalBlockSizeException, BadPaddingException {
			int secretKeySize = getKeySize(encodedSecret.length());
			int vectorSize = getKeySize(encodedVector.length());

			byte[] secretKey = secretKeySize == 0 ? EMPTY_KEY : decodeBase64(encodedSecret, secretKeySize);
			byte[] initialisationVector = vectorSize == 0 ? EMPTY_KEY : decodeBase64(encodedVector, vectorSize);

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec secret = new SecretKeySpec(secretKey, "AES");
			IvParameterSpec vector = new IvParameterSpec(initialisationVector);

			// Initialise the cipher.
			cipher.init(Cipher.DECRYPT_MODE, secret, vector);

			byte[] buffer = new byte[5 * 1024 * 1024];
			int read = 0, in = 0;

			while (read < buffer.length && (in = input.read(buffer, read, buffer.length - read)) != -1) {
				read += in;
			}

			// System.out.println("Decrypting the archive.");

			// Decrypt the inner.pack.gz file.
			byte[] decrypted = cipher.doFinal(buffer, 0, read);
			ByteArrayOutputStream bos = new ByteArrayOutputStream(5 * 1024 * 1024);

			// Un-gzip and unpack the jar file contained in the archive, and
			// write the decompressed data out.
			try (JarOutputStream jos = new JarOutputStream(bos); GZIPInputStream gzip = new GZIPInputStream(new ByteArrayInputStream(decrypted))) {
				Pack200.newUnpacker().unpack(gzip, jos);
			}

			Map<String, ByteBuffer> classes = new HashMap<>();

			// Iterate through the jar entries from the stream, read and wrap
			// them, and add them to the map.
			try (JarInputStream jis = new JarInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
				for (JarEntry entry = jis.getNextJarEntry(); entry != null; entry = jis.getNextJarEntry()) {
					String name = entry.getName();
					if (!name.endsWith(".class")) {
						// System.out.println(name);
						continue;
					}

					read = in = 0;
					while (read < buffer.length && (in = jis.read(buffer, read, buffer.length - read)) != -1) {
						read += in;
					}

					ByteBuffer data = ByteBuffer.allocate(read);
					data.put(buffer, 0, read).flip();
					classes.put(name, data);
				}
			}

			return classes;
		}

		/**
		 * Decodes the base64 string into a valid secret key or initialisation
		 * vector.
		 *
		 * @param string
		 *            The string.
		 * @param size
		 *            The size of the key, in bytes.
		 * @return The key, as a byte array.
		 */
		private byte[] decodeBase64(String string, int size) {
			// JaGex's implementation uses * and - instead of + and /, so
			// replace them.
			String valid = string.replaceAll("\\*", "\\+").replaceAll("-", "/");
			return Base64.getDecoder().decode(valid);
		}

		/**
		 * Gets the key size for a string of the specified length.
		 *
		 * @param length
		 *            The length of the string.
		 * @return The key size.
		 */
		private int getKeySize(int length) {
			if (length == 0) {
				return 0;
			}

			return 3 * (int) Math.floor((length - 1) / 4) + 1;
		}

	}

}
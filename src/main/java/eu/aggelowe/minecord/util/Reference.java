package eu.aggelowe.minecord.util;

/**
 * <p >
 * This class contains the most important variables of the program. These
 * variables should only be changed if really necessary as they might cause the
 * plugin to not work.
 * </p>
 * 
 * <p>
 * The variables are <code>final</code> and can only be obtained by getters like so:
 * <pre>Reference.getName();</pre>
 * </p>
 * 
 * @author Aggelowe
 *
 */
public final class Reference {

	private static final String NAME = "Minecord";
	private static final String API_VERSION = "1.16";
	private static final String VERSION = "0.1";
	private static final String CREATOR = "Aggelowe";
	
	/**
	 * @return The name of the plugin
	 */
	public static String getName() {
		return NAME;
	}
	/**
	 * @return The api version on which the plugin was made
	 */
	public static String getApiVersion() {
		return API_VERSION;
	}
	/**
	 * @return The current version of the plugin
	 */
	public static String getVersion() {
		return VERSION;
	}
	
	/**
	 * @return THe creator of the plugin
	 */
	public static String getCreator() {
		return CREATOR;
	}
	
	
	
}

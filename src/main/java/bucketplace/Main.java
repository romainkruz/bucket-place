package bucketplace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	private static final String LOG_MSG_START = "Application launched";

	public static void main(String[] args) {
		LOG.info(LOG_MSG_START);
		System.out.println("Bonjour bienvenu au Bucket Place");
	}

}

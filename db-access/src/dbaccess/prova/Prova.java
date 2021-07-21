package dbaccess.prova;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Prova {
	private static final Logger log = LogManager.getLogger(Prova.class);

	public static void main(String[] args) {
		log.trace("Messaggio di trace");
		log.debug("Messaggio di debug");
		log.info("Messaggio di info");
		log.warn("Messaggio di warn");
		log.error("Messaggio di error");
		log.fatal("Messaggio di fatal");
	}
}

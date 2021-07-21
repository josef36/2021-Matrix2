package dbaccess.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class ProvaTest {
	private static final Logger log = LogManager.getLogger(ProvaTest.class);

	@Test
	void test() {
		log.trace("Messaggio di trace");
		log.debug("Messaggio di debug");
		log.info("Messaggio di info");
		log.warn("Messaggio di warn");
		log.error("Messaggio di error");
		log.fatal("Messaggio di fatal");
		}

}

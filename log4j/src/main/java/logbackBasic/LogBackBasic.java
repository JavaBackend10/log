package logbackBasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogBackBasic {
	
	private static final Logger logger = LoggerFactory.getLogger(LogBackBasic.class);

	public static void main(String[] args) {
		logger.info("Example log from {}", LogBackBasic.class.getSimpleName());
	}
}
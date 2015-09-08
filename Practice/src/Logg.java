import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;


public class Logg {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		Log logger = LogFactory.getLog(Logg.class);
		logger.info("jhjlakseae");
	}

}

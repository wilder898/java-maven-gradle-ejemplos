import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {
    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        logger.info("Inicio de la aplicacion");
        logger.warn("Esto es una advertencia");
        logger.error("Esto es un error critico");
    }
}

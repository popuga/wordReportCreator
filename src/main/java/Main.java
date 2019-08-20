import org.apache.log4j.Logger;
import ui.MainApp;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        log.warn("Программа запущена");
        MainApp app = new MainApp();
        log.warn("Программа завершила свою работу");
    }
}
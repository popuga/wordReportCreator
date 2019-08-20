package entity;

import org.apache.log4j.Logger;

/** Protocol implementation #60 */
public class WrdReport_60 extends Report {
    private static final Logger log = Logger.getLogger(WrdReport_60.class);
    /** Name instance report */
    private static final String NAME = "Отчет 60";

    public WrdReport_60(String author) {
        super(author, NAME);
        log.warn(toString());
    }


}

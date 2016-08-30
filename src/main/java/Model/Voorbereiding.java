package Model;

import java.util.Date;
import java.util.List;

/**
 * Created by kristof on 29/08/2016.
 */
public class Voorbereiding {
    Long id;
    Date date;
    User coach;
    List <User> gameLeaders;
    String doel;
    String inkleding;
    Material material;
    String uitleg;
    String spelregels;
    String impulsen;
    String opruimen;
    String feedback;
}

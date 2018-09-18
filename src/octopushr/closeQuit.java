package octopushr;

import javafx.event.Event;
import javafx.scene.Node;

/**
 *
 * @author HUggins
 */
public class closeQuit {

    public void qiutScene(Event event) {

        ((Node) (event.getSource())).getScene().getWindow().hide();

    }

}

package componentes_godoyjosecarlos;

import javafx.scene.control.*;

public class CampoTextoNumerico extends TextField {

    public CampoTextoNumerico() {
    }

    public CampoTextoNumerico(String text) {
        super(text);
    }

    @Override
    public void replaceSelection(String replacement) {
        if (replacement.matches("[0-9]")) {
            super.replaceSelection(replacement);
        }
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (text.matches("[0-9]")) {
            super.replaceText(start, end, text);
        }
     
    }

    @Override
    public void deleteText(int start, int end) {
        super.replaceText(0,getText().length(),getText().substring(0, start)); 
    }

}

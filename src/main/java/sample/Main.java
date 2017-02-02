package sample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import sample.gui.GUI;

/**
 * Created by No3x on 01.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        GUI gui = injector.getInstance(GUI.class);

        try {
            gui.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

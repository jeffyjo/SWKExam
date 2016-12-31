package _11_Design_Patterns.MVC;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class Singleton {
    private Singleton singleton;

    //TO-DO: Make this work

    private Singleton() {
        if (singleton == null) {
            this.singleton = new Singleton();
        }
    }

    public Singleton getInstance(){
        if (this.singleton == null) {

        }

        return singleton;
    }



}

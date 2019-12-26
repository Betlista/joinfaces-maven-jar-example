package org.joinfaces.example;

import org.primefaces.PrimeFaces;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
//@SessionScoped
@ViewScoped
@RequestScoped
public class Test1View implements Serializable {

    boolean panelVisible = false;

    public boolean isPanelVisible() {
        return panelVisible;
    }

    public void setPanelVisible(boolean panelVisible) {
        this.panelVisible = panelVisible;
        //PrimeFaces.current().ajax().update("form1:button_panel");
    }

}

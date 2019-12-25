package org.joinfaces.example;

import org.primefaces.PrimeFaces;

import javax.inject.Named;

@Named
public class Test1View {

    boolean panelVisible = false;

    public boolean isPanelVisible() {
        return panelVisible;
    }

    public void setPanelVisible(boolean panelVisible) {
        this.panelVisible = panelVisible;
        PrimeFaces.current().ajax().update("form1:button_panel");
    }

}

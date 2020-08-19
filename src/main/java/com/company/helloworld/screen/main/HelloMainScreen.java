package com.company.helloworld.screen.main;

import io.jmix.ui.component.AppWorkArea;
import io.jmix.ui.component.Window;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("hello_MainScreen")
@UiDescriptor("hello-main-screen.xml")
public class HelloMainScreen extends Screen implements Window.HasWorkArea {
    @Override
    public AppWorkArea getWorkArea() {
        return (AppWorkArea) getWindow().getComponent("workArea");
    }
}

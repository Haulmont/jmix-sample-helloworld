package com.company.helloworld.screen.bar;

import io.jmix.ui.screen.*;
import com.company.helloworld.entity.Bar;

@UiController("hello_Bar.edit")
@UiDescriptor("bar-edit.xml")
@EditedEntityContainer("barDc")
public class BarEdit extends StandardEditor<Bar> {
}
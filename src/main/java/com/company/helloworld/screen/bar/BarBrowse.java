package com.company.helloworld.screen.bar;

import io.jmix.ui.screen.*;
import com.company.helloworld.entity.Bar;

@UiController("hello_Bar.browse")
@UiDescriptor("bar-browse.xml")
@LookupComponent("barsTable")
public class BarBrowse extends StandardLookup<Bar> {
}
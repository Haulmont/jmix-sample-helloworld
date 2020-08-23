package com.company.helloworld.screen.foo;

import io.jmix.ui.screen.*;
import com.company.helloworld.entity.Foo;

@UiController("hello_Foo.browse")
@UiDescriptor("foo-browse.xml")
@LookupComponent("foosTable")
public class FooBrowse extends StandardLookup<Foo> {
}
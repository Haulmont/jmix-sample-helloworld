package com.company.helloworld.screen.foo;

import io.jmix.ui.screen.*;
import com.company.helloworld.entity.Foo;

@UiController("hello_Foo.datagrid")
@UiDescriptor("foo-datagrid.xml")
@LookupComponent("foosTable")
public class FooDataGridBrowse extends StandardLookup<Foo> {
}
package com.company.helloworld.screen.foo;

import io.jmix.ui.screen.*;
import com.company.helloworld.entity.Foo;

@UiController("hello_Foo.edit")
@UiDescriptor("foo-edit.xml")
@EditedEntityContainer("fooDc")
public class FooEdit extends StandardEditor<Foo> {
}
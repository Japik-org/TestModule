package com.japik.modules.test;

import com.japik.module.AModuleConnection;
import com.japik.module.ModuleConnectionParams;
import com.japik.modules.test.shared.ITestModuleConnection;
import org.jetbrains.annotations.NotNull;

public final class TestModuleConnection
        extends AModuleConnection<TestModule, ITestModuleConnection>
        implements ITestModuleConnection {

    public TestModuleConnection(@NotNull TestModule module, ModuleConnectionParams params) {
        super(module, params);
    }
}

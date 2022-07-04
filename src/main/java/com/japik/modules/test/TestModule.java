package com.japik.modules.test;

import com.japik.module.AModule;
import com.japik.module.ModuleConnectionParams;
import com.japik.module.ModuleParams;
import com.japik.modules.test.shared.ITestModuleConnection;
import org.jetbrains.annotations.NotNull;

public final class TestModule extends AModule<ITestModuleConnection> {

    public TestModule(ModuleParams moduleParams) {
        super(moduleParams);
    }

    @Override
    protected @NotNull ITestModuleConnection createModuleConnection(ModuleConnectionParams params) throws Throwable {
        return new TestModuleConnection(this, params);
    }
}

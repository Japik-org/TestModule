package com.pro100kryto.server.modules;

import com.pro100kryto.server.module.Module;
import com.pro100kryto.server.service.IServiceControl;

import java.util.Map;

public class TestModule extends Module {


    public TestModule(IServiceControl service, String name) {
        super(service, name);
    }

    @Override
    public void setSettings(Map<String, String> config) {

    }

    @Override
    protected void startAction() throws Throwable {

    }

    @Override
    protected void stopAction(boolean force) throws Throwable {

    }

    @Override
    public void tick() throws Throwable {

    }
}

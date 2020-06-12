package tech.romashov.springjunitrunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RunWith(SpringJUnitRunner.class)
@Component
public class ServiceTest {

    @Autowired
    private DummyService service;

    @Test
    public void testApp() {
        Assert.assertEquals("Hello World!", service.doSomething());
    }
}

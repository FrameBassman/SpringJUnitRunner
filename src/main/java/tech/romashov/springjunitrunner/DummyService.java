package tech.romashov.springjunitrunner;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
    public String doSomething() {
        return "Hello World!";
    }
}

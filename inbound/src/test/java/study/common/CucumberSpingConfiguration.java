package study.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import study.InboundApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { InboundApplication.class })
public class CucumberSpingConfiguration {}

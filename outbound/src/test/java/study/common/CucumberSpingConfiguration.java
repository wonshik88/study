package study.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import study.OutboundApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OutboundApplication.class })
public class CucumberSpingConfiguration {}

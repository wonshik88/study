package study.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.domain.*;

@RestController
// @RequestMapping(value="/outbounds")
@Transactional
public class OutboundController {

    @Autowired
    OutboundRepository outboundRepository;
    // keep
}

package com.wuyouz;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 * Created by liudongqing on 16/7/19.
 */
@RestController
public class SampleController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String createPojo(@PathVariable Integer id) throws SQLException {
        return "Hello world";
    }
}

package com.mars.person.user;

import com.mars.depot.person.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project person
 * @author: FannieXue
 * @time 2019-04-15
 */
@RestController
@RequestMapping(value = "/api/person/v1/users")
public class UserController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String getUser(@PathVariable("userId") Long userId) {
        String services = "Services: " + discoveryClient.getServices();
//        Json
        User u = new User();
        u.id = 10L;
        u.name = "哗哗";

        return "hello world: " + services;
    }

}

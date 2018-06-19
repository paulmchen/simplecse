package com.service.csea.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-19T19:15:08.178Z")

@RestSchema(schemaId = "csea")
@RequestMapping(path = "/cse-a", produces = MediaType.APPLICATION_JSON)
public class CseaImpl {

    @Autowired
    private CseaDelegate userCseaDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCseaDelegate.helloworld(name);
    }

}

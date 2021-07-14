package com.example.api.resources.v1;

import com.example.api.services.hello_wolrd.v1.HelloWolrdService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@Api(tags = { "Hello World" })
public class HelloWorldResource {

    @Autowired
    private HelloWolrdService helloWolrdService;

    @ApiOperation(value = "Retonar Hello Wolrd")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/v1/helloWolrd")
    public ResponseEntity<String> helloWorld() {
        String res = helloWolrdService.helloWolrd();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}

package io.scheduller.api.controller;

import io.scheduller.api.enumerator.SchedullerType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(SchedullerTypeController.SCHEDULLER_TYPE_ENDPOINT)
public class SchedullerTypeController {
    public static final String SCHEDULLER_TYPE_ENDPOINT = "/schedullertype";

    @CrossOrigin(origins = "https://sharp-goldwasser-4f13ba.netlify.com/demo")
    @GetMapping
    List<SchedullerType> getAllSchedullerType(){
        return Arrays.asList(SchedullerType.values());
    }

}

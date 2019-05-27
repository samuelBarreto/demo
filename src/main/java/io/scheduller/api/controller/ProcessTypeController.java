package io.scheduller.api.controller;

import io.scheduller.api.enumerator.ProcessType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "https://app-pi.herokuapp.com")
@RestController
@RequestMapping(ProcessTypeController.PROCESS_TYPE_ENDPOINT)
public class ProcessTypeController {
    public static final String PROCESS_TYPE_ENDPOINT = "/processtype";

    @GetMapping
    List<ProcessType> getAllProcessType(){
        return Arrays.asList(ProcessType.values());
    }

}

package org.example.asyncannotationinspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private NetworkService networkService;

    @Autowired
    private DatabaseService databaseService;

    @Autowired
    private BatchService batchService;



    @GetMapping("/getSample")
    public String getSample() {
        networkService.display();
        databaseService.display();
        batchService.display();
        return "Sample API";
    }
}

package org.example.asyncannotationinspringboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NetworkService {
   @Async
    public void display(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("NetworkService :- "+Thread.currentThread().getName() );
    }
}

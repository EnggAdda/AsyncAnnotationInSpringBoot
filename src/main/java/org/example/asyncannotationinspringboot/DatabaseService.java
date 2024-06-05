package org.example.asyncannotationinspringboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
   @Async
    public void display(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("DatabaseService :- "+Thread.currentThread().getName() );
    }
}

package com.example.springboot5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    ToDoRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        ToDo todo= new ToDo("Drawing ","Drawing pictures with my kids and coloring");
        repository.save(todo);

        todo=new ToDo("Study","studying Java");
        repository.save(todo);

        todo=new ToDo("Job searching","");
        repository.save(todo);
    }
}

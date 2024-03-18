package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.Task;

@DataJpaTest
public class TaskRepositoryTest {
        
        @Autowired
        private TaskRepository taskRepository;
        
        @Test
        public void testAddFind() {
            final String taskDescription = "test";
            Task task = new Task();
            task.setTaskdescription(taskDescription);
            taskRepository.save(task);
            Task result = taskRepository.findByTaskdescription(taskDescription);

            assertTrue(result != null);
            assertEquals(taskDescription, result.getTaskdescription());
        }
}

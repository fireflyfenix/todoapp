package com.princy.labs.dao;

import com.princy.labs.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

/**
 * Created by princy on 4/17/17.
 */
@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByName(String name);

    List<Task> findByDate(Date date);
}

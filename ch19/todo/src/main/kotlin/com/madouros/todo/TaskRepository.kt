package com.madouros.todo

import org.springframework.data.repository.CrudRepository

interface TaskRepository: CrudRepository<Task, Long>

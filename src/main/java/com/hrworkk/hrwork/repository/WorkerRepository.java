package com.hrworkk.hrwork.repository;

import com.hrworkk.hrwork.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}

package com.practice.spring5webapp.repository;

import com.practice.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Shaizan Khan
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

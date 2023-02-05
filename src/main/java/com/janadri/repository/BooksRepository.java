package com.janadri.repository;

import com.janadri.model.Books;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}

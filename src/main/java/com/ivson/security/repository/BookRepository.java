package com.ivson.security.repository;

import com.ivson.security.model.Book;

public interface BookRepository {

	Book getByIsbn(String isbn);
}

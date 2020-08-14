package com.weifengcui.demo.repository;

import com.weifengcui.demo.entity.BlogMessage;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface BlogMessageRepository extends CrudRepository<BlogMessage, Integer> {

}

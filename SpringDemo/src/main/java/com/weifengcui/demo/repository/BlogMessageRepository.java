package com.weifengcui.demo.repository;

import com.weifengcui.demo.entity.BlogMessage;
import com.weifengcui.demo.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface BlogMessageRepository extends CrudRepository<BlogMessage, Integer> {

    @Query(
            value = "select * from message m order by m.created_at_ts DESC limit :num",
            nativeQuery = true
    )
    public Iterable<BlogMessage> listReverseOrderByCreatedTS(@Param("num") int numLimit);

}

package com.proxy.repository;

import com.proxy.models.Doc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DocRepository  extends JpaRepository<Doc,Long> {

    void deleteById(Long id);
}
package com.FullStack.Bookmarks.repository;

import com.FullStack.Bookmarks.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ElementRepository extends JpaRepository<Element, Long> {
    void deleteElementById(Long id);

    Optional<Element> findElementById(Long id);
}

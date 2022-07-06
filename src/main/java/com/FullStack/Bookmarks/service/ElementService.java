package com.FullStack.Bookmarks.service;

import com.FullStack.Bookmarks.exception.ElementNotFoundException;
import com.FullStack.Bookmarks.model.Element;
import com.FullStack.Bookmarks.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ElementService {
    private final ElementRepository elementRepository;

    @Autowired
    public ElementService(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    public Element addElement(Element element) {
         return elementRepository.save(element);
    }

    public List<Element> findAllElements() {
        return elementRepository.findAll();
    }

    public Element updateElement(Element element) {
        return elementRepository.save(element);
    }

    public Element findElementById(Long id) {
        return elementRepository.findElementById(id)
                .orElseThrow(() -> new ElementNotFoundException("Element by id " + id + " was not found"));
    }

    public void deleteElement(Long id){
        elementRepository.deleteElementById(id);
    }
}

package com.FullStack.Bookmarks.controller;


import com.FullStack.Bookmarks.model.Element;
import com.FullStack.Bookmarks.service.ElementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/element")
public class ElementController {
    private final ElementService elementService;

    public ElementController(ElementService elementService) {
        this.elementService = elementService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Element>> getAllElements () {
        List<Element> elements = elementService.findAllElements();
        return new ResponseEntity<>(elements, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Element> getElementById (@PathVariable("id") Long id) {
        Element element = elementService.findElementById(id);
        return new ResponseEntity<>(element, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Element> addElement(@RequestBody Element element) {
        Element newElement = elementService.addElement(element);
        return new ResponseEntity<>(newElement, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Element> updateElement(@RequestBody Element element) {
        Element updateElement = elementService.updateElement(element);
        return new ResponseEntity<>(updateElement, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteElement(@PathVariable("id") Long id) {
        elementService.deleteElement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package com.omokolataiwo.namewheel.wheelname.Controllers;

import java.util.List;

import com.omokolataiwo.namewheel.wheelname.Models.Name;
import com.omokolataiwo.namewheel.wheelname.Models.repositories.NameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class NameController {

  @Autowired
  private NameRepository repository;

  @GetMapping
  public List<Name> getNames() {
    return repository.findAll();
  }
}
package com.omokolataiwo.namewheel.wheelname.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class NameController {

  @GetMapping
  public String[] getNames() {
    String[] names = { "taiwo", "peter" };
    return names;
  }
}
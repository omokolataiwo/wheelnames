package com.omokolataiwo.namewheel.wheelname.Models.repositories;

import com.omokolataiwo.namewheel.wheelname.Models.Name;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NameRepository extends MongoRepository<Name, String> {
  Name findBy_id(ObjectId id);
}
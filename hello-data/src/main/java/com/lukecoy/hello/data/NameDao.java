package com.lukecoy.hello.data;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.util.List;

public interface NameDao {

  @SqlQuery("SELECT name, date_met FROM name WHERE id >= :from AND id < :to")
  List<String> findNamesBetween(@Bind("from") int from, @Bind("to") int to);

}

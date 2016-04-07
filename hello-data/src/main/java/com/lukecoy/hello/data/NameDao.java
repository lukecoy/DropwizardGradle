package com.lukecoy.hello.data;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.util.List;

public interface NameDao {

  @SqlUpdate("INSERT INTO name (name, date_met) values (:name, :date_met)")
  int insert(@Bind("name") String name, @Bind("date_met") long dateMet);

  @SqlQuery("SELECT name, date_met FROM name WHERE date_met >= :from AND date_met < :to")
  List<String> findNamesBetween(@Bind("from") int from, @Bind("to") int to);

}

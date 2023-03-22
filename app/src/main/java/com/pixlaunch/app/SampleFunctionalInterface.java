package com.pixlaunch.app;

import com.pixlaunch.app.Domain.Employee;
import com.pixlaunch.app.Domain.Person;
import java.util.Locale;
import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;

/**
 * @author abhishekbansal
 */
@Slf4j
public class SampleFunctionalInterface {

  /*
    - ###############################################################
    - Function  - map x to y
    - ###############################################################

   */
  Employee generateEmployeeId(Person p, Function<Person,String> mapToId){
    Employee emp = new Employee();
    emp.setEmailId(p.getEmailId());
    emp.setName(p.getName());
    emp.setId(mapToId.apply(p));

  log.info("Employee created with details: {}",emp);

    return emp;
  }
}

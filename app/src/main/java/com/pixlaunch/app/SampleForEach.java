package com.pixlaunch.app;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @author abhishekbansal
 */
@Slf4j
public class SampleForEach {

  public void runForEachCode(List<String> arrayList){
    /*
    * Collection classes which extends Iterable interface
    * can use forEach() method to iterate elements
    */
    arrayList.forEach(item ->{
      log.info("Item iterated as: {}",item);
    });


  }

}

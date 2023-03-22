package com.pixlaunch.app;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @author abhishekbansal
 */
@Slf4j
public class SampleForEach {

  public void runForEachCode(List<String> arrayList){

    arrayList.forEach(item ->{
      log.info("Item iterated as: {}",item);
    });


  }

}

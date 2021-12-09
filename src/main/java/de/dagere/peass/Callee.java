package de.dagere.peass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {
      try {
         Thread.sleep(2);
      } catch (final InterruptedException e) {
         e.printStackTrace();
      }
   }

   protected void method2() {
      Logger logger = LoggerFactory.getLogger(Callee.class);

      // This change should not be detected by PeASS since it is not covered by a test
      logger.info("This has changed");
   }

}
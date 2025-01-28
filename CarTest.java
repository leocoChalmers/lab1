import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class CarTest {
  Saab95 saab = new Saab95();
  Volvo240 volvo = new Volvo240();
  @Test
    public void testDoors(){
      Assertions.assertEquals(2, saab.getNrDoors());
      //Assertions.assertEquals(4, volvo.getNrDoors());

  }
  @Test
  public void testColor(){
    Assertions.assertEquals(Color.red, saab.getColor());
    Assertions.assertEquals(Color.black, volvo.getColor());

  }
  @Test
  public void testEnginePower(){
    Assertions.assertEquals(125, saab.getEnginePower());
    Assertions.assertEquals(100, volvo.getEnginePower());

  }
}

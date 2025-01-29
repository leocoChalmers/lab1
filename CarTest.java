import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class CarTest {
  Saab95 saab = new Saab95();
  Volvo240 volvo = new Volvo240();
  @Test
    public void testDoors(){
      Assertions.assertEquals(2, saab.getNrDoors());

      Assertions.assertEquals(4, volvo.getNrDoors());
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
  @Test
  public void testSpeed(){
    saab.startEngine();
    saab.gas(0.3);
    Assertions.assertEquals(0.475, saab.getCurrentSpeed());

    volvo.startEngine();
    volvo.gas(0.3);
    Assertions.assertEquals(0.475, volvo.getCurrentSpeed());
  }
  @Test
  public void testMove(){
    saab.startEngine();
    for (int i=0; i<100; i++){
      saab.gas(1);
    }
    saab.move();
    Assertions.assertEquals(125, saab.getPosition()[1]);
    saab.stopEngine();
    saab.startEngine();
    saab.gas(1);
    saab.gas(1);
    saab.gas(1);
    saab.gas(1);
    saab.gas(1);
    Assertions.assertThrows(IllegalArgumentException.class, () -> saab.gas(2));

    saab.move();
    Assertions.assertEquals(125+6.35,saab.getPosition()[1]);

    volvo.startEngine();
    for (int i=0; i<100; i++){
      volvo.gas(1);
    }
    volvo.move();
    Assertions.assertEquals(100, volvo.getPosition()[1]);
    volvo.stopEngine();
    volvo.startEngine();
    volvo.gas(1);
    volvo.gas(1);
    volvo.gas(1);
    volvo.gas(1);
    volvo.gas(1);
    Assertions.assertThrows(IllegalArgumentException.class, () -> volvo.gas(2));
    volvo.move();
    Assertions.assertEquals(100 + 6.35,volvo.getPosition()[1]);
  }

  @Test
  public void testBrake(){
    saab.startEngine();
    saab.brake(0.75);
    Assertions.assertEquals(0, saab.getCurrentSpeed());

    volvo.startEngine();
    volvo.brake(0.75);
    Assertions.assertEquals(0, volvo.getCurrentSpeed());
  }

  @Test
  public void testTurn(){
    saab.startEngine();
    saab.gas(1);
    saab.turnLeft();
    saab.move();
    Assertions.assertEquals(-1.35, saab.getPosition()[0]);

    volvo.startEngine();
    volvo.gas(1);
    volvo.turnLeft();
    volvo.move();
    Assertions.assertEquals(-1.35, volvo.getPosition()[0]);
  }
}

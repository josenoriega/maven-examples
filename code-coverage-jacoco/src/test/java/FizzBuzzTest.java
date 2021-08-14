import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Petri Kainulainen
 */
public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setUp() {
      fizzBuzz = new FizzBuzz();
  }

  @Test
  public void getFizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
      assertThat(fizzBuzz.getFizzBuzzWord(3), org.hamcrest.core.Is.is("Fizz"));
  }

}

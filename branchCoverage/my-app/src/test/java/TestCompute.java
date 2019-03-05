import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  

  @Test
  public void example1() {
    MessageQueue mq = mock(MessageQueue.class);
    
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);

    System.out.println(c.countNumberOfOccurrences("e"));
		

 
  }
  @Test
  public void example2() {
    MessageQueue mq = mock(MessageQueue.class);
    
    c = new Compute(mq);
    when(mq.size()).thenReturn(5);

    System.out.println(c.countNumberOfOccurrences("e"));
		

 
  }
    
  
  @Test
  public void example3() {
    MessageQueue mq = mock(MessageQueue.class);
    
    c = new Compute(mq);
    when(mq.size()).thenReturn(5);
    when(mq.contains("e")).thenReturn(true);

    System.out.println(c.countNumberOfOccurrences("e"));
		

 
  }
	@Test
	public void example4() {
		MessageQueue mq = mock(MessageQueue.class);

		c = new Compute(mq);
		when(mq.size()).thenReturn(5);
		when(mq.contains("e")).thenReturn(true);
		when(mq.getAt(1)).thenReturn("e");

		System.out.println(c.countNumberOfOccurrences("e"));

	}
}
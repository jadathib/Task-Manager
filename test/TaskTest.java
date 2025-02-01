import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {

		@Test
		void testGetTaskId() {
			Task task = new Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50");
			Assertions.assertEquals("123456789", task.getTaskId());
		}
		@Test
		void testGetName() {
			Task task = new Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50");
			Assertions.assertEquals("this is 10", task.getName());
		}
		@Test
		void testGetDescription() {
			Task task = new Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50");
			Assertions.assertEquals("checking Change for fleas and ticks", 
		task.getDescription());
		}

		@Test
		void testSetName() {
			Task task = new Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50");
			task.setName("this is 10");
			Assertions.assertEquals("this is 10", task.getName());
		}
		@Test
		void testSetDescription() {
			Task task = new Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50");
			task.setDescription("this is 50this is 50this is 50this is 50this is 50");
			Assertions.assertEquals("this is 50this is 50this is 50this is 50this is 50", task.getDescription());
		}
		
		@Test
		void testTaskIdTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> new 
					Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50"));
		}
		
		@Test
		void testSetTooLongName() {
			Task task = new Task("123456789", "this is 11 ", "this is 51this is 51this is 51this is 51this is 501");
			Assertions.assertThrows(IllegalArgumentException.class, () -> 
			task.setName("this is 10FleasTicksLong"));
		}
		@Test
		void testSetTooLongDescription() {
			Task task = new Task("123456789", "this is 11 ", "this is 51this is 51this is 51this is 51this is 501");
			Assertions.assertThrows(IllegalArgumentException.class, () -> 
			task.setDescription("this is 50this is 50this is 50this is 50this is 50 character check 50 characters or more"));
		}
		
		@Test
		void testTaskIdNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> new 
					Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50"));
		}
		@Test
		void testTaskNameNull() {
			Task task = new Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50");
			Assertions.assertThrows(IllegalArgumentException.class, () -> 
			task.setName(null));
		}
		@Test
		void testTaskDescriptionNull() {
			Task task = new Task("123456789","this is 10","this is 50this is 50this is 50this is 50this is 50");
			Assertions.assertThrows(IllegalArgumentException.class, () -> 
			task.setDescription(null));
		}
		}

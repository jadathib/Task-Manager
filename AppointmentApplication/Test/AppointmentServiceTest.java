import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AppointmentServiceTest {
private Date today, pastDate, futureDate;
  @Test
  void testNewAppointment() {
    AppointmentService service = new AppointmentService();
    service.addAppointment(futureDate, "description of the appointment service");
    assertNotNull(service.getAppointmentList().get(2).getAppointmentID());
    assertEquals(today,
                 service.getAppointmentList().get(2).getAppointmentDate());
    assertEquals("description of the appointment service",
                 service.getAppointmentList().get(2).getDescription());
    assertNotEquals(service.getAppointmentList().get(0).getAppointmentID(),
                    service.getAppointmentList().get(1).getAppointmentID());
    assertNotEquals(service.getAppointmentList().get(0).getAppointmentID(),
                    service.getAppointmentList().get(2).getAppointmentID());
    assertNotEquals(service.getAppointmentList().get(1).getAppointmentID(),
                    service.getAppointmentList().get(2).getAppointmentID());
    assertThrows(IllegalArgumentException.class,
                 () -> service.addAppointment(pastDate,"description of the appointment service"));
    assertThrows(IllegalArgumentException.class,
                 () -> service.addAppointment(futureDate, "description of the appointment service adding more strings to expand the character length to pass the  50 character limit to test this stuff"));
  }
  @Test
  void deleteAppointment() throws Exception {
    AppointmentService service = new AppointmentService();
    service.addAppointment(futureDate,"description of the appointment 
service");
    service.addAppointment(futureDate,"description of the appointment 
service");
    service.addAppointment(futureDate,"description of the appointment 
service");
    String firstId = service.getAppointmentList().get(0).getAppointmentID();
    String secondId = service.getAppointmentList().get(1).getAppointmentID();
    String thirdId = service.getAppointmentList().get(2).getAppointmentID();
    assertNotEquals(firstId, secondId);
    assertNotEquals(firstId, thirdId);
    assertNotEquals(secondId, thirdId);
    assertNotEquals("123456789", firstId);
    assertNotEquals("123456789", secondId);
    assertNotEquals("123456789", thirdId);
    assertThrows(Exception.class, () -> 
service.deleteAppointment("123456789"));
    service.deleteAppointment(firstId);
    assertThrows(Exception.class, () -> service.deleteAppointment(firstId));
    assertNotEquals(firstId,
                    service.getAppointmentList().get(0).getAppointmentID());
  }
}

package ZoneTimTarea3;

import java.time.*;

public class HorarioTiempoTarea3{

    public static void main (String[] args)	{

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zoneId);
        System.out.println(zonedDateTime);
        }
}


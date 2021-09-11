package horadosistema;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HoraDoSistema {
    
    public static void main(String[] args) {
        SimpleDateFormat relogio = new SimpleDateFormat("dd/MMM/yyyy hh:mm");
        Calendar data = new GregorianCalendar();
        System.out.println("A hora do sistema é: " + relogio.format(data.getTime()));
    }
}

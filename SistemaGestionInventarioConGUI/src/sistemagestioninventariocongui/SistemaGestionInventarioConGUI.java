
package sistemagestioninventariocongui;

import java.time.LocalDateTime;


public class SistemaGestionInventarioConGUI {

    
    public static void main(String[] args) {
        LocalDateTime fechaLimite = LocalDateTime.of(2023, 11, 13, 0, 0);
        Task t1 = new Task(1, "nn", fechaLimite, 1, false);
        Task t2 = new Task(2, "oo", fechaLimite, 3, false);
        Task updateTask1 = new Task(1, "Hola", fechaLimite, 2, true);
        Proyecto p1 = new Proyecto();
        p1.addTask(t1);
        p1.addTask(t2);
        p1.readTask();
        p1.updateTask(updateTask1);
        p1.readTask();
        p1.removeTask(t1);
        p1.readTask();
    }
    
}

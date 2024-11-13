package sistemagestioninventariocongui;

import java.util.ArrayList;

public class Proyecto {

    private Integer idProyecto;
    private String nombre;
    private ArrayList<Task> tasks = new ArrayList();

    public Proyecto() {
    }

    public Proyecto(Integer idProyecto, String nombre) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        for (Task iterador : tasks) {
            if (iterador.getIdTask().equals(task.getIdTask())) {
                System.out.println("Tarea ya existente. ");
                return;
            }
        }
        this.tasks.add(task);
    }

    public void updateTask(Task updatedTask) {
        for (Task task : tasks) {
            if (task.getIdTask().equals(updatedTask.getIdTask())) {
                task.setNombre(updatedTask.getNombre());
                task.setFechaLimite(updatedTask.getFechaLimite());
                task.setPrioridad(updatedTask.getPrioridad());
                task.setCompletada(updatedTask.getCompletada());
                System.out.println("Task updated. New attributes values: \n"
                        + "ID: " + task.getIdTask() + "\n"
                        + "Name: " + task.getNombre() + "\n"
                        + "Fecha limite: " + task.getFechaLimite() + "\n"
                        + "Prioridad: " + task.getPrioridad() + "\n"
                        + "Completada: " + task.getCompletada());
                return;
            }
        }
    }
    
    public void readTask(){
        Integer contador = 0;
        for (Task task : tasks){
            contador += 1;
            System.out.println("Reading tasks ... \n"
                            + "TASK " + contador + "\n"
                            + "------------------------\n"
                            + "ID: " + task.getIdTask() + "\n"
                            + "Name: " + task.getNombre() + "\n"
                            + "Fecha limite: " + task.getFechaLimite() + "\n"
                            + "Prioridad: " + task.getPrioridad() + "\n"
                            + "Completada: " + task.getCompletada());
            return;
        }
    }
    
    public void removeTask(Task task){
        for (Task t : tasks) {
            if (t.getIdTask().equals(task.getIdTask())) {
                tasks.remove(t);
                System.out.println("Task removed.");
                return;
            }
        }
    }
}

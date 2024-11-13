package sistemagestioninventariocongui;

import java.time.LocalDateTime;

public class Task {
    private String idTask;
    private String nombre;
    private LocalDateTime fechaLimite;
    private Integer prioridad;
    private Boolean completada;

    public Task() {
    }

    public Task(String idTask, String nombre, LocalDateTime fechaLimite, Integer prioridad, Boolean completada) {
        this.idTask = idTask;
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.completada = completada;
    }
    
    
    public String getIdTask() {
        return idTask;
    }

    public void setIdTask(String idTask) {
        this.idTask = idTask;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDateTime fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }
    
    
}

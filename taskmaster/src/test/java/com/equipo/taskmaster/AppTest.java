package com.equipo.taskmaster;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAddTask() {
        // Prepara la prueba limpiando la lista
        App.tasks.clear();
        // Llama al método que quieres probar
        App.addTask("Terminar ejercicio Maven");
        // Verifica que el resultado es el esperado
        assertEquals(1, App.tasks.size());
    }
}
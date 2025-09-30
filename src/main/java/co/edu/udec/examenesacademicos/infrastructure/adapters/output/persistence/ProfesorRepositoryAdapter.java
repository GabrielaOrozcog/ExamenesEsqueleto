package co.edu.udec.examenesacademicos.infrastructure.adapters.output.persistence;

import co.edu.udec.examenesacademicos.application.port.out.AlumnoRepositoryPort;
import co.edu.udec.examenesacademicos.application.port.out.ProfesorRepositoryPort;



/**
 * Adaptador de salida - Implementa persistencia de profesores
 * Adapta la tecnologia especifica al contrato del puerto
 */
public class ProfesorRepositoryAdapter implements ProfesorRepositoryPort {
    // TODO: Implementar metodos del puerto para profesores

    /**
     * Adaptador de salida - Implementa el puerto de repositorio usando JPA
     * Conoce los detalles tecnicos de persistencia
     */
    public static class AlumnoRepositoryAdapter implements AlumnoRepositoryPort {
        // TODO: Implementar metodos del puerto usando Spring Data JPA
    }
}

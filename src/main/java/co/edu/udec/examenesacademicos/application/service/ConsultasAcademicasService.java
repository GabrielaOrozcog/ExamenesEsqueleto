package co.edu.udec.examenesacademicos.application.service;


import co.edu.udec.examenesacademicos.application.port.in.ConsultarNotaAlumnoUseCase;
import co.edu.udec.examenesacademicos.application.port.out.AlumnoRepositoryPort;

/**
 * Servicio de aplicacion - Orquesta los puertos de entrada y salida
 * No contiene logica de negocio, solo coordina el flujo
 */
public class ConsultasAcademicasService implements ConsultarNotaAlumnoUseCase {

    private final AlumnoRepositoryPort alumnoRepositoryPort;

    public ConsultasAcademicasService(AlumnoRepositoryPort alumnoRepositoryPort) {
        this.alumnoRepositoryPort = alumnoRepositoryPort;
    }

    // TODO: Implementar casos de uso coordinando el dominio y los puertos de salida
}

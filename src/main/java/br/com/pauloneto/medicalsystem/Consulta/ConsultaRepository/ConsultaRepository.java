package br.com.pauloneto.medicalsystem.Consulta.ConsultaRepository;

import br.com.pauloneto.medicalsystem.Consulta.Domain.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}

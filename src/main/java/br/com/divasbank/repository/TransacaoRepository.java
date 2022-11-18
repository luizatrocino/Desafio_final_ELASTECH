package br.com.divasbank.repository;

import br.com.divasbank.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    @Query(value = "SELECT * FROM transacao WHERE CONTA_ORIGEM_ID = ?1 OR CONTA_DESTINO_ID = ?1" , nativeQuery = true)
    List<Transacao> encontrarTransacoesPorContaId(Long idConta);
}

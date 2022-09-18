package com.fluffyiacit.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fluffyiacit.api.modal.ViewFiltroEstacao;

public interface FiltroEstacaoRepository extends JpaRepository<ViewFiltroEstacao, String> {
	@Query ("SELECT v FROM view_filtro_estacao v WHERE v.estacao_estado = :estacao_estado ORDER BY estacao_nome")
	public List<ViewFiltroEstacao> listar(@Param("estacao_estado") String estacao_estado);
}

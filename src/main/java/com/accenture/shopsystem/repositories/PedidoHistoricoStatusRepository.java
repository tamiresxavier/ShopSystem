package com.accenture.shopsystem.repositories;
import com.accenture.shopsystem.domain.PedidoHistoricoStatus.PedidoHistoricoStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoHistoricoStatusRepository extends JpaRepository<PedidoHistoricoStatus, String> {
    @Query("SELECT h FROM PedidoHistoricoStatus h WHERE h.pedido.vendedor.id = :vendedorId")
    List<PedidoHistoricoStatus> findByPedidoVendedorId(@Param("vendedorId") String vendedorId);
}

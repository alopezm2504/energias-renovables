package com.talent.tech.energias.repositorio;

import com.talent.tech.energias.modelos.Plantas;
import com.talent.tech.energias.modelos.queriesDtos.ProduccionPlantaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantasRepositorio extends JpaRepository<Plantas, Integer> {
    @Query(value = "SELECT P.Nombre_Planta AS nombrePlanta, SUM(RP.ProduccionMW) AS produccionTotal \n" +
            "FROM Plantas P  \n" +
            "JOIN Registros_Produccion RP ON P.PlantaID = RP.PlantaID  \n" +
            "GROUP BY P.Nombre_Planta  \n" +
            "ORDER BY SUM(RP.ProduccionMW) DESC  \n" +
            "LIMIT 3", nativeQuery = true)
    List<Object[]> findTop3PlantasConMayorProduccionNativo();
}

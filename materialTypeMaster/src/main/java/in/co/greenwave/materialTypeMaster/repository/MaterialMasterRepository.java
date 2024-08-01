package in.co.greenwave.materialTypeMaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;

@Repository

public interface MaterialMasterRepository extends JpaRepository<MaterialMaster, Long> {
	
	
	
	@Query(value="SELECT  distinct material_name  FROM [Filter_PI].[dbo].[material_type_master] where  active=1", nativeQuery = true)
	public List<Object> getMaterialData( ) ;

	/*
	 * @Query(value="",nativeQuery = true)
	 * 
	 * public String saveMaterialMAster() ;
	 * 
	 */
	// ;
	
	
	
}
